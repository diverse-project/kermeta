/* $Id: EMFRegistryHelper.java,v 1.2 2007-05-29 16:15:29 dvojtise Exp $
 * Project   : Kermeta 
 * File      : EMFRegistryHelper.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 28 févr. 07
 * Authors       : dvojtise <dvojtise.irisa.fr>
 */
package fr.irisa.triskell.eclipse.emf;

import java.util.Iterator;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.common.util.URI;

public class EMFRegistryHelper {

	public static boolean isRegistered(URI uri){
		return isRegistered(uri.toString());
	}
	public static boolean isRegistered(String uri){
		Iterator it = Registry.INSTANCE.keySet().iterator();
		while(it.hasNext()){
			String regentry = (String)it.next();
			if(regentry.equals(uri.toString()) )
					return true;
		}
		return false;
	}
	
	public static boolean isDynamicallyRegistered(String uri){
		EPackage pack = (EPackage)Registry.INSTANCE.get(uri);
		if(pack == null) return false;
		if(pack.getClass() == EPackageImpl.class){ // if this is exactly an EPackage then this comes from a files, otherwise it comes from generated java
			return true;
		}
		else return false;
	}
}
