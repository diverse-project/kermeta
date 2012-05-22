package org.kermeta.ki.diagram.view.interfaces;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.geom.Point2D;
import java.util.List;

public interface IEntityView extends IComponentView, ISelectable {
	/** The colour to use when an entity is grayed. */
	public static Color GRAYED_COLOR = new Color(210, 210, 210, 180);
	
	/**
	 * Anchors the given relation to the calling entity. A free is searched on the entity. 
	 * If no anchor is free, one is created. One of the two relation extremities is linked to the found
	 * anchor which will be no more free.<br>
	 * If the centre of the two entities are at the same position, the relation will not be anchor and an exception
	 * will be thrown. 
	 * @param relation The relation to anchor.
	 * @param opposite The opposite entity to link to the relation.
	 * @param atEnd True: the entity will be anchored to the source point of the relation. Otherwise to its target point.
	 * @exception IllegalArgumentException If the centre of the two entities are at the same position.
	 */
	void anchorRelation(final IRelationView relation, final IEntityView opposite, final boolean atEnd);
	
	
	IAnchor getClosestFreeAnchor(final Point2D point, final boolean create);
	
	/**
	 * Moves the entity to the given centre.
	 * @param x The X-coordinate of the new centre of the entity.
	 * @param y The Y-coordinate of the new centre of the entity.
	 */
	void move(final double x, final double y);
	
	void translate(final double tx, final double ty);

	
	Point2D getClosestPoint(final Point2D pt);
	
	/**
	 * @param x The X-coordinate of the point to test.
	 * @param y The Y-coordinate of the point to test.
	 * @return True if the given point is located into the entity.
	 */
	boolean contains(final double x, final double y);

	/**
	 * @return The centre of the entity.
	 */
	Point2D getCentre();

	/**
	 * @return The colour of the filling of the entity.
	 */
	Color getFillingColor();

	/**
	 * Sets the colour of the filling of the entity.
	 * @param fillingColor The new filling colour. Must not be null.
	 */
	void setFillingColor(final Color fillingColor);

	
	/**
	 * @return The name of the entity. Cannot be null.
	 */
	String getName();
	
	
	/**
	 * Sets the name of the entity.
	 * @param name The new name of the entity. If null no modification is performed.
	 */
	void setName(final String name);
	
	
	/** 
	 * Sets the scale to apply on the shape but does NOT update it.
	 * @param scale The new scale.
	 */
	void setScale(final double scale);

	/**
	 * @return The X-coordinate of the centre of the entity.
	 */
	double getX();

	/**
	 * @return The Y-coordinate of the centre of the entity.
	 */
	double getY();

	/**
	 * @return The width of the entity.
	 */
	double getWidth();

	/**
	 * @return The height of the entity.
	 */
	double getHeight();

	
	/**
	 * @return The dimensions of the entity.
	 */
	Dimension getPreferredSize();
	
	
	/**
	 * Updates the colour of the filling of the entity.
	 * @param opacity The opacity The opacity to apply on the colour.
	 */
	void updateFillingColor(final int opacity);
	
	
	/**
	 * Sets the name of the font to use in the entity.
	 * @param fontName The name of the font.
	 */
	void setFontName(final String fontName);
	
	
	/**
	 * @return The name of the font.
	 */
	String getFontName();
	
	
	/**
	 * Sets the size of the font.
	 * @param fontSize The new size of the font. Must be greater than 0.
	 */
	void setFontSize(final double fontSize);
	
	/**
	 * @return The size of the font.
	 */
	double getFontSize();
	
	
	/**
	 * Sets the style of the font.
	 * @param fontStyle The new style of the font.
	 */
	void setFontStyle(final int fontStyle);
	
	
	/**
	 * @return The style of the font.
	 */
	int getFontStyle();
	
	
	/** 
	 * The font used by the entity.
	 */
	Font getFont();

	
	List<IAnchor> getAnchors();
}