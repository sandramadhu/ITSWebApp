package edu.buffalo.csse.its.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import edu.buffalo.csse.its.data.TravelRouteHistory;

public interface TravelRouteHistoryDao {

	public void setSessionFactory(SessionFactory sessionFactory);

	public void saveTrafficRouteHistory(TravelRouteHistory trafficRouteHistory);

	public void saveTrafficRouteHistory(List<TravelRouteHistory> trafficRouteHistoryList);

}
