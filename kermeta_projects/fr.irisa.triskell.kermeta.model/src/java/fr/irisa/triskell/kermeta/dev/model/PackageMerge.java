package fr.irisa.triskell.kermeta.dev.model;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/*
 * Created on 19 d�c. 2004
 *
 * ECore implementation of package merge
 */

/**
 * @author Franck Fleurey
 *
 * ECore implementation of package merge
 */
public class PackageMerge {

	
	public PackageMerge() {
		// Set the ecore map entry
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl()); 
	}
	
	public EPackage merge(EPackage p1, EPackage p2) {
		
		// Compute the merge
		EPackage result = merge(p1, p2, true);
		
		// update references
		Hashtable<String,EObject> types_copied = new Hashtable<String,EObject>();
		
		TreeIterator<EObject> itr = result.eAllContents();
		while (itr.hasNext()) {
			EObject o = itr.next();
			//System.out.println("REMPLISSAGE " + getQualifiedName((ENamedElement)o));
			if (o instanceof ENamedElement) types_copied.put(getQualifiedName((ENamedElement)o), o);
		}
		
		TreeIterator<EObject> it = result.eAllContents();
		while (it.hasNext()) {
			EObject o = it.next();
			// Iterate all objects refered by o
			Iterator<EReference> itcr = o.eClass().getEAllReferences().iterator();
			while (itcr.hasNext()) {
				EReference ref =  itcr.next();
				Object val = o.eGet(ref);
				//System.out.println(o + " -> " + ref.getName());
				if (ref.getUpperBound() != 1) {
					EList<EObject> vals = (EList<EObject>)val;
					ArrayList<EObject> to_replace = new ArrayList<EObject>();
					
					for(int i=0; i<vals.size(); i++) {
						EObject v = vals.get(i);
						
						if (v instanceof ENamedElement) {
							ENamedElement cls = (ENamedElement) v;
							//System.out.println(o.getClass().getName() + "." + ref.getName() + " de type = " + getQualifiedName(cls));
							ENamedElement the_copy = (ENamedElement)types_copied.get(getQualifiedName(cls));
							//if (the_copy == null) System.out.println("     -> PAS DE COPIE");
							if (the_copy != null && !((EList<EObject>)o.eGet(ref)).contains(the_copy) && ref.isChangeable()) {
								to_replace.add(cls);
							}
						}	
					}
					for(int i = 0; i<to_replace.size();i++) {
						((EList<?>)o.eGet(ref)).remove(to_replace.get(i));
						((EList<EObject>)o.eGet(ref)).add(types_copied.get(getQualifiedName((ENamedElement)to_replace.get(i))));
						//System.out.println("REPLACE");
					}
				}
				else {
					
					EObject v = (EObject)val;
					if (v instanceof ENamedElement) {
						ENamedElement cls = (ENamedElement) v;
						//System.out.println(o.getClass().getName() + "." + ref.getName() + " de type = " + getQualifiedName(cls));
						ENamedElement the_copy = (ENamedElement)types_copied.get(getQualifiedName(cls));
						//if (the_copy == null) System.out.println("     -> PAS DE COPIE");
						if (the_copy != null && o.eGet(ref) != the_copy && ref.isChangeable()) {
							o.eSet(ref, types_copied.get(getQualifiedName(cls)));
							//System.out.println("REPLACE");
						}
					}
				}
			}
			
		}
		
		return result;
	}
	
	protected EPackage merge(EPackage p1, EPackage p2, boolean copy) {
		
		if (copy) {
			p1 = (EPackage)EcoreUtil.copy(p1);
			p2 = (EPackage)EcoreUtil.copy(p2);
		}
		
		EPackage result = p1;
		
		EList<EClassifier> classes = p2.getEClassifiers();
		EClassifier other, mine;
		
		/*
		 * 
		 * Copying classifiers.
		 * 
		 */
		for (int i=0; i<classes.size(); i++) {
			other = classes.get(i);
			mine = (EClassifier)findbyName(result.getEClassifiers(), other.getName());
			if ( mine == null || !mine.eClass().getName().equals(other.eClass().getName())) {
				result.getEClassifiers().add((EClassifier) EcoreUtil.copy(other));
			}
			else {
				mergeClassifiers(mine, other);
			}
		}
		
		/*
		 * 
		 * Copying subpackages.
		 * 
		 */
		EList<EPackage> packs = p2.getESubpackages();
		EPackage mps, ops;
		for (int i=0; i<packs.size(); i++) {
			ops = packs.get(i);
			mps = (EPackage)findbyName(result.getESubpackages(), ops.getName());
			if (mps == null) {
				result.getESubpackages().add((EPackage) EcoreUtil.copy(ops));
			}
			else {
				merge(mps, ops, false);
			}	
		}
		
		/*
		 * 
		 * Copying annotations.
		 * 
		 */
		for ( EAnnotation annotation : p2.getEAnnotations() )
			result.getEAnnotations().add( (EAnnotation) EcoreUtil.copy(annotation) );
		
		return result;
	}
	
	
	protected void mergeClassifiers(EClassifier result, EClassifier other) {
		//System.out.println("EClassifier.eClass : " + result.getName());
		if (result.eClass().getName().equals("EClass")) mergeClass( (EClass)result, (EClass)other );
		if (result.eClass().getName().equals("EEnum")) mergeEnum( (EEnum)result, (EEnum)other );
		
	}
	
	protected void mergeClass(EClass result, EClass other) {
		
		// Merge inheritance
		EList<EClass> supers = other.getESuperTypes();
		EClass mss, oss;
		for (int i=0; i<supers.size(); i++) {
			oss = supers.get(i);
			mss = (EClass)findbyName(result.getESuperTypes(), oss.getName());
			if (mss == null) {
				result.getESuperTypes().add(oss);
			}
			else {
				// attribute is in both model
				// TODO: throw an error? / check type and multiplicities ?
			}	
		}
		
		// Merge Attributes
		EList<EStructuralFeature> atts = other.getEStructuralFeatures();
		EStructuralFeature mas, oas;
		for (int i=0; i<atts.size(); i++) {
			oas = atts.get(i);
			mas = (EStructuralFeature)findbyName(result.getEStructuralFeatures(), oas.getName());
			if (mas == null) {
				result.getEStructuralFeatures().add((EStructuralFeature) EcoreUtil.copy(oas));
			}
			else {
				for ( EAnnotation annotation : oas.getEAnnotations() )
					mas.getEAnnotations().add( (EAnnotation) EcoreUtil.copy(annotation) );
				// attribute is in both model
				// TODO: throw an error? / check type and multiplicities ?
			}	
		}
	
		// Merge Operations
		EList<EOperation> ops = other.getEOperations();
		EOperation mop, oop;
		for (int i=0; i<ops.size(); i++) {
			oop = ops.get(i);
			mop = (EOperation)findbyName(result.getEOperations(), oop.getName());
			if (mop == null) {
				result.getEOperations().add((EOperation) EcoreUtil.copy(oop));
			}
			else {
				for ( EAnnotation annotation : oop.getEAnnotations() )
					mop.getEAnnotations().add( (EAnnotation) EcoreUtil.copy(annotation) );
				System.err.println("MERGE WARNING : found two operation named'" + oop.getName() + "' in class '" + result.getName() +"', kept only one.");
				// TODO: allow overloading ?
			}	
		}
		
		/*
		 * 
		 * Copying annotations.
		 * 
		 */
		for ( EAnnotation annotation : other.getEAnnotations() )
			result.getEAnnotations().add( (EAnnotation) EcoreUtil.copy(annotation) );	
		
	}
	
	protected void mergeEnum(EEnum result, EEnum other) {
		// Merge Literals
		EList<EEnumLiteral> lits = other.getELiterals();
		EEnumLiteral mls, ols;
		for (int i=0; i<lits.size(); i++) {
			ols = lits.get(i);
			mls = (EEnumLiteral)findbyName(result.getELiterals(), ols.getName());
			if (mls == null) {
				result.getELiterals().add((EEnumLiteral) EcoreUtil.copy(ols));
			}
			else {
				// attribute is in both model
				// TODO: throw an error? / check type and multiplicities ?
			}	
		}
		
		/*
		 * 
		 * Copying annotations.
		 * 
		 */
		for ( EAnnotation annotation : other.getEAnnotations() )
			result.getEAnnotations().add( (EAnnotation) EcoreUtil.copy(annotation) );
		
	}
	
	
	private ENamedElement findbyName(EList<? extends ENamedElement> list, String name) {
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).getName().equals(name)) {
				return list.get(i);
			}
		}
		return null;
	}
	
	private String getQualifiedName(ENamedElement element) {
		if (element.eContainer() != null && element.eContainer() instanceof ENamedElement)
			return getQualifiedName((ENamedElement)element.eContainer()) + "::" + element.getName();
		else return element.getName();
	}
	
	
	
	/**
	 * Loads the ecore model from a xmi 2.0 (*.ecore) file
	 * @param xmifile Path to the file to load
	 * @return a Resource 
	 */
	public Resource load(String xmifile) {
		// create a ResourceSet
		ResourceSet resource_set = new ResourceSetImpl();
		// load the file
		Resource resource = resource_set.getResource(URI.createFileURI(xmifile), true);
		return resource;
	}
	
	public Resource create(String xmifile) {
        // create a ResourceSet
		ResourceSet resource_set = new ResourceSetImpl();
		// load the file
		Resource resource = resource_set.createResource(URI.createFileURI(xmifile));
		return resource;
	}
	
	public void store(Resource resource) {
		try {
			resource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Resource merge(Resource model1, Resource model2, String out_uri) {
		Resource result = create(out_uri);
		EPackage merged = merge((EPackage)model1.getContents().get(0), (EPackage)model2.getContents().get(0));
		result.getContents().add(merged);
		
		TreeIterator<EObject> it = merged.eAllContents();
		
		// Check if there is no references to the old models
		// This is useless but is a post-condition of the merge
		while(it.hasNext()) {
			EObject o = it.next();
			if (o.eResource() == null) {
				System.err.println("ERROR : Contained object (" + o + ") is not in ressource");
			}
			Iterator<EReference> itcr = o.eClass().getEAllReferences().iterator();
			while (itcr.hasNext()) {
				EReference ref =  itcr.next();
				Object val = o.eGet(ref);
				if (ref.getUpperBound() != 1) {
					EList<EObject> vals = (EList<EObject>)val;
					for(int i=0; i<vals.size(); i++) {
						EObject v = vals.get(i);
						if (v != null && v.eResource() == null) {
							System.err.println("INTERNAL WARNING : Referenced Object not in ressource : " + v);
							System.err.println("        for reference " + ref.getName() + " of object " + o);
						}
					}
				}
				else {
					EObject v = (EObject)val;
					if (v != null && v.eResource() == null) {
						System.err.println("INTERNAL WARNING : Referenced Object not in ressource : " + v);
						System.err.println("        for reference " + ref.getName() + " of object " + o);
					}
					
				}
			}
		}
		return result;
	}
	
	
	public static void merge(String in1, String in2, String out) {
		PackageMerge pm = new PackageMerge();
		
		Resource model1 = pm.load(in1);
		Resource model2 = pm.load(in2);
		
		Resource model12 = pm.create(out);
		
		EPackage merged = pm.merge((EPackage)model1.getContents().get(0), (EPackage)model2.getContents().get(0));
		
		model12.getContents().add(merged);
		
		TreeIterator<EObject> it = merged.eAllContents();
		
		// Check if there is no references to the old models
		while(it.hasNext()) {
			EObject o = it.next();
			if (o.eResource() == null) {
				System.err.println("ERROR : Contained object (" + o + ") is not in ressource");
			}
			Iterator<EReference> itcr = o.eClass().getEAllReferences().iterator();
			while (itcr.hasNext()) {
				EReference ref = itcr.next();
				Object val = o.eGet(ref);
				if (ref.getUpperBound() != 1) {
					EList<EObject> vals = (EList<EObject>)val;
					for(int i=0; i<vals.size(); i++) {
						EObject v = (EObject)vals.get(i);
						if (v != null && v.eResource() == null) {
							System.err.println("INTERNAL WARNING : Referenced Object not in ressource : " + v);
							System.err.println("        for reference " + ref.getName() + " of object " + o);
						}
					}
				}
				else {
					EObject v = (EObject)val;
					if (v != null && v.eResource() == null) {
						System.err.println("INTERNAL WARNING : Referenced Object not in ressource : " + v);
						System.err.println("        for reference " + ref.getName() + " of object " + o);
					}
					
				}
			}
		}
		
		pm.store(model12);
	}
	
	
	public static EPackage addModel(EPackage result, EPackage model) {
		PackageMerge pm = new PackageMerge();
		if (result == null) {
			return model;
		}
		else return pm.merge(result, model);
	}
	
	/**
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		EPackage result = null;
		
		if (args.length > 1) {
			
			String out_file = args[0];
			PackageMerge pm = new PackageMerge();
			
			for(int i=1; i<args.length; i++) {
				File in_file = new File(args[i]);
				if (in_file.isDirectory()) {
					File[] files = in_file.listFiles();
					for(int k=0; k<files.length; k++) {
						if (files[k].isDirectory()) continue;
						EPackage model = (EPackage)pm.load(files[k].getAbsolutePath()).getContents().get(0);
						result = addModel(result, model);
					}
				}
				else {
					EPackage model = (EPackage)pm.load(in_file.getAbsolutePath()).getContents().get(0);
					result = addModel(result, model);
				}
			}
			
			Resource res = pm.create(out_file);
			res.getContents().add(result);
			try {
				res.save(null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else {
			System.err.println("Usage : PackageMerge <output_model> ( <input_model.ecore> | <input_folder> )* ");
		}		
	}
}
