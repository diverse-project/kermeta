/*
 * Created on 20 janv. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.texteditor.editors;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.IWhitespaceDetector;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.PatternRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WordRule;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 * 
 * Create rules for different kinds of syntactic elements :
 * - comments
 * - keywords
 */
public class EditorScanner extends RuleBasedScanner {

	public static final Color LIGHT_BLUE = new Color(Display.getCurrent(), new RGB(63, 95, 190));
	public static final Color BLUE = new Color(Display.getCurrent(), new RGB(0, 0, 100));
	public static final Color BLUE_GREEN = new Color(Display.getCurrent(),	new RGB(65, 130, 90));
	public static final Color RED = new Color(Display.getCurrent(), new RGB(150, 0, 0));
	public static final Color FUSHIA = new Color(Display.getCurrent(), new RGB(127, 0, 85));

	protected ArrayList<Object> rules;
	
	public EditorScanner() {
		// The list of rules
		rules = new ArrayList <Object> ();
		// rule for white space
		//rules.add(new WhitespaceRule(new WhitespaceDetector()));
		// rule for comments
		//createRuleForComments();
		// rule for literals
		//createRuleForLiterals();
		// rule for keywords
		createRuleForKeyWords();

		//setRules((IRule[])rules.toArray(new IRule[rules.size()]));
		setRules((IRule[])rules.toArray(new IRule[rules.size()]));
	}
	
	/**
	 * 
	 */
	private void createRuleForKeyWords() {
		IToken kwToken = new Token(new TextAttribute(BLUE, null, 1));
		IToken skwToken = new Token(new TextAttribute(RED, null, 1));
		IToken defaultToken = new Token(new TextAttribute(EditorConfiguration.DEFAULT_TAG_COLOR));
		//KWDetector detector = new KWDetector();
		WordRule wr = new WordRule(new IDDetector(), defaultToken);
		Iterator e = CathegorizedKWList.getInstance().getNonSpecialKW().iterator();
		while (e.hasNext()) {
			String kw = e.next().toString().trim();
			wr.addWord(kw, kwToken);
		}
		e = CathegorizedKWList.getInstance().specialKW.iterator();
		while (e.hasNext()) {
			String kw = e.next().toString().trim();
			wr.addWord(kw, skwToken);
		}
		rules.add(wr);
	}

	/**
	 * 
	 */
	/*private void createRuleForLiterals() {
		IToken stringToken = new Token(new TextAttribute(LIGHT_BLUE));
		//rules.add(new PatternRule("\"", "\"", stringToken, '\\', true));
		rules.add(new PatternRule("\"", "\"", stringToken, '\n', true));
	}*/

	/**
	 * 
	 */
	private void createRuleForComments() {
		IToken commentToken = new Token(new TextAttribute(BLUE_GREEN, null, 2));
		IToken ccommentToken = new Token(new TextAttribute(LIGHT_BLUE, null, 2));
		rules.add(new EndOfLineRule("//", commentToken));
		rules.add(new MultiLineRule("/**", "*/", ccommentToken));
		rules.add(new MultiLineRule("/*", "*/", commentToken));
	}




	public static class WhitespaceDetector implements IWhitespaceDetector {

		public boolean isWhitespace(char c) {
			return Character.isWhitespace(c);
		}

		public WhitespaceDetector() {
		}
	}

	public static class TokenIDDetector implements IWordDetector {

		public boolean isWordPart(char c) {
			if (Character.isUpperCase(c))
				return true;
			return c == '_';
		}

		public boolean isWordStart(char c) {
			if (Character.isUpperCase(c))
				return true;
			return c == '_';
		}

		public TokenIDDetector() {
		}
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

}

