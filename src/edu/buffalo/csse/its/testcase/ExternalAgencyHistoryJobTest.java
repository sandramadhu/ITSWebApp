package edu.buffalo.csse.its.testcase;

import java.io.IOException;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.buffalo.csse.its.batchjobs.ExternalAgencyHistoryTask;

public class ExternalAgencyHistoryJobTest extends TestCase{
	
	private ExternalAgencyHistoryTask externalAgencyHistoryTask;
	
	public void setUp() throws Exception{
		super.setUp();
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		externalAgencyHistoryTask = (ExternalAgencyHistoryTask) context.getBean("externalAgencyHistoryTask");
		System.out.println(externalAgencyHistoryTask);
	}
	
	public void test() throws IOException{
		externalAgencyHistoryTask.process();
	}
}
