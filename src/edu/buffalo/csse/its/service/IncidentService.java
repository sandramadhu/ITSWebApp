package edu.buffalo.csse.its.service;

import java.io.File;
import java.util.List;

import edu.buffalo.csse.its.data.IncidentLog;

public interface IncidentService {

	public List<IncidentLog> getIncidents(String linkId);
	
	public boolean processData(File file);

}
