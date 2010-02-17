/* $Id: KMTHelper.java,v 1.2 2008-04-28 11:50:24 ftanguy Exp $
 * Project    : fr.irisa.triskell.kermeta.io
 * File       : KMTHelper.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 11 juil. 2005
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 *        Some helper methods usefull when dealing with kermeta text syntax 
 */
package fr.irisa.triskell.kermeta.parser.helper;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Some helper methods usefull when dealing with kermeta text syntax
 */
public class KMTHelper {

	/**
	 * 
	 * @param id
	 * @return the identifier eventually mangled in order to safely fit in the
	 *         kermeta text syntax
	 */
	public static String getMangledIdentifier(String id) {
		if (id == null)
			return id;
		if (SimpleKWList.getInstance().isKeyword(id))
			return "~" + id;
		else
			return id;
	}

	/**
	 * @param id
	 * @return the identifier with its eventual escape character (~) removed
	 */
	public static String getUnescapedIdentifier(String id) {
		if (id == null)
			return id;
		if (id.startsWith("~"))
			return id.substring(1);
		else
			return id;
	}

	/*
	 * 
	 * HELPER METHODS TO FORMAT TAGS PRETTY PRINTING.
	 * 
	 */

	/**
	 * Helper - join the strings of list l, delimited by delimiter
	 * 
	 * @param l
	 *            the list to join in a single string
	 * @param delimiter
	 *            the delimiter
	 * @return
	 */
	public static String join(Collection<String> l, String delimiter) {
		StringBuffer result = new StringBuffer();
		for (String s : l) {
			result.append(s + delimiter);
		}
		return result.substring(0, result.length() - delimiter.length());
	}

	/**
	 * Replace protected html chars ( &lt; becomes <code>&lt;</code> ) TODO :
	 * uncomplete!
	 */
	public static String html(String str) {
		String result = str.replaceAll("<", "&lt;");
		result = result.replaceAll(">", "&gt;");
		return result;
	}

	/**
	 * Remove the comment <code>\/** *\/</code> syntax
	 * 
	 * @param node
	 * @return
	 */
	public static String formatTagValue(String comment) {
		String result = comment;
		int begin_i = 0;
		int end_i = comment.length();
		if (result.startsWith("/**"))
			begin_i = 2;
		if (result.endsWith("*/"))
			end_i = result.length() - 2;
		ArrayList<String> lresult = new ArrayList<String>();
		String[] lines = result.substring(begin_i, end_i).split("\\n");
		for (int i = 0; i < lines.length; i++) {
			String nline = lines[i].replaceFirst("(\\s*)\\*?(.*)", "$1$2");
			// nline.matches("\\s*\\*?(.*)"));
			nline = KMTHelper.html(nline);
			lresult.add(nline);
		}
		return KMTHelper.join(lresult, "\n");
	}

}
