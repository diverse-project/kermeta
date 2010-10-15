package org.kermeta.ki.diagram.view.impl;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import org.kermeta.ki.diagram.view.interfaces.IEntityView;

/**
 * An entity view is a component view that represents an entity to be used into a entity-relation diagram.
 * @author Arnaud Blouin
 */
public abstract class EntityView extends ComponentView implements IEntityView {
	public static final int DEFAUT_OPACITY = 200;
	
	/** The colour of the filling. */
	protected Color fillingColor;
	
	/** The scale applied on the entity. Differs from the zoom: the scale is usually used to emphasise the entity. */
	protected double scale;
	
	/** The centre of the entity. */
	protected Point2D.Double centre;
	
	/** The name of the font used by the class. */
	protected String fontName;
	
	/** The size of the font. */
	protected double fontSize;
	
	/** The style of the font. */
	protected int fontStyle;
	
	
	
	/**
	 * Initialises the entity.
	 */
	public EntityView() {
		super();
		
		centre		= new Point2D.Double();
		fontName 	= "Arial";
		fontSize	= 14.;
		fontStyle	= Font.PLAIN;
		updateFillingColor(DEFAUT_OPACITY);
		updateLineColor(255);
		setScale(1.);
	}
	
	
	
	@Override
	public boolean contains(final double x, final double y) {
		return isVisible() && getBorders().contains(x, y);
	}
	
	
	
	@Override
	public Rectangle2D getBorders() {
		final Dimension dim = getPreferredSize();
		return new Rectangle2D.Double(centre.x-dim.width/2., centre.y-dim.height/2, dim.width, dim.height);
	}
	
	
	
	@Override
	public Point2D.Double getCentre() {
		return centre;
	}


	@Override
	public void setCentre(final Point2D newCentre) {
		if(newCentre!=null)
			centre.setLocation(newCentre.getX(), newCentre.getY());
	}
	
	
	@Override
	public Color getFillingColor() {
		return fillingColor;
	}



	@Override
	public void setFillingColor(final Color fillingColor) {
		if(fillingColor!=null)
			this.fillingColor = fillingColor;
	}
	
	
	
	@Override
	public void setScale(final double scale) {
		if(scale>0.)
			this.scale = scale;
	}
	
	
	@Override
	public void setX(final int x) {
		centre.x = x;
	}
	
	
	@Override
	public void setY(final int y) {
		centre.y = y;
	}

	
	@Override
	public void setCentre(final int x, final int y) {
		setX(x);
		setY(y);
	}
	
	
	@Override
	public double getX() {
		return centre.x;
	}
	
	@Override
	public double getY() {
		return centre.y;
	}
	
	
	@Override
	public double getWidth() {
		return getBorders().getWidth();
	}
	
	
	@Override
	public double getHeight() {
		return getBorders().getHeight();
	}
	
	
	
	@Override
	public void onPruning(final boolean isHidePolicy) {
		super.onPruning(isHidePolicy);
		
		if(!isHidePolicy) {
			fillingColor = GRAYED_COLOR;
			lineColor    = GRAYED_COLOR;
			setScale(0.6);
			update();
		}
	}
	
	
	@Override
	public void onUnpruning() {
		visibility = Visibility.STANDARD;
		setScale(1.);
		updateLineColor(255);
		updateFillingColor(DEFAUT_OPACITY);
		update();
	}
	
	
	@Override
	public void setFontName(final String fontName) {
		if(fontName!=null)
			this.fontName = fontName;
	}


	@Override
	public String getFontName() {
		return fontName;
	}
	
	
	@Override
	public void setFontSize(double fontSize) {
		if(fontSize>0.)
			this.fontSize = fontSize;
	}


	@Override
	public double getFontSize() {
		return fontSize;
	}
	
	
	@Override
	public void setFontStyle(int fontStyle) {
		this.fontStyle = fontStyle;
	}
	
	
	@Override
	public int getFontStyle() {
		return fontStyle;
	}
	
	
	@Override
	public Font getFont() {
		return new Font(fontName, fontStyle, (int)fontSize);
	}
}
