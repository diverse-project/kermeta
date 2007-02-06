/*******************************************************************************
 * $Id: InheritanceEdgeCreationCommand.java,v 1.1 2007-02-06 17:45:45 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.cd.commands;

import org.eclipse.gef.EditDomain;
import org.topcased.modeler.commands.CreateTypedEdgeCommand;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;

/**
 * Inheritance edge creation command
 *
 * @generated
 */
public class InheritanceEdgeCreationCommand extends CreateTypedEdgeCommand {

	/**
	 * @param domain the edit domain
	 * @param newObj the graph edge of the new connection
	 * @param src the graph element of the source
	 * @generated
	 */
	public InheritanceEdgeCreationCommand(EditDomain domain, GraphEdge newObj,
			GraphElement src) {
		this(domain, newObj, src, true);
	}

	/**
	 * @param domain the edit domain
	 * @param newObj the graph edge of the new connection
	 * @param src the graph element of the source
	 * @param needModelUpdate set it to true if the model need to be updated
	 * @generated
	 */
	public InheritanceEdgeCreationCommand(EditDomain domain, GraphEdge newObj,
			GraphElement src, boolean needModelUpdate) {
		super(domain, newObj, src, needModelUpdate);
	}

	/**
	 * @generated NOT
	 */
	protected void redoModel() {
		//TODO add specific code if super method is not sufficient
		//super.redoModel();

		if (Utils.getElement(getSource()) instanceof ClassDefinition
				&& Utils.getElement(getTarget()) instanceof ClassDefinition) {
			ClassDefinition sourceFClass = (ClassDefinition) Utils
					.getElement(getSource());
			ClassDefinition targetFClass = (ClassDefinition) Utils
					.getElement(getTarget());

			// "type" is the class referencing the targeted ClassDefinition
			Class type = StructureFactory.eINSTANCE.createClass();
			type.setTypeDefinition(targetFClass);

			// Add the class under the given property
			sourceFClass.getContainedType().add(type);
			sourceFClass.getSuperType().add(type);
		}
	}

	/**
	 * @generated
	 */
	protected void undoModel() {
		//TODO add specific code if super method is not sufficient
		super.undoModel();
	}

}