/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: EMFResourceImpl.java,v 1.3 2008-07-08 08:52:31 ftanguy Exp $
 */
package kermeta.persistence.impl;

import kermeta.persistence.EMFResource;
import kermeta.persistence.PersistencePackage;

import org.eclipse.emf.ecore.EClass;
import org.kermeta.compil.runtime.helper.basetypes.Loader;
import org.kermeta.compil.runtime.helper.basetypes.Saver;

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
	  clear();
	  Loader.load(getValues(), getUri(), getMetaModelURI());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public void save() {
	  Saver.save(getValues(), getUri(), getMetaModelURI());
  }
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public void saveWithNewURI(String new_uri) {
	  Saver.save(getValues(), new_uri, getMetaModelURI());
  }

} //EMFResourceImpl
