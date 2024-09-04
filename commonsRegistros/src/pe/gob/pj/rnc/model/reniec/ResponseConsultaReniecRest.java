package pe.gob.pj.rnc.model.reniec;

import java.io.Serializable;

/**
 * <pre>
 * Objeto     : ResponseConsultaReniecRest.
 * Descripción: <Descripción de la Clase>.
 * Fecha      : 2024-04-22
 * Autor      : DMACHACA
 * ----------------------------------------------------------------------------------------------------------------------
 * ID    Fecha         Autor               Método                            Tipo Cambio     Descripción                             
 * ----------------------------------------------------------------------------------------------------------------------
 * #1    2024-04-22    DMACHACA              -                               Nuevo           Creación de la clase y sus métodos.
 * </pre>
 */



public class ResponseConsultaReniecRest implements Serializable{
	private static final long serialVersionUID = 1L;
	private String codigo;
	private String descripcion;
	private ConsultaReniec data;
	private String codigoOperacion;
	
	
	public ResponseConsultaReniecRest() {
		super();
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public ConsultaReniec getData() {
		return data;
	}
	public void setData(ConsultaReniec data) {
		this.data = data;
	}
	public String getCodigoOperacion() {
		return codigoOperacion;
	}
	public void setCodigoOperacion(String codigoOperacion) {
		this.codigoOperacion = codigoOperacion;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
