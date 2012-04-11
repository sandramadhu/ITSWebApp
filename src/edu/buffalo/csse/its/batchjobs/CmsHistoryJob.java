package edu.buffalo.csse.its.batchjobs;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class CmsHistoryJob extends QuartzJobBean
{
	protected final Log logger = LogFactory.getLog(getClass()); 
	
	private CmsHistoryTask cmsHistoryTask;
 
	public void setCmsHistoryTask(CmsHistoryTask cmsHistoryTask) {
		this.cmsHistoryTask = cmsHistoryTask;
	}
 
	protected void executeInternal(JobExecutionContext context)
	throws JobExecutionException {
 
		try {
			System.out.println("CmsHistoryTask...log");
			System.out.println(cmsHistoryTask);
			cmsHistoryTask.process();
		} catch (IOException e) {
			logger.error("Error running CmsHistoryTask log batch process: " + e.getMessage());
			e.printStackTrace();
		}
 
	}
}