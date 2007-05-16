package fr.irisa.triskell.kermeta.ocl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.internal.cst.CSTNode;
import org.eclipse.ocl.internal.l10n.OCLMessages;
import org.eclipse.ocl.internal.parser.OCLLexer;
import org.eclipse.ocl.internal.parser.OCLParser;

 
public class MyOCLParser extends OCLParser {

	protected String errorString=""; 
	
	private int errorReportLineOffset = 0;
	
	public MyOCLParser(OCLLexer lexStream,Environment e) {
		super(lexStream,e);
	}

	
	public EObject parse() throws  org.eclipse.ocl.ParserException {
		EObject cstNode = parser();
		this.setTraceFlag(true);
		if (errorString.length() > 0) {
			String error = errorString;
			errorString = ""; //$NON-NLS-1$
			throw new ParserException(error);
		}
		return cstNode;
		
	}
	
	
	/**
	 * Reports the parse error by setting the error to <code>errorString</code>
	 * 
	 * @param errorCode the error code
	 * @param locationInfo
	 * @param leftToken the token to the left of the error
	 * @param rightToken the token to the right of the error
	 * @param tokenText the text of the bad token
	 */
	public void reportError(int errorCode, String locationInfo, int leftToken, int rightToken, String tokenText) {

		int leftTokenLoc = (leftToken > rightToken ? rightToken : leftToken);
		int rightTokenLoc = rightToken;

        if (getLine(leftTokenLoc) + errorReportLineOffset <= 0) {
        	errorString = OCLMessages.InvalidOCL_ERROR_;
		} else {
			String locInfo = OCLMessages.bind(OCLMessages.ErrorReport_RowColumn,
					new Object[]{
						new Integer((getLine(leftTokenLoc) + errorReportLineOffset)),
						new Integer(getColumn(leftTokenLoc)),
						new Integer((getEndLine(rightTokenLoc) + errorReportLineOffset)),
						new Integer(getEndColumn(rightTokenLoc))
				});
	
			switch (errorCode) {
				case EOF_CODE:
				case MISPLACED_CODE:
				case DELETION_CODE:
				case INVALID_TOKEN_CODE:
					errorString = OCLMessages.bind(
						errorMessages[errorCode],
						locInfo,
						'"' + computeInputString(
							getIToken(leftToken).getStartOffset(),
							getIToken(rightToken).getEndOffset())) + '"';
					break;
	
				case MERGE_CODE:
				case BEFORE_CODE:
				case INSERTION_CODE:
				case SUBSTITUTION_CODE: // includes SECONDARY_CODE
					errorString = OCLMessages.bind(
						errorMessages[errorCode],
						new Object[]{
							locInfo,
							tokenText,
							'"' + computeInputString(
								getIToken(leftToken).getStartOffset(),
								getIToken(rightToken).getEndOffset()) + '"'
						});
					break;
	
				default:
					errorString = OCLMessages.bind(errorMessages[errorCode], locInfo, tokenText);
					break;
			}
		}
	}

	/**
	 * Returns a single line string representation of the input chars
	 * for the given range.
	 * 
	 * @param left left most char index
	 * @param right right most char index
	 * @return a single line string representation of the input chars
	 */
	private String computeInputString(int left, int right) {
		StringBuffer result = new StringBuffer(right - left + 1);
		char[] chars = getInputChars();

		for (int i = left; i <= right; i++) {
			if (chars[i] == '\t') {
				result.append(' ');
			} else if (chars[i] == '\n' || chars[i] == '\r' || chars[i] == '\f') {
				if (i > 0) {
					if (!Character.isWhitespace(chars[i-1])) {
						result.append(' ');
					}
				}
			} else {
				result.append(chars[i]);
			}
				
		}
		return result.toString();
	}
	
	/**
	 * Obtains the text from which the specified CST <code>node</code> was parsed.
	 * 
	 * @param node a concrete syntax node
	 * 
	 * @return its text
	 */
	private String computeInputString(CSTNode node) {
		return computeInputString(node.getStartOffset(), node.getEndOffset());
	}

	/**
	 * Empty.
	 */
	public void reportError(int errorCode, String locationInfo, String tokenText) {
		// empty
	}

	/**
	 * Dumps the error code and token info.
	 * 
	 * @param i token index
	 * @param code error code
	 */
	public void reportError(int i, String code) {
		errorString = code
			+ " (" + getKind(i) + ") : "  //$NON-NLS-1$//$NON-NLS-2$
			+ getStartOffset(i)
			+ ":" + getLineNumberOfTokenAt(i) //$NON-NLS-1$
			+ ":" + getColumnOfTokenAt(i) //$NON-NLS-1$
			+ ":" + getTokenLength(i) //$NON-NLS-1$
			+ " " + getTokenText(i); //$NON-NLS-1$
	}
}
