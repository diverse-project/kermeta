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

import sts.Rule;
import sts.PrimitiveValue;

public class PrinterPrimitiveValue implements IPrinter {

	public PrinterPrimitiveValue(Rule value, ModelSubject subject) {
		super();
		this.value = (PrimitiveValue) value;
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
        String text = object.toString();
        if (text != null && text.length()!=0) {
        	output.print(IPrinter.separator);
        	output.print(text);
        	output.print(IPrinter.separator);
        }
    }
	
	private PrimitiveValue value;
    private ModelSubject subject;
}
