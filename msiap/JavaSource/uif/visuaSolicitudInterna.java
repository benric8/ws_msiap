/*
 * IngSolicitudInterna.java
 *
 * Created on 27 de febrero de 2007, 07:25 AM
 * Copyright user
 */
package uif;


import java.util.Date;
import java.util.GregorianCalendar;
import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UISelectItems;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlMessage;
import javax.faces.component.html.HtmlMessages;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.component.html.HtmlSelectBooleanCheckbox;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.context.FacesContext;
import javax.faces.convert.DateTimeConverter;
import javax.faces.validator.ValidatorException;

import pe.gob.pj.rnc.log.MyLogger;
import pe.gob.pj.rnc.model.Perfil;
import pe.gob.pj.rnc.model.Solicitud;
import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.rnc.service.Soporte;
import pe.gob.pj.rnc.tipo.Texto;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Calendar;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.TextArea;

/**
 * <p>
 * Page bean that corresponds to a similarly named JSP page. This class contains
 * component definitions (and initialization code) for all components that you
 * have defined on this page, as well as lifecycle methods and event handlers
 * where you may add behavior to respond to incoming events.
 * </p>
 */
public class visuaSolicitudInterna extends AbstractPageBean {
	static MyLogger logger= new MyLogger(visuaSolicitudInterna.class.getName());

	private StaticText staticText9 = new StaticText();

	private UISelectItems dropdown10SelectItems = new UISelectItems();

	public UISelectItems getDropdown10SelectItems() {
		return dropdown10SelectItems;
	}

	public void setDropdown10SelectItems(UISelectItems uisi) {
		this.dropdown10SelectItems = uisi;
	}

	// <editor-fold defaultstate="collapsed" desc="Managed Component
	// Definition">
	// private int __placeholder;

	/**
	 * <p>
	 * Automatically managed component initialization. <strong>WARNING:</strong>
	 * This method is automatically generated, so any user-specified code
	 * inserted here is subject to being replaced.
	 * </p>
	 */
	private void _init() throws Exception {
		dateTimeConverter1.setTimeZone(java.util.TimeZone
				.getTimeZone("America/Lima"));
		dateTimeConverter1.setLocale(new java.util.Locale("es", "PE"));
		dateTimeConverter1.setPattern("dd/mm/yyyy");
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

	private HtmlOutputText outputText3 = new HtmlOutputText();

	public HtmlOutputText getOutputText3() {
		return outputText3;
	}

	public void setOutputText3(HtmlOutputText hot) {
		this.outputText3 = hot;
	}

	private HtmlOutputText outputText4 = new HtmlOutputText();

	public HtmlOutputText getOutputText4() {
		return outputText4;
	}

	public void setOutputText4(HtmlOutputText hot) {
		this.outputText4 = hot;
	}

	private HtmlInputText txtApellidoPaterno = new HtmlInputText();

	public HtmlInputText getTxtApellidoPaterno() {
		return txtApellidoPaterno;
	}

	public void setTxtApellidoPaterno(HtmlInputText hit) {
		this.txtApellidoPaterno = hit;
	}

	private HtmlInputText txtApellidoMaterno = new HtmlInputText();

	public HtmlInputText getTxtApellidoMaterno() {
		return txtApellidoMaterno;
	}

	public void setTxtApellidoMaterno(HtmlInputText hit) {
		this.txtApellidoMaterno = hit;
	}

	private HtmlOutputText outputText5 = new HtmlOutputText();

	public HtmlOutputText getOutputText5() {
		return outputText5;
	}

	public void setOutputText5(HtmlOutputText hot) {
		this.outputText5 = hot;
	}

	private HtmlInputText txtNombre1 = new HtmlInputText();

	public HtmlInputText getTxtNombre1() {
		return txtNombre1;
	}

	public void setTxtNombre1(HtmlInputText hit) {
		this.txtNombre1 = hit;
	}

	private HtmlInputText txtNombre2 = new HtmlInputText();

	public HtmlInputText getTxtNombre2() {
		return txtNombre2;
	}

	public void setTxtNombre2(HtmlInputText hit) {
		this.txtNombre2 = hit;
	}

	private HtmlOutputText outputText6 = new HtmlOutputText();

	public HtmlOutputText getOutputText6() {
		return outputText6;
	}

	public void setOutputText6(HtmlOutputText hot) {
		this.outputText6 = hot;
	}

	private HtmlOutputText outputText7 = new HtmlOutputText();

	public HtmlOutputText getOutputText7() {
		return outputText7;
	}

	public void setOutputText7(HtmlOutputText hot) {
		this.outputText7 = hot;
	}

	private HtmlInputText txtNombre3 = new HtmlInputText();

	public HtmlInputText getTxtNombre3() {
		return txtNombre3;
	}

	public void setTxtNombre3(HtmlInputText hit) {
		this.txtNombre3 = hit;
	}

	private HtmlOutputText outputText8 = new HtmlOutputText();

	public HtmlOutputText getOutputText8() {
		return outputText8;
	}

	public void setOutputText8(HtmlOutputText hot) {
		this.outputText8 = hot;
	}

	private HtmlInputText txtNumrIdentidad = new HtmlInputText();

	private HtmlSelectBooleanCheckbox checkSinFech = new HtmlSelectBooleanCheckbox();

	private HtmlInputText txtNroExpediente = new HtmlInputText();

	private TextArea txtDelito = new TextArea();

	public HtmlInputText getTxtNumrIdentidad() {
		return txtNumrIdentidad;
	}

	public void setTxtNumrIdentidad(HtmlInputText hit) {
		this.txtNumrIdentidad = hit;
	}

	private HtmlSelectOneMenu ddTipoDocumento = new HtmlSelectOneMenu();

	public HtmlSelectOneMenu getDdTipoDocumento() {
		return ddTipoDocumento;
	}

	public void setDdTipoDocumento(HtmlSelectOneMenu hsom) {
		this.ddTipoDocumento = hsom;
	}

	private UISelectItems dropdown1SelectItems = new UISelectItems();

	public UISelectItems getDropdown1SelectItems() {
		return dropdown1SelectItems;
	}

	public void setDropdown1SelectItems(UISelectItems uisi) {
		this.dropdown1SelectItems = uisi;
	}

	private HtmlOutputText outputText9 = new HtmlOutputText();

	public HtmlOutputText getOutputText9() {
		return outputText9;
	}

	public void setOutputText9(HtmlOutputText hot) {
		this.outputText9 = hot;
	}

	private HtmlSelectOneMenu ddLugar = new HtmlSelectOneMenu();

	public HtmlSelectOneMenu getDdLugar() {
		return ddLugar;
	}

	public void setDdLugar(HtmlSelectOneMenu hsom) {
		this.ddLugar = hsom;
	}

	private UISelectItems dropdown2SelectItems = new UISelectItems();

	public UISelectItems getDropdown2SelectItems() {
		return dropdown2SelectItems;
	}

	public void setDropdown2SelectItems(UISelectItems uisi) {
		this.dropdown2SelectItems = uisi;
	}

	private HtmlOutputText outputText10 = new HtmlOutputText();

	public HtmlOutputText getOutputText10() {
		return outputText10;
	}

	public void setOutputText10(HtmlOutputText hot) {
		this.outputText10 = hot;
	}

	private HtmlOutputText outputText11 = new HtmlOutputText();

	public HtmlOutputText getOutputText11() {
		return outputText11;
	}

	public void setOutputText11(HtmlOutputText hot) {
		this.outputText11 = hot;
	}

	private HtmlOutputText outputText12 = new HtmlOutputText();

	public HtmlOutputText getOutputText12() {
		return outputText12;
	}

	public void setOutputText12(HtmlOutputText hot) {
		this.outputText12 = hot;
	}

	private HtmlOutputText outputText13 = new HtmlOutputText();

	public HtmlOutputText getOutputText13() {
		return outputText13;
	}

	public void setOutputText13(HtmlOutputText hot) {
		this.outputText13 = hot;
	}

	private HtmlInputText txtNomMadre = new HtmlInputText();

	public HtmlInputText getTxtNomMadre() {
		return txtNomMadre;
	}

	public void setTxtNomMadre(HtmlInputText hit) {
		this.txtNomMadre = hit;
	}

	private HtmlInputText txtNomPadre = new HtmlInputText();

	public HtmlInputText getTxtNomPadre() {
		return txtNomPadre;
	}

	public void setTxtNomPadre(HtmlInputText hit) {
		this.txtNomPadre = hit;
	}

	private HtmlMessages messageList1 = new HtmlMessages();

	public HtmlMessages getMessageList1() {
		return messageList1;
	}

	public void setMessageList1(HtmlMessages hm) {
		this.messageList1 = hm;
	}

	private Calendar calFechNacimiento = new Calendar();

	public Calendar getCalFechNacimiento() {
		return calFechNacimiento;
	}

	public void setCalFechNacimiento(Calendar c) {
		this.calFechNacimiento = c;
	}

	private Button btnGrabar = new Button();


	public Button getBtnGrabar() {
		return btnGrabar;
	}

	public void setBtnGrabar(Button b) {
		this.btnGrabar = b;
	}

	private Button btnCancelar = new Button();

	public Button getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(Button b) {
		this.btnCancelar = b;
	}

	private DateTimeConverter dateTimeConverter1 = new DateTimeConverter();

	public DateTimeConverter getDateTimeConverter1() {
		return dateTimeConverter1;
	}

	public void setDateTimeConverter1(DateTimeConverter dtc) {
		this.dateTimeConverter1 = dtc;
	}

	private HtmlOutputText outputText1 = new HtmlOutputText();

	public HtmlOutputText getOutputText1() {
		return outputText1;
	}

	public void setOutputText1(HtmlOutputText hot) {
		this.outputText1 = hot;
	}

	java.util.Calendar cal = new GregorianCalendar();

	private Date maxDate;

	private Date minDate;

	private HtmlOutputText outputText2 = new HtmlOutputText();

	public HtmlOutputText getOutputText2() {
		return outputText2;
	}

	public void setOutputText2(HtmlOutputText hot) {
		this.outputText2 = hot;
	}

	private HtmlMessage inlineMessage1 = new HtmlMessage();

	public HtmlMessage getInlineMessage1() {
		return inlineMessage1;
	}

	public void setInlineMessage1(HtmlMessage hm) {
		this.inlineMessage1 = hm;
	}

	private HtmlMessage inlineMessage2 = new HtmlMessage();

	public HtmlMessage getInlineMessage2() {
		return inlineMessage2;
	}

	public void setInlineMessage2(HtmlMessage hm) {
		this.inlineMessage2 = hm;
	}

	private HtmlMessage inlineMessage3 = new HtmlMessage();

	public HtmlMessage getInlineMessage3() {
		return inlineMessage3;
	}

	public void setInlineMessage3(HtmlMessage hm) {
		this.inlineMessage3 = hm;
	}

	private HtmlMessage inlineMessage4 = new HtmlMessage();

	public HtmlMessage getInlineMessage4() {
		return inlineMessage4;
	}

	public void setInlineMessage4(HtmlMessage hm) {
		this.inlineMessage4 = hm;
	}

	private HtmlMessage inlineMessage5 = new HtmlMessage();

	private HtmlMessage inlineMessage13 = new HtmlMessage();

	private HtmlMessage inlineMessage11 = new HtmlMessage();

	public HtmlMessage getInlineMessage5() {
		return inlineMessage5;
	}

	public void setInlineMessage5(HtmlMessage hm) {
		this.inlineMessage5 = hm;
	}

	private HtmlMessage inlineMessage6 = new HtmlMessage();

	public HtmlMessage getInlineMessage6() {
		return inlineMessage6;
	}

	public void setInlineMessage6(HtmlMessage hm) {
		this.inlineMessage6 = hm;
	}

	private HtmlMessage inlineMessage7 = new HtmlMessage();

	public HtmlMessage getInlineMessage7() {
		return inlineMessage7;
	}

	public void setInlineMessage7(HtmlMessage hm) {
		this.inlineMessage7 = hm;
	}

	private HtmlMessage inlineMessage8 = new HtmlMessage();

	public HtmlMessage getInlineMessage8() {
		return inlineMessage8;
	}

	public void setInlineMessage8(HtmlMessage hm) {
		this.inlineMessage8 = hm;
	}

	private HtmlMessage inlineMessage9 = new HtmlMessage();

	public HtmlMessage getInlineMessage9() {
		return inlineMessage9;
	}

	public void setInlineMessage9(HtmlMessage hm) {
		this.inlineMessage9 = hm;
	}

	private HtmlMessage inlineMessage10 = new HtmlMessage();

	public HtmlMessage getInlineMessage10() {
		return inlineMessage10;
	}

	public void setInlineMessage10(HtmlMessage hm) {
		this.inlineMessage10 = hm;
	}

	private HtmlMessage inlineMessage12 = new HtmlMessage();

	public HtmlMessage getInlineMessage12() {
		return inlineMessage12;
	}

	public void setInlineMessage12(HtmlMessage hm) {
		this.inlineMessage12 = hm;
	}

	private TextArea txtObservacion = new TextArea();

	public TextArea getTxtObservacion() {
		return txtObservacion;
	}

	public void setTxtObservacion(TextArea ta) {
		this.txtObservacion = ta;
	}

	private HtmlOutputText outputText14 = new HtmlOutputText();

	public HtmlOutputText getOutputText14() {
		return outputText14;
	}

	public void setOutputText14(HtmlOutputText hot) {
		this.outputText14 = hot;
	}

	// </editor-fold>

	/**
	 * <p>
	 * Construct a new Page bean instance.
	 * </p>
	 */
	public visuaSolicitudInterna() {
	}

	/**
	 * <p>
	 * Callback method that is called whenever a page is navigated to, either
	 * directly via a URL, or indirectly via page navigation. Customize this
	 * method to acquire resources that will be needed for event handlers and
	 * lifecycle methods, whether or not this page is performing post back
	 * processing.
	 * </p>
	 *
	 * <p>
	 * Note that, if the current request is a postback, the property values of
	 * the components do <strong>not</strong> represent any values submitted
	 * with this request. Instead, they represent the property values that were
	 * saved for this view when it was rendered.
	 * </p>
	 */
	public void init() {
		// Perform initializations inherited from our superclass
		super.init();
		setMaxDate(cal.getTime());
		cal.add(java.util.Calendar.YEAR, -100);
		setMinDate(cal.getTime());

		// Perform application initialization that must complete
		// *before* managed components are initialized

		// <editor-fold defaultstate="collapsed" desc="Managed Component
		// Initialization">
		// Initialize automatically managed components
		// *Note* - this logic should NOT be modified
		try {
			_init();
		} catch (Exception e) {
			logger.error("ingSolicitudSimple Initialization Failure", e);
			throw e instanceof FacesException ? (FacesException) e
					: new FacesException(e);
		}


		calFechNacimiento.setMaxDate(getMaxDate());
		calFechNacimiento.setMinDate(getMinDate());

		txtNroExpediente.setReadonly(false);
		txtDelito.setDisabled(false);
		ddTipoDocumento.setReadonly(false);
		txtNumrIdentidad.setReadonly(false);
		txtApellidoPaterno.setReadonly(false);
		txtApellidoMaterno.setReadonly(false);
		txtNombre1.setReadonly(false);
		txtNombre2.setReadonly(false);
		txtNombre3.setReadonly(false);

		ddLugar.setReadonly(false);
		calFechNacimiento.setDisabled(false);
		txtNomPadre.setReadonly(false);
		txtNomMadre.setReadonly(false);
		txtObservacion.setDisabled(false);

		if (getSessionBean1().getSolicitudVisual() != null) {
			if (getSessionBean1().getSolicitudVisual().getFLAG_MANT().equals("DET")) {

				txtNroExpediente.setReadonly(true);
				txtDelito.setDisabled(true);
				ddTipoDocumento.setReadonly(true);
				txtNumrIdentidad.setReadonly(true);
				txtApellidoPaterno.setReadonly(true);
				txtApellidoMaterno.setReadonly(true);
				txtNombre1.setReadonly(true);
				txtNombre2.setReadonly(true);
				txtNombre3.setReadonly(true);

				ddLugar.setReadonly(true);
				calFechNacimiento.setDisabled(true);
				txtNomPadre.setReadonly(true);
				txtNomMadre.setReadonly(true);
				txtObservacion.setDisabled(true);
			} else {
				txtNroExpediente.setReadonly(false);
				txtDelito.setDisabled(false);
				ddTipoDocumento.setReadonly(false);
				txtNumrIdentidad.setReadonly(false);
				txtApellidoPaterno.setReadonly(false);
				txtApellidoMaterno.setReadonly(false);
				txtNombre1.setReadonly(false);
				txtNombre2.setReadonly(false);
				txtNombre3.setReadonly(false);

				ddLugar.setReadonly(false);
				calFechNacimiento.setDisabled(false);
				txtNomPadre.setReadonly(false);
				txtNomMadre.setReadonly(false);
				txtObservacion.setDisabled(false);

			}
		}
		if (getSessionBean1().getSolicitudVisual() == null)
			getSessionBean1().setSolicitudVisual(new Solicitud());

	}

	/**
	 * <p>
	 * Callback method that is called after the component tree has been
	 * restored, but before any event processing takes place. This method will
	 * <strong>only</strong> be called on a postback request that is processing
	 * a form submit. Customize this method to allocate resources that will be
	 * required in your event handlers.
	 * </p>
	 */
	public void preprocess() {
	}

	/**
	 * <p>
	 * Callback method that is called just before rendering takes place. This
	 * method will <strong>only</strong> be called for the page that will
	 * actually be rendered (and not, for example, on a page that handled a
	 * postback and then navigated to a different page). Customize this method
	 * to allocate resources that will be required for rendering this page.
	 * </p>
	 */
	public void prerender() {
	}

	/**
	 * <p>
	 * Callback method that is called after rendering is completed for this
	 * request, if <code>init()</code> was called (regardless of whether or
	 * not this was the page that was actually rendered). Customize this method
	 * to release resources acquired in the <code>init()</code>,
	 * <code>preprocess()</code>, or <code>prerender()</code> methods (or
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

	public String button1_action() {
		info("Registro añadido con éxito");
		return "case2";
	}

	public String btnCancelar_action() {

		Solicitud solicitud = new Solicitud();
		solicitud.setFLAG_MANT("NEW");
		getSessionBean1().setSolicitudVisual(null);
		getSessionBean1().setSolicitudVisual(solicitud);
		getSessionBean1().setSolicitudInterna(null);

		txtNroExpediente.setReadonly(false);
		txtDelito.setDisabled(false);
		ddTipoDocumento.setReadonly(false);
		txtNumrIdentidad.setReadonly(false);
		txtApellidoPaterno.setReadonly(false);
		txtApellidoMaterno.setReadonly(false);
		txtNombre1.setReadonly(false);
		txtNombre2.setReadonly(false);
		txtNombre3.setReadonly(false);
		ddLugar.setReadonly(false);
		calFechNacimiento.setDisabled(false);
		txtNomPadre.setReadonly(false);
		txtNomMadre.setReadonly(false);
		txtObservacion.setDisabled(false);
		getSessionBean1().setPrimerAccesoSolicitudInterna(true);

		return "cancelar";
	}

	public String btnGrabar_action() {
		String tipoDocumento = String.valueOf(ddTipoDocumento.getValue());
		String nroDocumento = String.valueOf(txtNumrIdentidad.getValue());
		String navigateTo = null;

		getSessionBean1().setPrimerAccesoSolicitudInterna(true);
		if (tipoDocumento.equals("0010")) {
			if (!nroDocumento.matches("[0-9]{8}")) {
				FacesContext context = FacesContext.getCurrentInstance();
				FacesMessage message = new FacesMessage("El número de D.N.I. debe ser numérico y de 8 dígitos");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				context.addMessage("form1:txtNumrIdentidad", message);
				return null;
			}
		}
		if (!tipoDocumento.equals("0001")&& txtNumrIdentidad.getValue().toString().equals("")) {
				FacesContext context = FacesContext.getCurrentInstance();
				FacesMessage message = new FacesMessage("Debe de ingresar el numero de documento");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				context.addMessage("form1:txtNumrIdentidad", message);
				return null;

		}

		boolean paterno = false;
		boolean materno = false;
		int nroIncidencia = 0;

		if (txtApellidoMaterno.getValue()==null|| String.valueOf(txtApellidoMaterno.getValue()).trim().equals("")) {
			nroIncidencia++;
			materno = true;

		}
		if (txtApellidoPaterno.getValue()==null || String.valueOf(txtApellidoPaterno.getValue()).trim().equals("")) {
			nroIncidencia++;
			paterno = true;
		}

		if (nroIncidencia > 1) {
			FacesContext context = FacesContext.getCurrentInstance();
			FacesMessage message = new FacesMessage("Dato obligatorio: "
					+ (materno ? " Apellido Materno " : " ")
					+ (paterno ? " o Apellido Paterno " : " "));
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			context.addMessage("form1:txtApellidoPaterno", message);
			return null;
		}

		Solicitud solicitud = getSessionBean1().getSolicitudVisual();

		if(!solicitud.isFlag_naci() && solicitud.getFECH_NACIM_SOLIC()==null){
			FacesContext context = FacesContext.getCurrentInstance();
			FacesMessage message = new FacesMessage(
					"Debe de ingresar la fecha de nacimiento o seleccionar la opción Sin Fecha ");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			context.addMessage("form1:calFechNacimiento", message);
			return null;
		}

		solicitud.setMOTI_SOLIC(Soporte.MOTIVO_SOLICITUD_MAGISTRADO);
		Usuario usuario = getSessionBean1().getUsuario();
		if(usuario.getCOD_PERFIL().equals(Perfil.ADMINISTRADOR_ID)){
			error("Usted no puede Grabar porque necesita pertenecer a un Juzgado, " +
					"este es un dato indispensable para este tipo de Solicitud de Certificado de Antecedentes Penales");
			return null;

		}
		if (solicitud.getAPLL_PATER_SOLIC()==null || solicitud.getAPLL_PATER_SOLIC().trim().equals("")) {
			solicitud.setAPLL_PATER_SOLIC("***");
		}
		if (solicitud.getAPLL_MATER_SOLIC()==null || solicitud.getAPLL_MATER_SOLIC().trim().equals("")) {
			solicitud.setAPLL_MATER_SOLIC("***");
		}
		getSessionBean1().getMotivos().establecerDescripcionDeMotivo(solicitud);
		getSessionBean1().getMotivos().establecerTipoSolicitud(solicitud);

		solicitud.setAPLL_PATER_SOLIC((solicitud.getAPLL_PATER_SOLIC()==null?null:solicitud.getAPLL_PATER_SOLIC().trim().toUpperCase()));
		solicitud.setAPLL_MATER_SOLIC((solicitud.getAPLL_MATER_SOLIC()==null?null:solicitud.getAPLL_MATER_SOLIC().trim().toUpperCase()));
		solicitud.setNOM1_SOLIC(solicitud.getNOM1_SOLIC().toUpperCase());
		solicitud.setNOM2_SOLIC((solicitud.getNOM2_SOLIC()==null?null:solicitud.getNOM2_SOLIC().toUpperCase().trim()));
		solicitud.setNOM3_SOLIC((solicitud.getNOM3_SOLIC()==null?null:solicitud.getNOM3_SOLIC().toUpperCase().trim()) );
		solicitud.setNOM_MADRE(solicitud.getNOM_MADRE().toUpperCase());
		solicitud.setNOM_PADRE(solicitud.getNOM_PADRE().toUpperCase());

		if (!solicitud.getFLAG_MANT().equals("MOD")) {
			solicitud.setNUME_JUZGA(usuario.getNUME_JUZGA());
			solicitud.setCODG_JUZGAD(usuario.getCODG_JUZGAD());
			solicitud.setDESC_JUZGA_SOLIC(getSessionBean1().getJuzgadoUser()
					+ " de " + getSessionBean1().getDepartamentoUser());
			solicitud.setV_DES_OFICIO(solicitud.getNUME_EXPED_SOLIC());
		}
		solicitud.setNOMB_JUZGA_SOLIC(getSessionBean1().getUsuario().getNOMB_USUAR()+ "  " + getSessionBean1().getUsuario().getAPLL_USUAR());

		if (solicitud.getNUME_IDENT_SOLIC() != null) {
			solicitud.setNUME_IDENT_SOLIC(solicitud.getNUME_IDENT_SOLIC()
					.toUpperCase());
		}

		try {
			getSessionBean1().getManager().enviarSolicitudInterna(usuario,solicitud);
			navigateTo = "null";
			if(solicitud.getFLAG_MANT().equals("MOD"))
				navigateTo = "cancelar";
			if(solicitud.getRptaValidacion()!=null)
			warn("Solicitud Enviada al Registro Nacional de Condenas con éxito, " + solicitud.getRptaValidacion());//mensaje final
			else
				info("Solicitud Enviada al Registro Nacional de Condenas con éxito ");
		} catch (Exception e1) {
			e1.printStackTrace();
			if (e1.equals("errorEnvio")) {
				error("Ha ocurrido un error intentando realizar el envío por favor intente otra vez de persistir el error comuniquese con el área de help desk del PJ");
				logger.error("Ha ocurrido un error intentando realizar el envío por favor intente otra vez de persistir el error comuniquese con el área de help desk del PJ. error: " , e1);
				return null;
			} else if (e1.equals("errorSeleccion")) {
				error("Ha ocurrido un error en la ejecución de la consulta para obtener sus solicitudes ingresadas.");
				logger.error("Ha ocurrido un error en la ejecución de la consulta para obtener sus solicitudes ingresadas.: " , e1);
			}
		}
		getSessionBean1().setSolicitudVisual(new Solicitud());
		//getSessionBean1().setSolicitudInterna(null);
		return navigateTo;
	}



	public String btnIngresarNuevo_action() {
		getSessionBean1().setSolicitudVisual(new Solicitud());
		return null;
	}


	/**
	 * <p>
	 * Return a reference to the scoped data bean.
	 * </p>
	 */
	protected uif.fragHeader getfragHeader() {
		return (uif.fragHeader) getBean("fragHeader");
	}

	public void txtApellidoPaterno_validate(FacesContext context,UIComponent component, Object value) {
		String s = String.valueOf(value);
		if(s!=null)
			if(s.trim().length()<1)
				throw new ValidatorException(new FacesMessage("Estas enviando "+s.length()+"  caracteres en blanco"));

		if (!s.matches("[A-Za-zñÑäëïöüÿÄËÏÖÜ.']+[A-Za-zñÑäëïöüÿÄËÏÖÜ.'\\-\\s]+[A-Za-zñÑäëïöüÿÄËÏÖÜ.']+")&& !s.matches("[\\*]{3}")) {
			throw new ValidatorException(
					new FacesMessage("Sólo se permite caracteres de A a la Z, " +
							"sin espacios en blanco al inicio o al final"));
		}

	}

	public void padres_validate(FacesContext context, UIComponent component,
			Object value) {
		String s = String.valueOf(value);
		if ("".equals(s)) {
			throw new ValidatorException(new FacesMessage("El campo "
					+ component.getId() + " es requerido"));
		} else {
			if (!s.matches("[A-Za-zñÑ]+[A-Za-zñÑ\\-\\s]+[A-Za-zñÑ]+||[\\*]{3}")) {
				throw new ValidatorException(
						new FacesMessage(
								"El campo "
										+ String.valueOf(component
												.getAttributes().get("alt"))
										+ " solo permite caracteres de la A a la Z, sin espacios en blanco al inicio o al final"));
			}
		}
	}

	public Date getMaxDate() {
		return maxDate;
	}

	public void setMaxDate(Date maxDate) {
		this.maxDate = maxDate;
	}

	public Date getMinDate() {
		return minDate;
	}

	public void setMinDate(Date minDate) {
		this.minDate = minDate;
	}

	/**
	 * <p>
	 * Return a reference to the scoped data bean.
	 * </p>
	 */


	public void txtObservacion_validate(FacesContext context,
			UIComponent component, Object value) {
		String s = String.valueOf(value);
		s = Texto.corregir(s);
		if (Texto.contieneAlgo(s))
			if (255 < s.length())
				throw new ValidatorException(new FacesMessage("Este campo solo permite caracteres 255 de la A a la Z"));
	}

	/**
	 * <p>
	 * Return a reference to the scoped data bean.
	 * </p>
	 */
	protected uif.fraHeader getfraHeader() {
		return (uif.fraHeader) getBean("fraHeader");
	}

	public void txtNumrIdentidad_validate(FacesContext context,UIComponent component, Object value) {
		String s = null;
		if (value != null && !((String) value).equals("")) {
			s = String.valueOf(value);
			if (!s.matches("[a-zA-Z0-9 \\-\\/]{5,14}")) {
				throw new ValidatorException(new FacesMessage("El campo "
						+ String.valueOf(component.getAttributes().get("alt"))
						+ " no permite caracteres especiales"));
			}
		} else {
				throw new ValidatorException
						(new FacesMessage("El campo "+ String.valueOf(component.getAttributes().get("alt"))+ " es requerido"));
		}

	}

	private HtmlMessage inlineMessage90 = new HtmlMessage();

	public HtmlMessage getInlineMessage90() {
		return inlineMessage90;
	}

	public void setInlineMessage90(HtmlMessage inlineMessage90) {
		this.inlineMessage90 = inlineMessage90;
	}

	public HtmlInputText getTxtNroExpediente() {
		return txtNroExpediente;
	}

	public void setTxtNroExpediente(HtmlInputText txtNroExpediente) {
		this.txtNroExpediente = txtNroExpediente;
	}

	public void setTxtDelito(TextArea txtDelito) {
		this.txtDelito = txtDelito;
	}

	public TextArea getTxtDelito() {
		return txtDelito;
	}

	public HtmlSelectBooleanCheckbox getCheckSinFech() {
		return checkSinFech;
	}

	public void setCheckSinFech(HtmlSelectBooleanCheckbox checkSinFech) {
		this.checkSinFech = checkSinFech;
	}

	public StaticText getStaticText9() {
		return staticText9;
	}

	public void setStaticText9(StaticText staticText9) {
		this.staticText9 = staticText9;
	}

	public HtmlMessage getInlineMessage11() {
		return inlineMessage11;
	}

	public void setInlineMessage11(HtmlMessage inlineMessage11) {
		this.inlineMessage11 = inlineMessage11;
	}

	public HtmlMessage getInlineMessage13() {
		return inlineMessage13;
	}

	public void setInlineMessage13(HtmlMessage inlineMessage13) {
		this.inlineMessage13 = inlineMessage13;
	}


}
