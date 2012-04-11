package edu.buffalo.csse.its.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import edu.buffalo.csse.its.data.DeviceHistory;

public interface DeviceHistoryDao {

	public void setSessionFactory(SessionFactory sessionFactory);

	public void saveDeviceHistory(DeviceHistory deviceHistory);

	public void saveDeviceHistory(List<DeviceHistory> deviceHistory);

}
