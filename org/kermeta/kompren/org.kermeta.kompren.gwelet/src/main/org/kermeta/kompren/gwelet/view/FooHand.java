package org.kermeta.kompren.gwelet.view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

import org.kermeta.kompren.diagram.view.interfaces.IEntityView;
import org.kermeta.kompren.diagram.view.interfaces.IHandler;
import org.kermeta.kompren.diagram.view.interfaces.IModelView;
import org.kermeta.kompren.diagram.view.interfaces.IRelationView;

public class FooHand implements MouseListener, MouseMotionListener {
	protected IModelView diagram;

	protected IEntityView draggedShape;

	protected IHandler draggedHandler;

	protected double startX;

	protected double startY;

	protected List<IRelationView> visibleHandlers;



	public FooHand(final IModelView diagram) {
		super();

		visibleHandlers = new ArrayList<IRelationView>();
		this.diagram 	= diagram;
		reinit();
	}


	protected void reinit() {
		draggedShape 	= null;
		draggedHandler 	= null;
		startX 			= 0.;
		startY 			= 0.;
	}




	@Override
	public void mouseClicked(final MouseEvent e) {
		if(e.getButton()==MouseEvent.BUTTON2) {
			final double px = e.getX()/diagram.getZoom();
			final double py = e.getY()/diagram.getZoom();
			IHandler handler = null;
			IRelationView rel = null;

			for(int i=0, nbRel = diagram.getNbRelations(); i<nbRel && handler==null; i++) {
				rel = diagram.getRelationAt(i);

				if(rel.isVisible() && rel.isHandlersVisible())
					handler = rel.getHandlersAt(px, py);
			}

			if(handler!=null && rel!=null && rel.getNbSegment()>1) {
				boolean ok = rel.removePoint(handler.getPoint());

				if(ok)
					diagram.refresh();
			}
		}
	}

	@Override
	public void mouseEntered(final MouseEvent e) {
		//
	}

	@Override
	public void mouseExited(final MouseEvent e) {
		//
	}


	@Override
	public void mousePressed(final MouseEvent e) {
		if(e.getButton()==MouseEvent.BUTTON1) {
			final int nbRel = diagram.getNbRelations();
			int i;
			final double px = e.getX()/diagram.getZoom();
			final double py = e.getY()/diagram.getZoom();
			IRelationView rel;

			for(i=0; i<nbRel && draggedHandler==null; i++) {
				rel = diagram.getRelationAt(i);

				if(rel.isVisible() && rel.isHandlersVisible())
					draggedHandler = rel.getHandlersAt(px, py);
			}
//
//			if(draggedHandler==null) {
//				IEntityView entity;
//				draggedShape = null;
//				i = diagram.getNbEntities()-1;
//
//				while(draggedShape==null && i>=0) {
//					entity = diagram.getEntityAt(i);
//
//					if(entity.isVisible() && entity.getBorders().contains(px, py))
//						draggedShape = entity;
//					else
//						i--;
//				}
//
//				diagram.setSelection(draggedShape);
//				diagram.refresh();
//			}

//			if(draggedShape==null && draggedHandler==null)
			if(diagram.getSelection().isEmpty() && draggedHandler==null)
				for(i=0; i<nbRel && draggedHandler==null; i++) {
					rel = diagram.getRelationAt(i);

					if(rel.contains(px, py)) {
						rel.addPoint(new Point2D.Double(px, py));
						rel.setHandlersVisible(true);
						draggedHandler = rel.getHandlersAt(px, py);
						diagram.refresh();
					}
				}

			startX = px;
			startY = py;
		}
	}


	@Override
	public void mouseReleased(final MouseEvent e) {
		reinit();
	}


	@Override
	public void mouseDragged(final MouseEvent e) {
		final double zoom = diagram.getZoom();
		final double gapX = e.getX()/zoom - startX;
		final double gapY = e.getY()/zoom - startY;

		if(draggedHandler!=null) {
			draggedHandler.translate(gapX, gapY);

			if(draggedHandler.getPicker() instanceof IRelationView) {
				final IRelationView rel = (IRelationView) draggedHandler.getPicker();
				IEntityView entity;

				if(rel.getHandlers(-1)==draggedHandler)
					entity = rel.getEntityTar();
				else if(rel.getHandlers(0)==draggedHandler)
					entity = rel.getEntitySrc();
				else
					entity = null;

				if(entity!=null) {
					Point2D pt = entity.getClosestPoint(new Point2D.Double(e.getX()/zoom, e.getY()/zoom));

					if(pt!=null)
						draggedHandler.getPoint().setLocation(pt);
				}
			}

			diagram.updatePreferredSize();
			diagram.refresh();
		} else
			if(draggedShape!=null) {
				draggedShape.move(gapX, gapY);
				diagram.update();

				for(IRelationView relation : diagram.getRelations())
					if(relation.getEntitySrc()==draggedShape || relation.getEntityTar()==draggedShape)
						relation.update();

				diagram.updatePreferredSize();
				diagram.refresh();
			}

		startX = e.getX()/zoom;
		startY = e.getY()/zoom;
	}


	@Override
	public void mouseMoved(final MouseEvent e) {
		final double zoom = diagram.getZoom();
		final double x = e.getX()/zoom;
		final double y = e.getY()/zoom;
		boolean mustRefresh = !visibleHandlers.isEmpty();
		IRelationView relation;

		for(final IRelationView rel : visibleHandlers)
			rel.setHandlersVisible(false);

		visibleHandlers.clear();

		for(int i=0, size=diagram.getNbRelations(); i<size ; i++) {
			relation = diagram.getRelationAt(i);

			if(relation.contains(x, y)) {
				relation.setHandlersVisible(true);
				visibleHandlers.add(diagram.getRelationAt(i));
				mustRefresh = true;
			}
		}

		if(mustRefresh)
			diagram.refresh();
	}
}
