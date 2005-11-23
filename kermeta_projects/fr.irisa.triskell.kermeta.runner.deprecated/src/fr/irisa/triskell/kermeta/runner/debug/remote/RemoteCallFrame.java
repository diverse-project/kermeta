/* $Id: RemoteCallFrame.java,v 1.2 2005-11-23 16:18:59 zdrey Exp $
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

	/** suggested by Serializable */
	private static final long serialVersionUID = 1L;
	public String  thread;
	/** The position of the debug in the file that we debug */
	public int line;
	public String name; // name of the stack frame 
	public RemoteVariable[] variables;
	public String filepath; // path of the file where the operation associated to the stack frame is located
	
	public RemoteCallFrame(String filepath, int line, String name, RemoteVariable[] variables)
	{
		this.line = line;
		this.name = name;
		this.variables = variables;
		this.filepath = filepath;
	}

}
