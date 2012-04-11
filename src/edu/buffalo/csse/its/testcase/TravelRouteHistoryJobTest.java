package edu.buffalo.csse.its.testcase;

import java.io.IOException;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.buffalo.csse.its.batchjobs.TravelRouteHistoryTask;

public class TravelRouteHistoryJobTest extends TestCase{
	
	private TravelRouteHistoryTask travelRouteHistoryTask;
	
	public void setUp() throws Exception{
		super.setUp();
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		travelRouteHistoryTask = (TravelRouteHistoryTask) context.getBean("travelRouteHistoryTask");
		System.out.println(travelRouteHistoryTask);
	}
	
	public void test() throws IOException{
		travelRouteHistoryTask.process();
	}
}
