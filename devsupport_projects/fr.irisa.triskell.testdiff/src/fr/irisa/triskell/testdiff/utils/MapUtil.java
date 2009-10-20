/* $Id: URIMapUtil.java,v 1.6 2008-04-28 11:50:17 ftanguy Exp $
 * Project    : fr.irisa.triskell.kermeta.io
 * File       : XMLMap.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 20 oct. 2005
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Notes : 
 *      This may worth to be generalised into a MapUtil.java
 * 		The current structure of the code mmay not be too difficult to change if this need occurs   
 */
package fr.irisa.triskell.testdiff.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Map;



/**
 * Tools for URIMap
 * In particular load and save to files
 */
public class MapUtil {

	/**
	 * Read a map in a text file
	 * comment in the file is the #
	 * 		one map entry per line
	 * 		key and value are separated by  white space
	 * @param the file name
	 * @return
	 */
	public static Map<String,String> readMapFile(String fileName){
		File file = new File(fileName);
		return readMapFile(file);
	}
	/**
	 * Read a map in a text file
	 * comment in the file is the #
	 * 		one map entry per line
	 * 		key and value are separated by  white space
	 * @param a file
	 * @return
	 */
	public static Map<String,String> readMapFile(File file)
	{
		Map<String,String> resultMap = new HashMap<String,String>();
	    
		try {
			int tokenType = 0;
			int numberOfTokens = -1;
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis);
			String key = null;
			String value = null;
			
			
			StreamTokenizer sTokenizer = new StreamTokenizer(isr);
			configureTokenizer(sTokenizer);
			
			do {
				tokenType = sTokenizer.nextToken();
			    switch (tokenType) {
			    case StreamTokenizer.TT_EOF:
	           		//System.out.println("TT_EOF");
	           		break;
		        case StreamTokenizer.TT_EOL:
				   	if (key != null && value != null) {
				   		addMapEntry(resultMap,key, value);
				   		System.out.println("added map : " + key + " -> " + value);
				   	}
	           		key = null;
	           		value = null;
					break; 	
		        case StreamTokenizer.TT_NUMBER:
				   	//System.out.println("TT_NUMBER: nval = " + inStream.nval);
					break;
		        case StreamTokenizer.TT_WORD:
		        case '\"':
		        case '\'':
		           	if (key == null && value == null)
		           		key = sTokenizer.sval;
		           	else if (value == null)
		           		value = sTokenizer.sval;
		           	else 
		           		System.out.println("problem parsing file: " +file.getName()+
		           				" line: "+ sTokenizer.lineno() + ", ignoring token: " +sTokenizer.sval);
					break;	
		        default:
		        	System.out.println("Unknown: nval = " + sTokenizer.nval +
	           				" sval = " + sTokenizer.sval);
	           		break;
			    }
			    numberOfTokens++;
			} while (tokenType != StreamTokenizer.TT_EOF);
			
			
				

	    } catch (IOException ioe) {
	       // I/O error
	       ioe.printStackTrace();
	    }
	    return resultMap;
	}
	
	public static void configureTokenizer(StreamTokenizer sTokenizer)
	{
		// use # as comment
		sTokenizer.commentChar('#');
		sTokenizer.eolIsSignificant(true);
		
	}
	public static void addMapEntry(Map<String,String> map, String key, String value)
	{
		map.put(key,value);
	}
	
	/**
	 * If the key is found in the map, returns the associated value
	 * otherwise return the key
	 * @param map
	 * @param key
	 * @return
	 */
	public static String getMappedValue(Map<String,String> map, String key){
		if(map.containsKey(key))
			return map.get(key);
		else
			return key;
	}
	
}
