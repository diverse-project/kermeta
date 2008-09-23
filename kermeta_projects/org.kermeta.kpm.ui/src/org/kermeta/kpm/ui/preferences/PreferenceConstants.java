/* $Id: PreferenceConstants.java,v 1.1 2008-09-23 14:28:34 dvojtise Exp $
 * Project: KPM UI
 * File: KPMPreferencePage.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: Sep 19, 2008
 * Authors: dvojtise
 */
package org.kermeta.kpm.ui.preferences;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * Constant definitions for plug-in preferences
 */
public class PreferenceConstants {

	public static Image RED_CROSS = ImageDescriptor.createFromFile(KPMPreferencePage.class, "/icons/red_cross.jpg").createImage();


	public static final String P_EXCLUDED_EXTENSIONS = "KPMExcludedExtensionsPreference";

	
}
