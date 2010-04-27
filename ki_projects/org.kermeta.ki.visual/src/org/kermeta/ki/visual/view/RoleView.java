package org.kermeta.ki.visual.view;

import java.awt.Graphics2D;
import java.awt.font.TextLayout;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class RoleView {
	protected String name;
	
	protected String card;
	
	protected RelationView view;
	
	protected boolean source;
	
	
	public RoleView(final String name, final String card, RelationView view, boolean source) {
		super();
		
		this.name = name;
		this.card = card;
		this.view = view;
		this.source = source;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCard() {
		return card;
	}


	public void setCard(String card) {
		this.card = card;
	}
	
	
	
	
	public void paint(Graphics2D g) {
		if(view.isVisible() && name!=null && card!=null && (name.length()>0 || card.length()>0)) {
			Point2D.Double pt 		= source ? view.pointTar : view.pointSrc;
			Line2D.Double line 		= view.getPerpendicularLine(pt);
			Point2D.Double[] pts 	= LinkView.findPoints(line, pt.x, pt.y, 20.);
			
			if(pts!=null && pts.length>1) {
				double xMin	= Math.min(pts[0].x, pts[1].x);
				double yMin	= Math.min(pts[0].y, pts[1].y);
				double gap = 10.;
				
				if(LinkView.equals(pts[0].x, pts[1].x, 20))
					if(xMin>(view.pointSrc.x-15) && xMin>(view.pointTar.x-15)) {
						double w1 = new TextLayout(name, view.entitySrc.font, EntityView.FONT_RENDER_CONT).getBounds().getWidth();
						double w2 = new TextLayout(card, view.entitySrc.font, EntityView.FONT_RENDER_CONT).getBounds().getWidth();
						double maxWidth = Math.max(w1, w2);
						
						pts[0].x -= maxWidth + gap;
						pts[1].x -= maxWidth + gap;
					}
					else {
						pts[0].x += gap;
						pts[1].x += gap;
					}
				
				if(LinkView.equals(pts[0].y, pts[1].y, 20)) {
					pts[0].x -= gap;
					pts[1].x -= gap;
					
					if(yMin<(view.pointSrc.y+15) && yMin<(view.pointTar.y+15)) {
						double h1 = new TextLayout(name, view.entitySrc.font, EntityView.FONT_RENDER_CONT).getBounds().getHeight();
						double h2 = new TextLayout(card, view.entitySrc.font, EntityView.FONT_RENDER_CONT).getBounds().getHeight();
						double maxHeight = Math.max(h1, h2);
						
						pts[0].y += maxHeight + gap;
						pts[1].y += maxHeight + gap;
					}
					else {
						pts[0].y -= gap;
						pts[1].y -= gap;
					}
				}
				
				
				g.drawString(name, (int)pts[0].x, (int)pts[0].y);
				g.drawString(card, (int)pts[1].x, (int)pts[1].y);
			}
		}
	}
}
