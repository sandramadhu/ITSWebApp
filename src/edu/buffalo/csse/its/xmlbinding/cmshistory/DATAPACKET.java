//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.13 at 03:19:35 AM EST 
//


package edu.buffalo.csse.its.xmlbinding.cmshistory;

import java.math.BigDecimal;
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
 *         &lt;element ref="{}METADATA"/>
 *         &lt;element ref="{}ROWDATA"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "metadata",
    "rowdata"
})
@XmlRootElement(name = "DATAPACKET")
public class DATAPACKET {

    @XmlElement(name = "METADATA", required = true)
    protected METADATA metadata;
    @XmlElement(name = "ROWDATA", required = true)
    protected ROWDATA rowdata;
    @XmlAttribute(name = "Version", required = true)
    protected BigDecimal version;

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link METADATA }
     *     
     */
    public METADATA getMETADATA() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link METADATA }
     *     
     */
    public void setMETADATA(METADATA value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the rowdata property.
     * 
     * @return
     *     possible object is
     *     {@link ROWDATA }
     *     
     */
    public ROWDATA getROWDATA() {
        return rowdata;
    }

    /**
     * Sets the value of the rowdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link ROWDATA }
     *     
     */
    public void setROWDATA(ROWDATA value) {
        this.rowdata = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

}
