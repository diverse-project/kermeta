/*$Id: EcoreUnregisterPackageAction.java,v 1.2 2007-12-13 15:23:11 dvojtise Exp $
* Project : org.eclipse.emf.ecoretools.registration
* File : 	EcoreUnregisterPackageAction.java
* License : EPL
* Copyright : INRIA
* ----------------------------------------------------------------------------
* Creation date : 29 mai 07
* Authors : 
*     dvojtise <dvojtise@irisa.fr>
*/

package org.eclipse.emf.ecoretools.registration.popup.actions;

import java.util.Iterator;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecoretools.registration.EMFRegistryHelper;
import org.eclipse.emf.ecoretools.registration.view.RegisteredPackageView;
import org.eclipse.jface.action.Action;
/**
 * 
 * Action on the RegisteredPackageView that unregister a Ns uri 
 * and the corresponding children
 *
 */
public class EcoreUnregisterPackageAction extends Action {

	private RegisteredPackageView view;

	public EcoreUnregisterPackageAction(RegisteredPackageView view, String text) {
		super(text);
		this.view = view;
	}

	public void run() {
		for(int i = 0; i < view.getSelectedPackages().length; i++){
			EPackage p = view.getSelectedPackages()[i];;
			// remove all children and gran children ...
			Iterator<String> it = EMFRegistryHelper.getAllRegisteredChildren( p.getNsURI() ).iterator();
			while(it.hasNext()){
				Registry.INSTANCE.remove(it.next());
			}

			// remove it
			Registry.INSTANCE.remove( p.getNsURI() );
			
		}

		view.refresh();
	}
}


