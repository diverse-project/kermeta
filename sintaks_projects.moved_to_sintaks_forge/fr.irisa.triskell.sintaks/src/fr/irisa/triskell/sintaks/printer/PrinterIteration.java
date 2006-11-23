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

import sts.Iteration;
import sts.Rule;

public class PrinterIteration implements IPrinter {

	public PrinterIteration(Rule iteration, ModelSubject subject) {
		super();
		this.iteration = (Iteration) iteration;
        this.subject = subject;
	}

	private void printOne (PrintWriter output, IPrinter rulePrinter, Object object) throws PrinterSemanticException {
        subject.push(object);
        rulePrinter.print(output);
        subject.pop();
	}

	private Iterator iterator () {
        Iterator iterator = null;
        EStructuralFeature container = iteration.getContainer();
        Object object = subject.getFeature (container);
        if (object == null) return null;
        if (object instanceof EList) {
	        EList list = (EList) object;
	        if (list != null)
	            iterator = list.iterator();
	        return iterator;
        } else {
        	return null;
        }
	}

	private void printWithSeparator (PrintWriter output) throws PrinterSemanticException {
        EStructuralFeature container = iteration.getContainer();
        if (container == null)
            throw new PrinterSemanticException ("Iteration : null container");

		IPrinter rulePrinter = PrinterRule.findPrinter (iteration.getSubRule(), subject);
        if (rulePrinter == null)
            throw new PrinterSemanticException ("Iteration : rulePrinter "+iteration.getSubRule()+" inaceptable");
            
        IPrinter separatorPrinter = PrinterRule.findPrinter (iteration.getSeparator(), subject);

        Iterator i = iterator();
        if (i != null) {
        	if(i.hasNext()) {
        		printOne (output, rulePrinter, i.next());
        	}
	    	while (i.hasNext()) {
	    		separatorPrinter.print(output);
	        	printOne (output, rulePrinter, i.next());
		    }
        }
    }

    private void printWithoutSeparator (PrintWriter output) throws PrinterSemanticException {
        EStructuralFeature container = iteration.getContainer();
        if (container == null)
            throw new PrinterSemanticException ("Iteration : null container");

        IPrinter rulePrinter = PrinterRule.findPrinter (iteration.getSubRule(), subject);
        if (rulePrinter == null)
            throw new PrinterSemanticException ("Iteration : rulePrinter "+iteration.getSubRule()+" inaceptable");

        Iterator i = iterator();
        if (i != null) {
            while (i.hasNext()) {
            	printOne (output, rulePrinter, i.next());
            }
        }
    }

    public void print (PrintWriter output) throws PrinterSemanticException {
        if (iteration.getSeparator() == null) {
            printWithoutSeparator (output);
        } else {
            printWithSeparator (output);
        }
    }

	private Iteration iteration;
    private ModelSubject subject;
}
