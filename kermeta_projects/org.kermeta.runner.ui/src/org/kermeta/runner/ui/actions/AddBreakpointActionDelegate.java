

/*$Id: AddBreakpointActionDelegate.java,v 1.1 2008-04-01 15:10:55 ftanguy Exp $
* Project : org.kermeta.debugger
* File : 	AddBreakpointActionDelegate.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 14 mars 08
* Authors : paco
*/

package org.kermeta.runner.ui.actions;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.ui.actions.IToggleBreakpointsTarget;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.texteditor.ITextEditor;
import org.kermeta.runner.ui.model.KLineBreakpointAdapter;

public class AddBreakpointActionDelegate implements IEditorActionDelegate {

	private IEditorPart _targetEditor;

	private ISelection _selection;
	
	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		_targetEditor = targetEditor;
	}

	public void run(IAction action) {
		if ( _selection != null ) {
			try {
				ITextEditor editor = (ITextEditor) _targetEditor;
				KLineBreakpointAdapter adapter = (KLineBreakpointAdapter) _targetEditor.getAdapter( IToggleBreakpointsTarget.class );
				adapter.toggleLineBreakpoints(editor, _selection);
			} catch (CoreException e) {
				e.printStackTrace();
			} finally {
				_selection = null;
			}
		}
	}

	public void selectionChanged(IAction action, ISelection selection) {
		if ( selection instanceof TextSelection )
			_selection = selection;
	}

}


