/*
 * Created on 11 mai 2004
 *
 */
package fr.irisa.triskell.kermeta.launcher.CommandLineOptions;

import java.util.Vector;

import fr.irisa.triskell.utils.argumentsreader.Option;

/**
*/
public class Option_H extends Option 
{
	/** */
	public Option_H ()
	{
		setName ("-H");
		setNbArgs (0);
		setInclude ("");
		setExclude ("");
		setHelp ("call the help ");
		setMultiple (false);
	}
	
    /** */
    public void Proceed (Vector list) 
    {
		getParameters().addAll (list);
    }
}
