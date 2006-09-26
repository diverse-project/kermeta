/*
 * Created on 17 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.parser.ll;

import java.util.Iterator;


import org.eclipse.emf.common.util.EList;

import fr.irisa.triskell.sintaks.lexer.ILexer;
import fr.irisa.triskell.sintaks.parser.IParser;
import fr.irisa.triskell.sintaks.parser.ParserSemanticException;
import fr.irisa.triskell.sintaks.subject.ModelSubject;


import sts.Rule;
import sts.Sequence;

public class ParserSequence implements IParser {

	public ParserSequence(Rule sequence, ModelSubject subject) {
		super();
		this.sequence = (Sequence) sequence;
        this.subject = subject;
	}

	public boolean parse(ILexer input) throws ParserSemanticException {
		EList list = sequence.getSubRules();
		Iterator i = list.iterator();
		boolean loop = true;
		boolean ok = true;
		int count=subject.size();
		while (loop) {
			if (i.hasNext()) {
				Rule rule = (Rule) i.next();
				IParser parser = ParserRule.findParser (rule, subject);
				if (! parser.parse(input)) {
					loop = false;
					ok = false;
				}
			} else {
				loop = false;
			}
		}
		if (! ok) {
			subject.pop(subject.size()-count);
		}
		return ok;
	}

	private Sequence sequence;
    private ModelSubject subject;
}
