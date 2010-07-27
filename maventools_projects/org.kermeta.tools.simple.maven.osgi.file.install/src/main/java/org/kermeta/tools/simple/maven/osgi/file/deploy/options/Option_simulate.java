/*
 * Created on 11 mai 2004
 *
 */
package org.kermeta.tools.simple.maven.osgi.file.deploy.options;

import java.util.Vector;


/**
*/
public class Option_simulate extends Option 
{
	/** */
	public Option_simulate ()
	{
		setName ("-simulate");
		setNbArgs (0);
		setInclude ("");
		setExclude ("");
		setHelp ("do not really send the artifact to the repository, simply prints what it will do");
		setMultiple (false);
	}
	
    /** */
    public void Proceed (Vector<String> list) 
    {
		getParameters().addAll (list);
    }
}
