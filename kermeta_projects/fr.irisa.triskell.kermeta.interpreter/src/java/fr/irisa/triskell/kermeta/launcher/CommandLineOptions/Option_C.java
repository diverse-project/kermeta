/*
 * Created on 11 mai 2004
 *
 */
package fr.irisa.triskell.kermeta.launcher.CommandLineOptions;

import java.util.Vector;

import fr.irisa.triskell.utils.argumentsreader.Option;

/**
*/
public class Option_C extends Option 
{
	/** */
	public Option_C (Vector args)
	{
		setName ("-C");
		setNbArgs (1);
		setInclude ("");
		setExclude ("");
		setHelp ("name of the class to run ex:  \nmyPackage::MyClass");
		setMultiple (true);
		setParameters (args);
	}
	
    /** */
    public void Proceed (Vector list) 
    {
		getParameters().addAll (list);
    }
}
