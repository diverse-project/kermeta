/*
 * Created on 17 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.parser.ll;

import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EPackage.Registry;

import fr.irisa.triskell.sintaks.lexer.ILexer;
import fr.irisa.triskell.sintaks.parser.IParser;
import fr.irisa.triskell.sintaks.parser.ModelParser;
import fr.irisa.triskell.sintaks.parser.ParserSemanticException;
import fr.irisa.triskell.sintaks.subject.Feature;
import fr.irisa.triskell.sintaks.subject.ModelSubject;

import sts.Rule;
import sts.URIValue;


public class ParserURIValue implements IParser {

	public ParserURIValue(Rule value, ModelSubject subject) {
		super();
		this.value = (URIValue) value;
        this.subject = subject;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.textloader.parser.IParser#parse(fr.irisa.triskell.kermeta.textloader.lexer.ILexer)
	 */
	public boolean parse(ILexer input) throws ParserSemanticException {
		EList fList = value.getFeatures();
		
        if (input.atEnd()) return false;
        String textRead = input.get();
        
       	EObject obj = getEObjectFromStringURI(textRead);
       	if(obj == null) return false;
        	
       	if(! fList.isEmpty()) {
       		Iterator it = fList.iterator();
       		
       		while(it.hasNext()) {
       			Feature attribute = new Feature((EStructuralFeature) it.next());
           		if(! subject.setAttribute(attribute, obj)) {
           			return false;
           		}
       		}
       		
   			if (ModelParser.debugParser) System.out.println ("Accepted URI: " + textRead);
   			input.next();
   			return true;
       	}
       	else {
           	subject.push(obj);
           	if(ModelParser.debugParser) System.out.println ("Accepted URI: " + textRead);
           	input.next();
           	return true;
        }
	}
	

	/**
	 * Get an EObject (ie an element of an ecore resource) from its URI, null if the URI cannot
	 * be resolved.
	 * @param text
	 * @return
	 */
	private EObject getEObjectFromStringURI(String text) {
       	URI objURI = URI.createURI(text);
       	String URIfrag = objURI.fragment();
       	if(URIfrag == null) return null;
       	
       	URIfrag = URIfrag.substring(2);
       	
       	String str = text.replace(objURI.fragment(), "").replace("#", "");
       	EPackage ePack = (EPackage) Registry.INSTANCE.get(str);
       	
       	EObject res = null;
       	if(URIfrag.contains("/")) {
       		String[] v = URIfrag.split("/");
       		String className = v[0]; 
       		String featName = v[1];
       		res = ((EClass) ePack.getEClassifier(className)).getEStructuralFeature(featName);
       	}
       	else {
       		res = ePack.getEClassifier( URIfrag );
       	}
       	
       	return res;
	}
	

	private URIValue value;
    private ModelSubject subject;
}
