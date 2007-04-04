package fr.irisa.triskell.kermeta.kpm.helpers;

import fr.irisa.triskell.kermeta.kpm.FilterExpression;
import fr.irisa.triskell.kermeta.kpm.NameFilter;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Unit;

public class NameFilterHelper {

	static public String getOutputString(Unit unit, NameFilter filter) {
		String regex = filter.getRegex();
		String output = "";
		
		if ( regex.contains("*") ) {			
			String extension = unit.getValue().subSequence( unit.getValue().lastIndexOf("."), unit.getValue().length()).toString();
			extension = "\\" + extension;
			String pattern = "(.+)" + extension;
		
			String replacement = "$1" + regex.substring( regex.indexOf("*")+1, regex.length() );
		
			output = unit.getValue().replaceAll( pattern, replacement );	
		} else {
			output = regex;
		}
		return output;
	}
	
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
