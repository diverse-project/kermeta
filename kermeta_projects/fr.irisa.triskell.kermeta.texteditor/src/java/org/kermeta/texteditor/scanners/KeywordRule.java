/* $Id: KeywordRule.java,v 1.5 2008-03-03 09:32:44 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	KeywordRule.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/

package org.kermeta.texteditor.scanners;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

/**
 * @author ftanguy
 */
public class KeywordRule implements IRule {

	private IToken tokenForStructureKeyword = new Token ( KMTTextAttributeProvider.getTextAttribute(KMTTextAttributeProvider.KEYWORD_ATTRIBUTE));
	private IToken tokenForControlKeyword = new Token ( KMTTextAttributeProvider.getTextAttribute(KMTTextAttributeProvider.CONTROL_ATTRIBUTE));
	private IToken tokenForTypeKeyword = new Token ( KMTTextAttributeProvider.getTextAttribute(KMTTextAttributeProvider.TYPE_ATTRIBUTE));
	//private IToken undefinedKeyword = new Token ( KMTTextAttributeProvider.getTextAttribute(KMTTextAttributeProvider.UNDEFINED_ATTRIBUTE));
	private IToken tokenForLiteralKeyword = new Token ( KMTTextAttributeProvider.getTextAttribute(KMTTextAttributeProvider.LITERAL_ATTRIBUTE));
	private IToken tokenForSpecialKeyword = new Token ( KMTTextAttributeProvider.getTextAttribute(KMTTextAttributeProvider.SPECIAL_ATTRIBUTE));
	private IToken tokenForOperatorKeyword = new Token ( KMTTextAttributeProvider.getTextAttribute(KMTTextAttributeProvider.OPERATOR_ATTRIBUTE));
	private IToken tokenForAbstractKeyword = new Token ( KMTTextAttributeProvider.getTextAttribute(KMTTextAttributeProvider.ABSTRACT_ATTRIBUTE));

	
	public List <String> structureKeyword = new ArrayList <String> ();
	public List <String> controlKeyword = new ArrayList <String> ();
	public List <String> typeKeyword = new ArrayList <String> ();
	public List <String> literalKeyword = new ArrayList <String> ();
	public List <String> operatorKeyword = new ArrayList <String> ();
	public List <String> specialKeyword = new ArrayList <String> ();
	public List <String> nonSpecialKW = new ArrayList <String> ();
	public List <String> abstractKeywords = new ArrayList <String> ();

	private List <List<String>> keywordLists = new ArrayList<List<String>> ();
	
	private Map <List<String>, IToken> tokenMap = new HashMap <List<String>, IToken> ();
	
	public KeywordRule() {
		initializeKeywords();
		initializeKeywordLists();
		initializeMap();
	}
	
	private void addKeyword(String kw, List <String> l) {
		l.add(kw);
	}
	
	private void initializeKeywords() {
		addKeyword("package", structureKeyword);
		addKeyword("require", specialKeyword);
		addKeyword("includeFilter", specialKeyword);
		addKeyword("excludeFilter", specialKeyword);
		addKeyword("using", specialKeyword);
		addKeyword("inherits", structureKeyword);
		addKeyword("class", structureKeyword);
		addKeyword("modeltype", structureKeyword);
		addKeyword("@pre", operatorKeyword); //doesn't work properly, probably because the @ is processed firstly
		addKeyword("pre", specialKeyword);
		addKeyword("post", specialKeyword);
		addKeyword("inv", specialKeyword);
		addKeyword("abstract", abstractKeywords);
		addKeyword("aspect", abstractKeywords);
		//addKeyword("Self", typeKW);
		addKeyword("Void", typeKeyword);
		addKeyword("attribute", structureKeyword);
		addKeyword("reference", structureKeyword);
		addKeyword("property", structureKeyword);
		addKeyword("readonly", structureKeyword);
		addKeyword("getter", structureKeyword);
		addKeyword("is", structureKeyword);
		addKeyword("setter", structureKeyword);
		addKeyword("raises", controlKeyword);
		//addKeyword("select", structKW);
		addKeyword("operation", structureKeyword);
		addKeyword("method", structureKeyword);
		addKeyword("bag", typeKeyword);
		addKeyword("set", typeKeyword);
		addKeyword("seq", typeKeyword);
		addKeyword("oset", typeKeyword);
		addKeyword("alias", structureKeyword);
		addKeyword("enumeration", structureKeyword);
		addKeyword("and", operatorKeyword);
		addKeyword("or", operatorKeyword);
		addKeyword("not", operatorKeyword);
		addKeyword("self", literalKeyword);
		addKeyword("super", literalKeyword);
		addKeyword("do", controlKeyword);
		addKeyword("end", controlKeyword);
		addKeyword("function", controlKeyword);
		addKeyword("rescue", controlKeyword);
		addKeyword("from", controlKeyword);
		addKeyword("until", controlKeyword);
		addKeyword("loop", controlKeyword);
		addKeyword("if", controlKeyword);
		addKeyword("then", controlKeyword);
		addKeyword("else", controlKeyword);
		addKeyword("raise", controlKeyword);
		addKeyword("var", controlKeyword);
		addKeyword("init", controlKeyword);
		addKeyword("extern", specialKeyword);
		addKeyword("true", literalKeyword);
		addKeyword("false", literalKeyword);
		addKeyword("void", literalKeyword);
		addKeyword("result", literalKeyword);
		addKeyword("value", literalKeyword);
	}
	
	private void initializeKeywordLists() {
		keywordLists.add(structureKeyword);
		keywordLists.add(controlKeyword);
		keywordLists.add(typeKeyword);
		keywordLists.add(literalKeyword);
		keywordLists.add(specialKeyword);
		keywordLists.add(operatorKeyword);
		keywordLists.add( abstractKeywords );
	}
	
	private void initializeMap() {
		tokenMap.put(structureKeyword, tokenForStructureKeyword);
		tokenMap.put(controlKeyword, tokenForControlKeyword);
		tokenMap.put(typeKeyword, tokenForTypeKeyword);
		tokenMap.put(literalKeyword, tokenForLiteralKeyword);
		tokenMap.put(specialKeyword, tokenForSpecialKeyword);
		tokenMap.put(operatorKeyword, tokenForOperatorKeyword);
		tokenMap.put( abstractKeywords, tokenForAbstractKeyword);
	}
	
	private IToken isKeywordOf(String keyword, List<String> keywords) {
		for (String s : keywords) {
			if ( s.equals(keyword) ) {
				return tokenMap.get(keywords);
			}
		}
		return null;
	}
	
	private IToken getToken(String keyword) {
		for ( List<String> l : keywordLists ) {
			IToken result = isKeywordOf(keyword, l);
			if ( result != null )
				return result;
		}
		return null;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.text.rules.IRule#evaluate(org.eclipse.jface.text.rules.ICharacterScanner)
	 */
	public IToken evaluate(ICharacterScanner scanner) {
		String word = "";
		int c = ' ';
		int size = 0;
		
		boolean go = false;
		
		KermetaScanner ks = (KermetaScanner) scanner;
		if ( ks.getTokenOffset() != 0 ) {
			scanner.unread();
			c = scanner.read();			
		} else
			go = true;
		//Character.toChars(c)
		if ( go || Character.isWhitespace(c) || c == ':' || c == '{' || c == '=' || c == '(' ) {

			while ( (c = scanner.read()) != ICharacterScanner.EOF ) {
				size ++;
				if ( Character.isLetter(c) ) {
					String temp = new String( new char[] { (char) c } );
					word = word.concat( temp );
						
					IToken token = getToken(word);
					if ( token != null ) {
						c = scanner.read();
						if ( (c == ICharacterScanner.EOF) || Character.isWhitespace(c) || (c == '.')  || c == ':' || c == '{' || c == '=' || c == '(' || c ==')' || c ==',' || c =='+' || c =='-' ) {
							scanner.unread();
							return token;
						} else
							scanner.unread();
					}
				} else {
					while ( size > 0 ) {
						scanner.unread();
						size--;
					}
					return Token.UNDEFINED;
				}
			}	
			
		}
		
		while ( size > 0 ) {
			scanner.unread();
			size--;
		}

		return Token.UNDEFINED;

	}

}
