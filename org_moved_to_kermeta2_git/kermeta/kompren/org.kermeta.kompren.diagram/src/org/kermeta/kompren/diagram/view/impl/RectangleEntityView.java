package org.kermeta.kompren.diagram.view.impl;

import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import org.kermeta.kompren.diagram.view.interfaces.IAnchor;

public abstract class RectangleEntityView extends EntityView {

	public RectangleEntityView(final String name) {
		super(name);
	}


	protected void updateAnchorsPosition(final Rectangle2D oldBorders) {
		final Rectangle2D borders = path.getBounds2D();
		Point2D pos;
		final double minX = borders.getMinX();
		final double minY = borders.getMinY();
		final double tx = minX-oldBorders.getMinX();
		final double ty = minY-oldBorders.getMinY();
		final double sx = borders.getWidth()/oldBorders.getWidth();
		final double sy = borders.getHeight()/oldBorders.getHeight();

		for(final IAnchor anchor : anchors) {
			// Moving the anchors to the new position of the borders.
			anchor.translate(tx, ty);
			// Scaling the position of the anchor in function of the difference of dimensions between the former border
			// and the new border.
			pos = anchor.getPosition();
			pos.setLocation(minX + (pos.getX()-minX)*sx, minY + (pos.getY()-minY)*sy);
		}
	}


	@Override
	public GeneralPath getBoundPath() {
		return getPath();
	}


	@Override
	public boolean contains(final double x, final double y) {
		return isVisible() && getBorders().contains(x, y);
	}


	@Override
	protected void initAnchors() {
		final Rectangle2D rec = getBorders();

		anchors.add(new Anchor(rec.getMinX(), rec.getMinY()));
		anchors.add(new Anchor(rec.getCenterX(), rec.getMinY()));
		anchors.add(new Anchor(rec.getMaxX(), rec.getMinY()));
		anchors.add(new Anchor(rec.getMaxX(), rec.getCenterY()));
		anchors.add(new Anchor(rec.getMaxX(), rec.getMaxY()));
		anchors.add(new Anchor(rec.getCenterX(), rec.getMaxY()));
		anchors.add(new Anchor(rec.getMinX(), rec.getMaxY()));
		anchors.add(new Anchor(rec.getMinX(), rec.getCenterY()));
	}



	@Override
	protected IAnchor createMiddleAnchor(final IAnchor firstAnchor, final IAnchor secondAnchor) {
		if(firstAnchor==null || secondAnchor==null)
			return null;

		IAnchor anchor;
		final Point2D pos1 = firstAnchor.getPosition();
		final Point2D pos2 = secondAnchor.getPosition();

		if(Number.NUMBER.equals(pos1.getY(), pos2.getY()))
			anchor = new Anchor((pos1.getX()+pos2.getX())/2., pos1.getY());
		else
			anchor = new Anchor(pos1.getX(), (pos1.getY()+pos2.getY())/2.);

		int index = anchors.indexOf(firstAnchor);

		if(index==anchors.size()-1)
			anchors.add(anchor);
		else
			anchors.add(index+1, anchor);

		return anchor;
	}
}
