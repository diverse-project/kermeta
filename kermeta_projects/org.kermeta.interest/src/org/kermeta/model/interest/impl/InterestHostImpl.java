/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterestHostImpl.java,v 1.2 2008-08-06 14:16:18 dvojtise Exp $
 */
package org.kermeta.model.interest.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.kermeta.interest.InterestedObject;
import org.kermeta.interest.exception.IdNotFoundException;
import org.kermeta.model.interest.Concern;
import org.kermeta.model.interest.InterestFactory;
import org.kermeta.model.interest.InterestHost;
import org.kermeta.model.interest.InterestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Host</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.model.interest.impl.InterestHostImpl#getConcerns <em>Concerns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterestHostImpl extends EObjectImpl implements InterestHost {
	/**
	 * The cached value of the '{@link #getConcerns() <em>Concerns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerns()
	 * @generated
	 * @ordered
	 */
	protected EList<Concern> concerns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterestHostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InterestPackage.Literals.INTEREST_HOST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Concern> getConcerns() {
		if (concerns == null) {
			concerns = new EObjectContainmentEList<Concern>(Concern.class, this, InterestPackage.INTEREST_HOST__CONCERNS);
		}
		return concerns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void updateValue(String id, Object value) throws IdNotFoundException {
		/*
		 * 
		 * Getting the concern.
		 * 
		 */
		Concern c = getConcern(id);
		/*
		 * 
		 * If the concern has been found, delegate the responsibility of updating.
		 * Otherwise, updating is impossible. So just throw an exception to warn the caller.
		 * 
		 */
		if ( c != null )
			c.updateValue(value);
		else
			throw new IdNotFoundException("No entry for resource with id : " + id + ".");

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */ 
	public void beConcernedAbout(String id, InterestedObject target) {
		/*
		 * 
		 * Getting the concern.
		 * 
		 */
		Concern c = getConcern(id);
		/*
		 * 
		 * If it does not exist, create it and store it.
		 * 
		 */
		if ( c == null ) {
			c = InterestFactory.eINSTANCE.createConcern();
			c.setId(id);
			getConcerns().add(c);
		}
		/*
		 * 
		 * Finally make the concern updating its worried objects list.
		 * 
		 */
		c.beConcernedAbout(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void beUnconcernedAbout(String id, InterestedObject target) {
		/*
		 * 
		 * Getting the concern.
		 * 
		 */
		Concern c = getConcern(id);
		/*
		 * 
		 * If it does not exist, do nothing.
		 * Otherwise delegate the action to the concern.
		 * 
		 */
		if ( c != null )
			c.beUnconcernedAbout(target);	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Concern getConcern(String id) {
		for ( Concern c : getConcerns() )
			if(c != null) // robustness code, sometimes we have invalid data (probably due to concurrentmodification somewhere else): do not fail here
				if ( c.getId().equals(id) )
					return c;
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InterestPackage.INTEREST_HOST__CONCERNS:
				return ((InternalEList<?>)getConcerns()).basicRemove(otherEnd, msgs);
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
			case InterestPackage.INTEREST_HOST__CONCERNS:
				return getConcerns();
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
			case InterestPackage.INTEREST_HOST__CONCERNS:
				getConcerns().clear();
				getConcerns().addAll((Collection<? extends Concern>)newValue);
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
			case InterestPackage.INTEREST_HOST__CONCERNS:
				getConcerns().clear();
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
			case InterestPackage.INTEREST_HOST__CONCERNS:
				return concerns != null && !concerns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterestHostImpl
