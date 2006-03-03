/* $Id$
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
import fr.irisa.triskell.kermeta.structure.*;

/**
 * What to do with this class :
 * Instead of instanciating InheritanceEdgeCreationEditPolicy in FClassDefinitionEditPart, 
 * instanciate this one.
 * @author zdrey
 *
 */
public class ExtendedFPropertyEdgeCreationEditPolicy extends
		InheritanceEdgeCreationEditPolicy {

	public ExtendedFPropertyEdgeCreationEditPolicy() {
		super();
	}
	
	
	protected boolean checkTargetForSource(GraphNode source, GraphNode target) {
		EObject sourceObject = Utils.getElement(source);
		EObject targetObject = Utils.getElement(target);

		if (sourceObject instanceof fr.irisa.triskell.kermeta.structure.FClassDefinition
				&& targetObject instanceof fr.irisa.triskell.kermeta.structure.FClassDefinition) {
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
	 * Check the constraints related to the FSuperType property of a class definition.
	 * TODO This constraint should be generalizable to other properties. But yet it is very
	 * specific to FOwnedAttributes (but very similar to checkFSuperTypeConstraints, in
	 * ExtendedInheritanceEdgeCreationEditPolicy ).
	 * @param sourceObject the inheriting classdefinition
	 * @param targetObject the inherited classdefinition
	 * @return true if the constraints are verified, false otherwise. In particular, a "attribute"(reference,
	 * or property...) must be uniquely represented in the ownedAttributes properties of a class. 
	 */
	protected boolean checkFOwnedAttributesConstraints(EObject sourceObject, EObject targetObject)
	{
		boolean isvalid = true;
		// we know here that we handle FClassDefinitions, so hard cast
		FClassDefinition src_cdef = (FClassDefinition)sourceObject;
		FClassDefinition tgt_cdef = (FClassDefinition)targetObject;
		// is the inheritance relation unique? 
		if (StructurePackage.eINSTANCE.getFClassDefinition_FOwnedAttributes().isUnique())
		{
			if (KermetaUtils.getDefault().isContainedFSuperTypeInFClassDefinition(src_cdef, tgt_cdef))
				isvalid = false;
		}
		return isvalid;
	}
	
	


}
