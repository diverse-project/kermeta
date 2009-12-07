/*
 * Created on 11 mai 2004
 *
 */
package org.kermeta.merger.exporter.commandLineOptions;

import java.util.Vector;

import org.kermeta.utils.argumentsreader.Option;

/**
*/
public class Option_kconf extends Option 
{
	/** */
	public Option_kconf (Vector<String> args)
	{
		setName ("-kconf");
		setNbArgs (1);
		setInclude ("");
		setExclude ("");
		setHelp ("Location used to resolve kconf:/loader/ URIs. Both are mapped to the same location. Location must use file:/ protocol and finish with a /");
		setMultiple (true);
		setParameters (args);
	}
	
    /** */
    public void Proceed (Vector<String> list) 
    {
		getParameters().addAll (list);
    }
}
