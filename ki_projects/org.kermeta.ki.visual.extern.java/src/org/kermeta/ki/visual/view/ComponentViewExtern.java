package org.kermeta.ki.visual.view;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

public abstract class ComponentViewExtern {
	public static void onPruning(final boolean isHidePolicy, final Object prunedObjectRO) {
		final Object prunedObject  = Source2TargetMap.MAP.getTargetObject(prunedObjectRO);

		if(prunedObject instanceof ComponentView)
			((ComponentView)Source2TargetMap.MAP.getTargetObject(prunedObjectRO)).onPruning(isHidePolicy);
	}
	
	
	
	public static boolean isPruned(final Object entityRO) {
		final Object obj = Source2TargetMap.MAP.getTargetObject(entityRO);
		
		return obj instanceof ComponentView ? ((ComponentView)obj).isPruned() : false;
	}
	
	
	
	public static boolean isVisible(final Object entityRO) {
		final Object obj = Source2TargetMap.MAP.getTargetObject(entityRO);
		
		return obj instanceof ComponentView ? ((ComponentView)obj).isVisible() : false;
	}
}
