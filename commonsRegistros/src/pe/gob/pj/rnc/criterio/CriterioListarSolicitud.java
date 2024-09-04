package pe.gob.pj.rnc.criterio;


public class CriterioListarSolicitud {
	
	private Object idEntidadExterna;	
	private Object fechaInicial;
	private Object fechaFinal;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String nombre;
	private String codigoUsuario;
	private String nroOficio;
	private String nroCertificado;
	private Object nroSolicitud;
	private String estado;
	private String estadoSolicitud;
	private String indicador;
	
	public CriterioListarSolicitud() {
		super();
	}
	public Object getFechaFinal() {
		return fechaFinal;
	}
	public void setFechaFinal(Object fechaFinal_2) {
		this.fechaFinal = fechaFinal_2;
	}
	public Object getFechaInicial() {
		return fechaInicial;
	}
	public void setFechaInicial(Object fechaInicial_1) {
		this.fechaInicial = fechaInicial_1;
	}
	public Object getIdEntidadExterna() {
		return idEntidadExterna;
	}
	public void setIdEntidadExterna(Object idEntidadExterna) {
		this.idEntidadExterna = idEntidadExterna;
	}
	public String getIndicador() {
		return indicador;
	}
	public void setIndicador(String indicador) {
		this.indicador = indicador;
	}
	public String getNroOficio() {
		return nroOficio;
	}
	public void setNroOficio(String nroOficio) {
		this.nroOficio = nroOficio;
	}
	public String getNroCertificado() {
		return nroCertificado;
	}
	public void setNroCertificado(String nroCertificado) {
		this.nroCertificado = nroCertificado;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getEstadoSolicitud() {
		return estadoSolicitud;
	}
	public void setEstadoSolicitud(String estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigoUsuario() {
		return codigoUsuario;
	}
	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	public Object getNroSolicitud() {
		return nroSolicitud;
	}
	public void setNroSolicitud(Object nroSolicitud) {
		this.nroSolicitud = nroSolicitud;
	}
}
