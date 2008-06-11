

/*$Id: KermetaPartitionScanner.java,v 1.3 2008-06-11 14:36:46 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	KermetaDocumentPartioner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 22 nov. 07
* Authors : paco
*/

package org.kermeta.texteditor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.Token;

public class KermetaPartitionScanner extends RuleBasedPartitionScanner {

	final public static String REQUIRE = "_require_";
	
	final public static String TAG = "_tag_";
	
	final public static String COMMENT = "_comment_";

	//final public static String OPERATION = "_operation_";
	
	//final public static String BLOCK = "_block_";
	
	final public static String USING = "_using_";

	final public static String CLASS_DECLARATION = "_CLASS_DECLARATION_";	
	
	final public static String DEFAULT = "_default_";

	public KermetaPartitionScanner() {
        IToken require = new Token(REQUIRE);	
        IToken tag = new Token(TAG);
        IToken comment = new Token(COMMENT);
        //IToken operation = new Token(OPERATION);
        //IToken block = new Token(BLOCK);
        IToken using = new Token(USING);
        IToken classDeclaration = new Token(CLASS_DECLARATION);

        List<IPredicateRule> listOfRules = new ArrayList<IPredicateRule>();
        
        /*
         * 
         * Require
         * 
         */
        listOfRules.add( new EndOfLineRule("require ", require) );
        listOfRules.add( new EndOfLineRule("require\t", require) );
        
        /*
         * 
         * Comment and tags
         * 
         */
        listOfRules.add( new EndOfLineRule("@", tag) );
        listOfRules.add( new MultiLineRule("/**", "*/", tag) );   
        //listOfRules.add( new EndOfLineRule("//", comment) );
        listOfRules.add( new SingleLineCommentRule(comment) );
        listOfRules.add( new MultiLineRule("/*", "*/", comment) );
        
 /*       // Rules for operation and blocks
        //listOfRules.add( new MultiLineRule("operation", "abstract", operation) );
        //listOfRules.add( new MultiLineRule("operation", "end", operation) );
        
        listOfRules.add( new EndOfLineRule("operation", operation) );
        listOfRules.add( new EndOfLineRule("method", operation) );
        listOfRules.add( new MultiLineRule("do", "end", block) );
        // listOfRules.add( new EndOfLineRule("do", block) );
        //listOfRules.add( new EndOfLineRule("end", block) );*/
        
        listOfRules.add( new EndOfLineRule("using", using) );
        listOfRules.add( new EndOfLineRule("class", classDeclaration) );
        
        IPredicateRule[] rules = listOfRules.toArray( new IPredicateRule[listOfRules.size()] );        
        setPredicateRules(rules);  
	}
	
	private class SingleLineCommentRule implements IPredicateRule {

		public IToken evaluate(ICharacterScanner scanner, boolean resume) {
			IToken returnedToken = Token.UNDEFINED;
			boolean found = false;
			int backtrack = 0;
			
			int code = scanner.read();
			backtrack++;
			if ( code != -1 ) {
				char[] chars = Character.toChars( code );
				String s = new String(chars);
				if ( s.equals("/") ) {
					code = scanner.read();
					backtrack++;
					chars = Character.toChars( code );
					s = new String(chars);
					if ( s.equals("/") ) {
						// Read until we find an EOL
						boolean ok = true;
						boolean quoteFound = false;
						do {
							code = scanner.read();
							backtrack++;
							chars = Character.toChars( code );
							for ( int i = 0; i < chars.length; i++ ) {
								if ( chars[i] == '"' ) {
									if ( quoteFound )
										quoteFound = false;
									else
										quoteFound = true;
								} else if ( chars[i] == '\n' ) {
									ok = false;
									if ( ! quoteFound ) {
										returnedToken = _token;
										found = true;
									}
								}
							}
						} while ( ok );
					}
				}
			}
			if ( ! found ) {
				for ( int i = 0; i < backtrack; i++ )
					scanner.unread();
			}
				
			return returnedToken;
		}

		public IToken getSuccessToken() {
			return _token;
		}

		private IToken _token;
		
		public SingleLineCommentRule(IToken token) {
			_token = token;
		}
		
		public IToken evaluate(ICharacterScanner scanner) {
			return evaluate(scanner, true);
		}
	}
	
}


