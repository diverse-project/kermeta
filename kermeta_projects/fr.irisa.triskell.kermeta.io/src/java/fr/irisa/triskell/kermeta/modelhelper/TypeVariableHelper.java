/*$Id: TypeVariableHelper.java,v 1.1 2007-08-02 14:58:18 cfaucher Exp $
* Project : fr.irisa.triskell.kermeta.io
* File : 	TypeVariableHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 2 aug. 07
* Authors : cfaucher
*/

package fr.irisa.triskell.kermeta.modelhelper;

import fr.irisa.triskell.kermeta.language.structure.TypeVariable;

/**
 * this class proposes various helper functions that applies to TypeVariable in the Kermeta model
 *
 */
public class TypeVariableHelper {

	/**
	* Returns a "printable name" for the given type variable
	* 
	* @param var
	* @return
	*/
	static public String getLabelForTypeVariable(TypeVariable var) {
		String supertype = var.getSupertype() != null ? (":" + TypeHelper.getLabelForType(var
				.getSupertype()))
				: "";
		return var.getName() + supertype;
	}

}


