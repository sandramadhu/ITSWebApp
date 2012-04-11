package edu.buffalo.csse.its.util;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.XMLEvent;

public class XMLUtils
{
   public static void printEventType(int eventType)
   {
      System.out.println("EVENT TYPE(" + eventType + ") = " + getEventTypeString(eventType));
   }

   public static void printStartDocument(XMLStreamReader xmlr)
   {
      if (XMLStreamConstants.START_DOCUMENT == xmlr.getEventType())
      {
         System.out.println("<?xml version=\"" + xmlr.getVersion() + "\"" + " encoding=\"" + xmlr.getCharacterEncodingScheme() + "\""
               + "?>");
      }
   }

   public static void printComment(XMLStreamReader xmlr)
   {
      if (xmlr.getEventType() == XMLStreamConstants.COMMENT)
      {
         System.out.print("<!--" + xmlr.getText() + "-->");
      }
   }

   public static void printText(XMLStreamReader xmlr)
   {
      if (xmlr.hasText())
      {
         System.out.print(xmlr.getText());
      }
   }

   public static void printPIData(XMLStreamReader xmlr)
   {
      if (xmlr.getEventType() == XMLEvent.PROCESSING_INSTRUCTION)
      {
         System.out.print("<?" + xmlr.getPITarget() + " " + xmlr.getPIData() + "?>");
      }
   }

   public static void printStartElement(XMLStreamReader xmlr)
   {
      if (xmlr.isStartElement())
      {
         System.out.print("<" + xmlr.getName().toString());
         printAttributes(xmlr);
         // System.out.print(</codeTitle><cnTitle></cnTitle><codeKeywords></codeKeywords><codeComments></codeComments>");
      }
   }

   public static void printEndElement(XMLStreamReader xmlr)
   {
      if (xmlr.isEndElement())
      {
         // System.out.print("</" + xmlr.getName().toString() +
         // </codeTitle><cnTitle></cnTitle><codeKeywords></codeKeywords><codeComments></codeComments>");
      }
   }

   public static void printAttributes(XMLStreamReader xmlr)
   {
      int count = xmlr.getAttributeCount();

      if (count > 0)
      {
         for (int i = 0; i < count; i++)
         {
            System.out.print(" ");
            System.out.print(xmlr.getAttributeName(i).toString());
            System.out.print("=");
            System.out.print("\"");
            System.out.print(xmlr.getAttributeValue(i));
            System.out.print("\"");
         }
      }

      count = xmlr.getNamespaceCount();

      if (count > 0)
      {
         for (int i = 0; i < count; i++)
         {
            System.out.print(" ");
            System.out.print("xmlns");

            if (xmlr.getNamespacePrefix(i) != null)
            {
               System.out.print(":" + xmlr.getNamespacePrefix(i));
            }

            System.out.print("=");
            System.out.print("\"");
            System.out.print(xmlr.getNamespaceURI(i));
            System.out.print("\"");
         }
      }
   }

   public static final String getEventTypeString(int eventType)
   {
      switch (eventType) {
      case XMLEvent.START_ELEMENT:
         return "START_ELEMENT";

      case XMLEvent.END_ELEMENT:
         return "END_ELEMENT";

      case XMLEvent.PROCESSING_INSTRUCTION:
         return "PROCESSING_INSTRUCTION";

      case XMLEvent.CHARACTERS:
         return "CHARACTERS";

      case XMLEvent.COMMENT:
         return "COMMENT";

      case XMLEvent.START_DOCUMENT:
         return "START_DOCUMENT";

      case XMLEvent.END_DOCUMENT:
         return "END_DOCUMENT";

      case XMLEvent.ENTITY_REFERENCE:
         return "ENTITY_REFERENCE";

      case XMLEvent.ATTRIBUTE:
         return "ATTRIBUTE";

      case XMLEvent.DTD:
         return "DTD";

      case XMLEvent.CDATA:
         return "CDATA";

      case XMLEvent.SPACE:
         return "SPACE";
      }

      return "UNKNOWN_EVENT_TYPE , " + eventType;
   }

}
