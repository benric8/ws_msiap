/*
 * login.java
 *
 * Created on 26 de febrero de 2007, 02:52 PM
 * Copyright user
 */
package uif;


import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputSecret;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlMessages;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import pe.gob.pj.rnc.log.MyLogger;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;

/**
 * <p>
 * Page bean that corresponds to a similarly named JSP page. This class contains
 * component definitions (and initialization code) for all components that you
 * have defined on this page, as well as lifecycle methods and event handlers
 * where you may add behavior to respond to incoming events.
 * </p>
 */
public class modSoliClave extends AbstractPageBean {
	static MyLogger logger= new MyLogger(modSoliClave.class.getName());
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
	private Button btnCancelar = new Button();

	public Button getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(Button b) {
		this.btnCancelar = b;
	}
	private HtmlOutputText outputText2 = new HtmlOutputText();

	public HtmlOutputText getOutputText2() {
		return outputText2;
	}

	public void setOutputText2(HtmlOutputText hot) {
		this.outputText2 = hot;
	}

	private HtmlOutputText outputText3 = new HtmlOutputText();

	public HtmlOutputText getOutputText3() {
		return outputText3;
	}

	public void setOutputText3(HtmlOutputText hot) {
		this.outputText3 = hot;
	}

	private HtmlInputText txtUsuario = new HtmlInputText();

	public HtmlInputText getTxtUsuario() {
		return txtUsuario;
	}

	public void setTxtUsuario(HtmlInputText hit) {
		this.txtUsuario = hit;
	}

	private HtmlMessages messageList1 = new HtmlMessages();

	public HtmlMessages getMessageList1() {
		return messageList1;
	}

	public void setMessageList1(HtmlMessages hm) {
		this.messageList1 = hm;
	}

	private HtmlInputSecret secContrasenha = new HtmlInputSecret();

	public HtmlInputSecret getSecContrasenha() {
		return secContrasenha;
	}

	public void setSecContrasenha(HtmlInputSecret his) {
		this.secContrasenha = his;
	}

	private Link link2 = new Link();

	public Link getLink2() {
		return link2;
	}

	public void setLink2(Link l) {
		this.link2 = l;
	}

	private HtmlInputText textField1 = new HtmlInputText();

	public HtmlInputText getTextField1() {
		return textField1;
	}

	public void setTextField1(HtmlInputText hit) {
		this.textField1 = hit;
	}

	/**
	 * <p>
	 * Construct a new Page bean instance.
	 * </p>
	 */
	public modSoliClave() {
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
			logger.error("Page1 Initialization Failure", e);
			throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
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
		int z = getSessionBean1().getIntentosLogin();
		if (z > 2) {
			this.setRenderCaptcha(true);
		}
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


public String btnCancelar_action() {


		return "inicioInterno";
	}
	/**
	 * Método que valida el ingreso del ussuario al sistema.
	 *
	 * Revision:
	 * 18/09/2008:
	 * 		Tener en cuenta que usuario esta soportado en "alfanumerico mayusculas" y contraseña soportado en "alfanumerico mayusculas y minisculas".
	 *
	 * @return
	 */
	public String btnModificar_action() {

		return "inicioInterno";
	}

	public void secContrasenha_validate(FacesContext context, UIComponent component, Object value) {
		String s = String.valueOf(value);
		if (!s.matches("[a-zA-Z0-9]{8,20}")) {
			throw new ValidatorException(new FacesMessage("El campo contraseña contiene caracteres inválidos y debe estar en el rango desde 8 hasta 20 caracteres"));
		}
	}

	public void txtUsuario_validate(FacesContext context, UIComponent component, Object value) {
		String s = String.valueOf(value);
		if (!s.matches("[a-zA-Z0-9]{4,20}")) {
			throw new ValidatorException(new FacesMessage("El campo usuario contiene caracteres inválidos!"));
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
	protected fraHeader getfraHeader() {
		return (fraHeader) getBean("fraHeader");
	}

//	private String[] contarIntentoLogin(ArrayList<String[]> usuariosIntentaron, String codigoUsuario) {
//		boolean found = false;
//		String temp[] = null;
//		if (usuariosIntentaron != null && !usuariosIntentaron.isEmpty()) {
//
//			for (String[] usuario : usuariosIntentaron) {
//				if (codigoUsuario.equals(usuario[0])) {
//					int intentos;
//					intentos = Integer.parseInt(usuario[1]);
//					usuario[1] = String.valueOf(++intentos);
//					found = true;
//					temp = usuario;
//					break;
//				}
//			}
//		} else {
//			usuariosIntentaron = new ArrayList<String[]>();
//		}
//		if (!found) {
//			temp = (String[]) Array.newInstance(String.class, 2);
//			temp[0] = codigoUsuario;
//			temp[1] = "1";
//			usuariosIntentaron.add(temp);
//		}
//		getSessionBean1().setLoginsUsuario(usuariosIntentaron);
//		return temp;
//	}

	private Boolean renderCaptcha = false;

	public Boolean getRenderCaptcha() {
		return renderCaptcha;
	}

	public void setRenderCaptcha(Boolean renderCaptcha) {
		this.renderCaptcha = renderCaptcha;
	}

}
