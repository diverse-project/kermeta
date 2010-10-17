package org.kermeta.ki.diagram.view.impl;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractButton;

import org.kermeta.ki.diagram.view.interfaces.IDiagramView;
import org.kermeta.ki.diagram.view.interfaces.IEntityView;
import org.kermeta.ki.diagram.view.interfaces.IHandler;
import org.kermeta.ki.diagram.view.interfaces.IRelationView;

public class Hand implements MouseListener, MouseMotionListener {

	protected AbstractButton handB;
	
	protected IDiagramView diagram;
	
	protected IEntityView draggedShape;
	
	protected IHandler draggedHandler;
	
//	protected FloatingText draggedLabel;
	protected double startX;
	protected double startY;
	
	protected List<IRelationView> visibleHandlers;
	
	
	public Hand(final IDiagramView diagram) {
		super();
		
		if(diagram==null)
			throw new IllegalArgumentException();
		
		visibleHandlers = new ArrayList<IRelationView>();
		this.diagram 	= diagram;
		reinit();
	}
	
	
	protected void reinit() {
		draggedShape 	= null;
		draggedHandler 	= null;
//		draggedLabel 	= null;
		startX 			= 0.;
		startY 			= 0.;
	}
	
	
	public boolean isActivated() {
		return handB.isSelected();
	}
	
	
	public void setHandButton(final AbstractButton hand) {
		this.handB = hand;
	}
	
	
	public AbstractButton getHandButton() {
		return handB;
	}
	
	
	@Override
	public void mouseClicked(final MouseEvent e) {
		if(e.getButton()==MouseEvent.BUTTON3) {
			final double px = e.getX()/diagram.getZoom();
			final double py = e.getY()/diagram.getZoom();
			IHandler handler = null;
			IRelationView rel = null;
			
			for(int i=0, nbRel = diagram.getNbRelations(); i<nbRel && handler==null; i++) {
				rel = diagram.getRelationAt(i);
				
				if(rel.isVisible() && rel.isHandlersVisible())
					handler = rel.getHandlersAt(px, py);
			}
			
			if(handler!=null && rel!=null) {
				boolean ok = rel.removePoint(handler.getPoint());
				
				if(ok)
					diagram.refresh();
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//
	}

	
	@Override
	public void mousePressed(final MouseEvent e) {
		if(handB.isSelected() && e.getButton()==MouseEvent.BUTTON1) {
//			draggedLabel = null;
			final int nbRel = diagram.getNbRelations();
			int i;
//			IRelationView link;
			final double px = e.getX()/diagram.getZoom();
			final double py = e.getY()/diagram.getZoom();
			IRelationView rel;
			
			for(i=0; i<nbRel && draggedHandler==null; i++) {
				rel = diagram.getRelationAt(i);
				
				if(rel.isVisible() && rel.isHandlersVisible())
					draggedHandler = rel.getHandlersAt(px, py);
			}
			
//			i = nbRel-1;
//			while(draggedLabel==null && i>=0) {
//				link = diagram.getRelationAt(i);
//				
//				if(link.isVisible()) {
////					rel.update();
//					if(link.endingSrc.name.contains(px, py)) {
//						draggedLabel = rel.endingSrc.name;
//						startX = px;
//						startY = py;
//					} else if(rel.endingSrc.card.contains(px, py)) {
//						draggedLabel = rel.endingSrc.card;
//						startX = px;
//						startY = py;
//					} else if(rel.endingTar.name.contains(px, py)) {
//						draggedLabel = rel.endingTar.name;
//						startX = px;
//						startY = py;
//					} else if(rel.endingTar.card.contains(px, py)) {
//						draggedLabel = rel.endingTar.card;
//						startX = px;
//						startY = py;
//					}
//				}
//				i--;
//			}
				
			if(draggedHandler==null) {//draggedLabel==null) {
				IEntityView entity;
				draggedShape = null;
				i = diagram.getNbEntities()-1;
				
				while(draggedShape==null && i>=0) {
					entity = diagram.getEntityAt(i);
					
					if(entity.isVisible() && entity.getBorders().contains(px, py))
						draggedShape = entity;
					else
						i--;
				}
				
				diagram.setSelection(draggedShape);
				diagram.refresh();
			}
//			else {
//				draggedLabel.setManualPosition(px, py);
//			}
			
			
			if(draggedShape==null && draggedHandler==null)
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
			diagram.updatePreferredSize();
			diagram.refresh();
//		if(draggedLabel!=null) {
//			draggedLabel.setPosition(draggedLabel.getPosition().x + gapX, draggedLabel.getPosition().y + gapY);
		} else
			if(draggedShape!=null) {
				diagram.translateEntity(draggedShape, gapX, gapY);
				draggedShape.update();
				
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
			
			if(relation.getNbSegment()>1 && relation.contains(x, y)) {
				relation.setHandlersVisible(true);
				visibleHandlers.add(diagram.getRelationAt(i));
				mustRefresh = true;
			}
		}
		
		if(mustRefresh)
			diagram.refresh();
	}
}
