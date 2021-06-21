package example;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.Security;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.datacontract.schemas._2004._07.edelivery_common.DcLegalPersonRegistrationInfo;
import org.tempuri.EDeliveryIntegrationService;

import https.edelivery_egov_bg.services.integration.IEDeliveryIntegrationService;

public class ExampleCXF {

	public static void main(String[] args) throws Exception {
		EDeliveryIntegrationService service = new EDeliveryIntegrationService();
		IEDeliveryIntegrationService port = service.getBasicHttpBindingIEDeliveryIntegrationService();
		
		Client client = ClientProxy.getClient( port );
		client.getRequestContext().put("ws-security.callback-handler", PasswordCallbackHandler.class.getName());
		client.getRequestContext().put("ws-security.signature.properties", "clientKeystore.properties");
		client.getRequestContext().put("ws-security.signature.username", "1");

		HTTPConduit http = (HTTPConduit) client.getConduit();
		 
		HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
		 
		httpClientPolicy.setConnectionTimeout(36000);
		httpClientPolicy.setAllowChunking(false);
		httpClientPolicy.setReceiveTimeout(32000);
		 
		http.setClient(httpClientPolicy);
		

		DcLegalPersonRegistrationInfo response = port.checkLegalPersonHasRegistration("EGN");
		System.out.println(response.isHasRegistration());
	}
}
