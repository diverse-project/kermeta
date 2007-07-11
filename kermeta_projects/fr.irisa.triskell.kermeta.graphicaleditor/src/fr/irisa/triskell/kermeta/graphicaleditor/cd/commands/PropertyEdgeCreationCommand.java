/*******************************************************************************
 * $Id: PropertyEdgeCreationCommand.java,v 1.2 2007-07-11 14:50:45 cfaucher Exp $
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
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;

/**
 * Property edge creation command
 *
 * @generated
 */
public class PropertyEdgeCreationCommand extends CreateTypedEdgeCommand {

	/**
	 * @param domain the edit domain
	 * @param newObj the graph edge of the new connection
	 * @param src the graph element of the source
	 * @generated
	 */
	public PropertyEdgeCreationCommand(EditDomain domain, GraphEdge newObj,
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
	public PropertyEdgeCreationCommand(EditDomain domain, GraphEdge newObj,
			GraphElement src, boolean needModelUpdate) {
		super(domain, newObj, src, needModelUpdate);
	}

	/**
	 * @generated NOT
	 */
	protected void redoModel() {
		// the super method add the property under the ClassDefinition
		super.redoModel();

		if (Utils.getElement(getTarget()) instanceof ClassDefinition
				&& Utils.getElement(getEdge()) instanceof Property) {

			ClassDefinition targetClassDef = (ClassDefinition) Utils
					.getElement(getTarget());
			Property fProperty = (Property) Utils.getElement(getEdge());

			// "type" is the class referencing the targeted ClassDefinition
			Class type = StructureFactory.eINSTANCE.createClass();
			type.setTypeDefinition(targetClassDef);

			// Add the class under the given property
			fProperty.getContainedType().add(type);
			// Set the type
			fProperty.setType(type);
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