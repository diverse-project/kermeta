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

import sts.Constant;
import sts.Rule;


public class PrinterConstant implements IPrinter {

	public PrinterConstant(Rule value, ModelSubject subject) {
		super();
		this.value = (Constant) value;
        this.subject = subject;
	}

	public void print (PrintWriter output) throws PrinterSemanticException {
		EStructuralFeature feature = null;
		if(! value.getFeatures().isEmpty())
			feature = (EStructuralFeature) value.getFeatures().get(0);
        
    	Object object;
        if(feature != null) {
        	object = subject.getFeature (feature);
        } else {
        	object = subject.top();
        }
        @SuppressWarnings("unused")
		String text = object.toString();
    }
	
	private Constant value;
    private ModelSubject subject;
}
