/* $Id: Ecore2KMPass4.java,v 1.5 2006-10-25 08:27:01 dvojtise Exp $
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
//import fr.irisa.triskell.kermeta.language.structure.FClass;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Property;

import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;


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

		Property res = (Property)builder.getModelElementByNode(node);
		// opposite :
		
		if (node.getOppositeName() != null) { // there is an opposite
		    Property oposite = ClassDefinitionHelper.getPropertyByName((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)res.getType()).getTypeDefinition(), getTextForID(node.getOppositeName()));
		    if (oposite == null) {
		    	builder.messages.addError("Unable to resolve opposite property '" + getTextForID(node.getOppositeName()) + "'.", null);
		    	return false;
		    }
		    res.setOpposite(oposite);
		}
		
		return false;
	}

}
