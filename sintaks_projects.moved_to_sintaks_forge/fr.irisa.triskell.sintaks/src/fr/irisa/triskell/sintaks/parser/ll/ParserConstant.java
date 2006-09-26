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

import sts.Constant;
import sts.Rule;

public class ParserConstant implements IParser {

	public ParserConstant(Rule value, ModelSubject subject) {
		super();
		this.value = (Constant) value;
        this.subject = subject;
	}

	public boolean parse(ILexer input) throws ParserSemanticException {
		EList fList = value.getFeatures();
		
		if (fList.isEmpty())
            //throw new ParserSemanticException ("Constant : feature "+((EClass) feature.eContainer()).getName()+"."+feature.getName()+" inaceptable");
			throw new ParserSemanticException ("Constant inaceptable");

        String text = value.getValue();
        
        Iterator it = fList.iterator();
        while(it.hasNext()) {
        	Feature attribute = new Feature((EStructuralFeature) it.next());
        	
    		if(! subject.setAttribute (attribute, text)) {
    			return false;
    		}
        }
        
        if (ModelParser.debugParser) System.out.println ("Accepted Constant : "+text);
		return true;
	}

	private Constant value;
    private ModelSubject subject;
}
