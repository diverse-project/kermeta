/* $Id: KM2EcoreExporter.java,v 1.2 2005-07-13 10:04:40 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta.io
 * File       : KM2EcoreExporter.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 11 juil. 2005
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 *        Exports KM or KMT to Ecore. 
 */
package fr.irisa.triskell.kermeta.exporter.ecore;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
import fr.irisa.triskell.kermeta.utils.KMTHelper;
import fr.irisa.triskell.kermeta.utils.TextTabs;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * Exports KM or KMT to Ecore.
 */
public class KM2EcoreExporter extends KermetaVisitor{

	final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT2Ecore");
	protected ArrayList usings = new ArrayList();
	protected ArrayList imports = new ArrayList();
	protected String root_pname;
	protected String current_pname;
	protected TextTabs loggerTabs =  new TextTabs("   ","|");
	
	// the resource to populate
	protected Resource ecoreResource = null;
	
	
	
	/**
	 * @param resource : the resource to populate
	 */
	public KM2EcoreExporter(Resource resource) {
		ecoreResource = resource;	
	}
	
	/**
	 * Exports the given package into an ecore ressource
	 * @param root_package
	 * @return the equivalent root_package in the Ecore ressource
	 */
	public Object exportPackage(FPackage root_package) {
		root_pname = KMTHelper.getQualifiedName(root_package);
		
		return accept(root_package);
	}
	
	public Object visit(FPackage p) {
		current_pname = KMTHelper.getQualifiedName(p);
		internalLog.debug(loggerTabs + "Visiting Package: "+ current_pname);
		loggerTabs.increment();
		
		EPackage newEPackage = EcoreFactory.eINSTANCE.createEPackage();
		newEPackage.setName(current_pname);
		ecoreResource.getContents().add(newEPackage);
		
		

		Iterator it = p.getFNestedPackage().iterator();
		while(it.hasNext()) {
			newEPackage.getESubpackages().add(accept((EObject)it.next()));
		}
		
		
		it = p.getFOwnedTypeDefinition().iterator();
		while(it.hasNext()) {
			Object o = accept((EObject)it.next());
			if (o != null)
				newEPackage.getEClassifiers().add(o);
			else
				internalLog.warn(loggerTabs + "accept of a OwnedTypeDefinition returned null !"); 
				
		}

		loggerTabs.decrement();
		return newEPackage;
	}
	
	/** 
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FClassDefinition)
	 */
	public Object visit(FClassDefinition node) {
		EClass newEClass=null;
		current_pname = node.getFName();
		internalLog.debug(loggerTabs + "Visiting ClassDefinition: "+ current_pname);
		loggerTabs.increment();
		
		try{
			newEClass = EcoreFactory.eINSTANCE.createEClass();
			newEClass.setName(current_pname);
			ecoreResource.getContents().add(newEClass);
		
	/*	typedef = false;
		String result = "";

		result += ppTags(node.getFTag());
		
		if (node.isFIsAbstract()) result += "abstract ";
		result += "class " + KMTHelper.getMangledIdentifier(node.getFName());
		if (node.getFTypeParameter().size() > 0) {
			result += "<";
			result += ppTypeVariableDeclaration(node.getFTypeParameter());
			result += ">";
		}
		if (node.getFSuperType().size() > 0) {
			result += " inherits ";
			result += ppComaSeparatedNodes(node.getFSuperType());
		}
		result += "\n" + getPrefix() + "{\n";
		pushPrefix();
		result += ppCRSeparatedNode(node.getFOwnedAttributes());
		result += ppCRSeparatedNode(node.getFOwnedOperation());
		popPrefix();
		result += getPrefix() + "}";		
		
		typedef = true;
		
		return result;*/
		}
		catch(Exception e)
		{
			internalLog.error("Visiting ClassDefinition: "+ current_pname + ", Exception: " + e.getMessage() ,e);
		}
		loggerTabs.decrement();
		return newEClass;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FClass)
	 */
	public Object visit(FClass node) {

		//current_pname = KMTHelper.getQualifiedName(node);
		internalLog.debug(loggerTabs + "Visiting Class: "+ current_pname);
		loggerTabs.decrement();
		
		/*String qname = KMTHelper.getQualifiedName(node.getFClassDefinition());
		String name = KMTHelper.getMangledIdentifier(node.getFClassDefinition().getFName());
		String result = ppTypeName(qname, name);
		if (node.getFTypeParamBinding().size() > 0) {
			result += "<" + ppComaSeparatedNodes(node.getFTypeParamBinding()) + ">";
		}
		return result;
		*/
		return null;
	}	
	
}
