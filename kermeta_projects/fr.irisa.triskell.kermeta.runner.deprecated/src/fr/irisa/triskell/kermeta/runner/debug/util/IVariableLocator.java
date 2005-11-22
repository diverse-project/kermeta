/*
 * Author: atotic
 * Created on Apr 30, 2004
 * License: Common Public License v1.0
 */
package fr.irisa.triskell.kermeta.runner.debug.util;

/**
 * IVariableLocator knows how to produce location information
 * for CMD_GET_VARIABLE
 * 
 * The location is specified as:
 * 
 * thread_id, stack_frame, LOCAL|GLOBAL, attribute*
 */
public interface IVariableLocator {
	public String getKermetaRemotePortLocation();
}
