/*******************************************************************************
 *     18/08/2016 Creado por erodriguezbu
 ******************************************************************************/
package pe.gob.pj.rnc.msiap.managedbean;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.servlet.http.HttpServletRequest;

import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.rnc.msiap.util.Constantes;
import pe.gob.pj.rnc.msiap.util.CryptoUtil;
import pe.gob.pj.rnc.msiap.util.SendMail;
import pe.gob.pj.rnc.msiap.util.ValidarUtil;
import pe.gob.pj.rnc.service.UsuarioManager;
import pe.gob.pj.util.Mensaje;

public class RecuperarCredenciales {


	private String email;
	private String textoCaptcha;
	private String txtUsuario;
	private Long filter_tipoRecuperacion = 1L;
	private boolean renderEnviarMail;
	private List<Usuario> listaUsuario;
	
	public void init(){

	}
	public RecuperarCredenciales() {
	}

	public String enviar(){
		try	{

			if( validarDatos() ){
				if (listaUsuario.size() > 1){
					//en caso tenga varias cuentas
						if(this.filter_tipoRecuperacion == Constantes.TIPO_RECUPERACION_CLAVE){

							 for (Usuario datoCorreo : listaUsuario) {
							     String link = generarLink(datoCorreo.getCODG_USUAR());
								 if (link == null) {
									  addInfoMessage(Constantes.MENSAJE_ERROR_VISTA);
									  return null;
								  }else{
									  datoCorreo.setLink(link);
								  }
						      }

							datosEnvioCorreoVariasCuentas(listaUsuario,filter_tipoRecuperacion, Constantes.RECUPERACION_PLAZO_HRS);
							renderEnviarMail = true;
					    }
					    if(this.filter_tipoRecuperacion == Constantes.TIPO_RECUPERACION_USUARIO){
							datosEnvioCorreoVariasCuentas(listaUsuario,filter_tipoRecuperacion,"");
							renderEnviarMail = true;
				        }

				}else{
					 //En caso tenga una sola cuenta
						 if( this.filter_tipoRecuperacion == Constantes.TIPO_RECUPERACION_CLAVE ){
							 String link = generarLink(listaUsuario.get(0).getCODG_USUAR());
								if (link == null) {
									addInfoMessage(Constantes.MENSAJE_ERROR_VISTA);
									return null;
								 }else{
									datosEnvioCorreo(listaUsuario,link,filter_tipoRecuperacion, Constantes.RECUPERACION_PLAZO_HRS);
									renderEnviarMail = true;
								  }
						 }
						 if(this.filter_tipoRecuperacion == Constantes.TIPO_RECUPERACION_USUARIO){
								datosEnvioCorreo(listaUsuario,"",filter_tipoRecuperacion,"");
								renderEnviarMail = true;
					     }
				  }
		   }

		}catch(Exception e){
			addInfoMessage(Constantes.MENSAJE_ERROR_VISTA);
			e.printStackTrace();
		}
		return null;
	}

    public String generarLink(String id) throws Exception {

        try{
	      	Usuario bean = new Usuario();
	      	StringBuilder link = new StringBuilder();
	      	String token           = CryptoUtil.generarClaveVisual();
	      	String tokenEncriptado = CryptoUtil.encriptar(token);
	      	String idEcriptado     = CryptoUtil.encriptar(id);
	      	bean.setCODG_USUAR(id);
	      	bean.setCodUsuEncriptado(idEcriptado);
	      	bean.setToquen(token);
	      	bean.setFechaRecuperacion(Calendar.getInstance().getTime());

	      	UsuarioManager servicioUsuario = new UsuarioManager();

	      	int result = servicioUsuario.updateUsuarioSelective(bean);//seguridadService.solicitarRecuperarClave(bean);
	      	if(result >= 1){
	      		//cambiar por properties
	      		boolean cortar = Constantes.RUTA_APP_MSIAP.substring(Constantes.RUTA_APP_MSIAP.length()-1, 
	      				Constantes.RUTA_APP_MSIAP.length()).equals("/")?true:false;
	      		String urlApp = Constantes.RUTA_APP_MSIAP + 
	      				(cortar?"faces/pages/forgotUsernameForm.jsp":"/faces/pages/forgotUsernameForm.jsp");

	          	link.append(urlApp);
	          	link.append(Constantes.PARAMETO_LINK_AUTENTIFICAR);
	          	link.append(tokenEncriptado);
	          	link.append(Constantes.PARAMETO_LINK_CHECK);
	          	link.append(idEcriptado);
	          	return link.toString();

	      	}else{
	      		return null;
	      	}

	      }catch(Exception e){
	    	  e.printStackTrace();
	      }
        return null;
     }


    private void addInfoMessage(String messageInput){
    	FacesContext context= FacesContext.getCurrentInstance();
		FacesMessage message = new FacesMessage(messageInput);
		message.setSeverity(FacesMessage.SEVERITY_INFO);
		context.addMessage(null, message);
    }
    /**
     * Recuperacion de datos para casos que tenga una sola cuenta
     * @param datoUsuario datos de usuario
     * @param link autentificado
     * @param Tipo de recuperacion (contraseña , usuario)
     * @param Tiempo valido en horas del Link
     * @return datos que se envia por correo.
    */
    public void datosEnvioCorreo(List<Usuario> lista , String link , Long filter_tipoRecuperacion, String tiempoValido) throws Exception{
    		String to;
            String subject = null;
            String body;

    	    if(filter_tipoRecuperacion == Constantes.TIPO_RECUPERACION_CLAVE) subject = "Recuperación de credenciales - MSIAP";
    	    if(filter_tipoRecuperacion == Constantes.TIPO_RECUPERACION_USUARIO) subject = "Recuperar usuario - MSIAP";
    	    to = lista.get(0).getDESC_COREEO().trim();

    	    StringBuilder sbMensaje = new StringBuilder();
    	    sbMensaje.append("<html xmlns=\"http://www.w3.org/1999/xhtml\" >");
    	    sbMensaje.append("<head>");
    	    sbMensaje.append("<META HTTP-EQUIV='Content-Type' CONTENT='text/html; charset=UTF-8' />");
    	    sbMensaje.append("<title>RECUPERACIÓN DE CREDENCIALES</title>");
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
    	    sbMensaje.append("<b>PODER JUDICIAL DEL PERÚ - MÓDULO DE ATENCIÓN DE SOLICITUDES DE ANTECEDENTES PENALES <br> MSIAP </br></th>");
    	    sbMensaje.append("</tr>");
    	    sbMensaje.append("<tr>");
    	    sbMensaje.append("<th  width=\"100%\" bordercolor=\"#F2F2F2\" bgcolor=\"#F2F2F2\" scope=\"col\"><span class=\"style1\">");
    	    sbMensaje.append("RECUPERACIÓN DE CREDENCIALES DE ACCESO <br><br></th>");
    	    sbMensaje.append("</tr>");

    	    if(filter_tipoRecuperacion == Constantes.TIPO_RECUPERACION_CLAVE) {
    	       sbMensaje.append("<tr>");
    	       sbMensaje.append("<th align=\"left\"  width=\"100%\" bordercolor=\"#F2F2F2\" bgcolor=\"#F2F2F2\" scope=\"col\"><span class=\"style2\"><b>Estimado/a </b>");
    	       sbMensaje.append(lista.get(0).getAPELLIDOSNOMBRES()).append( "</th>");
    	       sbMensaje.append("</tr>");
    	       sbMensaje.append("<tr>");
    	       sbMensaje.append("<th align=\"left\"  width=\"100%\" bordercolor=\"#F2F2F2\" bgcolor=\"#F2F2F2\" scope=\"col\"><span class=\"style2\">");
    	       sbMensaje.append("</br>Hemos recibido su pedido para recuperar la contraseña de su cuenta: </th>");
    	       sbMensaje.append("</tr>");
    	       sbMensaje.append("<tr>");
    	       sbMensaje.append("<th align=\"left\"  width=\"100%\" bordercolor=\"#F2F2F2\" bgcolor=\"#F2F2F2\" scope=\"col\"><span class=\"style2\"><b>&nbsp;&#8226; Nombre de usuario: </b>");
    	       sbMensaje.append(lista.get(0).getCODG_USUAR()).append("</th>");
    	       sbMensaje.append("</tr>");
    	       sbMensaje.append("<tr>");
    	       sbMensaje.append("<th align=\"left\"  width=\"100%\" bordercolor=\"#F2F2F2\" bgcolor=\"#F2F2F2\" scope=\"col\"><span class=\"style2\"></br>");
    	       sbMensaje.append("Para realizar el cambio de contraseña dar click en el siguiente enlace: <a href=").append(link).append("> Cambiar contraseña</a></th>");
    	       sbMensaje.append("</tr>");
    	       sbMensaje.append("<tr>");
    	       sbMensaje.append("<th align=\"left\"  width=\"100%\" bordercolor=\"#F2F2F2\" bgcolor=\"#F2F2F2\" scope=\"col\"><span class=\"style2\"></br>");
    	       sbMensaje.append("Si no puede abrir el link, copie y pegue la siguiente dirección en su navegador:: <a href=").append(link).append(">").append(link).append("</a></th>");
    	       sbMensaje.append("</tr>");
    	       sbMensaje.append("<tr>");
    	       sbMensaje.append("<th align=\"left\"  width=\"100%\" bordercolor=\"#F2F2F2\" bgcolor=\"#F2F2F2\" scope=\"col\"><span class=\"style2\">");
    	       sbMensaje.append("</br>El tiempo válido para el enlace es de ").append(tiempoValido).append(" horas.</a></th>");
    	       sbMensaje.append("</tr>");
    	    }
    	    if(filter_tipoRecuperacion ==Constantes.TIPO_RECUPERACION_USUARIO) {
    	    	sbMensaje.append("<tr>");
    	    	sbMensaje.append("<th width=\"100%\" bordercolor=\"#F2F2F2\" bgcolor=\"#F2F2F2\" scope=\"col\"><span class=\"style1\"><b></br>DATOS DE LA CUENTA</b></th>");
    	    	sbMensaje.append("</tr>");
    	    	sbMensaje.append("<tr>");
    	    	sbMensaje.append("<th align=\"left\"  width=\"100%\" bordercolor=\"#F2F2F2\" bgcolor=\"#F2F2F2\" scope=\"col\"><span class=\"style2\"><b>Estimado/a </b>");
    	    	sbMensaje.append(lista.get(0).getAPELLIDOSNOMBRES()).append( "</th>");
    	    	sbMensaje.append("</tr>");
    	    	sbMensaje.append("<tr>");
    	    	sbMensaje.append("<th align=\"left\"  width=\"100%\" bordercolor=\"#F2F2F2\" bgcolor=\"#F2F2F2\" scope=\"col\"><span class=\"style2\">");
    	    	sbMensaje.append("</br>Hemos recibido su pedido para recordar los datos de su cuenta: </th>");
    	    	sbMensaje.append("</tr>");
    	    	sbMensaje.append("<tr>");
    	    	sbMensaje.append("<th align=\"left\"  width=\"100%\" bordercolor=\"#F2F2F2\" bgcolor=\"#F2F2F2\" scope=\"col\"><span class=\"style2\"></br><b>&nbsp;&#8226; <b>Nombre de usuario: </b>");
    	    	sbMensaje.append(lista.get(0).getNOMB_USUAR()).append("</th>");
    	    	sbMensaje.append("</tr>");
    	    }
    	    sbMensaje.append("<tr>");
    	    sbMensaje.append("<th align=\"left\"  width=\"100%\" bordercolor=\"#F2F2F2\" bgcolor=\"#F2F2F2\" scope=\"col\"><span class=\"style2\"></br>Gracias.</th>");
    	    sbMensaje.append("</tr>");
    	    sbMensaje.append("</table></body></html>");
			body = sbMensaje.toString();
			SendMail.sendEmail(to, subject, body);
    }



    /**
     * Recuperacion de datos para el casos que tenga varias cuentas.
     * @param lista de usuario que tiene mas de una cuenta
     * @param Tipo de recuperacion (contraseña , usuario)
     * @param Tiempo valido en horas del Link
     * @return datos que se envia por correo
    */
    public void datosEnvioCorreoVariasCuentas(List<Usuario> lista , Long filter_tipoRecuperacion , String tiempoValido) throws Exception{
    		String to;
            String subject = null;
            String body;

    	    if(filter_tipoRecuperacion == Constantes.TIPO_RECUPERACION_CLAVE) subject = "Recuperar contraseña";
    	    if(filter_tipoRecuperacion == Constantes.TIPO_RECUPERACION_USUARIO) subject = "Recuperar usuario";
    	    to = lista.get(0).getDESC_COREEO();
    	    Usuario  datoRecuperacion = new Usuario();
    	    Iterator<Usuario> it = lista.iterator();

    	    StringBuilder sbMensajeRecuperar = new StringBuilder();

    	    sbMensajeRecuperar.append("<html xmlns=\"http://www.w3.org/1999/xhtml\" >");
    	    sbMensajeRecuperar.append("<head>");
    	    sbMensajeRecuperar.append("<META HTTP-EQUIV='Content-Type' CONTENT='text/html; charset=UTF-8' />");
    	    sbMensajeRecuperar.append("<title>RECUPERACIÓN DE CREDENCIALES DE ACCESO</title>");
    	    sbMensajeRecuperar.append("<style type=\"text/css\">");
    	    sbMensajeRecuperar.append(".style1 {font-family: 'Helvetica Neue',Helvetica,Arial,sans-serif; font-size: 81.25%; color:#212121}");
    	    sbMensajeRecuperar.append(".style2 {font-family: 'Helvetica Neue',Helvetica,Arial,sans-serif; font-size: 81.25%; color:#212121}");
    	    sbMensajeRecuperar.append(".style3 {font-family: 'Helvetica Neue',Helvetica,Arial,sans-serif; font-size: 85%; color:#8A0808}");
    	    sbMensajeRecuperar.append("</style>");
    	    sbMensajeRecuperar.append("</head>");
    	    sbMensajeRecuperar.append("<body BGCOLOR=\"#F2F2F2\">");
    	    sbMensajeRecuperar.append("<table width=\"100%\" border=\"0\" cellpadding=\"1\" cellspacing=\"0\">");
    	    sbMensajeRecuperar.append("<tr>");
    	    sbMensajeRecuperar.append("<th  width=\"100%\" bordercolor=\"#F2F2F2\" bgcolor=\"#F2F2F2\" scope=\"col\"><span class=\"style3\">");
    	    sbMensajeRecuperar.append("<b>MÓDULO DE SOLICITUD DE INFORMACIÓN DE ANTECEDENTES PENALES <br> MSIAP </br></th>");
    	    sbMensajeRecuperar.append("</tr>");
    	    sbMensajeRecuperar.append("<tr>");
    	    sbMensajeRecuperar.append("<th  width=\"100%\" bordercolor=\"#F2F2F2\" bgcolor=\"#F2F2F2\" scope=\"col\"><span class=\"style1\">");
    	    sbMensajeRecuperar.append("RECUPERACIÓN DE CREDENCIALES<br><br></th>");
    	    sbMensajeRecuperar.append("</tr>");

     	    if(filter_tipoRecuperacion == Constantes.TIPO_RECUPERACION_USUARIO) {
     	    	sbMensajeRecuperar.append("<tr>");
     	    	sbMensajeRecuperar.append("<th width=\"100%\" bordercolor=\"#F2F2F2\" bgcolor=\"#F2F2F2\" scope=\"col\"><span class=\"style1\"><b></br>DATOS DE LA CUENTA</b></th>");
     	    	sbMensajeRecuperar.append("</tr>");
     	    }

     	   sbMensajeRecuperar.append("<tr>");
     	   sbMensajeRecuperar.append("<th align=\"left\"  width=\"100%\" bordercolor=\"#F2F2F2\" bgcolor=\"#F2F2F2\" scope=\"col\"><span class=\"style2\"><b>Estimado/a </b>");
     	   sbMensajeRecuperar.append(lista.get(0).getAPELLIDOSNOMBRES()).append( "</th>");
     	   sbMensajeRecuperar.append("</tr>");

           if(filter_tipoRecuperacion == Constantes.TIPO_RECUPERACION_CLAVE) {
        	   sbMensajeRecuperar.append("<tr>");
        	   sbMensajeRecuperar.append("<th align=\"left\"  width=\"100%\" bordercolor=\"#F2F2F2\" bgcolor=\"#F2F2F2\" scope=\"col\"><span class=\"style2\">");
        	   sbMensajeRecuperar.append("</br>Hemos recibido su pedido para recuperar la contraseña de sus cuentas: </th>");
        	   sbMensajeRecuperar.append("</tr>");
    	   }
           if(filter_tipoRecuperacion == Constantes.TIPO_RECUPERACION_USUARIO) {
        	   sbMensajeRecuperar.append("<tr>");
        	   sbMensajeRecuperar.append("<th align=\"left\"  width=\"100%\" bordercolor=\"#F2F2F2\" bgcolor=\"#F2F2F2\" scope=\"col\"><span class=\"style2\">");
        	   sbMensajeRecuperar.append("</br>Hemos recibido su pedido para recordar los datos de cuenta: </th>");
        	   sbMensajeRecuperar.append("</tr>");
          }
          int i = 0;
           while(it.hasNext()){
        	   i=i+1;
        	   datoRecuperacion = it.next();
    	       if(filter_tipoRecuperacion == Constantes.TIPO_RECUPERACION_CLAVE) {
    	    	   sbMensajeRecuperar.append("<tr>");
    	    	   sbMensajeRecuperar.append("<th align=\"left\"  width=\"100%\" bordercolor=\"#F2F2F2\" bgcolor=\"#F2F2F2\" scope=\"col\"><span class=\"style2\"><br/><b>&nbsp;&#8226; Nombre de usuario: </b>");
    	    	   sbMensajeRecuperar.append(datoRecuperacion.getCODG_USUAR()).append("</th>");
    	    	   sbMensajeRecuperar.append("</tr>");
    	    	   sbMensajeRecuperar.append("<tr>");
    	    	   sbMensajeRecuperar.append("<th align=\"left\"  width=\"100%\" bordercolor=\"#F2F2F2\" bgcolor=\"#F2F2F2\" scope=\"col\"><span class=\"style2\">");
    	    	   sbMensajeRecuperar.append("<br/>Para realizar el cambio de contraseña dar click en el siguiente enlace: <a href=").append(datoRecuperacion.getLink()).append("> Cambiar contraseña</a></th>");
        	       sbMensajeRecuperar.append("</tr>");
    	    	   sbMensajeRecuperar.append("<tr>");
    	    	   sbMensajeRecuperar.append("<th align=\"left\"  width=\"100%\" bordercolor=\"#F2F2F2\" bgcolor=\"#F2F2F2\" scope=\"col\"><span class=\"style2\"></br>");
    	    	   sbMensajeRecuperar.append("Si no puede abrir el link, copie y pegue la siguiente dirección en Su navegador:: <a href=").append(datoRecuperacion.getLink()).append(">").append(datoRecuperacion.getLink()).append("</a></th>");
    	    	   sbMensajeRecuperar.append("</tr>");
    	       }
    	       if(filter_tipoRecuperacion == Constantes.TIPO_RECUPERACION_USUARIO) {
    	    	   sbMensajeRecuperar.append("<tr>");
    	    	   sbMensajeRecuperar.append("<th align=\"left\"  width=\"100%\" bordercolor=\"#F2F2F2\" bgcolor=\"#F2F2F2\" scope=\"col\"><span class=\"style2\"></br><b>&nbsp;&#8226; Nombre de usuario: </b>");
    	    	   sbMensajeRecuperar.append(datoRecuperacion.getCODG_USUAR()).append("</th>");
    	    	   sbMensajeRecuperar.append("</tr>");
    	      }
          }
          if(filter_tipoRecuperacion == Constantes.TIPO_RECUPERACION_CLAVE) {
        	  sbMensajeRecuperar.append("<tr>");
        	  sbMensajeRecuperar.append("<th align=\"left\"  width=\"100%\" bordercolor=\"#F2F2F2\" bgcolor=\"#F2F2F2\" scope=\"col\"><span class=\"style2\">");
        	  sbMensajeRecuperar.append("</br>El tiempo válido para el enlace es de ").append(tiempoValido).append(" horas.</a></th>");
        	  sbMensajeRecuperar.append("</tr>");
         }
          sbMensajeRecuperar.append("<tr>");
          sbMensajeRecuperar.append("<th align=\"left\"  width=\"100%\" bordercolor=\"#F2F2F2\" bgcolor=\"#F2F2F2\" scope=\"col\"><span class=\"style2\"></br>Gracias.</th>");
          sbMensajeRecuperar.append("</tr>");
          sbMensajeRecuperar.append("</table></body></html>");

		body = sbMensajeRecuperar.toString();
    	SendMail.sendEmail(to, subject, body);
    }

	public void emailUsuario_validate(FacesContext context,UIComponent component, Object value) {
		String email = String.valueOf(value);

		if(email!=null)
			email = email.trim();
		if(email.length()<1)
			throw new ValidatorException(new FacesMessage("Ingrese un correo electrónico válido."));

		Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(email);

		if (!matcher.matches()) {
			throw new ValidatorException(new FacesMessage("Formato de correo electrónico incorrecto."));
		}

	}

    private void addErrorMessage(String messageInput, FacesContext context){
		FacesMessage message = new FacesMessage(messageInput);
		message.setSeverity(FacesMessage.SEVERITY_ERROR);
		context.addMessage(null, message);
    }

	public boolean validarDatos(){
		FacesContext context= FacesContext.getCurrentInstance();
		HttpServletRequest request = null;
		String captchaGenerated;
		Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(email);

        if(txtUsuario.trim().isEmpty()){
        	addErrorMessage("Ingrese usuario.", context);
			return false;
        }

		if (!matcher.matches()) {
			addErrorMessage("Formato de correo electrónico incorrecto. Ingrese un correo válido.", context);
			return false;
		}

		//valida captcha
		request = (HttpServletRequest) context.getExternalContext().getRequest();
		captchaGenerated = (String) request.getSession().getAttribute(nl.captcha.servlet.Constants.SIMPLE_CAPCHA_SESSION_KEY);
		if (!captchaGenerated.equals(textoCaptcha)) {
			addErrorMessage("Texto de imagen incorrecto.", context);
			return false;
		}

		UsuarioManager servicioUsuario = new UsuarioManager();
		String domain = email.substring(email.indexOf('@') + 1);

		//if(!servicioUsuario.isEmailAuthorized(domain.toUpperCase())){
		if(stringContainsItemFromList(domain.toUpperCase(),Constantes.PUBLIC_EMAIL_DOMAINS)){
			addErrorMessage("Lo sentimos. El correo ingresado no es un correo corporativo o no está autorizado para esta operación.", context);
			return false;
		}

		listaUsuario = servicioUsuario.selectUsuarioByCodigoAndEmail(txtUsuario.toUpperCase(), email);
		if(ValidarUtil.isNullOrEmpty(listaUsuario)){
			addErrorMessage("No se encontró el USUARIO o CORREO ELECTRÓNICO.", context);
			return false;
		}


		return true;
	}
	
	public void txtUsuario_validate(FacesContext context, UIComponent component, Object value) {
		String s = String.valueOf(value);
		if (!s.matches("[a-zA-Z0-9]{4,10}")) { throw new ValidatorException(new FacesMessage("El campo usuario contiene caracteres inválidos")); }
	}

	public static boolean stringContainsItemFromList(String inputStr, String[] items)
	{
	    for(int i =0; i < items.length; i++)
	    {
	        if(inputStr.contains(items[i]))
	        {
	            return true;
	        }
	    }
	    return false;
	}
	
	public void check(){
		System.out.println("Llegó al check");
		addInfoMessage("Llegó al check");
	}
	public boolean isRenderEnviarMail() {
		return renderEnviarMail;
	}

	public void setRenderEnviarMail(boolean renderEnviarMail) {
		this.renderEnviarMail = renderEnviarMail;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getTextoCaptcha() {
		return textoCaptcha;
	}
	public void setTextoCaptcha(String textoCaptcha) {
		this.textoCaptcha = textoCaptcha;
	}
	public String getTxtUsuario() {
		return txtUsuario;
	}
	public void setTxtUsuario(String txtUsuario) {
		this.txtUsuario = txtUsuario;
	}
}