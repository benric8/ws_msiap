package uif;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
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

import pe.gob.pj.client.minedu.wscandadopj.client.Retorno;
import pe.gob.pj.rnc.log.MyLogger;
import pe.gob.pj.rnc.model.DatosReniec;
import pe.gob.pj.rnc.model.Perfil;
import pe.gob.pj.rnc.model.Solicitud;
import pe.gob.pj.rnc.model.TipoDocumentoAutorizacion;
import pe.gob.pj.rnc.model.TipoDocumentoIdentidad;
import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.rnc.msiap.util.Constantes;
import pe.gob.pj.rnc.msiap.util.StringUtil;
import pe.gob.pj.rnc.service.TipoDocumentoIdentidadManager;
import pe.gob.pj.rnc.tipo.Texto;
import pe.gob.pj.rnc.web.service.MineduService;
import pe.gob.pj.rnc.web.service.SuneduService;
import pe.gob.pj.ws.client.sunedu.Codigo;

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
public class ingSolicitudSimple extends AbstractPageBean {

	static MyLogger logger = new MyLogger(ingSolicitudSimple.class.getName());

	private HtmlSelectOneMenu ddMotivo = new HtmlSelectOneMenu();
	private String lblTipoTramite = "Tipo: ";
	private String lblNroTramite = "Número: ";
	private String lblDescripcionMotivo = "Descripción motivo: ";
	private String idTipoDocumentoAutorizacion;
	private UISelectItems dropdown1SelectAutItems = new UISelectItems();
	private List<SelectItem> tiposDocumentoAut;
	private boolean datosTramiteObligatorio = false;
	private boolean datosTramiteObligatorioDesc = false;
	private String mensajeValidaExistenciaSolicitud;
	private String modificar;
	private boolean disableOtroTramite;
	private HtmlSelectBooleanCheckbox checkNacidoEnExtrajero = new HtmlSelectBooleanCheckbox();
	private HtmlInputText txtLugarNacimiento = new HtmlInputText();
	MineduService mineduService = null;
	SuneduService suneduService = null;
	Usuario usuarioSesion = getSessionBean1().getUsuario();
	
	public HtmlSelectOneMenu getDdMotivo() {
		return ddMotivo;
	}

	public void setDdMotivo(HtmlSelectOneMenu hsom) {
		this.ddMotivo = hsom;
	}

	private UISelectItems dropdown10SelectItems = new UISelectItems();

	public UISelectItems getDropdown10SelectItems() {
		return dropdown10SelectItems;
	}

	public void setDropdown10SelectItems(UISelectItems uisi) {
		this.dropdown10SelectItems = uisi;
	}

	private HtmlOutputText outputText20 = new HtmlOutputText();

	public HtmlOutputText getOutputText20() {
		return outputText20;
	}

	public void setOutputText20(HtmlOutputText hot) {
		this.outputText20 = hot;
	}
	// <editor-fold defaultstate="collapsed" desc="Managed Component
	// Definition">
	// private int __placeholder;

	/**
	 * <p>
	 * Automatically managed component initialization. <strong>WARNING:</strong>
	 * This method is automatically generated, so any user-specified code inserted
	 * here is subject to being replaced.
	 * </p>
	 */
	private void _init() throws Exception {
		dateTimeConverter1.setTimeZone(java.util.TimeZone.getTimeZone("America/Lima"));
		dateTimeConverter1.setLocale(new java.util.Locale("es", "PE"));
		dateTimeConverter1.setPattern("dd/mm/yyyy");
		btnValidarDocumento.setVisible(false);
		ddTipoDocumento.setSubmittedValue(TipoDocumentoIdentidad.COD_TIPO_DOCUMENTO_DNI);
		// Inicialiser servicio MINEDU
		if(pe.gob.pj.util.Constantes.ENTIDAD_MINEDU_CODIGO_DJ.equals(usuarioSesion.getCODG_DISTRITO_JUDICIAL())) {
			this.mineduService = new MineduService();
		}
		if(pe.gob.pj.util.Constantes.ENTIDAD_SUNEDU_CODIGO_DJ.equals(usuarioSesion.getCODG_DISTRITO_JUDICIAL())) {
			this.suneduService = new SuneduService();
		}
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

	private Button btnValidarDocumento = new Button();

	public Button getBtnValidarDocumento() {
		return btnValidarDocumento;
	}

	public void setBtnValidarDocumento(Button btnValidarDocumento) {
		this.btnValidarDocumento = btnValidarDocumento;
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

	private StaticText staticText1 = new StaticText();

	public StaticText getStaticText1() {
		return staticText1;
	}

	public void setStaticText1(StaticText st) {
		this.staticText1 = st;
	}

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
	public ingSolicitudSimple() {
		/*
		 * Usuario usuario = getSessionBean1().getUsuario();
		 * 
		 * if(!usuario.getCODG_DISTRITO_JUDICIAL().equals("32")){
		 * textoDescripcionMotivo="(*) Descripción motivo:";
		 * textoNroTramite="(*) Nro de trámite:"; } else{
		 * textoDescripcionMotivo="Descripción motivo:";
		 * textoNroTramite="Nro de trámite:"; }
		 */
	}

	/**
	 * <p>
	 * Callback method that is called whenever a page is navigated to, either
	 * directly via a URL, or indirectly via page navigation. Customize this method
	 * to acquire resources that will be needed for event handlers and lifecycle
	 * methods, whether or not this page is performing post back processing.
	 * </p>
	 *
	 * <p>
	 * Note that, if the current request is a postback, the property values of the
	 * components do <strong>not</strong> represent any values submitted with this
	 * request. Instead, they represent the property values that were saved for this
	 * view when it was rendered.
	 * </p>
	 */
	public void init() {
		// Perform initializations inherited from our superclass
		super.init();
		setMaxDate(cal.getTime());
		cal.add(java.util.Calendar.YEAR, -120);
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
			log("ingSolicitudSimple Initialization Failure", e);
			throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
		}
		calFechNacimiento.setMaxDate(getMaxDate());
		calFechNacimiento.setMinDate(getMinDate());
		// </editor-fold>
		// Perform application initialization that must complete
		// *after* managed components are initialized

		
		tiposDeDocumentoDeAutorizacion();

//		HttpServletRequest request = (HttpServletRequest) this.getFacesContext().getExternalContext().getRequest();
//		if(request.getSession().getAttribute("PERSONA_RENIEC_BEAN")!=null)
//			request.getSession().removeAttribute("PERSONA_RENIEC_BEAN");
	}

	private void tiposDeDocumentoDeAutorizacion() {
		this.tiposDocumentoAut = new ArrayList<SelectItem>();
		List<TipoDocumentoAutorizacion> listaDocsSession = this.getSessionBean1().getLstTipoDocumentoAutorizacion();

		if (listaDocsSession == null || listaDocsSession.size() < 1) {
			TipoDocumentoIdentidadManager servicioTipoDoc = new TipoDocumentoIdentidadManager();
			listaDocsSession = servicioTipoDoc.getTiposDocumentoAutorizacion();
			this.getSessionBean1().setLstTipoDocumentoAutorizacion(listaDocsSession);
		}
		
		Set<Integer> TIPOS_DOC_AUT = new HashSet<>();
		if(pe.gob.pj.util.Constantes.ENTIDAD_MINEDU_CODIGO_DJ.equals(usuarioSesion.getCODG_DISTRITO_JUDICIAL()))
			TIPOS_DOC_AUT = Constantes.TIPOS_DOCUMENTOS_MINEDU;
		else if(pe.gob.pj.util.Constantes.ENTIDAD_SUNEDU_CODIGO_DJ.equals(usuarioSesion.getCODG_DISTRITO_JUDICIAL()))
			TIPOS_DOC_AUT = Constantes.TIPOS_DOCUMENTOS_SUNEDU;
		else 
			TIPOS_DOC_AUT = Constantes.TIPOS_DOCUMENTOS_EXTERNOS;
		 
		

		for (TipoDocumentoAutorizacion tda : listaDocsSession) {
			if (TIPOS_DOC_AUT.contains(tda.getIdTipoDocumentoAutorizacion())) {
				SelectItem s = new SelectItem();
				s.setLabel(tda.getNombre());
				s.setValue(String.valueOf(tda.getIdTipoDocumentoAutorizacion()));

				this.tiposDocumentoAut.add(s);
			}
		}
	}
	/**
	 * <p>
	 * Callback method that is called after the component tree has been restored,
	 * but before any event processing takes place. This method will
	 * <strong>only</strong> be called on a postback request that is processing a
	 * form submit. Customize this method to allocate resources that will be
	 * required in your event handlers.
	 * </p>
	 */
	public void preprocess() {
	}

	/**
	 * <p>
	 * Callback method that is called just before rendering takes place. This method
	 * will <strong>only</strong> be called for the page that will actually be
	 * rendered (and not, for example, on a page that handled a postback and then
	 * navigated to a different page). Customize this method to allocate resources
	 * that will be required for rendering this page.
	 * </p>
	 */
	public void prerender() {
	}

	/**
	 * <p>
	 * Callback method that is called after rendering is completed for this request,
	 * if <code>init()</code> was called (regardless of whether or not this was the
	 * page that was actually rendered). Customize this method to release resources
	 * acquired in the <code>init()</code>, <code>preprocess()</code>, or
	 * <code>prerender()</code> methods (or acquired during execution of an event
	 * handler).
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
		return "case4";
	}

	public String btnValidarDocumento() {
		String nroDocumento = String.valueOf(txtNumrIdentidad.getSubmittedValue());
		String tipoDocumento = String.valueOf(ddTipoDocumento.getSubmittedValue() == null ? ddTipoDocumento.getValue()
				: ddTipoDocumento.getSubmittedValue());
		HttpServletRequest request = (HttpServletRequest) this.getFacesContext().getExternalContext().getRequest();
		// Poner variables en sólo lectura
		if (tipoDocumento.equals("0010") && nroDocumento.matches("[0-9]{8}")) {
			try {
				//ReniecService wsReniec = new ReniecService();
				
				DatosReniec beanPersona = getSessionBean1().getReniecService().consultarDatos(nroDocumento, getSessionBean1().getUsuario().getCODG_USUAR());//@nmnm
				String completo = beanPersona.getNombres().replace("-", "");
				String[] nombresR = StringUtil.separarNombresReniec(completo);

				txtApellidoPaterno.setSubmittedValue(beanPersona.getApellidoPaterno());
				StringBuffer reniecSegundoApellido = new StringBuffer();
				reniecSegundoApellido.append(beanPersona.getApellidoMaterno().toUpperCase()).append(" ")
						.append(beanPersona.getApellidoCasada().toUpperCase().trim());
				txtApellidoMaterno.setSubmittedValue(reniecSegundoApellido.toString().trim());
				txtNombre1.setSubmittedValue(nombresR[0]);
				txtNombre2.setSubmittedValue(nombresR.length > 1 && nombresR[1] != null ? nombresR[1] : "");
				txtNombre3.setSubmittedValue(nombresR.length > 2 && nombresR[2] != null ? nombresR[2] : "");
				txtNomPadre.setSubmittedValue(beanPersona.getNombrePadre().equalsIgnoreCase("NO DECLARA")
						|| beanPersona.getNombrePadre().equalsIgnoreCase("NO DECLARADO") ? "" : beanPersona.getNombrePadre());
				txtNomMadre.setSubmittedValue(beanPersona.getNombreMadre());
				if("00".equals(beanPersona.getCodDistritoNac()) && "00".equals(beanPersona.getCodProvinciaNac())){
					txtLugarNacimiento.setSubmittedValue(beanPersona.getDepartamentoNac());
				}				

				try {
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					calFechNacimiento.setSubmittedValue(sdf.format(beanPersona.getFechaNacimiento()));
				} catch (Exception e) {
					logger.error("Error al obtener fecha de nacimiento.", e);
				}
				request.getSession().setAttribute("PERSONA_RENIEC_BEAN", beanPersona);
				this.renderPhoto = true;
				seleccionarDepartamento(beanPersona.getDistritoNac(), beanPersona.getProvinciaNac(), beanPersona.getDepartamentoNac());

			} catch (Exception e) {
				// Resetear valores
				txtApellidoPaterno.resetValue();
				txtApellidoMaterno.resetValue();
				txtNombre1.resetValue();
				txtNombre2.resetValue();
				txtNombre3.resetValue();
				txtNomPadre.resetValue();
				txtNomMadre.resetValue();
				this.renderPhoto = false;
				txtLugarNacimiento.resetValue();
				error("Problema con el servicio de consulta datos del DNI, por favor intente otra vez. De persistir comuníquese con el área de Help Desk del RENIEC.");
				//info("Ocurrió un error al obtener datos del Documento Nacional de Identidad.");
			}
		} else {			
			if (request.getSession().getAttribute("PERSONA_RENIEC_BEAN")!=null)
				request.getSession().removeAttribute("PERSONA_RENIEC_BEAN");
		}

		return null;
	}

	private void seleccionarDepartamento(String disNac, String provNac, String depNac) {
		if (depNac == null || depNac.trim().equals("")) {
			if (provNac == null || provNac.trim().equals(""))
				if (disNac == null || disNac.trim().equals(""))
					return;
				else
					depNac = disNac;
			else
				depNac = provNac;
		}

		for (Option dep : getSessionBean1().getDepartamentos()) {
			if (depNac.equalsIgnoreCase(dep.getLabel())) {
				this.ddLugar.setSubmittedValue(dep.getValue());
			}
		}

	}
	
	public void nacidoEnExtranjero(ValueChangeEvent event) {
		if (event.getNewValue() != null) {
			if (event.getNewValue().equals(true)) {
				HttpServletRequest request = (HttpServletRequest) this.getFacesContext().getExternalContext().getRequest();
				DatosReniec bean = (DatosReniec) request.getSession().getAttribute("PERSONA_RENIEC_BEAN");
				if (bean != null)
				txtLugarNacimiento.setSubmittedValue(bean.getDepartamentoNac());
				//this.ddLugar.setDisabled(true);
			} else {
				//this.ddLugar.setDisabled(false);
			}
			
			//mandField.setSubmittedValue(evt.getNewValue().toString());
			//FacesContext.getCurrentInstance().renderResponse();
		}
	}

	public String btnGrabar_action() {

		try {
			FacesContext context = FacesContext.getCurrentInstance();
			//Usuario usuario = getSessionBean1().getUsuario();
			String tipoDocumentoAut = String.valueOf(ddTipoDocumentoAut.getValue());

			Solicitud solicitud = getSessionBean1().getSolicitudUnitaria();
			String tipoDocumento = String.valueOf(ddTipoDocumento.getValue());
			String nroDocumento = String.valueOf(txtNumrIdentidad.getValue());

			if (validarTramiteReturnNull(solicitud, usuarioSesion.getCODG_DISTRITO_JUDICIAL())) {
				return null;
			}

			if (tipoDocumento.equals("0010")) {
				if (!nroDocumento.matches("[0-9]{8}")) {
					FacesMessage message = new FacesMessage("El número de D.N.I. debe ser numérico y de 8 dígitos");
					message.setSeverity(FacesMessage.SEVERITY_ERROR);
					context.addMessage("form1:txtNumrIdentidad", message);
					return null;
				}
				
				//Validar si es ciudadano extranjero
				if((boolean) checkNacidoEnExtrajero.getValue()) {
					HttpServletRequest request = (HttpServletRequest) this.getFacesContext().getExternalContext().getRequest();
					if(request.getSession().getAttribute("PERSONA_RENIEC_BEAN") != null) {
						DatosReniec persona = (DatosReniec) request.getSession().getAttribute("PERSONA_RENIEC_BEAN");
						if(nroDocumento.equals(persona.getDni())){
							if(!("00".equals(persona.getCodDistritoNac()) && "00".equals(persona.getCodProvinciaNac()))) {
								FacesMessage message = new FacesMessage("Revise los datos del lugar de nacimiento. ");
								message.setSeverity(FacesMessage.SEVERITY_ERROR);
								context.addMessage("form1:txtLugarNacimiento", message);
								return null;
							}
						}
					}
					
				}
				
			}

			boolean paterno = false;
			boolean materno = false;
			int nroIncidencia = 0;

			if (txtApellidoMaterno.getValue() == null
					|| String.valueOf(txtApellidoMaterno.getValue()).trim().equals("")) {
				nroIncidencia++;
				materno = true;

			}
			if (txtApellidoPaterno.getValue() == null
					|| String.valueOf(txtApellidoPaterno.getValue()).trim().equals("")) {
				nroIncidencia++;
				paterno = true;
			}

			if (nroIncidencia > 1) {
				FacesMessage message = new FacesMessage("Dato obligatorio: " + (materno ? " Apellido Materno " : " ")
						+ (paterno ? " o Apellido Paterno " : " "));
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				context.addMessage("form1:txtApellidoPaterno", message);
				return null;
			}

			int i;
			if (getSessionBean1().getSolicitudes().size() > 50) {
				info("No se pueden agregar mas de 50 registros, si necesita mas registros genere otra solicitud");
				return null;
			}

			if (solicitud.getNUME_IDENT_SOLIC() != null) {
				solicitud.setNUME_IDENT_SOLIC(solicitud.getNUME_IDENT_SOLIC().toUpperCase());
			}
			
			//Validar autorización de la consulta
			if(!validarAutorizacionDeLaConsulta(solicitud)) return null;
			
			java.util.Calendar calendar1 = cal.getInstance();
			calendar1.setTime(new Date());
			System.out.println(calendar1.getTime());

			int annio = calendar1.get(cal.YEAR);
			int mes = calendar1.get(cal.MONTH) + 1;
			int dia = calendar1.get(cal.DAY_OF_MONTH);

			solicitud.setAnio(annio);
			solicitud.setDia(dia);
			solicitud.setMes(mes);

			if (usuarioSesion != null) {
				solicitud.setCODG_USUAR(usuarioSesion.getCODG_USUAR());
			}

			if ((!validarSolicitud(solicitud) && validarSolicitudExterna(solicitud) == null)
					|| (!validarSolicitud(solicitud) && (validarSolicitudExterna(solicitud) != null
							&& validarSolicitudExterna(solicitud).equals("")))
					|| (getSessionBean1().getAccion() != null && getSessionBean1().getAccion().equals("M"))) {

				if (usuarioSesion.getCODG_DISTRITO_JUDICIAL().equals(Perfil.COD_DISTRITO_JUDICIAL_RREE)
						&& solicitud.getNUME_EXPED_SOLIC().equals("") && solicitud.getDES_DELITO().equals("")) {
					solicitud.setIdTipoDocumentoAutorizacion(null);
					solicitud.setNUME_EXPED_SOLIC(null);
					solicitud.setDES_DELITO(null);
				}

				Integer.parseInt(idTipoDocumentoAutorizacion);
				getSessionBean1().getMotivos().establecerDescripcionDeMotivo(solicitud);
				// Tipo de Solicitud
				getSessionBean1().getMotivos().establecerTipoSolicitud(solicitud);
				//if(pe.gob.pj.util.Constantes.ENTIDAD_MINEDU_CODIGO_DJ.equals(usuario.getCODG_DISTRITO_JUDICIAL()))
				//solicitud.setTIPO_SOLIC(TipoSolicitud.MINEDU);
				
				solicitud.setIdTipoDocumentoAutorizacion(Integer.parseInt(tipoDocumentoAut));

				if (solicitud.getAPLL_PATER_SOLIC() == null || solicitud.getAPLL_PATER_SOLIC().trim().equals("")) {
					solicitud.setAPLL_PATER_SOLIC("***");
				}
				if (solicitud.getAPLL_MATER_SOLIC() == null || solicitud.getAPLL_MATER_SOLIC().trim().equals("")) {
					solicitud.setAPLL_MATER_SOLIC("***");
				}

				solicitud.setAPLL_PATER_SOLIC((solicitud.getAPLL_PATER_SOLIC() == null ? null
						: solicitud.getAPLL_PATER_SOLIC().trim().toUpperCase()));
				solicitud.setAPLL_MATER_SOLIC((solicitud.getAPLL_MATER_SOLIC() == null ? null
						: solicitud.getAPLL_MATER_SOLIC().trim().toUpperCase()));
				solicitud.setNOM1_SOLIC(solicitud.getNOM1_SOLIC().toUpperCase());
				solicitud.setNOM2_SOLIC(
						(solicitud.getNOM2_SOLIC() == null ? null : solicitud.getNOM2_SOLIC().trim().toUpperCase()));
				solicitud.setNOM3_SOLIC(
						(solicitud.getNOM3_SOLIC() == null ? null : solicitud.getNOM3_SOLIC().trim().toUpperCase()));
				solicitud.setNOM_MADRE(solicitud.getNOM_MADRE().toUpperCase());
				solicitud.setNOM_PADRE(solicitud.getNOM_PADRE().toUpperCase());
				
				if (getSessionBean1().getFirmaAutorizada() != null)
					solicitud.setCODG_USU_FIRMA(getSessionBean1().getFirmaAutorizada().getCODG_USU_FIRMA());
				
				getSessionBean1().getManager().cotejar(getSessionBean1().getEntidadExterna(), solicitud, usuarioSesion, false);// Cotejar al inicio
				if (solicitud.getCODG_CERTI() == null) {
					i = getSessionBean1().getSolicitudes().size() + 1;
					solicitud.setCODG_CERTI(String.valueOf(i));
					solicitud.setCODG_USUAR(usuarioSesion.getCODG_USUAR());
					solicitud.setCODG_USU_REGISTRO(usuarioSesion.getCODG_USUAR());
					solicitud.setINDC_PROVINCIA("N");
					solicitud.setLugarNacimiento(
						solicitud.getLugarNacimiento()!=null?solicitud.getLugarNacimiento().toUpperCase():null);
					
					getSessionBean1().getSolicitudes().add(solicitud);
				} else {
					i = getSessionBean1().getIndexListSolicitudes();
					getSessionBean1().getSolicitudes().set(i, solicitud);
				}
				// provider
				getSessionBean1().getSolicitudesUnitarias().refreshProviderSession(getSessionBean1().getSolicitudes());
				txtApellidoMaterno.setValue("");
				txtApellidoMaterno.setTransient(false);
				getSessionBean1().setSolicitudUnitaria(new Solicitud());
				info("Solicitud grabada exitosamente");
				getSessionBean1().setAccion(null);
				FacesContext.getCurrentInstance().getExternalContext().redirect("ingSolicitudSimple.jsp");
				mensajeValidaExistenciaSolicitud = "";
			} else {
				// info("Usted ya tiene registrada una Solicitud con las mismas caracteristicas
				// el día de hoy.");

				String sol = validarSolicitudExterna(solicitud);
				if (sol == null || (sol != null && sol.equals(""))) {
					mensajeValidaExistenciaSolicitud = "En la lista, ya existe una solicitud con las mismas caracteristicas";
				} else {
					mensajeValidaExistenciaSolicitud = "Usted ya tiene registrada una solicitud el día de hoy para la misma persona , el número de certificado es: "
							+ sol;

				}

				getSessionBean1().setAccion(null);
				return null;
			}

		} catch (Exception e) {
			if (e.getMessage().equalsIgnoreCase("errorDescarte")) {
				error("Ha ocurrido un error al cotejar la información, por favor intente otra vez. De persistir el error comuníquese con el área de help desk del Poder Judicial");
				log("error cotejo: " + e.getMessage());
				getSessionBean1().setAccion(null);
				return null;
			} else {
				info("Ha ocurrido un error, por favor intente nuevamente. De persistir el error comuníquese con el área de help desk del Poder Judicial");
				log("error: " + e.getMessage());
			}
			e.printStackTrace();
		}
		getSessionBean1().setAccion(null);
		return null;
		// return "solicitudSimple";
	}

	private boolean validarAutorizacionDeLaConsulta(Solicitud solicitud) {
		boolean autorizado = true;
		if(pe.gob.pj.util.Constantes.ENTIDAD_MINEDU_CODIGO_DJ.equals(usuarioSesion.getCODG_DISTRITO_JUDICIAL())) {
			try {
				Retorno r = mineduService.consultarDatos(solicitud.getNUME_IDENT_SOLIC(), solicitud.getNUME_EXPED_SOLIC());
				if (r != null) {
					if(Constantes.RPTA_COINCIDE_WS_CASO.equals(r.getCodigo().getValue()) && r.isEstado())
						solicitud.setDocumentoAutorizacionValidado("1");
					else {
						autorizado = false;
						error("La consulta no ha sido autorizada o no existe en la base de datos de MINEDU. COD: " + r.getCodigo().getValue());
					}						
				}
			} catch (Exception e) {
				error("Ocurrió un error al consultar el servicio de validación del MINEDU");
				e.printStackTrace();
				autorizado = false;
			}
		} else if(pe.gob.pj.util.Constantes.ENTIDAD_SUNEDU_CODIGO_DJ.equals(usuarioSesion.getCODG_DISTRITO_JUDICIAL())) {
			try {
				int tipoDoc;
								
				if(TipoDocumentoIdentidad.COD_TIPO_DOCUMENTO_DNI.equals(solicitud.getDOCU_IDENT_SOLIC()))
					tipoDoc = Constantes.TIPO_DOCU_DNI_SUNAT;
				else if(TipoDocumentoIdentidad.COD_TIPO_DOCUMENTO_CE.equals(solicitud.getDOCU_IDENT_SOLIC()))
					tipoDoc = Constantes.TIPO_DOCU_CE_SUNAT;
				else if(TipoDocumentoIdentidad.COD_TIPO_DOCUMENTO_PASAPORTE.equals(solicitud.getDOCU_IDENT_SOLIC()))
					tipoDoc = Constantes.TIPO_DOCU_PASAPORTE_SUNAT;
				else 
					tipoDoc = Integer.valueOf(solicitud.getDOCU_IDENT_SOLIC());
					
				Codigo r = suneduService.consultarDatos(solicitud.getNUME_EXPED_SOLIC(), tipoDoc, solicitud.getNUME_IDENT_SOLIC());
				
				if (r != null) {
					if(Constantes.RPTA_CORRECTO_SUNEDU.equals(r.getESTADO()) && Constantes.RPTA_COINCIDE_SUNEDU.equals(r.getCODIGO()))
						solicitud.setDocumentoAutorizacionValidado("1");
					else {
						autorizado = false;
						error("La consulta no ha sido autorizada o no existe en la base de datos de SUNEDU. COD: " + r.getCODIGO());
					}						
				}
			} catch (Exception e) {
				error("Ocurrió un error al consultar el servicio de validación del SUNEDU");
				e.printStackTrace();
				autorizado = false;
			}
		}
		
		return autorizado;
	}

	public String btnIngresarNuevo_action() {
		getSessionBean1().setSolicitudUnitaria(new Solicitud());
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

	/*
	 * public void txtApellidoPaterno_validate(FacesContext context, UIComponent
	 * component, Object value) { String s = String.valueOf(value); if
	 * (!s.matches("[^áéíóúÁÉÍÓÚ0-9%]{1,29}||[\\*]{3}")) { throw new
	 * ValidatorException(new
	 * FacesMessage("Los campos de nombres y apellidos solo permiten caracteres de la A a la Z, sin espacios en blanco al inicio o al final"
	 * )); }
	 * 
	 * }
	 */

	public void txtApellidoPaterno_validate(FacesContext context, UIComponent component, Object value) {
		String s = String.valueOf(value);
		if (s != null)
			if (s.trim().length() < 1)
				throw new ValidatorException(
						new FacesMessage("Estas enviando " + s.length() + "  caracteres en blanco"));

		if (!s.matches(
				"[A-Za-zãÃñÑäëïöüÿÄËÏÖÜáéíóúÁÉÍÓÚÀÈÌÒÙàèìòù.']+[A-Za-zãÃñÑäëïöüÿÄËÏÖÜáéíóúÁÉÍÓÚÀÈÌÒÙàèìòù.'\\-\\s]*[A-Za-zãÃñÑäëïöüÿÄËÏÖÜáéíóúÁÉÍÓÚÀÈÌÒÙàèìòù.']*")
				&& !s.matches("[\\*]{3}")) {

			throw new ValidatorException(new FacesMessage(
					"Sólo se permite caracteres de A a la Z, " + "sin espacios en blanco al inicio o al final"));
		}

	}

	public void txtNombre_validate(FacesContext context, UIComponent component, Object value) {
		boolean req = ((UIInput) component).isRequired();

		String s = String.valueOf(value);
		if (req && s.trim().length() < 1)
			throw new ValidatorException(new FacesMessage("Este campo es obligatorio"));

		if (!s.equals("") && !s.matches(
				"[A-Za-zãÃñÑäëïöüÿÄËÏÖÜáéíóúÁÉÍÓÚÀÈÌÒÙàèìòù.']+[A-Za-zãÃñÑäëïöüÿÄËÏÖÜáéíóúÁÉÍÓÚÀÈÌÒÙàèìòù.'\\-\\s]*[A-Za-zãÃñÑäëïöüÿÄËÏÖÜáéíóúÁÉÍÓÚÀÈÌÒÙàèìòù.']*")
				&& !s.matches("[\\*]{3}")) {
			throw new ValidatorException(new FacesMessage(
					"Sólo se permite caracteres de A a la Z, " + "sin espacios en blanco al inicio o al final"));
		}

	}

	public void padres_validate(FacesContext context, UIComponent component, Object value) {
		String s = String.valueOf(value);
		if ("".equals(s)) {
			throw new ValidatorException(new FacesMessage("El campo " + component.getId() + " es requerido"));
		} else {
			if (!s.matches("[^áéíóúÁÉÍÓÚ0-9%]{1,29}[^áéíóúÁÉÍÓÚ%]||[\\*]{3}")) {
				throw new ValidatorException(new FacesMessage("El campo "
						+ String.valueOf(component.getAttributes().get("alt"))
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

	@SuppressWarnings("unused")
	private int numRegistros;

	public int getNumRegistros() {
		return getSessionBean1().getSolicitudes().size();
	}

	public void setNumRegistros(int numRegistros) {
		this.numRegistros = numRegistros;
	}

	public void txtObservacion_validate(FacesContext context, UIComponent component, Object value) {
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

	public void txtNumrIdentidad_validate(FacesContext context, UIComponent component, Object value) {
		String s = null;
		if (value != null && !((String) value).equals("")) {
			s = String.valueOf(value);
			if (!s.matches("[a-zA-Z0-9 \\-\\/]{5,14}")) {
				throw new ValidatorException(new FacesMessage(
						"Número incorrecto en campo " + String.valueOf(component.getAttributes().get("alt"))));
			}

			// Mostrar foto del DNI
			String nroDocumento = String.valueOf(txtNumrIdentidad.getSubmittedValue());
			String tipoDocumento = String
					.valueOf(ddTipoDocumento.getSubmittedValue() == null ? ddTipoDocumento.getValue()
							: ddTipoDocumento.getSubmittedValue());

			if (tipoDocumento.equals("0010") && nroDocumento.matches("[0-9]{8}"))
				this.renderPhoto = true;
		}
	}

	public boolean validarSolicitud(Solicitud solicitud) {
		boolean encontro = false;
		try {
			if (getSessionBean1().getSolicitudes() != null && !getSessionBean1().getSolicitudes().isEmpty()) {

				// buscar solicitudes en la lista en memoria

				for (Solicitud sol : getSessionBean1().getSolicitudes()) {

					if (((solicitud.getAPLL_PATER_SOLIC() == null && sol.getAPLL_PATER_SOLIC() == null)
							|| solicitud.getAPLL_PATER_SOLIC().equals(sol.getAPLL_PATER_SOLIC()))
							&& ((solicitud.getAPLL_MATER_SOLIC() == null && sol.getAPLL_MATER_SOLIC() == null)
									|| solicitud.getAPLL_MATER_SOLIC().equals(sol.getAPLL_MATER_SOLIC()))
							&& ((solicitud.getNOM1_SOLIC() == null && sol.getNOM1_SOLIC() == null)
									|| solicitud.getNOM1_SOLIC().equals(sol.getNOM1_SOLIC()))
							&& ((solicitud.getNOM2_SOLIC() == null && sol.getNOM2_SOLIC() == null)
									|| solicitud.getNOM2_SOLIC().equals(sol.getNOM2_SOLIC()))
							&& ((solicitud.getNOM3_SOLIC() == null && sol.getNOM3_SOLIC() == null)
									|| solicitud.getNOM3_SOLIC().equals(sol.getNOM3_SOLIC()))
							&& ((solicitud.getCODG_USUAR() == null && sol.getCODG_USUAR() == null)
									|| solicitud.getCODG_USUAR().equals(sol.getCODG_USUAR()))
							&& ((solicitud.getAnio() == null && sol.getAnio() == null)
									|| solicitud.getAnio().equals(sol.getAnio()))
							&& ((solicitud.getMes() == null && sol.getMes() == null)
									|| solicitud.getMes().equals(sol.getMes()))
							&& ((solicitud.getDia() == null && sol.getDia() == null)
									|| solicitud.getDia().equals(sol.getDia()))) {
						encontro = true;
						break;
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return encontro;

	}

	public String validarSolicitudExterna(Solicitud solicitud) {
		String sol = null;
		try {
			sol = getSessionBean1().getManager().buscarSolicitudPorNombreUsuarioFechaSolicitudExterna(solicitud);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return sol;

	}

	public void chkDatosTramiteObligatorios(ValueChangeEvent e) {
		System.out.println(e.getNewValue().toString());
	}

	public boolean validarTramiteReturnNull(Solicitud solicitud, String distritoJudicial) {

		boolean returnNull = false;
		
		if (distritoJudicial.equals(pe.gob.pj.util.Constantes.ENTIDAD_MINEDU_CODIGO_DJ)) {
			if (solicitud.getNUME_EXPED_SOLIC() == null || solicitud.getNUME_EXPED_SOLIC().trim().length() == 0) {
				FacesContext context = FacesContext.getCurrentInstance();
				FacesMessage message = new FacesMessage("Se requiere ingresar el código de validación");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				context.addMessage("form1:txtNroTramite", message);
				datosTramiteObligatorio = true;
				returnNull = true;
			}
			if (solicitud.getDES_DELITO() == null || solicitud.getDES_DELITO().trim().length() == 0
							|| solicitud.getDES_DELITO().trim().length() > 200) {
				FacesContext context = FacesContext.getCurrentInstance();
				FacesMessage message = new FacesMessage(
						"Debe detallar el motivo de la consulta(máx. 200 caracteres)");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				context.addMessage("form1:txtDescripcionMotivo", message);
				datosTramiteObligatorioDesc = true;
				returnNull = true;
			}

		} else if (!distritoJudicial.equals(Perfil.COD_DISTRITO_JUDICIAL_RREE)) {
			if (solicitud.getNUME_EXPED_SOLIC() == null || solicitud.getNUME_EXPED_SOLIC().trim().length() == 0) {
				FacesContext context = FacesContext.getCurrentInstance();
				FacesMessage message = new FacesMessage("Se requiere ingresar el nro de documento de tramite");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				context.addMessage("form1:txtNroTramite", message);
				datosTramiteObligatorio = true;
				returnNull = true;
			}
			if (solicitud.getDES_DELITO() != null && solicitud.getDES_DELITO().trim().length() > 0
					&& (solicitud.getDES_DELITO().trim().length() < 30
							|| solicitud.getDES_DELITO().trim().length() > 200)) {
				FacesContext context = FacesContext.getCurrentInstance();
				FacesMessage message = new FacesMessage(
						"Si selecciona otro documento debe detallar el motivo (mín. 30, máx 200 caracteres)");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				context.addMessage("form1:txtDescripcionMotivo", message);
				datosTramiteObligatorioDesc = true;
				returnNull = true;
			}

		} else {
			if (solicitud.getDES_DELITO() != null && solicitud.getDES_DELITO().trim().length() > 0
					&& (solicitud.getNUME_EXPED_SOLIC() == null
							|| solicitud.getNUME_EXPED_SOLIC().trim().length() == 0)) {
				FacesContext context = FacesContext.getCurrentInstance();
				FacesMessage message = new FacesMessage("Se requiere ingresar el nro de documento de tramite");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				context.addMessage("form1:txtNroTramite", message);
				datosTramiteObligatorio = true;
				returnNull = true;
			}

			if (solicitud.getDES_DELITO() != null && solicitud.getDES_DELITO().trim().length() > 0
					&& (solicitud.getNUME_EXPED_SOLIC() != null || solicitud.getNUME_EXPED_SOLIC().trim().length() > 0)
					&& (solicitud.getDES_DELITO().trim().length() < 30
							|| solicitud.getDES_DELITO().trim().length() > 200)) {
				FacesContext context = FacesContext.getCurrentInstance();
				FacesMessage message = new FacesMessage(
						"Si selecciona otro documento debe detallar el motivo (mín. 30, máx 200 caracteres)");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				context.addMessage("form1:txtDescripcionMotivo", message);
				datosTramiteObligatorioDesc = true;
				returnNull = true;
			}
		}

		return returnNull;

	}

	private HtmlMessage inlineMessage90 = new HtmlMessage();

	public HtmlMessage getInlineMessage90() {
		return inlineMessage90;
	}

	public void setInlineMessage90(HtmlMessage inlineMessage90) {
		this.inlineMessage90 = inlineMessage90;
	}

	public boolean isRenderPhoto() {
		return renderPhoto;
	}

	public void setRenderPhoto(boolean renderPhoto) {
		this.renderPhoto = renderPhoto;
	}

	// Se agregó GLPI 111500

	private HtmlOutputText outputTextNroTramite = new HtmlOutputText();

	public HtmlOutputText getOutputTextNroTramite() {
		return outputTextNroTramite;
	}

	public void setOutputTextNroTramite(HtmlOutputText outputTextNroTramite) {
		this.outputTextNroTramite = outputTextNroTramite;
	}

	private HtmlInputText txtNroTramite = new HtmlInputText();

	public HtmlInputText getTxtNroTramite() {
		return txtNroTramite;
	}

	public void setTxtNroTramite(HtmlInputText txtNroTramite) {
		this.txtNroTramite = txtNroTramite;
	}

	private TextArea txtDescripcionMotivo = new TextArea();

	public TextArea getTxtDescripcionMotivo() {
		return txtDescripcionMotivo;
	}

	public void setTxtDescripcionMotivo(TextArea txtDescripcionMotivo) {
		this.txtDescripcionMotivo = txtDescripcionMotivo;
	}

	private HtmlSelectOneMenu ddTipoDocumentoAut = new HtmlSelectOneMenu();

	public HtmlSelectOneMenu getDdTipoDocumentoAut() {
		return ddTipoDocumentoAut;
	}

	public void setDdTipoDocumentoAut(HtmlSelectOneMenu ddTipoDocumentoAut) {
		this.ddTipoDocumentoAut = ddTipoDocumentoAut;
	}

	public List<SelectItem> getTiposDocumentoAut() {
		return tiposDocumentoAut;
	}

	public void setTiposDocumentoAut(List<SelectItem> tiposDocumentoAut) {
		this.tiposDocumentoAut = tiposDocumentoAut;
	}

	public String getLblTipoTramite() {
		return lblTipoTramite;
	}

	public void setLblTipoTramite(String lblTipoTramite) {
		this.lblTipoTramite = lblTipoTramite;
	}

	public String getIdTipoDocumentoAutorizacion() {
		return idTipoDocumentoAutorizacion;
	}

	public void setIdTipoDocumentoAutorizacion(String idTipoDocumentoAutorizacion) {
		this.idTipoDocumentoAutorizacion = idTipoDocumentoAutorizacion;
	}

	public UISelectItems getDropdown1SelectAutItems() {
		return dropdown1SelectAutItems;
	}

	public void setDropdown1SelectAutItems(UISelectItems dropdown1SelectAutItems) {
		this.dropdown1SelectAutItems = dropdown1SelectAutItems;
	}

	public String getLblNroTramite() {
		return lblNroTramite;
	}

	public void setLblNroTramite(String lblNroTramite) {
		this.lblNroTramite = lblNroTramite;
	}

	public String getLblDescripcionMotivo() {
		return lblDescripcionMotivo;
	}

	public void setLblDescripcionMotivo(String lblDescripcionMotivo) {
		this.lblDescripcionMotivo = lblDescripcionMotivo;
	}

	private HtmlMessage inlineMessage11 = new HtmlMessage();

	public HtmlMessage getInlineMessage11() {
		return inlineMessage11;
	}

	public void setInlineMessage11(HtmlMessage inlineMessage11) {
		this.inlineMessage11 = inlineMessage11;
	}

	private HtmlMessage inlineMessage13 = new HtmlMessage();

	private HtmlMessage inlineMessage14 = new HtmlMessage();
	
	public HtmlMessage getInlineMessage13() {
		return inlineMessage13;
	}

	public void setInlineMessage13(HtmlMessage inlineMessage13) {
		this.inlineMessage13 = inlineMessage13;
	}

	public boolean isDatosTramiteObligatorio() {
		return datosTramiteObligatorio;
	}

	public void setDatosTramiteObligatorio(boolean datosTramiteObligatorio) {
		this.datosTramiteObligatorio = datosTramiteObligatorio;
	}

	public String getMensajeValidaExistenciaSolicitud() {
		return mensajeValidaExistenciaSolicitud;
	}

	public void setMensajeValidaExistenciaSolicitud(String mensajeValidaExistenciaSolicitud) {
		this.mensajeValidaExistenciaSolicitud = mensajeValidaExistenciaSolicitud;
	}

	public boolean isDatosTramiteObligatorioDesc() {
		return datosTramiteObligatorioDesc;
	}

	public void setDatosTramiteObligatorioDesc(boolean datosTramiteObligatorioDesc) {
		this.datosTramiteObligatorioDesc = datosTramiteObligatorioDesc;
	}

	public String getModificar() {
		return modificar;
	}

	public void setModificar(String modificar) {
		this.modificar = modificar;
	}

	public boolean isDisableOtroTramite() {
		return disableOtroTramite;
	}

	public void setDisableOtroTramite(boolean disableOtroTramite) {
		this.disableOtroTramite = disableOtroTramite;
	}

	public boolean isVerTxtLugarNacimiento() {
		Object value = checkNacidoEnExtrajero.getValue() != null? 
				checkNacidoEnExtrajero.getValue() : checkNacidoEnExtrajero.getSubmittedValue();
		if (value != null)
			return (boolean) value;
		else
			return false;
	}


	public HtmlInputText getTxtLugarNacimiento() {
		return txtLugarNacimiento;
	}

	public void setTxtLugarNacimiento(HtmlInputText txtLugarNacimiento) {
		this.txtLugarNacimiento = txtLugarNacimiento;
	}

	public HtmlSelectBooleanCheckbox getCheckNacidoEnExtrajero() {
		return checkNacidoEnExtrajero;
	}

	public void setCheckNacidoEnExtrajero(HtmlSelectBooleanCheckbox checkNacidoEnExtrajero) {
		this.checkNacidoEnExtrajero = checkNacidoEnExtrajero;
	}

	public HtmlMessage getInlineMessage14() {
		return inlineMessage14;
	}

	public void setInlineMessage14(HtmlMessage inlineMessage14) {
		this.inlineMessage14 = inlineMessage14;
	}

	// GLPI 111500

}
