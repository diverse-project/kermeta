/*$Id: KPMPreferenceHelper.java,v 1.2 2008-11-04 12:24:32 dvojtise Exp $
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
	/**
	 * Returns the list of patterns that should be excluded that are stored in the preference string
	 * @return
	 */
	public static EList<String> getExcludedFilePatterns(){
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
