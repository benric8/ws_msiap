package pe.gob.pj.rnc.util.comparador;

import java.util.Comparator;

public class ComparadorTexto extends Comparador implements Comparator<String> {

	public int compare(String o1, String o2) {
		return comparableNoEnhe(o1).compareTo(comparableNoEnhe(o2));
	}

}
