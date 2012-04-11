package edu.buffalo.csse.its.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import edu.buffalo.csse.its.data.TrafficEventHistory;

public interface TrafficEventHistoryDao {

	public void setSessionFactory(SessionFactory sessionFactory);

	public void saveTrafficEventHistory(TrafficEventHistory trafficEventHistory);

	public void saveTrafficEventHistory(List<TrafficEventHistory> trafficEventHistory);

}
