/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConcernImpl.java,v 1.1 2008-02-04 10:40:24 ftanguy Exp $
 */
package org.kermeta.model.interest.impl;

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
import org.kermeta.interest.InterestedObject;
import org.kermeta.model.interest.Concern;
import org.kermeta.model.interest.InterestFactory;
import org.kermeta.model.interest.InterestPackage;
import org.kermeta.model.interest.WorriedObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.model.interest.impl.ConcernImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.kermeta.model.interest.impl.ConcernImpl#getListeners <em>Listeners</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConcernImpl extends EObjectImpl implements Concern {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListeners() <em>Listeners</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListeners()
	 * @generated
	 * @ordered
	 */
	protected EList<WorriedObject> listeners;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcernImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InterestPackage.Literals.CONCERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterestPackage.CONCERN__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorriedObject> getListeners() {
		if (listeners == null) {
			listeners = new EObjectContainmentEList<WorriedObject>(WorriedObject.class, this, InterestPackage.CONCERN__LISTENERS);
		}
		return listeners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void updateValue(Object value) {
		/*
		 * 
		 * Updating each worried object with this new value.
		 * 
		 */
		for ( WorriedObject w : getListeners() )
			w.updateValue(value);;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void beConcernedAbout(InterestedObject target) {
		/*
		 * 
		 * Getting the worried object if it exists.
		 * 
		 */
		WorriedObject w = getWorriedObject(target);
		/*
		 * 
		 * If it exists do nothing otherwise create an entry and store it.
		 * 
		 */
		if ( w == null ) {
			w = InterestFactory.eINSTANCE.createWorriedObject();
			w.setTarget(target);
			getListeners().add(w);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void beUnconcernedAbout(InterestedObject target) {
		/*
		 * 
		 * Getting the worried object if it exists.
		 * 
		 */
		WorriedObject w = getWorriedObject(target);
		/*
		 * 
		 * If it exists remove it otherwise do nothing.
		 * 
		 */
		if ( w != null )
			getListeners().remove(w);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public WorriedObject getWorriedObject(Object target) {
		for ( WorriedObject w : getListeners() )
			if ( w.getTarget().equals(target) )
				return w;
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
			case InterestPackage.CONCERN__LISTENERS:
				return ((InternalEList<?>)getListeners()).basicRemove(otherEnd, msgs);
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
			case InterestPackage.CONCERN__ID:
				return getId();
			case InterestPackage.CONCERN__LISTENERS:
				return getListeners();
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
			case InterestPackage.CONCERN__ID:
				setId((String)newValue);
				return;
			case InterestPackage.CONCERN__LISTENERS:
				getListeners().clear();
				getListeners().addAll((Collection<? extends WorriedObject>)newValue);
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
			case InterestPackage.CONCERN__ID:
				setId(ID_EDEFAULT);
				return;
			case InterestPackage.CONCERN__LISTENERS:
				getListeners().clear();
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
			case InterestPackage.CONCERN__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case InterestPackage.CONCERN__LISTENERS:
				return listeners != null && !listeners.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ConcernImpl
