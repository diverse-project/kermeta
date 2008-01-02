/* $Id : $
 * Created on 17 f�vr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 * Description : 
 * 		A class that transforms all the classes defined in kermeta model to abstract classes.
 */
package fr.irisa.triskell.kermeta.dev.framework;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the EPL license
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
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.structure.ClassDefinition)
	 */
	public Object visit(ClassDefinition arg0) {
		arg0.setIsAbstract(true);
		return super.visit(arg0);
	}
	/**
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.structure.FOperation)
	 */
	public Object visit(Operation arg0) {
		if (arg0.getBody() == null) arg0.setIsAbstract(true);
		return null ;
	}
}
