package edu.buffalo.csse.its.testcase;

import java.io.IOException;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.buffalo.csse.its.batchjobs.CmsHistoryTask;

public class CmsHistoryJobTest extends TestCase{
	
	private CmsHistoryTask cmsHistoryTask;
	
	public void setUp() throws Exception{
		super.setUp();
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		cmsHistoryTask = (CmsHistoryTask) context.getBean("cmsHistoryTask");
		System.out.println(cmsHistoryTask);
	}
	
	public void test() throws IOException{
		cmsHistoryTask.process();
	}
}
