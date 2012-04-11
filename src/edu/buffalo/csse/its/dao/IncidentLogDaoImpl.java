package edu.buffalo.csse.its.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.hibernate.SessionFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateTemplate;

import edu.buffalo.csse.its.data.IncidentLog;
import edu.buffalo.csse.its.util.ITSUtils;

public class IncidentLogDaoImpl implements IncidentLogDao {

	private HibernateTemplate hibernateTemplate;

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Override
	public List<IncidentLog> getIncidents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveIncident(IncidentLog incidentLog) {
		this.hibernateTemplate.saveOrUpdate(incidentLog);
	}

	@Override
	public void saveIncidents(List<IncidentLog> incidentLogs) {
		this.hibernateTemplate.saveOrUpdateAll(incidentLogs);
	}

	@Override
	public List<IncidentLog> getIncidents(String linkIds) throws DataAccessException{
		StringTokenizer tokenizer = new StringTokenizer(linkIds,",");
		
		List<String> list = new ArrayList<String>();
		
		while(tokenizer.hasMoreTokens()){
			list.add(tokenizer.nextToken().trim());
		}
		System.out.println("$$$$$Final LinkIds: " + list.toString().trim());
		
		String hql = "from IncidentLog where linkId in (:listParam)";
		String[] params = { "listParam" };
		Object[] values = { list};
		
		return this.hibernateTemplate.findByNamedParam(hql, params, values);
		
//		return this.hibernateTemplate.findByCriteria(crit);
		
//		return this.hibernateTemplate.find(queryString, sb.toString().trim());

		// return this.hibernateTemplate.execute(new HibernateCallback() {
		// public Object doInHibernate(Session session) {
		// Criteria criteria = session.createCriteria(IncidentLog.class);
		// criteria.add(Expression.eq("linkid", linkId));
		// // criteria.setMaxResults(6);
		// return criteria.list();
		// };
		// };

	}

	@SuppressWarnings("unchecked")
	public List<IncidentLog> getIncidents(List<String> linkIds, String stDate, String enDate, String stTime, String enTime, List<Integer> dowList) {
		
		System.out.println("$$$$$Final LinkIds: " + linkIds.toString());
		
		String hql = "from IncidentLog where linkId in (:listParam)";
		
		List<String> paramsList = new ArrayList<String>();
		List<Object> valuesList = new ArrayList<Object>();
		
		paramsList.add("listParam");
		valuesList.add(linkIds);
		
//		String[] params = { "listParam"};
//		Object[] values = { linkIds};
		
		int i=1;
		if(stDate != null){
			hql += " and incident_date >= :paramStDate";
			paramsList.add("paramStDate");
			valuesList.add(Long.parseLong(stDate));
		}
		if(enDate != null){
			hql += " and incident_date <= :paramEnDate";
			paramsList.add("paramEnDate");
			valuesList.add(Long.parseLong(enDate));
		}
		if(stTime != null){
			hql += " and incident_time >= :paramStTime";
			paramsList.add("paramStTime");
			valuesList.add(Long.parseLong(stTime));
		}
		if(enTime != null){
			hql += " and incident_time <= :paramEnTime";
			paramsList.add("paramEnTime");
			valuesList.add(Long.parseLong(enTime));
		}
		if(dowList != null && dowList.size() > 0){
			hql += " and dow in (:listDowParam)";
			paramsList.add("listDowParam");
			valuesList.add(dowList);
		}
		return this.hibernateTemplate.findByNamedParam(hql, ITSUtils.toStringArray(paramsList), valuesList.toArray());
	}

}
