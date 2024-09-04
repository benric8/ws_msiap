package pe.gob.pj.util;

import java.util.Collection;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Set;

import pe.gob.pj.rnc.log.MyLogger;
import pe.gob.pj.rnc.service.MotivoSolicitudCertificadoManager;

public class Mensaje {

	private static final String BUNDLE_NAME = Constantes.RUTA_CONFIG_PROPERTIES;
	private static final ResourceBundle RESOURCE_BUNDLE_NAME = ResourceBundle
			.getBundle(BUNDLE_NAME);

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE_NAME.getString(key);
		} catch (MissingResourceException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static String version = "";

	public static String getVersion() {
		version = Mensaje.getString("msiap.version.numero");
		return version;
	}

	private final static MyLogger logger = new MyLogger(Mensaje.class.getName());

	@Deprecated
	public static String getCodEntExt(String tipoSolicit) {
		MotivoSolicitudCertificadoManager ee = new MotivoSolicitudCertificadoManager();
		try {
			return ee.obtenerCodgEntidadesExternas(tipoSolicit);
		} catch (Exception e) {
			logger.error("Mensaje : ", e);
			e.printStackTrace();
		}
		return null;
	}
	

	public static String completarCerosIzquierda(int longitud, int numero) {
		try {
			StringBuffer formato = new StringBuffer();
			formato.append("%0");
			formato.append(longitud);
			formato.append("d");
			return String.format(formato.toString(), numero);
		}catch(Exception ex){
			return null;
		}
	}

	public static String completarCerosIzquierda(int longitud, String numero) {
		try {
			StringBuffer formato = new StringBuffer();
			if( !isNullOrEmpty( numero ) ){
				int c = numero.trim().length();
				while( c < longitud){
					formato.append("0");
					c++;
				}
				formato.append(numero);
			}else{
				formato.append("");
			}

			return formato.toString();
		}catch(Exception ex){
			return null;
		}
	}
	
	public static boolean isNullOrEmpty(Object valor) {
		if (valor == null) {
			return true;
		}

		if(valor instanceof Collection<?>){
			return ((Collection) valor).isEmpty();
		}
		if (valor instanceof Set<?>) {
			return ((Set) valor).isEmpty();
		}
		if(valor instanceof Map<?, ?>){
			return ((Map) valor).isEmpty();
		}

		if (valor instanceof String) {
			if (((String) valor).trim().length() == 0) {
				return true;
			}
		}

		if (valor instanceof Integer) {
			if (((Integer) valor).intValue() <= 0) {
				return true;
			}
		}

		if (valor instanceof Long) {
			if (((Long) valor).intValue() <= 0) {
				return true;
			}
		}

		return false;
	}
}
