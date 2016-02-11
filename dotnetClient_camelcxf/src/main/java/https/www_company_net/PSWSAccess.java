package https.www_company_net;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

import org.apache.cxf.annotations.GZIP;

/**
 * This class was generated by Apache CXF 3.0.4
 * 2016-02-10T14:19:57.766+05:30
 * Generated source version: 3.0.4
 * 
 */
@GZIP
@WebServiceClient(name = "PS_WSAccess", 
                  wsdlLocation = "file:/home/cpandey/Desktop/GetToken.wsdl",
                  targetNamespace = "https://www.peoplestreme.net/") 
public class PSWSAccess extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("https://www.peoplestreme.net/", "PS_WSAccess");
    public final static QName PSWSAccessSoap = new QName("https://www.peoplestreme.net/", "PS_WSAccessSoap");
    public final static QName PSWSAccessSoap12 = new QName("https://www.peoplestreme.net/", "PS_WSAccessSoap12");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/cpandey/Desktop/GetToken.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PSWSAccess.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/cpandey/Desktop/GetToken.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PSWSAccess(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PSWSAccess(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PSWSAccess() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PSWSAccess(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PSWSAccess(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PSWSAccess(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns PSWSAccessSoap
     */
    @WebEndpoint(name = "PS_WSAccessSoap")
    public PSWSAccessSoap getPSWSAccessSoap() {
        return super.getPort(PSWSAccessSoap, PSWSAccessSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PSWSAccessSoap
     */
    @WebEndpoint(name = "PS_WSAccessSoap")
    public PSWSAccessSoap getPSWSAccessSoap(WebServiceFeature... features) {
        return super.getPort(PSWSAccessSoap, PSWSAccessSoap.class, features);
    }
    /**
     *
     * @return
     *     returns PSWSAccessSoap
     */
    @WebEndpoint(name = "PS_WSAccessSoap12")
    public PSWSAccessSoap getPSWSAccessSoap12() {
        return super.getPort(PSWSAccessSoap12, PSWSAccessSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PSWSAccessSoap
     */
    @WebEndpoint(name = "PS_WSAccessSoap12")
    public PSWSAccessSoap getPSWSAccessSoap12(WebServiceFeature... features) {
        return super.getPort(PSWSAccessSoap12, PSWSAccessSoap.class, features);
    }

}
