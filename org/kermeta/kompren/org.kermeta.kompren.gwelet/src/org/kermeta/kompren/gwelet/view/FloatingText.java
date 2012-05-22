package org.kermeta.kompren.gwelet.view;

import java.awt.Graphics2D;
import java.awt.font.TextLayout;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import org.kermeta.kompren.diagram.view.impl.EntityView;
import org.kermeta.kompren.diagram.view.interfaces.ISelectable;

public class FloatingText implements ISelectable {
	protected String text;

	protected RoleView role;

	protected double tx;

	protected double ty;


	public FloatingText(final String text, final RoleView role) {
		super();

		this.role = role;
		this.text = text;
		tx = 0.;
		ty = 0.;
	}



	public void paint(final Graphics2D g) {
		Point2D position = getPosition();
		g.drawString(text, (int)position.getX(), (int)position.getY());
	}



	public String getText() {
		return text;
	}


	public void setText(final String text) {
		this.text = text;
	}


	public Point2D getPosition() {
		Point2D ptRelation = role.source ? role.view.getPointSource() : role.view.getPointTarget();
		return new Point2D.Double(ptRelation.getX()+tx, ptRelation.getY()+ty);
	}


	public boolean contains(final double x, final double y) {
		if(text==null || text.length()==0)
			return false;

		return getBorders().contains(x, y);
	}



	@Override
	public Rectangle2D getBorders() {
		Point2D position = getPosition();
		final Rectangle2D rec = new TextLayout(text, role.view.getEntitySrc().getFont(), EntityView.FONT_RENDER_CONT).getBounds();
		rec.setFrame(position.getX(), position.getY()-rec.getHeight(), rec.getWidth(), rec.getHeight());

		return rec;
	}



	public void translate(final double gapx, final double gapy) {
		this.tx += gapx;
		this.ty += gapy;
	}
}
