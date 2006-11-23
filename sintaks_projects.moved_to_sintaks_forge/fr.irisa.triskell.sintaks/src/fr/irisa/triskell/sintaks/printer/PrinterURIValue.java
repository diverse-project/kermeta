package fr.irisa.triskell.sintaks.printer;

import java.io.PrintWriter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.sintaks.subject.ModelSubject;

import sts.Rule;
import sts.URIValue;


public class PrinterURIValue implements IPrinter {


	public PrinterURIValue(Rule value, ModelSubject subject) {
		super();
		this.value = (URIValue) value;
        this.subject = subject;
	}

	public void print(PrintWriter output) throws PrinterSemanticException {
		EStructuralFeature feature = null;
		if(! value.getFeatures().isEmpty())
			feature = (EStructuralFeature) value.getFeatures().get(0);
        
    	Object object;
        if(feature != null) {
        	object = subject.getFeature (feature);
        } else {
        	object = subject.top();
        }
        String text = getURIStringFromEObject((EObject) object);
        if (text != null && text.length()!=0) {
        	output.print(IPrinter.separator);
            output.print("\"" + text + "\"");
        	output.print(IPrinter.separator);
        }
	}
	
	
	/**
	 * Get the URI string from the provided EObject
	 * @param obj
	 * @return
	 */
	private String getURIStringFromEObject(EObject eObj) {
		String packageURI = "";
		if(eObj instanceof EStructuralFeature) {
			packageURI = ((EPackage) eObj.eContainer().eContainer()).getNsURI();
		}
		else {
			// eObj instanceof EClass
			packageURI = ((EPackage) eObj.eContainer()).getNsURI();
		}

		Resource res = eObj.eResource();
        String frag = "#" + res.getURIFragment(eObj);
		
        return packageURI + frag;
	}

	
	private URIValue value;
    private ModelSubject subject;
}
