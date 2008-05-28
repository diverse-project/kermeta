

/*$Id: FoldingStrategyHelper.java,v 1.5 2008-05-28 09:25:06 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	FoldingStrategyHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 26 nov. 07
* Authors : paco
*/

package org.kermeta.texteditor.folding;

import org.kermeta.texteditor.KermetaTextEditor;

import antlr.RecognitionException;
import antlr.TokenStreamException;

public class FoldingStrategyHelper {

	static public void updateFoldingPositions(KermetaTextEditor editor, String document) throws RecognitionException, TokenStreamException {
		/*CompUnit compUnit = ASTHelper.parseString( document );
		List<Position> positions = new ArrayList<Position> ();
		FoldingVisitor visitor = new FoldingVisitor(positions);
		compUnit.accept(visitor);
		editor.updateFoldingStructure(positions);*/
	}
	
}


