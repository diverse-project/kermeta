/* $Id: KM2EcoreExporter_pass2.java,v 1.1 2005-07-13 15:33:20 dvojtise Exp $
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
import java.util.Hashtable;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
import fr.irisa.triskell.kermeta.utils.KMTHelper;
import fr.irisa.triskell.kermeta.utils.TextTabs;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * Exports KM or KMT to Ecore.
 */
public class KM2EcoreExporter_pass2 extends KermetaVisitor{

	final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT2Ecore.pass2");
	protected ArrayList usings = new ArrayList();
	protected ArrayList imports = new ArrayList();
	protected String root_pname;
	protected String current_pname;
	protected TextTabs loggerTabs =  new TextTabs("   ","");
	
	// the resource to populate
	protected Resource ecoreResource = null;
	
	// mapping to look for ecore objects created during pass1
	protected Hashtable kmt2ecoremapping;
	
	/**
	 * @param resource : the resource to populate
	 */
	public KM2EcoreExporter_pass2(Resource resource, Hashtable mapping) {
		ecoreResource = resource;
		kmt2ecoremapping = mapping;	
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
	
	
	/** 
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FClassDefinition)
	 */
	public Object visit(FClassDefinition node) {
		EClass newEClass=null;
		internalLog.debug(loggerTabs + "Visiting ClassDefinition: "+ current_pname);
		loggerTabs.increment();
		
		
		// search the Eclass from previous pass
		newEClass = (EClass)kmt2ecoremapping.get(node);
					
		Iterator it = node.getFSuperType().iterator();
		while(it.hasNext()) {
			Object o = accept((EObject)it.next());
			if (o != null)
				newEClass.getEAllSuperTypes().add(o);
			else
				internalLog.warn(loggerTabs + "accept of a getFSuperType returned null !"); 
				
		}
		
		// deal with TypeParameters
		it = node.getFTypeParameter().iterator();
		while(it.hasNext()) {
			// use the KMTprettyPrinter to output in the annotation
			// one annotation per type parameter
			FTypeVariable tv = (FTypeVariable)it.next();
			EAnnotation newEAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			newEAnnotation.setSource("KerMeta"); // TODO put this string in a constant
			String typeParameterString = tv.getFName();			
			if (tv.getFSupertype() != null) typeParameterString += " : " + new KM2KMTPrettyPrinter().accept(tv.getFSupertype());
			newEAnnotation.getDetails().put(current_pname, typeParameterString);			
			ecoreResource.getContents().add(newEAnnotation);
									
		}
		
		loggerTabs.decrement();
		return newEClass;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FClass)
	 */
	public Object visit(FClass node) {
		EClass newEClass=null;		
		internalLog.debug(loggerTabs + "Visiting Class: "+ node.getFName());
		loggerTabs.increment();
		
		newEClass = (EClass)kmt2ecoremapping.get(node.getFClassDefinition());
		if (node.getFTypeParamBinding().size() > 0) {
			// we must deal with binding : 
			// TODO find a correct ecore representation for class binding 
			/*if (node.getFTypeParamBinding().size() > 0) {
				result += "<" + ppComaSeparatedNodes(node.getFTypeParamBinding()) + ">";
			}*/
			internalLog.info("TODO: deal with parametrized classes");
		}
		
		loggerTabs.decrement();
		return newEClass;
	}
	
}
