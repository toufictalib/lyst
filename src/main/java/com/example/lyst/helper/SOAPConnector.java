package com.example.lyst.helper;
 
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
 
public class SOAPConnector extends WebServiceGatewaySupport {
 
	public Object callWebService(Object request) {
		return getWebServiceTemplate().marshalSendAndReceive(getDefaultUri(), request);
    }
}