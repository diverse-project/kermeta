/**
 * <copyright>
 * </copyright>
 *
 * $Id: EObjectImpl.java,v 1.8 2008-11-27 15:49:51 cfaucher Exp $
 */
package ecore.impl;

import ecore.EObject;
import ecore.EcorePackage;

import kermeta.language.structure.impl.ObjectImpl;

import org.eclipse.emf.ecore.EClass;

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
	protected EObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.EOBJECT;
	}

} //EObjectImpl
