/**
 * <copyright>
 * </copyright>
 *
 * $Id: EObjectImpl.java,v 1.1 2008-09-04 15:40:23 cfaucher Exp $
 */
package ecore.impl;

import ecore.EObject;
import ecore.EReference;
import ecore.EStructuralFeature;
import ecore.EcorePackage;

import kermeta.language.structure.impl.ObjectImpl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EObject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EObjectImpl extends ObjectImpl implements EObject {
	  /**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated
	   */
	  protected EObjectImpl()
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
	    return EcorePackage.Literals.EOBJECT;
	  }
} //EObjectImpl
