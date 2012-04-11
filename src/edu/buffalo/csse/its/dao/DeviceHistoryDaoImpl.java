package edu.buffalo.csse.its.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import edu.buffalo.csse.its.data.DeviceHistory;

public class DeviceHistoryDaoImpl implements DeviceHistoryDao{

	private HibernateTemplate hibernateTemplate;

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	
	@Override
	public void saveDeviceHistory(DeviceHistory deviceHistory) {
		this.hibernateTemplate.saveOrUpdate(deviceHistory);
	}
	
	@Override
	public void saveDeviceHistory(List<DeviceHistory> deviceHistoryList) {
		this.hibernateTemplate.saveOrUpdateAll(deviceHistoryList);
	}

}
