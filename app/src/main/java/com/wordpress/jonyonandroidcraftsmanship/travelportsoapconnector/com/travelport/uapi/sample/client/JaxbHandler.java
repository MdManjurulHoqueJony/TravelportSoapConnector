package com.wordpress.jonyonandroidcraftsmanship.travelportsoapconnector.com.travelport.uapi.sample.client;

import com.wordpress.jonyonandroidcraftsmanship.travelportsoapconnector.com.travelport.uapi.model.jaxb.PingReq;
import com.wordpress.jonyonandroidcraftsmanship.travelportsoapconnector.com.travelport.uapi.model.jaxb.PingRsp;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import static javax.xml.bind.JAXBContext.newInstance;

/**
 * Manages the transformation between a JAXB object and a SOAP message.
 *
 * @see com.wordpress.jonyonandroidcraftsmanship.travelportsoapconnector.com.travelport.uapi.sample.client.SaajSoapConnector for sending SOAP message
 */
public class JaxbHandler {

    /**
     * Transform a JAXB ping request object into a SOAP Message
     *
     * @param request the JAXB ping request
     * @return the SOAP message
     * @throws JAXBException
     * @throws SOAPException
     */
    public SOAPMessage encodeSOAPMessage(PingReq request) throws JAXBException, SOAPException {
        JAXBContext context = newInstance(PingReq.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        //Next, create the actual message
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage message = messageFactory.createMessage();

        marshaller.marshal(request, message.getSOAPBody());

        message.saveChanges();

        return message;
    }

    /**
     * Transform a SOAP message into a JAXB ping response object
     *
     * @param reply a SOAP message
     * @return a JAXB ping response object
     * @throws JAXBException
     * @throws SOAPException
     */
    public PingRsp decodeSOAPMessage(SOAPMessage reply) throws JAXBException, SOAPException {
        JAXBContext context = newInstance(PingRsp.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        PingRsp response = (PingRsp) unmarshaller.unmarshal(reply.getSOAPBody().getFirstChild());
        return response;
    }
}
