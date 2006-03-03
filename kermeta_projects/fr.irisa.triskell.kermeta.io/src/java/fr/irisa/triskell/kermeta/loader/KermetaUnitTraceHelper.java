/* $Id: KermetaUnitTraceHelper.java,v 1.2 2006-03-03 15:22:19 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta.io
 * File       : KermetaUnitTraceHelper.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 15 sept. 2005
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 *         
 */
package fr.irisa.triskell.kermeta.loader;

import java.io.InputStreamReader;
import java.io.LineNumberReader;

import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
//import fr.irisa.triskell.kermeta.language.structure.FObject;

/**
 * @author dvojtise
 * This class intend to provide helper functions for KermetaUnit traces
 */
public class KermetaUnitTraceHelper {

	/**
	 * return a string indicating where this element was defined
	 * it currently doesn't use the trace system but the parsing hashtables to retreive line number
	 * @param fo * 
	 * @param root_unit
	 * @return
	 */
	static public String getLocationAsString(fr.irisa.triskell.kermeta.language.structure.Object fo, KermetaUnit root_unit)
	{	
		KermetaUnit ku = null;
		String result = "";
		
		ku = root_unit.findUnitForModelElement(fo);
		if (ku != null){
			result += ku.uri;
			KermetaASTNode astNode = (KermetaASTNode)ku.getNodeByModelElement(fo);
			if (astNode !=  null)
			{
				// line number is best calculated if we use rangeEnd
				result += " (line " + lineNumberForChar(ku.uri, astNode.getRangeEnd()) + ")";
			}
			return result;
		}
		else
		{
			return "not able to locate the source location of this element in the traces" + fo;
		}
	}
	
	/**
	 * calculates the line number for the given position in a file
	 * @param file_uri
	 * @param char_position
	 * @return
	 */
	static public int lineNumberForChar(String file_uri, int char_position)
	{
		int result = 0;
		try {
			java.net.URL url = new java.net.URL(file_uri);								    
			LineNumberReader lnr = new LineNumberReader(new InputStreamReader(url.openStream()));
			lnr.skip(char_position); // line number is best calculated if we use rangeEnd
			result = lnr.getLineNumber();
		} catch (Exception e) {
		}
		return result;
	}
}
