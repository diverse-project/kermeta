/* $Id: SerializableCallFrame.java,v 1.2 2005-12-01 18:29:07 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : SerializableCallFrame.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 21, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.remote.interpreter;

import java.io.Serializable;



public class SerializableCallFrame implements Serializable {

	/** suggested by Serializable */
	public String  thread;
	/** The position of the debug in the file that we debug */
	public int line;
	public String name; // name of the stack frame 
	public SerializableVariable[] variables;
	public String filepath; // path of the file where the operation associated to the stack frame is located
	
	public SerializableCallFrame(String filepath, int line, String name, SerializableVariable[] variables)
	{
		this.line = line;
		this.name = name;
		this.variables = variables;
		this.filepath = filepath;
	}
	

}
