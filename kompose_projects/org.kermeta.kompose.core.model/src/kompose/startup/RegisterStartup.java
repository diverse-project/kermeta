/*
 * author: Mickael Clavreul - mclavreu(at)irisa.fr - Triskell Team
 * 
 */
package kompose.startup;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.IStartup;

public class RegisterStartup implements IStartup {
   /*
    * This method register all the meta-model packages on startup
    */
	public void earlyStartup() {

		String strURI = null;
		URI mmURI = null;
		Resource res = null;
		ResourceSet rs = new ResourceSetImpl();
		strURI = "platform:/plugin" + "/org.kermeta.kompose.core.model" + "/model/kompose.ecore";
		mmURI=URI.createURI(strURI);
		res = rs.getResource(mmURI, true);
		for(EObject eobj : (List<EObject>)res.getContents()) {
			if( eobj instanceof EPackage) {
				registerPackages((EPackage) eobj);
			}
		}
	}

	private void registerPackages(EPackage pack) {
		if( pack.getNsURI() != null && !pack.getNsURI().equals("") ) {
			Registry.INSTANCE.put(pack.getNsURI(), pack);
			for(EPackage subPack :(List<EPackage>) pack.getESubpackages()) {
				registerPackages(subPack);
			}

		}
	}

}
