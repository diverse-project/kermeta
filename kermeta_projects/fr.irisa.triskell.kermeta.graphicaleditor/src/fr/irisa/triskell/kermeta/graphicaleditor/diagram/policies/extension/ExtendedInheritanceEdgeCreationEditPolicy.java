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
public class ExtendedInheritanceEdgeCreationEditPolicy extends
		InheritanceEdgeCreationEditPolicy {

	public ExtendedInheritanceEdgeCreationEditPolicy() {
		super();
	}
	
	protected boolean checkTargetForSource(GraphNode source, GraphNode target) {
		EObject sourceObject = Utils.getElement(source);
		EObject targetObject = Utils.getElement(target);

		if (sourceObject instanceof fr.irisa.triskell.kermeta.structure.FClassDefinition
				&& targetObject instanceof fr.irisa.triskell.kermeta.structure.FClassDefinition) {
			if (checkFSuperTypeConstraints(sourceObject, targetObject)==false)
				return false;
			if (!sourceObject.equals(targetObject)
			) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Constraint : Inheritance relation between two classes must be Unique :
	 * a class can only inherit once from another.
	 * This constraint is defined in "fSuperType" property, as "isUnique=true" on it
	 * (in textual checking : see KMT2KMPass3 in fr.irisa.triskell.kermeta.io project.)
	 * 
	 * TODO This constraint should be generalizable to other properties. But yet it is very
	 * specific to FSuperType
	 * @param sourceObject the inheriting classdefinition
	 * @param targetObject the inherited classdefinition
	 * @return true if the constraints are verified, false otherwise. In particular, a "attribute"(reference,
	 * or property...) must be uniquely represented in the ownedAttributes properties of a class.
	 */
	protected boolean checkFSuperTypeConstraints(EObject sourceObject, EObject targetObject)
	{
		boolean isvalid = true;
		// we know here that we handle FClassDefinitions, so hard cast
		FClassDefinition src_cdef = (FClassDefinition)sourceObject;
		FClassDefinition tgt_cdef = (FClassDefinition)targetObject;
		// is the inheritance relation unique? 
		if (StructurePackage.eINSTANCE.getFClassDefinition_FSuperType().isUnique())
		{
			if (KermetaUtils.getDefault().isContainedFSuperTypeInFClassDefinition(src_cdef, tgt_cdef))
				isvalid = false;
		}
		return isvalid;
	}
	
	


}
