/* $Id: $
 * Creation date: Oct, 2008
 * License: EPL
 * Copyright: IRISA/INRIA
 * Authors:
 *		Didier Vojtisek
 */

package org.kermeta.uml2.profiles.model.ui.wizards;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.osgi.util.ManifestElement;
import org.kermeta.interpreter.api.Interpreter;
import org.kermeta.interpreter.api.InterpreterMode;
import org.kermeta.uml2.profiles.model.ui.Activator;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleException;
import org.osgi.framework.Constants;

import fr.irisa.triskell.eclipse.console.EclipseConsole;
import fr.irisa.triskell.eclipse.console.IOConsole;
import fr.irisa.triskell.eclipse.console.messages.InfoMessage;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;

/**
 * Class used to run a kermeta checker (interpreted version)
 */
public class SimpleInterpretedJob extends Job {

	
	public Error catchedError;
	public KermetaRaisedException catchedException;
	
	protected String pluginId;
	protected Set<String> parameters;
	protected Set<String> requiredClassPathes;
	protected String jobname;
	
	protected String kermeta_code; // = "platform:/plugin/org.kermeta.uml2.profile.marte/wfr/checker/MarteChecker.kmt";
	protected String main_class; // = "MarteChecker::Main";
	protected String main_operation; // = "main";
	
	
	public SimpleInterpretedJob(String _jobname, 
								String _pluginId, 
								String _kermeta_code,
								String _main_class,
								String _main_operation,
								Set<String> _parameters, 
								Set<String> _requiredClassPathes) {
		super(_jobname);
		jobname				= _jobname;
		pluginId 			= _pluginId;
		kermeta_code= _kermeta_code;
		main_class 	= _main_class;
		main_operation 		= _main_operation;
		parameters 		= _parameters;
		requiredClassPathes = _requiredClassPathes;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try{
			IOConsole console = new EclipseConsole("Kermeta Interpreter");
			console.println(new InfoMessage("Launching " + kermeta_code + "..."));
			for(String s : parameters) {
				console.println(new InfoMessage("    " + s ));
			}
			monitor.beginTask(jobname, IProgressMonitor.UNKNOWN);
			monitor.subTask("Preparing interpreter");
			//SubMonitor progress = SubMonitor.convert(monitor, "Loading " + fileName, 4 );
			
			Interpreter interpreter = new Interpreter(kermeta_code, InterpreterMode.RUN, null, console);		
		    interpreter.setEntryPoint(main_class, main_operation);
			String[] parametersArray = this.parameters.toArray(new String[0]);
			
			interpreter.setParameters(parametersArray);
			monitor.subTask("Interpreter running");
			updateContextClassLoader(interpreter);
			interpreter.launch();
			
			//monitor.done();
			//console.println(new OKMessage("Execution terminated successfully."));
			return new Status(IStatus.OK, pluginId, "Interpreter end");
		}
		catch (KermetaRaisedException e){
			catchedException = e;
			return new Status(IStatus.OK, pluginId, "Kermeta exception not catched by the kermeta checker", e);
		}
		catch (Error ome){
			catchedError = ome;
			return new Status(IStatus.ERROR, pluginId, "Problem : unexpected Error (see the error log view for more details)", ome);
		} catch (Exception e){
			return new Status(IStatus.ERROR, pluginId, "Problem : unexpected exception (see the error log view for more details)", e);
		}
	}
	
	protected void updateContextClassLoader(Interpreter interpreter){
		 try {
			// Add some URL to the classloader of the interpreter : needed if your code use some extra java classes (via extern for example)
			// use a set for building the URL (in case some may fail due to malformed URL
			// Note : URL must end with a / if this is a directory, if not, this is considered as a jar by the classloader
			Set<URL> urlsSet = new LinkedHashSet<URL>();
			Bundle bundle = org.eclipse.core.runtime.Platform.getBundle(this.pluginId);
			//bundle.
			// URL used when run in a runtimeworkbench, this allows to debug the plugin
			//safeAddURLAsString(urlsSet, "file://" + FileLocator.Platform.resolve(Platform.getPlugin("fr.irisa.triskell.kmlogo.model").getDescriptor().getInstallURL()).getFile() + "bin/");
			// add this plugin as a deployed plugin
			//Bundle bundle = org.eclipse.core.runtime.Platform.getBundle(this.pluginId);
			if(bundle != null){
				//safeAddURLAsString(urlsSet,FileLocator.resolve(bundle.getEntry("/")).toString());
				//urlsSet.add(FileLocator.resolve(bundle.getEntry("/")));
				
			    String requires = (String) bundle.getHeaders().get(Constants.REQUIRE_BUNDLE);
			    //Constants.REQUIRE_BUNDLE
				ManifestElement[] elements = ManifestElement.parseHeader(Constants.REQUIRE_BUNDLE, requires);
				if (elements != null) {
					for(ManifestElement element : elements ){
						Bundle requiredBundle = org.eclipse.core.runtime.Platform.getBundle(element.getValue());
						safeAddURLAsString(urlsSet, requiredBundle.getLocation());
						
						if(Platform.inDevelopmentMode()){
							try {
								URL classpathURL = requiredBundle.getEntry("/.classpath");
								if(classpathURL != null){
									String outputdir = "bin";
									FileLocator.resolve(requiredBundle.getEntry("/.classpath"));
									InputStream iStream = requiredBundle.getEntry("/.classpath").openStream();
									String classpathXMLData = convertStreamToString(iStream);
									
									Pattern pattern = Pattern.compile("<classpathentry kind=\"output\" path=\"(.*)\"/>");
							        Matcher matcher = pattern.matcher(classpathXMLData);
							        while (matcher.find()){
							            System.out.println("[" + matcher.group(1) + "]");
							            outputdir = matcher.group(1);
							        }
									//try with bin directory
									// a cleaner approach would be to read the .classpath and find the outputdir ...
									URL binURL = requiredBundle.getEntry(outputdir+"/");
									if(binURL != null) 
										urlsSet.add(binURL);
								}
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
					
				}
			 
				safeAddURLAsString(urlsSet,bundle.getLocation());
	//			Activator.internalLog.debug("classloader updated with " +FileLocator.resolve(bundle.getEntry("/")));
			}		
			for(String s : this.requiredClassPathes){
				safeAddURLAsString(urlsSet,s);
			}
			
			// convert the set into an array
			URL[] urls = new URL[urlsSet.size()];
			int i = 0;
			for (URL url : urlsSet) {
				urls[i] = url;
				i++;
			}
			
			URLClassLoader cl = new URLClassLoader(urls, interpreter.getClass().getClassLoader());
			//Thread.currentThread().setContextClassLoader(cl);
			interpreter.setContextClassLoader(cl);
		} catch (BundleException e) {
			Activator.log(new Status(IStatus.WARNING, Activator.PLUGIN_ID, IStatus.WARNING, "problem parsing entries of the classpath, classloader not updated, "
	 	            , e));
		}
	}
	
	
	public String convertStreamToString(InputStream is) {
        /*
         * To convert the InputStream to String we use the BufferedReader.readLine()
         * method. We iterate until the BufferedReader return null which means
         * there's no more data to read. Each line will appended to a StringBuilder
         * and returned as String.
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
 
        String line = null;
        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
 
        return sb.toString();
    }

	/**
	 * add a new URL to the set
	 * Doesn't fail if the URL is malformed, in that case, only a warning is raised, 
	 * @param urlsSet : set that will contain the URL built
	 * @param url : String of the URL to build
	 */
	private static void safeAddURLAsString(Set<URL> urlsSet, String url){
		try{
			URL u =  new URL(url);
			// sometimes we get a strange referenc:/file:/  url.  remove the leading protocol
			if(u.getProtocol().equals("reference")){
				urlsSet.add(new URL(u.getFile()));
			}
			else {
				urlsSet.add(new URL(url));
			}
		} catch (MalformedURLException e) {
			Activator.log(new Status(IStatus.WARNING, Activator.PLUGIN_ID, IStatus.WARNING, "problem adding an entry of the classpath, "
	 	            + url + " cannot be added in classloader", e));
		}
	}
}
