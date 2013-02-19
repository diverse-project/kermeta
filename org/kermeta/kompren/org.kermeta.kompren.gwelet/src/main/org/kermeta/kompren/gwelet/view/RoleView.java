package org.kermeta.kompren.gwelet.view;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import org.malai.picking.Pickable;
import org.malai.picking.Picker;


public class RoleView implements Pickable {
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

	protected Cardinality card;

	protected FloatingText cardText;

	protected RelationClassView view;

	protected boolean isComposition;

	protected boolean source;


	public RoleView(final String name, final Cardinality card, final RelationClassView view, final boolean source, final boolean isComposition) {
		super();

		this.isComposition 	= isComposition;
		this.name 			= new FloatingText(name, this);
		this.card			= card;
		this.cardText 		= new FloatingText(card.getText(), this);
		this.view 			= view;
		this.source 		= source;

		reinitTextPositions();
	}


	public boolean equalsValue(final RoleView rv) {
		if(rv==null) return false;
		return card==rv.getCardinality() && name.getText().equals(rv.getName());
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

		if(org.kermeta.kompren.diagram.view.impl.Number.NUMBER.equals(ptRelation.getX(), entityBorder.getMinX(), 4)) {
			tx = - GAP - border.getWidth();
			ty = onLeft ? - GAP : GAP + border.getHeight();
		}else if(org.kermeta.kompren.diagram.view.impl.Number.NUMBER.equals(ptRelation.getX(), entityBorder.getMaxX(), 4)) {
			tx = GAP;
			ty = onLeft ? - GAP : GAP + border.getHeight();
		}else if(org.kermeta.kompren.diagram.view.impl.Number.NUMBER.equals(ptRelation.getY(), entityBorder.getMinY(), 4)) {
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


	public Cardinality getCardinality() {
		return card;
	}


	public String getCardText() {
		return cardText.getText();
	}


	public void setCardText(final String card) {
		this.cardText.setText(card);
	}



	public void paint(final Graphics2D g, final Rectangle visibleScene) {
		if(view.isVisible() && name!=null && cardText!=null && (name.text.length()>0 || cardText.text.length()>0)) {
			g.setFont(view.getEntitySrc().getFont());
			name.paint(g, visibleScene);
			cardText.paint(g, visibleScene);
		}
	}


	public boolean exists() {
		return name.text!=null && name.text.length()>0;
	}


	public void reinitTextPositions() {
		initNamePosition(this.name, true);
		initNamePosition(this.cardText, false);
	}



	public Rectangle2D getBorders() {
		Rectangle2D border = null;

		if(cardText!=null)
			border = cardText.getBorders();

		if(name!=null)
			if(border==null)
				border = name.getBorders();
			else
				border = border.createUnion(name.getBorders());

		return border;
	}


	public FloatingText getFloatingTextAt(final double x, final double y) {
		if(cardText!=null && cardText.contains(x, y)) return cardText;
		if(name!=null && name.contains(x, y)) return name;
		return null;
	}


	@Override
	public boolean contains(final double x, final double y) {
		return cardText!=null && cardText.contains(x, y) || name!=null && name.contains(x, y);
	}


	@Override
	public Picker getPicker() {
		return null;
	}
}
