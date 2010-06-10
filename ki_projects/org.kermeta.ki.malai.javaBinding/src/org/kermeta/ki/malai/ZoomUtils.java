package org.kermeta.ki.malai;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Real;

public abstract class ZoomUtils {
	public static RuntimeObject zoomIn(RuntimeObject zoomableRO, RuntimeObject incrementRO) {
		final Object zoomable = zoomableRO.getUserData();
		
		if(zoomable instanceof Zoomable)
			((Zoomable)zoomable).zoomIn(Real.getValue(incrementRO));
		
		return zoomableRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject zoomOut(RuntimeObject zoomableRO, RuntimeObject decrementRO) {
		final Object zoomable = zoomableRO.getUserData();
		
		if(zoomable instanceof Zoomable)
			((Zoomable)zoomable).zoomOut(Real.getValue(decrementRO));
		
		return zoomableRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject zoomDefault(RuntimeObject zoomableRO) {
		final Object zoomable = zoomableRO.getUserData();
		
		if(zoomable instanceof Zoomable)
			((Zoomable)zoomable).zoomDefault();
		
		return zoomableRO.getFactory().getMemory().voidINSTANCE;
	}
}
