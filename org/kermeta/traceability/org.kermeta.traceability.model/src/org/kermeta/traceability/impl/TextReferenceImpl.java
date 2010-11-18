/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.traceability.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.kermeta.traceability.TextReference;
import org.kermeta.traceability.TraceabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.traceability.impl.TextReferenceImpl#getCharBeginOffset <em>Char Begin Offset</em>}</li>
 *   <li>{@link org.kermeta.traceability.impl.TextReferenceImpl#getCharEndOffset <em>Char End Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextReferenceImpl extends FileReferenceImpl implements TextReference {
	/**
	 * The default value of the '{@link #getCharBeginOffset() <em>Char Begin Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharBeginOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CHAR_BEGIN_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharBeginOffset() <em>Char Begin Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharBeginOffset()
	 * @generated
	 * @ordered
	 */
	protected Integer charBeginOffset = CHAR_BEGIN_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharEndOffset() <em>Char End Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharEndOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CHAR_END_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharEndOffset() <em>Char End Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharEndOffset()
	 * @generated
	 * @ordered
	 */
	protected Integer charEndOffset = CHAR_END_OFFSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.TEXT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCharBeginOffset() {
		return charBeginOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharBeginOffset(Integer newCharBeginOffset) {
		Integer oldCharBeginOffset = charBeginOffset;
		charBeginOffset = newCharBeginOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.TEXT_REFERENCE__CHAR_BEGIN_OFFSET, oldCharBeginOffset, charBeginOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCharEndOffset() {
		return charEndOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharEndOffset(Integer newCharEndOffset) {
		Integer oldCharEndOffset = charEndOffset;
		charEndOffset = newCharEndOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.TEXT_REFERENCE__CHAR_END_OFFSET, oldCharEndOffset, charEndOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TraceabilityPackage.TEXT_REFERENCE__CHAR_BEGIN_OFFSET:
				return getCharBeginOffset();
			case TraceabilityPackage.TEXT_REFERENCE__CHAR_END_OFFSET:
				return getCharEndOffset();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TraceabilityPackage.TEXT_REFERENCE__CHAR_BEGIN_OFFSET:
				setCharBeginOffset((Integer)newValue);
				return;
			case TraceabilityPackage.TEXT_REFERENCE__CHAR_END_OFFSET:
				setCharEndOffset((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TraceabilityPackage.TEXT_REFERENCE__CHAR_BEGIN_OFFSET:
				setCharBeginOffset(CHAR_BEGIN_OFFSET_EDEFAULT);
				return;
			case TraceabilityPackage.TEXT_REFERENCE__CHAR_END_OFFSET:
				setCharEndOffset(CHAR_END_OFFSET_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TraceabilityPackage.TEXT_REFERENCE__CHAR_BEGIN_OFFSET:
				return CHAR_BEGIN_OFFSET_EDEFAULT == null ? charBeginOffset != null : !CHAR_BEGIN_OFFSET_EDEFAULT.equals(charBeginOffset);
			case TraceabilityPackage.TEXT_REFERENCE__CHAR_END_OFFSET:
				return CHAR_END_OFFSET_EDEFAULT == null ? charEndOffset != null : !CHAR_END_OFFSET_EDEFAULT.equals(charEndOffset);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (charBeginOffset: ");
		result.append(charBeginOffset);
		result.append(", charEndOffset: ");
		result.append(charEndOffset);
		result.append(')');
		return result.toString();
	}

} //TextReferenceImpl
