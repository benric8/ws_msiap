package pe.gob.pj.rnc.model.reniec;

import java.io.Serializable;

/**
 * <pre>
 * Objeto     : DatosConsultaReniec.
 * Descripción: <Descripción de la Clase>.
 * Fecha      : 2024-04-23
 * Autor      : DMACHACA
 * ----------------------------------------------------------------------------------------------------------------------
 * ID    Fecha         Autor               Método                            Tipo Cambio     Descripción                             
 * ----------------------------------------------------------------------------------------------------------------------
 * #1                  DMACHACA              -                                 Nuevo           Creación de la clase y sus métodos.
 * </pre>
 */


public class DatosConsultaReniec implements Serializable{
    
	private static final long serialVersionUID = 1L;
	
	private String tipoConsulta;
	private String nroDocumentoIdentidad;
	
	public DatosConsultaReniec() {
		super();
	}
	
	public String getTipoConsulta() {
		return tipoConsulta;
	}
	public void setTipoConsulta(String tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}
	public String getNroDocumentoIdentidad() {
		return nroDocumentoIdentidad;
	}
	public void setNroDocumentoIdentidad(String nroDocumentoIdentidad) {
		this.nroDocumentoIdentidad = nroDocumentoIdentidad;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


    
}



