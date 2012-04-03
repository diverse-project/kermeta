package org.kermeta.kompren.texteditor.editors;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposalExtension2;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;

public class KomprenCompletionProposal implements ICompletionProposal, ICompletionProposalExtension2, Comparable<KomprenCompletionProposal>{
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
	public KomprenCompletionProposal(final String replacementString, final int replacementOffset, final int replacementLength, final int cursorPosition) {
		this(replacementString, replacementOffset, replacementLength, cursorPosition, null, replacementString, null, null);
	}
	
	
	
	/**
	 * Creates a new completion proposal. All fields are initialized based on the provided information.
	 *
	 * @param replacementString the actual string to be inserted into the document
	 * @param replacementOffset the offset of the text to be replaced
	 * @param replacementLength the length of the text to be replaced
	 * @param cursorPosition the position of the cursor following the insert relative to replacementOffset
	 * @param image the image to display for this proposal
	 */
	public KomprenCompletionProposal(final String replacementString, final int replacementOffset, final int replacementLength, final int cursorPosition, final Image image) {
		this(replacementString, replacementOffset, replacementLength, cursorPosition, image, replacementString, null, null);
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
	public KomprenCompletionProposal(final String replacementString, final int replacementOffset, final int replacementLength, final int cursorPosition, 
			final Image image, final String displayString, final IContextInformation contextInformation, final String additionalProposalInfo) {
		fReplacementString= replacementString;
		fReplacementOffset= replacementOffset;
		fReplacementLength= replacementLength;
		fCursorPosition= cursorPosition;
		fImage= image;
		fDisplayString= displayString;
		fContextInformation= contextInformation;
		fAdditionalProposalInfo= additionalProposalInfo;
	}
	
	
	
	@Override
	public void apply(final IDocument document) {
		try {
			document.replace(fReplacementOffset, fReplacementLength, fReplacementString);
		} catch (BadLocationException x) {
			// ignore
		}
	}
	
	
	
	@Override
	public String getAdditionalProposalInfo() {
		return fAdditionalProposalInfo;
	}
	
	
	
	@Override
	public IContextInformation getContextInformation() {
		return fContextInformation;
	}
	
	
	
	@Override
	public String getDisplayString() {
		if (fDisplayString != null)
			return fDisplayString;
		return fReplacementString;
	}
	
	
	
	@Override
	public Image getImage() {
		return fImage;
	}
	
	
	
	@Override
	public Point getSelection(final IDocument arg0) {
		return new Point(fReplacementOffset + fCursorPosition, 0);
	}
	
	
	
	@Override
	public void apply(final ITextViewer viewer, final char trigger, final int stateMask, final int offset) {
		try {
			viewer.getDocument().replace(fReplacementOffset, fReplacementLength, fReplacementString);
		} catch (BadLocationException x) {
			// ignore
		}		
	}
	
	
	
	@Override
	public void selected(final ITextViewer arg0, final boolean arg1) {	
		//
	}
	
	
	
	@Override
	public void unselected(final ITextViewer arg0) {
		//
	}
	
	
	
	@Override
	public boolean validate(final IDocument document, final int offset, final DocumentEvent event) {
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
		boolean result = fReplacementString.replace("\n", "").toLowerCase().matches(regex);
		if ( result )
			fReplacementLength++;
		
		return result;
	}

	
	
	@Override
	public int compareTo(final KomprenCompletionProposal o) {
		return this.fDisplayString.toLowerCase().compareTo(o.fDisplayString.toLowerCase());
	}
}
