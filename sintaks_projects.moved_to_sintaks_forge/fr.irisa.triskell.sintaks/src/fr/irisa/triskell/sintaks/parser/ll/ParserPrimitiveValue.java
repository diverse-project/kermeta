/*
 * Created on 17 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.parser.ll;

import org.eclipse.emf.common.util.EList;

import sts.PrimitiveValue;
import sts.Rule;
import fr.irisa.triskell.sintaks.lexer.ILexer;
import fr.irisa.triskell.sintaks.parser.IParser;
import fr.irisa.triskell.sintaks.parser.ParserSemanticException;
import fr.irisa.triskell.sintaks.SintaksPlugin;
import fr.irisa.triskell.sintaks.subject.ModelSubject;

public class ParserPrimitiveValue implements IParser {

	public ParserPrimitiveValue(Rule value, ModelSubject subject) {
		super();
		this.value = (PrimitiveValue) value;
        this.subject = subject;
	}

	public boolean parse(ILexer input) throws ParserSemanticException {
		EList features = value.getFeatures();
		if (input.atEnd()) return false;
        String textRead = input.get();
        
        if(input.isTerminal(textRead)) return false;
        
        boolean ok;
        if (textRead != null) {
	        if(! features.isEmpty()) {
	        	ok = subject.setFeatures(features, textRead);
	        } else {
	        	subject.push(textRead);
	        	ok = true;
	        }
	        if (SintaksPlugin.getDefault().getOptionManager().isDebugParser())
	        	SintaksPlugin.getDefault().debugln ("Accepted Primitive Value : "+textRead);
			input.next();
        } else {
        	ok = false;
	        if (SintaksPlugin.getDefault().getOptionManager().isDebugParser())
	        	SintaksPlugin.getDefault().debugln ("Refused Primitive Value : "+textRead);
        }
        return ok;
	}

	private PrimitiveValue value;
    private ModelSubject subject;
}
