/*
 * Created on 11 mai 2004
 *
 */
package fr.irisa.triskell.kermeta.launcher.CommandLineOptions;

import java.util.Vector;

import fr.irisa.triskell.utils.argumentsreader.Option;

/**
*/
public class Option_K extends Option 
{
	/** */
	public Option_K (Vector args)
	{
		setName ("-K");
		setNbArgs (1);
		setInclude ("");
		setExclude ("");
		setHelp ("set the location for kermeta standard (framerwork.km) (KermetaUnit.STD_LIB_URI variable)  ");
		setMultiple (true);
		setParameters (args);
	}
	
    /** */
    public void Proceed (Vector list) 
    {
		getParameters().addAll (list);
    }
}
