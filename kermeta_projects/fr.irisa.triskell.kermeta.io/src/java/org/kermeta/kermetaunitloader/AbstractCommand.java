/*$Id: $
* Project : fr.irisa.triskell.kermeta.io
* File : 	AbstractCommand.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 22 mars 2010
* Authors : Didier Vojtisek
*/

package org.kermeta.kermetaunitloader;

/**
 * Command pattern used to defer so processing for later
 * @author dvojtise
 *
 */
public abstract class AbstractCommand {
	
	abstract public void executeCommand();

}
