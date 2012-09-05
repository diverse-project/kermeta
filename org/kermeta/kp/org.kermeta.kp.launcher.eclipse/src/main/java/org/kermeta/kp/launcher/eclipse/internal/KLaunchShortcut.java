/*$Id: KLaunchShortcut.java,v 1.7 2008-06-09 12:23:23 ftanguy Exp $
* Project : org.kermeta.runner.ui
* File : 	KLaunchShortcut.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 avr. 08
* Authors : ftanguy
*/
package org.kermeta.kp.launcher.eclipse.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.kermeta.language.builder.eclipse.Activator;
import org.kermeta.language.builder.eclipse.KermetaBuilder;

abstract public class KLaunchShortcut implements ILaunchShortcut {

    private ILaunchManager _launchManager = DebugPlugin.getDefault().getLaunchManager();
	
	private ILaunchConfigurationType _configurationType;
	
	public KLaunchShortcut(String configurationTypeId) {
		
		_configurationType = _launchManager.getLaunchConfigurationType(configurationTypeId);
	}
	
	protected boolean isConstraint() {
		return false;
	}
	
	public void launch(ISelection selection, String mode) {
		IFile selectedFile = null;
        // Get the first selection, if it is a file
        if (selection instanceof IStructuredSelection)
        {
            IStructuredSelection ssel = (IStructuredSelection)selection;			
			Object obj = ssel.getFirstElement();
			if (obj instanceof IResource) {
				
				
				IProject project = ((IResource)obj).getProject();
				try {
					if(project.hasNature(org.kermeta.language.texteditor.eclipse.nature.Activator.NATURE_ID)){

						selectedFile = KermetaBuilder.getDefault().findRootKPinProject(project);
						if(selectedFile != null){
					        // Launch!
							launchSelectedFile(selectedFile, mode);
						}
						else{
							MessageDialog.openInformation(
									new Shell(),
									"Oups!",
									"Cannot launch as Kermeta application, missing kp file in the project");
						}
					}
					else{
						MessageDialog.openInformation(
								new Shell(),
								"Oups!",
								"Cannot launch as Kermeta application, missing kermeta nature on the project");
					}
				} catch (CoreException e) {
					Activator.getDefault().getMessaggingSystem().error("Launch failed", this.getClass().getName(), e);
				}
			}
		}
	}

	public void launch(IEditorPart editor, String mode) {
        IFile ifile = null;
        IEditorInput input = editor.getEditorInput();
        
        ifile = (IFile) input.getAdapter(IFile.class); 
        if (ifile != null)
			launchSelectedFile(ifile, mode);			
	}

	/***
	 * Basic launch : Launch the file with the default tags contained in this file.
	 * (in this iteration, the tags are associated to the root package. Later, we will
	 * associate them to the operation that are meant to be executed. Indeed, it is 
	 * meaningful to set more than one operation in a given file to be "main" operations.
	 * @param file : the file to parse and launch
	 * @param mode
	 */
	private void launchSelectedFile(IFile ifile, String mode)  {
		String uri = "platform:/resource" + ifile.getFullPath().toString();
		
		
		
		try {
			// Get the defaultmainClass and defaultmainOperation
			String className = "";
			
			
			String operationName = "";
			
			
			// FIXME : wrong path (not file system path)
			String fileName = ifile.getFullPath().makeAbsolute().toOSString();
			String projectName = ifile.getProject().getName();

			List<ILaunchConfiguration> launchConfigurations = findLaunchConfigurations(projectName, fileName.replace("\\", "/"));
			
			

			ILaunchConfiguration launchConfiguration = null;
			
			switch (launchConfigurations.size()) {

			case 0:
					
				// If no launch configuration found, let us use a new one.
				launchConfiguration = createConfiguration(projectName, fileName.replace("\\", "/"), ifile);
				launchConfiguration(mode, launchConfiguration);
				
				break;
			case 1:
				// If one launch configuration found, let us use it.
				launchConfiguration = launchConfigurations.get(0);
				launchConfiguration(mode, launchConfiguration);
				break;
			default:
				// If more than one launch configuration found, let us ask the
				// user which one to use.
				// openLaunchConfigurationDialogOnGroup requires a string used
				// as a group identifier.
				// Here we use "org.eclipse.debug.ui.launchGroup.run" because
				// ID_GROUP = "KermetaLaunchGroup" does not work.
				DebugUITools.openLaunchConfigurationDialogOnGroup(
						new Shell(), new StructuredSelection(
								launchConfigurations.get(0)),
						"org.eclipse.debug.ui.launchGroup.run");
				break;
			}
			// Thrown by findEntryPoint
		} catch (Exception e) {
			Activator.getDefault().getMessaggingSystem().error("Kermeta launcher error", this.getClass().getName(), e);
			//e.printStackTrace();
			//MessageDialog.openError(new Shell(), "Kermeta launcher error", e
			//		.getMessage());
		}
	//	KermetaWorkspace.getInstance().undeclareInterest(this);
	}
	
    private IFile selectedFile = null;
    
    public IFile getFile() {
    	return selectedFile;
    }
    
    public String getFileContent() {
    	return "";
    }

        
    private List<ILaunchConfiguration> findLaunchConfigurations(String projectName, String fileName) throws CoreException {
    	List<ILaunchConfiguration> existingLaunchConfigurations = new ArrayList<ILaunchConfiguration>();
    	ILaunchConfiguration[]	tab	=	_launchManager.getLaunchConfigurations( _configurationType );
    	for ( int i = 0; i < tab.length; i++ ) {
			// getting the launch configuration's attributes
			Map<?,?> attributes	=	tab[i].getAttributes();	
			if( (attributes.get(KermetaLauncherConfiguration.KM_LAUNCH_KP_FILE).equals(fileName))
					&& (attributes.get(KermetaLauncherConfiguration.KM_LAUNCH_PROJECT).toString().equals(projectName)) ){
				existingLaunchConfigurations.add( tab[i] );
			}
    	}
    	return existingLaunchConfigurations;
    }
    
    
    /**
     * Create a configuration for the specified arguments that define the given project.
     * @param project
     * @param fileName the selected file
     * @param className
     * @param opName
     * @return
     */
	protected ILaunchConfiguration createConfiguration(String projectName, String fileName, IFile kpFile) {
				
		ILaunchConfiguration config= null;
		try {
			int index = fileName.lastIndexOf("/");
			String defaultPath = fileName.substring(0, index);
			String realFileName = fileName.replace(defaultPath + "/", "");
			String configIdentifier = projectName;
			
			configIdentifier = configIdentifier.replaceAll(":","__");  // replace the : that are not correctly handled by Eclipse generateUniqueLaunchConfigurationNameFrom
			ILaunchConfigurationWorkingCopy wc = _configurationType.newInstance(
			        null, _launchManager.generateLaunchConfigurationName(configIdentifier)); 

			wc.setAttribute(KermetaLauncherConfiguration.KM_LAUNCH_KP_FILE, fileName);
			wc.setAttribute(KermetaLauncherConfiguration.KM_LAUNCH_MAIN_CLASS, KermetaBuilder.getDefault().getDefaultMainClass(kpFile));
			wc.setAttribute(KermetaLauncherConfiguration.KM_LAUNCH_MAIN_OPERATION, KermetaBuilder.getDefault().getDefaultMainOperation(kpFile));
			wc.setAttribute(KermetaLauncherConfiguration.KM_LAUNCH_PROJECT, projectName);
			//wc.setAttribute(KConstants.DEFAULT_PATH, defaultPath);
			wc.setAttribute( DebugPlugin.ATTR_PROCESS_FACTORY_ID, "org.kermeta.debug.processFactory" );
			//wc.setContainer( ResourcesPlugin.getWorkspace().getRoot() );
			
			config= wc.doSave();
		} catch (CoreException ce) {
			Activator.getDefault().getMessaggingSystem().error("Cannot create default launchconfiguration for project "+projectName, this.getClass().getName(), ce);
		}
		return config;
	}
    
	
	/**
	 * Launch the configuration given in parameters in the given mode
	 * @param mode run, or debug
	 * @param config a KermetaLaunchConfiguration
	 */
	protected void launchConfiguration(String mode, ILaunchConfiguration config) {
		if (config != null) {
			DebugUITools.launch(config, mode);	
		}
	}

}
