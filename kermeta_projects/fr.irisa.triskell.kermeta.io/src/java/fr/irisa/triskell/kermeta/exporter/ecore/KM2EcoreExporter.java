/* $Id: KM2EcoreExporter.java,v 1.1 2005-07-11 15:34:20 dvojtise Exp $
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

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.kermeta.structure.FNamedElement;
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
	protected TextTabs loggerTabs =  new TextTabs();
	
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
		internalLog.debug(loggerTabs + "Visiting Package "+ current_pname);
		loggerTabs.decrement();
		
		EPackage newEPackage = EcoreFactory.eINSTANCE.createEPackage();
		newEPackage.setName(current_pname);
		ecoreResource.getContents().add(newEPackage);
		
		

		Iterator it = p.getFNestedPackage().iterator();
		while(it.hasNext()) {
			newEPackage.getESubpackages().add(accept((EObject)it.next()));
		}
		/*Iterator it2 = p.getFOwnedTypeDefinition().iterator();
		while(it.hasNext()) {
			newEPackage.getEClassifiers().add(accept((EObject)it2.next()));
		}*/

		loggerTabs.increment();
		return newEPackage;
	}
	
		
	
}
