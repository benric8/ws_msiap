/*
 * ingSolicitudMultiple.java
 *
 * Created on 27 de febrero de 2007, 07:25 AM
 * Copyright user
 */
package uif;

import javax.faces.FacesException;
import javax.faces.component.UIColumn;
import javax.faces.component.UISelectItems;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlMessages;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.component.html.HtmlPanelGroup;
import javax.faces.component.html.HtmlSelectOneMenu;

import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.faces.data.CachedRowSetDataModel;
import com.sun.rave.faces.data.DefaultSelectItemsArray;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Hyperlink;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class ingSolicitudMultiple_1 extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    //private int __placeholder;

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        solicitudes_provinciaDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet)getValue("#{SessionBean1.solicitudes_provinciaRowSet}"));
        dataTable1Model.setCachedRowSet((javax.sql.rowset.CachedRowSet)getValue("#{SessionBean1.solicitudes_provinciaRowSet}"));
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

    private HtmlInputText textField1 = new HtmlInputText();

    public HtmlInputText getTextField1() {
        return textField1;
    }

    public void setTextField1(HtmlInputText hit) {
        this.textField1 = hit;
    }

    private HtmlOutputText outputText1 = new HtmlOutputText();

    public HtmlOutputText getOutputText1() {
        return outputText1;
    }

    public void setOutputText1(HtmlOutputText hot) {
        this.outputText1 = hot;
    }

    private HtmlSelectOneMenu dropdown1 = new HtmlSelectOneMenu();

    public HtmlSelectOneMenu getDropdown1() {
        return dropdown1;
    }

    public void setDropdown1(HtmlSelectOneMenu hsom) {
        this.dropdown1 = hsom;
    }

    private DefaultSelectItemsArray dropdown1DefaultItems = new DefaultSelectItemsArray();

    public DefaultSelectItemsArray getDropdown1DefaultItems() {
        return dropdown1DefaultItems;
    }

    public void setDropdown1DefaultItems(DefaultSelectItemsArray dsia) {
        this.dropdown1DefaultItems = dsia;
    }

    private UISelectItems dropdown1SelectItems = new UISelectItems();

    public UISelectItems getDropdown1SelectItems() {
        return dropdown1SelectItems;
    }

    public void setDropdown1SelectItems(UISelectItems uisi) {
        this.dropdown1SelectItems = uisi;
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

    private HtmlOutputText outputText4 = new HtmlOutputText();

    public HtmlOutputText getOutputText4() {
        return outputText4;
    }

    public void setOutputText4(HtmlOutputText hot) {
        this.outputText4 = hot;
    }

    private HtmlInputText textField2 = new HtmlInputText();

    public HtmlInputText getTextField2() {
        return textField2;
    }

    public void setTextField2(HtmlInputText hit) {
        this.textField2 = hit;
    }

    private HtmlOutputText outputText5 = new HtmlOutputText();

    public HtmlOutputText getOutputText5() {
        return outputText5;
    }

    public void setOutputText5(HtmlOutputText hot) {
        this.outputText5 = hot;
    }

    private HtmlCommandButton button1 = new HtmlCommandButton();

    public HtmlCommandButton getButton1() {
        return button1;
    }

    public void setButton1(HtmlCommandButton hcb) {
        this.button1 = hcb;
    }

    private HtmlCommandButton button2 = new HtmlCommandButton();

    public HtmlCommandButton getButton2() {
        return button2;
    }

    public void setButton2(HtmlCommandButton hcb) {
        this.button2 = hcb;
    }

    private HtmlDataTable dataTable1 = new HtmlDataTable();

    public HtmlDataTable getDataTable1() {
        return dataTable1;
    }

    public void setDataTable1(HtmlDataTable hdt) {
        this.dataTable1 = hdt;
    }

    private CachedRowSetDataProvider solicitudes_provinciaDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getSolicitudes_provinciaDataProvider() {
        return solicitudes_provinciaDataProvider;
    }

    public void setSolicitudes_provinciaDataProvider(CachedRowSetDataProvider crsdp) {
        this.solicitudes_provinciaDataProvider = crsdp;
    }

    private UIColumn column3 = new UIColumn();

    public UIColumn getColumn3() {
        return column3;
    }

    public void setColumn3(UIColumn uic) {
        this.column3 = uic;
    }

    private HtmlOutputText outputText10 = new HtmlOutputText();

    public HtmlOutputText getOutputText10() {
        return outputText10;
    }

    public void setOutputText10(HtmlOutputText hot) {
        this.outputText10 = hot;
    }

    private HtmlOutputText outputText11 = new HtmlOutputText();

    public HtmlOutputText getOutputText11() {
        return outputText11;
    }

    public void setOutputText11(HtmlOutputText hot) {
        this.outputText11 = hot;
    }

    private UIColumn column4 = new UIColumn();

    public UIColumn getColumn4() {
        return column4;
    }

    public void setColumn4(UIColumn uic) {
        this.column4 = uic;
    }

    private HtmlOutputText outputText12 = new HtmlOutputText();

    public HtmlOutputText getOutputText12() {
        return outputText12;
    }

    public void setOutputText12(HtmlOutputText hot) {
        this.outputText12 = hot;
    }

    private HtmlOutputText outputText13 = new HtmlOutputText();

    public HtmlOutputText getOutputText13() {
        return outputText13;
    }

    public void setOutputText13(HtmlOutputText hot) {
        this.outputText13 = hot;
    }

    private UIColumn column5 = new UIColumn();

    public UIColumn getColumn5() {
        return column5;
    }

    public void setColumn5(UIColumn uic) {
        this.column5 = uic;
    }

    private HtmlOutputText outputText14 = new HtmlOutputText();

    public HtmlOutputText getOutputText14() {
        return outputText14;
    }

    public void setOutputText14(HtmlOutputText hot) {
        this.outputText14 = hot;
    }

    private HtmlOutputText outputText15 = new HtmlOutputText();

    public HtmlOutputText getOutputText15() {
        return outputText15;
    }

    public void setOutputText15(HtmlOutputText hot) {
        this.outputText15 = hot;
    }

    private UIColumn column6 = new UIColumn();

    public UIColumn getColumn6() {
        return column6;
    }

    public void setColumn6(UIColumn uic) {
        this.column6 = uic;
    }

    private HtmlOutputText outputText16 = new HtmlOutputText();

    public HtmlOutputText getOutputText16() {
        return outputText16;
    }

    public void setOutputText16(HtmlOutputText hot) {
        this.outputText16 = hot;
    }

    private HtmlOutputText outputText17 = new HtmlOutputText();

    public HtmlOutputText getOutputText17() {
        return outputText17;
    }

    public void setOutputText17(HtmlOutputText hot) {
        this.outputText17 = hot;
    }

    private UIColumn column7 = new UIColumn();

    public UIColumn getColumn7() {
        return column7;
    }

    public void setColumn7(UIColumn uic) {
        this.column7 = uic;
    }

    private HtmlOutputText outputText18 = new HtmlOutputText();

    public HtmlOutputText getOutputText18() {
        return outputText18;
    }

    public void setOutputText18(HtmlOutputText hot) {
        this.outputText18 = hot;
    }

    private HtmlOutputText outputText19 = new HtmlOutputText();

    public HtmlOutputText getOutputText19() {
        return outputText19;
    }

    public void setOutputText19(HtmlOutputText hot) {
        this.outputText19 = hot;
    }

    private UIColumn column25 = new UIColumn();

    public UIColumn getColumn25() {
        return column25;
    }

    public void setColumn25(UIColumn uic) {
        this.column25 = uic;
    }

    private HtmlOutputText outputText54 = new HtmlOutputText();

    public HtmlOutputText getOutputText54() {
        return outputText54;
    }

    public void setOutputText54(HtmlOutputText hot) {
        this.outputText54 = hot;
    }

    private HtmlOutputText outputText55 = new HtmlOutputText();

    public HtmlOutputText getOutputText55() {
        return outputText55;
    }

    public void setOutputText55(HtmlOutputText hot) {
        this.outputText55 = hot;
    }

    private HtmlOutputText outputText6 = new HtmlOutputText();

    public HtmlOutputText getOutputText6() {
        return outputText6;
    }

    public void setOutputText6(HtmlOutputText hot) {
        this.outputText6 = hot;
    }

    private CachedRowSetDataModel dataTable1Model = new CachedRowSetDataModel();

    public CachedRowSetDataModel getDataTable1Model() {
        return dataTable1Model;
    }

    public void setDataTable1Model(CachedRowSetDataModel crsdm) {
        this.dataTable1Model = crsdm;
    }

    private HtmlPanelGroup groupPanel1 = new HtmlPanelGroup();

    public HtmlPanelGroup getGroupPanel1() {
        return groupPanel1;
    }

    public void setGroupPanel1(HtmlPanelGroup hpg) {
        this.groupPanel1 = hpg;
    }

    private HtmlCommandButton dataTable1HeaderFirstButton = new HtmlCommandButton();

    public HtmlCommandButton getDataTable1HeaderFirstButton() {
        return dataTable1HeaderFirstButton;
    }

    public void setDataTable1HeaderFirstButton(HtmlCommandButton hcb) {
        this.dataTable1HeaderFirstButton = hcb;
    }

    private HtmlCommandButton dataTable1HeaderPreviousButton = new HtmlCommandButton();

    public HtmlCommandButton getDataTable1HeaderPreviousButton() {
        return dataTable1HeaderPreviousButton;
    }

    public void setDataTable1HeaderPreviousButton(HtmlCommandButton hcb) {
        this.dataTable1HeaderPreviousButton = hcb;
    }

    private HtmlCommandButton dataTable1HeaderNextButton = new HtmlCommandButton();

    public HtmlCommandButton getDataTable1HeaderNextButton() {
        return dataTable1HeaderNextButton;
    }

    public void setDataTable1HeaderNextButton(HtmlCommandButton hcb) {
        this.dataTable1HeaderNextButton = hcb;
    }

    private HtmlCommandButton dataTable1HeaderLastButton = new HtmlCommandButton();

    public HtmlCommandButton getDataTable1HeaderLastButton() {
        return dataTable1HeaderLastButton;
    }

    public void setDataTable1HeaderLastButton(HtmlCommandButton hcb) {
        this.dataTable1HeaderLastButton = hcb;
    }

    private HtmlPanelGroup groupPanel2 = new HtmlPanelGroup();

    public HtmlPanelGroup getGroupPanel2() {
        return groupPanel2;
    }

    public void setGroupPanel2(HtmlPanelGroup hpg) {
        this.groupPanel2 = hpg;
    }

    private HtmlCommandButton dataTable1FooterFirstButton = new HtmlCommandButton();

    public HtmlCommandButton getDataTable1FooterFirstButton() {
        return dataTable1FooterFirstButton;
    }

    public void setDataTable1FooterFirstButton(HtmlCommandButton hcb) {
        this.dataTable1FooterFirstButton = hcb;
    }

    private HtmlCommandButton dataTable1FooterPreviousButton = new HtmlCommandButton();

    public HtmlCommandButton getDataTable1FooterPreviousButton() {
        return dataTable1FooterPreviousButton;
    }

    public void setDataTable1FooterPreviousButton(HtmlCommandButton hcb) {
        this.dataTable1FooterPreviousButton = hcb;
    }

    private HtmlCommandButton dataTable1FooterNextButton = new HtmlCommandButton();

    public HtmlCommandButton getDataTable1FooterNextButton() {
        return dataTable1FooterNextButton;
    }

    public void setDataTable1FooterNextButton(HtmlCommandButton hcb) {
        this.dataTable1FooterNextButton = hcb;
    }

    private HtmlCommandButton dataTable1FooterLastButton = new HtmlCommandButton();

    public HtmlCommandButton getDataTable1FooterLastButton() {
        return dataTable1FooterLastButton;
    }

    public void setDataTable1FooterLastButton(HtmlCommandButton hcb) {
        this.dataTable1FooterLastButton = hcb;
    }

    private HtmlMessages messageList1 = new HtmlMessages();

    public HtmlMessages getMessageList1() {
        return messageList1;
    }

    public void setMessageList1(HtmlMessages hm) {
        this.messageList1 = hm;
    }

    private Hyperlink hyperlink1 = new Hyperlink();

    public Hyperlink getHyperlink1() {
        return hyperlink1;
    }

    public void setHyperlink1(Hyperlink h) {
        this.hyperlink1 = h;
    }

    private Hyperlink hyperlink2 = new Hyperlink();

    public Hyperlink getHyperlink2() {
        return hyperlink2;
    }

    public void setHyperlink2(Hyperlink h) {
        this.hyperlink2 = h;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public ingSolicitudMultiple_1() {
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
            log("ingSolicitudMultiple Initialization Failure", e);
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
        solicitudes_provinciaDataProvider.close();
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

    public String dataTable1_firstPageAction() {
        dataTable1.setFirst(0);
        return null;
    }

    public String dataTable1_previousPageAction() {
        int first = dataTable1.getFirst() - dataTable1.getRows();
        if (first < 0) {
            first = 0;
        }
        dataTable1.setFirst(first);
        return null;
    }

    public String dataTable1_nextPageAction() {
        int first = dataTable1.getFirst() + dataTable1.getRows();
        dataTable1.setRowIndex(first);
        if (dataTable1.isRowAvailable()) {
            dataTable1.setFirst(first);
        }
        return null;
    }

    public String dataTable1_lastPageAction() {
        int first = dataTable1.getFirst();
        while (true) {
            dataTable1.setRowIndex(first + 1);
            if (dataTable1.isRowAvailable()) {
                first++;
            } else {
                break;
            }
        }
        dataTable1.setFirst(first - (first % dataTable1.getRows()));
        return null;
    }

    public String button1_action() {
        return "case1";
    }

    public String button2_action() {
        return "case2";
    }
}

