/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package art.impl;

import art.ArtPackage;
import art.DataType;

import art.instance.CompositeInstance;

import art.type.ComponentType;
import art.type.Service;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link art.impl.SystemImpl#getServices <em>Services</em>}</li>
 *   <li>{@link art.impl.SystemImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link art.impl.SystemImpl#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link art.impl.SystemImpl#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemImpl extends ModelElementImpl implements art.System {
	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected CompositeInstance root;

	/**
	 * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> dataTypes;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentType> types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArtPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList.Resolving<Service>(
					Service.class, this, ArtPackage.SYSTEM__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeInstance getRoot() {
		if (root != null && root.eIsProxy()) {
			InternalEObject oldRoot = (InternalEObject) root;
			root = (CompositeInstance) eResolveProxy(oldRoot);
			if (root != oldRoot) {
				InternalEObject newRoot = (InternalEObject) root;
				NotificationChain msgs = oldRoot.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArtPackage.SYSTEM__ROOT, null,
						null);
				if (newRoot.eInternalContainer() == null) {
					msgs = newRoot.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- ArtPackage.SYSTEM__ROOT, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ArtPackage.SYSTEM__ROOT, oldRoot, root));
			}
		}
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeInstance basicGetRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot(CompositeInstance newRoot,
			NotificationChain msgs) {
		CompositeInstance oldRoot = root;
		root = newRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, ArtPackage.SYSTEM__ROOT, oldRoot, newRoot);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(CompositeInstance newRoot) {
		if (newRoot != root) {
			NotificationChain msgs = null;
			if (root != null)
				msgs = ((InternalEObject) root).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArtPackage.SYSTEM__ROOT, null,
						msgs);
			if (newRoot != null)
				msgs = ((InternalEObject) newRoot).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArtPackage.SYSTEM__ROOT, null,
						msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ArtPackage.SYSTEM__ROOT, newRoot, newRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getDataTypes() {
		if (dataTypes == null) {
			dataTypes = new EObjectContainmentEList.Resolving<DataType>(
					DataType.class, this, ArtPackage.SYSTEM__DATA_TYPES);
		}
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentType> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList.Resolving<ComponentType>(
					ComponentType.class, this, ArtPackage.SYSTEM__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArtPackage.SYSTEM__SERVICES:
			return ((InternalEList<?>) getServices()).basicRemove(otherEnd,
					msgs);
		case ArtPackage.SYSTEM__ROOT:
			return basicSetRoot(null, msgs);
		case ArtPackage.SYSTEM__DATA_TYPES:
			return ((InternalEList<?>) getDataTypes()).basicRemove(otherEnd,
					msgs);
		case ArtPackage.SYSTEM__TYPES:
			return ((InternalEList<?>) getTypes()).basicRemove(otherEnd, msgs);
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
		case ArtPackage.SYSTEM__SERVICES:
			return getServices();
		case ArtPackage.SYSTEM__ROOT:
			if (resolve)
				return getRoot();
			return basicGetRoot();
		case ArtPackage.SYSTEM__DATA_TYPES:
			return getDataTypes();
		case ArtPackage.SYSTEM__TYPES:
			return getTypes();
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
		case ArtPackage.SYSTEM__SERVICES:
			getServices().clear();
			getServices().addAll((Collection<? extends Service>) newValue);
			return;
		case ArtPackage.SYSTEM__ROOT:
			setRoot((CompositeInstance) newValue);
			return;
		case ArtPackage.SYSTEM__DATA_TYPES:
			getDataTypes().clear();
			getDataTypes().addAll((Collection<? extends DataType>) newValue);
			return;
		case ArtPackage.SYSTEM__TYPES:
			getTypes().clear();
			getTypes().addAll((Collection<? extends ComponentType>) newValue);
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
		case ArtPackage.SYSTEM__SERVICES:
			getServices().clear();
			return;
		case ArtPackage.SYSTEM__ROOT:
			setRoot((CompositeInstance) null);
			return;
		case ArtPackage.SYSTEM__DATA_TYPES:
			getDataTypes().clear();
			return;
		case ArtPackage.SYSTEM__TYPES:
			getTypes().clear();
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
		case ArtPackage.SYSTEM__SERVICES:
			return services != null && !services.isEmpty();
		case ArtPackage.SYSTEM__ROOT:
			return root != null;
		case ArtPackage.SYSTEM__DATA_TYPES:
			return dataTypes != null && !dataTypes.isEmpty();
		case ArtPackage.SYSTEM__TYPES:
			return types != null && !types.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
