/* $Id: ExtendedPropertyEdgeCreationEditPolicy.java,v 1.3 2006-03-29 08:55:38 zdrey Exp $
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
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies.PropertyEdgeCreationEditPolicy;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.KermetaUtils;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.StructurePackage;

/**
 * What to do with this class :
 * Instead of instanciating InheritanceEdgeCreationEditPolicy in ClassDefinitionEditPart, 
 * instanciate this one, in ClassDefinitionEditPart class, in createEditPolicies
 * @author zdrey
 *
 */
public class ExtendedPropertyEdgeCreationEditPolicy extends
		PropertyEdgeCreationEditPolicy {

	public ExtendedPropertyEdgeCreationEditPolicy() {
		super();
	}
	
	
	protected boolean checkTargetForSource(GraphNode source, GraphNode target) {
		EObject sourceObject = Utils.getElement(source);
		EObject targetObject = Utils.getElement(target);

		if (sourceObject instanceof fr.irisa.triskell.kermeta.language.structure.ClassDefinition
				&& targetObject instanceof fr.irisa.triskell.kermeta.language.structure.ClassDefinition) {
			if (checkOwnedAttributesConstraints(sourceObject, targetObject)==false)
				return false;
			if (!sourceObject.equals(targetObject)
			) {
				return true;
			}
		}
		else
		{
			System.err.println("Y a un problem");
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
	protected boolean checkOwnedAttributesConstraints(EObject sourceObject, EObject targetObject)
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


	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies.InheritanceEdgeCreationEditPolicy#checkEdge(org.topcased.modeler.di.model.GraphEdge)
	 */
	@Override
	protected boolean checkEdge(GraphEdge edge) {
		// TODO Auto-generated method stub
		return super.checkEdge(edge);
	}


	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies.InheritanceEdgeCreationEditPolicy#checkSource(org.topcased.modeler.di.model.GraphNode)
	 */
	@Override
	protected boolean checkSource(GraphElement source) {
		// TODO Auto-generated method stub
		return super.checkSource(source);
	}
	
	


}
