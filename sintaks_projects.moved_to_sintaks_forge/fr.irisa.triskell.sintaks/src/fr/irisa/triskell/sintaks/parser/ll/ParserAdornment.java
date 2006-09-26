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
import fr.irisa.triskell.sintaks.subject.ModelSubject;

import sts.Adornment;
import sts.Rule;


public class ParserAdornment implements IParser {

	public ParserAdornment(Rule adornment, ModelSubject subject) {
		super();
		this.adornment = (Adornment) adornment;
	}

	public boolean parse(ILexer input) throws ParserSemanticException {
		return true;
	}

	private Adornment adornment;
}
