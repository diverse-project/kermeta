package org.kermeta.kompren.diagram.view.interfaces;

import java.awt.geom.Rectangle2D;

import org.malai.picking.Pickable;

public interface Selectable extends Pickable, Moveable {
	Rectangle2D getBorders();

	void setSelected(final boolean selected);

	boolean isSelected();

	boolean isSelectable();
}
