/*
 * Created on 7 févr. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.main;

import java.io.PrintStream;

import org.eclipse.core.resources.IFile;

public interface IMetaModel {

	public void registers (String ext);

	public void load (IFile file);
	
	public void store (IFile file);

	public Object getRoot ();

	public void setRoot (Object root);

    public IPrettyPrinter getPrettyPrinter (PrintStream output);
}