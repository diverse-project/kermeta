/* $Id: KMTUnitLoadError.java,v 1.3 2006-05-03 15:04:00 zdrey Exp $
* Project : Kermeta (First iteration)
* File : KMTLoadError.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 26 avr. 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.loader.kmt;

import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.loader.message.KMUnitError;

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
    public KMTUnitLoadError(String message, KermetaASTNode node) {
        super(message, null, node);
        astn = node;
    }

    public KermetaASTNode getAstNode() {
        return astn;
    }
}
