package org.eclipse.emf.emfatic.ui.outline;

import org.eclipse.emf.emfatic.core.lang.gen.ast.Attribute;
import org.eclipse.gymnast.runtime.core.ast.ASTNode;
import org.eclipse.gymnast.runtime.core.outline.OutlineNode;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


public class AttrFilter extends ViewerFilter {

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		if (element instanceof OutlineNode) {
			OutlineNode on = (OutlineNode) element;
			ASTNode an = on.getASTNode();
			if (an instanceof Attribute) {
				return false;
			}
			// actually the node in the outline is the name, i.e.
			// Attribute#getName()
			if (an.getParent() != null && an.getParent() instanceof Attribute) {
				return false;
			}
		}
		return true;
	}

}
