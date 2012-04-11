package edu.buffalo.csse.its.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import edu.buffalo.csse.its.data.CmsHistory;

public class CmsHistoryDaoImpl implements CmsHistoryDao{

	private HibernateTemplate hibernateTemplate;

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	
	@Override
	public void saveCmsHistory(CmsHistory cmsHistory) {
		this.hibernateTemplate.saveOrUpdate(cmsHistory);
	}
	
	@Override
	public void saveCmsHistory(List<CmsHistory> cmsHistory) {
		this.hibernateTemplate.saveOrUpdateAll(cmsHistory);
	}

}
