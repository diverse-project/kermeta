package org.kermeta.kompren.diagram.view.interfaces;

import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

public interface IView {
	GeneralPath getBoundPath();
	
	/**
	 * @return The path used to draw the view.
	 */
	GeneralPath getPath();
	
	/**
	 * Paints the component.
	 * @param g The graphics.
	 */
	void paint(final Graphics2D g);
}
