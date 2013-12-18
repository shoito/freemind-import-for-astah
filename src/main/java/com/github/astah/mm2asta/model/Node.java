package com.github.astah.mm2asta.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}arrowlink"/>
 *         &lt;element ref="{}attribute"/>
 *         &lt;element ref="{}attribute_layout"/>
 *         &lt;element ref="{}linktarget"/>
 *         &lt;element ref="{}cloud"/>
 *         &lt;element ref="{}edge"/>
 *         &lt;element ref="{}font"/>
 *         &lt;element ref="{}hook"/>
 *         &lt;element ref="{}icon"/>
 *         &lt;element ref="{}node"/>
 *         &lt;element ref="{}richcontent"/>
 *       &lt;/choice>
 *       &lt;attribute name="BACKGROUND_COLOR" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="COLOR" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FOLDED">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="LINK" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="POSITION">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="left"/>
 *             &lt;enumeration value="right"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="STYLE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TEXT" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CREATED" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="MODIFIED" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="HGAP" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="VGAP" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="VSHIFT" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ENCRYPTED_CONTENT" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "arrowlinkOrAttributeOrAttributeLayout"
})
@XmlRootElement(name = "node")
public class Node {

    @XmlElements({
        @XmlElement(name = "arrowlink", type = Arrowlink.class),
        @XmlElement(name = "attribute", type = Attribute.class),
        @XmlElement(name = "attribute_layout", type = AttributeLayout.class),
        @XmlElement(name = "linktarget", type = Linktarget.class),
        @XmlElement(name = "cloud", type = Cloud.class),
        @XmlElement(name = "edge", type = Edge.class),
        @XmlElement(name = "font", type = Font.class),
        @XmlElement(name = "hook", type = Hook.class),
        @XmlElement(name = "icon", type = Icon.class),
        @XmlElement(name = "node", type = Node.class),
        @XmlElement(name = "richcontent", type = Richcontent.class)
    })
    protected List<Object> arrowlinkOrAttributeOrAttributeLayout;
    @XmlAttribute(name = "BACKGROUND_COLOR")
    protected String backgroundcolor;
    @XmlAttribute(name = "COLOR")
    protected String color;
    @XmlAttribute(name = "FOLDED")
    protected String folded;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "LINK")
    protected String link;
    @XmlAttribute(name = "POSITION")
    protected String position;
    @XmlAttribute(name = "STYLE")
    protected String style;
    @XmlAttribute(name = "TEXT")
    protected String text;
    @XmlAttribute(name = "CREATED")
    protected BigInteger created;
    @XmlAttribute(name = "MODIFIED")
    protected BigInteger modified;
    @XmlAttribute(name = "HGAP")
    protected BigInteger hgap;
    @XmlAttribute(name = "VGAP")
    protected BigInteger vgap;
    @XmlAttribute(name = "VSHIFT")
    protected BigInteger vshift;
    @XmlAttribute(name = "ENCRYPTED_CONTENT")
    protected String encryptedcontent;

    /**
     * Gets the value of the arrowlinkOrAttributeOrAttributeLayout property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrowlinkOrAttributeOrAttributeLayout property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrowlinkOrAttributeOrAttributeLayout().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Arrowlink }
     * {@link Attribute }
     * {@link AttributeLayout }
     * {@link Linktarget }
     * {@link Cloud }
     * {@link Edge }
     * {@link Font }
     * {@link Hook }
     * {@link Icon }
     * {@link Node }
     * {@link Richcontent }
     * 
     * 
     */
    public List<Object> getArrowlinkOrAttributeOrAttributeLayout() {
        if (arrowlinkOrAttributeOrAttributeLayout == null) {
            arrowlinkOrAttributeOrAttributeLayout = new ArrayList<Object>();
        }
        return this.arrowlinkOrAttributeOrAttributeLayout;
    }

    /**
     * Gets the value of the backgroundcolor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACKGROUNDCOLOR() {
        return backgroundcolor;
    }

    /**
     * Sets the value of the backgroundcolor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACKGROUNDCOLOR(String value) {
        this.backgroundcolor = value;
    }

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
     * Gets the value of the folded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOLDED() {
        return folded;
    }

    /**
     * Sets the value of the folded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOLDED(String value) {
        this.folded = value;
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
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINK() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINK(String value) {
        this.link = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSITION() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSITION(String value) {
        this.position = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTYLE() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTYLE(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEXT() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEXT(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCREATED() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCREATED(BigInteger value) {
        this.created = value;
    }

    /**
     * Gets the value of the modified property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMODIFIED() {
        return modified;
    }

    /**
     * Sets the value of the modified property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMODIFIED(BigInteger value) {
        this.modified = value;
    }

    /**
     * Gets the value of the hgap property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHGAP() {
        return hgap;
    }

    /**
     * Sets the value of the hgap property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHGAP(BigInteger value) {
        this.hgap = value;
    }

    /**
     * Gets the value of the vgap property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVGAP() {
        return vgap;
    }

    /**
     * Sets the value of the vgap property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVGAP(BigInteger value) {
        this.vgap = value;
    }

    /**
     * Gets the value of the vshift property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVSHIFT() {
        return vshift;
    }

    /**
     * Sets the value of the vshift property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVSHIFT(BigInteger value) {
        this.vshift = value;
    }

    /**
     * Gets the value of the encryptedcontent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENCRYPTEDCONTENT() {
        return encryptedcontent;
    }

    /**
     * Sets the value of the encryptedcontent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENCRYPTEDCONTENT(String value) {
        this.encryptedcontent = value;
    }

}
