/* $Id: RunCommandLine.java,v 1.5 2008-07-22 15:09:48 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta.interpreter
 * File       : RunCommandLine.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 27 avr. 2005
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 *        <desription.text> 
 */
package org.kermeta.interpreter.api;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.security.CodeSource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

import org.apache.commons.logging.Log;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.launcher.CommandLineOptions.Option_C;
import fr.irisa.triskell.kermeta.launcher.CommandLineOptions.Option_H;
import fr.irisa.triskell.kermeta.launcher.CommandLineOptions.Option_K;
import fr.irisa.triskell.kermeta.launcher.CommandLineOptions.Option_M;
import fr.irisa.triskell.kermeta.launcher.CommandLineOptions.Option_Merged;
import fr.irisa.triskell.kermeta.launcher.CommandLineOptions.Option_O;
import fr.irisa.triskell.kermeta.launcher.CommandLineOptions.Option_P;
import fr.irisa.triskell.kermeta.launcher.CommandLineOptions.Option_PlatformMapping;
import fr.irisa.triskell.kermeta.launcher.CommandLineOptions.Option_TypeChecked;
import fr.irisa.triskell.kermeta.launcher.CommandLineOptions.Option_U;
import fr.irisa.triskell.kermeta.modelhelper.URIMapUtil;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.RuntimeObjectImpl;

import org.kermeta.log4j.util.LogConfigurationHelper;

import fr.irisa.triskell.utils.argumentsreader.CheckOption;
import fr.irisa.triskell.utils.argumentsreader.NoOption;
import fr.irisa.triskell.utils.argumentsreader.Option;

/**
 * Start a Kermeta program from the command line
 *
 */
public class RunCommandLine {
	
    protected Interpreter _interpreter;

    protected String[] theArgs;
    
    protected CheckOption checkOption;
    
    public int nbOptionErrors=0;
    
    protected String unitURI = null;
    
    protected String className = null;
    
    protected String operationName = null;
    
    protected String kermetaStandardURI = null;
    
    protected boolean _merged = false;
    
    protected boolean _typechecked = false;
    
    protected String[] _parameters;
    
    protected boolean initialized = false;
    
    protected boolean logExecutionTime = false;
    
	/** Logger to get the error of this launcher */
	final static public Log internalLog = LogConfigurationHelper.getLogger("KMT.launcher");

    public RunCommandLine(String[] args) {
	    super();
	    theArgs = args;
	    //	  We build the object that will check the arguments with the wanted options.
		checkOption = new CheckOption (
			new Option[] {
				new NoOption (new Vector<String>()),
				new Option_C (new Vector<String>()),
				new Option_H (),
				new Option_P (),
				new Option_K (new Vector<String>()),
				new Option_O (new Vector<String>()),
				new Option_U (new Vector<String>()),
				new Option_M (new Vector<String>()),
				new Option_PlatformMapping (new Vector<String>()),
				new Option_TypeChecked (new Vector<String>()),
				new Option_Merged (new Vector<String>())
			} 
		);
	    nbOptionErrors = checkOption.Proceed(args);
	    if (checkOption.Saw ("-C"))
		{
	        internalLog.debug ("option -C was seen with arguments: ");
			Iterator<?> it = checkOption.getOption("-C").getParameters().iterator();			
			if (it.hasNext())
			{
			    className = it.next().toString();
			    internalLog.debug ("\t" + className);
			}
		}
	    if (checkOption.Saw ("-K"))
		{
	        internalLog.debug ("option -K was seen with arguments: ");
			Iterator<?> it = checkOption.getOption("-K").getParameters().iterator();						
			if (it.hasNext())
			{
			    kermetaStandardURI = it.next().toString();
			    internalLog.debug ("\t" + kermetaStandardURI);
			}
		}
	    else{
	    	// use current jar framework
	    	URL jarURL = locateContainerJar();
	    	internalLog.debug(" option -K NOT seen. Trying jar protocol with " + jarURL.toExternalForm());
	    	if(jarURL != null && jarURL.toString().endsWith(".jar")){
		    	kermetaStandardURI = "jar:" + jarURL.toExternalForm() + "!/src/kermeta/framework.km";
	    	}
	    	else{

	    		internalLog.debug(" NOT using jar protocol");
	    	}
	    }
	    if (checkOption.Saw ("-O"))
		{
	        internalLog.debug ("option -O was seen with arguments: ");
			Iterator<?> it = checkOption.getOption("-O").getParameters().iterator();						
			if (it.hasNext())
			{
			    operationName = it.next().toString();
			    internalLog.debug ("\t" + operationName);
			}
		}
	    if (checkOption.Saw ("-U"))
		{
	        internalLog.debug ("option -U was seen with arguments: ");
			Iterator<?> it = checkOption.getOption("-U").getParameters().iterator();			
			if (it.hasNext())
			{
			    unitURI = it.next().toString();
			    internalLog.debug ("\t" + unitURI);
			}
		}
	    if (checkOption.Saw ("-P"))
		{
	    	logExecutionTime = true;
		}
	    if (checkOption.Saw ("-M"))
		{
	        internalLog.debug ("option -M was seen with arguments: ");
			Iterator<?> it = checkOption.getOption("-M").getParameters().iterator();			
			if (it.hasNext())
			{
				File file = new File(it.next().toString());
				URIConverterImpl.URI_MAP.putAll(URIMapUtil.readMapFile(file));
			    internalLog.debug ("\t" + file.getName());
			}
		}	    
	    if (checkOption.Saw ("-PlatformMapping"))
		{
	        internalLog.debug ("option -PlatformMapping was seen with arguments: ");
			Iterator<?> it = checkOption.getOption("-PlatformMapping").getParameters().iterator();			
			if (it.hasNext())
			{
				String platformMapping = it.next().toString();
				URIConverterImpl.URI_MAP.put(URI.createURI("platform:/plugin/"), URI.createURI(platformMapping));
				URIConverterImpl.URI_MAP.put(URI.createURI("platform:/resource/"), URI.createURI(platformMapping));
			    internalLog.debug ("\t" + platformMapping);
			}
		}
	    if(!checkOption.Saw ("-PlatformMapping") && !checkOption.Saw ("-M")){
	    	internalLog.debug ("no mapping option seen : trying to use default value with jar protocol and current dir");
	    	// use current jar framework
	    	URL jarURL = locateContainerJar();
	    	if(jarURL != null && jarURL.toString().endsWith(".jar")){
		    	String platformPluginLocation = "jar:" + jarURL.toExternalForm() + "!/";
				URIConverterImpl.URI_MAP.put(URI.createURI("platform:/plugin/"), URI.createURI(platformPluginLocation));
				internalLog.debug ("\tplatform:/plugin/ -> " + platformPluginLocation);
				File currentDir = new File (".");			     
				try {
					URIConverterImpl.URI_MAP.put(URI.createURI("platform:/resource/"), URI.createURI("file:/" + currentDir.getCanonicalPath()+"/"));
					internalLog.debug ("\tplatform:/resource/ -> " + "file:/" + currentDir.getCanonicalPath()+"/");
				} catch (IOException e) {
					internalLog.error("cannot set map for platform:/resource/", e );
				}
		    	String kconfLocation = "jar:" + jarURL.toExternalForm() + "!/instances/";
				URIConverterImpl.URI_MAP.put(URI.createURI("kconf:/loader/"), URI.createURI(kconfLocation));
				internalLog.debug ("\tkconf:/loader/ -> " + kconfLocation);
	    	}
	    	else{

	    		internalLog.debug(" NOT using jar protocol");
	    	}
	    }
	    if(checkOption.Saw ("-H"))
	    {
	    	checkOption.DisplayHelp(System.out);
	    	System.out.println("Other values on the command line will be passed as string to the operation");
	    }
	    if ( checkOption.Saw("-Merged") ) {
	    	_merged = true;
	    }
	    if ( checkOption.Saw("-TypeChecked") ) {
	    	_typechecked = true;
	    }
	}
    
	/**
	 * 
	 * M A I N 
	 * @throws IOException 
	 * @throws URIMalformedException 
	 * @throws NotRegisteredURIException 
	 * 
	 */	
	public static void main(String[] args) throws NotRegisteredURIException, URIMalformedException, IOException {
		execute(args);
	}
	
	public static RuntimeObject execute(String[] args) throws NotRegisteredURIException, URIMalformedException, IOException {
	    RunCommandLine theLauncherRun;				
	    theLauncherRun = new RunCommandLine(args);
	    theLauncherRun.init();
	    return theLauncherRun.run();		
	}
	
	public void init() throws NotRegisteredURIException, URIMalformedException, IOException {
	    internalLog.debug("init");
	    if (unitURI ==  null) {
	        internalLog.error("Cannot initialise because no Unit is know");
	        return; 
	    }
	    if (kermetaStandardURI ==  null) {
	        internalLog.error("Cannot initialise because the location of Kermeta Standard Library is not known. Please use option -K ");
	        return; 
	    }
        
	    Map<String, Object> options = new HashMap<String, Object>();
	    options.put( InterpreterOptions.MERGE, ! _merged );
	    options.put( InterpreterOptions.TYPE_CHECKED, _typechecked );
	    IOPlugin.FRAMEWORK_KM_URI = kermetaStandardURI;
	    
	    _interpreter = new Interpreter(unitURI, InterpreterMode.RUN, options);
	    internalLog.debug("init2");
	    internalLog.debug ("The arguments not linked to an option are: (will be passed to the interpreter)");
	    if ( checkOption.getOption("").getParameters().size() > 0 ) {
	    	String p = "";
	    	for ( String s : checkOption.getOption("").getParameters() ) {
	    		p += " " + s;
	    	}
	    	p = p.substring(1);
	    	_parameters = p.split(" ");
	    }
        initialized = true;
	}
	
	public RuntimeObject run() {
	    internalLog.debug("run");
	    if ( ! initialized ) {
	        internalLog.error("Cannot run because was not initialized");
	        return null;
	    }
	    return run(className,operationName, _parameters);
	}  
	
	/**
	 * 
	 * @param mainClassValue the value of the mainClass tag
	 * @param mainOperationValue the value of the operation to run (used in special cases,
	 * and when the tag "testOperation" does not exist)
	 * @param parameters The arguments given in the main java call
	 */
	public RuntimeObject run(String className, String operationName, String[] parameters) {
		try {
			long time = System.currentTimeMillis();
	        
	        int nb_ro = RuntimeObjectImpl.getInstanceCounter();
	        
	        _interpreter.setEntryPoint(className, operationName);
		    _interpreter.setParameters(parameters);
		    _interpreter.setInputStream( System.in );
		    _interpreter.setOutputStream( System.out );
		    _interpreter.setErrorStream( System.err );
		    RuntimeObject result = _interpreter.launch();
		    
		    if (logExecutionTime) {
		    	long total = Runtime.getRuntime().totalMemory();
		        long max = Runtime.getRuntime().maxMemory();
		        
		        time = System.currentTimeMillis() - time;
		        nb_ro = RuntimeObjectImpl.getInstanceCounter() - nb_ro;
		        
		        internalLog.info("    ************************************************");
		        internalLog.info("    * Consumed memory : " + total + "/" + max);
		        //internalLog.info("    * #objects cached : " +  _interpreter.memory.getNumberOfObjectCached());
		        internalLog.info("    * #ro created     : " + nb_ro);
		        internalLog.info("    * #ro total       : " + RuntimeObjectImpl.getInstanceCounter());
		        internalLog.info("    * time (ms)       : " + time);
		        internalLog.info("    ************************************************");
		    }
		    return result;
		    
		} catch (InitializationError e) {
			System.err.println( e.getErrorsAsString() );
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * retrieve the location of the jar, this is useful in standalone mode in order to get default URI for various files in the jar
	 * @return
	 */
	public static URL locateContainerJar(){
		try {
			String qualifiedClassName = RunCommandLine.class.getCanonicalName();
			Class<?> qc = Class.forName( qualifiedClassName );
		
		    CodeSource source = qc.getProtectionDomain().getCodeSource();
		    if ( source != null ){
		       URL location = source.getLocation();
		       return location;
		    }
		    else {
		       return null;
		    }
	    } catch (ClassNotFoundException e) {
			return null;
		}
	
    }
}
