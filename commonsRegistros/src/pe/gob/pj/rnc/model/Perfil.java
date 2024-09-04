package pe.gob.pj.rnc.model;

public class Perfil {

	public static final String ADMINISTRADOR_ID = "25";
	public static final String SUPERVISOR_ID = "26";//consulados
	public static final String OPERADOR_ID = "27";//consulados
	public static final String ADMINISTRADOR_USUARIO_ID = "22";
	public static final String OPERADOR_JUDICIAL_ID = "20";
	public static final String SUPERVISOR_JUDICIAL_ID = "30";//Magistrados
	public static final String MPFN_FISCAL = "40";//Fiscales
	public static final String CONSULADO = "32";//Fiscales
	public static final String BUSCADOR_SOLICITUDES_ID = "23";//Buscador de solicitudes

	public static final String TIPO_DOC_DNI = "0010";
	//public static final String TIPO_DOC_RUC = "000";
	public static final String TIPO_DOC_CARNE_EXT = "0005";
	public static final String COD_DISTRITO_JUDICIAL_CONDENAS = "99";
	public static final String COD_DISTRITO_JUDICIAL_RREE= "32";

	public static String obteneridPerfilParaReporte(Usuario usuario) {
		if(usuario.isPerfilAdministrador())
			return Perfil.ADMINISTRADOR_ID;
		return Perfil.SUPERVISOR_ID;
	}

}
