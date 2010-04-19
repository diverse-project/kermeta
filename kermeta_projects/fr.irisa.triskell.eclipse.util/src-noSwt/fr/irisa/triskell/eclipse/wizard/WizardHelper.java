

/*$Id: WizardHelper.java,v 1.2 2007-07-20 15:08:44 ftanguy Exp $
* Project : fr.irisa.triskell.eclipse.util
* File : 	WizardHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 16 mai 07
* Authors : paco
*/

package fr.irisa.triskell.eclipse.wizard;

import org.eclipse.core.runtime.CoreException;
/*import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.wizards.IWizardDescriptor;*/

public class WizardHelper {

	/**
	 * Find a wizard with the given id.
	 * 
	 * @param id the id to search for
	 * @return the wizard descriptor matching the given id or <code>null</code>
	 */
	public static void /*IWizardDescriptor*/ getWizardDescriptor(String wizardId) {
		/*IWizardDescriptor descriptor = PlatformUI.getWorkbench().getNewWizardRegistry().findWizard( wizardId );
		if ( descriptor == null )
			descriptor = PlatformUI.getWorkbench().getImportWizardRegistry().findWizard( wizardId );
		return descriptor;*/
	}
	
	/**
	 * Create a wizard with the given id.
	 * 
	 * @param id the id to search for
	 * @return the workbench wizard matching the given id or <code>null</code>
	 */
	public static void /*IWorkbenchWizard */createWizard(String wizardId) throws CoreException {
		/*IWizardDescriptor descriptor = getWizardDescriptor(wizardId);
		if ( descriptor == null )
			return null;
		return descriptor.createWizard();*/
	}
	
}


