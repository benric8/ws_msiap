package pe.gob.pj.util;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

public class CommonsUtilities {

	public static String getRemoteIpAddress(){
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ExternalContext externalContext = facesContext.getExternalContext();
		HttpServletRequest request = (HttpServletRequest) externalContext.getRequest();
		String ipAddress = request.getHeader("X-FORWARDED-FOR");
		if (ipAddress == null) {
			ipAddress = request.getRemoteAddr();
		}
		
		ipAddress= ipAddress!=null && ipAddress.length()>45?ipAddress.substring(0,45):ipAddress;
		
		if (ipAddress==null) {
			ipAddress="127.0.0.1";
		}
		
		return ipAddress;
	}

	public static String getRemoteIpAddress(HttpServletRequest httpRequest){
		String callerIpAddress = null;
		try {
			if( httpRequest!=null ) {
				callerIpAddress = httpRequest.getRemoteAddr();
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return callerIpAddress;
	}
	
	public static String getMAC() {
		StringBuilder sb = new StringBuilder();
		NetworkInterface a;
		try {
			a = NetworkInterface.getByInetAddress(InetAddress.getLocalHost());
			byte[] mac = a.getHardwareAddress();

			for (int i = 0; i < mac.length; i++) {
				sb.append(String.format("%02X%s", mac[i],(i < mac.length - 1) ? "-" : ""));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	public static String getPCName() {
		String hostname = "Unknown";
		try {
			
			InetAddress addr = InetAddress.getLocalHost();
			
			hostname = addr.getHostName();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return hostname;
	}

	
	public static void goToURL(String URL) {
		if (java.awt.Desktop.isDesktopSupported()) {
			java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

			if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
				try {
					java.net.URI uri = new java.net.URI(URL);
					desktop.browse(uri);
				} catch (Exception ex) {

				}
			}
		}
	}


	public static String getIPAddress() {
		InetAddress ip;
		String ipStr = "";

		try {
			ip = InetAddress.getLocalHost();
			ipStr = ip.getHostAddress();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (ipStr==null) {
			ipStr="127.0.0.1";
		}
		return ipStr;
	}
	public static String getMACAddress() {
		InetAddress ip;
		StringBuilder sb = new StringBuilder();

		try {

			ip = InetAddress.getLocalHost();
			NetworkInterface network = NetworkInterface.getByInetAddress(ip);
			byte[] mac = network.getHardwareAddress();
			for (int i = 0; i < mac.length; i++) {
				sb.append(String.format("%02X%s", mac[i],
						(i < mac.length - 1) ? "-" : ""));
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			e.printStackTrace();
		}

		return sb.toString();
	}
	
	public static String obtenerCodigoUnico() {
		Date fechaActual = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("yyyyMMddHHmmssSSSSSS");
		String strFechaActual = formato.format(fechaActual);
		Random random = new Random();
		int aleatorio = random.nextInt(999) + 1;
		StringBuilder cuo = new StringBuilder();
		cuo.append(strFechaActual).append(String.valueOf(aleatorio));
		return cuo.toString();
	}
	
	public static String getMACEstatica() {

		String macStr= "00-00-00-00-00-00";
		return macStr;
		
	}
	
	public static String ofuscarDatos(String dato) {
		 int numeroCaracteres = dato.length();
		    
		   
		    int nCaracteresVisibles = (int) Math.floor(numeroCaracteres / 2.0);
		    
		    
		    if (nCaracteresVisibles < 2) {
		        nCaracteresVisibles = 2;
		    }

		   
		    String regularExpresion = "(^\\w{" + nCaracteresVisibles + "})(\\w*)";
		    
		   String textoOfuscado = dato.replaceAll(regularExpresion, "$1****");
		    return textoOfuscado;
	}

}
