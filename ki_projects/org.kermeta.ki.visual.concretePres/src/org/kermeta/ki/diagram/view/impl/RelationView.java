package org.kermeta.ki.diagram.view.impl;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

import org.kermeta.ki.diagram.view.interfaces.IDecorationView;
import org.kermeta.ki.diagram.view.interfaces.IEntityView;
import org.kermeta.ki.diagram.view.interfaces.IHandler;
import org.kermeta.ki.diagram.view.interfaces.IRelationView;
import org.kermeta.ki.diagram.view.interfaces.ISegmentView;

/**
 * A relation view can be established between two entities.
 * @author Arnaud Blouin
 */
public class RelationView extends ComponentView implements IRelationView {
	/** The source entity. */
	protected IEntityView entitySrc;
	
	/** The target entity. */
	protected IEntityView entityTar;
	
	/** The decoration located at the source position of the relation. */
	protected IDecorationView sourceDecoration;
	
	/** The decoration located at the target position of the relation. */
	protected IDecorationView targetDecoration;
	
	protected List<ISegmentView> segments;
	
	protected List<IHandler> handlers;
	
	protected boolean handlersVisible;
	
	
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
		
		handlers			= new ArrayList<IHandler>();
		segments 			= new ArrayList<ISegmentView>();
		entitySrc 			= src;
		entityTar 			= target;
		sourceDecoration 	= null;
		targetDecoration 	= null;
		handlersVisible		= false;
		updateLineColor(255);
		
		if(src==target) {
			Point2D pt1 = new Point2D.Double();
			Point2D pt2 =  new Point2D.Double();
			getRecursiveRelationPoints(pt1, pt2);
			Point2D pt3 = new Point2D.Double(pt1.getX()-100, pt1.getY());
			Point2D pt4 = new Point2D.Double(pt2.getX()-100, pt2.getY());
			
			segments.add(new SegmentView(pt1, pt3));//TODO should use addPoint instead
			segments.add(new SegmentView(pt3, pt4));
			segments.add(new SegmentView(pt4, pt2));
			handlers.add(new Handler(pt3));
			handlers.add(new Handler(pt4));
		}
		else
			segments.add(new SegmentView(new Point2D.Double(), new Point2D.Double()));
	}

	
	@Override
	public int getNbSegment() {
		return segments.size();
	}
	
	
	@Override
	public boolean isVisible() {
		return super.isVisible() && entitySrc.isVisible() && entityTar.isVisible();
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
			
			for(final ISegmentView view : segments)
				view.paint(g);
			
			paintDecoration(sourceDecoration, getFirstSegment().getPointSource(), g, getFirstSegment().getLineAngle());
			paintDecoration(targetDecoration, getLastSegment().getPointTarget(), g, getLastSegment().getLineAngle()+Math.PI);
			
			if(handlersVisible)
				for(final IHandler handler : handlers)
					handler.paint(g);
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
		final double width 	= rec.getWidth();
		final double height = rec.getHeight();
		final double x 		= rec.getX();
		final double y 		= rec.getY();
		
		Point2D pt = getIntersectionSegment(line, new Line2D.Double(x, y, x+width, y));

		if(pt!=null)
			return pt;
		
		pt = getIntersectionSegment(line, new Line2D.Double(x+width, y, x+width, y+height));
		
		if(pt!=null)
			return pt;
		
		pt = getIntersectionSegment(line, new Line2D.Double(x, y+height, x+width, y+height));
		
		if(pt!=null)
			return pt;
		
		return getIntersectionSegment(line, new Line2D.Double(x, y, x, y+height));
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
	
	
	protected void getRecursiveRelationPoints(final Point2D pt1, final Point2D pt2) {
		Rectangle2D rec  = entitySrc.getBorders();
		final double heightArrow = rec.getHeight()>20. ? 15. : rec.getHeight()/2. - 2.;
		
		pt1.setLocation(intersectionPoint(new Line2D.Double(new Point2D.Double(entitySrc.getX()-300, entitySrc.getY()-heightArrow), 
						new Point2D.Double(entitySrc.getX(), entitySrc.getY()-heightArrow)), rec));
		pt2.setLocation(intersectionPoint(new Line2D.Double(new Point2D.Double(entitySrc.getX()-300, entitySrc.getY()+heightArrow), 
						new Point2D.Double(entitySrc.getX(), entitySrc.getY()+heightArrow)), rec));
	}
	
	
	@Override
	public void update() {
		if(entitySrc!=null && entityTar!=null && entitySrc.isVisible() && entityTar.isVisible()) {
			Point2D pointSrc;
			Point2D pointTar;
			
			if(entitySrc==entityTar) {
				pointSrc = new Point2D.Double();
				pointTar = new Point2D.Double();
				getRecursiveRelationPoints(pointSrc, pointTar);
			}
			else {
				Line2D line = new Line2D.Double(entitySrc.getCentre(), entityTar.getCentre());
				pointSrc = intersectionPoint(line, entitySrc.getBorders());
				pointTar = intersectionPoint(line, entityTar.getBorders());
				
				if(pointSrc==null || pointTar==null)
					visibility = Visibility.NONE;
				else
					visibility = entitySrc.getVisibility()==Visibility.GRAYED || entityTar.getVisibility()==Visibility.GRAYED ? Visibility.GRAYED : Visibility.STANDARD;
			}
			
			if(pointSrc!=null)
				getFirstSegment().getPointSource().setLocation(pointSrc.getX(), pointSrc.getY());
			
			if(pointTar!=null)
				getLastSegment().getPointTarget().setLocation(pointTar.getX(), pointTar.getY());
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


	public static Point2D.Double[] findPoints(final Line2D line, final double x, final double y, final double distance) {
		if(line==null)
			return null;
		
		if(Number.NUMBER.equals(distance, 0.)) {
			Point2D.Double[] sol = new Point2D.Double[1];
			sol[0] 		 		 = new Point2D.Double(x,y);
			
			return sol;
		}
		
		if(Number.NUMBER.equals(line.getX1(), line.getX2())) {
			if(Number.NUMBER.equals(line.getY1(), line.getY2()))// The line is a point. So no position can be computed. 
				return null;
			
			Point2D.Double sol[] = new Point2D.Double[2];
			sol[0] = new Point2D.Double(x, y-distance);
			sol[1] = new Point2D.Double(x, y+distance);
			
			return sol;
		}
		
		final double a = (line.getY1() - line.getY2())/(line.getX1() - line.getX2());
		final double b = line.getY1() - a*line.getX1();
		double A = a*a+1., B = -2.*(x+y*a-a*b);
		double C = b*b-(2.*y*b)+y*y+x*x-(distance*distance);
		double delta = B*B-4.*A*C;

		if(delta>0.) {
			double _x1, _x2, _y1, _y2;
			Point2D.Double sol[] = new Point2D.Double[2];
			
			_x1 = (-B+Math.sqrt(delta))/(2*A);
			_x2 = (-B-Math.sqrt(delta))/(2*A);
			_y1 = a*_x1+b;
			_y2 = a*_x2+b;
			sol[0] = new Point2D.Double(_x1, _y1);
			sol[1] = new Point2D.Double(_x2, _y2);
			
			return sol;
		}
		else
			if(Number.NUMBER.equals(delta, 0.)) {
				double _x2, _y2;
				Point2D.Double sol[] = new Point2D.Double[1];
				
				_x2 = -B/2*A;
				_y2 = a*_x2+b;
				sol[0] = new Point2D.Double(_x2, _y2);
				
				return sol;
			}
			else 
				return null;
	}



	@Override
	public ISegmentView getLastSegment() {
		return segments.get(segments.size()-1);
	}



	@Override
	public ISegmentView getFirstSegment() {
		return segments.get(0);
	}



	@Override
	public ISegmentView getSegment(final int pos) {
		return segments.get(pos);
	}



	@Override
	public Point2D getPointSource() {
		return getFirstSegment().getPointSource();
	}



	@Override
	public Point2D getPointTarget() {
		return getLastSegment().getPointTarget();
	}

	
	
	private void getMinMaxValues(double[] mins, double[] maxs, double x, double y) {
		if(x<mins[0]) mins[0] = x;
		if(y<mins[1]) mins[1] = y;
		if(x>maxs[0]) maxs[0] = x;
		if(y>maxs[1]) maxs[1] = y;
	}
	
	
	@Override
	public Rectangle2D getBorders() {
		double[] mins = { Double.MIN_VALUE, Double.MIN_VALUE};
		double[] maxs = { Double.MAX_VALUE, Double.MAX_VALUE};
		
		for(final ISegmentView seg : segments) {
			getMinMaxValues(mins, maxs, seg.getPointSource().getX(), seg.getPointSource().getY());
			getMinMaxValues(mins, maxs, seg.getPointTarget().getX(), seg.getPointTarget().getY());
		}
		
		if(sourceDecoration!=null) {
			Rectangle2D rec = sourceDecoration.getPath().getBounds2D();
			getMinMaxValues(mins, maxs, rec.getMinX(), rec.getMinY());
			getMinMaxValues(mins, maxs, rec.getMaxX(), rec.getMaxY());
		}
		
		if(targetDecoration!=null) {
			Rectangle2D rec = targetDecoration.getPath().getBounds2D();
			getMinMaxValues(mins, maxs, rec.getMinX(), rec.getMinY());
			getMinMaxValues(mins, maxs, rec.getMaxX(), rec.getMaxY());
		}
		
		return new Rectangle2D.Double(mins[0], mins[1], maxs[0]-mins[0], maxs[1]-mins[1]);
	}
	

	
	@Override
	public void addPoint(final Point2D pt) {
		if(pt==null)
			return ;
		
		boolean again = true;
		int i = 0;
		final int nbSeg = segments.size();
		
		while(again && i<nbSeg)
			if(segments.get(i).contains(pt.getX(), pt.getY())) {
				Point2D oldPt;
				Point2D newPt;
				ISegmentView seg = segments.get(i);
				ISegmentView newSeg;
				
				again = false;
				oldPt = seg.getPointTarget();
				newPt = new Point2D.Double(pt.getX(), pt.getY());
				seg.replacePointTarget(newPt);
				newSeg = new SegmentView(newPt, oldPt);
				
				
				if((i+1)>=nbSeg)
					segments.add(newSeg);
				else
					segments.add(i+1, newSeg);
				
				handlers.add(new Handler(newPt));
			}
			else
				i++;
		
	}


	@Override
	public void translate(final double tx, final double ty) {
		Point2D pt;
		
		for(final ISegmentView seg : segments) {
			pt = seg.getPointTarget();
			pt.setLocation(pt.getX()+tx, pt.getY()+ty);
		}
		
		pt = getFirstSegment().getPointSource();
		pt.setLocation(pt.getX()+tx, pt.getY()+ty);
	}
	
	
	
	@Override
	public IHandler getHandlersAt(final double x, final double y) {
		IHandler handler = null;
		
		for(int i=0, size=handlers.size(); i<size && handler==null; i++)
			if(handlers.get(i).contains(x, y))
				handler = handlers.get(i);
		
		return handler;
	}
	
	
	@Override
	public boolean contains(final double x, final double y) {
		boolean contains = false;
		
		for(int i=0, size=segments.size(); i<size && !contains; i++)
			if(segments.get(i).contains(x, y))
				contains = true;
		
		return contains; 
	}
	
	
	@Override
	public boolean isHandlersVisible() {
		return handlersVisible;
	}
	
	
	@Override
	public void setHandlersVisible(final boolean visible) {
		handlersVisible = visible;
	}
}
