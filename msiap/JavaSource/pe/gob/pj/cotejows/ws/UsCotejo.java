
package pe.gob.pj.cotejows.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "us_cotejo", targetNamespace = "http://tempurl.org", wsdlLocation = "WEB-INF/wsdl/us_cotejo.wsdl")
public class UsCotejo
    extends Service
{

    private final static URL USCOTEJO_WSDL_LOCATION;
    private final static WebServiceException USCOTEJO_EXCEPTION;
    private final static QName USCOTEJO_QNAME = new QName("http://tempurl.org", "us_cotejo");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
        	//URL baseUrl = UsCotejo.class.getClassLoader().getResource(".");
            //url = new URL(baseUrl, "wsdl/us_cotejo.wsdl");
            url = UsCotejo.class.getClassLoader().getResource("us_cotejo.wsdl");
            //url = new URL("file:/C:/temp/projects/cotejo/us_cotejo.wsdl");
        } catch (Exception ex) {
            e = new WebServiceException(ex);
            e.printStackTrace();
        }
        USCOTEJO_WSDL_LOCATION = url;
        USCOTEJO_EXCEPTION = e;
    }

    public UsCotejo() {
        super(__getWsdlLocation(), USCOTEJO_QNAME);
    }

    public UsCotejo(WebServiceFeature... features) {
        super(__getWsdlLocation(), USCOTEJO_QNAME, features);
    }

    public UsCotejo(URL wsdlLocation) {
        super(wsdlLocation, USCOTEJO_QNAME);
    }

    public UsCotejo(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USCOTEJO_QNAME, features);
    }

    public UsCotejo(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UsCotejo(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UsCotejoSoap
     */
    @WebEndpoint(name = "us_cotejoSoap")
    public UsCotejoSoap getUsCotejoSoap() {
        return super.getPort(new QName("http://tempurl.org", "us_cotejoSoap"), UsCotejoSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UsCotejoSoap
     */
    @WebEndpoint(name = "us_cotejoSoap")
    public UsCotejoSoap getUsCotejoSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempurl.org", "us_cotejoSoap"), UsCotejoSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USCOTEJO_EXCEPTION!= null) {
            throw USCOTEJO_EXCEPTION;
        }
        return USCOTEJO_WSDL_LOCATION;
    }

}
