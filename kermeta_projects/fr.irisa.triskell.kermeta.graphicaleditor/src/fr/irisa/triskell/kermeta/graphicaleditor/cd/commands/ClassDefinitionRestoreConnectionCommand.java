/*******************************************************************************
 * $Id: ClassDefinitionRestoreConnectionCommand.java,v 1.5 2008-02-14 15:53:47 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.cd.commands;

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

import fr.irisa.triskell.kermeta.graphicaleditor.cd.KmSimpleObjectConstants;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;

import fr.irisa.triskell.kermeta.language.structure.ParameterizedType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.modelhelper.TypeHelper;
import fr.irisa.triskell.kermeta.util.KermetaCommonUtils;

/**
 * ClassDefinition restore connection command
 * 
 * @generated
 */
public class ClassDefinitionRestoreConnectionCommand extends
		AbstractRestoreConnectionCommand {
	/**
	 * @param part the EditPart that is restored
	 * @generated
	 */
	public ClassDefinitionRestoreConnectionCommand(EditPart part) {
		super(part);
	}

	/**
	 * @see org.topcased.modeler.commands.AbstractRestoreConnectionCommand#initializeCommands()
	 * @generated
	 */
	protected void initializeCommands() {

		GraphElement elt = getGraphElement();
		EObject eltObject = Utils.getElement(elt);

		if (eltObject instanceof ClassDefinition) {
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
					boolean autoRef = obj.equals(elt);
					GraphElement elt2 = (GraphElement) obj;
					EObject eltObject2 = Utils.getElement(elt2);
					if (eltObject2 instanceof ClassDefinition) {
						if (autoRef) {
							// autoRef not allowed
						} else {
							// if the elt is the source of the edge or if it is the target and that the SourceTargetCouple is reversible
							createInheritanceFromClassDefinitionToClassDefinition(
									elt, elt2);
							// if elt is the target of the edge or if it is the source and that the SourceTargetCouple is reversible
							createInheritanceFromClassDefinitionToClassDefinition(
									elt2, elt);
						}
					}

					if (eltObject2 instanceof ClassDefinition) {
						if (autoRef) {
							createPropertyFromClassDefinitionToClassDefinition(
									elt, elt);
						} else {
							// if the elt is the source of the edge or if it is the target and that the SourceTargetCouple is reversible
							createPropertyFromClassDefinitionToClassDefinition(
									elt, elt2);
							// if elt is the target of the edge or if it is the source and that the SourceTargetCouple is reversible
							createPropertyFromClassDefinitionToClassDefinition(
									elt2, elt);
						}
					}

				}
			}
		}
	}

	/**
	 * @param srcElt the source element
	 * @param targetElt the target element
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
					KmSimpleObjectConstants.SIMPLE_OBJECT_INHERITANCE).size() == 0) {
				GraphEdge edge = Utils
						.createGraphEdge(KmSimpleObjectConstants.SIMPLE_OBJECT_INHERITANCE);
				InheritanceEdgeCreationCommand cmd = new InheritanceEdgeCreationCommand(
						null, edge, srcNode, false);
				cmd.setTarget(targetNode);
				add(cmd);
			}
		}
	}

	/**
	 * @param srcElt the source element
	 * @param targetElt the target element
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

				if (!TypeHelper.isStandardType(edgeObject.getType())
						&& !TypeHelper.isPrimitiveType(edgeObject.getType())) {

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

							// If the type of the property is not a StandardType
							// then the given property will display like an edge
							factory = ((fr.irisa.triskell.kermeta.graphicaleditor.cd.KmConfiguration) getModeler()
									.getActiveConfiguration())
									.getCreationUtils();

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