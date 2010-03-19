

/*$Id: JavaKermetaUnitLoader.java,v 1.12 2008-05-28 13:37:12 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.io
* File : 	JavaKermetaUnitLoader.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 17 juil. 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.loader.java;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.loader.AbstractKermetaUnitLoader;
import org.kermeta.loader.LoadingContext;

import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.AbstractBuildingState;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaKermetaUnitLoader extends AbstractKermetaUnitLoader {

	private LoadingContext context = new LoadingContext();
	
	private ClassLoader classLoader = null;
	
	//	 The cache structure are there but will be filled only on request due to the memory required to keep it	
	private JarCache jarCache;
	
    final static public Logger internalLog = LoggerFactory.getLogger("JarKermetaUnitLoader");

    
    public JavaKermetaUnitLoader(Map<String, Object> options, IProgressMonitor monitor) {
    	super(options, monitor);
    }
    
    
	public KermetaUnit load(String uri) {
		try {
			
			KermetaUnit unit = IOPlugin.getDefault().getKermetaUnit(uri);

			// jar unit are automatically dependent on the framework
			KermetaUnit frameworkUnit = IOPlugin.getDefault().getKermetaUnit(IOPlugin.FRAMEWORK_KM_URI);
			unit.getImportedKermetaUnits().add(frameworkUnit);
			unit.getTypeDefinitionCache().setExternalSearchAuthorized(true);
			unit.addRequire(IOPlugin.FRAMEWORK_KM_URI, frameworkUnit);

			JavaBuildingState buildingState = (JavaBuildingState) unit.getBuildingState();
			
			if ( buildingState.loaded )
				return unit;
			
			preLoad(unit);
			
			jarCache = new JarCache( unit, classLoader );	
							
			loadTypeDefinitions(unit);
			loadStructuralFeatures(unit);
			
			AbstractBuildingState state = (AbstractBuildingState) unit.getBuildingState();
			state.loaded = true;
			
			constructAspectsListsForAll(unit);
			
			return unit;
		} catch (URIMalformedException e) {
			e.printStackTrace();
			return null;
		} catch (NotRegisteredURIException e) {
			e.printStackTrace();
			return null;
		}
	}
	
    private void preLoad(KermetaUnit kermetaUnit) {

    	URI platformURI = URI.createURI( kermetaUnit.getUri() );
    	URI localURI = CommonPlugin.asLocalURI(platformURI);    // localized version of the URI	
    	try{
	    	
			URL url = new URL(localURI.toString());
	    	
			URL[] urls = new URL[1];
	    	urls[0] = url; //new URL(nuri.toFileString());
	    	
	    	// add the kermeta runtime lib for an eventual use of RuntimeObject
	    	
	    	classLoader = new URLClassLoader(urls);
	    	
	    	//com.sun.jdi.ClassLoaderReference clref = com.sun.jdi.ReferenceType.classLoader();
	    	//List clist = clref.definedClasses();
	    	
	    		    	//voir http://java.sun.com/docs/books/tutorial/deployment/jar/jarclassloader.html
	    	
	    } catch (MalformedURLException e) {
	    	kermetaUnit.error( "Cannot load jar file. The URL "
							+ localURI.toString()
							+ " is malformed", null);
	    	internalLog.error("Cannot load jar file. The URL "
							+ localURI.toString()
							+ " is malformed", e);
		} 
    	
    }
    
    private void loadTypeDefinitions(KermetaUnit kermetaUnit) {
    	Jar2KMPass pass = new Jar2KMPass2(kermetaUnit);
		pass.process();
		jarCache.setPlannedNbClasses(
				//typeDefs.size()
				1000);
    }
    
    private void loadStructuralFeatures(KermetaUnit kermetaUnit) {
    	Jar2KMPass pass3 = new Jar2KMPass3(kermetaUnit, classLoader, jarCache);
		try{
	    	pass3.process();
    	}
    	catch(java.lang.OutOfMemoryError e){
    		//packages.clear();
    		String msg = "Not enough memory to process your " 
    				//+ this.typeDefs.size() 
    				+ " java classes (stopped on the " + pass3.processedJavaClasses + "th); ";
    		msg += "\nplease consider using includeFilter and excludeFilter or increase the memory allocated to your jvm";
    		
    		internalLog.error(msg,e);
    		kermetaUnit.error(msg,null);
    		//typeDefs.clear();
    	}
    }
}


