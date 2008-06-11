

/*$Id: KermetaTagScanner.java,v 1.3 2008-06-11 14:36:46 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	KermetaTagScanner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 22 nov. 07
* Authors : paco
*/

package org.kermeta.texteditor.scanners;

import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WordRule;

public class KermetaTagScanner extends RuleBasedScanner {
	
	public KermetaTagScanner() {
	
		//IToken tokenForTagDocumentation = new Token( KMTTextAttributeProvider.getTextAttribute( KMTTextAttributeProvider.TAG_ATTRIBUTE) );
		//IRule ruleForTag = new MultiLineRule( "/**", "*/", tokenForTagDocumentation );
		
		IToken tokenForName = new Token ( KMTTextAttributeProvider.getTextAttribute( KMTTextAttributeProvider.SPECIAL_ATTRIBUTE ) );
		IRule ruleForName = new WordRule( new TagNameWordDetector(), tokenForName );

		IToken token = new Token ( KMTTextAttributeProvider.getTextAttribute( KMTTextAttributeProvider.TAG_ATTRIBUTE ) );
		setDefaultReturnToken(token);
		
		//setRules( new IRule[] {ruleForTag, ruleForName} );
		setRules( new IRule[] {ruleForName} );
	}
	
	private class TagNameWordDetector implements IWordDetector {

		private boolean cotesFound = false;
		
		public boolean isWordPart(char c) {
			return Character.isJavaIdentifierPart(c);
		}

		public boolean isWordStart(char c) {
			if ( c == '@' )
				cotesFound = false;
			else if ( c == '"' )
				cotesFound = true;
			if ( cotesFound )
				return false;
			return Character.isJavaIdentifierPart(c);
		}
		
	}
	
}


