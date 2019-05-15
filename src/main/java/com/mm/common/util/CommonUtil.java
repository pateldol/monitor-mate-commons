package com.mm.common.util;

import java.text.DecimalFormat;
import java.util.Collection;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mm.common.constatnts.CommonConstants;
import com.mm.common.exceptions.DataEZServiceException;
import com.mm.common.model.rest.Metadata;
import com.mm.common.model.rest.RestResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class ApplicationUtil.
 */
public class CommonUtil {
	
	
	/**
	 * Checks if is null.
	 *
	 * @param object the object
	 * @return true, if is null
	 */
	public synchronized static boolean isNull(Object object){
		return(object == null);
	}
	
	/**
	 * Checks if is empty.
	 *
	 * @param object the object
	 * @return true, if is empty
	 */
	public synchronized static boolean isEmpty(Object object){
		if(isNull(object)){
			return true;
		}
		if(object instanceof Collection){
			return ((Collection<?>)object).isEmpty();
		}
		if(object instanceof String){
			return"".equals(((String)object).trim());
		}
		return false;
	}
	
	/**
	 * Checks if is number.
	 *
	 * @param s the s
	 * @return true, if is number
	 */
	public static boolean isNumber(String s) {
		if(isEmpty(s)) {
			return true;
		}
	    boolean isNumber = true;
	    Double doubZero = 0.0;
	    try {
			double data = Double.parseDouble(s);
			int val = doubZero.compareTo(data);
			if(val == 0){
				return true;
			}
		} catch (NumberFormatException e) {
			return false;
		}
	    return isNumber	;
	}

    /**
     * Inits the rest response.
     *
     * @param serviceReferenceId the service reference id
     * @return the rest response
     */
    public static RestResponse initRestResponse(String serviceReferenceId) {
		RestResponse restResponse = new RestResponse();
		restResponse.getMetadata().setServiceReferenceId(serviceReferenceId);
		return restResponse;
    }
    
    /**
     * Append by under score.
     *
     * @param str1 the str 1
     * @param str2 the str 2
     * @return the string
     */
    public static String appendByUnderScore(Object str1, Object str2) {
    	StringBuffer strBuffer  = new  StringBuffer();
    	strBuffer.append(str1.toString()+CommonConstants.UNDER_SCORE+str2.toString());
    	return strBuffer.toString();
    }
    
    /**
     * Append by colon.
     *
     * @param str1 the str 1
     * @param str2 the str 2
     * @return the string
     */
    public static String appendByColon(Object str1, Object str2) {
    	StringBuffer strBuffer  = new  StringBuffer();
    	strBuffer.append(str1.toString()+CommonConstants.COLON+str2.toString());
    	return strBuffer.toString();
    }

    /**
     * Builds the service error meta data info.
     *
     * @param request the request
     * @param response the response
     * @param exception the exception
     * @return the metadata
     */
    public static Metadata buildServiceErrorMetaDataInfo(HttpServletRequest request, HttpServletResponse response, DataEZServiceException exception) {
		Metadata metadata = new Metadata();

		return metadata;
	}
    
    /**
     * Generate unique id.
     *
     * @return the string
     */
    public static String generateUniqueId() {
		return UUID.randomUUID().toString();
    }
    
    /**
     * Gets the uploaded file extension.
     *
     * @param fileName the file name
     * @return the uploaded file extension
     */
    public static String getUploadedFileExtension(String fileName) {
		int i = fileName.lastIndexOf(".");
		String fileExt = fileName.substring(i, fileName.length());
		return fileExt;
	}
  
    
    /**
     * Custom string trim.
     *
     * @param data the data
     * @return the string
     */
    public static String customStringTrim(String data) {
		if(data == null) return "";
		//return data.trim();
		//TODO VS - discussion...
		return data.replace(String.valueOf((char) 160), " ").trim();
	}
    

	/**
	 * Convert to number.
	 *
	 * @param string the string
	 * @return the object
	 */
	public static Object convertToNumber(String string) {
		if(isEmpty(string.trim())) {
			return string.trim();
		}
		Double data = new Double(0.0);
		try {
			DecimalFormat df = new DecimalFormat("###.##");
			data = Double.parseDouble(string);
			string = df.format(data);
			data = Double.parseDouble(string);
			
			if(data % 1 == 0 ) {
				int intValue = (int) data.doubleValue();
				Integer integer = new Integer(intValue);
				return integer;
			}

		} catch (NumberFormatException e) {
			e.printStackTrace(System.out);
		}
		return data;
	}
	
	
	/**
	 * Clean and enhacen JSON data.
	 *
	 * @param data the data
	 * @return the string
	 */
	public static String cleanAndEnhacenJSONData(String data) {
//		String specialChars = getApplicationConfig().getSpecialCharactersToRemove();
		return data.replaceAll("<", "(").replaceAll(">", ")");
	}
	
	/**
	 * Enhacen JSON data to pipe delimited.
	 *
	 * @param data the data
	 * @return the string
	 */
	public static String enhacenJSONDataToPipeDelimited(String data) {
		return data.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\"", "").replaceAll(",", "|").trim();
	}

	
	/**
	 * Gets the file extension.
	 *
	 * @param fileName the file name
	 * @return the file extension
	 */
	public static String getFileExtension(String fileName) {
		int i = fileName.lastIndexOf(".");
		if(i>-1) {
			String fileExt = fileName.substring(i,fileName.length());
			return fileExt;
		}
		return null;
	}
	
	/**
	 * To camel case.
	 *
	 * @param phrase the phrase
	 * @return the string
	 */
	public static String toCamelCase(String phrase) {
		phrase = phrase.trim().toLowerCase().replaceFirst("[a-z]", String.valueOf(Character.toUpperCase(phrase.charAt(0))));
		while(phrase.contains("_")) {
			phrase = phrase.replaceFirst("_[a-z]", String.valueOf(Character.toUpperCase(phrase.charAt(phrase.indexOf("_") + 1))));
		}
		return phrase;
	}
	
	 /**
 	 * The main method.
 	 *
 	 * @param args the arguments
 	 */
 	public static void main(String[] args) {
		 String test = toCamelCase("MARKET_DEFINITION_CD");
		 System.out.println(" test :: "+test);
	      
	 }
}
