package pe.gob.pj.rnc.model;

public class TipoDocumentoAutorizacion {

	private Integer idTipoDocumentoAutorizacion;
	private String nombre;
	private String longitud;
	private String formato;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLongitud() {
		return longitud;
	}
	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public Integer getIdTipoDocumentoAutorizacion() {
		return idTipoDocumentoAutorizacion;
	}
	public void setIdTipoDocumentoAutorizacion(Integer idTipoDocumentoAutorizacion) {
		this.idTipoDocumentoAutorizacion = idTipoDocumentoAutorizacion;
	}
	
	
}
