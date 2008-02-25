

/*$Id: FinalizeLoading.java,v 1.3 2008-02-25 15:59:46 ftanguy Exp $
* Project : org.kermeta.io.loader
* File : 	FinalizeLoading.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 19 déc. 07
* Authors : paco
*/

package org.kermeta.io.loader.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.kermeta.io.loader.ILoadingDatas;
import org.kermeta.io.loader.action.ILoadingAction;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.Class;
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
				List<Type> supertypesToRemove = new ArrayList<Type>();
				Map<ClassDefinition, Type> superClassDefinition = new HashMap<ClassDefinition, Type>();
				for ( Type t : cdef.getSuperType() ) {
					if ( t instanceof Class )
						superClassDefinition.put( (ClassDefinition) ((Class) t).getTypeDefinition(), t );
				}
				
				for ( Type t : cdef.getSuperType() ) {
					if ( t instanceof Class ) {
						Class clazz = (Class) t;
						Collection<TypeDefinition> context = KermetaModelHelper.ClassDefinition.getContext( (ClassDefinition) clazz.getTypeDefinition() );
						context.remove(clazz.getTypeDefinition());
						for ( TypeDefinition typeDefinition : context ) {
							if ( superClassDefinition.containsKey(typeDefinition) )
								supertypesToRemove.add( superClassDefinition.get(typeDefinition) );
						}
					}
				}

				cdef.getSuperType().removeAll( supertypesToRemove );
			}
		}
	
	}

}


