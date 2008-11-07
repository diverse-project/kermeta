
/*$Id: PersistenceUtil.java,v 1.6 2008-11-07 08:54:01 cfaucher Exp $
* Project : org.kermeta.compiler.generator
* File : 	PersistenceUtil.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 24 juin 08
* Authors : 
* 			Francois TANGUY	<ftanguy@irisa.fr>
* 			Cyril FAUCHER	<cfaucher@irisa.fr>
*/

package org.kermeta.compil.runtime.helper.persistence;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLResource.XMLInfo;
import org.eclipse.emf.ecore.xmi.XMLResource.XMLMap;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLInfoImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;

/**
 * Not used for the moment. Experimentation result : loading and saving by just changing the package to use.
 * 
 * Does not work when generated code has been hacked structurally like ecore...
 * 
 * @generated
 */
public class PersistenceUtil {

	/**
	 * @generated
	 * @param modelURI
	 * @param metamodelURI
	 * @return
	 */
	@Deprecated
	static public EList<EObject> load(String modelURI, String metamodelURI) {

		EList<EObject> contents = new BasicEList<EObject>();
		ResourceSet resourceSet = new ResourceSetImpl();
		// Register the appropriate resource factory to handle all file extensions.
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
			
		URI uri = URI.createURI(modelURI);
		Resource basicResource = resourceSet.createResource(uri);

		BasicExtendedMetaData metadata = new BasicExtendedMetaData();
		//FIXME To restore: metadata.putPackage( metamodelURI, PersistenceMapping.getEPackageForLoading(metamodelURI));
		metadata.putPackage( metamodelURI, Registry.INSTANCE.getEPackage(metamodelURI));
			
		Map options = new HashMap();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, metadata);

		try {
			basicResource.load(options);
			contents.addAll( basicResource.getContents() );
		} catch (IOException e) {
			e.printStackTrace();
		}
		return contents;
	}
	
	/**
	 * @generated
	 * @param contents
	 * @param new_uri
	 * @param metamodelURI
	 */
	@Deprecated
	static public void saveWithNewURI(EList<EObject> contents, String new_uri, String metamodelURI) {
		ResourceSet resourceSet = new ResourceSetImpl();
		  
		// Register the appropriate resource factory to handle all file extensions.
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		  
		URI uri = URI.createURI(new_uri);
		org.eclipse.emf.ecore.resource.Resource basicResource = resourceSet.createResource(uri);

		//FIXME To restore: org.eclipse.emf.ecore.EPackage realMetamodel = PersistenceMapping.getEPackageForSaving(metamodelURI);
		  
		BasicExtendedMetaData metadata = new BasicExtendedMetaData();
		//FIXME To restore: metadata.putPackage( metamodelURI, realMetamodel );

		XMLMap xmlMap = new XMLMapImpl();
		XMLInfo info = new XMLInfoImpl();
		//FIXME To restore: info.setTargetNamespace( realMetamodel.getNsURI() );
		xmlMap.add( contents.get(0).eClass(), info);
		  
		Map options = new HashMap();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, metadata);
		options.put(XMLResource.OPTION_XML_MAP, xmlMap);
		  
		try {
			basicResource.getContents().addAll( contents );
			basicResource.save(options);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
