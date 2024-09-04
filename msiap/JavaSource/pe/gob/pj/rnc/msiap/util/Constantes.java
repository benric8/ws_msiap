package pe.gob.pj.rnc.msiap.util;

import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import pe.gob.pj.util.Mensaje;

public class Constantes implements Serializable {
	
	private static final long serialVersionUID = 2638837802104925185L;

	/*********** PARÃ�METROS DE TABLAS ******/
	public static final Integer TIPO_DOCU_AUTO_ID_EXPEDIENTE = 1;
	public static final Integer TIPO_DOCU_AUTO_ID_CASO_FISCAL=2;
	public static final Integer TIPO_DOCU_AUTO_ID_OTROS = 3;
	public static final Integer TIPO_DOCU_AUTO_ID_COD_VALIDACION = 4;
	public static final Integer TIPO_DOCU_AUTO_SUNEDU = 5;
	
	/*********** TIPO_DOCUMENTO_SUNAT ******/
	public static final int TIPO_DOCU_DNI_SUNAT = 1;
	public static final int TIPO_DOCU_CE_SUNAT = 4;
	public static final int TIPO_DOCU_RUC_SUNAT = 6;
	public static final int TIPO_DOCU_PASAPORTE_SUNAT = 7;
	
	/*********** PARÃ�METROS WS ******/
	public static final String RPTA_COINCIDE_WS_CASO = "0000";
	public static final String RPTA_NO_COINCIDE_WS_CASO = "5200";
	public static final String WSCASO_ENDPOINT=Mensaje.getString("msiap.wsconsultacaso.endpoint");
	public static final String WSCASO_SIGNATURE_USER=Mensaje.getString("msiap.wsconsultacaso.signature.user");
	public static final String WSCASO_ENCRYPT_USER=Mensaje.getString("msiap.wsconsultacaso.encrypt.user");
	
	//ws sunedu
	public static final Integer RPTA_ERROR_SUNEDU = 0;
	public static final Integer RPTA_CORRECTO_SUNEDU = 1;
	public static final String RPTA_COINCIDE_SUNEDU = "00001";
	
	public static final Set<Integer> TIPOS_DOCUMENTOS_AUT_FISCALIA = new HashSet<Integer>(Arrays.asList(
		     new Integer[] {TIPO_DOCU_AUTO_ID_CASO_FISCAL,TIPO_DOCU_AUTO_ID_OTROS}));
	public static final Set<Integer> TIPOS_DOCUMENTOS_AUT_PJ = new HashSet<Integer>(Arrays.asList(
		     new Integer[] {TIPO_DOCU_AUTO_ID_EXPEDIENTE}));
	
	public static final Set<Integer> TIPOS_DOCUMENTOS_EXTERNOS = new HashSet<Integer>(Arrays.asList(
		     new Integer[] {TIPO_DOCU_AUTO_ID_OTROS}));
	
	public static final Set<Integer> TIPOS_DOCUMENTOS_MINEDU = new HashSet<Integer>(Arrays.asList(
		     new Integer[] {TIPO_DOCU_AUTO_ID_COD_VALIDACION}));
	
	public static final Set<Integer> TIPOS_DOCUMENTOS_SUNEDU = new HashSet<Integer>(Arrays.asList(
		     new Integer[] {TIPO_DOCU_AUTO_SUNEDU}));
	
	/*********************** CONFIGURACIONES REPORTES *******************************/
	public static final String EXTENSION_FORMATO_PDF 	= "pdf";
	public static final String EXTENSION_FORMATO_XLS 	= "xls";
	public static final String APPLICATION_PDF 			= "application/pdf";
	public static final String APPLICATION_XLS 			= "application/xls";
	public static final String REPORT_PATH 				= new StringBuilder("pages").append(File.separator)
																	.append("Reportes").append(File.separator).toString();

	public static final String IMAGE_REPORT_PATH 		= new StringBuilder("resources").append(File.separator)
																	.append("images").append(File.separator)
																	.append("logo-pj.png").toString();

	/*********************** ESTADOS *******************************/
	public static final String ACTIVO 		= "1";
	public static final String DESACTIVO 	= "0";

	public static final boolean TRUE 		= true;
	public static final boolean FALSE 		= false;

	public static final Long LONG_CERO	 	= 0L;
	public static final Long LONG_UNO	 	= 1L;
	public static final Long LONG_23	 	= 23L;

	public static final int INT_CERO	 	= 0;
	public static final int INT_UNO	 		= 1;
	public static final int INT_DOS	 		= 2;

	public static final String STRING_UNO	 		= "1";
	public static final String STRING_DOS	 		= "2";

	/*********************** LETRAS *******************************/
	public static final String LETRA_R 		= "R";
	public static final String LETRA_PJ 	= "PJ";
	public static final String LETRA_VACIO 	= "";
	public static final String DNI_CEROS 	= "00000000";
	public static final String TODOS 		= "(TODOS)";

    /******** PARAMETROS DE CONFIGURACION PARA OBTERNER LINK DE CAMBIO DE CLAVE DE USUARIO      */
	public static final String RUTA_APP_MSIAP = Mensaje.getString("msiap.url"); 
	public static final String PARAMETO_LINK_AUTENTIFICAR = "?autentifcar=";
    public static final String PARAMETO_LINK_CHECK = "&check=";
    public static final Long   PARAMETO_RECUPERAR_DEFAUL = 1L;
    public static final Long   TIPO_RECUPERACION_CLAVE = 1L;
    public static final Long   TIPO_RECUPERACION_USUARIO = 2L;
    public static final String RECUPERACION_PLAZO_HRS = Mensaje.getString("msiap.recuperaCredencial.plazoHrs");
    public static final String[] PUBLIC_EMAIL_DOMAINS = new String[] {"HOTMAIL","GMAIL","OUTLOOK","YAHOO","ICLOUD","LIVE","MSN"};
    
    public static final String MENSAJE_ERROR_VISTA = "Lo sentimos. OcurriÃ³ un error en la operaciÃ³n";

    public static final String TIPO_BUSQUEDA_INTERNA = "I";
	public static final String TIPO_BUSQUEDA_EXTERNA = "E";

}