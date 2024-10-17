/*
 * login.java
 *
 * Created on 26 de febrero de 2007, 02:52 PM
 * Copyright user
 */
package uif;

import java.lang.reflect.Array; //import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputSecret;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlMessages;
import javax.faces.component.html.HtmlOutputText; //import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import pe.gob.pj.rnc.log.MyLogger; //import pe.gob.pj.rnc.model.AudAntecPenWs;
import pe.gob.pj.rnc.model.AudAntecPenWs;
//import pe.gob.pj.rnc.model.Aud_usuario_tablas_cab_det;
import pe.gob.pj.rnc.model.Departamento;
import pe.gob.pj.rnc.model.DistritoJudicial;
import pe.gob.pj.rnc.model.EntidadExterna;
import pe.gob.pj.rnc.model.FirmaAutorizada;
import pe.gob.pj.rnc.model.Juzgado;
import pe.gob.pj.rnc.model.Perfil;
import pe.gob.pj.rnc.model.PerfilMenuOpcion;
import pe.gob.pj.rnc.model.SolicitudExterna;
import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.rnc.msiap.util.CaptchaValid;
import pe.gob.pj.rnc.msiap.util.Constantes;
import pe.gob.pj.rnc.msiap.util.SendMail;
//import pe.gob.pj.rnc.model.UsuarioCamposAud; //import pe.gob.pj.rnc.service.Aud_usuario_tablas_cab_detManager;
import pe.gob.pj.rnc.service.DepartamentoManager;
import pe.gob.pj.rnc.service.EntidadExternaManager;
import pe.gob.pj.rnc.service.FirmaAutorizadaManager;
import pe.gob.pj.rnc.service.JuzgadoManager;
import pe.gob.pj.rnc.service.UsuarioManager;
import pe.gob.pj.util.Mensaje;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import com.sun.rave.web.ui.model.Option;

/**
 * <p>
 * Page bean that corresponds to a similarly named JSP page. This class contains component definitions (and
 * initialization code) for all components that you have defined on this page, as well as lifecycle methods and event
 * handlers where you may add behavior to respond to incoming events.
 * </p>
 */
public class login extends AbstractPageBean {
	// private static final String[] HEADERS_TO_TRY = { "X-Forwarded-For", "Proxy-Client-IP", "WL-Proxy-Client-IP",
	// "HTTP_X_FORWARDED_FOR", "HTTP_X_FORWARDED",
	// "HTTP_X_CLUSTER_CLIENT_IP", "HTTP_CLIENT_IP", "HTTP_FORWARDED_FOR", "HTTP_FORWARDED", "HTTP_VIA", "REMOTE_ADDR" };
	static MyLogger	logger	= new MyLogger(login.class.getName());
	private String	version	= "";
	private String captchaApiKeyWeb = pe.gob.pj.util.Constantes.CONFIG_CAPTCHA_WEB_KEY;
	
	public final String getCaptchaApiKeyWeb() {
		return captchaApiKeyWeb;
	}

	public String getVersion() {
		version = Mensaje.getString("msiap.version.numero");
		return version;
	}

	/**
	 * <p>
	 * Automatically managed component initialization. <strong>WARNING:</strong> This method is automatically generated, so any user-specified code inserted here is subject to
	 * being replaced.
	 * </p>
	 */
	private void _init() throws Exception {
	}

	private Page page1 = new Page();

	public Page getPage1() {
		return page1;
	}

	public void setPage1(Page p) {
		this.page1 = p;
	}

	private Html html1 = new Html();

	public Html getHtml1() {
		return html1;
	}

	public void setHtml1(Html h) {
		this.html1 = h;
	}

	private Head head1 = new Head();

	public Head getHead1() {
		return head1;
	}

	public void setHead1(Head h) {
		this.head1 = h;
	}

	private Link link1 = new Link();

	public Link getLink1() {
		return link1;
	}

	public void setLink1(Link l) {
		this.link1 = l;
	}

	private Body body1 = new Body();

	public Body getBody1() {
		return body1;
	}

	public void setBody1(Body b) {
		this.body1 = b;
	}

	private Form form1 = new Form();

	public Form getForm1() {
		return form1;
	}

	public void setForm1(Form f) {
		this.form1 = f;
	}

	private HtmlOutputText outputText2 = new HtmlOutputText();

	public HtmlOutputText getOutputText2() {
		return outputText2;
	}

	public void setOutputText2(HtmlOutputText hot) {
		this.outputText2 = hot;
	}

	private HtmlOutputText outputText3 = new HtmlOutputText();

	public HtmlOutputText getOutputText3() {
		return outputText3;
	}

	public void setOutputText3(HtmlOutputText hot) {
		this.outputText3 = hot;
	}

	private HtmlInputText txtUsuario = new HtmlInputText();

	public HtmlInputText getTxtUsuario() {
		return txtUsuario;
	}

	public void setTxtUsuario(HtmlInputText hit) {
		this.txtUsuario = hit;
	}
	
	private HtmlInputText txtToken = new HtmlInputText();
	
	public HtmlInputText getTxtToken() {
		return txtToken;
	}
	
	public void setTxtToken(HtmlInputText hit) {
		this.txtToken = hit;
	}

	private HtmlMessages messageList1 = new HtmlMessages();

	public HtmlMessages getMessageList1() {
		return messageList1;
	}

	public void setMessageList1(HtmlMessages hm) {
		this.messageList1 = hm;
	}

	private HtmlInputSecret secContrasenha = new HtmlInputSecret();

	public HtmlInputSecret getSecContrasenha() {
		return secContrasenha;
	}

	public void setSecContrasenha(HtmlInputSecret his) {
		this.secContrasenha = his;
	}
	//erodriguezbu migración (link2 no presente en mag.)
	private Link link2 = new Link();

	public Link getLink2() {
		return link2;
	}

	public void setLink2(Link l) {
		this.link2 = l;
	}

	private HtmlInputText textField1 = new HtmlInputText();

	public HtmlInputText getTextField1() {
		return textField1;
	}

	public void setTextField1(HtmlInputText hit) {
		this.textField1 = hit;
	}

	/**
	 * <p>
	 * Construct a new Page bean instance.
	 * </p>
	 */
	public login() {
	}

	/**
	 * <p>
	 * Callback method that is called whenever a page is navigated to, either directly via a URL, or indirectly via page navigation. Customize this method to acquire resources
	 * that will be needed for event handlers and lifecycle methods, whether or not this page is performing post back processing.
	 * </p>
	 *
	 * <p>
	 * Note that, if the current request is a postback, the property values of the components do <strong>not</strong> represent any values submitted with this request.
	 * Instead, they represent the property values that were saved for this view when it was rendered.
	 * </p>
	 */
	public void init() {

		super.init();
		try {
			_init();
		} catch (Exception e) {
			logger.error("Page1 Initialization Failure", e);
			throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
		}

	}

	/**
	 * <p>
	 * Callback method that is called after the component tree has been restored, but before any event processing takes place. This method will <strong>only</strong> be called
	 * on a postback request that is processing a form submit. Customize this method to allocate resources that will be required in your event handlers.
	 * </p>
	 */
	public void preprocess() {
	}

	/**
	 * <p>
	 * Callback method that is called just before rendering takes place. This method will <strong>only</strong> be called for the page that will actually be rendered (and not,
	 * for example, on a page that handled a postback and then navigated to a different page). Customize this method to allocate resources that will be required for rendering
	 * this page.
	 * </p>
	 */
	public void prerender() {
		int z = getSessionBean1().getIntentosLogin();
		if (z > 2) {
			this.setRenderCaptcha(true);
			this.getTextField1().setRendered(true);
		}
	}

	/**
	 * <p>
	 * Callback method that is called after rendering is completed for this request, if <code>init()</code> was called (regardless of whether or not this was the page that was
	 * actually rendered). Customize this method to release resources acquired in the <code>init()</code>, <code>preprocess()</code>, or <code>prerender()</code> methods (or
	 * acquired during execution of an event handler).
	 * </p>
	 */
	public void destroy() {
	}

	/**
	 * <p>
	 * Return a reference to the scoped data bean.
	 * </p>
	 */
	protected SessionBean1 getSessionBean1() {
		return (SessionBean1) getBean("SessionBean1");
	}

	/**
	 * <p>
	 * Return a reference to the scoped data bean.
	 * </p>
	 */
	protected RequestBean1 getRequestBean1() {
		return (RequestBean1) getBean("RequestBean1");
	}

	/**
	 * Método que valida el ingreso del ussuario al sistema.
	 *
	 * Revision: 18/09/2008: Tener en cuenta que usuario esta soportado en "alfanumerico mayusculas" y contraseña soportado en "alfanumerico mayusculas y minisculas".
	 *
	 * @return
	 */
	public String btnIngresar_action() {
		int z = getSessionBean1().getIntentosLogin();
		getSessionBean1().setIntentosLogin(++z);
		HttpServletRequest request = null;
		String captchaGenerated = null;
		String navigateTo = null;
		String codigoUsuario = null;
		String contrasenha = null;
		Usuario usuario = null;
		UsuarioManager servicioUsuario = null;
		EntidadExternaManager servicioEntidadEx = null;
		EntidadExterna entidadExterna = null;
		FirmaAutorizadaManager servicioFirmaAutorizada = null;
		DepartamentoManager servicioDepartamento = null;

		// Obtener el valor del token de reCAPTCHA desde el request
        FacesContext context = FacesContext.getCurrentInstance();
        String gRecaptchaResponse = context.getExternalContext().getRequestParameterMap().get("form1:txtToken");
        if (gRecaptchaResponse.length()==0) {
        	info("el captcha es obligatorio");
        	return null;
        }
        // Validar reCAPTCHA
        boolean captchaValid = validateRecaptcha(gRecaptchaResponse);

        if (!captchaValid) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "reCAPTCHA no válido.");
            context.addMessage(null, message);
            return null; // Retorna a la misma página si el captcha es inválido
        }
		
		if (2 < z) {
			this.renderCaptcha = true;
			this.getTextField1().setRendered(true);
			//this.getTextField1().setStyle("visibility:visible");
			if (3 < z) {
				request = (HttpServletRequest) this.getFacesContext().getExternalContext().getRequest();
				captchaGenerated = (String) request.getSession().getAttribute(nl.captcha.servlet.Constants.SIMPLE_CAPCHA_SESSION_KEY);
				
				if (!captchaGenerated.equals(((String) getTextField1().getValue()).toLowerCase())) {
					info("Texto de imágen erróneo.");
					return navigateTo;
				}
			}
		} else {
			this.renderCaptcha = false;
			//this.getTextField1().setStyle("visibility:hidden");
		}

		
		try {
			codigoUsuario = ((String) getTxtUsuario().getValue()).toUpperCase();
			contrasenha = ((String) getSecContrasenha().getValue()).trim();
		
			if(codigoUsuario.trim().length()==0 || contrasenha==null || contrasenha.trim().length()==0){
				info("Ingrese usuario y clave.");
				return navigateTo;
			}
				
			servicioUsuario = new UsuarioManager();
			
			usuario = servicioUsuario.selectUsuario(codigoUsuario, contrasenha);
				
			
			if (usuario == null) {
				
				if(9 < z) {
					logger.error("LOGIN ERROR - El usuario ha intentado acceder más de 9 veces sin éxito. USUARIO:"+codigoUsuario);
					enviarCorreo(codigoUsuario,z);
				}
				
				info("Usuario o Contraseña errónea");
				return navigateTo;
				
			} else if (Usuario.ESTADO_INACTIVO.equals(usuario.getESTD_USUAR())){
				info("La cuenta de usuario se encuentra inactiva.");
				enviarCorreo(codigoUsuario + " (Inactivo)",z);
				return navigateTo;
				
			} else {
				request = (HttpServletRequest) this.getFacesContext().getExternalContext().getRequest();
				HttpSession sesion = request.getSession();
				sesion.setAttribute("usuario", usuario);
				sesion.setAttribute("tipoAcceso", "A"); // Por lo pronto son dos: A=Login del Aplicativo ,P= por el portal web

				servicioDepartamento = new DepartamentoManager();

				List<Departamento> departamentos = servicioDepartamento.getComboDepartamento();
				lugares(departamentos);

				if(Usuario.APLICACION_MAGISTRADO.equals(usuario.getCOD_APLICACION())){
					if("1".equals(Mensaje.getString("msiap.acceso.validaip")) && !validarAccesoInterno(request)){
						info("Acceso no autorizado. Probalemente usted no está accediendo desde los ambientes del Poder Judicial.");
						logger.error("Acceso no autorizado desde internet. Usuario: " + usuario.getCODG_USUAR());
						return navigateTo;
					}

					getSessionBean1().getDistritoJudicialInterno().refreshProvider();//verificar distrito-judicial-cache definido para selectbyprimary y byexample
					getSessionBean1().getEstadoSolicitudTotal().refreshProvider();

					if (usuario.getCOD_PERFIL().equals(Perfil.OPERADOR_JUDICIAL_ID)	|| usuario.getCOD_PERFIL().equals(Perfil.SUPERVISOR_JUDICIAL_ID)) {

						if (usuario.getCODG_DISTRITO_JUDICIAL() == null) {
							error("El Usuario debe de tener un distrito Judicial Asignado");
							return null;
						} else if (usuario.getCODG_JUZGAD() == null) {
							error("El Usuario debe de pertenecer a una instancia");
							return null;
						} else if (usuario.getCODG_LUGAR() == null) {
							error("El Usuario debe de pertenecer a un departamento o lugar");
							return null;
						}

						//verificar la siguiente búsqueda
						DistritoJudicial distritoJudicial = getSessionBean1().getDistritoJudicialInterno().buscarDistritoJudicial(usuario.getCODG_DISTRITO_JUDICIAL().trim());

						Departamento departamento = buscarDepartamento(departamentos, usuario.getCODG_LUGAR().trim());
						if(departamento == null)
							departamento = servicioDepartamento.selectDepartamento(usuario.getCODG_LUGAR());

						JuzgadoManager servicioJuzgado = new JuzgadoManager();
						Juzgado juzgado = servicioJuzgado.selectJuzgado(usuario.getCODG_JUZGAD());

						getSessionBean1().setJuzgadoUser(usuario.getNUME_JUZGA() + " " + juzgado.getDESC_JUZGAD().toUpperCase());
						getSessionBean1().setDistritoJudicialUser(distritoJudicial.getDESC_DISTRITO_JUDICIAL().toUpperCase());
						getSessionBean1().setDepartamentoUser(departamento.getDESC_LUGAR().toUpperCase());
					}

				}else{
					servicioEntidadEx = new EntidadExternaManager();

					Integer idEntidadExterna = usuario.getCODG_ENTIDAD_EXTERNA();
					entidadExterna = servicioEntidadEx.selectEntidadExternaByPrimaryKey(idEntidadExterna);
					getSessionBean1().setEntidadExterna(entidadExterna);
					getSessionBean1().getSolicitudesUnitarias().getList().clear();
					//getSessionBean1().getEntidadExternas().refreshProvider(); se consulta en admUsuario
					// Se busca el supervisor
					SolicitudExterna solEx = new SolicitudExterna();
					solEx.setCODG_ENTIDAD_EXTERNA(idEntidadExterna);
					Usuario supervisor = servicioUsuario.obtenerSupervisor(usuario, solEx);

					if(supervisor == null){
						supervisor = usuario;
						//error("WARNING: La entidad externa no tiene supervisor. Se toma como supervisor al usuario en sesión.");
						logger.error("WARNING: La entidad externa no tiene supervisor. Se toma como supervisor al usuario en sesión. Ent. Ext. " + 
						idEntidadExterna + " -> " + entidadExterna.getDESC_ENTIDAD_EXTERNA());
					}

					getSessionBean1().setUsuarioSupervisor(supervisor);
					getSessionBean1().getEstadosSolicitud().refreshProvider();//erodriguezbu verificar en caso de reportes para adm
					getSessionBean1().getUsuarios().refreshProvider(usuario);
				}

				servicioFirmaAutorizada = new FirmaAutorizadaManager();

				// Comunes a ambos perfiles
				getSessionBean1().getMotivos().refreshProvider(usuario, entidadExterna);
				FirmaAutorizada firma = servicioFirmaAutorizada.selectJefeRnc();
				getSessionBean1().setFirmaAutorizada(firma);
				if(firma==null){
					info("Error: No se encontró información del Jefe del Registro Nacional de Condenas.");
					return navigateTo;
				}

				getSessionBean1().getTiposDocumentoIdentidad().refreshProvider(usuario);


				/* Para manejo de menu dinamicos */
				ArrayList<PerfilMenuOpcion> perfilMenuOpcion = (ArrayList<PerfilMenuOpcion>) servicioUsuario.getOpcionesMenu(usuario);
				getSessionBean1().setLstPerfilMenuOpcion(perfilMenuOpcion);
				sesion.setAttribute("listaPermisos", perfilMenuOpcion);
				//getSessionBean1().getJuzgado().refreshProvider();
				try {
					if(!Usuario.APLICACION_MAGISTRADO.equals(usuario.getCOD_APLICACION())){
						AudAntecPenWs aud = usuario.auditoria("INICIO SESION MSIAP");
						if(aud!=null) servicioUsuario.guardarAuditoria(aud);
					}

				} catch (Exception e) {
					e.printStackTrace();
					logger.error("Error : Error al guardar auditoría", e);
				}

				this.renderCaptcha = false;
				//this.getTextField1().setStyle("visibility:hidden");

				// Para navegar a una opción del menú
				if(perfilMenuOpcion.size()>0){
					if(!perfilMenuOpcion.get(0).getSubMenu().isEmpty()){
						navigateTo = perfilMenuOpcion.get(0).getSubMenu().get(0).getPAGINA_JSP();
					}else{
						navigateTo = perfilMenuOpcion.get(0).getPAGINA_JSP();
					}
					navigateTo = navigateTo.substring(7).replace(".jsp", "");
				}

				getSessionBean1().setUsuario(usuario);
				getSessionBean1().setIntentosLogin(0);
				getSessionBean1().setPrimerAcceso(true);
				getSessionBean1().setPrimerAccesoUsuario(true);
				getSessionBean1().setPrimerAccesoSolicitudInterna(true);
				getSessionBean1().setSolicitudExterna(new SolicitudExterna());
				getSessionBean1().setPrimerAccesoSolicitudInterna(true);

				/* Actualizando la vigencia del*/
				Calendar fechActual = Calendar.getInstance();
				fechActual.add(Calendar.DATE, 60);
				usuario.setFECH_VENCI(fechActual.getTime());
				if(Usuario.APLICACION_MAGISTRADO.equals(usuario.getCOD_APLICACION()))
					servicioUsuario.updateUsuarioSelective(usuario);
				/* Fin de Actualización de vigencia del usuario */
				
				//AQUI SE REDIRIGE A LA PÁGINA DE TÉRMINOS Y CONDICIONES DE USO DE LA APLICACION
				if(!Constantes.ACTIVO.equals(usuario.getIndicadorAceptaTerminos())){
					sesion.setAttribute("paginaDeInicio", navigateTo);
					navigateTo = "pages/terminosFiscal";
					
					if(Perfil.MPFN_FISCAL.equals(usuario.getCOD_PERFIL()))
						sesion.setAttribute("esFiscal", "1");
				}
			}
		} catch (Exception e) {
			error("Error al momento de obtener datos de usuario.");
			logger.error("UIF. Error al obtener datos: ", e);
			e.printStackTrace();
			return navigateTo;
		}

		return navigateTo;
	}

	/**
     * Recuperacion de datos para casos que tenga una sola cuenta
     * @param datoUsuario datos de usuario
     * @param link autentificado
     * @param Tipo de recuperacion (contraseña , usuario)
     * @param Tiempo valido en horas del Link
     * @return datos que se envia por correo.
    */
    private void enviarCorreo(String usuario, int numeroIntentos){
    		String to;
            String subject = null;
            String body;

    	    subject = "Múltiples intentos de acceso fallidos - MSIAP";
    	    
    	    to = Mensaje.getString("msiap.email.to.loginFail");

    	    StringBuilder sbMensaje = new StringBuilder();
    	    sbMensaje.append("<html xmlns=\"http://www.w3.org/1999/xhtml\" >");
    	    sbMensaje.append("<head>");
    	    sbMensaje.append("<META HTTP-EQUIV='Content-Type' CONTENT='text/html; charset=UTF-8' />");
    	    sbMensaje.append("<title>INFORME DE SEGURIDAD</title>");
    	    sbMensaje.append("<style type=\"text/css\">");
    	    sbMensaje.append(".style1 {font-family: 'Helvetica Neue',Helvetica,Arial,sans-serif; font-size: 81.25%; color:#212121}");
    	    sbMensaje.append(".style2 {font-family: 'Helvetica Neue',Helvetica,Arial,sans-serif; font-size: 81.25%; color:#212121}");
    	    sbMensaje.append(".style3 {font-family: 'Helvetica Neue',Helvetica,Arial,sans-serif; font-size: 85%; color:#8A0808}");
    	    sbMensaje.append("</style>");
    	    sbMensaje.append("</head>");
    	    sbMensaje.append("<body BGCOLOR=\"#F2F2F2\">");
    	    sbMensaje.append("<table width=\"100%\" border=\"0\" cellpadding=\"1\" cellspacing=\"0\">");
    	    sbMensaje.append("<tr>");
    	    sbMensaje.append("<th  width=\"100%\" bordercolor=\"#F2F2F2\" bgcolor=\"#F2F2F2\" scope=\"col\"><span class=\"style3\">");
    	    sbMensaje.append("<b>PODER JUDICIAL DEL PERÚ - MÓDULO DE ATENCIÓN DE SOLICITUDES DE ANTECEDENTES PENALES <br> MSIAP <br/></th>");
    	    sbMensaje.append("</tr>");
    	    sbMensaje.append("<tr>");
    	    sbMensaje.append("<th  width=\"100%\" bordercolor=\"#F2F2F2\" bgcolor=\"#F2F2F2\" scope=\"col\"><span class=\"style1\">");
    	    sbMensaje.append("INFORME AUTOMÁTICO - MÚLTIPLES INTENTOS DE ACCESO FALLIDOS <br><br></th>");
    	    sbMensaje.append("</tr>");

    	      
    	    sbMensaje.append("<tr>");
    	    sbMensaje.append("<th align=\"left\"  width=\"100%\" bordercolor=\"#F2F2F2\" bgcolor=\"#F2F2F2\" scope=\"col\"><span class=\"style2\"><br/>");
    	    sbMensaje.append("El sistema ha detectado ").append(numeroIntentos).append(" intentos de acceso fallidos con el nombre de usuario: ").append(usuario).append(".</th>");
    	    sbMensaje.append("</tr>"); 
    	    
    	    sbMensaje.append("<tr>");
    	    sbMensaje.append("<th align=\"left\"  width=\"100%\" bordercolor=\"#F2F2F2\" bgcolor=\"#F2F2F2\" scope=\"col\"><span class=\"style2\"><br/></th>");
    	    sbMensaje.append("</tr>");
    	    sbMensaje.append("</table>");
    	    sbMensaje.append("<br/><br/><hr><p style=\"font-family=arial,'Times New Roman',Times,serif;color=#8899a6;font-size:78%;\">");
    	    sbMensaje.append("La información contenida en este correo electrónico es de uso privilegiado, confidencial y sólo puede ser utilizada por la persona a quien ha sido dirigida. Su divulgación, copia y/o adulteración");
    	    sbMensaje.append(" no autorizada está estrictamente prohibida. Si usted no es el destinatario previsto, comuníquese con el área de Service Desk y elimine el mensaje.<br>");
    	    sbMensaje.append(" Por favor no responder a esta dirección de correo pues es una dirección de envío automático.");
    	    sbMensaje.append(" Si necesita ayuda o tiene algún inconveniente relacionado con el acceso al sistema, comuníquese con el área de Service Desk.");
    	    sbMensaje.append(" Teléfono: 410-2525 Anexo: 13990<br/></p>");
    	    sbMensaje.append("</body></html>");
    	    
			try{
				body = sbMensaje.toString();
				SendMail.sendEmail(to, subject, body);	
			}catch(Exception e){
				logger.error("ERROR - Al enviar correo a usuario de RENAJU informando de intentos fallidos de login");
				e.printStackTrace();
			}
			
    }

	//Inicio erodriguezbu Validar que los magistrados accedan únicamente desde la red interna
	private boolean validarAccesoInterno(HttpServletRequest request){
		String ipAddress = request.getHeader("X-FORWARDED-FOR");
		if (ipAddress == null)	ipAddress = request.getRemoteAddr();
		if(ipAddress.contains("172."))	return true;
		return false;
	}

	private void lugares(List<Departamento> departamentos) {
		Option[] lugares = (Option[]) Array.newInstance(Option.class, departamentos.size());
		int x = 0;
		for (Departamento lugar : departamentos) {
			if (lugar.getCODG_LUGAR() != null) {
				if (lugar.getDESC_LUGAR() != null) {
					lugares[x] = new Option(lugar.getCODG_LUGAR(), lugar.getDESC_LUGAR());
				} else {
					lugares[x] = new Option(lugar.getCODG_LUGAR(), "");
				}
			} else {
				lugares[x] = new Option("", "");
			}
			x++;
		}
		getSessionBean1().setDepartamentos(lugares);
	}

	private Departamento buscarDepartamento(List<Departamento> departamentos, String codgLugar) {
		for (Departamento lugar : departamentos) {
			if (lugar.getCODG_DISTRITO_JUDICIAL().trim().equals(codgLugar))
					return lugar;
		}

		return null;
	}



	public void txtUsuario_validate(FacesContext context, UIComponent component, Object value) {
		String s = String.valueOf(value);
		if (!s.matches("[a-zA-Z0-9]{4,10}")) { throw new ValidatorException(new FacesMessage("El campo usuario contiene caracteres inválidos!")); }
	}

	/**
	 * <p>
	 * Return a reference to the scoped data bean.
	 * </p>
	 */
	protected fragHeader getfragHeader() {
		return (fragHeader) getBean("fragHeader");
	}

	/**
	 * <p>
	 * Return a reference to the scoped data bean.
	 * </p>
	 */
	protected fraHeader getfraHeader() {
		return (fraHeader) getBean("fraHeader");
	}

	private boolean renderCaptcha = false;

	public boolean isRenderCaptcha() {
		return renderCaptcha;
	}

	public void setRenderCaptcha(boolean renderCaptcha) {
		this.renderCaptcha = renderCaptcha;
	}
	public RestTemplate restTemplateWithProxy() {
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        
        // Configurar el proxy
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxyggeneral01.pj.gob.pe", 3128));
        requestFactory.setProxy(proxy);
        
        // Retornar un RestTemplate con el proxy configurado
        return new RestTemplate(requestFactory);
    }
	private boolean validateRecaptcha(String gRecaptchaResponse) {
        String url = pe.gob.pj.util.Constantes.CONFIG_CAPTCHA_URL;
        RestTemplate restTemplate =  restTemplateWithProxy();

        // Parámetros del request
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("secret",pe.gob.pj.util.Constantes.CONFIG_CAPTCHA_SECRET_KEY)
                .queryParam("response", gRecaptchaResponse);

//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
//        HttpEntity<?> entity = new HttpEntity<>(headers);
//
//        // Hacer la solicitud
//        ResponseEntity<Map> response = restTemplate.exchange(
//                builder.toUriString(),
//                HttpMethod.POST,
//                entity,
//                Map.class);
        
        CaptchaValid resultado = restTemplate.postForObject(
              builder.toUriString(),          
              null,
              CaptchaValid.class);

        // Validar la respuesta
       
        boolean success = resultado.getSuccess();

        return success;
    }
}
