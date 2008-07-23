

/*$Id: ConfigurationCreator.java,v 1.1 2008-07-23 12:34:34 ftanguy Exp $
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
 * 
 * @author paco
 *
 */
public class ConfigurationCreator {

	/**
	 * 
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
	
	private ConfigurationCreator(GenModel genModel) {
		_genModel = genModel;
	}
	
	private void doIt() throws IOException {
		_configuration = KruntimeconfigurationFactory.eINSTANCE.createConfiguration();
		for ( GenPackage p : _genModel.getGenPackages() ) 
			updateConfiguration(p);
		saveConfiguration();
	}
	
	/**
	 * 
	 * @param p
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
		for ( GenPackage subPackage : p.getSubGenPackages() )
			updateConfiguration(subPackage);
	}

	/**
	 * 
	 * @param p
	 * @return
	 */
	private Persistence createPersistenceForRegisteredPackage(GenPackage p) {
		String packageURI = getURI(p);
		IConfigurationElement[] elements = Platform.getExtensionRegistry().getConfigurationElementsFor("org.eclipse.emf.ecore.generated_package");
		IConfigurationElement element = null;
		int i = 0;
		do {
			IConfigurationElement currentElement = elements[i];
			if ( currentElement.getAttribute("uri").equals( packageURI ) )
				element = currentElement;
			i++;
		} while ( i < elements.length && element == null );
		if ( element != null ) {
			try {
				String genModelPath = "platform:/plugin/" + element.getContributor().getName() + "/" + element.getAttribute("genModel");
				ResourceSet rs = new ResourceSetImpl();
				Resource resource = rs.getResource( URI.createURI(genModelPath), true );
				GenModel genModelFromPlugin = (GenModel) resource.getContents().get(0);
				GenPackage genPackageFromPlugin = GenModelUtil.getGenPackage(genModelFromPlugin, packageURI);			
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
		String path = "platform:/resource/" + _genModel.getModelPluginID() + "/models/" + "kermeta.kruntimeconfiguration";
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.createResource( URI.createURI(path) );
		resource.getContents().add(_configuration);
		resource.save(null);
	}
	
}


