/* $Id$
 * Project   : fr.irisa.triskell.kermeta.graphicaleditor (First iteration)
 * File      : FPropertyEditPart.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 24, 2006
 * Authors       : zdrey
 */
/* $Id$
 * Project   : Kermeta (First iteration)
 * File      : FPropertyEditPart.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 24, 2006
 * Authors       : zdrey
 */

package fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.di.model.GraphNode;

import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.utils.FPropertyEditPartCommonInterface;

/**
 * This is an adapter for the two graphical ways to set a property.
 * @author zdrey
 * @generated NOT
 */
public class FPropertyEditPartGeneric extends AbstractGraphicalEditPart {
 
	protected FPropertyEditPartCommonInterface adaptee; 
	
	/**
	 * Constructor.
	 * Element specialization can be [EMF]GraphNode or [EMF]GraphEdge
	 */
	public FPropertyEditPartGeneric(GraphElement element) {
		super();
		setModel(element);
		if (element instanceof GraphNode) adaptee = new FPropertyEditPartNode((GraphNode)element);
		else if (element instanceof GraphEdge) adaptee = new FPropertyEditPartEdge((GraphEdge)element);
		else throw new Error("FPropertyEditPart class is instanciated with an element which is not a" +
				"GraphNode or a GraphEdge");
	}

	@Override
	protected IFigure createFigure() {
		return adaptee.adaptedCreateFigure();
	}

	@Override
	protected void createEditPolicies() {
		adaptee.adaptedCreateEditPolicies();
	}

}
