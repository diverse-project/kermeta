package org.kermeta.kompren.diagram.layout;

import org.kermeta.kompren.diagram.view.interfaces.IModelView;

public interface ILayoutStrategy {
	/**
	 * Updates the disposition of the component of the diagram.
	 */
	void updateLayout();


	/**
	 * Sets the diagram to layout.
	 * @param diagram The diagram to update.
	 */
	void setDiagram(final IModelView diagram);


	/**
	 * @return The diagram to layout.
	 */
	IModelView getDiagram();
}
