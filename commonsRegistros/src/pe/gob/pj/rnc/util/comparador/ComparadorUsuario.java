package pe.gob.pj.rnc.util.comparador;

import java.util.Comparator;

import pe.gob.pj.rnc.model.Usuario;

public class ComparadorUsuario extends Comparador implements Comparator<Usuario> {
	
	public int compare(Usuario o1, Usuario o2) {
		int compararPaterno;
		compararPaterno = comparableNoEnhe(o1.getAPLL_USUAR()).compareTo(comparableNoEnhe(o2.getAPLL_USUAR()));
		if(compararPaterno==0) 
			return comparableNoEnhe(o1.getNOMB_USUAR()).compareTo(comparableNoEnhe(o2.getNOMB_USUAR()));
		return compararPaterno;
	}	

}
