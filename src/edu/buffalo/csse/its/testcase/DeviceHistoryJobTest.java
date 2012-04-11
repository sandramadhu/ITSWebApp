package edu.buffalo.csse.its.testcase;

import java.io.IOException;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.buffalo.csse.its.batchjobs.DeviceHistoryTask;

public class DeviceHistoryJobTest extends TestCase{
	
	private DeviceHistoryTask deviceHistoryTask;
	
	public void setUp() throws Exception{
		super.setUp();
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		deviceHistoryTask = (DeviceHistoryTask) context.getBean("deviceHistoryTask");
		System.out.println(deviceHistoryTask);
	}
	
	public void test() throws IOException{
		deviceHistoryTask.process();
	}
}
