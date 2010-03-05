/*$Id: AbstractLaunchConfiguration.java,v 1.11 2008-05-28 09:25:39 ftanguy Exp $
 * Project : org.kermeta.runner
 * File : 	AbstractLaunchConfiguration.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 30 avr. 08
 * Authors : ftanguy
 */
package org.kermeta.runner.launching.compiler;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.kermeta.compiler.service.CompilerService;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.merger.Merger;
import org.kermeta.runner.RunnerPlugin;
import org.kermeta.runner.compiler.propertieseditor.service.PropertyFileService;
import org.kermeta.runner.launching.KConstants;
import org.osgi.framework.ServiceReference;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;

public class CompilerLaunchConfiguration implements
		ILaunchConfigurationDelegate {

	IProject p;
	File i_file;
	PropertyFileService i_propertiesFileService;

	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		String projectName = configuration.getAttribute(
				KConstants.KM_PROJECTNAME, (String) null);
		p = ResourceHelper.getIProject(projectName);
		System.err.println(p);
		//Map m = configuration.getAttributes();
		/*IFile f = p.getFile("Compiler.properties");
		if (f.exists()) {
			this.i_file = new File(f.getLocation().toOSString());
			i_propertiesFileService = new PropertyFileService(i_file);
			try {
				/*Collection<PropertyLineWrapper> properties = i_propertiesFileService
						.readPropertiesFile();*/
				/*for (Object o : m.keySet()) {
					System.out.println("key :" + o.toString() + " value :"
							+ m.get(o));
				}
				for (PropertyLineWrapper o : properties) {
					System.out.println("key :" + o.getKeyString() + " value :"
							+ o.getValueString());
				}
				

				

			} catch (PropertyException e) {
				e.printStackTrace();
			}*/
			ServiceReference ref = RunnerPlugin.getDefault().getContext().getServiceReference(
		            CompilerService.class.getName());
		System.out.println(ref);
		if (ref != null){
			CompilerService serv =
                    (CompilerService) RunnerPlugin.getDefault().getContext().getService(ref);
			//p.getLocation()
			String projectpath = p.getLocation().toOSString();
			String kmpath= projectpath+File.separatorChar+configuration.getAttribute("fr.irisa.triskell.kermeta.launching.KM_FILENAME", (String)null).substring(projectName.length() +2);
			
			this.merge("platform:/resource"+ configuration.getAttribute("fr.irisa.triskell.kermeta.launching.KM_FILENAME", (String)null));
			
			
			
			Object o = configuration.getAttribute("org.eclipse.jdt.launching.CLASSPATH",(List)null);
			System.out.println(o.getClass());
			
			serv.compile(kmpath.substring(0,kmpath.length()-1), 
					projectpath+File.separatorChar+"Compiler.properties", p.getName(), 
					configuration.getAttribute("fr.irisa.triskell.kermeta.launching.KM_CLASSQNAME", (String)null),
					configuration.getAttribute("fr.irisa.triskell.kermeta.launching.KM_OPERATIONNAME", (String)null),
					new ArrayList<String>(), 
					configuration.getAttribute("fr.irisa.triskell.kermeta.launching.KM_ARGUMENTS", (String)null));
			
			
			//serv.compile(uri, propertiesfile, projectName, classqname, operationName, claspath, args)
			RunnerPlugin.getDefault().getContext().ungetService(ref);
			
		}
		
	}

	
	public void merge(String kmtpath){
		
    	KermetaUnit kermetaUnit = null;
    	try {
			kermetaUnit = LoaderPlugin.getDefault().load(kmtpath, null);
		} catch (URIMalformedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotRegisteredURIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	kermetaUnit.setFramework(false);
    	for ( KermetaUnit unit : KermetaUnitHelper.getAllImportedKermetaUnits(kermetaUnit) )
    		unit.setFramework(false);
    	
        if ( kermetaUnit.isIndirectlyErroneous() ) {
        	System.err.println("Standard library contains type errors:");
        	System.err.println( KermetaUnitHelper.getAllErrorsAsString(kermetaUnit) );
        	//System.exit(0);
        }
        else
        {
        	if( kermetaUnit.isWarned() )
        	{
        		System.err.println("Standard library contains type warnings:");
            	System.err.println( KermetaUnitHelper.getAllWarningsAsString(kermetaUnit) );
        	}
        	

        	System.out.println("Merging and Saving...");
        	Merger merger = new Merger();
        	
        	Set<KermetaUnit> l = new HashSet<KermetaUnit>();
        	l.add(kermetaUnit);
        	l.addAll( KermetaUnitHelper.getAllImportedKermetaUnits(kermetaUnit) );
        	System.err.println(l.size());
        	for (KermetaUnit u : l){
        		System.err.println(u.getUri());
        	}
        	try {
				KermetaUnit mergedUnit = merger.process(l, kmtpath.substring(0,kmtpath.length()-1), true, true);
			} catch (URIMalformedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NotRegisteredURIException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	System.out.println("Mergin and Saving done");
        }
		
	}
	/**
	 * Throws an exception with a new status containing the given message and
	 * optional exception.
	 * 
	 * @param message
	 *            error message
	 * @param e
	 *            underlying exception
	 * @throws CoreException
	 */
	private void abort(String message, Throwable e) throws CoreException {
		throw new CoreException(new Status(IStatus.ERROR,
				KConstants.K_DEBUG_MODEL, 0, message, e));
	}
}
