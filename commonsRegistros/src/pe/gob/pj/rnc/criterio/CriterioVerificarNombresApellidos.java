package pe.gob.pj.rnc.criterio;

public class CriterioVerificarNombresApellidos {
	
	private String apellidoPaterno; 
	private String apellidoMaterno; 
	private String nombre1; 
	private String nombre2; 
	private String nombre3;	
	
	public CriterioVerificarNombresApellidos(String apellidoPaterno, String apellidoMaterno, String nombre1, String nombre2, String nombre3) {
		super();
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
		this.nombre3 = nombre3;
	}
	
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getNombre1() {
		return nombre1;
	}
	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}
	public String getNombre2() {
		return nombre2;
	}
	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}
	public String getNombre3() {
		return nombre3;
	}
	public void setNombre3(String nombre3) {
		this.nombre3 = nombre3;
	}

	public String getPropiedades() {
		String resultado = "";
		resultado = resultado + "[APE_PAT:" + getApellidoPaterno() + "]";
		resultado = resultado + "[APE_MAT:" + getApellidoMaterno() + "]";
		resultado = resultado + "[NOMBRE1:" + getNombre1() + "]";
		resultado = resultado + "[NOMBRE2:" + getNombre2() + "]";
		resultado = resultado + "[NOMBRE3:" + getNombre3() + "]";
		return resultado;
	} 

	
	
}
