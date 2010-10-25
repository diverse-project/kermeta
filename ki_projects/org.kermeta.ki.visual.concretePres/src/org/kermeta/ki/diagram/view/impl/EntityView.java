package org.kermeta.ki.diagram.view.impl;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
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
		final int nbAnchors = anchors.size();
		IAnchor anchor;
		int posClosestAnchor = 0;
		
		// Looking for the closest anchor.
		for(int i=0; i<nbAnchors; i++) {
			anchor = anchors.get(i);
			pos    = anchor.getPosition();
			dist   = pos.distance(point);
			
			if(dist<distMin) {
				distMin 	= dist;
				closestAnch = anchor;
				posClosestAnchor = i;
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
		IAnchor secondAnchor = posClosestAnchor<(nbAnchors-1) ? anchors.get(posClosestAnchor+1) : null;
		IAnchor thirdAnchor  = posClosestAnchor>0 ? anchors.get(posClosestAnchor-1) : null;
		IAnchor finalAnchor = null;
		
		if(secondAnchor==null) {
			if(thirdAnchor!=null)
				finalAnchor = thirdAnchor;
		}else 
			if(thirdAnchor==null)
				finalAnchor = secondAnchor;
			else
				finalAnchor = secondAnchor.getPosition().distance(point)<thirdAnchor.getPosition().distance(point) || 
								(secondAnchor.isFree() && !thirdAnchor.isFree()) ? secondAnchor : thirdAnchor;
		
		
		if(finalAnchor!=null)
			if(finalAnchor.isFree())
				closestAnch = finalAnchor;
			else
				closestAnch = createMiddleAnchor(closestAnch, finalAnchor);
		
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
			anchor = getClosestFreeAnchor(new Line(centre, opposite.getCentre()).intersectionPoint(path.getBounds2D()), true);
		
		if(anchor!=null) {
			Point2D pt = atEnd ? relation.getLastSegment().getPointTarget() : relation.getFirstSegment().getPointSource();
			pt.setLocation(anchor.getPosition());
			anchor.setPosition(pt);
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
	
	
	
	private boolean lookingForClosestSegment(final Point2D pt, final Point2D bestPoint1, final Point2D bestPoint2) {
		PathIterator pi 		= getBoundPath().getPathIterator(null, .1);
		final double[] coords	= new double[6];
		double minDistance 		= Double.MAX_VALUE;
		Point2D.Double pt1		= new Point2D.Double();
		Point2D.Double pt2		= new Point2D.Double();
		Point2D.Double firstPoint = new Point2D.Double();
		int typeSeg;
		boolean ok;
		double distance;
		
		if(pi.isDone() || pi.currentSegment(coords)!=PathIterator.SEG_MOVETO)
			return false;
		
		// The first point will be used for the CLOSE segment.
		firstPoint.setLocation(coords[0], coords[1]);
		pt1.setLocation(coords[0], coords[1]);
		
		while(!pi.isDone()) {
			typeSeg = pi.currentSegment(coords);
			ok = false;
			
			switch(typeSeg) {
				case PathIterator.SEG_LINETO:
					// The second point of the line is set.
					pt2.setLocation(coords[0], coords[1]);
					ok = true; // We can now compute.
					break;
				case PathIterator.SEG_MOVETO:
					// first point of the line is set.
					pt1.setLocation(coords[0], coords[1]);
					firstPoint.setLocation(coords[0], coords[1]);
					break;
				case PathIterator.SEG_CLOSE:
					// The second point of the line is set using the first point of the path.
					pt2.setLocation(firstPoint);
					ok = true;
					break;
				default:
					return false;
			}

			if(ok) { // If we have the two points of the segment.
				Line line = new Line(pt1, pt2);
				// We compute the distance between the line and its parallel line composed of pt.
				distance  = line.getDistance(line.getParallel(pt.getX(), pt.getY()));
				
				// The segment that has the smallest distance is the closest segment to the point pt.
				if(!Double.isNaN(distance) && distance<minDistance) {
					minDistance = distance;
					bestPoint1.setLocation(pt1);
					bestPoint2.setLocation(pt2);
				}
			}
			
			if(typeSeg==PathIterator.SEG_LINETO)
				pt1.setLocation(coords[0], coords[1]);
			
			pi.next();
		}
		
		return true;
	}
	
	
	
	@Override
	public Point2D getClosestPoint(final Point2D pt) {
		Point2D.Double closest;
		Point2D.Double bestPoint1 = new Point2D.Double();
		Point2D.Double bestPoint2 = new Point2D.Double();
		
		// Searching a segment of the path which is perpendicular to the pt.
		if(lookingForClosestSegment(pt, bestPoint1, bestPoint2)) {
			// If there is a closest segment.
			Line line = new Line(bestPoint1.x, bestPoint1.y, bestPoint2.x, bestPoint2.y);
			Plan plan = new Plan(line.getPerpendicularLine(bestPoint1.x, bestPoint1.y), line.getPerpendicularLine(bestPoint2.x, bestPoint2.y));

			// There is two cases: the point is into the plan composed by the segment "line". In this case the closest point is
			// The intersection point between the line "line" and its perpendicular line composed of the point pt.
			if(plan.contains(pt.getX(), pt.getY()))
				closest = line.getPerpendicularLine(pt.getX(), pt.getY()).getIntersection(line);
			else
				// Otherwise, the closest point is the one of the best points.
				closest = bestPoint1.distance(pt) < bestPoint2.distance(pt) ? bestPoint1 : bestPoint2;
		}
		else
			closest = null;
		
		return closest;
	}
}
