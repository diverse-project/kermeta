package org.kermeta.ki.malai.examples.canvas.concPres;

import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

public class PolylineUI extends ShapeUI {

	public PolylineUI() {
		super();
	}
	
	
	@Override
	public void paint(Graphics2D g) {
		GeneralPath path = new GeneralPath();
		path.moveTo((float)points.firstElement().getX(), (float)points.firstElement().getY());
		
		for(int i=1, j=points.size(); i<j; i++)
			path.lineTo((float)points.elementAt(i).getX(), (float)points.elementAt(i).getY());
		
		g.setColor(colourFill);
		g.fill(path);
		g.setColor(colourBord);
		g.setStroke(new BasicStroke((float) thickness));
		g.draw(path);
	}
}
