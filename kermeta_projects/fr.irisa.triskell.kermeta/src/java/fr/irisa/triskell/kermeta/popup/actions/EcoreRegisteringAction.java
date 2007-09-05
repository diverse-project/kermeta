/* $Id: EcoreRegisteringAction.java,v 1.4 2007-09-05 09:28:51 cfaucher Exp $
 * Project : fr.irisa.triskell.kermeta
 * File : EcoreRegisteringAction.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 24 juil. 2006
 * Authors : 
 * 		David Touzet <dtouzet@irisa.fr>
 * Description :
 */
package fr.irisa.triskell.kermeta.popup.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;


/**
 * @author dtouzet
 *
 */
public class EcoreRegisteringAction extends EMFRegisterAction {
	
	/**
	 * 
	 */
	public EcoreRegisteringAction() {
		super();
	}

	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
		String strURI = null;
		URI mmURI = null;
		Resource res = null;
		
		ResourceSet rs = new ResourceSetImpl();
		for(IFile ecoreFile : ecoreFiles) {	
			strURI = "platform:/resource" + ecoreFile.getFullPath().toString(); 
			mmURI = URI.createURI(strURI);
			res = rs.getResource(mmURI, true);

			for(EObject eobj : res.getContents()) {
				if( eobj instanceof EPackage) {
					registerPackages((EPackage) eobj);
				}
			}
		}
		
		displayRegisteredPackages();
	}
	
	/**
	 * 
	 * @param pack
	 */
	private void registerPackages(EPackage pack) {
		Registry.INSTANCE.put(pack.getNsURI(), pack);
		
		for(EPackage subPack : pack.getESubpackages()) {
			registerPackages(subPack);
		}
	}

}
