/*
 * Created on 17 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.parser.ll;

import org.eclipse.emf.common.util.EList;

import sts.Constant;
import sts.Rule;
import fr.irisa.triskell.sintaks.lexer.ILexer;
import fr.irisa.triskell.sintaks.parser.IParser;
import fr.irisa.triskell.sintaks.parser.ParserSemanticException;
import fr.irisa.triskell.sintaks.SintaksPlugin;
import fr.irisa.triskell.sintaks.subject.ModelSubject;

public class ParserConstant implements IParser {

	public ParserConstant(Rule value, ModelSubject subject) {
		super();
		this.value = (Constant) value;
        this.subject = subject;
	}

	public boolean parse(ILexer input) throws ParserSemanticException {
		EList features = value.getFeatures();
        String textRead = value.getValue();
//TODO should be converted in each kind of constant ecore and the MM supports
//like in Value
        String value = new String (textRead);
        boolean ok;
        if (value != null) {
	        if(! features.isEmpty()) {
	        	ok = subject.setFeatures(features, value);
	        } else {
	        	subject.push(value);
	        	ok = true;
	        }
	        if (SintaksPlugin.getDefault().getOptionManager().isDebugParser())
	        	SintaksPlugin.getDefault().debugln ("Accepted Constant : "+value);
        } else {
        	ok = false;
	        if (SintaksPlugin.getDefault().getOptionManager().isDebugParser())
	        	SintaksPlugin.getDefault().debugln ("Refused Constant : "+value);
        }
		return ok;
	}

	private Constant value;
    private ModelSubject subject;
}
