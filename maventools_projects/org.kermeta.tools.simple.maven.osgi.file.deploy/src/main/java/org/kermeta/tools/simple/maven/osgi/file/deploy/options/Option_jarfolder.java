/*
 * Created on 11 mai 2004
 *
 */
package org.kermeta.tools.simple.maven.osgi.file.deploy.options;

import java.util.Vector;


/**
*/
public class Option_jarfolder extends Option 
{
	/** */
	public Option_jarfolder (Vector<String> args)
	{
		setName ("-jarfolder");
		setNbArgs (1);
		setInclude ("");
		setExclude ("");
		setHelp ("folder containing the jar that must be analyzed and send to the maven repository");
		setMultiple (true);
		setParameters (args);
	}
	
    /** */
    public void Proceed (Vector<String> list) 
    {
		getParameters().addAll (list);
    }
}
