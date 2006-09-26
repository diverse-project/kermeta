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

import fr.irisa.triskell.sintaks.subject.ModelSubject;
import fr.irisa.triskell.sintaks.subject.Reference;

import sts.ObjectReference;
import sts.Rule;

public class PrinterReferenceValue implements IPrinter {

	public PrinterReferenceValue(Rule value, ModelSubject subject) {
		super();
		this.value = (ObjectReference) value;
        this.subject = subject;
	}

	public void print (PrintWriter output) throws PrinterSemanticException {
		EStructuralFeature feature = null;
		if(! value.getFeatures().isEmpty())
			feature = (EStructuralFeature) value.getFeatures().get(0);
        
        if (feature == null) 
            throw new PrinterSemanticException ("ReferenceValue : feature "+((EClass) feature.eContainer()).getName()+"."+feature.getName()+" inaceptable");
		EStructuralFeature id = value.getIdentifier();
        if (id == null) 
            throw new PrinterSemanticException ("ReferenceValue : id      "+((EClass) id.eContainer()).getName()+"."+id.getName()+" inaceptable");

        Reference reference = new Reference (feature, id);

        String text = subject.getReference (reference);
        output.print(IPrinter.separator);
        output.print(text);
        output.print(IPrinter.separator);
        
	}

	private ObjectReference value;
    private ModelSubject subject;
}
