package edu.buffalo.csse.its.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import edu.buffalo.csse.its.data.BcdEventHistory;

public class BcdEventHistoryDaoImpl implements BcdEventHistoryDao{

	private HibernateTemplate hibernateTemplate;

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	
	@Override
	public void saveBcdEventHistory(BcdEventHistory bcdEventHistory) {
		this.hibernateTemplate.saveOrUpdate(bcdEventHistory);
	}
	
	@Override
	public void saveBcdEventHistory(List<BcdEventHistory> bcdEventHistory) {
		this.hibernateTemplate.saveOrUpdateAll(bcdEventHistory);
	}

}
