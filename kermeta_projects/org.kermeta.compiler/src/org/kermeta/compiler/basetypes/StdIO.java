/* $Id: StdIO.java,v 1.1 2007-10-17 08:56:19 cfaucher Exp $
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
package org.kermeta.compiler.basetypes;

import fr.irisa.triskell.kermeta.runtime.io.KermetaIOStream;
import fr.irisa.triskell.kermeta.runtime.io.SystemIOStream;

/**
 * Implementation of input and output methods (see io.kmt)
 */
public class StdIO {
	
	private static KermetaIOStream theKermetaIOStream = null;
    
	// Implementation of method write called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Io.write(output)
	public static void write(String output) {
		getKermetaIOStream().print(output);
	}

	// Implementation of method writeln called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Io.writeln(output)
	public static void writeln(String output) {
		write(output+"\n");
	}
	
	// Implementation of method read called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Io.read(prompt)
	public static String read(String prompt)
	{
		return getKermetaIOStream().read(prompt);
	}
	
	public static KermetaIOStream getKermetaIOStream() {
		if(theKermetaIOStream == null) {
			theKermetaIOStream = new SystemIOStream();
		}
		return theKermetaIOStream;
	}
	
}
