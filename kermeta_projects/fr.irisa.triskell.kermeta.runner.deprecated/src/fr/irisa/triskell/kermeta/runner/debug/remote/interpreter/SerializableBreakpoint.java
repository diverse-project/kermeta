/* $Id: SerializableBreakpoint.java,v 1.1 2005-12-08 17:38:13 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : SerializableBreakpoint.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Dec 8, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.remote.interpreter;

import java.io.Serializable;

/**
 * A basic class that contains the essential infos about Breakpoints so that
 * we can share them through the RMI.
 */
public class SerializableBreakpoint implements Serializable {

	protected Integer line;
	protected String file; // should be absolute OSString, URL beginning with platform:/
	
	public SerializableBreakpoint(Integer line, String file) {
		this.line = line; this.file = file;
	}
	
	public Integer getLine() { return line; }
	public String getFile()  { return file; }
}

