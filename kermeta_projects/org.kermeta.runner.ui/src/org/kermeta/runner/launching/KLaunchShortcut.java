/*$Id: KLaunchShortcut.java,v 1.7 2008-06-09 12:23:23 ftanguy Exp $
* Project : org.kermeta.runner.ui
* File : 	KLaunchShortcut.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 avr. 08
* Authors : ftanguy
*/
package org.kermeta.runner.launching;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
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
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.checker.KermetaUnitChecker;
import org.kermeta.runner.launching.KConstants;

import fr.irisa.triskell.kermeta.KermetaMessages;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.modelhelper.ModelingUnitHelper;

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
		boolean launchable = false;
        // Get the first selection, if it is a file
        if (selection instanceof IStructuredSelection)
        {
            IStructuredSelection ssel = (IStructuredSelection)selection;
			if (ssel.size()>1)
			{
			    launchable = false;
			}
			Object obj = ssel.getFirstElement();
			if (obj instanceof IResource) {
				// Do nothing if it is a container (e.g a folder)
				if (obj instanceof IContainer)
				{
					launchable = false;
				}
				else
				{
				    launchable = true;
					selectedFile = (IFile)obj;
				}
			}
		}
        // Launch!
        if (launchable == true)
        {   try {
			launchSelectedFile(selectedFile, mode);
		} catch (NotRegisteredURIException e) {
			e.printStackTrace();
		} catch (URIMalformedException e) {
			e.printStackTrace();
		} }
        else if (selectedFile == null)
        {
            MessageDialog.openInformation(
					new Shell(),
					"Oups!",
					KermetaMessages.getString("KermetaPerspective.NOFILEERROR"));
        }
        else
        {
            MessageDialog.openError(
					new Shell(),
					"Oups!",
					KermetaMessages.getString("KermetaPerspective.WRONGFILEERROR")+": "+selectedFile.getName()+".");
        }
	}

	public void launch(IEditorPart editor, String mode) {
        IFile ifile = null;
        IEditorInput input = editor.getEditorInput();
        
        ifile = (IFile) input.getAdapter(IFile.class); 
        if (ifile != null)
			try {
				launchSelectedFile(ifile, mode);
			} catch (NotRegisteredURIException e) {
				e.printStackTrace();
			} catch (URIMalformedException e) {
				e.printStackTrace();
			}
	}

	/***
	 * Basic launch : Launch the file with the default tags contained in this file.
	 * (in this iteration, the tags are associated to the root package. Later, we will
	 * associate them to the operation that are meant to be executed. Indeed, it is 
	 * meaningful to set more than one operation in a given file to be "main" operations.
	 * @param file : the file to parse and launch
	 * @param mode
	 * @throws URIMalformedException 
	 * @throws NotRegisteredURIException 
	 */
	private void launchSelectedFile(IFile ifile, String mode) throws NotRegisteredURIException, URIMalformedException {
		KermetaUnit unit = KermetaUnitChecker.check(ifile);
		
		if ( unit.isIndirectlyErroneous() ) {
			MessageDialog.openError(new Shell(), "The file is not correctly typechecked.", fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper.getAllErrorsAsString(unit));
			return;
		}
		
		try {
			// Get the @mainClass and @mainOperation tags (if they exist)
			Tag cls = ModelingUnitHelper.getMainClass( unit );
			String className = "";
			if ( cls != null )
				className = cls.getValue();
			
			
			Tag operation = ModelingUnitHelper.getMainOperation( unit );
			String operationName = "";
			if ( operation != null )
				operationName = operation.getValue();
			
			
			// FIXME : wrong path (not file system path)
			String fileName = ifile.getFullPath().makeAbsolute().toOSString();
			String projectName = ifile.getProject().getName();

			List<ILaunchConfiguration> launchConfigurations = findLaunchConfigurations(projectName, fileName, className, operationName);
			
			if ( launchConfigurations.isEmpty() && className.equals("") && operationName.equals("") )
				launchConfigurations = findLaunchConfigurations(projectName, fileName);

			ILaunchConfiguration launchConfiguration = null;
			
			switch (launchConfigurations.size()) {

			case 0:
					
				if (className.equals("") || operationName.equals(""))
					// If there is no className or operationName, the
					// launchConfiguration window is displayed
					DebugUITools.openLaunchConfigurationDialogOnGroup(new Shell(),
							new StructuredSelection(),
							"org.eclipse.debug.ui.launchGroup.run");
				else {	
					// If no launch configuration found, let us use a new one.
					launchConfiguration = createConfiguration(projectName,
						fileName.replace("\\", "/"), className, operationName);
					launchConfiguration(mode, launchConfiguration);
				}
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
			e.printStackTrace();
			MessageDialog.openError(new Shell(), "Kermeta interpreter error", e
					.getMessage());
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

    /**
     * Find every existing launch configuration which its project name corresponds to projectName, 
     * 												its file name corresponds to fileName, 
     * 												its class name corresponds to className and
     * 												its operation name corresponds to operationName.  
    @author Fran�ois Tanguy
    @param projectName The name of the project.
    @param fileName The name of the file.
    @param className The name of the class.
    @param operationName The name of the operation.
    @return List<ILaunchConfiguration> A list of launch configuration with the same project name, file name, class name and operation name.
    */
    private List<ILaunchConfiguration> findLaunchConfigurations(String projectName, String fileName, String className, String operationName) {

    	List<ILaunchConfiguration> existingLaunchConfigurations = new ArrayList<ILaunchConfiguration>();

		try	{
			
			ILaunchConfiguration[]	tab	=	_launchManager.getLaunchConfigurations( _configurationType );
			int		index	=	0;
    		
			while	(	index < tab.length	) 	{
				// getting the launch configuration's attributes
				Map<?,?> attributes	=	tab[index].getAttributes();	
				
				// compatibility windows / linux
				String comparedFileName = fileName.replace('\\', '/');
				
				// We must check if the attributes.get is null, the run configurations may be null !
				// bug detected when we use a workspace from Eclipse 3.1.x with an Eclipse 3.2.x
				if( attributes.get(KConstants.KM_FILENAME)!= null ) {
				String comparedConfigurationFileName = attributes.get(KConstants.KM_FILENAME).toString().replace('\\', '/');
				if ( 	attributes.get(KConstants.KM_PROJECTNAME).toString().equals("") 						
						&&	comparedConfigurationFileName.equals(comparedFileName)
						&& 	attributes.get(KConstants.KM_CLASSQNAME).toString().equals(className)
						&& 	attributes.get(KConstants.KM_OPERATIONNAME).toString().equals(operationName)
						)				
						existingLaunchConfigurations.add(tab[index]);
				else if (
							(attributes.get(KConstants.KM_PROJECTNAME).toString().equals(projectName))
						&&	(comparedConfigurationFileName.equals(comparedFileName))
						&& 	(attributes.get(KConstants.KM_CLASSQNAME).toString().equals(className))
						&& 	(attributes.get(KConstants.KM_OPERATIONNAME).toString().equals(operationName))
						)	{				
						existingLaunchConfigurations.add(tab[index]);
					}
				}
				index++;
			}
		// catch exceptions from getLaunchConfigurations and getAttributes methods.				
    	}	catch	(CoreException ce)	{
    		System.err.println("TODO : catch properly this core exception");
    		ce.printStackTrace();
    	}
    	
    	return existingLaunchConfigurations;
  
    }
    
    private List<ILaunchConfiguration> findLaunchConfigurations(String projectName, String fileName) throws CoreException {
    	List<ILaunchConfiguration> existingLaunchConfigurations = new ArrayList<ILaunchConfiguration>();
    	ILaunchConfiguration[]	tab	=	_launchManager.getLaunchConfigurations( _configurationType );
    	for ( int i = 0; i < tab.length; i++ ) {
			// getting the launch configuration's attributes
			Map<?,?> attributes	=	tab[i].getAttributes();	
			if ( attributes.get(KConstants.KM_PROJECTNAME).toString().equals("") 
				&& attributes.get(KConstants.KM_FILENAME).equals(fileName) )
				existingLaunchConfigurations.add( tab[i] );
			else if( (attributes.get(KConstants.KM_FILENAME).equals(fileName))
					&& (attributes.get(KConstants.KM_PROJECTNAME).toString().equals(projectName)) )
				existingLaunchConfigurations.add( tab[i] );
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
	protected ILaunchConfiguration createConfiguration(String projectName, String fileName, String className, String opName) {
				
		ILaunchConfiguration config= null;
		try {
			int index = fileName.lastIndexOf("/");
			String defaultPath = fileName.substring(0, index);
			String realFileName = fileName.replace(defaultPath + "/", "");
			String configIdentifier = realFileName + "_" + className + "_" + opName;
			
			configIdentifier = configIdentifier.replaceAll(":","__");  // replace the : that are not correctly handled by Eclipse generateUniqueLaunchConfigurationNameFrom
			ILaunchConfigurationWorkingCopy wc = _configurationType.newInstance(
			        null, _launchManager.generateUniqueLaunchConfigurationNameFrom(configIdentifier)); 

			wc.setAttribute(KConstants.KM_FILENAME, fileName);
			wc.setAttribute(KConstants.KM_CLASSQNAME, className);
			wc.setAttribute(KConstants.KM_OPERATIONNAME, opName);
			wc.setAttribute(KConstants.KM_PROJECTNAME, projectName);
			wc.setAttribute(KConstants.DEFAULT_PATH, defaultPath);
			wc.setAttribute( DebugPlugin.ATTR_PROCESS_FACTORY_ID, "org.kermeta.debug.processFactory" );
			//wc.setContainer( ResourcesPlugin.getWorkspace().getRoot() );
			
			config= wc.doSave();
		} catch (CoreException ce) {
		    System.err.println("TODO : catch properly this core exception");
			ce.printStackTrace();
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
