/*
 * admContrasenha.java
 *
 * Created on 27 de febrero de 2007, 10:03 AM
 * Copyright user
 */
package uif;

import java.sql.SQLException;

import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlMessage;
import javax.faces.component.html.HtmlMessages;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import pe.gob.pj.rnc.log.MyLogger;
import pe.gob.pj.rnc.model.Aud_usuario_tablas_cab_det;
import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.rnc.model.UsuarioCamposAud;
import pe.gob.pj.rnc.service.UsuarioManager;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import com.sun.rave.web.ui.component.PageSeparator;
import com.sun.rave.web.ui.component.PasswordField;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.TextField;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class admContrasenha extends AbstractPageBean {
    static MyLogger	logger	= new MyLogger(admContrasenha.class.getName());
	// <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    //private int __placeholder;

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
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

    private HtmlOutputText outputText4 = new HtmlOutputText();

    public HtmlOutputText getOutputText4() {
        return outputText4;
    }

    public void setOutputText4(HtmlOutputText hot) {
        this.outputText4 = hot;
    }

    private HtmlOutputText outputText5 = new HtmlOutputText();

    public HtmlOutputText getOutputText5() {
        return outputText5;
    }

    public void setOutputText5(HtmlOutputText hot) {
        this.outputText5 = hot;
    }

    private HtmlOutputText outputText6 = new HtmlOutputText();

    public HtmlOutputText getOutputText6() {
        return outputText6;
    }

    public void setOutputText6(HtmlOutputText hot) {
        this.outputText6 = hot;
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

    private TextField txtCorreoElectronico = new TextField();

    public TextField getTxtCorreoElectronico() {
        return txtCorreoElectronico;
    }

    public void setTxtCorreoElectronico(TextField tf) {
        this.txtCorreoElectronico = tf;
    }

    private Button btnCambiar = new Button();

    public Button getBtnCambiar() {
        return btnCambiar;
    }

    public void setBtnCambiar(Button b) {
        this.btnCambiar = b;
    }

    private Label label1 = new Label();

    public Label getLabel1() {
        return label1;
    }

    public void setLabel1(Label l) {
        this.label1 = l;
    }

    private StaticText staticText2 = new StaticText();

    public StaticText getStaticText2() {
        return staticText2;
    }

    public void setStaticText2(StaticText st) {
        this.staticText2 = st;
    }

    private Button btnVolver = new Button();

    public Button getBtnVolver() {
        return btnVolver;
    }

    public void setBtnVolver(Button b) {
        this.btnVolver = b;
    }

    private HtmlMessages messageList1 = new HtmlMessages();

    public HtmlMessages getMessageList1() {
        return messageList1;
    }

    public void setMessageList1(HtmlMessages hm) {
        this.messageList1 = hm;
    }

    private PasswordField txtContrasenhaActual = new PasswordField();

    public PasswordField getTxtContrasenhaActual() {
        return txtContrasenhaActual;
    }

    public void setTxtContrasenhaActual(PasswordField pf) {
        this.txtContrasenhaActual = pf;
    }

    private PasswordField txtNuevaContrasenha = new PasswordField();

    public PasswordField getTxtNuevaContrasenha() {
        return txtNuevaContrasenha;
    }

    public void setTxtNuevaContrasenha(PasswordField pf) {
        this.txtNuevaContrasenha = pf;
    }

    private PasswordField txtConfirmacionContrasenha = new PasswordField();

    public PasswordField getTxtConfirmacionContrasenha() {
        return txtConfirmacionContrasenha;
    }

    public void setTxtConfirmacionContrasenha(PasswordField pf) {
        this.txtConfirmacionContrasenha = pf;
    }

    private HtmlMessage inlineMessage1 = new HtmlMessage();

    public HtmlMessage getInlineMessage1() {
        return inlineMessage1;
    }

    public void setInlineMessage1(HtmlMessage hm) {
        this.inlineMessage1 = hm;
    }

    private HtmlMessage inlineMessage2 = new HtmlMessage();

    public HtmlMessage getInlineMessage2() {
        return inlineMessage2;
    }

    public void setInlineMessage2(HtmlMessage hm) {
        this.inlineMessage2 = hm;
    }

    private HtmlMessage inlineMessage3 = new HtmlMessage();

    public HtmlMessage getInlineMessage3() {
        return inlineMessage3;
    }

    public void setInlineMessage3(HtmlMessage hm) {
        this.inlineMessage3 = hm;
    }

    private HtmlMessage inlineMessage4 = new HtmlMessage();

    public HtmlMessage getInlineMessage4() {
        return inlineMessage4;
    }

    public void setInlineMessage4(HtmlMessage hm) {
        this.inlineMessage4 = hm;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public admContrasenha() {
    }

    /**
     * <p>Callback method that is called whenever a page is navigated to,
     * either directly via a URL, or indirectly via page navigation.
     * Customize this method to acquire resources that will be needed
     * for event handlers and lifecycle methods, whether or not this
     * page is performing post back processing.</p>
     *
     * <p>Note that, if the current request is a postback, the property
     * values of the components do <strong>not</strong> represent any
     * values submitted with this request.  Instead, they represent the
     * property values that were saved for this view when it was rendered.</p>
     */
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized

        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            logger.error("admContrasenha Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }

        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
    }

    /**
     * <p>Callback method that is called after the component tree has been
     * restored, but before any event processing takes place.  This method
     * will <strong>only</strong> be called on a postback request that
     * is processing a form submit.  Customize this method to allocate
     * resources that will be required in your event handlers.</p>
     */
    public void preprocess() {
    }

    /**
     * <p>Callback method that is called just before rendering takes place.
     * This method will <strong>only</strong> be called for the page that
     * will actually be rendered (and not, for example, on a page that
     * handled a postback and then navigated to a different page).  Customize
     * this method to allocate resources that will be required for rendering
     * this page.</p>
     */
    public void prerender() {
    }

    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called (regardless of whether
     * or not this was the page that was actually rendered).  Customize this
     * method to release resources acquired in the <code>init()</code>,
     * <code>preprocess()</code>, or <code>prerender()</code> methods (or
     * acquired during execution of an event handler).</p>
     */
    public void destroy() {
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1)getBean("RequestBean1");
    }

	/**
	 * <p>
	 * Return a reference to the scoped data bean.
	 * </p>
	 */
	protected SessionBean1 getSessionBean1() {
		return (SessionBean1) getBean("SessionBean1");
	}

	public String bcambiar_action() {
		return "case2";
	}

    /**
     * Método permite el cambio de contraseña del usuario.
     *
     * Revision:
     * 18/09/2008
     * 		Se agrego la funcionalidad de encriptacion de la nueva contraseña establecida por el usuario.
     * 		Se usa el objeto UsuarioManager, se consume el método "cerrarCadena(...)" para encriptar la contraseña.
     *
     * @return
     */
    public String btnCambiar_action() {
        String conActual = (String)txtContrasenhaActual.getPassword();
        String conNueva  = (String)txtNuevaContrasenha.getPassword();
        String confirma  = (String)txtConfirmacionContrasenha.getPassword();
        Usuario usuario= getSessionBean1().getUsuario();

		try {

	        if (!conNueva.equals(confirma)){
	        	error("La nueva contraseña y su confirmación son diferentes.");
	        	return null;
	        }
	        //VALIDAR FORTALEZA DE LA CLAVE
			boolean hasNumber = conNueva.matches(".*\\d.*");
			boolean hasAlphabet = conNueva.matches(".*[a-zA-Z]+.*");

			if (!hasNumber || !hasAlphabet) {
				error("La nueva contraseña debe tener al menos un número y una letra.");
	            return null;
	        }

			UsuarioManager servicioUsuario = new UsuarioManager();
	        //String claveCerrada = servicioUsuario.encriptarCadena(conActual);
	        Usuario usuarioTemp = servicioUsuario.selectUsuario(usuario.getCODG_USUAR(), conActual);
	        if (usuarioTemp != null){

	        		String claveTmp = servicioUsuario.encriptarCadena(confirma);
	                //if(usuario.getC_CLAVE().equals(claveTmp)){
	                	//error("La nueva contraseña debe de ser diferente a la contraseña actual.");
	                	//return null;
	                //}
	                usuario.setC_CLAVE(claveTmp);

	                //usuario.setDESC_COREEO(String.valueOf(txtCorreoElectronico.getValue()));
	                int x = servicioUsuario.updateUsuarioSelective(usuario);
	                if (x == 1){
	                	Aud_usuario_tablas_cab_det audCD = new Aud_usuario_tablas_cab_det();
						audCD.setMotivo(getSessionBean1().getUsuario().getCODG_USUAR() + " Cambio la clave de "
								+ usuario.getCODG_USUAR());
						audCD.setC_accion(audCD.ACTUALIZA);
						audCD.setC_usuario(getSessionBean1().getUsuario().getCODG_USUAR());
						UsuarioCamposAud cau = new UsuarioCamposAud();
						cau.setC_CLAVE("CAMBIO DE CLAVE");
						cau.setDESC_COREEO(usuario.getDESC_COREEO());
						audCD.setCamposAudit(cau);
						usuario.auditoria(null, audCD);
	                    info("Actualización exitosa");
	                    getSessionBean1().setUsuario(usuario);

	                    txtContrasenhaActual.setValue("");
	                    txtNuevaContrasenha.setValue("");
	                    txtConfirmacionContrasenha.setValue("");
	                    txtCorreoElectronico.setValue("");
	                } else if(x == 0){
	                    error("Error de actualización");
	                }
	        }else{
	            error("La CONTRASEÑA ACTUAL ingresada es incorrecta.");
	        }
		} catch (SQLException e) {
			error("Error de conexión");
			e.printStackTrace();
		}

        return null;
    }

//    public void txtContrasenhaActual_validate(FacesContext context, UIComponent component, Object value) {
//        String s = String.valueOf(value);
//        if (!s.matches("[a-zA-Z0-9]{8,15}")){
//            throw new ValidatorException(new FacesMessage("Los campos de contraseña solo permiten caracteres alfanuméricos. mínimo 8 máximo 15!"));
//        }
//    }

    public void txtContrasenhaActual_validate(FacesContext context, UIComponent component, Object value) {
		String s = String.valueOf(value);
		
		if(s!=null && s.length()==0){
			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"La clave no debe de tener menos de 6 dígitos ni contener espacios en blanco",""));
		}
	}
    
	public void txtContrasenhaNueva_validate(FacesContext context, UIComponent component, Object value) {
		String s = String.valueOf(value);
		
		if(s!=null && s.length()==0){
			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"La clave no debe de tener menos de 6 dígitos ni contener espacios en blanco",""));
		}else{
			if(!s.matches("^(?:\\S{5,14}\\S)?$")){
				throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR,
						"La clave no debe de tener menos de 6 dígitos ni contener espacios en blanco",""));
			}
			if(txtNuevaContrasenha.getSubmittedValue()!=null && 
					!txtNuevaContrasenha.getSubmittedValue().equals(txtConfirmacionContrasenha.getSubmittedValue()))
				throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Nueva contraseña y confirmación de contraseña no son iguales.",""));
		}
	}
	
    public void txtCorreoElectronico_validate(FacesContext context, UIComponent component, Object value) {
        String s = String.valueOf(value);
        if (!s.matches("[a-zA-Z0-9_\\.]{1,20}[@][a-zA-Z0-9_\\.]{1,20}[\\.][a-zA-Z0-9_]{1,8}")){
            throw new ValidatorException(new FacesMessage("El campo de correo es inválido!"));
        }
    }

    public String btnVolver_action() {
        return "inicio";
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected fragHeader getfragHeader() {
        return (fragHeader)getBean("fragHeader");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected fraHeader getfraHeader() {
        return (fraHeader)getBean("fraHeader");
    }
}

