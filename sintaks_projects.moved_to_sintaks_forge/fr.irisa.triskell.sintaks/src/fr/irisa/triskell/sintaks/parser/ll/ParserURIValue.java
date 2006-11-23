/*
 * Created on 17 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.parser.ll;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;

import sts.Rule;
import sts.URIValue;
import fr.irisa.triskell.sintaks.lexer.ILexer;
import fr.irisa.triskell.sintaks.parser.IParser;
import fr.irisa.triskell.sintaks.parser.ParserSemanticException;
import fr.irisa.triskell.sintaks.SintaksPlugin;
import fr.irisa.triskell.sintaks.subject.ModelSubject;


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
		EList features = value.getFeatures();
		if (input.atEnd()) return false;
        String textRead = input.get();
        EObject value = getEObjectFromStringURI (textRead);
        boolean ok;
        if (value != null) {
	        if(! features.isEmpty()) {
	        	ok = subject.setFeatures(features, value);
	        } else {
	        	subject.push(value);
	        	ok = true;
	        }
	        if (SintaksPlugin.getDefault().getOptionManager().isDebugParser())
	        	SintaksPlugin.getDefault().debugln ("Accepted URI : "+value);
			input.next();
        } else {
        	ok = false;
	        if (SintaksPlugin.getDefault().getOptionManager().isDebugParser())
	        	SintaksPlugin.getDefault().debugln ("Refused URI : "+value);
        }
        return ok;
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
