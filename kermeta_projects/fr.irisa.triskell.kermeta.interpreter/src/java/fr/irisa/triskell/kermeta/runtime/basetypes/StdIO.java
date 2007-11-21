/* $Id: StdIO.java,v 1.13 2007-11-21 14:00:45 ftanguy Exp $
 * Project : Kermeta (First iteration)
 * File : Io.java
 * License : EPL
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

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

/**
 * Implementation of input and output methods (see io.kmt)
 */
public class StdIO {
    
	// Implementation of method write called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Io.write(output)
	public static RuntimeObject write(RuntimeObject output) {
		output.getFactory().getKermetaIOStream().print(output.getJavaNativeObject());
		return output.getFactory().getMemory().voidINSTANCE;
	}

	// Implementation of method writeln called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Io.writeln(output)
	public static RuntimeObject writeln(RuntimeObject output) {
		write(output);
		output.getFactory().getKermetaIOStream().print("\n");
		return output.getFactory().getMemory().voidINSTANCE;
	}
	
	// Implementation of method read called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Io.read(prompt)
	public static RuntimeObject read(RuntimeObject prompt)
	{
	    java.lang.String input = null;
		/*if (String.getValue(prompt).length()>0)
		    prompt.getFactory().getKermetaIOStream().print(String.getValue(prompt));*/
		input = prompt.getFactory().getKermetaIOStream().promptAndRead(String.getValue(prompt));
		
		RuntimeObject result = String.create(input, prompt.getFactory());
		return result;
	}
	
}
