//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.1-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.13 at 11:27:55 AM MDT 
//


package com.wordpress.jonyonandroidcraftsmanship.travelportsoapconnector.com.travelport.uapi.model.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for typeFulfillmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeFulfillmentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Kiosk"/>
 *     &lt;enumeration value="Travel Agency"/>
 *     &lt;enumeration value="Courier"/>
 *     &lt;enumeration value="Standard Mail"/>
 *     &lt;enumeration value="Ticketless"/>
 *     &lt;enumeration value="Ticket Office"/>
 *     &lt;enumeration value="Express Mail"/>
 *     &lt;enumeration value="Corporate Kiosk"/>
 *     &lt;enumeration value="Train Station Service Desk"/>
 *     &lt;enumeration value="Direct Printing of Ticket"/>
 *     &lt;enumeration value="Printing of Ticket at Home"/>
 *     &lt;enumeration value="Digital Printing of Ticket at Home"/>
 *     &lt;enumeration value="Retrieve Ticket at Eurostar in London"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum TypeFulfillmentType {

    @XmlEnumValue("Corporate Kiosk")
    CORPORATE_KIOSK("Corporate Kiosk"),
    @XmlEnumValue("Courier")
    COURIER("Courier"),
    @XmlEnumValue("Digital Printing of Ticket at Home")
    DIGITAL_PRINTING_OF_TICKET_AT_HOME("Digital Printing of Ticket at Home"),
    @XmlEnumValue("Direct Printing of Ticket")
    DIRECT_PRINTING_OF_TICKET("Direct Printing of Ticket"),
    @XmlEnumValue("Express Mail")
    EXPRESS_MAIL("Express Mail"),
    @XmlEnumValue("Kiosk")
    KIOSK("Kiosk"),
    @XmlEnumValue("Printing of Ticket at Home")
    PRINTING_OF_TICKET_AT_HOME("Printing of Ticket at Home"),
    @XmlEnumValue("Retrieve Ticket at Eurostar in London")
    RETRIEVE_TICKET_AT_EUROSTAR_IN_LONDON("Retrieve Ticket at Eurostar in London"),
    @XmlEnumValue("Standard Mail")
    STANDARD_MAIL("Standard Mail"),
    @XmlEnumValue("Ticketless")
    TICKETLESS("Ticketless"),
    @XmlEnumValue("Ticket Office")
    TICKET_OFFICE("Ticket Office"),
    @XmlEnumValue("Train Station Service Desk")
    TRAIN_STATION_SERVICE_DESK("Train Station Service Desk"),
    @XmlEnumValue("Travel Agency")
    TRAVEL_AGENCY("Travel Agency");
    private final String value;

    TypeFulfillmentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeFulfillmentType fromValue(String v) {
        for (TypeFulfillmentType c: TypeFulfillmentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
