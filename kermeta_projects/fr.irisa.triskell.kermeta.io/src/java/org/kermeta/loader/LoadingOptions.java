

/*$Id: LoadingOptions.java,v 1.4 2009-01-09 08:56:56 cfaucher Exp $
* Project : fr.irisa.triskell.kermeta.io
* File : 	LoadingOptions.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 5 oct. 07
* Authors : paco
*/

package org.kermeta.loader;

public class LoadingOptions {

	static final public String FRAMEWORK_LOADING = "framework_loading";
	
	/*
	 * 
	 * Constants for KMT loading.
	 * 
	 */
	static final public String CONTENT = "content";
	
	/*
	 * 
	 * Constants for Ecore loading.
	 * 
	 */
	static final public String ECORE_QuickFixEnabled = "isQuickFixEnabled";
	static final public String ECORE_LOADING_FRAMEWORK = "loadingFramework";
	
	/*
	 * 
	 * Constants for Km loading.
	 * true: if the given km must require the framework, thus the framework.km will be auto-added
	 * false: if the given km file already contains the framework, thus the framework.km will be not added
	 */
	static final public String INCLUDE_FRAMEWORK = "_INCLUDE_FRAMEWORK_";
	
	
}


