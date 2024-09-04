package uif;

import javax.faces.FacesException;
import javax.faces.convert.DateTimeConverter;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.Table;
import com.sun.rave.web.ui.component.TableColumn;
import com.sun.rave.web.ui.component.TableRowGroup;

public class AuditarUsuario extends AbstractPageBean {

	private Page page1 = new Page();
    private Html html1 = new Html();
    private Head head1 = new Head();
    private Link link1 = new Link();
    private Body body1 = new Body();
    private Form form1 = new Form();
    
    private Table tbMovimientos = new Table();
    private TableRowGroup tableRowGroup1 = new TableRowGroup();
    private TableColumn tableColumn1 = new TableColumn();
    private TableColumn tableColumn2 = new TableColumn();
    private TableColumn tableColumn3 = new TableColumn();
    private TableColumn tableColumn4 = new TableColumn();
    private TableColumn tableColumn5 = new TableColumn();
    private TableColumn tableColumn6 = new TableColumn();
    private TableColumn tableColumn7 = new TableColumn();
    private TableColumn tableColumn8 = new TableColumn();
    
    private StaticText staticText1 = new StaticText();
    private StaticText staticText2 = new StaticText();
    private StaticText staticText3 = new StaticText();
    private StaticText staticText4 = new StaticText();
    private StaticText staticText5 = new StaticText();
    private StaticText staticText6 = new StaticText();
    private StaticText staticText7 = new StaticText();
    private StaticText staticText8 = new StaticText();
    
    private DateTimeConverter dateTimeConverter1 = new DateTimeConverter();
    private Button btnSeguimiento = new Button();
    
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
    public TableColumn getTableColumn5() {
		return tableColumn5;
	}
	public void setTableColumn5(TableColumn tableColumn5) {
		this.tableColumn5 = tableColumn5;
	}
	public TableColumn getTableColumn6() {
		return tableColumn6;
	}
	public void setTableColumn6(TableColumn tableColumn6) {
		this.tableColumn6 = tableColumn6;
	}
	public TableColumn getTableColumn7() {
		return tableColumn7;
	}
	public void setTableColumn7(TableColumn tableColumn7) {
		this.tableColumn7 = tableColumn7;
	}
	public TableColumn getTableColumn8() {
		return tableColumn8;
	}
	public void setTableColumn8(TableColumn tableColumn8) {
		this.tableColumn8 = tableColumn8;
	}
	public StaticText getStaticText5() {
		return staticText5;
	}
	public void setStaticText5(StaticText staticText5) {
		this.staticText5 = staticText5;
	}
	public StaticText getStaticText6() {
		return staticText6;
	}
	public void setStaticText6(StaticText staticText6) {
		this.staticText6 = staticText6;
	}
	public StaticText getStaticText7() {
		return staticText7;
	}
	public void setStaticText7(StaticText staticText7) {
		this.staticText7 = staticText7;
	}
	public StaticText getStaticText8() {
		return staticText8;
	}
	public void setStaticText8(StaticText staticText8) {
		this.staticText8 = staticText8;
	}
	public Button getBtnSeguimiento() {
		return btnSeguimiento;
	}
	public void setBtnSeguimiento(Button btnSeguimiento) {
		this.btnSeguimiento = btnSeguimiento;
	}
	/**
     * <p>Construct a new Page bean instance.</p>
     */
    public AuditarUsuario() {
    }

    public void init() {
        super.init();
        try {
            dateTimeConverter1.setTimeZone(java.util.TimeZone.getTimeZone("America/Lima"));
            dateTimeConverter1.setLocale(new java.util.Locale("es", "PE"));
            dateTimeConverter1.setPattern("dd/MM/yyyy HH:mm:ss");
            //Carga la tabla

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

    public String btnSeguimiento_action() {
    	System.out.println("btnSeguimiento_action ingreso");
		return "successAdmUsuario";
    }


}

