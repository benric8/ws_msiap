package pe.gob.pj.rnc.service;

import pe.gob.pj.rnc.model.EntidadExterna;
import pe.gob.pj.rnc.model.Usuario;

public class Soporte {

	//public static final String ORIGEN_DE_DATOS =  "jdbc/msiapmagistrado";
	public static final String ORIGEN_DE_DATOS =  "java:jboss/datasources/msiap";
	//public static final String ORIGEN_DE_DATOS =  "java:jboss/datasources/Sij003DS";

	public static final String REPORTE_DIRECTORIO = "/WEB-INF/classes/reports/";

	public static final String REPORTE_FORMATO_TEXT_HTML = "text/html";

	public static final String REPORTE_FORMATO_PDF = "application/pdf";
	public static final String REPORTE_FORMATO_XLS = "application/vnd.ms-excel";

	public static final String PDF_EXTENSION = ".pdf";
	public static final String EXCEL_EXTENSION = ".xls";

	public static final String HTML_EXTENSION = ".html";

	public static final String JASPER_EXTENSION = ".jasper";

	public static final String MOTIVO_SOLICITUD_MAGISTRADO="0005";

	public static final String CODG_USU_FIRMA="firma";

	public static String obtenerTextoConsideracion(EntidadExterna entidad) {
		String texto = "";
		texto = texto + " De mi mayor consideraci\u00F3n:\n\nTengo el honor de dirigirme a usted en atenci\u00F3n";
		texto = texto + " a la solicitud de la referencia";
		if (entidad.isConsulado()) {
			texto = texto + " en el marco del convenio " + entidad.getDESC_CONVENIO();
			texto = texto + " suscrito por el Poder Judicial y el Ministerio de Relaciones Exteriores,";
		}
		texto = texto + " a fin de informarle que a la fecha se cuenta con la siguiente informaci\u00F3n:";
		return texto;
	}

	public static String obtenerDestinatario(Usuario usuario) {
		String texto = " Señor(a) ";
		if(usuario.isDeCorteSuprema())
			texto = " Señor(a) Dr(a). ";
		texto = texto + usuario.getNOMB_USUAR() + " " + usuario.getAPLL_USUAR();
		return texto;
	}
}
