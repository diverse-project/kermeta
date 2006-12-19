/*******************************************************************************
 * Copyright (c) 2005 AIRBUS FRANCE. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   David Sciamma (Anyware Technologies), Mathieu Garcia (Anyware Technologies),
 *   Jacques Lescot (Anyware Technologies), Thomas Friol (Anyware Technologies),
 *   Nicolas Lalevée (Anyware Technologies) - initial API and implementation 
 ******************************************************************************/

package fr.irisa.triskell.kermeta.graphicaleditor.diag.commands;

import org.eclipse.gef.EditDomain;
import org.topcased.modeler.commands.CreateTypedEdgeCommand;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;

/**
 * Inheritance edge creation command<br>
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class InheritanceEdgeCreationCommand extends CreateTypedEdgeCommand {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param domain
	 *            the edit domain
	 * @param newObj
	 *            the graph edge of the new connection
	 * @param src
	 *            the graph element of the source
	 * @generated
	 */
	public InheritanceEdgeCreationCommand(EditDomain domain, GraphEdge newObj,
			GraphElement src) {
		this(domain, newObj, src, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param domain
	 *            the edit domain
	 * @param newObj
	 *            the graph edge of the new connection
	 * @param src
	 *            the graph element of the source
	 * @param needModelUpdate
	 *            set it to true if the model need to be updated
	 * @generated
	 */
	public InheritanceEdgeCreationCommand(EditDomain domain, GraphEdge newObj,
			GraphElement src, boolean needModelUpdate) {
		super(domain, newObj, src, needModelUpdate);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void redoModel() {
		// TODO add specific code if super method is not sufficient
		// super.redoModel();

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void undoModel() {
		// TODO add specific code if super method is not sufficient
		super.undoModel();
	}

}