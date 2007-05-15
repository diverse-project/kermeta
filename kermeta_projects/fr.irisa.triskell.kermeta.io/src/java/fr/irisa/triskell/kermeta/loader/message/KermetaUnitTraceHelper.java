/* $Id: KermetaUnitTraceHelper.java,v 1.2 2007-05-15 09:12:38 dvojtise Exp $
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
package fr.irisa.triskell.kermeta.loader.message;

import java.io.InputStreamReader;
import java.io.LineNumberReader;

import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
//import fr.irisa.triskell.kermeta.language.structure.FObject;
import fr.irisa.triskell.traceability.ModelReference;
import fr.irisa.triskell.traceability.TextReference;
import fr.irisa.triskell.traceability.helper.ModelReferenceHelper;

/**
 * @author dvojtise
 * This class intend to provide helper functions for KermetaUnit traces
 */
public class KermetaUnitTraceHelper {

	/**
	 * return a string indicating where this element was defined
	 * it use the tracer.
	 * Maybe we should make it more detailled using the intermediate ModelElement in the traces
	 * @param fo * 
	 * @param root_unit
	 * @return
	 */
	static public String getLocationAsString(fr.irisa.triskell.kermeta.language.structure.Object fo, KermetaUnit root_unit)
	{	
		KermetaUnit ku = null;
		String result = "";
		
		ModelReference mr = root_unit.findModelReferenceToModelElement(fo);
    	if(mr != null){
    		TextReference tr = ModelReferenceHelper.getFirstTextReference(mr);
    		if(tr != null){
    			result += tr.getFileURI();
    			result += " (line " + tr.getLineBeginAt() + ")";    	
    			return result;
    		}   
    		if(mr.getRefObject().eResource() != null)
    		{
    			result += mr.getRefObject().eResource().getURI().toFileString();
    			result += " (not textual source found)";
    			return result;
    			
    		}
		}
		return "not able to locate the location of this element in the traces" + fo;
		
	}
	
}
