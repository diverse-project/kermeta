/*******************************************************************************
 * $Id: PropertyBiDirecEdgeCreationCommand.java,v 1.2 2007-07-23 09:21:25 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.cd.commands;

import org.eclipse.gef.EditDomain;

import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.commands.CreateTypedEdgeCommand;

/**
 * PropertyBiDirec edge creation command
 *
 * @generated
 */
public class PropertyBiDirecEdgeCreationCommand extends CreateTypedEdgeCommand {

	/**
	 * @param domain the edit domain
	 * @param newObj the graph edge of the new connection
	 * @param src the graph element of the source
	 * @generated
	 */
	public PropertyBiDirecEdgeCreationCommand(EditDomain domain,
			GraphEdge newObj, GraphElement src) {
		this(domain, newObj, src, true);
	}

	/**
	 * @param domain the edit domain
	 * @param newObj the graph edge of the new connection
	 * @param src the graph element of the source
	 * @param needModelUpdate set it to true if the model need to be updated
	 * @generated
	 */
	public PropertyBiDirecEdgeCreationCommand(EditDomain domain,
			GraphEdge newObj, GraphElement src, boolean needModelUpdate) {
		super(domain, newObj, src, needModelUpdate);
	}

	/**
	 * @generated
	 */
	protected void redoModel() {
		//TODO add specific code if super method is not sufficient
		super.redoModel();
	}

	/**
	 * @generated
	 */
	protected void undoModel() {
		//TODO add specific code if super method is not sufficient
		super.undoModel();
	}

}