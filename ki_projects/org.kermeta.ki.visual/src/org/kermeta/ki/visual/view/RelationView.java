package org.kermeta.ki.visual.view;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;


public class RelationView extends LinkView {
	public static final int LENGTH_ARROW = 15;
	
	public static final int WIDTH_ARROW = 10;
	
	protected RoleView endingSrc;
	
	protected RoleView endingTar;

	
	
	public RelationView(EntityView src, EntityView target) {
		super(src, target);
	}



	@Override
	public void paint(Graphics2D g) {
		if(visible && entitySrc.visible && entityTar.visible) {
			super.paint(g);
			
			final Point2D.Double translation = beginRotation(pointTar, g);
			final double lineAngle = getLineAngle();
			final double xRot;
			final double yRot;
			final double b = getB();
			
			if(Math.abs(lineAngle)==(Math.PI/2.)) {
				yRot = pointTar.y;
				xRot = pointTar.x;
			}
			else {
				xRot = Math.cos(-lineAngle)*pointTar.x-Math.sin(-lineAngle)*(pointTar.y-b); 
				yRot = Math.sin(-lineAngle)*pointTar.x+Math.cos(-lineAngle)*(pointTar.y-b)+b;
			}
			
			g.setColor(getLineColor());
			g.drawLine((int)xRot, (int)yRot, (int)xRot-LENGTH_ARROW, (int)yRot-WIDTH_ARROW/2);
			g.drawLine((int)xRot, (int)yRot, (int)xRot-LENGTH_ARROW, (int)yRot+WIDTH_ARROW/2);
			
			if(translation!=null)
				endRotation(translation, g);
		}
	}
}
