package org.kermeta.ki.diagram.view.interfaces;

import java.awt.Color;
import java.awt.geom.Point2D;

/**
 * Interface that declares methods that must implement a polygon decoration.
 * @author Arnaud Blouin
 */
public interface IPolygonDecorationView extends IDecorationView {
	/**
	 * Sets the path of the decoration.
	 * @param pts The sets of points. Must contains more than 2 points.
	 * @return True: the path has been successfully set. 
	 */
	boolean setPath(final Point2D... pts);

	/**
	 * @return The colour of the interior of the decoration.
	 */
	Color getFillColor();

	/**
	 * Sets the colour of the interior of the decoration.
	 * @param fillColor The colour of the interior of the decoration.
	 */
	void setFillColor(final Color fillColor);
}