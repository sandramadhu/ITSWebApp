package edu.buffalo.csse.its.batchjobs;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import edu.buffalo.csse.its.service.IncidentService;

public class IncidentLogTask {
	
	protected final Log logger = LogFactory.getLog(getClass()); 
	
	private IncidentService incidentService; 
	
	public void setIncidentService(IncidentService incidentService) {
		this.incidentService = incidentService;
	}

	public void process() throws IOException {
		
		try{
			System.out.println("$$$ Incident Log Batch started at " + new Date());
			
			Properties props = new Properties();
	//		InputStream in = new FileInputStream("classpath:batchjobs.properties");
			InputStream in = this.getClass().getResourceAsStream("/batchjobs.properties");;
			props.load(in);
			
			File file = new File(props.getProperty("incidentlog.dir"));
//			System.out.println("test...");
			System.out.println("Input dataset directory: " + file.getAbsoluteFile());
			
			File doneDir = new File(file.getAbsoluteFile()+"/"+"_done");
			if(!doneDir.exists()){
				if(!doneDir.mkdir()){
					throw new RuntimeException("Error creating '_done' directory. Please enable write permissions: " + file.getAbsolutePath());
				}
			}
			File files[] = file.listFiles();
			System.out.println("Total number of files to process: " + files.length);
			for(File f : files){
				if(f.isFile()){
					System.out.println("Started processing file : " + f.getAbsolutePath());
					
					incidentService.processData(f);
					
					f.renameTo(new File(doneDir+"/"+f.getName()));
				}
				
			}
			System.out.println("$$$ Incident Log Batch ended at " + new Date());
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
