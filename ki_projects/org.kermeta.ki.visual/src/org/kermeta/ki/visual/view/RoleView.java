package org.kermeta.ki.visual.view;

import java.awt.Graphics2D;
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
		if(view.isVisible()) {
			Point2D.Double pt = source ? view.pointSrc : view.pointTar;
			Line2D.Double line = view.getPerpendicularLine(pt);
			Point2D.Double[] pts =  LinkView.findPoints(line, pt.x, pt.y, 20.);
			
			if(pts!=null && pts.length>1) {
				g.drawString(name, (int)pts[0].x, (int)pts[0].y);
				g.drawString(card, (int)pts[1].x, (int)pts[1].y);
			}
		}
	}
}
