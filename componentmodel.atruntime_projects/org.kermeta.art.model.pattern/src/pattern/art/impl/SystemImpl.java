/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pattern.art.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pattern.art.ArtPatternPackage;
import pattern.art.DataType;

import pattern.art.group.Group;

import pattern.art.instance.CompositeInstance;

import pattern.art.type.ComponentType;
import pattern.art.type.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pattern.art.impl.SystemImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link pattern.art.impl.SystemImpl#getServices <em>Services</em>}</li>
 *   <li>{@link pattern.art.impl.SystemImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link pattern.art.impl.SystemImpl#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link pattern.art.impl.SystemImpl#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemImpl extends ModelElementImpl implements pattern.art.System {
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
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

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
	 * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> dataTypes;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> groups;

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
		return ArtPatternPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeInstance getRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot(CompositeInstance newRoot, NotificationChain msgs) {
		CompositeInstance oldRoot = root;
		root = newRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArtPatternPackage.SYSTEM__ROOT, oldRoot, newRoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
				msgs = ((InternalEObject)root).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArtPatternPackage.SYSTEM__ROOT, null, msgs);
			if (newRoot != null)
				msgs = ((InternalEObject)newRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArtPatternPackage.SYSTEM__ROOT, null, msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtPatternPackage.SYSTEM__ROOT, newRoot, newRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Service>(Service.class, this, ArtPatternPackage.SYSTEM__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentType> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<ComponentType>(ComponentType.class, this, ArtPatternPackage.SYSTEM__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getDataTypes() {
		if (dataTypes == null) {
			dataTypes = new EObjectContainmentEList<DataType>(DataType.class, this, ArtPatternPackage.SYSTEM__DATA_TYPES);
		}
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<Group>(Group.class, this, ArtPatternPackage.SYSTEM__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArtPatternPackage.SYSTEM__ROOT:
				return basicSetRoot(null, msgs);
			case ArtPatternPackage.SYSTEM__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case ArtPatternPackage.SYSTEM__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case ArtPatternPackage.SYSTEM__DATA_TYPES:
				return ((InternalEList<?>)getDataTypes()).basicRemove(otherEnd, msgs);
			case ArtPatternPackage.SYSTEM__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
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
			case ArtPatternPackage.SYSTEM__ROOT:
				return getRoot();
			case ArtPatternPackage.SYSTEM__SERVICES:
				return getServices();
			case ArtPatternPackage.SYSTEM__TYPES:
				return getTypes();
			case ArtPatternPackage.SYSTEM__DATA_TYPES:
				return getDataTypes();
			case ArtPatternPackage.SYSTEM__GROUPS:
				return getGroups();
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
			case ArtPatternPackage.SYSTEM__ROOT:
				setRoot((CompositeInstance)newValue);
				return;
			case ArtPatternPackage.SYSTEM__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case ArtPatternPackage.SYSTEM__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends ComponentType>)newValue);
				return;
			case ArtPatternPackage.SYSTEM__DATA_TYPES:
				getDataTypes().clear();
				getDataTypes().addAll((Collection<? extends DataType>)newValue);
				return;
			case ArtPatternPackage.SYSTEM__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends Group>)newValue);
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
			case ArtPatternPackage.SYSTEM__ROOT:
				setRoot((CompositeInstance)null);
				return;
			case ArtPatternPackage.SYSTEM__SERVICES:
				getServices().clear();
				return;
			case ArtPatternPackage.SYSTEM__TYPES:
				getTypes().clear();
				return;
			case ArtPatternPackage.SYSTEM__DATA_TYPES:
				getDataTypes().clear();
				return;
			case ArtPatternPackage.SYSTEM__GROUPS:
				getGroups().clear();
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
			case ArtPatternPackage.SYSTEM__ROOT:
				return root != null;
			case ArtPatternPackage.SYSTEM__SERVICES:
				return services != null && !services.isEmpty();
			case ArtPatternPackage.SYSTEM__TYPES:
				return types != null && !types.isEmpty();
			case ArtPatternPackage.SYSTEM__DATA_TYPES:
				return dataTypes != null && !dataTypes.isEmpty();
			case ArtPatternPackage.SYSTEM__GROUPS:
				return groups != null && !groups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
