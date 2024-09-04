package pe.gob.pj.rnc.model;
import java.util.Date;
public class Aud_usuario_tablas_cab_det {
	public final String REGISTRA = "R";
	public final String ACTUALIZA = "A";
	public final String CONSULTA = "C";
	private Integer	cod_registro;			// NUMERIC (15, 0)
	private Date		fecha_aud;				// DATETIME
	private String	c_usuario;				// VARCHAR (10)
	private String	c_tabla;					// VARCHAR (50)
	private String	c_accion;					// CHAR (1)
	private String	cod_modificado;		// VARCHAR (20)
	private String	motivo;						// VARCHAR (100)
	private String	c_usuario_red;		// VARCHAR (20)
	private String	c_ipaddr;					// VARCHAR (15)
	private String	c_pcname;					// VARCHAR (30)
	private String	c_mcaddr;					// VARCHAR (20)
														
	// Integer cod_registro;// NUMERIC (15, 0)
	private Integer	correlativo;			// NUMERIC (15, 0)
	private String	campo_modificado;	// VARCHAR (30)
	private String	valor_anterior;		// VARCHAR (255)
	
	private UsuarioCamposAud camposAudit;
	
	public UsuarioCamposAud getCamposAudit() {
		return camposAudit;
	}

	public void setCamposAudit(UsuarioCamposAud camposAudit) {
		this.camposAudit = camposAudit;
	}

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
		// this.motivo = motivo;
		this.motivo = motivo.trim().length() > 100 ? motivo.substring(0, 100).trim() : motivo.trim();
//		System.out.println("this.motivo --> " + this.motivo.length() + " - " + this.motivo);
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
	
	public Integer getCorrelativo() {
		return correlativo;
	}
	
	public void setCorrelativo(Integer correlativo) {
		this.correlativo = correlativo;
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
}
