/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractStepImpl.java,v 1.2 2008-02-14 07:12:47 uid21732 Exp $
 */
package org.kermeta.io.loader.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.kermeta.io.loader.AbstractStep;
import org.kermeta.io.loader.LoaderPackage;
import org.kermeta.io.loader.LoadingStep;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.io.loader.impl.AbstractStepImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link org.kermeta.io.loader.impl.AbstractStepImpl#getCurrentStep <em>Current Step</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractStepImpl extends EObjectImpl implements AbstractStep {
	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<LoadingStep> steps;

	/**
	 * The cached value of the '{@link #getCurrentStep() <em>Current Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStep()
	 * @generated
	 * @ordered
	 */
	protected LoadingStep currentStep;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoaderPackage.Literals.ABSTRACT_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoadingStep> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<LoadingStep>(LoadingStep.class, this, LoaderPackage.ABSTRACT_STEP__STEPS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadingStep getCurrentStep() {
		if (currentStep != null && currentStep.eIsProxy()) {
			InternalEObject oldCurrentStep = (InternalEObject)currentStep;
			currentStep = (LoadingStep)eResolveProxy(oldCurrentStep);
			if (currentStep != oldCurrentStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LoaderPackage.ABSTRACT_STEP__CURRENT_STEP, oldCurrentStep, currentStep));
			}
		}
		return currentStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadingStep basicGetCurrentStep() {
		return currentStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentStep(LoadingStep newCurrentStep) {
		LoadingStep oldCurrentStep = currentStep;
		currentStep = newCurrentStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoaderPackage.ABSTRACT_STEP__CURRENT_STEP, oldCurrentStep, currentStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public LoadingStep getNextStep() {
		int index = getSteps().indexOf( getCurrentStep() );
		
		/*
		 * 
		 * If there is no current step, we take the first one if there is one.
		 * 
		 */
		if ( index == -1 ) {
			if ( getSteps().size() > 0 ) {
				setCurrentStep( getSteps().get(0) );
				return getCurrentStep();
			} else
				return null;
		}
		
		/*
		 * 
		 * If index is the last, we return null.
		 * 
		 */
		if ( index < getSteps().size()-1 )
			return getSteps().get( ++index );
		else
			return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean goToNextStep() {
		LoadingStep nextStep = getNextStep();
		setCurrentStep( nextStep );
		if ( nextStep == null )
			return false;
		else
			return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LoaderPackage.ABSTRACT_STEP__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
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
			case LoaderPackage.ABSTRACT_STEP__STEPS:
				return getSteps();
			case LoaderPackage.ABSTRACT_STEP__CURRENT_STEP:
				if (resolve) return getCurrentStep();
				return basicGetCurrentStep();
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
			case LoaderPackage.ABSTRACT_STEP__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends LoadingStep>)newValue);
				return;
			case LoaderPackage.ABSTRACT_STEP__CURRENT_STEP:
				setCurrentStep((LoadingStep)newValue);
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
			case LoaderPackage.ABSTRACT_STEP__STEPS:
				getSteps().clear();
				return;
			case LoaderPackage.ABSTRACT_STEP__CURRENT_STEP:
				setCurrentStep((LoadingStep)null);
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
			case LoaderPackage.ABSTRACT_STEP__STEPS:
				return steps != null && !steps.isEmpty();
			case LoaderPackage.ABSTRACT_STEP__CURRENT_STEP:
				return currentStep != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractStepImpl
