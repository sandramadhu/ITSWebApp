//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.13 at 03:17:24 AM EST 
//


package edu.buffalo.csse.its.xmlbinding.bcdeventhistory;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.buffalo.csse.its.xmlbinding.bcdeventhistory package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.buffalo.csse.its.xmlbinding.bcdeventhistory
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ROW }
     * 
     */
    public ROW createROW() {
        return new ROW();
    }

    /**
     * Create an instance of {@link DATAPACKET }
     * 
     */
    public DATAPACKET createDATAPACKET() {
        return new DATAPACKET();
    }

    /**
     * Create an instance of {@link FIELDS }
     * 
     */
    public FIELDS createFIELDS() {
        return new FIELDS();
    }

    /**
     * Create an instance of {@link ROWDATA }
     * 
     */
    public ROWDATA createROWDATA() {
        return new ROWDATA();
    }

    /**
     * Create an instance of {@link METADATA }
     * 
     */
    public METADATA createMETADATA() {
        return new METADATA();
    }

    /**
     * Create an instance of {@link FIELD }
     * 
     */
    public FIELD createFIELD() {
        return new FIELD();
    }

}
