/* $Id: KMTCodeScanner.java,v 1.3 2007-06-27 13:19:27 cfaucher Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	KMTCodeScanner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/

package fr.irisa.triskell.kermeta.texteditor.scanners;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.rules.BufferedRuleBasedScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.PatternRule;
import org.eclipse.jface.text.rules.Token;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;

/**
 * @author ftanguy
 */
public class KMTCodeScanner extends BufferedRuleBasedScanner {

	public KMTCodeScanner(KermetaUnit unit) {
		
		List <IRule> rules = new ArrayList <IRule> ();
		
		IToken stringToken = new Token( KMTTextAttributeProvider.getTextAttribute(KMTTextAttributeProvider.STRING_ATTRIBUTE) );
		rules.add(new PatternRule("\"", "\"", stringToken, '\\', true));
		
		rules.add(new KeywordRule());
		//rules.add(new ClassNameRule(unit));
		
		/*rules.add(new WhitespaceRule(new IWhitespaceDetector() {

            public boolean isWhitespace(char c) {
            	return Character.isWhitespace(c);
            }
		}));*/
		
		setRules( (IRule[])rules.toArray(new IRule[rules.size()]) );
		
		/*List <IRule> rules = new ArrayList <IRule> ();
		
		createRuleForStructureKeywords(rules);
		createRuleForSpecialKeywords(rules);
		createRuleForControlKeywords(rules);
		//createRuleForTypeKeywords(rules);
		//createRuleForKeyWords(rules);
		
		setRules( (IRule[])rules.toArray(new IRule[rules.size()]) );
		*/
		IToken token = new Token ( KMTTextAttributeProvider.getTextAttribute( KMTTextAttributeProvider.UNDEFINED_ATTRIBUTE ) );
		setDefaultReturnToken(token);
	}


/*	private void createRulesForKeywords(List<IRule> rules) {
		createRuleForSpecialKeywords(rules);
		createRuleForControlKeywords(rules);
		createRuleForTypeKeywords(rules);
		createRuleForLiteralKeywords(rules);
		createRuleForStructureKeywords(rules);
		createRuleForOperatorKeywords(rules);
	}
	
	private void createRuleForSpecialKeywords(List<IRule> rules) {
		IToken token = new Token ( KMTTextAttributeProvider.getTextAttribute(KMTTextAttributeProvider.SPECIAL_ATTRIBUTE));
		createRuleForKeywords(rules, CathegorizedKWList.getInstance().specialKW, token);
	}
	
	private void createRuleForControlKeywords(List<IRule> rules) {
		IToken token = new Token ( KMTTextAttributeProvider.getTextAttribute(KMTTextAttributeProvider.CONTROL_ATTRIBUTE));
		createRuleForKeywords(rules, CathegorizedKWList.getInstance().controlKW, token);
	}
	
	private void createRuleForTypeKeywords(List<IRule> rules) {
		IToken token = new Token ( KMTTextAttributeProvider.getTextAttribute(KMTTextAttributeProvider.CONTROL_ATTRIBUTE));
		createRuleForKeywords(rules, CathegorizedKWList.getInstance().typeKW, token);
	}
	
	private void createRuleForLiteralKeywords(List<IRule> rules) {
		IToken token = new Token ( KMTTextAttributeProvider.getTextAttribute(KMTTextAttributeProvider.LITERAL_ATTRIBUTE));
		createRuleForKeywords(rules, CathegorizedKWList.getInstance().literalKW, token);
	}
	
	private void createRuleForStructureKeywords(List<IRule> rules) {
		IToken token = new Token ( KMTTextAttributeProvider.getTextAttribute(KMTTextAttributeProvider.KEYWORD_ATTRIBUTE));
		createRuleForKeywords(rules, CathegorizedKWList.getInstance().structKW, token);
	}
	
	private void createRuleForOperatorKeywords(List<IRule> rules) {
		IToken token = new Token ( KMTTextAttributeProvider.getTextAttribute(KMTTextAttributeProvider.OPERATOR_ATTRIBUTE));
		createRuleForKeywords(rules, CathegorizedKWList.getInstance().operatorKW, token);
	}
	
	private void createRuleForKeywords(List<IRule> rules, List<String> words, IToken token) {
		WordRule rule = new WordRule( new Detector() );
		for ( String s : words )
			rule.addWord(s, token);
		rules.add(rule);
	}
	
	
	
	public static class IDDetector implements IWordDetector {
		public boolean isWordPart(char c) {
			return Character.isUnicodeIdentifierPart(c);
		}

		public boolean isWordStart(char c) {
			return Character.isUnicodeIdentifierStart(c) || c == '~';
		}

		public IDDetector() {
		}
	}
	
	
	public static class Detector implements IWordDetector {
		public boolean isWordPart(char c) {
			return Character.isLetter(c);
			//return Character.isUnicodeIdentifierPart(c);
		}

		public boolean isWordStart(char c) {
			return Character.isUnicodeIdentifierStart(c) || c == '~';
		}

		public Detector() {
		}
	}*/
	
	
	
}
