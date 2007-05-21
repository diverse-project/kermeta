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
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.irisa.triskell.sintaks.main.IMetaModel;
import fr.irisa.triskell.sintaks.main.IPrettyPrinter;
import fr.irisa.triskell.sintaks.SintaksPlugin;


public class ModelSubject {

	private IMetaModel mmSubject;
    private List<Object> stack;
	private List<Ghost> ghosts;
	
    public ModelSubject(IMetaModel subject) {
	    this.mmSubject = subject;
    }
    
	public void initialize () {
		ghosts = new LinkedList<Ghost> ();
	    stack = new LinkedList<Object> ();
	}

	private Object convertToType (EStructuralFeature eFeature, Object value) {
		if (value instanceof EList) {
// no conversion should be required
			return value;
		}
		EClassifier type = eFeature.getEType();
		if (type instanceof EClass) {
// no conversion should be required
			return value;
		}
		if (type instanceof EDataType) {
// String to eType conversion required
			EDataType dataType = (EDataType) type;
			if (dataType.isSerializable()) {
				EFactory factory = type.getEPackage().getEFactoryInstance();
				return factory.createFromString(dataType, value.toString());
			} else {
				SintaksPlugin.getDefault().debugln("    created  : noserialisable");
				return null;
			}
		}
		return null;
	}

	private Object convertFromType (EStructuralFeature eFeature, Object value) {
		if (value instanceof EList) {
// no conversion should be required
			return value;
		}
		EClassifier type = eFeature.getEType();
		if (type instanceof EClass) {
// no conversion should be required
			return value;
		}
		if (type instanceof EDataType) {
// String to eType conversion required
			EDataType dataType = (EDataType) type;
			if (dataType.isSerializable()) {
				EFactory factory = type.getEPackage().getEFactoryInstance();
				return factory.convertToString(dataType, value);
			} else {
				SintaksPlugin.getDefault().debugln("    created  : noserialisable");
				return null;
			}
		}
		return null;
	}

	public EObject createInstance(EClass c) {
		EFactory fact = ((EPackage) c.eContainer()).getEFactoryInstance();
		return fact.create(c);
	}

    @SuppressWarnings("unchecked")
    private void setTargetFeature (EObject target, EStructuralFeature eFeature, Object value) {
    	Object convertedValue = convertToType (eFeature, value);
    	if (eFeature.isMany()) {
	   		((EList) target.eGet(eFeature)).add(convertedValue);
		} else {
	    	target.eSet(eFeature, convertedValue);
		}
    }

    private Object getTargetFeature (EObject target, EStructuralFeature eFeature) {
    	Object value = target.eGet(eFeature);
    	if (eFeature.isMany()) {
    		return value;
    	} else {
    		return convertFromType (eFeature, value);
    	}
    }

    public boolean setFeatures (EList features, Object value) {
        Iterator it = features.iterator();
        boolean ok = true;
        while(it.hasNext()) {
        	EStructuralFeature attribute = (EStructuralFeature) it.next();
    		if(! setFeature(attribute, value)) {
    			ok = false;
    		}
        }
        return ok;
    }

    private void dumpTargetStack () {
    	Iterator i = stack.iterator();
    	int j=0;
    	while (i.hasNext()) {
    		Object o = i.next();
    		++j;
    		SintaksPlugin.getDefault().debugln("Stack ["+j+"]: "+o.toString());
    	}
    }
    
    private EObject findTarget (EStructuralFeature feature) {
		if (SintaksPlugin.getDefault().getOptionManager().isDebugModel()) {
			dumpTargetStack ();
		}
    	if (stack.isEmpty()) return null;
		EObject target = (EObject) top();
		if (target == null) return null;
//TODO check if the target is usable
		try {
			target.eGet(feature);
			if (SintaksPlugin.getDefault().getOptionManager().isDebugModel()) {
				SintaksPlugin.getDefault().debugln("Target usable : "+target);
			}
			return target;
		}
		catch (Exception e) {
			if (SintaksPlugin.getDefault().getOptionManager().isDebugModel()) {
				SintaksPlugin.getDefault().debugln("Target unusable : "+target);
			}
			return null;
		}
    }

    public boolean setFeature (EStructuralFeature feature, Object value) {
		if (feature == null) return false;
		EObject target = findTarget (feature);
		if (target == null) return false;

		if (SintaksPlugin.getDefault().getOptionManager().isDebugModel()) {
			PrintStream debugStream = SintaksPlugin.getDefault().getDebugStream();
			debugStream.println("SetAttribute : ");
			debugStream.println("   On        : "+target);
			debugStream.println("   Attribute : "+feature);
			debugStream.println("   Value     : "+value);
        }
		setTargetFeature (target, feature, value);
		return true;
	}
	
    public Object getFeature (EStructuralFeature feature) {
		if (feature == null) return null;
		EObject target = findTarget (feature);
		if (target == null) return null;

		if (SintaksPlugin.getDefault().getOptionManager().isDebugModel()) {
			PrintStream debugStream = SintaksPlugin.getDefault().getDebugStream();
			debugStream.println("GetAttribute : ");
			debugStream.println("   On        : "+target);
			debugStream.println("   Attribute : "+feature);
        }
        return getTargetFeature (target, feature);
    }

    public boolean createGhosts (EList features, EStructuralFeature to, String value) {
        Iterator it = features.iterator();
        boolean ok = true;
        while(it.hasNext()) {
        	EStructuralFeature attribute = (EStructuralFeature) it.next();
    		if(! createGhost (attribute, to, value)) {
    			ok = false;
    		}
        }
        return ok;
    }
    
    public boolean createGhost (EStructuralFeature from, EStructuralFeature to, String value) {
		EObject target = findTarget (from);
		if (target == null) return false;

        ghosts.add(new Ghost (from, to, value, target));
        return true;
    }

    public EObject findInstance (EStructuralFeature to, String text) {
	    TreeIterator i = getModel ().eAllContents();
        while (i.hasNext()) {
			Object o = i.next();
			if (o instanceof EObject) {
                EObject eo = (EObject) o;
                EClass ec = (EClass) eo.eClass();
                //TODO a verifier si c'est dans le bon ordre ...
                // to.getEContainingClass().isSuperTypeOf (ec)
                if (ec.isSuperTypeOf(to.getEContainingClass())) {
    				EStructuralFeature sf = ec.getEStructuralFeature(to.getName());
    				if (eo.eIsSet(sf)) {
    					Object value = eo.eGet(sf);
    					Object converted = convertFromType(sf, value);
    					if (converted.equals(text)) {
    					    return eo;
                        }
                    }
                }
			}
        }
		return null;
	}
	
	public boolean relink () {
        List<Ghost> fakes = ghosts;
        ghosts = new LinkedList<Ghost> ();
        
        Iterator i = fakes.iterator();
        
        while (i.hasNext()) {
            Ghost fake = (Ghost) i.next();
            if (! relink (fake)) {
                ghosts.add(fake);
            }
        }
        return ghosts.isEmpty();
    }

    protected boolean relink (Ghost fake) {
        EObject instance = findInstance (fake.getTo(), fake.getValue());
        if (instance == null) return false;
        
        EStructuralFeature feature = fake.getFrom();
        if (feature == null) return false;

        EObject target = fake.getFromObject();
        EcoreUtil.replace(target, feature, null, instance);
        if (SintaksPlugin.getDefault().getOptionManager().isDebugModel()) {
            SintaksPlugin.getDefault().debugln ("Replace      : ");
            SintaksPlugin.getDefault().debugln ("   On        : "+target);
            SintaksPlugin.getDefault().debugln ("   Attribute : "+feature);
            SintaksPlugin.getDefault().debugln ("   Object    : "+instance);
        }
        return true;
    }
    
	public void push (Object o) {
		stack.add (0, o);
	}

	public void pop (int count) {
//		IPrettyPrinter pp = mmSubject.getPrettyPrinter(new PrintStream (SintaksPlugin.getDefault().getConsoleStream()));
//		pp.print("POP*");
		for (int i=0; i <count; ++i) {
//			Object o = stack.get(0);
//			pp.print(o);
			stack.remove(0);
		}
	}

	public void pop () {
//		IPrettyPrinter pp = mmSubject.getPrettyPrinter(new PrintStream (SintaksPlugin.getDefault().getConsoleStream()));
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

    public void load (String inputFile) {
    	mmSubject.load(inputFile);
		initialize();
    	setModel ( (EObject) mmSubject.getRoot());
    }

    public void store (IFile outputFile) {
    	mmSubject.setRoot(getModel());
    	mmSubject.store(outputFile);
    }

    public void print (PrintStream out) {
        IPrettyPrinter pp;
        pp = mmSubject.getPrettyPrinter(out);
        if (pp != null) {
            out.println();
            out.println("Model created : ");
            pp.print(getModel());
        }
        pp = mmSubject.getPrettyPrinter(out);
        if (pp != null) {
            out.println();
            out.println("Stack : ");
            pp.print(stack);
        }
        pp = mmSubject.getPrettyPrinter(out);
        if (pp != null) {
            out.println();
            out.println("Ghosts : ");
            pp.print(ghosts);
            out.println();
        } else {
            out.println();
            out.println("Warning no Pretty-Printer");
        }
        pp = null;
    }
}
