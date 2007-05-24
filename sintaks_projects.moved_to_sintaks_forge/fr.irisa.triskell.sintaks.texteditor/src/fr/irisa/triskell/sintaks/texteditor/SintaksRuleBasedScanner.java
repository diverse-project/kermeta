

/*$Id: SintaksRuleBasedScanner.java,v 1.1 2007-05-24 08:45:07 ftanguy Exp $
* Project : fr.irisa.triskell.sintaks.editor
* File : 	SintaksRuleBasedScanner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 21 mai 07
* Authors : paco
*/

package fr.irisa.triskell.sintaks.texteditor;

import java.util.Set;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.BufferedRuleBasedScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WordRule;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;


public class SintaksRuleBasedScanner extends BufferedRuleBasedScanner {

	public SintaksRuleBasedScanner( Set<String> keywords ) {
		
		IToken keywordToken = new Token ( new TextAttribute(new Color(Display.getCurrent(), new RGB(63, 95, 190)), null, 1) );
		IToken basicToken = new Token ( new TextAttribute(new Color(Display.getCurrent(), new RGB(0, 0, 0))) );
		WordRule wordRule = new WordRule(new IDDetector(), basicToken);
		
		for (String keyword : keywords)
			wordRule.addWord(keyword, keywordToken);
		
		setRules( new IRule[] { wordRule } );
		
	}
	
	public static class IDDetector implements IWordDetector {
		public boolean isWordPart(char c) {
			if ( ! Character.isDefined(c) || Character.isWhitespace(c) )
				return false;
			return true;
		}

		public boolean isWordStart(char c) {	
			if ( ! Character.isDefined(c) || Character.isWhitespace(c) )
				return false;
			return true;
		}

		public IDDetector() {
		}
	}
	
}


