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

package fr.irisa.triskell.kermeta.graphicaleditor.diag;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.topcased.modeler.ModelerPropertyConstants;
import org.topcased.modeler.di.model.Diagram;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.di.model.SimpleSemanticModelElement;
import org.topcased.modeler.di.model.util.DIUtils;
import org.topcased.modeler.edit.EListEditPart;
import org.topcased.modeler.edit.EMFGraphEdgeEditPart;
import org.topcased.modeler.edit.EMFGraphNodeEditPart;
import org.topcased.modeler.edit.GraphEdgeEditPart;
import org.topcased.modeler.edit.GraphNodeEditPart;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.diag.edit.ClassDefinitionEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.diag.edit.InheritanceEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.diag.edit.OperationEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.diag.edit.PackageEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.diag.edit.PropertyEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.diag.edit.PropertyNodeEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.diag.edit.StructureDiagramEditPart;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.util.StructureSwitch;

/**
 * Part Factory : associates a model object to its controller. <br>
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureEditPartFactory implements EditPartFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gef.EditPartFactory#createEditPart(org.eclipse.gef.EditPart,java.lang.Object)
	 * @generated NOT
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof Diagram) {
			return new StructureDiagramEditPart((Diagram) model);
		} else if (model instanceof GraphNode) {
			final GraphNode node = (GraphNode) model;
			EObject element = Utils.getElement(node);
			if (element != null) {
				Object editPart = new StructureSwitch() {
					public Object casePackage(Package object) {
						return new PackageEditPart(node);
					}

					public Object caseClassDefinition(ClassDefinition object) {
						String feature = DIUtils
								.getPropertyValue(
										node,
										ModelerPropertyConstants.ESTRUCTURAL_FEATURE_ID);
						if (!"".equals(feature)) {
							int featureID = Integer.parseInt(feature);
							return new EListEditPart(node, object.eClass()
									.getEStructuralFeature(featureID));
						} else {
							return new ClassDefinitionEditPart(node);
						}
					}
					
					public Object caseProperty(Property object) {
						return new PropertyNodeEditPart(node);
					}

					public Object caseOperation(Operation object) {
						return new OperationEditPart(node);
					}

					public Object defaultCase(EObject object) {
						return new EMFGraphNodeEditPart(node);
					}
				}.doSwitch(element);

				return (EditPart) editPart;
			}

			if (node.getSemanticModel() instanceof SimpleSemanticModelElement) {
			}
			return new GraphNodeEditPart(node);
		} else if (model instanceof GraphEdge) {
			final GraphEdge edge = (GraphEdge) model;
			EObject element = Utils.getElement(edge);
			if (element != null) {
				Object editPart = new StructureSwitch() {
					public Object caseProperty(Property object) {
						return new PropertyEditPart(edge);
					}

					public Object defaultCase(EObject object) {
						return new EMFGraphEdgeEditPart(edge);
					}
				}.doSwitch(element);

				return (EditPart) editPart;
			}

			if (edge.getSemanticModel() instanceof SimpleSemanticModelElement) {
				if (StructureSimpleObjectConstants.SIMPLE_OBJECT_INHERITANCE
						.equals(((SimpleSemanticModelElement) edge
								.getSemanticModel()).getTypeInfo()))
					return new InheritanceEditPart(edge);
			}

			return new GraphEdgeEditPart((GraphEdge) model);
		}

		throw new IllegalStateException(
				"No edit part matches with the '"
						+ model.getClass().getName()
						+ "' model element. Check StructureEditPartFactory#createEditPart(EditPart,Object) class");
	}

}