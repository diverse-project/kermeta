package org.kermeta.ki.diagram.view.interfaces;


public interface IDecorationView extends IView {
	/**
	 * @return True: if the decoration is at the source position of the relation.
	 */
	boolean isSource();

	/**
	 * Defines if the decoration is at the source or the target position of the relation.
	 * @param isSource True: if the decoration is at the source position of the relation.
	 */
	void setSource(final boolean isSource);

	/**
	 * @return The relation that contains the decoration.
	 */
	IRelationView getRelation();

	/**
	 * Sets the relation that contains the decoration.
	 * @param relation The relation that contains the decoration. Can be null to release the decoration.
	 */
	void setRelation(final IRelationView relation);

}