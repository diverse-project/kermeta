package org.kermeta.ki.malai;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

public abstract class ZoomUtils {
	public static void setZoom(final Object zoomableRO, final int x, final int y, final double zoomLevel) {
		final Object zoomable = Source2TargetMap.MAP.getTargetObject(zoomableRO);
		
		if(zoomable instanceof Zoomable) {
			((Zoomable)zoomable).setZoom(x, y, zoomLevel);
		}
	}
	
	
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
	
	
	
	public static double getZoom(final Object zoomableRO) {
		final Object zoomable = Source2TargetMap.MAP.getTargetObject(zoomableRO);

		if(zoomable instanceof Zoomable)
			return ((Zoomable)zoomable).getZoom();
		
		return 1.;
	}
	
	
	
	public static void zoomDefault(final Object zoomableRO) {
		final Object zoomable = Source2TargetMap.MAP.getTargetObject(zoomableRO);
		
		if(zoomable instanceof Zoomable)
			((Zoomable)zoomable).zoomDefault();
	}
}
