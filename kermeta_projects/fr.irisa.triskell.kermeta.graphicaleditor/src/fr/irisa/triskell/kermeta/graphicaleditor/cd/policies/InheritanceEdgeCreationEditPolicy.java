/*******************************************************************************
 * $Id: InheritanceEdgeCreationEditPolicy.java,v 1.7 2008-04-30 14:18:45 dvojtise Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.cd.policies;

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

import fr.irisa.triskell.kermeta.graphicaleditor.cd.KmSimpleObjectConstants;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.commands.InheritanceEdgeCreationCommand;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.StructurePackage;
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;

/**
 * Inheritance edge creation
 * 
 * @generated
 */
public class InheritanceEdgeCreationEditPolicy extends
		AbstractEdgeCreationEditPolicy {
	/**
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#createCommand(org.eclipse.gef.EditDomain,
	 *      org.topcased.modeler.di.model.GraphEdge,
	 *      org.topcased.modeler.di.model.GraphElement)
	 * @generated
	 */
	protected CreateTypedEdgeCommand createCommand(EditDomain domain,
			GraphEdge edge, GraphElement source) {
		return new InheritanceEdgeCreationCommand(domain, edge, source);
	}

	/**
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#checkEdge(org.topcased.modeler.di.model.GraphEdge)
	 * @generated
	 */
	protected boolean checkEdge(GraphEdge edge) {
		if (edge.getSemanticModel() instanceof SimpleSemanticModelElement) {
			return KmSimpleObjectConstants.SIMPLE_OBJECT_INHERITANCE
					.equals(((SimpleSemanticModelElement) edge
							.getSemanticModel()).getTypeInfo());
		}
		return false;
	}

	/**
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#checkSource(org.topcased.modeler.di.model.GraphElement)
	 * @generated
	 */
	protected boolean checkSource(GraphElement source) {
		EObject object = Utils.getElement(source);
		if (object instanceof fr.irisa.triskell.kermeta.language.structure.ClassDefinition) {
			return true;
		}
		return false;
	}

	/**
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#checkTargetForSource(org.topcased.modeler.di.model.GraphElement,
	 *      org.topcased.modeler.di.model.GraphElement)
	 * @generated NOT
	 */
	protected boolean checkTargetForSource(GraphElement source,
			GraphElement target) {
		EObject sourceObject = Utils.getElement(source);
		EObject targetObject = Utils.getElement(target);

		if (sourceObject instanceof ClassDefinition
				&& targetObject instanceof ClassDefinition) {

			// begin-addition
			// Prevent a cyclic inheritance
			if (!sourceObject.equals(targetObject)
					&& checkSuperTypeUnicity(sourceObject, targetObject)
					&& !ClassDefinitionHelper.isSuperClassOfByName(
							(ClassDefinition) sourceObject,
							(ClassDefinition) targetObject)) {
				return true;
			}
			// end-addition
		}
		return false;
	}

	/**
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#checkCommand(org.eclipse.gef.commands.Command)
	 * @generated
	 */
	protected boolean checkCommand(Command command) {
		return command instanceof InheritanceEdgeCreationCommand;
	}

	/**
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#getSourceTargetData(org.topcased.modeler.di.model.GraphElement,
	 *      org.topcased.modeler.di.model.GraphElement)
	 * @generated
	 */
	protected SourceTargetData getSourceTargetData(GraphElement source,
			GraphElement target) {
		EObject sourceObject = Utils.getElement(source);
		EObject targetObject = Utils.getElement(target);

		if (sourceObject instanceof fr.irisa.triskell.kermeta.language.structure.ClassDefinition
				&& targetObject instanceof fr.irisa.triskell.kermeta.language.structure.ClassDefinition) {
			return new SourceTargetData(
					false,
					false,
					SourceTargetData.NONE,
					"fr.irisa.triskell.kermeta.language.structure.ClassDefinition",
					null, null, null, null, null, null, null);
		}
		return null;
	}

	/**
	 * Constraint : Inheritance relation between two classes must be Unique : a
	 * class can only inherit once from another. This constraint is defined in
	 * "SuperType" property, as "isUnique=true" on it (in textual checking : see
	 * KMT2KMPass3 in fr.irisa.triskell.kermeta.io project.)
	 * 
	 * TODO This constraint should be generalizable to other properties. But yet
	 * it is very specific to SuperType
	 * 
	 * @param sourceObject
	 *            the inheriting classdefinition
	 * @param targetObject
	 *            the inherited classdefinition
	 * @return true if targetObject is not yet a supertype of sourceObject,
	 *         false otherwise. In particular, a "attribute"(reference, or
	 *         property...) must be uniquely represented in the ownedAttributes
	 *         properties of a class.
	 * @generated NOT
	 */
	protected boolean checkSuperTypeUnicity(EObject sourceObject,
			EObject targetObject) {
		Boolean isvalid = true;
		// we know here that we handle ClassDefinitions, so hard cast
		ClassDefinition sourceClassDef = (ClassDefinition) sourceObject;
		ClassDefinition targetClassDef = (ClassDefinition) targetObject;
		// is the inheritance relation unique?
		if (StructurePackage.eINSTANCE.getClassDefinition_SuperType()
				.isUnique()) {
			// check if an inheritance relation always exists between the 2
			// given classes
			if (ClassDefinitionHelper.isSuperClassOfByName(targetClassDef,
					sourceClassDef)) {
				isvalid = false;
			}
		}
		return isvalid;
	}

}