

/*$Id: KMTBuildingState.java,v 1.4 2008-04-28 11:50:13 ftanguy Exp $
* Project : io
* File : 	KMTloader.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 5 juin 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.loader.kmt.kmt2km;


public class KMTBuildingState extends AbstractBuildingState {

/*	public boolean doneLoadImportedUnits = false;
	
	public boolean doneLoadTypeDefinitions = false;
	
	public boolean doneImport = false;
	
	public boolean baseAspectDone = false;
	
	public boolean replacingObjecTypeVariablesDone = false;
	
	public boolean doneLoadStructuralFeatures = false;
	
	public boolean doneLoadOppositeProperties = false;
	
	public boolean doneLoadBodies = false;
	
	public boolean doneLoadAnnotations = false;
	
	public boolean doneMarkError = false;
	
	public boolean loading = false;*/
	public boolean astLoaded = false;	
	public boolean kmStructureCreated = false;
	public boolean allRequiresResolved = false;
	
}


