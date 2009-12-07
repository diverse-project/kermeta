/*
 * Created on 11 mai 2004
 *
 */
package org.kermeta.merger.exporter.commandLineOptions;

import java.util.Vector;

import org.kermeta.utils.argumentsreader.Option;

/**
*/
public class Option_K extends Option 
{
	/** */
	public Option_K (Vector<String> args)
	{
		setName ("-K");
		setNbArgs (1);
		setInclude ("");
		setExclude ("");
		setHelp ("Location for kermeta standard unit(framerwork.km) (KermetaUnit.STD_LIB_URI variable)  ");
		setMultiple (true);
		setParameters (args);
	}
	
    /** */
    public void Proceed (Vector<String> list) 
    {
		getParameters().addAll (list);
    }
}
