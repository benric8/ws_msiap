package pe.gob.pj.cotejows.service;

import javax.xml.ws.BindingProvider;

import pe.gob.pj.cotejows.ws.UsCotejo;
import pe.gob.pj.cotejows.ws.UsCotejoSoap;
import pe.gob.pj.util.Constantes;

public class ServicioWSCotejo {

	public static void main (String[] args){
		String respuesta = ServicioWSCotejo.cotejarPersonaJur("VILLACEZ", "HUAMAN", "CARLOS", "***", "***", "40146659");
		System.out.print("RESULTADO:"+respuesta);
	}
	
	public static String cotejarPersona(String apellidoPaterno, String apellidoMaterno, String nombre1, String nombre2, String nombre3,  String dni){
		UsCotejo servicio = new UsCotejo();

		UsCotejoSoap puerto = servicio.getUsCotejoSoap();

		BindingProvider bp = (BindingProvider) puerto;
		// Se asigna el endpoint del WS

		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,Constantes.CONFIG_COTEJO_WS_ENDPOINT);
		// Se asigna los tiempos de timeout de la consulta al WS
		bp.getRequestContext().put("com.sun.xml.ws.connect.timeout", Integer.parseInt(Constantes.CONFIG_COTEJO_WS_TIMEOUT) * 1000);
		bp.getRequestContext().put("com.sun.xml.ws.request.timeout", Integer.parseInt(Constantes.CONFIG_COTEJO_WS_TIMEOUT) * 1000);


		String response = puerto.fCriterioBusq(apellidoPaterno, apellidoMaterno, nombre1, nombre2, nombre3, dni, "");
		servicio=null;
		puerto=null;
		bp=null;
	    return response;
	}
	
	public static String cotejarPersonaSuc(String apellidoPaterno, String apellidoMaterno, String nombre1, String nombre2, String nombre3, String dni){
		UsCotejo servicio = new UsCotejo();

		UsCotejoSoap puerto = servicio.getUsCotejoSoap();

		BindingProvider bp = (BindingProvider) puerto;
		// Se asigna el endpoint del WS

		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,Constantes.CONFIG_COTEJO_WS_ENDPOINT);
		// Se asigna los tiempos de timeout de la consulta al WS
		bp.getRequestContext().put("com.sun.xml.ws.connect.timeout", Integer.parseInt(Constantes.CONFIG_COTEJO_WS_TIMEOUT) * 1000);
		bp.getRequestContext().put("com.sun.xml.ws.request.timeout", Integer.parseInt(Constantes.CONFIG_COTEJO_WS_TIMEOUT) * 1000);

		String response = puerto.fCriterioBusqSuc(apellidoPaterno, apellidoMaterno, nombre1, nombre2, nombre3, dni, "");
		servicio=null;
		puerto=null;
		bp=null;
	    return response;

	}
	
	public static String cotejarPersonaJur(String apellidoPaterno, String apellidoMaterno, String nombre1, String nombre2, String nombre3, String dni){
		UsCotejo servicio = new UsCotejo();

		UsCotejoSoap puerto = servicio.getUsCotejoSoap();

		BindingProvider bp = (BindingProvider) puerto;
		// Se asigna el endpoint del WS

		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,Constantes.CONFIG_COTEJO_WS_ENDPOINT);
		// Se asigna los tiempos de timeout de la consulta al WS
		bp.getRequestContext().put("com.sun.xml.ws.connect.timeout", Integer.parseInt(Constantes.CONFIG_COTEJO_WS_TIMEOUT) * 1000);
		bp.getRequestContext().put("com.sun.xml.ws.request.timeout", Integer.parseInt(Constantes.CONFIG_COTEJO_WS_TIMEOUT) * 1000);

		String response = puerto.fCriterioBusqJur(apellidoPaterno, apellidoMaterno, nombre1, nombre2, nombre3, dni, "");
		servicio=null;
		puerto=null;
		bp=null;
	    return response;

	}	

	public static String cotejarPersonaJNE(String apellidoPaterno, String apellidoMaterno, String nombre1, String nombre2, String nombre3, String dni, String usuario, Integer idEntidad){
		UsCotejo servicio = new UsCotejo();

		UsCotejoSoap puerto = servicio.getUsCotejoSoap();

		BindingProvider bp = (BindingProvider) puerto;
		// Se asigna el endpoint del WS

		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,Constantes.CONFIG_COTEJO_WS_ENDPOINT);
		// Se asigna los tiempos de timeout de la consulta al WS
		bp.getRequestContext().put("com.sun.xml.ws.connect.timeout", Integer.parseInt(Constantes.CONFIG_COTEJO_WS_TIMEOUT) * 1000);
		bp.getRequestContext().put("com.sun.xml.ws.request.timeout", Integer.parseInt(Constantes.CONFIG_COTEJO_WS_TIMEOUT) * 1000);


		String response = puerto.fCriterioBusqJne(apellidoPaterno, apellidoMaterno, nombre1, nombre2, nombre3, dni, "SRV_PROD", "localhost", usuario, "MAC" , idEntidad.shortValue());
		servicio=null;
		puerto=null;
		bp=null;
	    return response;

	}
	
	public static String cotejarPersonaMINEDU(String dni, String apellidoPaterno, String apellidoMaterno, String nombre1, String nombre2, String nombre3){
		UsCotejo servicio = new UsCotejo();

		UsCotejoSoap puerto = servicio.getUsCotejoSoap();

		BindingProvider bp = (BindingProvider) puerto;
		// Se asigna el endpoint del WS

		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,Constantes.CONFIG_COTEJO_WS_ENDPOINT);
		// Se asigna los tiempos de timeout de la consulta al WS
		bp.getRequestContext().put("com.sun.xml.ws.connect.timeout", Integer.parseInt(Constantes.CONFIG_COTEJO_WS_TIMEOUT) * 1000);
		bp.getRequestContext().put("com.sun.xml.ws.request.timeout", Integer.parseInt(Constantes.CONFIG_COTEJO_WS_TIMEOUT) * 1000);

		String response = puerto.fCriterioBusqMinedu(apellidoPaterno, apellidoMaterno, nombre1, nombre2, nombre3, dni, "");
		servicio=null;
		puerto=null;
		bp=null;
	    return response;
	}

}
