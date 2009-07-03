

/*$Id: RequireFormattingStrategy.java,v 1.1 2007-12-17 14:05:06 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	KermetaFormattingStrategy.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 11 déc. 07
* Authors : paco
*/

package org.kermeta.texteditor.formatting;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TypedPosition;
import org.eclipse.jface.text.formatter.ContextBasedFormattingStrategy;
import org.eclipse.jface.text.formatter.FormattingContextProperties;
import org.eclipse.jface.text.formatter.IFormattingContext;

public class RequireFormattingStrategy extends ContextBasedFormattingStrategy {

	private TypedPosition typedPosition = null;
	
	private IDocument document = null;
	
	@Override
	public String format(String content, boolean start, String indentation, int[] positions) {
		return super.format(content, start, indentation, positions);
	}
	
	@Override
	public void formatterStarts(IFormattingContext context) {
		typedPosition = (TypedPosition) context.getProperty(FormattingContextProperties.CONTEXT_PARTITION);
		document = (IDocument) context.getProperty(FormattingContextProperties.CONTEXT_MEDIUM);
	}
	
	@Override
	public void formatterStarts(String indentation) {
		// TODO Auto-generated method stub
		super.formatterStarts(indentation);
	}
	
	@Override
	public void format() {
		int offset = typedPosition.getOffset();
		
		try {
			char c;
			int index = offset-1;
			boolean goOn = true;
			while ( goOn ) {
				c = document.getChar(index);
				if ( (c == ' ') || (c == '\t') )
					goOn = false;
				else
					index--;
			}
			
			document.replace(index, offset-index, "");
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void formatterStops() {
		super.formatterStops();
		typedPosition = null;
		document = null;
	}
	
}


