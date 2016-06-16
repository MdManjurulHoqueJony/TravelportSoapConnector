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
 * <p>Java class for typeRateCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeRateCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Association"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="Corporate"/>
 *     &lt;enumeration value="Government"/>
 *     &lt;enumeration value="Industry"/>
 *     &lt;enumeration value="Package"/>
 *     &lt;enumeration value="Inclusive"/>
 *     &lt;enumeration value="Promotional"/>
 *     &lt;enumeration value="Credential"/>
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="Consortium"/>
 *     &lt;enumeration value="Convention"/>
 *     &lt;enumeration value="Negotiated"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum TypeRateCategory {

    @XmlEnumValue("Association")
    ASSOCIATION("Association"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Consortium")
    CONSORTIUM("Consortium"),
    @XmlEnumValue("Convention")
    CONVENTION("Convention"),
    @XmlEnumValue("Corporate")
    CORPORATE("Corporate"),
    @XmlEnumValue("Credential")
    CREDENTIAL("Credential"),
    @XmlEnumValue("Government")
    GOVERNMENT("Government"),
    @XmlEnumValue("Inclusive")
    INCLUSIVE("Inclusive"),
    @XmlEnumValue("Industry")
    INDUSTRY("Industry"),
    @XmlEnumValue("Negotiated")
    NEGOTIATED("Negotiated"),
    @XmlEnumValue("Package")
    PACKAGE("Package"),
    @XmlEnumValue("Promotional")
    PROMOTIONAL("Promotional"),
    @XmlEnumValue("Standard")
    STANDARD("Standard");
    private final String value;

    TypeRateCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeRateCategory fromValue(String v) {
        for (TypeRateCategory c: TypeRateCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
