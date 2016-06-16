package com.wordpress.jonyonandroidcraftsmanship.travelportsoapconnector;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wordpress.jonyonandroidcraftsmanship.travelportsoapconnector.com.travelport.uapi.model.jaxb.BillingPointOfSaleInfo;
import com.wordpress.jonyonandroidcraftsmanship.travelportsoapconnector.com.travelport.uapi.model.jaxb.PingReq;
import com.wordpress.jonyonandroidcraftsmanship.travelportsoapconnector.com.travelport.uapi.model.jaxb.PingRsp;
import com.wordpress.jonyonandroidcraftsmanship.travelportsoapconnector.com.travelport.uapi.sample.client.JaxbHandler;
import com.wordpress.jonyonandroidcraftsmanship.travelportsoapconnector.com.travelport.uapi.sample.client.SaajSoapConnector;
import com.wordpress.jonyonandroidcraftsmanship.travelportsoapconnector.extras.Util;

import java.io.IOException;

import javax.xml.bind.JAXBException;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PingReq pingReq = new PingReq();
        pingReq.setPayload("Its Jony !!!");
        BillingPointOfSaleInfo billSaleInfo = new BillingPointOfSaleInfo();
        billSaleInfo.setOriginApplication("UAPI");
        pingReq.setBillingPointOfSaleInfo(billSaleInfo);

        JaxbHandler transformer = new JaxbHandler();
        SOAPMessage request = null;
        try {
            request = transformer.encodeSOAPMessage(pingReq);
        } catch (JAXBException e) {
            Util.logger(e.toString());
        } catch (SOAPException e) {
            Util.logger(e.toString());
        }

        SaajSoapConnector connector = new SaajSoapConnector(Util.REMOTE_HOST, Util.USERNAME, Util.PASSWORD);
        SOAPMessage reply = null;
        try {
            reply = connector.send(request);
        } catch (SOAPException e) {
            Util.logger(e.toString());
        } catch (IOException e) {
            Util.logger(e.toString());
        }

        PingRsp pingRsp = null;
        try {
            pingRsp = transformer.decodeSOAPMessage(reply);
        } catch (JAXBException e) {
            Util.logger(e.toString());
        } catch (SOAPException e) {
            Util.logger(e.toString());
        }
        String payload = pingRsp.getPayload();
        String transactionId = pingRsp.getTransactionId();

        Util.logger(transactionId+" "+payload);
    }
}
