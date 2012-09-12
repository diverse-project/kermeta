/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 11 sept. 2012
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.kp.launcher.eclipse.internal;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.kermeta.language.loader.kmt.scala.KMPrinter;
import org.kermeta.language.structure.KermetaModelElement;

/**
 * Simple label provider used in the dialog of this plugin
 */
public class KermetaLabelProvider implements ILabelProvider {

	@Override
	public void addListener(ILabelProviderListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isLabelProperty(Object arg0, String arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public Image getImage(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getText(Object o) {
		if(o instanceof KermetaModelElement)
		{
			KMPrinter opPrinter = new KMPrinter();
			return opPrinter.convertToText((EObject) o);
		}
		return null;
	}

}
