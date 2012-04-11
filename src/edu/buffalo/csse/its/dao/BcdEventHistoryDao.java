package edu.buffalo.csse.its.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import edu.buffalo.csse.its.data.BcdEventHistory;

public interface BcdEventHistoryDao {

	public void setSessionFactory(SessionFactory sessionFactory);

	public void saveBcdEventHistory(BcdEventHistory bcdEventHistory);

	public void saveBcdEventHistory(List<BcdEventHistory> bcdEventHistory);

}
