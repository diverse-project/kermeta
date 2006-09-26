/*
 * Created on 17 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.printer;

import java.io.PrintWriter;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;

import fr.irisa.triskell.sintaks.subject.Feature;
import fr.irisa.triskell.sintaks.subject.ModelSubject;

import sts.Condition;
import sts.CustomCond;
import sts.PolymorphicCond;


public class PrinterCondition implements IPrinter {

	public PrinterCondition(Condition condition, ModelSubject subject) {
		super();
		this.condition = (Condition) condition;
        this.subject = subject;
        this.doPop = false;
	}
	
	public PrinterCondition(Condition condition, ModelSubject subject, boolean pop) {
		super();
		this.condition = (Condition) condition;
        this.subject = subject;
        this.doPop = pop;
	}
	
	private boolean valid (PolymorphicCond c) {
		EObject top = (EObject) subject.top();
		
		if(doPop) {
			subject.pop();
		}
		
		String value = c.getValue();
		String name = top.eClass().getName();
		
		if (value == null) {
			EClass metaClass = c.getMetaclass();
			if (metaClass == null) return false;
			String metaClassName = metaClass.getName();
			return metaClassName.equals(name);
		}
		else {
			if ("null".equals(value)) {
				if (name == null) return true;
				if ("".equals(name)) return true;
				return false;
			}
			if ("any".equals(value)) {
				if (name == null) return false;
				if ("".equals(name)) return false;
				return true;
			}
			EClass metaClass = c.getMetaclass();
			if (metaClass == null) return false;
			String metaClassName = metaClass.getName();
			if ("equals".equals(value))
				return metaClassName.equals(name);
			if ("differs".equals(value))
				return ! metaClassName.equals(name);
			return false;
		}
	}

	private boolean valid (CustomCond c) {
		Feature feature = new Feature (c.getFeature());
        Object o = subject.getAttribute(feature);
        String value = c.getValue();
		if ("null".equals(value))
			return (o == null);
		if ("any".equals(value))
			return (o != null);
		if ("empty".equals(value)) {
			if (o == null) return true;
            if (o instanceof String) {
                String s = (String) o;
                if (s.length()==0) return true;
                return false;
            }
			if (o instanceof List) {
				List list = (List) o;
				if (list.size()==0) return true;
				return false;
			}
		}
		if ("filled".equals(value)) {
			if (o == null) return false;
            if (o instanceof String) {
                String s = (String) o;
                if (s.length()==0) return false;
                return true;
            }
			if (o instanceof List) {
				List list = (List) o;
				if (list.size()==0) return false;
				return true;
			}
		}
		return false;
	}

	public void print(PrintWriter output) throws PrinterSemanticException {
		if (condition.getSubRule() != null) {
			IPrinter printer = PrinterRule.findPrinter (condition.getSubRule(), subject);
			if (condition instanceof PolymorphicCond) {
				if (valid ((PolymorphicCond) condition))  
					printer.print(output);
			}
			if (condition instanceof CustomCond) {
				if (valid ((CustomCond) condition))  
					printer.print(output);
			}
		}
	}

	private Condition condition;
    private ModelSubject subject;
    private boolean doPop;
}
