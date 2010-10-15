package org.kermeta.ki.diagram.view.impl;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.AbstractButton;

import org.kermeta.ki.diagram.view.interfaces.IDiagramView;
import org.kermeta.ki.diagram.view.interfaces.IEntityView;
import org.kermeta.ki.diagram.view.interfaces.IRelationView;

public class Hand implements MouseListener, MouseMotionListener {

	protected AbstractButton handB;
	
	protected IDiagramView diagram;
	
	public IEntityView draggedShape;
//	public FloatingText draggedLabel;
	public double startX;
	public double startY;
	
	
	public Hand(final IDiagramView diagram) {
		super();
		
		if(diagram==null)
			throw new IllegalArgumentException();
		
		this.diagram = diagram;
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
	public void mouseClicked(MouseEvent e) {
		//
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
		if(handB.isSelected()) {
			
//			draggedLabel = null;
			int i = diagram.getNbRelations()-1;
//			IRelationView link;
			final double px = e.getX()/diagram.getZoom();
			final double py = e.getY()/diagram.getZoom();
			
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
				
//			if(draggedLabel==null) {
				IEntityView entity;
				draggedShape = null;
				i = diagram.getNbEntities()-1;
				
				while(draggedShape==null && i>=0) {
					entity = diagram.getEntityAt(i);
					
					if(entity.isVisible() && entity.getBorders().contains(px, py)) {
						draggedShape = entity;
						startX = px;
						startY = py;
					}
					else
						i--;
				}
				
				diagram.setSelection(draggedShape);
				diagram.refresh();
//			}
//			else {
//				draggedLabel.setManualPosition(px, py);
//			}
		}
	}

	
	@Override
	public void mouseReleased(MouseEvent e) {
		draggedShape = null;
//		draggedLabel = null;
		startX = 0.;
		startY = 0.;
	}


	@Override
	public void mouseDragged(final MouseEvent e) {
		final double zoom = diagram.getZoom();
		final double gapX = e.getX()/zoom - startX;
		final double gapY = e.getY()/zoom - startY;
		
//		if(draggedLabel!=null) {
//			draggedLabel.setPosition(draggedLabel.getPosition().x + gapX, draggedLabel.getPosition().y + gapY);
//			startX = e.getX()/zoom;
//			startY = e.getY()/zoom;
//			
//			repaint();
//		} else
			if(draggedShape!=null) {
				draggedShape.setCentre((int)(draggedShape.getCentre().x + gapX), (int)(draggedShape.getCentre().y + gapY));
				startX = e.getX()/zoom;
				startY = e.getY()/zoom;
				
				draggedShape.update();
				
				for(IRelationView relation : diagram.getRelations())
					if(relation.getEntitySrc()==draggedShape || relation.getEntityTar()==draggedShape)
						relation.update();
					
				diagram.updatePreferredSize();
				diagram.refresh();
			}
	}


	@Override
	public void mouseMoved(MouseEvent e) {
		//
	}
}
