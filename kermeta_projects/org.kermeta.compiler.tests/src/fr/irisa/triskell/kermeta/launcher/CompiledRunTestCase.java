/* $Id: CompiledRunTestCase.java,v 1.1 2008-10-31 14:03:13 dvojtise Exp $
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
import java.util.HashMap;
import java.util.Map;

import kermeta.compiler.runner.Main__main_km2ecore_behaviorJava__Runner;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.ResourceLocator;
import org.kermeta.compiler.KermetaCompiler;
import org.kermeta.core.helper.FileHelper;
import org.kermeta.core.helper.ZipHelper;
import org.kermeta.interpreter.api.Interpreter;
import org.kermeta.interpreter.api.InterpreterMode;
import org.kermeta.interpreter.api.InterpreterOptions;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.simk.presentation.SimkEditor;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleException;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.runtime.RuntimeObjectImpl;

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
        		
        		prepareRuntimeWorkbenchSourceProject();
        		
        		// make sure to use the workbench version
        		String sourceFileName = this.containerTestSuite.getUnitURI().replaceAll("platform:/plugin", "platform:/resource");
        		IFile source_file = ResourceHelper.getIFile(sourceFileName);
        		IFile km_merged_file = ResourceHelper.getIFile(source_file.getFullPath()
    					.removeFileExtension().addFileExtension("km")
    					.toString());
        		
        		mergeKm(source_file, km_merged_file);
        		
        		IFile ecore_file = ResourceHelper.getIFile(source_file.getFullPath()
    					.removeFileExtension().addFileExtension("ecore")
    					.toString());
        		
        		kmToEcore(km_merged_file);
        		
        		
        		ecoreToJavaPlugin(ecore_file);
        		
        		compileJavaPlugin();
    			internalLog.info("The compilation process is complete");
    						
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
		SimkEditor simkEditor = new SimkEditor();
		

		KermetaCompiler kermetaCompiler = new KermetaCompiler(source_file);
		
		String uri = "platform:/resource" + source_file.getFullPath().toString();
		KermetaUnit kermetaUnit = LoaderPlugin.getDefault().load(uri, null);
		
		// Generate the km merged and the traceability model
		kermetaCompiler.writeUnit(kermetaUnit, km_merged_file);
    }
    
    /**
     * Create the ecore from the km merged
     */
    protected void kmToEcore(IFile source_km_file){
    	String[] _args = new String[1];
		_args[0] = source_km_file.getFullPath().toString();
		Main__main_km2ecore_behaviorJava__Runner.main_forDeployedVersion(_args);
    }
    
    /**
     * Create the Java Plugin from the ecore
     */
    protected void ecoreToJavaPlugin(IFile source_ecore_file) throws Exception{
    	// Run the generation of Java Classes and the required helpers (Simk)
		
		IProgressMonitor monitor = new NullProgressMonitor();
		org.kermeta.compiler.Compiler ecore2javacompiler = new org.kermeta.compiler.Compiler(source_ecore_file, monitor);
		ecore2javacompiler.run();
    }

    /**
     * Compile the generated java code
     */
    protected void compileJavaPlugin(){

		// compile the java code into .class
//		internalLog.debug("compiling java into bytecode...");
//		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler(); 
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
    public void runTest() throws KermetaRaisedException {
    	//does the set up correctly ended ?
    	// if not, fail 
    	
    	
    /*	try {    		 			
    		interpreter.setEntryPoint(mainClassValue, mainOperationValue);
    		interpreter.launch();
    	} catch(KermetaRaisedException e){
    		// If this is a kermeta assertion that failed, then the Test must fail
    		Class t_target=(Class)e.raised_object.getMetaclass().getKCoreObject();        	
    		String exceptionTypeName = t_target.getTypeDefinition().getName();
    		if(exceptionTypeName.compareTo("AssertionFailedError") == 0){
    			fail(e.toString());
    		}
    		//	 otherwise it must be an error, so just forward the exception
    		else throw e;
    		
    	} */
    }

}