package org.kermeta.ki.visual.view;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;

public class InheritanceView extends LinkView {
	public static final int LENGTH_ARROW = 15;
	
	public static final int WIDTH_ARROW = 10;
	
	
	protected GeneralPath arrowHead;
	
	
	public InheritanceView(EntityView src, EntityView target) {
		super(src, target);
	}
	
	
	
	@Override
	protected void initialise() {
		super.initialise();
		
		arrowHead = new GeneralPath();
	}

	
	
	@Override
	public void update() {
		super.update();
		
		if(pointSrc!=null && pointTar!=null) {
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
			
			arrowHead.reset();
			arrowHead.moveTo((float)xRot, (float)yRot);
			arrowHead.lineTo((float)xRot-LENGTH_ARROW, (float)yRot-WIDTH_ARROW/2f);
			arrowHead.lineTo((float)xRot-LENGTH_ARROW, (float)yRot+WIDTH_ARROW/2f);
			arrowHead.closePath();
		}
	}
	
	
	
	@Override
	public void paint(Graphics2D g) {
		if(visible && entitySrc.visible && entityTar.visible) {
			super.paint(g);
			
			final Point2D.Double translation = beginRotation(pointTar, g);
			
			g.setColor(Color.WHITE);
			g.fill(arrowHead);
			g.setColor(getLineColor());
			g.draw(arrowHead);
			
			if(translation!=null)
				endRotation(translation, g);
		}
	}
}
