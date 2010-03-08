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
import java.util.Collection;
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
	
	/**
	 * Load the kermeta unit
	 * @throws NotRegisteredURIException 
	 * @throws URIMalformedException 
	 */
	public abstract KermetaUnit load() throws URIMalformedException, NotRegisteredURIException; 
	
	
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
