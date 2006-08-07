/* $Id: KMT2KMPass1.java,v 1.7 2006-08-07 15:45:21 zdrey Exp $
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
	
	protected Boolean existUsing = false;
	
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
			builder.traceImportedUnits.put(
					builder.importModelFromID(qualifiedIDAsString((QualifiedID)node)),
					node);
		}
		else {
			String uri = ((StringLiteralContainer)node).getString_literal().getText();
			uri = uri.substring(1, uri.length()-1);
			builder.traceImportedUnits.put(
					builder.importModelFromURI(uri), 
					node);
		}
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.UsingStmt)
	 */
	public boolean beginVisit(UsingStmt usingStmt) {
		builder.addUsing(qualifiedIDAsString(usingStmt.getName()));
		existUsing = true;
		return false;
	}
	
	/**
	 * @see fr.irisa.triskell.kermeta.ast.KermetaASTNodeVisitor#beginVisit(fr.irisa.triskell.kermeta.ast.TopLevelDecls)
	 */
	public boolean beginVisit(TopLevelDecls decls)
	{
		if (decls.getChildCount()== 0 && existUsing == true)
			builder.messages.addError(
			"PASS 1 : Either 'using' declaration is misplaced (should be put after 'require'), " +
			"or there is a 'using' declaration, but no element defined in your file.", null);
		return super.beginVisit(decls);
	}
	
}
