package fr.irisa.triskell.kermeta.samples.fsm.tests.exemple.junit4;

import java.io.File;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
//import org.eclipse.debug.core.DebugPlugin;
//import org.eclipse.debug.core.ILaunch;
//import org.eclipse.debug.core.ILaunchConfiguration;
//import org.eclipse.debug.core.ILaunchManager;
//import org.eclipse.ui.PartInitException;
//import org.eclipse.ui.console.ConsolePlugin;
//import org.eclipse.ui.console.IConsole;
//import org.eclipse.ui.ide.IDE;
//import org.eclipse.ui.progress.UIJob;
//import org.junit.*;
//import org.openembedd.tests.basicdemo.Utils;
//import org.openembedd.tests.utils.UiTools;
//import org.topcased.modeler.uml.editor.UMLEditor;
//
//import fr.irisa.triskell.kermeta.runner.console.InternalIOConsole;

public class RunExampleTest {

//	public static UMLEditor editor;
//	public static ILaunch atlLaunch;
//	public static ILaunch kermetaLaunch;
//
//	@Before
//	public void resetExampleProject() throws Exception {
//		/* 
//		 * clean up the workspace before testing creation of the example
//		 */
//		Utils.cleanProject();
//		Utils.createProject();
//	}
//	
//	@Test
//	public void openUMLEditor() throws Exception {
//		UIJob job = new UIJob("blah") {
//			@Override
//			public IStatus runInUIThread(IProgressMonitor monitor) {
//				try {
//					// get the UML editor with the diagram given by the demo.
//					editor = (UMLEditor)IDE.openEditor(UiTools.getPage(), Utils.getUmlDiagramFile());
//					editor.close(false);
//					
//				} catch (PartInitException e) { UiTools.uiException = e; }
//		        return Status.OK_STATUS;
//			}	
//		};
//		UiTools.manageUIException();
//		
//		UiTools.executeUIJob(job);
//		
//		Assert.assertTrue("We should get the Topcased UML2 editor", editor != null);
//	}
//	
//	@Test
//	public void runATLTransformation() throws Exception {
//		// clean up the workspace before trying to [re]launch transformation
//		File resultFile = new File(UiTools.getWorkspacePath() + Utils.RELATIONAL_PATH + Utils.RELATIONAL_NAME);
//		resultFile.delete();
//		
//		Assert.assertFalse("The relational file must have been deleted in order to verify transformation",
//				resultFile.exists());
//		
//		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
//		ILaunchConfiguration config = manager.getLaunchConfiguration(Utils.getAtlLaunchFile());
//		
//		// DEBUG_MODE is to prevent error message on missing file (the one we suppressed before)...
//		atlLaunch = config.launch(ILaunchManager.DEBUG_MODE, null);
//		
//		Assert.assertTrue("The Demo given launch of ATL transformation fails", atlLaunch != null);
//		Assert.assertTrue("The relational file must have been created by transformation", resultFile.exists());
//		
//	}
//	
//	@Test
//	public void runKermetaSimulator() throws Exception {
//		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
//		ILaunchConfiguration config = manager.getLaunchConfiguration(Utils.getKermetaLaunchFile());
//		
//		kermetaLaunch = config.launch(ILaunchManager.RUN_MODE, null);
//			
//		Assert.assertTrue("The Demo given launch of Kermeta fails", kermetaLaunch != null);
//		
//		IConsole[] consoles = ConsolePlugin.getDefault().getConsoleManager().getConsoles();
//		
//		Assert.assertTrue("There should be at least one console", consoles.length > 0);
//		
//		InternalIOConsole console = null;
//		for (int i = 0; i < consoles.length; i++) {
//			if (consoles[i] instanceof fr.irisa.triskell.kermeta.runner.console.InternalIOConsole)
//				console = (InternalIOConsole)consoles[i];
//		}
//		
//		Assert.assertTrue("The kermeta console should be opened", console != null);
//		
//		// we must wait the simulator finishes to print on the console
//		Utils.waitSimulatorEndOfWriting(console);
//		// we should get in the console the line "1 - manage schema: SalesRDB"
//		Assert.assertTrue("The simulator must propose to manage SalesRDB",
//				console.getDocument().get().contains("1 - manage schema: SalesRDB"));
//		Utils.clearConsole(console);
//		
//		// try to go into database management ("1" choice)
//		console.getInputStream().appendData("1\n");
//		
//		// we must wait the simulator finishes to print on the console
//		Utils.waitSimulatorEndOfWriting(console);
//		Assert.assertTrue("we should get in the console the tables names",
//				console.getDocument().get().contains("Product")
//				&& console.getDocument().get().contains("Order")
//				&& console.getDocument().get().contains("Customer"));
//		
//		//TODO : write more tests
//		
//		
//		// clean closing of Kermeta console
//		console.getInputStream().appendData("exit\n");
//		kermetaLaunch.terminate(); // not enough to avoid error messages
//	}
}
