package edu.buffalo.csse.its.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import edu.buffalo.csse.its.data.ExternalAgencyHistory;

public class ExternalAgencyHistoryDaoImpl implements ExternalAgencyHistoryDao{

	private HibernateTemplate hibernateTemplate;

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	
	@Override
	public void saveExternalAgencyHistory(ExternalAgencyHistory externalAgencyHistory) {
		this.hibernateTemplate.saveOrUpdate(externalAgencyHistory);
	}
	
	@Override
	public void saveExternalAgencyHistory(List<ExternalAgencyHistory> externalAgencyHistory) {
		this.hibernateTemplate.saveOrUpdateAll(externalAgencyHistory);
	}

}
