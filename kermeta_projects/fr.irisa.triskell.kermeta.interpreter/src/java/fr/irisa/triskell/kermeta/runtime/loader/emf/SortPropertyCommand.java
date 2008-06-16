/*$Id: SortPropertyCommand.java,v 1.1 2008-06-16 15:08:03 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.interpreter
* File : 	SortPropertyCommand.java
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 16 juin 08
* Authors : 
*      Didier Vojtisek <dvojtise@irisa.fr>
*/

package fr.irisa.triskell.kermeta.runtime.loader.emf;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

/**
 * A command for sorting a property
 *
 */
public class SortPropertyCommand {
	ArrayList<RuntimeObject> sourceRuntimeObjects;
	EObject eObject;
	EStructuralFeature feature;
	
	public SortPropertyCommand(ArrayList<RuntimeObject> sourceRuntimeObjects, EObject eObject, EStructuralFeature efeature){
		this.sourceRuntimeObjects = sourceRuntimeObjects;
		this.eObject = eObject;
		this.feature = efeature;		
	}
	/**
	 * sort the efeature according to sourceRuntimeObject array
	 */
	public void run(){
		for(int i = 0; i <= sourceRuntimeObjects.size()-1 ; i++){
			RuntimeObject rcoll = sourceRuntimeObjects.get(i);
			if(	((EList<Object>) eObject.eGet(feature)).get(i) != rcoll.getR2eEmfObject()){
				// they are not at the correct place in the eObject feature
				// need to move it
				Runtime2EMF.internalLog.debug("moving "+ eObject.eClass().getName() + "."  + feature.getName() + "["+i+"] =  "+ rcoll.getProperties().toString());
				((EList<Object>) eObject.eGet(feature)).move(i, rcoll.getR2eEmfObject());
			}
		}
	}
}
