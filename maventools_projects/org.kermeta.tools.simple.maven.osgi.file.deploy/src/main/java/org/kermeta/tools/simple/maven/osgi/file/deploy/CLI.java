/* $Id$
 * Project    : org.kermeta.tools.simple.maven.osgi.file.install
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 27 juil. 2010
 * Authors : 
 *           Didier Vojtisek <didier.vojtisek@inria.fr> 
 */
package org.kermeta.tools.simple.maven.osgi.file.deploy;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.kermeta.tools.simple.maven.osgi.file.deploy.options.CheckOption;
import org.kermeta.tools.simple.maven.osgi.file.deploy.options.NoOption;
import org.kermeta.tools.simple.maven.osgi.file.deploy.options.Option;
import org.kermeta.tools.simple.maven.osgi.file.deploy.options.Option_H;
import org.kermeta.tools.simple.maven.osgi.file.deploy.options.Option_groupid;
import org.kermeta.tools.simple.maven.osgi.file.deploy.options.Option_jarfolder;
import org.kermeta.tools.simple.maven.osgi.file.deploy.options.Option_repositoryid;
import org.kermeta.tools.simple.maven.osgi.file.deploy.options.Option_simulate;
import org.kermeta.tools.simple.maven.osgi.file.deploy.options.Option_url;






/**
 * Command Line Interface for the simple maven OSGI file installer
 *
 */
public class CLI {


    protected CheckOption checkOption;
    protected String[] theArgs;
    protected int nbOptionErrors=0;
    
    protected String jarFolder=".";
    protected String groupId="org.kermeta";
    protected String repositoryId="localhost";
    protected boolean simulation=false;
    protected String defaultVersion="1.0.0";
    protected String deploymentUrl = "file:///var/www/html/maven2";
    
    
    /**
     * Initialize the runner's attributes from the arguments
     * @param args
     */
	public CLI(String[] args) {
		super();
	    theArgs = args;
	    //	  We build the object that will check the arguments with the wanted options.
		checkOption = new CheckOption (
			new Option[] {
				new NoOption (new Vector<String>()),
				new Option_jarfolder (new Vector<String>()),
				new Option_groupid (new Vector<String>()),
				new Option_repositoryid (new Vector<String>()),
				new Option_url (new Vector<String>()),
				new Option_simulate (),
				new Option_H ()
			} 
		);
		if(args.length ==0){
			System.out.println("No parameter seen : using default values");
			checkOption.DisplayHelp(System.out);
		}
	    nbOptionErrors = checkOption.Proceed(args);
	    if (checkOption.Saw ("-jarfolder"))
		{
	    	Iterator<?> it = checkOption.getOption("-jarfolder").getParameters().iterator();			
			if (it.hasNext())
			{
				jarFolder = it.next().toString();
			}
		}
	    if (checkOption.Saw ("-groupid"))
		{
	    	Iterator<?> it = checkOption.getOption("-groupid").getParameters().iterator();			
			if (it.hasNext())
			{
				groupId = it.next().toString();
			}
		}
	    if (checkOption.Saw ("-repositoryid"))
		{
	    	Iterator<?> it = checkOption.getOption("-repositoryid").getParameters().iterator();			
			if (it.hasNext())
			{
				repositoryId = it.next().toString();
			}
		}
	    if (checkOption.Saw ("-url"))
		{
	    	Iterator<?> it = checkOption.getOption("-url").getParameters().iterator();			
			if (it.hasNext())
			{
				deploymentUrl = it.next().toString();
			}
		}
	    if(checkOption.Saw ("-h"))
	    {
	    	checkOption.DisplayHelp(System.out);
	    }
	}

	/**
	 * entry point for the command lien
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {		
		CLI theLauncherRun;				
	    theLauncherRun = new CLI(args);
	    theLauncherRun.run();		
	}
	
	public void run() throws IOException, InterruptedException {
		File dir = new File(this.jarFolder);
		if(!dir.exists()){
			System.err.println("Error : " + this.jarFolder + " doesn't exist" );
			return;
		}
		if(!dir.isDirectory()){
			System.err.println("Error : " + this.jarFolder + " isn't a directory, if you which to send a jar, simply use the mvn command" );
			return;
		}
		for( String file : dir.list()){
			if(file.endsWith(".jar")){
				StringBuffer command = new StringBuffer("mvn deploy:deploy-file ");
				command.append(" -Dfile="+this.jarFolder+"/"+file);
				command.append(" -DgroupId="+groupId);
				command.append(" -DartifactId=" +getArtifactId(file));
				command.append(" -Dversion="+getVersion(file));
				command.append(" -DrepositoryId="+repositoryId);
				command.append(" -Dpackaging=jar");
				command.append(" -DgeneratePom=true");
				command.append(" -Durl="+deploymentUrl);
				System.out.println(command);
				if(!simulation){
					Process p = Runtime.getRuntime().exec(command.toString());
					// redirect output
					BufferedReader r1 = new BufferedReader(
	                        new InputStreamReader(p.getInputStream())
					);
	                String x;
	                while ((x = r1.readLine()) != null) {
	                	System.out.println(x);
	                }
	                r1.close();
					p.waitFor(); // wait for the end of the command
				}
			}
			else{
				System.out.println("ignoring " + file );
			}
		}
	}
	
	protected String getArtifactId(String jarFileName){
		StringBuffer result = new StringBuffer();
		java.util.StringTokenizer tokenizer = new java.util.StringTokenizer(jarFileName.replace(".jar", ""), "_");
		boolean versionFound = false;
		boolean isFirst = true;
		while ( tokenizer.hasMoreTokens() ) {
			String n = tokenizer.nextToken();
			Pattern p = Pattern.compile("\\d.*");
			Matcher m = p.matcher(n);
			if( m.matches() ){
				versionFound= true;
			}
			if(!versionFound){
				if(!isFirst){
					result.append("_");
				}
				result.append(n); 
			}
			isFirst=false;
			
		}
		return result.toString();
	}
	protected String getVersion(String jarFileName){
		StringBuffer result = new StringBuffer();
		java.util.StringTokenizer tokenizer = new java.util.StringTokenizer(jarFileName.replace(".jar", ""), "_");
		boolean versionFound = false;
		boolean isFirst = true;
		while ( tokenizer.hasMoreTokens() ) {
			String n = tokenizer.nextToken();
			Pattern p = Pattern.compile("\\d.*");
			Matcher m = p.matcher(n);
			if( m.matches() ){
				versionFound= true;
			}
			if(versionFound){
				if(!isFirst){
					result.append("_");
				}
				result.append(n);
				isFirst=false; 
			}
			
		}
		if(!versionFound){
			result.append(defaultVersion);
		}
		return result.toString();
	}
}
