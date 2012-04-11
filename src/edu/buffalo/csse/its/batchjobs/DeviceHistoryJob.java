package edu.buffalo.csse.its.batchjobs;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class DeviceHistoryJob extends QuartzJobBean
{
	protected final Log logger = LogFactory.getLog(getClass()); 
	
	private DeviceHistoryTask deviceHistoryTask;
 
	public void setDeviceHistoryTask(DeviceHistoryTask deviceHistoryTask) {
		this.deviceHistoryTask = deviceHistoryTask;
	}
 
	protected void executeInternal(JobExecutionContext context)
	throws JobExecutionException {
 
		try {
			System.out.println("DeviceHistoryTask...log");
			System.out.println(deviceHistoryTask);
			deviceHistoryTask.process();
		} catch (IOException e) {
			logger.error("Error running DeviceHistoryTask log batch process: " + e.getMessage());
			e.printStackTrace();
		}
 
	}
}