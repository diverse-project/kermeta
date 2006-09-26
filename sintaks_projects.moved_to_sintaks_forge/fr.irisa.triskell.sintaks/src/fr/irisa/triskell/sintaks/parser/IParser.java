/*
 * Created on 17 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.parser;

import fr.irisa.triskell.sintaks.lexer.ILexer;

public interface IParser {

	public abstract boolean parse(ILexer input) throws ParserSemanticException;

}