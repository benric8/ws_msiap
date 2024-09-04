/*
 * repPrimario.java
 *
 * Created on May 30, 2007, 5:40 AM
 * Copyright Administrador
 */
package uif;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.FacesException;
import javax.servlet.ServletContext;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import pe.gob.pj.rnc.log.MyLogger;
import pe.gob.pj.rnc.model.Perfil;
import pe.gob.pj.rnc.model.SolicitudExterna;
import pe.gob.pj.rnc.model.SolicitudExternaReporte;
import pe.gob.pj.rnc.model.SolicitudReporte;
import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.rnc.service.Soporte;
import pe.gob.pj.rnc.web.service.SolicitudManager;
import pe.gob.pj.util.Constantes;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import com.sun.rave.web.ui.component.Script;
import com.sun.rave.web.ui.component.TextField;

/**
 * <p>
 * Page bean that corresponds to a similarly named JSP page. This class contains component definitions (and initialization code) for all components that you have defined on
 * this page, as well as lifecycle methods and event handlers where you may add behavior to respond to incoming events.
 * </p>
 */
public class repPrimario extends AbstractPageBean {
	static MyLogger logger= new MyLogger(repPrimario.class.getName());
	// <editor-fold defaultstate="collapsed" desc="Managed Component
	// Definition">
	// private int __placeholder;

	/**
	 * <p>
	 * Automatically managed component initialization. <strong>WARNING:</strong> This method is automatically generated, so any user-specified code inserted here is subject to
	 * being replaced.
	 * </p>
	 */
	private void _init() throws Exception {
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

	private Script script1 = new Script();

	public Script getScript1() {
		return script1;
	}

	public void setScript1(Script s) {
		this.script1 = s;
	}

	// </editor-fold>

	private String resultado;

	private String id;

	private TextField textField1 = new TextField();

	public TextField getTextField1() {
		return textField1;
	}

	public void setTextField1(TextField tf) {
		this.textField1 = tf;
	}

	private Button btnCerrar = new Button();

	public Button getBtnCerrar() {
		return btnCerrar;
	}

	public void setBtnCerrar(Button b) {
		this.btnCerrar = b;
	}

	private Boolean procesoTerminado = false;

	public Boolean getProcesoTerminado() {
		return procesoTerminado;
	}

	public void setProcesoTerminado(Boolean procesoTerminado) {
		this.procesoTerminado = procesoTerminado;
	}

	/**
	 * <p>
	 * Construct a new Page bean instance.
	 * </p>
	 */
	public repPrimario() {
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
	 * @throws Exception
	 */

	@SuppressWarnings("unchecked")
	private void generarArchivoPdf(SolicitudExterna solicitud, String idPerfil) throws Exception {

		SolicitudManager servicioSolicitud = getSessionBean1().getManager();
		List<SolicitudReporte> observados = new ArrayList<SolicitudReporte>();
		List<SolicitudReporte> noObservados = new ArrayList<SolicitudReporte>();;

		Map<String,Object> params = new HashMap<String,Object>();
		params.put("codg_certi_externo", solicitud.getCODG_CERTI_EXTERNO());
		List<SolicitudExternaReporte> data = servicioSolicitud.reporteSolicitudExterna(params);

		for(SolicitudReporte sol: data.get(0).getSolicitudesList()){
			if("1".equals(sol.getFlagNacidoExterior()))
				sol.setDep_descripcion(sol.getLugarNacimiento());
			
			if("N".equals(sol.getIndc_descarte()))
				noObservados.add(sol);
			else if("S".equals(sol.getIndc_descarte()))
				observados.add(sol);
		}
		//SolicitudExterna solicitud = servicioSolicitud.selectSolicitudExternaByPrimaryKey(codCertificadoExterno);
		Usuario usuario = getSessionBean1().getUsuario();
		if (getSessionBean1().isAccesoReporte()) {
			if(!usuario.isPerfilAdministrador())
				servicioSolicitud.actualizaNroImpresion(true, solicitud.getCODG_CERTI_EXTERNO(), usuario);
			getSessionBean1().setAccesoReporte(false);
		}

		servicioSolicitud = null;
		try{
			//con = getSessionBean1().getManager().getConnectionManager();
			ServletContext theApplicationsServletContext = (ServletContext) this.getExternalContext().getContext();
			String realPath = theApplicationsServletContext.getRealPath(Soporte.REPORTE_DIRECTORIO);
			String consideracion = Soporte.obtenerTextoConsideracion(getSessionBean1().getEntidadExterna());
			//String destinatario = Soporte.obtenerDestinatario(supervisor);

			Map mapa = new HashMap();
			mapa.put("PATH_TO_SUBREPORTS", realPath);
			mapa.put("SUBREPORT_DIR", realPath);
			mapa.put("PCODG_CERTI_EXTERNO", solicitud.getCODG_CERTI_EXTERNO());
			//mapa.put("PC_PERFIL", supervisor.getCOD_PERFIL());
			mapa.put("TXT_CONSIDERACION", consideracion);
			//mapa.put("TXT_DESTINATARIO", destinatario);
			mapa.put("JefeRNC", getSessionBean1().getFirmaAutorizada().getDESC_SUMILLA().trim());
			mapa.put("FirmaNombre", getSessionBean1().getFirmaAutorizada().getDESC_NOMBRE().trim());
			mapa.put("Rehabilitados", data.get(0).isVerRehabilitados());
			mapa.put("URL_VERIFICACION", Constantes.URL_CAP_VALIDACION);//erodriguezbu código alternativo de verificación
			mapa.put("DataNoObservados",new JRBeanCollectionDataSource(noObservados,false));
			mapa.put("DataObservados",new JRBeanCollectionDataSource(observados,false));
			String reporteJASPER = "reportPrincipalA_v1";//"reportPrincipalA";
			String formato = Soporte.REPORTE_FORMATO_PDF;
			String nombrePDF = "OFICIO-A-" + solicitud.getCODG_CERTI_EXTERNO().toString();

			getSessionBean1().jasperReport(nombrePDF, reporteJASPER, formato, mapa, new JRBeanCollectionDataSource(data,false));

		} catch (Exception e){
			e.printStackTrace();
			throw e;
		}
	}

	public void init() {
		super.init();
		try {
			_init();
			String idPerfil = Perfil.obteneridPerfilParaReporte(getSessionBean1().getUsuario());
			SolicitudExterna solicitud = getSessionBean1().getParametroEntero();

			getSessionBean1().setParametroEntero(null);

			generarArchivoPdf(solicitud, idPerfil);
		} catch (Exception e) {
			logger.error("repPrimario Initialization Failure", e);
			throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
		}
		/*
		 * HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest(); String temp = request.getParameter("id");
		 * resultado = "faces/reporte.jsp?id=" + temp; if (getSessionBean1().isAccesoReporte()) { SolicitudManager manager = new SolicitudManager();
		 * manager.actualizaNroImpresion(true, new Integer(temp), getSessionBean1().getUsuario().getCODG_USUAR()); manager = null; getSessionBean1().setAccesoReporte(false); }
		 */
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
	protected RequestBean1 getRequestBean1() {
		return (RequestBean1) getBean("RequestBean1");
	}

	/**
	 * <p>
	 * Return a reference to the scoped data bean.
	 * </p>
	 */
	protected SessionBean1 getSessionBean1() {
		return (SessionBean1) getBean("SessionBean1");
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String button1_action() {
		return "case1";
	}

	public String btnCerrar_action() {
		return "inicio";
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
