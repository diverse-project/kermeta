/* $Id: RequireScanner.java,v 1.1 2007-12-17 14:05:08 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	KMTCommentScanner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/

package org.kermeta.texteditor.scanners;

import org.eclipse.jface.text.rules.BufferedRuleBasedScanner;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

import fr.irisa.triskell.kermeta.texteditor.scanners.KMTTextAttributeProvider;

/**
 * @author ftanguy
 */
public class RequireScanner extends BufferedRuleBasedScanner {

	public RequireScanner() {
		IToken token = new Token ( KMTTextAttributeProvider.getTextAttribute( KMTTextAttributeProvider.COMMENT_ATTRIBUTE ) );
		setDefaultReturnToken(token);
	}
	
}
