/*$Id: EcoreUnregisterPackageAction.java,v 1.1 2007-05-29 16:17:47 dvojtise Exp $
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

import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.jface.action.Action;

import fr.irisa.triskell.kermeta.view.RegisteredPackageView;

public class EcoreUnregisterPackageAction extends Action {

	private RegisteredPackageView view;

	   public EcoreUnregisterPackageAction(RegisteredPackageView view, String text) {
	      super(text);
	      this.view = view;
	   }

	  public void run() {
		  // getTheSelection
		  for(int i = 0; i < view.getSelectedPackages().length; i++){
			  Registry.INSTANCE.remove(view.getSelectedPackages()[i]);
		  }
	      view.refresh();
	   }
}


