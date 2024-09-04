/**
 * 
 */
package pe.gob.pj.rnc.log;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import pe.gob.pj.rnc.model.Usuario;

/**
 * @author bmorip
 */
public class MyLogger extends Logger {
	
	private String	jerarquiaDePaquete;
	private Usuario	usuario;
	static String		FQCN	= MyLogger.class.getName() + ".";
	
	public void info(Object objMensaje) {
		Logger loger = getLogger(jerarquiaDePaquete);
		loger.log(FQCN, Level.INFO, getMensaje(objMensaje), null);
	}
	
	public void debug(Object objMensaje) {
		Logger loger = getLogger(jerarquiaDePaquete);
		loger.log(FQCN, Level.DEBUG, getMensaje(objMensaje.toString()), null);
	}
	
	public void error(Object objMensaje, Exception e) {
		String excepcion = "";
		StringBuilder resultado = new StringBuilder();
		resultado.append("Clase = " + e.getStackTrace()[0].getClassName() + ". ");
		resultado.append("Numero de Linea = " + e.getStackTrace()[0].getLineNumber() + ". ");
		resultado.append("Descripcion = " + e.getMessage());
		excepcion = resultado.toString();
		
		Logger loger = getLogger(jerarquiaDePaquete);
		loger.log(FQCN, Level.ERROR, getMensaje(objMensaje.toString() + " --> " + excepcion), null);
	}
	
	public void error(String objMensaje) {
		Logger loger = getLogger(jerarquiaDePaquete);
		loger.log(FQCN, Level.ERROR, objMensaje, null);
	}
	
	public MyLogger(Usuario usuario, String jerarquiaDePaquete) {
		super(jerarquiaDePaquete);
		this.jerarquiaDePaquete = jerarquiaDePaquete;
		this.usuario = usuario;
	}
	
	public MyLogger(String jerarquiaDePaquete) {
		super(jerarquiaDePaquete);
		this.jerarquiaDePaquete = jerarquiaDePaquete;
	}
	
	private String getMensaje(Object objMensaje) {
		String resultado = "";
		if (usuario != null && usuario.getCODG_USUAR() != null) {
			resultado = resultado + "[codg_usuar:" + usuario.getCODG_USUAR() + "]";
			resultado = resultado + "[msg:" + objMensaje.toString() + "]";
		} else {
			resultado = resultado + "[msg:" + objMensaje.toString() + "]";
		}
		
		return resultado;
	}
	
}
