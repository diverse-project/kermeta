package fr.irisa.triskell.kermeta.kpm.actions.ant;

import java.io.File;
import java.io.PrintStream;
import java.util.Map;

import org.apache.tools.ant.DefaultLogger;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;
import org.apache.tools.ant.helper.ProjectHelperImpl;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.kermeta.kpm.IAction;
import org.kermeta.kpm.KPMPlugin;

import fr.irisa.triskell.eclipse.console.EclipseConsole;
import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Unit;

public class ExecuteAntAction implements IAction {

	public void execute(Out out, Unit unit, Map<String, Object> args, IProgressMonitor monitor) {
		
		/*
		 * 
		 * There must be only one parameter.
		 * 
		 */
		try {
			String s = (String) args.get("");
			IFile file = ResourceHelper.getIFile( s );
			
			Project ant = new Project();
			ProjectHelper helper = new ProjectHelperImpl();
			
			//ajouter un listener pour voir les �v�nements g�n�r� par ant 
			DefaultLogger log = new DefaultLogger();

			EclipseConsole console = new EclipseConsole("KPM Console - Executing Ant file : " + file.getFullPath().toString());

			log.setErrorPrintStream( new PrintStream(console.getOutputStream()) );
			log.setOutputPrintStream( new PrintStream(console.getOutputStream()) );
			log.setMessageOutputLevel(Project.MSG_INFO);
			ant.addBuildListener(log);
			
			//inistialiser ant 
			ant.init();
			helper.parse(ant, new File(file.getLocation().toString()));
			ant.executeTarget( ant.getDefaultTarget() );

		} catch (IndexOutOfBoundsException exception) {
			/*
			 * 
			 * If there is no parameter, let's log it into the error log view.
			 * 
			 */
			Status status = null;
			KPMPlugin.getDefault().getLog().log(status);
		}
	}

	

}
