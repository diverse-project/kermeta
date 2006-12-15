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

public class KMTRuleBasedPartitionScanner extends RuleBasedPartitionScanner {

	static public String ID = "__BASIC_SCANNER__";
	
	static public String KMT_Comment = "__KMT_COMMENT__";
	static public String KMT_Code = "__KMT_CODE__";
	
	
	private Token comment = new Token ( KMT_Comment );
	private Token code = new Token ( KMT_Code );
	
	public KMTRuleBasedPartitionScanner() {
		
		super();
		setPredicateRules( getRules() );
		
	}
	
	
	private IPredicateRule[] getRules() {
		
		IPredicateRule[] predicateRules = new IPredicateRule[3];
		
		predicateRules[0] = new MultiLineRule("/*", "*/", comment);
		predicateRules[1] = new MultiLineRule("/**", "*/", comment);
		predicateRules[2] = new EndOfLineRule("//", comment);
		
		return predicateRules;
		
	}
	
	static public String[] getLegalContentTypes() {
		return new String[] { KMT_Comment, KMT_Code };
	}
	
}
