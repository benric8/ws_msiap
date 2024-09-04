package uif;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Page;

public class VistaPrevia extends AbstractPageBean {

	public VistaPrevia() {

	}
    
    
    private Page page1 = new Page();
    private Html html1 = new Html();
    private Head head1 = new Head();
   
    private Body body1 = new Body();
    private Form form1 = new Form();
	
    
    
    public Body getBody1() {
		return body1;
	}
	public Form getForm1() {
		return form1;
	}
	public Head getHead1() {
		return head1;
	}
	public Html getHtml1() {
		return html1;
	}
	
	public Page getPage1() {
		return page1;
	}
	
	public void setBody1(Body body1) {
		this.body1 = body1;
	}
	public void setForm1(Form form1) {
		this.form1 = form1;
	}
	public void setHead1(Head head1) {
		this.head1 = head1;
	}
	public void setHtml1(Html html1) {
		this.html1 = html1;
	}
	public void setPage1(Page page1) {
		this.page1 = page1;
	}
	
}
