/*$Id: EcoreUnregisterPackageAction.java,v 1.2 2007-05-30 07:26:07 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta
* File : 	EcoreUnregisterPackageAction.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 29 mai 07
* Authors : 
*     dvojtise <dvojtise@irisa.fr>
*/

package fr.irisa.triskell.kermeta.popup.actions;

import java.util.Iterator;

import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.jface.action.Action;

import fr.irisa.triskell.eclipse.emf.EMFRegistryHelper;
import fr.irisa.triskell.kermeta.view.RegisteredPackageView;
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
			String nsURI = view.getSelectedPackages()[i];;
			// remove all children and gran children ...
			Iterator<String> it = EMFRegistryHelper.getAllRegisteredChildren(nsURI).iterator();
			while(it.hasNext()){
				Registry.INSTANCE.remove(it.next());
			}

			// remove it
			Registry.INSTANCE.remove(nsURI);
			
		}

		view.refresh();
	}
}


