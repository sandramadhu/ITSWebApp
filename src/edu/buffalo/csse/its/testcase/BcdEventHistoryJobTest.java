package edu.buffalo.csse.its.testcase;

import java.io.IOException;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.buffalo.csse.its.batchjobs.BcdEventHistoryTask;
import edu.buffalo.csse.its.batchjobs.IncidentLogTask;

public class BcdEventHistoryJobTest extends TestCase{
	
	private BcdEventHistoryTask bcdEventHistoryLogTask;
	
	public void setUp() throws Exception{
		super.setUp();
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		bcdEventHistoryLogTask = (BcdEventHistoryTask) context.getBean("bcdEventHistoryTask");
		System.out.println(bcdEventHistoryLogTask);
	}
	
	public void test() throws IOException{
		bcdEventHistoryLogTask.process();
	}
}
