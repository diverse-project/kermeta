

/*$Id: ConstraintHelper.java,v 1.3 2008-04-28 11:50:14 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.model
* File : 	ConstraintHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 déc. 07
* Authors : paco
*/

package org.kermeta.model.internal;

import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.ConstraintType;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;

public class ConstraintHelper {

	static public Constraint createInvariant(String name) {
		assert( name != null );
		Constraint constraint = StructureFactory.eINSTANCE.createConstraint();
		constraint.setName(name);
		constraint.setStereotype(ConstraintType.INV_LITERAL);
		return constraint;
	}
	
	static public Constraint createPrecondition(String name) {
		assert( name != null );
		Constraint constraint = StructureFactory.eINSTANCE.createConstraint();
		constraint.setName(name);
		constraint.setStereotype(ConstraintType.PRE_LITERAL);
		return constraint;
	}
	
	static public Constraint createPostcondition(String name) {
		assert( name != null );
		Constraint constraint = StructureFactory.eINSTANCE.createConstraint();
		constraint.setName(name);
		constraint.setStereotype(ConstraintType.POST_LITERAL);
		return constraint;
	}
	
}


