package org.kermeta.ki.diagram.view.interfaces;

import java.util.List;

/**
 * The interface of diagram classes.
 * @author Arnaud Blouin
 */
public interface IDiagramView {
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
}
