package org.kermeta.ki.malai.examples.canvas.concPres;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class SelectionBorder extends Rectangle2D.Double {
	public static final BasicStroke STROKE = new BasicStroke(2f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 1.f, new float[] { 2f, 1f }, 0);

	protected boolean visible;
	
	
	public SelectionBorder() {
		super();
		
		visible = false;
	}
	
	
	public void paint(Graphics2D g) {
		if(visible) {
			g.setStroke(STROKE);
			g.setColor(Color.GRAY);
			g.draw(this);
		}
	}


	public boolean isVisible() {
		return visible;
	}


	public void setVisible(boolean visible) {
		this.visible = visible;
	}
}
