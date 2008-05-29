/*$Id: NameFilterHelper.java,v 1.2 2008-05-29 06:46:57 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package org.kermeta.kpm;

import fr.irisa.triskell.kermeta.kpm.NameFilter;
import fr.irisa.triskell.kermeta.kpm.Unit;

/**
 * 
 * This class provides a set of helpfull methods to get process name filter on units.
 * 
 * @author paco
 *
 */
public class NameFilterHelper {
	
	static public String getOutputString(Unit unit, String regex) {
		int i = 0;
		int j = 0;
		String outputString = "";
		String name = unit.getName();
		
		boolean stop = false;
		
		if ( regex.charAt(0) == '*' ) {			
			String extension = unit.getName().subSequence( unit.getName().lastIndexOf("."), unit.getName().length()).toString();
			extension = "\\" + extension;
			String pattern = "(.+)" + extension;
		
			String replacement = "$1" + regex.substring( regex.indexOf("*")+1, regex.length() );
		
			outputString = unit.getName().replaceAll( pattern, replacement );	
		} else {
		
			while ( ! stop && (i < name.length()) && (j < regex.length()) ) {
			
				if ( name.charAt(i) == regex.charAt(j) ) {
					outputString += name.charAt(i);
					i++;
					j++;
				} else {
					while ( regex.charAt(i) != '*' ) {
						outputString += regex.charAt(i);
						i++;
					}
					String subRegEx = regex.substring( i+1 );
					int indexOfPoint = name.lastIndexOf(".");
					int indexOfSlash = name.lastIndexOf("/");
					String fileName = name.substring(indexOfSlash+1, indexOfPoint);
					fileName += subRegEx;
					outputString += fileName;
					stop = true;
				}
			
			}
		}
		
		return outputString;
	}
	
	/**
	 * 
	 * Process a name filter on the value of a unit in order to get a new value that should correspond to a resource in the workspace.
	 * 
	 * @param unit
	 * @param filter
	 * @return
	 */
	static public String getOutputString(Unit unit, NameFilter filter) {		
		String regex = filter.getRegex();
		return getOutputString(unit, regex);
	}
	
}
