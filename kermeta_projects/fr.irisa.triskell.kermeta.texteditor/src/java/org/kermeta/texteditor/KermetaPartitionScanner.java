

/*$Id: KermetaPartitionScanner.java,v 1.2 2008-02-14 07:13:42 uid21732 Exp $
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
        listOfRules.add( new EndOfLineRule("//", comment) );
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
	
}


