/*
 * fraHeader.java
 *
 * Created on 11 de julio de 2007, 6:26
 * Copyright Administrador
 */
package uif;

import java.util.ArrayList;

import javax.faces.FacesException;

import pe.gob.pj.rnc.log.MyLogger;
import pe.gob.pj.rnc.model.SolicitudExterna;


import com.sun.rave.web.ui.appbase.AbstractFragmentBean;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Hyperlink;
import com.sun.rave.web.ui.component.ImageHyperlink;
import com.sun.rave.web.ui.component.StaticText;

/**
 * <p>Fragment bean that corresponds to a similarly named JSP page
 * fragment.  This class contains component definitions (and initialization
 * code) for all components that you have defined on this fragment, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class fraHeader extends AbstractFragmentBean {

	static MyLogger logger= new MyLogger(fraHeader.class.getName());


    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    //private int __placeholder;

    /**
     * <p>Automatically managed component initialization. <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }

    private ImageHyperlink ihInicio = new ImageHyperlink();
   private Hyperlink hyperLink1 = new Hyperlink();

    public ImageHyperlink getIhInicio() {
        return ihInicio;
    }

    public void setIhInicio(ImageHyperlink ih) {
        this.ihInicio = ih;
    }

    private ImageHyperlink ihReportes = new ImageHyperlink();

    public ImageHyperlink getIhReportes() {
        return ihReportes;
    }

    public void setIhReportes(ImageHyperlink ih) {
        this.ihReportes = ih;
    }

    private ImageHyperlink ihCerrarSesion = new ImageHyperlink();

    public ImageHyperlink getIhCerrarSesion() {
        return ihCerrarSesion;
    }

    public void setIhCerrarSesion(ImageHyperlink ih) {
        this.ihCerrarSesion = ih;
    }

    private ImageHyperlink ihIngresar = new ImageHyperlink();

    public ImageHyperlink getIhIngresar() {
        return ihIngresar;
    }

    public void setIhIngresar(ImageHyperlink ih) {
        this.ihIngresar = ih;
    }
    private ImageHyperlink ihCabecera = new ImageHyperlink();

    public ImageHyperlink getIhCabecera() {
        return ihCabecera;
    }

    public void setIhCabecera(ImageHyperlink ih) {
        this.ihCabecera = ih;
    }

    private ImageHyperlink ihCambiarContrasenha = new ImageHyperlink();

    public ImageHyperlink getIhCambiarContrasenha() {
        return ihCambiarContrasenha;
    }

    public void setIhCambiarContrasenha(ImageHyperlink ih) {
        this.ihCambiarContrasenha = ih;
    }

    private ImageHyperlink ihAyuda = new ImageHyperlink();

    public ImageHyperlink getIhAyuda() {
        return ihAyuda;
    }

    public void setIhAyuda(ImageHyperlink ih) {
        this.ihAyuda = ih;
    }

    private StaticText stUsuario = new StaticText();

    public StaticText getStUsuario() {
        return stUsuario;
    }

    public void setStUsuario(StaticText st) {
        this.stUsuario = st;
    }

    private Form form1 = new Form();

    public Form getForm1() {
        return form1;
    }

    public void setForm1(Form f) {
        this.form1 = f;
    }
    // </editor-fold>

    public fraHeader() {
    }

    /**
     * <p>Callback method that is called whenever a page containing
     * this page fragment is navigated to, either directly via a URL,
     * or indirectly via page navigation.  Override this method to acquire
     * resources that will be needed for event handlers and lifecycle methods.</p>
     *
     * <p>The default implementation does nothing.</p>
     */
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized


        // <editor-fold defaultstate="collapsed" desc="Visual-Web-managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            logger.error("Page1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }

        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
    }

    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called.  Override this
     * method to release resources acquired in the <code>init()</code>
     * resources that will be needed for event handlers and lifecycle methods.</p>
     *
     * <p>The default implementation does nothing.</p>
     */
    public void destroy() {
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1)getBean("SessionBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1)getBean("RequestBean1");
    }

    public String ihReportes_action() {
        return "reportes";
    }

    public String ihCerrarSesion_action() {
       return "cerrarSesion";
    }

    public String ihInicio_action() {
       return "inicio";
    }

    public String ihCambiarContrasenha_action() {
       return "cambiarContrasenha";
    }

    public String ihAyuda_action() {
        return "admAyuda";
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected uif.fragHeader getfragHeader() {
        return (uif.fragHeader)getBean("fragHeader");
    }

    private ImageHyperlink ihAdmUsuario = new ImageHyperlink();

    public ImageHyperlink getIhAdmUsuario() {
        return ihAdmUsuario;
    }

    public void setIhAdmUsuario(ImageHyperlink ih) {
        this.ihAdmUsuario = ih;
    }

    public String ihUsuario_action() {
        return "admUsuario";
    }

	public Hyperlink getHyperLink1() {
		return hyperLink1;
	}

	public void setHyperLink1(Hyperlink hyperLink1) {
		this.hyperLink1 = hyperLink1;
	}


}
