package uif;

import java.util.Calendar;
import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UISelectItems;
import javax.faces.component.html.HtmlInputSecret;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlMessage;
import javax.faces.component.html.HtmlMessages;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.validator.ValidatorException;

//import pe.gob.pj.rnc.criterio.CriterioListarUsuario;
import pe.gob.pj.rnc.log.MyLogger;
import pe.gob.pj.rnc.model.Aud_usuario_tablas_cab_det;
import pe.gob.pj.rnc.model.DatosReniec;
import pe.gob.pj.rnc.model.Perfil;
import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.rnc.model.UsuarioCamposAud;
import pe.gob.pj.rnc.msiap.util.StringUtil;
import pe.gob.pj.rnc.service.UsuarioManager;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import com.sun.rave.web.ui.component.Script;
import com.sun.rave.web.ui.component.TextArea;
import com.sun.rave.web.ui.model.SingleSelectOptionsList;

/**
 * @author Gerente
 */
public class IngUsuario extends AbstractPageBean {
	static MyLogger									logger									= new MyLogger(IngUsuario.class.getName());
	protected Page									page1;
	protected Html									html1;
	protected Head									head1;
	protected Link									link1;
	protected Form									form1;
	protected Script								script1;
	protected Script								script2;
	protected Script								script3;
	protected Script								script4;
	protected Body									body1;
	protected HtmlOutputText				outputText1;
	protected HtmlInputText					txtNombres;
	protected HtmlOutputText				outputText2;
	protected HtmlInputText					txtApellidos;
	protected HtmlOutputText				outputText3;
	protected HtmlOutputText				outputText4;
	protected HtmlInputText					txtCorreoElectronico;
	protected HtmlInputText					txtTitulo;
	protected HtmlInputText					txtDocumento;
	protected HtmlInputText					txtFono;
	protected HtmlInputText					txtCodigoUsuario;
	protected HtmlInputText					txtNumJuzgado;
	protected HtmlOutputText				outputText7;
	protected HtmlOutputText				outputText8;
	protected HtmlOutputText				outputText9;
	protected HtmlOutputText				outputText10;
	protected HtmlOutputText				outputText11;
	protected HtmlOutputText				outputText12;
	protected HtmlOutputText				outputText13;
	protected HtmlOutputText				outputText14;
	protected HtmlOutputText				outputText15;
	protected HtmlOutputText				outputText16;
	protected HtmlOutputText				outputText17;
	protected HtmlOutputText				outputText18;
	private Button									btnCancelar							= new Button();
	private Button									btnGrabar								= new Button();
	private SingleSelectOptionsList	ddPerfilDefaultOptions	= new SingleSelectOptionsList();
	private SingleSelectOptionsList	ddTipoDocumentoOptions	= new SingleSelectOptionsList();
	private HtmlSelectOneMenu				ddEntidadExterna				= new HtmlSelectOneMenu();
	private HtmlSelectOneMenu				ddLugar									= new HtmlSelectOneMenu();
	private HtmlSelectOneMenu				ddJuzgado								= new HtmlSelectOneMenu();
	private HtmlSelectOneMenu				ddDistritoJudicial			= new HtmlSelectOneMenu();
	private HtmlSelectOneMenu				ddDistritoJudicialMagis	= new HtmlSelectOneMenu();
	private HtmlSelectOneMenu				ddTipoUsuario						= new HtmlSelectOneMenu();
	private TextArea								txtObservacion					= new TextArea();
	private TextArea								txtMotivo								= new TextArea();
	private UISelectItems						dropdown10SelectItems		= new UISelectItems();
	private UISelectItems						dropdown11SelectItems		= new UISelectItems();
	private UISelectItems						dropdown12SelectItems		= new UISelectItems();
	private UISelectItems						dropdown13SelectItems		= new UISelectItems();
	private UISelectItems						dropdown16SelectItems		= new UISelectItems();
	private UISelectItems						dropdown14SelectItems		= new UISelectItems();
	private UISelectItems						dropdown15SelectItems		= new UISelectItems();
	private HtmlSelectOneMenu				ddPerfil								= new HtmlSelectOneMenu();
	private HtmlSelectOneMenu				ddTipoDocumento							= new HtmlSelectOneMenu();
	private HtmlSelectOneMenu				ddEstado								= new HtmlSelectOneMenu();
	private HtmlMessage							inlineMessage1					= new HtmlMessage();
	private HtmlMessage							inlineMessage2					= new HtmlMessage();
	private HtmlMessage							inlineMessage3					= new HtmlMessage();
	private HtmlMessage							inlineMessage4					= new HtmlMessage();
	private HtmlMessage							inlineMessage5					= new HtmlMessage();
	private HtmlMessage							inlineMessage6					= new HtmlMessage();
	private HtmlMessage							inlineMessage7					= new HtmlMessage();
	private HtmlMessage							inlineMessage8					= new HtmlMessage();
	private HtmlMessage							inlineMessage9					= new HtmlMessage();
	private HtmlMessage							inlineMessage10					= new HtmlMessage();
	private HtmlMessage							inlineMessage12					= new HtmlMessage();
	private HtmlMessage							inlineMessage11					= new HtmlMessage();
	private HtmlMessage							inlineMessage13					= new HtmlMessage();
	private HtmlMessage							inlineMessage14					= new HtmlMessage();
	private HtmlSelectOneMenu				ddModulo								= new HtmlSelectOneMenu();
	private HtmlMessages						messageList1						= new HtmlMessages();
	protected HtmlInputSecret				txtConfirmarContrasena;
	protected HtmlInputSecret				txtContrasena;

	public HtmlMessage getInlineMessage4() {
		return inlineMessage4;
	}

	public void setInlineMessage4(HtmlMessage inlineMessage4) {
		this.inlineMessage4 = inlineMessage4;
	}

	public HtmlMessage getInlineMessage5() {
		return inlineMessage5;
	}

	public void setInlineMessage5(HtmlMessage inlineMessage5) {
		this.inlineMessage5 = inlineMessage5;
	}

	public HtmlMessage getInlineMessage6() {
		return inlineMessage6;
	}

	public void setInlineMessage6(HtmlMessage inlineMessage6) {
		this.inlineMessage6 = inlineMessage6;
	}

	public HtmlMessage getInlineMessage7() {
		return inlineMessage7;
	}

	public void setInlineMessage7(HtmlMessage inlineMessage7) {
		this.inlineMessage7 = inlineMessage7;
	}

	public HtmlSelectOneMenu getDdPerfil() {
		return ddPerfil;
	}

	public void setDdPerfil(HtmlSelectOneMenu ddPerfil) {
		this.ddPerfil = ddPerfil;
	}

	public UISelectItems getDropdown10SelectItems() {
		return dropdown10SelectItems;
	}

	public void setDropdown10SelectItems(UISelectItems dropdown10SelectItems) {
		this.dropdown10SelectItems = dropdown10SelectItems;
	}

	public TextArea getTxtObservacion() {
		return txtObservacion;
	}

	public void setTxtObservacion(TextArea txtObservacion) {
		this.txtObservacion = txtObservacion;
	}

	public TextArea getTxtMotivo() {
		return txtMotivo;
	}

	public void setTxtMotivo(TextArea txtMotivo) {
		this.txtMotivo = txtMotivo;
	}

	public SingleSelectOptionsList getDdPerfilDefaultOptions() {
		return ddPerfilDefaultOptions;
	}

	public void setDdPerfilDefaultOptions(SingleSelectOptionsList ddPerfilDefaultOptions) {
		this.ddPerfilDefaultOptions = ddPerfilDefaultOptions;
	}

	public Body getBody1() {
		return body1;
	}

	public void setBody1(Body body1) {
		this.body1 = body1;
	}

	public Form getForm1() {
		return form1;
	}

	public void setForm1(Form form1) {
		this.form1 = form1;
	}

	public Head getHead1() {
		return head1;
	}

	public void setHead1(Head head1) {
		this.head1 = head1;
	}

	public Html getHtml1() {
		return html1;
	}

	public void setHtml1(Html html1) {
		this.html1 = html1;
	}

	public Link getLink1() {
		return link1;
	}

	public void setLink1(Link link1) {
		this.link1 = link1;
	}

	public Page getPage1() {
		return page1;
	}

	public void setPage1(Page page1) {
		this.page1 = page1;
	}

	public Script getScript1() {
		return script1;
	}

	public void setScript1(Script script1) {
		this.script1 = script1;
	}

	public Script getScript2() {
		return script2;
	}

	public void setScript2(Script script2) {
		this.script2 = script2;
	}

	public Script getScript3() {
		return script3;
	}

	public void setScript3(Script script3) {
		this.script3 = script3;
	}

	public Script getScript4() {
		return script4;
	}

	public void setScript4(Script script4) {
		this.script4 = script4;
	}

	public void init() {
		super.init();
		try {
			_init();
		} catch (Exception e) {
			logger.error("ingUsuario Initialization Failure", e);
			throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
		}
	}

	public void txtNombres_validate(FacesContext context, UIComponent component, Object value) {
		String s = String.valueOf(value);
		if (!s.matches("[a-zA-ZñÑ'üäëïöÄËÏÖÜáéíóúÁÉÍÓÚ \\-\\.\\s]*")) {
			FacesMessage message = new FacesMessage("El campo " + String.valueOf(component.getAttributes().get("id"))
					+ " contiene caracteres inválidos!");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			context.addMessage("form1:" + String.valueOf(component.getAttributes().get("id")), message);
		}
	}

	public void Alfanumerico_validate(FacesContext context, UIComponent component, Object value) {
		String s = String.valueOf(value);
		if (!s.matches("[{a-zA-Z}{0-9}]*")) {
			FacesMessage message = new FacesMessage("El campo " + String.valueOf(component.getAttributes().get("id"))
					+ " contiene caracteres inválidos!");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			context.addMessage("form1:" + String.valueOf(component.getAttributes().get("id")), message);
		}
	}

	public void numerico_validate(FacesContext context, UIComponent component, Object value) {
		String s = String.valueOf(value);
		if (!s.matches("[0-9]{1,3}")) {
			FacesMessage message = new FacesMessage("El dato debe de ser solo numérico ");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			context.addMessage("form1:" + String.valueOf(component.getAttributes().get("id")), message);
		}
	}

	public void txtNumrIdentidad_validate(FacesContext context,UIComponent component, Object value) {

		String perfil = String.valueOf(ddPerfil.getSubmittedValue()==null?
				ddPerfil.getValue():ddPerfil.getSubmittedValue());

		if (perfil.equals(Perfil.MPFN_FISCAL) && (value == null || !((String)value).matches("[0-9]{8}")))
			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR,"Número de documento incorrecto",""));

	}
	
	public void valorCombo(ValueChangeEvent valueChangeEvent) {
		try {
			getSessionBean1().getEntidadExternasFilter().refreshProvider(
					(valueChangeEvent != null ? (String) valueChangeEvent.getNewValue() : null));
		} catch (Exception e) {
			logger.error("", e);
		}
	}

	public void valorComboInterno(ValueChangeEvent valueChangeEvent) {
		try {
			getSessionBean1().getDepartamentoFilter().refreshProvider(
					(valueChangeEvent != null ? (String) valueChangeEvent.getNewValue() : null));
		} catch (Exception e) {
			logger.error("", e);
		}
	}

	public void valorCombo_validate(FacesContext context, UIComponent component, Object value) {
		String s = String.valueOf(value);
		String comDesp = String.valueOf(component.getAttributes().get("id"));
		if (!ddPerfil.getValue().equals("20") && !ddPerfil.getValue().equals("30")) {
			if (new Integer(s) == 0) {
				FacesMessage message = new FacesMessage("Debe de Seleccionar una opción");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				context.addMessage("form1:" + comDesp, message);
			}
		}
	}

	public void comboGeneric_validate(FacesContext context, UIComponent component, Object value) {
		String s = String.valueOf(value);
		//String comDesp = String.valueOf(component.getAttributes().get("id"));
		
		if ("".equals(s)) {
			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Debe de Seleccionar una opción.",""));
		}
	}
	
	public void valorComboDJ_validate(FacesContext context, UIComponent component, Object value) {
		String s = String.valueOf(value);
		String comDesp = String.valueOf(component.getAttributes().get("id"));
		if (ddPerfil.getValue().equals("20") || ddPerfil.getValue().equals("30")) {
			if (s.equals("%")) {
				FacesMessage message = new FacesMessage("Debe de Seleccionar una opción");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				context.addMessage("form1:" + comDesp, message);
			}
		}
	}

	public void txtCorreoElectronico_validate(FacesContext context, UIComponent component, Object value) {
		String s = String.valueOf(value);
		//TODO Modificacion cuenta@servidor.com, se modifico la cuenta de 20-42
		if (!s.matches("[a-zA-Z\\-0-9_\\.]{1,32}[@][a-zA-Z0-9_\\.]{1,20}[\\.][a-zA-Z0-9_]{1,8}")) {
			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR,"El campo de correo no es válido",""));
		}
	}

	private void _init() throws Exception {
		if(getSessionBean1().getDistritoJudicial().getList().size()<=1)
			getSessionBean1().getDistritoJudicial().refreshProvider();

		if(getSessionBean1().getTipoUsuario().getList().size()<=1)
			getSessionBean1().getTipoUsuario().refreshProvider();

		if(getSessionBean1().getJuzgado().getList().size()<=1)
			getSessionBean1().getJuzgado().refreshProvider();

		ddPerfilDefaultOptions.setOptions(new com.sun.rave.web.ui.model.Option[] {
				new com.sun.rave.web.ui.model.Option(Perfil.ADMINISTRADOR_ID, "ADMINISTRADOR"),
				new com.sun.rave.web.ui.model.Option(Perfil.ADMINISTRADOR_USUARIO_ID, "ADMINISTRADOR DE USUARIO"),
				new com.sun.rave.web.ui.model.Option(Perfil.SUPERVISOR_JUDICIAL_ID, "MAGISTRADO"),
				new com.sun.rave.web.ui.model.Option(Perfil.MPFN_FISCAL, "MPFN - FISCAL"),
				// new com.sun.rave.web.ui.model.Option(Perfil.OPERADOR_JUDICIAL_ID, "OPERADOR JUDICIAL"),
				new com.sun.rave.web.ui.model.Option(Perfil.SUPERVISOR_ID, "SUPERVISOR"),
				new com.sun.rave.web.ui.model.Option(Perfil.OPERADOR_ID, "OPERADOR"), 
				new com.sun.rave.web.ui.model.Option(Perfil.BUSCADOR_SOLICITUDES_ID, "CONSULTA RENAJU")		
		});
		
		ddTipoDocumentoOptions.setOptions(new com.sun.rave.web.ui.model.Option[] {
				new com.sun.rave.web.ui.model.Option(Perfil.TIPO_DOC_DNI, "DNI"),
				//new com.sun.rave.web.ui.model.Option(Perfil.TIPO_DOC_RUC, "RUC"),
				new com.sun.rave.web.ui.model.Option(Perfil.TIPO_DOC_CARNE_EXT, "CARNÉ DE EXTRANJERÍA") });
	}

	public String btnValidarDocumento_action(){
		String nroDocumento = String.valueOf(txtDocumento.getSubmittedValue());
		String tipoDocumento = String.valueOf(ddTipoDocumento.getSubmittedValue()==null?
				ddTipoDocumento.getValue():ddTipoDocumento.getSubmittedValue());
		//Poner variables en sólo lectura
		if (tipoDocumento.equals("0010") && nroDocumento.matches("[0-9]{8}")) {
			try {
					//ReniecService wsReniec = new ReniecService();
					DatosReniec beanPersona = getSessionBean1().getReniecService().consultarDatos(nroDocumento, getSessionBean1().getUsuario().getCODG_USUAR());

					String[] nombresR = StringUtil.separarNombresReniec(beanPersona.getNombres());


					//txtNombres.setSubmittedValue(beanPersona.getApePat());
					//txtApellidos.setValue(beanPersona.getApePat() + " " + beanPersona.getApeMat());
					StringBuffer reniecSegundoApellido = new StringBuffer();
					reniecSegundoApellido.append( beanPersona.getApellidoMaterno().toUpperCase() ).append(" ").append( beanPersona.getApellidoCasada().toUpperCase().trim() );
					//txtApellidos.setSubmittedValue(beanPersona.getApePat() + " " +reniecSegundoApellido.toString().trim());
					txtApellidos.setSubmittedValue(beanPersona.getApellidoPaterno() + " " +reniecSegundoApellido.toString().trim());
					txtApellidos.setValue(beanPersona.getApellidoPaterno() + " " +reniecSegundoApellido.toString().trim());
					//txtNombres.setSubmittedValue(nombresR[0] +(nombresR.length>1 && nombresR[1]!=null? " " + nombresR[1]:""));
					//txtNombres.setValue(nombresR[0] +(nombresR.length>1 && nombresR[1]!=null? " " + nombresR[1]:""));
					//TODO Probar descomentar
					String nombres=""; 
					for(int i=0; i<nombresR.length; i++) { nombres+=nombresR[i]+" "; }
					txtNombres.setSubmittedValue(nombres.trim());
					txtNombres.setValue(nombres.trim());		
					

			} catch (Exception e) {
				//Resetear valores
				txtApellidos.resetValue();
				txtNombres.resetValue();
				error("Problema con el servicio de consulta datos del DNI, por favor intente otra vez. De persistir comuníquese con el área de Help Desk del RENIEC.");
				//error("Ocurrió un error al obtener datos del Documento Nacional de Identidad.");
			}
		}

		return null;
	}

	public HtmlOutputText getOutputText1() {
		return outputText1;
	}

	public void setOutputText1(HtmlOutputText outputText1) {
		this.outputText1 = outputText1;
	}

	public HtmlOutputText getOutputText2() {
		return outputText2;
	}

	public void setOutputText2(HtmlOutputText outputText2) {
		this.outputText2 = outputText2;
	}

	public HtmlInputText getTxtApellidos() {
		return txtApellidos;
	}

	public void setTxtApellidos(HtmlInputText txtApellidos) {
		this.txtApellidos = txtApellidos;
	}

	public HtmlInputText getTxtNombres() {
		return txtNombres;
	}

	public void setTxtNombres(HtmlInputText txtNombres) {
		this.txtNombres = txtNombres;
	}

	public HtmlOutputText getOutputText3() {
		return outputText3;
	}

	public void setOutputText3(HtmlOutputText outputText3) {
		this.outputText3 = outputText3;
	}

	public HtmlOutputText getOutputText4() {
		return outputText4;
	}

	public void setOutputText4(HtmlOutputText outputText4) {
		this.outputText4 = outputText4;
	}

	public HtmlInputText getTxtTitulo() {
		return txtTitulo;
	}

	public void setTxtTitulo(HtmlInputText txtTitulo) {
		this.txtTitulo = txtTitulo;
	}

	public HtmlOutputText getOutputText10() {
		return outputText10;
	}

	public void setOutputText10(HtmlOutputText outputText10) {
		this.outputText10 = outputText10;
	}

	public HtmlOutputText getOutputText7() {
		return outputText7;
	}

	public void setOutputText7(HtmlOutputText outputText7) {
		this.outputText7 = outputText7;
	}

	public HtmlOutputText getOutputText8() {
		return outputText8;
	}

	public void setOutputText8(HtmlOutputText outputText8) {
		this.outputText8 = outputText8;
	}

	public HtmlOutputText getOutputText9() {
		return outputText9;
	}

	public void setOutputText9(HtmlOutputText outputText9) {
		this.outputText9 = outputText9;
	}

	public HtmlInputText getTxtCorreoElectronico() {
		return txtCorreoElectronico;
	}

	public void setTxtCorreoElectronico(HtmlInputText txtCorreoElectronico) {
		this.txtCorreoElectronico = txtCorreoElectronico;
	}

	public HtmlSelectOneMenu getDdDistritoJudicial() {
		return ddDistritoJudicial;
	}

	public void setDdDistritoJudicial(HtmlSelectOneMenu ddDistritoJudicial) {
		this.ddDistritoJudicial = ddDistritoJudicial;
	}

	public UISelectItems getDropdown11SelectItems() {
		return dropdown11SelectItems;
	}

	public void setDropdown11SelectItems(UISelectItems dropdown11SelectItems) {
		this.dropdown11SelectItems = dropdown11SelectItems;
	}

	public HtmlOutputText getOutputText11() {
		return outputText11;
	}

	public void setOutputText11(HtmlOutputText outputText11) {
		this.outputText11 = outputText11;
	}

	public HtmlOutputText getOutputText12() {
		return outputText12;
	}

	public void setOutputText12(HtmlOutputText outputText12) {
		this.outputText12 = outputText12;
	}

	public HtmlSelectOneMenu getDdEntidadExterna() {
		return ddEntidadExterna;
	}

	public void setDdEntidadExterna(HtmlSelectOneMenu ddEntidadExterna) {
		this.ddEntidadExterna = ddEntidadExterna;
	}

	public HtmlSelectOneMenu getDdEstado() {
		return ddEstado;
	}

	public void setDdEstado(HtmlSelectOneMenu ddEstado) {
		this.ddEstado = ddEstado;
	}

	public HtmlSelectOneMenu getDdTipoUsuario() {
		return ddTipoUsuario;
	}

	public void setDdTipoUsuario(HtmlSelectOneMenu ddTipoUsuario) {
		this.ddTipoUsuario = ddTipoUsuario;
	}

	public UISelectItems getDropdown12SelectItems() {
		return dropdown12SelectItems;
	}

	public void setDropdown12SelectItems(UISelectItems dropdown12SelectItems) {
		this.dropdown12SelectItems = dropdown12SelectItems;
	}

	public HtmlOutputText getOutputText13() {
		return outputText13;
	}

	public void setOutputText13(HtmlOutputText outputText13) {
		this.outputText13 = outputText13;
	}

	public HtmlOutputText getOutputText14() {
		return outputText14;
	}

	public void setOutputText14(HtmlOutputText outputText14) {
		this.outputText14 = outputText14;
	}

	public HtmlOutputText getOutputText15() {
		return outputText15;
	}

	public void setOutputText15(HtmlOutputText outputText15) {
		this.outputText15 = outputText15;
	}

	public HtmlInputText getTxtCodigoUsuario() {
		return txtCodigoUsuario;
	}

	public void setTxtCodigoUsuario(HtmlInputText txtCodigoUsuario) {
		this.txtCodigoUsuario = txtCodigoUsuario;
	}

	public Button getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(Button btnCancelar) {
		this.btnCancelar = btnCancelar;
	}

	public Button getBtnGrabar() {
		return btnGrabar;
	}

	public void setBtnGrabar(Button btnGrabar) {
		this.btnGrabar = btnGrabar;
	}

	public void grabarAuditoria(Usuario usuario, String cambioClave) {
		/*UsuarioCamposAud cau = new UsuarioCamposAud();
		cau.setAPLL_USUAR(usuario.getCamposAudit().getAPLL_USUAR().equals(usuario.getAPLL_USUAR()) ? "" : (usuario
				.getCamposAudit().getAPLL_USUAR() + "").trim().length() > 0 ? usuario.getCamposAudit().getAPLL_USUAR()
				: Constantes.SIN_VALOR_NULL);
		cau.setC_CLAVE(cambioClave);
		cau.setC_PERFIL(usuario.getCamposAudit().getC_PERFIL().equals(usuario.getC_PERFIL()) ? "" : (usuario
				.getCamposAudit().getC_PERFIL() + "").trim().length() > 0 ? usuario.getCamposAudit().getC_PERFIL()
				: Constantes.SIN_VALOR_NULL);
		cau.setCOD_APLICACION(usuario.getCamposAudit().getCOD_APLICACION().equals(usuario.getCOD_APLICACION()) ? ""
				: (usuario.getCamposAudit().getCOD_APLICACION() + "").trim().length() > 0 ? usuario.getCamposAudit()
						.getCOD_APLICACION() : Constantes.SIN_VALOR_NULL);
		cau.setCODG_DISTRITO_JUDICIAL(usuario.getCamposAudit().getCODG_DISTRITO_JUDICIAL().equals(
				usuario.getCODG_DISTRITO_JUDICIAL()) ? "" : (usuario.getCamposAudit().getCODG_DISTRITO_JUDICIAL() + "").trim()
				.length() > 0 ? usuario.getCamposAudit().getCODG_DISTRITO_JUDICIAL() : Constantes.SIN_VALOR_NULL);
		cau.setCODG_ENTIDAD_EXTERNA(usuario.getCODG_ENTIDAD_EXTERNA() == null ? usuario.getCamposAudit()
				.getCODG_ENTIDAD_EXTERNA() : (usuario.getCamposAudit().getCODG_ENTIDAD_EXTERNA() == usuario
				.getCODG_ENTIDAD_EXTERNA()) ? 0 : usuario.getCamposAudit().getCODG_ENTIDAD_EXTERNA());
		cau.setCODG_TIPO(usuario.getCamposAudit().getCODG_TIPO().equals(usuario.getCODG_TIPO()) ? "" : (usuario
				.getCODG_TIPO() + "").trim().length() > 0 ? usuario.getCODG_TIPO() : Constantes.SIN_VALOR_NULL);
		cau.setCODG_USUAR(usuario.getCamposAudit().getCODG_USUAR().equals(usuario.getCODG_USUAR()) ? "" : (usuario
				.getCamposAudit().getCODG_USUAR() + "").trim().length() > 0 ? usuario.getCamposAudit().getCODG_USUAR()
				: Constantes.SIN_VALOR_NULL);
		cau.setDESC_COREEO(usuario.getCamposAudit().getDESC_COREEO().equals(usuario.getDESC_COREEO()) ? "" : (usuario
				.getCamposAudit().getDESC_COREEO() + "").trim().length() > 0 ? usuario.getCamposAudit().getDESC_COREEO()
				: Constantes.SIN_VALOR_NULL);
		cau
				.setDESC_OBSERVACIONES(usuario.getCamposAudit().getDESC_OBSERVACIONES().equals(usuario.getDESC_OBSERVACIONES()) ? ""
						: (usuario.getCamposAudit().getDESC_OBSERVACIONES() + "").trim().length() > 0 ? usuario.getCamposAudit()
								.getDESC_OBSERVACIONES() : Constantes.SIN_VALOR_NULL);
		cau.setDESC_TITULO(usuario.getCamposAudit().getDESC_TITULO().equals(usuario.getDESC_TITULO()) ? "" : (usuario
				.getCamposAudit().getDESC_TITULO() + "").trim().length() > 0 ? usuario.getCamposAudit().getDESC_TITULO()
				: Constantes.SIN_VALOR_NULL);
		cau.setESTD_USUAR(usuario.getCamposAudit().getESTD_USUAR().equals(usuario.getESTD_USUAR()) ? "" : (usuario
				.getCamposAudit().getESTD_USUAR() + "").trim().length() > 0 ? usuario.getCamposAudit().getESTD_USUAR()
				: Constantes.SIN_VALOR_NULL);
		cau.setNOMB_USUAR(usuario.getCamposAudit().getNOMB_USUAR().equals(usuario.getNOMB_USUAR()) ? "" : (usuario
				.getCamposAudit().getNOMB_USUAR() + "").trim().length() > 0 ? usuario.getCamposAudit().getNOMB_USUAR()
				: Constantes.SIN_VALOR_NULL);
		cau.setCODG_LUGAR(usuario.getCamposAudit().getCODG_LUGAR().equals(usuario.getCODG_LUGAR()) ? "" : (usuario
				.getCamposAudit().getCODG_LUGAR() + "").trim().length() > 0 ? usuario.getCamposAudit().getCODG_LUGAR()
				: Constantes.SIN_VALOR_NULL);
		cau.setNUME_JUZGA(usuario.getCamposAudit().getNUME_JUZGA().equals(usuario.getNUME_JUZGA()) ? "" : (usuario
				.getCamposAudit().getNUME_JUZGA() + "").trim().length() > 0 ? usuario.getCamposAudit().getNUME_JUZGA()
				: Constantes.SIN_VALOR_NULL);
		cau.setCODG_JUZGAD(usuario.getCamposAudit().getCODG_JUZGAD().equals(usuario.getCODG_JUZGAD()) ? "" : (usuario
				.getCamposAudit().getCODG_JUZGAD() + "").trim().length() > 0 ? usuario.getCamposAudit().getCODG_JUZGAD()
				: Constantes.SIN_VALOR_NULL);

		cau.setDESC_MOTIVO(usuario.getDESC_MOTIVO() + "");
		//int x = getSessionBean1().getManager().updateUsuario(usuario);
		if (cau.getC_CLAVE().equals("MODIFICACION") || cau.getAPLL_USUAR().length() > 0 || cau.getC_PERFIL().length() > 0
				|| cau.getCOD_APLICACION().length() > 0 || cau.getCODG_DISTRITO_JUDICIAL().length() > 0
				|| cau.getCODG_ENTIDAD_EXTERNA() != 0 || cau.getCODG_TIPO().length() > 0 || cau.getCODG_USUAR().length() > 0
				|| cau.getDESC_COREEO().length() > 0 || cau.getDESC_OBSERVACIONES().length() > 0
				|| cau.getDESC_TITULO().length() > 0 || cau.getESTD_USUAR().length() > 0 || cau.getNOMB_USUAR().length() > 0
				|| cau.getCODG_LUGAR().length() > 0 || cau.getNUME_JUZGA().length() > 0 || cau.getCODG_JUZGAD().length() > 0
				|| cau.getDESC_MOTIVO().length() > 0) {
			System.out.println("Grabando auditoria...");
			Aud_usuario_tablas_cab_det audCD = new Aud_usuario_tablas_cab_det();
			audCD.setC_usuario(getSessionBean1().getUsuario().getCODG_USUAR());
			audCD.setMotivo(getSessionBean1().getUsuario().getCODG_USUAR() + " Actualizó los datos del usuario "
					+ usuario.getCODG_USUAR());
			audCD.setC_accion(audCD.ACTUALIZA);
			audCD.setC_usuario(getSessionBean1().getUsuario().getCODG_USUAR());
			audCD.setCamposAudit(cau);
			//usuario.auditoria(coneccion, audCD);
		}*/

	}

	public boolean validar(String message, String obj, String paramValidar, String valor) {
		if (paramValidar.equals(valor)) {
			FacesContext context = FacesContext.getCurrentInstance();
			FacesMessage message1 = new FacesMessage(message);
			message1.setSeverity(FacesMessage.SEVERITY_ERROR);
			context.addMessage(obj, message1);
			return false;
		}
		return true;
	}

	public String btnGrabar_action() {
		

		
		String valorReturn = null;
		
		String conNueva = (String) txtContrasena.getValue();
		String confirma = (String) txtConfirmarContrasena.getValue();
		if (!conNueva.equals(confirma)) {
			error("La nueva contraseña y su confirmación son diferentes");
			return null;
		}

		if (!(getSessionBean1().getUsuario().getC_PERFIL().equals(Perfil.ADMINISTRADOR_USUARIO_ID) || getSessionBean1()
				.getUsuario().getC_PERFIL().equals(Perfil.ADMINISTRADOR_ID))) {
			error("No tiene Permiso para grabar datos de usuario");
			return null;
		}
		Usuario usuario = getSessionBean1().getUsuarioMant();
		if (!ddPerfil.getValue().equals(Perfil.OPERADOR_JUDICIAL_ID)
				&& !ddPerfil.getValue().equals(Perfil.SUPERVISOR_JUDICIAL_ID)) {
			if (!validar("Debe de seleccionar una opción", "form1:ddEntidadExterna", "0",
					(usuario.getCODG_ENTIDAD_EXTERNA() == null ? "0" : usuario.getCODG_ENTIDAD_EXTERNA().toString()))) {
				return null;
			}
		} else {
			if (!validar("Debe de seleccionar una opción", "form1:ddLugar", "0", (usuario.getCODG_LUGAR() == null ? "0"
					: usuario.getCODG_LUGAR().toString()))) {
				return null;
			}
		}
		if (usuario.getCOD_PERFIL().equals(Perfil.OPERADOR_JUDICIAL_ID)
				|| usuario.getCOD_PERFIL().equals(Perfil.SUPERVISOR_JUDICIAL_ID)) {
			usuario.setCODG_ENTIDAD_EXTERNA(null);
		} else {
			usuario.setCODG_LUGAR(null);
			usuario.setCODG_JUZGAD(null);
			usuario.setNUME_JUZGA(null);
		}

/*		usuario.setCODG_LUGAR(null);
		usuario.setCODG_JUZGAD(null);
		usuario.setNUME_JUZGA(null);
*/
		try{
			UsuarioManager servicioUsuario = new UsuarioManager();
			Calendar fechActual = Calendar.getInstance();
			UsuarioCamposAud cau = new UsuarioCamposAud();
			cau.setC_CLAVE("CREACION");
			if (usuario.getFLAG_MANT() != null && usuario.getC_CLAVE() != null) {
				if (usuario.getFLAG_MANT().equals("MOD") && usuario.getC_CLAVE().equals(""))
					cau.setC_CLAVE("");
				else
					cau.setC_CLAVE("MODIFICACION");
			}
			usuario.setAUD_CODG_USUAR(getSessionBean1().getUsuario().getCODG_USUAR());
			usuario.setAPLL_USUAR(usuario.getAPLL_USUAR().toUpperCase());
			usuario.setNOMB_USUAR(usuario.getNOMB_USUAR().toUpperCase());
			usuario.setDESC_TITULO(usuario.getDESC_TITULO().toUpperCase());
			//String codigo = cau.getC_CLAVE().equals("")?usuario.getC_CLAVE():servicioUsuario.encriptarCadena(conNueva);
			//usuario.setC_CLAVE(codigo);
			//usuario.setCOD_CLAVE(codigo);
			/* Actualizando la vigencia del */
			fechActual.add(Calendar.DATE, 60);
			usuario.setFECH_VENCI(fechActual.getTime());
			/* Fin de Actualización de vigencia del usuario */
			if (usuario.getCOD_PERFIL().equals(Perfil.OPERADOR_JUDICIAL_ID)
					|| usuario.getCOD_PERFIL().equals(Perfil.SUPERVISOR_JUDICIAL_ID)) {
				usuario.setCODG_DISTRITO_JUDICIAL(usuario.getCODG_DISTRITO_JUDICIAL_MAG());
			}

			//erodriguezbu - Validar que no haya más de un supervisor
			if(Perfil.SUPERVISOR_ID.equals(usuario.getCOD_PERFIL()) && usuario.getCODG_ENTIDAD_EXTERNA() != null){
				if(servicioUsuario.existeSupervisor(usuario)){
					error("No se puede grabar. Ya existe un usuario con el perfil Supervisor.");
					return null;
				}
			}
			//Se esta colocando null a este campo 
			if(Perfil.MPFN_FISCAL.equals(usuario.getCOD_PERFIL())){
				//usuario.setCODG_LUGAR("9992");//A solicitud de RENAJU, no quieren este campo libre (Para MP no se tiene estos datos)
			}
			if (usuario.getFLAG_MANT().equals("MOD")) {
				int result = servicioUsuario.updateUsuario(usuario);
				if(result==1){
					info("Actualización exitosa");
					grabarAuditoria(usuario, cau.getC_CLAVE());
				} else {
					error("Ocurrió un error al actualizar. Por favor intente nuevamente.");
					return null;
				}
				//valorReturn = "case4";

			} else {
				usuario.setPREF_USUAR("WEB");
				usuario.setCONE_USUAR("N");
				usuario.setL_INGRESO("N");
				usuario.setCODG_USUAR(usuario.getCODG_USUAR().toUpperCase());

				Usuario usuarioConsulta = servicioUsuario.selecUsuario(usuario.getCODG_USUAR());
				
				if (usuarioConsulta != null)
					if (usuarioConsulta.getCODG_USUAR().equals(usuario.getCODG_USUAR())) {
						error("El código de Usuario ya existe, Porfavor ingresar un código diferente");
						return null;
				}
				
				if(servicioUsuario.existeUsuarioDni(usuario)){
					error("Ya existe un usuario con número de documento "+usuario.getC_NUMDOCIDT());
					return null;
				}
					
				try{
					servicioUsuario.insertUsuario(usuario);
				} catch(Exception e){
					usuario.setC_CLAVE("");
					usuario.setCOD_CLAVE("");
					error("Ocurrió un error al guardar. Por favor intente nuevamente.");
					return null;
				}
				
				info("Usuario guardado exitosamente");
				Aud_usuario_tablas_cab_det audCD = new Aud_usuario_tablas_cab_det();
				audCD.setC_usuario(getSessionBean1().getUsuario().getCODG_USUAR());
				audCD.setMotivo(audCD.getC_usuario() + " creó al usuario : " + usuario.getCODG_USUAR());
				audCD.setC_accion(audCD.REGISTRA);
				cau.setAPLL_USUAR(usuario.getAPLL_USUAR());
				cau.setC_PERFIL(usuario.getC_PERFIL());
				cau.setCOD_APLICACION(usuario.getCOD_APLICACION());
				cau.setCODG_DISTRITO_JUDICIAL(usuario.getCODG_DISTRITO_JUDICIAL());
				cau.setCODG_ENTIDAD_EXTERNA(usuario.getCODG_ENTIDAD_EXTERNA() == null ? 0 : usuario.getCODG_ENTIDAD_EXTERNA());
				cau.setCODG_TIPO(usuario.getCODG_TIPO());
				cau.setCODG_USUAR(usuario.getCODG_USUAR());
				cau.setDESC_COREEO(usuario.getDESC_COREEO());
				cau.setDESC_OBSERVACIONES(usuario.getDESC_OBSERVACIONES());
				cau.setDESC_TITULO(usuario.getDESC_TITULO());
				cau.setESTD_USUAR(usuario.getESTD_USUAR());
				cau.setNOMB_USUAR(usuario.getNOMB_USUAR());
				cau.setCODG_LUGAR(usuario.getCODG_LUGAR());
				cau.setNUME_JUZGA(usuario.getNUME_JUZGA());
				cau.setCODG_JUZGAD(usuario.getCODG_JUZGAD());
				cau.setDESC_MOTIVO(usuario.getDESC_MOTIVO());
				audCD.setCamposAudit(cau);
				usuario.auditoria(null, audCD);
			}
			
			Usuario user = new Usuario();
			user.setFLAG_MANT("NEW");
			getSessionBean1().setUsuarioMant(user);
			getSessionBean1().getConsultaUsuario().refreshProvider(usuario, null);
			
			valorReturn = "case4";
		} catch (Exception e){
			error("Ocurrió un error al guardar la información del usuario");
			logger.error("Error en mantenimiento de usuario: IngUsuario.java");
			e.printStackTrace();
		}

		return valorReturn;
	}

	public String btnCancelar_action() {
		txtContrasena.setValue("");
		txtConfirmarContrasena.setValue("");
		getSessionBean1().setUsuarioMant(new Usuario());
		return "case4";
	}

	public HtmlMessage getInlineMessage1() {
		return inlineMessage1;
	}

	public void setInlineMessage1(HtmlMessage inlineMessage1) {
		this.inlineMessage1 = inlineMessage1;
	}

	public HtmlMessage getInlineMessage2() {
		return inlineMessage2;
	}

	public void setInlineMessage2(HtmlMessage inlineMessage2) {
		this.inlineMessage2 = inlineMessage2;
	}

	public HtmlMessage getInlineMessage3() {
		return inlineMessage3;
	}

	public void setInlineMessage3(HtmlMessage inlineMessage3) {
		this.inlineMessage3 = inlineMessage3;
	}

	protected SessionBean1 getSessionBean1() {
		return (SessionBean1) getBean("SessionBean1");
	}

	public HtmlMessage getInlineMessage8() {
		return inlineMessage8;
	}

	public void setInlineMessage8(HtmlMessage inlineMessage8) {
		this.inlineMessage8 = inlineMessage8;
	}

	public UISelectItems getDropdown13SelectItems() {
		return dropdown13SelectItems;
	}

	public void setDropdown13SelectItems(UISelectItems dropdown13SelectItems) {
		this.dropdown13SelectItems = dropdown13SelectItems;
	}

	public HtmlMessage getInlineMessage9() {
		return inlineMessage9;
	}

	public void setInlineMessage9(HtmlMessage inlineMessage9) {
		this.inlineMessage9 = inlineMessage9;
	}

	public void txtContrasenhaActual_validate(FacesContext context, UIComponent component, Object value) {
		String s = String.valueOf(value);
		Usuario usuario = getSessionBean1().getUsuarioMant();
		String clave1 = txtContrasena.getSubmittedValue()!=null?(String)txtContrasena.getSubmittedValue():null;
		if(s!=null && s.length()==0){
			if(!usuario.getFLAG_MANT().equals("MOD"))
				throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR,
						"La clave no debe de tener menos de 6 dígitos ni contener espacios en blanco",""));
		}else{
			if(!s.matches("^(?:\\S{5,14}\\S)?$")){
				throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR,
						"La clave no debe de tener menos de 6 dígitos ni contener espacios en blanco",""));
			}
			if(clave1!=null){
				boolean hasNumber = clave1.matches(".*\\d.*");
				boolean hasAlphabet = clave1.matches(".*[a-zA-Z]+.*");
				
				if(!txtContrasena.getSubmittedValue().equals(txtConfirmarContrasena.getSubmittedValue()))
					throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Las contraseñas ingresadas no son iguales.",""));
				
		
				if (!hasNumber || !hasAlphabet) {
					throw new ValidatorException(
							new FacesMessage(FacesMessage.SEVERITY_ERROR, "La nueva contraseña debe tener al menos un número y una letra..",""));
		        }
			}
					

			
		}
	}

	public HtmlInputSecret getTxtConfirmarContrasena() {
		return txtConfirmarContrasena;
	}

	public void setTxtConfirmarContrasena(HtmlInputSecret txtConfirmarContrasena) {
		this.txtConfirmarContrasena = txtConfirmarContrasena;
	}

	public HtmlInputSecret getTxtContrasena() {
		return txtContrasena;
	}

	public void setTxtContrasena(HtmlInputSecret txtContrasena) {
		this.txtContrasena = txtContrasena;
	}

	public HtmlOutputText getOutputText16() {
		return outputText16;
	}

	public void setOutputText16(HtmlOutputText outputText16) {
		this.outputText16 = outputText16;
	}

	public HtmlOutputText getOutputText17() {
		return outputText17;
	}

	public void setOutputText17(HtmlOutputText outputText17) {
		this.outputText17 = outputText17;
	}

	public HtmlOutputText getOutputText18() {
		return outputText18;
	}

	public void setOutputText18(HtmlOutputText outputText18) {
		this.outputText18 = outputText18;
	}

	public HtmlSelectOneMenu getDdJuzgado() {
		return ddJuzgado;
	}

	public void setDdJuzgado(HtmlSelectOneMenu ddJuzgado) {
		this.ddJuzgado = ddJuzgado;
	}

	public UISelectItems getDropdown14SelectItems() {
		return dropdown14SelectItems;
	}

	public void setDropdown14SelectItems(UISelectItems dropdown14SelectItems) {
		this.dropdown14SelectItems = dropdown14SelectItems;
	}

	public HtmlSelectOneMenu getDdDistritoJudicialMagis() {
		return ddDistritoJudicialMagis;
	}

	public void setDdDistritoJudicialMagis(HtmlSelectOneMenu ddDistritoJudicialMagis) {
		this.ddDistritoJudicialMagis = ddDistritoJudicialMagis;
	}

	public UISelectItems getDropdown15SelectItems() {
		return dropdown15SelectItems;
	}

	public void setDropdown15SelectItems(UISelectItems dropdown15SelectItems) {
		this.dropdown15SelectItems = dropdown15SelectItems;
	}

	public HtmlMessage getInlineMessage10() {
		return inlineMessage10;
	}

	public void setInlineMessage10(HtmlMessage inlineMessage10) {
		this.inlineMessage10 = inlineMessage10;
	}

	public HtmlMessage getInlineMessage11() {
		return inlineMessage11;
	}

	public void setInlineMessage11(HtmlMessage inlineMessage11) {
		this.inlineMessage11 = inlineMessage11;
	}

	public HtmlInputText getTxtNumJuzgado() {
		return txtNumJuzgado;
	}

	public void setTxtNumJuzgado(HtmlInputText txtNumJuzgado) {
		this.txtNumJuzgado = txtNumJuzgado;
	}

	public HtmlSelectOneMenu getDdLugar() {
		return ddLugar;
	}

	public void setDdLugar(HtmlSelectOneMenu ddLugar) {
		this.ddLugar = ddLugar;
	}

	public HtmlMessage getInlineMessage12() {
		return inlineMessage12;
	}

	public void setInlineMessage12(HtmlMessage inlineMessage12) {
		this.inlineMessage12 = inlineMessage12;
	}

	public HtmlMessage getInlineMessage13() {
		return inlineMessage13;
	}

	public void setInlineMessage13(HtmlMessage inlineMessage13) {
		this.inlineMessage13 = inlineMessage13;
	}

	public HtmlMessage getInlineMessage14() {
		return inlineMessage14;
	}

	public void setInlineMessage14(HtmlMessage inlineMessage14) {
		this.inlineMessage14 = inlineMessage14;
	}

	public UISelectItems getDropdown16SelectItems() {
		return dropdown16SelectItems;
	}

	public void setDropdown16SelectItems(UISelectItems dropdown16SelectItems) {
		this.dropdown16SelectItems = dropdown16SelectItems;
	}

	public HtmlMessages getMessageList1() {
		return messageList1;
	}

	public void setMessageList1(HtmlMessages messageList1) {
		this.messageList1 = messageList1;
	}

	public HtmlSelectOneMenu getDdModulo() {
		return ddModulo;
	}

	public void setDdModulo(HtmlSelectOneMenu ddModulo) {
		this.ddModulo = ddModulo;
	}

	public HtmlInputText getTxtDocumento() {
		return txtDocumento;
	}

	public void setTxtDocumento(HtmlInputText txtDocumento) {
		this.txtDocumento = txtDocumento;
	}

	public HtmlInputText getTxtFono() {
		return txtFono;
	}

	public void setTxtFono(HtmlInputText txtFono) {
		this.txtFono = txtFono;
	}
	
	public SingleSelectOptionsList getDdTipoDocumentoOptions() {
		return ddTipoDocumentoOptions;
	}

	public void setDdTipoDocumentoOptions(SingleSelectOptionsList ddTipoDocumentoOptions) {
		this.ddTipoDocumentoOptions = ddTipoDocumentoOptions;
	}

	public HtmlSelectOneMenu getDdTipoDocumento() {
		return ddTipoDocumento;
	}

	public void setDdTipoDocumento(HtmlSelectOneMenu ddTipoDocumento) {
		this.ddTipoDocumento = ddTipoDocumento;
	}
}