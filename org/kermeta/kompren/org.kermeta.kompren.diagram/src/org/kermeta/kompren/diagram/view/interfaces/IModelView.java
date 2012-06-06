package org.kermeta.kompren.diagram.view.interfaces;

import java.util.List;

import org.kermeta.kompren.diagram.layout.ILayoutStrategy;
import org.malai.presentation.ConcretePresentation;
import org.malai.properties.Zoomable;
import org.malai.widget.Scrollable;

/**
 * The interface of diagram classes.
 * @author Arnaud Blouin
 */
public interface IModelView extends Scrollable, Zoomable, ConcretePresentation {
	void relayoutRelations();

	void setSelection(final Selectable object);

	void setSelection(final List<Selectable> newSelection);

	void removeSelection();

	void removeFromSelection(final Selectable object);

	List<Selectable> getSelection();

	void addToSelection(final List<IEntityView> newSelection);

	void addToSelection(final IEntityView entity);

	void focusOnEntity(final IEntityView view);

	void addRelation(final int position, final IRelationView link);

	void addEntity(final int position, final IEntityView entity);

	boolean removeRelation(final IRelationView relation);

	boolean removeEntity(final IEntityView entity);

	int getNbEntities();

	int getNbRelations();

	IEntityView getEntityAt(final int i);

	IRelationView getRelationAt(final int i);


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


	/** Updates the diagram and its components. */
	@Override
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
