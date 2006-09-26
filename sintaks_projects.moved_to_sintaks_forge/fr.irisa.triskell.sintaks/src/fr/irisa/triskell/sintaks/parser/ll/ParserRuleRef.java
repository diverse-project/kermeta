/*
 * Created on 17 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.parser.ll;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.irisa.triskell.sintaks.lexer.ILexer;
import fr.irisa.triskell.sintaks.parser.IParser;
import fr.irisa.triskell.sintaks.parser.ModelParser;
import fr.irisa.triskell.sintaks.parser.ParserSemanticException;
import fr.irisa.triskell.sintaks.subject.Feature;
import fr.irisa.triskell.sintaks.subject.ModelSubject;

import sts.RuleRef;
import sts.Rule;

public class ParserRuleRef implements IParser {

	public ParserRuleRef(Rule rule, ModelSubject subject) {
		super();
		this.rule = (RuleRef) rule;
        this.subject = subject;
	}

	public boolean parse(ILexer input) throws ParserSemanticException {
		Rule referedRule = rule.getRef();
		IParser parser = ParserRule.findParser(referedRule, subject);
		boolean ok = parser.parse(input);

		if(ok) {
			EList fList = rule.getFeatures();
			
            if (ModelParser.debugParser) {
            	System.out.println ("Model Before");
				subject.print(System.out);
			}
            
            if (fList.isEmpty()) {
        		EObject o = (EObject) subject.top();
	            if (ModelParser.debugParser)
	                System.out.println ("Accepted RuleRef : "+o);
	            ok = true;
			}
            else {
            	Iterator it = fList.iterator();
				EObject o = (EObject) subject.top();
				subject.pop();
            	while(it.hasNext() && ok) {
            		Feature attribute = new Feature((EStructuralFeature) it.next());
            		
            		if (! subject.setAttribute (attribute, o)) {
    					ok = false;
    				}
            	}
			}
            
            if (ModelParser.debugParser) {
            	System.out.println ("Model After");
				subject.print(System.out);
			}
		}
		return ok;
	}

	private RuleRef rule;
    private ModelSubject subject;
}
