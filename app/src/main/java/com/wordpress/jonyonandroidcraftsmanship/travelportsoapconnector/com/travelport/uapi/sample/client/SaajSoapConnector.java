package com.wordpress.jonyonandroidcraftsmanship.travelportsoapconnector.com.travelport.uapi.sample.client;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static javax.xml.bind.DatatypeConverter.printBase64Binary;

/**
 * Manages the connection with the remote SOAP server.
 *
 * @see com.travelport.uapi.sample.client.JaxbHandler for creating SOAP messages
 */
public class SaajSoapConnector {

    private final Log log = LogFactory.getLog(SaajSoapConnector.class);

    private static final String SERVICE_ENDPOINT = "/SystemService";

    private final String remoteHost;
    private final String userName;
    private final String password;

    public SaajSoapConnector(String remoteHost, String userName, String password) {
        this.remoteHost = remoteHost;
        this.userName = userName;
        this.password = password;
    }

    /**
     * Sends a SOAP message to remote SOAP server and returns the SOAP response.
     *
     * @param message the SOAP message
     * @return the returned SOAP message
     * @throws SOAPException
     * @throws IOException
     */
    public SOAPMessage send(SOAPMessage message) throws SOAPException, IOException {
        SOAPConnection connection = null;
        try {
            // Create the SOAP connection
            SOAPConnectionFactory soapConnFactory = SOAPConnectionFactory.newInstance();
            connection = soapConnFactory.createConnection();

            // Log the request
            ByteArrayOutputStream in = new ByteArrayOutputStream();
            message.writeTo(in);
            log.info("Sending: " + in);

            // Set the destination
            String destination = remoteHost + SERVICE_ENDPOINT;
            log.info("Destination: " + destination);

            // Set the HTTP Basic authentication
            String authorization = printBase64Binary(new String(userName + ":" + password).toString().getBytes());
            log.info("Authorization: " + authorization);
            message.getMimeHeaders().addHeader("Authorization", "Basic " + authorization);

            // Send the message
            SOAPMessage reply = connection.call(message, destination);

            // Log the response
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            reply.writeTo(out);
            log.info("Received: " + out);

            return reply;
        } finally {
            // Close the connection in all cases
            if (connection != null) {
                connection.close();
            }
        }
    }
}
