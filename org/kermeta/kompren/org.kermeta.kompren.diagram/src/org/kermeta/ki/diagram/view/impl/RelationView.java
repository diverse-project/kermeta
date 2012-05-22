package org.kermeta.ki.diagram.view.impl;

import java.awt.Color;
import java.awt.Graphics2D;
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
		
		Point2D pt1 = new Point2D.Double();
		Point2D pt2 =  new Point2D.Double();
		
		handlers.add(new Handler(pt1, this));
		handlers.add(new Handler(pt2, this));
		
		if(src==target) {
			getRecursiveRelationPoints(pt1, pt2);
			Point2D pt3 = new Point2D.Double(pt1.getX()-100, pt1.getY());
			Point2D pt4 = new Point2D.Double(pt2.getX()-100, pt2.getY());
			segments.add(new SegmentView(pt1, pt3));
			segments.add(new SegmentView(pt3, pt4));
			segments.add(new SegmentView(pt4, pt2));
			handlers.add(1, new Handler(pt3, this));
			handlers.add(2, new Handler(pt4, this));
		}
		else
			segments.add(new SegmentView(pt1, pt2));
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

			if(sourceDecoration!=null)
				sourceDecoration.paint(g);
			
			if(targetDecoration!=null)
				targetDecoration.paint(g);
			
			if(handlersVisible)
				for(final IHandler handler : handlers)
					handler.paint(g);
		}
	}
	
	
	@Override
	public void updateLineColor(final int opacity) {
		lineColor = entitySrc.getVisibility()==Visibility.GRAYED || entityTar.getVisibility()==Visibility.GRAYED ? 
					IEntityView.GRAYED_COLOR : new Color(0, 0, 0, opacity);
	}
	
	
	protected void getRecursiveRelationPoints(final Point2D pt1, final Point2D pt2) {//FIXME only works with rectangle entities. Code clean-up.
		final Rectangle2D rec  = entitySrc.getBorders();
		final double heightArrow = rec.getHeight()>20. ? 15. : rec.getHeight()/2. - 2.;
		final Line l1 = new Line(new Point2D.Double(entitySrc.getX()-300, entitySrc.getY()-heightArrow), 
							new Point2D.Double(entitySrc.getX(), entitySrc.getY()-heightArrow));
		final Line l2 = new Line(new Point2D.Double(entitySrc.getX()-300, entitySrc.getY()+heightArrow), 
							new Point2D.Double(entitySrc.getX(), entitySrc.getY()+heightArrow));
		
		pt1.setLocation(l1.intersectionPoint(entitySrc.getPath(), new Point2D.Double(entitySrc.getX()-300, entitySrc.getY()-heightArrow)));
		pt2.setLocation(l2.intersectionPoint(entitySrc.getPath(), new Point2D.Double(entitySrc.getX()-300, entitySrc.getY()+heightArrow)));
//		final Rectangle2D rec  = entitySrc.getBorders();
//		final double heightArrow = rec.getHeight()>20. ? 15. : rec.getHeight()/2. - 2.;
//		final Line l1 = new Line(new Point2D.Double(entitySrc.getX()-300, entitySrc.getY()-heightArrow), 
//							new Point2D.Double(entitySrc.getX(), entitySrc.getY()-heightArrow));
//		final Line l2 = new Line(new Point2D.Double(entitySrc.getX()-300, entitySrc.getY()+heightArrow), 
//							new Point2D.Double(entitySrc.getX(), entitySrc.getY()+heightArrow));
//		
//		pt1.setLocation(l1.intersectionPoint(rec));
//		pt2.setLocation(l2.intersectionPoint(rec));
	}
	
	
	@Override
	public void update() {
		// Nothing to do.
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

	
	
	private static void getMinMaxValues(double[] mins, double[] maxs, double x, double y) {
		if(x<mins[0]) mins[0] = x;
		if(y<mins[1]) mins[1] = y;
		if(x>maxs[0]) maxs[0] = x;
		if(y>maxs[1]) maxs[1] = y;
	}
	
	
	@Override
	public Rectangle2D getBorders() {
		double[] mins = {Double.MIN_VALUE, Double.MIN_VALUE};
		double[] maxs = {Double.MAX_VALUE, Double.MAX_VALUE};
		
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
	public boolean removePoint(final Point2D pt) {
		boolean possible = entitySrc!=entityTar || handlers.size()>1;
		boolean again = true;
		
		if(possible) {
			for(int i=0, size=handlers.size(); i<size && again; i++)// Removing the handlers if possible. 
				if(handlers.get(i).getPoint().equals(pt)) {
					handlers.remove(i);
					again = false;
				}
			
			if(!again) {// We found the point.
				// Removing the segment.
				ISegmentView seg;
				again = true;
				
				for(int i=0, size=segments.size(); i<size && again; i++) {
					seg = segments.get(i);
					
					if(seg.getPointTarget().equals(pt)) {
						again = false;
						segments.remove(i);
						segments.get(i).replacePointSource(seg.getPointSource());
					}
				}
			}
		}
		
		return possible && !again;
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
				
				// Updating the target decoration that may use the modified segment.
				if(targetDecoration!=null && targetDecoration.getSegment()==seg)
					targetDecoration.setSegment(newSeg);
				
				if((i+1)>=nbSeg)
					segments.add(newSeg);
				else
					segments.add(i+1, newSeg);
				
				handlers.add(i+1, new Handler(newPt, this));
			}
			else
				i++;
	}


	@Override
	public void translate(final double tx, final double ty) {
		Point2D pt;
		
		// We go to segments.size-1 because the last point is the position of an anchor.
		for(int i=0, size=segments.size()-1; i<size; i++) {
			pt = segments.get(i).getPointTarget();
			pt.setLocation(pt.getX()+tx, pt.getY()+ty);
		}
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

		if(!contains && sourceDecoration!=null)
			contains = sourceDecoration.contains(x, y);
		
		if(!contains && targetDecoration!=null)
			contains = targetDecoration.contains(x, y);
		
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


	@Override
	public IHandler getHandlers(final int position) {
		IHandler handler;
		
		if((position>=0 && position<handlers.size()) || position==-1)
			handler = handlers.get(position==-1 ? handlers.size()-1 : position);
		else 
			handler = null;
		
		return handler;
	}
	
	
	@Override
	public String toString() {
		return getClass().getCanonicalName() + '[' + entitySrc + ',' + entityTar + ']';
	}
}
