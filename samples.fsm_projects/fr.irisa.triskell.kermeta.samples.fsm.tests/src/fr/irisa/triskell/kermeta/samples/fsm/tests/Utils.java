package fr.irisa.triskell.kermeta.samples.fsm.tests;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.UIJob;
import org.openembedd.tests.utils.UiTools;

/**
 * Set of tools needed by tests on the Basic Demo.
 * Those tools can be used in setUp() & tearDown() methods or directly in test methods.
 * 
 * @author vmahe@irisa.fr
 *
 */
public class Utils {
	
	public static String PROJECT_NAME = "fr.irisa.triskell.kermeta.samples.fsm.demo";
	public static String PLUGIN_NAME = "fr.irisa.triskell.kermeta.samples.fsm";
	public static String WIZARD_ID = "fr.irisa.triskell.kermeta.samples.fsm.wizard";
	
	public static String FSM_EDITOR_ID = "fr.irisa.triskell.kermeta.samples.fsm.presentation.FsmEditor";
	public static String FSM_EDITOR_EXTENSION = ".fsm";
	public static String FSM_INVARIANT_LAUNCH_FILE_NAME = "fsm.demo.checkInvariants.launch"; 
	public static String FSM_DETERMINIZATION_LAUNCH_FILE_NAME = "fsm.demo.determinization.launch"; 
	public static String FSM_LOADER_LAUNCH_FILE_NAME = "fsm.demo.loaderFsm.launch"; 
	public static String FSM_LOADER_PREPOST_LAUNCH_FILE_NAME = "fsm.demo.loaderFsm4prepost.launch"; 
	public static String FSM_INVARIANT_MINIMIZATION_FILE_NAME = "fsm.demo.minimization.launch"; 

	/**
	 * Erase the Basic Demo example project from the current workspace, if exists
	 *
	 */
	public static void cleanProject() {
		
		try {
			/* delete also the content, force deletion, no need for progress monitor */
			ResourcesPlugin.getWorkspace().getRoot().getProject(PROJECT_NAME).delete(true, true, null);
			
		} catch (Exception e) {
			System.out.println("Exception when cleaning project '"+PROJECT_NAME+"'");
			System.out.println(e.getStackTrace()[0]);
		}
	}
	
	/**
	 * Use the wizard of the FSM demo plug-in to create an example project in the current workspace
	 * @throws Exception 
	 */
	public static void createProject() throws Exception {
			final IWorkbenchWizard wizard;
//			try {
				wizard = PlatformUI.getWorkbench().getNewWizardRegistry().findWizard(WIZARD_ID).createWizard();
				assert( wizard != null );
				
				UIJob job = new UIJob("blah") {
					@Override
					public IStatus runInUIThread(IProgressMonitor monitor) {
				        WizardDialog dialog = new WizardDialog(null, wizard);
				        dialog.create();
				        dialog.setBlockOnOpen(false);
				        dialog.open();
				        wizard.performFinish();
				        dialog.close();
				        return Status.OK_STATUS;
					}	
				};
				
				UiTools.executeUIJob(job);
//			} catch (CoreException e) { e.printStackTrace(); }
			
	}
	
	public static IFile getLaunchFile(String launchFileName){
		return UiTools.getWorkspaceFile(PROJECT_NAME+"/",launchFileName);
	}
	
//	public static void waitSimulatorEndOfWriting(InternalIOConsole console) throws InterruptedException{
//		while (! console.getDocument().get().endsWith(SIMULATOR_PROMPT))
//			Thread.sleep(100);
//	}
//	
//	// the "clearConsole()" method of InternalIOConsole fails to clean-up the text !!!
//	public static void clearConsole(InternalIOConsole console) throws Exception {
//		final InternalIOConsole uiConsole = console;
//		UIJob job = new UIJob("Clear console") {
//			@Override
//			public IStatus runInUIThread(IProgressMonitor monitor) {
//				try {
//					uiConsole.getDocument().replace(0, uiConsole.getDocument().getLength(), "");
//				} catch (BadLocationException e) {
//					// transfer exception to test thread in order to see it into the test result
//					UiTools.uiException = e;
//				}
//		        return Status.OK_STATUS;
//			}	
//		};
//		UiTools.manageUIException();
//		
//		UiTools.executeUIJob(job);
//	}
	
//	// Phase 2
//	
//	public static void copyModifiedDiagramPhase2() throws Exception{
//		copyResource(getPluginPath()+MODIFIED_MODEL, UiTools.getWorkspacePath()+DIAGRAMS_PATH+MODEL_NAME);
//		copyResource(getPluginPath()+MODIFIED_DIAGRAM, UiTools.getWorkspacePath()+DIAGRAMS_PATH+DIAGRAM_NAME);
//	}
//	
//	private static String getPluginPath() throws IOException {
//		URL pluginUrl = Platform.getBundle(PLUGIN_NAME).getEntry("/");
//		return new File(FileLocator.toFileURL(pluginUrl).getFile()).getAbsolutePath();
//	}
}
