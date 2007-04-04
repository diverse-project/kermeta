/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterestHostImpl.java,v 1.1 2007-04-04 13:43:55 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.interest.impl;

import fr.irisa.triskell.kermeta.extension.Interest;

import fr.irisa.triskell.kermeta.kpm.Unit;

import fr.irisa.triskell.kermeta.kpm.interest.InterestEntry;
import fr.irisa.triskell.kermeta.kpm.interest.InterestFactory;
import fr.irisa.triskell.kermeta.kpm.interest.InterestHost;
import fr.irisa.triskell.kermeta.kpm.interest.InterestKey;
import fr.irisa.triskell.kermeta.kpm.interest.InterestPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Host</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.interest.impl.InterestHostImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterestHostImpl extends EObjectImpl implements InterestHost {
	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList entries = null;

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
	protected EClass eStaticClass() {
		return InterestPackage.Literals.INTEREST_HOST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList(InterestEntry.class, this, InterestPackage.INTEREST_HOST__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void declareInterest(Interest declaringObject, Unit key) {
		InterestKey interestKey = InterestFactory.eINSTANCE.createInterestKey();
		interestKey.setDeclaringObject(declaringObject);
		interestKey.setUnit(key);
		InterestEntry entry = InterestFactory.eINSTANCE.createInterestEntry();
		entry.setKey(interestKey);
		getEntries().add(entry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void declareInterest(Interest declaringObject, Unit key, Object value) {
		InterestKey interestKey = InterestFactory.eINSTANCE.createInterestKey();
		interestKey.setDeclaringObject(declaringObject);
		interestKey.setUnit(key);
		InterestEntry entry = InterestFactory.eINSTANCE.createInterestEntry();
		entry.setKey(interestKey);
		entry.setValue(value);
		getEntries().add(entry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public InterestEntry findInterestEntry(Unit key, Interest declaringObject) {
		Iterator<InterestEntry> iterator = getEntries().iterator();
		while ( iterator.hasNext() ) {
			InterestEntry currentEntry = iterator.next();
			if ( currentEntry.getKey().getUnit().equals(key) && currentEntry.getKey().getDeclaringObject().equals(declaringObject) )
				return currentEntry;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void update(Unit key, Object newValue) {
		// On récupère toutes les entrées qui ont comme unit le paramètre key
		ArrayList<InterestEntry> entriesToUpdate = new ArrayList<InterestEntry>();
		Iterator<InterestEntry> iterator = getEntries().iterator();
		while ( iterator.hasNext() ) {
			InterestEntry currentEntry = iterator.next();
			if ( currentEntry.getKey().getUnit().equals(key) )
				entriesToUpdate.add(currentEntry);
		}
		
		for ( InterestEntry currentEntry : entriesToUpdate ) {
			currentEntry.setValue(newValue);
			currentEntry.getKey().getDeclaringObject().updateValue(newValue);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void undeclareInterest(Interest declaringObject, Unit key) {
		InterestEntry entry = findInterestEntry(key, declaringObject);
		if ( entry != null )
			getEntries().remove(entry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Object getValue(Unit key) {
		Iterator<InterestEntry> iterator = getEntries().iterator();
		while ( iterator.hasNext() ) {
			InterestEntry entry = iterator.next();
			if ( entry.getKey().getUnit().equals(key) )
				return entry.getValue();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InterestPackage.INTEREST_HOST__ENTRIES:
				return ((InternalEList)getEntries()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InterestPackage.INTEREST_HOST__ENTRIES:
				return getEntries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InterestPackage.INTEREST_HOST__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case InterestPackage.INTEREST_HOST__ENTRIES:
				getEntries().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InterestPackage.INTEREST_HOST__ENTRIES:
				return entries != null && !entries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterestHostImpl