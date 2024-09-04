package uif;

import javax.faces.FacesException;
import javax.faces.convert.DateTimeConverter;
import pe.gob.pj.rnc.model.SolicitudExterna;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import com.sun.rave.web.ui.component.PageSeparator;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.Table;
import com.sun.rave.web.ui.component.TableColumn;
import com.sun.rave.web.ui.component.TableRowGroup;


public class AuditarUsuario2 extends AbstractPageBean {

	
	
	
    private void _init() throws Exception {
        dateTimeConverter1.setTimeZone(java.util.TimeZone.getTimeZone("America/Lima"));
        dateTimeConverter1.setLocale(new java.util.Locale("es", "PE"));
        dateTimeConverter1.setPattern("dd/MM/yyyy HH:mm:ss");
    }

    private Page page1 = new Page();
    private Html html1 = new Html();
    private Head head1 = new Head();
    private Link link1 = new Link();
    private Body body1 = new Body();
    private Form form1 = new Form();
    
    public Page getPage1() {
        return page1;
    }
    public void setPage1(Page p) {
        this.page1 = p;
    }
    public Html getHtml1() {
        return html1;
    }
    public void setHtml1(Html h) {
        this.html1 = h;
    }
    public Head getHead1() {
        return head1;
    }
    public void setHead1(Head h) {
        this.head1 = h;
    }
    public Link getLink1() {
        return link1;
    }
    public void setLink1(Link l) {
        this.link1 = l;
    }
    public Body getBody1() {
        return body1;
    }
    public void setBody1(Body b) {
        this.body1 = b;
    }
    public Form getForm1() {
        return form1;
    }
    public void setForm1(Form f) {
        this.form1 = f;
    }

    private Table tbMovimientos = new Table();
    private TableRowGroup tableRowGroup1 = new TableRowGroup();
    private TableColumn tableColumn1 = new TableColumn();
    private TableColumn tableColumn2 = new TableColumn();
    private TableColumn tableColumn3 = new TableColumn();
    private TableColumn tableColumn4 = new TableColumn();
    private StaticText staticText1 = new StaticText();
    private StaticText staticText2 = new StaticText();
    private StaticText staticText3 = new StaticText();
    private StaticText staticText4 = new StaticText();
    private DateTimeConverter dateTimeConverter1 = new DateTimeConverter();

    private Button btnVolver = new Button();
    private Button btnSeguimiento = new Button();
    
    public Table getTbMovimientos() {
        return tbMovimientos;
    }
    public void setTbMovimientos(Table t) {
        this.tbMovimientos = t;
    }
    public TableRowGroup getTableRowGroup1() {
        return tableRowGroup1;
    }
    public void setTableRowGroup1(TableRowGroup trg) {
        this.tableRowGroup1 = trg;
    }
    public TableColumn getTableColumn1() {
        return tableColumn1;
    }
    public void setTableColumn1(TableColumn tc) {
        this.tableColumn1 = tc;
    }
    public StaticText getStaticText1() {
        return staticText1;
    }
    public void setStaticText1(StaticText st) {
        this.staticText1 = st;
    }
    public TableColumn getTableColumn2() {
        return tableColumn2;
    }
    public void setTableColumn2(TableColumn tc) {
        this.tableColumn2 = tc;
    }
    public StaticText getStaticText2() {
        return staticText2;
    }
    public void setStaticText2(StaticText st) {
        this.staticText2 = st;
    }
    public TableColumn getTableColumn3() {
        return tableColumn3;
    }
    public void setTableColumn3(TableColumn tc) {
        this.tableColumn3 = tc;
    }
    public StaticText getStaticText3() {
        return staticText3;
    }
    public void setStaticText3(StaticText st) {
        this.staticText3 = st;
    }
    public TableColumn getTableColumn4() {
        return tableColumn4;
    }
    public void setTableColumn4(TableColumn tc) {
        this.tableColumn4 = tc;
    }
    public StaticText getStaticText4() {
        return staticText4;
    }
    public void setStaticText4(StaticText st) {
        this.staticText4 = st;
    }
    public DateTimeConverter getDateTimeConverter1() {
        return dateTimeConverter1;
    }
    public void setDateTimeConverter1(DateTimeConverter dtc) {
        this.dateTimeConverter1 = dtc;
    }
    public Button getBtnVolver() {
        return btnVolver;
    }
    public void setBtnVolver(Button b) {
        this.btnVolver = b;
    }
    public Button getBtnSeguimiento() {
        return btnSeguimiento;
    }
    public void setBtnSeguimiento(Button b) {
        this.btnSeguimiento = b;
    }

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public AuditarUsuario2() {
    }

    public void init() {
        super.init();
        try {
            _init();
        } catch (Exception e) {
            log("auditoria Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
    }

    public void preprocess() {
    }

    public void prerender() {
    }

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

    public String btnVolver_action() {
        getSessionBean1().setSolicitudExterna(new SolicitudExterna());
        return "inicio";
    }

    public String btnSeguimiento_action() {
        String auditoria = null;
        return null;
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    /*protected fragHeader getfragHeader() {
        return (fragHeader)getBean("fragHeader");
    }*/
}

