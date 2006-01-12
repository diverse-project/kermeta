/* $Id: KermetaLaunchShortcut.java,v 1.10 2006-01-12 16:46:58 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : KermetaLaunchShortcut.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : May 30, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.launching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.KermetaMessages;

/**
 * Launch shortcut that appears when users selects a file > Run > Kermeta App.
 * Only one kind of launch configuration is available for the first iterations of Kermeta
 * RunnerPlugin. It is the configuration that allows the user to launch
 * a given method, from a given class and package.
 * A launch method cannot have any parameter in this iteration yet.
 */
public class KermetaLaunchShortcut implements ILaunchShortcut {

    private static final String ID_KERMETA_APPLICATION = "KermetaLaunchConfiguration";
    private String ID_GROUP = "KermetaLaunchGroup";

    public KermetaLaunchShortcut()
    {}
    
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
    
    /**
     * Create a configuration for the specified arguments that define the given project.
     * @param project
     * @param fileName the selected file
     * @param className
     * @param opName
     * @return
     */
	protected ILaunchConfiguration createConfiguration(
			IProject project, String fileName, String className, 
			String opName) {
				
		ILaunchConfiguration config= null;
		try {
			ILaunchConfigurationType configType= getKermetaLaunchConfigurationType();
			String configIdentifier = fileName+"_"+className+"_"+opName;
			configIdentifier = configIdentifier.replaceAll(":","__");  // replace the : that are not correctly handled by Eclipse generateUniqueLaunchConfigurationNameFrom
			ILaunchConfigurationWorkingCopy wc = configType.newInstance(
			        null, getLaunchManager().generateUniqueLaunchConfigurationNameFrom(
			        		configIdentifier)); 
			
			wc.setAttribute(KermetaLaunchConfiguration.KM_FILENAME, fileName);
			wc.setAttribute(KermetaLaunchConfiguration.KM_CLASSQNAME, className);
			wc.setAttribute(KermetaLaunchConfiguration.KM_OPERATIONNAME, opName);
			
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

	/**
	 * Find an existing configuration given the parameters
	 * Note : thanks to Junit plugin sources.
	 * @param mode
	 * @param filePath
	 * @param className
	 * @param opName
	 * @return
	 */
	private ILaunchConfiguration findLaunchConfiguration(String mode, String filePath, String className, String opName) {
		ILaunchConfigurationType configType= getKermetaLaunchConfigurationType();
		List candidateConfigs= Collections.EMPTY_LIST;
		try {
		    // Get the existing configs previously created by the user
			ILaunchConfiguration[] configs= getLaunchManager().getLaunchConfigurations(configType);
			candidateConfigs= new ArrayList(configs.length);
			// Is one of them corresponding to our current file?
			for (int i= 0; i < configs.length; i++) {
				ILaunchConfiguration config= configs[i];
				if (!(config.getAttribute(KermetaLaunchConfiguration.KM_FILENAME, "").equals("")) && //$NON-NLS-1$
					!(config.getAttribute(KermetaLaunchConfiguration.KM_CLASSQNAME, "").equals("")) && //$NON-NLS-1$
					!(config.getAttribute(KermetaLaunchConfiguration.KM_OPERATIONNAME,"").equals("")))  //$NON-NLS-1$
				{  //$NON-NLS-1$
						candidateConfigs.add(config);
				}
			}
		} catch (CoreException e) {
			System.err.println("TODO : implement core exception handling");
		}
		
		// If there are no existing configs associated with the IType, create one.
		// If there is exactly one config associated with the IType, return it.
		// Ignore the other case, i.e more than one config.
		int candidateCount= candidateConfigs.size();
		if (candidateCount < 1) {
		    
			return null;
		} else if (candidateCount == 1) {
			return (ILaunchConfiguration) candidateConfigs.get(0);
		} else {
		    System.err.println("It looks like there is more than one available config! We'll create a new default one.");
		}
		return null;
	}
	
	/***
	 * Basic launch : Launch the file with the default tags contained in this file.
	 * (in this iteration, the tags are associated to the root package. Later, we will
	 * associate them to the operation that are meant to be executed. Indeed, it is 
	 * meaningful to set more than one operation in a given file to be "main" operations.
	 * @param file : the file to parse and launch
	 * @param mode
	 */
	private void launchSelectedFile(IFile ifile, String mode)
	{
		// Parse the file
	    KermetaUnit unit = KermetaRunHelper.parse(ifile);
	    try
	    {
	        // Get the @mainClass and @mainOperation tags (if they exist)
	        ArrayList point  = KermetaRunHelper.findEntryPoint(unit);
	        String mainClass = (String)point.get(0);
	        String mainOp    = (String)point.get(1);
	        // FIXME : wrong path (not file system path)
	        String fileName  = ifile.getFullPath().makeAbsolute().toOSString(); 
	        
	        ILaunchConfiguration config = findLaunchConfiguration(
	                mode, 
	                fileName,
	                mainClass,
	                mainOp
	        );
	        
	        if (config == null ) {
	            config= createConfiguration(
	                    ifile.getProject(),
	                    fileName,
	                    mainClass,
	                    mainOp
	            );
	        }

	        // Open configuration handler if mainClass and mainOp are not provided
	        
	        if (mainClass.equals("") || mainOp.equals(""))
	        {
	            //FIXME : new Shell() -> 
	            DebugUITools.openLaunchConfigurationDialog(new Shell(), config, ID_GROUP, null );
	        }
	        
	        launchConfiguration(mode, config);
	    }
	    // Thrown by findEntryPoint
	    catch (Throwable e)
	    {
	        MessageDialog.openError(new Shell(), "Kermeta interpreter error",e.getMessage());
	    }
	}

	
	
    /**
     * Get the Kermeta configuration type (there is only one..)
     * @return
     */
    protected ILaunchConfigurationType getKermetaLaunchConfigurationType()
    {
		ILaunchManager lm= DebugPlugin.getDefault().getLaunchManager();
		return lm.getLaunchConfigurationType(ID_KERMETA_APPLICATION);
    }
	
	protected ILaunchManager getLaunchManager()
	{
	    return DebugPlugin.getDefault().getLaunchManager();
	}

	
	
}
