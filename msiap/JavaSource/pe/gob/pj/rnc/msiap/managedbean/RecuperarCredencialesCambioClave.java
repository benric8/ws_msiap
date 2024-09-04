/*******************************************************************************
 *     18/08/2016 Creado por erodriguezbu
 ******************************************************************************/
package pe.gob.pj.rnc.msiap.managedbean;


import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.servlet.http.HttpSession;

import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.rnc.msiap.util.Constantes;
import pe.gob.pj.rnc.msiap.util.CryptoUtil;
import pe.gob.pj.rnc.msiap.util.FechaUtil;
import pe.gob.pj.rnc.msiap.util.ValidarUtil;
import pe.gob.pj.rnc.service.UsuarioManager;

public class RecuperarCredencialesCambioClave {

	private boolean renderGuardar;
	private String parametroCheck;
	private String parametroautentificar;
	private String clave1;
	private String clave2;
	private Usuario usuario = new Usuario();

	@PostConstruct
	public void init(){
		FacesContext context = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
		boolean renderOk = session.getAttribute("recuperaRenderOk")==null?false:(boolean) session.getAttribute("recuperaRenderOk");
		if(renderOk){
			renderGuardar = true;
			usuario = (Usuario) session.getAttribute("recuperaUsuario");
		}

		ExternalContext externalContext = context.getExternalContext();
		Map params = externalContext.getRequestParameterMap();
		parametroCheck  = (String) params.get("check" );
		parametroautentificar = (String) params.get("autentifcar" );
		if (!ValidarUtil.isNull(parametroautentificar) && !ValidarUtil.isNull(parametroautentificar)){
			verificaUrl(parametroCheck,parametroautentificar);
		}

		session.setAttribute("recuperaRenderOk", renderGuardar);
		session.setAttribute("recuperaUsuario", usuario);
	}

	/**
	 * El metodo verifica la autentificacion de la URL al iniciar la pagina.*
	 */
	public void verificaUrl(String ckeckPara , String autenPara){
		try{

			UsuarioManager servicioUsuario = new UsuarioManager();
			usuario =  servicioUsuario.selectUsuarioByEncriptedId(ckeckPara);


			if (usuario == null || ValidarUtil.isNull(usuario.getCODG_USUAR())){
				addInfoMessage("Usuario no identificado");
				return;
			}

			if (!autenPara.equals(CryptoUtil.encriptar(usuario.getToquen()))){
				addInfoMessage("La página no está autentificada para realizar la operación. Por favor vuelva a solicitarlo.");
				return;
			}

			if (!ValidarUtil.isNullOrEmpty(usuario.getFechaCambio()))	{
				if(FechaUtil.getDiferenciaFechaSegundo(new Timestamp(usuario.getFechaRecuperacion().getTime()),
						new Timestamp(usuario.getFechaCambio().getTime())) > Constantes.LONG_CERO) {
					if(FechaUtil.getDiferenciaFecha(new Timestamp(usuario.getFechaActual().getTime()),
							new Timestamp(usuario.getFechaRecuperacion().getTime()) ) > Long.parseLong(Constantes.RECUPERACION_PLAZO_HRS) ){
						addInfoMessage("Se venció el plazo para cambiar la contraseña. Por favor vuelva a solicitarlo.");
						return;
					}
				}else{
					addInfoMessage("El enlace ya fue utilizado. Si desea cambiar la contraseña, por favor vuelva a solicitarlo.");
					return ;
				}
			}
			if(FechaUtil.getDiferenciaFecha(new Timestamp(usuario.getFechaActual().getTime()),
					new Timestamp(usuario.getFechaRecuperacion().getTime()) ) > Long.parseLong(Constantes.RECUPERACION_PLAZO_HRS) ){
				addInfoMessage("Se venció el plazo para cambiar la contraseña, Por favor vuelva a solicitarlo.");
				return ;
			}
			renderGuardar = true;
		}catch(Exception e){
			e.printStackTrace();
		}
	}

    public String guardar(){
    	try{
    		if (!this.clave1.equals(this.clave2)){
    			addInfoMessage("Confirmación de contraseña no coincide con nueva contraseña");
    			return null;
    		}
    		
    		if(validarDatosUsuario()){
    			UsuarioManager servicioUsuario = new UsuarioManager();

    			Usuario bean = new Usuario();
    	      	bean.setCODG_USUAR(usuario.getCODG_USUAR());
    	      	bean.setC_CLAVE(servicioUsuario.encriptarCadena(clave1));
    	      	bean.setFechaCambio(Calendar.getInstance().getTime());

    	      	int result = servicioUsuario.updateUsuarioSelective(bean);

    	      	if(result>0)
    	      		addInfoMessage("Contraseña cambiada correctamente.");
    	      	else
    	      		addInfoMessage("Ocurrió un error en la operación.");

            	renderGuardar = false;
            	FacesContext context = FacesContext.getCurrentInstance();
            	HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
            	session.setAttribute("recuperaRenderOk", renderGuardar);
        	}
    	}catch(Exception e){
    		addInfoMessage("Ocurrió un error al procesar la solicitud. Por favor intente nuevamente");
    		e.printStackTrace();
    	}
    	return null;
    }

	private boolean validarDatosUsuario() throws Exception{

		if (usuario == null || ValidarUtil.isNull(usuario.getCODG_USUAR())){
			addInfoMessage("Usuario no identificado");
			return false;
		}else if (ValidarUtil.isNullOrEmpty(this.clave1)){
			addInfoMessage("Ingrese nueva contraseña");
			return false;
		}else if (ValidarUtil.isNullOrEmpty(this.clave2)){
			addInfoMessage("Confirme la nueva contraseña");
			return false;
		}else if (this.clave1.length()<=5){
			addInfoMessage("La nueva contraseña debe tener una longitud mínima de 6 caracteres.");
			return false;
		}else if (this.clave1.contains(" ")){
			addInfoMessage("La nueva contraseña no debe tener espacios en blanco.");
			return false;
		}
		//VALIDAR FORTALEZA DE LA CLAVE
		boolean hasNumber = this.clave1.matches(".*\\d.*");
		boolean hasAlphabet = this.clave1.matches(".*[a-zA-Z]+.*");

		if (!hasNumber || !hasAlphabet) {
			addInfoMessage("La nueva contraseña debe tener al menos un número y una letra.");
            return false;
        }

		return true;

	}

	public void txtContrasenhaActual_validate(FacesContext context, UIComponent component, Object value) {
		String s = String.valueOf(value);
		
		if(!s.matches("^(?:\\S{5,14}\\S)?$")){
			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR,
				"La clave no debe de tener menos de 6 dígitos ni contener espacios en blanco",""));
		}
		//if(!this.clave1.equals(this.clave2))
				//throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Las contraseñas ingresadas no son iguales.",""));
	}
	
    private void addInfoMessage(String messageInput){
    	FacesContext context= FacesContext.getCurrentInstance();
		FacesMessage message = new FacesMessage(messageInput);
		message.setSeverity(FacesMessage.SEVERITY_INFO);
		context.addMessage(null, message);
    }

	public boolean isRenderGuardar() {
		return renderGuardar;
	}
	public boolean getRenderGuardar() {
		return renderGuardar;
	}
	public void setRenderGuardar(boolean renderGuardar) {
		this.renderGuardar = renderGuardar;
	}
	public String getClave1() {
		return clave1;
	}
	public void setClave1(String clave1) {
		this.clave1 = clave1;
	}
	public String getClave2() {
		return clave2;
	}
	public void setClave2(String clave2) {
		this.clave2 = clave2;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario bean) {
		this.usuario = bean;
	}
}