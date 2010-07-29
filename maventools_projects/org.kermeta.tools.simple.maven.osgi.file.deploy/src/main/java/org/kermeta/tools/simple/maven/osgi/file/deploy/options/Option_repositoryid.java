/*
 * Created on 11 mai 2004
 *
 */
package org.kermeta.tools.simple.maven.osgi.file.deploy.options;

import java.util.Vector;

import org.kermeta.tools.simple.maven.osgi.file.deploy.CLI;


/**
*/
public class Option_repositoryid extends Option 
{
	/** */
	public Option_repositoryid (Vector<String> args)
	{
		setName ("-repositoryid");
		setNbArgs (1);
		setInclude ("");
		setExclude ("");
		setHelp ("id-to-map-on-server-section-of-settings.xml. Optional, default value = "+CLI.defaultRepositoryId);
		
		setMultiple (true);
		setParameters (args);
	}
	
    /** */
    public void Proceed (Vector<String> list) 
    {
		getParameters().addAll (list);
    }
}
