/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: EMFResourceImpl.java,v 1.1 2008-07-02 09:13:18 ftanguy Exp $
 */
package kermeta.persistence.impl;

import kermeta.language.structure.Object;
import kermeta.persistence.EMFResource;
import kermeta.persistence.PersistencePackage;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.kermeta.compil.runtime.helper.basetypes.PersistenceUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMF Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMFResourceImpl extends ResourceImpl implements EMFResource
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMFResourceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PersistencePackage.Literals.EMF_RESOURCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean saveAndValidateWithEMF()
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public void load() {
	  if ( getValues() == null )
		  setValues( new BasicEList<Object>() );
	  else
		  getValues().clear();
	  EList<EObject> contents = PersistenceUtil.load(getUri(), getMetaModelURI());
	  for ( EObject o : contents )
		  getValues().add( (Object) o );
	/*  setValues( new BasicEList<kermeta.language.structure.Object>() );
		
	  ResourceSet resourceSet = new ResourceSetImpl();
	  // Register the appropriate resource factory to handle all file
	  // extensions.
	  resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
	  URI uri = URI.createURI(getUri());
	  org.eclipse.emf.ecore.resource.Resource basicResource = resourceSet.createResource(uri);

	  BasicExtendedMetaData metadata = new BasicExtendedMetaData();
	  metadata.putPackage( getMetaModelURI(), Mapping.INSTANCE().getEPackageForLoading(getMetaModelURI()));
		
	  Map options = new HashMap();
	  options.put(XMLResource.OPTION_EXTENDED_META_DATA, metadata);

	  try {
		  basicResource.load(options);
		  for (java.lang.Object o : basicResource.getContents()) {
			  getValues().add( (kermeta.language.structure.Object) o );
		  }
	  } catch (IOException e) {
		  e.printStackTrace();
	  }*/
  
  }
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public void saveWithNewURI(String new_uri) {
	  EList<EObject> contents = new BasicEList<EObject>();
	  for ( Object o : getValues() )
		  contents.add(o);
	  PersistenceUtil.saveWithNewURI(contents, new_uri, getMetaModelURI());
	 /* ResourceSet resourceSet = new ResourceSetImpl();
	  
		// Register the appropriate resource factory to handle all file
		// extensions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());
	  
	  URI uri = URI.createURI(new_uri);
	  org.eclipse.emf.ecore.resource.Resource basicResource = resourceSet.createResource(uri);

	  org.eclipse.emf.ecore.EPackage realMetamodel = Mapping.INSTANCE().getEPackageForSaving(getMetaModelURI());
	  
	  BasicExtendedMetaData metadata = new BasicExtendedMetaData();
	  metadata.putPackage( getMetaModelURI(), realMetamodel );

	  XMLMap xmlMap = new XMLMapImpl();
	  XMLInfo info = new XMLInfoImpl();
	  info.setTargetNamespace( realMetamodel.getNsURI() );
	  xmlMap.add( getValues().get(0).eClass(), info);
	  
	  Map options = new HashMap();
	  options.put(XMLResource.OPTION_EXTENDED_META_DATA, metadata);
	  options.put(XMLResource.OPTION_XML_MAP, xmlMap);
	  
	  try {
		  basicResource.getContents().addAll( getValues() );
		  basicResource.save(options);
	  } catch (IOException e) {
		  e.printStackTrace();
	  }  */
  }

} //EMFResourceImpl
