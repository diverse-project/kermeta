package org.kermeta.language.scalacompiler.test.checktrace.interpreted;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.junit.Test;
import org.kermeta.interpreter.api.Interpreter;
import org.kermeta.interpreter.api.InterpreterMode;
import org.kermeta.interpreter.api.InterpreterOptions;
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.test.utils.ExternRunner;
import org.kermeta.test.utils.FileUtility;

import fr.irisa.triskell.kermeta.modelhelper.URIMapUtil;


import junit.framework.TestCase;

/**
 * This class will 
 *   run the current scala compiler (in kmt interpreted mode) on the test km model
 *   compile the resulting scala code
 *   check that the resulting trace is conform to the expected trace
 * @author dvojtise
 *
 */
public class TestInterpretedScalaCompilerTraceExecution extends TestCase{
	
	public static final String TESTS_PROJECT_PATH = "platform:/resource/org.kermeta.language.scalacompiler.test/";
	public static final String SCALA_COMPILER_KMT_LOCATION = "platform:/resource/org.kermeta.language.scalacompiler.model/src/kmt/scalacompiler/ScalaCompiler.kmt";	
	public static final String SCALA_COMPILER_MAINCLASS = "scalacompiler::ScalaCompiler";	
	public static final String SCALA_COMPILER_MAINOPERATION = "compile";
	
	public TestInterpretedScalaCompilerTraceExecution(){
		initialize();
	}
	
	public void process(String testcase, String outputLocation) {

		String basePATH = TESTS_PROJECT_PATH;
		basePATH = basePATH.substring(0, basePATH
				.lastIndexOf("org.kermeta.language.scalacompiler.test"));

		/* Step 1 Launch Compiler in Kermeta interpreted mode*/
		/*  */
		try{
			Interpreter interpreter = null;
			// Map<String, Object> options = new HashMap<String, Object>();
	        // options.put( InterpreterOptions.MERGE, false);
	        interpreter = new Interpreter( SCALA_COMPILER_KMT_LOCATION, InterpreterMode.RUN, null );	
	        interpreter.setErrorStream( System.out );
	       	interpreter.setOutputStream( System.out );
	       	interpreter.setInputStream( System.in );
	       	interpreter.setEntryPoint(SCALA_COMPILER_MAINCLASS, SCALA_COMPILER_MAINOPERATION);
	       	String[] parameters = new String[2];
			parameters[0] = testcase + ".km";
			parameters[1] = outputLocation;
			interpreter.setParameters(parameters);
			interpreter.launch();
		}catch(Throwable e){
			e.printStackTrace();
			assertTrue(false);
		}
		// Compiler compilo = new Compiler();
		// compilo.compile(testcase + ".km");

		/* Step 2 Compile and run Software */
		try {
			File f = new File("outputStream");
			if (f != null) {
				f.delete();
			}
		} catch (Exception e) {
		}
		StringBuilder runningCommand = new StringBuilder();
		runningCommand.append("mvn clean scala:compile scala:run -B ");
		runningCommand.append("--file " + basePATH
				+ "fr.irisa.triskell.kermeta.scala.compilo.output/pom.xml");
		System.out.println("Maven Task Executing = "
				+ runningCommand.toString());
		ExternRunner.launch(runningCommand.toString());

		try {
			FileUtility.compareFiles("outputStream", testcase + ".trace");
			assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}

		File f = new File("outputStream");
		if (f != null) {
			f.delete();
		}
	}
	static private IOPlugin ioPlugin;
	private void initialize() {
/*
    	// find the log4j configuration file
    	String modelPluginPath = fr.irisa.triskell.kermeta.model.plugin.ModelPlugin.class.getProtectionDomain()
														.getCodeSource().getLocation().toExternalForm();
    	modelPluginPath = modelPluginPath.replace("build/class/", "");
    	modelPluginPath = modelPluginPath.replace("file:/", ""); // remove leading protocol that isn't supported by LogConfigurationHelper
    	System.setProperty(org.kermeta.log4j.util.LogConfigurationHelper.DefaultKermetaConfigurationFilePropertyName,
    			modelPluginPath + "kermeta_log4j_configuration.xml");
    	// reload conf in case it was loaded before with another configuration
    	org.kermeta.log4j.util.LogConfigurationHelper.configureLog4JLogger(org.kermeta.log4j.util.LogConfigurationHelper.DefaultKermetaConfigurationFilePropertyName);
  */  	
    	
    	// initialize URIMAP
    	// platform:/plugin is were plugin IO lives
    	String ioPluginPath = IOPlugin.class.getProtectionDomain()
											.getCodeSource().getLocation().toExternalForm();
    	ioPluginPath = ioPluginPath.replace("build/class/", "../");
    	URIMapUtil.addMapEntry(ExtensibleURIConverterImpl.URI_MAP, "platform:/plugin/", ioPluginPath);
    	// internalLog.info("   " + "platform:/plugin/ => " + ioPluginPath);

    	// platform:/resource is were current class lives
    	String selfPath = this.getClass().getProtectionDomain()
											.getCodeSource().getLocation().toExternalForm();
    	selfPath = selfPath.replace("target/classes/", "../");
    	URIMapUtil.addMapEntry(ExtensibleURIConverterImpl.URI_MAP, "platform:/resource/", selfPath);
    	// internalLog.info("   " + "platform:/resource/ => " + selfPath);

    	// kconf:/loader/ is were plugin Loader lives
    	String loaderPluginPath = LoaderPlugin.class.getProtectionDomain()
											.getCodeSource().getLocation().toExternalForm();
    	loaderPluginPath = loaderPluginPath.replace("bin/", "");
    	URIMapUtil.addMapEntry(ExtensibleURIConverterImpl.URI_MAP, "kconf:/loader/", loaderPluginPath+"instances/");
    	// internalLog.info("   " + "kconf:/loader/ => " + loaderPluginPath+"instances/");
    	
    	if ( ioPlugin == null ) {		
    		IOPlugin.LOCAL_USE = true;
    		ioPlugin = IOPlugin.getDefault();	
    	}

    }
	
	@Test
	public void test000HelloWorld() {
		process(TESTS_PROJECT_PATH+ "src/test/resources/tests/000HelloWorld", 
				"platform:/resource/fr.irisa.triskell.kermeta.scala.compilo.output/src");
	}

}
