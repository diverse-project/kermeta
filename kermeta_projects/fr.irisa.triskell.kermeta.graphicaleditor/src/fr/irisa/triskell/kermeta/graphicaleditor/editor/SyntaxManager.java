/* $Id: SyntaxManager.java,v 1.1 2006-04-05 19:00:14 zdrey Exp $
 * Project    : fr.irisa.triskell.kermeta.graphicaleditor
 * File       : SyntaxEditor.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : Apr 5, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 * Contributors :
 * //Rob Warner (rwarner@interspatial.com)
 * //Robert Harris (rbrt_harris@yahoo.com)
 */
package fr.irisa.triskell.kermeta.graphicaleditor.editor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

/**
 * This class manages the syntax coloring and styling data
 */
public class SyntaxManager {
	// Lazy cache of SyntaxData objects
	private static Map data = new Hashtable();
	public static final String KERMETA_SYNTAX_DATA = "kermeta";
	
	/**
	 * Gets the syntax data for an extension
	 */
	public static synchronized SyntaxData getSyntaxData(String extension) {
		// Check in cache
		SyntaxData sd = (SyntaxData) data.get(extension);
		if (sd == null) {
			// Not in cache; load it and put in cache
			sd = loadSyntaxData(extension);
			if (sd != null) data.put(sd.getExtension(), sd);
		}
		return sd;
	}
	
	/**
	 * Loads the syntax data for an extension
	 * 
	 * @param extension the extension to load
	 * @return SyntaxData
	 */
	private static SyntaxData loadSyntaxData(String extension) {
		SyntaxData sd = null;
		try {
			// Don't know how it works yet :'
			//ResourceBundle rb = ResourceBundle.getBundle("SyntaxResourceBundle");
			ResourceBundle rb = new SyntaxResourceBundle();
			sd = new SyntaxData(extension);
			sd.setComment(rb.getString("comment"));
			sd.setMultiLineCommentStart(rb.getString("multilinecommentstart"));
			sd.setMultiLineCommentEnd(rb.getString("multilinecommentend"));
			
			// Load the keywords
			Collection keywords = new ArrayList();
			for (StringTokenizer st = new StringTokenizer(rb.getString("keywords"), " "); st
			.hasMoreTokens();) {
				keywords.add(st.nextToken());
			}
			sd.setKeywords(keywords);
			/*sd.getKeywords().add("class");
			sd.getKeywords().add("operation");*/
			
			// Load the punctuation
			sd.setPunctuation(rb.getString("punctuation"));
		} catch (MissingResourceException e) {
			// Ignore
		}
		return sd;
	}
}
