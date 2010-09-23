package org.kermeta.ki.diagram.view.impl;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import org.kermeta.ki.diagram.view.interfaces.IDecorationView;
import org.kermeta.ki.diagram.view.interfaces.IEntityView;
import org.kermeta.ki.diagram.view.interfaces.IRelationView;

/**
 * A relation view can be established between two entities.
 * @author Arnaud Blouin
 */
public class RelationView extends ComponentView implements IRelationView {
	/** The source entity. */
	protected IEntityView entitySrc;
	
	/** The target entity. */
	protected IEntityView entityTar;
	
	/** The position of the first point of the relation. */
	protected Point2D pointSrc;
	
	/** The position of the last point of the relation. */
	protected Point2D pointTar;
	
	/** The decoration located at the source position of the relation. */
	protected IDecorationView sourceDecoration;
	
	/** The decoration located at the target position of the relation. */
	protected IDecorationView targetDecoration; 
	
	
	/**
	 * Creates and initialises a relation established between two entities.
	 * @param src The sources entity.
	 * @param target The target entity.
	 * @throws IllegalArgumentException If one of the given entity is null.
	 */
	public RelationView(final IEntityView src, final IEntityView target) {
		super();
		
		if(src==null || target==null)
			throw new IllegalArgumentException();
		
		entitySrc = src;
		entityTar = target;
		sourceDecoration = null;
		targetDecoration = null;
		updateLineColor(255);
	}

	
	
	@Override
	public boolean isVisible() {
		return super.isVisible() && pointSrc!=null && pointTar!=null && entitySrc.isVisible() && entityTar.isVisible();
	}
	
	@Override
	public IEntityView getEntitySrc() {
		return entitySrc;
	}

	@Override
	public IEntityView getEntityTar() {
		return entityTar;
	}
	
	
	
	@Override
	public void paint(final Graphics2D g) {
		if(isVisible()) {
			g.setColor(getLineColor());
			g.draw(path);
			
			paintDecoration(sourceDecoration, pointSrc, g, getLineAngle());
			paintDecoration(targetDecoration, pointTar, g, getLineAngle()+Math.PI);
		}
	}
	
	
	
	protected void paintDecoration(final IDecorationView decoration, final Point2D position, final Graphics2D g, final double lineAngle) {
		if(decoration!=null) {
			g.translate(position.getX(), position.getY());
			boolean okRotation = beginRotation(position, g, lineAngle)!=null;
			
			decoration.paint(g);
			
			if(okRotation)
				endRotation(g, lineAngle);
			
			g.translate(-position.getX(), -position.getY());
		}
	}
	
	
	
	@Override
	public void updateLineColor(final int opacity) {
		lineColor = entitySrc.getVisibility()==Visibility.GRAYED || entityTar.getVisibility()==Visibility.GRAYED ? 
					IEntityView.GRAYED_COLOR : new Color(0, 0, 0, opacity);
	}
	
	
	@Override
	public boolean isWestDirection() {
		return pointSrc.getX()>pointTar.getX();
	}
	

	@Override
	public boolean isNorthDirection() {
		return pointSrc.getY()<pointTar.getY();
	}
	
	
	@Override
	public double getLineAngle() {
		if(pointSrc.getY()==pointTar.getY())
			return isWestDirection() ? Math.PI : 0.;
		
		if(pointSrc.getX()==pointTar.getX())
			return isNorthDirection() ? Math.PI/2. : -Math.PI/2.;

		return isWestDirection() ? Math.atan(getA())+Math.PI : Math.atan(getA());
	}
	
	
	@Override
	public double getA() {
		if(isVerticalLine())
			return Double.NaN;

		return (pointSrc.getY() - pointTar.getY())/(pointSrc.getX() - pointTar.getX());
	}

	
	
	@Override
	public double getB() {
		return pointSrc.getY() - getA() * pointSrc.getX();
	}
	
	
	
	@Override
	public boolean isVerticalLine() {
		if(pointSrc==null || pointTar==null)
			return false;
		
		return Number.NUMBER.equals(pointSrc.getX(), pointTar.getX());
	}
	
	
	
	@Override
	public boolean isHorizontalLine() {
		if(pointSrc==null || pointTar==null)
			return false;
		
		return Number.NUMBER.equals(pointSrc.getY(), pointTar.getY());
	}
	
	
	
	
	protected static Point2D beginRotation(final Point2D position, final Graphics2D g, final double angle) {
		Point2D p = null;

		if(!Number.NUMBER.equals(angle, 0.) && !Double.isInfinite(angle) && !Double.isNaN(angle)) {
			final double cx = position.getX(), cy = position.getY();
			final double c2x = Math.cos(angle) * cx - Math.sin(angle)* cy;
			final double c2y = Math.sin(angle) * cx + Math.cos(angle)* cy;
			final double c3x = Math.cos(-angle) * (cx - c2x)- Math.sin(-angle) * (cy - c2y);
			final double c3y = Math.sin(-angle) * (cx - c2x)+ Math.cos(-angle) * (cy - c2y);

			g.rotate(angle);
			p = new Point2D.Double(c3x, c3y);
		}

		return p;
	}
	
	
	
	protected static void endRotation(final Graphics2D g, final double angle) {
		if(!Number.NUMBER.equals(angle, 0.) && !Double.isInfinite(angle) && !Double.isNaN(angle))
			g.rotate(-angle);
	}

	
	
	
	public static Point2D intersectionPoint(final Line2D line, final Rectangle2D rec) {
		Point2D pt = getIntersectionSegment(line, new Line2D.Double(rec.getX(), rec.getY(), rec.getX()+rec.getWidth(), rec.getY()));

		if(pt!=null)
			return pt;
		
		pt = getIntersectionSegment(line, 
				new Line2D.Double(rec.getX()+rec.getWidth(), rec.getY(), rec.getX()+rec.getWidth(), rec.getY()+rec.getHeight()));
		
		if(pt!=null)
			return pt;
		
		pt = getIntersectionSegment(line, 
				new Line2D.Double(rec.getX()+rec.getWidth(), rec.getY()+rec.getHeight(), rec.getX(), rec.getY()+rec.getHeight()));
		
		if(pt!=null)
			return pt;
		
		pt = getIntersectionSegment(line, 
				new Line2D.Double(rec.getX(), rec.getY()+rec.getHeight(), rec.getX(), rec.getY()));
		
		if(pt!=null)
			return pt;
		
		return pt;
	}
	
	
	public static Point2D getIntersection(final Line2D l1, final Line2D l2) {
		double a1 = (l1.getY1() -l1.getY2())/(l1.getX1() - l1.getX2());
		double a2 = (l2.getY1() -l2.getY2())/(l2.getX1() - l2.getX2());
		double b1 = (l1.getY1() - a1 * l1.getX1());
		double b2 = (l2.getY1() - a2 * l2.getX1());
		boolean verticalLine1 = l1.getX1()==l1.getX2();
		boolean verticalLine2 = l2.getX1()==l2.getX2();
		boolean horizLine1 = l1.getY1()==l1.getY2();
		boolean horizLine2 = l2.getY1()==l2.getY2();
		double x;
		double y;
		
		if(verticalLine2) {
			if(verticalLine1)// The two lines a parallels
				return null;
			
			if(horizLine2)// Points of the line l are equal.
				return null;
			
			if(horizLine1) {
				x = l2.getX1();
				y = l1.getY1();
			}else {
				y = a1*l2.getX1()+b1;
				x = (y-b1)/a1;
			}
		}else {
			double la = a2;
			double lb = a2;
			
			if(verticalLine1) {
				if(horizLine2) {
					x = l1.getX1();
					y = l2.getY1();
				} else {
					y = la*l1.getX1()+lb;
					x = (y-lb)/la;
				}
			}else {//TODO backport to the latexdraw trunk + add test
				if(horizLine1) {
					if(horizLine2)
						return null;
					
					x = (b1-b2)/a2;
					y = l1.getY1();
				} else
					if(horizLine2) {
						x = (b2-b1)/a1;
						y = l2.getY1();
					}else {
						x = (b1-lb)/(la-a1);
						y = a1*x+b1;
					}
			}
		}
		
		return new Point2D.Double(x, y);
	}
	
	
	

	public static Point2D getIntersectionSegment(Line2D l1, Line2D l2) {
		Point2D p = getIntersection(l1, l2);

		if(p==null) 
			return null;

		double px   = p.getX();
		double py   = p.getY();
		double tlx1 = l1.getX1()<l1.getX2() ? l1.getX1() : l1.getX2();
		double brx1 = l1.getX1()>l1.getX2() ? l1.getX1() : l1.getX2();
		double tlx2 = l2.getX1()<l2.getX2() ? l2.getX1() : l2.getX2();
		double brx2 = l2.getX1()>l2.getX2() ? l2.getX1() : l2.getX2();
		double tly1 = l1.getY1()<l1.getY2() ? l1.getY1() : l1.getY2();
		double bry1 = l1.getY1()>l1.getY2() ? l1.getY1() : l1.getY2();
		double tly2 = l2.getY1()<l2.getY2() ? l2.getY1() : l2.getY2();
		double bry2 = l2.getY1()>l2.getY2() ? l2.getY1() : l2.getY2();
		
		if(((px>tlx1 || Number.NUMBER.equals(px, tlx1)) && (px<brx1 || Number.NUMBER.equals(px, brx1)) && 
			(py>tly1 || Number.NUMBER.equals(py, tly1)) && (py<bry1 || Number.NUMBER.equals(py, bry1))) &&
		   ((px>tlx2 || Number.NUMBER.equals(px, tlx2)) && (px<brx2 || Number.NUMBER.equals(px, brx2)) && 
			(py>tly2 || Number.NUMBER.equals(py, tly2)) && (py<bry2 || Number.NUMBER.equals(py, bry2))))
			return p;
		
		return null;
	}
	
	
	
	@Override
	public void update() {
		if(entitySrc!=null && entityTar!=null) {
			if(entitySrc==entityTar) {
				Rectangle2D rec  = entitySrc.getBorders();
				final float gap = 60f;
				final double heightArrow = rec.getHeight()>20 ? 10 : rec.getHeight()/2. - 2.;
				
				pointSrc = intersectionPoint(new Line2D.Double(new Point2D.Double(entitySrc.getX()-300, entitySrc.getY()-heightArrow), new Point2D.Double(entitySrc.getX(), entitySrc.getY()-heightArrow)), rec);
				pointTar = intersectionPoint(new Line2D.Double(new Point2D.Double(entitySrc.getX()-300, entitySrc.getY()+heightArrow), new Point2D.Double(entitySrc.getX(), entitySrc.getY()+heightArrow)), rec);
				
				path.reset();
				path.moveTo((float)pointSrc.getX(), (float)pointSrc.getY());
				path.lineTo((float)pointSrc.getX()-gap, (float)pointSrc.getY());
				path.lineTo((float)pointSrc.getX()-gap, (float)pointTar.getY());
				path.lineTo((float)pointTar.getX(), (float)pointTar.getY());
			}
			else {
				Line2D line = new Line2D.Double(entitySrc.getCentre(), entityTar.getCentre());
				pointSrc    = intersectionPoint(line, entitySrc.getBorders());
				pointTar    = intersectionPoint(line, entityTar.getBorders());
				
				if(pointSrc==null || pointTar==null)
					visibility = Visibility.NONE;
				else {
					path.reset();
					path.moveTo((float)pointSrc.getX(), (float)pointSrc.getY());
					path.lineTo((float)pointTar.getX(), (float)pointTar.getY());
//					if(visibility==Visibility.STANDARD)
					visibility = entitySrc.getVisibility()==Visibility.GRAYED || entityTar.getVisibility()==Visibility.GRAYED ? Visibility.GRAYED : Visibility.STANDARD;
				}
			}
		}
	}



	@Override
	public void onUnpruning() {
		updateLineColor(255);
	}


	@Override
	public IDecorationView getSourceDecoration() {
		return sourceDecoration;
	}


	@Override
	public void setSourceDecoration(final IDecorationView sourceDecoration) {
		setDecoration(this.sourceDecoration, sourceDecoration);
		this.sourceDecoration = sourceDecoration;
	}
	
	
	
	protected void setDecoration(final IDecorationView oldDecoration, final IDecorationView newDecoration) {
		if(oldDecoration!=null)// Releasing the decoration.
			oldDecoration.setRelation(null);
		
		if(newDecoration!=null) // Anchoring the new decoration.
			newDecoration.setRelation(this);
	}

	
	@Override
	public IDecorationView getTargetDecoration() {
		return targetDecoration;
	}


	@Override
	public void setTargetDecoration(final IDecorationView targetDecoration) {
		setDecoration(this.targetDecoration, targetDecoration);
		this.targetDecoration = targetDecoration;
	}
}
