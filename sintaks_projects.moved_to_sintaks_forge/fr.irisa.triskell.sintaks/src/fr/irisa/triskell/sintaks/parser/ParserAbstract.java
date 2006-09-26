/*
 * Created on 4 févr. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.parser;

import fr.irisa.triskell.sintaks.lexer.ILexer;
import fr.irisa.triskell.sintaks.parser.ll.ParserRule;
import fr.irisa.triskell.sintaks.subject.ModelSubject;
import sts.Rule;

public class ParserAbstract implements IParser {

    public ParserAbstract (Rule rule, ModelSubject subject) {
        this.rule = rule;
        this.subject = subject;
    }

    public boolean parse (ILexer input) throws ParserSemanticException
    {
        IParser parser = new ParserRule (rule, subject);
        return parser.parse(input);
    }

    private Rule rule;
    private ModelSubject subject;
}
