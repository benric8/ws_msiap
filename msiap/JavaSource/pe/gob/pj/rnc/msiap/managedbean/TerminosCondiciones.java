/*******************************************************************************
 *     18/01/2018 Creado por erodriguezbu
 ******************************************************************************/
package pe.gob.pj.rnc.msiap.managedbean;

import java.util.Calendar;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.rnc.msiap.util.Constantes;
import pe.gob.pj.rnc.msiap.util.FechaUtil;
import pe.gob.pj.rnc.service.UsuarioManager;

public class TerminosCondiciones {

	private String nombres;
	private String fecha;
	private Usuario usuario;
	private String paginaDeInicio;
	private boolean renderFiscal;
	
	@PostConstruct
	public void inicio(){
		FacesContext context= FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
        paginaDeInicio = (String) session.getAttribute("paginaDeInicio");
        renderFiscal = "1".equals((String) session.getAttribute("esFiscal"))?true:false;
        usuario = (Usuario) session.getAttribute("usuario");
		nombres = usuario.getNOMB_USUAR() + " " + usuario.getAPLL_USUAR();
		Calendar cal = Calendar.getInstance();
		String mes = FechaUtil.getNombreMes(cal.get(Calendar.MONTH)+1);
		fecha = "Lima, "+cal.get(Calendar.DAY_OF_MONTH)+ " de " + mes + " "+cal.get(Calendar.YEAR);
		
	}
	public TerminosCondiciones() {
	}

	public String enviar(){		
		try	{			
			Calendar cal = Calendar.getInstance();
			UsuarioManager servicioUsuario = new UsuarioManager();
			
			Usuario bean = new Usuario();
	      	bean.setCODG_USUAR(usuario.getCODG_USUAR());
	      	bean.setFechaAceptaTerminos(cal.getTime());
	      	bean.setIndicadorAceptaTerminos(Constantes.ACTIVO);

	      	int result = servicioUsuario.updateUsuarioSelective(bean);

	      	if(result<=0)
	      		addInfoMessage(Constantes.MENSAJE_ERROR_VISTA);


		}catch(Exception e){
			addInfoMessage(Constantes.MENSAJE_ERROR_VISTA);
			e.printStackTrace();
		}
		
		return paginaDeInicio;
	}

    private void addInfoMessage(String messageInput){
    	FacesContext context= FacesContext.getCurrentInstance();
		FacesMessage message = new FacesMessage(messageInput);
		message.setSeverity(FacesMessage.SEVERITY_INFO);
		context.addMessage(null, message);
    }


	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public boolean isRenderFiscal() {
		return renderFiscal;
	}
	public void setRenderFiscal(boolean renderFiscal) {
		this.renderFiscal = renderFiscal;
	}

    
}