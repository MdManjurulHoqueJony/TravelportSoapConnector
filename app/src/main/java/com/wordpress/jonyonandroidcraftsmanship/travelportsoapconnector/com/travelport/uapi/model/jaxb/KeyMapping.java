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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ElementName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NewKey" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OriginalKey" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "KeyMapping")
public class KeyMapping {

    @XmlAttribute(name = "ElementName", required = true)
    protected String elementName;
    @XmlAttribute(name = "NewKey", required = true)
    protected String newKey;
    @XmlAttribute(name = "OriginalKey", required = true)
    protected String originalKey;

    /**
     * Gets the value of the elementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementName() {
        return elementName;
    }

    /**
     * Sets the value of the elementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementName(String value) {
        this.elementName = value;
    }

    /**
     * Gets the value of the newKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewKey() {
        return newKey;
    }

    /**
     * Sets the value of the newKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewKey(String value) {
        this.newKey = value;
    }

    /**
     * Gets the value of the originalKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalKey() {
        return originalKey;
    }

    /**
     * Sets the value of the originalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalKey(String value) {
        this.originalKey = value;
    }

}
