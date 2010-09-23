package org.kermeta.ki.diagram.view.interfaces;

import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.Scrollable;

import org.kermeta.ki.diagram.layout.ILayoutStrategy;

/**
 * The interface of diagram classes.
 * @author Arnaud Blouin
 */
public interface IDiagramView extends Scrollable {
	/**
	 * @return The entities of the diagram.
	 */
	List<IEntityView> getEntities();
	
	/**
	 * @return The relations of the diagram.
	 */
	List<IRelationView> getRelations();
	
	/**
	 * @return The name of the font.
	 */
	String getFontName();
	
	/**
	 * Sets the name of the font to use in the diagram.
	 * @param fontName The name of the font.
	 */
	void setFontName(final String fontName);
	
	/**
	 * Adds an entity to the diagram.
	 * @param entity The entity to add.
	 */
	void addEntity(final IEntityView entity);
	
	/**
	 * Adds an relation to the diagram.
	 * @param relation The relation to add.
	 */
	void addRelation(final IRelationView relation);
	
	
	/**
	 * Refreshes the view of the diagram.
	 */
	void refresh();

	/**
	 * Updates the layout of the diagram.
	 */
	void updateLayout();

	/**
	 * @return The scrollpane of the diagram. Can be null.
	 */
	JScrollPane getScrollPane();
	
	
	/** Updates the diagram and its components. */
	void update();
	
	
	/** Updates the dimension of the diagram. */
	void updatePreferredSize();
	
	
	/** Recentre the components that compose the diagram. */
	void recentre();

	/**
	 * @return The list of entities that compose the roots of the diagram.
	 */
	List<IEntityView> getRootEntities();
	
	/**
	 * Sets a new strategy to layout the diagram.
	 * @param strategy The new strategy. Can be null.
	 */
	void setLayoutStrategy(final ILayoutStrategy strategy);
	
	
	/**
	 * @return The layout strategy. Can be null.
	 */
	ILayoutStrategy getLayoutStrategy();
}
