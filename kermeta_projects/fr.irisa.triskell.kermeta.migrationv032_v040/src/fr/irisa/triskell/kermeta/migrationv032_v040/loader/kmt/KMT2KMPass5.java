/*
 * Created on 5 f�vr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.migrationv032_v040.loader.kmt;

import org.kermeta.io.KermetaUnit;
import org.kermeta.loader.LoadingContext;

import fr.irisa.triskell.kermeta.ast.ClassDecl;


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
	public KMT2KMPass5(KermetaUnit builder, LoadingContext context) {
		super(builder, context);
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ClassDecl)
	 */
	public boolean beginVisit(ClassDecl classDecl) {
		return false;
	}
}
