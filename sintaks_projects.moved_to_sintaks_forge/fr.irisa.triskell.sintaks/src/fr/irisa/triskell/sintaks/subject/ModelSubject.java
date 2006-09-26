/*
 * Created on 24 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.subject;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.irisa.triskell.sintaks.main.IMetaModel;
import fr.irisa.triskell.sintaks.main.IPrettyPrinter;

import sts.Terminal;


public class ModelSubject {

	private IMetaModel mmSubject;
    private List<Object> stack;
	private List<FakeReference> fakeReferences;
	private List<Terminal> terminals;
	
    static public boolean debugModel = false;
	
	
	public ModelSubject(IMetaModel subject) {
	    this.mmSubject = subject;
	    this.terminals = null;
    }
    
	public ModelSubject(IMetaModel subject, List<Terminal> terms) {
	    this.mmSubject = subject;
	    this.terminals = terms;
    }
	
	public boolean isTerminal(String token) {
		Terminal crtTerm = null;
		Iterator i = terminals.iterator();
		while(i.hasNext()) {
			crtTerm = (Terminal) i.next();
			if(token.equals(crtTerm.getTerminal())) return true;
		}
		return false;
	}

	public void initialize () {
		fakeReferences = new LinkedList<FakeReference> ();
	    stack = new LinkedList<Object> ();
	}

	public EObject createInstance(EClass c) {
		EFactory fact = ((EPackage) c.eContainer()).getEFactoryInstance();
		return fact.create(c);
	}

    public EStructuralFeature getStructuralFeature (Feature feature) {
    	return feature.getEStructuralFeature();
    }

    public boolean setAttribute (Feature feature, Object value) {
		if (stack.isEmpty()) return false;
		EObject target = (EObject) top();
		if (target == null) return false;

		EStructuralFeature eFeature = getStructuralFeature (feature);
		if (eFeature == null) return false;

		if (debugModel) {
            System.out.println("SetAttribute : ");
    		System.out.println("   On        : "+target);
    		System.out.println("   Attribute : "+eFeature);
    		System.out.println("   Value     : "+value);
        }
		target.eSet(eFeature, value);
		return true;
	}
	
    public Object getAttribute (Feature feature) {
        if (stack.isEmpty()) return null;
        EObject target = (EObject) top();
        if (target == null) return null;

        EStructuralFeature eFeature = getStructuralFeature (feature);
        if (eFeature == null) return null;

        if (debugModel) {
            System.out.println("GetAttribute : ");
            System.out.println("   On        : "+target);
            System.out.println("   Attribute : "+eFeature);
        }
        Object value = target.eGet(eFeature);
        return value;
    }
    
	public boolean setReference (Reference ref, String value) {
		if (stack.isEmpty()) return false;
        EObject target = (EObject) top();
        if (target == null) return false;

		EObject instance = findInstance (ref.getTo(), value);
		if (instance == null) {
			instance = createInstance (ref.getTo().getEClass());
			push (instance);
			setAttribute (ref.getTo(), value);
			pop ();
            fakeReferences.add(new FakeReference (ref, value, target, instance));
		}
		
        EStructuralFeature feature = getStructuralFeature (ref.getFrom());
        if (feature == null) return false;

        if (debugModel) {
            System.out.println("SetReference : ");
            System.out.println("   On        : "+target);
            System.out.println("   Attribute : "+feature);
            System.out.println("   Object    : "+instance);
        }
        target.eSet(feature, instance);
		return true;
	}
	
	public String getReference (Reference ref) {
		if (stack.isEmpty()) return null;
        EObject target = (EObject) top();
        if (target == null) return null;

        EStructuralFeature fromFeature = getStructuralFeature (ref.getFrom());
        if (fromFeature == null) return null;

        if (debugModel) {
            System.out.println("GetReference : ");
            System.out.println("   On        : "+target);
            System.out.println("   Attribute : "+fromFeature);
        }
        EObject reference = (EObject) target.eGet(fromFeature);
        
        EStructuralFeature toFeature = getStructuralFeature (ref.getTo());
        if (toFeature == null) return null;
        return (String) reference.eGet(toFeature);
	}
	
	public boolean addFeature (Feature attribute, Object value)	{
		if (stack.isEmpty()) return false;
		EObject target = (EObject) top();
		if (target == null) return false;

		EStructuralFeature feature = getStructuralFeature (attribute);
		if (feature == null) return false;

        if (debugModel) {
            System.out.println("AddFeature   : ");
            System.out.println("   On        : "+target);
    		System.out.println("   Feature   : "+feature);
    		System.out.println("   Value     : "+value);
        }
        ((EList) target.eGet(feature)).add(value);
        return true;
	}

    public EList getFeature (Feature attribute) {
        if (stack.isEmpty()) return null;
        EObject target = (EObject) top();
        if (target == null) return null;

        EStructuralFeature feature = getStructuralFeature (attribute);
        if (feature == null) return null;

        if (debugModel) {
            System.out.println("GetFeature   : ");
            System.out.println("   On        : "+target);
            System.out.println("   Feature   : "+feature);
        }
        return (EList) target.eGet(feature);
    }

    static private boolean isInstanceof (EClass aClass, String className) {
        if (aClass.getName().equals(className))
        	return true;
        EList list = aClass.getESuperTypes();
        Iterator i = list.iterator();
        while (i.hasNext()) {
        	EClass currentClass = (EClass) i.next();
        	if (currentClass.getName().equals(className))
        		return true;
        }
    	return false;
    }

    protected EObject findInstance (Feature feature, String text) {
	    TreeIterator i = getModel ().eAllContents();
        while (i.hasNext()) {
			Object o = i.next();
			if (o instanceof EObject) {
                EObject eo = (EObject) o;
                EClass ec = (EClass) eo.eClass();
                if (isInstanceof(ec, feature.getClassName())) {
    				EStructuralFeature sf = ec.getEStructuralFeature(feature.getAttributeName());
    				if (eo.eIsSet(sf)) {
    					Object value = eo.eGet(sf);
    					if (value.equals(text)) {
    					    return eo;
                        }
                    }
                }
			}
        }
		return null;
	}
	
	public boolean relink () {
        List<FakeReference> fakes = fakeReferences;
        fakeReferences = new LinkedList<FakeReference> ();
        
        Iterator i = fakes.iterator();
        
        while (i.hasNext()) {
            FakeReference fake = (FakeReference) i.next();
            if (! relink (fake)) {
                fakeReferences.add(fake);
            }
        }
        return fakeReferences.isEmpty();
    }

    protected boolean relink (FakeReference fake) {
        EObject instance = findInstance (fake.getTo(), fake.getValue());
        if (instance == null) return false;
        
        EStructuralFeature feature = getStructuralFeature (fake.getFrom());
        if (feature == null) return false;

        EObject target = fake.getFromObject();
        EcoreUtil.replace(target, feature, fake.getToObject(), instance);
        if (debugModel) {
            IPrettyPrinter pp = mmSubject.getPrettyPrinter(System.out);
//            pp.println("Replace      : ");
//            pp.increase();
            pp.print("On : "); pp.print(target);
            pp.print("Attribute : "); pp.print(feature);
            pp.print("Object : "); pp.print(instance);
//            pp.decrease();
        }
        return true;
    }
    
	public void push (Object o) {
		stack.add (0, o);
	}

	public void pop (int count) {
//		IPrettyPrinter pp = mmSubject.getPrettyPrinter(new PrintStream (System.out));
//		pp.print("POP*");
		for (int i=0; i <count; ++i) {
//			Object o = stack.get(0);
//			pp.print(o);
			stack.remove(0);
		}
	}

	public void pop () {
//		IPrettyPrinter pp = mmSubject.getPrettyPrinter(new PrintStream (System.out));
//		Object o = stack.get(0);
//		pp.print("POP");
//		pp.print(o);
		stack.remove(0);
	}

	
	public int size () {
		return stack.size();
	}

	public Object top () {
		return stack.get(0);
	}

    public List<Object> getStack () {
        return stack;
    }

    public EObject getModel () {
        if (stack.size()==0) return null;
        return (EObject) stack.get(stack.size()-1);
    }

    public void setModel (EObject o) {
        stack.add(o);
    }

    public List<FakeReference> getFakeReference () {
		return fakeReferences;
	}

    public void store (IFile outputFile) {
    	mmSubject.setRoot(getModel());
    	mmSubject.store(outputFile);
    }

    public void print (PrintStream out) {
        IPrettyPrinter pp = mmSubject.getPrettyPrinter(out);
        if (pp != null) {
            out.println();
            out.println("Model created : ");
            pp.print(getModel());
            out.println();
            out.println("Stack : ");
            pp.print(stack);
            out.println();
            out.println("FakeReferences : ");
            pp.print(fakeReferences);
            out.println();
        }
        else {
            out.println();
            out.println("Warning no Pretty-Printer");
        }
    }
}
