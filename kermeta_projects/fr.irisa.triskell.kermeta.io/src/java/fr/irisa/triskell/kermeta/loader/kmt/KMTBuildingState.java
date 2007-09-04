

/*$Id: KMTBuildingState.java,v 1.3 2007-09-04 08:29:33 ftanguy Exp $
* Project : io
* File : 	KMTloader.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 5 juin 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.loader.kmt;


public class KMTBuildingState extends AbstractBuildingState {

	public boolean doneLoadImportedUnits = false;
	
	public boolean doneLoadTypeDefinitions = false;
	
	public boolean doneImport = false;
	
	public boolean baseAspectDone = false;
	
	public boolean replacingObjecTypeVariablesDone = false;
	
	public boolean doneLoadStructuralFeatures = false;
	
	public boolean doneLoadOppositeProperties = false;
	
	public boolean doneLoadBodies = false;
	
	public boolean doneLoadAnnotations = false;
	
	public boolean doneMarkError = false;
	
	public boolean loading = false;
	
}


