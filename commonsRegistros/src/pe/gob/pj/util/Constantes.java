package pe.gob.pj.util;

public class Constantes {

	public static final String RUTA_CONFIG_PROPERTIES = "msiap";

	public static final String CONFIG_COTEJO_WS_TIMEOUT = Mensaje.getString("config.wscotejo.wsTimeout");
	public static final String CONFIG_COTEJO_WS_ENDPOINT = Mensaje.getString("config.wscotejo.endpoint");
	public static final String ENTIDADES_REPORT_REHABILITADOS = Mensaje.getString("config.reportes.tipoSolicitud.rehabilitados");
	public static final String TIPO_SOLICITUD_SUCAMEC = Mensaje.getString("tipo.solicitud.sucamec");
	public static final String TIPO_SOLICITUD_JNE = Mensaje.getString("tipo.solicitud.jne");
	//public static final String[] ENTIDADES_REPORT_REHABIL = Mensaje.getCodEntExt(TIPO_SOLICITUD_SUCAMEC).split(";",-1);

	public static final String MENSAJE_COTEJO_WS_CON_HOMONIMIA_SIN_OFICIO="CONHOMONIMIA/SINOFICIO";
	public static final String MENSAJE_COTEJO_WS_CON_HOMONIMIA_CON_OFICIO="CONHOMONIMIA/CONOFICIO";
	public static final String MENSAJE_COTEJO_WS_SIN_HOMONIMIA_SIN_OFICIO="SINHOMONIMIA/SINOFICIO";
	public static final String MENSAJE_COTEJO_WS_SIN_HOMONIMIA_CON_OFICIO="SINHOMONIMIA/CONOFICIO";

	public static String M_A_C="";
	public static final String	MSJ_NEW_USER = "CREANDO NUEVO USUARIO.";
	public static final String	MSJ_MOD_USER = "Modificando informaciÃƒÂ³n del usuario ";
	public static final String	SIN_VALOR_NULL	= "-SIN VALOR O NULL-";

	//PARï¿½METROS DE CONFIGURACIï¿½N DEL SERVICIO WEB RENIEC
	public static final String CONFIG_WS_RENIEC_ENDPOINT = Mensaje.getString("msiap.wsreniec.endpoint");
	public static final String CONFIG_WS_RENIEC_DNI_AUTH = Mensaje.getString("msiap.wsreniec.rest.dniconsultante");//nueva propiedad, mismo valor
	public static final String CONFIG_WS_RENIEC_IP = Mensaje.getString("msiap.wsreniec.ip");
	public static final String CONFIG_WS_RENIEC_TIMEOUT = Mensaje.getString("msiap.wsreniec.timeout");
	public static final String CONFIG_WS_RENIEC_USUARIO = Mensaje.getString("msiap.wsreniec.usuario");

	//PARÃ�METROS DE CONFIGURACIÃ“N DEL SERVICIO WEB MINEDU
	public static final String CONFIG_WS_MINEDU_ENDPOINT = Mensaje.getString("msiap.wsminedu.endpoint");
	public static final String CONFIG_WS_MINEDU_TIMEOUT = Mensaje.getString("msiap.wsminedu.timeout");
	
	//PARÃ�METROS DE CONFIGURACIÃ“N DEL SERVICIO WEB SUNEDU
	public static final String CONFIG_WS_SUNEDU_ENDPOINT = Mensaje.getString("msiap.wssunedu.endpoint");
	
	//RUTA DE VALIDACIï¿½N DEL CERTIFICADO DE ANTECEDENTES PENALES
	public static final String URL_CAP_VALIDACION = Mensaje.getString("msiap.url.cap.validacion");
	
	public static final String ENTIDAD_MINEDU_CODIGO_DJ =  Mensaje.getString("entidad.minedu.codigo.dj");
	public static final String ENTIDAD_SUNEDU_CODIGO_DJ =  Mensaje.getString("entidad.sunedu.codigo.dj");
	
	
	
	/*APIS RENIEC REST*/
	public static final String URI_METODO_AUTENTIFICACION_WS_RENIEC_REST	="api/authenticate";
	public static final String URI_METODO_CONSULTAR_WS_RENIEC_REST	="reniec/buscar/persona-dni";
	

	public static final String HEADER_USERNAME_HTTP_MPE_REST							="username";
	public static final String HEADER_PASSWORD_HTTP_MPE_REST							="password";
	public static final String HEADER_CODIGO_CLIENTE_HTTP_MPE_REST						="codigoCliente";
	public static final String HEADER_CODIGO_ROL_HTTP_MPE_REST					="codigoRol";
	public static final String HEADER_PARAMETERS_HTTP_MPE_REST							="parameters";
	public static final String HEADER_ZONA_HTTP_MPE_REST								="Zona";
	public static final String HEADER_ZONA_HTTP_MPE_REST_VALUE							="9";
	
	public static final String STATUS_BAD_REQUEST										="400 Bad Request";
	
	//get token
	public static final String CONFIG_WS_REST_ENDPOINT = Mensaje.getString("msiap.wsreniec.rest.endpoint");
	public static final String CONFIG_WS_REST_USUARIO = Mensaje.getString("msiap.wsreniec.rest.usuario");
	public static final String CONFIG_WS_REST_PASSWORD= Mensaje.getString("msiap.wsreniec.rest.password");
	public static final String CONFIG_WS_REST_COD_CLIENTE = Mensaje.getString("msiap.wsreniec.rest.codCliente");
	public static final String CONFIG_WS_REST_COD_ROL = Mensaje.getString("msiap.wsreniec.rest.codRol");
	
	public static final int VALUE_PAGINATION_PAGE_RENIEC=0;
	public static final int VALUE_PAGINATION_SIZE_RENIEC=30;
	public static final String VALUE_MOTIVO_RENIEC = "INGRESO NUEVO DESDE MSIAP";
	public static final String VALUE_FORMATO_RESPUESTA_RENIEC = "json";
	public static final String TIPO_CONSULTA_POR_NUMERO_DNI ="2";
	public static final String VALUE_CODIGO_APLICATIVO ="USR_"+Constantes.CONFIG_WS_REST_COD_CLIENTE;
	
	
	public static final String KEY_FORMATO_RESPUESTA_RENIEC = "formatoRespuesta";
	public static final String KEY_CONSULTANTE_RENIEC ="consultante";
	public static final String KEY_MOTIVO_RENIEC = "motivo";
	public static final String KEY_PERSONA_CONSULTADA_RENIEC = "numeroDocumentoIdentidad";	
	public static final String KEY_CODIGO_APLICATIVO = "codigoAplicativo";	
	public static final String KEY_AUDITORIA_RENIEC = "auditoria";
	public static final String KEY_PAGINATION_RENIEC = "pagination";
	
	public static final String CONFIG_CAPTCHA_URL = Mensaje.getString("msiap.captcha.url");
	public static final String CONFIG_CAPTCHA_SECRET_KEY = Mensaje.getString("msiap.captcha.secretkey");
	public static final String CONFIG_CAPTCHA_WEB_KEY = Mensaje.getString("msiap.captcha.webkey");
	
	
	
	
}
