/* $Id: KMTTextListener.java,v 1.3 2007-06-27 12:59:08 cfaucher Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : KMTTextListener.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 04 apr. 2007
* Author : ftanguy (ftanguy@irisa.fr)
*/

package fr.irisa.triskell.kermeta.texteditor.editors;

import org.eclipse.jface.text.ITextListener;
import org.eclipse.jface.text.TextEvent;

public class KMTTextListener implements ITextListener {

	private KMTEditor editor;

	public KMTTextListener(KMTEditor editor) {
		this.editor = editor;
	}
	
	public void textChanged(TextEvent event) {
		editor.setCurrentContent( editor.getFileContent() );
		/*if ( ! editor.getMustBeTypechecked() ) {
			if (event.getText().equals(" ") || event.getText().equals("\n") || event.getText().equals("\t") || event.getText().equals("") ) {
				int offset = event.getOffset();
				int before = offset - 1;
				int after = offset + 1;
				try {
					char c_before = event.getDocumentEvent().getDocument().getChar(before);
					char c_after = event.getDocumentEvent().getDocument().getChar(after);	
					
					if ( isAChangingString(event.getReplacedText()) || ( isAChangingCharacter(c_before) && isAChangingCharacter(c_after) ) )
						editor.setMustBeTypechecked(true);
				} catch (BadLocationException e) {
					// do nothing
					e.printStackTrace();
				}
			} else
				editor.setMustBeTypechecked(true);
		}*/
		editor.setMustBeTypechecked(true);
	}

	private boolean isAChangingCharacter(char c) {
		if ( (c == ' ') || (c == '\n') || (c == '\t') )
			return false;
		return true;
	}
	
	private boolean isAChangingString(String s) {
		if ( s == null )
			return false;
		boolean result = false;
		int i = 0;
		while ( (i<s.length()) && ! result )
			result = isAChangingCharacter(s.charAt(i++));
		return result;
	}
	
}
