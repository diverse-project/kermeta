/*
 * Created on 13 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader;

import antlr.MismatchedCharException;
import antlr.MismatchedTokenException;
import antlr.NoViableAltException;
import antlr.NoViableAltForCharException;
import antlr.RecognitionException;
import antlr.TokenStreamRecognitionException;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KMUnitParseError extends KMUnitError {

	int offset = 0;

	int length = 1;

	/**
	 * @param message
	 * @param node
	 */
	public KMUnitParseError(Exception ex) {
		super(null, null, null);
		initWithException(ex);
	}

	/**
	 * @return Returns the length.
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @return Returns the offset.
	 */
	public int getOffset() {
		return offset;
	}

	public void initWithException(Exception ex) {
		
		if (ex instanceof RecognitionException) {
			init((RecognitionException)ex);
		}
		else if (ex instanceof TokenStreamRecognitionException) {
			TokenStreamRecognitionException ex2 = (TokenStreamRecognitionException) ex;
			RecognitionException rex = ex2.recog;
			init(rex);
		}
		else {
			message = ex.getMessage();
		}
	}

	private void init(RecognitionException ex) {
		String message = ex.getMessage();
		int offset = ex.getColumn();
		int length = 0;
		if (ex instanceof MismatchedCharException)
			length = 1;
		else if (ex instanceof MismatchedTokenException) {
			MismatchedTokenException ex2 = (MismatchedTokenException) ex;
			if (ex2.token != null && ex2.token.getText() != null)
				length = ex2.token.getText().length();
		} else if (ex instanceof NoViableAltException) {
			NoViableAltException ex2 = (NoViableAltException) ex;
			if (ex2.token != null && ex2.token.getText() != null)
				length = ex2.token.getText().length();
		} else if (ex instanceof NoViableAltForCharException)
			length = 1;
		this.message = message;
		this.length = length;
		this.offset = offset;
	}
}