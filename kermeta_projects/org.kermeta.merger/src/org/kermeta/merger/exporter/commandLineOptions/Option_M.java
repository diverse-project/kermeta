/*
 * Created on 11 mai 2004
 *
 */
package org.kermeta.merger.exporter.commandLineOptions;

import java.util.Vector;

import org.kermeta.utils.argumentsreader.Option;

/**
*/
public class Option_M extends Option 
{
	/** */
	public Option_M (Vector<String> args)
	{
		setName ("-M");
		setNbArgs (1);
		setInclude ("");
		setExclude ("-PlatformMap");
		setHelp ("Indicate a file containing URI_MAP (This is usefull to solve some model loading troubles)");
		setMultiple (true);
		setParameters (args);
	}
	
    /** */
    public void Proceed (Vector<String> list) 
    {
		getParameters().addAll (list);
    }
}
