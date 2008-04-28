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
package fr.irisa.triskell.kermeta.modelhelper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.kermeta.io.plugin.IOPlugin;


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
	public static Map<URI,URI> readMapFile(File file)
	{
		Map<URI,URI> resultMap = new HashMap<URI,URI>();
	    
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
				   		IOPlugin.internalLog.info("added map : " + key + " -> " + value);
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
		           		IOPlugin.internalLog.warn("problem parsing file: " +file.getName()+
		           				" line: "+ sTokenizer.lineno() + ", ignoring token: " +sTokenizer.sval);
					break;	
		        default:
		        	IOPlugin.internalLog.warn("Unknown: nval = " + sTokenizer.nval +
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
	public static void addMapEntry(Map<URI,URI> map, String key, String value)
	{
		map.put(URI.createURI(key),
    			URI.createURI(value));
	}
	
	/** Resolves the uri given its relative path <code>uri</code> and
	 *  the expected base directory given by <code>rel_path</code>*/
	public static URI resolveURI(String uri, String rel_path)
	{
		URI u = URI.createURI(uri);
		if (u.isRelative()) {
			URIConverter c = new URIConverterImpl();
			u = u.resolve(c.normalize(URI.createURI(rel_path)));    			
		}
		return u;
	}
	
}
