package pe.gob.pj.rnc.criterio;


public class CriterioListarSolicitudInterna {
	
	
	private Object fechaInicial;
	private Object fechaFinal;
	private Object apellidoPaterno;
	private Object apellidoMaterno;
	private Object nombre;
	private Object nroExpediente;
	private Object nroSolicitud;
	private Object codigoUsuario;
	private String codigoJuzgado;
	private boolean impreso;
	private boolean observado;
	private boolean pendienteImpresion;
	private String codigoCerti;
	private String codDistritoJudicial;
	
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
	public Object getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(Object materno_4) {
		this.apellidoMaterno = materno_4;
	}
	public Object getNombre() {
		return nombre;
	}
	public void setNombre(Object nombre_5) {
		this.nombre = nombre_5;
	}
	public Object getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(Object paterno_3) {
		this.apellidoPaterno = paterno_3;
	}
	public boolean isImpreso() {
		return impreso;
	}
	public void setImpreso(boolean impreso) {
		this.impreso = impreso;
	}
	public Object getNroExpediente() {
		return nroExpediente;
	}
	public void setNroExpediente(Object nroExpediente) {
		this.nroExpediente = nroExpediente;
	}
	public Object getNroSolicitud() {
		return nroSolicitud;
	}
	public void setNroSolicitud(Object nroSolicitud) {
		this.nroSolicitud = nroSolicitud;
	}
	public boolean isObservado() {
		return observado;
	}
	public void setObservado(boolean observado) {
		this.observado = observado;
	}
	public boolean isPendienteImpresion() {
		return pendienteImpresion;
	}
	public void setPendienteImpresion(boolean pendienteImpresion) {
		this.pendienteImpresion = pendienteImpresion;
	}
	public Object getCodigoUsuario() {
		return codigoUsuario;
	}
	public void setCodigoUsuario(Object codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	public String getCodigoCerti() {
		return codigoCerti;
	}
	public void setCodigoCerti(String codigoCerti) {
		this.codigoCerti = codigoCerti;
	}
	public String getCodigoJuzgado() {
		return codigoJuzgado;
	}
	public void setCodigoJuzgado(String codigoJuzgado) {
		this.codigoJuzgado = codigoJuzgado;
	}
	public String getCodDistritoJudicial() {
		return codDistritoJudicial;
	}
	public void setCodDistritoJudicial(String codDistritoJudicial) {
		this.codDistritoJudicial = codDistritoJudicial;
	}

}
