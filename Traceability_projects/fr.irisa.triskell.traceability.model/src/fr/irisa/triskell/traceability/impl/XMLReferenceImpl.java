/**
 * <copyright>
 * </copyright>
 *
 * $Id: XMLReferenceImpl.java,v 1.2 2007-07-31 12:34:30 dtouzet Exp $
 */
package fr.irisa.triskell.traceability.impl;

import fr.irisa.triskell.traceability.TraceabilityPackage;
import fr.irisa.triskell.traceability.XMLReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.traceability.impl.XMLReferenceImpl#getXPointer <em>XPointer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XMLReferenceImpl extends FileReferenceImpl implements XMLReference {
	/**
	 * The default value of the '{@link #getXPointer() <em>XPointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPointer()
	 * @generated
	 * @ordered
	 */
	protected static final String XPOINTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXPointer() <em>XPointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPointer()
	 * @generated
	 * @ordered
	 */
	protected String xPointer = XPOINTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.XML_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXPointer() {
		return xPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPointer(String newXPointer) {
		String oldXPointer = xPointer;
		xPointer = newXPointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.XML_REFERENCE__XPOINTER, oldXPointer, xPointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TraceabilityPackage.XML_REFERENCE__XPOINTER:
				return getXPointer();
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
			case TraceabilityPackage.XML_REFERENCE__XPOINTER:
				setXPointer((String)newValue);
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
			case TraceabilityPackage.XML_REFERENCE__XPOINTER:
				setXPointer(XPOINTER_EDEFAULT);
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
			case TraceabilityPackage.XML_REFERENCE__XPOINTER:
				return XPOINTER_EDEFAULT == null ? xPointer != null : !XPOINTER_EDEFAULT.equals(xPointer);
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
		result.append(" (xPointer: ");
		result.append(xPointer);
		result.append(')');
		return result.toString();
	}

} //XMLReferenceImpl
