/*
 * Created on 17 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.parser.ll;

import org.eclipse.emf.ecore.EStructuralFeature;

import fr.irisa.triskell.sintaks.lexer.ILexer;
import fr.irisa.triskell.sintaks.parser.IParser;
import fr.irisa.triskell.sintaks.parser.ModelParser;
import fr.irisa.triskell.sintaks.parser.ParserSemanticException;
import fr.irisa.triskell.sintaks.subject.Feature;
import fr.irisa.triskell.sintaks.subject.ModelSubject;

import sts.Iteration;
import sts.Rule;

public class ParserIteration implements IParser {

	public ParserIteration(Rule iteration, ModelSubject subject) {
		super();
		this.iteration = (Iteration) iteration;
        this.subject = subject;
	}

	private void accept () {
		EStructuralFeature container = iteration.getContainer();
		Feature attribute = new Feature(container);
        if (ModelParser.debugParser)
            System.out.println ("Iteration : addFeature "+attribute);
		Object object = subject.top();
		subject.pop();
        subject.addFeature (attribute, object);
	}

	private void reject (ILexer lexer, long position) {
        if (ModelParser.debugParser)
            System.out.println ("Iteration : backtracking ");
		lexer.back(position);
	}

	private boolean parseWithSeparator (ILexer lexer) throws ParserSemanticException {
		IParser ruleParser = ParserRule.findParser (iteration.getSubRule(), subject);
		if (ruleParser == null)
			throw new ParserSemanticException ("Iteration : ruleParser "+iteration.getSubRule()+" inaceptable");
			
		IParser separatorParser = ParserRule.findParser (iteration.getSeparator(), subject);

		
		
		boolean ok = true;
		boolean loop = true;
		long position = lexer.getPosition();
		int state = 1;
		if (ruleParser.parse(lexer)) {
			accept ();
			state=2;
		} else {
			loop=false;
            reject (lexer, position);
		}
		while (loop) {
            position = lexer.getPosition();
			switch (state) {
			case 1 :
				if (ruleParser.parse(lexer)) {
					accept ();
					state=2;
				} else {
					loop=false;
					ok = false;
                    reject (lexer, position);
				}
				break;
			case 2 :
				if (separatorParser.parse(lexer)) {
					state=1;
				} else {
					loop=false;
                    reject (lexer, position);
				}
				break;
			}
		}

		return ok;
	}

	private boolean parseWithoutSeparator (ILexer lexer) throws ParserSemanticException {
		IParser ruleParser = ParserRule.findParser (iteration.getSubRule(), subject);
		if (ruleParser == null)
			throw new ParserSemanticException ("Iteration : ruleParser "+iteration.getSubRule()+" inaceptable");
			
		boolean ok = true;
		boolean loop = true;
		while (loop) {
			long position = lexer.getPosition();
			if (ruleParser.parse(lexer)) {
				accept();
			} else {
				loop=false;
                reject(lexer, position);
			}
		}
		return ok;
	}

	public boolean parse(ILexer lexer) throws ParserSemanticException {
		EStructuralFeature container = iteration.getContainer();
		if (container == null)
            throw new ParserSemanticException ("ParserIteration : null container ");

		boolean ok;
		if (iteration.getSeparator() == null) {
			ok = parseWithoutSeparator (lexer);
		} else {
			ok = parseWithSeparator (lexer);
		}
		return ok;
	}

	private Iteration iteration;
    private ModelSubject subject;
}
