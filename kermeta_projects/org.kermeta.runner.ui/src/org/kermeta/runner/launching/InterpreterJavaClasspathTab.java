/* $Id: InterpreterJavaClasspathTab.java,v 1.2 2008-04-30 13:58:49 ftanguy Exp $
 * Project: org.kermeta.runner.ui
 * File: InterpreterJavaClasspathTab.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: Jan, 25 2006
 * Authors: dvojtise
 * 
 * Note: it would be interresting to be able to initialize the Bootpath with the jars needed to run kermeta
 *  and then configure entirely the classpath instead of masking the bootpath
 */
package org.kermeta.runner.launching;

import org.eclipse.jdt.debug.ui.launchConfigurations.JavaClasspathTab;

public class InterpreterJavaClasspathTab extends JavaClasspathTab {

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getName()
	 */
	public String getName() {
		return "Java Classpath"; //$NON-NLS-1$
	}
	
	/**
	 * Returns whether the bootpath should be displayed.
	 * 
	 * @return whether the bootpath should be displayed
	 * @since 3.0
	 */
	public boolean isShowBootpath() {
		return false;
	}
}
