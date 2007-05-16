/*$Id: PrimitiveTypeHelper.java,v 1.1 2007-05-16 13:45:05 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.io
* File : 	PrimitiveTypeHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 16 mai 07
* Authors : 
*     dvojtise <dvojtise@irisa.fr>
*/

package fr.irisa.triskell.kermeta.modelhelper;

import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Type;

public class PrimitiveTypeHelper {

	/**
	 * return the first non PrimitiveType for the given type following the instanceType link
	 * note: doesn't check for inconsistent model (ie. loop ...)
	 * @param inputtype
	 * @return
	 */
	public static Type resolvePrimitiveType(Type inputtype){
		Type result = inputtype;
		while(result instanceof PrimitiveType){
			result = ((PrimitiveType)result).getInstanceType();
		}
		return result;
	}
}


