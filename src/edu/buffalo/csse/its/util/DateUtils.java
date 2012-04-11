package edu.buffalo.csse.its.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	
	public static String convertDateToYYYYMMDD(Date date){
		return date != null ? new SimpleDateFormat("yyyyMMdd").format(date) : "0";
	}
	
	public static String convertDateToYYYYMMDDHHMMSS(Date date){
		return date != null ? new SimpleDateFormat("yyyyMMddHHmmss").format(date) : "0";
	}
	
	public static Date convertStringToDate(String source, SimpleDateFormat formatter) throws ParseException{
		return source != null && !"".equals(source) ? formatter.parse(source) : null;
	}
	/*
	 * get date part of the datetime string
	 * For eg: given 20100310193450 which is in yyyyMMddHHmmss date format,
	 * then this function returns the date part of it i.e. yyyyMMdd as String
	 */
	public static String getYYMMDD(String s){
		if(s == null){
			return "";
		}
		if(s.length() != 14){
			return "";
		}
		return s.substring(0,8);
	}
	/*
	 * get time part of the datetime string
	 * For eg: given 20100310193450 which is in yyyyMMddHHmmss date format,
	 * then this function returns the time part of it i.e. HHmmss as String
	 */
	public static String getHHMMSS(String s){
		if(s == null){
			return "";
		}
		if(s.length() != 14){
			return "";
		}
		return s.substring(8);
	}
	
	public static String zeroPadDate(String s){
		String ret = null;
		if(s == null){
			return null;
		}
		if(s.length() < 8 || s.length() > 14){
			return null;
		}
		if(s.length() == 8){
			ret = s+"000000";
		}
		return ret;
	}
	
	public static String convertStringToTime(String t, SimpleDateFormat tmf) throws ParseException{
		String ret = null;
		if(t == null){
			return null;
		}
		if(t.length() != 5){
			throw new RuntimeException("Invalid Time. Should be in " + tmf.toPattern() + " format");
		}
		SimpleDateFormat new_tmf = new SimpleDateFormat("HHmmss");
		ret = new_tmf.format(tmf.parse(t));
		
		return ret;
	}
}
