package edu.buffalo.csse.its.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	public static Configuration config = null;
	public static SessionFactory sessionFactory = null;
	public static final String HIBERNATE_CONFIG_FILE = "hibernate.cfg.xml";
	/*
	 * Singleton
	 */
	public static Configuration getConfiguration(){
		if(config == null){
			config = new Configuration();
			config.configure(HIBERNATE_CONFIG_FILE);
		}
		return config;
	}
	
	public static SessionFactory getSessionFactory(){
		if(sessionFactory == null){
			sessionFactory = getConfiguration().buildSessionFactory();
		}
		return sessionFactory;
	}
	
	public static Session getNewSession(){
		if(config == null){
			getConfiguration();
		}
		if(sessionFactory == null){
			getSessionFactory();
		}
		return sessionFactory.openSession();
	}
	
	public static Session getCurrentSession(){
		if(config == null){
			getConfiguration();
		}
		if(sessionFactory == null){
			getSessionFactory();
		}
		return sessionFactory.getCurrentSession();
	}
	
	public static boolean commitAndCloseSession(Session session){
		if(session == null){
			return false;
		}
		if(session.getTransaction() != null){
			session.getTransaction().commit();
			session.flush();
			session.close();
			
			return true;
		}
		return false;
	}
	
	public static boolean closeSession(Session session){
		if(session == null){
			return false;
		}
		
		session.close();
		return true;
	}
}
