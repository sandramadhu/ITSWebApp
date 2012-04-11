package edu.buffalo.csse.its.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import edu.buffalo.csse.its.data.ExternalAgencyHistory;

public interface ExternalAgencyHistoryDao {

	public void setSessionFactory(SessionFactory sessionFactory);

	public void saveExternalAgencyHistory(ExternalAgencyHistory externalAgency);

	public void saveExternalAgencyHistory(List<ExternalAgencyHistory> externalAgency);

}
