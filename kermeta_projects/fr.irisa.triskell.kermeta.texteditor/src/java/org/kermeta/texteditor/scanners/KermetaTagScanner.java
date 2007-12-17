

/*$Id: KermetaTagScanner.java,v 1.1 2007-12-17 14:05:07 ftanguy Exp $
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

import fr.irisa.triskell.kermeta.texteditor.scanners.KMTTextAttributeProvider;

public class KermetaTagScanner extends RuleBasedScanner {
	
	public KermetaTagScanner() {
		IToken token = new Token ( KMTTextAttributeProvider.getTextAttribute( KMTTextAttributeProvider.TAG_ATTRIBUTE ) );
		setDefaultReturnToken(token);
		
		IToken tokenForName = new Token ( KMTTextAttributeProvider.getTextAttribute( KMTTextAttributeProvider.SPECIAL_ATTRIBUTE ) );
		IRule ruleForName = new WordRule( new TagNameWordDetector(), tokenForName );
		
		IToken tokenForTagDocumentation = new Token( KMTTextAttributeProvider.getTextAttribute( KMTTextAttributeProvider.TAG_ATTRIBUTE) );
		IRule ruleForTag = new MultiLineRule( "/**", "*/", tokenForTagDocumentation );
		
		setRules( new IRule[] {ruleForName, ruleForTag} );
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


