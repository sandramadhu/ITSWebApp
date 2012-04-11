package edu.buffalo.csse.its.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import edu.buffalo.csse.its.data.TravelRouteHistory;

public class TravelRouteHistoryDaoImpl implements TravelRouteHistoryDao{

	private HibernateTemplate hibernateTemplate;

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	
	@Override
	public void saveTrafficRouteHistory(TravelRouteHistory trafficRouteHistory) {
		this.hibernateTemplate.saveOrUpdate(trafficRouteHistory);
	}
	
	@Override
	public void saveTrafficRouteHistory(List<TravelRouteHistory> trafficRouteHistoryList) {
		this.hibernateTemplate.saveOrUpdateAll(trafficRouteHistoryList);
	}

}
