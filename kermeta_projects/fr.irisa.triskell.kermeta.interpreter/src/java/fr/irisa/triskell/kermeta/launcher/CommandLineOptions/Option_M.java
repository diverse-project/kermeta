/*
 * Created on 11 mai 2004
 *
 */
package fr.irisa.triskell.kermeta.launcher.CommandLineOptions;

import java.util.Vector;

import fr.irisa.triskell.utils.argumentsreader.Option;

/**
*/
public class Option_M extends Option 
{
	/** */
	public Option_M (Vector args)
	{
		setName ("-M");
		setNbArgs (1);
		setInclude ("");
		setExclude ("");
		setHelp ("Indicate a file containing URI_MAP (This is usefull to solve some model loading troubles)");
		setMultiple (true);
		setParameters (args);
	}
	
    /** */
    public void Proceed (Vector list) 
    {
		getParameters().addAll (list);
    }
}
