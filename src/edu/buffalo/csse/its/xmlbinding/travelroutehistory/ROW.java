//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.13 at 03:28:34 AM EST 
//


package edu.buffalo.csse.its.xmlbinding.travelroutehistory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="OPERATOR_MODE" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="ROUTENAME" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TRAVEL_TIME" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="UPDATETIME" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ROW")
public class ROW {

    @XmlAttribute(name = "OPERATOR_MODE", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String operatormode;
    @XmlAttribute(name = "ROUTENAME", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String routename;
    @XmlAttribute(name = "TRAVEL_TIME", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String traveltime;
    @XmlAttribute(name = "UPDATETIME", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String updatetime;

    /**
     * Gets the value of the operatormode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPERATORMODE() {
        return operatormode;
    }

    /**
     * Sets the value of the operatormode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPERATORMODE(String value) {
        this.operatormode = value;
    }

    /**
     * Gets the value of the routename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROUTENAME() {
        return routename;
    }

    /**
     * Sets the value of the routename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROUTENAME(String value) {
        this.routename = value;
    }

    /**
     * Gets the value of the traveltime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRAVELTIME() {
        return traveltime;
    }

    /**
     * Sets the value of the traveltime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRAVELTIME(String value) {
        this.traveltime = value;
    }

    /**
     * Gets the value of the updatetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPDATETIME() {
        return updatetime;
    }

    /**
     * Sets the value of the updatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPDATETIME(String value) {
        this.updatetime = value;
    }

}
