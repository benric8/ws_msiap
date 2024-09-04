/**
 * Created on May 20, 2009
 * Created by mmedina
 */
package pe.gob.pj.rnc.util.comparador;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Calendar;



import pe.gob.pj.rnc.log.MyLogger;

/**
 * Clase con metodos utilitarios criptograficos.
 * 
 * @author mmedina
 * @version 1.0
 * 
 */
public class CryptoUtils {
	private static MyLogger logger= new MyLogger(CryptoUtils.class.getName());

	private static final String DIGEST_ALGORITHM = "SHA-1";
	private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm";

	public CryptoUtils() {
		// no instanciar esta clase
	}

	/**
	 * Compara que el identificador de usuario genere la cadena encriptada.
	 * 
	 * @param userid
	 *            identificador de usuario
	 * @param encryptCode
	 *            cadena encriptada
	 * @return true si el identificador de usuario genera la cadena encriptada, false en caso contrario
	 */
	public static boolean isValidEncryptCode(String userid, String encryptCode) {
		String hash = getEncryptCode(userid);
		return hash.equals(encryptCode);
		//return true;
	}

	/**
	 * Genera la cadena encriptada en base al identificador de usuario.
	 * 
	 * @param userid
	 *            identificador de usuario
	 * @return cadena hash encriptada
	 */
	public static String getEncryptCode(String userid) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);

		byte[] byteSecret = digest("#LDAP-:" + userid + "#1234567890" + dateFormat.format(calendar.getTime()));
		byte[] byteCode = new byte[byteSecret.length];

		int j = 48;
		for (int i = 0; i < byteSecret.length; i++) {
			byteSecret[i] = (byte) Math.abs(byteSecret[i]);
			if (((int) byteSecret[i]) > 47 && ((int) byteSecret[i]) < 126)
				byteCode[i] = byteSecret[i];
			else {
				byteCode[i] = (byte) j;
				j++;
			}
		}

		String secret = new String(byteCode);

		return secret.replace((char) 59, 'E').replace((char) 63, 'l').replace((char) 92, '5').replace((char) 96, 'u').replace((char) 60,
				'Z').replace((char) 62, 'A');
	}

	/**
	 * Genera el hash/digest del mensaje.
	 * 
	 * @param message
	 *            fuente para generar el hash
	 * @return hash
	 */
	private static byte[] digest(String message) {
		MessageDigest messageDigest = null;

		try {
			messageDigest = MessageDigest.getInstance(DIGEST_ALGORITHM);
		} catch (NoSuchAlgorithmException e) {
			logger.error(e);
			throw new RuntimeException(e);
		}

		messageDigest.reset();
		messageDigest.update(message.getBytes());

		return messageDigest.digest();
	}
}
