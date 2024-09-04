/*
 * SessionFilter.java
 *
 * Created on July 27, 2007, 8:01 AM
 */

package uif;

import java.io.IOException;
//import java.util.ResourceBundle;
import java.util.ArrayList;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pe.gob.pj.rnc.log.MyLogger;
import pe.gob.pj.rnc.model.PerfilMenuOpcion;
import pe.gob.pj.rnc.model.Usuario;

public class SessionFilter implements Filter {
    
	private static int firstRequest = 0;
    static MyLogger logger= new MyLogger(SessionFilter.class.getName());

    public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain) throws IOException, ServletException {
        HttpServletRequest hreq = (HttpServletRequest)request;
        HttpServletResponse hres = (HttpServletResponse)response;
        HttpSession session = hreq.getSession();
        Usuario usuario = (Usuario)session.getAttribute("usuario");

        /***Empieza el cambio para el portal****/
		/****TIpo de request que trabaja los cookies********/
		//HttpServletRequest httpRequest = (HttpServletRequest) request;
		/***************************************************/
		//String strPagina = "faces/login.jsp"; //Pagina que por defecto designada para el tiemout.
		/****Trae el valor de la cookies asignada****/
		//Cookie tipoIngreso = this.getCookie(hreq, "tipoAccesoMSIAP");


		//if (tipoIngreso != null) {
			//if (tipoIngreso.getValue().equals("P")){
				/****Traendo dato del Properties***/
				//ResourceBundle props =  ResourceBundle.getBundle("ApplicationResources");
				//String urlPortlet = props.getString("urlPortlet");
				/***Fin de traer datos del Properties***/
					//strPagina = urlPortlet;
			//}else
				//logger.error("No se encuentra la variable cookies tipoAccesoMSIAP(Su pc del usuario no esta permitiendo guardar cookie)");
		//}
		/*********Fin de los cambios para el portal ***********/
		String contextPath = hreq.getContextPath();
		String servletPath = hreq.getServletPath();
		String requestUrl = hreq.getRequestURI();
		String uri = requestUrl.replaceAll(contextPath + servletPath,"");
        uri = uri.replaceAll(servletPath, "");

        if (session.isNew() && !uri.contains("/pages/forgotUsernameForm.jsp")) {
            if(firstRequest == 0){
                firstRequest++;
            } else {
                session.setAttribute("timeout","S");
                hres.sendRedirect(contextPath + "/faces/login.jsp");
                return;
            }
        }

        //if (! ( uri.equals("/login.jsp") | uri.equals(hreq.getContextPath() + "/") ) ){
        if (! ( uri.equals("/login.jsp") | uri.equals(hreq.getContextPath() + "/")
        		| uri.contains("/pages/forgotUsername.jsp") | uri.contains("/pages/forgotUsernameForm.jsp")
        		 | uri.contains("/pages/terminosFiscal.jsp")) ){
        // Fin erodriguebu
            if (usuario == null){
                session.setAttribute("noAutorizado","S");
                hres.sendRedirect(contextPath + "/faces/login.jsp");
                return;
            } else if(uri.contains(".jsp")){
            	String opcion = requestUrl.replace(contextPath, "");
            	
            	//En el menú no se muestran las 2 opciones, para evitar un error se cambian los valores por la página que invoca dichas opciones
            	if(opcion.equals("/faces/ingSolicitudSimple.jsp"))
            		opcion="/faces/ingSolicitudMultiple.jsp";
            	else if(opcion.equals("/faces/ingUsuario.jsp"))
            		opcion="/faces/admUsuario.jsp";
            	else if(opcion.equals("/faces/repPrimario.jsp") || opcion.equals("/faces/auditoria.jsp"))
            		opcion="/faces/admSolicitudes.jsp";
            	else if(opcion.equals("/faces/auditoriaInterna.jsp"))
            		opcion="/faces/admSolicitudInterna.jsp";
            	else if(opcion.equals("/faces/ayuda.jsp"))
            		opcion="/faces/admAyuda.jsp";
            	else if(opcion.equals("/faces/auditarUsuario.jsp"))
            		opcion="/faces/admUsuario.jsp";
            	
            	ArrayList<PerfilMenuOpcion> permisos = (ArrayList<PerfilMenuOpcion>)session.getAttribute("listaPermisos");
            	boolean encontrado = false;
            	for(PerfilMenuOpcion menu : permisos){
            		if(menu.getPAGINA_JSP().equals(opcion)){
            			encontrado = true;
            			break;
            		}
            		
            		if(menu.getSubMenu()!=null){
            			for(PerfilMenuOpcion menu1 : menu.getSubMenu()){
                    		if(menu1.getPAGINA_JSP().equals(opcion)){
                    			encontrado = true;
                    			break;
                    		}
            			}
            		}
            		
            		if(encontrado)
            			break;
            	}
            	
            	if(!encontrado){
            		session.setAttribute("timeout","S");
                    hres.sendRedirect(contextPath + "/faces/login.jsp");
                    return;
            	}            		
            	
            }
        }

        try {
            chain.doFilter(request, response);        	
        }catch (Exception e) {
        	logger.info("ERROR: "+e.getMessage());
		}
    }
    
    public void init(FilterConfig filterConfig) throws ServletException {}
    public void destroy() {}

    public static Cookie getCookie(HttpServletRequest request, String cookieName) {
		Cookie[] cookies = request.getCookies();
		for (int i = 0; cookies != null && i < cookies.length; i++) {
			Cookie cookie = cookies[i];
			if (cookieName.equals(cookie.getName()))
				return cookie;
		}
		return null;
	}

}