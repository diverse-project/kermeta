/*
 * Created on 17 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.parser.ll;

import fr.irisa.triskell.sintaks.lexer.ILexer;
import fr.irisa.triskell.sintaks.parser.IParser;
import fr.irisa.triskell.sintaks.parser.ModelParser;
import fr.irisa.triskell.sintaks.parser.ParserSemanticException;
import fr.irisa.triskell.sintaks.subject.ModelSubject;
import sts.Rule;
import sts.Terminal;

public class ParserTerminal implements IParser {

	public ParserTerminal(Rule terminal, ModelSubject subject) {
		super();
		this.terminal = (Terminal) terminal;
	}

	public boolean parse(ILexer input) throws ParserSemanticException {
		String textReference = terminal.getTerminal();
        if (input.atEnd()) return false;
		String textRead = input.get();
		if (textReference.equals(textRead)) {
            if (ModelParser.debugParser)
                System.out.println ("Accepted Terminal : "+textRead);
			input.next();
			return true;
		} else {
            if (ModelParser.debugParser)
                System.out.println ("Refused Terminal : "+textRead);
			return false;
		}
	}

	private Terminal terminal;
}
