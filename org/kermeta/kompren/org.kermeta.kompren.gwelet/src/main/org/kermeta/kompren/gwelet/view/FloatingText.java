package org.kermeta.kompren.gwelet.view;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.font.TextLayout;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import org.kermeta.kompren.diagram.view.impl.EntityView;
import org.kermeta.kompren.diagram.view.interfaces.Selectable;
import org.malai.picking.Picker;

public class FloatingText implements Selectable {
	protected String text;

	protected RoleView role;

	protected Rectangle bound;

	protected double tx;

	protected double ty;


	public FloatingText(final String text, final RoleView role) {
		super();

		this.role = role;
		this.text = text;
		bound = new Rectangle(0, 0, -1, -1);
		tx = 0.;
		ty = 0.;
	}



	public void paint(final Graphics2D g, final Rectangle visibleScene) {
		if(bound.width<0) {
			final Rectangle2D bounds = new TextLayout(text, g.getFont(), EntityView.FONT_RENDER_CONT).getBounds();
			bound.width = (int) bounds.getWidth();
			bound.height = (int) bounds.getHeight();
		}

		Point2D position = getPosition();
		bound.x =(int) position.getX();
		bound.y =(int) position.getY()-bound.height;

		if(visibleScene==null || visibleScene.contains(bound) || visibleScene.intersects(bound)) {
			g.drawString(text, (int)position.getX(), (int)position.getY());
			g.draw(bound);
		}
	}



	public String getText() {
		return text;
	}


	public void setText(final String text) {
		this.text = text;
		bound.width = -1;
	}


	public Point2D getPosition() {
		Point2D ptRelation = role.source ? role.view.getPointSource() : role.view.getPointTarget();
		return new Point2D.Double(ptRelation.getX()+tx, ptRelation.getY()+ty);
	}


	@Override
	public boolean contains(final double x, final double y) {
		if(text==null || text.length()==0)
			return false;

		return bound.contains(x, y);
	}



	@Override
	public Rectangle2D getBorders() {
		return new Rectangle2D.Double(bound.x, bound.y, bound.width, bound.height);
	}



	@Override
	public void translate(final double gapx, final double gapy) {
		tx += gapx;
		ty += gapy;
	}



	@Override
	public Picker getPicker() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void setSelected(final boolean selected) {
		// TODO Auto-generated method stub

	}



	@Override
	public boolean isSelected() {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean isSelectable() {
		// TODO Auto-generated method stub
		return false;
	}
}
