/*
 * Created on 9 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.texteditor.editors;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;

import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.structure.FObject;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KermetaOutline extends ContentOutlinePage {

	protected OutlineContentProvider contentProvider;

	protected OutlineLabelProvider labelProvider;

	protected Editor editor;
	
	protected boolean _isDisposed = false;

	/**
	 * 
	 */
	public KermetaOutline(Editor editor) {
		super();
		this.editor = editor;
		contentProvider = new OutlineContentProvider();
		labelProvider = new OutlineLabelProvider();
	}
	
	public void dispose()
    {
        _isDisposed = true;
        super.dispose();
    }

	public void createControl(Composite parent) {
		super.createControl(parent);
		TreeViewer treeViewer = getTreeViewer();
		treeViewer.setContentProvider(contentProvider);
		treeViewer.setLabelProvider(labelProvider);
		treeViewer.addSelectionChangedListener(this);
		if (editor.getMcunit() != null && editor.getMcunit().rootPackage != null) {
			treeViewer.setInput(editor.getMcunit());
			treeViewer.expandToLevel(2);
		}
	}

	public void update() {
		if (_isDisposed) {
			return;
		} else {
			Display.getDefault().asyncExec(new Runnable() {

				public void run() {
					updateHelper();
				}

			});
			return;
		}
	}
	
    public void selectionChanged(SelectionChangedEvent event)
    {
        super.selectionChanged(event);
        if (editor.getMcunit()==null || editor.getMcunit().rootPackage == null) return;
        ISelection selection = event.getSelection();
        if(selection.isEmpty())
        	editor.resetHighlightRange();
        else
            try
            {
                IStructuredSelection ssel = (IStructuredSelection)selection;
                KermetaASTNode node = (KermetaASTNode)editor.getMcunit().getNodeByModelElement((FObject)ssel.getFirstElement());
                editor.setHighlightRange(node.getRangeStart()-1,0 ,true);
            }
            catch(Exception _ex)
            {
            	editor.resetHighlightRange();
            }
    }
	
	public void updateHelper() {
		 if (editor.getMcunit()==null || editor.getMcunit().rootPackage == null) return;
		if (_isDisposed)
			return;
		TreeViewer treeViewer = getTreeViewer();
		if (treeViewer != null) {
			Control control = treeViewer.getControl();
			if (control != null && !control.isDisposed()) {
				control.setRedraw(false);
				treeViewer.setInput(editor.getMcunit());
				treeViewer.expandToLevel(2);
                control.setRedraw(true);
            }
        }
    }
}