package org.kermeta.ki.visual.view;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public abstract class OperationViewExtern {
	public static RuntimeObject onParameterAdded(final RuntimeObject operationRO, final RuntimeObject nameRO, final RuntimeObject typeNameRO) {
		final OperationView operation 	= (OperationView) Source2TargetMap.MAP.getTargetObject(operationRO);
		final String name				= fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(nameRO);
		final String typeName			= fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(typeNameRO);
		
		operation.addAttribute(name, typeName);
		
		return operationRO.getFactory().getMemory().voidINSTANCE; 
	}
}
