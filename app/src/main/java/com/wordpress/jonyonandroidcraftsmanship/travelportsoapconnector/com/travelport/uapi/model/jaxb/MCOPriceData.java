//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.1-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.13 at 11:27:55 AM MDT 
//


package com.wordpress.jonyonandroidcraftsmanship.travelportsoapconnector.com.travelport.uapi.model.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element name="TaxInfo" type="{http://www.travelport.com/schema/common_v28_0}typeTaxInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Commission" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.travelport.com/schema/common_v28_0}attrAmountPercent"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="MCOAmount" use="required" type="{http://www.travelport.com/schema/common_v28_0}typeMoney" />
 *       &lt;attribute name="MCOEquivalentFare" type="{http://www.travelport.com/schema/common_v28_0}typeMoney" />
 *       &lt;attribute name="MCOTotalAmount" type="{http://www.travelport.com/schema/common_v28_0}typeMoney" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "taxInfo",
    "commission"
})
@XmlRootElement(name = "MCOPriceData")
public class MCOPriceData {

    @XmlElement(name = "TaxInfo", required = true)
    protected List<TypeTaxInfo> taxInfo;
    @XmlElement(name = "Commission")
    protected MCOPriceData.Commission commission;
    @XmlAttribute(name = "MCOAmount", required = true)
    protected String mcoAmount;
    @XmlAttribute(name = "MCOEquivalentFare")
    protected String mcoEquivalentFare;
    @XmlAttribute(name = "MCOTotalAmount")
    protected String mcoTotalAmount;

    /**
     * Gets the value of the taxInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTaxInfo }
     * 
     * 
     */
    public List<TypeTaxInfo> getTaxInfo() {
        if (taxInfo == null) {
            taxInfo = new ArrayList<TypeTaxInfo>();
        }
        return this.taxInfo;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link Commission }
     *     
     */
    public Commission getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commission }
     *     
     */
    public void setCommission(Commission value) {
        this.commission = value;
    }

    /**
     * Gets the value of the mcoAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCOAmount() {
        return mcoAmount;
    }

    /**
     * Sets the value of the mcoAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCOAmount(String value) {
        this.mcoAmount = value;
    }

    /**
     * Gets the value of the mcoEquivalentFare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCOEquivalentFare() {
        return mcoEquivalentFare;
    }

    /**
     * Sets the value of the mcoEquivalentFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCOEquivalentFare(String value) {
        this.mcoEquivalentFare = value;
    }

    /**
     * Gets the value of the mcoTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCOTotalAmount() {
        return mcoTotalAmount;
    }

    /**
     * Sets the value of the mcoTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCOTotalAmount(String value) {
        this.mcoTotalAmount = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v28_0}attrAmountPercent"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Commission {

        @XmlAttribute(name = "Amount")
        protected String amount;
        @XmlAttribute(name = "Percentage")
        protected String percentage;

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAmount(String value) {
            this.amount = value;
        }

        /**
         * Gets the value of the percentage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPercentage() {
            return percentage;
        }

        /**
         * Sets the value of the percentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPercentage(String value) {
            this.percentage = value;
        }

    }

}
