package org.kermeta.ki.visual.view;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public abstract class ComponentViewExtern {
	public static RuntimeObject onPruning(final RuntimeObject isHidePolicyRO, final RuntimeObject prunedObjectRO) {
		final Object prunedObject  = prunedObjectRO.getUserData();

		if(prunedObject instanceof ComponentView)
			((ComponentView)prunedObjectRO.getUserData()).onPruning(fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.getValue(isHidePolicyRO));

		return prunedObjectRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject isPruned(final RuntimeObject entityRO) {
		final Object obj = entityRO.getUserData();
		final boolean ok = obj instanceof ComponentView ? ((ComponentView)obj).isPruned() : false;
		
		return ok ? entityRO.getFactory().getMemory().trueINSTANCE : entityRO.getFactory().getMemory().falseINSTANCE;
	}
	
	
	
	public static RuntimeObject isVisible(final RuntimeObject entityRO) {
		final Object obj = entityRO.getUserData();
		final boolean ok = obj instanceof ComponentView ? ((ComponentView)obj).isVisible() : false;
		
		return ok ? entityRO.getFactory().getMemory().trueINSTANCE : entityRO.getFactory().getMemory().falseINSTANCE;
	}
}
