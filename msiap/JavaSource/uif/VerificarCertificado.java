/**
 *
 */
package uif;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.FacesException;
import javax.faces.component.UISelectItems;
import javax.faces.component.html.HtmlMessage;
import javax.faces.component.html.HtmlMessages;
import javax.faces.component.html.HtmlSelectOneMenu;

import pe.gob.pj.rnc.log.MyLogger;
import pe.gob.pj.rnc.model.SolicitudReporte;
import pe.gob.pj.rnc.model.Usuario;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import com.sun.rave.web.ui.component.Script;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.TextField;


/**
 * @author Administrador
 *
 */
public class VerificarCertificado extends AbstractPageBean {
	static MyLogger logger= new MyLogger(VerificarCertificado.class.getName());
	/**
	 * <p>
	 * Automatically managed component initialization. <strong>WARNING:</strong>
	 * This method is automatically generated, so any user-specified code
	 * inserted here is subject to being replaced.
	 * </p>
	 */

	private SolicitudReporte solicitudReporte;
	private String displayCertificado="none";

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
	private UISelectItems dropdown11SelectItems = new UISelectItems();
	private HtmlSelectOneMenu ddDistritoJudicial = new HtmlSelectOneMenu();
	private HtmlMessage messageList2 = new HtmlMessage();

	private HtmlMessage messageList1 = new HtmlMessage();

	private HtmlMessage messageList3 = new HtmlMessage();

	private HtmlMessages messageList4 = new HtmlMessages();

	private TextField txtNroSolicitud = new TextField();

	private TextField txtAnio = new TextField();
	private TextField txtMes = new TextField();

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

	private Button button2 = new Button();

	private Button btnNuevo = new Button();

	public Button getButton2() {
		return button2;
	}

	public void setButton2(Button b) {
		this.button2 = b;
	}

	private StaticText staticText6 = new StaticText();

	public StaticText getStaticText6() {
		return staticText6;
	}

	public void setStaticText6(StaticText st) {
		this.staticText6 = st;
	}

	private Script script1 = new Script();

	public Script getScript1() {
		return script1;
	}

	public void setScript1(Script s) {
		this.script1 = s;
	}

	public VerificarCertificado() {
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

	public String btnVerCertificado() {
		Usuario usuario = getSessionBean1().getUsuario();
		if(!usuario.isPerfilSupervisorJudicial()) {
			info("No está autorizado para realizar esta operación.");
			return null;
		}

		int anio = 0;
		int mes = 0;
		String nroSolicitud = String.valueOf(txtNroSolicitud.getValue());
		try {

			if(nroSolicitud==null) {
				info("Ingrese NÚMERO DE CERTIFICADO.");
				return null;
			}

			if(txtAnio.getValue()!=null)
				anio = Integer.parseInt((String) txtAnio.getValue());
			else{
				info("Ingrese el AÑO de presentación de la solicitud.");
				return null;
			}

			if(txtMes.getValue()!=null)
				mes = Integer.parseInt((String) txtMes.getValue());
			else{
				info("Ingrese el MES de presentación de la solicitud.");
				return null;
			}

			Map<String, Object> params = new HashMap<String, Object>();
			params.put("NUME_CERTI", nroSolicitud);
			params.put("TIPO_SOLIC", "03,07");
			params.put("ANIO", anio);
			params.put("MES", mes);
			List<SolicitudReporte> lista = this.getSessionBean1().getManager().reporteSolicitudMagistradoParams(params);

			solicitudReporte = lista!=null && lista.size()==1?lista.get(0):null;

			if(solicitudReporte!=null){
				if("REG".equals(solicitudReporte.getCodg_estado_solicitud())){
					solicitudReporte = null;
					info("La solicitud se encuentra observada.");
				}
				else displayCertificado = "";
			}
			else info("No se encontró el certificado con número " + nroSolicitud);

		} catch (NumberFormatException ne){
			info("Valor incorrecto. Ingrese un valor numérico.");
		} catch (Exception e) {
			error("Ocurrió un error en la consulta.");
			e.printStackTrace();
			logger.error(" Error buscando el certificado para validar.", e);
		}

		return null;
	}


	public String btnNuevo_action() {
		txtNroSolicitud.setSubmittedValue("");
		txtAnio.setSubmittedValue("");
		txtMes.setSubmittedValue("");
		displayCertificado = "none";
		return null;
	}


	public String getColor() {
		return "color: rgb(153, 0, 0); font-weight: bold;";
	}

	private boolean flgRegistros;

	public boolean isFlgRegistros() {
		return flgRegistros;
	}

	public void setFlgRegistros(boolean flgRegistros) {
		this.flgRegistros = flgRegistros;
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

	public TextField getTxtAnio() {
		return txtAnio;
	}

	public void setTxtAnio(TextField txtAnio) {
		this.txtAnio = txtAnio;
	}

	public TextField getTxtMes() {
		return txtMes;
	}

	public void setTxtMes(TextField txtMes) {
		this.txtMes = txtMes;
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

	public HtmlMessages getMessageList4() {
		return messageList4;
	}

	public void setMessageList4(HtmlMessages messageList4) {
		this.messageList4 = messageList4;
	}

	public Button getBtnNuevo() {
		return btnNuevo;
	}

	public void setBtnNuevo(Button btnNuevo) {
		this.btnNuevo = btnNuevo;
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

	public String getDisplayCertificado() {
		return displayCertificado;
	}

	public void setDisplayCertificado(String displayCertificado) {
		this.displayCertificado = displayCertificado;
	}

	public SolicitudReporte getSolicitudReporte() {
		return solicitudReporte;
	}

	public void setSolicitudReporte(SolicitudReporte solicitudReporte) {
		this.solicitudReporte = solicitudReporte;
	}


}