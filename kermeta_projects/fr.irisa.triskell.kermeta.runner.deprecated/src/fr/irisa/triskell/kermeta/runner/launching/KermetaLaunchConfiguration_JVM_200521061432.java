/* $Id: KermetaLaunchConfiguration_JVM_200521061432.java,v 1.2 2005-06-28 09:40:39 zdrey Exp $
 * Project: Kermeta (First iteration)
 * File: KermetaLaunchConfiguration.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 18, 2005
 * Authors: zdrey
 * Description: 
 */
package fr.irisa.triskell.kermeta.runner.launching;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Vector;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IPluginPrerequisite;
import org.eclipse.core.runtime.IPluginRegistry;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.variables.VariablesPlugin;

import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.AbstractJavaLaunchConfigurationDelegate;
import org.eclipse.jdt.launching.ExecutionArguments;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jdt.launching.IRuntimeClasspathEntry;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.IVMRunner;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.LibraryLocation;
import org.eclipse.jdt.launching.SocketUtil;
import org.eclipse.jdt.launching.VMRunnerConfiguration;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.osgi.internal.resolver.ResolverImpl;
import org.eclipse.osgi.util.ManifestElement;
import org.eclipse.pde.core.plugin.IPluginLibrary;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IPluginContribution;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleException;
import org.osgi.framework.Constants;

import fr.irisa.triskell.kermeta.error.KermetaInterpreterError;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.runner.Messages;
import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
import fr.irisa.triskell.kermeta.runner.console.KermetaConsole;

/**
 * 
 */
public class KermetaLaunchConfiguration_JVM_200521061432 extends AbstractJavaLaunchConfigurationDelegate 
{
    /*
     * 
     * STATIC FIELDS
     *
     */
    public static String ATTR_CLASSPATH = "ATTR_CLASSPATH";
    public static String KM_FILENAME = "KM_FILENAME";
    public static String KM_CLASSQNAME = "KM_CLASSQNAME";
    public static String KM_OPERATIONNAME = "KM_OPERATIONNAME";
    public static String KM_PROJECTNAME = "KM_PROJECTNAME";
    public static final String PORT_ATTR = RunnerPlugin.PLUGIN_ID+".PORT";
	public static final String ATTR_KEEPRUNNING = RunnerPlugin.PLUGIN_ID+ ".KEEPRUNNING_ATTR"; //$NON-NLS-1$
    private static String ATTR_DEFAULT_CLASSPATH = "ATTR_DEFAULT_CLASSPATH";

	public static final String ID_LC_TYPE = "KermetaLaunchConfiguration";

    
	/**
	 * (Eclipse doc) Launches the given configuration in the specified mode, contributing
	 * debug targets to the given launch object. The
	 * launch object has already been registered with the launch manager.
	 * 
	 * @param configuration the configuration to launch
	 * @param mode the mode in which to launch, one of the mode constants
	 * defined by ILaunchManager - RUN_MODE or DEBUG_MODE.
	 * @param launch the launch object to contribute processes and debug
	 *  targets to
	 * @param monitor progress monitor, not used here
	 * @exception CoreException if launching fails
	 * 
	 * @see ILaunchConfigurationDelegate#launch(ILaunchConfiguration, String, ILaunch, IProgressMonitor) 
	 */
	public void launch(
	        ILaunchConfiguration configuration,
	        String mode,
	        ILaunch launch, IProgressMonitor monitor) throws CoreException {
	    
	    // NOTE : "final" forces a copy of the parameters, so that we are sure
	    // that a reference of those params are not stored by the Plugin framework
	    final ILaunchConfiguration fconfiguration = configuration;
	    final String fmode = mode;
	    
	    try
	    {
	        //  If the mode choosen is Run a Kermeta run target is created
	        if (mode.equals(ILaunchManager.RUN_MODE)) 
	        {   
	            
	            //launch.setSourceLocator(new KermetaSourceLocator());
	        
	            //runKermeta(configuration);
	            //runKermeta(configuration);
	            
	            // Set the run target with current launch
	            
	            
	    		IVMInstall install= getVMInstall(configuration);
	    		IVMRunner runner = install.getVMRunner(mode);
	    		if (runner == null) {
	    			abort(MessageFormat.format(Messages.getString("Kermeta.ERR_NOJVM"), new String[]{install.getId()}), null, IJavaLaunchConfigurationConstants.ERR_VM_RUNNER_DOES_NOT_EXIST); //$NON-NLS-1$
	    		}
	    		int port= SocketUtil.findFreePort();
	    		VMRunnerConfiguration runConfig= launchTypes(configuration, mode, port);
	    		setDefaultSourceLocator(launch, configuration);
	    		
	    		launch.setAttribute(PORT_ATTR, Integer.toString(port));
	    		runner.run(runConfig, launch, monitor);		

	        }
	        else
	        {
	            System.out.println("ImplementationError : Debug mode not implemented yet");
	        }
	    }
	    catch (KermetaInterpreterError e)
	    {
	        MessageDialog.openError(new Shell(), "Kermeta interpreter error", e.getMessage());
	    }
	    catch (Exception e)
	    {
	        System.err.println("There is a plugin error :'(");
	        e.printStackTrace();
	    }
	}

	/**
	 * 
	 * @param configuration
	 * @param mode
	 * @param port
	 * @return
	 * @throws CoreException
	 */
	protected VMRunnerConfiguration launchTypes(ILaunchConfiguration configuration,
	        String mode, int port) throws CoreException {
	    File workingDir = verifyWorkingDirectory(configuration);
	    String workingDirName = null;
	    if (workingDir != null) 
	        workingDirName = workingDir.getAbsolutePath();
	    // TODO : get some props.
	    // System.getProperties("java.library.path");
	    // Program & VM args
	    String vmArgs= getVMArguments(configuration);
	    System.out.println("vmArgs : "+vmArgs);
	    ExecutionArguments execArgs = new ExecutionArguments(vmArgs, ""); //$NON-NLS-1$
	    String[] envp= DebugPlugin.getDefault().getLaunchManager().getEnvironment(configuration);
	    
	    // Create a JVM with arguments given in the configuration data
	    VMRunnerConfiguration runConfig= createVMRunner(configuration, port, mode);
	    runConfig.setVMArguments(execArgs.getVMArgumentsArray());
	    runConfig.setWorkingDirectory(workingDirName);
	    runConfig.setEnvironment(envp);
	    
	    Map vmAttributesMap = getVMSpecificAttributesMap(configuration);
	    runConfig.setVMSpecificAttributesMap(vmAttributesMap);
	    
	    String[] bootpath = getBootpath(configuration);
	    runConfig.setBootClassPath(bootpath);
	    
	    
	    return runConfig;
	}

	
	protected VMRunnerConfiguration createVMRunner(ILaunchConfiguration configuration, int port, String runMode) throws CoreException {
		String progArgs= getProgramArguments(configuration);
		String[] classpaths = createClasspath(configuration);
		
		/*VMRunnerConfiguration vmConfig= new VMRunnerConfiguration("fr.irisa.triskell.kermeta.runner.launching.KermetaLauncher",
		        classpaths); //$NON-NLS-1$*/
		VMRunnerConfiguration vmConfig= new VMRunnerConfiguration("fr.irisa.triskell.kermeta.runner.launching.KermetaLauncher",
        classpaths); //$NON-NLS-1$
		
		
		// Insert the program arguments
		Vector argv= new Vector(12);
		ExecutionArguments execArgs = new ExecutionArguments("", progArgs); //$NON-NLS-1$
		String[] pa= execArgs.getProgramArgumentsArray();
		for (int i= 0; i < pa.length; i++) {
			argv.add(pa[i]);
		}
	
		argv.add("-version"); //$NON-NLS-1$
		argv.add("3"); //$NON-NLS-1$
		
		argv.add("-port"); //$NON-NLS-1$
		argv.add(Integer.toString(port));
		//argv("-debugging");
		
		// Zoe's argv
		/*argv.add("-vmargs");
		argv.add("-Djava.library.path=\"/local/Downloads/eclipse/plugins/org.eclipse.swt.gtk_3.0.1/os/linux/x86\"");
	    */
		
		argv.add("-file");
		argv.add(
			configuration.getAttribute(
				KermetaLaunchConfiguration_JVM_200521061432.KM_FILENAME,""));
		
		argv.add("-class");
		argv.add( 
		    configuration.getAttribute(KermetaLaunchConfiguration_JVM_200521061432.KM_CLASSQNAME, ""));
		
		argv.add("-operation");
		argv.add( 
		    configuration.getAttribute(KermetaLaunchConfiguration_JVM_200521061432.KM_OPERATIONNAME, ""));
		
		if (keepAlive(configuration) && runMode.equals(ILaunchManager.DEBUG_MODE))
			argv.add(0, "-keepalive"); //$NON-NLS-1$
		
		String[] args= new String[argv.size()];
		argv.copyInto(args);
		vmConfig.setProgramArguments(args);
		return vmConfig;
	}

	/**
	 * Create the classpath for the new JVM to be launched. 
     * @param configuration
     * @return
     */
    private String[] createClasspath(ILaunchConfiguration configuration)
    {
		URL url = null;
        /*try {
            url = new URL("file:///udd/zdrey/Workspaces/KMWorkspace/fr.irisa.triskell.kermeta.runner/");
        } catch (MalformedURLException e2) {
            // TODO Auto-generated catch block
            e2.printStackTrace();
        }*/
        url = Platform.getBundle(RunnerPlugin.PLUGIN_ID).getEntry("/");
		String[] cp = new String[] {};
        try {
            cp = getClasspath(configuration);
        } catch (CoreException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        
        IVMInstall jre = JavaRuntime.getDefaultVMInstall();
        
        List classpath = new ArrayList();
        
		try
		{
	
		   IPath systemLibsPath = new Path(JavaRuntime.JRE_CONTAINER);
		   IRuntimeClasspathEntry systemLibsEntry =
		       JavaRuntime.newRuntimeContainerClasspathEntry(systemLibsPath,
		               IRuntimeClasspathEntry.STANDARD_CLASSES);
		   
		   classpath.add(systemLibsEntry.getMemento());
		    
		   
		   //		 THIS IS ONLY A TEST!!!
			classpath.add(Platform.asLocalURL(new URL(url, "runner_kermeta.jar")).getFile());

		    ArrayList bundleEntries = getGlobalPluginClassPath();
		    System.out.println("found entries : "+ bundleEntries.size());
		    classpath.addAll(bundleEntries);
		   
		   configuration.getWorkingCopy().setAttribute(KermetaLaunchConfiguration_JVM_200521061432.ATTR_CLASSPATH, classpath);
		   configuration.getWorkingCopy().setAttribute(KermetaLaunchConfiguration_JVM_200521061432.ATTR_DEFAULT_CLASSPATH = "ATTR_DEFAULT_CLASSPATH", false);
		}
		catch (Exception e)
		{
		    e.printStackTrace();
		}
		
		
		String [] classPathArray = (String[]) classpath.toArray(new String[classpath.size()]) ;
		return classPathArray;

    }


    protected boolean keepAlive(ILaunchConfiguration config) {
		try {
			return config.getAttribute(ATTR_KEEPRUNNING, false);
		} catch(CoreException e) {
		}
		return false;
	}
	
    /**
     * This method run the Kermeta interpreter, according to the data given by
     * the user through the launch configuration window.
     * @param configuration
     * @param mode
     */
    private void runKermeta(ILaunchConfiguration configuration) {
        try {
            
            
            String fileNameString = configuration.getAttribute(KM_FILENAME, "");
            String classQualifiedNameString = configuration.getAttribute(KM_CLASSQNAME, "");
            String operationString = configuration.getAttribute(KM_OPERATIONNAME, "");
           
            IFile selectedFile = null;
		    IResource iresource = RunnerPlugin.getWorkspace().getRoot().findMember(fileNameString);
		    if (iresource instanceof IFile)
		        selectedFile = (IFile) iresource;
		    else
		    {  // TODO : throw an exception!
		    }
            KermetaConsole console = new KermetaConsole();
            // Remove the preceding consoles
            console.removeCurrentConsole();
            // Add a MessageConsole
            console.addConsole();	
	        try
	        {
	            
	            String uri = "platform:/resource/" + selectedFile.getFullPath().toString();
	            
	            // 	Get the values given by the user in the runPopupDialog
	            KermetaInterpreter interpreter = new KermetaInterpreter(uri);
	            
	            interpreter.setEntryPoint(classQualifiedNameString, operationString);
	            interpreter.setKStream(console);     
    	        interpreter.launch();
    	
	        }
	        catch (KermetaRaisedException kerror)
	        {
	            console.print("Uncaught exception in Kermeta program\n");
	            console.print(kerror.getMessage());
	        }
	        catch (KermetaInterpreterError ierror)
	        {
	            console.print("Uncaught exception in Kermeta interpreter:\n");
	            console.print(ierror.getMessage());
	        }
	        catch (Throwable e)
	        {
	            console.print("\nKermetaInterpreter internal error \n" +
	            		"-------------------------------------------\n");
	            console.print(e.getMessage());
	            e.printStackTrace();
	        }
            
            // TODO Auto-generated method stub
        } catch (CoreException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
	public String[] getClasspath(ILaunchConfiguration configuration)
	throws CoreException {
	    IRuntimeClasspathEntry[] entries = JavaRuntime
	    .computeUnresolvedRuntimeClasspath(configuration);
	    //JavaRuntime.getClasspathProvider()
	    
	    entries = JavaRuntime.resolveRuntimeClasspath(entries, configuration);
	    List userEntries = new ArrayList(entries.length);
	    for (int i = 0; i < entries.length; i++) {
	        if (entries[i].getClasspathProperty() == IRuntimeClasspathEntry.USER_CLASSES) {
	            String location = entries[i].getLocation();
	            if (location != null) {
	                userEntries.add(location);
	            }
	        }
	        else
	        {
	          //  userEntries.add(entries[i].getLocation());
	        }
	    }
	    //JavaRuntime.
	    return (String[]) userEntries.toArray(new String[userEntries.size()]);
	}


	public ArrayList getGlobalPluginClassPath()
	{
	    ArrayList rb = new ArrayList();
	    ArrayList result = getPluginClassPath(RunnerPlugin.getDefault().getBundle(), rb);
	    return result;
	}
	
	
	/**
	 * @return the plugin complete class path needed by the New launched JVM
	 */
	public ArrayList getPluginClassPath(Bundle bundle, ArrayList requiredBundles)
	{
	    String header = (String)bundle.getHeaders().get(Constants.REQUIRE_BUNDLE);
		ManifestElement[] elements = null;
		ArrayList result = new ArrayList();
		try
		{
		   elements = ManifestElement.parseHeader(Constants.REQUIRE_BUNDLE, header);
		
		} catch (BundleException e) {
		    KermetaUnit.internalLog.error("A bundle jar was not found : "+e.getMessage());
		}
		if (elements == null) 
		    return null;
		
		// Parse all the required bundles
		for (int i= 0; i< elements.length; i++)
		{   // id
		    String bundleid = elements[i].getValue();// the prerequisite plug-in id
		    
		    bundle = Platform.getBundle(bundleid);
		    if (bundle!=null)
		    {
		        // System.out.println(bundle.getHeaders().get(Constants.REQUIRE_BUNDLE));
		    	// For each required bundle, find the associated classpath
		        ArrayList classpaths = getBundleClasspath(bundle) ;
		        result.addAll(classpaths);
		        
		        // Already got the required bundle classpaths?
		        if  (!requiredBundles.contains(bundle.getLocation()))
		        {
		            requiredBundles.add(bundle.getLocation());
		            // 	Get sub required bundle
		            ArrayList subresult = getPluginClassPath(bundle, requiredBundles);
		            if (subresult!=null)
		                result.addAll(subresult);
		        }
		    }
		}
		// Manually add swt before we know how to resolve a path
		result.add("file:/local/Downloads/eclipse/plugins/org.eclipse.swt.gtk_3.0.2/ws/gtk/swt.jar");
		result.add("file:/local/Downloads/eclipse/plugins/org.eclipse.swt.gtk_3.0.2/ws/gtk/swt-pi.jar");
		result = removeDuplicateJars(result);
		return result;
	}
	
	/** *
	 * Get recursively the .jar that define the plugins represented by the bundle given in argument
	 * @param bundle
	 * @param result an Arraylist that contains IPaths
	 * @return
	 */
	public ArrayList getBundleClasspath(Bundle bundle)
	{
	    
	    ArrayList result = new ArrayList();
	    String header = (String)bundle.getHeaders().get(Constants.BUNDLE_CLASSPATH);
	    ManifestElement[] elements = null;
		try
		{
		   elements = ManifestElement.parseHeader(Constants.BUNDLE_CLASSPATH, header);
		
		} catch (BundleException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		if (elements == null) 
		{
		    return new ArrayList();
		}
		
		for (int i= 0; i< elements.length; i++)
		{   
		    // id
		    String bundleid = elements[i].getValue(); // the prerequisite plug-in id
		    // is the value a .jar? // FIXME : 2nd test is dirty!!!!
		    if (bundleid.endsWith(".jar"))
		    {   
		        try {
		            // Resolve the classpath location :
		            URL jarURL = new URL(bundle.getEntry("/"), bundleid);
		            //System.out.println("url : "+Platform.asLocalURL(jarURL));
                    IPath path = new Path(Platform.asLocalURL(jarURL).getPath());
                    
                    // It does seem to be usefdul
                    IRuntimeClasspathEntry bundleREntry =
         		       JavaRuntime.newRuntimeContainerClasspathEntry(path,
         		               IRuntimeClasspathEntry.USER_CLASSES);
                    
    		       // result.add(bundleREntry.getMemento());
                    
                    result.add(Platform.asLocalURL(jarURL).toString());
                } catch (IOException e1) {
                    KermetaInterpreter.internalLog.warn("A jar was not found : "+ e1.getMessage());
                    System.err.println("IOException : the jar was not found : "+ e1.getMessage());
                }
                catch (CoreException ce)
                { ce.printStackTrace();}
		    }
		   // System.out.println("elemattr:"+elements[i].getAttribute(Constants.BUNDLE_CLASSPATH));
		    
		}
		return result;
	}
	
	/**
	 * Remove all duplicated objects in jarlist and return a new one with unique objects.
	 */
	protected ArrayList removeDuplicateJars(ArrayList jarlist)
	{
	    ArrayList new_jarlist = new ArrayList();
	    int jl_size = jarlist.size(); 
	    for (int i=0; i<jl_size; i++)
	    {
	        Object e = jarlist.get(i);
	        if (!new_jarlist.contains(e))
	            new_jarlist.add(e);
	    }
	    return new_jarlist;
	}
	
}
