/*
 * Created on 8 janv. 2005
 *
 */
package fr.irisa.triskell.kermeta.dev.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/**
 * @author franck
 *
 */
public class ApplyVisitor {

	private Hashtable<String,EClassifier> types;
	private Hashtable<String, EPackage> packs;
	private EcoreFactory factory;
	
	public ApplyVisitor(Resource model) {
		types = new Hashtable<String, EClassifier>();
		packs = new Hashtable<String, EPackage>();
		collectTypes(model);
		factory = new EcoreFactoryImpl();
	}
	
	
	public EClass createVisitor(String rootClassName, String contextTypeName) {
		EClass rootClass = (EClass)getClassifierByName(rootClassName);
		EClassifier contextType = getClassifierByName(contextTypeName);
		EClass result = factory.createEClass();
		result.setAbstract(true);
		result.setName(rootClass.getName() + "Visitor");
		ArrayList<EClassifier> subtypes = getAllSubTypes(rootClass);
		subtypes.add(0, rootClass);
		for(int i=0; i<subtypes.size(); i++) {
			EClass subtype = (EClass)subtypes.get(i);
			// It the class is abstract and not root it is ignored
			if(subtype.isAbstract() && subtype != rootClass) continue;
			
			// Create the method in the visitor
			EOperation visitOp = factory.createEOperation();
			visitOp.setName("visit" + subtype.getName());
			visitOp.setEType(contextType);
			EParameter node = factory.createEParameter();
			node.setName("node");
			node.setEType(subtype);
			EParameter context = factory.createEParameter();
			context.setName("context");
			context.setEType(contextType);
			visitOp.getEParameters().add(node);
			visitOp.getEParameters().add(context);
			result.getEOperations().add(visitOp);
			
			// create the accept method
			EOperation acceptOp = factory.createEOperation();
			acceptOp.setName("accept" + result.getName());
			acceptOp.setEType(contextType);
			EParameter visitor = factory.createEParameter();
			visitor.setName("visitor");
			visitor.setEType(result);
			context = factory.createEParameter();
			context.setName("context");
			context.setEType(contextType);
			acceptOp.getEParameters().add(visitor);
			acceptOp.getEParameters().add(context);
			subtype.getEOperations().add(acceptOp);
		}
		return result;
	}
	
	public ArrayList<EClassifier> getAllSubTypes(EClass rootClass) {
		ArrayList<EClassifier> result = new ArrayList<EClassifier>();
		Iterator<EClassifier> it = types.values().iterator();
		while(it.hasNext()) {
			EClassifier classifier = (EClassifier)it.next();
			if (classifier instanceof EClass) {
				EClass c = (EClass)classifier;
				if (c.getEAllSuperTypes().contains(rootClass)) {
					result.add(c);
				}
			}
		}
		return result;
	}
	
	public EClassifier getClassifierByName(String name) {
		EClassifier result = (EClassifier)types.get(name);
		if (result == null) {
			System.err.println("ERROR : type not found " + name);
		}
		return result;
	}
	/**
	 * The resource is supposed to be an ecore model. The model should contain ONE root EPackage
	 * This could be improved to allow external references
	 * @param model
	 */
	private void collectTypes(Resource model) {
		EPackage root_pack = (EPackage)model.getContents().get(0);
		collectTypes(root_pack, "");
	}
	
	private void collectTypes(EPackage pack, String prefix) {
		
		prefix = prefix + pack.getName() + "::";
		packs.put(prefix, pack);
		Iterator<EClassifier> itc = pack.getEClassifiers().iterator();
		while(itc.hasNext()) {
			EClassifier c = itc.next();
			System.out.println("Found type : " + prefix + c.getName());
			types.put(prefix + c.getName(), c);
		}
		Iterator<EPackage> itp = pack.getESubpackages().iterator();
		while(itp.hasNext()) {
			EPackage p = itp.next();
			collectTypes(p, prefix);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		// there should be 3 args :
		// 1/ the model (.ecore)
		// 2/ the name of the "root node" class
		// 3/ the name of the class to use as context for the visitor
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl()); 
		ResourceSet resource_set = new ResourceSetImpl();
		Resource resource = resource_set.getResource(URI.createFileURI(args[0]), true);
		ApplyVisitor tranfo = new ApplyVisitor(resource);
		EClass the_visitor = tranfo.createVisitor(args[1], args[2]);
		// add the visitor to the root pakage of the model
		EPackage root_pack = (EPackage)tranfo.packs.get("ftm::behavior::");
		root_pack.getEClassifiers().add(the_visitor);
		try {
			// save everything
			resource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
