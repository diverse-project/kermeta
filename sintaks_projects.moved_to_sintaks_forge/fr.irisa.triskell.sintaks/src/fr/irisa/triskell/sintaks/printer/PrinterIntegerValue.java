/*
 * Created on 17 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.printer;

import java.io.PrintWriter;

import org.eclipse.emf.ecore.EStructuralFeature;

import fr.irisa.triskell.sintaks.subject.Feature;
import fr.irisa.triskell.sintaks.subject.ModelSubject;

import sts.IntegerValue;
import sts.Rule;

public class PrinterIntegerValue implements IPrinter {

    public PrinterIntegerValue(Rule value, ModelSubject subject) {
        super();
        this.value = (IntegerValue) value;
        this.subject = subject;
    }

    public void print (PrintWriter output) throws PrinterSemanticException {
		EStructuralFeature smmFeature = null;
		if(! value.getFeatures().isEmpty())
			smmFeature = (EStructuralFeature) value.getFeatures().get(0);
        
        if(smmFeature != null) {
            Feature feature = new Feature (smmFeature);
            Integer text = (Integer) subject.getAttribute (feature);
            output.print(IPrinter.separator);
            output.print(text);
            output.print(IPrinter.separator);
        }
        else {
        	Integer i = (Integer) subject.top();
            output.print(IPrinter.separator);
            output.print(i.toString());
            output.print(IPrinter.separator);
        }
    }

	private IntegerValue value;
    private ModelSubject subject;
}
