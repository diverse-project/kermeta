/*
 * Created on 11 mai 2004
 *
 */
package org.kermeta.tools.simple.maven.osgi.file.install.options;

import java.util.Vector;


/**
*/
public class Option_H extends Option 
{
	/** */
	public Option_H ()
	{
		setName ("-h");
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
