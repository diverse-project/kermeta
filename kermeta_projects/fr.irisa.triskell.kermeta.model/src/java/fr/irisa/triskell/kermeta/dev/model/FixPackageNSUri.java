/* $Id: FixPackageNSUri.java,v 1.12 2008-03-19 16:34:14 cfaucher Exp $
 * Project    : fr.irisa.triskell.kermeta.model
 * File       : FixPackageNSUri.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 121 dec. 2004
 * Authors : 
 * 		  ffleurey
 *        dvojtise <dvojtise@irisa.fr> 
 */
package fr.irisa.triskell.kermeta.dev.model;

import java.io.IOException;
import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/**
 * Fix the nsuri of the ecore package
 * also add the intermediate language package (for a better match with kermeta vision of it own metamodel)
 */
public class FixPackageNSUri {
	
	public static final String BaseNsURI = "http://www.kermeta.org/kermeta/1_2_0//kermeta";
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
	
	public static String getPrefix(EPackage p) {
		if (p.eContainer() != null && p.eContainer() instanceof EPackage) {
			return getPrefix((EPackage)p.eContainer()) + "_" + p.getName();
		}
		return p.getName();
	}
	
	/** Set a xpath-like syntax for the NsURI of the given package*/
	public static String getPackageNsPath(EPackage p) {
		if (p.eContainer() != null && p.eContainer() instanceof EPackage) {
			 if (!((EPackage)p.eContainer()).getName().equals("kermeta"))
				 return getPackageNsPath((EPackage)p.eContainer()) + "/" + p.getName();
		}
		return p.getName();
	}
	
	/**
	 * Sets the nsUri and nsPrefix attributes of the given EPackage, regarding the emf usings, 
	 * eg : "http://kermeta/kermeta.ecore#//language/structure" for subpackage named structure.
	 * @param the package of which nsURI and nsPrefix have to be set
	 */
	public static void processPackage(EPackage p) {
		String prefix = getPrefix(p);
		String suffix = p.getName().equals("kermeta")?"":"/"+getPackageNsPath(p);
		System.out.println("Package " + p.getName() + "; nsPrefix = "+ prefix + "; nsURI = " + BaseNsURI+suffix);
		p.setNsURI(BaseNsURI + suffix);
		p.setNsPrefix(prefix);
		
		// fix EMF bug about empty packages : insert a dummy class
		if(p.getEClassifiers().isEmpty()){
			EClass newEClass = EcoreFactory.eINSTANCE.createEClass();
			newEClass.setName("DummyClass");
			newEClass.setAbstract(true);
			EAnnotation newEAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			newEAnnotation.setSource("http://www.eclipse.org/emf/2002/GenModel");
			newEAnnotation.getDetails().put("documentation","This class is used to workaround an EMF bug, it doesn't really belong to Kermeta metamodel");
			newEClass.getEAnnotations().add(newEAnnotation);
			p.getEClassifiers().add(newEClass);
		}
	}
	
	/**
	 * Insert a package in this package, it moves all the existing packages into this new one
	 * in order to match the view in kermeta
	 * @param package
	 * @param paname
	 */
	public static void insertPackage(EPackage p, String pname){
		EPackage newEPackage = EcoreFactory.eINSTANCE.createEPackage();
		newEPackage.setNsPrefix(pname);
		newEPackage.setName(pname);

		// move all packages to this new one 
		// must be done in two pass because I cannot change le list while iterating on it
		Iterator<EPackage> it = p.getESubpackages().iterator();
		System.out.println(p.getESubpackages().size() + " subpackages in " + p.getName());
		BasicEList<EPackage> toMove = new BasicEList<EPackage>();
		while(it.hasNext()) {
			EPackage next = it.next();
			toMove.add(next);
		}
		it = toMove.iterator();
		while(it.hasNext()) {
			EPackage next = it.next();
			System.out.println("moving package "+next.getName());
			newEPackage.getESubpackages().add(next);
		}
		
		
		p.getESubpackages().add(newEPackage);
	}

	public static void main(String[] args) {
//		 Set the ecore map entry
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl()); 
		
		FixPackageNSUri cn = new FixPackageNSUri();
		Resource model1 = cn.load(args[0]);
		
		TreeIterator<EObject> it = ((EPackage)model1.getContents().get(0)).eAllContents();
		EPackage root = (EPackage)model1.getContents().get(0);
		root.setName("kermeta");
		insertPackage(root, "language");
		processPackage(root);
		while(it.hasNext()) {
			EObject o = (EObject)it.next();
			if (o instanceof EPackage) {				
				EPackage p = (EPackage)o;
				if(p.getName().compareTo("kermeta")==0) insertPackage(p, "language");
				processPackage(p);
			}
		}
		
		cn.store(model1);
	}
}
