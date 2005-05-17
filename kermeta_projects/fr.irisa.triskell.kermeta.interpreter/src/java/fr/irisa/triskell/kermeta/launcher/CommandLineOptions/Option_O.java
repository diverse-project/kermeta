/*
 * Created on 11 mai 2004
 *
 */
package fr.irisa.triskell.kermeta.launcher.CommandLineOptions;

import java.util.Vector;

import fr.irisa.triskell.utils.argumentsreader.Option;

/**
*/
public class Option_O extends Option 
{
	/** */
	public Option_O (Vector args)
	{
		setName ("-O");
		setNbArgs (1);
		setInclude ("-U");
		setExclude ("");
		setHelp ("name of the operation to run");
		setMultiple (true);
		setParameters (args);
	}
	
    /** */
    public void Proceed (Vector list) 
    {
		getParameters().addAll (list);
    }
}
