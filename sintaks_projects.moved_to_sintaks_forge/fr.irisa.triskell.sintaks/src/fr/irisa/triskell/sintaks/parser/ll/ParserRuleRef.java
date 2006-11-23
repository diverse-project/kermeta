/*
 * Created on 17 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.parser.ll;

import org.eclipse.emf.common.util.EList;

import sts.Rule;
import sts.RuleRef;
import fr.irisa.triskell.sintaks.lexer.ILexer;
import fr.irisa.triskell.sintaks.parser.IParser;
import fr.irisa.triskell.sintaks.parser.ParserSemanticException;
import fr.irisa.triskell.sintaks.SintaksPlugin;
import fr.irisa.triskell.sintaks.subject.ModelSubject;

public class ParserRuleRef implements IParser {

	public ParserRuleRef(Rule rule, ModelSubject subject) {
		super();
		this.rule = (RuleRef) rule;
        this.subject = subject;
	}

	public boolean parse(ILexer input) throws ParserSemanticException {
		Rule referedRule = rule.getRef();
		IParser parser = ParserRule.findParser(referedRule, subject);
		boolean ok = parser.parse(input);

		if(ok) {
			EList features = rule.getFeatures();
			
            if (! features.isEmpty()) {
				Object value = subject.top();
				subject.pop();
				ok = subject.setFeatures(features, value);
            } else {
            	// do nothing leave the object on the top of stack
            }
            if (SintaksPlugin.getDefault().getOptionManager().isDebugParser())
            	SintaksPlugin.getDefault().debugln ("Accepted RuleRef : "+referedRule);
		} else {
            if (SintaksPlugin.getDefault().getOptionManager().isDebugParser())
            	SintaksPlugin.getDefault().debugln ("Refused RuleRef : "+referedRule);
		}
		return ok;
	}

	private RuleRef rule;
    private ModelSubject subject;
}
