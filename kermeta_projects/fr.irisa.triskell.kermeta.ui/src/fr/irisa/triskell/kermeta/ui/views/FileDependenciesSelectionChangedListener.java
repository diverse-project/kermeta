package fr.irisa.triskell.kermeta.ui.views;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeSelection;

import fr.irisa.triskell.kermeta.ui.FileDependencyTreeItem;

public class FileDependenciesSelectionChangedListener implements
		ISelectionChangedListener {

	private FileDependenciesViewPart view;

	public FileDependenciesSelectionChangedListener(FileDependenciesViewPart view) {
		this.view = view;
	}
	
	public void selectionChanged(SelectionChangedEvent event) {
		TreeSelection selection = (TreeSelection) event.getSelection();
		FileDependencyTreeItem item = (FileDependencyTreeItem) selection.getFirstElement();
		
		if ( item != null ) {
			item.calculateChildren();
			view.treeViewer.refresh(item, false);
			view.treeViewer.expandToLevel(item, 1);	
		}
	}

}
