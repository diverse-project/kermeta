/* $Id: ExtendedPropertyEdgeCreationEditPolicy.java,v 1.1 2006-03-07 17:30:33 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.graphicaleditor (First iteration)
 * File      : extendedInheritanceEdgeCreationEditPolicy.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mar 3, 2006
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies.extension;

import org.eclipse.emf.ecore.EObject;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.policies.InheritanceCreationEditPolicy;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies.InheritanceEdgeCreationEditPolicy;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.KermetaUtils;
import fr.irisa.triskell.kermeta.language.structure.*;

/**
 * What to do with this class :
 * Instead of instanciating InheritanceEdgeCreationEditPolicy in ClassDefinitionEditPart, 
 * instanciate this one, in ClassDefinitionEditPart class, in createEditPolicies
 * @author zdrey
 *
 */
public class ExtendedPropertyEdgeCreationEditPolicy extends
		InheritanceEdgeCreationEditPolicy {

	public ExtendedPropertyEdgeCreationEditPolicy() {
		super();
	}
	
	
	protected boolean checkTargetForSource(GraphNode source, GraphNode target) {
		EObject sourceObject = Utils.getElement(source);
		EObject targetObject = Utils.getElement(target);

		if (sourceObject instanceof fr.irisa.triskell.kermeta.language.structure.ClassDefinition
				&& targetObject instanceof fr.irisa.triskell.kermeta.language.structure.ClassDefinition) {
			if (checkFOwnedAttributesConstraints(sourceObject, targetObject)==false)
				return false;
			if (!sourceObject.equals(targetObject)
			) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * Check the constraints related to the SuperType property of a class definition.
	 * TODO This constraint should be generalizable to other properties. But yet it is very
	 * specific to FOwnedAttributes (but very similar to checkSuperTypeConstraints, in
	 * ExtendedInheritanceEdgeCreationEditPolicy ).
	 * @param sourceObject the inheriting classdefinition
	 * @param targetObject the inherited classdefinition
	 * @return true if the constraints are verified, false otherwise. In particular, a "attribute"(reference,
	 * or property...) must be uniquely represented in the ownedAttributes properties of a class. 
	 */
	protected boolean checkFOwnedAttributesConstraints(EObject sourceObject, EObject targetObject)
	{
		Boolean isvalid = true;
		// we know here that we handle ClassDefinitions, so hard cast
		ClassDefinition src_cdef = (ClassDefinition)sourceObject;
		ClassDefinition tgt_cdef = (ClassDefinition)targetObject;
		// is the inheritance relation unique? 
		if (StructurePackage.eINSTANCE.getClassDefinition_OwnedAttribute().isUnique())
		{
			if (KermetaUtils.getDefault().existsPropertyBetweenClassDefinitions(src_cdef, tgt_cdef))
				isvalid = false;
		}
		return isvalid;
	}
	
	


}
