/*
 * admSolicitud.java
 *
 * Created on 27 de febrero de 2007, 07:24 AM
 * Copyright user
 */
package uif;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.FacesException;
import javax.faces.component.UIComponent;
import javax.faces.component.UISelectItems;
import javax.faces.component.html.HtmlMessages;
import javax.faces.component.html.HtmlSelectBooleanCheckbox;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.context.FacesContext;
import javax.faces.convert.DateTimeConverter;
import javax.faces.event.ValueChangeEvent;
import javax.servlet.ServletContext;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import pe.gob.pj.rnc.log.MyLogger;
import pe.gob.pj.rnc.model.Perfil;
import pe.gob.pj.rnc.model.SolicitudReporte;
import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.rnc.service.Soporte;
import pe.gob.pj.rnc.web.service.SolicitudManager;

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
import com.sun.rave.web.ui.component.StaticText;

import com.sun.rave.web.ui.model.SingleSelectOptionsList;

/**
 * <p>
 * Page bean that corresponds to a similarly named JSP page. This class contains
 * component definitions (and initialization code) for all components that you
 * have defined on this page, as well as lifecycle methods and event handlers
 * where you may add behavior to respond to incoming events.
 * </p>
 */
public class AdmReporteInterno extends AbstractPageBean {
	static MyLogger logger= new MyLogger(AdmReporteInterno.class.getName());

	/**
	 * <p>
	 * Automatically managed component initialization. <strong>WARNING:</strong>
	 * This method is automatically generated, so any user-specified code
	 * inserted here is subject to being replaced.
	 * </p>
	 */
	private void _init() throws Exception {

		dateTimeConverter1.setLocale(new java.util.Locale("es", "PE"));
		dateTimeConverter1.setPattern("dd/MM/yyyy");
		dateTimeConverter1.setTimeZone(java.util.TimeZone
				.getTimeZone("America/Lima"));
		/*ddFormatoDefaultOptions
				.setOptions(new com.sun.rave.web.ui.model.Option[] {
						new com.sun.rave.web.ui.model.Option("2", "PDF"),
						new com.sun.rave.web.ui.model.Option("3", "Excel") });*/

		Usuario usuario = getSessionBean1().getUsuario();
		if (usuario.isPerfilAdministrador()) {
			ddReporteDefaultOptions.setOptions(new com.sun.rave.web.ui.model.Option[] {
					new com.sun.rave.web.ui.model.Option("1",
							"LISTADO DE SOLICITUDES - DETALLADO"),
					new com.sun.rave.web.ui.model.Option("2",
							"LISTADO DE SOLICITUDES - CONSOLIDADO"),
					new com.sun.rave.web.ui.model.Option("3",
							"ESTADÍSTICA DE CERTIFICADOS"),
					new com.sun.rave.web.ui.model.Option("4",
							"LISTADO DE SOLICITUDES POR USUARIO - CONSOLIDADO") });
		}else{
			if(!Perfil.MPFN_FISCAL.equals(usuario.getC_PERFIL()))
				ddReporteDefaultOptions.setOptions(new com.sun.rave.web.ui.model.Option[] {
					new com.sun.rave.web.ui.model.Option("1","LISTADO DE SOLICITUDES - DETALLADO"),
					new com.sun.rave.web.ui.model.Option("2","LISTADO DE SOLICITUDES - CONSOLIDADO") });
			else
				ddReporteDefaultOptions.setOptions(new com.sun.rave.web.ui.model.Option[] {
						new com.sun.rave.web.ui.model.Option("1","LISTADO DE SOLICITUDES - DETALLADO") });

		}
		if(((Usuario)getSessionBean1().getUsuarioDistritoJudicial().getList().get(0)).getCODG_USUAR()==null)
			getSessionBean1().getUsuarioDistritoJudicial().refreshProvider(usuario, (usuario.isPerfilSupervisorJudicial()?usuario.getCODG_DISTRITO_JUDICIAL():"%"));
			//getSessionBean1().getUsuarioDistritoJudicial().refreshProvider(null, "");

		if(Perfil.ADMINISTRADOR_ID.equals(usuario.getCOD_PERFIL()) && Perfil.COD_DISTRITO_JUDICIAL_CONDENAS.equals(usuario.getCODG_DISTRITO_JUDICIAL())){
			if(getSessionBean1().getDistritoJudicialInterno().getList().size()<=1) getSessionBean1().getDistritoJudicialInterno().refreshProvider();
			if(getSessionBean1().getEstadoSolicitudTotal().getList().size() <= 1) getSessionBean1().getEstadoSolicitudTotal().refreshProvider();
		}
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

	private Page page1 = new Page();
	private HtmlSelectBooleanCheckbox checkPenImp = new HtmlSelectBooleanCheckbox();

	private HtmlSelectBooleanCheckbox checkImp = new HtmlSelectBooleanCheckbox();

	private HtmlSelectBooleanCheckbox checkObs = new HtmlSelectBooleanCheckbox();


	private UISelectItems dropdown11SelectItems = new UISelectItems();

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

	private HtmlMessages messageList1 = new HtmlMessages();

	public HtmlMessages getMessageList1() {
		return messageList1;
	}

	public void setMessageList1(HtmlMessages hm) {
		this.messageList1 = hm;
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

	private Label label1 = new Label();

	public Label getLabel1() {
		return label1;
	}

	public void setLabel1(Label l) {
		this.label1 = l;
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

	private Label label8 = new Label();

	public Label getLabel8() {
		return label8;
	}

	public void setLabel8(Label l) {
		this.label8 = l;
	}

	private Button btnGenerarReporte = new Button();

	public Button getBtnGenerarReporte() {
		return btnGenerarReporte;
	}

	public void setBtnGenerarReporte(Button b) {
		this.btnGenerarReporte = b;
	}

	private DateTimeConverter dateTimeConverter1 = new DateTimeConverter();

	public DateTimeConverter getDateTimeConverter1() {
		return dateTimeConverter1;
	}

	public void setDateTimeConverter1(DateTimeConverter dtc) {
		this.dateTimeConverter1 = dtc;
	}

	private DropDown ddUsuarios = new DropDown();

	public DropDown getDdUsuarios() {
		return ddUsuarios;
	}

	public void setDdUsuarios(DropDown dd) {
		this.ddUsuarios = dd;
	}

	private Label lblUsuario = new Label();

	private Label lblDistritoJudicial = new Label();

	public Label getLblUsuario() {
		return lblUsuario;
	}

	public void setLblUsuario(Label l) {
		this.lblUsuario = l;
	}

/*	private DropDown ddFormato = new DropDown();

	public DropDown getDdFormato() {
		return ddFormato;
	}

	public void setDdFormato(DropDown dd) {
		this.ddFormato = dd;
	}

	private SingleSelectOptionsList ddFormatoDefaultOptions = new SingleSelectOptionsList();

	public SingleSelectOptionsList getDdFormatoDefaultOptions() {
		return ddFormatoDefaultOptions;
	}

	public void setDdFormatoDefaultOptions(SingleSelectOptionsList ssol) {
		this.ddFormatoDefaultOptions = ssol;
	}*/

	private HtmlSelectOneMenu ddDistritoJudicial = new HtmlSelectOneMenu();


	private Label label10 = new Label();

	public Label getLabel10() {
		return label10;
	}

	public void setLabel10(Label l) {
		this.label10 = l;
	}

	private Label label2 = new Label();

	public Label getLabel2() {
		return label2;
	}

	public void setLabel2(Label l) {
		this.label2 = l;
	}

	private DropDown ddReporte = new DropDown();

	public DropDown getDdReporte() {
		return ddReporte;
	}

	public void setDdReporte(DropDown dd) {
		this.ddReporte = dd;
	}

	private SingleSelectOptionsList ddReporteDefaultOptions = new SingleSelectOptionsList();

	public SingleSelectOptionsList getDdReporteDefaultOptions() {
		return ddReporteDefaultOptions;
	}

	public void setDdReporteDefaultOptions(SingleSelectOptionsList ssol) {
		this.ddReporteDefaultOptions = ssol;
	}

	private Label label11 = new Label();

	public Label getLabel11() {
		return label11;
	}

	public void setLabel11(Label l) {
		this.label11 = l;
	}

	private StaticText staticText1 = new StaticText();

	public StaticText getStaticText1() {
		return staticText1;
	}

	public void setStaticText1(StaticText st) {
		this.staticText1 = st;
	}

	private PageSeparator pageSeparator1 = new PageSeparator();

	public PageSeparator getPageSeparator1() {
		return pageSeparator1;
	}

	public void setPageSeparator1(PageSeparator ps) {
		this.pageSeparator1 = ps;
	}

	private Button btnVolver = new Button();

	public Button getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(Button b) {
		this.btnVolver = b;
	}

	/**
	 * <p>
	 * Construct a new Page bean instance.
	 * </p>
	 */
	public AdmReporteInterno() {
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
			logger.error("admSolicitud Initialization Failure",e);
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

		Usuario usuario = getSessionBean1().getUsuario();
		if (usuario.isPerfilAdministrador() || usuario.isPerfilSupervisor()) {
			//System.out.println("ingreso admini");
			ddUsuarios.setRendered(true);
			lblUsuario.setRendered(true);
			lblDistritoJudicial.setRendered(true);
			ddDistritoJudicial.setRendered(true);
			dropdown11SelectItems.setRendered(true);
			ddEstado.setRendered(true);
			label8.setRendered(true);

		}
		if (usuario.isPerfilOperador() || usuario.isPerfilOperadorJudicial() || Perfil.MPFN_FISCAL.equals(usuario.getC_PERFIL())) {
			//System.out.println("ingreso ioperador");
			ddUsuarios.setRendered(false);
			lblUsuario.setRendered(false);
			lblDistritoJudicial.setRendered(false);
			ddDistritoJudicial.setRendered(false);
			dropdown11SelectItems.setRendered(false);
			ddEstado.setRendered(false);
			label8.setRendered(false);


		}
		if(usuario.isPerfilSupervisorJudicial()){
			//System.out.println("ingreso super");
			ddUsuarios.setRendered(true);
			lblUsuario.setRendered(true);
			lblDistritoJudicial.setRendered(false);
			ddDistritoJudicial.setRendered(false);
			dropdown11SelectItems.setRendered(false);
			ddEstado.setRendered(false);
			label8.setRendered(false);

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

	public String linkAction2_action() {
		return "case3";
	}

	public void txtPaterno_processValueChange(ValueChangeEvent event) {

	}

	public void calDesde_validate(FacesContext context, UIComponent component,
			Object value) {

	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public String btnGenerarReporte_action() {
		Map mapa = new HashMap();
		Connection con = null;
		SolicitudManager servicioSolicitud = getSessionBean1().getManager();
		boolean getConnection = true;
		try {
			Usuario usuario = getSessionBean1().getUsuario();

			ServletContext theApplicationsServletContext = (ServletContext) this
					.getExternalContext().getContext();
			String realPath = theApplicationsServletContext
					.getRealPath(Soporte.REPORTE_DIRECTORIO);

			String idDistritoJudicial = (ddDistritoJudicial.getValue() == null ? usuario.getCODG_DISTRITO_JUDICIAL(): (String) ddDistritoJudicial.getValue());
			String codUsuario = (ddUsuarios.getSelected() == null ? usuario.getCODG_USUAR() : (String) ddUsuarios.getSelected());

			String codJuzgado="%";
			String codDpto="%";
			String numJuzgado="%";
			if (usuario.isPerfilOperadorJudicial() || usuario.isPerfilSupervisorJudicial()) {
				idDistritoJudicial = usuario.getCODG_DISTRITO_JUDICIAL();
				codJuzgado=usuario.getCODG_JUZGAD();
				codDpto=usuario.getCODG_LUGAR();
				numJuzgado=usuario.getNUME_JUZGA();
			}
			if(usuario.isPerfilOperadorJudicial())
				codUsuario = usuario.getCODG_USUAR();


			java.util.Calendar cal = new GregorianCalendar();

			if (calHasta.getValue() == null)
				calHasta.setValue(cal.getTime());
			if (calDesde.getValue() == null)
				calDesde.setValue(cal.getTime());

			java.sql.Timestamp dateFecha = new java.sql.Timestamp(
					((Date) calHasta.getValue()).getTime());
			dateFecha.setHours(23);
			dateFecha.setMinutes(59);
			dateFecha.setSeconds(59);

			String codEstado=(ddEstado.getValue()==null?"MAG":ddEstado.getValue().toString());


			if (checkPenImp.isSelected())
				mapa.put("PCHECK_PEN_IMP", "1");
			else
				mapa.put("PCHECK_PEN_IMP", "0");

			if (checkImp.isSelected())
				mapa.put("PCHECK_IMP", "1");
			else
				mapa.put("PCHECK_IMP", "0");

			if (checkObs.isSelected())
				mapa.put("PCHECK_OBS", "1");
			else
				mapa.put("PCHECK_OBS", "0");

			mapa.put("PNUM_JUZGADO", numJuzgado);
			mapa.put("PESTADO_SOLI", codEstado);
			mapa.put("SUBREPORT_DIR", realPath);
			mapa.put("PCOD_DIST_JUDI", idDistritoJudicial);
			mapa.put("PCOD_USUARIO", codUsuario);
			mapa.put("PCOD_USUARIO_CONSUL", usuario.getCODG_USUAR());
			mapa.put("PFEC_DESDE", new java.sql.Timestamp(((Date) calDesde.getValue()).getTime()));
			mapa.put("PFEC_HASTA", dateFecha);
			mapa.put("PCOD_PERFIL", usuario.getCOD_PERFIL());
			mapa.put("PCOD_JUZGADO", codJuzgado);
			mapa.put("PCOD_DPTO", codDpto);

			String tipoFormato = "2";//String.valueOf(ddFormato.getSelected());
			String formato = Soporte.REPORTE_FORMATO_TEXT_HTML;
			if (tipoFormato.equals("2"))
				formato = Soporte.REPORTE_FORMATO_PDF;
			else if (tipoFormato.equals("3"))
				formato = Soporte.REPORTE_FORMATO_XLS;

			String reporteJASPER = "reportLstCertiMagistrado";
			String nombrePDF = "lstCertiMagistrado";
			if (String.valueOf(ddReporte.getSelected()).equals("1")) {
				nombrePDF = "lstCertiMagistrado";
				if(usuario.isPerfilAdministrador()){
					reporteJASPER = "reportLstCertiMagistrado";
				} else{
					getConnection = false;
					Map<String,Object> params = new HashMap<String,Object>();
					//Establecer fechas
					java.util.Calendar calendar = java.util.Calendar.getInstance();
					calendar.setTime((Date) calDesde.getValue());
			        calendar.set(java.util.Calendar.MILLISECOND, 0);
			        calendar.set(java.util.Calendar.SECOND, 0);
			        calendar.set(java.util.Calendar.MINUTE, 0);
			        calendar.set(java.util.Calendar.HOUR_OF_DAY, 0);
			        params.put("FECHA_DESDE", calendar.getTime());

			        calendar.setTime((Date) calHasta.getValue());
			        calendar.set(java.util.Calendar.MILLISECOND, 0);
			        calendar.set(java.util.Calendar.SECOND, 0);
			        calendar.set(java.util.Calendar.MINUTE, 0);
			        calendar.set(java.util.Calendar.HOUR_OF_DAY, 0);
			        calendar.add(java.util.Calendar.DATE, 1);
			        params.put("FECHA_HASTA", calendar.getTime());
					//Fin establecer fechas
					params.put("CODG_USUAR", usuario.getCODG_USUAR());
					params.put("INDC_MAGISTRADO", "S");
					if(!"%".equals(codJuzgado))
						params.put("CODG_JUZGAD", codJuzgado);
					if(!"%".equals(numJuzgado))
						params.put("NUME_JUZGA", numJuzgado);
					params.put("CODG_DISTRITO_JUDICIAL", usuario.getCODG_DISTRITO_JUDICIAL());
					if(!"%".equals(codDpto))
						params.put("CODG_LUGAR", codDpto);

					List<SolicitudReporte> data = servicioSolicitud.reporteSolicitudesRangoFechas(params);
					reporteJASPER = "reportLstCertiMagistradoMagis";
					getSessionBean1().jasperReport(nombrePDF, reporteJASPER, formato, mapa, new JRBeanCollectionDataSource(data,false));
				}
			} else if (String.valueOf(ddReporte.getSelected()).equals("2")) {
				if(usuario.isPerfilAdministrador())
					reporteJASPER = "reportLstCertiMagistradoConso";
				else
					reporteJASPER = "reportLstCertiMagistradoConsoMag";

				nombrePDF = "lstCertiMagistradoConso";
			} else if (String.valueOf(ddReporte.getSelected()).equals("3")) {
				reporteJASPER = "reportLstCertiMagistradoEsta";
				nombrePDF = "lstCertiMagistradoEsta";
			}else if (String.valueOf(ddReporte.getSelected()).equals("4")) {
				reporteJASPER = "reportLstCertiMagistradoConsoAdm";
				nombrePDF = "lstSolicitudPorUsuario";
			}

			if(getConnection){
				con = servicioSolicitud.getConnectionManager();
				getSessionBean1().jasperReport(nombrePDF, reporteJASPER, formato, mapa, con);
			}

		} catch (Exception ex) {
			logger.error(" Error extrayendo informaci\363n: ",ex);
			try {
				if (con != null) {
					con.rollback();
				}
			} catch (SQLException sqle) {
				logger.error("Error haciendo rollback ",sqle);
			}
		} finally{
			if(con!=null)
				try {
		            con.close();
		        } catch (SQLException e) { /* ignored */}

		}
		return null;
	}


	/**
	 * <p>
	 * Return a reference to the scoped data bean.
	 * </p>
	 */

	public String inicio() {
		return null;
	}

	public String btnVolver_action() {
		return "admSolicitudInterna";
	}

	/**
	 * <p>
	 * Return a reference to the scoped data bean.
	 * </p>
	 */
	protected fraHeader getfraHeader() {
		return (fraHeader) getBean("fraHeader");
	}

	/**
	 * <p>
	 * Return a reference to the scoped data bean.
	 * </p>
	 */
	protected fragHeader getfragHeader() {
		return (fragHeader) getBean("fragHeader");
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

	public Label getLblDistritoJudicial() {
		return lblDistritoJudicial;
	}

	public void setLblDistritoJudicial(Label lblDistritoJudicial) {
		this.lblDistritoJudicial = lblDistritoJudicial;
	}

	public HtmlSelectBooleanCheckbox getCheckImp() {
		return checkImp;
	}

	public void setCheckImp(HtmlSelectBooleanCheckbox checkImp) {
		this.checkImp = checkImp;
	}

	public HtmlSelectBooleanCheckbox getCheckObs() {
		return checkObs;
	}

	public void setCheckObs(HtmlSelectBooleanCheckbox checkObs) {
		this.checkObs = checkObs;
	}

	public HtmlSelectBooleanCheckbox getCheckPenImp() {
		return checkPenImp;
	}

	public void setCheckPenImp(HtmlSelectBooleanCheckbox checkPenImp) {
		this.checkPenImp = checkPenImp;
	}

}
