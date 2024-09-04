
package pe.gob.pj.rnc.model;

import java.util.Date;
import java.util.List;

public class BoletinReporte
{
	private String delito1;
	private String delito2;
	private String delito3;
	private String delito4;
	private String delito5;
	private String desc_pena;
	private Date fech_fin_conden;
	private String fech_pronu_boletn;
	private Integer anno_pena_boletn;
	private Integer mess_pena_boletn;
	private Integer diaa_pena_boletn;
	private String nume_expte_boletn;
	private Integer numr_boletn;
	private String indc_rehabilitado;
	private Integer numr_boletn_rehab;
	private String numr_insta_rehab;
	private String fech_rehab;
	private String instancia_rehab;
	private String lugar_rehab;
	private String numr_insta_boletn;
    private String instancia_boletin;
    private String lugar_boletin;
    private String fech_nacim_boletn;
    private Date fech_inici_conden;
    private List<DelitoReporte> otrosDelitos;
	private String tipo;

	public String getDelito1() {
		return delito1;
	}
	public void setDelito1(String delito1) {
		this.delito1 = delito1;
	}
	public String getDelito2() {
		return delito2;
	}
	public void setDelito2(String delito2) {
		this.delito2 = delito2;
	}
	public String getDelito3() {
		return delito3;
	}
	public void setDelito3(String delito3) {
		this.delito3 = delito3;
	}
	public String getDelito4() {
		return delito4;
	}
	public void setDelito4(String delito4) {
		this.delito4 = delito4;
	}
	public String getDelito5() {
		return delito5;
	}
	public void setDelito5(String delito5) {
		this.delito5 = delito5;
	}
	public String getDesc_pena() {
		return desc_pena;
	}
	public void setDesc_pena(String desc_pena) {
		this.desc_pena = desc_pena;
	}
	public Date getFech_fin_conden() {
		return fech_fin_conden;
	}
	public void setFech_fin_conden(Date fech_fin_conden) {
		this.fech_fin_conden = fech_fin_conden;
	}
	public String getFech_pronu_boletn() {
		return fech_pronu_boletn;
	}
	public void setFech_pronu_boletn(String fech_pronu_boletn) {
		this.fech_pronu_boletn = fech_pronu_boletn;
	}
	public Integer getAnno_pena_boletn() {
		return anno_pena_boletn;
	}
	public void setAnno_pena_boletn(Integer anno_pena_boletn) {
		this.anno_pena_boletn = anno_pena_boletn;
	}
	public Integer getMess_pena_boletn() {
		return mess_pena_boletn;
	}
	public void setMess_pena_boletn(Integer mess_pena_boletn) {
		this.mess_pena_boletn = mess_pena_boletn;
	}
	public Integer getDiaa_pena_boletn() {
		return diaa_pena_boletn;
	}
	public void setDiaa_pena_boletn(Integer diaa_pena_boletn) {
		this.diaa_pena_boletn = diaa_pena_boletn;
	}
	public String getNume_expte_boletn() {
		return nume_expte_boletn;
	}
	public void setNume_expte_boletn(String nume_expte_boletn) {
		this.nume_expte_boletn = nume_expte_boletn;
	}
	public Integer getNumr_boletn() {
		return numr_boletn;
	}
	public void setNumr_boletn(Integer numr_boletn) {
		this.numr_boletn = numr_boletn;
	}
	public String getIndc_rehabilitado() {
		return indc_rehabilitado;
	}
	public void setIndc_rehabilitado(String indc_rehabilitado) {
		this.indc_rehabilitado = indc_rehabilitado;
	}
	public Integer getNumr_boletn_rehab() {
		return numr_boletn_rehab;
	}
	public void setNumr_boletn_rehab(Integer numr_boletn_rehab) {
		this.numr_boletn_rehab = numr_boletn_rehab;
	}
	public String getNumr_insta_rehab() {
		return numr_insta_rehab;
	}
	public void setNumr_insta_rehab(String numr_insta_rehab) {
		this.numr_insta_rehab = numr_insta_rehab;
	}
	public String getFech_rehab() {
		return fech_rehab;
	}
	public void setFech_rehab(String fech_rehab) {
		this.fech_rehab = fech_rehab;
	}
	public String getInstancia_rehab() {
		return instancia_rehab;
	}
	public void setInstancia_rehab(String instancia_rehab) {
		this.instancia_rehab = instancia_rehab;
	}
	public String getLugar_rehab() {
		return lugar_rehab;
	}
	public void setLugar_rehab(String lugar_rehab) {
		this.lugar_rehab = lugar_rehab;
	}
	public String getNumr_insta_boletn() {
		return numr_insta_boletn;
	}
	public void setNumr_insta_boletn(String numr_insta_boletn) {
		this.numr_insta_boletn = numr_insta_boletn;
	}
	public String getInstancia_boletin() {
		return instancia_boletin;
	}
	public void setInstancia_boletin(String instancia_boletin) {
		this.instancia_boletin = instancia_boletin;
	}
	public String getLugar_boletin() {
		return lugar_boletin;
	}
	public void setLugar_boletin(String lugar_boletin) {
		this.lugar_boletin = lugar_boletin;
	}
	public String getFech_nacim_boletn() {
		return fech_nacim_boletn;
	}
	public void setFech_nacim_boletn(String fech_nacim_boletn) {
		this.fech_nacim_boletn = fech_nacim_boletn;
	}
	public Date getFech_inici_conden() {
		return fech_inici_conden;
	}
	public void setFech_inici_conden(Date fech_inici_conden) {
		this.fech_inici_conden = fech_inici_conden;
	}
	public List<DelitoReporte> getOtrosDelitos() {
		return otrosDelitos;
	}
	public void setOtrosDelitos(List<DelitoReporte> otrosDelitos) {
		this.otrosDelitos = otrosDelitos;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
