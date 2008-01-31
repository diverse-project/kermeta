/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractCompilerImpl.java,v 1.1 2008-01-31 13:28:18 cfaucher Exp $
 */
package org.kermeta.compiler.model.compiler.impl;

import java.util.Collection;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.kermeta.compiler.model.compiler.AbstractCompiler;
import org.kermeta.compiler.model.compiler.CompilerPackage;

import org.kermeta.simk.SIMKModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Compiler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.compiler.model.compiler.impl.AbstractCompilerImpl#getSimkModel <em>Simk Model</em>}</li>
 *   <li>{@link org.kermeta.compiler.model.compiler.impl.AbstractCompilerImpl#getGenModels <em>Gen Models</em>}</li>
 *   <li>{@link org.kermeta.compiler.model.compiler.impl.AbstractCompilerImpl#getRootGenModel <em>Root Gen Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractCompilerImpl extends EObjectImpl implements AbstractCompiler {
	/**
	 * The cached value of the '{@link #getSimkModel() <em>Simk Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimkModel()
	 * @generated
	 * @ordered
	 */
	protected SIMKModel simkModel;

	/**
	 * The cached value of the '{@link #getGenModels() <em>Gen Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenModels()
	 * @generated
	 * @ordered
	 */
	protected EList<GenModel> genModels;

	/**
	 * The cached value of the '{@link #getRootGenModel() <em>Root Gen Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootGenModel()
	 * @generated
	 * @ordered
	 */
	protected GenModel rootGenModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractCompilerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompilerPackage.Literals.ABSTRACT_COMPILER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIMKModel getSimkModel() {
		return simkModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimkModel(SIMKModel newSimkModel, NotificationChain msgs) {
		SIMKModel oldSimkModel = simkModel;
		simkModel = newSimkModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CompilerPackage.ABSTRACT_COMPILER__SIMK_MODEL, oldSimkModel, newSimkModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimkModel(SIMKModel newSimkModel) {
		if (newSimkModel != simkModel) {
			NotificationChain msgs = null;
			if (simkModel != null)
				msgs = ((InternalEObject)simkModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CompilerPackage.ABSTRACT_COMPILER__SIMK_MODEL, null, msgs);
			if (newSimkModel != null)
				msgs = ((InternalEObject)newSimkModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CompilerPackage.ABSTRACT_COMPILER__SIMK_MODEL, null, msgs);
			msgs = basicSetSimkModel(newSimkModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompilerPackage.ABSTRACT_COMPILER__SIMK_MODEL, newSimkModel, newSimkModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenModel> getGenModels() {
		if (genModels == null) {
			genModels = new EObjectResolvingEList<GenModel>(GenModel.class, this, CompilerPackage.ABSTRACT_COMPILER__GEN_MODELS);
		}
		return genModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenModel getRootGenModel() {
		if (rootGenModel != null && rootGenModel.eIsProxy()) {
			InternalEObject oldRootGenModel = (InternalEObject)rootGenModel;
			rootGenModel = (GenModel)eResolveProxy(oldRootGenModel);
			if (rootGenModel != oldRootGenModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompilerPackage.ABSTRACT_COMPILER__ROOT_GEN_MODEL, oldRootGenModel, rootGenModel));
			}
		}
		return rootGenModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenModel basicGetRootGenModel() {
		return rootGenModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootGenModel(GenModel newRootGenModel) {
		GenModel oldRootGenModel = rootGenModel;
		rootGenModel = newRootGenModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompilerPackage.ABSTRACT_COMPILER__ROOT_GEN_MODEL, oldRootGenModel, rootGenModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void run() {
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
			case CompilerPackage.ABSTRACT_COMPILER__SIMK_MODEL:
				return basicSetSimkModel(null, msgs);
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
			case CompilerPackage.ABSTRACT_COMPILER__SIMK_MODEL:
				return getSimkModel();
			case CompilerPackage.ABSTRACT_COMPILER__GEN_MODELS:
				return getGenModels();
			case CompilerPackage.ABSTRACT_COMPILER__ROOT_GEN_MODEL:
				if (resolve) return getRootGenModel();
				return basicGetRootGenModel();
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
			case CompilerPackage.ABSTRACT_COMPILER__SIMK_MODEL:
				setSimkModel((SIMKModel)newValue);
				return;
			case CompilerPackage.ABSTRACT_COMPILER__GEN_MODELS:
				getGenModels().clear();
				getGenModels().addAll((Collection<? extends GenModel>)newValue);
				return;
			case CompilerPackage.ABSTRACT_COMPILER__ROOT_GEN_MODEL:
				setRootGenModel((GenModel)newValue);
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
			case CompilerPackage.ABSTRACT_COMPILER__SIMK_MODEL:
				setSimkModel((SIMKModel)null);
				return;
			case CompilerPackage.ABSTRACT_COMPILER__GEN_MODELS:
				getGenModels().clear();
				return;
			case CompilerPackage.ABSTRACT_COMPILER__ROOT_GEN_MODEL:
				setRootGenModel((GenModel)null);
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
			case CompilerPackage.ABSTRACT_COMPILER__SIMK_MODEL:
				return simkModel != null;
			case CompilerPackage.ABSTRACT_COMPILER__GEN_MODELS:
				return genModels != null && !genModels.isEmpty();
			case CompilerPackage.ABSTRACT_COMPILER__ROOT_GEN_MODEL:
				return rootGenModel != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractCompilerImpl
