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
	
	protected GeneralPath composition;
	
	
	public RelationView(EntityView src, EntityView target, boolean isComposition, 
			String srcRole, String targetRole, String srcCard, String targetCard) {
		super(src, target);
		
		this.isComposition = isComposition;
		composition		   = isComposition ? new GeneralPath() : null;

		if(srcRole!=null)
			endingSrc = new RoleView(srcRole, srcCard, this, true);
		
		if(targetRole!=null)
			endingTar = new RoleView(targetRole, targetCard, this, false);
	}

	
	
	
	@Override
	public void update() {
		super.update();
		
		if(pointSrc!=null && pointTar!=null) {
			final boolean recursive = entitySrc==entityTar;
			final double lineAngle = recursive ? 0. : getLineAngle();
			final double xRot;
			final double yRot;
			final double b = recursive ? entitySrc.centre.y : getB();
			final float lgth = recursive ? -LENGTH_ARROW : LENGTH_ARROW;
			
			if(equals(Math.abs(lineAngle), Math.PI/2.)) {
				xRot = -Math.sin(-lineAngle)*(pointSrc.y-b);
				yRot = Math.cos(-lineAngle)*(pointSrc.y-b)+b;
			}
			else {
				xRot = Math.cos(-lineAngle)*pointSrc.x-Math.sin(-lineAngle)*(pointSrc.y-b); 
				yRot = Math.sin(-lineAngle)*pointSrc.x+Math.cos(-lineAngle)*(pointSrc.y-b)+b;
			}
			
			if(isComposition) {
				composition.reset();
				composition.moveTo((float)xRot, (float)yRot);
				composition.lineTo((float)xRot+lgth, (float)yRot+lgth/2f);
				composition.lineTo((float)xRot+lgth*2f, (float)yRot);
				composition.lineTo((float)xRot+lgth, (float)yRot-lgth/2f);
				composition.closePath();
			}
			
			if(endingSrc!=null)
				endingSrc.update();
			
			if(endingTar!=null)
				endingTar.update();
		}
		else {
		//	System.err.println("ERR>>" + this + " " + entitySrc.name + " " + entityTar.name + " " + endingTar.name.text + " " + endingSrc.name.text);
		}
	}
	
	


	@Override
	public void paint(Graphics2D g) {
		if(isVisible()) {
			super.paint(g);
			
			final boolean recursive = entitySrc==entityTar;
			final Point2D.Double translation = recursive ? null : beginRotation(pointTar, g);
			final double lineAngle = recursive ? 0. : getLineAngle();
			final double b = recursive ? entitySrc.centre.y : getB();
			double xRot;
			double yRot;
			
			if(equals(Math.abs(lineAngle), Math.PI/2.)) {
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
			
			if(isComposition)
				g.fill(composition);
			
			if(translation!=null)
				endRotation(translation, g);
			
			if(endingSrc!=null)
				endingSrc.paint(g);
			
			if(endingTar!=null)
				endingTar.paint(g);
		}
	}
}
