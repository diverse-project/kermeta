package fr.irisa.triskell.kermeta.kpm.workspace;

import org.eclipse.core.resources.IFile;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;

/**
 * 
 * This interface allows an object to be notified when the Kermeta Unit
 * it is interested in has changed.
 * 
 * Typically, when two editors are opened on the same file, a change in an editor
 * could be handled in the other one.
 * 
 * @author ftanguy
 *
 */
public interface KermetaUnitInterest {

	public void updateKermetaUnit(KermetaUnit unit);
	
	public IFile getFile();
	
	public String getFileContent();
	
}
