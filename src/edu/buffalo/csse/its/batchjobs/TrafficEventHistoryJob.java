package edu.buffalo.csse.its.batchjobs;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class TrafficEventHistoryJob extends QuartzJobBean
{
	protected final Log logger = LogFactory.getLog(getClass()); 
	
	private TrafficEventHistoryTask trafficEventHistoryTask;
 
	public void setTrafficEventHistoryTask(TrafficEventHistoryTask trafficEventHistoryTask) {
		this.trafficEventHistoryTask = trafficEventHistoryTask;
	}
 
	protected void executeInternal(JobExecutionContext context)
	throws JobExecutionException {
 
		try {
			System.out.println("TrafficEventHistoryTask...log");
			System.out.println(trafficEventHistoryTask);
			trafficEventHistoryTask.process();
		} catch (IOException e) {
			logger.error("Error running TrafficEventHistoryTask log batch process: " + e.getMessage());
			e.printStackTrace();
		}
 
	}
}