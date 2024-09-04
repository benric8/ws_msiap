package pe.gob.pj.rnc.tipo;

public class Texto {

	public static boolean contieneAlgo(String texto) {
		if (texto != null) return 0 < texto.trim().length();
		return false;
	}
	
	public static String trim(String texto) {
		if (texto != null)
			return texto.trim();
		return texto;
	}
	
	public static String corregir(String texto) {
		texto = eliminarCaracteresEspeciales(texto);
		texto = texto.trim();		
		return texto;
	}	

	public static String eliminarCaracteresEspeciales(String texto) {
		if (contieneAlgo(texto)) {
			//texto = texto.replaceAll("%", "");
			//texto = texto.replaceAll("*", "");
			
			texto = texto.replace('Á', 'A');
			texto = texto.replace('É', 'E');
			texto = texto.replace('Í', 'I');
			texto = texto.replace('Ó', 'O');
			texto = texto.replace('Ú', 'U');
			texto = texto.replace('Ü', 'U');
			texto = texto.replace('á', 'a');
			texto = texto.replace('é', 'e');
			texto = texto.replace('í', 'i');
			texto = texto.replace('ó', 'o');
			texto = texto.replace('ú', 'u');
			texto = texto.replace('ü', 'u');
			return texto;
		}
		return texto;
	}		
	
}
