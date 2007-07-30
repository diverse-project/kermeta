package fr.irisa.triskell.kermeta.ocl.kmtactions;


import java.util.ArrayList;

import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.io.KermetaIOStream;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;

public class GenerateOCL {

	public static void run(String in, String inmeta, String out, KermetaIOStream console, String KermetaTransfoPath) {
		System.out.println("run OCL2KMT Transformation");
		
		KermetaUnit unit = null;
		try {
			unit = IOPlugin.getDefault().loadKermetaUnit(KermetaTransfoPath);
		} catch (KermetaIOFileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URIMalformedException e) {
			// TODO Auto-generated catch block
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
		params.add(fr.irisa.triskell.kermeta.runtime.basetypes.String.create(in, inter.getMemory().getROFactory()));
		params.add(fr.irisa.triskell.kermeta.runtime.basetypes.String.create(inmeta, inter.getMemory().getROFactory()));
		params.add(fr.irisa.triskell.kermeta.runtime.basetypes.String.create(out, inter.getMemory().getROFactory()));
		inter.setEntryParameters(params);
		
		// And we launch the interpreter
		inter.launch();
	}

	


}
