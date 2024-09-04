package pe.gob.pj.rnc.model;

import java.util.Date;
import java.util.List;

public class SolicitudReporte
{
	private String codg_certi;
	private String nume_certi;
	private String apll_pater_solic;
	private String apll_mater_solic;
	private Date fech_nacim_solic;
	private String nom1_solic;
	private String nom2_solic;
	private String nom3_solic;
	private String nom4_solic;
	private String nom5_solic;
	private String nom_padre;
	private String nom_madre;
	private String nume_ident_solic;
    private String flagNacidoExterior;
    private String lugarNacimiento;
	private String dep_descripcion;
	private String motivo_descripcion;
	private String doc_abreviatura;
	private String indc_descarte;
	private String indc_registra;
  	private String nume_exped_solic;
  	private String codg_usuar;
  	private String tipo_solic;
  	private Date fech_digit_solic;
  	private Date fech_impresion;
  	private String desc_juzga_solic;
  	private String nomb_juzga_solic;
	private String sol_firma_codigo;
	private String sol_firma_nombre;
	private String sol_firma_sumilla;
	private String codg_estado_solicitud;
	private String codg_distrito_judicial;
    private String desc_distrito_judicial;
	private List<BoletinReporte> boletinAntecedentes;
	private List<BoletinReporte> boletinRehabilitados;

	public String getCodg_certi() {
		return codg_certi;
	}
	public void setCodg_certi(String codg_certi) {
		this.codg_certi = codg_certi;
	}
	public String getApll_pater_solic() {
		return apll_pater_solic;
	}
	public void setApll_pater_solic(String apll_pater_solic) {
		this.apll_pater_solic = apll_pater_solic;
	}
	public String getApll_mater_solic() {
		return apll_mater_solic;
	}
	public void setApll_mater_solic(String apll_mater_solic) {
		this.apll_mater_solic = apll_mater_solic;
	}
	public Date getFech_nacim_solic() {
		return fech_nacim_solic;
	}
	public void setFech_nacim_solic(Date fech_nacim_solic) {
		this.fech_nacim_solic = fech_nacim_solic;
	}
	public String getNom1_solic() {
		return nom1_solic;
	}
	public void setNom1_solic(String nom1_solic) {
		this.nom1_solic = nom1_solic;
	}
	public String getNom2_solic() {
		return nom2_solic;
	}
	public void setNom2_solic(String nom2_solic) {
		this.nom2_solic = nom2_solic;
	}
	public String getNom3_solic() {
		return nom3_solic;
	}
	public void setNom3_solic(String nom3_solic) {
		this.nom3_solic = nom3_solic;
	}
	public String getNom4_solic() {
		return nom4_solic;
	}
	public void setNom4_solic(String nom4_solic) {
		this.nom4_solic = nom4_solic;
	}
	public String getNom5_solic() {
		return nom5_solic;
	}
	public void setNom5_solic(String nom5_solic) {
		this.nom5_solic = nom5_solic;
	}
	public String getNom_padre() {
		return nom_padre;
	}
	public void setNom_padre(String nom_padre) {
		this.nom_padre = nom_padre;
	}
	public String getNom_madre() {
		return nom_madre;
	}
	public void setNom_madre(String nom_madre) {
		this.nom_madre = nom_madre;
	}
	public String getNume_ident_solic() {
		return nume_ident_solic;
	}
	public void setNume_ident_solic(String nume_ident_solic) {
		this.nume_ident_solic = nume_ident_solic;
	}
	public String getDep_descripcion() {
		return dep_descripcion;
	}
	public void setDep_descripcion(String dep_descripcion) {
		this.dep_descripcion = dep_descripcion;
	}
	public String getMotivo_descripcion() {
		return motivo_descripcion;
	}
	public void setMotivo_descripcion(String motivo_descripcion) {
		this.motivo_descripcion = motivo_descripcion;
	}
	public String getDoc_abreviatura() {
		return doc_abreviatura;
	}
	public void setDoc_abreviatura(String doc_abreviatura) {
		this.doc_abreviatura = doc_abreviatura;
	}
	public String getIndc_descarte() {
		return indc_descarte;
	}
	public void setIndc_descarte(String indc_descarte) {
		this.indc_descarte = indc_descarte;
	}
	public String getIndc_registra() {
		return indc_registra;
	}
	public void setIndc_registra(String indc_registra) {
		this.indc_registra = indc_registra;
	}
	public List<BoletinReporte> getBoletinAntecedentes() {
		return boletinAntecedentes;
	}
	public void setBoletinAntecedentes(List<BoletinReporte> boletinAntecedentes) {
		this.boletinAntecedentes = boletinAntecedentes;
	}
	public List<BoletinReporte> getBoletinRehabilitados() {
		return boletinRehabilitados;
	}
	public void setBoletinRehabilitados(List<BoletinReporte> boletinRehabilitados) {
		this.boletinRehabilitados = boletinRehabilitados;
	}
	public String getNume_certi() {
		return nume_certi;
	}
	public void setNume_certi(String nume_certi) {
		this.nume_certi = nume_certi;
	}
	public String getNume_exped_solic() {
		return nume_exped_solic;
	}
	public void setNume_exped_solic(String nume_exped_solic) {
		this.nume_exped_solic = nume_exped_solic;
	}
	public Date getFech_digit_solic() {
		return fech_digit_solic;
	}
	public void setFech_digit_solic(Date fech_digit_solic) {
		this.fech_digit_solic = fech_digit_solic;
	}
	public String getDesc_juzga_solic() {
		return desc_juzga_solic;
	}
	public void setDesc_juzga_solic(String desc_juzga_solic) {
		this.desc_juzga_solic = desc_juzga_solic;
	}
	public String getNomb_juzga_solic() {
		return nomb_juzga_solic;
	}
	public void setNomb_juzga_solic(String nomb_juzga_solic) {
		this.nomb_juzga_solic = nomb_juzga_solic;
	}
	public String getSol_firma_codigo() {
		return sol_firma_codigo;
	}
	public void setSol_firma_codigo(String sol_firma_codigo) {
		this.sol_firma_codigo = sol_firma_codigo;
	}
	public String getSol_firma_nombre() {
		return sol_firma_nombre;
	}
	public void setSol_firma_nombre(String sol_firma_nombre) {
		this.sol_firma_nombre = sol_firma_nombre;
	}
	public String getSol_firma_sumilla() {
		return sol_firma_sumilla;
	}
	public void setSol_firma_sumilla(String sol_firma_sumilla) {
		this.sol_firma_sumilla = sol_firma_sumilla;
	}
	public Date getFech_impresion() {
		return fech_impresion;
	}
	public void setFech_impresion(Date fech_impresion) {
		this.fech_impresion = fech_impresion;
	}
	public String getCodg_usuar() {
		return codg_usuar;
	}
	public void setCodg_usuar(String codg_usuar) {
		this.codg_usuar = codg_usuar;
	}
	public String getTipo_solic() {
		return tipo_solic;
	}
	public void setTipo_solic(String tipo_solic) {
		this.tipo_solic = tipo_solic;
	}
	public String getCodg_estado_solicitud() {
		return codg_estado_solicitud;
	}
	public void setCodg_estado_solicitud(String codg_estado_solicitud) {
		this.codg_estado_solicitud = codg_estado_solicitud;
	}
	public String getCodg_distrito_judicial() {
		return codg_distrito_judicial;
	}
	public void setCodg_distrito_judicial(String codg_distrito_judicial) {
		this.codg_distrito_judicial = codg_distrito_judicial;
	}
	public String getDesc_distrito_judicial() {
		return desc_distrito_judicial;
	}
	public void setDesc_distrito_judicial(String desc_distrito_judicial) {
		this.desc_distrito_judicial = desc_distrito_judicial;
	}
	public String getFlagNacidoExterior() {
		return flagNacidoExterior;
	}
	public void setFlagNacidoExterior(String flagNacidoExterior) {
		this.flagNacidoExterior = flagNacidoExterior;
	}
	public String getLugarNacimiento() {
		return lugarNacimiento;
	}
	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}
}
