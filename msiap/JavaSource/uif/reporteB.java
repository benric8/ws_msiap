/*
 * reporte.java
 *
 * Created on May 30, 2007, 6:10 AM
 * Copyright Administrador
 */
package uif;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.faces.FacesException;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import pe.gob.pj.rnc.log.MyLogger;
import pe.gob.pj.rnc.service.Soporte;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import com.sun.rave.web.ui.component.StaticText;

/**
 * <p>
 * Page bean that corresponds to a similarly named JSP page. This class contains
 * component definitions (and initialization code) for all components that you
 * have defined on this page, as well as lifecycle methods and event handlers
 * where you may add behavior to respond to incoming events.
 * </p>
 */
public class reporteB extends AbstractPageBean {
	static MyLogger logger= new MyLogger(reporteB.class.getName());
	/**
	 * <p>
	 * Automatically managed component initialization. <strong>WARNING:</strong>
	 * This method is automatically generated, so any user-specified code
	 * inserted here is subject to being replaced.
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

	private String resultado;

	private StaticText staticText1 = new StaticText();

	public StaticText getStaticText1() {
		return staticText1;
	}

	public void setStaticText1(StaticText st) {
		this.staticText1 = st;
	}

	/**
	 * <p>
	 * Construct a new Page bean instance.
	 * </p>
	 */
	public reporteB() {
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
	@SuppressWarnings("unchecked")
	public void init() {

		super.init();

		try {
			_init();
		} catch (Exception e) {
			logger.error("reporte Initialization Failure", e);
			throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
		}

		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		setResultado(request.getParameter("id"));

		Map fillParams = new HashMap();
		Connection conn = null;

		try {
			conn = getSessionBean1().getManager().getConnectionManager();
			ServletContext theApplicationsServletContext = (ServletContext) this.getExternalContext().getContext();
			String realPath = theApplicationsServletContext.getRealPath(Soporte.REPORTE_DIRECTORIO);
			fillParams.put("PATH_TO_SUBREPORTS", realPath);
			fillParams.put("SUBREPORT_DIR", realPath);
			fillParams.put("PCODG_CERTI_EXTERNO", new Integer(getResultado()));
			fillParams.put("JefeRNC", getSessionBean1().getFirmaAutorizada().getDESC_SUMILLA().trim());
			fillParams.put("FirmaNombre", getSessionBean1().getFirmaAutorizada().getDESC_NOMBRE().trim());

			String reporteJASPER = "reportPrincipalB";
			String formato = Soporte.REPORTE_FORMATO_PDF;
			String nombrePDF = null;

			getSessionBean1().jasperReport(nombrePDF, reporteJASPER, formato, fillParams, conn);
		} catch (Exception ex) {
			logger.error(" Error extrayendo informaci\363n: " , ex);
			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch (SQLException sqle) {
				logger.error(" Error haciendo rollback ",sqle);
			}
		} finally{
			if(conn!=null)
				try {
		            conn.close();
		        } catch (SQLException e) { /* ignored */}

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
