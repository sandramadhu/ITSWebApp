package edu.buffalo.csse.its.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import edu.buffalo.csse.its.data.CmsHistory;

public interface CmsHistoryDao {

	public void setSessionFactory(SessionFactory sessionFactory);

	public void saveCmsHistory(CmsHistory cmsHistory);

	public void saveCmsHistory(List<CmsHistory> cmsHistory);

}
