package org.eclipse.emf.emfatic.ui.outline;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.TreeViewer;

public class OpFilterAction extends Action {
	private OpFilter _filter;
	private TreeViewer _treeViewer;

	public OpFilterAction(String string, int asCheckBox, OpFilter filter, TreeViewer treeViewer) {
		super(string, asCheckBox);
		_filter = filter;
		_treeViewer = treeViewer;
	}

	public void run() {
		if (isChecked()) {
			setText("Show Operations");
			setToolTipText("Show Operations");
			if (_filter == null) {
				_filter = new OpFilter();
			}
			_treeViewer.addFilter(_filter);
			// TODO avoid flicker
			_treeViewer.expandAll();
		} else {
			setText("Hide Operations");
			setToolTipText("Hide Operations");
			_treeViewer.removeFilter(_filter);
			// TODO avoid flicker
			_treeViewer.expandAll();
		}
	}

}
