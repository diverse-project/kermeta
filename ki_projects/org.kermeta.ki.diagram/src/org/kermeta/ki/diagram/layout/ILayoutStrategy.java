package org.kermeta.ki.diagram.layout;

import org.kermeta.ki.diagram.view.interfaces.IDiagramView;

public interface ILayoutStrategy {
	/** 
	 * Updates the disposition of the component of the diagram.
	 */
	void updateLayout();
	
	
	/**
	 * Sets the diagram to layout.
	 * @param diagram The diagram to update.
	 */
	void setDiagram(final IDiagramView diagram);
	
	
	/**
	 * @return The diagram to layout.
	 */
	IDiagramView getDiagram();
}
