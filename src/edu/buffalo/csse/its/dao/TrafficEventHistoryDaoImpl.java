package edu.buffalo.csse.its.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import edu.buffalo.csse.its.data.TrafficEventHistory;

public class TrafficEventHistoryDaoImpl implements TrafficEventHistoryDao{

	private HibernateTemplate hibernateTemplate;

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	
	@Override
	public void saveTrafficEventHistory(TrafficEventHistory trafficEventHistory) {
		this.hibernateTemplate.saveOrUpdate(trafficEventHistory);
	}
	
	@Override
	public void saveTrafficEventHistory(List<TrafficEventHistory> trafficEventHistoryList) {
		this.hibernateTemplate.saveOrUpdateAll(trafficEventHistoryList);
	}

}
