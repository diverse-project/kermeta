/* $Id: RuntimeHelper.java,v 1.4 2007-08-09 14:59:43 dvojtise Exp $
 * Project : Kermeta (First iteration)
 * File : RuntimeObject.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mar 14, 2005
 * Authors : 
 * 		Franck Fleurey <ffleurey@irisa.fr>
 * 		Jean-Philippe Thibault <jpthibau@irisa.fr>
 * 		Didier Vojtisek <dvojtise@irisa.fr>
 * Description : this propose some helper functions that are used in the runtime and the interperter
 */
package fr.irisa.triskell.kermeta.runtime;

import java.util.Iterator;


import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.loader.java.Jar2KMPass;

public class RuntimeHelper {

	/** returns true if this classdefinition is a proxy for a java class
     * 
     * @param definition
     * @return
     */
    public static boolean isJarProxy(TypeDefinition definition) {
    	Iterator<Tag> it = definition.getTag().iterator();
    	while (it.hasNext()){
    		Tag t = it.next();
    		if(Jar2KMPass.JARUNIT_TAG_NAME.equals(t.getName())) 
    				return true;
    	}
    	return false;
    }
    /** returns true if this operation is an initialized operation ie.constructor
     * 
     * @param definition
     * @return
     */
    public static boolean isInitOperation(Operation operation) {
    	Iterator<Tag> it = operation.getTag().iterator();
    	while (it.hasNext()){
    		Tag t = it.next();
    		if(Jar2KMPass.INITOPERATION_TAG_NAME.equals(t.getName())) 
    				return true;
    	}
    	return false;
    }
}
