/* $Id: KermetaLaunchShortcut.java,v 1.22 2007-09-14 08:43:21 ftanguy Exp $
 * Project   : Kermeta (First iteration)
 * File      : KermetaLaunchShortcut.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : May 30, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.launching;

import org.eclipse.jface.viewers.StructuredSelection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
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
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.kermeta.checker.KermetaUnitChecker;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.io.util2.KermetaUnitHelper;

import fr.irisa.triskell.kermeta.KermetaMessages;
import fr.irisa.triskell.kermeta.constraintchecker.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.modelhelper.ModelingUnitHelper;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;

/**
 * Launch shortcut that appears when users selects a file > Run > Kermeta App.
 * Only one kind of launch configuration is available for the first iterations of Kermeta
 * RunnerPlugin. It is the configuration that allows the user to launch
 * a given method, from a given class and package.
 * A launch method cannot have any parameter in this iteration yet.
 */
public class KermetaLaunchShortcut implements ILaunchShortcut {
	
    private static final String ID_KERMETA_APPLICATION = "KermetaLaunchConfiguration";
	
    protected ILaunchManager launchManager = DebugPlugin.getDefault().getLaunchManager();
    
    protected ILaunchConfigurationType configurationType;
    
    private KermetaUnit unit = null;
    
    public void updateKermetaUnit(KermetaUnit unit) {
    	this.unit = unit;
    }
    
    private IFile selectedFile = null;
    
    public IFile getFile() {
    	return selectedFile;
    }
    
    public String getFileContent() {
    	return "";
    }
    
    public KermetaLaunchShortcut() {
      	configurationType = launchManager.getLaunchConfigurationType(ID_KERMETA_APPLICATION);	
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
    List<ILaunchConfiguration> findLaunchConfigurations(String projectName, String fileName, String className, String operationName) {

    	List<ILaunchConfiguration> existingLaunchConfigurations = new ArrayList<ILaunchConfiguration>();

		try	{
			
			ILaunchConfiguration[]	tab	=	launchManager.getLaunchConfigurations(configurationType);
			int		index	=	0;
    		
			while	(	index < tab.length	) 	{
				// getting the launch configuration's attributes
				Map<?,?> attributes	=	tab[index].getAttributes();	
				
				// compatibility windows / linux
				String comparedFileName = fileName.replace('\\', '/');
				
				// We must check if the attributes.get is null, the run configurations may be null !
				// bug detected when we use a workspace from Eclipse 3.1.x with an Eclipse 3.2.x
				if( attributes.get(KermetaLaunchConfiguration.KM_FILENAME)!= null ) {
				String comparedConfigurationFileName = attributes.get(KermetaLaunchConfiguration.KM_FILENAME).toString().replace('\\', '/');
					if (
							(attributes.get(KermetaLaunchConfiguration.KM_PROJECTNAME).toString().equals(projectName))
						&&	(comparedConfigurationFileName.equals(comparedFileName))
						&& 	(attributes.get(KermetaLaunchConfiguration.KM_CLASSQNAME).toString().equals(className))
						&& 	(attributes.get(KermetaLaunchConfiguration.KM_OPERATIONNAME).toString().equals(operationName))
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
    
    private List<ILaunchConfiguration> findLaunchConfigurations(String projectName) throws CoreException {
    	List<ILaunchConfiguration> existingLaunchConfigurations = new ArrayList<ILaunchConfiguration>();
    	ILaunchConfiguration[]	tab	=	launchManager.getLaunchConfigurations(configurationType);
    	for ( int i = 0; i < tab.length; i++ ) {
			// getting the launch configuration's attributes
			Map<?,?> attributes	=	tab[i].getAttributes();	
			if( (attributes.get(KermetaLaunchConfiguration.KM_FILENAME)!= null)
					&& (attributes.get(KermetaLaunchConfiguration.KM_PROJECTNAME).toString().equals(projectName)) )
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
	protected ILaunchConfiguration createConfiguration(
			String projectName, String fileName, String className, 
			String opName) {
				
		ILaunchConfiguration config= null;
		try {
			String configIdentifier = fileName+"_"+className+"_"+opName;
			configIdentifier = configIdentifier.replaceAll(":","__");  // replace the : that are not correctly handled by Eclipse generateUniqueLaunchConfigurationNameFrom
			ILaunchConfigurationWorkingCopy wc = configurationType.newInstance(
			        null, launchManager.generateUniqueLaunchConfigurationNameFrom(
			        		configIdentifier)); 
			
			wc.setAttribute(KermetaLaunchConfiguration.KM_FILENAME, fileName);
			wc.setAttribute(KermetaLaunchConfiguration.KM_CLASSQNAME, className);
			wc.setAttribute(KermetaLaunchConfiguration.KM_OPERATIONNAME, opName);
			wc.setAttribute(KermetaLaunchConfiguration.KM_PROJECTNAME, projectName);
			
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
	
    /* (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchShortcut#launch(org.eclipse.jface.viewers.ISelection, java.lang.String)
     */
    public void launch(ISelection selection, String mode)
    {
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
        {   launchSelectedFile(selectedFile, mode); }
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

    /* (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchShortcut#launch(org.eclipse.ui.IEditorPart, java.lang.String)
     */
    public void launch(IEditorPart editor, String mode)
    {
        // Get the editor input.... 
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
	private void launchSelectedFile(IFile ifile, String mode) {
		
		selectedFile = ifile;
		
		try {
			unit = KermetaUnitChecker.check(ifile);
		} catch (KermetaIOFileNotFoundException e1) {
			e1.printStackTrace();
		} catch (URIMalformedException e1) {
			e1.printStackTrace();
		}
		/*KermetaTypeChecker typechecker = new KermetaTypeChecker( unit, new NullProgressMonitor() );
		typechecker.checkUnit();
		
		if ( ! unit.isErrored() ) {
			KermetaConstraintChecker constraintchecker = new KermetaConstraintChecker( unit );
			constraintchecker.checkUnit();
		}*/
		
		if ( unit.isErrored() ) {
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
			
			if ( launchConfigurations.isEmpty() )
				launchConfigurations = findLaunchConfigurations(projectName);

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
						fileName, className, operationName);
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
}