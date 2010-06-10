package org.kermeta.ki.visual.view;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public abstract class ComponentViewExtern {
	public static RuntimeObject onPruning(final RuntimeObject isHidePolicyRO, final RuntimeObject prunedObjectRO) {
		final Object prunedObject  = Source2TargetMap.MAP.getTargetObject(prunedObjectRO);

		if(prunedObject instanceof ComponentView)
			((ComponentView)Source2TargetMap.MAP.getTargetObject(prunedObjectRO)).onPruning(
						fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.getValue(isHidePolicyRO));

		return prunedObjectRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject isPruned(final RuntimeObject entityRO) {
		final Object obj = Source2TargetMap.MAP.getTargetObject(entityRO);
		final boolean ok = obj instanceof ComponentView ? ((ComponentView)obj).isPruned() : false;
		
		return ok ? entityRO.getFactory().getMemory().trueINSTANCE : entityRO.getFactory().getMemory().falseINSTANCE;
	}
	
	
	
	public static RuntimeObject isVisible(final RuntimeObject entityRO) {
		final Object obj = Source2TargetMap.MAP.getTargetObject(entityRO);
		final boolean ok = obj instanceof ComponentView ? ((ComponentView)obj).isVisible() : false;
		
		return ok ? entityRO.getFactory().getMemory().trueINSTANCE : entityRO.getFactory().getMemory().falseINSTANCE;
	}
}
