

/*$Id: LabelHelper.java,v 1.2 2008-04-28 11:50:17 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.io
* File : 	LabelHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 14 févr. 08
* Authors : paco
*/

package fr.irisa.triskell.kermeta.modelhelper;

import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;

public class LabelHelper {
	/**
	 * Returns a extended "printable name" for the given operation
	 * 
	 * @param operation
	 * @return
	 */
	static public String getExtendedLabel(Operation operation) {
		
		StringBuffer text = new StringBuffer();
		
		if (operation.getName() != null	&& !"".equals(operation.getName())) {
			text.append(operation.getName());
		} else {
			text.append("null");
		}
		Boolean first = true;
		// The type parameters
		if (operation.getTypeParameter().size() > 0) {
			text.append("<");
			for (TypeVariable var : operation.getTypeParameter()) {
				if (first)
					first = false;
				else
					text.append(",");
				text.append(getLabelForTypeVariable(var));
			}
			text.append(">");
		}
		// Now the parameters
		text.append("(");
		first = true;
		for (Parameter param : operation.getOwnedParameter()) {
			if (first)
				first = false;
			else
				text.append(", ");
			text.append(TypeHelper.getLabelForType(param.getType()));
		}
		text.append(")");
		// The return type
		if (operation.getType() != null) {
			text.append(" : " + TypeHelper.getLabelForType(operation.getType()));
		}
		
		return text.toString();
	}
	
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


