/*
 * Created on 11 mai 2004
 *
 */
package org.kermeta.tools.simple.maven.osgi.file.deploy.options;

import java.util.Vector;

import org.kermeta.tools.simple.maven.osgi.file.deploy.CLI;


/**
*/
public class Option_url extends Option 
{
	/** */
	public Option_url (Vector<String> args)
	{
		setName ("-url");
		setNbArgs (1);
		setInclude ("");
		setExclude ("");
		setHelp ("URL where the jars will be deployed. Optional, default value = "+CLI.defaultDeploymentUrl);
		setMultiple (true);
		setParameters (args);
	}
	
    /** */
    public void Proceed (Vector<String> list) 
    {
		getParameters().addAll (list);
    }
}
