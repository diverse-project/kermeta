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

import sts.Rule;
import sts.StringValue;

public class PrinterStringValue implements IPrinter {

	public PrinterStringValue(Rule value, ModelSubject subject) {
		super();
		this.value = (StringValue) value;
        this.subject = subject;
	}

	public void print (PrintWriter output) throws PrinterSemanticException {
		EStructuralFeature sFeature = null;
		if(! value.getFeatures().isEmpty())
			sFeature = (EStructuralFeature) value.getFeatures().get(0);
        
		String text = null;
        if(sFeature != null) {
            Feature feature = new Feature (sFeature);
            text = (String) subject.getAttribute (feature);
        }
        else {
        	text = (String) subject.top();
        }

        output.print(IPrinter.separator);
        output.print(text);
        output.print(IPrinter.separator);
    }

	private StringValue value;
    private ModelSubject subject;
}
