/**
 * <copyright>
 * </copyright>
 *
 * $Id: StringBufferImpl.java,v 1.2 2008-08-19 13:22:58 cfaucher Exp $
 */
package kermeta.utils.impl;

import kermeta.language.structure.impl.ObjectImpl;

import kermeta.utils.UtilsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Buffer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StringBufferImpl extends ObjectImpl implements
		kermeta.utils.StringBuffer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringBufferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilsPackage.Literals.STRING_BUFFER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.utils.StringBuffer append(String arg0) {

		kermeta.utils.StringBuffer result = null;

		result = (kermeta.utils.StringBuffer) org.kermeta.compil.runtime.helper.basetypes.StringBufferUtil
				.append(this, arg0);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer length() {

		java.lang.Integer result = null;

		result = (java.lang.Integer) org.kermeta.compil.runtime.helper.basetypes.StringBufferUtil
				.length(this);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {

		java.lang.String result = null;

		java.lang.String stringValue = null;

		stringValue = (java.lang.String) org.kermeta.compil.runtime.helper.basetypes.StringBufferUtil
				.toString(this);

		result = stringValue;

		return result;

	}

} //StringBufferImpl
