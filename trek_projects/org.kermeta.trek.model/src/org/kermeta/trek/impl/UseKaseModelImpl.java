/**
 * <copyright>
 * </copyright>
 *
 * $Id: UseKaseModelImpl.java,v 1.3 2007-11-26 17:04:18 cfaucher Exp $
 */
package org.kermeta.trek.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.trek.KTagElement;
import org.kermeta.trek.KTestCase;
import org.kermeta.trek.KUseCase;
import org.kermeta.trek.KUserStory;
import org.kermeta.trek.TrekPackage;
import org.kermeta.trek.UseKaseModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Kase Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.trek.impl.UseKaseModelImpl#getKuseCases <em>Kuse Cases</em>}</li>
 *   <li>{@link org.kermeta.trek.impl.UseKaseModelImpl#getKtestCases <em>Ktest Cases</em>}</li>
 *   <li>{@link org.kermeta.trek.impl.UseKaseModelImpl#getKtags <em>Ktags</em>}</li>
 *   <li>{@link org.kermeta.trek.impl.UseKaseModelImpl#getKuserStories <em>Kuser Stories</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UseKaseModelImpl extends EObjectImpl implements UseKaseModel {
	/**
	 * The cached value of the '{@link #getKuseCases() <em>Kuse Cases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKuseCases()
	 * @generated
	 * @ordered
	 */
	protected EList<KUseCase> kuseCases;

	/**
	 * The cached value of the '{@link #getKtestCases() <em>Ktest Cases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKtestCases()
	 * @generated
	 * @ordered
	 */
	protected EList<KTestCase> ktestCases;

	/**
	 * The cached value of the '{@link #getKtags() <em>Ktags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKtags()
	 * @generated
	 * @ordered
	 */
	protected EList<KTagElement> ktags;

	/**
	 * The cached value of the '{@link #getKuserStories() <em>Kuser Stories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKuserStories()
	 * @generated
	 * @ordered
	 */
	protected EList<KUserStory> kuserStories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseKaseModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrekPackage.Literals.USE_KASE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KUseCase> getKuseCases() {
		if (kuseCases == null) {
			kuseCases = new EObjectContainmentEList.Resolving<KUseCase>(KUseCase.class, this, TrekPackage.USE_KASE_MODEL__KUSE_CASES);
		}
		return kuseCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KTestCase> getKtestCases() {
		if (ktestCases == null) {
			ktestCases = new EObjectContainmentEList.Resolving<KTestCase>(KTestCase.class, this, TrekPackage.USE_KASE_MODEL__KTEST_CASES);
		}
		return ktestCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KTagElement> getKtags() {
		if (ktags == null) {
			ktags = new EObjectContainmentEList.Resolving<KTagElement>(KTagElement.class, this, TrekPackage.USE_KASE_MODEL__KTAGS);
		}
		return ktags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KUserStory> getKuserStories() {
		if (kuserStories == null) {
			kuserStories = new EObjectContainmentEList.Resolving<KUserStory>(KUserStory.class, this, TrekPackage.USE_KASE_MODEL__KUSER_STORIES);
		}
		return kuserStories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KUseCase getUseCaseByTags(KTagElement tags) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrekPackage.USE_KASE_MODEL__KUSE_CASES:
				return ((InternalEList<?>)getKuseCases()).basicRemove(otherEnd, msgs);
			case TrekPackage.USE_KASE_MODEL__KTEST_CASES:
				return ((InternalEList<?>)getKtestCases()).basicRemove(otherEnd, msgs);
			case TrekPackage.USE_KASE_MODEL__KTAGS:
				return ((InternalEList<?>)getKtags()).basicRemove(otherEnd, msgs);
			case TrekPackage.USE_KASE_MODEL__KUSER_STORIES:
				return ((InternalEList<?>)getKuserStories()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrekPackage.USE_KASE_MODEL__KUSE_CASES:
				return getKuseCases();
			case TrekPackage.USE_KASE_MODEL__KTEST_CASES:
				return getKtestCases();
			case TrekPackage.USE_KASE_MODEL__KTAGS:
				return getKtags();
			case TrekPackage.USE_KASE_MODEL__KUSER_STORIES:
				return getKuserStories();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TrekPackage.USE_KASE_MODEL__KUSE_CASES:
				getKuseCases().clear();
				getKuseCases().addAll((Collection<? extends KUseCase>)newValue);
				return;
			case TrekPackage.USE_KASE_MODEL__KTEST_CASES:
				getKtestCases().clear();
				getKtestCases().addAll((Collection<? extends KTestCase>)newValue);
				return;
			case TrekPackage.USE_KASE_MODEL__KTAGS:
				getKtags().clear();
				getKtags().addAll((Collection<? extends KTagElement>)newValue);
				return;
			case TrekPackage.USE_KASE_MODEL__KUSER_STORIES:
				getKuserStories().clear();
				getKuserStories().addAll((Collection<? extends KUserStory>)newValue);
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
			case TrekPackage.USE_KASE_MODEL__KUSE_CASES:
				getKuseCases().clear();
				return;
			case TrekPackage.USE_KASE_MODEL__KTEST_CASES:
				getKtestCases().clear();
				return;
			case TrekPackage.USE_KASE_MODEL__KTAGS:
				getKtags().clear();
				return;
			case TrekPackage.USE_KASE_MODEL__KUSER_STORIES:
				getKuserStories().clear();
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
			case TrekPackage.USE_KASE_MODEL__KUSE_CASES:
				return kuseCases != null && !kuseCases.isEmpty();
			case TrekPackage.USE_KASE_MODEL__KTEST_CASES:
				return ktestCases != null && !ktestCases.isEmpty();
			case TrekPackage.USE_KASE_MODEL__KTAGS:
				return ktags != null && !ktags.isEmpty();
			case TrekPackage.USE_KASE_MODEL__KUSER_STORIES:
				return kuserStories != null && !kuserStories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UseKaseModelImpl
