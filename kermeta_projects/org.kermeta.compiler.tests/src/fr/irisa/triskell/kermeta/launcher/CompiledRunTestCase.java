/* $Id: CompiledRunTestCase.java,v 1.5 2009-02-16 16:53:29 cfaucher Exp $
 * Project    : fr.irisa.triskell.kermeta.test
 * File       : CompiledRunTestCase.java
 * License    : EPL
 * Copyright  : IRISA / INRIA
 * -------------------------------------------------------------------
 * Creation date : 27 Oct. 2008
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr> 
 */
package fr.irisa.triskell.kermeta.launcher;


import java.io.File;
import java.io.IOException;

import kermeta.compiler.runner.Main__main_km2ecore_behaviorJava__Runner;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.MultiRule;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.IVMRunner;
import org.eclipse.jdt.launching.JavaRuntime;
import org.kermeta.compiler.Kmt2KmExporter4Compiler;
import org.kermeta.compiler.tests.CompilerTestsPlugin;
import org.kermeta.core.helper.FileHelper;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.simk.presentation.SimkEditor;
import org.osgi.framework.Bundle;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;

//import javax.tools.JavaCompiler;

/**
 * Launcher for Kermeta compiler then run the resulting code. 
 */
public class CompiledRunTestCase extends AbstractRunTestCase {

    public CompiledRunTestCase(String themainClassValue,
			String themainOperationValue, AbstractRunJunitFactory thecontainerTestSuite, 
			boolean constraintExecution, boolean isFirstOfSerie, boolean isLastOfSerie) {
		super(themainClassValue, themainOperationValue, thecontainerTestSuite,
				constraintExecution, isFirstOfSerie, isLastOfSerie);
	}

    
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        
        if(isFirstOfSerie){
        	// need to compile everything
        	try {

        		CompiledRunJunitFactory crjf =(CompiledRunJunitFactory) this.containerTestSuite;
        		GeneratePluginCodeJob job = new GeneratePluginCodeJob("Generate plugin code", crjf);
        		// reserves exclusive write access to the resource we are updating by associating a scheduling rule with the job        		 
        		String sourceFileName = crjf.getUnitURI().replaceAll("platform:/plugin", "platform:/resource");
        		IFile source_file = ResourceHelper.getIFile(sourceFileName);
        		//job.setRule(source_file.getProject()); 
        		job.schedule();
        		job.join();
        		if(job.catchedError != null){
	     			throw job.catchedError;
	     		}
	     		if(job.catchedException != null){
	     			throw job.catchedException;
	     		}
        		/*
        		prepareRuntimeWorkbenchSourceProject();
        		
        		// make sure to use the workbench version
        		String sourceFileName = crjf.getUnitURI().replaceAll("platform:/plugin", "platform:/resource");
        		IFile source_file = ResourceHelper.getIFile(sourceFileName);
        		        		        		
        		if(!source_file.isAccessible()){
        			throw new Exception("prepareRuntimeWorkbench failed : file not accessible : " + source_file.getFullPath());
        		}
        		//  cannot use the ResourceHelper here because the file doesn't exist yet
        		IFile km_merged_file = ResourcesPlugin.getWorkspace().getRoot().getFile(source_file.getFullPath()
    					.removeFileExtension().addFileExtension("km"));
        		
        		mergeKm(source_file, km_merged_file);
        		
        		if(!km_merged_file.exists()){
        			throw new Exception("MergeKm failed : no file was generated : " + km_merged_file.getFullPath());
        		}
        		
        		IFile ecore_file = ResourcesPlugin.getWorkspace().getRoot().getFile(source_file.getFullPath()
    					.removeFileExtension().addFileExtension("ecore"));
        		
        		kmToEcore(km_merged_file);
        		
        		if(!ecore_file.exists()){
        			throw new Exception("KmToEcore failed : no file was generated : " + ecore_file.getFullPath());
        		}
        		
        		crjf.generatedPluginProject = ecoreToJavaPlugin(ecore_file);
        		*/
        		compileJavaPlugin(crjf.generatedPluginProject);
    			internalLog.info("The compilation process is complete");
    			
        		//crjf.generatedPluginProject = ResourceHelper.getIProject("org.kermeta.002_testarithm.main.compiled");
    		} catch (Error e) {
    			// if the first of Serie SetUp failed, all the serie must fail too
    			this.containerTestSuite.firstOfSerieSetUpFailedError = e;
    			throw e;
    		} catch (Exception e) {
    			// if the first of Serie SetUp failed, all the serie must fail too
    			this.containerTestSuite.firstOfSerieSetUpFailedException = e;
    			throw e;
    		}
        }
        else {
        	// check if the FirstOfSerie SetUp failed
        	if (this.containerTestSuite.firstOfSerieSetUpFailedException != null) 
        		throw new Exception("FirstOfSerieSetUpFailed",this.containerTestSuite.firstOfSerieSetUpFailedException);
        	if (this.containerTestSuite.firstOfSerieSetUpFailedError != null) 
            		throw new Exception("FirstOfSerieSetUpFailed",this.containerTestSuite.firstOfSerieSetUpFailedError);
        }
        
        
    }
    
    /**
     * Copy the test project from the plugin to the workspace 
     * @throws IOException 
     */
    protected void prepareRuntimeWorkbenchSourceProject() throws Exception{
    	if(!ResourcesPlugin.getWorkspace().getRoot().isAccessible()){
    		throw new Exception("This test must be run into a running eclipse in order to access its workspace");
    	}
    	// copy the plugin into workspace    	
		CompiledRunJunitFactory crjf =(CompiledRunJunitFactory) this.containerTestSuite;
		Bundle bundle = Platform.getBundle(crjf.test_container_plugin_id);
    	File bundlefile = FileLocator.getBundleFile(bundle);
    	
    	File projectdirectory;    	
		IProject project = ResourceHelper.getIProject(crjf.test_container_plugin_id);
		if ( ! project.exists()) {
			// We make sure that the project is created from this point forward.
			project.create(new NullProgressMonitor());
		}
		project.open(new NullProgressMonitor());
		projectdirectory = ResourcesPlugin.getWorkspace().getRoot().getRawLocation().append(project.getFullPath()).toFile();
		//project.getRawLocationURI()
    	if(bundlefile.isDirectory()){
    		FileHelper.copyDirectory(bundlefile, projectdirectory);
    	}
    	else {
    		// this is a jar
    		//URL interpreterZipUrl = FileLocator.find(Platform.getBundle(bundleName), new Path(zipLocation), null);
    		org.kermeta.core.helper.ZipHelper.unzip(bundlefile.toURI().toURL(), projectdirectory.toString(), null);
    	}
		
    	project.open(new NullProgressMonitor());
		// in order to make sure the project natures are correctly identified close and reopen the project
		project.close(new NullProgressMonitor());
		project.open(new NullProgressMonitor());
		project.refreshLocal(IFile.DEPTH_INFINITE, new NullProgressMonitor());
    }
    /**
     * Create the km Merged from the source
     * @throws Exception 
     */
    protected void mergeKm(IFile source_file, IFile km_merged_file) throws Exception{
    	//The following 2 lines are required to set rightly the Simk plugin
		Platform.getBundle("org.kermeta.simk").start();
		@SuppressWarnings("unused")
		SimkEditor simkEditor = new SimkEditor();
		

		Kmt2KmExporter4Compiler kermetaCompiler = new Kmt2KmExporter4Compiler(source_file);
		
		String uri = "platform:/resource" + source_file.getFullPath().toString();
		KermetaUnit kermetaUnit = LoaderPlugin.getDefault().load(uri, null);
		if(kermetaUnit.isErroneous()) throw new Exception(kermetaUnit.getMessages().get(0).getValue());
		// Generate the km merged and the traceability model
		kermetaCompiler.writeUnit(kermetaUnit, km_merged_file);

		km_merged_file.getProject().refreshLocal(IFile.DEPTH_INFINITE, new NullProgressMonitor());
    }
    
    /**
     * Create the ecore from the km merged
     * @throws CoreException 
     */
    protected void kmToEcore(IFile source_km_file) throws CoreException{
    	String[] _args = new String[1];
		_args[0] = source_km_file.getFullPath().toString();
		Main__main_km2ecore_behaviorJava__Runner.main_forDeployedVersion(_args);

		source_km_file.getProject().refreshLocal(IFile.DEPTH_INFINITE, new NullProgressMonitor());
    }
    
    /**
     * Create the Java Plugin from the ecore
     */
    protected IProject ecoreToJavaPlugin(IFile source_ecore_file) throws Exception{
    	// Run the generation of Java Classes and the required helpers (Simk)
		
		IProgressMonitor monitor = new NullProgressMonitor();
		org.kermeta.compiler.Compiler ecore2javacompiler = new org.kermeta.compiler.Compiler(source_ecore_file, monitor);
		ecore2javacompiler.run();
		IProject project = ResourceHelper.getIProject(ecore2javacompiler.getCompiledPluginId());
		if ( ! project.exists()) {
			throw new Exception("ecoreToJavaPlugin failed : no project was generated : " + project.getFullPath());   		
		}
		//project.refreshLocal(IFile.DEPTH_INFINITE, new NullProgressMonitor());
		return project;
    }

    /**
     * Compile the generated java code
     * @throws CoreException 
     */
    protected void compileJavaPlugin(IProject generatedProject) throws Exception{
    	try {
			generatedProject.build(IncrementalProjectBuilder.INCREMENTAL_BUILD, new NullProgressMonitor());
			if(generatedProject.findMaxProblemSeverity(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE) == IMarker.SEVERITY_ERROR){
				throw new Exception("compileJavaPlugin failed :  generated project has error(s) : " + generatedProject.getFullPath());
			}
		} catch (CoreException e) {
			throw new Exception("compileJavaPlugin failed :  generated project didn't compile successfuly : " + generatedProject.getFullPath(),e);
		}

    }
    
    
    
    protected void tearDown() throws java.lang.Exception {
        super.tearDown();
    	if(isLastOfSerie){
    		containerTestSuite.resetUnit();  // ask to free the memory of the unit
        	// we can clean some other stuff here
    	}
    	
        // not needed anymore now
        containerTestSuite = null;       
    }
    
	/**
     * This method is used for a kermeta program when it does not contain the
     * tag "testOperation". But when the tag "testOperation" is defined, it
     * means that we have to execute all the operation prefixed by
     * <code>test</code>. Otherwise, there should be a "mainOperation" to
     * launch (which name is defined in the <code>mainOperation</code> tag
     * @throws Exception 
     */
    public void runTest() throws Exception {
    	CompiledRunJunitFactory crjf =(CompiledRunJunitFactory) this.containerTestSuite;
    	
    	String javaMainClass = getJavaMainClass();
    	
		IJavaProject javaProject = JavaCore.create(crjf.generatedPluginProject);
        if (javaProject == null)
        	throw new Exception("test failed : project isn't a java project : " + crjf.generatedPluginProject.getFullPath());;

    	IVMInstall vmInstall = JavaRuntime.getVMInstall(javaProject);
    	   if (vmInstall == null)
    	      vmInstall = JavaRuntime.getDefaultVMInstall();
    	   if (vmInstall != null) {
    	      IVMRunner vmRunner = 
    	    	  vmInstall.getVMRunner(ILaunchManager.RUN_MODE);
    	      if (vmRunner != null) {
    	         String[] classPath = null;
    	         try {
    	            classPath = JavaRuntime.computeDefaultRuntimeClassPath(javaProject);
    	         } catch (CoreException e) { }
    	         if (classPath != null) {
    	        	/*URL[] urls = new URL[classPath.length];
    	     		for (int i=0; i<classPath.length; i++ ) {
    	     			urls[i] = new URL("file:///" +classPath[i]);
    	     		}*/
    	     		
    	     		//_interpreter.addToClasspath(urls);		
    	     		
    	     		// URLClassLoader cl = new URLClassLoader(urls,
    	     		// this.getContextClassLoader());
    	     		// use this object class loader as parent (instead of the default thread
    	     		// class loader)
    	     		// because it also contains the plugin classloader rules
    	     		//URLClassLoader cl = new URLClassLoader(urls, this.getClass()
    	     		//		.getClassLoader());
    	     		
    	     		//_interpreter.setContextClassLoader(cl);
    	            /*VMRunnerConfiguration vmConfig = 
    	               new VMRunnerConfiguration(javaMainClass, classPath);
    	            ILaunch launch = new Launch(null, ILaunchManager.RUN_MODE, null);
    	            vmRunner.run(vmConfig, launch, null);
    	            */
    	     		
    	     		InvokeCompiledCodeJob job = new InvokeCompiledCodeJob(javaMainClass, classPath);
    	     		job.schedule();
    	     		job.join();
    	     		if(job.catchedError != null){
    	     			throw job.catchedError;
    	     		}
    	     		if(job.catchedException != null){
    	     			throw job.catchedException;
    	     		}
    	     		
    	         }
    	         else{
    	        	 throw new Exception("test failed : cannot get classpath for java project : " + crjf.generatedPluginProject.getFullPath());
    	         }
    	      }
    	   }
    }

    /**
     * Returns the name of the java class that must be launched
     * @return
     */
    protected String getJavaMainClass(){
    	String javaMainClass = mainClassValue; //.replaceAll("::", ".");
    	// trim the class name
    	javaMainClass = mainClassValue.substring(0, mainClassValue.lastIndexOf("::")+2);
    	javaMainClass = javaMainClass.replaceAll("::", ".");
    	javaMainClass += "runner.";
    	javaMainClass += mainClassValue.substring(mainClassValue.lastIndexOf("::")+2, mainClassValue.length());    	
    	javaMainClass += "__" + mainOperationValue+"__Runner";
    	return javaMainClass;
    	
    }
    
    
    public class GeneratePluginCodeJob extends WorkspaceJob{

    	public Exception catchedException;
    	public Error catchedError;
    	
    	CompiledRunJunitFactory crjf;
    	
		public GeneratePluginCodeJob(String name, CompiledRunJunitFactory _crjf) {
			super(name);
			crjf = _crjf;
		}

		@Override
		public IStatus runInWorkspace(IProgressMonitor monitor) {
			try{
	    		
	    		prepareRuntimeWorkbenchSourceProject();
	    		
	    		// make sure to use the workbench version
	    		String sourceFileName = crjf.getUnitURI().replaceAll("platform:/plugin", "platform:/resource");
	    		IFile source_file = ResourceHelper.getIFile(sourceFileName);
	    		        		        		
	    		if(!source_file.isAccessible()){
	    			throw new Exception("prepareRuntimeWorkbench failed : file not accessible : " + source_file.getFullPath());
	    		}
	    		//  cannot use the ResourceHelper here because the file doesn't exist yet
	    		IFile km_merged_file = ResourcesPlugin.getWorkspace().getRoot().getFile(source_file.getFullPath()
						.removeFileExtension().addFileExtension("km"));
	    		
	    		mergeKm(source_file, km_merged_file);
	    		
	    		if(!km_merged_file.exists()){
	    			throw new Exception("MergeKm failed : no file was generated : " + km_merged_file.getFullPath());
	    		}
	    		
	    		IFile ecore_file = ResourcesPlugin.getWorkspace().getRoot().getFile(source_file.getFullPath()
						.removeFileExtension().addFileExtension("ecore"));
	    		
	    		kmToEcore(km_merged_file);
	    		if(!ecore_file.exists()){
	    			throw new Exception("KmToEcore failed : no file was generated : " + ecore_file.getFullPath());
	    		}
	    		
	    		crjf.generatedPluginProject = ecoreToJavaPlugin(ecore_file);
			}
			catch (Exception e){
				catchedException = e;
				return new Status(IStatus.OK, CompilerTestsPlugin.PLUGIN_ID, "Exception received ", e);
			}
			catch (Error ome){
				catchedError = ome;
				return new Status(IStatus.OK, CompilerTestsPlugin.PLUGIN_ID, "Error received ", ome);
			}
			return new Status(IStatus.OK,"End", null);
		}
    	
    }
}