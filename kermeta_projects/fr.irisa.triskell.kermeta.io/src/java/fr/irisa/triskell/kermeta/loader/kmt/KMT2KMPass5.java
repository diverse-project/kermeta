/*
 * Created on 5 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import fr.irisa.triskell.kermeta.ast.ClassDecl;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 * 
 * This pass is just a check pass.
 * 
 * TODO : check that property opposites match
 * TODO : check name operation name uniqness for each class 
 * 
 */
public class KMT2KMPass5 extends KMT2KMPass {

	/**
	 * @param builder
	 */
	public KMT2KMPass5(KermetaUnit builder) {
		super(builder);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ClassDecl)
	 */
	public boolean beginVisit(ClassDecl classDecl) {
		return false;
	}
}
