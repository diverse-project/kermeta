

/*$Id: MergeEcoreWizard.java,v 1.1.1.1 2008-11-04 08:27:28 mclavreu Exp $
* Project : org.kermeta.kompose.ui
* File : 	MergeEcoreWizard.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 13 juin 08
* Authors : paco
*/

package org.kermeta.kompose.ecore.ui;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.progress.UIJob;
import org.kermeta.interpreter.api.Interpreter;
import org.kermeta.interpreter.api.InterpreterMode;
import org.kermeta.interpreter.api.InterpreterOptions;

import fr.irisa.triskell.eclipse.console.EclipseConsole;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;

public class MergeEcoreWizard extends Wizard {

	/** The only page of the wizard. */
	private NewFilePage _mainPage;
	
	/** The selected input files. */
	private List<IFile> _files;
	
	/** The title string value of the wizard. */
	static final private String TITLE = "Merge Ecore";
	
	/** The description string value of the wizard. */
	static final private String DESCRIPTION = "Merge Ecore Files into a single one.";

	/** The default string value of the generated ecore file. */
	static final private String DEFAULT_FILE_NAME = "merged.ecore";
	
	public MergeEcoreWizard(List<IFile> files) {
		super();
		// Can only merge if the there are at least two files.
		assert( _files.size() >= 2 );
		_files = files;
	}

	@Override
	public void addPages() {
		super.addPages();
        _mainPage = new NewFilePage("newFilePage1", new StructuredSelection( _files.get(0).getParent() ));
        _mainPage.setTitle( TITLE );
        _mainPage.setFileName( DEFAULT_FILE_NAME );
        _mainPage.setDescription( DESCRIPTION );
        addPage(_mainPage);	
	}
	
	@Override
	public boolean performFinish() {
		// Constructing the input string parameter by concatenating every selected file's name separated with a '|' character.
		String temp = "";
		for ( IFile file : _files )
			temp += "|platform:/resource" + file.getFullPath().toString();
		temp = temp.replaceFirst("\\|", "");
		final String inputModelURIS = temp;
		// Constructing the output string parameter.
		final String outputURI = "platform:/resource" +  _mainPage.getContainerFullPath().toString() + "/" + _mainPage.getFileName();
		
		/*
		 * Using a job because it is a long process.
		 */
		UIJob job = new UIJob("Komposing Ecore") {
			@Override
			public IStatus runInUIThread(IProgressMonitor monitor) {
				EclipseConsole console = new EclipseConsole("Kompose Console");
				try {
					// We use an executable km. No merge and no typecheck needed.
					Map<String, Object> options = new HashMap<String, Object>();
					options.put( InterpreterOptions.MERGE, false );
					options.put( InterpreterOptions.TYPE_CHECKED, true );
					Interpreter interpreter = new Interpreter("platform:/plugin/org.kermeta.kompose.ui/src/org/kermeta/kompose/ecore/ui/Ecore2.km", InterpreterMode.RUN, options);
			        interpreter.setStreams( console );
			        interpreter.setEntryPoint("ecore::Main", "main3");
			        String[] parameters = new String[2];
			        parameters[0] = inputModelURIS;
			        parameters[1] = outputURI;
			        interpreter.setParameters(parameters);
			        interpreter.launch();
				
				} catch (NotRegisteredURIException e) {
					console.print(e);
				} catch (URIMalformedException e) {
					console.print(e);
				}
				
				_files.clear();
				return Status.OK_STATUS;
			}
		};
		job.schedule();
		return true;
	}
	
}


