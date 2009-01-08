/* $Id: GenerateOCL.java,v 1.15 2009-01-08 19:11:34 gperroui Exp $
 * Project    : fr.irisa.triskell.kermeta.ocl
 * File       : GenerateOCL.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 27 janv. 2005
 * Authors : 
 *        	Olivier Barais
 *          Mark Skipper
 *          Didier Vojtisek
 */
package fr.irisa.triskell.kermeta.ocl.kmtactions;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.kermeta.interpreter.api.Interpreter;
import org.kermeta.interpreter.api.InterpreterMode;
import org.kermeta.interpreter.api.InterpreterOptions;
import org.kermeta.interpreter.helper.RunnerHelper;
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.eclipse.console.IOConsole;
import fr.irisa.triskell.eclipse.console.LocalIOConsole;
import fr.irisa.triskell.eclipse.console.messages.InfoMessage;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;

public class GenerateOCL {

	public static String workbench_path = "platform:/plugin/";
	
//	private static String project_path = workbench_path + "fr.irisa.triskell.kermeta.ocl/.bin/";
	private static String project_path = workbench_path + "fr.irisa.triskell.kermeta.ocl/kermeta/transformations-dev/";
//	private static String oclKmtPrinterKmtPath = project_path + "OCLKMTPrinter.km";
	private static String oclKmtPrinterKmtPath = project_path + "OCLKMTPrinter.kmt";
	
	/**
	 * Runs the Kermeta OCL CST -> KMT pretty-printer and stores the resulting Kermeta code
	 *  outputs messages to standard output.
	 * @param inCstXmiPath
	 * @param modelEcorePath
	 * @param outKmtPath
	 */
	public static void run(String inCstXmiPath, String modelEcorePath, String outKmtPath) {
		run(inCstXmiPath, modelEcorePath, outKmtPath, new LocalIOConsole());	
	}
	
	/**
	 * Runs the Kermeta OCL CST -> KMT pretty-printer and stores the resulting Kermeta code, allows the output console to be specified.
	 * @param inCstXmiPath
	 * @param modelEcorePath
	 * @param outKmtPath
	 * @param console
	 */
	public static void run(String inCstXmiPath, String modelEcorePath, String outKmtPath, IOConsole console ) {
		console.println(new InfoMessage("running OCL2KMT Transformation \n from " + inCstXmiPath + "\n to " + outKmtPath + "\n against: " + modelEcorePath));
		if ( getInterpreter() != null ) {
			getInterpreter().setStreams(console);
			// This is the operation to call
			getInterpreter().setEntryPoint("OCLKMTPrinter::OCLKMTPrinter", "generateOCL");
			// These are the parameters
			String[] params = new String[] { inCstXmiPath, modelEcorePath, outKmtPath };
			getInterpreter().setParameters(params);
			// And we launch the interpreter
			getInterpreter().launch();
			console.println(new InfoMessage("file generated " + outKmtPath));		
		}
	}
	
	static private Interpreter getInterpreter() {
		if ( _interpreter == null )
			try {
				KermetaUnit kermetaUnit = RunnerHelper.getKermetaUnitToExecute(oclKmtPrinterKmtPath, "platform:/resource/ocl/OCLKMTPrinter.km");
				Map<String, Object> options = new HashMap<String, Object>();
				options.put( InterpreterOptions.MERGE, false );
				options.put( InterpreterOptions.CLEAN_AT_END, false);
				_interpreter = new Interpreter(kermetaUnit.getUri(), InterpreterMode.RUN, options);
			} catch (NotRegisteredURIException e) {
			} catch (URIMalformedException e) {
			} catch (IOException e) {
			}
		return _interpreter;
	}
	
	static private Interpreter _interpreter;


}
