package pe.gob.pj.rnc.msiap.util;

import java.net.URL;


public class ClienteWsUtil {

	public static void Consultar(){
		URL wsdlURL = null;
		try{
//			String urlprueba = "http://serviciososis.mpfn.gob.pe//wsangendapj/ConsultaCasoServiceService?wsdl";
//	          String endPointPrueba = "http://serviciososis.mpfn.gob.pe/wsangendapj/ConsultaCasoServiceService";
//
//	          wsdlURL = new URL(urlprueba);
//	          Service service = Service.create(wsdlURL, serviceName);
//
//	          ConsultaCaso proxy = (ConsultaCaso) service.getPort(ConsultaCaso.class);
//
//	          Client cxfClient = ClientProxy.getClient(proxy);
//	          cxfClient.getInInterceptors().add(new LoggingInInterceptor());
//	          cxfClient.getOutInterceptors().add(new LoggingOutInterceptor());
//
//	          BindingProvider b = (BindingProvider) proxy;
//	          b.getRequestContext().put(SecurityConstants.CALLBACK_HANDLER, new KeystorePasswordCallback());
//	          b.getRequestContext().put(SecurityConstants.SIGNATURE_PROPERTIES, Thread.currentThread().getContextClassLoader().getResource("META-INF/alice.properties"));
//	          b.getRequestContext().put(SecurityConstants.ENCRYPT_PROPERTIES, Thread.currentThread().getContextClassLoader().getResource("META-INF/alice.properties"));
//	          b.getRequestContext().put(SecurityConstants.SIGNATURE_USERNAME, "alice");
//	          b.getRequestContext().put(SecurityConstants.ENCRYPT_USERNAME, "bob");
//	          b.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endPointPrueba);	
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}
