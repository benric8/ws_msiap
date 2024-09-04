package pe.gob.pj.rnc.model;

import java.util.ArrayList;
public class PerfilMenuOpcion {


	public PerfilMenuOpcion (){
	}
	// M.CODIGO_PERFIL, M.CODIGO_MENU,W.ABREV_MENU,M.CODIGO_OPCION,O.ABREV_OPCION,O.PAGINA_JSP

	private String CODIGO_PERFIL;
	private int CODIGO_MENU;
	private String ABREV_MENU;
	private int CODIGO_OPCION;
	private String ABREV_OPCION;
	private String PAGINA_JSP;
	private char flag='N';

	private ArrayList<PerfilMenuOpcion> subMenu= new ArrayList<PerfilMenuOpcion>();

	public ArrayList<PerfilMenuOpcion> getSubMenu() {
		return subMenu;
	}
	public void setSubMenu(ArrayList<PerfilMenuOpcion> subMenu) {
		this.subMenu = subMenu;
	}
	public String getABREV_MENU() {
		return ABREV_MENU;
	}
	public void setABREV_MENU(String abrev_menu) {
		ABREV_MENU = abrev_menu;
	}
	public String getABREV_OPCION() {
		return ABREV_OPCION;
	}
	public void setABREV_OPCION(String abrev_opcion) {
		ABREV_OPCION = abrev_opcion;
	}
	public int getCODIGO_MENU() {
		return CODIGO_MENU;
	}
	public void setCODIGO_MENU(int codigo_menu) {
		CODIGO_MENU = codigo_menu;
	}
	public int getCODIGO_OPCION() {
		return CODIGO_OPCION;
	}
	public void setCODIGO_OPCION(int codigo_opcion) {
		CODIGO_OPCION = codigo_opcion;
	}
	public String getCODIGO_PERFIL() {
		return CODIGO_PERFIL;
	}
	public void setCODIGO_PERFIL(String codigo_perfil) {
		CODIGO_PERFIL = codigo_perfil;
	}
	public String getPAGINA_JSP() {
		return PAGINA_JSP;
	}
	public void setPAGINA_JSP(String pagina_jsp) {
		PAGINA_JSP = pagina_jsp;
	}

	public char getFlag() {
		return flag;
	}
	public void setFlag(char flag) {
		this.flag = flag;
	}








}
