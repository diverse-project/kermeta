/* Id: KermetaBuilderListener.java,v 2.0.1 Apr 18, 2012 11:36:19 AM
 * Project : org.kermeta.language.builder.eclipse
 * File : KermetaBuilderListener.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Apr 18, 2012
 * Authors : 
 * 		Suresh Pillay <suresh.pillay@irisa.fr> 
 * 
 */
package org.kermeta.language.builder.eclipse;

import java.util.EventListener;

import org.eclipse.core.resources.IProject;

public interface KermetaBuilderEventListener extends EventListener {
	public void projectCompiled(IProject project);
}
