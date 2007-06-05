/*$Id: ModelReferenceHelper.java,v 1.2 2007-06-05 15:37:24 dtouzet Exp $
* Project : fr.irisa.triskell.traceability.model
* File : 	ModelReferenceHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 14 mai 07
* Authors : 
*     dvojtise <dvojtise@irisa.fr>
*/

package fr.irisa.triskell.traceability.helper;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

import fr.irisa.triskell.traceability.ModelReference;
import fr.irisa.triskell.traceability.Reference;
import fr.irisa.triskell.traceability.TextReference;
import fr.irisa.triskell.traceability.Trace;

/**
 * 
 * Helper methods to be used with ModelReference
 *
 */
public class ModelReferenceHelper {

	/** 
	 *  Get the first TextReference linked to the given object 
	 *  Useful when, in a debug mode, we want to find the text informations
	 *  of the EObject representation of an element in the text that is being debugged.
	 * */
	static public TextReference getFirstTextReference(ModelReference eref)
	{
		TextReference result = null;
		if (eref != null)
		{
			EList sourceTraces = eref.getSourceTraces();
			Iterator sourceIt = sourceTraces.iterator();
			// get, for each sourceTrace, the list of sourceReferences
			while (sourceIt.hasNext())
			{
				Trace t = (Trace)sourceIt.next();
				EList refs = t.getSourceReferences();
				Iterator refsIt = refs.iterator();
				while (refsIt.hasNext())
				{
					Reference r = (Reference)refsIt.next();
					if (r instanceof TextReference)
					{
						result = (TextReference)r;
					}
				}
			}
		}
		return result;
	}
}


