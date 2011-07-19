package org.kermeta.language.texteditor.eclipse.internal.autocompletion;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.custom.VerifyKeyListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.graphics.Point;

public class BracketInserter implements VerifyKeyListener {

	private ISourceViewer sourceViewer = null;
	
	public BracketInserter(ISourceViewer sourceViewer) {
		this.sourceViewer = sourceViewer;
	}

	@Override
	public void verifyKey(VerifyEvent event) {
		if (!event.doit)
			return;
		switch (event.character) {
			case '(':
			case '[':
			case '{':
			case '\"':
				break;
			default:
				return;
		}
		
		
		if (sourceViewer.getDocument() != null) {
			try {
				StringBuffer completeText = new StringBuffer(sourceViewer.getDocument().get());
				final Point selection= sourceViewer.getSelectedRange();
				final int offset= selection.x;
				final int length= selection.y;
				
				if (event.character == '{') {		
					if (countCouple(completeText,'{','}') == 0) {
						sourceViewer.getDocument().replace(offset, length, "}");
					}
				}
				if (event.character == '[') {			
					if (countCouple(completeText,'[',']') == 0) {
						sourceViewer.getDocument().replace(offset, length, "]");
					}
				}
				if (event.character == '\"') {			
					if ((countCouple(completeText,'"','\0') % 2) == 0){
						sourceViewer.getDocument().replace(offset, length, "\"");
					}
				}
				if (event.character == '(') {			
					if (countCouple(completeText,'(',')') == 0){
						sourceViewer.getDocument().replace(offset, length, ")");
					}
				}
			} catch (BadLocationException e) {
			}
		}
		
	}
	
	/**
	 * Count the number of couple open close
	 * @param complete text to analyze
	 * @param open open character
	 * @param close close character
	 * @return 0 if equals, negative if more close, positive if more open
	 */
	private int countCouple(StringBuffer complete, char open, char close) {
		
		int numberOpen = 0;
		int numberClose = 0;
		
		for (int i=0;i<complete.length();i++) {
			if (complete.charAt(i) == open) {
				numberOpen++;
			}
			if (complete.charAt(i) == close) {
				numberClose++;
			}
		}
		
		return numberOpen - numberClose;
	}
	
}
