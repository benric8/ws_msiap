/*
 * ingSolicitudMultiple.java
 *
 * Created on 27 de febrero de 2007, 07:25 AM
 * Copyright user
 */
package uif;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.faces.FacesException;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlMessages;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.context.FacesContext;

import pe.gob.pj.rnc.criterio.CriterioListarSolicitudExterna;
import pe.gob.pj.rnc.log.MyLogger;
import pe.gob.pj.rnc.model.Solicitud;
import pe.gob.pj.rnc.model.SolicitudExterna;
import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.util.CommonsUtilities;
import pe.gob.pj.util.Mensaje;

import com.sun.data.provider.RowKey;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Message;
import com.sun.rave.web.ui.component.Page;
import com.sun.rave.web.ui.component.PageSeparator;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.Table;
import com.sun.rave.web.ui.component.TableColumn;
import com.sun.rave.web.ui.component.TableRowGroup;

/**
 * <p>
 * Page bean that corresponds to a similarly named JSP page. This class contains component definitions (and initialization code) for all components that you have defined on
 * this page, as well as lifecycle methods and event handlers where you may add behavior to respond to incoming events.
 * </p>
 */
public class ingSolicitudMultiple extends AbstractPageBean {

	private TableColumn tableColumn30 = new TableColumn();
	private String modificar;

	public TableColumn getTableColumn30() {
		return tableColumn30;
	}

	public void setTableColumn30(TableColumn tc) {
		this.tableColumn30 = tc;
	}

	private StaticText staticText30 = new StaticText();

	public StaticText getStaticText30() {
		return staticText30;
	}

	public void setStaticText30(StaticText st) {
		this.staticText30 = st;
	}

	/**
	 * <p>
	 * Automatically managed component initialization. <strong>WARNING:</strong> This method is automatically generated, so any user-specified code inserted here is subject to
	 * being replaced.
	 * </p>
	 */
	private void _init() throws Exception {
		table1.setInternalVirtualForm(true);
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

	private Link link2 = new Link();

	public Link getLink2() {
		return link2;
	}

	public void setLink2(Link l) {
		this.link2 = l;
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

	private HtmlInputText txtReferencia = new HtmlInputText();

	public HtmlInputText getTxtReferencia() {
		return txtReferencia;
	}

	public void setTxtReferencia(HtmlInputText hit) {
		this.txtReferencia = hit;
	}

	private HtmlOutputText outputText5 = new HtmlOutputText();

	public HtmlOutputText getOutputText5() {
		return outputText5;
	}

	public void setOutputText5(HtmlOutputText hot) {
		this.outputText5 = hot;
	}

	private HtmlMessages messageList1 = new HtmlMessages();

	public HtmlMessages getMessageList1() {
		return messageList1;
	}

	public void setMessageList1(HtmlMessages hm) {
		this.messageList1 = hm;
	}

	private Table table1 = new Table();

	public Table getTable1() {
		return table1;
	}

	public void setTable1(Table t) {
		this.table1 = t;
	}

	private TableRowGroup tableRowGroup1 = new TableRowGroup();

	public TableRowGroup getTableRowGroup1() {
		return tableRowGroup1;
	}

	public void setTableRowGroup1(TableRowGroup trg) {
		this.tableRowGroup1 = trg;
	}

	private TableColumn tableColumn1 = new TableColumn();

	public TableColumn getTableColumn1() {
		return tableColumn1;
	}

	public void setTableColumn1(TableColumn tc) {
		this.tableColumn1 = tc;
	}

	private StaticText staticText1 = new StaticText();

	public StaticText getStaticText1() {
		return staticText1;
	}

	public void setStaticText1(StaticText st) {
		this.staticText1 = st;
	}

	private TableColumn tableColumn2 = new TableColumn();

	public TableColumn getTableColumn2() {
		return tableColumn2;
	}

	public void setTableColumn2(TableColumn tc) {
		this.tableColumn2 = tc;
	}

	private StaticText staticText2 = new StaticText();

	public StaticText getStaticText2() {
		return staticText2;
	}

	public void setStaticText2(StaticText st) {
		this.staticText2 = st;
	}

	private TableColumn tableColumn3 = new TableColumn();

	public TableColumn getTableColumn3() {
		return tableColumn3;
	}

	public void setTableColumn3(TableColumn tc) {
		this.tableColumn3 = tc;
	}

	private StaticText staticText3 = new StaticText();

	public StaticText getStaticText3() {
		return staticText3;
	}

	public void setStaticText3(StaticText st) {
		this.staticText3 = st;
	}

	private TableColumn tableColumn4 = new TableColumn();

	public TableColumn getTableColumn4() {
		return tableColumn4;
	}

	public void setTableColumn4(TableColumn tc) {
		this.tableColumn4 = tc;
	}

	private StaticText staticText4 = new StaticText();

	public StaticText getStaticText4() {
		return staticText4;
	}

	public void setStaticText4(StaticText st) {
		this.staticText4 = st;
	}

	private TableColumn tableColumn7 = new TableColumn();

	public TableColumn getTableColumn7() {
		return tableColumn7;
	}

	public void setTableColumn7(TableColumn tc) {
		this.tableColumn7 = tc;
	}

	private StaticText staticText7 = new StaticText();

	public StaticText getStaticText7() {
		return staticText7;
	}

	public void setStaticText7(StaticText st) {
		this.staticText7 = st;
	}

	private TableColumn tableColumn8 = new TableColumn();

	public TableColumn getTableColumn8() {
		return tableColumn8;
	}

	public void setTableColumn8(TableColumn tc) {
		this.tableColumn8 = tc;
	}

	private StaticText staticText8 = new StaticText();

	public StaticText getStaticText8() {
		return staticText8;
	}

	public void setStaticText8(StaticText st) {
		this.staticText8 = st;
	}

	private TableColumn tableColumn9 = new TableColumn();

	public TableColumn getTableColumn9() {
		return tableColumn9;
	}

	public void setTableColumn9(TableColumn tc) {
		this.tableColumn9 = tc;
	}

	private TableColumn tableColumn10 = new TableColumn();

	public TableColumn getTableColumn10() {
		return tableColumn10;
	}

	public void setTableColumn10(TableColumn tc) {
		this.tableColumn10 = tc;
	}

	private Button button3 = new Button();

	public Button getButton3() {
		return button3;
	}

	public void setButton3(Button b) {
		this.button3 = b;
	}

	private Message message3 = new Message();

	public Message getMessage3() {
		return message3;
	}

	public void setMessage3(Message m) {
		this.message3 = m;
	}

	private Button btnEnviarSolicitud = new Button();

	public Button getBtnEnviarSolicitud() {
		return btnEnviarSolicitud;
	}

	public void setBtnEnviarSolicitud(Button b) {
		this.btnEnviarSolicitud = b;
	}

	private Button btnAnhadir = new Button();

	public Button getBtnAnhadir() {
		return btnAnhadir;
	}

	public void setBtnAnhadir(Button b) {
		this.btnAnhadir = b;
	}

	private Button btnVolver = new Button();

	public Button getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(Button b) {
		this.btnVolver = b;
	}

	private StaticText staticText9 = new StaticText();

	public StaticText getStaticText9() {
		return staticText9;
	}

	public void setStaticText9(StaticText st) {
		this.staticText9 = st;
	}

	private PageSeparator pageSeparator1 = new PageSeparator();

	public PageSeparator getPageSeparator1() {
		return pageSeparator1;
	}

	public void setPageSeparator1(PageSeparator ps) {
		this.pageSeparator1 = ps;
	}

	private PageSeparator pageSeparator3 = new PageSeparator();

	public PageSeparator getPageSeparator3() {
		return pageSeparator3;
	}

	public void setPageSeparator3(PageSeparator ps) {
		this.pageSeparator3 = ps;
	}

	private Button btnModificar = new Button();

	public Button getBtnModificar() {
		return btnModificar;
	}

	public void setBtnModificar(Button b) {
		this.btnModificar = b;
	}

	// </editor-fold>

	/**
	 * <p>
	 * Construct a new Page bean instance.
	 * </p>
	 */
	public ingSolicitudMultiple() {
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
			log("ingSolicitudMultiple Initialization Failure", e);
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

	public String btnAnhadirRegistro_action() {
		getSessionBean1().setSolicitudUnitaria(new Solicitud());
		if (getSessionBean1().getSolicitudes() == null || getSessionBean1().getSolicitudes().isEmpty()) {
			getSessionBean1().setSolicitudes(new ArrayList<Solicitud>());
		}
		return "successAnhadir";
	}

	public String button2_action() {
		info("Solicitud Enviada con éxito");
		return "case2";
	}

	public String button3_action() {
		getSessionBean1().getSolicitudesUnitarias().commitChanges();
		RowKey rowkey = tableRowGroup1.getRowKey();
		Solicitud solicitud = (Solicitud) getSessionBean1().getSolicitudesUnitarias().getObject(rowkey);
		getSessionBean1().getSolicitudes().remove(solicitud);
		getSessionBean1().getSolicitudesUnitarias().refreshProviderSession(getSessionBean1().getSolicitudes());
		getSessionBean1().getSolicitudesUnitarias().commitChanges();
		info("Registro eliminado con éxito");
		return null;
	}

	static MyLogger logger = new MyLogger(ingSolicitudMultiple.class.getName());

	public String btnEnviarSolicitud_action() {
		this.getSessionBean1().setAccion(null);
		String navigateTo = null;
		// SolicitudExterna solicitudExterna = null;
		SolicitudExterna solicitudExterna = new SolicitudExterna();
		Usuario usuario = getSessionBean1().getUsuario();
		CriterioListarSolicitudExterna criterio = new CriterioListarSolicitudExterna();
		Calendar cal = new GregorianCalendar();
		criterio.setEstado("%");
		criterio.setFechaFinal(cal.getTime());
		// cal.add(java.util.Calendar.DAY_OF_YEAR, -2);
		cal.add(java.util.Calendar.DAY_OF_YEAR, -Integer.parseInt(Mensaje.getString("msiap.filtro.dias.antes")));
		criterio.setFechaInicial(cal.getTime());
		criterio.setCodigoUsuario(usuario.getCODG_USUAR());
		// info(".....");
		long li = System.currentTimeMillis();
		try {
			if (getSessionBean1().getSolicitudes() == null) {
				info("No existen solicitudes a procesar.");
				return navigateTo;
			}
			// if (getSessionBean1().getSolicitudes() != null || !getSessionBean1().getSolicitudes().isEmpty()) {
			if (!getSessionBean1().getSolicitudes().isEmpty()) {
				if (getSessionBean1().getSolicitudes().size() < 1 || getSessionBean1().getSolicitudes().size() > 50) {
					info("No se pueden ingresar solicitudes sin registros o mayores a 50 registros");
					return null;
				}
				// solicitudExterna = getSessionBean1().getSolicitudExterna();
				String indc = getSessionBean1().getEntidadExterna().getINDC_REFERENCIA();
				// ("antes de enviar solicitudExterna.getDESC_REFERENCIA()="+solicitudExterna.getDESC_REFERENCIA());
				if (indc == null)
					indc = "S";
				if (indc.equals("N"))
					solicitudExterna.setDESC_REFERENCIA(getSessionBean1().getEntidadExterna().getDESC_CONVENIO());
				if (solicitudExterna.getDESC_REFERENCIA() != null)
					solicitudExterna.setDESC_REFERENCIA(solicitudExterna.getDESC_REFERENCIA().toUpperCase());
				solicitudExterna.setCODG_USUAR(getSessionBean1().getUsuario().getCODG_USUAR());
				// solicitudExterna.setCodigo_del_motivo(getSessionBean1().getMotivos())
				solicitudExterna.setCodigo_del_motivo(getSessionBean1().getMotivos().getCodigo_del_motivo());
				solicitudExterna.setCODG_ENTIDAD_EXTERNA(getSessionBean1().getUsuario().getCODG_ENTIDAD_EXTERNA());
				solicitudExterna.setCODG_ESTADO("ENV");
				solicitudExterna.setFECH_REGISTRO(new Date());
				//erodriguezbu se agrega firma autorizada del jefe RNC y usuario supervisor
				if(getSessionBean1().getUsuarioSupervisor() == null)
					log("ERROR: La entidad externa no tiene supervisor asignado o tiene más de un supervisor.");

				solicitudExterna.setCodgSupervisor(getSessionBean1().getUsuarioSupervisor().getCODG_USUAR());
				if(getSessionBean1().getFirmaAutorizada() != null)
					solicitudExterna.setCodgFirmaRnc(getSessionBean1().getFirmaAutorizada().getCODG_USU_FIRMA());

				ArrayList<Solicitud> solicitudes = (ArrayList<Solicitud>) getSessionBean1().getSolicitudes();

				try {
					// "antes de enviar solicitudExterna.getV_OFI_RESPUESTA_A()="+solicitudExterna.getV_OFI_RESPUESTA_A());

					getSessionBean1().getManager().enviarSolicitud(getSessionBean1(), usuario, solicitudExterna, solicitudes, criterio);

					getSessionBean1().setSolicitudUnitaria(new Solicitud());
					getSessionBean1().setSolicitudes(new ArrayList<Solicitud>());

					info("Solicitud Enviada al Registro Nacional de Condenas con éxito.");
					navigateTo = "inicio";
				} catch (Exception e1) {
					e1.printStackTrace();
					if (e1.getMessage().equalsIgnoreCase("errorDescarte")) {
						error("Ha ocurrido un error al cotejar la información, por favor intente otra vez. De persistir el error comuníquese con el área de help desk del Poder Judicial");
						log("error: " + e1.getMessage());
						return null;
					} else if (e1.getMessage().equalsIgnoreCase("ErrorInsercion")){
						error("Ha ocurrido un error al guardar la solicitud, por favor intente otra vez. De persistir el error comuníquese con el área de help desk del Poder Judicial");
						log("error: " + e1.getMessage());
						return null;
					}
					else if (e1.getMessage().equalsIgnoreCase("errorSeleccion")) {
						info("Ha ocurrido un error en la ejecución de la consulta para obtener sus solicitudes ingresadas. De persistir el error comuníquese con el área de help desk del Poder Judicial");
						log("error: " + e1.getMessage());
					} else {
						info("Ha ocurrido un error, por favor intente nuevamente. De persistir el error comuníquese con el área de help desk del Poder Judicial");
						log("error: " + e1.getMessage());
					}
				}
			} else {
				info("No existen solicitudes a procesar...");
				info("Lista vacia.");
				// info("Error al enviar la solicitud, cierre la sesión e intente de nuevo.");
				return navigateTo;
			}

		} catch (Exception e) {
			log("error ee: " + e.getMessage());
			info("Error al enviar la solicitud, cierre la sesión e intente de nuevo");
			e.printStackTrace();
			return navigateTo;
		}

		return navigateTo;
	}

	public String btnAnhadir_action() {
		this.getSessionBean1().setAccion(null);
		getSessionBean1().setSolicitudUnitaria(new Solicitud());
		if (getSessionBean1().getSolicitudes() == null || getSessionBean1().getSolicitudes().isEmpty()) {
			getSessionBean1().setSolicitudes(new ArrayList<Solicitud>());
		}
		return "successAnhadir";
	}

	public String btnVolver_action() {
		return "inicio";
	}

	/**
	 * <p>
	 * Return a reference to the scoped data bean.
	 * </p>
	 */
	protected uif.fragHeader getfragHeader() {
		return (uif.fragHeader) getBean("fragHeader");
	}

	public String btnModificar_action() {
		getSessionBean1().getSolicitudesUnitarias().commitChanges();
		RowKey rowkey = tableRowGroup1.getRowKey();
		Solicitud solicitud = (Solicitud) getSessionBean1().getSolicitudesUnitarias().getObject(rowkey);
		getSessionBean1().setIndexListSolicitudes(getSessionBean1().getSolicitudes().indexOf(solicitud));
		getSessionBean1().setSolicitudUnitaria(solicitud);	
		getSessionBean1().setAccion("M");
		return "successAnhadir";
	}

	public void txtReferencia_validate(FacesContext context, UIComponent component, Object value) {

	}
	
	public String ofuscarDatos(String dato) {
		return CommonsUtilities.ofuscarDatos(dato);
	}

	public boolean getRenderedReferencia() {
		String indc = getSessionBean1().getEntidadExterna().getINDC_REFERENCIA();
		boolean resultado;
		if (indc == null)
			indc = "S";
		if (indc.equals("S"))
			resultado = true;
		else
			resultado = false;
		return resultado;
	}

	/**
	 * <p>
	 * Return a reference to the scoped data bean.
	 * </p>
	 */
	protected fraHeader getfraHeader() {
		return (fraHeader) getBean("fraHeader");
	}

	public String tiempo() {
		Date d = new Date(); // fecha actual o Date d = new
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/aaaa hh:mm:ss");
		return f.format(d);
	}

	public String getModificar() {
		return modificar;
	}

	public void setModificar(String modificar) {
		this.modificar = modificar;
	}
	
	
}