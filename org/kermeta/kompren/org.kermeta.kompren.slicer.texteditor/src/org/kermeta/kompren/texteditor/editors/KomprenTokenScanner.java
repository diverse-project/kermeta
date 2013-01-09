package org.kermeta.kompren.texteditor.editors;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.text.rules.ITokenScanner;

/**
 * Interface in charge of adding behaviour to Kermeta Scanner 
 */
public interface KomprenTokenScanner extends ITokenScanner {
	/**
	 * Notify other components (e.g. marker, logger, ...) that there's no error after lexing the file
	 */
	void notifyFileClear();
	
	/**
	 * Notify other components (e.g. marker, logger, ...) whether there're some errors detected in the file after lexing
	 */
	void notifyFileHasError();
	
	/**
	 * Return the status of the file
	 * @return true if the file has errors, false otherwise
	 */
	boolean isFileOnError();
	
	/**
	 * Set the status of the file to a new value
	 * @param fileHasError the new boolean value
	 */
	void setFileHasError(final boolean fileHasError);
	
	/**
	 * Return the current IFile
	 */
	IFile getCurrentFile();
}
