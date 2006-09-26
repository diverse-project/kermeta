/*
 * Created on 17 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.printer;

import java.io.PrintWriter;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.irisa.triskell.sintaks.subject.Feature;
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
		EStructuralFeature smmFeature = null;
		if(! value.getFeatures().isEmpty())
			smmFeature = (EStructuralFeature) value.getFeatures().get(0);
        
        if (smmFeature == null) 
            throw new PrinterSemanticException ("Constant : feature "+((EClass) smmFeature.eContainer()).getName()+"."+smmFeature.getName()+" inaceptable");

        Feature feature = new Feature (smmFeature);
        String textModel = (String) subject.getAttribute (feature);
        String textConstant = value.getValue();
        if (textModel != textConstant)
            throw new PrinterSemanticException ("Constant : feature "+((EClass) smmFeature.eContainer()).getName()+"."+smmFeature.getName()+" not constant");
        
        if (textModel != null && textModel.length() > 0) {
	        output.print(IPrinter.separator);
	        output.print(textConstant);
	        output.print(IPrinter.separator);
	    }
	}
	
	private Constant value;
    private ModelSubject subject;
}
