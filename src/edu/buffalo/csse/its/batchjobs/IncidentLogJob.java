package edu.buffalo.csse.its.batchjobs;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class IncidentLogJob extends QuartzJobBean
{
	protected final Log logger = LogFactory.getLog(getClass()); 
	
	private IncidentLogTask incidentLogTask;
 
	public void setIncidentLogTask(IncidentLogTask incidentLogTask) {
		this.incidentLogTask = incidentLogTask;
	}
 
	protected void executeInternal(JobExecutionContext context)
	throws JobExecutionException {
 
		try {
			System.out.println("incidentlog...log");
			incidentLogTask.process();
		} catch (IOException e) {
			logger.error("Error running Incident log batch process: " + e.getMessage());
			e.printStackTrace();
		}
 
	}
}