package fr.irisa.triskell.kermeta.runner.console;

import org.eclipse.core.commands.contexts.ContextEvent;
import org.eclipse.core.commands.contexts.IContextListener;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IDebugEventSetListener;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.internal.ui.DebugUIPlugin;
import org.eclipse.debug.internal.ui.contexts.DebugContextManager;
import org.eclipse.debug.ui.IDebugUIConstants;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsolePageParticipant;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.part.IPageBookViewPage;
import org.eclipse.ui.part.IShowInSource;
import org.eclipse.ui.part.IShowInTargetList;
import org.eclipse.ui.part.ShowInContext;
import org.eclipse.debug.ui.contexts.DebugContextEvent;
import org.eclipse.debug.ui.contexts.IDebugContextListener;

import fr.irisa.triskell.eclipse.console.IOConsole;
import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
import fr.irisa.triskell.kermeta.runner.debug.model.AbstractKermetaTarget;

/**
 * Strongly inspired from org.eclipse.debug.internal.ui.views.console.ProcessConsolePageParticipant
 * @see org.eclipse.debug.internal.ui.views.console.ProcessConsolePageParticipant
 */
public class ConsolePageParticipant implements IConsolePageParticipant, IShowInSource, IShowInTargetList, IDebugEventSetListener, IDebugContextListener, IContextListener {

	// actions
	private ConsoleTerminateAction fTerminate;

    private RunnerConsole console;

    private IPageBookViewPage fPage;

    private IConsoleView fView;
    
    private IDebugTarget target;

    private AbstractKermetaTarget kermetaTarget = null;
    		
    /* (non-Javadoc)
     * @see org.eclipse.ui.console.IConsolePageParticipant#init(IPageBookViewPage, IConsole)
     */
    public void init(IPageBookViewPage page, IConsole console) {
    	fPage = page;
    	this.console = (RunnerConsole) console;
    	//target = fConsole.getKermetaConsole().getTarget();
    	fTerminate = new ConsoleTerminateAction( this.console.getTarget() );

    	RunnerPlugin.getDefault().prepareExecution(this.console.getTarget(), fTerminate);
    	
    	fView = (IConsoleView) fPage.getSite().getPage().findView(IConsoleConstants.ID_CONSOLE_VIEW);

    	DebugPlugin.getDefault().addDebugEventListener(this);
    	DebugContextManager.getDefault().addDebugContextListener(this);

    	
    	
    	// contribute to toolbar
    	IActionBars actionBars = fPage.getSite().getActionBars();
    	configureToolBar(actionBars.getToolBarManager());
    }
    
    /* (non-Javadoc)
     * @see org.eclipse.ui.console.IConsolePageParticipant#dispose()
     */
    public void dispose() {
    	deactivated();
    	DebugContextManager.getDefault().removeDebugContextListener(this);
    	DebugPlugin.getDefault().removeDebugEventListener(this);

    	if (fTerminate != null) {
    		//fTerminate.dispose();
    		fTerminate = null;
    	}
    	console = null;
    }

    /**
     * Contribute actions to the toolbar
     */
    protected void configureToolBar(IToolBarManager mgr) {
		mgr.appendToGroup(IConsoleConstants.LAUNCH_GROUP, fTerminate);
    }

    /* (non-Javadoc)
     * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
     */
    public Object getAdapter(Class required) {
        if (IShowInSource.class.equals(required)) {
            return this;
        }
        if (IShowInTargetList.class.equals(required)) {
            return this; 
        }
        return null;
    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.part.IShowInSource#getShowInContext()
     */
    public ShowInContext getShowInContext() {
        return null;
    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.part.IShowInTargetList#getShowInTargetIds()
     */
    public String[] getShowInTargetIds() {
        return new String[] {IDebugUIConstants.ID_DEBUG_VIEW};
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.IDebugEventSetListener#handleDebugEvents(org.eclipse.debug.core.DebugEvent[])
     */
    public void handleDebugEvents(DebugEvent[] events) {
        for (int i = 0; i < events.length; i++) {
            DebugEvent event = events[i];
            if (event.getSource().equals(target)) {
                Runnable r = new Runnable() {
                    public void run() {
                        if (fTerminate != null) {
                            fTerminate.update();
                        }
                    }
                };
                
                DebugUIPlugin.getStandardDisplay().asyncExec(r);           
            }
        }
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.internal.ui.contexts.provisional.IDebugContextListener#contextActivated(org.eclipse.jface.viewers.ISelection, org.eclipse.ui.IWorkbenchPart)
     */
    public void contextActivated(ISelection selection, IWorkbenchPart part) {
   /* 	if (fView != null && getProcess().equals(DebugUITools.getCurrentProcess())) {
            fView.display(fConsole);
        }*/
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.contexts.IDebugContextListener#contextChanged(org.eclipse.jface.viewers.ISelection, org.eclipse.ui.IWorkbenchPart)
	 */
	public void contextChanged(ISelection selection, IWorkbenchPart part) {
	}

	/* (non-Javadoc)
     * @see org.eclipse.ui.console.IConsolePageParticipant#activated()
     */
    public void activated() {
    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.console.IConsolePageParticipant#deactivated()
     */
    public void deactivated() {
    }

	public void debugContextChanged(DebugContextEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextChanged(ContextEvent contextEvent) {
		System.out.println();
	}


}
