/**
 * <copyright>
 * </copyright>
 *
 * $Id: TextReferenceImpl.java,v 1.6 2008-10-28 13:18:26 cfaucher Exp $
 */
package traceability.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import traceability.TextReference;
import traceability.TraceabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link traceability.impl.TextReferenceImpl#getCharEndAt <em>Char End At</em>}</li>
 *   <li>{@link traceability.impl.TextReferenceImpl#getCharBeginAt <em>Char Begin At</em>}</li>
 *   <li>{@link traceability.impl.TextReferenceImpl#getLineEndAt <em>Line End At</em>}</li>
 *   <li>{@link traceability.impl.TextReferenceImpl#getLineBeginAt <em>Line Begin At</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextReferenceImpl extends FileReferenceImpl implements
		TextReference {
	/**
	 * The default value of the '{@link #getCharEndAt() <em>Char End At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharEndAt()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CHAR_END_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharEndAt() <em>Char End At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharEndAt()
	 * @generated
	 * @ordered
	 */
	protected Integer charEndAt = CHAR_END_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharBeginAt() <em>Char Begin At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharBeginAt()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CHAR_BEGIN_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharBeginAt() <em>Char Begin At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharBeginAt()
	 * @generated
	 * @ordered
	 */
	protected Integer charBeginAt = CHAR_BEGIN_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineEndAt() <em>Line End At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineEndAt()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LINE_END_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineEndAt() <em>Line End At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineEndAt()
	 * @generated
	 * @ordered
	 */
	protected Integer lineEndAt = LINE_END_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineBeginAt() <em>Line Begin At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineBeginAt()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LINE_BEGIN_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineBeginAt() <em>Line Begin At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineBeginAt()
	 * @generated
	 * @ordered
	 */
	protected Integer lineBeginAt = LINE_BEGIN_AT_EDEFAULT;

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
	public Integer getCharEndAt() {
		return charEndAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharEndAt(Integer newCharEndAt) {
		Integer oldCharEndAt = charEndAt;
		charEndAt = newCharEndAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TraceabilityPackage.TEXT_REFERENCE__CHAR_END_AT,
					oldCharEndAt, charEndAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCharBeginAt() {
		return charBeginAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharBeginAt(Integer newCharBeginAt) {
		Integer oldCharBeginAt = charBeginAt;
		charBeginAt = newCharBeginAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TraceabilityPackage.TEXT_REFERENCE__CHAR_BEGIN_AT,
					oldCharBeginAt, charBeginAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLineEndAt() {
		return lineEndAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineEndAt(Integer newLineEndAt) {
		Integer oldLineEndAt = lineEndAt;
		lineEndAt = newLineEndAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TraceabilityPackage.TEXT_REFERENCE__LINE_END_AT,
					oldLineEndAt, lineEndAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLineBeginAt() {
		return lineBeginAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineBeginAt(Integer newLineBeginAt) {
		Integer oldLineBeginAt = lineBeginAt;
		lineBeginAt = newLineBeginAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TraceabilityPackage.TEXT_REFERENCE__LINE_BEGIN_AT,
					oldLineBeginAt, lineBeginAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TraceabilityPackage.TEXT_REFERENCE__CHAR_END_AT:
			return getCharEndAt();
		case TraceabilityPackage.TEXT_REFERENCE__CHAR_BEGIN_AT:
			return getCharBeginAt();
		case TraceabilityPackage.TEXT_REFERENCE__LINE_END_AT:
			return getLineEndAt();
		case TraceabilityPackage.TEXT_REFERENCE__LINE_BEGIN_AT:
			return getLineBeginAt();
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
		case TraceabilityPackage.TEXT_REFERENCE__CHAR_END_AT:
			setCharEndAt((Integer) newValue);
			return;
		case TraceabilityPackage.TEXT_REFERENCE__CHAR_BEGIN_AT:
			setCharBeginAt((Integer) newValue);
			return;
		case TraceabilityPackage.TEXT_REFERENCE__LINE_END_AT:
			setLineEndAt((Integer) newValue);
			return;
		case TraceabilityPackage.TEXT_REFERENCE__LINE_BEGIN_AT:
			setLineBeginAt((Integer) newValue);
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
		case TraceabilityPackage.TEXT_REFERENCE__CHAR_END_AT:
			setCharEndAt(CHAR_END_AT_EDEFAULT);
			return;
		case TraceabilityPackage.TEXT_REFERENCE__CHAR_BEGIN_AT:
			setCharBeginAt(CHAR_BEGIN_AT_EDEFAULT);
			return;
		case TraceabilityPackage.TEXT_REFERENCE__LINE_END_AT:
			setLineEndAt(LINE_END_AT_EDEFAULT);
			return;
		case TraceabilityPackage.TEXT_REFERENCE__LINE_BEGIN_AT:
			setLineBeginAt(LINE_BEGIN_AT_EDEFAULT);
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
		case TraceabilityPackage.TEXT_REFERENCE__CHAR_END_AT:
			return CHAR_END_AT_EDEFAULT == null ? charEndAt != null
					: !CHAR_END_AT_EDEFAULT.equals(charEndAt);
		case TraceabilityPackage.TEXT_REFERENCE__CHAR_BEGIN_AT:
			return CHAR_BEGIN_AT_EDEFAULT == null ? charBeginAt != null
					: !CHAR_BEGIN_AT_EDEFAULT.equals(charBeginAt);
		case TraceabilityPackage.TEXT_REFERENCE__LINE_END_AT:
			return LINE_END_AT_EDEFAULT == null ? lineEndAt != null
					: !LINE_END_AT_EDEFAULT.equals(lineEndAt);
		case TraceabilityPackage.TEXT_REFERENCE__LINE_BEGIN_AT:
			return LINE_BEGIN_AT_EDEFAULT == null ? lineBeginAt != null
					: !LINE_BEGIN_AT_EDEFAULT.equals(lineBeginAt);
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (charEndAt: ");
		result.append(charEndAt);
		result.append(", charBeginAt: ");
		result.append(charBeginAt);
		result.append(", lineEndAt: ");
		result.append(lineEndAt);
		result.append(", lineBeginAt: ");
		result.append(lineBeginAt);
		result.append(')');
		return result.toString();
	}

} //TextReferenceImpl
