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

package fr.irisa.triskell.kermeta.graphicaleditor.diag.policies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.commands.Command;
import org.topcased.modeler.commands.CreateTypedEdgeCommand;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.di.model.SimpleSemanticModelElement;
import org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy;
import org.topcased.modeler.utils.SourceTargetData;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.diag.StructureSimpleObjectConstants;
import fr.irisa.triskell.kermeta.graphicaleditor.diag.commands.InheritanceEdgeCreationCommand;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.StructurePackage;
import fr.irisa.triskell.kermeta.util.KermetaCommonUtils;

/**
 * Inheritance edge creation <br>
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InheritanceEdgeCreationEditPolicy extends
		AbstractEdgeCreationEditPolicy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#createCommand(org.eclipse.gef.EditDomain, org.topcased.modeler.di.model.GraphEdge, org.topcased.modeler.di.model.GraphElement)
	 * @generated
	 */
	protected CreateTypedEdgeCommand createCommand(EditDomain domain,
			GraphEdge edge, GraphElement source) {
		return new InheritanceEdgeCreationCommand(domain, edge, source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#checkEdge(org.topcased.modeler.di.model.GraphEdge)
	 * @generated
	 */
	protected boolean checkEdge(GraphEdge edge) {
		if (edge.getSemanticModel() instanceof SimpleSemanticModelElement) {
			return (StructureSimpleObjectConstants.SIMPLE_OBJECT_INHERITANCE
					.equals(((SimpleSemanticModelElement) edge
							.getSemanticModel()).getTypeInfo()));
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#checkSource(org.topcased.modeler.di.model.GraphElement)
	 * @generated
	 */
	protected boolean checkSource(GraphElement source) {
		EObject object = Utils.getElement(source);
		if (object instanceof ClassDefinition) {
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#checkTargetForSource(org.topcased.modeler.di.model.GraphElement, org.topcased.modeler.di.model.GraphElement)
	 * @generated NOT
	 */
	protected boolean checkTargetForSource(GraphElement source,
			GraphElement target) {
		EObject sourceObject = Utils.getElement(source);
		EObject targetObject = Utils.getElement(target);

		if (sourceObject instanceof ClassDefinition
				&& targetObject instanceof ClassDefinition) {
			
			// begin-addition
			if (!checkSuperTypeConstraints(sourceObject, targetObject)) {
				return false;
			}
			// end-addition
			
			if (!sourceObject.equals(targetObject)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#checkCommand(org.eclipse.gef.commands.Command)
	 * @generated
	 */
	protected boolean checkCommand(Command command) {
		return command instanceof InheritanceEdgeCreationCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#getSourceTargetData(org.topcased.modeler.di.model.GraphElement, org.topcased.modeler.di.model.GraphElement)
	 * @generated
	 */
	protected SourceTargetData getSourceTargetData(GraphElement source,
			GraphElement target) {
		EObject sourceObject = Utils.getElement(source);
		EObject targetObject = Utils.getElement(target);

		if (sourceObject instanceof ClassDefinition
				&& targetObject instanceof ClassDefinition) {
			return new SourceTargetData(
					false,
					false,
					1,
					"fr.irisa.triskell.kermeta.language.structure.ClassDefinition",
					"ownedAttribute", null, null, null, null, null, null);
		}
		return null;
	}

	/**
	 * Constraint : Inheritance relation between two classes must be Unique :
	 * a class can only inherit once from another.
	 * This constraint is defined in "fSuperType" property, as "isUnique=true" on it
	 * (in textual checking : see KMT2KMPass3 in fr.irisa.triskell.kermeta.io project.)
	 * 
	 * TODO This constraint should be generalizable to other properties. But yet it is very
	 * specific to SuperType
	 * @param sourceObject the inheriting classdefinition
	 * @param targetObject the inherited classdefinition
	 * @return true if targetObject is not yet a supertype of sourceObject, false otherwise. In particular, a "attribute"(reference,
	 * or property...) must be uniquely represented in the ownedAttributes properties of a class.
	 * @generated NOT
	 */
	protected boolean checkSuperTypeConstraints(EObject sourceObject, EObject targetObject)
	{
		Boolean isvalid = true;
		// we know here that we handle ClassDefinitions, so hard cast
		ClassDefinition sourceClassDef = (ClassDefinition)sourceObject;
		ClassDefinition targetClassDef = (ClassDefinition)targetObject;
		// is the inheritance relation unique? 
		if (StructurePackage.eINSTANCE.getClassDefinition_SuperType().isUnique())
		{
			// check if an inheritance relation always exists between the 2 given classes
			if (KermetaCommonUtils.isSuperType(sourceClassDef, targetClassDef))
				isvalid = false;
		}
		return isvalid;
	}
}