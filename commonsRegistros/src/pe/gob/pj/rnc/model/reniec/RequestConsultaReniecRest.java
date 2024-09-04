package pe.gob.pj.rnc.model.reniec;

/**
 * <pre>
 * Objeto     : RequestConsultaReniecRest.
 * Descripción: <Descripción de la Clase>.
 * Fecha      : 2024-04-23
 * Autor      : DMACHACA
 * ----------------------------------------------------------------------------------------------------------------------
 * ID    Fecha         Autor               Método                            Tipo Cambio     Descripción                             
 * ----------------------------------------------------------------------------------------------------------------------
 * #1                  DMACHACA              -                                 Nuevo           Creación de la clase y sus métodos.
 * </pre>
 */


public class RequestConsultaReniecRest {

	private String formatoRespuesta;	
	private DatosConsultaReniec personaConsultada;
	private String consultante;
	private String motivo;
	
	
	public RequestConsultaReniecRest() {
		super();
	}
	public String getFormatoRespuesta() {
		return formatoRespuesta;
	}
	public void setFormatoRespuesta(String formatoRespuesta) {
		this.formatoRespuesta = formatoRespuesta;
	}
	public DatosConsultaReniec getPersonaConsultada() {
		return personaConsultada;
	}
	public void setPersonaConsultada(DatosConsultaReniec personaConsultada) {
		this.personaConsultada = personaConsultada;
	}
	public String getConsultante() {
		return consultante;
	}
	public void setConsultante(String consultante) {
		this.consultante = consultante;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
	
	
}
