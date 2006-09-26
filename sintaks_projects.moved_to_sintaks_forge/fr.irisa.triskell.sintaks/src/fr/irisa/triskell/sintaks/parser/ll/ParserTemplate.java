/*
 * Created on 17 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.parser.ll;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;

import fr.irisa.triskell.sintaks.lexer.ILexer;
import fr.irisa.triskell.sintaks.parser.IParser;
import fr.irisa.triskell.sintaks.parser.ModelParser;
import fr.irisa.triskell.sintaks.parser.ParserSemanticException;
import fr.irisa.triskell.sintaks.subject.ModelSubject;


import sts.Rule;
import sts.Template;

public class ParserTemplate implements IParser {

	public ParserTemplate(Rule rule, ModelSubject subject) {
		this.template = (Template) rule;
        this.subject = subject;
	}

	public boolean parse(ILexer input) throws ParserSemanticException {
		EClass metaClass = template.getMetaclass();
		if (metaClass == null)
			throw new ParserSemanticException ("Template : metaClass "+metaClass.getName()+" inaceptable");

        EObject object = subject.createInstance(metaClass);
        if (object == null)
			throw new ParserSemanticException ("Template : metaClass "+metaClass.getName()+" inaceptable");

        if (ModelParser.debugParser)
            System.out.println ("Template : metaClass "+metaClass.getName()+" created");
        subject.push(object);
        IParser parser = ParserRule.findParser(template.getRule(), subject);
        boolean ok = parser.parse(input);
		if (ok == false) {
	        subject.pop();
		}
		return ok;
	}

	private Template template;
    private ModelSubject subject;
}
