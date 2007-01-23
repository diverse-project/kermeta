/* $Id: KMTUnitLoadError.java,v 1.1 2007-01-23 15:04:12 dvojtise Exp $
* Project : Kermeta (First iteration)
* File : KMTLoadError.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 26 avr. 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.migrationv032_v040.loader.kmt;

import com.ibm.eclipse.ldt.core.ast.ASTNode;

import fr.irisa.triskell.kermeta.loader.message.KMUnitError;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.KermetaASTNode;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KMTUnitLoadError extends KMUnitError {

    
    /**
     * @param message
     * @param node
     */
    public KMTUnitLoadError(String message, ASTNode node) {
        super(message, null, node);
        astn = node;
    }

    public ASTNode getAstNode() {
        return astn;
    }
}
