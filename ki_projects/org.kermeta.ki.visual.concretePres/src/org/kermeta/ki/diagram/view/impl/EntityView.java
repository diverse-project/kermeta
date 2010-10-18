package org.kermeta.ki.diagram.view.impl;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

import org.kermeta.ki.diagram.view.interfaces.IAnchor;
import org.kermeta.ki.diagram.view.interfaces.IEntityView;
import org.kermeta.ki.diagram.view.interfaces.IRelationView;

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
	
	protected List<IAnchor> anchors;
	
	
	
	
	/**
	 * Initialises the entity.
	 */
	public EntityView() {
		super();
		
		anchors		= new ArrayList<IAnchor>();
		centre		= new Point2D.Double();
		fontName 	= "Arial";
		fontSize	= 14.;
		fontStyle	= Font.PLAIN;
		updateFillingColor(DEFAUT_OPACITY);
		updateLineColor(255);
		setScale(1.);
	}
	
	
	protected abstract void initAnchors();
	
	
	protected abstract IAnchor createMiddleAnchor(final IAnchor closestAnch, final IAnchor secondAnchor);
	
	
	
	@Override
	public IAnchor getClosestFreeAnchor(final Point2D point, final boolean create) {
		if(point==null)
			return null;
		
		IAnchor closestAnch	= null;
		double distMin		= Double.MAX_VALUE;
		Point2D pos;
		double dist;
		
		// Looking for the closest anchor.
		for(final IAnchor anchor : anchors) {
			pos  = anchor.getPosition();
			dist = pos.distance(point);
			
			if(dist<distMin) {
				distMin 	= dist;
				closestAnch = anchor;
			}
		}
		
		// If there is no anchor or if it is not free and we must not create a free anchor.
		if(closestAnch==null || (!closestAnch.isFree() && !create))
			return null;
		
		if(closestAnch.isFree())
			return closestAnch;
		
		// Cannot create an anchor if we do not have two anchors.
		if(anchors.size()<2)
			return null;
		
		// Creating a new free anchor.
		IAnchor secondAnchor = null;
		distMin = Double.MAX_VALUE;
		for(final IAnchor anchor : anchors)
			if(anchor!=closestAnch) {
				pos  = anchor.getPosition();
				dist = pos.distance(point);
				
				if(dist<distMin) {
					distMin 	 = dist;
					secondAnchor = anchor;
				}
			}
		
		// The new anchor is created at the middle of its two closest anchors.
		if(secondAnchor!=null)
			if(secondAnchor.isFree())
				closestAnch = secondAnchor;
			else
				closestAnch = createMiddleAnchor(closestAnch, secondAnchor);
		
		return closestAnch;
	}
	

	@Override
	public void anchorRelation(final IRelationView relation, final IEntityView opposite, final boolean atEnd) {
		IAnchor anchor;
		
		if(opposite==this) {
			Point2D pt = anchors.get(0).getPosition();
			anchor = getClosestFreeAnchor(new Point2D.Double(pt.getX(), pt.getY()), true);
		}
		else
			anchor = getClosestFreeAnchor(RelationView.intersectionPoint(new Line2D.Double(centre, opposite.getCentre()), path.getBounds2D()), true);
		
		if(anchor!=null) {
			if(atEnd)
				relation.getLastSegment().replacePointTarget(anchor.getPosition());
			else
				relation.getFirstSegment().replacePointSource(anchor.getPosition());
			
			anchor.setFree(false);
		}
	}
	
	
	@Override
	public void move(final double x, final double y) {
		translate(x-centre.getX(), y-centre.getY());
	}
	
	
	@Override
	public void translate(final double tx, final double ty) {
		centre.setLocation(centre.getX()+tx, centre.getY()+ty);
		path.transform(AffineTransform.getTranslateInstance(tx, ty));
		
		for(final IAnchor anchor : anchors)
			anchor.translate(tx, ty);
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
