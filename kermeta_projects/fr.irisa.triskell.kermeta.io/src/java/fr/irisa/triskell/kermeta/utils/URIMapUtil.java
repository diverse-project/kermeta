/* $Id: URIMapUtil.java,v 1.1 2005-10-21 13:25:18 dvojtise Exp $
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
package fr.irisa.triskell.kermeta.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;


/**
 * Tools for URIMap
 * In particular load and save to files
 */
public class URIMapUtil {

	/**
	 * Read a map in a text file
	 * comment in the file is the #
	 * 		one map entry per line
	 * 		key and value are separated by  white space
	 * @param file
	 * @return
	 */
	public static Map readMapFile(File file)
	{
		Map resultMap = new HashMap();
	    
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
				   	if (key != null && value != null) 
				   		addMapEntry(resultMap,key, value);
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
	public static void addMapEntry(Map map, String key, String value)
	{
		map.put(URI.createURI(key),
    			URI.createURI(value));
	}
	
}
