package org.kermeta.ki.diagram.view.impl;

import java.awt.Graphics2D;

import org.kermeta.ki.diagram.view.interfaces.IDecorationView;
import org.kermeta.ki.diagram.view.interfaces.IRelationView;

public class DecorationView extends View implements IDecorationView {
	/** Defines if the decoration is at the source position of the relation. */
	protected boolean isSource;
	
	/** The relation that contains the decoration. */
	protected IRelationView relation;
	
	
	/**
	 * Initialises the decoration.
	 * @param relation The relation that contains the decoration.
	 * @throws IllegalArgumentException If the given relation is null.
	 */
	public DecorationView(final IRelationView relation) {
		super();
		
		if(relation==null)
			throw new IllegalArgumentException();
		
		this.relation 	= relation;
		isSource		= true;
	}

	
	@Override
	public boolean isSource() {
		return isSource;
	}

	@Override
	public void setSource(final boolean isSource) {
		this.isSource = isSource;
	}

	@Override
	public IRelationView getRelation() {
		return relation;
	}

	@Override
	public void setRelation(final IRelationView relation) {
		this.relation = relation;
	}


	@Override
	public void paint(final Graphics2D g) {
		g.setColor(relation.getLineColor());
		g.fill(path);
		g.draw(path);
	}
}
