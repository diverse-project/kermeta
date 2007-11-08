

/*$Id: RegisteredPackagesLabelProvider.java,v 1.1 2007-11-08 15:18:01 cfaucher Exp $
* Project : org.eclipse.emf.ecore.registration
* File : 	RegisteredPackagesLabelProvider.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 nov. 07
* Authors : paco
*/

package org.eclipse.emf.ecore.registration.view;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.registration.EMFRegistryHelper;
import org.eclipse.emf.ecore.registration.RegistrationConstants;
import org.eclipse.emf.ecore.registration.RegistrationIcons;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class RegisteredPackagesLabelProvider extends LabelProvider implements ITableLabelProvider {

	public String getColumnText(Object obj, int index) {
		EPackage p = (EPackage) obj;
		switch (index) {
		case 0: // URI column
			return p.getNsURI();

		case 1: // Package name column
			return p.getName();
		case 2: // origin column
			if(obj != null){
				if(EMFRegistryHelper.isDynamicallyRegistered( p.getNsURI() ) )
				// if this is exactly an EPackage then this comes from a files, otherwise it comes from generated java
					return "" + getText(p.eResource().getURI());
				else 
					return "generated java in plugin";
			}
			return "";
		default:
			return "";

		}
	}

	public Image getColumnImage(Object obj, int index) {
		if ((index == 2)){				
			return getImage( obj );

		}
		return null;
	}

	public Image getImage(Object obj) {
		if(obj.getClass() == EPackageImpl.class){ // if this is exactly an EPackage then this comes from a files, otherwise it comes from generated java
			return RegistrationIcons.get(RegistrationConstants.IMG_ECORE_FILE);
			/*return PlatformUI.getWorkbench().getSharedImages()
			.getImage(org.eclipse.ui.ISharedImages.IMG_OBJ_FILE);*/
		}
		else return RegistrationIcons.get(RegistrationConstants.IMG_GENERATED_PACKAGE); 
			//return PlatformUI.getWorkbench().getSharedImages()
		//.getImage(org.eclipse.ui.ISharedImages.IMG_OBJ_ELEMENT);
		// org.eclipse.ui.ISharedImages
		//org.eclipse.jdt.ui.ISharedImages.;
	}

}


