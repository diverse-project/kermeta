package org.eclipse.emf.emfatic.ui.outline;

import org.eclipse.emf.emfatic.core.lang.gen.ast.Annotation;
import org.eclipse.emf.emfatic.core.lang.gen.ast.KeyEqualsValue;
import org.eclipse.gymnast.runtime.core.ast.ASTNode;
import org.eclipse.gymnast.runtime.core.outline.OutlineNode;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

public class AnnotationFilter extends ViewerFilter {

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		if (element instanceof OutlineNode) {
			OutlineNode on = (OutlineNode) element;
			ASTNode an = on.getASTNode(); 
			if (isAnnOrKeyValue(an)) {
				return false; 
			}
		}
		if (parentElement instanceof OutlineNode) {
			OutlineNode pn = (OutlineNode) parentElement;
			ASTNode ap = pn.getASTNode();
			if (isAnnOrKeyValue(ap)) {
				return false; 
			}
		}
		return true;
	}

	private boolean isAnnOrKeyValue(ASTNode n) {
		boolean res = (n instanceof Annotation || n instanceof KeyEqualsValue) ; 
		return res;
	}
	
	

}
