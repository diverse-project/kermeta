/*$Id: ExporterOptions.java,v 1.1 2007-08-27 09:30:05 cfaucher Exp $
* Project : fr.irisa.triskell.kermeta.io
* File : 	ExporterOptions.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 27 août 07
* Authors : cfaucher
*/

package fr.irisa.triskell.kermeta.exporter.ecore;

public class ExporterOptions {

	public boolean isIndependent;
	
	public boolean isOnlyStructural;
	
	private ExporterOptions() {
		isIndependent = false;
		isOnlyStructural = false;
	}
	
	public ExporterOptions(boolean independent, boolean onlyStructural) {
		isIndependent = independent;
		isOnlyStructural = onlyStructural;
	}
	
	public static ExporterOptions getDefault() {
		return new ExporterOptions();
	}
}


