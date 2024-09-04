package uif;

import java.sql.SQLException;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UISelectItems;
import javax.faces.component.html.HtmlMessages;
import javax.faces.context.FacesContext;
import javax.faces.convert.DateTimeConverter;
import javax.faces.validator.ValidatorException;
import javax.naming.NamingException;
import com.sun.data.provider.RowKey;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Calendar;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import com.sun.rave.web.ui.component.PageSeparator;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.Table;
import com.sun.rave.web.ui.component.TableColumn;
import com.sun.rave.web.ui.component.TableRowGroup;
import com.sun.rave.web.ui.component.TextField;

import pe.gob.pj.rnc.criterio.CriterioListarSolicitud;
import pe.gob.pj.rnc.log.MyLogger;
import pe.gob.pj.rnc.model.Solicitud;
import pe.gob.pj.rnc.model.SolicitudExterna;
import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.rnc.msiap.util.Constantes;
import pe.gob.pj.util.Mensaje;

public class buscarSolicitudes extends AbstractPageBean {

	static MyLogger logger= new MyLogger(buscarSolicitudes.class.getName());
	
	private Page page1 = new Page();
	private Html html1 = new Html();
	private Head head1 = new Head();
	private Link link1 = new Link();
	private Link link2 = new Link();
	private Body body1 = new Body();
	private Form form1 = new Form();
	
	private Label label1 = new Label();
	private Label label2 = new Label();
	private Label label3 = new Label();
	private Label label4 = new Label();
	private Label label5 = new Label();
	private Label label6 = new Label();
	private Label label7 = new Label();
	private Label label8 = new Label();
	private Label label9 = new Label();
	private Label label10 = new Label();
	private Label label11 = new Label();
	private Label label12 = new Label();
	private Label lblEntidad = new Label();
	private Label lblTipoBusqueda = new Label();
	
	private Table table1 = new Table();
	private Table table2 = new Table();
	private TableRowGroup tableRowGroup1 = new TableRowGroup();
	private TableRowGroup tableRowGroup2 = new TableRowGroup();
	private TableColumn tableColumn1 = new TableColumn();
	private TableColumn tableColumn2 = new TableColumn();
	private TableColumn tableColumn3 = new TableColumn();
	private TableColumn tableColumn4 = new TableColumn();
	private TableColumn tableColumn5 = new TableColumn();
	private TableColumn tableColumn7 = new TableColumn();
	private TableColumn tableColumn11 = new TableColumn();
	private TableColumn tableColumn12 = new TableColumn();
	private TableColumn tableColumnNroSolicit = new TableColumn();
	private TableColumn tableColumnCodCerti = new TableColumn();
	private TableColumn tableColumnNroCerti = new TableColumn();
	private TableColumn tableColumn22 = new TableColumn();
	private TableColumn tableColumn23 = new TableColumn();
	private TableColumn tableColumn24 = new TableColumn();
	private TableColumn tableColumn25 = new TableColumn();
	private TableColumn tableColumn26 = new TableColumn();
	private TableColumn tableColumn27 = new TableColumn();
	private StaticText staticText1 = new StaticText();
	private StaticText staticText2 = new StaticText();
	private StaticText staticText3 = new StaticText();
	private StaticText staticText4 = new StaticText();
	private StaticText staticText6 = new StaticText();
	private StaticText staticText7 = new StaticText();
	private StaticText staticText8 = new StaticText();
	private StaticText staticText20 = new StaticText();
	private StaticText staticText21 = new StaticText();
	private StaticText staticText22 = new StaticText();
	private StaticText staticText23 = new StaticText();
	private StaticText staticText24 = new StaticText();
	private StaticText staticText25 = new StaticText();
	private StaticText staticText26 = new StaticText();

	private DateTimeConverter dateTimeConverter1 = new DateTimeConverter();
	private PageSeparator pageSeparator1 = new PageSeparator();
	private PageSeparator pageSeparator2 = new PageSeparator();
	//private Script script1 = new Script();
	
	private Button btnExterna = new Button();
	private Button btnInterna = new Button();
	private Button btnRegistro = new Button();
	private Button btnVerA = new Button();
	private Button btnVerB = new Button();
	private Button btnVerC = new Button();
	private Button btnDetalle = new Button();
	private Button btnBuscar = new Button();
	//private Button btnAuditoria = new Button();

	private HtmlMessages messageList1 = new HtmlMessages();
	private Calendar calDesde = new Calendar();
	private Calendar calHasta = new Calendar();
	private TextField txtPaterno = new TextField();
	private TextField txtMaterno = new TextField();
	private TextField txtNombres = new TextField();
	private TextField txtNroCertificado = new TextField();
	private TextField txtNroOficio = new TextField();
	private TextField txtNroSolicitud = new TextField();
	private UISelectItems selectItemsEntidad = new UISelectItems();
	private UISelectItems selectItemsEstados = new UISelectItems();
	private String codEntidad;
	private String codEstado;
	private String codEstadoSolicitud;

	public buscarSolicitudes() {
	}

	private void _init() throws Exception {
		dateTimeConverter1.setLocale(new java.util.Locale("es", "PE"));
		dateTimeConverter1.setPattern("dd/MM/yyyy HH:mm:ss");
		dateTimeConverter1.setTimeZone(java.util.TimeZone.getTimeZone("America/Lima"));
	}

	/**
	 * <p>
	 * Callback method that is called whenever a page is navigated to, either directly via a URL, or indirectly via page navigation. Customize this method to acquire resources
	 * that will be needed for event handlers and lifecycle methods, whether or not this page is performing post back processing.
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
		
		try {
			getSessionBean1().getEntidadExternas().consultarEntidades(null);
			//listaUsuarios = (List<Usuario>) getSessionBean1().getUsuarios().consultarUsuarios(null, null);
			//getSessionBean1().setSolicitudes(null);
			String tipoBusqueda = getSessionBean1().getTipoBusqueda();
			if(tipoBusqueda==null)
				getSessionBean1().setTipoBusqueda(Constantes.TIPO_BUSQUEDA_EXTERNA);

		} catch (Exception e) {
			info("Ha ocurrido un error en la ejecución de la consulta para obtener los usuarios.");
			log("error: " + e.getMessage());
		}
		//Usuario usuario = getSessionBean1().getUsuario();
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

	public void txtNombres_validate(FacesContext context, UIComponent component, Object value) {
		String s = String.valueOf(value);
		if (s != null && ! s.equals(""))
			if (!s.matches("[A-Za-zãÃñÑäëïöüÿÄËÏÖÜáéíóúÁÉÍÓÚ.']+[A-Za-zãÃñÑäëïöüÿÄËÏÖÜáéíóúÁÉÍÓÚ.'\\-\\s]*[A-Za-zãÃñÑäëïöüÿÄËÏÖÜáéíóúÁÉÍÓÚ.']*") && !s.matches("[\\*]{3}")) { throw new ValidatorException(
				new FacesMessage("El campo nombre contiene caracteres inválidos!")); }
	}

	//TODO Acciones de botones
	public String btnExterna_action() {
		getSessionBean1().getSolicitudesExternas().limpiarSolicitudesExternas();
		getSessionBean1().getSolicitudInterna().limpiarSolicitudesInternas();
		getSessionBean1().setTipoBusqueda(Constantes.TIPO_BUSQUEDA_EXTERNA);
		return null;
	}

	public String btnInterna_action() {
		getSessionBean1().getSolicitudesExternas().limpiarSolicitudesExternas();
		getSessionBean1().getSolicitudInterna().limpiarSolicitudesInternas();
		getSessionBean1().setTipoBusqueda(Constantes.TIPO_BUSQUEDA_INTERNA);
		return null;
	}
	
	public String btnBuscar_action() {
		try {
			java.util.Calendar cal = new GregorianCalendar();
			if (calDesde.getValue() == null) {
				cal = new GregorianCalendar();
				calHasta.setValue(cal.getTime());
				cal.add(java.util.Calendar.MONTH, -3);
				calDesde.setValue(cal.getTime());
			} else if (calHasta.getValue() == null) {
				cal = new GregorianCalendar();
				calHasta.setValue(cal.getTime());
			}

			Usuario usuario = getSessionBean1().getUsuario();
			CriterioListarSolicitud criterio = new CriterioListarSolicitud();
			String tipoBusqueda=getSessionBean1().getTipoBusqueda();
			criterio.setFechaInicial((java.util.Date) calDesde.getValue());
			criterio.setFechaFinal((java.util.Date) calHasta.getValue());
			
			boolean flagNombres = false;
			boolean flagNroOficio = false;
			boolean flagNroSolicitante = false;
			boolean flagNroCertificado = false;
			
			if (txtPaterno.getValue() != null)
				if (!txtPaterno.getValue().equals("")) {
					criterio.setApellidoPaterno(txtPaterno.getValue().toString().toUpperCase());
					txtPaterno.setValue("");
					flagNombres=true;
				}

			if (txtMaterno.getValue() != null)
				if (!txtMaterno.getValue().equals("")) {
					criterio.setApellidoMaterno(txtMaterno.getValue().toString().toUpperCase());
					txtMaterno.setValue("");
					flagNombres=true;
				}

			if (txtNombres.getValue() != null)
				if (!txtNombres.getValue().equals("")) {
					criterio.setNombre(txtNombres.getValue().toString().toUpperCase());
					txtNombres.setValue("");
					flagNombres=true;
				}

			criterio.setCodigoUsuario("%");

			if(tipoBusqueda.equals(Constantes.TIPO_BUSQUEDA_EXTERNA)) {
				Integer entidad = new Integer(codEntidad);
				if(entidad.intValue()==0) {
					warn("Debe seleccionar la Entidad");
					return null;
				}
				criterio.setIdEntidadExterna(entidad);
				if(codEstado!=null)
					criterio.setEstado(codEstado);
				
				if (txtNroOficio.getValue() != null && !txtNroOficio.getValue().equals("")) {
					criterio.setNroOficio(txtNroOficio.getValue().toString());
					txtNroOficio.setValue("");
					flagNroOficio = true;
				}
				if (txtNroSolicitud.getValue() != null && !txtNroSolicitud.getValue().equals("")) {
					Integer nroSolicitud = new Integer(txtNroSolicitud.getValue().toString());
					criterio.setNroSolicitud(nroSolicitud);
					txtNroSolicitud.setValue("");
					flagNroSolicitante = true;
				}
				
				if(flagNombres || flagNroOficio || flagNroSolicitante) {
					cal = new GregorianCalendar();
					cal.add(java.util.Calendar.MONTH, -3);
					Date inicio = (Date)calDesde.getValue();
					if(inicio.getTime()<=cal.getTime().getTime()) {
						criterio.setFechaInicial(inicio);
					}else {
						criterio.setFechaInicial(cal.getTime());
					}
				}
				getSessionBean1().getSolicitudesExternas().consultarSolicitudesExternas(usuario, criterio);				

			}else {
				if(codEstadoSolicitud!=null)
					criterio.setEstadoSolicitud(codEstadoSolicitud);

				if (txtNroCertificado.getValue() != null && !txtNroCertificado.getValue().equals("")) {
					criterio.setNroCertificado(txtNroCertificado.getValue().toString());
					txtNroCertificado.setValue("");
					flagNroCertificado=true;
				}
				
				if(flagNombres  || flagNroCertificado) {
					cal = new GregorianCalendar();
					cal.add(java.util.Calendar.MONTH, -3);
					Date inicio = (Date)calDesde.getValue();
					if(inicio.getTime()<=cal.getTime().getTime()) {
						criterio.setFechaInicial(inicio);
					}else {
						criterio.setFechaInicial(cal.getTime());
					}
				}
				getSessionBean1().getSolicitudInterna().consultarSolicitudesInternas(usuario, criterio);
			
			}
			getSessionBean1().setSolicitudes(null);

		} catch (NamingException e) {
			info("Ha ocurrido un error de nombreamiento de la fuente de datos.");
			log("error: " + e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			info("Ha ocurrido un error de acceso a la base de datos.");
			log("error: " + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			info("Ha ocurrido un error en la ejecución de la consulta para obtener sus solicitudes ingresadas.");
			log("error: " + e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	public String btnVerA_action() {
		try {
			RowKey rowkey = tableRowGroup1.getRowKey();
			getSessionBean1().setParametroEntero((SolicitudExterna) getSessionBean1().getSolicitudesExternas().getObject(rowkey));
			getSessionBean1().setAccesoReporte(true);
			FacesContext.getCurrentInstance().getExternalContext().redirect("repPrimario");
		} catch (Exception e) {
			log("Problema generar el oficio A " + e.getMessage());
			error("Problema generar el oficio A");
		}
		return null; //"repPrimario";
	}

	public String btnVerB_action() {
		try {
			RowKey rowkey = tableRowGroup1.getRowKey();
			getSessionBean1().setParametroEntero((SolicitudExterna) getSessionBean1().getSolicitudesExternas().getObject(rowkey));
			getSessionBean1().setAccesoReporte(true);
			getSessionBean1().repSecundarioAppBean();
		} catch (Exception e) {
			log("Problema generar el oficio B " + e.getMessage());
			error("Problema generar el oficio B");
		}
		return null;
	}

	/* 	public String btnAuditoria_action() {
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
	}*/
	
	public String btnVerC_action() {

		RowKey rowkey = tableRowGroup2.getRowKey();
		String codigoCerti = (String) getSessionBean1().getSolicitudInterna().getValue("CODG_CERTI", rowkey);
		Solicitud solicitud = (Solicitud) getSessionBean1().getSolicitudInterna().getObject(rowkey);
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
		} else if (solicitud.getL_INDC_OFICIO().equals("S")) {
			error("Solicitud Observada - Descarte Pendiente");
			return null;
		}
		getSessionBean1().setCodigoCerti(codigoCerti);
		getSessionBean1().setAccesoReporte(true);
		getSessionBean1().setFlagImp(true);
		return "repImpresion";
	}

	//TODO Configuracion
	public String getColumnStyle() {
		RowKey rowKey = tableRowGroup1.getRowKey();
		if(rowKey==null) return " ";
		if ((Integer.parseInt(rowKey.getRowId()) % 2) == 0) {
			return " ";
		} else {
			return "background-color: #eeeeee";
		}
	}

	public String getColor() {
		return "color: rgb(153, 0, 0); font-weight: bold;";
	}
	
	public String getColorExterna() {
		String tipoBusqueda=getSessionBean1().getTipoBusqueda();
		String color = "";
		if(tipoBusqueda.equals(Constantes.TIPO_BUSQUEDA_EXTERNA)) 
			color = "color: rgb(153, 0, 0); font-weight: bold;";
		return color; 
	}
	
	public String getColorInterna() {
		String tipoBusqueda=getSessionBean1().getTipoBusqueda();
		String color = "";
		if(tipoBusqueda.equals(Constantes.TIPO_BUSQUEDA_INTERNA)) 
			color = "color: rgb(153, 0, 0); font-weight: bold;";
		return color; 
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

	protected fragHeader getfragHeader() {
		return (fragHeader) getBean("fragHeader");
	}

	protected fraHeader getfraHeader() {
		return (fraHeader) getBean("fraHeader");
	}

	//TODO Funciones get y set
	public Page getPage1() {
		return page1;
	}

	public void setPage1(Page page1) {
		this.page1 = page1;
	}

	public Html getHtml1() {
		return html1;
	}

	public void setHtml1(Html html1) {
		this.html1 = html1;
	}

	public Head getHead1() {
		return head1;
	}

	public void setHead1(Head head1) {
		this.head1 = head1;
	}

	public Link getLink1() {
		return link1;
	}

	public void setLink1(Link link1) {
		this.link1 = link1;
	}

	public Link getLink2() {
		return link2;
	}

	public void setLink2(Link link2) {
		this.link2 = link2;
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

	public HtmlMessages getMessageList1() {
		return messageList1;
	}

	public void setMessageList1(HtmlMessages messageList1) {
		this.messageList1 = messageList1;
	}

	public Calendar getCalDesde() {
		return calDesde;
	}

	public void setCalDesde(Calendar calDesde) {
		this.calDesde = calDesde;
	}

	public Calendar getCalHasta() {
		return calHasta;
	}

	public void setCalHasta(Calendar calHasta) {
		this.calHasta = calHasta;
	}

	public TextField getTxtPaterno() {
		return txtPaterno;
	}

	public void setTxtPaterno(TextField txtPaterno) {
		this.txtPaterno = txtPaterno;
	}

	public TextField getTxtMaterno() {
		return txtMaterno;
	}

	public void setTxtMaterno(TextField txtMaterno) {
		this.txtMaterno = txtMaterno;
	}

	public TextField getTxtNombres() {
		return txtNombres;
	}

	public void setTxtNombres(TextField txtNombres) {
		this.txtNombres = txtNombres;
	}

	public TextField getTxtNroCertificado() {
		return txtNroCertificado;
	}

	public void setTxtNroCertificado(TextField txtNroCertificado) {
		this.txtNroCertificado = txtNroCertificado;
	}

	public TextField getTxtNroOficio() {
		return txtNroOficio;
	}

	public void setTxtNroOficio(TextField txtNroOficio) {
		this.txtNroOficio = txtNroOficio;
	}

	public Label getLabel1() {
		return label1;
	}

	public void setLabel1(Label label1) {
		this.label1 = label1;
	}

	public Label getLabel2() {
		return label2;
	}

	public void setLabel2(Label label2) {
		this.label2 = label2;
	}

	public Label getLabel3() {
		return label3;
	}

	public void setLabel3(Label label3) {
		this.label3 = label3;
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

	public Label getLabel6() {
		return label6;
	}

	public void setLabel6(Label label6) {
		this.label6 = label6;
	}

	public Label getLabel7() {
		return label7;
	}

	public void setLabel7(Label label7) {
		this.label7 = label7;
	}

	public Label getLabel8() {
		return label8;
	}

	public void setLabel8(Label label8) {
		this.label8 = label8;
	}

	public Label getLabel9() {
		return label9;
	}

	public void setLabel9(Label label9) {
		this.label9 = label9;
	}

	public Label getLabel11() {
		return label11;
	}

	public void setLabel11(Label label11) {
		this.label11 = label11;
	}

	public Label getLabel12() {
		return label12;
	}

	public void setLabel12(Label label12) {
		this.label12 = label12;
	}

	public Label getLblTipoBusqueda() {
		return lblTipoBusqueda;
	}

	public void setLblTipoBusqueda(Label lblTipoBusqueda) {
		this.lblTipoBusqueda = lblTipoBusqueda;
	}

	public Button getBtnRegistro() {
		return btnRegistro;
	}

	public void setBtnRegistro(Button btnRegistro) {
		this.btnRegistro = btnRegistro;
	}

	public Button getBtnVerA() {
		return btnVerA;
	}

	public void setBtnVerA(Button btnVerA) {
		this.btnVerA = btnVerA;
	}

	public Button getBtnVerB() {
		return btnVerB;
	}

	public void setBtnVerB(Button btnVerB) {
		this.btnVerB = btnVerB;
	}

	public Table getTable1() {
		return table1;
	}

	public void setTable1(Table table1) {
		this.table1 = table1;
	}

	public TableRowGroup getTableRowGroup1() {
		return tableRowGroup1;
	}

	public void setTableRowGroup1(TableRowGroup tableRowGroup1) {
		this.tableRowGroup1 = tableRowGroup1;
	}

	public TableColumn getTableColumn1() {
		return tableColumn1;
	}

	public void setTableColumn1(TableColumn tableColumn1) {
		this.tableColumn1 = tableColumn1;
	}

	public TableColumn getTableColumn2() {
		return tableColumn2;
	}

	public void setTableColumn2(TableColumn tableColumn2) {
		this.tableColumn2 = tableColumn2;
	}

	public TableColumn getTableColumn3() {
		return tableColumn3;
	}

	public void setTableColumn3(TableColumn tableColumn3) {
		this.tableColumn3 = tableColumn3;
	}

	public TableColumn getTableColumn4() {
		return tableColumn4;
	}

	public void setTableColumn4(TableColumn tableColumn4) {
		this.tableColumn4 = tableColumn4;
	}

	public TableColumn getTableColumn5() {
		return tableColumn5;
	}

	public void setTableColumn5(TableColumn tableColumn5) {
		this.tableColumn5 = tableColumn5;
	}

	public TableColumn getTableColumn7() {
		return tableColumn7;
	}

	public void setTableColumn7(TableColumn tableColumn7) {
		this.tableColumn7 = tableColumn7;
	}

	public TableColumn getTableColumn11() {
		return tableColumn11;
	}

	public void setTableColumn11(TableColumn tableColumn11) {
		this.tableColumn11 = tableColumn11;
	}

	public TableColumn getTableColumn12() {
		return tableColumn12;
	}

	public void setTableColumn12(TableColumn tableColumn12) {
		this.tableColumn12 = tableColumn12;
	}

	public TableColumn getTableColumnNroSolicit() {
		return tableColumnNroSolicit;
	}

	public void setTableColumnNroSolicit(TableColumn tableColumnNroSolicit) {
		this.tableColumnNroSolicit = tableColumnNroSolicit;
	}

	public StaticText getStaticText1() {
		return staticText1;
	}

	public void setStaticText1(StaticText staticText1) {
		this.staticText1 = staticText1;
	}

	public StaticText getStaticText2() {
		return staticText2;
	}

	public void setStaticText2(StaticText staticText2) {
		this.staticText2 = staticText2;
	}

	public StaticText getStaticText3() {
		return staticText3;
	}

	public void setStaticText3(StaticText staticText3) {
		this.staticText3 = staticText3;
	}

	public StaticText getStaticText4() {
		return staticText4;
	}

	public void setStaticText4(StaticText staticText4) {
		this.staticText4 = staticText4;
	}

	public StaticText getStaticText6() {
		return staticText6;
	}

	public void setStaticText6(StaticText staticText6) {
		this.staticText6 = staticText6;
	}

	public StaticText getStaticText7() {
		return staticText7;
	}

	public void setStaticText7(StaticText staticText7) {
		this.staticText7 = staticText7;
	}

	public StaticText getStaticText8() {
		return staticText8;
	}

	public void setStaticText8(StaticText staticText8) {
		this.staticText8 = staticText8;
	}

	public DateTimeConverter getDateTimeConverter1() {
		return dateTimeConverter1;
	}

	public void setDateTimeConverter1(DateTimeConverter dateTimeConverter1) {
		this.dateTimeConverter1 = dateTimeConverter1;
	}

	public PageSeparator getPageSeparator1() {
		return pageSeparator1;
	}

	public void setPageSeparator1(PageSeparator pageSeparator1) {
		this.pageSeparator1 = pageSeparator1;
	}

	public PageSeparator getPageSeparator2() {
		return pageSeparator2;
	}

	public void setPageSeparator2(PageSeparator pageSeparator2) {
		this.pageSeparator2 = pageSeparator2;
	}

	public Button getBtnExterna() {
		return btnExterna;
	}

	public void setBtnExterna(Button btnExterna) {
		this.btnExterna = btnExterna;
	}

	public Button getBtnInterna() {
		return btnInterna;
	}

	public void setBtnInterna(Button btnInterna) {
		this.btnInterna = btnInterna;
	}

	public Button getBtnDetalle() {
		return btnDetalle;
	}

	public void setBtnDetalle(Button btnDetalle) {
		this.btnDetalle = btnDetalle;
	}

	public Table getTable2() {
		return table2;
	}

	public void setTable2(Table table2) {
		this.table2 = table2;
	}

	public TableRowGroup getTableRowGroup2() {
		return tableRowGroup2;
	}

	public void setTableRowGroup2(TableRowGroup tableRowGroup2) {
		this.tableRowGroup2 = tableRowGroup2;
	}

	public TableColumn getTableColumnCodCerti() {
		return tableColumnCodCerti;
	}

	public void setTableColumnCodCerti(TableColumn tableColumnCodCerti) {
		this.tableColumnCodCerti = tableColumnCodCerti;
	}

	public TableColumn getTableColumnNroCerti() {
		return tableColumnNroCerti;
	}

	public void setTableColumnNroCerti(TableColumn tableColumnNroCerti) {
		this.tableColumnNroCerti = tableColumnNroCerti;
	}

	public TableColumn getTableColumn22() {
		return tableColumn22;
	}

	public void setTableColumn22(TableColumn tableColumn22) {
		this.tableColumn22 = tableColumn22;
	}

	public TableColumn getTableColumn23() {
		return tableColumn23;
	}

	public void setTableColumn23(TableColumn tableColumn23) {
		this.tableColumn23 = tableColumn23;
	}

	public TableColumn getTableColumn24() {
		return tableColumn24;
	}

	public void setTableColumn24(TableColumn tableColumn24) {
		this.tableColumn24 = tableColumn24;
	}

	public TableColumn getTableColumn25() {
		return tableColumn25;
	}

	public void setTableColumn25(TableColumn tableColumn25) {
		this.tableColumn25 = tableColumn25;
	}

	public TableColumn getTableColumn26() {
		return tableColumn26;
	}

	public void setTableColumn26(TableColumn tableColumn26) {
		this.tableColumn26 = tableColumn26;
	}

	public TableColumn getTableColumn27() {
		return tableColumn27;
	}

	public void setTableColumn27(TableColumn tableColumn27) {
		this.tableColumn27 = tableColumn27;
	}

	public StaticText getStaticText20() {
		return staticText20;
	}

	public void setStaticText20(StaticText staticText20) {
		this.staticText20 = staticText20;
	}

	public StaticText getStaticText21() {
		return staticText21;
	}

	public void setStaticText21(StaticText staticText21) {
		this.staticText21 = staticText21;
	}

	public StaticText getStaticText22() {
		return staticText22;
	}

	public void setStaticText22(StaticText staticText22) {
		this.staticText22 = staticText22;
	}

	public StaticText getStaticText23() {
		return staticText23;
	}

	public void setStaticText23(StaticText staticText23) {
		this.staticText23 = staticText23;
	}

	public StaticText getStaticText24() {
		return staticText24;
	}

	public void setStaticText24(StaticText staticText24) {
		this.staticText24 = staticText24;
	}

	public StaticText getStaticText25() {
		return staticText25;
	}

	public void setStaticText25(StaticText staticText25) {
		this.staticText25 = staticText25;
	}

	public StaticText getStaticText26() {
		return staticText26;
	}

	public void setStaticText26(StaticText staticText26) {
		this.staticText26 = staticText26;
	}

	public Label getLabel10() {
		return label10;
	}

	public void setLabel10(Label label10) {
		this.label10 = label10;
	}

	public String getCodEntidad() {
		return codEntidad;
	}

	public void setCodEntidad(String codEntidad) {
		this.codEntidad = codEntidad;
	}

	public Label getLblEntidad() {
		return lblEntidad;
	}

	public void setLblEntidad(Label lblEntidad) {
		this.lblEntidad = lblEntidad;
	}

	public Button getBtnVerC() {
		return btnVerC;
	}

	public void setBtnVerC(Button btnVerC) {
		this.btnVerC = btnVerC;
	}

	public String getCodEstadoSolicitud() {
		return codEstadoSolicitud;
	}

	public void setCodEstadoSolicitud(String codEstadoSolicitud) {
		this.codEstadoSolicitud = codEstadoSolicitud;
	}

	public String getCodEstado() {
		return codEstado;
	}

	public void setCodEstado(String codEstado) {
		this.codEstado = codEstado;
	}

	public UISelectItems getSelectItemsEstados() {
		return selectItemsEstados;
	}

	public void setSelectItemsEstados(UISelectItems selectItemsEstados) {
		this.selectItemsEstados = selectItemsEstados;
	}

	public UISelectItems getSelectItemsEntidad() {
		return selectItemsEntidad;
	}

	public void setSelectItemsEntidad(UISelectItems selectItemsEntidad) {
		this.selectItemsEntidad = selectItemsEntidad;
	}

	public Button getBtnBuscar() {
		return btnBuscar;
	}

	public void setBtnBuscar(Button btnBuscar) {
		this.btnBuscar = btnBuscar;
	}

	public TextField getTxtNroSolicitud() {
		return txtNroSolicitud;
	}

	public void setTxtNroSolicitud(TextField txtNroSolicitud) {
		this.txtNroSolicitud = txtNroSolicitud;
	}
	
}