/*$Id: KPMPreferenceHelper.java,v 1.1 2008-09-24 09:58:49 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	KPMPreferenceHelper.java
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 23 sept. 08
* Authors : 
*      Didier Vojtisek <dvojtise@irisa.fr>
*/

package org.kermeta.kpm.preferences;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.kermeta.kpm.KPMPlugin;

public class KPMPreferenceHelper {
	public static EList<String> getExcludedExtensions(){
		EList<String> excludedExtensions = new BasicEList<String>();
		String allExtensions = KPMPlugin.getDefault().getPreferenceStore().getString(PreferenceConstants.P_EXCLUDED_EXTENSIONS);
		String[] sArray = allExtensions.split(" |\n");
		int i = 0;
		while( i < sArray.length){
			if(sArray[i].trim().length() > 0){
				excludedExtensions.add(sArray[i].trim());
			}
			i++;
		}
		return excludedExtensions;
	}

}
