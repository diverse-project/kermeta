/* $Id: EcoreRegistering.java,v 1.1 2008-11-13 10:51:27 cfaucher Exp $ */
/* **********************************************************************
 * Copyright (c) 2007, 2008 INRIA and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    INRIA - initial API and implementation
 **********************************************************************/

package org.eclipse.emf.ecoretools.registration;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecoretools.registration.exceptions.NotValidEPackageURIException;

public class EcoreRegistering {

	/**
	 * Register the contained EPackages by the given IFile
	 * @param ecoreFile
	 * @throws NotValidEPackageURIException 
	 */
	public static void registerPackages(IFile ecoreFile) throws NotValidEPackageURIException {
		String strURI = "platform:/resource" + ecoreFile.getFullPath().toString(); 
		URI mmURI = URI.createURI(strURI);
		registerPackages(mmURI);
	}
	
	public static void registerPackages(URI ecoreFileUri) throws NotValidEPackageURIException {
		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.getResource(ecoreFileUri, true);

		for(EObject eobj : res.getContents()) {
			if( eobj instanceof EPackage) {
				registerPackages((EPackage) eobj);
			}
		}
	}

	/**
	 * Register the given EPackage and all its contained EPackages
	 * @param pack
	 * @throws NotValidEPackageURIException 
	 */
	public static void registerPackages(EPackage pack) throws NotValidEPackageURIException {
		String pack_NsURI = pack.getNsURI();
		if( pack_NsURI != null && !pack_NsURI.equals("") ) {
			
			if( !Registry.INSTANCE.containsKey(pack_NsURI) ) {
				Registry.INSTANCE.put(pack_NsURI, pack);
			}

			for(EPackage subPack : pack.getESubpackages()) {
				registerPackages(subPack);
			}

		} else {
			throw new NotValidEPackageURIException(pack);
		}
	}

}


