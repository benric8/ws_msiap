package pe.gob.pj.rnc.model;

import java.util.Date;

public class DatosReniec {
	private String dni;
	private String digitoVerificacion;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String apellidoCasada;
	private String nombres;
	private String codSexo;
	private String sexo;
	private Date fechaNacimiento;
	private String nombrePadre;
	private String nombreMadre;
	private Date fechaProceso;
	private String departamentoNac;
	private String provinciaNac;
	private String distritoNac;
	private String codDepartamentoNac;
	private String codProvinciaNac;
	private String codDistritoNac;
	private Integer edad;
	private int longitudFoto;
	
	public int getLongitudFoto() {
		return longitudFoto;
	}
	public void setLongitudFoto(int longitudFoto) {
		this.longitudFoto = longitudFoto;
	}
	private byte[] foto;

	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDigitoVerificacion() {
		return digitoVerificacion;
	}
	public void setDigitoVerificacion(String digitoVerificacion) {
		this.digitoVerificacion = digitoVerificacion;
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
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNombrePadre() {
		return nombrePadre;
	}
	public void setNombrePadre(String nombrePadre) {
		this.nombrePadre = nombrePadre;
	}
	public String getNombreMadre() {
		return nombreMadre;
	}
	public void setNombreMadre(String nombreMadre) {
		this.nombreMadre = nombreMadre;
	}
	public Date getFechaProceso() {
		return fechaProceso;
	}
	public void setFechaProceso(Date fechaProceso) {
		this.fechaProceso = fechaProceso;
	}
	public String getApellidoCasada() {
		return apellidoCasada;
	}
	public void setApellidoCasada(String apellidoCasada) {
		this.apellidoCasada = apellidoCasada;
	}
	public String getDepartamentoNac() {
		return departamentoNac;
	}
	public void setDepartamentoNac(String departamentoNac) {
		this.departamentoNac = departamentoNac;
	}
	public String getProvinciaNac() {
		return provinciaNac;
	}
	public void setProvinciaNac(String provinciaNac) {
		this.provinciaNac = provinciaNac;
	}
	public String getDistritoNac() {
		return distritoNac;
	}
	public void setDistritoNac(String distritoNac) {
		this.distritoNac = distritoNac;
	}
	public String getCodDepartamentoNac() {
		return codDepartamentoNac;
	}
	public void setCodDepartamentoNac(String codDepartamentoNac) {
		this.codDepartamentoNac = codDepartamentoNac;
	}
	public String getCodProvinciaNac() {
		return codProvinciaNac;
	}
	public void setCodProvinciaNac(String codProvinciaNac) {
		this.codProvinciaNac = codProvinciaNac;
	}
	public String getCodDistritoNac() {
		return codDistritoNac;
	}
	public void setCodDistritoNac(String codDistritoNac) {
		this.codDistritoNac = codDistritoNac;
	}
	public String getCodSexo() {
		return codSexo;
	}
	public void setCodSexo(String codSexo) {
		this.codSexo = codSexo;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "DatosReniec [dni=" + dni + ", digitoVerificacion=" + digitoVerificacion + ", apellidoPaterno="
				+ apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", apellidoCasada=" + apellidoCasada
				+ ", nombres=" + nombres + ", codSexo=" + codSexo + ", sexo=" + sexo + ", fechaNacimiento="
				+ fechaNacimiento + ", nombrePadre=" + nombrePadre + ", nombreMadre=" + nombreMadre + ", fechaProceso="
				+ fechaProceso + ", departamentoNac=" + departamentoNac + ", provinciaNac=" + provinciaNac
				+ ", distritoNac=" + distritoNac + ", codDepartamentoNac=" + codDepartamentoNac + ", codProvinciaNac="
				+ codProvinciaNac + ", codDistritoNac=" + codDistritoNac + ", edad=" + edad + "]";
	}	
	
}
