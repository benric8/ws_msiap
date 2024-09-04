package pe.gob.pj.rnc.model;

import java.util.Date;

public class Aud_usuario_tablas_cab {
	Integer cod_registro;// NUMERIC (15, 0)
	Date fecha_aud;// DATETIME
	String c_usuario;// VARCHAR (10)
	String c_tabla;// VARCHAR (50)
	String c_accion;// CHAR (1)
	String cod_modificado;// VARCHAR (20)
	String motivo;// VARCHAR (100)
	String c_usuario_red;// VARCHAR (20)
	String c_ipaddr;// VARCHAR (15)
	String c_pcname;// VARCHAR (30)
	String c_mcaddr;// VARCHAR (20)

	public Integer getCod_registro() {
		return cod_registro;
	}

	public void setCod_registro(Integer cod_registro) {
		this.cod_registro = cod_registro;
	}

	public Date getFecha_aud() {
		return fecha_aud;
	}

	public void setFecha_aud(Date fecha_aud) {
		this.fecha_aud = fecha_aud;
	}

	public String getC_usuario() {
		return c_usuario;
	}

	public void setC_usuario(String c_usuario) {
		this.c_usuario = c_usuario;
	}

	public String getC_tabla() {
		return c_tabla;
	}

	public void setC_tabla(String c_tabla) {
		this.c_tabla = c_tabla;
	}

	public String getC_accion() {
		return c_accion;
	}

	public void setC_accion(String c_accion) {
		this.c_accion = c_accion;
	}

	public String getCod_modificado() {
		return cod_modificado;
	}

	public void setCod_modificado(String cod_modificado) {
		this.cod_modificado = cod_modificado;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
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

}
