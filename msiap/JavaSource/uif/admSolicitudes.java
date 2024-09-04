/*
 * admSolicitud.java
 *
 */
package uif;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlMessages;
import javax.faces.component.html.HtmlPanelGroup;
import javax.faces.context.FacesContext;
import javax.faces.convert.DateTimeConverter;
import javax.faces.event.ValueChangeEvent;
import javax.faces.validator.ValidatorException;
import javax.naming.NamingException;

import pe.gob.pj.rnc.criterio.CriterioListarSolicitudExterna;
import pe.gob.pj.rnc.model.Solicitud;
import pe.gob.pj.rnc.model.SolicitudExterna;
import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.util.Mensaje;

import com.sun.data.provider.RowKey;
import com.sun.faces.taglib.html_basic.InputTextTag;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Calendar;
import com.sun.rave.web.ui.component.DropDown;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import com.sun.rave.web.ui.component.PageSeparator;
import com.sun.rave.web.ui.component.Script;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.Table;
import com.sun.rave.web.ui.component.TableColumn;
import com.sun.rave.web.ui.component.TableRowGroup;
import com.sun.rave.web.ui.component.TextField;

/**
 * <p>
 * Page bean that corresponds to a similarly named JSP page. This class contains component definitions (and initialization code) for all components that you have defined on
 * this page, as well as lifecycle methods and event handlers where you may add behavior to respond to incoming events.
 * </p>
 */
public class admSolicitudes extends AbstractPageBean {

	/**
	 * <p>
	 * Automatically managed component initialization. <strong>WARNING:</strong> This method is automatically generated, so any user-specified code inserted here is subject to
	 * being replaced.
	 * </p>
	 */
	private void _init() throws Exception {
		dateTimeConverter1.setLocale(new java.util.Locale("es", "PE"));
		dateTimeConverter1.setPattern("dd/MM/yyyy HH:mm:ss");
		dateTimeConverter1.setTimeZone(java.util.TimeZone.getTimeZone("America/Lima"));
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

	private TableColumn tableColumn11 = new TableColumn();

	public TableColumn getTableColumn11() {
		return tableColumn11;
	}

	public void setTableColumn11(TableColumn tc) {
		this.tableColumn11 = tc;
	}

	private TableColumn tableColumn12 = new TableColumn();

	public TableColumn getTableColumn12() {
		return tableColumn12;
	}

	public void setTableColumn12(TableColumn tc) {
		this.tableColumn12 = tc;
	}

	private Calendar calDesde = new Calendar();

	public Calendar getCalDesde() {
		return calDesde;
	}

	public void setCalDesde(Calendar c) {
		this.calDesde = c;
	}

	private Calendar calHasta = new Calendar();

	public Calendar getCalHasta() {
		return calHasta;
	}

	public void setCalHasta(Calendar c) {
		this.calHasta = c;
	}

	private DropDown ddEstado = new DropDown();

	public DropDown getDdEstado() {
		return ddEstado;
	}

	public void setDdEstado(DropDown dd) {
		this.ddEstado = dd;
	}

	private TextField txtPaterno = new TextField();

	public TextField getTxtPaterno() {
		return txtPaterno;
	}

	public void setTxtPaterno(TextField tf) {
		this.txtPaterno = tf;
	}

	private Label label1 = new Label();

	public Label getLabel1() {
		return label1;
	}

	public void setLabel1(Label l) {
		this.label1 = l;
	}

	private Label label2 = new Label();

	public Label getLabel2() {
		return label2;
	}

	public void setLabel2(Label l) {
		this.label2 = l;
	}

	private Label label3 = new Label();

	public Label getLabel3() {
		return label3;
	}

	public void setLabel3(Label l) {
		this.label3 = l;
	}

	private Label label4 = new Label();

	public Label getLabel4() {
		return label4;
	}

	public void setLabel4(Label l) {
		this.label4 = l;
	}

	private Label label5 = new Label();

	public Label getLabel5() {
		return label5;
	}

	public void setLabel5(Label l) {
		this.label5 = l;
	}

	private Label label6 = new Label();

	public Label getLabel6() {
		return label6;
	}

	public void setLabel6(Label l) {
		this.label6 = l;
	}

	private TextField txtMaterno = new TextField();

	public TextField getTxtMaterno() {
		return txtMaterno;
	}

	public void setTxtMaterno(TextField tf) {
		this.txtMaterno = tf;
	}

	private Label label7 = new Label();

	public Label getLabel7() {
		return label7;
	}

	public void setLabel7(Label l) {
		this.label7 = l;
	}

	private TextField txtNombres = new TextField();

	public TextField getTxtNombres() {
		return txtNombres;
	}

	public void setTxtNombres(TextField tf) {
		this.txtNombres = tf;
	}

	private Label label8 = new Label();

	public Label getLabel8() {
		return label8;
	}

	public void setLabel8(Label l) {
		this.label8 = l;
	}

	private Button button2 = new Button();

	public Button getButton2() {
		return button2;
	}

	public void setButton2(Button b) {
		this.button2 = b;
	}

	private TableColumn tableColumn1 = new TableColumn();

	public TableColumn getTableColumn1() {
		return tableColumn1;
	}

	public void setTableColumn1(TableColumn tc) {
		this.tableColumn1 = tc;
	}

	private Button btnRegistro = new Button();

	public Button getBtnRegistro() {
		return btnRegistro;
	}

	public void setBtnRegistro(Button b) {
		this.btnRegistro = b;
	}

	private Button btnVerA = new Button();

	public Button getBtnVerA() {
		return btnVerA;
	}

	public void setBtnVerA(Button b) {
		this.btnVerA = b;
	}

	private Button btnVerB = new Button();

	public Button getBtnVerB() {
		return btnVerB;
	}

	public void setBtnVerB(Button b) {
		this.btnVerB = b;
	}

	private HtmlPanelGroup groupPanel1 = new HtmlPanelGroup();

	public HtmlPanelGroup getGroupPanel1() {
		return groupPanel1;
	}

	public void setGroupPanel1(HtmlPanelGroup hpg) {
		this.groupPanel1 = hpg;
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

	private StaticText staticText4 = new StaticText();

	public StaticText getStaticText4() {
		return staticText4;
	}

	public void setStaticText4(StaticText st) {
		this.staticText4 = st;
	}

	private DateTimeConverter dateTimeConverter1 = new DateTimeConverter();

	public DateTimeConverter getDateTimeConverter1() {
		return dateTimeConverter1;
	}

	public void setDateTimeConverter1(DateTimeConverter dtc) {
		this.dateTimeConverter1 = dtc;
	}

	private TableColumn tableColumn4 = new TableColumn();

	public TableColumn getTableColumn4() {
		return tableColumn4;
	}

	public void setTableColumn4(TableColumn tc) {
		this.tableColumn4 = tc;
	}

	private Button btnAuditoria = new Button();

	public Button getBtnAuditoria() {
		return btnAuditoria;
	}

	public void setBtnAuditoria(Button b) {
		this.btnAuditoria = b;
	}

	private DropDown ddUsuarios = new DropDown();

	public DropDown getDdUsuarios() {
		return ddUsuarios;
	}

	public void setDdUsuarios(DropDown dd) {
		this.ddUsuarios = dd;
	}

	private Label lblUsuario = new Label();

	public Label getLblUsuario() {
		return lblUsuario;
	}

	public void setLblUsuario(Label l) {
		this.lblUsuario = l;
	}

	private TableColumn tableColumn5 = new TableColumn();

	public TableColumn getTableColumn5() {
		return tableColumn5;
	}

	public void setTableColumn5(TableColumn tc) {
		this.tableColumn5 = tc;
	}

	private StaticText staticText2 = new StaticText();

	public StaticText getStaticText2() {
		return staticText2;
	}

	public void setStaticText2(StaticText st) {
		this.staticText2 = st;
	}

	private Label label9 = new Label();

	public Label getLabel9() {
		return label9;
	}

	public void setLabel9(Label l) {
		this.label9 = l;
	}

	private StaticText staticText6 = new StaticText();

	public StaticText getStaticText6() {
		return staticText6;
	}

	public void setStaticText6(StaticText st) {
		this.staticText6 = st;
	}

	private PageSeparator pageSeparator1 = new PageSeparator();

	public PageSeparator getPageSeparator1() {
		return pageSeparator1;
	}

	public void setPageSeparator1(PageSeparator ps) {
		this.pageSeparator1 = ps;
	}

	private PageSeparator pageSeparator2 = new PageSeparator();

	public PageSeparator getPageSeparator2() {
		return pageSeparator2;
	}

	public void setPageSeparator2(PageSeparator ps) {
		this.pageSeparator2 = ps;
	}

	private Script script1 = new Script();

	public Script getScript1() {
		return script1;
	}

	public void setScript1(Script s) {
		this.script1 = s;
	}

	private TableColumn tableColumnNroSolicit = new TableColumn();

	public TableColumn getTableColumnNroSolicit() {
		return tableColumnNroSolicit;
	}

	public void setTableColumnNroSolicit(TableColumn tc) {
		this.tableColumnNroSolicit = tc;
	}

	private StaticText staticText8 = new StaticText();

	public StaticText getStaticText8() {
		return staticText8;
	}

	public void setStaticText8(StaticText st) {
		this.staticText8 = st;
	}

	// </editor-fold>

	/**
	 * <p>
	 * Construct a new Page bean instance.
	 * </p>
	 */
	public admSolicitudes() {
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
		getSessionBean1().setParametroEntero(null);
		super.init();
		try {
			_init();
		} catch (Exception e) {
			log("admSolicitud Initialization Failure", e);
			throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
		}

		java.util.Calendar cal = new GregorianCalendar();
		groupPanel1.setRendered(false);

		if (ddEstado.getSelected() == null)
			ddEstado.setSelected("%");

		if (calDesde.getValue() == null) {
			cal = new GregorianCalendar();
			calHasta.setValue(cal.getTime());
			// cal.add(java.util.Calendar.DAY_OF_YEAR, -2);
			cal.add(java.util.Calendar.DAY_OF_YEAR, -Integer.parseInt(Mensaje.getString("msiap.filtro.dias.antes")));
			// cal.add(java.util.Calendar.DAY_OF_YEAR, -15);
			calDesde.setValue(cal.getTime());
		} else {
			if (calHasta.getValue() == null) {
				cal = new GregorianCalendar();
				calHasta.setValue(cal.getTime());
			}
		}

		Usuario usuario = getSessionBean1().getUsuario();

		if (getSessionBean1().isPrimerAcceso()) {
			try {
				getSessionBean1().setPrimerAcceso(false);
				CriterioListarSolicitudExterna criterio = new CriterioListarSolicitudExterna();

				if (ddEstado.getSelected() == null)
					ddEstado.setSelected("%");

				criterio.setEstado(ddEstado.getSelected());

				if (calDesde.getValue() == null) {
					cal = new GregorianCalendar();
					calHasta.setValue(cal.getTime());
					// cal.add(java.util.Calendar.DAY_OF_YEAR, -2);
					cal.add(java.util.Calendar.DAY_OF_YEAR, -Integer.parseInt(Mensaje.getString("msiap.filtro.dias.antes")));
					calDesde.setValue(cal.getTime());
				} else {
					if (calHasta.getValue() == null) {
						cal = new GregorianCalendar();
						calHasta.setValue(cal.getTime());
					}
				}

				criterio.setFechaInicial((java.util.Date) calDesde.getValue());
				criterio.setFechaFinal((java.util.Date) calHasta.getValue());

				if (txtPaterno.getValue() != null)
					if (!txtPaterno.getValue().equals(""))
						criterio.setApellidoPaterno(txtPaterno.getValue());

				if (txtMaterno.getValue() != null)
					if (!txtMaterno.getValue().equals(""))
						criterio.setApellidoMaterno(txtMaterno.getValue());

				if (txtNombres.getValue() != null)
					if (!txtNombres.getValue().equals(""))
						criterio.setNombre(txtNombres.getValue());

				if (ddUsuarios.getSelected() == null)
					ddUsuarios.setSelected("%");

				criterio.setCodigoUsuario(usuario.getCODG_USUAR());
				if (!usuario.isPerfilOperador())
					criterio.setCodigoUsuario(ddUsuarios.getSelected());

				if (usuario.isPerfilAdministrador() || usuario.isPerfilSupervisor()) {
					getTableColumn2().setRendered(true);
					ddUsuarios.setRendered(true);
					lblUsuario.setRendered(true);
				}
				if (usuario.isPerfilOperador()) {
					getTableColumn2().setRendered(false);
					ddUsuarios.setRendered(false);
					lblUsuario.setRendered(false);
				}
				
				getSessionBean1().getSolicitudesExternas().refreshProvider(usuario, criterio);
				getSessionBean1().setSolicitudes(null);
				getSessionBean1().setPrimerAcceso(false);

			} catch (NamingException e) {
				info("Ha ocurrido un error de nombreamiento de la fuente de datos.");
				log("error: " + e.getMessage());
			} catch (SQLException e) {
				info("Ha ocurrido un error de acceso a la base de datos.");
				log("error: " + e.getMessage());
			} catch (Exception e) {
				info("Ha ocurrido un error en la ejecución de la consulta para obtener sus solicitudes ingresadas.");
				log("error: " + e.getMessage());
			}
		}

		if (usuario.isPerfilAdministrador() || usuario.isPerfilSupervisor()) {
			getTableColumn2().setRendered(true);
			ddUsuarios.setRendered(true);
			lblUsuario.setRendered(true);
		}
		if (usuario.isPerfilOperador()) {
			getTableColumn2().setRendered(false);
			ddUsuarios.setRendered(false);
			lblUsuario.setRendered(false);
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

	public String linkAction2_action() {
		return "case3";
	}

	public void txtPaterno_processValueChange(ValueChangeEvent event) {

	}

	public void calDesde_validate(FacesContext context, UIComponent component, Object value) {

	}

	public String button2_action() {
		try {
			java.util.Calendar cal = new GregorianCalendar();
			CriterioListarSolicitudExterna criterio = new CriterioListarSolicitudExterna();

			if (ddEstado.getSelected() == null)
				ddEstado.setSelected("ENV");

			criterio.setEstado(ddEstado.getSelected());

			if (calDesde.getValue() == null) {
				cal = new GregorianCalendar();
				calHasta.setValue(cal.getTime());
				cal.add(java.util.Calendar.MONTH, -1);
				calDesde.setValue(cal.getTime());
			} else if (calHasta.getValue() == null) {
				cal = new GregorianCalendar();
				calHasta.setValue(cal.getTime());
			}

			//TODO Agregar filtro de numero de oficio
			if (txtNroOficio.getValue() == null || txtNroOficio.getValue().equals("")) {
				criterio.setFechaInicial((java.util.Date) calDesde.getValue());
				criterio.setFechaFinal((java.util.Date) calHasta.getValue());
			}

			boolean busquedaNombre = false;
			if (txtPaterno.getValue() != null)
				if (!txtPaterno.getValue().equals("")) {
					criterio.setApellidoPaterno(txtPaterno.getValue().toString().toUpperCase());
					txtPaterno.setValue("");
					busquedaNombre=true;
				}

			if (txtMaterno.getValue() != null)
				if (!txtMaterno.getValue().equals("")) {
					criterio.setApellidoMaterno(txtMaterno.getValue().toString().toUpperCase());
					txtMaterno.setValue("");
					busquedaNombre=true;
				}

			if (txtNombres.getValue() != null)
				if (!txtNombres.getValue().equals("")) {
					criterio.setNombre(txtNombres.getValue().toString().toUpperCase());
					txtNombres.setValue("");
					busquedaNombre=true;
				}
			
			if(busquedaNombre) {
				cal = new GregorianCalendar();
				cal.add(java.util.Calendar.MONTH, -3);
				Date inicio = (Date)calDesde.getValue();
				if(inicio.getTime()<=cal.getTime().getTime()) {
					criterio.setFechaInicial(inicio);
				}else {
					criterio.setFechaInicial(cal.getTime());
				}
			}
			
			if (ddUsuarios.getSelected() == null)
				ddUsuarios.setSelected("%");

			Usuario usuario = getSessionBean1().getUsuario();

			criterio.setCodigoUsuario(usuario.getCODG_USUAR());
			if (!usuario.isPerfilOperador())
				criterio.setCodigoUsuario(ddUsuarios.getSelected());
			
			//TODO Agregar filtro de numero de oficio
			System.out.println("txtNroOficio="+txtNroOficio.getValue());
			if (txtNroOficio.getValue() != null && !txtNroOficio.getValue().equals("")) {
				criterio.setNroOficio(txtNroOficio.getValue().toString());
				//txtNroOficio.setValue("");
			}
			
			getSessionBean1().getSolicitudesExternas().refreshProvider(usuario, criterio);
			getSessionBean1().setSolicitudes(null);

			groupPanel1.setRendered(false);

		} catch (NamingException e) {
			info("Ha ocurrido un error de nombreamiento de la fuente de datos.");
			log("error: " + e.getMessage());
		} catch (SQLException e) {
			info("Ha ocurrido un error de acceso a la base de datos.");
			log("error: " + e.getMessage());
		} catch (Exception e) {
			info("Ha ocurrido un error en la ejecución de la consulta para obtener sus solicitudes ingresadas.");
			log("error: " + e.getMessage());
		}
		return null;
	}

	private String estadoFiltro = "ENV";

	public String getEstadoFiltro() {
		return estadoFiltro;
	}

	public void setEstadoFiltro(String estadoFiltro) {
		this.estadoFiltro = estadoFiltro;
	}

	public String btnRegistro_action() {
		RowKey rowkey = tableRowGroup1.getRowKey();
		Integer codigo = (Integer) getSessionBean1().getSolicitudesExternas().getValue("CODG_CERTI_EXTERNO", rowkey);
		ArrayList listado = null;
		Solicitud sei = null;
		String cadena = "";
		String estado = "";
		try {
			getSessionBean1().getEstadoSolicitudes().refreshProvider(getSessionBean1().getManager().getSolicitudesPorCertifExt(codigo));
			getSessionBean1().setSolicitudExternaNroParm(null);
			listado = (ArrayList) getSessionBean1().getEstadoSolicitudes().getList();

			for (Iterator it = listado.iterator(); it.hasNext();) {
				sei = (Solicitud) it.next();
				if (!estado.equals(sei.getDESC_ESTADO_SOLICITUD())) {
					estado = sei.getDESC_ESTADO_SOLICITUD();
					cadena = cadena + "<br/><b>ESTADO " + (estado.toUpperCase().equals("REGISTRADO") ? "PENDIENTE DE DESCARTE" : estado.toUpperCase()) + "</b>:<br/>"
							+ sei.getAPLL_PATER_SOLIC() + " " + sei.getAPLL_MATER_SOLIC() + ", " + sei.getNOM1_SOLIC() + " "
							+ (sei.getNOM2_SOLIC() == null ? "" : sei.getNOM2_SOLIC()) + " " + (sei.getNOM3_SOLIC() == null ? "" : sei.getNOM3_SOLIC());
				} else {
					cadena = cadena + "<br/>" + sei.getAPLL_PATER_SOLIC() + " " + sei.getAPLL_MATER_SOLIC() + ", " + sei.getNOM1_SOLIC() + " "
							+ (sei.getNOM2_SOLIC() == null ? "" : sei.getNOM2_SOLIC()) + " " + (sei.getNOM3_SOLIC() == null ? "" : sei.getNOM3_SOLIC());
				}
			}
			if (!cadena.equals("")) {
				staticText1.setValue("<B>REGISTROS INCLUIDOS EN LA SOLICITUD:</B><BR/>" + cadena);
				groupPanel1.setRendered(true);
				return null;
			} else {
				groupPanel1.setRendered(false);
				info("no se han encontrado registros asociados");
				return null;
			}

		} catch (SQLException e) {
			info("Error de acceso a la base de datos, intente de nuevo mas tarde");
			log(e.getMessage());
			groupPanel1.setRendered(false);
			// body1.setOnLoad("");
		} catch (NamingException e) {
			info("Error de nombramiento de la fuente de datos");
			log(e.getMessage());
			groupPanel1.setRendered(false);
		}
		return null;
	}

	public String hoficioA_action() {
		RowKey rowkey = tableRowGroup1.getRowKey();
		Integer codigo = (Integer) getSessionBean1().getSolicitudesExternas().getValue("CODG_CERTI_EXTERNO", rowkey);
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("repPrimario.jsp?id=" + codigo.toString());
		} catch (Exception e) {
			log(" Error redireccionando a la informaci\363n: solicitada" + e.getMessage());
		}
		return null;
	}

	public String btnVerA_action() {
		RowKey rowkey = tableRowGroup1.getRowKey();

		//Integer codCertificadoExterno = (Integer) getSessionBean1().getSolicitudesExternas().getValue("CODG_CERTI_EXTERNO", rowkey);
		getSessionBean1().setParametroEntero((SolicitudExterna) getSessionBean1().getSolicitudesExternas().getObject(rowkey));

		getSessionBean1().setAccesoReporte(true);

		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("repPrimario.jsp");
			repPrimario r = (repPrimario) FacesContext.getCurrentInstance().getExternalContext().getApplicationMap().get("repPrimario");
//			while (r.getProcesoTerminado()) {
//				r.getProcesoTerminado();
//			}
		} catch (Exception e) {
			log(" Error redireccionando a la informaci\363n: solicitada" + e.getMessage());
		}
		return "inicio";
	}

	public String btnVerB_action() {
		RowKey rowkey = tableRowGroup1.getRowKey();

		//Integer codCertificadoExterno = (Integer) getSessionBean1().getSolicitudesExternas().getValue("CODG_CERTI_EXTERNO", rowkey);
		getSessionBean1().setParametroEntero((SolicitudExterna) getSessionBean1().getSolicitudesExternas().getObject(rowkey));
		try {
			getSessionBean1().setAccesoReporte(true);
			getSessionBean1().repSecundarioAppBean();
		} catch (Exception e) {
			//getSessionBean1().setParametroOcultar(0);
			log(" Error redireccionando a la informaci\363n: solicitada" + e.getMessage());
			error(" Error redireccionando a la informaci\363n: solicitada");
		}
		return "inicio";
	}

	public String btnAuditoria_action() {
		RowKey rowkey = tableRowGroup1.getRowKey();
		Integer codigo = (Integer) getSessionBean1().getSolicitudesExternas().getValue("CODG_CERTI_EXTERNO", rowkey);
		try {
			getSessionBean1().getRegistrosAuditoriaExterna().refreshProvider(codigo);
			getSessionBean1().getEstadoSolicitudes().refreshProvider(getSessionBean1().getManager().getSolicitudesPorCertifExt(codigo));
			//SolicitudExterna solicitudExterna = getSessionBean1().getManager().selectSolicitudExternaByPrimaryKey(codigo);
			getSessionBean1().setSolicitudExterna((SolicitudExterna) getSessionBean1().getSolicitudesExternas().getObject(rowkey));
		} catch (Exception ex) {
			log(" Error extrayendo informaci\363n: " + ex.getMessage());
		}
		return "auditoria";
	}

	public String getColumnStyle() {
		RowKey rowKey = tableRowGroup1.getRowKey();
		if ((Integer.parseInt(rowKey.getRowId()) % 2) == 0) {
			return " ";
		} else {
			return "background-color: #eeeeee";
		}
	}

	public String getColor() {
		return "color: rgb(153, 0, 0); font-weight: bold;";
	}

	public boolean getRenderedOficioA() {
		if (getValue("#{currentRow.value['v_OFI_RESPUESTA_A']}") != null) {
			return true;
		} else {
			return false;
		}
	}

	public boolean getRenderedOficioB() {
		if (getValue("#{currentRow.value['v_OFI_RESPUESTA_B']}") != null) {
			return true;
		} else {
			return false;
		}
	}

	private boolean flgRegistros;

	public boolean isFlgRegistros() {
		return flgRegistros;
	}

	public void setFlgRegistros(boolean flgRegistros) {
		this.flgRegistros = flgRegistros;
	}

	public void txtNombres_validate(FacesContext context, UIComponent component, Object value) {
		String s = String.valueOf(value);
		if (s != null && ! s.equals(""))
			if (!s.matches("[A-Za-zãÃñÑäëïöüÿÄËÏÖÜáéíóúÁÉÍÓÚ.']+[A-Za-zãÃñÑäëïöüÿÄËÏÖÜáéíóúÁÉÍÓÚ.'\\-\\s]*[A-Za-zãÃñÑäëïöüÿÄËÏÖÜáéíóúÁÉÍÓÚ.']*") && !s.matches("[\\*]{3}")) { throw new ValidatorException(
				new FacesMessage("El campo nombre contiene caracteres inválidos!")); }
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
	
	private Label label11 = new Label();
	
	public Label getLabel11() {
		return label11;
	}

	public void setLabel11(Label label11) {
		this.label11 = label11;
	}

	private TextField txtNroOficio = new TextField();

	public TextField getTxtNroOficio() {
		return txtNroOficio;
	}

	public void setTxtNroOficio(TextField txtNroOficio) {
		this.txtNroOficio = txtNroOficio;
	}

	private Label label12 = new Label();

	public Label getLabel12() {
		return label12;
	}

	public void setLabel12(Label label12) {
		this.label12 = label12;
	}
	
	
}