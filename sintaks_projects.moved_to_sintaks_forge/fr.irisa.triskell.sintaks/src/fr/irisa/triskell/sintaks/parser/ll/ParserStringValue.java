/*
 * Created on 17 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.parser.ll;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.irisa.triskell.sintaks.lexer.ILexer;
import fr.irisa.triskell.sintaks.parser.IParser;
import fr.irisa.triskell.sintaks.parser.ModelParser;
import fr.irisa.triskell.sintaks.parser.ParserSemanticException;
import fr.irisa.triskell.sintaks.subject.Feature;
import fr.irisa.triskell.sintaks.subject.ModelSubject;

import sts.StringValue;
import sts.Rule;

public class ParserStringValue implements IParser {

	public ParserStringValue(Rule value, ModelSubject subject) {
		super();
		this.value = (StringValue) value;
        this.subject = subject;
	}

	public boolean parse(ILexer input) throws ParserSemanticException {
		EList fList = value.getFeatures();
		
        if (input.atEnd()) return false;
        String textRead = input.get();
        
        if(subject.isTerminal(textRead)) return false;
        
        if(! fList.isEmpty()) {
        	Iterator it = fList.iterator();
        	while(it.hasNext()) {
        		Feature attribute = new Feature ((EStructuralFeature) it.next());
        		if(! subject.setAttribute(attribute, textRead)) {
        			return false;
        		}
        	}
            if (ModelParser.debugParser) System.out.println ("Accepted String : "+textRead);
			input.next();
        	return true;
        }
        else {
        	subject.push(textRead);
        	if(ModelParser.debugParser) System.out.println ("Accepted String : "+textRead);
        	input.next();
        	return true;
        }
	}
	

	private StringValue value;
    private ModelSubject subject;
}
