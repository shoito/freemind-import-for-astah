package com.github.astah.mm2asta.model;

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
 *       &lt;attribute name="COLOR" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SOURCE" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DESTINATION" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ENDARROW" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ENDINCLINATION" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="STARTARROW" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="STARTINCLINATION" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "linktarget")
public class Linktarget {

    @XmlAttribute(name = "COLOR")
    protected String color;
    @XmlAttribute(name = "SOURCE", required = true)
    protected String source;
    @XmlAttribute(name = "DESTINATION", required = true)
    protected String destination;
    @XmlAttribute(name = "ENDARROW")
    protected String endarrow;
    @XmlAttribute(name = "ENDINCLINATION")
    protected String endinclination;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "STARTARROW")
    protected String startarrow;
    @XmlAttribute(name = "STARTINCLINATION")
    protected String startinclination;

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOLOR() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOLOR(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOURCE() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOURCE(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESTINATION() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESTINATION(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the endarrow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENDARROW() {
        return endarrow;
    }

    /**
     * Sets the value of the endarrow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENDARROW(String value) {
        this.endarrow = value;
    }

    /**
     * Gets the value of the endinclination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENDINCLINATION() {
        return endinclination;
    }

    /**
     * Sets the value of the endinclination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENDINCLINATION(String value) {
        this.endinclination = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the startarrow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTARTARROW() {
        return startarrow;
    }

    /**
     * Sets the value of the startarrow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTARTARROW(String value) {
        this.startarrow = value;
    }

    /**
     * Gets the value of the startinclination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTARTINCLINATION() {
        return startinclination;
    }

    /**
     * Sets the value of the startinclination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTARTINCLINATION(String value) {
        this.startinclination = value;
    }

}
