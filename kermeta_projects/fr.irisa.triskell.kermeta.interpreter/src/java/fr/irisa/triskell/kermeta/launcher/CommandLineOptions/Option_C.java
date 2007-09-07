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
	public Option_C (Vector<String> args)
	{
		setName ("-C");
		setNbArgs (1);
		setInclude ("");
		setExclude ("");
		setHelp ("Qualified name of the class to run \n\t\tex:  myPackage::MyClass");
		setMultiple (true);
		setParameters (args);
	}
	
    /** */
    public void Proceed (Vector<String> list) 
    {
		getParameters().addAll (list);
    }
}
