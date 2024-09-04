
package pe.gob.pj.rnc.model;

import java.util.Date;
import java.util.List;

public class SolicitudExternaReporte
{
	private Integer codg_certi_externo;
	private Date fech_envio;
	private String v_ofi_respuesta_a;
	private String v_ofi_respuesta_b;
	private Integer codg_entidad_externa;
    private String codigo_del_motivo;
	private String sup_nomb_usuar;
	private String sup_apll_usuar;
	private String sup_desc_titulo;
	private String desc_ciudad;
	private String desc_pais;
	private String firma_codigo;
	private String firma_nombre;
	private String firma_sumilla;
	private boolean verRehabilitados;
	
	private List<SolicitudReporte> solicitudesList;

	public Date getFech_envio() {
		return fech_envio;
	}
	public void setFech_envio(Date fech_envio) {
		this.fech_envio = fech_envio;
	}
	public String getV_ofi_respuesta_a() {
		return v_ofi_respuesta_a;
	}
	public void setV_ofi_respuesta_a(String v_ofi_respuesta_a) {
		this.v_ofi_respuesta_a = v_ofi_respuesta_a;
	}
	public String getSup_nomb_usuar() {
		return sup_nomb_usuar;
	}
	public void setSup_nomb_usuar(String sup_nomb_usuar) {
		this.sup_nomb_usuar = sup_nomb_usuar;
	}
	public String getSup_apll_usuar() {
		return sup_apll_usuar;
	}
	public void setSup_apll_usuar(String sup_apll_usuar) {
		this.sup_apll_usuar = sup_apll_usuar;
	}
	public Integer getCodg_certi_externo() {
		return codg_certi_externo;
	}
	public void setCodg_certi_externo(Integer codg_certi_externo) {
		this.codg_certi_externo = codg_certi_externo;
	}
	public String getSup_desc_titulo() {
		return sup_desc_titulo;
	}
	public void setSup_desc_titulo(String sup_desc_titulo) {
		this.sup_desc_titulo = sup_desc_titulo;
	}
	public String getDesc_ciudad() {
		return desc_ciudad;
	}
	public void setDesc_ciudad(String desc_ciudad) {
		this.desc_ciudad = desc_ciudad;
	}
	public String getDesc_pais() {
		return desc_pais;
	}
	public void setDesc_pais(String desc_pais) {
		this.desc_pais = desc_pais;
	}
	public List<SolicitudReporte> getSolicitudesList() {
		return solicitudesList;
	}
	public void setSolicitudesList(List<SolicitudReporte> solicitudesList) {
		this.solicitudesList = solicitudesList;
	}
	public String getFirma_codigo() {
		return firma_codigo;
	}
	public void setFirma_codigo(String firma_codigo) {
		this.firma_codigo = firma_codigo;
	}
	public String getFirma_nombre() {
		return firma_nombre;
	}
	public void setFirma_nombre(String firma_nombre) {
		this.firma_nombre = firma_nombre;
	}
	public String getFirma_sumilla() {
		return firma_sumilla;
	}
	public void setFirma_sumilla(String firma_sumilla) {
		this.firma_sumilla = firma_sumilla;
	}
	public Integer getCodg_entidad_externa() {
		return codg_entidad_externa;
	}
	public void setCodg_entidad_externa(Integer codg_entidad_externa) {
		this.codg_entidad_externa = codg_entidad_externa;
	}
	public String getCodigo_del_motivo() {
		return codigo_del_motivo;
	}
	public void setCodigo_del_motivo(String codigo_del_motivo) {
		this.codigo_del_motivo = codigo_del_motivo;
	}
	public String getV_ofi_respuesta_b() {
		return v_ofi_respuesta_b;
	}
	public void setV_ofi_respuesta_b(String v_ofi_respuesta_b) {
		this.v_ofi_respuesta_b = v_ofi_respuesta_b;
	}
	public boolean isVerRehabilitados() {
		return verRehabilitados;
	}
	public void setVerRehabilitados(boolean verRehabilitados) {
		this.verRehabilitados = verRehabilitados;
	}
}
