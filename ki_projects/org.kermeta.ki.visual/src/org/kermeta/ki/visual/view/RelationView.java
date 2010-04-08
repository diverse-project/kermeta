package org.kermeta.ki.visual.view;

import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;


public class RelationView extends LinkView {
	public static final int LENGTH_ARROW = 15;
	
	public static final int WIDTH_ARROW = 10;
	
	protected RoleView endingSrc;
	
	protected RoleView endingTar;

	protected boolean isComposition;
	
	
	public RelationView(EntityView src, EntityView target, boolean isComposition) {
		super(src, target);
		
		this.isComposition = isComposition;
	}



	@Override
	public void paint(Graphics2D g) {
		if(isVisible()) {
			super.paint(g);
			
			final Point2D.Double translation = beginRotation(pointTar, g);
			final double lineAngle = getLineAngle();
			final double b = getB();
			double xRot;
			double yRot;
			
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
			
			if(isComposition) {
				GeneralPath compoPath = new GeneralPath();
				
				if(Math.abs(lineAngle)==(Math.PI/2.)) {
					xRot = pointSrc.x;
					yRot = pointSrc.y;
				}
				else {
					xRot = Math.cos(-lineAngle)*pointSrc.x-Math.sin(-lineAngle)*(pointSrc.y-b); 
					yRot = Math.sin(-lineAngle)*pointSrc.x+Math.cos(-lineAngle)*(pointSrc.y-b)+b;
				}
				
				compoPath.moveTo((float)xRot, (float)yRot);
				compoPath.lineTo((float)xRot+LENGTH_ARROW, (float)yRot+WIDTH_ARROW/2f);
				compoPath.lineTo((float)xRot+LENGTH_ARROW*2f, (float)yRot);
				compoPath.lineTo((float)xRot+LENGTH_ARROW, (float)yRot-WIDTH_ARROW/2f);
				compoPath.closePath();
				
				g.fill(compoPath);
			}
			
			if(translation!=null)
				endRotation(translation, g);
		}
	}
}
