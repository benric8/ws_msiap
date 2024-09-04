package pe.gob.pj.rnc.tipo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import pe.gob.pj.rnc.log.MyLogger;

public class Lista {
	static MyLogger logger= new MyLogger(Lista.class.getName());
	public static boolean contieneAlgo(List lista) {
		if (lista != null)
			return 0 < lista.size();
		return false;
	}

	public static boolean contieneSoloUno(List lista) {
		if (lista != null)
			return lista.size()==1;
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public static void eliminar(List lista, Integer[] posicion) {
		if (lista != null && posicion != null)
			if (0 < lista.size() && 0 < posicion.length) {
				List listaDesechable = new ArrayList();
				for (Integer indice : posicion)
					listaDesechable.add(lista.get(indice));
				lista.removeAll(listaDesechable);
			}
	}

	@SuppressWarnings("unchecked")
	public static void diferencia(List minuendo, List sustraendo) {
		if (minuendo != null && sustraendo != null)
			if (0 < minuendo.size() && 0 < sustraendo.size())
				minuendo.removeAll(sustraendo);
	}

	@SuppressWarnings("unchecked")
	public static List ordenar(List lista, Comparator comparador) {
		if (contieneAlgo(lista)) {
			if (comparador == null)
				Collections.sort(lista);
			if (comparador != null)
				Collections.sort(lista, comparador);
		}
		return lista;
	}

	public static Object obtener(List lista, String nombreMetodoGetId, Object id) {
		if (contieneAlgo(lista) && Texto.contieneAlgo(nombreMetodoGetId) && id != null) {
			boolean encontrado = false;
			Method metodoGetId;
			for (Integer i = 0; i < lista.size() && !encontrado; i++) {
				Object objeto = lista.get(i);
				try {
					metodoGetId = objeto.getClass().getMethod(nombreMetodoGetId);
					if (id.equals(metodoGetId.invoke(objeto))) {
						encontrado = true;
						return objeto;
					}
				} catch (SecurityException e) {
					logger.error("",e);
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					logger.error("",e);
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					logger.error("",e);
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					logger.error("",e);
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					logger.error("",e);
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public static List subtraer(final List lista1, final List lista2) {
		final ArrayList resultado = new ArrayList(lista1);
		final Iterator iterador = lista2.iterator();
		while (iterador.hasNext()) {
			resultado.remove(iterador.next());
		}
		return resultado;
	}

	@SuppressWarnings("unchecked")
	public static List subtraerModificandoLista(final List lista1, final List lista2) {
		final Iterator iterador = lista2.iterator();
		while (iterador.hasNext()) {
			lista1.remove(iterador.next());
		}
		return lista1;
	}

	@SuppressWarnings("unchecked")
	public static List interseccion(final List lista1, final List lista2) {
		final ArrayList resultado = new ArrayList();
		final Iterator iterador = lista2.iterator();
		while (iterador.hasNext()) {
			final Object o = iterador.next();
			if (lista1.contains(o)) {
				resultado.add(o);
			}
		}
		return resultado;
	}

	@SuppressWarnings("unchecked")
	public static List union(final List lista1, final List lista2) {
		final ArrayList result = new ArrayList(lista1);
		result.addAll(lista2);
		return result;
	}

	public static List suma(final List lista1, final List lista2) {
		return subtraer(union(lista1, lista2), interseccion(lista1, lista2));
	}

}
