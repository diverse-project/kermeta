/**
 * 
 */
package fr.irisa.triskell.kermeta.popup.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
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
public class EcoreUnregisteringAction extends EMFRegisterAction {
	

	/**
	 * 
	 */
	public EcoreUnregisteringAction() {
		super();
	}

	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
		IFile ecoreFile = null;
		String strURI = null;
		URI mmURI = null;
		Resource res = null;
		EPackage ePack = null;
		
		ResourceSet rs = new ResourceSetImpl();
		Iterator it = ecoreFiles.iterator();
		while(it.hasNext()) {
			ecoreFile = (IFile) it.next();
			
			strURI = "platform:/resource" + ecoreFile.getFullPath().toString(); 
			mmURI = URI.createURI(strURI);
			res = rs.getResource(mmURI, true);
			
			ePack = (EPackage) res.getContents().get(0);
			unregisterPackages(ePack);
		}
		
		displayRegisteredPackages();
	}

	
	/**
	 * @param p
	 */
	private void unregisterPackages(EPackage pack) {
		EList l = pack.getESubpackages();
		
		if(l != null) {
			Iterator it = l.iterator();
			while(it.hasNext()) {
				unregisterPackages((EPackage) it.next());
			}
		}
		
		Registry.INSTANCE.remove(pack.getNsURI());
	}

}
