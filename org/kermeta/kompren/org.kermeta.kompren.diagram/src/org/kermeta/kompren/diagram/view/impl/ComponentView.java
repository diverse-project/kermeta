package org.kermeta.kompren.diagram.view.impl;

import java.awt.Color;

import org.kermeta.kompren.diagram.view.interfaces.IComponentView;

/**
 * A component view is the abstract representation of an object.
 * @author Arnaud Blouin
 */
public abstract class ComponentView extends View implements IComponentView {
	/** The current visibility of the component. */
	protected Visibility visibility;
	
	/** The colour of the borders. */
	protected Color lineColor;
	
	
	
	/**
	 * Initialises the component.
	 */
	public ComponentView() {
		super();
		
		visibility 	= Visibility.STANDARD;
		lineColor	= Color.BLACK;
	}
	
	
	@Override
	public void onPruning(boolean isHidePolicy) {
		visibility = isHidePolicy ? Visibility.NONE : Visibility.GRAYED;
	}
	
	
	@Override
	public boolean isPruned() {
		return visibility!=Visibility.STANDARD;
	}
	
	
	
	@Override
	public boolean isVisible() {
		return visibility!=Visibility.NONE;
	}
	
	
	@Override
	public Visibility getVisibility() {
		return visibility;
	}
	
	
	@Override
	public void setVisibility(final Visibility visibility) {
		if(visibility!=null)
			this.visibility = visibility;
	}


	@Override
	public Color getLineColor() {
		return lineColor;
	}
}
