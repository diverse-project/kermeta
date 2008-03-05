

/*$Id: KermetaCompletionProposal.java,v 1.5 2008-03-05 13:45:58 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	KermetaCompletionProposal.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 17 déc. 07
* Authors : paco
*/

package org.kermeta.texteditor.completion;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposalExtension2;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;

import fr.irisa.triskell.kermeta.language.structure.Object;
import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;

public class KermetaCompletionProposal implements ICompletionProposal, ICompletionProposalExtension2 {

	private Object kermetaObject;
	/** The string to be displayed in the completion proposal popup. */
	private String fDisplayString;
	/** The replacement string. */
	private String fReplacementString;
	/** The replacement offset. */
	private int fReplacementOffset;
	/** The replacement length. */
	private int fReplacementLength;
	/** The cursor position after this proposal has been applied. */
	private int fCursorPosition;
	/** The image to be displayed in the completion proposal popup. */
	private Image fImage;
	/** The context information of this proposal. */
	private IContextInformation fContextInformation;
	/** The additional info of this proposal. */
	private String fAdditionalProposalInfo;

	/**
	 * Creates a new completion proposal based on the provided information. The replacement string is
	 * considered being the display string too. All remaining fields are set to <code>null</code>.
	 *
	 * @param replacementString the actual string to be inserted into the document
	 * @param replacementOffset the offset of the text to be replaced
	 * @param replacementLength the length of the text to be replaced
	 * @param cursorPosition the position of the cursor following the insert relative to replacementOffset
	 */
	public KermetaCompletionProposal(String replacementString, int replacementOffset, int replacementLength, int cursorPosition) {
		this(replacementString, replacementOffset, replacementLength, cursorPosition, null, null, null, null, null);
	}

	/**
	 * Creates a new completion proposal. All fields are initialized based on the provided information.
	 *
	 * @param replacementString the actual string to be inserted into the document
	 * @param replacementOffset the offset of the text to be replaced
	 * @param replacementLength the length of the text to be replaced
	 * @param cursorPosition the position of the cursor following the insert relative to replacementOffset
	 * @param image the image to display for this proposal
	 * @param displayString the string to be displayed for the proposal
	 * @param contextInformation the context information associated with this proposal
	 * @param additionalProposalInfo the additional information associated with this proposal
	 */
	public KermetaCompletionProposal(String replacementString, int replacementOffset, int replacementLength, int cursorPosition, Image image, String displayString, IContextInformation contextInformation, String additionalProposalInfo, Object kermetaObject) {
		Assert.isNotNull(replacementString);
		Assert.isTrue(replacementOffset >= 0);
		Assert.isTrue(replacementLength >= 0);
		Assert.isTrue(cursorPosition >= 0);

		fReplacementString= replacementString;
		fReplacementOffset= replacementOffset;
		fReplacementLength= replacementLength;
		fCursorPosition= cursorPosition;
		fImage= image;
		fDisplayString= displayString;
		fContextInformation= contextInformation;
		fAdditionalProposalInfo= additionalProposalInfo;
		this.kermetaObject = kermetaObject;
	}

	/*
	 * @see ICompletionProposal#apply(IDocument)
	 */
	public void apply(IDocument document) {
		try {
			document.replace(fReplacementOffset, fReplacementLength, fReplacementString);
		} catch (BadLocationException x) {
			// ignore
		}
	}

	/*
	 * @see ICompletionProposal#getSelection(IDocument)
	 */
	public Point getSelection(IDocument document) {
		return new Point(fReplacementOffset + fCursorPosition, 0);
	}

	/*
	 * @see ICompletionProposal#getContextInformation()
	 */
	public IContextInformation getContextInformation() {
		return fContextInformation;
	}

	/*
	 * @see ICompletionProposal#getImage()
	 */
	public Image getImage() {
		return fImage;
	}

	/*
	 * @see ICompletionProposal#getDisplayString()
	 */
	public String getDisplayString() {
		if (fDisplayString != null)
			return fDisplayString;
		return fReplacementString;
	}

	/*
	 * @see ICompletionProposal#getAdditionalProposalInfo()
	 */
	public String getAdditionalProposalInfo() {
		return fAdditionalProposalInfo;
	}

	public void apply(ITextViewer viewer, char trigger, int stateMask, int offset) {
		try {
			viewer.getDocument().replace(fReplacementOffset, fReplacementLength, fReplacementString);
		} catch (BadLocationException x) {
			// ignore
		}
	}

	public void selected(ITextViewer viewer, boolean smartToggle) {
	}

	public void unselected(ITextViewer viewer) {
		// TODO Auto-generated method stub
		
	}

	public boolean validate(IDocument document, int offset, DocumentEvent event) {
		String s = "";
		int i;
		if ( event == null )
			i = offset;
		else
			i = event.fOffset;
		while ( i >= fReplacementOffset ) {
			try {
				s = document.getChar(i--) + s;
			} catch (BadLocationException e) {
				e.printStackTrace();
			}
		}
		String regex = s.toLowerCase() + ".+";
		TexteditorPlugin.internalLog.debug(regex);
		boolean result = fReplacementString.replace("\n", "").toLowerCase().matches(regex);
		if ( result )
			fReplacementLength++;
		
		return result;
	}
}


