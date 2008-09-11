/**
 * <copyright>
 * </copyright>
 *
 * $Id: VoidImpl.java,v 1.2 2008-09-11 12:34:51 cfaucher Exp $
 */
package kermeta.standard.impl;

import kermeta.language.structure.Type;

import kermeta.language.structure.impl.ObjectImpl;

import kermeta.standard.StandardPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Void</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VoidImpl extends ObjectImpl implements kermeta.standard.Void {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VoidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.VOID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isVoid() {

		java.lang.Boolean result = null;

		result = true;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isInstanceOf(Type type) {

		java.lang.Boolean result = null;

		result = true;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {

		java.lang.String result = null;

		result = "<void>";

		return result;

	}

} //VoidImpl
