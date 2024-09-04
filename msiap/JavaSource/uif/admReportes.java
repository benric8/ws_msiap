/*
 * admSolicitud.java
 *
 * Created on 27 de febrero de 2007, 07:24 AM
 * Copyright user
 */
package uif;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import javax.faces.FacesException;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlMessages;
import javax.faces.context.FacesContext;
import javax.faces.convert.DateTimeConverter;
import javax.faces.event.ValueChangeEvent;
import javax.servlet.ServletContext;

import pe.gob.pj.rnc.model.Perfil;
import pe.gob.pj.rnc.model.SolicitudExterna;
import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.rnc.service.Soporte;
import pe.gob.pj.util.Mensaje;

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
import com.sun.rave.web.ui.model.Option;
import com.sun.rave.web.ui.model.SingleSelectOptionsList;

/**
 * <p>
 * Page bean that corresponds to a similarly named JSP page. This class contains
 * component definitions (and initialization code) for all components that you
 * have defined on this page, as well as lifecycle methods and event handlers
 * where you may add behavior to respond to incoming events.
 * </p>
 */
public class admReportes extends AbstractPageBean {

	/**
	 * <p>
	 * Automatically managed component initialization. <strong>WARNING:</strong>
	 * This method is automatically generated, so any user-specified code
	 * inserted here is subject to being replaced.
	 * </p>
	 */
	private void _init() throws Exception {

		Usuario usuario = getSessionBean1().getUsuario();
		
		dateTimeConverter1.setLocale(new java.util.Locale("es", "PE"));
		dateTimeConverter1.setPattern("dd/MM/yyyy");
		dateTimeConverter1.setTimeZone(java.util.TimeZone.getTimeZone("America/Lima"));
		ddFormatoDefaultOptions.setOptions(new Option[] { new Option("2", "PDF"), new Option("3", "Excel")});
		
		if(Perfil.COD_DISTRITO_JUDICIAL_RREE.equals(usuario.getCODG_DISTRITO_JUDICIAL()))
			ddReporteDefaultOptions.setOptions(
				new Option[] { new Option("1", "POR SOLICITUDES"), new Option("2", "POR REGISTROS") , new Option("3", "POR NOMBRES CONSULTADOS GENERAL"),
				new Option("4", "POR NOMBRES CONSULTADOS POR CONSULADOS"), new Option("5", "POR NOMBRES CONSULTADOS DIARIOS POR CONSULADOS")}
			);
		else
			ddReporteDefaultOptions.setOptions(
				new Option[] { new Option("1", "POR SOLICITUDES"), new Option("2", "POR REGISTROS") , new Option("3", "POR NOMBRES CONSULTADOS GENERAL")}
			);
		
		ddMesOptions.setOptions(new Option[] {
				new Option("1", "Enero"),
				new Option("2", "Febrero"),
				new Option("3", "Marzo"),
				new Option("4", "Abril"),
				new Option("5", "Mayo"),
				new Option("6", "Junio"),
				new Option("7", "Julio"),
				new Option("8", "Agosto"),
				new Option("9", "Septiembre"),
				new Option("10", "Octubre"),
				new Option("11", "Noviembre"),
				new Option("12", "Diciembre")});

		ddAnnoOptions = new SingleSelectOptionsList();
		java.util.Calendar cal = java.util.Calendar.getInstance();
	    int year = cal.get(java.util.Calendar.YEAR);
	    int inicio = year-10;
	    int fin = year+10;
	    int ind = 0;
	   Option[] options = new Option[21];
	   for(int i = inicio; i<=fin ; i++) {
		   	Option opt1 = new Option();
            opt1.setLabel(String.valueOf(i));
            opt1.setValue(String.valueOf(i));
            options[ind++] = opt1;
        }
	   ddAnnoOptions.setOptions(options);

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

	public Label getLblUsuario() {
		return lblUsuario;
	}

	public void setLblUsuario(Label l) {
		this.lblUsuario = l;
	}

	private DropDown ddFormato = new DropDown();

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
	}

	////
	private SingleSelectOptionsList ddAnnoOptions = new SingleSelectOptionsList();
	private SingleSelectOptionsList ddMesOptions = new SingleSelectOptionsList();
	private DropDown ddAnno = new DropDown();
	private DropDown ddMes = new DropDown();



	public SingleSelectOptionsList getDdAnnoOptions() {
		return ddAnnoOptions;
	}

	public void setDdAnnoOptions(SingleSelectOptionsList ddAnnoOptions) {
		this.ddAnnoOptions = ddAnnoOptions;
	}

	public SingleSelectOptionsList getDdMesOptions() {
		return ddMesOptions;
	}

	public void setDdMesOptions(SingleSelectOptionsList ddMesOptions) {
		this.ddMesOptions = ddMesOptions;
	}
	public DropDown getDdAnno() {
		return ddAnno;
	}

	public void setDdAnno(DropDown ddAnno) {
		this.ddAnno = ddAnno;
	}

	public DropDown getDdMes() {
		return ddMes;
	}

	public void setDdMes(DropDown ddMes) {
		this.ddMes = ddMes;
	}

	private Label label20 = new Label();
	private Label label21 = new Label();

	public Label getLabel20() {
		return label20;
	}

	public void setLabel20(Label label20) {
		this.label20 = label20;
	}

	public Label getLabel21() {
		return label21;
	}

	public void setLabel21(Label label21) {
		this.label21 = label21;
	}

	///



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

	private PageSeparator pageSeparator2 = new PageSeparator();

	public PageSeparator getPageSeparator2() {
		return pageSeparator2;
	}

	public void setPageSeparator2(PageSeparator ps) {
		this.pageSeparator2 = ps;
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
	public admReportes() {
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
			log("admSolicitud Initialization Failure", e);
			throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
		}
		java.util.Calendar cal = new GregorianCalendar();
		if (calDesde.getValue() == null) {
			cal = new GregorianCalendar();
			calHasta.setValue(cal.getTime());
			//cal.add(java.util.Calendar.DAY_OF_YEAR, -2);
			cal.add(java.util.Calendar.DAY_OF_YEAR, -Integer.parseInt(Mensaje.getString("msiap.filtro.dias.antes")));
			calDesde.setValue(cal.getTime());
		} else {
			if (calHasta.getValue() == null) {
				cal = new GregorianCalendar();
				calHasta.setValue(cal.getTime());
			}
		}

		Usuario usuario = getSessionBean1().getUsuario();
		if (usuario.isPerfilAdministrador() || usuario.isPerfilSupervisor()) {
				ddUsuarios.setRendered(true);
				lblUsuario.setRendered(true);
			}
		if (usuario.isPerfilOperador()) {
			ddUsuarios.setRendered(false);
			lblUsuario.setRendered(false);
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

	public void calDesde_validate(FacesContext context, UIComponent component, Object value) {

	}

	@SuppressWarnings("unchecked")
	public String btnGenerarReporte_action() {
		Map mapa = new HashMap();
		Connection con = null;

		try {
			con = getSessionBean1().getManager().getConnectionManager();
			Usuario usuario = getSessionBean1().getUsuario();
			StringBuilder tmpRealPath = new StringBuilder();
			//Inicio erodriguezbu
			tmpRealPath.append(((ServletContext) this.getExternalContext().getContext()).getRealPath(Soporte.REPORTE_DIRECTORIO));
			String realPath = tmpRealPath.append("/").toString();
			//ServletContext theApplicationsServletContext = (ServletContext) this.getExternalContext().getContext();
			//String realPath = theApplicationsServletContext.getRealPath(Soporte.REPORTE_DIRECTORIO);

			String codPerfil = usuario.getCOD_PERFIL();
			Integer idEntidadExterna = usuario.getCODG_ENTIDAD_EXTERNA();
			String codUsuario = (String) ddUsuarios.getSelected();
			if (usuario.isPerfilOperador()) codUsuario = usuario.getCODG_USUAR();

			java.util.Calendar cal = new GregorianCalendar();

			if(calHasta.getValue()==null)
				calHasta.setValue(cal.getTime());
			if(calDesde.getValue()==null)
				calDesde.setValue(cal.getTime());

			java.sql.Timestamp dateFecha= new java.sql.Timestamp(((Date)calHasta.getValue()).getTime());
			dateFecha.setHours(23);
			dateFecha.setMinutes(59);
			dateFecha.setSeconds(59);
			mapa.put("PATH_TO_SUBREPORTS", realPath);
			mapa.put("SUBREPORT_DIR", realPath);
			mapa.put("CODG_ENTIDAD_EXTERNA", idEntidadExterna);
			mapa.put("CODG_ESTADO", ddEstado.getValue());
			mapa.put("CODG_USUAR", codUsuario);
			mapa.put("CODG_USUARIO_IMPRESION", usuario.getCODG_USUAR());
			//mapa.put("FEC_DESDE", (Date) calDesde.getValue());
			//mapa.put("FEC_HASTA", (Date) calHasta.getValue());
			mapa.put("FEC_DESDE", new java.sql.Timestamp(((Date)calDesde.getValue()).getTime()));
			mapa.put("FEC_HASTA",dateFecha);
			mapa.put("CODG_PERFIL", codPerfil);
			mapa.put("ANNO", new Integer(ddAnno.getSelected().toString()));
			mapa.put("MES", new Integer(ddMes.getSelected().toString()));
			mapa.put("IMP_TODAS_ENTIDADES", Perfil.COD_DISTRITO_JUDICIAL_CONDENAS.equals(usuario.getCODG_DISTRITO_JUDICIAL())?"1":"0");//erodriguezbu (Imprimir todos sólo personal RNC)

			String tipoFormato = String.valueOf(ddFormato.getSelected());
			String formato = Soporte.REPORTE_FORMATO_TEXT_HTML;
			if (tipoFormato.equals("2"))
				formato = Soporte.REPORTE_FORMATO_PDF;
			else if (tipoFormato.equals("3"))
				formato = Soporte.REPORTE_FORMATO_XLS;

			String reporteJASPER = "reporte_resumen";
			String nombrePDF = "ResumenPorSolicitudes";
			if (String.valueOf(ddReporte.getSelected()).equals("1")) {
				if (tipoFormato.equals("2"))
					reporteJASPER = "reporte_resumen";
				else if (tipoFormato.equals("3"))
					reporteJASPER = "reporte_resumen_xls";
				nombrePDF = "ResumenPorSolicitudes";
			}else if (String.valueOf(ddReporte.getSelected()).equals("2")) {
				if (tipoFormato.equals("2"))
					reporteJASPER = "reporte_resumen2";
				else if (tipoFormato.equals("3"))
					reporteJASPER = "reporte_resumen2_xls";
				nombrePDF = "ResumenPorRegistros";
			}else if(String.valueOf(ddReporte.getSelected()).equals("3")) {
				if (tipoFormato.equals("2"))
					reporteJASPER = "reporte_general_nomb_consul";
				else if (tipoFormato.equals("3"))
					reporteJASPER = "reporte_general_nomb_consul_xls";
				nombrePDF = "GeneralNombresConsultados";
			}else if(String.valueOf(ddReporte.getSelected()).equals("4")) {
				if (tipoFormato.equals("2"))
					reporteJASPER = "reporte_nombres_consultados";
				else if (tipoFormato.equals("3"))
					reporteJASPER = "reporte_nomb_consul_xls";
				nombrePDF = "NombresConsultados";
			}else if(String.valueOf(ddReporte.getSelected()).equals("5")) {
				if (tipoFormato.equals("2"))
					reporteJASPER = "reporte_diario_nombres_consultados";
				else if (tipoFormato.equals("3"))
					reporteJASPER = "reporte_diario_nomb_consul_xls";
				nombrePDF = "NombresConsultadosDiarios";
			}

			getSessionBean1().jasperReport(nombrePDF, reporteJASPER, formato, mapa, con);

		} catch (Exception ex) {
			log(" Error extrayendo informaci\363n: " + ex.getMessage());
			try {
				if (con != null) {
					con.rollback();
				}
			} catch (SQLException sqle) {
				log(" Error haciendo rollback ");
			}
		} finally{
			if(con != null)
				try {
		            con.close();
		        } catch (SQLException e) { /* ignored */}

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

	public String inicio() {
		return null;
	}

	public String btnVolver_action() {
		return "inicio";
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

}
