/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompareElementImpl.java,v 1.1 2008-08-20 09:50:08 fmunoz Exp $
 */
package ocompare.impl;

import ocompare.CompareElement;
import ocompare.OcomparePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compare Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ocompare.impl.CompareElementImpl#getOriginalURI <em>Original URI</em>}</li>
 *   <li>{@link ocompare.impl.CompareElementImpl#getResultURI <em>Result URI</em>}</li>
 *   <li>{@link ocompare.impl.CompareElementImpl#getDiffURI <em>Diff URI</em>}</li>
 *   <li>{@link ocompare.impl.CompareElementImpl#getMatchURI <em>Match URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompareElementImpl extends EObjectImpl implements CompareElement {
	/**
	 * The default value of the '{@link #getOriginalURI() <em>Original URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalURI()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINAL_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginalURI() <em>Original URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalURI()
	 * @generated
	 * @ordered
	 */
	protected String originalURI = ORIGINAL_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getResultURI() <em>Result URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultURI()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultURI() <em>Result URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultURI()
	 * @generated
	 * @ordered
	 */
	protected String resultURI = RESULT_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiffURI() <em>Diff URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffURI()
	 * @generated
	 * @ordered
	 */
	protected static final String DIFF_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiffURI() <em>Diff URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffURI()
	 * @generated
	 * @ordered
	 */
	protected String diffURI = DIFF_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatchURI() <em>Match URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchURI()
	 * @generated
	 * @ordered
	 */
	protected static final String MATCH_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatchURI() <em>Match URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchURI()
	 * @generated
	 * @ordered
	 */
	protected String matchURI = MATCH_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompareElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcomparePackage.Literals.COMPARE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginalURI() {
		return originalURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalURI(String newOriginalURI) {
		String oldOriginalURI = originalURI;
		originalURI = newOriginalURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcomparePackage.COMPARE_ELEMENT__ORIGINAL_URI, oldOriginalURI, originalURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResultURI() {
		return resultURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultURI(String newResultURI) {
		String oldResultURI = resultURI;
		resultURI = newResultURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcomparePackage.COMPARE_ELEMENT__RESULT_URI, oldResultURI, resultURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiffURI() {
		return diffURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiffURI(String newDiffURI) {
		String oldDiffURI = diffURI;
		diffURI = newDiffURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcomparePackage.COMPARE_ELEMENT__DIFF_URI, oldDiffURI, diffURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMatchURI() {
		return matchURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchURI(String newMatchURI) {
		String oldMatchURI = matchURI;
		matchURI = newMatchURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcomparePackage.COMPARE_ELEMENT__MATCH_URI, oldMatchURI, matchURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OcomparePackage.COMPARE_ELEMENT__ORIGINAL_URI:
				return getOriginalURI();
			case OcomparePackage.COMPARE_ELEMENT__RESULT_URI:
				return getResultURI();
			case OcomparePackage.COMPARE_ELEMENT__DIFF_URI:
				return getDiffURI();
			case OcomparePackage.COMPARE_ELEMENT__MATCH_URI:
				return getMatchURI();
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
			case OcomparePackage.COMPARE_ELEMENT__ORIGINAL_URI:
				setOriginalURI((String)newValue);
				return;
			case OcomparePackage.COMPARE_ELEMENT__RESULT_URI:
				setResultURI((String)newValue);
				return;
			case OcomparePackage.COMPARE_ELEMENT__DIFF_URI:
				setDiffURI((String)newValue);
				return;
			case OcomparePackage.COMPARE_ELEMENT__MATCH_URI:
				setMatchURI((String)newValue);
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
			case OcomparePackage.COMPARE_ELEMENT__ORIGINAL_URI:
				setOriginalURI(ORIGINAL_URI_EDEFAULT);
				return;
			case OcomparePackage.COMPARE_ELEMENT__RESULT_URI:
				setResultURI(RESULT_URI_EDEFAULT);
				return;
			case OcomparePackage.COMPARE_ELEMENT__DIFF_URI:
				setDiffURI(DIFF_URI_EDEFAULT);
				return;
			case OcomparePackage.COMPARE_ELEMENT__MATCH_URI:
				setMatchURI(MATCH_URI_EDEFAULT);
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
			case OcomparePackage.COMPARE_ELEMENT__ORIGINAL_URI:
				return ORIGINAL_URI_EDEFAULT == null ? originalURI != null : !ORIGINAL_URI_EDEFAULT.equals(originalURI);
			case OcomparePackage.COMPARE_ELEMENT__RESULT_URI:
				return RESULT_URI_EDEFAULT == null ? resultURI != null : !RESULT_URI_EDEFAULT.equals(resultURI);
			case OcomparePackage.COMPARE_ELEMENT__DIFF_URI:
				return DIFF_URI_EDEFAULT == null ? diffURI != null : !DIFF_URI_EDEFAULT.equals(diffURI);
			case OcomparePackage.COMPARE_ELEMENT__MATCH_URI:
				return MATCH_URI_EDEFAULT == null ? matchURI != null : !MATCH_URI_EDEFAULT.equals(matchURI);
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
		result.append(" (originalURI: ");
		result.append(originalURI);
		result.append(", resultURI: ");
		result.append(resultURI);
		result.append(", diffURI: ");
		result.append(diffURI);
		result.append(", matchURI: ");
		result.append(matchURI);
		result.append(')');
		return result.toString();
	}

} //CompareElementImpl
