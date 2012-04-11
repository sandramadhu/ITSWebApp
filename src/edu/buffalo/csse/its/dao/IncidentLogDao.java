package edu.buffalo.csse.its.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import edu.buffalo.csse.its.data.IncidentLog;

public interface IncidentLogDao {
	public List<IncidentLog> getIncidents();

	public void setSessionFactory(SessionFactory sessionFactory);

	public void saveIncident(IncidentLog incidentLog);

	public void saveIncidents(List<IncidentLog> incidentLogs);

	public List<IncidentLog> getIncidents(String linkId);

	public List<IncidentLog> getIncidents(List<String> linkIds, String stDate, String enDate, String stTime, String enTime, List<Integer> dowList);
}
