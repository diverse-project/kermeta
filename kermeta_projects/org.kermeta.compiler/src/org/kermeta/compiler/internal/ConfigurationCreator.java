

/*$Id: ConfigurationCreator.java,v 1.8 2008-10-17 15:24:57 cfaucher Exp $
* Project : org.kermeta.compiler.ui
* File : 	ConfigurationCreator.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 21 juil. 2008
* Authors : Francois Tanguy <ftanguy@irisa.fr>
* 			Cyril Faucher <cfaucher@irisa.fr>
*/

package org.kermeta.compiler.internal;

import java.io.IOException;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.kermeta.compiler.generator.helper.model.Context;

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
	static public void createConfiguration(GenModel genModel, Context context) {
		new ConfigurationCreator(genModel, context).doIt();
	}

	/**		The GenModel used to generate java source code. It contains many usefull values.	*/
	private GenModel _genModel;
	
	private Context _context;
	
	/**
	 * @param genModel
	 */
	private ConfigurationCreator(GenModel genModel, Context context) {
		_genModel = genModel;
		_context = context;
	}
	
	/**
	 * Main method that creates the configuration and saves it.
	 * @throws IOException
	 */
	private void doIt() {
		
		String uriEPackageClass = "";
		for ( GenPackage p : _genModel.getGenPackages() ) {
			uriEPackageClass += updateConfiguration(p);
		}
		_context.setUriEPackageClass(uriEPackageClass);
		
		
		String uriEPackageInstance = "";
		for ( GenPackage p : _genModel.getGenPackages() ) {
			uriEPackageInstance += updateConfigurationInstance(p);
		}
		_context.setUriEPackageInstance(uriEPackageInstance);
		
	}
	
	/**
	 * Create a piece of configuration for the given package and visit the subpackages.
	 * @param p The package to inspect for constructing persistence mapping.
	 */
	private String updateConfiguration(GenPackage p) {
		
		String result = "";
		if( p.canGenerate() ) {
			result = createPersistenceForRegisteredPackage(p);
		}
		
		for ( GenPackage subPackage : p.getSubGenPackages() ) {
			result += updateConfiguration(subPackage);
		}
		return result;
	}
	
	private String updateConfigurationInstance(GenPackage p) {
		
		String result = createPersistenceForAnyPackage(p);
		
		for ( GenPackage subPackage : p.getSubGenPackages() ) {
			result += updateConfigurationInstance(subPackage);
		}
		return result;
	}

	/**
	 * 
	 * @param p
	 * @return
	 */
	private String createPersistenceForRegisteredPackage(GenPackage p) {
		// Getting the real uri for the given package.
		String packageURI = getOriginalURI(p);
		// Try to find an extension matching the uri.
		
		String str_clazz = null;
		IConfigurationElement element = null;
		if( Platform.isRunning() ) {
			element = getIConfigurationElementByUri(packageURI);
			if( element != null ) {
				str_clazz = element.getAttribute("class");
				return "uri_ePackageClass.put(\"" + packageURI + "\", \"" + str_clazz + "\");\n";
			}
		}
				
		return "";
	}
	
	private String createPersistenceForAnyPackage(GenPackage p) {
		String basePackage = "";
		if( p.getBasePackage()!=null && !p.getBasePackage().equals("null") ) {
			basePackage = p.getBasePackage() + ".";
		}
		String packageClassName = basePackage + p.getEcorePackage().getName() + "." + CodeGenUtil.capName(p.getPrefix()) +"Package";
		return "EPackage.Registry.INSTANCE.put( " + packageClassName + ".eNS_URI, " + packageClassName + ".eINSTANCE );\n";
	}
	
	private static IConfigurationElement getIConfigurationElementByUri(String metamodelURI) {
		IConfigurationElement[] elements = Platform.getExtensionRegistry().getConfigurationElementsFor("org.eclipse.emf.ecore.generated_package");
		for( IConfigurationElement currentElement : elements ) {
			if ( currentElement.getAttribute("uri").equals( metamodelURI ) ) {
				return currentElement;
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @param p
	 * @return
	 */
	private String getOriginalURI(GenPackage p) {
		return p.getEcorePackage().getEAnnotation("kermeta").getDetails().get("ecoreUri");
	}

}


