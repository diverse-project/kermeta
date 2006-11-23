/*
 * Created on 17 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.printer;

import java.io.PrintWriter;

import org.eclipse.emf.ecore.EStructuralFeature;

import fr.irisa.triskell.sintaks.subject.ModelSubject;

import sts.RuleRef;
import sts.Rule;

public class PrinterRuleRef implements IPrinter {

	public PrinterRuleRef(Rule rule, ModelSubject subject) {
		super();
		this.rule = (RuleRef) rule;
        this.subject = subject;
	}

	public void print(PrintWriter output) throws PrinterSemanticException {
		Rule referedRule = rule.getRef();
		IPrinter printer = PrinterRule.findPrinter(referedRule, subject);
		
		EStructuralFeature feature = null;
		if(! rule.getFeatures().isEmpty())
			feature = (EStructuralFeature) rule.getFeatures().get(0);
		
		if (feature != null) {
			Object value = subject.getFeature (feature);
	        subject.push(value);
			printer.print(output);
			subject.pop();
		} else {
			printer.print(output);
		}
	}

	private RuleRef rule;
    private ModelSubject subject;
}
