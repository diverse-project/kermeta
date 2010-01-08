/*$Id: $
* Project : org.kermeta.merger
* File : 	MergedKmExporter.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 déc. 2009
* Authors : Didier Vojtisek
*/

package org.kermeta.merger.exporter;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.kermeta.core.helper.JarHelper;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.loader.LoadingOptions;
import org.kermeta.merger.Merger;
import org.kermeta.merger.exporter.commandLineOptions.Option_H;
import org.kermeta.merger.exporter.commandLineOptions.Option_K;
import org.kermeta.merger.exporter.commandLineOptions.Option_M;
import org.kermeta.merger.exporter.commandLineOptions.Option_PlatformMapping;
import org.kermeta.merger.exporter.commandLineOptions.Option_kconf;

import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.loader.ecore.Ecore2KM;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.URIMapUtil;

import org.kermeta.utils.argumentsreader.NoOption;
import org.kermeta.utils.argumentsreader.Option;

import org.kermeta.utils.argumentsreader.CheckOption;

public class FullMergeKmExporter {
	
	
	/** URI of framework.km
	 * 
	 */
    protected String kermetaStandardURI = null;
	
	public String getKermetaStandardURI() {
		return kermetaStandardURI;
	}



	public void setKermetaStandardURI(String kermetaStandardURI) {
		this.kermetaStandardURI = kermetaStandardURI;
	}

    protected String inputFileName = null;
    public String getInputFileName() {
		return inputFileName;
	}
	public void setInputFileName(String inputFileName) {
		this.inputFileName = inputFileName;
	}

	protected String outputFileName = null;
	public String getOutputFileName() {
		return outputFileName;
	}
	public void setOutputFileName(String outputFileName) {
		this.outputFileName = outputFileName;
	}


    protected CheckOption checkOption;
    public int nbOptionErrors=0;
    

    
    /**
     * @param inputFile
     * @param outputFile
     * @param frameworkFile
     * @param unifiedPlatformRoot
     * @param kconfLocation
     */
    public FullMergeKmExporter(String inputFile, String outputFile, String frameworkFile, String unifiedPlatformRoot, String kconfLocation) {
    	kermetaStandardURI = frameworkFile;
    	initPlatformMapping(unifiedPlatformRoot);
    	initKconf(kconfLocation);
    	this.inputFileName = inputFile;
    	this.outputFileName = outputFile;
    	
    }
    
    
    
	/**
	 * Constructor to be used when run on the command line
	 * It also set the input and output file
	 * @param args
	 */
	/**
	 * @param args
	 */
	public FullMergeKmExporter(String[] args) {
		super();
		checkOption = new CheckOption (
				new Option[] {
					new NoOption (new Vector<String>()),
					new Option_H (),
					new Option_K (new Vector<String>()),
					new Option_M (new Vector<String>()),
					new Option_kconf (new Vector<String>()),
					new Option_PlatformMapping (new Vector<String>())
				} 
			);
		 
	
		initialized = true; // supose this is ok, the option will eventually disable it
		nbOptionErrors = checkOption.Proceed(args);
		if (checkOption.Saw ("-K"))
		{
			System.out.println("option -K was seen with arguments: ");
			Iterator<?> it = checkOption.getOption("-K").getParameters().iterator();						
			if (it.hasNext())
			{
			    kermetaStandardURI = it.next().toString();	
				System.out.println("\t" + kermetaStandardURI);
				ExtensibleURIConverterImpl.URI_MAP.put(URI.createURI("platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/"), URI.createURI(kermetaStandardURI.replaceAll("framework.km", "")));
			}
		}
	    else{
	    	// use current jar framework
	    	URL jarURL = JarHelper.locateContainerJar(this.getClass());
	    	if(jarURL != null && jarURL.toString().endsWith(".jar")){
	    		kermetaStandardURI = "jar:" + jarURL.toExternalForm() + "!/src/kermeta/framework.km";
	    		System.out.println(" option -K NOT seen. Using default : " + kermetaStandardURI);
	    		ExtensibleURIConverterImpl.URI_MAP.put(URI.createURI("platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/"), URI.createURI(kermetaStandardURI.replaceAll("framework.km", "")));
	    	}
	    	else{
	    		System.err.println("NOT able to set location of framework.km, you must either use the -K option or use the standalone version of this tool (must be in a jar)");
	    		initialized = false;
	    	}
	    }
		
		
		if (checkOption.Saw ("-M"))
		{
	        //internalLog.debug ("option -M was seen with arguments: ");
			Iterator<?> it = checkOption.getOption("-M").getParameters().iterator();			
			if (it.hasNext())
			{
				File file = new File(it.next().toString());
				ExtensibleURIConverterImpl.URI_MAP.putAll(URIMapUtil.readMapFile(file));
			    //internalLog.debug ("\t" + file.getName());
			}
		}
		if (checkOption.Saw ("-PlatformMapping"))
		{
	        System.out.println ("option -PlatformMapping was seen with arguments: ");
			Iterator<?> it = checkOption.getOption("-PlatformMapping").getParameters().iterator();			
			if (it.hasNext())
			{
				String platformMapping = it.next().toString();
				System.out.println("\t" + platformMapping);
				initPlatformMapping(platformMapping);
			}
		}
		if (checkOption.Saw ("-kconf"))
		{
			System.out.println ("option -kconf was seen with arguments: ");
			Iterator<?> it = checkOption.getOption("-kconf").getParameters().iterator();			
			if (it.hasNext())
			{
				String kconfMapping = it.next().toString();
				System.out.println("\t" + kconfMapping);
				initKconf(kconfMapping);
			}
		}
		
		if(!checkOption.Saw ("-PlatformMapping") && !checkOption.Saw ("-M")){
			System.out.println ("no mapping option seen : trying to use default value with jar protocol and current dir");
	    	// use current jar framework
	    	URL jarURL = JarHelper.locateContainerJar(this.getClass());
	    	if(jarURL != null && jarURL.toString().endsWith(".jar")){
		    	String platformPluginLocation = "jar:" + jarURL.toExternalForm() + "!/";
		    	ExtensibleURIConverterImpl.URI_MAP.put(URI.createURI("platform:/plugin/"), URI.createURI(platformPluginLocation));
		    	System.out.println ("\tplatform:/plugin/ -> " + platformPluginLocation);
				File currentDir = new File (".");			     
				try {
					ExtensibleURIConverterImpl.URI_MAP.put(URI.createURI("platform:/resource/"), URI.createURI("file:/" + currentDir.getCanonicalPath()+"/"));
					System.out.println ("\tplatform:/resource/ -> " + "file:/" + currentDir.getCanonicalPath()+"/");
				} catch (IOException e) {
					System.err.println("cannot set map for platform:/resource/");
					e.printStackTrace();
					initialized = false;
				}
	    	}
	    	else{

	    		System.err.println("NOT able to set URIMap for platform:/resource/ and platform:/plugin/, you must either use the -M, -PlatformMapping option or use the standalone version of this tool (must be in a jar)");
	    		initialized = false;
	    	}
	    }
		if(!checkOption.Saw("-kconf")){
			URL jarURL = JarHelper.locateContainerJar(this.getClass());
	    	if(jarURL != null && jarURL.toString().endsWith(".jar")){
	    		String kconfLocation = "jar:" + jarURL.toExternalForm() + "!/instances/";
		    	ExtensibleURIConverterImpl.URI_MAP.put(URI.createURI("kconf:/loader/"), URI.createURI(kconfLocation));
		    	System.out.println ("\tkconf:/loader/ -> " + kconfLocation);
		    	
	    	}
	    	else{
	    		System.err.println("NOT able to set URIMap for kconf:/loader/, you must either use the -kconf option or use the standalone version of this tool (must be in a jar)");
	    		initialized = false;
	    	}
		}
	    if(checkOption.Saw ("-H"))
	    {
	    	System.out.println("\n---\nHelp :");
	    	checkOption.DisplayHelp(System.out);
	    	System.out.println("then 2 parameters : the inputFile and the outputfile");
	    	System.out.println("\n---\nSample of use : \n"+
			"java org.kermeta.merger.exporter.FullMergeKmExporter -K file:/C:/eclipse3.5_dev/eclipse/workspace_head/fr.irisa.triskell.kermeta.interpreter/lib/framework.km"+
			" -PlatformMapping file:/C:/eclipse3.5_dev/eclipse/workspace_head/"+
			" -kconf file:/C:/eclipse3.5_dev/eclipse/workspace_head/org.kermeta.io.loader/instances/"+
			" platform:/resource/fr.irisa.triskell.kermeta.tests/test/interpreter/kmt_testcases/036_testIterator.main.kmt platform:/resource/fr.irisa.triskell.kermeta.tests/test/interpreter/kmt_testcases/036_testIterator.main.km");
	    	System.exit(0);
	    }
	    
	    // other parameter are passed as inputFile and outputFile
	    if ( checkOption.getOption("").getParameters().size() > 0 ) {
	    	String p = "";
	    	for ( String s : checkOption.getOption("").getParameters() ) {
	    		p += " " + s;
	    	}
	    	p = p.substring(1);
	    	String[] parameters = p.split(" ");
	    	inputFileName = parameters[0];
	    	outputFileName = parameters[1];
	    }
	     
	}
	
	
	
	/**
	 * Generates a km merge file from the inputfile, all dependencies are merged in the resulting km file
	 * @param inputFile, can be a km, or a kmt file
	 * @param outputFile, the km merged file
	 */
	public void merge(String inputFile, String outputFile) {
		assert(inputFile != null);
		assert(outputFile != null);
		
		Ecore2KM.isQuickFixEnabled = true;
        Ecore2KM.isMethodPropertyNameOverlapSafe = true;
        Ecore2KM.isMethodNameOverlapSafe = true;
        Ecore2KM.methodRenamePrefix = "op_";
        Ecore2KM.methodRenamePostfix = "";
        
        Map<Object, Object> options = new HashMap<Object, Object>();
        options.put(LoadingOptions.ECORE_QuickFixEnabled, true);
        
        		
		try {
			KermetaUnit mainUnit = LoaderPlugin.getDefault().load( inputFile, options );
			
		
			Set<KermetaUnit> unitsToMerge = new HashSet<KermetaUnit>();
			unitsToMerge.add(mainUnit);
			unitsToMerge.addAll( KermetaUnitHelper.getAllImportedKermetaUnits(mainUnit) );
			
			
			
			Merger merger = new Merger();
			merger.process(unitsToMerge, outputFile, true, true);
		} catch (URIMalformedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	
	/**
	 * 
	 * @param args
	 * 	arg1 = input file name  (must use platform:/resource/ or platform:/plugin/ syntax)
	 *  arg2 = outputfile name (must use platform:/resource/ syntax)
	 * @throws IOException 
	 * @throws URIMalformedException 
	 * @throws NotRegisteredURIException 
	 */
	public static void main(String[] args) throws NotRegisteredURIException, URIMalformedException, IOException {
		merge(args);
	}
	
	public static void merge(String[] args) throws NotRegisteredURIException, URIMalformedException, IOException {
		FullMergeKmExporter merger;				
		merger = new FullMergeKmExporter(args);	 
		if (merger.isInitialized()){
			merger.merge(merger.getInputFileName(), merger.getOutputFileName());
		}
		else {
			System.out.println("Not correctly initialized for starting a merge, use -H for help.");
		}
	}



	protected boolean initialized = false;
	private boolean isInitialized() {
		return initialized;
	}
	
	protected void initPlatformMapping(String unifiedPlatformRoot){
		ExtensibleURIConverterImpl.URI_MAP.put(URI.createURI("platform:/plugin/"), URI.createURI(unifiedPlatformRoot));
		ExtensibleURIConverterImpl.URI_MAP.put(URI.createURI("platform:/resource/"), URI.createURI(unifiedPlatformRoot));
    }
    protected void initKconf(String kconfLocation){
		ExtensibleURIConverterImpl.URI_MAP.put(URI.createURI("kconf:/loader/"), URI.createURI(kconfLocation));    	
    }

}
