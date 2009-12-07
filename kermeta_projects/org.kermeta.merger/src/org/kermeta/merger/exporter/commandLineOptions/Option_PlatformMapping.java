/*
 * Created on 11 mai 2004
 *
 */
package org.kermeta.merger.exporter.commandLineOptions;

import java.util.Vector;

import org.kermeta.utils.argumentsreader.Option;

/**
*/
public class Option_PlatformMapping extends Option 
{
	/** */
	public Option_PlatformMapping (Vector<String> args)
	{
		setName ("-PlatformMapping");
		setNbArgs (1);
		setInclude ("");
		setExclude ("-M");
		setHelp ("Location used to resolve platform:/resource and plaform:/plugin URIs. Both are mapped to the same location. Location must use file:/ protocol and finish with a /");
		setMultiple (true);
		setParameters (args);
	}
	
    /** */
    public void Proceed (Vector<String> list) 
    {
		getParameters().addAll (list);
    }
}
