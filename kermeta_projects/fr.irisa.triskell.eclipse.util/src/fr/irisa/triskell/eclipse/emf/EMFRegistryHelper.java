/* $Id: EMFRegistryHelper.java,v 1.1 2007-02-28 17:27:19 dvojtise Exp $
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

import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.common.util.URI;

public class EMFRegistryHelper {

	public static boolean isRegistered(URI uri){
		Iterator it = Registry.INSTANCE.keySet().iterator();
		while(it.hasNext()){
			String regentry = (String)it.next();
			if(regentry.equals(uri.toString()) )
					return true;
		}
		return false;
	}
}
