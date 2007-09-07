package fr.irisa.triskell.kermeta.ocl.kmtactions;


import java.util.ArrayList;

import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.ocl.console.DevOCLConsole;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.io.KermetaIOStream;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;

public class GenerateOCL {

	public static String workbench_path = "platform:/resource/";
	private static String project_path = workbench_path + "fr.irisa.triskell.kermeta.ocl/kermeta/transformations-dev/";
	private static String oclKmtPrinterKmtPath = project_path + "OCLKMTPrinter.kmt";
	
	/**
	 * Runs the Kermeta OCL CST -> KMT pretty-printer and stores the resulting Kermeta code
	 *  outputs messages to standard output.
	 * @param inCstXmiPath
	 * @param modelEcorePath
	 * @param outKmtPath
	 */
	public static void run(String inCstXmiPath, String modelEcorePath, String outKmtPath) {
		run(inCstXmiPath, modelEcorePath, outKmtPath, new DevOCLConsole());
	}
	
	/**
	 * Runs the Kermeta OCL CST -> KMT pretty-printer and stores the resulting Kermeta code, allows the output console to be specified.
	 * @param inCstXmiPath
	 * @param modelEcorePath
	 * @param outKmtPath
	 * @param console
	 */
	public static void run(String inCstXmiPath, String modelEcorePath, String outKmtPath, KermetaIOStream console ) {
		System.out.println("running OCL2KMT Transformation \n from " + inCstXmiPath + "\n to " + outKmtPath + "\n against: " + modelEcorePath);
		KermetaUnit unit = null;
		try {
			unit = IOPlugin.getDefault().loadKermetaUnit(oclKmtPrinterKmtPath);
		} catch (KermetaIOFileNotFoundException e) {
			e.printStackTrace();
		} catch (URIMalformedException e) {
			e.printStackTrace();
		}
		KermetaTypeChecker typechecker = new KermetaTypeChecker(unit);
		typechecker.checkUnit();
		KermetaInterpreter inter = new KermetaInterpreter(unit);
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
	}

	


}
