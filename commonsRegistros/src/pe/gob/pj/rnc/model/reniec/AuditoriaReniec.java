package pe.gob.pj.rnc.model.reniec;


public class AuditoriaReniec {
	private String usuario;
	private String nombrePc;
	private String numeroIp;
	private String direccionMac;
	
	
	public AuditoriaReniec() {
		super();
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getNombrePc() {
		return nombrePc;
	}
	public void setNombrePc(String nombrePc) {
		this.nombrePc = nombrePc;
	}
	public String getNumeroIp() {
		return numeroIp;
	}
	public void setNumeroIp(String numeroIp) {
		this.numeroIp = numeroIp;
	}
	public String getDireccionMac() {
		return direccionMac;
	}
	public void setDireccionMac(String direccionMac) {
		this.direccionMac = direccionMac;
	}

	
}
