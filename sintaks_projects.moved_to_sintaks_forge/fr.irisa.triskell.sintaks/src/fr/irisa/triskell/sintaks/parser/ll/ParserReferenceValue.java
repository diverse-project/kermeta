/*
 * Created on 17 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.parser.ll;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import sts.ObjectReference;
import sts.Rule;
import fr.irisa.triskell.sintaks.lexer.ILexer;
import fr.irisa.triskell.sintaks.parser.IParser;
import fr.irisa.triskell.sintaks.parser.ParserSemanticException;
import fr.irisa.triskell.sintaks.SintaksPlugin;
import fr.irisa.triskell.sintaks.subject.ModelSubject;

public class ParserReferenceValue implements IParser {

	public ParserReferenceValue(Rule value, ModelSubject subject) {
		super();
		this.value = (ObjectReference) value;
        this.subject = subject;
	}

	public boolean parse(ILexer input) throws ParserSemanticException {
		EList features = value.getFeatures();
        EStructuralFeature id = value.getIdentifier();
        if (id == null) 
            throw new ParserSemanticException ("ReferenceValue : id      "+((EClass) id.eContainer()).getName()+"."+id.getName()+" inaceptable");
		if (input.atEnd()) return false;
        String textRead = input.get();
        EObject instance = subject.findInstance(id, textRead);
        boolean ok;
        if (instance != null) {
	        if(! features.isEmpty()) {
	        	ok = subject.setFeatures(features, instance);
	        } else {
	        	subject.push(instance);
	        	ok = true;
	        }
	        if (SintaksPlugin.getDefault().getOptionManager().isDebugParser())
	        	SintaksPlugin.getDefault().debugln ("Accepted Reference to : "+id);
        } else {
        	ok = true;
        	if (! subject.createGhosts (features, id, textRead)) {
                throw new ParserSemanticException ("Unable to create a Ghost : "+((EClass) id.eContainer()).getName()+"."+id.getName()+" inaceptable");
        	}
        }
		input.next();
        return ok;
	}
	
	private ObjectReference value;
    private ModelSubject subject;
}
