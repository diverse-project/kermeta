package org.kermeta.ki.malai;


public interface Zoomable {
	void zoomIn(final double increment);
	
	void zoomOut(final double decrement);
	
	void zoomDefault();
	
	double getZoom();
	
	void setZoom(final int x, final int y, final double zoomLevel);
}
