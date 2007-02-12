package fr.irisa.triskell.kermeta.texteditor.editors;

import java.util.ArrayList;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

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
		
		IPredicateRule[] predicateRules = new IPredicateRule[4];
		
		predicateRules[0] = new MultiLineRule("/**", "*/", tag);
		predicateRules[1] = new MultiLineRule("/*", "*/", comment);
		predicateRules[2] = new EndOfLineRule("//", comment);
		
		predicateRules[3] = new MultiLineRule("\"", "\"", literal);
		
		return predicateRules;
		
	}
	
	static public String[] getLegalContentTypes() {
		return new String[] { KMT_COMMENT, KMT_TAG, KMT_STRING };
	}
	
}
