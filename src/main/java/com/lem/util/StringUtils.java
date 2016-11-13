package com.lem.util;

/**
 * 
 * @author ukathinokkula
 *
 */
public class StringUtils {
		
	public static boolean isEmptyOrNull(String str) {
		System.out.println("1"+str);
		return str == null || str.trim().length() == 0;
	}

}
