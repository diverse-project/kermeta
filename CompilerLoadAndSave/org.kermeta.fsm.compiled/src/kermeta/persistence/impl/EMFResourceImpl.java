/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: EMFResourceImpl.java,v 1.2 2008-07-03 15:22:00 ftanguy Exp $
 */
package kermeta.persistence.impl;

import java.io.IOException;

import kermeta.language.structure.Object;
import kermeta.persistence.EMFResource;
import kermeta.persistence.PersistencePackage;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
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
	  if ( getValues() == null )
		  setValues( new BasicEList<Object>() );
	  else
		  getValues().clear();

	  for ( EObject o : Loader.load(getUri(), getMetaModelURI()) )
		  getValues().add( (Object) o );  
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
	  try {
		Saver.save(contents, new_uri, getMetaModelURI());
	} catch (IOException e) {
		e.printStackTrace();
	}
  }

} //EMFResourceImpl
