/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: OrderedCollectionImpl.java,v 1.2 2008-07-25 12:40:04 ftanguy Exp $
 */
package kermeta.standard.impl;

import kermeta.standard.OrderedCollection;
import kermeta.standard.StandardPackage;

import org.eclipse.emf.ecore.EClass;
import org.kermeta.compil.runtime.helper.basetypes.OrderedCollectionUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ordered Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class OrderedCollectionImpl<G> extends CollectionImpl<G> implements OrderedCollection<G>
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OrderedCollectionImpl()
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
    return StandardPackage.Literals.ORDERED_COLLECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public void removeAt(int index) {
	  OrderedCollectionUtil.removeAt(this, index);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public void addAt(int index, G element) {
	  OrderedCollectionUtil.addAt(this, element, index);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public G last()
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int indexOf(G element)
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
  public G elementAt(int index) {
	  return (G) OrderedCollectionUtil.elementAt(this, index);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public G first()
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

} //OrderedCollectionImpl
