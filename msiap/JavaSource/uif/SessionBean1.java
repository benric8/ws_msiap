/*
 * SessionBean1.java
 *
 * Created on 26 de febrero de 2007, 02:52 PM
 * Copyright user
 */
package uif;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.FacesException;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.engine.export.JRHtmlExporterParameter;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;

import pe.gob.pj.rnc.log.MyLogger;
import pe.gob.pj.rnc.model.EntidadExterna;
import pe.gob.pj.rnc.model.FirmaAutorizada;
import pe.gob.pj.rnc.model.PerfilMenuOpcion;
import pe.gob.pj.rnc.model.Solicitud;
import pe.gob.pj.rnc.model.SolicitudExterna;
import pe.gob.pj.rnc.model.SolicitudExternaReporte;
import pe.gob.pj.rnc.model.SolicitudReporte;
import pe.gob.pj.rnc.model.TipoDocumentoAutorizacion;
import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.rnc.service.Soporte;
import pe.gob.pj.rnc.web.service.ReniecService;
import pe.gob.pj.rnc.web.service.SolicitudManager;
import pe.gob.pj.util.Constantes;
import pe.gob.pj.util.Mensaje;

import com.sun.rave.web.ui.appbase.AbstractSessionBean;
import com.sun.rave.web.ui.model.Option;

/**
 * <p>
 * Session scope data bean for your application. Create properties here to represent cached data that should be made available across multiple HTTP requests for an individual
 * user.
 * </p>
 *
 * <p>
 * An instance of this class will be created for you automatically, the first time your application evaluates a value binding expression or method binding expression that
 * references a managed bean using this class.
 * </p>
 */
public class SessionBean1 extends AbstractSessionBean {
	static MyLogger logger = new MyLogger(SessionBean1.class.getName());
	private static final long serialVersionUID = 1L;

	private String version = "";
	private String nombreApp = "";

	public String getVersion() {
		version = Mensaje.getString("msiap.version.numero");
		return version;
	}

	public String getNombreApp() {
		nombreApp = Mensaje.getString("msiap.nombre.app");
		return nombreApp;
	}

	private boolean accesoReporte;

	private String codigoUsuario;

	private Option[] departamentos;

	private int indexListSolicitudes;

	private int intentosLogin = 0;

	private SolicitudExterna parametroEntero;

	private boolean primerAcceso;

	private Integer SolicitudExternaNroParm;

	private EntidadExterna entidadExterna;

//	private ArrayList<String[]> loginsUsuario = null;

	private ArrayList<Solicitud> solicitudes;

	private SolicitudExterna solicitudExterna;

	private Solicitud SolicitudUnitaria;

	private Solicitud SolicitudVisual;

	private Usuario usuario;

	private Usuario usuarioMant;

	private FirmaAutorizada firmaAutorizada;

	// ///
	private String distritoJudicialUser;
	private String departamentoUser;
	private String juzgadoUser;
	private String codigoCerti;
	private boolean flagImp;
	private String accion;
	// //

	private ArrayList<PerfilMenuOpcion> lstPerfilMenuOpcion;
	private SolicitudReporte solicitudReporte;
	private List<TipoDocumentoAutorizacion> lstTipoDocumentoAutorizacion = null;

	private SolicitudInternaDataProvider solicitudInterna = new SolicitudInternaDataProvider();

	private TipoDocumentDataProvider tiposDocumentoIdentidad = new TipoDocumentDataProvider();

	private SolicitudUnitariaDataProvider estadoSolicitudes = new SolicitudUnitariaDataProvider();

	private EstadosSolicitudDataProvider estadosSolicitud = new EstadosSolicitudDataProvider();

	private MotivoSolicitudCertificadoDataProvider motivos = new MotivoSolicitudCertificadoDataProvider();

	private AuditoriaExternaDataProvider registrosAuditoriaExterna = new AuditoriaExternaDataProvider();

	private SolicitudExternaDataProvider solicitudesExternas = new SolicitudExternaDataProvider();

	private SolicitudExternaItemDataProvider solicitudesUnitarias = new SolicitudExternaItemDataProvider();

	private UsuarioDataProvider usuarios = new UsuarioDataProvider();

	private EntidadExternaDataProvider entidadExternas = new EntidadExternaDataProvider();

	private EntidadExternaFilterDataProvider entidadExternasFilter = new EntidadExternaFilterDataProvider();

	private DepartamentoFilterDataProvider departamentoFilter = new DepartamentoFilterDataProvider();

	private UsuarioConsultaDataProvider consultaUsuario = new UsuarioConsultaDataProvider();

	private DistritoJudicialDataProvider distritoJudicial = new DistritoJudicialDataProvider();

	private TipoUsuarioDataProvider tipoUsuario = new TipoUsuarioDataProvider();

	private EstadosSolicitudTotalDataProvider estadoSolicitudTotal = new EstadosSolicitudTotalDataProvider();

	private DistritoJudicialInternoDataProvider distritoJudicialInterno = new DistritoJudicialInternoDataProvider();

	private UsuarioDistritoJudicialDataProvider usuarioDistritoJudicial = new UsuarioDistritoJudicialDataProvider();

	private JuzgadoDataProvider juzgado = new JuzgadoDataProvider();

	private boolean primerAccesoUsuario;
	private boolean primerAccesoSolicitudInterna;

	private SolicitudManager manager = new SolicitudManager();

	//erodriguezbu
	private Usuario usuarioSupervisor;
	private ReniecService reniecService = new ReniecService();
	
	private ConsultaAuditoriaUsuarioDataProvider consultaAuditoriaUsuario = new ConsultaAuditoriaUsuarioDataProvider();


	public SolicitudExterna getParametroEntero() {
		return parametroEntero;
	}

	public void setParametroEntero(SolicitudExterna parametroEntero) {
		this.parametroEntero = parametroEntero;
	}
	
	private String tipoBusqueda;
	
	public String getTipoBusqueda() {
		return tipoBusqueda;
	}

	public void setTipoBusqueda(String tipoBusqueda) {
		this.tipoBusqueda = tipoBusqueda;
	}

	/**
	 * <p>
	 * Automatically managed component initialization. <strong>WARNING:</strong> This method is automatically generated, so any user-specified code inserted here is subject to
	 * being replaced.
	 * </p>
	 */
	private void _init() throws Exception {
	}

	// </editor-fold>

	/**
	 * <p>
	 * Construct a new session data bean instance.
	 * </p>
	 */
	public SessionBean1() {
	}

	/**
	 * <p>
	 * This method is called when this bean is initially added to session scope. Typically, this occurs as a result of evaluating a value binding or method binding expression,
	 * which utilizes the managed bean facility to instantiate this bean and store it into session scope.
	 * </p>
	 *
	 * <p>
	 * You may customize this method to initialize and cache data values or resources that are required for the lifetime of a particular user session.
	 * </p>
	 */
	public void init() {
		super.init();
		try {
			_init();
		} catch (Exception e) {
			logger.error("SessionBean1 Initialization Failure", e);
			throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
		}
	}

	/**
	 * <p>
	 * This method is called when the session containing it is about to be passivated. Typically, this occurs in a distributed servlet container when the session is about to
	 * be transferred to a different container instance, after which the <code>activate()</code> method will be called to indicate that the transfer is complete.
	 * </p>
	 *
	 * <p>
	 * You may customize this method to release references to session data or resources that can not be serialized with the session itself.
	 * </p>
	 */
	public void passivate() {
	}

	/**
	 * <p>
	 * This method is called when the session containing it was reactivated.
	 * </p>
	 *
	 * <p>
	 * You may customize this method to reacquire references to session data or resources that could not be serialized with the session itself.
	 * </p>
	 */
	public void activate() {
	}

	/**
	 * <p>
	 * This method is called when this bean is removed from session scope. Typically, this occurs as a result of the session timing out or being terminated by the application.
	 * </p>
	 *
	 * <p>
	 * You may customize this method to clean up resources allocated during the execution of the <code>init()</code> method, or at any later time during the lifetime of the
	 * application.
	 * </p>
	 */
	public void destroy() {
	}

	public pe.gob.pj.rnc.model.Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(pe.gob.pj.rnc.model.Usuario usuario) {
		this.usuario = usuario;
	}

	public MotivoSolicitudCertificadoDataProvider getMotivos() {
		return motivos;
	}

	public void setMotivos(MotivoSolicitudCertificadoDataProvider motivos) {
		this.motivos = motivos;
	}

	public SolicitudExterna getSolicitudExterna() {
		return solicitudExterna;
	}

	public void setSolicitudExterna(SolicitudExterna solicitudExterna) {
		this.solicitudExterna = solicitudExterna;
	}

	public EstadosSolicitudDataProvider getEstadosSolicitud() {
		return estadosSolicitud;
	}

	public void setEstadosSolicitud(EstadosSolicitudDataProvider estadosSolicitud) {
		this.estadosSolicitud = estadosSolicitud;
	}

	public SolicitudExternaDataProvider getSolicitudesExternas() {
		return solicitudesExternas;
	}

	public void setSolicitudesExternas(SolicitudExternaDataProvider solicitudesExternas) {
		this.solicitudesExternas = solicitudesExternas;
	}

	public SolicitudExternaItemDataProvider getSolicitudesUnitarias() {
		return solicitudesUnitarias;
	}

	public void setSolicitudesUnitarias(SolicitudExternaItemDataProvider solicitudesUnitarias) {
		this.solicitudesUnitarias = solicitudesUnitarias;
	}

	public pe.gob.pj.rnc.model.Solicitud getSolicitudUnitaria() {
		return SolicitudUnitaria;
	}

	public void setSolicitudUnitaria(Solicitud SolicitudUnitaria) {
		this.SolicitudUnitaria = SolicitudUnitaria;
	}

	public TipoDocumentDataProvider getTiposDocumentoIdentidad() {
		return tiposDocumentoIdentidad;
	}

	public void setTiposDocumentoIdentidad(TipoDocumentDataProvider tiposDocumentoIdentidad) {
		this.tiposDocumentoIdentidad = tiposDocumentoIdentidad;
	}

	public ArrayList<Solicitud> getSolicitudes() {
		return solicitudes;
	}

	public void setSolicitudes(ArrayList<Solicitud> solicitudes) {
		this.solicitudes = solicitudes;
	}

	public boolean isPrimerAcceso() {
		return primerAcceso;
	}

	public void setPrimerAcceso(boolean primerAcceso) {
		this.primerAcceso = primerAcceso;
	}

	public SolicitudUnitariaDataProvider getEstadoSolicitudes() {
		return estadoSolicitudes;
	}

	public void setEstadoSolicitudes(SolicitudUnitariaDataProvider estadoSolicitudes) {
		this.estadoSolicitudes = estadoSolicitudes;
	}

	public Integer getSolicitudExternaNroParm() {
		return SolicitudExternaNroParm;
	}

	public void setSolicitudExternaNroParm(Integer SolicitudExternaNroParm) {
		this.SolicitudExternaNroParm = SolicitudExternaNroParm;
	}

	public boolean isAccesoReporte() {
		return accesoReporte;
	}

	public void setAccesoReporte(boolean accesoReporte) {
		this.accesoReporte = accesoReporte;
	}

	public AuditoriaExternaDataProvider getRegistrosAuditoriaExterna() {
		return registrosAuditoriaExterna;
	}

	public void setRegistrosAuditoriaExterna(AuditoriaExternaDataProvider registrosAuditoriaExterna) {
		this.registrosAuditoriaExterna = registrosAuditoriaExterna;
	}

	public int getIntentosLogin() {
		return intentosLogin;
	}

	public void setIntentosLogin(int intentosLogin) {
		this.intentosLogin = intentosLogin;
	}

	public UsuarioDataProvider getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(UsuarioDataProvider usuarios) {
		this.usuarios = usuarios;
	}

	public int getIndexListSolicitudes() {
		return indexListSolicitudes;
	}

	public void setIndexListSolicitudes(int indexListSolicitudes) {
		this.indexListSolicitudes = indexListSolicitudes;
	}

	public EntidadExterna getEntidadExterna() {
		return entidadExterna;
	}

	public void setEntidadExterna(EntidadExterna entidadExterna) {
		this.entidadExterna = entidadExterna;
	}

	public Option[] getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(Option[] departamentos) {
		this.departamentos = departamentos;
	}

	/**
	 * <p>
	 * Valid content types for reports that we can produce.
	 * </p>
	 */
	private static final String[] VALID_TYPES = { Soporte.REPORTE_FORMATO_TEXT_HTML, // Standard
			// HTML
			// representation
			Soporte.REPORTE_FORMATO_PDF, // Adobe Portable
			// Document Format
			Soporte.REPORTE_FORMATO_XLS, // Microsoft xls
	// Document Format
	};

	/**
	 * <p>
	 * Generate the specified report, in the specified output format, based on the specified data.
	 * </p>
	 *
	 * @param reporteJASPER
	 *            Report name to be rendered
	 * @param formato
	 *            Content type of the requested report ("application/pdf" or "text/html")
	 * @param data
	 *            <code>ResultSet</code> containing the data to report
	 * @param parametro
	 *            <code>Map</code> of additional report parameters
	 *
	 * @exception IllegalArgumentException
	 *                if the specified content type is not recognized
	 * @exception IllegalArgumentException
	 *                if no compiled report definition for the specified name can be found
	 */
	public void jasperReport(String nombrePDF, String reporteJASPER, String formato, Map parametro, Connection con) {
		boolean found = false;
		for (int i = 0; i < VALID_TYPES.length; i++) {
			if (VALID_TYPES[i].equals(formato)) {
				found = true;
				break;
			}
		}
		if (!found)
			throw new IllegalArgumentException("Invalid report type '" + formato + "' requested");

		ExternalContext econtext = getExternalContext();
		InputStream stream = econtext.getResourceAsStream(Soporte.REPORTE_DIRECTORIO + reporteJASPER + Soporte.JASPER_EXTENSION);
		if (stream == null)
			throw new IllegalArgumentException("Unknown report name '" + reporteJASPER + "' requested");

		JasperPrint jasperPrint = null;
		try {
			jasperPrint = JasperFillManager.fillReport(stream, parametro, con);
		} catch (RuntimeException e) {
			logger.error("", e);
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			logger.error("", e);
			e.printStackTrace();
			throw new FacesException(e);
		} finally {
			try {
				stream.close();
			} catch (IOException e) {
				logger.error("", e);
				e.printStackTrace();
			}
		}
		JRExporter exporter = null;
		HttpServletResponse response = (HttpServletResponse) econtext.getResponse();
		FacesContext fcontext = FacesContext.getCurrentInstance();

		try {
			response.setContentType(formato);
			if (Soporte.REPORTE_FORMATO_PDF.equals(formato)) {
				// System.out.println("---------------------------------------");
				exporter = new JRPdfExporter();
				// if (Texto.contieneAlgo(nombrePDF)) {
				response.setContentType(Soporte.REPORTE_FORMATO_PDF);
				response.setHeader("Content-disposition", "attachment;filename=" + nombrePDF + Soporte.PDF_EXTENSION);
				// }
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, response.getOutputStream());
			} else if (Soporte.REPORTE_FORMATO_TEXT_HTML.equals(formato)) {

				// JRHtmlExporterParameter

				/*
				 * exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint); exporter.setParameter(JRExporterParameter.OUTPUT_WRITER, response.getWriter());
				 *
				 * HttpServletRequest request = (HttpServletRequest) fcontext.getExternalContext().getRequest();
				 * request.getSession().setAttribute(ImageServlet.DEFAULT_JASPER_PRINT_SESSION_ATTRIBUTE, jasperPrint);
				 * exporter.setParameter(JRHtmlExporterParameter.IMAGES_MAP, new HashMap()); exporter.setParameter(JRHtmlExporterParameter.IMAGES_URI, request.getContextPath()
				 * + "/image?image=");
				 */
				PrintWriter out = response.getWriter();

				exporter = new JRHtmlExporter();

				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_WRITER, out);
				exporter.setParameter(JRHtmlExporterParameter.IMAGES_URI, "image?image=");

				// exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				// exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, response.getOutputStream());
				// exporter.setParameter(JRHtmlExporterParameter.IMAGES_URI,"image?image=");

			} else if (Soporte.REPORTE_FORMATO_XLS.equals(formato)) {
				exporter = new JRXlsExporter();
				String xlsFileName = nombrePDF + Soporte.EXCEL_EXTENSION;
				response.setContentType(Soporte.REPORTE_FORMATO_XLS);
				response.setHeader("Content-disposition", "attachment;filename=" + xlsFileName);
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, xlsFileName);
				exporter.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.FALSE);
				exporter.setParameter(JRXlsExporterParameter.SHEET_NAMES, new String[] { "Data1", "Data2" });
				exporter.setParameter(JRXlsExporterParameter.IS_WHITE_PAGE_BACKGROUND, Boolean.FALSE);
				exporter.setParameter(JRXlsExporterParameter.IS_REMOVE_EMPTY_SPACE_BETWEEN_ROWS, Boolean.TRUE);
				exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, response.getOutputStream());
			}

		} catch (RuntimeException e) {
			logger.error("", e);
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			logger.error("", e);
			e.printStackTrace();
			throw new FacesException(e);
		}

		try {

			exporter.exportReport();

		} catch (RuntimeException e) {
			logger.error("", e);
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			logger.error("", e);
			e.printStackTrace();
			throw new FacesException(e);
		}
		fcontext.responseComplete();

	}

	public void jasperReport(String nombrePDF, String reporteJASPER, String formato, Map parametro, JRBeanCollectionDataSource data) {
		boolean found = false;
		for (int i = 0; i < VALID_TYPES.length; i++) {
			if (VALID_TYPES[i].equals(formato)) {
				found = true;
				break;
			}
		}
		if (!found)
			throw new IllegalArgumentException("Invalid report type '" + formato + "' requested");

		ExternalContext econtext = getExternalContext();
		InputStream stream = econtext.getResourceAsStream(Soporte.REPORTE_DIRECTORIO + reporteJASPER + Soporte.JASPER_EXTENSION);

		if (stream == null)
			throw new IllegalArgumentException("Unknown report name '" + reporteJASPER + "' requested");

		JasperPrint jasperPrint = null;
		try {
			jasperPrint = JasperFillManager.fillReport(stream, parametro,  data);
		} catch (RuntimeException e) {
			logger.error("", e);
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			logger.error("", e);
			e.printStackTrace();
			throw new FacesException(e);
		} finally {
			try {
				stream.close();
			} catch (IOException e) {
				logger.error("", e);
				e.printStackTrace();
			}
		}
		JRExporter exporter = null;
		HttpServletResponse response = (HttpServletResponse) econtext.getResponse();
		FacesContext fcontext = FacesContext.getCurrentInstance();

		try {
			response.setContentType(formato);
			if (Soporte.REPORTE_FORMATO_PDF.equals(formato)) {
				// System.out.println("---------------------------------------");
				exporter = new JRPdfExporter();
				// if (Texto.contieneAlgo(nombrePDF)) {
				response.setContentType(Soporte.REPORTE_FORMATO_PDF);                
				response.setHeader("Content-disposition", "attachment;filename=" + nombrePDF + Soporte.PDF_EXTENSION);
				// }
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, response.getOutputStream());
			} else if (Soporte.REPORTE_FORMATO_TEXT_HTML.equals(formato)) {
				PrintWriter out = response.getWriter();

				exporter = new JRHtmlExporter();

				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_WRITER, out);
				exporter.setParameter(JRHtmlExporterParameter.IMAGES_URI, "image?image=");

			} else if (Soporte.REPORTE_FORMATO_XLS.equals(formato)) {
				exporter = new JRXlsExporter();
				String xlsFileName = nombrePDF + Soporte.EXCEL_EXTENSION;
				response.setContentType(Soporte.REPORTE_FORMATO_XLS);
				response.setHeader("Content-disposition", "attachment;filename=" + xlsFileName);
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, xlsFileName);
				exporter.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.FALSE);
				exporter.setParameter(JRXlsExporterParameter.SHEET_NAMES, new String[] { "Data1", "Data2" });
				exporter.setParameter(JRXlsExporterParameter.IS_WHITE_PAGE_BACKGROUND, Boolean.FALSE);
				exporter.setParameter(JRXlsExporterParameter.IS_REMOVE_EMPTY_SPACE_BETWEEN_ROWS, Boolean.TRUE);
				exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, response.getOutputStream());
			}

		} catch (RuntimeException e) {
			logger.error("Error generando reporte", e);
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			logger.error("", e);
			e.printStackTrace();
			throw new FacesException(e);
		}

		try {
			exporter.exportReport();
		} catch (RuntimeException e) {
			logger.error("Error exportando reporte", e);
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			logger.error("", e);
			e.printStackTrace();
			throw new FacesException(e);
		}
		fcontext.responseComplete();
	}

	public void repSecundarioAppBean() throws Exception {
		SolicitudExterna solExt = ((SessionBean1) this.getBean("SessionBean1")).getParametroEntero();
		((SessionBean1) this.getBean("SessionBean1")).setParametroEntero(null);
		Boolean accesoReporte = ((SessionBean1) this.getBean("SessionBean1")).isAccesoReporte();
		if (accesoReporte)
			((SessionBean1) this.getBean("SessionBean1")).setAccesoReporte(false);

		//boolean flagRehabilitados = Funciones.rehabilitado(solExt, usuario);

		SolicitudManager servicioSolicitud = this.getManager();

		Map<String,Object> params = new HashMap<String,Object>();
		params.put("codg_certi_externo", solExt.getCODG_CERTI_EXTERNO());
		params.put("indc_descarte", "S");
		List<SolicitudExternaReporte> data = servicioSolicitud.reporteSolicitudExternaBoletin(params);

		Usuario usuario = ((SessionBean1) this.getBean("SessionBean1")).getUsuario();
		Usuario supervisor = ((SessionBean1) this.getBean("SessionBean1")).getUsuarioSupervisor();
		if (supervisor == null) {
			log("La entidad Externa no tiene asignado un supervidor o tiene mas de un supervidor asignado.");
			try {
				FacesContext.getCurrentInstance().getExternalContext().redirect("admSolicitudes.jsp");
			} catch (IOException e) {
			}
		} else {
			if (accesoReporte) {
				if (!usuario.isPerfilAdministrador())
					servicioSolicitud.actualizaNroImpresion(false, solExt.getCODG_CERTI_EXTERNO(), usuario);
			}

			servicioSolicitud = null;

			try{
				ServletContext theApplicationsServletContext = (ServletContext) this.getExternalContext().getContext();
				StringBuilder tmpRealPath = new StringBuilder();
				tmpRealPath.append(((ServletContext) this.getExternalContext().getContext()).getRealPath(Soporte.REPORTE_DIRECTORIO));
				String realPath = tmpRealPath.append("/").toString();
				String consideracion = Soporte.obtenerTextoConsideracion(((SessionBean1) this.getBean("SessionBean1")).getEntidadExterna());
				String destinatario = Soporte.obtenerDestinatario(supervisor);

				Map<String, Object> mapa = new HashMap<String,Object>();
				mapa.put("PATH_TO_SUBREPORTS", realPath);
				mapa.put("SUBREPORT_DIR", realPath);
				mapa.put("PCODG_CERTI_EXTERNO", solExt.getCODG_CERTI_EXTERNO());
				mapa.put("PC_PERFIL", supervisor.getCOD_PERFIL());
				mapa.put("TXT_CONSIDERACION", consideracion);
				mapa.put("TXT_DESTINATARIO", destinatario);
				mapa.put("URL_VERIFICACION", Constantes.URL_CAP_VALIDACION);
				mapa.put("JefeRNC", ((SessionBean1) this.getBean("SessionBean1")).getFirmaAutorizada().getDESC_SUMILLA().trim());
				mapa.put("FirmaNombre", ((SessionBean1) this.getBean("SessionBean1")).getFirmaAutorizada().getDESC_NOMBRE().trim());
				mapa.put("Rehabilitados", data.get(0).isVerRehabilitados());
				String reporteJASPER = "reportPrincipalB_v1";
				String formato = Soporte.REPORTE_FORMATO_PDF;
				String nombrePDF = "OFICIO-B-" + solExt.getCODG_CERTI_EXTERNO().toString();
				jasperReport(nombrePDF, reporteJASPER, formato, mapa, new JRBeanCollectionDataSource(data,false));
			} catch (Exception e){
				e.printStackTrace();
				throw e;
			}
			// procesoTerminado = true;
		}
	}

	public void killSession() {
		ExternalContext externalContext = getFacesContext().getExternalContext();
		HttpServletRequest request = (HttpServletRequest) externalContext.getRequest();
		HttpSession session = request.getSession();
		session.invalidate();

		try {
			// //("externalContext.getRequestContextPath() es: "+ externalContext.getRequestContextPath());
			//String errorPageURL = externalContext.getRequestContextPath() + "/faces/login.jsp";
			String errorPageURL = externalContext.getRequestContextPath() + "/faces/login.jsp";
			// //"errorPageURL es: " + errorPageURL);
			externalContext.redirect(errorPageURL);
		} catch (IOException ioe) {
			ioe.printStackTrace(System.out);
			logger.error("", ioe);
		}
	}

	public String getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

//	public ArrayList<String[]> getLoginsUsuario() {
//		return loginsUsuario;
//	}
//
//	public void setLoginsUsuario(ArrayList<String[]> loginUsuario) {
//		this.loginsUsuario = loginUsuario;
//	}

	public EntidadExternaDataProvider getEntidadExternas() {
		return entidadExternas;
	}

	public void setEntidadExternas(EntidadExternaDataProvider entidadExternas) {
		this.entidadExternas = entidadExternas;
	}

	public UsuarioConsultaDataProvider getConsultaUsuario() {
		return consultaUsuario;
	}

	public void setConsultaUsuario(UsuarioConsultaDataProvider consultaUsuario) {
		this.consultaUsuario = consultaUsuario;
	}

	public boolean isPrimerAccesoUsuario() {
		return primerAccesoUsuario;
	}

	public void setPrimerAccesoUsuario(boolean primerAccesoUsuario) {
		this.primerAccesoUsuario = primerAccesoUsuario;
	}

	public DistritoJudicialDataProvider getDistritoJudicial() {
		return distritoJudicial;
	}

	public void setDistritoJudicial(DistritoJudicialDataProvider distritoJudicial) {
		this.distritoJudicial = distritoJudicial;
	}

	public TipoUsuarioDataProvider getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuarioDataProvider tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public Usuario getUsuarioMant() {
		return usuarioMant;
	}

	public void setUsuarioMant(Usuario usuarioMant) {
		this.usuarioMant = usuarioMant;
	}

	public FirmaAutorizada getFirmaAutorizada() {
		return firmaAutorizada;
	}

	public void setFirmaAutorizada(FirmaAutorizada firmaAutorizada) {
		this.firmaAutorizada = firmaAutorizada;
	}

	public EntidadExternaFilterDataProvider getEntidadExternasFilter() {
		return entidadExternasFilter;
	}

	public void setEntidadExternasFilter(EntidadExternaFilterDataProvider entidadExternasFilter) {
		this.entidadExternasFilter = entidadExternasFilter;
	}

	public ArrayList<PerfilMenuOpcion> getLstPerfilMenuOpcion() {
		return lstPerfilMenuOpcion;
	}

	public void setLstPerfilMenuOpcion(ArrayList<PerfilMenuOpcion> lstPerfilMenuOpcion) {
		this.lstPerfilMenuOpcion = lstPerfilMenuOpcion;
	}

	public boolean isPrimerAccesoSolicitudInterna() {
		return primerAccesoSolicitudInterna;
	}

	public void setPrimerAccesoSolicitudInterna(boolean primerAccesoSolicitudInterna) {
		this.primerAccesoSolicitudInterna = primerAccesoSolicitudInterna;
	}

	public SolicitudInternaDataProvider getSolicitudInterna() {
		return solicitudInterna;
	}

	public void setSolicitudInterna(SolicitudInternaDataProvider solicitudInterna) {
		this.solicitudInterna = solicitudInterna;
	}

	public String getDepartamentoUser() {
		return departamentoUser;
	}

	public void setDepartamentoUser(String departamentoUser) {
		this.departamentoUser = departamentoUser;
	}

	public String getDistritoJudicialUser() {
		return distritoJudicialUser;
	}

	public void setDistritoJudicialUser(String distritoJudicialUser) {
		this.distritoJudicialUser = distritoJudicialUser;
	}

	public String getJuzgadoUser() {
		return juzgadoUser;
	}

	public void setJuzgadoUser(String juzgadoUser) {
		this.juzgadoUser = juzgadoUser;
	}

	public String getCodigoCerti() {
		return codigoCerti;
	}

	public void setCodigoCerti(String codigoCerti) {
		this.codigoCerti = codigoCerti;
	}

	public boolean isFlagImp() {
		return flagImp;
	}

	public void setFlagImp(boolean flagImp) {
		this.flagImp = flagImp;
	}

	public EstadosSolicitudTotalDataProvider getEstadoSolicitudTotal() {
		return estadoSolicitudTotal;
	}

	public void setEstadoSolicitudTotal(EstadosSolicitudTotalDataProvider estadoSolicitudTotal) {
		this.estadoSolicitudTotal = estadoSolicitudTotal;
	}

	public DistritoJudicialInternoDataProvider getDistritoJudicialInterno() {
		return distritoJudicialInterno;
	}

	public void setDistritoJudicialInterno(DistritoJudicialInternoDataProvider distritoJudicialInterno) {
		this.distritoJudicialInterno = distritoJudicialInterno;
	}

	public UsuarioDistritoJudicialDataProvider getUsuarioDistritoJudicial() {
		return usuarioDistritoJudicial;
	}

	public void setUsuarioDistritoJudicial(UsuarioDistritoJudicialDataProvider usuarioDistritoJudicial) {
		this.usuarioDistritoJudicial = usuarioDistritoJudicial;
	}

	public JuzgadoDataProvider getJuzgado() {
		return juzgado;
	}

	public void setJuzgado(JuzgadoDataProvider juzgado) {
		this.juzgado = juzgado;
	}

	public DepartamentoFilterDataProvider getDepartamentoFilter() {
		return departamentoFilter;
	}

	public void setDepartamentoFilter(DepartamentoFilterDataProvider departamentoFilter) {
		this.departamentoFilter = departamentoFilter;
	}

	public Solicitud getSolicitudVisual() {
		return SolicitudVisual;
	}

	public void setSolicitudVisual(Solicitud solicitudVisual) {
		SolicitudVisual = solicitudVisual;
	}

	public Usuario getUsuarioSupervisor() {
		return usuarioSupervisor;
	}

	public void setUsuarioSupervisor(Usuario usuarioSupervisor) {
		this.usuarioSupervisor = usuarioSupervisor;
	}

	public SolicitudManager getManager() {
		return manager;
	}

	public void setManager(SolicitudManager manager) {
		this.manager = manager;
	}

	public SolicitudReporte getSolicitudReporte() {
		return solicitudReporte;
	}

	public void setSolicitudReporte(SolicitudReporte solicitudReporte) {
		this.solicitudReporte = solicitudReporte;
	}

	public List<TipoDocumentoAutorizacion> getLstTipoDocumentoAutorizacion() {
		return lstTipoDocumentoAutorizacion;
	}

	public void setLstTipoDocumentoAutorizacion(List<TipoDocumentoAutorizacion> lstTipoDocumentoAutorizacion) {
		this.lstTipoDocumentoAutorizacion = lstTipoDocumentoAutorizacion;
	}

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	public ConsultaAuditoriaUsuarioDataProvider getConsultaAuditoriaUsuario() {
		return consultaAuditoriaUsuario;
	}

	public void setConsultaAuditoriaUsuario(ConsultaAuditoriaUsuarioDataProvider consultaAuditoriaUsuario) {
		this.consultaAuditoriaUsuario = consultaAuditoriaUsuario;
	}

	public ReniecService getReniecService() {
		return reniecService;
	}

	public void setReniecService(ReniecService reniecService) {
		this.reniecService = reniecService;
	}

	
}
