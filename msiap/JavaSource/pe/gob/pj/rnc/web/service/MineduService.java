package pe.gob.pj.rnc.web.service;

import javax.xml.ws.BindingProvider;

import pe.gob.pj.client.minedu.wscandadopj.client.ArrayOfRetorno;
import pe.gob.pj.client.minedu.wscandadopj.client.IWSCandadoPJ;
import pe.gob.pj.client.minedu.wscandadopj.client.Retorno;
import pe.gob.pj.client.minedu.wscandadopj.client.WSCandadoPJ;
import pe.gob.pj.util.Constantes;

public class MineduService {

	WSCandadoPJ service = new WSCandadoPJ();
	
	private IWSCandadoPJ getPort() {
		IWSCandadoPJ port = service.getBasicHttpBindingIWSCandadoPJ();
		BindingProvider bp = (BindingProvider) port;
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, Constantes.CONFIG_WS_MINEDU_ENDPOINT);
		bp.getRequestContext().put("com.sun.xml.internal.ws.connect.timeout", Integer.valueOf(Constantes.CONFIG_WS_MINEDU_TIMEOUT) * 1000);
		bp.getRequestContext().put("com.sun.xml.internal.ws.request.timeout", Integer.valueOf(Constantes.CONFIG_WS_MINEDU_TIMEOUT) * 1000);
		
		return port;
	}
	
	public Retorno consultarDatos(String dni, String codigoDeValidacion) throws Exception {
		Retorno retorno = null;
		ArrayOfRetorno resp = getPort().verificar(dni, codigoDeValidacion);
		if(resp!=null && resp.getRetorno()!=null)
			retorno = resp.getRetorno().get(0);
		
		return retorno;
	}
}
