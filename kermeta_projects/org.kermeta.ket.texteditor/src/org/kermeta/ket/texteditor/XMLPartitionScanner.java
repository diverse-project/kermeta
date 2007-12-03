package org.kermeta.ket.texteditor;

import org.eclipse.jface.text.rules.*;

public class XMLPartitionScanner extends RuleBasedPartitionScanner {
	
	public final static String XML_TAG = "__xml_tag";

	public XMLPartitionScanner() {

		IToken tag = new Token(XML_TAG);

		IPredicateRule[] rules = new IPredicateRule[2];

		rules[0] = new MultiLineRule("<%=", "%>", tag);
		rules[1] = new MultiLineRule("<%", "%>", tag);

		setPredicateRules(rules);
	}
}
