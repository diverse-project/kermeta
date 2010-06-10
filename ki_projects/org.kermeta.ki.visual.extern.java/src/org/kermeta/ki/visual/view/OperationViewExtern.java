package org.kermeta.ki.visual.view;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

public abstract class OperationViewExtern {
	public static void onParameterAdded(final Object operationRO, final String name, final String typeName) {
		final OperationView operation 	= (OperationView) Source2TargetMap.MAP.getTargetObject(operationRO);
		
		operation.addAttribute(name, typeName);
	}
}
