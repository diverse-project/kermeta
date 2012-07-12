/* $Id:$ 
 * Creation : 1 mars 2011
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.kp.compiler.commandline;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NavigableMap;
import java.util.Properties;
import java.util.TreeMap;
import java.util.regex.Pattern;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.kermeta.utils.helpers.FileExtensionComparator;
import org.kermeta.utils.helpers.SimpleLocalFileConverter;
import org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem;

/**
 * Command line interface for Kermeta2 compiler
 */
public class KermetaCompilerCLI {

	private static Options options = null; // Command line options
	private static final String GENERATE_INTERMEDIATE_FILES_OPTION = "intermediate";
	private static final String TARGET_LOCATION_OPTION = "target";
	private static final String STOPAFTERPHASE_OPTION = "stopAfter";
	private static final String IGNORECHECK_OPTION = "ignoreCheck";
	private static final String CONTINUEONERROR_OPTION = "continueOnError";
	private static final String BUILDASLIBRARY_OPTION = "buildAsLibrary";
	private static final String CLASSPATH_OPTION = "cp";
	private static final String EXTENSION_POINT_OPTION = "E";

	private static final String DEFAULT_TARGET_FOLDER = "target";
	
	private CommandLine cmd = null; // Command Line arguments
	
	private String outputFolder = DEFAULT_TARGET_FOLDER;
	private String kpFile;
	private Boolean intermediateFilesRequired = false;
	private Boolean ignoreCheck = false;
	private Boolean continueOnError = false;
	private Boolean buildAsLibrary = false;
	private String stopAfterPhase = "GENERATE_SCALA_BYTECODE";
	private String additionalClasspath = "";
	private NavigableMap<String, ModelingUnitLoaderFactory> muLoaders;

	private KermetaCompiler compiler;
	


	/**
	 * @param args 
	 */
	public static void main(String[] args)  {
		
		KermetaCompilerCLI cliProg = new KermetaCompilerCLI();
		cliProg.loadArgs(args);
		try {
			if (cliProg.run()){
				System.out.println(cliProg.getErrorMessage());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getErrorMessage(){
		return compiler.errorMessage;
	}
		
	public boolean run() throws IOException {
		
		String outputFolderPath = new File(DEFAULT_TARGET_FOLDER).getCanonicalPath();
		compiler = new KermetaCompiler( true, new StdioSimpleMessagingSystem(), new SimpleLocalFileConverter(), false);
		compiler.initializeTargetFolders(outputFolderPath, outputFolderPath, outputFolderPath+"/scala/", outputFolderPath+"/scalaclasses/", outputFolderPath+"/genmodel/", outputFolderPath+"/java/", outputFolderPath+"/emfclasses/", outputFolderPath+"/resources/");
		ArrayList<String> classpath = new java.util.ArrayList<String>();
		if(!additionalClasspath.isEmpty()){
			if(additionalClasspath.contains(File.pathSeparator)){
				for(String s : additionalClasspath.split(Pattern.quote(File.pathSeparator))){
					classpath.add(s);
				}
			}
			else classpath.add(additionalClasspath);
		}
		compiler.stopOnError = !continueOnError;
		compiler.checkingEnabled = !ignoreCheck;
		compiler.saveIntermediateFiles = intermediateFilesRequired;
		compiler.setModelingUnitLoaders(muLoaders);
		if(!buildAsLibrary){
			compiler.kp2bytecode(kpFile, classpath, stopAfterPhase);
		}
		else{
			compiler.kp2bytecode4library(kpFile, classpath, stopAfterPhase);
		}
		return compiler.hasFailed;
	}

	public KermetaCompilerCLI(){
		KermetaCompiler.initializeFactory();
		prepareOptions();
	}
	
	protected void prepareOptions() {
		options = new Options();
		options.addOption(GENERATE_INTERMEDIATE_FILES_OPTION, false, "Generate intermediate files. (Recommanded for incremental build)");
		options.addOption(STOPAFTERPHASE_OPTION,true, "Stop after the given phase. Available phases : COLLECT_SOURCES, MERGE, RESOLVE, TYPE_SET, GENERATE_LEGACY_SOURCE, GENERATE_LEGACY_SOURCE_BYTECODE, GENERATE_SCALA, [GENERATE_SCALA_BYTECODE]");
		options.addOption(IGNORECHECK_OPTION, false, "do not run the checker after phase MERGE and phase TYPE_SET.");
		options.addOption(BUILDASLIBRARY_OPTION, false, "Build the project as a library instead of an application.");
		options.addOption(CONTINUEONERROR_OPTION, false, "try to continue regardless of previous errors.");
		options.addOption(TARGET_LOCATION_OPTION, true, "Output folder. " + DEFAULT_TARGET_FOLDER + " by default ");
		options.addOption(CLASSPATH_OPTION, true, "addtional classpath.");
		options.addOption(
					OptionBuilder
					.withArgName("fileExtension,factory")
					.hasArgs(2)
					.withValueSeparator(',')
					.withDescription("Use factory for given file extension")
					.create(EXTENSION_POINT_OPTION)
					);
	}

	/**
	 * Validate and set command line arguments.
	 * Exit after printing usage if anything is astray
	 * @param args String[] args as featured in public static void main()
	 */
	public void loadArgs(String[] args){
		CommandLineParser parser = new GnuParser();
		try {
			cmd = parser.parse(options, args);
		} catch (ParseException e) {
			System.err.println("Error parsing arguments");
			e.printStackTrace();
			System.exit(1);
		}
				
		
		// Look for optional args.
		
		if (cmd.hasOption(TARGET_LOCATION_OPTION)){
			outputFolder = cmd.getOptionValue(TARGET_LOCATION_OPTION);			
		}
		if (cmd.hasOption(GENERATE_INTERMEDIATE_FILES_OPTION)){
			intermediateFilesRequired = true;			
		}
		if (cmd.hasOption(STOPAFTERPHASE_OPTION)){
			this.stopAfterPhase = cmd.getOptionValue(STOPAFTERPHASE_OPTION);			
		}

		if (cmd.hasOption(CLASSPATH_OPTION)){
			this.additionalClasspath = cmd.getOptionValue(CLASSPATH_OPTION);			
		}
		
		if (cmd.hasOption(IGNORECHECK_OPTION)){
			this.ignoreCheck = true;			
		}
		if (cmd.hasOption(BUILDASLIBRARY_OPTION)){
			this.buildAsLibrary = true;			
		}
		if (cmd.hasOption(CONTINUEONERROR_OPTION)){
			this.continueOnError = true;			
		}
		
		setMuLoaders(cmd.getOptionProperties(EXTENSION_POINT_OPTION));
		
		if(cmd.getArgList().size() == 0){
			System.out.println("Missing kp file.");
			HelpFormatter formatter = new HelpFormatter();
			formatter.printHelp("java -jar <this_jar.jar> [OPTIONS] <your_kp.kp>", options);
			System.exit(1);
		}
		else{
			if(cmd.getArgList().size() > 1){
				System.out.println("Invalid number of arguments.");
				HelpFormatter formatter = new HelpFormatter();
				formatter.printHelp("java -jar <this_jar.jar> [OPTIONS] <your_kp.kp>", options);
				System.exit(1);
			}
			else {
				kpFile = cmd.getArgList().get(0).toString();
			}
		}
	}
	
	private void setMuLoaders(Properties extensionPoints){
		System.out.println("Setting muLoaders for "+extensionPoints.size()+" extension points");
		setDefaultMuLoaders();
		for(String fileExtension : extensionPoints.stringPropertyNames()){
			String factoryName = extensionPoints.getProperty(fileExtension);
			System.out.println("Adding factory "+factoryName+" for file extension " + fileExtension);
			try{
				ModelingUnitLoaderFactory factory = (ModelingUnitLoaderFactory) Class.forName(factoryName).newInstance();
				muLoaders.put(fileExtension, factory);
			} catch (Exception e) {
				System.err.println("Unable to load factory " + factoryName);
				e.printStackTrace();
			}
		}
	}
	
	private void setDefaultMuLoaders(){
		muLoaders = new TreeMap<String, ModelingUnitLoaderFactory>(new FileExtensionComparator());
		muLoaders.put(".km", new ModelingUnitLoaderFactoryForKm());
		muLoaders.put(".kmt", new ModelingUnitLoaderFactoryForKmt());
		muLoaders.put(".ecore", new ModelingUnitLoaderFactoryForEcore());
		muLoaders.put(".profile.uml", new ModelingUnitLoaderFactoryForUmlProfile());
	}

	

}
