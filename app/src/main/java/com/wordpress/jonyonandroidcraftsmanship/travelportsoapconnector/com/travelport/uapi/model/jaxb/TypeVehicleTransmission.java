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
 * <p>Java class for typeVehicleTransmission.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeVehicleTransmission">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Automatic"/>
 *     &lt;enumeration value="Automatic4WD"/>
 *     &lt;enumeration value="AutomaticAWD"/>
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="Manual4WD"/>
 *     &lt;enumeration value="ManualAWD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum TypeVehicleTransmission {

    @XmlEnumValue("Automatic")
    AUTOMATIC("Automatic"),
    @XmlEnumValue("Automatic4WD")
    AUTOMATIC_4_WD("Automatic4WD"),
    @XmlEnumValue("AutomaticAWD")
    AUTOMATIC_AWD("AutomaticAWD"),
    @XmlEnumValue("Manual")
    MANUAL("Manual"),
    @XmlEnumValue("Manual4WD")
    MANUAL_4_WD("Manual4WD"),
    @XmlEnumValue("ManualAWD")
    MANUAL_AWD("ManualAWD");
    private final String value;

    TypeVehicleTransmission(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeVehicleTransmission fromValue(String v) {
        for (TypeVehicleTransmission c: TypeVehicleTransmission.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
