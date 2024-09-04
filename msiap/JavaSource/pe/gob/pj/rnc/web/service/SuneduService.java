package pe.gob.pj.rnc.web.service;

import javax.xml.ws.BindingProvider;

import pe.gob.pj.util.Constantes;
import pe.gob.pj.ws.client.sunedu.ArrayOfCodigo;
import pe.gob.pj.ws.client.sunedu.Codigo;
import pe.gob.pj.ws.client.sunedu.WSValidaPer;
import pe.gob.pj.ws.client.sunedu.WSValidaPerSoap;

public class SuneduService {

	WSValidaPer service = new WSValidaPer();
	
	private WSValidaPerSoap getPort() {
		WSValidaPerSoap port = service.getWSValidaPerSoap();
		BindingProvider bp = (BindingProvider) port;
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, Constantes.CONFIG_WS_SUNEDU_ENDPOINT);
		bp.getRequestContext().put("com.sun.xml.internal.ws.connect.timeout", Integer.valueOf(Constantes.CONFIG_WS_MINEDU_TIMEOUT) * 1000);
		bp.getRequestContext().put("com.sun.xml.internal.ws.request.timeout", Integer.valueOf(Constantes.CONFIG_WS_MINEDU_TIMEOUT) * 1000);
		
		return port;
	}
	
	public Codigo consultarDatos(String proceso, int tipoDoc, String numDoc) throws Exception {
		Codigo retorno = null;
		ArrayOfCodigo resp = getPort().validaPersona(proceso, tipoDoc, numDoc);
		if(resp!=null && resp.getCodigo()!=null)
			retorno = resp.getCodigo().get(0);
		
		return retorno;
	}
}
