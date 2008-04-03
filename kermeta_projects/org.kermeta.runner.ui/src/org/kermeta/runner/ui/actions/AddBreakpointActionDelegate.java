

/*$Id: AddBreakpointActionDelegate.java,v 1.2 2008-04-03 13:31:38 ftanguy Exp $
* Project : org.kermeta.debugger
* File : 	AddBreakpointActionDelegate.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 14 mars 08
* Authors : paco
*/

package org.kermeta.runner.ui.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.source.IVerticalRulerInfo;
import org.eclipse.ui.texteditor.AbstractRulerActionDelegate;
import org.eclipse.ui.texteditor.ITextEditor;

/**
 * 
 * The action that will be executed when user double clicked on the editor ruler.
 * (See MarkerRulerAction in org.eclipse.ui.texteditor)
 * Eclipse plugin configuration editor creates a class that implements by default
 * an IEditorActionDelegate, but this is visibly not the right implementation to 
 * enable breakpoint adding.
 * 
 * AbstractRulerActionDelegate is better, and implements the expected IEditorActionDelegate,
 * plus the needed mouse listeners. Lovely plugin documentation.
 */
public class AddBreakpointActionDelegate extends AbstractRulerActionDelegate
{
	protected IAction createAction(ITextEditor editor, IVerticalRulerInfo rulerInfo) {
		// return new MarkerRulerAction(RunnerPlugin.getDefault().getResourceBundle(), "fr.irisa.triskell.kermeta.runner.breakpointAction", editor, rulerInfo, KermetaBreakpoint.BREAKPOINT_MARKER, true);
		return new AddBreakpointAction(editor, rulerInfo);
	}
	
}
/*public class AddBreakpointActionDelegate implements IEditorActionDelegate {

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

}*/


