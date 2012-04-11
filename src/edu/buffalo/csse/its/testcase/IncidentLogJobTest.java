package edu.buffalo.csse.its.testcase;

import java.io.IOException;
import java.util.List;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.buffalo.csse.its.batchjobs.IncidentLogTask;
import edu.buffalo.csse.its.data.IncidentLog;

public class IncidentLogJobTest extends TestCase{
	
	private IncidentLogTask incidentLogTask;
	
	public void setUp() throws Exception{
		super.setUp();
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		incidentLogTask = (IncidentLogTask) context.getBean("incidentLogTask");
		System.out.println(incidentLogTask);
	}
	
	public void test() throws IOException{
		incidentLogTask.process();
	}
}
