/*
 * Created on 11 mai 2004
 *
 */
package fr.irisa.triskell.kermeta.launcher.CommandLineOptions;

import java.util.Vector;

import fr.irisa.triskell.utils.argumentsreader.Option;

/**
*/
public class Option_TypeChecked extends Option 
{
	/** */
	public Option_TypeChecked (Vector<String> args)
	{
		setName ("-TypeChecked");
		setInclude ("");
		setExclude ("");
		setHelp ("Indicate if the file has already been typechecked (works only for km file that are merged).");
		setMultiple (false);
		setParameters (args);
	}
	
    /** */
    public void Proceed (Vector<String> list) 
    {
		getParameters().addAll (list);
    }
}
