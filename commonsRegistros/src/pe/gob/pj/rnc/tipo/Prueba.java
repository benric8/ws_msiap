package pe.gob.pj.rnc.tipo;

import java.math.BigDecimal;
import java.util.logging.Logger;

import org.apache.commons.lang.StringUtils;

public class Prueba {

	private static final Logger LOGGER = Logger.getLogger("Diccionario");
	
	/**
	 * @param args
	 */

	public static void analizar(String original, String texto) {

		String mitadIzquierda;
		String mitadDerecha;
		Integer longitudSolicitud = texto.length();

		int longitudAnalizable = BigDecimal.valueOf(longitudSolicitud / 2).intValue();
		mitadIzquierda = texto.substring(0, longitudAnalizable);
		mitadDerecha = StringUtils.reverse(StringUtils.reverse(texto).substring(0, longitudAnalizable));
		
		LOGGER.info("original  : " + original);
		LOGGER.info("texto     : " + texto);
		LOGGER.info("izquierda : " + mitadIzquierda);
		LOGGER.info("derecha   : " + mitadDerecha);

		if (original.startsWith(mitadIzquierda))
			LOGGER.info("izquierda SI coincide");
		else
			LOGGER.info("izquierda NO coincide");

		if (original.endsWith(mitadDerecha))
			LOGGER.info("derecha SI coincide");
		else
			LOGGER.info("derecha NO coincide");

	}

	public static void main(String[] args) {
		analizar("juanito", "juanita");
		analizar("perton", "malsaberton");
	}

}
