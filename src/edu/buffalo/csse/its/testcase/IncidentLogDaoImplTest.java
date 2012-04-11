package edu.buffalo.csse.its.testcase;


import java.util.List;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.buffalo.csse.its.dao.IncidentLogDao;
import edu.buffalo.csse.its.data.IncidentLog;

public class IncidentLogDaoImplTest extends TestCase{
	
	private IncidentLogDao incidentDao;
	
	public void setUp() throws Exception{
		super.setUp();
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-hibernate-config.xml");
		incidentDao = (IncidentLogDao) context.getBean("incidentLogDao");
		System.out.println(incidentDao);
	}
	
	public void test(){
		List<IncidentLog> logs = incidentDao.getIncidents("29345");
		logs.size();
	}
}
