package org.kermeta.ki.diagram.view.impl;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.List;

import org.kermeta.ki.diagram.view.interfaces.ISelectable;

public class SelectionBorder extends Rectangle2D.Double {
	private static final long serialVersionUID = 1L;
	
	protected static final BasicStroke STROKE = new BasicStroke(3f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 1f, new float[] { 5f, 5f }, 0);

	protected List<ISelectable> selection;
	
	
	public SelectionBorder(final List<ISelectable> selection) {
		super();
		
		if(selection==null)
			throw new IllegalArgumentException();
		
		this.selection = selection;
	}
	

	public boolean isActivated() {
		return !selection.isEmpty();
	}
	

	
	public void paint(final Graphics2D g) {
		g.setColor(Color.GRAY);
		g.setStroke(STROKE);
		g.draw(this);
	}
	
	
	
	public void update() {
		if(!isActivated())
			return ;
		
		double minx = java.lang.Double.MAX_VALUE;
		double maxx = java.lang.Double.MIN_VALUE;
		double miny = java.lang.Double.MAX_VALUE;
		double maxy = java.lang.Double.MIN_VALUE;
		Rectangle2D rec;
		
		for(final ISelectable sel : selection) {
			rec = sel.getBorders();
			
			if(rec.getMinX()<minx)
				minx = rec.getMinX();
			if(rec.getMinY()<miny)
				miny = rec.getMinY();
			if(rec.getMaxX()>maxx)
				maxx = rec.getMaxX();
			if(rec.getMaxY()>maxy)
				maxy = rec.getMaxY();
		}
		
		setFrame(minx, miny, maxx-minx, maxy-miny);
	}
}














