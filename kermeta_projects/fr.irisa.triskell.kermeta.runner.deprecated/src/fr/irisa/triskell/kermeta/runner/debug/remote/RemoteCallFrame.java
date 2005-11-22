/* $Id: RemoteCallFrame.java,v 1.1 2005-11-22 09:31:35 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : RemoteCallFrame.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 21, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.remote;

import java.io.Serializable;


public class RemoteCallFrame implements Serializable {

	public String  thread;
	/** The position of the debug in the file that we debug */
	public int line;
	public String name; // name of the stack frame 
	public RemoteVariable[] variables;
	public String filepath; // path of the file where the operation associated to the stack frame is located
	
	public RemoteCallFrame(int line, String name, RemoteVariable[] variables, String filepath)
	{
		this.line = line;
		this.name = name;
		this.variables = variables;
		this.filepath = filepath;
	}

}
