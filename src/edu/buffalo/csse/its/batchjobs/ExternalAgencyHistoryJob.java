package edu.buffalo.csse.its.batchjobs;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class ExternalAgencyHistoryJob extends QuartzJobBean
{
	protected final Log logger = LogFactory.getLog(getClass()); 
	
	private ExternalAgencyHistoryTask externalAgencyHistoryTask;
 
	public void setExternalAgencyHistoryTask(ExternalAgencyHistoryTask externalAgencyHistoryTask) {
		this.externalAgencyHistoryTask = externalAgencyHistoryTask;
	}
 
	protected void executeInternal(JobExecutionContext context)
	throws JobExecutionException {
 
		try {
			System.out.println("ExternalAgencyHistory...log");
			System.out.println(externalAgencyHistoryTask);
			externalAgencyHistoryTask.process();
		} catch (IOException e) {
			logger.error("Error running ExternalAgencyHistory log batch process: " + e.getMessage());
			e.printStackTrace();
		}
 
	}
}