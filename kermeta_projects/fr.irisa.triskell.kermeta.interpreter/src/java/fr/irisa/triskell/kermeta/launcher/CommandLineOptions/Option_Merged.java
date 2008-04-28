/*
 * Created on 11 mai 2004
 *
 */
package fr.irisa.triskell.kermeta.launcher.CommandLineOptions;

import java.util.Vector;

import fr.irisa.triskell.utils.argumentsreader.Option;

/**
*/
public class Option_Merged extends Option 
{
	/** */
	public Option_Merged (Vector<String> args)
	{
		setName ("-Merged");
		setInclude ("");
		setExclude ("");
		setHelp ("Indicate if the file is an executable file (ie the file is merged and containing the framework).");
		setMultiple (false);
		setParameters (args);
	}
	
    /** */
    public void Proceed (Vector<String> list) 
    {
		getParameters().addAll (list);
    }
}
