

/*$Id: LoadingOptions.java,v 1.5 2009-01-09 09:43:12 cfaucher Exp $
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
	 * This constant indicates that the given kmt comes from the content in memory of the textual editor and not from a file
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
	 * This constant indicates that the given km requires the loading of the framework.km
	 */
	static final public String INCLUDE_FRAMEWORK = "_INCLUDE_FRAMEWORK_";
	
	
}


