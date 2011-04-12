/* $Id: ScannerBasedDamagerRepairer.java 13570 2010-11-22 16:17:02Z hrambelo $
 * Project    : org.kermeta.language.texteditor.eclipse
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 *           Francois Fouquet 
 */
package org.kermeta.language.texteditor.eclipse;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.TextPresentation;
import org.eclipse.jface.text.presentation.IPresentationDamager;
import org.eclipse.jface.text.presentation.IPresentationRepairer;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.ITokenScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.core.runtime.Assert;
import org.eclipse.swt.custom.StyleRange;

/**
 * Simple PresentationRepairer based on a Scanner
 *
 */
public class ScannerBasedDamagerRepairer implements IPresentationDamager,
		IPresentationRepairer {

	/** The document this object works on */
	protected IDocument fDocument;
	/**
	 * The default text attribute if non is returned as data by the current
	 * token
	 */
	protected KermetaTokenScanner fScanner;
	
	/**
	 * Constructor for NonRuleBasedDamagerRepairer.
	 */
	public ScannerBasedDamagerRepairer(KermetaTokenScanner scanner) {
		fScanner = scanner;
	}

	/**
	 * @see IPresentationRepairer#setDocument(IDocument)
	 */
	public void setDocument(IDocument document) {
		fDocument = document;
	}

	/**
	 * Returns the end offset of the line that contains the specified offset or
	 * if the offset is inside a line delimiter, the end offset of the next
	 * line.
	 * 
	 * @param offset
	 *            the offset whose line end offset must be computed
	 * @return the line end offset for the given offset
	 * @exception BadLocationException
	 *                if offset is invalid in the current document
	 */
	protected int endOfLineOf(int offset) throws BadLocationException {

		IRegion info = fDocument.getLineInformationOfOffset(offset);
		if (offset <= info.getOffset() + info.getLength()){
			return info.getOffset() + info.getLength();
		}

		int line = fDocument.getLineOfOffset(offset);
		try {
			info = fDocument.getLineInformation(line + 1);
			return info.getOffset() + info.getLength();
		} catch (BadLocationException x) {
			return fDocument.getLength();
		}
	}

	/**
	 * @see IPresentationDamager#getDamageRegion(ITypedRegion, DocumentEvent,
	 *      boolean)
	 */
	public IRegion getDamageRegion(ITypedRegion partition, DocumentEvent event,
			boolean documentPartitioningChanged) {
		if (!documentPartitioningChanged) {
			try {
				//System.out.println("EVENT FROM DAMAGER : " + event.toString());
				IRegion info = fDocument.getLineInformationOfOffset(event
						.getOffset());
				int start = Math.max(partition.getOffset(), info.getOffset());

				int end = event.getOffset()
						+ (event.getText() == null ? event.getLength() : event
								.getText().length());

				if (info.getOffset() <= end
						&& end <= info.getOffset() + info.getLength()) {
					// optimize the case of the same line
					end = info.getOffset() + info.getLength();
				} else {
					end = endOfLineOf(end);
				}

				end = Math.min(partition.getOffset() + partition.getLength(),
						end);
				return new Region(start, end - start);

			} catch (BadLocationException x) {
			}
		}

		return partition;
	}

	/**
	 * @see IPresentationRepairer#createPresentation(TextPresentation,
	 *      ITypedRegion)
	 */
	public void createPresentation(TextPresentation presentation,
			ITypedRegion region) {

		fScanner.setRange(fDocument, 0, fDocument.getLength());
		fScanner.setFileHasError(false);
		while (true) {
			IToken token = fScanner.nextToken();
			if (token.isEOF()) {
				if (fScanner.isFileOnError()){
					fScanner.notifyFileHasError();
				}else{
					fScanner.notifyFileClear();
				}
				break;
			}
			TextAttribute attribute = getTokenTextAttribute(token);
			addRange(presentation, fScanner.getTokenOffset(),fScanner.getTokenLength(),
					attribute);
		}
	}

	/**
	 * Retrieves text presentation from the data in the token
	 * @param token
	 * @return
	 */
	protected TextAttribute getTokenTextAttribute(IToken token) {
		Object data = token.getData();
		if (data instanceof TextAttribute) {
			return (TextAttribute) data;
		}
		return null;
	}

	/**
	 * Adds style information to the given text presentation.
	 * 
	 * @param presentation
	 *            the text presentation to be extended
	 * @param offset
	 *            the offset of the range to be styled
	 * @param length
	 *            the length of the range to be styled
	 * @param attr
	 *            the attribute describing the style of the range to be styled
	 */
	protected void addRange(TextPresentation presentation, int offset,
			int length, TextAttribute attr) {
		if (attr != null){
			presentation.addStyleRange(new StyleRange(offset, length, attr
					.getForeground(), attr.getBackground(), attr.getStyle()));
		}
	}
}