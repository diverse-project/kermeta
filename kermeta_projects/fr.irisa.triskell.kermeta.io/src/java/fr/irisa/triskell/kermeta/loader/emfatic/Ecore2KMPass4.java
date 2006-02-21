/* $Id: Ecore2KMPass4.java,v 1.3 2006-02-21 17:34:18 jsteel Exp $
 * Project : Kermeta 
 * File : ECore2KMPass4.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 10 févr. 2005
 * Author : ffleurey
 */
package fr.irisa.triskell.kermeta.loader.emfatic;


import com.ibm.eclipse.emfatic.core.ast.Reference;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FProperty;


/**
 * @author Franck Fleurey
 * IRISA / University of Rennes 1 (France)
 * Distributed under the terms of the GPL licence
 * 
 * PASS 4 : Handles opposites of references
 * 
 */
public class Ecore2KMPass4 extends ECore2KMPass {

    /**
     * @param builder
     */
    public Ecore2KMPass4(KermetaUnit builder) {
        super(builder);
        // TODO Auto-generated constructor stub
    }
    
	public boolean beginVisit(Reference node) {

		FProperty res = (FProperty)builder.getModelElementByNode(node);
		// opposite :
		
		if (node.getOppositeName() != null) { // there is an opposite
		    FProperty oposite = builder.getPropertyByName((FClassDefinition) ((FClass)res.getFType()).getFTypeDefinition(), getTextForID(node.getOppositeName()));
		    if (oposite == null) {
		    	builder.messages.addError("Unable to resolve opposite property '" + getTextForID(node.getOppositeName()) + "'.", null);
		    	return false;
		    }
		    res.setFOpposite(oposite);
		}
		
		return false;
	}

}
