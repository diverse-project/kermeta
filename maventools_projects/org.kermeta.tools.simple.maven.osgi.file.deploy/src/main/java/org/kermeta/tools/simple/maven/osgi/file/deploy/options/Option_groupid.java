/*
 * Created on 11 mai 2004
 *
 */
package org.kermeta.tools.simple.maven.osgi.file.deploy.options;

import java.util.Vector;


/**
*/
public class Option_groupid extends Option 
{
	/** */
	public Option_groupid (Vector<String> args)
	{
		setName ("-groupid");
		setNbArgs (1);
		setInclude ("");
		setExclude ("");
		setHelp ("GroupId that will be used for the artifacts");
		setMultiple (true);
		setParameters (args);
	}
	
    /** */
    public void Proceed (Vector<String> list) 
    {
		getParameters().addAll (list);
    }
}
