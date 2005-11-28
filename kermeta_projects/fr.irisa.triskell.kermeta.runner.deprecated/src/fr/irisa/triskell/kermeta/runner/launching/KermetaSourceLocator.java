/* $Id: KermetaSourceLocator.java,v 1.12 2005-11-28 18:54:35 zdrey Exp $
 * Project: Kermeta.runner
 * File: KermetaSourceLocator.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 24, 2005
 * Authors: zdrey
 */
package fr.irisa.triskell.kermeta.runner.launching;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.IPersistableSourceLocator;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.ui.ISourcePresentation;
import org.eclipse.ui.IEditorInput;

import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaStackFrame;
import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;

/**
 * Eclipse doc reminders : 
 * 	- ISourcePresentation : a source presentation is used to resolve an editor in 
 *    which to display a debug model element, breakpoint, or source element. It is also
 *    responsible to link the debug mode commands to the editor
 *  - IPersistableSourceLocator : the main interface 
 *  Note : I don't know why, the launchConfiguration crashes if we implement 
 *  ISourceLocator instead of IPersistableSourceLocator whereas many other plug-ins use
 *  it..
 */
public class KermetaSourceLocator implements IPersistableSourceLocator, ISourcePresentation {

    public KermetaSourceLocator()
    {
        super();
        System.err.println("A new source locator was created");
    }
    
    /**
     * @see org.eclipse.debug.core.model.IPersistableSourceLocator#getMemento()
     */
    public String getMemento() throws CoreException {
        // TODO Auto-generated method stub
        return null;
    }
    
    /**
     * @see org.eclipse.debug.core.model.IPersistableSourceLocator#initializeFromMemento(java.lang.String)
     */
    public void initializeFromMemento(String memento) throws CoreException {
        // TODO Auto-generated method stub
    	RunnerPlugin.pluginLog.error("TODO : implement initializeFromMemento("+memento+")");
    	System.err.println("TODO : implement initializeFromMemento("+memento+")");
    }

    /**
     * @see org.eclipse.debug.core.model.IPersistableSourceLocator#initializeDefaults(org.eclipse.debug.core.ILaunchConfiguration)
     */
    public void initializeDefaults(ILaunchConfiguration configuration)
            throws CoreException {
    	RunnerPlugin.pluginLog.debug("initializeDefaults in KermetaSourceLocator");

    }

    /**
     * @see org.eclipse.debug.core.model.ISourceLocator#getSourceElement(org.eclipse.debug.core.model.IStackFrame)
     */
    public Object getSourceElement(IStackFrame stackFrame) {
        return stackFrame;
    }
    

    /**
     * @see org.eclipse.debug.core.sourcelookup.IPersistableSourceLocator2#initializeFromMemento(java.lang.String, org.eclipse.debug.core.ILaunchConfiguration)
     */
    public void initializeFromMemento(String memento, ILaunchConfiguration configuration) throws CoreException {
    }

    /**
     * @see org.eclipse.debug.core.sourcelookup.IPersistableSourceLocator2#dispose()
     */
    public void dispose() {
    	RunnerPlugin.pluginLog.debug("Dispose kermeta source locator!");
    }

    /**
     * This method (as well as the getEditorId) makes the connection to the Editor view part of the 
     * debug mode. Thanks to them, we can parse the file that is being debugged. The "graphical" access
     * to the file is made by selecting a stackFrame (which has methods like "getLine") 
	 * @see org.eclipse.debug.ui.ISourcePresentation#getEditorInput(java.lang.Object)
	 */
	public IEditorInput getEditorInput(Object element) {
		IEditorInput edInput = null;
		if (element instanceof KermetaStackFrame) 
		{
			IPath path = ((KermetaStackFrame)element).getPath();
			if (path != null && !path.toString().startsWith("<")) 
			{
		        edInput = RunnerPlugin.createEditorInput(path);
			}
		}
		return edInput;
	}

	
	
	
	// FIXME : access to this ID in a proper way!!
	/**
	 * Returns the ID of our editor
	 * Does not seem to work if the id return is our Kermeta editor's.
	 */
	public String getEditorId(IEditorInput input, Object element) {
		System.out.println("Editor id? : " + TexteditorPlugin.getDefault().getBundle().getSymbolicName());
		return RunnerPlugin.PLUGIN_EDITOR_ID;
	}

}
