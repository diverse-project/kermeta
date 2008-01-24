/* $Id: GenerateOCL.java,v 1.11 2008-01-24 14:15:17 dvojtise Exp $
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


import java.util.ArrayList;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.kermeta.checker.KermetaUnitChecker;
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.eclipse.console.IOConsole;
import fr.irisa.triskell.eclipse.console.messages.InfoMessage;
import fr.irisa.triskell.eclipse.console.messages.ThrowableMessage;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class GenerateOCL {

	public static String workbench_path = "platform:/plugin/";
	
	private static String project_path = workbench_path + "fr.irisa.triskell.kermeta.ocl/.bin/";
	private static String oclKmtPrinterKmtPath = project_path + "OCLKMTPrinter.km";
	
	/**
	 * Runs the Kermeta OCL CST -> KMT pretty-printer and stores the resulting Kermeta code
	 *  outputs messages to standard output.
	 * @param inCstXmiPath
	 * @param modelEcorePath
	 * @param outKmtPath
	 */
	public static void run(String inCstXmiPath, String modelEcorePath, String outKmtPath) {
		run(inCstXmiPath, modelEcorePath, outKmtPath);
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
		KermetaUnit unit=null;
		try {
			unit = KermetaUnitChecker.basicCheck(oclKmtPrinterKmtPath,null, new NullProgressMonitor());
		} catch (URIMalformedException e) {
			console.println(new ThrowableMessage(e));
		}
	
		
		KermetaInterpreter inter = new KermetaInterpreter(unit, null);
		inter.setKStream(console);
		// This is the operation to call
		inter.setEntryPoint("OCLKMTPrinter::OCLKMTPrinter", "generateOCL");
		// These are the parameters
		ArrayList<RuntimeObject> params = new ArrayList<RuntimeObject>();
		params.add(fr.irisa.triskell.kermeta.runtime.basetypes.String.create(inCstXmiPath, inter.getMemory().getROFactory()));
		params.add(fr.irisa.triskell.kermeta.runtime.basetypes.String.create(modelEcorePath, inter.getMemory().getROFactory()));
		params.add(fr.irisa.triskell.kermeta.runtime.basetypes.String.create(outKmtPath, inter.getMemory().getROFactory()));
		inter.setEntryParameters(params);
		// And we launch the interpreter
		inter.launch();
		console.println(new InfoMessage("file generated " + outKmtPath));
		
	}

	


}
