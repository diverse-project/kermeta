package org.kermeta.kompren.gwelet.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.TextLayout;
import java.awt.geom.Point2D;

import org.kermeta.kompren.diagram.view.impl.ComponentView;
import org.kermeta.kompren.diagram.view.impl.EntityView;

import fr.inria.zvtm.glyphs.VText;


public abstract class ClassElementView extends ComponentView {
	/** The name of the element. */
	protected String name;

	/** The name of the type of the element. */
	protected String typeName;

	/** The position of the element. */
	protected Point2D.Double position;

	protected VText glyphText;

	/** The class that contains the element. */
	protected ClassView entity;

	private String textCache;

	private Dimension textBounds;



	public ClassElementView(final String name, final String typeName, final ClassView parent) {
		super();

		if(name==null || parent==null)
			throw new IllegalArgumentException();

		this.name 		= name;
		this.typeName 	= typeName==null ? "" : typeName;
		position  		= new Point2D.Double();
		this.entity		= parent;
		glyphText		= new VText(getFullText());
	}


	public VText getGlyphText() {
		return glyphText;
	}


	@Override
	public void onPruning(final boolean isHidePolicy) {
		setVisibility(isHidePolicy ? Visibility.NONE : Visibility.GRAYED);
	}


	@Override
	public void onUnpruning() {
		setVisibility(Visibility.STANDARD);
	}


	@Override
	public void paint(final Graphics2D g) {
		if(visibility==Visibility.STANDARD && entity.getVisibility()==Visibility.STANDARD) {
			g.setColor(entity.getLineColor());
			g.setFont(getFont());
			g.drawString(textCache, (float)position.x, (float)position.y);
		}
	}



	public double getHeight() {
		return textBounds.getHeight();
	}



	protected abstract String getFullText();



	public abstract Font getFont();



	@Override
	public void update() {
		textCache			= getFullText();
		final TextLayout tl = new TextLayout(textCache, getFont(), EntityView.FONT_RENDER_CONT);
		textBounds 			= new Dimension((int) tl.getBounds().getWidth(), (int) tl.getBounds().getHeight());
	}



	public double getWidth() {
		return textBounds.getWidth();
	}



	public void setPosition(final double x, final double y) {
		position.setLocation(x, y);
		glyphText.moveTo(x, y);
	}



	public Point2D.Double getPosition() {
		return position;
	}


	@Override
	public void updateLineColor(final int opacity) {
		lineColor = new Color(0, 0, 0, opacity);
	}
}
