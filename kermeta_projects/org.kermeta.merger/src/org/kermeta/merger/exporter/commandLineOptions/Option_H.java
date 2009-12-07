/*
 * Created on 11 mai 2004
 *
 */
package org.kermeta.merger.exporter.commandLineOptions;

import java.util.Vector;

import org.kermeta.utils.argumentsreader.Option;

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
		setHelp ("Display the help ");
		setMultiple (false);
	}
	
    /** */
    public void Proceed (Vector<String> list) 
    {
		getParameters().addAll (list);
    }
}
