package org.kermeta.kompren.gwelet.view;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import org.kermeta.kompren.diagram.view.impl.Number;


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
				return "0..*";
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


	public RoleView(final String name, final Cardinality card, final RelationClassView view, final boolean source, final boolean isComposition) {
		super();

		this.isComposition 	= isComposition;
		this.name 			= new FloatingText(name, this);
		this.card 			= new FloatingText(card.getText(), this);
		this.view 			= view;
		this.source 		= source;

		reinitTextPositions();
	}



	protected void initNamePosition(final FloatingText text, final boolean onLeft) {
		if(text==null || text.text.length()==0)
			return ;

		double tx;
		double ty;
		final double GAP = 5.;
		Rectangle2D border = text.getBorders();
		Rectangle2D entityBorder = source ? view.getEntitySrc().getBorders() : view.getEntityTar().getBorders();
		Point2D ptRelation = source ? view.getPointSource() : view.getPointTarget();

		if(Number.NUMBER.equals(ptRelation.getX(), entityBorder.getMinX(), 4)) {
			tx = - GAP - border.getWidth();
			ty = onLeft ? - GAP : GAP + border.getHeight();
		}else if(Number.NUMBER.equals(ptRelation.getX(), entityBorder.getMaxX(), 4)) {
			tx = GAP;
			ty = onLeft ? - GAP : GAP + border.getHeight();
		}else if(Number.NUMBER.equals(ptRelation.getY(), entityBorder.getMinY(), 4)) {
			tx = onLeft ? - GAP - border.getWidth() : GAP;
			ty = - GAP;
		}else {
			tx = onLeft ? - GAP - border.getWidth() : GAP;
			ty = - GAP - border.getHeight();
		}

		text.tx = tx;
		text.ty = ty;
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


	public void reinitTextPositions() {
		initNamePosition(this.name, true);
		initNamePosition(this.card, false);
	}



	public Rectangle2D getBorders() {
		Rectangle2D border = null;

		if(card!=null)
			border = card.getBorders();

		if(name!=null)
			if(border==null)
				border = name.getBorders();
			else
				border = border.createUnion(name.getBorders());

		return border;
	}
}
