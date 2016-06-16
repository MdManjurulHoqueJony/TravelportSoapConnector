//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.1-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.13 at 11:27:55 AM MDT 
//


package com.wordpress.jonyonandroidcraftsmanship.travelportsoapconnector.com.travelport.uapi.model.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeTransactionsAllowed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeTransactionsAllowed">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v28_0}typeBookingTransactionsAllowed">
 *       &lt;attribute name="PricingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ShoppingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeTransactionsAllowed")
public class TypeTransactionsAllowed
    extends TypeBookingTransactionsAllowed
{

    @XmlAttribute(name = "PricingEnabled")
    protected Boolean pricingEnabled;
    @XmlAttribute(name = "ShoppingEnabled")
    protected Boolean shoppingEnabled;

    /**
     * Gets the value of the pricingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPricingEnabled() {
        return pricingEnabled;
    }

    /**
     * Sets the value of the pricingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPricingEnabled(Boolean value) {
        this.pricingEnabled = value;
    }

    /**
     * Gets the value of the shoppingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShoppingEnabled() {
        return shoppingEnabled;
    }

    /**
     * Sets the value of the shoppingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShoppingEnabled(Boolean value) {
        this.shoppingEnabled = value;
    }

}