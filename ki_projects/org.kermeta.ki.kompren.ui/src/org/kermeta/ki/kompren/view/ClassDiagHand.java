package org.kermeta.ki.kompren.view;

import java.awt.event.MouseEvent;

import org.kermeta.ki.diagram.view.impl.Hand;
import org.kermeta.ki.diagram.view.interfaces.IDiagramView;
import org.kermeta.ki.diagram.view.interfaces.IRelationView;

public class ClassDiagHand extends Hand {

	protected FloatingText draggedLabel;
	
	
	
	public ClassDiagHand(final IDiagramView diagram) {
		super(diagram);
	}

	
	@Override
	protected void reinit() {
		super.reinit();
		
		if(draggedLabel!=null) {
			diagram.removeSelection();
			diagram.refresh();
		}
		
		draggedLabel = null;
	}
	
	
	
	@Override
	public void mouseDragged(final MouseEvent e) {
		if(draggedLabel!=null) {
			final double zoom = diagram.getZoom();
			final double gapX = e.getX()/zoom - startX;
			final double gapY = e.getY()/zoom - startY;
			
			draggedLabel.translate(gapX, gapY);
			diagram.updatePreferredSize();
			diagram.refresh();
			
			startX = e.getX()/zoom;
			startY = e.getY()/zoom;
		}
		else super.mouseDragged(e);
	}
	
	
	
	@Override
	public void mousePressed(final MouseEvent e) {
		super.mousePressed(e);
		
		if(draggedHandler==null) {
			int i = diagram.getNbRelations()-1;
			IRelationView rel;
			RelationClassView asso;
			final double px = e.getX()/diagram.getZoom();
			final double py = e.getY()/diagram.getZoom();
			
			while(draggedLabel==null && i>=0) {
				rel = diagram.getRelationAt(i);
				
				if(rel.isVisible() && rel instanceof RelationClassView) {
					asso = (RelationClassView)rel;
					
					if(asso.roleSrc!=null && asso.roleSrc.name.contains(px, py)) {
						draggedLabel = asso.roleSrc.name;
						startX = px;
						startY = py;
					} else if(asso.roleSrc!=null && asso.roleSrc.card.contains(px, py)) {
						draggedLabel = asso.roleSrc.card;
						startX = px;
						startY = py;
					} else if(asso.roleTar!=null && asso.roleTar.name.contains(px, py)) {
						draggedLabel = asso.roleTar.name;
						startX = px;
						startY = py;
					} else if(asso.roleTar!=null && asso.roleTar.card.contains(px, py)) {
						draggedLabel = asso.roleTar.card;
						startX = px;
						startY = py;
					}
				}
				i--;
			}
			
			if(draggedLabel!=null) {
				diagram.setSelection(draggedLabel);
				diagram.refresh();
			}
		}
	}
}
