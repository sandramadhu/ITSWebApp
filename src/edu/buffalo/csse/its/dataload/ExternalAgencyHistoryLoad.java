package edu.buffalo.csse.its.dataload;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.EventFilter;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;

import edu.buffalo.csse.its.util.ITSConstants;
import edu.buffalo.csse.its.xmlbinding.externalagencyhistory.DATAPACKET;
import edu.buffalo.csse.its.xmlbinding.externalagencyhistory.ROW;
import edu.buffalo.csse.its.xmlbinding.externalagencyhistory.ROWDATA;


public class ExternalAgencyHistoryLoad {

	private File file;
	private ROWDATA rowdata;
	private Unmarshaller unmarshaller;
	private JAXBContext jaxbContext;

	public ExternalAgencyHistoryLoad(File file) throws JAXBException {
		this.jaxbContext = JAXBContext.newInstance(ITSConstants.PKG_EXTERNAL_AGENCY_HISTORY);
        this.unmarshaller = jaxbContext.createUnmarshaller();
        this.file = file;
	}

	public void loadXML() throws IOException, XMLStreamException,
			FileNotFoundException {
		try {
			XMLInputFactory xmlif = XMLInputFactory.newInstance();
			FileReader fr = new FileReader(file);
			XMLEventReader xmler = xmlif.createXMLEventReader(fr);

			EventFilter filter = new EventFilter() {
				public boolean accept(XMLEvent event) {
					return event.isStartElement();
				}
			};
			XMLEventReader xmlfer = xmlif.createFilteredReader(xmler, filter);
			List<ROW> rows = null;

			int num = 0;
			while (xmlfer.peek() != null) {
				Object o = unmarshaller.unmarshal(xmler);
				if (o instanceof DATAPACKET) {
					DATAPACKET dp = (DATAPACKET) o;
					this.rowdata = dp.getROWDATA();
					rows = rowdata.getROW();
					num = rows.size();
				}
			}
			System.out.println("No. of external agency history events: " + num);
			fr.close();

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public ROWDATA getRowdata() {
		return rowdata;
	}

	public void setRowdata(ROWDATA rowdata) {
		this.rowdata = rowdata;
	}

}
