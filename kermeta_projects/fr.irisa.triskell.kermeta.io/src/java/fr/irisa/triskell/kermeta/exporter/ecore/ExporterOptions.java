/*$Id: ExporterOptions.java,v 1.2 2007-10-18 09:36:57 cfaucher Exp $
* Project : fr.irisa.triskell.kermeta.io
* File : 	ExporterOptions.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 27 août 07
* Authors : cfaucher <cfaucher@irisa.fr>
*/

package fr.irisa.triskell.kermeta.exporter.ecore;

public class ExporterOptions {

	public boolean isIndependent;
	
	public boolean isOnlyStructural;
	
	public boolean isExportedWithMerger;
	
	private ExporterOptions() {
		isIndependent = false;
		isOnlyStructural = false;
		isExportedWithMerger = false;
	}
	
	public ExporterOptions(boolean independent, boolean onlyStructural) {
		isIndependent = independent;
		isOnlyStructural = onlyStructural;
	}
	
	public ExporterOptions(boolean independent, boolean onlyStructural, boolean exportedWithMerger) {
		isIndependent = independent;
		isOnlyStructural = onlyStructural;
		isExportedWithMerger = exportedWithMerger;
	}
	
	public static ExporterOptions getDefault() {
		return new ExporterOptions();
	}
}


