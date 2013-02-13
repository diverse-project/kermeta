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

	protected double tx;

	protected double ty;


	public FloatingText(final String text, final RoleView role) {
		super();

		this.role = role;
		this.text = text;
		tx = 0.;
		ty = 0.;
	}



	public void paint(final Graphics2D g, final Rectangle visibleScene) {
		Point2D position = getPosition();

		if(position.getX()<visibleScene.width+visibleScene.x && position.getY()<visibleScene.height+visibleScene.y)
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


	@Override
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



	@Override
	public void translate(final double gapx, final double gapy) {
		this.tx += gapx;
		this.ty += gapy;
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
