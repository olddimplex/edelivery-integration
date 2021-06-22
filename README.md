# edelivery-integration
generating client form WSDL: https://db-blog.web.cern.ch/blog/luis-rodriguez-fernandez/2014-07-java-soap-client-certificate-authentication

certificate setup:
- store the .pfx file under src/main/resources/ 
- edit src/main/resources/clientKeystore.properties  
	- configure the .pfx file name
	- configure the password
	- configure the certificate/key alias
- edit src/main/java/example/PasswordCallbackHandler.java and set the same password

example of invoking service method(s): src/main/java/example/ExampleCXF.java