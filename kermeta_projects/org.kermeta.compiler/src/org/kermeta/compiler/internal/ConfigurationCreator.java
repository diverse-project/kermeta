

/*$Id: ConfigurationCreator.java,v 1.3 2008-07-23 15:19:32 cfaucher Exp $
* Project : org.kermeta.compiler.ui
* File : 	ConfigurationCreator.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 21 juil. 2008
* Authors : paco
*/

package org.kermeta.compiler.internal;

import java.io.IOException;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.kermeta.compil.runtime.helper.persistence.PersistenceMapping;
import org.kermeta.kruntimeconfiguration.Configuration;
import org.kermeta.kruntimeconfiguration.Entry;
import org.kermeta.kruntimeconfiguration.KruntimeconfigurationFactory;
import org.kermeta.kruntimeconfiguration.Persistence;

import fr.irisa.triskell.eclipse.emf.EMFRegistryHelper;

/**
 * A class that offers api to create a runtime configuration for persistency mechanism.
 * This class is used in a static way by calling createConfiguration method.
 * 
 * @author paco
 *
 */
public class ConfigurationCreator {

	/**
	 * Create a runtime configuration for persistency mechanism and save the constructed model into model plugin to be generated.
	 * @param genModel
	 * @throws IOException
	 */
	static public void createConfiguration(GenModel genModel) throws IOException {
		new ConfigurationCreator(genModel).doIt();
	}

	/**		The GenModel used to generate java source code. It contains many usefull values.	*/
	private GenModel _genModel;
	
	/**		The configuration object created by this process and to be saved in a file.	*/
	private Configuration _configuration;
	
	/**
	 * @param genModel
	 */
	private ConfigurationCreator(GenModel genModel) {
		_genModel = genModel;
	}
	
	/**
	 * Main method that creates the configuration and saves it.
	 * @throws IOException
	 */
	private void doIt() throws IOException {
		_configuration = KruntimeconfigurationFactory.eINSTANCE.createConfiguration();
		for ( GenPackage p : _genModel.getGenPackages() ) 
			updateConfiguration(p);
		saveConfiguration();
	}
	
	/**
	 * Create a piece of configuration for the given package and visit the subpackages.
	 * @param p The package to inspect for constructing persistence mapping.
	 */
	private void updateConfiguration(GenPackage p) {
		boolean isRegistered = EMFRegistryHelper.isRegistered( getURI(p) );
		Persistence persistence = null;
		if ( isRegistered ) {
			persistence = createPersistenceForRegisteredPackage(p);
			if ( persistence != null )
				_configuration.getPersistenceEntries().add( persistence );
		} else
			_configuration.getPersistenceEntries().add( createPersistenceForUnregisteredPackage(p) );
		// Visiting the subpackages.
		for ( GenPackage subPackage : p.getSubGenPackages() )
			updateConfiguration(subPackage);
	}

	/**
	 * 
	 * @param p
	 * @return
	 */
	private Persistence createPersistenceForRegisteredPackage(GenPackage p) {
		// Getting the real uri for the given package.
		String packageURI = getURI(p);
		// Try to find an extension matching the uri.
		IConfigurationElement[] elements = Platform.getExtensionRegistry().getConfigurationElementsFor("org.eclipse.emf.ecore.generated_package");
		IConfigurationElement element = null;
		int i = 0;
		do {
			IConfigurationElement currentElement = elements[i];
			if ( currentElement.getAttribute("uri").equals( packageURI ) )
				element = currentElement;
			i++;
		} while ( i < elements.length && element == null );
		// Only continue if an element has been found.
		if ( element != null ) {
			// Sometimes an extension does not have the "genModel" field set up, so it may cause an exception that we get rid of it.
			try {
				// Loading the GenModel coming from plugins.
				String genModelPath = "platform:/plugin/" + element.getContributor().getName() + "/" + element.getAttribute("genModel");
				ResourceSet rs = new ResourceSetImpl();
				Resource resource = rs.getResource( URI.createURI(genModelPath), true );
				GenModel genModelFromPlugin = (GenModel) resource.getContents().get(0);
				// Get the package with the given uri.
				GenPackage genPackageFromPlugin = GenModelUtil.getGenPackage(genModelFromPlugin, packageURI);			
				// And finally create the configuration persistence for that package.
				Persistence persistence = KruntimeconfigurationFactory.eINSTANCE.createPersistence();
				Entry fileExtension = KruntimeconfigurationFactory.eINSTANCE.createEntry();
				fileExtension.setKey( PersistenceMapping._FILE_EXTENSION_ );
				fileExtension.setValue( genPackageFromPlugin.getFileExtension() );
				
				Entry uri = KruntimeconfigurationFactory.eINSTANCE.createEntry();
				uri.setKey( PersistenceMapping._URI_);
				uri.setValue( packageURI );
				
				Entry baseClassName = KruntimeconfigurationFactory.eINSTANCE.createEntry();
				baseClassName.setKey( PersistenceMapping._BASE_CLASS_NAME_);
				baseClassName.setValue( genPackageFromPlugin.getClassPackageName() + "." + genPackageFromPlugin.getPackageClassName() );
				
				Entry factoryClassName = KruntimeconfigurationFactory.eINSTANCE.createEntry();
				factoryClassName.setKey( PersistenceMapping._FACTORY_CLASS_NAME);
				factoryClassName.setValue( genPackageFromPlugin.getInterfacePackageName() + "." + genPackageFromPlugin.getFactoryInterfaceName() );
				
				Entry generatedClassName = KruntimeconfigurationFactory.eINSTANCE.createEntry();
				generatedClassName.setKey( PersistenceMapping._GENERATED_CLASS_NAME_);
				generatedClassName.setValue( p.getClassPackageName() + "." + p.getPackageClassName() );
				
				persistence.getEntries().add( fileExtension );
				persistence.getEntries().add( uri );
				persistence.getEntries().add( baseClassName );
				persistence.getEntries().add( generatedClassName );
				persistence.getEntries().add( factoryClassName );
				return persistence;
			} catch (Exception e) {
				// The genModel does not exist. Forget it.
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @param p
	 * @return
	 */
	static private String getURI(GenPackage p) {
		String realURI = p.getEcorePackage().getEAnnotation("kermeta").getDetails().get("ecoreUri");
		if ( EMFRegistryHelper.isRegistered( realURI ) )
			return realURI;
		else
			return p.getNSURI();
	}
		
	/**
	 * 
	 * @param p
	 * @return
	 */
	private Persistence createPersistenceForUnregisteredPackage(GenPackage p) {
		Persistence persistence = KruntimeconfigurationFactory.eINSTANCE.createPersistence();
		Entry fileExtension = KruntimeconfigurationFactory.eINSTANCE.createEntry();
		fileExtension.setKey( PersistenceMapping._FILE_EXTENSION_ );
		fileExtension.setValue( p.getFileExtension() );
		
		Entry uri = KruntimeconfigurationFactory.eINSTANCE.createEntry();
		uri.setKey( PersistenceMapping._URI_);
		uri.setValue( getURI(p) );
		
		Entry baseClassName = KruntimeconfigurationFactory.eINSTANCE.createEntry();
		baseClassName.setKey( PersistenceMapping._BASE_CLASS_NAME_);
		baseClassName.setValue( p.getClassPackageName() + "." + p.getPackageClassName() );
		
		Entry factoryClassName = KruntimeconfigurationFactory.eINSTANCE.createEntry();
		factoryClassName.setKey( PersistenceMapping._FACTORY_CLASS_NAME);
		factoryClassName.setValue( p.getInterfacePackageName() + "." + p.getFactoryInterfaceName() );
		
		Entry generatedClassName = KruntimeconfigurationFactory.eINSTANCE.createEntry();
		generatedClassName.setKey( PersistenceMapping._GENERATED_CLASS_NAME_);
		generatedClassName.setValue( p.getClassPackageName() + "." + p.getPackageClassName() );
		
		persistence.getEntries().add( fileExtension );
		persistence.getEntries().add( uri );
		persistence.getEntries().add( baseClassName );
		persistence.getEntries().add( generatedClassName );
		persistence.getEntries().add( factoryClassName );
		return persistence;
	}
	
	/**
	 * 
	 * @throws IOException
	 */
	private void saveConfiguration() throws IOException {
		String path = "platform:/resource/" + _genModel.getModelPluginID() + "/config/" + "kermeta.kruntimeconfiguration";
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.createResource( URI.createURI(path) );
		resource.getContents().add(_configuration);
		resource.save(null);
	}
	
}


