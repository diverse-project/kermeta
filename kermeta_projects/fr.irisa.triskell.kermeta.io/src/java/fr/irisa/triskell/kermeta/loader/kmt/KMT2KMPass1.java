/* $Id: KMT2KMPass1.java,v 1.3 2005-04-05 15:07:23 zdrey Exp $
 * Project : Kermeta (First iteration)
 * File : KMT2KMPass1.java
 * License : GPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 2, 2005
 * Author : Franck Fleurey <ffleurey@irisa.fr>
 * Description :
 * 	This is the first pass aimed at consqtructing the complete kcore representation of 
 * a Kermeta program. It collects import and usings and update the KermetaUnit attribute
 * importedUnits.
 */
package fr.irisa.triskell.kermeta.loader.kmt;


import fr.irisa.triskell.kermeta.ast.*;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;


/**
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
