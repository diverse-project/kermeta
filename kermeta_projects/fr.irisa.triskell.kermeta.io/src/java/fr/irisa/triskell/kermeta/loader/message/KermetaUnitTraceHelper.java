/* $Id: KermetaUnitTraceHelper.java,v 1.4 2007-06-26 15:34:04 dvojtise Exp $
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

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
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
    			result += " (no textual source found)";
    			return result;
    			
    		}
		}
    	// return null if not found ...
		return null;
		
	}
	
}
