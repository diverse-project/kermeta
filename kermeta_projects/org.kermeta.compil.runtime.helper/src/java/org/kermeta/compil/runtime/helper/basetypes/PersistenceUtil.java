package org.kermeta.compil.runtime.helper.basetypes;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
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

public class PersistenceUtil {

	static public EList<EObject> load(String modelURI, String metamodelURI) {

		EList<EObject> contents = new BasicEList<EObject>();
		ResourceSet resourceSet = new ResourceSetImpl();
		// Register the appropriate resource factory to handle all file extensions.
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
			
		URI uri = URI.createURI(modelURI);
		Resource basicResource = resourceSet.createResource(uri);

		BasicExtendedMetaData metadata = new BasicExtendedMetaData();
		metadata.putPackage( metamodelURI, PersistenceMapping.getEPackageForLoading(metamodelURI));
			
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
		
	static public void saveWithNewURI(EList<EObject> contents, String new_uri, String metamodelURI) {
		ResourceSet resourceSet = new ResourceSetImpl();
		  
		// Register the appropriate resource factory to handle all file extensions.
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		  
		URI uri = URI.createURI(new_uri);
		org.eclipse.emf.ecore.resource.Resource basicResource = resourceSet.createResource(uri);

		org.eclipse.emf.ecore.EPackage realMetamodel = PersistenceMapping.getEPackageForSaving(metamodelURI);
		  
		BasicExtendedMetaData metadata = new BasicExtendedMetaData();
		metadata.putPackage( metamodelURI, realMetamodel );

		XMLMap xmlMap = new XMLMapImpl();
		XMLInfo info = new XMLInfoImpl();
		info.setTargetNamespace( realMetamodel.getNsURI() );
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
