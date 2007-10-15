/**
 * <copyright>
 * </copyright>
 *
 * $Id: KTestCaseImpl.java,v 1.1 2007-10-15 16:54:07 fmunoz Exp $
 */
package org.kermeta.trek.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.kermeta.trek.KTestCase;
import org.kermeta.trek.KUseCase;
import org.kermeta.trek.TrekPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KTest Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.trek.impl.KTestCaseImpl#getVerifies <em>Verifies</em>}</li>
 *   <li>{@link org.kermeta.trek.impl.KTestCaseImpl#getTestCase <em>Test Case</em>}</li>
 *   <li>{@link org.kermeta.trek.impl.KTestCaseImpl#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KTestCaseImpl extends EObjectImpl implements KTestCase {
	/**
	 * The cached value of the '{@link #getVerifies() <em>Verifies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifies()
	 * @generated
	 * @ordered
	 */
	protected KUseCase verifies;

	/**
	 * The default value of the '{@link #getTestCase() <em>Test Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestCase()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_CASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestCase() <em>Test Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestCase()
	 * @generated
	 * @ordered
	 */
	protected String testCase = TEST_CASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected String file = FILE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KTestCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrekPackage.Literals.KTEST_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KUseCase getVerifies() {
		if (verifies != null && verifies.eIsProxy()) {
			InternalEObject oldVerifies = (InternalEObject)verifies;
			verifies = (KUseCase)eResolveProxy(oldVerifies);
			if (verifies != oldVerifies) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TrekPackage.KTEST_CASE__VERIFIES, oldVerifies, verifies));
			}
		}
		return verifies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KUseCase basicGetVerifies() {
		return verifies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerifies(KUseCase newVerifies) {
		KUseCase oldVerifies = verifies;
		verifies = newVerifies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrekPackage.KTEST_CASE__VERIFIES, oldVerifies, verifies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTestCase() {
		return testCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestCase(String newTestCase) {
		String oldTestCase = testCase;
		testCase = newTestCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrekPackage.KTEST_CASE__TEST_CASE, oldTestCase, testCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(String newFile) {
		String oldFile = file;
		file = newFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrekPackage.KTEST_CASE__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrekPackage.KTEST_CASE__VERIFIES:
				if (resolve) return getVerifies();
				return basicGetVerifies();
			case TrekPackage.KTEST_CASE__TEST_CASE:
				return getTestCase();
			case TrekPackage.KTEST_CASE__FILE:
				return getFile();
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
			case TrekPackage.KTEST_CASE__VERIFIES:
				setVerifies((KUseCase)newValue);
				return;
			case TrekPackage.KTEST_CASE__TEST_CASE:
				setTestCase((String)newValue);
				return;
			case TrekPackage.KTEST_CASE__FILE:
				setFile((String)newValue);
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
			case TrekPackage.KTEST_CASE__VERIFIES:
				setVerifies((KUseCase)null);
				return;
			case TrekPackage.KTEST_CASE__TEST_CASE:
				setTestCase(TEST_CASE_EDEFAULT);
				return;
			case TrekPackage.KTEST_CASE__FILE:
				setFile(FILE_EDEFAULT);
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
			case TrekPackage.KTEST_CASE__VERIFIES:
				return verifies != null;
			case TrekPackage.KTEST_CASE__TEST_CASE:
				return TEST_CASE_EDEFAULT == null ? testCase != null : !TEST_CASE_EDEFAULT.equals(testCase);
			case TrekPackage.KTEST_CASE__FILE:
				return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
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
		result.append(" (testCase: ");
		result.append(testCase);
		result.append(", file: ");
		result.append(file);
		result.append(')');
		return result.toString();
	}

} //KTestCaseImpl
