/* $Id: Io.java,v 1.1 2005-03-30 14:51:38 zdrey Exp $
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

/**
 * Implementation of input and output methods (see io.kmt)
 */
public class Io {
    
	// Implementation of method write called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Io.write(output)
	public static RuntimeObject write(RuntimeObject self, RuntimeObject output) {
		System.out.print(String.getValue(output));
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
		RuntimeObject result = String.create(input);
		return result;
	}

}
