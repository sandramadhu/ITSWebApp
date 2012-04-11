package edu.buffalo.csse.its.batchjobs;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class BcdEventHistoryJob extends QuartzJobBean
{
	protected final Log logger = LogFactory.getLog(getClass()); 
	
	private BcdEventHistoryTask bcdEventHistoryTask;
 
	public void setBcdEventHistoryTask(BcdEventHistoryTask bcdEventHistoryTask) {
		this.bcdEventHistoryTask = bcdEventHistoryTask;
	}
 
	protected void executeInternal(JobExecutionContext context)
	throws JobExecutionException {
 
		try {
			System.out.println("bcdeventhistory...log");
			System.out.println(bcdEventHistoryTask);
			bcdEventHistoryTask.process();
		} catch (IOException e) {
			logger.error("Error running BcdEventHistoryTask log batch process: " + e.getMessage());
			e.printStackTrace();
		}
 
	}
}