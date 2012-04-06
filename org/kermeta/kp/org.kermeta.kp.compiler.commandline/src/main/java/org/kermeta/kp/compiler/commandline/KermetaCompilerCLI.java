/* $Id:$ 
 * Creation : 1 mars 2011
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.kp.compiler.commandline;

import java.io.IOException;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.kermeta.utils.helpers.SimpleLocalFileConverter;
import org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem;

/**
 * Command line interface for Kermeta2 compiler
 */
public class KermetaCompilerCLI {

	private static Options options = null; // Command line options
	private static final String GENERATE_INTERMEDIATE_FILES_OPTION = "intermediate";
	private static final String TARGET_LOCATION_OPTION = "target";
	private static final String GENERATEKMONLY_OPTION = "generateKmOnly";

	private static final String DEFAULT_TARGET_FOLDER = "target";
	
	private CommandLine cmd = null; // Command Line arguments
	
	private String outputFolder = DEFAULT_TARGET_FOLDER;
	private String kpFile;
	private Boolean intermediateFilesRequired = false;
	private Boolean generateKmOnly = false;

	private KermetaCompiler compiler;
	


	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		KermetaCompilerCLI cliProg = new KermetaCompilerCLI();
		cliProg.loadArgs(args);
		if (cliProg.run()){
			System.out.println(cliProg.getErrorMessage());
		}
	}
	
	public String getErrorMessage(){
		return compiler.errorMessage;
	}
		
	public boolean run() throws IOException {
		compiler = new KermetaCompiler( true, new StdioSimpleMessagingSystem(), new SimpleLocalFileConverter(), false);
		compiler.initializeTargetFolders(outputFolder, outputFolder, outputFolder+"/scala/", outputFolder+"/classes/", outputFolder+"/genmode/", outputFolder+"/java/", outputFolder+"/emfclasses/", outputFolder+"/resources/");
		compiler.kp2bytecode(kpFile, new java.util.ArrayList<String>(), generateKmOnly);		
		return compiler.hasFailed;
	}

	public KermetaCompilerCLI(){
		KermetaCompiler.initializeFactory();
		prepareOptions();
	}
	
	protected void prepareOptions() {
		options = new Options();
		options.addOption(GENERATE_INTERMEDIATE_FILES_OPTION, false, "Generate intermediate files");
		options.addOption(GENERATEKMONLY_OPTION, false, "Generate only the km");
		options.addOption(TARGET_LOCATION_OPTION, true, "Output folder. " + DEFAULT_TARGET_FOLDER + " by default ");
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

		if (cmd.hasOption(GENERATEKMONLY_OPTION)){
			this.generateKmOnly = true;			
		}
		
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

	

}
