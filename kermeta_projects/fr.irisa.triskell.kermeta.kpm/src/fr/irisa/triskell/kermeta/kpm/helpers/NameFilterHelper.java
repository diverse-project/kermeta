/*$Id: NameFilterHelper.java,v 1.4 2008-03-05 08:09:54 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.kpm.helpers;

import fr.irisa.triskell.kermeta.kpm.FilterExpression;
import fr.irisa.triskell.kermeta.kpm.NameFilter;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Unit;

/**
 * 
 * This class provides a set of helpfull methods to get process name filter on units.
 * 
 * @author paco
 *
 */
public class NameFilterHelper {

	/**
	 * 
	 * Process a name filter on the value of a unit in order to get a new value that should correspond to a resource in the workspace.
	 * 
	 * @param unit
	 * @param filter
	 * @return
	 */
	static public String getOutputString(Unit unit, NameFilter filter) {
		
		int i = 0;
		int j = 0;
		
		String name = unit.getValue();
		String regex = filter.getRegex();
		
		String outputString = "";
		
		boolean stop = false;
		
		if ( regex.charAt(0) == '*' ) {			
			String extension = unit.getValue().subSequence( unit.getValue().lastIndexOf("."), unit.getValue().length()).toString();
			extension = "\\" + extension;
			String pattern = "(.+)" + extension;
		
			String replacement = "$1" + regex.substring( regex.indexOf("*")+1, regex.length() );
		
			outputString = unit.getValue().replaceAll( pattern, replacement );	
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
	 * @param unit The unit to be processed.
	 * @param expression An expression which filter should be a NameFilter
	 * @return The empty string if the filter is not a NameFilter, otherwise returns a string generated with the name filter.
	 */
	static public String getOutputString(Unit unit, FilterExpression expression) {
		if ( expression.getFilter() instanceof NameFilter )
			return getOutputString( unit, (NameFilter) expression.getFilter() );
		return "";
	}
	
	static public String getOuputString(Unit unit, Out out) {
		if ( out.getExpression() instanceof FilterExpression )
			return getOutputString(unit, (FilterExpression) out.getExpression() );
		return "";
	}
	
}
