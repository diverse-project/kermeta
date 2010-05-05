package org.kermeta.ki.visual.view;

import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;


public class RelationView extends LinkView {
	public static final int LENGTH_ARROW = 15;
	
	public static final int WIDTH_ARROW = 10;
	
	protected RoleView endingSrc;
	
	protected RoleView endingTar;

	protected GeneralPath composition;
	
	
	public RelationView(EntityView src, EntityView target, boolean isComposition, boolean compositionAtStart,
			String srcRole, String targetRole, String srcCard, String targetCard) {
		super(src, target);
		
		
		composition = isComposition ? new GeneralPath() : null;

		if(srcRole!=null)
			endingSrc = new RoleView(srcRole, srcCard, this, true, isComposition && compositionAtStart);
		
		if(targetRole!=null)
			endingTar = new RoleView(targetRole, targetCard, this, false, isComposition && !compositionAtStart);
	}

	
	
	public boolean isComposition() {
		return (endingSrc!=null && endingSrc.isComposition) || (endingTar!=null && endingTar.isComposition);
	}
	
	
	
	@Override
	public void update() {
		super.update();
		
		if(pointSrc!=null && pointTar!=null) {
			if(isComposition()) {
				final boolean recursive = entitySrc==entityTar;
				final double lineAngle = recursive ? 0. : getLineAngle();
				final double xRot;
				final double yRot;
				final double b = recursive ? entitySrc.centre.y : getB();
				final float lgth = recursive || !endingSrc.isComposition ? -LENGTH_ARROW : LENGTH_ARROW;
				final Point2D.Double pt = endingSrc.isComposition ? pointSrc : pointTar;
				
				if(equals(Math.abs(lineAngle), Math.PI/2.))
					if(endingSrc.isComposition) {
						xRot = -Math.sin(-lineAngle)*(pointSrc.y-b);
						yRot = Math.cos(-lineAngle)*(pointSrc.y-b)+b;
					}
					else {
						yRot = pointTar.y;
						xRot = pointTar.x;
					}
				else {
					xRot = Math.cos(-lineAngle)*pt.x-Math.sin(-lineAngle)*(pt.y-b); 
					yRot = Math.sin(-lineAngle)*pt.x+Math.cos(-lineAngle)*(pt.y-b)+b;
				}
				
				if(composition==null)
					composition = new GeneralPath();
				
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
			
			if(!endingSrc.exists() || !endingTar.exists()) {
				g.drawLine((int)xRot, (int)yRot, (int)xRot-LENGTH_ARROW, (int)yRot-WIDTH_ARROW/2);
				g.drawLine((int)xRot, (int)yRot, (int)xRot-LENGTH_ARROW, (int)yRot+WIDTH_ARROW/2);
			}
			
			if(isComposition())
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
