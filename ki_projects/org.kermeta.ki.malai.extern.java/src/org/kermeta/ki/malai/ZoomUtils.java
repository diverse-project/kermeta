package org.kermeta.ki.malai;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

public abstract class ZoomUtils {
	public static void zoomIn(final Object zoomableRO, final double increment) {
		final Object zoomable = Source2TargetMap.MAP.getTargetObject(zoomableRO);
		
		if(zoomable instanceof Zoomable)
			((Zoomable)zoomable).zoomIn(increment);
	}
	
	
	
	public static void zoomOut(final Object zoomableRO, final double decrement) {
		final Object zoomable = Source2TargetMap.MAP.getTargetObject(zoomableRO);
		
		if(zoomable instanceof Zoomable)
			((Zoomable)zoomable).zoomOut(decrement);
	}
	
	
	
	public static void zoomDefault(final Object zoomableRO) {
		final Object zoomable = Source2TargetMap.MAP.getTargetObject(zoomableRO);
		
		if(zoomable instanceof Zoomable)
			((Zoomable)zoomable).zoomDefault();
	}
}
