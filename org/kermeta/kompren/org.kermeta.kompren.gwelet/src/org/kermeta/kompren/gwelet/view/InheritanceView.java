package org.kermeta.kompren.gwelet.view;

import org.kermeta.kompren.diagram.view.impl.RelationView;
import org.kermeta.kompren.diagram.view.interfaces.IEntityView;

import fr.inria.zvtm.glyphs.DPath;

/**
 * Defines a inheritance relation established between two classes.
 * @author Arnaud Blouin
 */
public class InheritanceView extends RelationView {
	protected DPath glyphPath;


	/**
	 * @see RelationView
	 */
	public InheritanceView(final IEntityView src, final IEntityView target) {
		super(src, target);

		glyphPath = new DPath();
		setTargetDecoration(new InheritanceDecorationView(this, getLastSegment(), false));
	}


	public DPath getGlyph() {
		return glyphPath;
	}
}
