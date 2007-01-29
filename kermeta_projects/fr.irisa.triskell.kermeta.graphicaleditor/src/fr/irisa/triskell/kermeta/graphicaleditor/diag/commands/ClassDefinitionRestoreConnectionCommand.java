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

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.topcased.modeler.ModelerPropertyConstants;
import org.topcased.modeler.commands.AbstractRestoreConnectionCommand;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.di.model.util.DIUtils;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.diag.StructureSimpleObjectConstants;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.ParameterizedType;

import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.util.KermetaCommonUtils;

import fr.irisa.triskell.kermeta.graphicaleditor.diag.utils.KermetaUtils;

/**
 * ClassDefinition restore connection command<br>
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 * @author <a href="mailto:david.sciamma@anyware-tech.com">David Sciamma</a>
 */
public class ClassDefinitionRestoreConnectionCommand extends
		AbstractRestoreConnectionCommand {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param part
	 *            the EditPart that is restored
	 * @generated
	 */
	public ClassDefinitionRestoreConnectionCommand(EditPart part) {
		super(part);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.topcased.modeler.commands.AbstractRestoreConnectionCommand#initializeCommands()
	 * @generated
	 */
	protected void initializeCommands() {

		GraphElement node = getGraphElement();
		EObject nodeObject = Utils.getElement(node);

		if (nodeObject instanceof ClassDefinition) {
			Iterator itDiagContents = getModeler().getActiveDiagram()
					.eAllContents();
			while (itDiagContents.hasNext()) {
				Object obj = itDiagContents.next();
				// FIXME Change the way to handle EList GraphNodes
				if (obj instanceof GraphElement
						&& DIUtils
								.getProperty(
										(GraphElement) obj,
										ModelerPropertyConstants.ESTRUCTURAL_FEATURE_ID) == null) {
					boolean autoRef = obj.equals(node);
					GraphElement node2 = (GraphElement) obj;
					EObject nodeObject2 = Utils.getElement(node2);
					if (nodeObject2 instanceof ClassDefinition) {
						if (autoRef) {
							// autoRef not allowed
						} else {
							// if the node is the source of the edge or if it is
							// the target and that the SourceTargetCouple is
							// reversible
							createInheritanceFromClassDefinitionToClassDefinition(
									node, node2);
							// if node is the target of the edge or if it is the
							// source and that the SourceTargetCouple is
							// reversible
							createInheritanceFromClassDefinitionToClassDefinition(
									node2, node);
						}
					}

					if (nodeObject2 instanceof ClassDefinition) {
						if (autoRef) {
							createPropertyFromClassDefinitionToClassDefinition(
									node, node);
						} else {
							// if the node is the source of the edge or if it is
							// the target and that the SourceTargetCouple is
							// reversible
							createPropertyFromClassDefinitionToClassDefinition(
									node, node2);
							// if node is the target of the edge or if it is the
							// source and that the SourceTargetCouple is
							// reversible
							createPropertyFromClassDefinitionToClassDefinition(
									node2, node);
						}
					}

				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param srcNode
	 *            the source node
	 * @param targetNode
	 *            the target node
	 * @generated NOT
	 */
	private void createInheritanceFromClassDefinitionToClassDefinition(
			GraphElement srcNode, GraphElement targetNode) {
		ClassDefinition sourceObject = (ClassDefinition) Utils
				.getElement(srcNode);
		ClassDefinition targetObject = (ClassDefinition) Utils
				.getElement(targetNode);

		if (KermetaCommonUtils.isSuperType(sourceObject, targetObject)) {
			// check if the relation does not exists yet
			if (getExistingEdges(srcNode, targetNode,
					StructureSimpleObjectConstants.SIMPLE_OBJECT_INHERITANCE)
					.size() == 0) {
				GraphEdge edge = Utils
						.createGraphEdge(StructureSimpleObjectConstants.SIMPLE_OBJECT_INHERITANCE);
				InheritanceEdgeCreationCommand cmd = new InheritanceEdgeCreationCommand(
						null, edge, srcNode, false);
				cmd.setTarget(targetNode);
				add(cmd);
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param srcNode
	 *            the source node
	 * @param targetNode
	 *            the target node
	 * @generated NOT
	 */
	private void createPropertyFromClassDefinitionToClassDefinition(
			GraphElement srcNode, GraphElement targetNode) {
		ClassDefinition sourceObject = (ClassDefinition) Utils
				.getElement(srcNode);
		ClassDefinition targetObject = (ClassDefinition) Utils
				.getElement(targetNode);

		EList edgeObjectList = sourceObject.getOwnedAttribute();
		for (Iterator it = edgeObjectList.iterator(); it.hasNext();) {
			Object obj = it.next();

			if (obj instanceof Property) {
				Property edgeObject = (Property) obj;

				if (!KermetaUtils.getDefault().isStandardType(
						edgeObject.getType())) {

					// Change : edgeObject.getType()
					if (targetObject.equals(((ParameterizedType) edgeObject
							.getType()).getTypeDefinition())
							&& sourceObject.equals(edgeObject.getOwningClass())
							&& sourceObject.getOwnedAttribute().contains(
									edgeObject)) {
						// check if the relation does not exists yet

						List existing = getExistingEdges(srcNode, targetNode,
								Property.class);
						if (!isAlreadyPresent(existing, edgeObject)) {
							// We use 2 CreationUtlis, one for the nodes and a
							// second for the edges
							// in order to permit to have 2 graphical elements
							// for
							// the same model object => Property
							ICreationUtils factory = null;

							// If the type of the property is not either a
							// StandardType or a PrimitiveType
							// then the given property will display like an edge
							factory = ((fr.irisa.triskell.kermeta.graphicaleditor.diag.StructureConfiguration) getModeler()
									.getActiveConfiguration())
									.getCreationUtilsEdge();

							// restore the link with its default presentation
							GraphElement edge = factory
									.createGraphElement(edgeObject);
							if (edge instanceof GraphEdge) {
								PropertyEdgeCreationCommand cmd = new PropertyEdgeCreationCommand(
										getEditDomain(), (GraphEdge) edge,
										srcNode, false);
								cmd.setTarget(targetNode);
								add(cmd);
							}
						}
					}
				}
			}
		}
	}
}