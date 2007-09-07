/*
 * Created on 11 mai 2004
 *
 */
package fr.irisa.triskell.kermeta.launcher.CommandLineOptions;

import java.util.Vector;

import fr.irisa.triskell.utils.argumentsreader.Option;

/**
*/
public class Option_P extends Option 
{
	/** */
	public Option_P ()
	{
		setName ("-P");
		setNbArgs (0);
		setInclude ("");
		setExclude ("");
		setHelp ("Display Profiling info ");
		setMultiple (false);
	}
	
    /** */
    public void Proceed (Vector<String> list) 
    {
		getParameters().addAll (list);
    }
}
