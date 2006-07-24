/**
 * 
 */
package fr.irisa.triskell.kermeta.popup.actions;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
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
		String strURI = "platform:/resource" + ecoreFile.getFullPath().toString(); 

		URI mmURI = URI.createURI(strURI);
		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.getResource(mmURI, true);
		
		EPackage ePack = (EPackage) res.getContents().get(0);
		registerPackages(ePack);
		
		displayRegisteredPackages();
	}
	
	/**
	 * @param p
	 */
	private void registerPackages(EPackage pack) {
		Registry.INSTANCE.put(pack.getNsURI(), pack);
		
		EList l = pack.getESubpackages();
		
		if(l != null) {
			Iterator it = l.iterator();
			while(it.hasNext()) {
				registerPackages((EPackage) it.next());
			}
		}
	}

}
