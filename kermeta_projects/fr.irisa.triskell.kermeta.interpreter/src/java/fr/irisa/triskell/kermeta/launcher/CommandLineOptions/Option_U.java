/*
 * Created on 11 mai 2004
 *
 */
package fr.irisa.triskell.kermeta.launcher.CommandLineOptions;

import java.util.Vector;

import fr.irisa.triskell.utils.argumentsreader.Option;

/**
*/
public class Option_U extends Option 
{
	/** */
	public Option_U (Vector args)
	{
		setName ("-U");
		setNbArgs (1);
		setInclude ("");
		setExclude ("");
		setHelp ("URI of the unit file that must be loaded");
		setMultiple (true);
		setParameters (args);
	}
	
    /** */
    public void Proceed (Vector list) 
    {
		getParameters().addAll (list);
    }
}
