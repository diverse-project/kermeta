/* $Id : $
 * Created on 17 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 * Description : 
 * 		A class that transforms all the classes defined in kermeta model to abstract classes.
 */
package fr.irisa.triskell.kermeta.dev.framework;

import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class MakeAbstractClass extends KermetaVisitor {

	/**
	 * 
	 */
	public MakeAbstractClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.structure.FClassDefinition)
	 */
	public Object visit(FClassDefinition arg0) {
		arg0.setFIsAbstract(true);
		return super.visit(arg0);
	}
	/**
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.structure.FOperation)
	 */
	public Object visit(FOperation arg0) {
		if (arg0.getFBody() == null) arg0.setFIsAbstract(true);
		return null ;
	}
}
