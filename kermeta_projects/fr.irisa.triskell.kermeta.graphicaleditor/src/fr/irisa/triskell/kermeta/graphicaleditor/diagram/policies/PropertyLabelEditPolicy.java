/* $Id: PropertyLabelEditPolicy.java,v 1.2 2006-04-11 17:29:35 zdrey Exp $
 * Project    : fr.irisa.triskell.kermeta.graphicaleditor
 * File       : PropertyLabelEditPolicy.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : Mar 23, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 * Contributors :
 */
/**
 * 
 */
package fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies;

import org.topcased.modeler.edit.policies.EdgeObjectUVEditPolicy;
import org.topcased.modeler.figures.IEdgeObjectFigure;

/**
 * @author zdrey
 *
 */
public class PropertyLabelEditPolicy extends EdgeObjectUVEditPolicy {

	 /**
     * @see org.topcased.modeler.edit.policies.EdgeObjectUVEditPolicy#isEnd(org.topcased.modeler.figures.IEdgeObjectFigure)
     */
    protected boolean isEnd(IEdgeObjectFigure figure)
    {
        return true;
    }
    
    
}
