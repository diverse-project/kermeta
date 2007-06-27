/* $Id: KMTTagScanner.java,v 1.3 2007-06-27 13:19:27 cfaucher Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	KMTTagScanner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/

package fr.irisa.triskell.kermeta.texteditor.scanners;

import org.eclipse.jface.text.rules.BufferedRuleBasedScanner;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

/**
 * @author ftanguy
 *
 */
public class KMTTagScanner extends BufferedRuleBasedScanner {

	public KMTTagScanner() {
		IToken token = new Token ( KMTTextAttributeProvider.getTextAttribute( KMTTextAttributeProvider.TAG_ATTRIBUTE ) );
		setDefaultReturnToken(token);
	}
	
}
