/*
 * Created on 17 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.parser.ll;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.irisa.triskell.sintaks.lexer.ILexer;
import fr.irisa.triskell.sintaks.parser.IParser;
import fr.irisa.triskell.sintaks.parser.ModelParser;
import fr.irisa.triskell.sintaks.parser.ParserSemanticException;
import fr.irisa.triskell.sintaks.subject.Feature;
import fr.irisa.triskell.sintaks.subject.ModelSubject;
import fr.irisa.triskell.sintaks.subject.Reference;

import sts.ObjectReference;
import sts.Rule;

public class ParserReferenceValue implements IParser {

	public ParserReferenceValue(Rule value, ModelSubject subject) {
		super();
		this.value = (ObjectReference) value;
        this.subject = subject;
	}

	public boolean parse(ILexer input) throws ParserSemanticException {
        EList fList = value.getFeatures();
        if (fList.isEmpty()) 
            //throw new ParserSemanticException ("ReferenceValue : feature "+((EClass) feature.eContainer()).getName()+"."+feature.getName()+" inaceptable");
        	throw new ParserSemanticException ("ReferenceValue inaceptable...");

        EStructuralFeature id = value.getIdentifier();
        if (id == null) 
            throw new ParserSemanticException ("ReferenceValue : id      "+((EClass) id.eContainer()).getName()+"."+id.getName()+" inaceptable");

        if (input.atEnd()) return false;
        String textRead = input.get();
        
        Iterator it = fList.iterator();
        while(it.hasNext()) {
            Reference reference = new Reference (new Feature((EStructuralFeature) it.next()), new Feature(value.eClass(), id));

            if (! subject.setReference (reference, textRead)) {
    			return false;
    		}
        }
        if (ModelParser.debugParser) System.out.println ("Accepted Reference : "+textRead);
		input.next();
		return true;
	}

	private ObjectReference value;
    private ModelSubject subject;
}
