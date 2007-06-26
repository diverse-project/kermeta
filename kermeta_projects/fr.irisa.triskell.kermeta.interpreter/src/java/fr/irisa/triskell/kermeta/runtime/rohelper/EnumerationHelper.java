/* $Id: EnumerationHelper.java,v 1.1 2007-06-26 08:40:27 dvojtise Exp $ 
 * helper on the Kermeta base type Enumeration 
 */

package fr.irisa.triskell.kermeta.runtime.rohelper;


import java.util.Iterator;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;

/**
 * Implementation of Enumùeration methods for kermeta 
 * @author Franck Fleurey
 */
public class EnumerationHelper {
    
		
	/** This operation is an helper when used from java
	 * retrieves the literal with the given name in the Enumeration
	 */
	public static RuntimeObject getLiteral(RuntimeObject roEnum, java.lang.String literalName) {
		RuntimeObject roEnumLitCollection = roEnum.getProperties().get("ownedLiteral");
		Iterator it = fr.irisa.triskell.kermeta.runtime.basetypes.Collection.getArrayList(roEnumLitCollection).iterator();
		RuntimeObject roEnumLit=null;
		while(it.hasNext()){
			RuntimeObject roLit = (RuntimeObject)it.next();
			java.lang.String litName = fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(roLit.getProperties().get("name"));
			if(litName.equals(literalName)){
				roEnumLit = roLit;
				return roEnumLit;
			}
		}
		// else return Void
		return roEnum.getFactory().getMemory().voidINSTANCE;
	}


}
/* END OF FILE */
