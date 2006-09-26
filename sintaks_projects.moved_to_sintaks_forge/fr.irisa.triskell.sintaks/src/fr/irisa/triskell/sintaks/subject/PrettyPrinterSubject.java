/*
 * Created on 26 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.subject;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import fr.irisa.triskell.sintaks.main.PrettyPrinterAbstract;


public class PrettyPrinterSubject extends PrettyPrinterAbstract {

	public PrettyPrinterSubject(PrintStream output) {
		super(output);
	}

    public void print (EObject eObject) {
        increase ();
        if (eObject == null) {
            println ("EObject : null");
        }
        else {
            EClass itsClass = eObject.eClass();
            print(itsClass.getName() + " - Object @" + Integer.toHexString(eObject.hashCode()));
            
            if(itsClass.getEAllStructuralFeatures().size() > 0) {
            	println(" {");
                increase();
                
                // Attributes
                List l = itsClass.getEAllAttributes();
                Iterator i = l.iterator();
                while(i.hasNext()) {
                	EAttribute a = (EAttribute) i.next();
                	println(a.getName() + " = " + eObject.eGet(a));
                }
                
                // References
                l = itsClass.getEAllReferences();
                i = l.iterator();
                while(i.hasNext()) {
                	EReference r = (EReference) i.next();
                	println(r.getName() + " = ");
                	print(eObject.eGet(r));
                }
                decrease();
                print("}");
            }

            println(";");
        }
        decrease ();
    }

    public void print (Feature f) {
        increase ();
        if (f == null) {
            println ("Feature : null");
        } else {
            println ("Feature {");
            increase ();
            println ("ClassName   : " + f.getClassName());
            println ("FeatureName : " + f.getAttributeName());
            decrease ();
            println ("}");
        }
        decrease ();
    }

    public void print (Reference ref) {
        increase ();
        if (ref == null) {
            println ("Reference : null");
        } else {
            println ("Reference {");
            increase ();
            print ("From  ");  print (ref.getFrom());
            print ("To    ");  print (ref.getTo());
            decrease ();
            println ("}");
        }
        decrease ();
    }

    public void print (FakeReference ref) {
        increase ();
        if (ref == null) {
            println ("FakeReference : null");
        } else {
            println ("FakeReference @"+Integer.toHexString(ref.hashCode())+" {");
            increase ();
            print ("From   ");  print (ref.getFrom());
            print ("To     ");  print (ref.getTo());
            print ("Value : ");println (ref.getValue());
            print ("Target ");  print (ref.getFromObject());
            print ("Object ");  print (ref.getToObject());
            decrease ();
            println ("}");
        }
        decrease ();
    }

	/* (non-Javadoc)
	 * @see subject.IPrettyPrinter#print(java.lang.Object)
	 */
	public void print (Object o) {
		if (recurse(o))						{ printRecursion(o); }
        else if (o instanceof Feature)		{ push(o); print ((Feature) o); pop(); }
        else if (o instanceof Reference)	{ push(o); print ((Reference) o); pop(); }
        else if (o instanceof FakeReference){ push(o); print ((FakeReference) o); pop(); }
        else if (o instanceof EObject)		{ push(o); print ((EObject) o); pop(); }
        else if (o instanceof String)		{ push(o); print ((String) o); pop(); }
        else super.print(o);
	}
	
}
