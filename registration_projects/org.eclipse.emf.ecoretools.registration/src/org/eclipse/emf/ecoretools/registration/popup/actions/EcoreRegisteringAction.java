/* $Id: EcoreRegisteringAction.java,v 1.2 2007-12-13 15:23:11 dvojtise Exp $
 * Project : org.eclipse.emf.ecoretools.registration
 * File : EcoreRegisteringAction.java
 * License : EPL
 * Copyright : INRIA
 * ----------------------------------------------------------------------------
 * Creation date : 24 juil. 2006
 * Authors : 
 * 		David Touzet <dtouzet@irisa.fr>
 */
package org.eclipse.emf.ecoretools.registration.popup.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;


/**
 * Action that register an ecore file
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
		// Fixing bug #4033
		if( pack.getNsURI() != null && !pack.getNsURI().equals("") ) {
			Registry.INSTANCE.put(pack.getNsURI(), pack);

			for(EPackage subPack : pack.getESubpackages()) {
				registerPackages(subPack);
			}

		} else {
			Shell shell = new Shell();
			MessageDialog.openWarning(
				shell,
				"EPackage registration",
				"The EPackage: " + pack.getName() + " cannot be registered, because its nsUri is not defined, all its subpackages have not been registered.");
		}
	}

}
