package edu.buffalo.csse.its.batchjobs;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class TravelRouteHistoryJob extends QuartzJobBean
{
	protected final Log logger = LogFactory.getLog(getClass()); 
	
	private TravelRouteHistoryTask travelRouteHistoryTask;
 
	public void setTravelRouteHistoryTask(TravelRouteHistoryTask travelRouteHistoryTask) {
		this.travelRouteHistoryTask = travelRouteHistoryTask;
	}
 
	protected void executeInternal(JobExecutionContext context)
	throws JobExecutionException {
 
		try {
			System.out.println("TravelRouteHistoryTask...log");
			System.out.println(travelRouteHistoryTask);
			travelRouteHistoryTask.process();
		} catch (IOException e) {
			logger.error("Error running TravelRouteHistoryTask log batch process: " + e.getMessage());
			e.printStackTrace();
		}
 
	}
}