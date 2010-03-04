package org.kermeta.ki.malai.picking;

import java.awt.geom.Point2D;

public interface Picker {
	Pickable getPickableAt(Point2D point);
	
	Picker getPickerAt(Point2D point);
	
	Point2D getRelativePoint(Point2D pt, Object o);
	
	boolean contains(Object obj);
}
