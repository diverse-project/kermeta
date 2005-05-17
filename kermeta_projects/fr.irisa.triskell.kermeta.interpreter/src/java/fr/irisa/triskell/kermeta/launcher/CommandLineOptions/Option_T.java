/*
 * Created on 11 mai 2004
 *
 */
package fr.irisa.triskell.kermeta.launcher.CommandLineOptions;

import java.util.Vector;

import fr.irisa.triskell.utils.argumentsreader.Option;

/**
*/
public class Option_T extends Option 
{
	/** */
	public Option_T ()
	{
		setName ("-H");
		setNbArgs (0);
		setInclude ("");
		setExclude ("");
		setHelp ("Run as a test suite ");
		setMultiple (false);
	}
	
    /** */
    public void Proceed (Vector list) 
    {
		getParameters().addAll (list);
    }
}
