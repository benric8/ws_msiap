package pe.gob.pj.rnc.util.comparador;

import pe.gob.pj.rnc.tipo.Texto;

public abstract class Comparador {
	
	/** 
	 * Este método elimina las letras eñes de una cadena
	 * reemplazando :
	 * 		la letra ñ por la letra o
	 * 		la letra o por la letra p
	 * 		la letra p por la letra q, etc
	 * de este modo la comparación de entre los textos resultantes
	 * podran ser evaluados de modo normal para <, >, = y otros.
	 * 
	 * @param texto
	 * @return texto para comparacion sin letra ñ.
	 */
	protected String comparableNoEnhe(String texto) {
		if (Texto.contieneAlgo(texto)) {
			texto = Texto.eliminarCaracteresEspeciales(texto);
			texto = texto.toLowerCase();
			StringBuffer flujo = new StringBuffer();
			for (int i = 0; i < texto.length(); i++) {
				if (texto.charAt(i) < 'o')
					flujo.append(texto.charAt(i));
				else if (texto.charAt(i) == 'ñ')
					flujo.append((char) (texto.charAt(i) - 130));
				else if (texto.charAt(i) >= 'o' && texto.charAt(i) <= 'z')
					flujo.append((char) (texto.charAt(i) + 1));
			}
			return flujo.toString();
		}
		return "";
	}

}
