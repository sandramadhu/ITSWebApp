//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.12 at 11:41:10 PM EST 
//


package edu.buffalo.csse.its.xmlbinding.incidentlog;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.buffalo.csse.its.xmlbinding.incidentlog package. 
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

    private final static QName _CallerX0020PhoneX0020X0023_QNAME = new QName("", "Caller_x0020_Phone_x0020__x0023_");
    private final static QName _CARSX0020ManX0020DeAct_QNAME = new QName("", "CARS_x0020_Man_x0020_DeAct");
    private final static QName _RetNTS_QNAME = new QName("", "RetNTS");
    private final static QName _CRFaxEmailX0020DeAct_QNAME = new QName("", "CRFaxEmail_x0020_DeAct");
    private final static QName _SceneArrTimeSpan_QNAME = new QName("", "SceneArrTimeSpan");
    private final static QName _LanBlcokClearTimeSpan_QNAME = new QName("", "LanBlcokClearTimeSpan");
    private final static QName _Operators_QNAME = new QName("", "Operators");
    private final static QName _WebsiteX0020DeletedX0020Incident_QNAME = new QName("", "Website_x0020_deleted_x0020_incident");
    private final static QName _Time_QNAME = new QName("", "time");
    private final static QName _TotalClearTime_QNAME = new QName("", "TotalClearTime");
    private final static QName _SceneArrTimeSpanMax_QNAME = new QName("", "SceneArrTimeSpanMax");
    private final static QName _SceneArrTimeSpanMod_QNAME = new QName("", "SceneArrTimeSpanMod");
    private final static QName _Date_QNAME = new QName("", "Date");
    private final static QName _CRDMSX0020DeAct_QNAME = new QName("", "CRDMS_x0020_DeAct");
    private final static QName _HARSlot_QNAME = new QName("", "HARSlot");
    private final static QName _ID_QNAME = new QName("", "ID");
    private final static QName _IncSeverityMaj_QNAME = new QName("", "IncSeverityMaj");
    private final static QName _IncSeverity_QNAME = new QName("", "IncSeverity");
    private final static QName _HAR_QNAME = new QName("", "HAR");
    private final static QName _SecondaryIncident_QNAME = new QName("", "SecondaryIncident");
    private final static QName _CRWebX0020DeAct_QNAME = new QName("", "CRWeb_x0020_DeAct");
    private final static QName _LaneBlocked_QNAME = new QName("", "LaneBlocked");
    private final static QName _PVMS_QNAME = new QName("", "PVMS");
    private final static QName _DetectMethod_QNAME = new QName("", "DetectMethod");
    private final static QName _LanBlockClearTime_QNAME = new QName("", "LanBlockClearTime");
    private final static QName _IncSeverityMod_QNAME = new QName("", "IncSeverityMod");
    private final static QName _LanBlcokClearTimeSpanMax_QNAME = new QName("", "LanBlcokClearTimeSpanMax");
    private final static QName _LockedID_QNAME = new QName("", "lockedID");
    private final static QName _LaneBCTS_QNAME = new QName("", "LaneBCTS");
    private final static QName _SceneATS_QNAME = new QName("", "SceneATS");
    private final static QName _DetectionTime_QNAME = new QName("", "DetectionTime");
    private final static QName _CARSX0020ManX0020Act_QNAME = new QName("", "CARS_x0020_Man_x0020_Act");
    private final static QName _Municipality_QNAME = new QName("", "Municipality");
    private final static QName _NumX0020LanesX0020Blocked_QNAME = new QName("", "Num_x0020_Lanes_x0020_Blocked");
    private final static QName _HICFSent_QNAME = new QName("", "HICFSent");
    private final static QName _VerifyTime_QNAME = new QName("", "VerifyTime");
    private final static QName _SceneDepartTime_QNAME = new QName("", "SceneDepartTime");
    private final static QName _RetNormTime_QNAME = new QName("", "RetNormTime");
    private final static QName _FullRoadClosure_QNAME = new QName("", "FullRoadClosure");
    private final static QName _RetNormTimeSpan_QNAME = new QName("", "RetNormTimeSpan");
    private final static QName _Skyway_QNAME = new QName("", "Skyway");
    private final static QName _ClosedTime_QNAME = new QName("", "ClosedTime");
    private final static QName _DMSX0020DeActX0020Time_QNAME = new QName("", "DMS_x0020_DeAct_x0020_Time");
    private final static QName _CallerX0020Name_QNAME = new QName("", "Caller_x0020_Name");
    private final static QName _PVMSX0020ActX0020Time_QNAME = new QName("", "PVMS_x0020_Act_x0020_Time");
    private final static QName _ExcludeFromRep_QNAME = new QName("", "ExcludeFromRep");
    private final static QName _CRDMSX0020Act_QNAME = new QName("", "CRDMS_x0020_Act");
    private final static QName _LogType_QNAME = new QName("", "LogType");
    private final static QName _CARSX0020Active_QNAME = new QName("", "CARS_x0020_active");
    private final static QName _CRWebX0020Act_QNAME = new QName("", "CRWeb_x0020_Act");
    private final static QName _Direction_QNAME = new QName("", "Direction");
    private final static QName _CRFaxEmailX0020Act_QNAME = new QName("", "CRFaxEmail_x0020_Act");
    private final static QName _TransAlertX0020Act_QNAME = new QName("", "TransAlert_x0020_Act");
    private final static QName _DMSX0020ActX0020Time_QNAME = new QName("", "DMS_x0020_Act_x0020_Time");
    private final static QName _WebsiteX0020AddedX0020Incident_QNAME = new QName("", "Website_x0020_added_x0020_incident");
    private final static QName _RetNormTimeSpanMod_QNAME = new QName("", "RetNormTimeSpanMod");
    private final static QName _TransAlertX0020DeAct_QNAME = new QName("", "TransAlert_x0020_DeAct");
    private final static QName _CARSX0020Deactive_QNAME = new QName("", "CARS_x0020_deactive");
    private final static QName _SceneArrTime_QNAME = new QName("", "SceneArrTime");
    private final static QName _CREventID_QNAME = new QName("", "CREventID");
    private final static QName _HICFFinalSent_QNAME = new QName("", "HICFFinalSent");
    private final static QName _OwningX0020Agency_QNAME = new QName("", "Owning_x0020_Agency");
    private final static QName _DMS_QNAME = new QName("", "DMS");
    private final static QName _ModTime_QNAME = new QName("", "ModTime");
    private final static QName _Closed_QNAME = new QName("", "Closed");
    private final static QName _ClearTime_QNAME = new QName("", "ClearTime");
    private final static QName _GenX0020Event_QNAME = new QName("", "Gen_x0020_Event");
    private final static QName _LanBlcokClearTimeSpanMod_QNAME = new QName("", "LanBlcokClearTimeSpanMod");
    private final static QName _CharmsEventNoAction_QNAME = new QName("", "CharmsEventNoAction");
    private final static QName _SecondaryIncidentLogNum_QNAME = new QName("", "SecondaryIncidentLogNum");
    private final static QName _TCWS_QNAME = new QName("", "TCWS");
    private final static QName _IDX0020Key_QNAME = new QName("", "ID_x0020_Key");
    private final static QName _OperatorsResponse_QNAME = new QName("", "OperatorsResponse");
    private final static QName _EventX0020Description_QNAME = new QName("", "Event_x0020_Description");
    private final static QName _CallerX0020Organization_QNAME = new QName("", "Caller_x0020_Organization");
    private final static QName _CrossX0020Street_QNAME = new QName("", "Cross_x0020_Street");
    private final static QName _PVMSX0020DeActX0020Time_QNAME = new QName("", "PVMS_x0020_DeAct_x0020_Time");
    private final static QName _DMSActiveList_QNAME = new QName("", "DMSActiveList");
    private final static QName _RouteX002FX0020Street_QNAME = new QName("", "Route_x002F__x0020_Street");
    private final static QName _RetNormTimeSpanMax_QNAME = new QName("", "RetNormTimeSpanMax");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.buffalo.csse.its.xmlbinding.incidentlog
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Dataroot }
     * 
     */
    public Dataroot createDataroot() {
        return new Dataroot();
    }

    /**
     * Create an instance of {@link IncidentX0020Log }
     * 
     */
    public IncidentX0020Log createIncidentX0020Log() {
        return new IncidentX0020Log();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Caller_x0020_Phone_x0020__x0023_")
    public JAXBElement<String> createCallerX0020PhoneX0020X0023(String value) {
        return new JAXBElement<String>(_CallerX0020PhoneX0020X0023_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CARS_x0020_Man_x0020_DeAct")
    public JAXBElement<BigInteger> createCARSX0020ManX0020DeAct(BigInteger value) {
        return new JAXBElement<BigInteger>(_CARSX0020ManX0020DeAct_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RetNTS")
    public JAXBElement<BigInteger> createRetNTS(BigInteger value) {
        return new JAXBElement<BigInteger>(_RetNTS_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CRFaxEmail_x0020_DeAct")
    public JAXBElement<BigInteger> createCRFaxEmailX0020DeAct(BigInteger value) {
        return new JAXBElement<BigInteger>(_CRFaxEmailX0020DeAct_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SceneArrTimeSpan")
    public JAXBElement<BigInteger> createSceneArrTimeSpan(BigInteger value) {
        return new JAXBElement<BigInteger>(_SceneArrTimeSpan_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LanBlcokClearTimeSpan")
    public JAXBElement<BigInteger> createLanBlcokClearTimeSpan(BigInteger value) {
        return new JAXBElement<BigInteger>(_LanBlcokClearTimeSpan_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Operators")
    public JAXBElement<String> createOperators(String value) {
        return new JAXBElement<String>(_Operators_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Website_x0020_deleted_x0020_incident")
    public JAXBElement<BigInteger> createWebsiteX0020DeletedX0020Incident(BigInteger value) {
        return new JAXBElement<BigInteger>(_WebsiteX0020DeletedX0020Incident_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "time")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTime(String value) {
        return new JAXBElement<String>(_Time_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalClearTime")
    public JAXBElement<BigInteger> createTotalClearTime(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalClearTime_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SceneArrTimeSpanMax")
    public JAXBElement<BigInteger> createSceneArrTimeSpanMax(BigInteger value) {
        return new JAXBElement<BigInteger>(_SceneArrTimeSpanMax_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SceneArrTimeSpanMod")
    public JAXBElement<BigInteger> createSceneArrTimeSpanMod(BigInteger value) {
        return new JAXBElement<BigInteger>(_SceneArrTimeSpanMod_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Date")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDate(String value) {
        return new JAXBElement<String>(_Date_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CRDMS_x0020_DeAct")
    public JAXBElement<BigInteger> createCRDMSX0020DeAct(BigInteger value) {
        return new JAXBElement<BigInteger>(_CRDMSX0020DeAct_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HARSlot")
    public JAXBElement<BigInteger> createHARSlot(BigInteger value) {
        return new JAXBElement<BigInteger>(_HARSlot_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ID")
    public JAXBElement<BigInteger> createID(BigInteger value) {
        return new JAXBElement<BigInteger>(_ID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IncSeverityMaj")
    public JAXBElement<BigInteger> createIncSeverityMaj(BigInteger value) {
        return new JAXBElement<BigInteger>(_IncSeverityMaj_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IncSeverity")
    public JAXBElement<BigInteger> createIncSeverity(BigInteger value) {
        return new JAXBElement<BigInteger>(_IncSeverity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HAR")
    public JAXBElement<BigInteger> createHAR(BigInteger value) {
        return new JAXBElement<BigInteger>(_HAR_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SecondaryIncident")
    public JAXBElement<BigInteger> createSecondaryIncident(BigInteger value) {
        return new JAXBElement<BigInteger>(_SecondaryIncident_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CRWeb_x0020_DeAct")
    public JAXBElement<BigInteger> createCRWebX0020DeAct(BigInteger value) {
        return new JAXBElement<BigInteger>(_CRWebX0020DeAct_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LaneBlocked")
    public JAXBElement<BigInteger> createLaneBlocked(BigInteger value) {
        return new JAXBElement<BigInteger>(_LaneBlocked_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PVMS")
    public JAXBElement<BigInteger> createPVMS(BigInteger value) {
        return new JAXBElement<BigInteger>(_PVMS_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DetectMethod")
    public JAXBElement<String> createDetectMethod(String value) {
        return new JAXBElement<String>(_DetectMethod_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LanBlockClearTime")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLanBlockClearTime(String value) {
        return new JAXBElement<String>(_LanBlockClearTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IncSeverityMod")
    public JAXBElement<BigInteger> createIncSeverityMod(BigInteger value) {
        return new JAXBElement<BigInteger>(_IncSeverityMod_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LanBlcokClearTimeSpanMax")
    public JAXBElement<BigInteger> createLanBlcokClearTimeSpanMax(BigInteger value) {
        return new JAXBElement<BigInteger>(_LanBlcokClearTimeSpanMax_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lockedID")
    public JAXBElement<BigInteger> createLockedID(BigInteger value) {
        return new JAXBElement<BigInteger>(_LockedID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LaneBCTS")
    public JAXBElement<BigInteger> createLaneBCTS(BigInteger value) {
        return new JAXBElement<BigInteger>(_LaneBCTS_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SceneATS")
    public JAXBElement<BigInteger> createSceneATS(BigInteger value) {
        return new JAXBElement<BigInteger>(_SceneATS_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DetectionTime")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDetectionTime(String value) {
        return new JAXBElement<String>(_DetectionTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CARS_x0020_Man_x0020_Act")
    public JAXBElement<BigInteger> createCARSX0020ManX0020Act(BigInteger value) {
        return new JAXBElement<BigInteger>(_CARSX0020ManX0020Act_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Municipality")
    public JAXBElement<String> createMunicipality(String value) {
        return new JAXBElement<String>(_Municipality_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Num_x0020_Lanes_x0020_Blocked")
    public JAXBElement<BigInteger> createNumX0020LanesX0020Blocked(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumX0020LanesX0020Blocked_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HICFSent")
    public JAXBElement<BigInteger> createHICFSent(BigInteger value) {
        return new JAXBElement<BigInteger>(_HICFSent_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VerifyTime")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVerifyTime(String value) {
        return new JAXBElement<String>(_VerifyTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SceneDepartTime")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSceneDepartTime(String value) {
        return new JAXBElement<String>(_SceneDepartTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RetNormTime")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRetNormTime(String value) {
        return new JAXBElement<String>(_RetNormTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FullRoadClosure")
    public JAXBElement<BigInteger> createFullRoadClosure(BigInteger value) {
        return new JAXBElement<BigInteger>(_FullRoadClosure_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RetNormTimeSpan")
    public JAXBElement<BigInteger> createRetNormTimeSpan(BigInteger value) {
        return new JAXBElement<BigInteger>(_RetNormTimeSpan_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Skyway")
    public JAXBElement<BigInteger> createSkyway(BigInteger value) {
        return new JAXBElement<BigInteger>(_Skyway_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ClosedTime")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createClosedTime(String value) {
        return new JAXBElement<String>(_ClosedTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DMS_x0020_DeAct_x0020_Time")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDMSX0020DeActX0020Time(String value) {
        return new JAXBElement<String>(_DMSX0020DeActX0020Time_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Caller_x0020_Name")
    public JAXBElement<String> createCallerX0020Name(String value) {
        return new JAXBElement<String>(_CallerX0020Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PVMS_x0020_Act_x0020_Time")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPVMSX0020ActX0020Time(String value) {
        return new JAXBElement<String>(_PVMSX0020ActX0020Time_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ExcludeFromRep")
    public JAXBElement<BigInteger> createExcludeFromRep(BigInteger value) {
        return new JAXBElement<BigInteger>(_ExcludeFromRep_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CRDMS_x0020_Act")
    public JAXBElement<BigInteger> createCRDMSX0020Act(BigInteger value) {
        return new JAXBElement<BigInteger>(_CRDMSX0020Act_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LogType")
    public JAXBElement<BigInteger> createLogType(BigInteger value) {
        return new JAXBElement<BigInteger>(_LogType_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CARS_x0020_active")
    public JAXBElement<BigInteger> createCARSX0020Active(BigInteger value) {
        return new JAXBElement<BigInteger>(_CARSX0020Active_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CRWeb_x0020_Act")
    public JAXBElement<BigInteger> createCRWebX0020Act(BigInteger value) {
        return new JAXBElement<BigInteger>(_CRWebX0020Act_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Direction")
    public JAXBElement<String> createDirection(String value) {
        return new JAXBElement<String>(_Direction_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CRFaxEmail_x0020_Act")
    public JAXBElement<BigInteger> createCRFaxEmailX0020Act(BigInteger value) {
        return new JAXBElement<BigInteger>(_CRFaxEmailX0020Act_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TransAlert_x0020_Act")
    public JAXBElement<BigInteger> createTransAlertX0020Act(BigInteger value) {
        return new JAXBElement<BigInteger>(_TransAlertX0020Act_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DMS_x0020_Act_x0020_Time")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDMSX0020ActX0020Time(String value) {
        return new JAXBElement<String>(_DMSX0020ActX0020Time_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Website_x0020_added_x0020_incident")
    public JAXBElement<BigInteger> createWebsiteX0020AddedX0020Incident(BigInteger value) {
        return new JAXBElement<BigInteger>(_WebsiteX0020AddedX0020Incident_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RetNormTimeSpanMod")
    public JAXBElement<BigInteger> createRetNormTimeSpanMod(BigInteger value) {
        return new JAXBElement<BigInteger>(_RetNormTimeSpanMod_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TransAlert_x0020_DeAct")
    public JAXBElement<BigInteger> createTransAlertX0020DeAct(BigInteger value) {
        return new JAXBElement<BigInteger>(_TransAlertX0020DeAct_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CARS_x0020_deactive")
    public JAXBElement<BigInteger> createCARSX0020Deactive(BigInteger value) {
        return new JAXBElement<BigInteger>(_CARSX0020Deactive_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SceneArrTime")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSceneArrTime(String value) {
        return new JAXBElement<String>(_SceneArrTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CREventID")
    public JAXBElement<String> createCREventID(String value) {
        return new JAXBElement<String>(_CREventID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HICFFinalSent")
    public JAXBElement<BigInteger> createHICFFinalSent(BigInteger value) {
        return new JAXBElement<BigInteger>(_HICFFinalSent_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Owning_x0020_Agency")
    public JAXBElement<String> createOwningX0020Agency(String value) {
        return new JAXBElement<String>(_OwningX0020Agency_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DMS")
    public JAXBElement<BigInteger> createDMS(BigInteger value) {
        return new JAXBElement<BigInteger>(_DMS_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ModTime")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createModTime(String value) {
        return new JAXBElement<String>(_ModTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Closed")
    public JAXBElement<BigInteger> createClosed(BigInteger value) {
        return new JAXBElement<BigInteger>(_Closed_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ClearTime")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createClearTime(String value) {
        return new JAXBElement<String>(_ClearTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Gen_x0020_Event")
    public JAXBElement<String> createGenX0020Event(String value) {
        return new JAXBElement<String>(_GenX0020Event_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LanBlcokClearTimeSpanMod")
    public JAXBElement<BigInteger> createLanBlcokClearTimeSpanMod(BigInteger value) {
        return new JAXBElement<BigInteger>(_LanBlcokClearTimeSpanMod_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CharmsEventNoAction")
    public JAXBElement<BigInteger> createCharmsEventNoAction(BigInteger value) {
        return new JAXBElement<BigInteger>(_CharmsEventNoAction_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SecondaryIncidentLogNum")
    public JAXBElement<BigInteger> createSecondaryIncidentLogNum(BigInteger value) {
        return new JAXBElement<BigInteger>(_SecondaryIncidentLogNum_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TCWS")
    public JAXBElement<BigInteger> createTCWS(BigInteger value) {
        return new JAXBElement<BigInteger>(_TCWS_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ID_x0020_Key")
    public JAXBElement<BigInteger> createIDX0020Key(BigInteger value) {
        return new JAXBElement<BigInteger>(_IDX0020Key_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OperatorsResponse")
    public JAXBElement<String> createOperatorsResponse(String value) {
        return new JAXBElement<String>(_OperatorsResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Event_x0020_Description")
    public JAXBElement<String> createEventX0020Description(String value) {
        return new JAXBElement<String>(_EventX0020Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Caller_x0020_Organization")
    public JAXBElement<String> createCallerX0020Organization(String value) {
        return new JAXBElement<String>(_CallerX0020Organization_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Cross_x0020_Street")
    public JAXBElement<String> createCrossX0020Street(String value) {
        return new JAXBElement<String>(_CrossX0020Street_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PVMS_x0020_DeAct_x0020_Time")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPVMSX0020DeActX0020Time(String value) {
        return new JAXBElement<String>(_PVMSX0020DeActX0020Time_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DMSActiveList")
    public JAXBElement<String> createDMSActiveList(String value) {
        return new JAXBElement<String>(_DMSActiveList_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Route_x002F__x0020_Street")
    public JAXBElement<String> createRouteX002FX0020Street(String value) {
        return new JAXBElement<String>(_RouteX002FX0020Street_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RetNormTimeSpanMax")
    public JAXBElement<BigInteger> createRetNormTimeSpanMax(BigInteger value) {
        return new JAXBElement<BigInteger>(_RetNormTimeSpanMax_QNAME, BigInteger.class, null, value);
    }

}
