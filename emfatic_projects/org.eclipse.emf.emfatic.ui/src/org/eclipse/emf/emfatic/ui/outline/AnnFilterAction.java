package org.eclipse.emf.emfatic.ui.outline;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.TreeViewer;

public class AnnFilterAction extends Action {
	private AnnotationFilter _filter;
	private TreeViewer _treeViewer;

	public AnnFilterAction(String string, int asCheckBox, AnnotationFilter annFilter, TreeViewer treeViewer) {
		super(string, asCheckBox);
		_filter = annFilter;
		_treeViewer = treeViewer;
	}

	public void run() {
		if (isChecked()) {
			setText("Show Annotations");
			setToolTipText("Show Annotations");
			if (_filter == null) {
				_filter = new AnnotationFilter();
			}
			_treeViewer.addFilter(_filter);
			// TODO avoid flicker
			_treeViewer.expandAll();
		} else {
			setText("Hide Annotations");
			setToolTipText("Hide Annotations");
			_treeViewer.removeFilter(_filter);
			// TODO avoid flicker
			_treeViewer.expandAll();
		}
	}

}
