

/*$Id: FoldingVisitor.java,v 1.1 2007-12-17 14:05:12 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	FoldingVisitor.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 23 nov. 07
* Authors : paco
*/

package org.kermeta.texteditor.folding;

import java.util.List;

import org.eclipse.jface.text.Position;

import fr.irisa.triskell.kermeta.ast.ClassDecl;
import fr.irisa.triskell.kermeta.ast.ContextMultiLineComment;
import fr.irisa.triskell.kermeta.ast.KermetaASTNodeVisitor;
import fr.irisa.triskell.kermeta.ast.Operation;
import fr.irisa.triskell.kermeta.ast.ScompUnit;

public class FoldingVisitor extends KermetaASTNodeVisitor {

	private List<Position> positions = null;
	
	public FoldingVisitor(List<Position> positions) {
		this.positions = positions;
	}
	
	@Override
	public boolean beginVisit(ScompUnit scompUnit) {
		if ( scompUnit.getImportStmts().getChildCount() > 1 ) {
			int offset = scompUnit.getImportStmts().getRangeStart();
			int length = scompUnit.getImportStmts().getRangeLength();
			positions.add( new Position(offset, length) );
		}
		
		if ( scompUnit.getUsingStmts().getChildCount() > 1 ) {
			int offset = scompUnit.getUsingStmts().getRangeStart();
			int length = scompUnit.getUsingStmts().getRangeLength();
			positions.add( new Position(offset, length) );
		}
		return true;
	}
	
	@Override
	public boolean beginVisit(ContextMultiLineComment contextMultiLineComment) {
		int offset = contextMultiLineComment.getContext_multi_line_comment().getOffset();
		int length = contextMultiLineComment.getContext_multi_line_comment().getTextLength();
		positions.add( new Position(offset, length) );
		return true;
	}
	
	@Override
	public boolean beginVisit(Operation operation) {
		int offset = operation.getOperationKind().getOffset();
		int length = operation.getRangeLength();
		positions.add( new Position(offset, length) );
		return true;
	}
	
	@Override
	public boolean beginVisit(ClassDecl classDecl) {
		int offset = classDecl.getClassKind().getOffset();
		int length = classDecl.getRangeLength();
		positions.add( new Position(offset, length) );
		return true;
	}
	
}


