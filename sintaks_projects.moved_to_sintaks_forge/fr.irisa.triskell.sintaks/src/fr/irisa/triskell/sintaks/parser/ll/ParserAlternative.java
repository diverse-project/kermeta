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

import sts.Alternative;
import sts.Condition;
import sts.Rule;


public class ParserAlternative implements IParser {

	public ParserAlternative(Rule alternative, ModelSubject subject) {
		super();
		this.alternative = (Alternative) alternative;
        this.subject = subject;
	}

	public boolean parse(ILexer input) throws ParserSemanticException {
		EList list = alternative.getCondition();
		if (list == null)
			throw new ParserSemanticException ("Alternative : alternatives "+alternative.getCondition()+" inaceptable");

		Iterator i = list.iterator();
		boolean ok = false;
		long position = input.getPosition();
		boolean loop = true;
		while (loop) {
			if (i.hasNext()) {
				Object o = i.next();
				if (!(o instanceof Condition))
					throw new ParserSemanticException ("Alternative : condition "+o+" inaceptable");
				IParser parser = new ParserCondition ((Condition) o, subject);
				input.back(position);
				ok = parser.parse(input);
				if (ok) loop=false;
			} else {
				loop = false;
			}
		}
		return ok;
	}

	private Alternative alternative;
    private ModelSubject subject;
}
