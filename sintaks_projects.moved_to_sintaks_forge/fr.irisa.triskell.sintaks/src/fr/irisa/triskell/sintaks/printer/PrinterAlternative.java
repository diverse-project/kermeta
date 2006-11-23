/*
 * Created on 17 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.printer;

import java.io.PrintWriter;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.irisa.triskell.sintaks.subject.ModelSubject;

import sts.Alternative;
import sts.Condition;
import sts.PolymorphicCond;
import sts.Rule;
import sts.RuleRef;

public class PrinterAlternative implements IPrinter {

	public PrinterAlternative(Rule alternative, ModelSubject subject) {
		super();
		this.alternative = (Alternative) alternative;
        this.subject = subject;
	}

	public void print(PrintWriter output) throws PrinterSemanticException {
		EList list = alternative.getConditions();
		if (list == null)
			throw new PrinterSemanticException ("Alternative : alternatives "+alternative.getConditions()+" inaceptable");

		Iterator i = list.iterator();
		while (i.hasNext()) {
			Object o = i.next();
			
			if (!(o instanceof Condition))
				throw new PrinterSemanticException ("Alternative : condition "+o+" inaceptable");
			
			if (o != null) {
				Object tmp = null;
				EStructuralFeature feature = null;
				Condition cond = (Condition) o;
				boolean doPop = false;
//TODO understand the purpose of this hack				
				// In case of a PolymorphicCond, it may be necessary to push the property to be set
				// onto the stack. It is here assumed that the subrule of a PolymorphicCond is a
				// RuleRef (although the metamodel allows any kind of rule).
				// The property is pushed onto the stack in case this RuleRef define a Feature
				// (which should correspond to an Alternative that is not contained by an Iteration).
				//
				// TODO This may be improved by re-engeniring the Condition, PolymorphicCond and
				// ConditionalCond elements of the metamodel.  
				if(cond instanceof PolymorphicCond) {
					Object subRule = cond.getSubRule();
					if(subRule instanceof RuleRef) {
						RuleRef rr = (RuleRef) subRule;
						if(! rr.getFeatures().isEmpty() )
							feature = (EStructuralFeature) rr.getFeatures().get(0);
						if(feature != null) {
							tmp = subject.getFeature(feature);
							subject.push(tmp);
							doPop = true;
						}
					}
				}
				
				IPrinter printer = new PrinterCondition ((Condition) o, subject, doPop);
				printer.print(output);
			}
		}
	}

	private Alternative alternative;
    private ModelSubject subject;
}
