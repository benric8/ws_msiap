package uif;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Set;

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
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;
import javax.faces.validator.ValidatorException;
import javax.servlet.http.HttpServletRequest;

import pe.gob.mpfn.ClienteCasoFiscal;
import pe.gob.mpfn.ws.ConsultaCaso;
import pe.gob.mpfn.ws.RespuestaPartes;
import pe.gob.pj.rnc.log.MyLogger;
import pe.gob.pj.rnc.model.DatosReniec;
import pe.gob.pj.rnc.model.MotivoSolicitudCertificado;
import pe.gob.pj.rnc.model.Perfil;
import pe.gob.pj.rnc.model.Solicitud;
import pe.gob.pj.rnc.model.TipoDocumentoAutorizacion;
import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.rnc.msiap.util.Constantes;
import pe.gob.pj.rnc.msiap.util.StringUtil;
import pe.gob.pj.rnc.service.TipoDocumentoIdentidadManager;
import pe.gob.pj.rnc.tipo.Texto;
import pe.gob.pj.util.CommonsUtilities;

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
import com.sun.rave.web.ui.model.Option;

/**
 * <p>
 * Page bean that corresponds to a similarly named JSP page. This class contains
 * component definitions (and initialization code) for all components that you
 * have defined on this page, as well as lifecycle methods and event handlers
 * where you may add behavior to respond to incoming events.
 * </p>
 */
public class IngSolicitudInterna extends AbstractPageBean {

	static MyLogger logger= new MyLogger(IngSolicitudInterna.class.getName());

	private StaticText staticText9 = new StaticText();

	private UISelectItems dropdown10SelectItems = new UISelectItems();

	private String lblDelito = "(*)Delitos y Artículos: ";
	private String lblNroExpediente = "(*)Número: ";
	
	private List<SelectItem> tiposDocumentoAut;
	private String idTipoDocumentoAutorizacion;
	private Usuario usuarioSesion;
	private String mensajeValidaExistenciaSolicitud; 
	private HtmlSelectBooleanCheckbox checkNacidoEnExtrajero = new HtmlSelectBooleanCheckbox();
	private HtmlInputText txtLugarNacimiento = new HtmlInputText();
	
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
		btnValidarDocumento.setVisible(false);
	}

	private String onloadFunction="";

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
	private HtmlSelectOneMenu ddTipoDocumentoAut = new HtmlSelectOneMenu();

	public HtmlSelectOneMenu getDdTipoDocumento() {
		return ddTipoDocumento;
	}

	public void setDdTipoDocumento(HtmlSelectOneMenu hsom) {
		this.ddTipoDocumento = hsom;
	}

	private UISelectItems dropdown1SelectItems = new UISelectItems();
	private UISelectItems dropdown1SelectAutItems = new UISelectItems();

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
	private HtmlMessage inlineMessage15 = new HtmlMessage();
	
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

	private Button btnValidarDocumento = new Button();

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

	private boolean renderPhoto = false;

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
	public IngSolicitudInterna() {
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

		try {
			_init();
		} catch (Exception e) {
			logger.error("ingSolicitudSimple Initialization Failure", e);
			throw e instanceof FacesException ? (FacesException) e
					: new FacesException(e);
		}

		this.usuarioSesion = getSessionBean1().getUsuario();
		getSessionBean1().setSolicitudUnitaria(new Solicitud());

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

		if (getSessionBean1().getSolicitudUnitaria() != null) {
			if (getSessionBean1().getSolicitudUnitaria().getFLAG_MANT().equals("DET")) {

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

		if(Perfil.MPFN_FISCAL.equals(this.usuarioSesion.getCOD_PERFIL())){
			this.lblDelito = "(*)Presuntos delitos: ";
			//this.lblNroExpediente = "(*)Nro. de caso: ";
			onloadFunction = "validarDocumentoOnLoad()";
		}
		
		//Inicio del llenado de opciones para el tipo de documento de autorización
		List<TipoDocumentoAutorizacion> listaDocsSession = this.getSessionBean1().getLstTipoDocumentoAutorizacion();
		this.tiposDocumentoAut = new ArrayList<SelectItem>();
		
		if(listaDocsSession ==null || listaDocsSession.size()<1){
			TipoDocumentoIdentidadManager servicioTipoDoc = new TipoDocumentoIdentidadManager();
			listaDocsSession = servicioTipoDoc.getTiposDocumentoAutorizacion();
			this.getSessionBean1().setLstTipoDocumentoAutorizacion(listaDocsSession);
		}
		
		Set<Integer> TIPOS_DOC_AUT = Perfil.MPFN_FISCAL.equals(this.usuarioSesion.getCOD_PERFIL())?
				Constantes.TIPOS_DOCUMENTOS_AUT_FISCALIA : Constantes.TIPOS_DOCUMENTOS_AUT_PJ;
		
		for(TipoDocumentoAutorizacion tda : listaDocsSession){
			if(TIPOS_DOC_AUT.contains(tda.getIdTipoDocumentoAutorizacion())){
				SelectItem s = new SelectItem();
				s.setLabel(tda.getNombre());
				s.setValue(String.valueOf(tda.getIdTipoDocumentoAutorizacion()));
				
				this.tiposDocumentoAut.add(s);	
			}
		}
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
		getSessionBean1().setSolicitudUnitaria(null);
		getSessionBean1().setSolicitudUnitaria(solicitud);
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
		
		FacesContext context = FacesContext.getCurrentInstance();
		//UIComponent btnGrabar = context.getViewRoot().findComponent("form1:btnGrabar");
		Solicitud solicitud = getSessionBean1().getSolicitudUnitaria();
		HttpServletRequest request = (HttpServletRequest) this.getFacesContext().getExternalContext().getRequest();
		DatosReniec personaBean = (DatosReniec) request.getSession().getAttribute("PERSONA_RENIEC_BEAN");
		
		if (validarTramiteReturnNull(solicitud)){
			return null;
		}
		
		
		String tipoDocumento = String.valueOf(ddTipoDocumento.getValue());
		String tipoDocumentoAut = String.valueOf(ddTipoDocumentoAut.getValue());
		String nroDocumento = String.valueOf(txtNumrIdentidad.getValue());
		String navigateTo = null;

		getSessionBean1().setPrimerAccesoSolicitudInterna(true);
		if (tipoDocumento.equals("0010")) {
			if (!nroDocumento.matches("[0-9]{8}")) {
				FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,"El número de D.N.I. debe ser numérico y de 8 dígitos","");
				context.addMessage("form1:txtNumrIdentidad", message);
				return null;
			}
					
		}
		
		if (!tipoDocumento.equals("0001")&& txtNumrIdentidad.getValue().toString().equals("")) {
				FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Debe de ingresar el número de documento","");
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
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Dato obligatorio: "
					+ (materno ? " Apellido Materno " : " ") + (paterno ? " o Apellido Paterno " : " "),"");
			context.addMessage("form1:txtApellidoPaterno", message);
			return null;
		}

		
		solicitud.setIdTipoDocumentoAutorizacion(Integer.parseInt(tipoDocumentoAut));

		String completo = personaBean.getNombres().replace("-", "");
		String[] nombresR = StringUtil.separarNombresReniec(completo);
		
		solicitud.setAPLL_PATER_SOLIC(personaBean.getApellidoPaterno());
		solicitud.setAPLL_MATER_SOLIC(personaBean.getApellidoMaterno());
		solicitud.setNOM1_SOLIC(nombresR[0]);
		solicitud.setNOM2_SOLIC(nombresR.length > 1 && nombresR[1] != null ? nombresR[1] : "");
		solicitud.setNOM3_SOLIC(nombresR.length > 2 && nombresR[2] != null ? nombresR[2] : "");

		if(this.usuarioSesion.getCOD_PERFIL().equals(Perfil.ADMINISTRADOR_ID)){
			error("Usted no puede Grabar porque necesita pertenecer a un Juzgado, " +
					"este es un dato indispensable para este tipo de Solicitud de Certificado de Antecedentes Penales");
			return null;

		}
		
		if(getSessionBean1().getMotivos().getList().size()>0){
			MotivoSolicitudCertificado motivo = (MotivoSolicitudCertificado) getSessionBean1().getMotivos().getList().get(0);
			solicitud.setMOTI_SOLIC(motivo.getCodigo_del_motivo());
			solicitud.setTIPO_SOLIC(motivo.getCodigo_tipo_de_solicitud());
		}
		
		solicitud.setAPLL_PATER_SOLIC((solicitud.getAPLL_PATER_SOLIC()==null?null:solicitud.getAPLL_PATER_SOLIC().trim().toUpperCase()));
		solicitud.setAPLL_MATER_SOLIC((solicitud.getAPLL_MATER_SOLIC()==null?null:solicitud.getAPLL_MATER_SOLIC().trim().toUpperCase()));
		solicitud.setNOM1_SOLIC(solicitud.getNOM1_SOLIC().toUpperCase());
		solicitud.setNOM2_SOLIC((solicitud.getNOM2_SOLIC()==null?null:solicitud.getNOM2_SOLIC().toUpperCase().trim()));
		solicitud.setNOM3_SOLIC((solicitud.getNOM3_SOLIC()==null?null:solicitud.getNOM3_SOLIC().toUpperCase().trim()) );
	

		//VALIDAR EL TIPO DE DOCUMENTO
		if(!validarTipoDocumentoAutorizacion(solicitud, context)){
			return null;//No se validó el documento
		}
		
		
		if (solicitud.getAPLL_PATER_SOLIC()==null || solicitud.getAPLL_PATER_SOLIC().trim().equals("")) {
			solicitud.setAPLL_PATER_SOLIC("***");
		}
		if (solicitud.getAPLL_MATER_SOLIC()==null || solicitud.getAPLL_MATER_SOLIC().trim().equals("")) {
			solicitud.setAPLL_MATER_SOLIC("***");
		}
		
		if (!solicitud.getFLAG_MANT().equals("MOD")) {
			solicitud.setNUME_JUZGA(this.usuarioSesion.getNUME_JUZGA());
			solicitud.setCODG_JUZGAD(this.usuarioSesion.getCODG_JUZGAD());
			solicitud.setV_DES_OFICIO(solicitud.getNUME_EXPED_SOLIC());
			if(Perfil.MPFN_FISCAL.equals(this.usuarioSesion.getCOD_PERFIL()))
				solicitud.setDESC_JUZGA_SOLIC("MINISTERIO PÚBLICO - FISCALÍA DE LA NACIÓN");
			else
				solicitud.setDESC_JUZGA_SOLIC(getSessionBean1().getJuzgadoUser() + " de " + getSessionBean1().getDepartamentoUser());
		}
		solicitud.setNOMB_JUZGA_SOLIC(this.usuarioSesion.getNOMB_USUAR()+ "  " + this.usuarioSesion.getAPLL_USUAR());

		if (solicitud.getNUME_IDENT_SOLIC() != null) {
			solicitud.setNUME_IDENT_SOLIC(solicitud.getNUME_IDENT_SOLIC()
					.toUpperCase());
		}
		
		
		
		//erodriguezbu se agrega firma autorizada del jefe RNC
		if(getSessionBean1().getFirmaAutorizada() != null)
			solicitud.setCODG_USU_FIRMA(getSessionBean1().getFirmaAutorizada().getCODG_USU_FIRMA());

		java.util.Calendar calendar1 = cal.getInstance();
	    calendar1.setTime(new Date());

	    int annio = calendar1.get(cal.YEAR);
	    int mes = calendar1.get(cal.MONTH)+1;
	    int dia = calendar1.get(cal.DAY_OF_MONTH);
	
		solicitud.setAnio(annio);
		solicitud.setDia(dia);
		solicitud.setMes(mes);
		solicitud.setFlagNacidoExterior(false);
		solicitud.setLugarNacimiento(
				solicitud.getLugarNacimiento()!=null?solicitud.getLugarNacimiento().toUpperCase():null);		
		
		if(this.usuarioSesion!=null)
			solicitud.setCODG_USUAR(usuarioSesion.getCODG_USUAR());	

		try {
			String CODG_CERTI_EXTERNO=validarSolicitud(solicitud);
			if (CODG_CERTI_EXTERNO==null||(CODG_CERTI_EXTERNO!=null && CODG_CERTI_EXTERNO.equals(""))){
				getSessionBean1().getManager().cotejar(getSessionBean1().getEntidadExterna(),solicitud, this.usuarioSesion, true);//Cotejar al inicio
				//getSessionBean1().getManager().enviarSolicitudInterna(usuario,solicitud);
				getSessionBean1().getManager().insertSolicitudCompletaInterna(solicitud,this.usuarioSesion);
				navigateTo = "cancelar";

				String mensaje = solicitud.getRptaValidacion()!=null?
						"Solicitud Enviada al Registro Nacional de Condenas con éxito. "+ solicitud.getRptaValidacion():
							"Solicitud Enviada al Registro Nacional de Condenas con éxito.";

				warn(mensaje);
				getSessionBean1().setSolicitudUnitaria(new Solicitud());
				mensajeValidaExistenciaSolicitud="";
			}else{
				mensajeValidaExistenciaSolicitud ="Usted ya tiene registrado un Certificado con las mismas características el día de hoy, el número del Certificado es: "+CODG_CERTI_EXTERNO;
			}
			

		} catch (Exception e1) {
			e1.printStackTrace();
			if (e1.getMessage().equalsIgnoreCase("errorDescarte")) {
				error("Ha ocurrido un error al cotejar la información, por favor intente otra vez. De persistir el error comuníquese con el área de help desk del Poder Judicial");
				log("error cotejo: " + e1.getMessage());
				getSessionBean1().setSolicitudUnitaria(new Solicitud());
				return null;
			}			
			error("Ha ocurrido un error, por favor intente nuevamente. De persistir el error comuníquese con el área de help desk del Poder Judicial");
			mensajeValidaExistenciaSolicitud="";
		}

		//getSessionBean1().setSolicitudInterna(null);
		return navigateTo;
	}
	
	
	


	public boolean validarTipoDocumentoAutorizacion(Solicitud solicitud, FacesContext context){
		
		try{

			if(Perfil.MPFN_FISCAL.equals(this.usuarioSesion.getC_PERFIL()) && 
					Constantes.TIPO_DOCU_AUTO_ID_CASO_FISCAL == solicitud.getIdTipoDocumentoAutorizacion().intValue()){
				
				String pattern = "^[0-9]{15,25}$";
				String idExp = "form1:txtNroExpediente";
				
				if(solicitud.getNUME_EXPED_SOLIC().matches(pattern)){
					if(solicitud.getNUME_EXPED_SOLIC().length()<25)						
						solicitud.setNUME_EXPED_SOLIC("0000000000000000000000000"
								.substring(solicitud.getNUME_EXPED_SOLIC().length()) + solicitud.getNUME_EXPED_SOLIC());	
				}
				else{
					context.addMessage(idExp, new FacesMessage(FacesMessage.SEVERITY_ERROR,
							"Formato incorrecto: Debe ingresar 25 dígitos",""));
					
					return false;	
				}
					
				//Validar con el servicio de fiscalía
				RespuestaPartes rp = null;
				ConsultaCaso consCasoPort = ClienteCasoFiscal.getPortCasoFiscal(
						Constantes.WSCASO_ENDPOINT, Constantes.WSCASO_SIGNATURE_USER, Constantes.WSCASO_ENCRYPT_USER);
				
				String apemat = solicitud.getAPLL_MATER_SOLIC()==null?"":solicitud.getAPLL_MATER_SOLIC();
				String nombres = solicitud.getNOM1_SOLIC() + (solicitud.getNOM2_SOLIC()==null?"":" " + solicitud.getNOM2_SOLIC());
				
				rp = consCasoPort.existePartePorIdUnico(this.usuarioSesion.getC_NUMDOCIDT(), solicitud.getNUME_EXPED_SOLIC(),
						solicitud.getNUME_IDENT_SOLIC(), solicitud.getAPLL_PATER_SOLIC(), apemat, nombres);				
				
				if(rp.isEstado()){
					if(Constantes.RPTA_COINCIDE_WS_CASO.equals(rp.getCodigo())){
						solicitud.setDocumentoAutorizacionValidado("1");
						return true;	
					}
					
					if(Constantes.RPTA_NO_COINCIDE_WS_CASO.equals(rp.getCodigo())){
						//context.addMessage(idExp, new FacesMessage(FacesMessage.SEVERITY_ERROR,"No se encontró el caso o la persona no es parte del caso. Por favor verifique",""));
						logger.error("WS_CASO 5200: Caso no encontrado o no coincide - " + solicitud.getNUME_EXPED_SOLIC());
						return true;
					}
					
					//context.addMessage(idExp, new FacesMessage(FacesMessage.SEVERITY_ERROR, rp.getCodigo() + ": Error al validar el número de caso " + solicitud.getNUME_EXPED_SOLIC(),""));
					String codigoError = rp.getCodigo()==null?"":rp.getCodigo().trim();
					logger.error("WS_CASO " + codigoError +": Error al validar el número de caso " + solicitud.getNUME_EXPED_SOLIC());
					//return false;
					solicitud.setDocumentoAutorizacionValidado("0");
					return true;//siempre se está retornando true cuando el número de caso tiene el formato correcto
						
				} else {
					context.addMessage(idExp, new FacesMessage(FacesMessage.SEVERITY_ERROR, "No se pudo validar el caso. El servicio no se encuentra activo en estos momentos",""));
					return false;	
				}
			}
				
		}catch(Exception e){
			//error("Ocurrió un error al validar el Tipo de Documento de Autorización, por favor intente otra vez. De persistir el error comuníquese con el área de Help Desk del PJ");
			error("Problema con el servicio de Caso Fiscal, por favor intente otra vez. De persistir comuníquese con el área de Help Desk del Ministerio Publico.");
			e.printStackTrace();
			logger.error("Error validarTipoDocumentoAutorizacion (Actualmente ws caso fiscal): " , e);
			return false;
		}
		return true;
	}
	
	public String btnIngresarNuevo_action() {
		getSessionBean1().setSolicitudUnitaria(new Solicitud());
		return null;
	}

	public String btnValidarDocumento_action(){
		String nroDocumento = String.valueOf(txtNumrIdentidad.getSubmittedValue());
		String tipoDocumento = String.valueOf(ddTipoDocumento.getSubmittedValue()==null?
				ddTipoDocumento.getValue():ddTipoDocumento.getSubmittedValue());
		HttpServletRequest request = null;
		//Poner variables en sólo lectura
		if (tipoDocumento.equals("0010") && nroDocumento.matches("[0-9]{8}")) {
			try {
					request = (HttpServletRequest) this.getFacesContext().getExternalContext().getRequest();
					//ReniecService wsReniec = new ReniecService();
					DatosReniec beanPersona = getSessionBean1().getReniecService().consultarDatos(nroDocumento, getSessionBean1().getUsuario().getCODG_USUAR());

					String[] nombresR = StringUtil.separarNombresReniec(beanPersona.getNombres());


					txtApellidoPaterno.setSubmittedValue(CommonsUtilities.ofuscarDatos(beanPersona.getApellidoPaterno()));
					txtApellidoPaterno.setValue(beanPersona.getApellidoPaterno());
					
					txtApellidoMaterno.setSubmittedValue(CommonsUtilities.ofuscarDatos(beanPersona.getApellidoMaterno()));
					txtApellidoMaterno.setValue(beanPersona.getApellidoMaterno());
					txtNombre1.setSubmittedValue(CommonsUtilities.ofuscarDatos(nombresR[0]));
					txtNombre1.setValue(nombresR[0]);
					txtNombre2.setSubmittedValue(CommonsUtilities.ofuscarDatos(nombresR.length>1 && nombresR[1]!=null?nombresR[1]:""));
					txtNombre2.setValue(nombresR.length>1 && nombresR[1]!=null?nombresR[1]:"");
					txtNombre3.setSubmittedValue(CommonsUtilities.ofuscarDatos(nombresR.length>2 && nombresR[2]!=null?nombresR[2]:""));
					txtNombre3.setValue(nombresR.length>2 && nombresR[2]!=null?nombresR[2]:"");
					
					
					
					
					request.getSession().setAttribute("PERSONA_RENIEC_BEAN", beanPersona);
					
				

			} catch (Exception e) {
				//Resetear valores
				txtApellidoPaterno.resetValue();
				txtApellidoMaterno.resetValue();
				txtNombre1.resetValue();
				txtNombre2.resetValue();
				txtNombre3.resetValue();
			
				error("Problema con el servicio de consulta datos del DNI, por favor intente otra vez. De persistir comuníquese con el área de Help Desk del RENIEC.");
				//error("Ocurrió un error al obtener datos del Documento Nacional de Identidad.");
			}
		}

		return null;
	}

	private void seleccionarDepartamento(String disNac, String provNac, String depNac) {
		if(depNac==null || depNac.trim().equals("")){
			if(provNac==null || provNac.trim().equals(""))
				if(disNac==null || disNac.trim().equals(""))
					return;
				else
					depNac = disNac;
			else
				depNac = provNac;
		}

		for(Option dep : getSessionBean1().getDepartamentos()){
			if(depNac.equalsIgnoreCase(dep.getLabel())){
				this.ddLugar.setSubmittedValue(dep.getValue());
			}
		}

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
		//if(s!=null)
			//if(s.trim().length()<1)
				//throw new ValidatorException(new FacesMessage("Estas enviando "+s.length()+"  caracteres en blanco"));
		String tipoDocumento = String.valueOf(ddTipoDocumento.getSubmittedValue() == null ? ddTipoDocumento.getValue()
				: ddTipoDocumento.getSubmittedValue());
		if(s.length()>0)
			if (!s.matches("[A-Za-zãÃñÑäëïöüÿÄËÏÖÜáéíóúÁÉÍÓÚÀÈÌÒÙàèìòù.']+[A-Za-zãÃñÑäëïöüÿÄËÏÖÜáéíóúÁÉÍÓÚÀÈÌÒÙàèìòù.'\\-\\s]*[A-Za-zãÃñÑäëïöüÿÄËÏÖÜáéíóúÁÉÍÓÚÀÈÌÒÙàèìòù.']*")
					&& !s.matches("[\\*]{3}") && !tipoDocumento.equals("0010")) {
				throw new ValidatorException(
					new FacesMessage(FacesMessage.SEVERITY_ERROR,"Sólo se permite caracteres de A a la Z, " +
							"sin espacios en blanco al inicio o al final",""));
			}

	}

	public void padres_validate(FacesContext context, UIComponent component,
			Object value) {
		String s = String.valueOf(value);
		String tipoDocumento = String.valueOf(ddTipoDocumento.getSubmittedValue() == null ? ddTipoDocumento.getValue()
				: ddTipoDocumento.getSubmittedValue());
		if ("".equals(s)) {
			throw new ValidatorException(new FacesMessage("El campo "
					+ component.getId() + " es requerido"));
		} else {
			if (!s.matches("[A-Za-zñÑáéíóúÁÉÍÓÚ]+[A-Za-zñÑáéíóúÁÉÍÓÚ\\-\\s]+[A-Za-zñÑáéíóúÁÉÍÓÚ]+||[\\*]{3}") && !tipoDocumento.equals("0010")) {
				throw new ValidatorException(
						new FacesMessage(FacesMessage.SEVERITY_ERROR, "El campo " + String.valueOf(component.getAttributes().get("alt"))
										+ " solo permite caracteres de la A a la Z, sin espacios en blanco al inicio o al final",""));
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


	public void txtObservacion_validate(FacesContext context, UIComponent component, Object value) {
		String s = String.valueOf(value);
		s = Texto.corregir(s);
		if (Texto.contieneAlgo(s))
			if (255 < s.length())
				throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR,
						"Este campo solo permite caracteres 255 de la A a la Z",""));
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
				throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR,"Número incorrecto en campo "
						+ String.valueOf(component.getAttributes().get("alt")),""));
			}

			//Mostrar foto del DNI
			String nroDocumento = String.valueOf(txtNumrIdentidad.getSubmittedValue());
			String tipoDocumento = String.valueOf(ddTipoDocumento.getSubmittedValue()==null?
					ddTipoDocumento.getValue():ddTipoDocumento.getSubmittedValue());

		}
	}

	public void ddTipoDocumento_validate(FacesContext context,UIComponent component, Object value) {
		if (value != null && ((String) value).equals("-1")) {
			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR,"Seleccione tipo de Doc. Identidad",""));
		}
	}
	
/*	public void txtDelito_validate(FacesContext context,UIComponent component, Object value) {
		String tipoDocumentoAut = String.valueOf(ddTipoDocumentoAut.getSubmittedValue()==null?ddTipoDocumentoAut.getValue():ddTipoDocumentoAut.getSubmittedValue());
		
		if (this.usuarioSesion.getC_PERFIL().equals(Perfil.MPFN_FISCAL) 
				&& tipoDocumentoAut.equals(String.valueOf(Constantes.TIPO_DOCU_AUTO_ID_OTROS))){
			if(((String) value).trim().length()<30)
				throw new ValidatorException(
						new FacesMessage(FacesMessage.SEVERITY_ERROR,"Si selecciona otro documento debe detallar el motivo (mín. 30, máx 200 caracteres) ",""));
		}
	}*/
	
	
	
	public void ddTipoDocumentoAut_validate(FacesContext context,UIComponent component, Object value) {
		if (value != null && ((String) value).equals("-1")) {
			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR,"Seleccione el tipo de documento de autorización",""));
		}
	}

	public void ddLugar_validate(FacesContext context,UIComponent component, Object value) {
		if (value != null && ((String) value).equals("-1")) {
			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR,"Seleccione Lugar de Nacimiento",""));
		}
	}
	
	
	public String validarSolicitud(Solicitud solicitud ){
		String sol=null;
		try {
			 sol=getSessionBean1().getManager().buscarSolicitudPorNombreUsuarioFechaSolicitudInterna(solicitud);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return sol;
		
		
	}
	



public boolean validarTramiteReturnNull(Solicitud solicitud){
	
	
	
	boolean returnNull=false;

	if (!this.usuarioSesion.getC_PERFIL().equals(Perfil.MPFN_FISCAL)){
		
		
		if (solicitud.getNUME_EXPED_SOLIC()==null||solicitud.getNUME_EXPED_SOLIC().trim().length()==0){
			
			FacesContext context= FacesContext.getCurrentInstance();
			FacesMessage message= new FacesMessage("Se requiere ingresar el número de expediente");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			context.addMessage("form1:txtNroExpediente", message);
			returnNull=true;
		}
		if (solicitud.getDES_DELITO()==null || (solicitud.getDES_DELITO()!=null &&solicitud.getDES_DELITO().trim().length()==0)){
			FacesContext context= FacesContext.getCurrentInstance();
			FacesMessage message= new FacesMessage("Se requiere ingresar la descripción del delito y el(los) artículo(s)");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			context.addMessage("form1:txtDelito", message);
			returnNull=true;
		}
		if (solicitud.getDES_DELITO()!=null && solicitud.getDES_DELITO().trim().length()>0 && (solicitud.getDES_DELITO().trim().length()<30 ||solicitud.getDES_DELITO().trim().length()>200)){
			FacesContext context= FacesContext.getCurrentInstance();
			FacesMessage message= new FacesMessage("Debe detallar la descripción (mín. 30, máx 200 caracteres)");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			context.addMessage("form1:txtDelito", message);
			returnNull=true;
		}
		
	
	}
	
	if (this.usuarioSesion.getC_PERFIL().equals(Perfil.MPFN_FISCAL)){
		
		if (String.valueOf(ddTipoDocumentoAut.getValue()).trim().equals(Constantes.TIPO_DOCU_AUTO_ID_CASO_FISCAL.toString())){
			
			if (solicitud.getNUME_EXPED_SOLIC()==null||solicitud.getNUME_EXPED_SOLIC().trim().length()==0){
				
				FacesContext context= FacesContext.getCurrentInstance();
				FacesMessage message= new FacesMessage("Se requiere ingresar el número del caso fiscal");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				context.addMessage("form1:txtNroExpediente", message);
				returnNull=true;
			}
			if (solicitud.getDES_DELITO()==null || (solicitud.getDES_DELITO()!=null &&solicitud.getDES_DELITO().trim().length()==0)){
				FacesContext context= FacesContext.getCurrentInstance();
				FacesMessage message= new FacesMessage("Debe de ingresar la descripción del caso fiscal");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				context.addMessage("form1:txtDelito", message);
				returnNull=true;
			}
			if (solicitud.getDES_DELITO()!=null && solicitud.getDES_DELITO().trim().length()>0 && (solicitud.getDES_DELITO().trim().length()<30 ||solicitud.getDES_DELITO().trim().length()>200)){
				FacesContext context= FacesContext.getCurrentInstance();
				FacesMessage message= new FacesMessage("Debe detallar la descripción (mín. 30, máx 200 caracteres)");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				context.addMessage("form1:txtDelito", message);
				returnNull=true;
			}
		}else{
			if (solicitud.getNUME_EXPED_SOLIC()==null||solicitud.getNUME_EXPED_SOLIC().trim().length()==0){
				
				FacesContext context= FacesContext.getCurrentInstance();
				FacesMessage message= new FacesMessage("Se requiere ingresar el número del documento de autorización");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				context.addMessage("form1:txtNroExpediente", message);
				returnNull=true;
			}
			if (solicitud.getDES_DELITO()==null || (solicitud.getDES_DELITO()!=null &&solicitud.getDES_DELITO().trim().length()==0)){
				FacesContext context= FacesContext.getCurrentInstance();
				FacesMessage message= new FacesMessage("Debe de ingresar la descripción del documento de autorización");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				context.addMessage("form1:txtDelito", message);
				returnNull=true;
			}
			if (solicitud.getDES_DELITO()!=null && solicitud.getDES_DELITO().trim().length()>0 && (solicitud.getDES_DELITO().trim().length()<30 ||solicitud.getDES_DELITO().trim().length()>200)){
				FacesContext context= FacesContext.getCurrentInstance();
				FacesMessage message= new FacesMessage("Debe detallar la descripción (mín. 30, máx 200 caracteres)");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				context.addMessage("form1:txtDelito", message);
				returnNull=true;
			}
		}	

	}	
		
		return returnNull;
	
}
	
	public void nacidoEnExtranjero(ValueChangeEvent event) {
		if (event.getNewValue() != null) {
			if (event.getNewValue().equals(true)) {
				HttpServletRequest request = (HttpServletRequest) this.getFacesContext().getExternalContext().getRequest();
				DatosReniec bean = (DatosReniec) request.getSession().getAttribute("PERSONA_RENIEC_BEAN");
				if (bean != null)
				txtLugarNacimiento.setSubmittedValue(bean.getDepartamentoNac());
			}
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

	public String getLblDelito() {
		return lblDelito;
	}

	public void setLblDelito(String lblDelito) {
		this.lblDelito = lblDelito;
	}

	public String getLblNroExpediente() {
		return lblNroExpediente;
	}

	public void setLblNroExpediente(String lblNroExpediente) {
		this.lblNroExpediente = lblNroExpediente;
	}

	public Button getBtnValidarDocumento() {
		return btnValidarDocumento;
	}

	public void setBtnValidarDocumento(Button btnValidarDocumento) {
		this.btnValidarDocumento = btnValidarDocumento;
	}

	public String getOnloadFunction() {
		return onloadFunction;
	}

	public void setOnloadFunction(String onloadFunction) {
		this.onloadFunction = onloadFunction;
	}

	public boolean isRenderPhoto() {
		return renderPhoto;
	}

	public void setRenderPhoto(boolean renderPhoto) {
		this.renderPhoto = renderPhoto;
	}

	public HtmlSelectOneMenu getDdTipoDocumentoAut() {
		return ddTipoDocumentoAut;
	}

	public void setDdTipoDocumentoAut(HtmlSelectOneMenu ddTipoDocumentoAut) {
		this.ddTipoDocumentoAut = ddTipoDocumentoAut;
	}

	public UISelectItems getDropdown1SelectAutItems() {
		return dropdown1SelectAutItems;
	}

	public void setDropdown1SelectAutItems(UISelectItems dropdown1SelectAutItems) {
		this.dropdown1SelectAutItems = dropdown1SelectAutItems;
	}

	public List<SelectItem> getTiposDocumentoAut() {
		return tiposDocumentoAut;
	}

	public String getIdTipoDocumentoAutorizacion() {
		return idTipoDocumentoAutorizacion;
	}

	public void setIdTipoDocumentoAutorizacion(String idTipoDocumentoAutorizacion) {
		this.idTipoDocumentoAutorizacion = idTipoDocumentoAutorizacion;
	}

	public Usuario getUsuarioSesion() {
		return usuarioSesion;
	}

	public void setUsuarioSesion(Usuario usuarioSesion) {
		this.usuarioSesion = usuarioSesion;
	}

	public String getMensajeValidaExistenciaSolicitud() {
		return mensajeValidaExistenciaSolicitud;
	}

	public void setMensajeValidaExistenciaSolicitud(String mensajeValidaExistenciaSolicitud) {
		this.mensajeValidaExistenciaSolicitud = mensajeValidaExistenciaSolicitud;
	}

	public HtmlSelectBooleanCheckbox getCheckNacidoEnExtrajero() {
		return checkNacidoEnExtrajero;
	}

	public void setCheckNacidoEnExtrajero(HtmlSelectBooleanCheckbox checkNacidoEnExtrajero) {
		this.checkNacidoEnExtrajero = checkNacidoEnExtrajero;
	}

	public HtmlInputText getTxtLugarNacimiento() {
		return txtLugarNacimiento;
	}

	public void setTxtLugarNacimiento(HtmlInputText txtLugarNacimiento) {
		this.txtLugarNacimiento = txtLugarNacimiento;
	}
	
	public boolean isVerTxtLugarNacimiento() {
		Object value = checkNacidoEnExtrajero.getValue() != null? 
				checkNacidoEnExtrajero.getValue() : checkNacidoEnExtrajero.getSubmittedValue();
		if (value != null)
			return (boolean) value;
		else
			return false;
	}

	public HtmlMessage getInlineMessage15() {
		return inlineMessage15;
	}

	public void setInlineMessage15(HtmlMessage inlineMessage15) {
		this.inlineMessage15 = inlineMessage15;
	}
}
