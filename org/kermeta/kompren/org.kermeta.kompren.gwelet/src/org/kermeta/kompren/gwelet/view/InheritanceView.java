package org.kermeta.kompren.gwelet.view;

import org.kermeta.kompren.diagram.view.impl.RelationView;
import org.kermeta.kompren.diagram.view.interfaces.IEntityView;

/**
 * Defines a inheritance relation established between two classes.
 * @author Arnaud Blouin
 */
public class InheritanceView extends ZVTMRelationView {
	/**
	 * @see RelationView
	 */
	public InheritanceView(final IEntityView src, final IEntityView target) {
		super(src, target);

		setTargetDecoration(new InheritanceDecorationView(this, getLastSegment(), false));
		update();
	}
}
