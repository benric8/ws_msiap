package pe.gob.pj.rnc.model;

import java.io.Serializable;
import java.util.Date;

public class AuditoriaUsuario implements Serializable {

	private static final long serialVersionUID = 1L;
	private Date fecha_auditoria;
	private String c_usuario;
	private String nombre_usuario;
	private String distrito_judicial;
	private String accion;
	private String motivo;
	private String campo_modificado;
	private String valor_anterior;
	private String c_usuario_red;
	private String c_ipaddr;
	private String c_pcname;
	private String c_mcaddr;
	private String cod_registro;
	
	public AuditoriaUsuario() {	}
	
	public Date getFecha_auditoria() {
		return fecha_auditoria;
	}
	public void setFecha_auditoria(Date fecha_auditoria) {
		this.fecha_auditoria = fecha_auditoria;
	}
	public String getC_usuario() {
		return c_usuario;
	}
	public void setC_usuario(String c_usuario) {
		this.c_usuario = c_usuario;
	}
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public String getDistrito_judicial() {
		return distrito_judicial;
	}
	public void setDistrito_judicial(String distrito_judicial) {
		this.distrito_judicial = distrito_judicial;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getCampo_modificado() {
		return campo_modificado;
	}
	public void setCampo_modificado(String campo_modificado) {
		this.campo_modificado = campo_modificado;
	}
	public String getValor_anterior() {
		return valor_anterior;
	}
	public void setValor_anterior(String valor_anterior) {
		this.valor_anterior = valor_anterior;
	}
	public String getC_usuario_red() {
		return c_usuario_red;
	}
	public void setC_usuario_red(String c_usuario_red) {
		this.c_usuario_red = c_usuario_red;
	}
	public String getC_ipaddr() {
		return c_ipaddr;
	}
	public void setC_ipaddr(String c_ipaddr) {
		this.c_ipaddr = c_ipaddr;
	}
	public String getC_pcname() {
		return c_pcname;
	}
	public void setC_pcname(String c_pcname) {
		this.c_pcname = c_pcname;
	}
	public String getC_mcaddr() {
		return c_mcaddr;
	}
	public void setC_mcaddr(String c_mcaddr) {
		this.c_mcaddr = c_mcaddr;
	}
	public String getCod_registro() {
		return cod_registro;
	}
	public void setCod_registro(String cod_registro) {
		this.cod_registro = cod_registro;
	}
	public String getAccion() {
		return accion;
	}
	public void setAccion(String accion) {
		this.accion = accion;
	}
}
