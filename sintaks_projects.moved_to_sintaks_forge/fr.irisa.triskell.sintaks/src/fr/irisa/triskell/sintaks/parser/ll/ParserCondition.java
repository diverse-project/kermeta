/*
 * Created on 17 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.parser.ll;


import fr.irisa.triskell.sintaks.lexer.ILexer;
import fr.irisa.triskell.sintaks.parser.IParser;
import fr.irisa.triskell.sintaks.parser.ParserSemanticException;
import fr.irisa.triskell.sintaks.SintaksPlugin;
import fr.irisa.triskell.sintaks.subject.ModelSubject;

import sts.Condition;


public class ParserCondition implements IParser {

	public ParserCondition(Condition condition, ModelSubject subject) {
		super();
		this.condition = condition;
        this.subject = subject;
	}

	public boolean parse(ILexer input) throws ParserSemanticException {
		if (condition.getSubRule() != null) {
			IParser parser = ParserRule.findParser (condition.getSubRule(), subject);
			if (SintaksPlugin.getDefault().getOptionManager().isDebugParser())
				SintaksPlugin.getDefault().debugln ("   Trying              "+condition);
			boolean ok = parser.parse(input);
	        if (SintaksPlugin.getDefault().getOptionManager().isDebugParser()) {
	    		if (ok) {
	    			SintaksPlugin.getDefault().debugln ("   Tried successfully "+condition);
	    		} else {
	    			SintaksPlugin.getDefault().debugln ("   Tried and failed "+condition);
	    		}
	        }
			return ok;
		} else {
			return true;
		}
	}
	
	private Condition condition;
    private ModelSubject subject;
}
