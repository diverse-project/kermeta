/* $Id: StdIO.java,v 1.14 2008-04-28 11:50:56 ftanguy Exp $
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
		output.getFactory().getMemory().getInterpreter().print(output.getJavaNativeObject());
		return output.getFactory().getMemory().voidINSTANCE;
	}

	// Implementation of method writeln called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Io.writeln(output)
	public static RuntimeObject writeln(RuntimeObject output) {
		output.getFactory().getMemory().getInterpreter().println(output.getJavaNativeObject());
		return output.getFactory().getMemory().voidINSTANCE;
	}
	
	// Implementation of method error called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Io.error(output)
	public static RuntimeObject error(RuntimeObject output) {
		output.getFactory().getMemory().getInterpreter().error(output.getJavaNativeObject());
		return output.getFactory().getMemory().voidINSTANCE;
	}

	// Implementation of method errorln called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Io.errorln(output)
	public static RuntimeObject errorln(RuntimeObject output) {
		output.getFactory().getMemory().getInterpreter().errorln(output.getJavaNativeObject());
		return output.getFactory().getMemory().voidINSTANCE;
	}
	
	// Implementation of method read called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Io.read(prompt)
	public static RuntimeObject read(RuntimeObject prompt)
	{
	    java.lang.String input = null;
		/*if (String.getValue(prompt).length()>0)
		    prompt.getFactory().getKermetaIOStream().print(String.getValue(prompt));*/
		input = prompt.getFactory().getMemory().getInterpreter().promptAndRead(String.getValue(prompt));
		
		RuntimeObject result = String.create(input, prompt.getFactory());
		return result;
	}
	
}
