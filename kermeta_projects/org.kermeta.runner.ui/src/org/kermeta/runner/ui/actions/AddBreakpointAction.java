package org.kermeta.runner.ui.actions;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.ILineBreakpoint;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.text.source.IVerticalRulerInfo;
import org.eclipse.ui.texteditor.ITextEditor;
import org.kermeta.runner.launching.KConstants;
import org.kermeta.runner.model.KLineBreakpoint;

public class AddBreakpointAction extends Action {

	private IVerticalRulerInfo ruler;
	
	private ITextEditor textEditor;

	public AddBreakpointAction(ITextEditor editor, IVerticalRulerInfo r) {
		ruler = r;
		textEditor = editor;
	}
	
	@Override
	public void run() {
		try {
			IResource resource = (IResource) textEditor.getEditorInput().getAdapter(IResource.class);
			int lineNumber = ruler.getLineOfLastMouseButtonActivity();
			IBreakpoint[] breakpoints = DebugPlugin.getDefault().getBreakpointManager().getBreakpoints(KConstants.K_DEBUG_MODEL);
			for (int i = 0; i < breakpoints.length; i++) {
				IBreakpoint breakpoint = breakpoints[i];
				if (resource.equals(breakpoint.getMarker().getResource())) {
					if (((ILineBreakpoint)breakpoint).getLineNumber() == (lineNumber + 1)) {
						// remove
						breakpoint.delete();
						return;
					}
				}
			}
			// create line breakpoint (doc line numbers start at 0)
			KLineBreakpoint lineBreakpoint = new KLineBreakpoint(resource, lineNumber + 1);
			DebugPlugin.getDefault().getBreakpointManager().addBreakpoint(lineBreakpoint);
		} catch (CoreException e) {}
	}
}
