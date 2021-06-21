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

import org.tempuri.EDeliveryIntegrationServiceLocator;

import bg.egov.edelivery.services.integration.IEDeliveryIntegrationService;

public class Example {

	public static void main(String[] args) throws Exception {
		final String pfxFileName = "example.pfx"; // expected in the root of classpath (here: src/main/resources)
		final String pfxFilePassword = "pass";
		final String validEGN = "EGN";
		initSSL(pfxFileName, pfxFilePassword);
		EDeliveryIntegrationServiceLocator locator = new EDeliveryIntegrationServiceLocator();
		IEDeliveryIntegrationService service = locator.getBasicHttpBinding_IEDeliveryIntegrationService();
		service.checkSubjectHasRegistration(validEGN);
	}
	
	// pass a p12 or pfx file (file may be on classpath also)
	private static void initSSL(String keyStoreFile, String pass) throws Exception {
	    InputStream keyStoreStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(keyStoreFile);

	    KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
	    KeyStore keyStore = KeyStore.getInstance("PKCS12");

	    keyStore.load(keyStoreStream, pass.toCharArray());
	    kmf.init(keyStore, pass.toCharArray());

	    KeyStore trustStore = loadDefaultTrustStore();
//	    		KeyStore.getInstance(KeyStore.getDefaultType());
//	    trustStore.load(null, null);

	    // init the trust manager factory by read certificates
	    TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
	    tmf.init(trustStore);

	    // 3. init the SSLContext using kmf and tmf above
	    SSLContext sslContext = SSLContext.getInstance("TLS");
	    sslContext.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);
	    SSLContext.setDefault(sslContext);
	}

    private static KeyStore loadDefaultTrustStore() {
        Path location = null;
        String type = null;
        String password = null;

        String locationProperty = System.getProperty("javax.net.ssl.trustStore");
        if ((null != locationProperty) && (locationProperty.length() > 0)) {
            Path p = Paths.get(locationProperty);
            File f = p.toFile();
            if (f.exists() && f.isFile() && f.canRead()) {
                location = p;
            }
        } else {
            String javaHome = System.getProperty("java.home");
            location = Paths.get(javaHome, "lib", "security", "jssecacerts");
            if (!location.toFile().exists()) {
                location = Paths.get(javaHome, "lib", "security", "cacerts");
            }
        }

        String passwordProperty = System.getProperty("javax.net.ssl.trustStorePassword");
        if ((null != passwordProperty) && (passwordProperty.length() > 0)) {
            password = passwordProperty;
        } else {
            password = "changeit";
        }

        String typeProperty = System.getProperty("javax.net.ssl.trustStoreType");
        if ((null != typeProperty) && (typeProperty.length() > 0)) {
            type = passwordProperty;
        } else {
            type = KeyStore.getDefaultType();
        }

        KeyStore trustStore = null;
        try {
            trustStore = KeyStore.getInstance(type, Security.getProvider("SUN"));
        } catch (KeyStoreException e) {
            throw new RuntimeException(e);
        }

        try (InputStream is = Files.newInputStream(location)) {
            trustStore.load(is, password.toCharArray());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return trustStore;
    }
}
