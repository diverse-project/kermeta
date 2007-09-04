/*
 * Created on 21 dec. 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.irisa.triskell.kermeta.dev.model;

import java.io.IOException;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/**
 * @author franck
 *
 */
public class KermetaPrimitiveTypes {
	
	
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
	
	public static void processPackage(EPackage p) {
		String prefix = getPrefix(p);
		System.out.println("Package " + p.getName() + " nsURI = " + getPrefix(p));
		p.setNsURI("http://" + prefix + "/kermeta.ecore");
		p.setNsPrefix(prefix);
	}

	public static void main(String[] args) {
//		 Set the ecore map entry
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl()); 
		
		KermetaPrimitiveTypes cn = new KermetaPrimitiveTypes();
		Resource model1 = cn.load(args[0]);
		
		TreeIterator<EObject> it = ((EPackage)model1.getContents().get(0)).eAllContents();

		while(it.hasNext()) {
			EObject o = it.next();
			if (o instanceof EDataType) {
				EDataType dt = (EDataType)o;
				dt.setInstanceClassName("kermeta::standard::" + dt.getName());
			}
		}
		
		cn.store(model1);
	}
}
