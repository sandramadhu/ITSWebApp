package edu.buffalo.csse.its.web.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import edu.buffalo.csse.its.dao.IncidentLogDao;
import edu.buffalo.csse.its.util.DateUtils;

public class SearchFormController implements Controller{
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	private IncidentLogDao incidentLogDao;
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		logger.info("Processing Search Form");
		
		Map<String, Object> myModel = new HashMap<String, Object>();
		
		String linkIds = req.getParameter("linkId");
		String stDate = req.getParameter("stDate");
		String enDate = req.getParameter("enDate");
		String stTime = req.getParameter("stTime");
		String enTime = req.getParameter("enTime");
		String dows = req.getParameter("dow");
		
		System.out.println("$$$$$linkIds: " + linkIds);

		if(linkIds != null){
			linkIds = linkIds.trim();
		}
		else{
			linkIds = "";
		}
		
		StringTokenizer tokenizer = new StringTokenizer(linkIds,",");
		List<String> links = new ArrayList<String>();
		while(tokenizer.hasMoreTokens()){
			links.add(tokenizer.nextToken().trim());
		}
		if(dows != null){
			dows = dows.trim();
		}else{
			dows = "";
		}
		tokenizer = new StringTokenizer(dows,",");
		List<Integer> dowList = new ArrayList<Integer>();
		while(tokenizer.hasMoreTokens()){
			dowList.add(Integer.parseInt(tokenizer.nextToken().trim()));
		}
		
		/* Convert Dates and to DateSKey Format */
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat tmf = new SimpleDateFormat("HH:mm");
		
		if(stDate != null){
			stDate = DateUtils.convertDateToYYYYMMDD(DateUtils.convertStringToDate(stDate.trim(), sdf));
		}
		if(enDate != null){
			enDate = DateUtils.convertDateToYYYYMMDD(DateUtils.convertStringToDate(enDate.trim(), sdf));
		}
		if(stTime != null){
			stTime = DateUtils.convertStringToTime(stTime.trim(), tmf);
			if(stDate != null){
				stDate += stTime;
			}
		}
		else{
			stDate = DateUtils.zeroPadDate(stDate);
		}
		if(enTime != null){
			enTime = DateUtils.convertStringToTime(enTime.trim(), tmf);
			if(enDate != null){
				enDate += enTime;
			}
		}
		else{
			enDate = DateUtils.zeroPadDate(enDate);
		}
		
		System.out.println("stDate: " + stDate + " enDate: " + enDate);
		
        myModel.put("incidents", this.incidentLogDao.getIncidents(links, stDate, enDate, null, null, dowList));

        return new ModelAndView("incidents", "model", myModel);
	}

	public void setIncidentLogDao(IncidentLogDao incidentLogDao) {
		this.incidentLogDao = incidentLogDao;
	}
	
}
