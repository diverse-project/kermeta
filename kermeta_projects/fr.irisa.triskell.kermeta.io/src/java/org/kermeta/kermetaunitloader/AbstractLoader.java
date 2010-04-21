/*$Id: $
* Project : fr.irisa.triskell.kermeta.io
* File : 	AbstractLoader.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 22 févr. 2010
* Authors : Didier Vojtisek
*/

package org.kermeta.kermetaunitloader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.kermeta.io.KermetaUnit;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.AbstractBuildingState;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;

public abstract class AbstractLoader {
	

	protected KermetaUnit loadedUnit;
	
	public enum CommandStep {requireResolving, 
							requireImport, 
							requireErrorPropagation, 
							aspectBuilding, 
							modelTypeBuilding, 
							typeSetting, 
							supertypeSetting, 
							bodies_and_opposite_Setting, 
							annotationAddition, 
							traceModelLoading, 
							quickFixApplication,
							loadingFinalization, structureCreation, };
	
	/**
	 * List of the commands that need to be performed level by level
	 * the next group of command cannot be performed unless all previous command (from required unit are performed 
	 */
	public HashMap<CommandStep,AbstractCommand> groupedCommands = new HashMap<CommandStep,AbstractCommand>();
	
	protected boolean commandCreated = false;

	private boolean isResolvingRequire = false;
	
	/**
	 * Load the kermeta unit
	 * @throws NotRegisteredURIException 
	 * @throws URIMalformedException 
	 */
	public KermetaUnit load() throws URIMalformedException, NotRegisteredURIException{
		// first creates the commands for this unit
		if(!commandCreated){
			createCommands();
			commandCreated = true;
		}
		// perform the loading steps,
		if(groupedCommands.get(CommandStep.structureCreation) != null){
			groupedCommands.get(CommandStep.structureCreation).executeCommand();
			groupedCommands.remove(CommandStep.structureCreation);
		}
		loadedUnit.getTypeDefinitionContextsCache().clear();
		
		
		// perform the loading steps,
		if(groupedCommands.get(CommandStep.requireResolving) != null){
	//		if(isResolvingRequire ) // we have reentered this step before it has finished
	//			return loadedUnit;
	//		isResolvingRequire= true;
			groupedCommands.get(CommandStep.requireResolving).executeCommand();
			groupedCommands.remove(CommandStep.requireResolving);
	//		isResolvingRequire= false;
		}
		
		// ensure all required unit are loaded up to this point
		for ( KermetaUnit unitToImport : KermetaUnitHelper.getAllImportedKermetaUnits(loadedUnit) ){			
			if(unitToImport.getBuildingState() instanceof AbstractBuildingState){
				AbstractBuildingState buildingState = (AbstractBuildingState) unitToImport.getBuildingState();
				if(buildingState.kermetaUnitLoader.groupedCommands.get(CommandStep.requireResolving) != null){
					// start a load for this unit too
					buildingState.kermetaUnitLoader.load();
				}
			}
		}
		
		
		// from this point the commands must apply to all required units
		// they apply to all required unit in order to ensure homogeneous load of the data in units 
		// (and make sure all data are available for doing the next step)
		// due to the architecture, the command may have been performed by the load operation of another unit.
		
		performSynchronizedCommand(CommandStep.requireImport);
		// the cache cannot be reliable before all units are loaded, next call should recalculate it
		loadedUnit.getAllImportedKermetaUnitsCache().clear();
		performSynchronizedCommand(CommandStep.requireErrorPropagation);
		performSynchronizedCommand(CommandStep.aspectBuilding);
		performSynchronizedCommand(CommandStep.modelTypeBuilding);
		performSynchronizedCommand(CommandStep.typeSetting);
		// DVK: Hack :the cache build in the previous step may be incomplete, (because all super type may not have been set when first called :-( ) reset it
		// a better solution would be to better separate the actions needing allOperations and the typesetting step
		loadedUnit.getTypeDefinitionContextsCache().clear();
		for(KermetaUnit ku : KermetaUnitHelper.getAllImportedKermetaUnits(loadedUnit)){
			ku.getTypeDefinitionContextsCache().clear();
		}
		performSynchronizedCommand(CommandStep.supertypeSetting);
		performSynchronizedCommand(CommandStep.bodies_and_opposite_Setting);
		performSynchronizedCommand(CommandStep.annotationAddition);
		performSynchronizedCommand(CommandStep.quickFixApplication);
		performSynchronizedCommand(CommandStep.traceModelLoading);
		performSynchronizedCommand(CommandStep.loadingFinalization);
		
		
		return loadedUnit;
	}
	
	/**
	 * All commands of the given level will be performed if necessary
	 * @param stepToPerform
	 */
	protected void performSynchronizedCommand(CommandStep stepToPerform){
		if(groupedCommands.get(stepToPerform)!= null){
			groupedCommands.get(stepToPerform).executeCommand();
			// remove the command that has been done
			groupedCommands.remove(stepToPerform);
		}
		for ( KermetaUnit unitToImport : KermetaUnitHelper.getAllImportedKermetaUnits(loadedUnit) ){			
			if(unitToImport.getBuildingState() instanceof AbstractBuildingState){
				AbstractBuildingState buildingState = (AbstractBuildingState) unitToImport.getBuildingState();
				if(buildingState.kermetaUnitLoader.groupedCommands.get(stepToPerform)!= null){
					buildingState.kermetaUnitLoader.groupedCommands.get(stepToPerform).executeCommand();
					// remove the command that has been done
					buildingState.kermetaUnitLoader.groupedCommands.remove(stepToPerform);
				}
			}
		}
	}
	
	/**
	 * this operation is responsible for creating the command 
	 */
	public abstract void createCommands();
	
	/**
	 * final step when loading a KermetaUnit
	 */
	protected void finalizeLoad() {
		AbstractBuildingState state = (AbstractBuildingState) loadedUnit.getBuildingState();
		state.loaded = true;
		
		/*
		 * Some inheritance links must be removed.
		 * Ex: an aspect that inherits several times from Object 
		 */
		for ( TypeDefinition td : KermetaUnitHelper.getInternalTypeDefinitions( loadedUnit ) ) {
			if ( td instanceof ClassDefinition ) {
				ClassDefinition cdef = (ClassDefinition) td;
				cleanInheritanceHierarchy(cdef);				
			}
		}
	
	}

	public KermetaUnit getLoadedUnit() {
		return loadedUnit;
	}


	/**
	 * Clean inheritance hierarchy, by removing useless inheritance to Object, only topmost classes keep the inheritance to Object
	 * @param cdef
	 */
	public static void cleanInheritanceHierarchy(ClassDefinition cdef) {
		//Collection<TypeDefinition> context = KermetaModelHelper.ClassDefinition.getContext( cdef );
		if(cdef.getSuperType().size() > 1){ // we have more than 1 supertype
			List<Type> supertypesToRemove = new ArrayList<Type>();
			for ( Type t : cdef.getSuperType() ) {
				if ( t instanceof Class ){ // if one of its super type is Object, then remove it
					TypeDefinition typeDefinition = ((Class)t).getTypeDefinition();
					String qualifiedName = KermetaModelHelper.ClassDefinition.qualifiedName(typeDefinition);
					if ( qualifiedName.equals("kermeta::language::structure::Object")){
						supertypesToRemove.add( t );
					}
				}
			}
			cdef.getSuperType().removeAll( supertypesToRemove );
		}		
	}

}
