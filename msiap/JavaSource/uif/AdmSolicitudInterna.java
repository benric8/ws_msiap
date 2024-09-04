/**
 *
 */
package uif;

import java.sql.SQLException;
//import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UISelectItems;
import javax.faces.component.html.HtmlMessage;
import javax.faces.component.html.HtmlMessages;
import javax.faces.component.html.HtmlSelectBooleanCheckbox;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.context.FacesContext;
import javax.faces.convert.DateTimeConverter;
import javax.faces.event.ValueChangeEvent;
import javax.faces.validator.ValidatorException;
import javax.naming.NamingException;

import pe.gob.pj.rnc.criterio.CriterioListarSolicitudInterna;
import pe.gob.pj.rnc.log.MyLogger;
import pe.gob.pj.rnc.model.Solicitud;
import pe.gob.pj.rnc.model.SolicitudReporte;
import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.rnc.service.DepartamentoManager;
import pe.gob.pj.rnc.service.DistritoJudicialManager;
import pe.gob.pj.rnc.util.comparador.DateTimeUtil;

import com.sun.data.provider.RowKey;
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
 * @author Administrador
 *
 */
public class AdmSolicitudInterna extends AbstractPageBean {
	static MyLogger logger= new MyLogger(AdmSolicitudInterna.class.getName());
	/**
	 * <p>
	 * Automatically managed component initialization. <strong>WARNING:</strong>
	 * This method is automatically generated, so any user-specified code
	 * inserted here is subject to being replaced.
	 * </p>
	 */
	private void _init() throws Exception {
		dateTimeConverter1.setLocale(new java.util.Locale("es", "PE"));
		dateTimeConverter1.setPattern("dd/MM/yyyy HH:mm:ss");
		dateTimeConverter1.setTimeZone(java.util.TimeZone
				.getTimeZone("America/Lima"));

	}
	
	private DropDown ddUsuarios = new DropDown();
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
	private UISelectItems dropdown11SelectItems = new UISelectItems();
	private HtmlSelectOneMenu ddDistritoJudicial = new HtmlSelectOneMenu();
	private HtmlMessage messageList2 = new HtmlMessage();

	private HtmlMessage messageList1 = new HtmlMessage();

	private HtmlMessages messageList6 = new HtmlMessages();

	private HtmlMessage messageList3 = new HtmlMessage();

	private HtmlMessage messageList4 = new HtmlMessage();

	private HtmlMessage messageList5 = new HtmlMessage();

	private HtmlSelectBooleanCheckbox checkPenImp = new HtmlSelectBooleanCheckbox();

	private HtmlSelectBooleanCheckbox checkImp = new HtmlSelectBooleanCheckbox();

	private HtmlSelectBooleanCheckbox checkObs = new HtmlSelectBooleanCheckbox();

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

	private TextField txtPaterno = new TextField();

	public TextField getTxtPaterno() {
		return txtPaterno;
	}

	public void setTxtPaterno(TextField tf) {
		this.txtPaterno = tf;
	}

	private TextField txtNroSolicitud = new TextField();

	private TextField txtNroExpdiente = new TextField();

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

	private Button btnNuevo = new Button();

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

	private Button btnVerDetalle = new Button();

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

	private Button btnEditar = new Button();

	public Button getBtnAuditoria() {
		return btnAuditoria;
	}

	public void setBtnAuditoria(Button b) {
		this.btnAuditoria = b;
	}

	public void calDesde_validate(FacesContext context, UIComponent component,
			Object value) {

	}

	private TableColumn tableColumn5 = new TableColumn();

	private TableColumn tableColumn6 = new TableColumn();

	private TableColumn tableColumn8 = new TableColumn();

	public TableColumn getTableColumn5() {
		return tableColumn5;
	}

	public void setTableColumn5(TableColumn tc) {
		this.tableColumn5 = tc;
	}

	private StaticText staticText2 = new StaticText();

	private StaticText staticText5 = new StaticText();

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

	private TableColumn tableColumnCodCerti = new TableColumn();

	public TableColumn getTableColumnNroSolicit() {
		return tableColumnNroSolicit;
	}

	public void setTableColumnNroSolicit(TableColumn tc) {
		this.tableColumnNroSolicit = tc;
	}

	private StaticText staticText8 = new StaticText();

	private StaticText staticText10 = new StaticText();

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
	public AdmSolicitudInterna() {
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

		super.init();
		try {
			_init();
		} catch (Exception e) {
			logger.error("admSolicitud Initialization Failure", e);
			throw e instanceof FacesException ? (FacesException) e
					: new FacesException(e);
		}

		java.util.Calendar cal = new GregorianCalendar();

		if (calDesde.getValue() == null) {
			cal = new GregorianCalendar();
			calHasta.setValue(cal.getTime());
			cal.add(java.util.Calendar.DAY_OF_YEAR, -2);
			calDesde.setValue(cal.getTime());
		} else {
			if (calHasta.getValue() == null) {
				cal = new GregorianCalendar();
				calHasta.setValue(cal.getTime());
			}
		}

		if (getSessionBean1().isPrimerAccesoSolicitudInterna()) {
			getSessionBean1().setSolicitudInterna(null);
			buscar_action();
			getSessionBean1().setPrimerAccesoSolicitudInterna(false);
		}
		Usuario usuario = getSessionBean1().getUsuario();
		if (usuario.isPerfilAdministrador()||usuario.isPerfilSupervisorJudicial()) {
			try {
				if (getSessionBean1().getUsuarioDistritoJudicial() != null) {

					if (((Usuario) getSessionBean1().getUsuarioDistritoJudicial().getList().get(0)).getCODG_USUAR() == null)
						getSessionBean1().getUsuarioDistritoJudicial().refreshProvider(usuario, (usuario.isPerfilSupervisorJudicial()?usuario.getCODG_DISTRITO_JUDICIAL():"%"));
				} else {

					getSessionBean1().getUsuarioDistritoJudicial().refreshProvider(usuario, (usuario.isPerfilSupervisorJudicial()?usuario.getCODG_DISTRITO_JUDICIAL():"%"));
				}
			} catch (Exception e) {
				logger.error("",e);
				e.printStackTrace();
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

	public String buscar_action() {
		try {
			java.util.Calendar cal = new GregorianCalendar();
			CriterioListarSolicitudInterna criterio = new CriterioListarSolicitudInterna();

			if (calDesde.getValue() == null) {
				cal = new GregorianCalendar();
				calHasta.setValue(cal.getTime());
				cal.add(java.util.Calendar.MONTH, -1);
				calDesde.setValue(cal.getTime());
			} else if (calHasta.getValue() == null) {
				cal = new GregorianCalendar();
				calHasta.setValue(cal.getTime());
			}

			criterio.setFechaInicial((java.util.Date) calDesde.getValue());
			criterio.setFechaFinal((java.util.Date) calHasta.getValue());

			if (txtPaterno.getValue() != null)
				if (!txtPaterno.getValue().equals("")) {
					criterio.setApellidoPaterno(txtPaterno.getValue()
							.toString().toUpperCase());
					txtPaterno.setValue("");
				}
			if (txtMaterno.getValue() != null)
				if (!txtMaterno.getValue().equals("")) {
					criterio.setApellidoMaterno(txtMaterno.getValue()
							.toString().toUpperCase());
					txtMaterno.setValue("");
				}
			if (txtNombres.getValue() != null)
				if (!txtNombres.getValue().equals("")) {
					criterio.setNombre(txtNombres.getValue().toString()
							.toUpperCase());
					txtNombres.setValue("");
				}

			if (txtNroExpdiente.getValue() != null)
				if (!txtNroExpdiente.getValue().equals("")) {
					criterio.setNroExpediente(txtNroExpdiente.getValue()
							.toString());
					txtNroExpdiente.setValue("");
				}

			if (txtNroSolicitud.getValue() != null)
				if (!txtNroSolicitud.getValue().equals("")) {
					criterio.setNroSolicitud(txtNroSolicitud.getValue()
							.toString());
					txtNroSolicitud.setValue("");
				}

			if (checkPenImp.isSelected())
				criterio.setPendienteImpresion(true);
			if (checkImp.isSelected())
				criterio.setImpreso(true);
			if (checkObs.isSelected())
				criterio.setObservado(true);

			Usuario usuario = getSessionBean1().getUsuario();
			criterio.setCodigoUsuario(usuario.getCODG_USUAR());
			criterio.setCodigoJuzgado(usuario.getCODG_JUZGAD());

			if (usuario.isPerfilAdministrador()){
				criterio.setCodigoUsuario((ddUsuarios.getValue()!=null?ddUsuarios.getValue().toString():"%"));
				criterio.setCodDistritoJudicial((ddDistritoJudicial.getValue()!=null?ddDistritoJudicial.getValue().toString():"%"));
				criterio.setCodigoJuzgado("%");
			}


			if (getSessionBean1().getSolicitudInterna() == null)
				getSessionBean1().setSolicitudInterna(new SolicitudInternaDataProvider());


			getSessionBean1().getSolicitudInterna().refreshProvider
				(getSessionBean1().getManager().selectSolicitudes(usuario, criterio, getSessionBean1().getMotivos().getList()));
			getSessionBean1().setSolicitudes(null);


		} catch (NamingException e) {
			info("Ha ocurrido un error de nombramiento de la fuente de datos.");
			logger.error("Ha ocurrido un error de nombramiento de la fuente de datos. error: " ,e);
		} catch (SQLException e) {
			info("Ha ocurrido un error de acceso a la base de datos.");
			logger.error("Ha ocurrido un error de acceso a la base de datos." , e);
		} catch (Exception e) {
			info("Ha ocurrido un error en la ejecución de la consulta para obtener sus solicitudes ingresadas.");
			e.printStackTrace();
			logger.error("Ha ocurrido un error en la ejecución de la consulta para obtener sus solicitudes ingresadas.error: " , e);
		}
		return null;
	}

	public String btnImpVer_action() {
		RowKey rowkey = tableRowGroup1.getRowKey();
		Solicitud solicitud = (Solicitud) getSessionBean1().getSolicitudInterna().getObject(rowkey);
		String codigoCerti = (String) getSessionBean1().getSolicitudInterna().getValue("CODG_CERTI", rowkey);
		getSessionBean1().setSolicitudReporte(null);
		if (codigoCerti == null) {
			error("Debe de seleccionar una solicitud de certificados de antecedentes penales");
			return null;
		}

		if (solicitud.getMARCA().equals("S")) {
			if (solicitud.getL_autoriza().equals("S")) {
				if (solicitud.getL_usuar_aut() == null && solicitud.getFech_aut() == null)// verificar ambos
				{
					error("Solicitud Observada - Descarte Pendiente");
					return null;
				}
			} else {
				error("Solicitud Observada - Descarte Pendiente");
				return null;
			}
		} else if (solicitud.getL_INDC_OFICIO()!=null && solicitud.getL_INDC_OFICIO().equals("S")) {
			error("Solicitud Observada - Descarte Pendiente");
			return null;
		}
		try {

			//getSessionBean1().getCertificadoInterno().refreshProvider("JMC0333024"); //RCC0000018826 //MZC0000042504//VSC0000121767
			//getSessionBean1().getCertificadoInterno().refreshProvider(codigoCerti);
			List<SolicitudReporte> lista = this.getSessionBean1().getManager().reporteSolicitudMagistrado(codigoCerti);
			getSessionBean1().setSolicitudReporte(lista.get(0));
			//getSessionBean1().setCertificadoInternoPOJO((CertificadoInterno) getSessionBean1().getCertificadoInterno().getList().get(0));

		} catch (Exception e) {
			e.printStackTrace();
			logger.error(" Error redireccionando a la informaci\363n: solicitada", e);
		}
		return "vistaPrevia";
	}

	public String btnImp_action() {

		RowKey rowkey = tableRowGroup1.getRowKey();
		String codigoCerti = (String) getSessionBean1().getSolicitudInterna().getValue("CODG_CERTI", rowkey);
		Solicitud solicitud = (Solicitud) getSessionBean1().getSolicitudInterna().getObject(rowkey);

		if (codigoCerti == null) {
			error("Debe de seleccionar una solicitud de certificados de antecedentes penales");
			return null;
		}

		/* Ya no consulto nuevamente por los mismos datos
		Solicitud solicitud = getApplicationBean1().getManager().selectByPrimaryKeySolicitud(codigoCerti);
		*/
		//cambiar validacion
		//if (solicitud.getDESC_FEC_USU_MODI().indexOf("REG") > 0	&& solicitud.getDESC_FEC_USU_MODI().indexOf("DES") < 0) {
//		if (solicitud.getDESC_FEC_USU_MODI().indexOf("DES") < 0	&& (solicitud.getL_INDC_OFICIO().equals("S")||solicitud.getMARCA().equals("S"))) {
//			System.out.println("solicitud.getDESC_FEC_USU_MODI-->"+solicitud.getDESC_FEC_USU_MODI().indexOf("DES"));
//			System.out.println("solicitud.getL_INDC_OFICIO-->"+solicitud.getL_INDC_OFICIO().equals("S"));
//			System.out.println("solicitud.getMARCA-->"+solicitud.getMARCA());
//
//			error("Solicitud Observada - Descarte Pendiente");
//			return null;
//		}

		if (solicitud.getMARCA().equals("S")) {
			if (solicitud.getL_autoriza().equals("S")) {
				if (solicitud.getL_usuar_aut() == null && solicitud.getFech_aut() == null)// verificar ambos
				{
					error("Solicitud Observada - Descarte Pendiente");
					return null;
				}
			} else {
				error("Solicitud Observada - Descarte Pendiente");
				return null;
			}
		} else if (solicitud.getL_INDC_OFICIO().equals("S")) {
			error("Solicitud Observada - Descarte Pendiente");
			return null;
		}

		getSessionBean1().setCodigoCerti(codigoCerti);
		getSessionBean1().setAccesoReporte(true);
		getSessionBean1().setFlagImp(true);

		return "repImpresion";
	}

	public String btnAuditoria_action() {
		RowKey rowkey = tableRowGroup1.getRowKey();
		String codigoCerti = (String) getSessionBean1().getSolicitudInterna()
				.getValue("CODG_CERTI", rowkey);
		if (codigoCerti == null) {
			error("Debe de seleccionar una solicitud de certificados de antecedentes penales");
			return null;
		}
		try {
			Solicitud solicitud = getSessionBean1().getManager()
					.selectByPrimaryKeySolicitud(codigoCerti);
			solicitud.setDESC_FEC_USU_MODI(solicitud.getDESC_FEC_USU_MODI()
					.replaceAll(";", "\n"));
			getSessionBean1().setSolicitudUnitaria(solicitud);
		} catch (Exception ex) {
			logger.error(" Error extrayendo informaci\363n: " ,ex);
		}
		return "auditoriaInterna";
	}

	public String btnModificar_action() {


		getSessionBean1().setPrimerAccesoSolicitudInterna(true);
		RowKey rowkey = tableRowGroup1.getRowKey();
		String codigo = (String) getSessionBean1().getSolicitudInterna().getValue("CODG_CERTI", rowkey);
		if (codigo == null) {
			error("Debe de seleccionar una solicitud de certificados de antecedentes penales");
			return null;
		}
		DepartamentoManager departamentoManager= new DepartamentoManager();
		DistritoJudicialManager distritoJudicialManager= new DistritoJudicialManager();

		try {
			Solicitud solicitud = getSessionBean1().getManager().selectByPrimaryKeySolicitud(codigo);

			if (solicitud.getL_nro_modifica() != null) {
				if (solicitud.getL_nro_modifica() >= 1) {
					error("La solicitud ya ha sido modificada por "+ solicitud.getCODG_USU_ULT_MODI().toUpperCase());
					return null;
				}
			}

			if (DateTimeUtil.daysBetween(solicitud.getFECH_REGISTRO(),
					new Date()) >= 5) {
				error("No se puede Modificar la Solicitud porque ya han pasado mas de 5 días desde su registro");
				return null;
			}

			if (solicitud.getDESC_FEC_USU_MODI().indexOf("DES") > 0) {
				error("No se puede Modificar la Solicitud porque ya se ha realizado el descarte");
				return null;
			}

			if (solicitud.getDESC_FEC_USU_MODI().indexOf("IMP") > 0) {
				error("No se puede Modificar la Solicitud porque se ha realizado la impresión");
				return null;
			}

			solicitud.setDepartamento(departamentoManager.selectDepartamento(solicitud.getCODG_LUGAR()));
			solicitud.setDistritoJudicial(distritoJudicialManager.selectDistritoJudicial(solicitud.getCODG_DISTRITO_JUDICIAL()));

			solicitud.setFLAG_MANT("MOD");
			getSessionBean1().setSolicitudUnitaria(solicitud);
		} catch (Exception ex) {
			logger.error(" Error extrayendo informaci\363n: " , ex);
		}finally{
			departamentoManager=null;
			distritoJudicialManager=null;
		}
		return "successIngSolicitud";
	}

	public String btnVerDetalle_action() {

		RowKey rowkey = tableRowGroup1.getRowKey();
		String codigo = (String) getSessionBean1().getSolicitudInterna()
				.getValue("CODG_CERTI", rowkey);

		if (codigo == null) {
			error("Debe de seleccionar una solicitud de certificados de antecedentes penales");
			return null;
		}
		DepartamentoManager departamentoManager= new DepartamentoManager();
		DistritoJudicialManager distritoJudicialManager= new DistritoJudicialManager();
		try {
			Solicitud solicitud = getSessionBean1().getManager().selectByPrimaryKeySolicitud(codigo);
			solicitud.setDepartamento(departamentoManager.selectDepartamento(solicitud.getCODG_LUGAR()));
			solicitud.setDistritoJudicial(distritoJudicialManager.selectDistritoJudicial(solicitud.getCODG_DISTRITO_JUDICIAL()));
			solicitud.setFLAG_MANT("DET");
			getSessionBean1().setSolicitudVisual(solicitud);
		} catch (Exception ex) {
			logger.error(" Error extrayendo informaci\363n: " , ex);
		}finally{
			departamentoManager=null;
			distritoJudicialManager=null;
		}

		return "visuaSolicitudInterna";
	}

	public String btnNuevo_action() {

		Solicitud solicitud = new Solicitud();
		solicitud.setFLAG_MANT("NEW");
		getSessionBean1().setSolicitudUnitaria(solicitud);
		return "successIngSolicitud";
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

	public void valorCombo(ValueChangeEvent valueChangeEvent) {


		try {
			getSessionBean1().getUsuarioDistritoJudicial().refreshProvider(
					getSessionBean1().getUsuario(),
					(valueChangeEvent != null ? (String) valueChangeEvent
							.getNewValue() : null));
		} catch (Exception e) {
			logger.error("",e);
		}
	}
	public void txtNombres_validate(FacesContext context,
			UIComponent component, Object value) {
		String s = String.valueOf(value);
		if(s.length()!=0)
			if (!s.matches("[A-Za-zãÃñÑäëïöüÿÄËÏÖÜáéíóúÁÉÍÓÚ.']+[A-Za-zãÃñÑäëïöüÿÄËÏÖÜáéíóúÁÉÍÓÚ.'\\-\\s]*[A-Za-zãÃñÑäëïöüÿÄËÏÖÜáéíóúÁÉÍÓÚ.']*")&& !s.matches("[\\*]{3}")) {
				throw new ValidatorException(new FacesMessage(
					"Contiene caracteres inválidos!"));
			}
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

	/**
	 * <p>
	 * Return a reference to the scoped data bean.
	 * </p>
	 */
	protected fraHeader getfraHeader() {
		return (fraHeader) getBean("fraHeader");
	}

	public TextField getTxtNroSolicitud() {
		return txtNroSolicitud;
	}

	public void setTxtNroSolicitud(TextField txtNroSolicitud) {
		this.txtNroSolicitud = txtNroSolicitud;
	}

	public TextField getTxtNroExpdiente() {
		return txtNroExpdiente;
	}

	public void setTxtNroExpdiente(TextField txtNroExpdiente) {
		this.txtNroExpdiente = txtNroExpdiente;
	}

	public HtmlMessage getMessageList1() {
		return messageList1;
	}

	public void setMessageList1(HtmlMessage messageList1) {
		this.messageList1 = messageList1;
	}

	public HtmlMessage getMessageList2() {
		return messageList2;
	}

	public void setMessageList2(HtmlMessage messageList2) {
		this.messageList2 = messageList2;
	}

	public HtmlMessage getMessageList3() {
		return messageList3;
	}

	public void setMessageList3(HtmlMessage messageList3) {
		this.messageList3 = messageList3;
	}

	public HtmlMessage getMessageList4() {
		return messageList4;
	}

	public void setMessageList4(HtmlMessage messageList4) {
		this.messageList4 = messageList4;
	}

	public HtmlMessage getMessageList5() {
		return messageList5;
	}

	public void setMessageList5(HtmlMessage messageList5) {
		this.messageList5 = messageList5;
	}

	public TableColumn getTableColumn6() {
		return tableColumn6;
	}

	public void setTableColumn6(TableColumn tableColumn6) {
		this.tableColumn6 = tableColumn6;
	}

	public StaticText getStaticText5() {
		return staticText5;
	}

	public void setStaticText5(StaticText staticText5) {
		this.staticText5 = staticText5;
	}

	public TableColumn getTableColumn8() {
		return tableColumn8;
	}

	public void setTableColumn8(TableColumn tableColumn8) {
		this.tableColumn8 = tableColumn8;
	}

	public Button getBtnEditar() {
		return btnEditar;
	}

	public void setBtnEditar(Button btnEditar) {
		this.btnEditar = btnEditar;
	}

	public HtmlSelectBooleanCheckbox getCheckImp() {
		return checkImp;
	}

	public void setCheckImp(HtmlSelectBooleanCheckbox checkImp) {
		this.checkImp = checkImp;
	}

	public HtmlSelectBooleanCheckbox getCheckPenImp() {
		return checkPenImp;
	}

	public void setCheckPenImp(HtmlSelectBooleanCheckbox checkPenImp) {
		this.checkPenImp = checkPenImp;
	}

	public HtmlSelectBooleanCheckbox getCheckObs() {
		return checkObs;
	}

	public void setCheckObs(HtmlSelectBooleanCheckbox checkObs) {
		this.checkObs = checkObs;
	}

	public StaticText getStaticText10() {
		return staticText10;
	}

	public void setStaticText10(StaticText staticText10) {
		this.staticText10 = staticText10;
	}

	public Button getBtnNuevo() {
		return btnNuevo;
	}

	public void setBtnNuevo(Button btnNuevo) {
		this.btnNuevo = btnNuevo;
	}

	public TableColumn getTableColumnCodCerti() {
		return tableColumnCodCerti;
	}

	public void setTableColumnCodCerti(TableColumn tableColumnCodCerti) {
		this.tableColumnCodCerti = tableColumnCodCerti;
	}

	public HtmlMessages getMessageList6() {
		return messageList6;
	}

	public void setMessageList6(HtmlMessages messageList6) {
		this.messageList6 = messageList6;
	}

	public Button getBtnVerDetalle() {
		return btnVerDetalle;
	}

	public void setBtnVerDetalle(Button btnVerDetalle) {
		this.btnVerDetalle = btnVerDetalle;
	}

	public DropDown getDdUsuarios() {
		return ddUsuarios;
	}

	public void setDdUsuarios(DropDown ddUsuarios) {
		this.ddUsuarios = ddUsuarios;
	}

	public UISelectItems getDropdown11SelectItems() {
		return dropdown11SelectItems;
	}

	public void setDropdown11SelectItems(UISelectItems dropdown11SelectItems) {
		this.dropdown11SelectItems = dropdown11SelectItems;
	}

	public HtmlSelectOneMenu getDdDistritoJudicial() {
		return ddDistritoJudicial;
	}

	public void setDdDistritoJudicial(HtmlSelectOneMenu ddDistritoJudicial) {
		this.ddDistritoJudicial = ddDistritoJudicial;
	}
}