package fr.irisa.triskell.kermeta.runner.console;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.internal.ui.DebugPluginImages;
import org.eclipse.debug.internal.ui.IDebugHelpContextIds;
import org.eclipse.debug.internal.ui.IInternalDebugUIConstants;
import org.eclipse.debug.internal.ui.views.console.ConsoleMessages;
import org.eclipse.jface.action.Action;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.texteditor.IUpdate;

/**
 * ConsoleTerminateAction 
 * a Copy of the one available on org.eclipse.debug.internal.ui.views.console.ConsoleTerminateAction
 * Once the Thread used to launch Kermeta runner plugin is replaced by a Process (launch
 * in a new JVM), please remove this class.
 * @link org.eclipse.debug.internal.ui.views.console.ConsoleTerminateAction
 */
public class ConsoleTerminateAction extends Action implements IUpdate {

	private InternalIOConsole fConsole;
	//org.eclipse.debug.internal.ui.views.console.ConsoleTerminateAction
	/**
	 * Creates a terminate action for the console 
	 */
	public ConsoleTerminateAction(InternalIOConsole console) {
		super(ConsoleMessages.ConsoleTerminateAction_0); 
		PlatformUI.getWorkbench().getHelpSystem().setHelp(this, IDebugHelpContextIds.CONSOLE_TERMINATE_ACTION);
		fConsole = console;
		setToolTipText(ConsoleMessages.ConsoleTerminateAction_1); 
		setImageDescriptor(DebugPluginImages.getImageDescriptor(IInternalDebugUIConstants.IMG_LCL_TERMINATE));
		setDisabledImageDescriptor(DebugPluginImages.getImageDescriptor(IInternalDebugUIConstants.IMG_DLCL_TERMINATE));
		setHoverImageDescriptor(DebugPluginImages.getImageDescriptor(IInternalDebugUIConstants.IMG_LCL_TERMINATE));
		update();
	}

	/** (non-Javadoc)
	 * @see org.eclipse.ui.texteditor.IUpdate#update()
	 */
	public void update() {
		if (fConsole.getKermetaConsole().getTarget()!=null)
			setEnabled(fConsole.getKermetaConsole().getTarget().canTerminate());
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.action.IAction#run()
	 */
	public void run() {
		try {
			IDebugTarget target = fConsole.getKermetaConsole().getTarget();
            target.terminate();
            setEnabled(false);
		} catch (DebugException e) {
			// TODO: report exception
		}
	}

    public void dispose() {
	    fConsole = null;
	}

}

