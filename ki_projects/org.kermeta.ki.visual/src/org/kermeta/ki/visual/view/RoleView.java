package org.kermeta.ki.visual.view;

import java.awt.Graphics2D;
import java.awt.font.TextLayout;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class RoleView {
	protected FloatingText name;
	
	protected FloatingText card;
	
	protected RelationView view;
	
	protected boolean source;
	
	
	public RoleView(final String name, final String card, RelationView view, boolean source) {
		super();
		
		this.name = new FloatingText(name, this);
		this.card = new FloatingText(card, this);
		this.view = view;
		this.source = source;
	}


	public String getName() {
		return name.text;
	}


	public void setName(String name) {
		this.name.setText(name);
	}


	public String getCard() {
		return card.getText();
	}


	public void setCard(String card) {
		this.card.setText(card);
	}
	
	
	
	
	public void update() {
		if((!name.autoPosition && !card.autoPosition) || name==null || card==null || name.text.length()==0 || card.text.length()==0)
			return ;
		
		Point2D.Double[] pts;
		Point2D.Double pt = source ? view.pointTar : view.pointSrc;
		double gap 		  = 10.;
		
		if(view.entitySrc==view.entityTar) {
			Rectangle2D rec1 = new TextLayout(name.text, view.entitySrc.font, EntityView.FONT_RENDER_CONT).getBounds();
			Rectangle2D rec2 = new TextLayout(card.text, view.entitySrc.font, EntityView.FONT_RENDER_CONT).getBounds();
			
			pts = new Point2D.Double[2];
			pts[0] = new Point2D.Double(pt.x - rec1.getWidth() - gap, pt.y - gap/2.);
			pts[1] = new Point2D.Double(pt.x - rec2.getWidth() - gap, pt.y + rec2.getHeight() + gap);
		}
		else {
			Line2D.Double line 		= view.getPerpendicularLine(pt);
			pts 					= LinkView.findPoints(line, pt.x, pt.y, 20.);
			
			if(pts!=null && pts.length>1) {
				double xMin	= Math.min(pts[0].x, pts[1].x);
				double yMin	= Math.min(pts[0].y, pts[1].y);
				
				if(LinkView.equals(pts[0].x, pts[1].x, 20))
					if(xMin>(view.pointSrc.x-15) && xMin>(view.pointTar.x-15)) {
						double w1 = new TextLayout(name.text, view.entitySrc.font, EntityView.FONT_RENDER_CONT).getBounds().getWidth();
						double w2 = new TextLayout(card.text, view.entitySrc.font, EntityView.FONT_RENDER_CONT).getBounds().getWidth();
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
						double h1 = new TextLayout(name.text, view.entitySrc.font, EntityView.FONT_RENDER_CONT).getBounds().getHeight();
						double h2 = new TextLayout(card.text, view.entitySrc.font, EntityView.FONT_RENDER_CONT).getBounds().getHeight();
						double maxHeight = Math.max(h1, h2);
						
						pts[0].y += maxHeight + gap;
						pts[1].y += maxHeight + gap;
					}
					else {
						pts[0].y -= gap;
						pts[1].y -= gap;
					}
				}
			}
		}//else
		
		if(name.autoPosition)
			name.position.setLocation(pts[0].x, pts[0].y);
		
		if(card.autoPosition)
			card.position.setLocation(pts[1].x, pts[1].y);
	}
	
	
	
	
	public void paint(Graphics2D g) {
		if(view.isVisible() && name!=null && card!=null && (name.text.length()>0 || card.text.length()>0)) {
			name.paint(g);
			card.paint(g);
		}
	}
}
