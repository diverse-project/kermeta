package org.kermeta.ki.kompren.view;

import org.kermeta.ki.diagram.view.impl.RelationView;
import org.kermeta.ki.diagram.view.interfaces.IEntityView;

/**
 * Defines a inheritance relation established between two classes.
 * @author Arnaud Blouin
 */
public class InheritanceView extends RelationView {
	/**
	 * @see RelationView
	 */
	public InheritanceView(final IEntityView src, final IEntityView target) {
		super(src, target);
		
		setTargetDecoration(new InheritanceDecorationView(this, getLastSegment(), false));
	}
}
