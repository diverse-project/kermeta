/* $Id: KMT2KMPass1.java,v 1.8 2006-08-09 13:44:38 dvojtise Exp $
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
	
	protected KermetaUnit currentImportedUnit;
	protected boolean isExcludeFilter;
	
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
			currentImportedUnit = builder.importModelFromID(qualifiedIDAsString((QualifiedID)node)); 
			builder.traceImportedUnits.put(
					currentImportedUnit,
					node);
		}
		else {
			String uri = ((StringLiteralContainer)node).getString_literal().getText();
			uri = uri.substring(1, uri.length()-1);
			currentImportedUnit = builder.importModelFromURI(uri);
			builder.traceImportedUnits.put(
					currentImportedUnit, 
					node);
		}
		isExcludeFilter= true;
		if(importStmt.getExcludeFilter() != null)
			visit(importStmt.getExcludeFilter().getFilters());
		isExcludeFilter = false;
		if(importStmt.getIncludeFilter() != null)
			visit(importStmt.getIncludeFilter().getFilters());
		return false;
	}
	
	public boolean beginVisit(Filter filter) {
		String filterText = filter.getString_literal().getText();
		// trim leading and trailing "
		filterText = filterText.substring(1, filterText.length()-2);
		if (isExcludeFilter) currentImportedUnit.excludeFilters.add(filterText);
		else currentImportedUnit.includeFilters.add(filterText);
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
