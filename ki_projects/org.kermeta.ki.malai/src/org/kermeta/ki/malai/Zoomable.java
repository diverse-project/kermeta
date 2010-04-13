package org.kermeta.ki.malai;


public interface Zoomable {
	void zoomIn(final double increment);
	
	void zoomOut(final double decrement);
	
	void zoomDefault();
}
