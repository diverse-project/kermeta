/*
 * Created on 2 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt;


import fr.irisa.triskell.kermeta.ast.*;

import com.sun.corba.se.internal.orbutil.resources.sunorb;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;


/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 * 
 * PASS 1 : Collect imports and usings
 */
public class KMT2KMPass1 extends KMT2KMPass {
	
	/**
	 * @param builder
	 */
	public KMT2KMPass1(KermetaUnit builder) {
		super(builder);
	}
	
	
	public boolean beginVisit(PackageDecl node) {
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ImportStmt)
	 */
	public boolean beginVisit(ImportStmt importStmt) {
		StringLiteralOrQualifiedID node = importStmt.getUri();
		if (node instanceof QualifiedID) {
			builder.importModelFromID(qualifiedIDAsString((QualifiedID)node));
		}
		else {
			String uri = ((StringLiteralContainer)node).getString_literal().getText();
			uri = uri.substring(1, uri.length()-1);
			builder.importModelFromURI(uri);
		}
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.UsingStmt)
	 */
	public boolean beginVisit(UsingStmt usingStmt) {
		builder.addUsing(qualifiedIDAsString(usingStmt.getName()));
		return false;
	}
	
}
