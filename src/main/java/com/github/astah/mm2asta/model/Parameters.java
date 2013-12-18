package com.github.astah.mm2asta.model;

import java.math.BigInteger;
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
 *       &lt;attribute name="REMINDUSERAT" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ORIGINAL_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="XML_STORAGE_MAP_LAT" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="XML_STORAGE_MAP_LON" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="XML_STORAGE_MAP_TOOLTIP_LOCATION" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="XML_STORAGE_POS_LAT" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="XML_STORAGE_POS_LON" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="XML_STORAGE_TILE_SOURCE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="XML_STORAGE_ZOOM" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CLONE_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CLONE_IDS" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CLONE_ITSELF" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Parameters")
public class Parameters {

    @XmlAttribute(name = "REMINDUSERAT")
    protected BigInteger reminduserat;
    @XmlAttribute(name = "ORIGINAL_ID")
    protected String originalid;
    @XmlAttribute(name = "XML_STORAGE_MAP_LAT")
    protected String xmlstoragemaplat;
    @XmlAttribute(name = "XML_STORAGE_MAP_LON")
    protected String xmlstoragemaplon;
    @XmlAttribute(name = "XML_STORAGE_MAP_TOOLTIP_LOCATION")
    protected String xmlstoragemaptooltiplocation;
    @XmlAttribute(name = "XML_STORAGE_POS_LAT")
    protected String xmlstorageposlat;
    @XmlAttribute(name = "XML_STORAGE_POS_LON")
    protected String xmlstorageposlon;
    @XmlAttribute(name = "XML_STORAGE_TILE_SOURCE")
    protected String xmlstoragetilesource;
    @XmlAttribute(name = "XML_STORAGE_ZOOM")
    protected String xmlstoragezoom;
    @XmlAttribute(name = "CLONE_ID")
    protected String cloneid;
    @XmlAttribute(name = "CLONE_IDS")
    protected String cloneids;
    @XmlAttribute(name = "CLONE_ITSELF")
    protected String cloneitself;

    /**
     * Gets the value of the reminduserat property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getREMINDUSERAT() {
        return reminduserat;
    }

    /**
     * Sets the value of the reminduserat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setREMINDUSERAT(BigInteger value) {
        this.reminduserat = value;
    }

    /**
     * Gets the value of the originalid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORIGINALID() {
        return originalid;
    }

    /**
     * Sets the value of the originalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORIGINALID(String value) {
        this.originalid = value;
    }

    /**
     * Gets the value of the xmlstoragemaplat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLSTORAGEMAPLAT() {
        return xmlstoragemaplat;
    }

    /**
     * Sets the value of the xmlstoragemaplat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLSTORAGEMAPLAT(String value) {
        this.xmlstoragemaplat = value;
    }

    /**
     * Gets the value of the xmlstoragemaplon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLSTORAGEMAPLON() {
        return xmlstoragemaplon;
    }

    /**
     * Sets the value of the xmlstoragemaplon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLSTORAGEMAPLON(String value) {
        this.xmlstoragemaplon = value;
    }

    /**
     * Gets the value of the xmlstoragemaptooltiplocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLSTORAGEMAPTOOLTIPLOCATION() {
        return xmlstoragemaptooltiplocation;
    }

    /**
     * Sets the value of the xmlstoragemaptooltiplocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLSTORAGEMAPTOOLTIPLOCATION(String value) {
        this.xmlstoragemaptooltiplocation = value;
    }

    /**
     * Gets the value of the xmlstorageposlat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLSTORAGEPOSLAT() {
        return xmlstorageposlat;
    }

    /**
     * Sets the value of the xmlstorageposlat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLSTORAGEPOSLAT(String value) {
        this.xmlstorageposlat = value;
    }

    /**
     * Gets the value of the xmlstorageposlon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLSTORAGEPOSLON() {
        return xmlstorageposlon;
    }

    /**
     * Sets the value of the xmlstorageposlon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLSTORAGEPOSLON(String value) {
        this.xmlstorageposlon = value;
    }

    /**
     * Gets the value of the xmlstoragetilesource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLSTORAGETILESOURCE() {
        return xmlstoragetilesource;
    }

    /**
     * Sets the value of the xmlstoragetilesource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLSTORAGETILESOURCE(String value) {
        this.xmlstoragetilesource = value;
    }

    /**
     * Gets the value of the xmlstoragezoom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLSTORAGEZOOM() {
        return xmlstoragezoom;
    }

    /**
     * Sets the value of the xmlstoragezoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLSTORAGEZOOM(String value) {
        this.xmlstoragezoom = value;
    }

    /**
     * Gets the value of the cloneid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLONEID() {
        return cloneid;
    }

    /**
     * Sets the value of the cloneid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLONEID(String value) {
        this.cloneid = value;
    }

    /**
     * Gets the value of the cloneids property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLONEIDS() {
        return cloneids;
    }

    /**
     * Sets the value of the cloneids property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLONEIDS(String value) {
        this.cloneids = value;
    }

    /**
     * Gets the value of the cloneitself property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLONEITSELF() {
        return cloneitself;
    }

    /**
     * Sets the value of the cloneitself property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLONEITSELF(String value) {
        this.cloneitself = value;
    }

}
