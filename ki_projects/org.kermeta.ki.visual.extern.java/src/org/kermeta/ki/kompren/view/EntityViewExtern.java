package org.kermeta.ki.kompren.view;

import org.kermeta.ki.diagram.view.interfaces.IEntityView;
import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

public abstract class EntityViewExtern {
	public static void onPruning(final boolean isHidePolicy, final Object prunedObjectRO) {
		final Object prunedObject  = Source2TargetMap.MAP.getTargetObject(prunedObjectRO);

		if(prunedObject instanceof IEntityView)
			((IEntityView)Source2TargetMap.MAP.getTargetObject(prunedObjectRO)).onPruning(isHidePolicy);
	}
	
	
	
	public static boolean isPruned(final Object entityRO) {
		final Object obj = Source2TargetMap.MAP.getTargetObject(entityRO);
		return obj instanceof IEntityView ? ((IEntityView)obj).isPruned() : false;
	}
	
	
	
	public static void unprune(final Object entityRO) {
		((IEntityView)Source2TargetMap.MAP.getTargetObject(entityRO)).onUnpruning();
	}
	
	
	
	public static boolean contains(final Object entityRO, final double xRO, final double yRO) {
		return ((IEntityView)Source2TargetMap.MAP.getTargetObject(entityRO)).contains(xRO, yRO);
	}
	
	
	public static boolean isVisible(final Object entityRO) {
		final Object obj = Source2TargetMap.MAP.getTargetObject(entityRO);
		return obj instanceof IEntityView ? ((IEntityView)obj).isVisible() : false;
	}
}
