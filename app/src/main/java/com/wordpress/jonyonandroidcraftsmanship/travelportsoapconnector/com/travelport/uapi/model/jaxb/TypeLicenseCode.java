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
 * <p>Java class for typeLicenseCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeLicenseCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="Standard Plus"/>
 *     &lt;enumeration value="Enterprise"/>
 *     &lt;enumeration value="TE Only"/>
 *     &lt;enumeration value="uAPI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum TypeLicenseCode {

    @XmlEnumValue("Enterprise")
    ENTERPRISE("Enterprise"),
    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("Standard Plus")
    STANDARD_PLUS("Standard Plus"),
    @XmlEnumValue("TE Only")
    TE_ONLY("TE Only"),
    @XmlEnumValue("uAPI")
    U_API("uAPI");
    private final String value;

    TypeLicenseCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeLicenseCode fromValue(String v) {
        for (TypeLicenseCode c: TypeLicenseCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
