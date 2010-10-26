package org.kermeta.ki.diagram.view.interfaces;

import java.awt.Color;

public interface IComponentView extends IView {
	/** The different possible visibility of a component. */
	enum Visibility { STANDARD, NONE, GRAYED } 
	
	
	/**
	 * Actions to do when the component is pruned.
	 * @param isHidePolicy The pruning policy.
	 */
	void onPruning(final boolean isHidePolicy);
	
	/**
	 * Actions to do when the component is no more pruned.
	 */
	void onUnpruning();

	/**
	 * @return True if the component is pruned, i.e. its visibility is not standard.
	 */
	boolean isPruned();

	/**
	 * @return True if the component is visible.
	 */
	boolean isVisible();

	/**
	 * Updates the component.
	 */
	void update();
	
	
	/**
	 * Updates the colour of the lines.
	 * @param opacity The opacity The opacity to apply on the colour.
	 * @throws IllegalArgumentException If the given opacity is not into [0,255].
	 */
	void updateLineColor(final int opacity);
	
	/**
	 * @return The visibility of the component.
	 */
	Visibility getVisibility();
	
	/**
	 * Sets the visibility of the component.
	 * @param visibility The new visibility. Must not be null.
	 */
	void setVisibility(final Visibility visibility);
	
	
	/**
	 * @return The colour of the lines of the component.
	 */
	Color getLineColor();
}