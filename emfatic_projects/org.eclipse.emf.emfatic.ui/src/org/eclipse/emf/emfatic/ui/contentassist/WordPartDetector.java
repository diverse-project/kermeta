package org.eclipse.emf.emfatic.ui.contentassist;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.ITextViewer;

public class WordPartDetector {
	String wordPart = "";
	int docOffset;

	/**
	 * Method WordPartDetector.
	 * 
	 * @param viewer
	 *            is a text viewer
	 * @param documentOffset
	 *            into the SQL document
	 */
	public WordPartDetector(ITextViewer viewer, int documentOffset) {
		docOffset = documentOffset - 1;
		try {
			// find the word that must be finished
			while (docOffset >= viewer.getTopIndexStartOffset()
					&& Character.isLetterOrDigit(viewer.getDocument().getChar(
							docOffset))) {
				docOffset--;
			}
			// we've been one step too far : increase the offset
			docOffset++;
			wordPart = viewer.getDocument().get(docOffset,
					documentOffset - docOffset);
		} catch (BadLocationException e) {
			// do nothing
		}
	}

	/**
	 * Method getString.
	 * 
	 * @return String
	 */
	public String getString() {
		return wordPart;
	}

	public int getLength() {
		return wordPart.length();
	}

	public int getOffset() {
		return docOffset;
	}

}
