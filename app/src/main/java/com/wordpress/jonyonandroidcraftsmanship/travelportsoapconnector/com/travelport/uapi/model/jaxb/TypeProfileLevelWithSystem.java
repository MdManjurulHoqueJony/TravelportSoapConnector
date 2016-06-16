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
 * <p>Java class for typeProfileLevelWithSystem.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeProfileLevelWithSystem">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="System"/>
 *     &lt;enumeration value="Agency"/>
 *     &lt;enumeration value="Branch"/>
 *     &lt;enumeration value="BranchGroup"/>
 *     &lt;enumeration value="Agent"/>
 *     &lt;enumeration value="Account"/>
 *     &lt;enumeration value="TravelerGroup"/>
 *     &lt;enumeration value="Traveler"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum TypeProfileLevelWithSystem {

    @XmlEnumValue("Account")
    ACCOUNT("Account"),
    @XmlEnumValue("Agency")
    AGENCY("Agency"),
    @XmlEnumValue("Agent")
    AGENT("Agent"),
    @XmlEnumValue("Branch")
    BRANCH("Branch"),
    @XmlEnumValue("BranchGroup")
    BRANCH_GROUP("BranchGroup"),
    @XmlEnumValue("System")
    SYSTEM("System"),
    @XmlEnumValue("Traveler")
    TRAVELER("Traveler"),
    @XmlEnumValue("TravelerGroup")
    TRAVELER_GROUP("TravelerGroup");
    private final String value;

    TypeProfileLevelWithSystem(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeProfileLevelWithSystem fromValue(String v) {
        for (TypeProfileLevelWithSystem c: TypeProfileLevelWithSystem.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
