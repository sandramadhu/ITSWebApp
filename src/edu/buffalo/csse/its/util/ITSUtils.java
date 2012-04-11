package edu.buffalo.csse.its.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class ITSUtils {
	public static int parseInt(String s){
		return s != null && !"".equals(s.trim()) ? Integer.parseInt(s.trim()) : 0;
	}
	public static double parseDouble(String s){
		return s != null && !"".equals(s.trim()) ? Double.parseDouble(s.trim()) : 0;
	}
	public static long parseLong(String s){
		return s != null && !"".equals(s.trim()) ? Long.parseLong(s.trim()) : 0;
	}
	public static int parseInt(BigInteger s){
		return s != null ? Integer.parseInt(s+"") : 0;
	}
	public static long parseLong(BigInteger s){
		return s != null ? Long.parseLong(s+"") : 0;
	}
	public static double parseDouble(BigDecimal s){
		return s != null ? Double.parseDouble(s+"") : 0;
	}
	public static String[] toStringArray(List<String> o){
		if(o == null || o.size() <= 0){
			return null;
		}
		String[] s = new String[o.size()];
		for(int i=0;i<o.size();i++){
			s[i] = (String)o.get(i);
		}
		return s;
	}
}
