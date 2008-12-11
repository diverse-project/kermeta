/*$Id: SortPropertyCommand.java,v 1.5 2008-12-11 19:47:09 dvojtise Exp $
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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.kermeta.interpreter.InterpreterPlugin;

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
			Object value;
			if(RuntimeObjectHelper.isKermetaBasicType(rcoll)){
				value = RuntimeObjectHelper.getPrimitiveTypeValueFromRuntimeObject(rcoll);
			}
			else{
			
				value = rcoll.getR2eEmfObject();
			}
			if(	((EList<Object>) eObject.eGet(feature)).get(i) != value){
				// they are not at the correct place in the eObject feature
				// need to move it
				Runtime2EMF.internalLog.debug("moving "+ eObject.eClass().getName() + "."  + feature.getName() + "["+i+"] =  "+ rcoll.getProperties().toString());
				if(((EList<Object>) eObject.eGet(feature)).contains(rcoll.getR2eEmfObject()))
					((EList<Object>) eObject.eGet(feature)).move(i, rcoll.getR2eEmfObject());
				else {
					
					InterpreterPlugin.logErrorMessage("Failed moving "+ eObject.eClass().getName() + "."  + feature.getName() + "["+i+"] =  "+ rcoll.getProperties().toString() +
					" because rcoll.getR2eEmfObject()"+rcoll.getR2eEmfObject() +" wasn't in the feature !?", 
						new Exception("Failed moving "+ eObject.eClass().getName() + "."  + feature.getName() + "["+i+"] =  "+ rcoll.getProperties().toString()));
				}
				
			}
		}
		
	}
}
