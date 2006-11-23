/*
 * Created on 17 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.printer;

import java.io.PrintWriter;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.irisa.triskell.sintaks.subject.ModelSubject;

import sts.ObjectReference;
import sts.Rule;

public class PrinterReferenceValue implements IPrinter {

	public PrinterReferenceValue(Rule value, ModelSubject subject) {
		super();
		this.value = (ObjectReference) value;
        this.subject = subject;
	}

	public void print (PrintWriter output) throws PrinterSemanticException {
        EStructuralFeature id = value.getIdentifier();
        if (id == null) 
            throw new PrinterSemanticException ("ReferenceValue : id      "+((EClass) id.eContainer()).getName()+"."+id.getName()+" inaceptable");

        EStructuralFeature feature = null;
    	Object object;
		if(! value.getFeatures().isEmpty()) {
			feature = (EStructuralFeature) value.getFeatures().get(0);
			object = subject.getFeature(feature);
		} else {
        	object = subject.top();
		}
        String text=null;
        if (object instanceof EObject) {
        	Object key = ((EObject)object).eGet(id);
        	text = key.toString();
        } else {
        	text="";
        }
        if (text != null && text.length()!=0) {
	        output.print(IPrinter.separator);
	        output.print(text);
	        output.print(IPrinter.separator);
        }
	}
	
	private ObjectReference value;
    private ModelSubject subject;
}
