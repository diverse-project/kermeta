/* $Id: KermetaBreakpointActionDelegate.java,v 1.2 2005-12-08 17:38:13 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : KermetaBreakpointActionDelegate.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 25, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.source.IVerticalRulerInfo;

// following class provided by org.eclipse.ui.workbench.texteditor extension.
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
public class KermetaBreakpointActionDelegate extends AbstractRulerActionDelegate
{
	protected IAction createAction(ITextEditor editor, IVerticalRulerInfo rulerInfo) {
		// return new MarkerRulerAction(RunnerPlugin.getDefault().getResourceBundle(), "fr.irisa.triskell.kermeta.runner.breakpointAction", editor, rulerInfo, KermetaBreakpoint.BREAKPOINT_MARKER, true);
		return new KermetaBreakpointAction(editor, rulerInfo);
	}
	
}
