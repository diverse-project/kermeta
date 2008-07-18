/*$Id: FinalizeLoading.java,v 1.5 2008-07-18 07:09:34 dvojtise Exp $
* Project : org.kermeta.io.loader
* File : 	FinalizeLoading.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 19 dec. 07
* Authors : 
* 			paco
* 			dvojtise
*/

package org.kermeta.io.loader.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.kermeta.io.loader.ILoadingDatas;
import org.kermeta.io.loader.action.ILoadingAction;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.loader.kmt.AbstractBuildingState;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;

public class FinalizeLoading implements ILoadingAction {

	public void performAction(ILoadingDatas datas, Map<?, ?> options) {
		AbstractBuildingState state = (AbstractBuildingState) datas.getKermetaUnit().getBuildingState();
		state.loaded = true;
		
		/*
		 * 
		 * Some inheritance links must be removed.
		 * Ex: an aspect that inherits several times from Object
		 * 
		 */
		for ( TypeDefinition td : KermetaUnitHelper.getInternalTypeDefinitions( datas.getKermetaUnit() ) ) {
			if ( td instanceof ClassDefinition ) {
				ClassDefinition cdef = (ClassDefinition) td;
				cleanInheritanceHierarchy(cdef);				
			}
		}
	
	}

	/**
	 * Clean inheritance hierarchy, by removing useless inheritance to Object, only topmost classes keep the inheritance to Object
	 * @param cdef
	 */
	private void cleanInheritanceHierarchy(ClassDefinition cdef) {
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


