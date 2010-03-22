/*$Id: $
* Project : fr.irisa.triskell.kermeta.io
* File : 	emptyKermetaunitBuilder.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 22 févr. 2010
* Authors : Didier Vojtisek
*/

package org.kermeta.kermetaunitloader.core;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.kermeta.io.IoFactory;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.kermetaunitloader.AbstractLoader;

import fr.irisa.triskell.eclipse.emf.EMFRegistryHelper;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.loader.ecore.ecore2km.EcoreBuildingState;
import fr.irisa.triskell.kermeta.loader.java.JavaBuildingState;
import fr.irisa.triskell.kermeta.loader.km.KmBuildingState;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.AbstractBuildingState;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMTBuildingState;

/**
 * either directly build an empty unit or use it as a loader
 * @author dvojtise
 *
 */
public class EmptyKermetaUnitBuilder extends AbstractLoader{
	public static KermetaUnit buildEmptyUnit(String uri, AbstractLoader loader) throws URIMalformedException, NotRegisteredURIException{

		String kermetaUnitURI = uri;
		
		boolean framework = false;
		if ( uri.equals("kermeta") ) {
			kermetaUnitURI = IOPlugin.getFrameWorkURI();
			framework = true;
		} else if ( uri.equals(IOPlugin.getFrameWorkURI()) )
			framework = true;
		else if ( uri.equals(IOPlugin.getFrameWorkEcoreURI()) )
			framework = true;
		else if ( uri.equals("java_rt_jar") ) {
			// if this is java declaration that are required
			String javahome = System.getProperty("java.home");
			javahome = javahome.replace("\\", "/");
			kermetaUnitURI = "file:/"+javahome+"/lib/rt.jar";
		}

		if ( 	! kermetaUnitURI.matches("platform:/plugin/.+") 
				&& 	! kermetaUnitURI.matches("platform://plugin/.+")
				&& 	! kermetaUnitURI.matches("platform:/resource/.+") 
				&&	! kermetaUnitURI.matches("http://.+")  
				&&	! kermetaUnitURI.matches("jar:file:.+")
				&&	! kermetaUnitURI.matches("file:.+") )
			throw new URIMalformedException( uri );

		/*
		 * Creating the Kermeta Unit. 
		 */		
		KermetaUnit kermetaUnit = IoFactory.eINSTANCE.createKermetaUnit();
		kermetaUnit.setUri( kermetaUnitURI );
		kermetaUnit.setFramework( framework );

		
		
		/*
		 * 
		 * Setting the loader for the kermeta unit.
		 * 
		 */
		int index = kermetaUnitURI.lastIndexOf(".");
		String extension = kermetaUnitURI.substring(index+1);
		if ( extension.equals("kmt") ) {
			kermetaUnit.setBuildingState( new KMTBuildingState() );
			kermetaUnit.setNeedASTTraces(true);
		} else if ( extension.equals("ecore") || uri.equals(IOPlugin.ECORE_URI) ){
			kermetaUnit.setBuildingState( new EcoreBuildingState() );
		} else if ( extension.equals("km") ){
			kermetaUnit.setBuildingState( new KmBuildingState() );
		}
		else if ( extension.equals("jar") ){
			kermetaUnit.setBuildingState( new JavaBuildingState() );
		}
		else if ( extension.equals("memory") ){
			kermetaUnit.setBuildingState( new KmBuildingState() );
		}
		else if ( ! EMFRegistryHelper.isRegistered( kermetaUnitURI ) ) {
			//				kermetaUnit.setBuildingState( new AbstractBuildingState() );
			//				kermetaUnit.error("Unknown Format. It is impossible to load this file.\n You may have to register this URI.");
			
			throw new NotRegisteredURIException(kermetaUnitURI);
		} else {
			Object o = Registry.INSTANCE.get( kermetaUnitURI );
			if ( o instanceof Package ){
				kermetaUnit.setBuildingState( new KmBuildingState() );
			}
			else if ( o instanceof EPackage.Descriptor ) {
				EPackage p = ((EPackage.Descriptor) o).getEPackage();
				if ( p instanceof Package )
					kermetaUnit.setBuildingState( new KmBuildingState() );
				else
					kermetaUnit.setBuildingState( new EcoreBuildingState() );

			}
			else if ( o instanceof EPackage ) {
				kermetaUnit.setBuildingState( new EcoreBuildingState() );
			} else
				kermetaUnit.error("Unknown Format. It is impossible to load this registered resource.");
		}	
		if((AbstractBuildingState)kermetaUnit.getBuildingState()!= null)
			((AbstractBuildingState)kermetaUnit.getBuildingState()).kermetaUnitLoader = loader;
			
		return kermetaUnit;
	}

	
	protected String uriToLoad;
	
	public EmptyKermetaUnitBuilder(String uriToLoad) throws URIMalformedException, NotRegisteredURIException {
		super();
		this.uriToLoad = uriToLoad;
		loadedUnit = buildEmptyUnit(uriToLoad, this);
	}

	@Override
	public void createCommands(){
		// nothing to do for empty unit
	}
	
}
