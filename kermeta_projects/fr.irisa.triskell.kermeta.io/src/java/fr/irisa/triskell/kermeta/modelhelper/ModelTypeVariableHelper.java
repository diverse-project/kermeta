/* $Id: ModelTypeVariableHelper.java,v 1.2 2006-12-07 08:05:05 dvojtise Exp $
 * Project   : Kermeta 
 * File      : ClassDefinitionHelper.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 18 oct. 06
 * Authors       : 
 *		Jim Steel 
 */
package fr.irisa.triskell.kermeta.modelhelper;

import java.util.Iterator;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.VirtualType;
import fr.irisa.triskell.kermeta.language.structure.impl.StructurePackageImpl;

/**
 * this class proposes various helper functions that applies to ModelTypeVariable in the Kermeta model
 *
 */
public class ModelTypeVariableHelper {
	public static VirtualType getVirtualTypeByClassDefinition(ModelTypeVariable mtvar, ClassDefinition cdef) {
		VirtualType vt = null;
        StructureFactory struct_factory = StructurePackageImpl.init().getStructureFactory();
		Iterator vt_iter = mtvar.getVirtualType().iterator();
		while ((vt == null) && vt_iter.hasNext()) {
			VirtualType cand_vt = (VirtualType) vt_iter.next();
			if (cand_vt.getClassDefinition().getName().equals(cdef.getName())) {
				vt = cand_vt;
			}
		}
		if (null == vt) {
			//Need to create it
			vt = struct_factory.createVirtualType();
			vt.setName(cdef.getName());
			vt.setClassDefinition(cdef);
			vt.setModelType(mtvar);
		}
		return vt;
	}
	public static VirtualType getVirtualTypeByName(ModelTypeVariable mtvar, String name) {
		VirtualType result = null;
		ModelTypeDefinition mtdef = (ModelTypeDefinition) ((ModelType) mtvar.getSupertype()).getTypeDefinition();
		Iterator tdef_iter = mtdef.getOwnedTypeDefinition().iterator();
		while ((null == result) && tdef_iter.hasNext()) {
			TypeDefinition tdef = (TypeDefinition) tdef_iter.next();
			if (tdef.getName().equals(name)) {
				result = getVirtualTypeByClassDefinition(mtvar, (ClassDefinition) tdef);
			}
		}
		return result;
	}
}
