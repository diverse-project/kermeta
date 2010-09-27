package org.kermeta.ki.kompren.view;

import org.kermeta.ki.diagram.view.interfaces.IEntityView;
import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Real;

public abstract class EntityViewExtern {
	public static RuntimeObject onPruning(final RuntimeObject isHidePolicyRO, final RuntimeObject prunedObjectRO) {
		final Object prunedObject  = Source2TargetMap.MAP.getTargetObject(prunedObjectRO);

		if(prunedObject instanceof IEntityView)
			((IEntityView)Source2TargetMap.MAP.getTargetObject(prunedObjectRO)).onPruning(
						fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.getValue(isHidePolicyRO));

		return prunedObjectRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject isPruned(final RuntimeObject entityRO) {
		final Object obj = Source2TargetMap.MAP.getTargetObject(entityRO);
		final boolean ok = obj instanceof IEntityView ? ((IEntityView)obj).isPruned() : false;
		
		return ok ? entityRO.getFactory().getMemory().trueINSTANCE : entityRO.getFactory().getMemory().falseINSTANCE;
	}
	
	
	
	public static RuntimeObject unprune(final RuntimeObject entityRO) {
		((IEntityView)Source2TargetMap.MAP.getTargetObject(entityRO)).onUnpruning();
		return entityRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject contains(final RuntimeObject entityRO, final RuntimeObject xRO, final RuntimeObject yRO) {
		final boolean contains = ((IEntityView)Source2TargetMap.MAP.getTargetObject(entityRO)).contains(Real.getValue(xRO), Real.getValue(yRO));
		return contains ? entityRO.getFactory().getMemory().trueINSTANCE : entityRO.getFactory().getMemory().falseINSTANCE; 
	}
	
	
	public static RuntimeObject isVisible(final RuntimeObject entityRO) {
		final Object obj = Source2TargetMap.MAP.getTargetObject(entityRO);
		final boolean ok = obj instanceof IEntityView ? ((IEntityView)obj).isVisible() : false;
		
		return ok ? entityRO.getFactory().getMemory().trueINSTANCE : entityRO.getFactory().getMemory().falseINSTANCE;
	}
}
