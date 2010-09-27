package org.kermeta.ki.kompren.view;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.TextLayout;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import org.kermeta.ki.diagram.view.impl.Number;
import org.kermeta.ki.diagram.view.impl.RelationView;
import org.kermeta.ki.diagram.view.interfaces.IEntityView;


public class RoleView {
	public static enum Cardinality{
		ZERO_ONE {
			@Override
			public String getText() {
				return "0..1";
			}
		},
		ONE {
			@Override
			public String getText() {
				return "1";
			}
		},
		ZERO_MULTI {
			@Override
			public String getText() {
				return "*";
			}
		},
		ONE_MULTI {
			@Override
			public String getText() {
				return "1..*";
			}
		};
		
		public abstract String getText();
		
		
		public static Cardinality getCardinality(final String card) {
			if(ONE.getText().equals(card))
				return ONE;
			if(ONE_MULTI.getText().equals(card))
				return ONE_MULTI;
			if(ZERO_MULTI.getText().equals(card))
				return ZERO_MULTI;
			if(ZERO_ONE.getText().equals(card))
				return ZERO_ONE;
			return null;
		}
	}
	
	
	protected FloatingText name;
	
	protected FloatingText card;
	
	protected RelationClassView view;
	
	protected boolean isComposition;
	
	protected boolean source;
	
	
	public RoleView(final String name, final Cardinality card, RelationClassView view, boolean source, boolean isComposition) {
		super();
		
		this.isComposition 	= isComposition;
		this.name 			= new FloatingText(name, this);
		this.card 			= new FloatingText(card.getText(), this);
		this.view 			= view;
		this.source 		= source;
	}


	public String getName() {
		return name.text;
	}


	public void setName(final String name) {
		this.name.setText(name);
	}


	public String getCard() {
		return card.getText();
	}


	public void setCard(final String card) {
		this.card.setText(card);
	}
	
	
	
	
	public void update() {
		if((!name.autoPosition && !card.autoPosition) || name==null || card==null || name.text.length()==0 || card.text.length()==0)
			return ;
		
		Point2D[] pts;
		Point2D pointTar= view.getPointTarget();
		Point2D pointSrc= view.getPointSource();
		Point2D pt 		= source ? pointSrc : pointTar;
		double gap 		= 10.;
		IEntityView entitySrc = view.getEntitySrc();
		IEntityView entityTar = view.getEntityTar();
		Font font 		= entitySrc.getFont(); 
		
		if(entitySrc==entityTar) {
			Rectangle2D rec1 = new TextLayout(name.text, font, ClassView.FONT_RENDER_CONT).getBounds();
			Rectangle2D rec2 = new TextLayout(card.text, font, ClassView.FONT_RENDER_CONT).getBounds();
			
			pts = new Point2D.Double[2];
			pts[0] = new Point2D.Double(pt.getX() - rec1.getWidth() - gap, pt.getY() - gap/2.);
			pts[1] = new Point2D.Double(pt.getX() - rec2.getWidth() - gap, pt.getY() + rec2.getHeight() + gap);
		}
		else {
			Line2D line	= view.getPerpendicularLine(pt);
			pts 		= RelationView.findPoints(line, pt.getX(), pt.getY(), 20.);
			
			if(pts!=null && pts.length>1) {
				double xMin	= Math.min(pts[0].getX(), pts[1].getX());
				double yMin	= Math.min(pts[0].getY(), pts[1].getY());
				
				if(Number.NUMBER.equals(pts[0].getX(), pts[1].getX(), 20))
					if(xMin>(pointSrc.getX()-15) && xMin>(pointTar.getX()-15)) {
						double w1 = new TextLayout(name.text, font, ClassView.FONT_RENDER_CONT).getBounds().getWidth();
						double w2 = new TextLayout(card.text, font, ClassView.FONT_RENDER_CONT).getBounds().getWidth();
						double maxWidth = Math.max(w1, w2);
						
						pts[0].setLocation(pts[0].getX() - maxWidth + gap, pts[0].getY());
						pts[1].setLocation(pts[1].getX() - maxWidth + gap, pts[0].getY());
					}
					else {
						pts[0].setLocation(pts[1].getX() + gap, pts[0].getY());
						pts[1].setLocation(pts[1].getX() + gap, pts[0].getY());
					}
				
				if(Number.NUMBER.equals(pts[0].getY(), pts[1].getY(), 20)) {
					pts[0].setLocation(pts[1].getX() - gap, pts[0].getY());
					pts[1].setLocation(pts[1].getX() - gap, pts[0].getY());
					
					if(yMin<(pointSrc.getY()+15) && yMin<(pointTar.getY()+15)) {
						double h1 = new TextLayout(name.text, font, ClassView.FONT_RENDER_CONT).getBounds().getHeight();
						double h2 = new TextLayout(card.text, font, ClassView.FONT_RENDER_CONT).getBounds().getHeight();
						double maxHeight = Math.max(h1, h2);
						
						pts[0].setLocation(pts[0].getX(), pts[0].getY() + maxHeight + gap);
						pts[1].setLocation(pts[1].getX(), pts[0].getY() +  maxHeight + gap);
					}
					else {
						pts[0].setLocation(pts[0].getX(), pts[0].getY() - gap);
						pts[1].setLocation(pts[1].getX(), pts[1].getY() - gap);
					}
				}
			}
		}//else
		
		if(name.autoPosition && pts!=null)
			name.position.setLocation(pts[0].getX(), pts[0].getY());
		
		if(card.autoPosition && pts!=null)
			card.position.setLocation(pts[1].getX(), pts[1].getY());
	}
	
	
	
	
	public void paint(final Graphics2D g) {
		if(view.isVisible() && name!=null && card!=null && (name.text.length()>0 || card.text.length()>0)) {
			g.setFont(view.getEntitySrc().getFont());
			name.paint(g);
			card.paint(g);
		}
	}


	public boolean exists() {
		return name.text!=null && name.text.length()>0;
	}
}
