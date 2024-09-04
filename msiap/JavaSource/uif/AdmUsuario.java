/**
 *
 */
package uif;

import java.sql.SQLException;

import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UISelectItems;
import javax.faces.component.html.HtmlMessage;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.context.FacesContext;
import javax.naming.NamingException;
import pe.gob.pj.rnc.criterio.CriterioListarUsuario;
import pe.gob.pj.rnc.log.MyLogger;
import pe.gob.pj.rnc.model.Perfil;
import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.rnc.model.UsuarioCamposAud;
import pe.gob.pj.rnc.service.UsuarioManager;
//import pe.gob.pj.util.Constantes;

import com.sun.data.provider.RowKey;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.DropDown;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.Page;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Script;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.Table;
import com.sun.rave.web.ui.component.TableColumn;
import com.sun.rave.web.ui.component.TableRowGroup;
import com.sun.rave.web.ui.component.TextField;
import com.sun.rave.web.ui.model.SingleSelectOptionsList;

/**
 * @author Gerente
 */
public class AdmUsuario extends AbstractPageBean {
	static MyLogger	logger	= new MyLogger(AdmUsuario.class.getName());
	private Page		page1		= new Page();

	public Page getPage1() {
		return page1;
	}

	public void setPage1(Page p) {
		this.page1 = p;
	}

	private Html	html1	= new Html();

	public Html getHtml1() {
		return html1;
	}

	public void setHtml1(Html h) {
		this.html1 = h;
	}

	private Head	head1	= new Head();

	public Head getHead1() {
		return head1;
	}

	public void setHead1(Head h) {
		this.head1 = h;
	}

	private Link	link1	= new Link();

	public Link getLink1() {
		return link1;
	}

	public void setLink1(Link l) {
		this.link1 = l;
	}

	private Body	body1	= new Body();

	public Body getBody1() {
		return body1;
	}

	public void setBody1(Body b) {
		this.body1 = b;
	}

	private Form	form1	= new Form();

	public Form getForm1() {
		return form1;
	}

	public void setForm1(Form f) {
		this.form1 = f;
	}

	public void init() {
		super.init();
		try {
			_init();
		} catch (Exception e) {
			logger.error("admUsuario Initialization Failure", e);
			throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
		}

		if (getSessionBean1().isPrimerAccesoUsuario()) {
			getSessionBean1().setPrimerAccesoUsuario(false);
			//Usuario usuario = getSessionBean1().getUsuario();
			CriterioListarUsuario criterio = new CriterioListarUsuario();
			try {
				if(getSessionBean1().getDistritoJudicialInterno().getList().size()<=1) getSessionBean1().getDistritoJudicialInterno().refreshProvider();
				getSessionBean1().getEntidadExternas().refreshProvider();

				if (ddPerfil.getSelected() != null)
					criterio.setCodPerfil(ddPerfil.getSelected());
				if (ddEntidadExterna.getSelected() != null)
					criterio.setCodEntidadExterna(ddEntidadExterna.getSelected());
				if (txtApellidos.getValue() != null)
					if (txtApellidos.getValue().equals(""))
						criterio.setApellidos(txtApellidos.getValue());
				if (txtNombres.getValue() != null)
					if (txtNombres.getValue().equals(""))
						criterio.setNombres(txtNombres.getValue());

				//getSessionBean1().getConsultaUsuario().refreshProvider(usuario, criterio);

			} catch (NamingException e) {
				info("Ha ocurrido un error de nombramiento de la fuente de datos.");
				logger.error("Ha ocurrido un error de nombramiento de la fuente de datos.error: ", e);
			} catch (SQLException e) {
				info("Ha ocurrido un error de acceso a la base de datos.");
				logger.error("Ha ocurrido un error de acceso a la base de datos.error: ", e);
			} catch (Exception e) {
				info("Ha ocurrido un error en la ejecución de la consulta para obtener usuarios.");
				logger.error("Ha ocurrido un error en la ejecución de la consulta para obtener usuarios. Error: ", e);
			}

		}

	}

	/**
	 * <p>
	 * Automatically managed component initialization. <strong>WARNING:</strong> This method is automatically generated,
	 * so any user-specified code inserted here is subject to being replaced.
	 * </p>
	 */
	private void _init() throws Exception {

		ddPerfilDefaultOptions.setOptions(new com.sun.rave.web.ui.model.Option[] {
				new com.sun.rave.web.ui.model.Option("%", "--- SELECCIONE UN PERFIL ---"),
				new com.sun.rave.web.ui.model.Option(Perfil.ADMINISTRADOR_ID, "ADMINISTRADOR"),
				new com.sun.rave.web.ui.model.Option(Perfil.ADMINISTRADOR_USUARIO_ID, "ADMINISTRADOR DE USUARIO"),
				new com.sun.rave.web.ui.model.Option(Perfil.SUPERVISOR_JUDICIAL_ID, "MAGISTRADO"),
				new com.sun.rave.web.ui.model.Option(Perfil.MPFN_FISCAL, "MPFN - FISCAL"),
				// new com.sun.rave.web.ui.model.Option(
				// Perfil.OPERADOR_JUDICIAL_ID, "OPERADOR JUDICIAL"),
				new com.sun.rave.web.ui.model.Option(Perfil.SUPERVISOR_ID, "SUPERVISOR"),
				new com.sun.rave.web.ui.model.Option(Perfil.OPERADOR_ID, "OPERADOR"),
				new com.sun.rave.web.ui.model.Option(Perfil.BUSCADOR_SOLICITUDES_ID, "CONSULTA RENAJU")
				});
	}

	private Script	script1	= new Script();

	public Script getScript1() {
		return script1;
	}

	public void setScript1(Script s) {
		this.script1 = s;
	}

	private Script	script2	= new Script();

	public Script getScript2() {
		return script2;
	}

	public void setScript2(Script s) {
		this.script2 = s;
	}

	private Script	script3	= new Script();

	public Script getScript3() {
		return script3;
	}

	public void setScript3(Script s) {
		this.script3 = s;
	}

	private Label	label1	= new Label();

	public Label getLabel1() {
		return label1;
	}

	public void setLabel1(Label l) {
		this.label1 = l;
	}

	private Button	cmdFiltrar	= new Button();

	public Button getCmdFiltrar() {
		return cmdFiltrar;
	}

	public void setCmdFiltrar(Button cmdFiltrar) {
		this.cmdFiltrar = cmdFiltrar;
	}

	private Button	cmdNuevo	= new Button();

	public Button getCmdNuevo() {
		return cmdNuevo;
	}

	public void setCmdNuevo(Button cmdNuevo) {
		this.cmdNuevo = cmdNuevo;
	}

	private Label	label3	= new Label();

	public Label getLabel3() {
		return label3;
	}

	public void setLabel3(Label l) {
		this.label3 = l;
	}

	private TextField	txtNombres	= new TextField();

	public TextField getTxtNombres() {
		return txtNombres;
	}

	public void setTxtNombres(TextField txtNombres) {
		this.txtNombres = txtNombres;
	}

	private Label	label8	= new Label();

	public Label getLabel8() {
		return label8;
	}

	public void setLabel8(Label l) {
		this.label8 = l;
	}

	private Label										label4									= new Label();

	private Label										label5									= new Label();

	private TextField								txtApellidos						= new TextField();

	private DropDown								ddPerfil								= new DropDown();

	private SingleSelectOptionsList	ddPerfilDefaultOptions	= new SingleSelectOptionsList();
	
	private DropDown								ddEntidadExterna				= new DropDown();

	private HtmlMessage							messageList1						= new HtmlMessage();

	public HtmlMessage getMessageList1() {
		return messageList1;
	}

	public void setMessageList1(HtmlMessage hm) {
		this.messageList1 = hm;
	}

	private HtmlMessage	messageList2	= new HtmlMessage();

	public HtmlMessage getMessageList2() {
		return messageList2;
	}

	public void setMessageList2(HtmlMessage hm) {
		this.messageList2 = hm;
	}

	private Table	table1	= new Table();

	public Table getTable1() {
		return table1;
	}

	public void setTable1(Table t) {
		this.table1 = t;
	}

	private TableRowGroup	tableRowGroup1	= new TableRowGroup();

	public TableRowGroup getTableRowGroup1() {
		return tableRowGroup1;
	}

	public void setTableRowGroup1(TableRowGroup trg) {
		this.tableRowGroup1 = trg;
	}

	private TableColumn	tableColumnCodUsuario	= new TableColumn();

	public TableColumn getTableColumnCodUsuario() {
		return tableColumnCodUsuario;
	}

	public void setTableColumnCodUsuario(TableColumn tc) {
		this.tableColumnCodUsuario = tc;
	}

	private StaticText	staticText8	= new StaticText();

	public StaticText getStaticText8() {
		return staticText8;
	}

	public void setStaticText8(StaticText st) {
		this.staticText8 = st;
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

	private TableColumn	tableColumn2	= new TableColumn();

	public TableColumn getTableColumn2() {
		return tableColumn2;
	}

	public void setTableColumn2(TableColumn tc) {
		this.tableColumn2 = tc;
	}

	private StaticText	staticText4	= new StaticText();

	public StaticText getStaticText4() {
		return staticText4;
	}

	public void setStaticText4(StaticText st) {
		this.staticText4 = st;
	}

	private TableColumn	tableColumn3	= new TableColumn();

	public TableColumn getTableColumn3() {
		return tableColumn3;
	}

	public void setTableColumn3(TableColumn tc) {
		this.tableColumn3 = tc;
	}

	private StaticText	staticText3	= new StaticText();

	public StaticText getStaticText3() {
		return staticText3;
	}

	public void setStaticText3(StaticText st) {
		this.staticText3 = st;
	}

	private TableColumn				tableColumn9					= new TableColumn();
	private TableColumn				tableColumn13					= new TableColumn();
	private TableColumn				tableColumn14					= new TableColumn();
	private Label							lblDistritoJudicial		= new Label();
	private HtmlSelectOneMenu	ddDistritoJudicial		= new HtmlSelectOneMenu();
	private UISelectItems			dropdown11SelectItems	= new UISelectItems();
	private UISelectItems			dropdown12SelectItems	= new UISelectItems();

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

	public Label getLblDistritoJudicial() {
		return lblDistritoJudicial;
	}

	public void setLblDistritoJudicial(Label lblDistritoJudicial) {
		this.lblDistritoJudicial = lblDistritoJudicial;
	}

	public TableColumn getTableColumn9() {
		return tableColumn9;
	}

	public void setTableColumn9(TableColumn tc) {
		this.tableColumn9 = tc;
	}

	private StaticText	staticText9		= new StaticText();
	private StaticText	staticText13	= new StaticText();
	private StaticText	staticText14	= new StaticText();

	public StaticText getStaticText9() {
		return staticText9;
	}

	public void setStaticText9(StaticText st) {
		this.staticText9 = st;
	}

	private TableColumn	tableColumn10	= new TableColumn();

	public TableColumn getTableColumn10() {
		return tableColumn10;
	}

	public void setTableColumn10(TableColumn tc) {
		this.tableColumn10 = tc;
	}

	private StaticText	staticText10	= new StaticText();

	public StaticText getStaticText10() {
		return staticText10;
	}

	public void setStaticText10(StaticText st) {
		this.staticText10 = st;
	}

	private TableColumn	tableColumn11	= new TableColumn();

	public TableColumn getTableColumn11() {
		return tableColumn11;
	}

	public void setTableColumn11(TableColumn tc) {
		this.tableColumn11 = tc;
	}

	private StaticText	staticText11	= new StaticText();

	public StaticText getStaticText11() {
		return staticText11;
	}

	public void setStaticText11(StaticText st) {
		this.staticText11 = st;
	}

	private TableColumn	tableColumn12	= new TableColumn();

	public TableColumn getTableColumn12() {
		return tableColumn12;
	}

	public void setTableColumn12(TableColumn tc) {
		this.tableColumn12 = tc;
	}

	private Button	btnModificar	= new Button();

	public Button getBtnModificar() {
		return btnModificar;
	}

	public void setBtnModificar(Button b) {
		this.btnModificar = b;
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

	public void txtNombres_validate(FacesContext context, UIComponent component, Object value) {
		String s = String.valueOf(value);
		if(s != null && !s.equals(""))
			if (!s.matches("[a-zA-ZñÑ'üäëïöÄËÏÖÜ \\-\\.]{1,14}")) {
				FacesMessage message = new FacesMessage("El campo " + String.valueOf(component.getAttributes().get("id"))
					+ " contiene caracteres inválidos!");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				context.addMessage("form1:" + String.valueOf(component.getAttributes().get("id")), message);

		}
	}

	public Label getLabel4() {
		return label4;
	}

	public void setLabel4(Label label4) {
		this.label4 = label4;
	}

	public Label getLabel5() {
		return label5;
	}

	public void setLabel5(Label label5) {
		this.label5 = label5;
	}

	public TextField getTxtApellidos() {
		return txtApellidos;
	}

	public void setTxtApellidos(TextField txtApellidos) {
		this.txtApellidos = txtApellidos;
	}

	public void setDdPerfil(DropDown ddPerfil) {
		this.ddPerfil = ddPerfil;
	}

	public SingleSelectOptionsList getDdPerfilDefaultOptions() {
		return ddPerfilDefaultOptions;
	}

	public void setDdPerfilDefaultOptions(SingleSelectOptionsList ddPerfilDefaultOptions) {
		this.ddPerfilDefaultOptions = ddPerfilDefaultOptions;
	}
	
	public DropDown getDdPerfil() {
		return ddPerfil;
	}

	protected SessionBean1 getSessionBean1() {
		return (SessionBean1) getBean("SessionBean1");
	}

	public String filtrar_action() {

		Usuario usuario = getSessionBean1().getUsuario();
		CriterioListarUsuario criterio = new CriterioListarUsuario();

		try {

			if (ddPerfil.getSelected() != null)
				criterio.setCodPerfil(ddPerfil.getSelected());
			if (ddEntidadExterna.getSelected() != null)
				criterio.setCodEntidadExterna(ddEntidadExterna.getSelected());
			if (txtApellidos.getValue() != null)
				if (!txtApellidos.getValue().equals(""))
					criterio.setApellidos(txtApellidos.getValue());
			if (txtNombres.getValue() != null)
				if (!txtNombres.getValue().equals(""))
					criterio.setNombres(txtNombres.getValue());

			if (ddDistritoJudicial.getValue() != null)
				criterio.setCodDistritoJudicial(ddDistritoJudicial.getValue());

			getSessionBean1().getConsultaUsuario().refreshProvider(usuario, criterio);

		} catch (NamingException e) {
			info("Ha ocurrido un error de nombramiento de la fuente de datos.");
			logger.error("Ha ocurrido un error de nombramiento de la fuente de datos. Error: ", e);
		} catch (SQLException e) {
			info("Ha ocurrido un error de acceso a la base de datos.");
			logger.error("Ha ocurrido un error de acceso a la base de datos.error: ", e);
		} catch (Exception e) {
			info("Ha ocurrido un error en la ejecución de la consulta para obtener usuarios.");
			logger.error(
					"Ha ocurrido un error en la ejecución de la consulta para obtener usuarios. Error: ", e);
		}

		return null;

	}

	public String nuevo_action() {
		Usuario user = new Usuario();
		user.setFLAG_MANT("NEW");
//		user.setDESC_MOTIVO(Constantes.MSJ_NEW_USER);
		try {
			getSessionBean1().getEntidadExternasFilter().refreshProvider("0");
			getSessionBean1().getDepartamentoFilter().refreshProvider("%");
		} catch (SQLException sqlE) {
			logger.error("", sqlE);
		} catch (NamingException nE) {
			logger.error("", nE);
		} catch (Exception e) {
			logger.error("", e);
		}
		getSessionBean1().setUsuarioMant(user);
		return "successIngUsuario";
	}

	public String btnModificar_action() {
		UsuarioManager servicioUsuario = new UsuarioManager();
		RowKey rowkey = tableRowGroup1.getRowKey();
		String codigoUsuario = (String) getSessionBean1().getConsultaUsuario().getValue("CODG_USUAR", rowkey);
		//Usuario usuarioMant = getSessionBean1().getManager().selectByPrimaryKeyUsuario(codigoUsuario);
		Usuario usuarioMant = servicioUsuario.selecUsuario(codigoUsuario);
		usuarioMant.setFLAG_MANT("MOD");
		UsuarioCamposAud cau = new UsuarioCamposAud();
		cau.setAPLL_USUAR(usuarioMant.getAPLL_USUAR() + "");
		//		cau.setC_CLAVE("MODIFICACION");
		cau.setC_CLAVE("");
		cau.setC_PERFIL(usuarioMant.getC_PERFIL() == null ? "" : usuarioMant.getC_PERFIL());
		cau.setCOD_APLICACION(usuarioMant.getCOD_APLICACION() == null ? "" : usuarioMant.getCOD_APLICACION());
		cau.setCODG_DISTRITO_JUDICIAL(usuarioMant.getCODG_DISTRITO_JUDICIAL() == null ? "" : usuarioMant
				.getCODG_DISTRITO_JUDICIAL());
		cau.setCODG_ENTIDAD_EXTERNA(usuarioMant.getCODG_ENTIDAD_EXTERNA() == null ? 0 : usuarioMant
				.getCODG_ENTIDAD_EXTERNA());
		cau.setCODG_TIPO(usuarioMant.getCODG_TIPO() == null ? "" : usuarioMant.getCODG_TIPO());
		cau.setCODG_USUAR(usuarioMant.getCODG_USUAR() == null ? "" : usuarioMant.getCODG_USUAR());
		cau.setDESC_COREEO(usuarioMant.getDESC_COREEO() == null ? "" : usuarioMant.getDESC_COREEO());
		cau.setDESC_OBSERVACIONES(usuarioMant.getDESC_OBSERVACIONES() == null ? "" : usuarioMant.getDESC_OBSERVACIONES());
		cau.setDESC_TITULO(usuarioMant.getDESC_TITULO() == null ? "" : usuarioMant.getDESC_TITULO());
		cau.setESTD_USUAR(usuarioMant.getESTD_USUAR() == null ? "" : usuarioMant.getESTD_USUAR());
		cau.setNOMB_USUAR(usuarioMant.getNOMB_USUAR() == null ? "" : usuarioMant.getNOMB_USUAR());
		cau.setCODG_LUGAR(usuarioMant.getCODG_LUGAR() == null ? "" : usuarioMant.getCODG_LUGAR());
		cau.setNUME_JUZGA(usuarioMant.getNUME_JUZGA() == null ? "" : usuarioMant.getNUME_JUZGA());
		cau.setCODG_JUZGAD(usuarioMant.getCODG_JUZGAD() == null ? "" : usuarioMant.getCODG_JUZGAD());
//		cau.setDESC_MOTIVO(usuarioMant.getDESC_MOTIVO());
		usuarioMant.setCamposAudit(cau);

		try {
			getSessionBean1().getEntidadExternasFilter().refreshProvider(usuarioMant.getCODG_DISTRITO_JUDICIAL());
			getSessionBean1().getDepartamentoFilter().refreshProvider(usuarioMant.getCODG_DISTRITO_JUDICIAL());
		} catch (SQLException sqlE) {
			logger.error("", sqlE);
		} catch (NamingException nE) {
			logger.error("", nE);
		} catch (Exception e) {
			logger.error("", e);
		}

		getSessionBean1().setUsuarioMant(usuarioMant);
		return "successIngUsuario";
	}

	public TableColumn getTableColumn13() {
		return tableColumn13;
	}

	public void setTableColumn13(TableColumn tableColumn13) {
		this.tableColumn13 = tableColumn13;
	}

	public TableColumn getTableColumn14() {
		return tableColumn14;
	}

	public void setTableColumn14(TableColumn tableColumn14) {
		this.tableColumn14 = tableColumn14;
	}

	public StaticText getStaticText13() {
		return staticText13;
	}

	public void setStaticText13(StaticText staticText13) {
		this.staticText13 = staticText13;
	}

	public StaticText getStaticText14() {
		return staticText14;
	}

	public void setStaticText14(StaticText staticText14) {
		this.staticText14 = staticText14;
	}

	public UISelectItems getDropdown12SelectItems() {
		return dropdown12SelectItems;
	}

	public void setDropdown12SelectItems(UISelectItems dropdown12SelectItems) {
		this.dropdown12SelectItems = dropdown12SelectItems;
	}

	public void setDdEntidadExterna(DropDown ddEntidadExterna) {
		this.ddEntidadExterna = ddEntidadExterna;
	}

	public DropDown getDdEntidadExterna() {
		return ddEntidadExterna;
	}

	private TableColumn	tableColumn15	= new TableColumn();

	public TableColumn getTableColumn15() {
		return tableColumn15;
	}

	public void setTableColumn15(TableColumn tableColumn15) {
		this.tableColumn15 = tableColumn15;
	}
	
	private Button btnAuditar = new Button();

	public Button getBtnAuditar() {
		return btnAuditar;
	}

	public void setBtnAuditar(Button btnAuditar) {
		this.btnAuditar = btnAuditar;
	}

	public String btnAuditar_action() {
		
        try {
    		RowKey rowkey = tableRowGroup1.getRowKey();
    		String codigoUsuario = (String) getSessionBean1().getConsultaUsuario().getValue("CODG_USUAR", rowkey);
    		System.out.println("codigoUsuario="+codigoUsuario);
        	getSessionBean1().getConsultaAuditoriaUsuario().refreshProvider(codigoUsuario);
		} catch (Exception e) {
			logger.error("", e);
		}
		return "successAuditarUsuario";
	}
	
}