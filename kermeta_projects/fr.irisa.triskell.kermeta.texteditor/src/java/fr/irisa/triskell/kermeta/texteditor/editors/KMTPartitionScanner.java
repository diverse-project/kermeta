/* $Id: KMTPartitionScanner.java,v 1.5 2007-12-17 14:05:06 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : KMTPartitionScanner.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 26 jan. 2007
* Author : ftanguy (ftanguy@irisa.fr)
*/

package fr.irisa.triskell.kermeta.texteditor.editors;

import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.Token;

public class KMTPartitionScanner extends RuleBasedPartitionScanner {

	static public String ID = "__BASIC_SCANNER__";
	
	static public String KMT_COMMENT = "__KMT_COMMENT__";
	static public String KMT_TAG = "__KMT_TAG__";
	
	static public String KMT_STRING = "__KMT_STRING__";
	
	static public String KMT_Code = "__KMT_CODE__";
	
	
	public KMTPartitionScanner() {
		super();
		setPredicateRules( getRules() );
	}
	
	
	private IPredicateRule[] getRules() {

		Token comment = new Token ( KMT_COMMENT );
		Token tag = new Token ( KMT_TAG );
		Token literal = new Token ( KMT_STRING );
		
		IPredicateRule[] predicateRules = new IPredicateRule[5];
		
		predicateRules[0] = new MultiLineRule("/**", "*/", tag);
		predicateRules[1] = new MultiLineRule("/*", "*/", comment);
		predicateRules[2] = new EndOfLineRule("//", comment);
		predicateRules[4] = new EndOfLineRule("@", tag);
		
		predicateRules[3] = new MultiLineRule("\"", "\"", literal);
		
		return predicateRules;
		
	}
	
	static public String[] getLegalContentTypes() {
		return new String[] { KMT_COMMENT, KMT_TAG, KMT_STRING };
	}
	
}
