/*$Id: SortPropertyCommand.java,v 1.4 2008-09-24 15:18:35 dvojtise Exp $
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

import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.RuntimeObjectHelper;

/**
 * A command for sorting a property
 *
 */
public class SortPropertyCommand {
	/** RuntimeObject that was refering the values through the feature . this data is used to have a better error reporting */
	RuntimeObject originRuntimeObject;
	/** ordered values in the original model in Keremta memory*/
	ArrayList<RuntimeObject> sourceRuntimeObjects;
	/** eObject whose feature must be sorted*/
	EObject eObject;
	/** feature that must be sorted */
	EStructuralFeature feature;
	
	public SortPropertyCommand(RuntimeObject originRuntimeObject, ArrayList<RuntimeObject> sourceRuntimeObjects, EObject eObject, EStructuralFeature efeature){
		this.originRuntimeObject = originRuntimeObject;
		this.sourceRuntimeObjects = sourceRuntimeObjects;
		this.eObject = eObject;
		this.feature = efeature;		
	}
	/**
	 * sort the efeature according to sourceRuntimeObject array
	 */
	public void run(){
		if(sourceRuntimeObjects.size() != ((EList<Object>) eObject.eGet(feature)).size()){
			String originObjectInfo = RuntimeObjectHelper.getInfoString(originRuntimeObject);					
			
			String msg = "Cannot ensure order of "+ eObject.eClass().getName() + "."  + feature.getName() + " (called on" + 
			originObjectInfo + ") because of a mismatch in the number of elements in the EMF object and in the RuntimeObject !";
			Runtime2EMF.internalLog.error(msg);
			KermetaRaisedException kre = KermetaRaisedException.createKermetaException("kermeta::exceptions::ResourceSaveException",
	    			msg,
	    			sourceRuntimeObjects.get(0).getFactory().getMemory().getInterpreter().getBasicInterpreter(),
	    			sourceRuntimeObjects.get(0).getFactory().getMemory(),
	    			null);
			RuntimeObject ro_property = RuntimeObjectHelper.getPropertyByName(kre.raised_object,"failedWhileSaving");
			fr.irisa.triskell.kermeta.runtime.language.Object.set(kre.raised_object,
					ro_property,
					originRuntimeObject);
			throw kre;
			
		}
		
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
