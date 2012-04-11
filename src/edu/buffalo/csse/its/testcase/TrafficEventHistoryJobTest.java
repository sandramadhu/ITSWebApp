package edu.buffalo.csse.its.testcase;

import java.io.IOException;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.buffalo.csse.its.batchjobs.TrafficEventHistoryTask;

public class TrafficEventHistoryJobTest extends TestCase{
	
	private TrafficEventHistoryTask trafficEventHistoryTask;
	
	public void setUp() throws Exception{
		super.setUp();
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		trafficEventHistoryTask = (TrafficEventHistoryTask) context.getBean("trafficEventHistoryTask");
		System.out.println(trafficEventHistoryTask);
	}
	
	public void test() throws IOException{
		trafficEventHistoryTask.process();
	}
}
