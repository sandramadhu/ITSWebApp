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

import edu.buffalo.csse.its.xmlbinding.incidentlog.Dataroot;
import edu.buffalo.csse.its.xmlbinding.incidentlog.IncidentX0020Log;

public class IncidentLogLoad {

	private File file;
	private Dataroot dataroot;
	private Unmarshaller unmarshaller;
	private JAXBContext jaxbContext;

	public IncidentLogLoad(File file) throws JAXBException {
		this.jaxbContext = JAXBContext.newInstance("edu.buffalo.csse.its.xmlbinding.incidentlog");
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
			List<IncidentX0020Log> incidents = null;

			int incidentsNo = 0;
			while (xmlfer.peek() != null) {
				Object o = unmarshaller.unmarshal(xmler);
				if (o instanceof Dataroot) {
					Dataroot dataroot = (Dataroot) o;
					this.dataroot = dataroot;
					incidents = dataroot.getIncidentX0020Log();
					incidentsNo = incidents.size();
				}
			}
			System.out.println("No. of incidents: " + incidentsNo);
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

	public Dataroot getDataroot() {
		return dataroot;
	}

	public void setDataroot(Dataroot dataroot) {
		this.dataroot = dataroot;
	}

}
