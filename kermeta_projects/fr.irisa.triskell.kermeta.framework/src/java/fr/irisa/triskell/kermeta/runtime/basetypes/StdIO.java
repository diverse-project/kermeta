/* $Id: StdIO.java,v 1.5 2005-04-29 09:20:28 jpthibau Exp $
 * Project : Kermeta (First iteration)
 * File : Io.java
 * License : GPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mar 4, 2005
 * Author : zdrey
 * Description : describe here file content
 * TODO : 
 * 	- write here your TODO actions
 *  - ...
 */
package fr.irisa.triskell.kermeta.runtime.basetypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;

/**
 * Implementation of input and output methods (see io.kmt)
 */
public class StdIO {
    
	// Implementation of method write called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Io.write(output)
	public static RuntimeObject write(RuntimeObject output) {
		FClassDefinition classDef=((FClass)output.getMetaclass().getData().get("kcoreObject")).getFClassDefinition();
		if (classDef.getFName().equals("Integer"))
			System.out.print(output.getData().get("Value"));
		else if (classDef.getFName().equals("String"))
		    System.out.print(output.getData().get("Value"));
		else System.out.print(output);
		return Void.VOID;
	}

	// Implementation of method writeln called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Io.writeln(output)
	public static RuntimeObject writeln(RuntimeObject output) {
		write(output);
		System.out.println();
		return Void.VOID;
	}

	// Implementation of method read_prompt called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Io.read_prompt(prompt)
	public static RuntimeObject read_prompt(RuntimeObject self, RuntimeObject prompt) {
	    java.lang.String input = null;
		if (String.getValue(prompt).length()>0)
		    System.out.print(String.getValue(prompt));
		// open up standard input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// read data from standard input
		try {
		    input = br.readLine();
		} catch (IOException ioe) {
		    System.out.println("JavaStaticCall error : IO error trying to read from input");
		    
		}
		RuntimeObject result = String.create(input, self.getFactory());
		return result;
	}

}
