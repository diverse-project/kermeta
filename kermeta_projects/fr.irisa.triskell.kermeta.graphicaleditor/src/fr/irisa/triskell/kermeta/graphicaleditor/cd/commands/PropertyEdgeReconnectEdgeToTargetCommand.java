/*$Id: PropertyEdgeReconnectEdgeToTargetCommand.java,v 1.2 2007-07-11 14:50:45 cfaucher Exp $
 * Project : fr.irisa.triskell.kermeta.graphicaleditor
 * File : 	PropertyEdgeReconnectEdgeToTargetCommand.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 9 mars 07
 * Authors : cfaucher
 */

package fr.irisa.triskell.kermeta.graphicaleditor.cd.commands;

import org.eclipse.gef.ConnectionEditPart;
import org.topcased.modeler.commands.ReconnectGraphEdgeCommand;
import org.topcased.modeler.di.model.GraphConnector;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.ParameterizedType;
import fr.irisa.triskell.kermeta.language.structure.Property;

public class PropertyEdgeReconnectEdgeToTargetCommand extends ReconnectGraphEdgeCommand {

	/** Keeping a trace of the old referenced type */
	private ClassDefinition oldType;

	public PropertyEdgeReconnectEdgeToTargetCommand(ConnectionEditPart connection) {
		super(connection);
	}

	/**
	 * @see org.topcased.modeler.commands.ReconnectGraphEdgeCommand#getOldGraphElement(org.eclipse.gef.ConnectionEditPart)
	 */
	protected GraphElement getOldGraphElement(ConnectionEditPart connection) {
		return null;
	}

	/**
	 * @see org.topcased.modeler.commands.ReconnectGraphEdgeCommand#redoModel()
	 */
	protected void redoModel() {
		Property prop = (Property) Utils.getElement(getEdge());
		ClassDefinition newClassDef = (ClassDefinition) Utils.getElement(getNewElement());
		
		ClassDefinition oldType = (ClassDefinition) ((ParameterizedType) ((Property) prop).getType()).getTypeDefinition();
		((ParameterizedType) ((Property) prop).getType()).setTypeDefinition(newClassDef);
		
	}

	/**
	 * @see org.topcased.modeler.commands.ReconnectGraphEdgeCommand#undoModel()
	 * TODO CF
	 */
	protected void undoModel() {
		Property association = (Property) Utils.getElement(getEdge());
		
		/*((Property) association.getMemberEnds().get(1)).setType(oldType);*/
	}

	/**
	 * @see org.topcased.modeler.commands.ReconnectGraphEdgeCommand#updateConnectors(org.topcased.modeler.di.model.GraphConnector,
	 *      org.topcased.modeler.di.model.GraphConnector,
	 *      org.topcased.modeler.di.model.GraphConnector)
	 */
	protected void updateConnectors(GraphConnector newConnector,
			GraphConnector oldConnector, GraphConnector attachedConnector) {
		GraphEdge edge = getEdge();

		oldConnector.getGraphEdge().remove(edge);
		newConnector.getGraphEdge().add(edge);
	}
}