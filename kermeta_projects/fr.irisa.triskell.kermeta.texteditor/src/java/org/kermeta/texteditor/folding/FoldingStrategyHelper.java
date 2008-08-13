

/*$Id: FoldingStrategyHelper.java,v 1.7 2008-08-13 15:27:00 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	FoldingStrategyHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 26 nov. 07
* Authors : paco
*/

package org.kermeta.texteditor.folding;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.Position;
import org.kermeta.texteditor.KermetaTextEditor;

import antlr.RecognitionException;
import antlr.TokenStreamException;
import fr.irisa.triskell.kermeta.modelhelper.ASTHelper;
import fr.irisa.triskell.kermeta.parser.gen.ast.CompUnit;

public class FoldingStrategyHelper {

	static public void updateFoldingPositions(KermetaTextEditor editor, String document) throws RecognitionException, TokenStreamException {
		try {
			CompUnit compUnit = ASTHelper.parseString( document );
		
			List<Position> positions = new ArrayList<Position> ();
			FoldingVisitor visitor = new FoldingVisitor(positions);
			compUnit.accept(visitor);
			editor.updateFoldingStructure(positions);
		} catch(antlr.RecognitionException e){
			// do nothing if failed to parse this 
		}
		
	}
	
}


