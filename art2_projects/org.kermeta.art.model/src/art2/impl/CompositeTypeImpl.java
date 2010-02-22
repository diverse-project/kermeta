/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art2.impl;

import art2.Art2Package;
import art2.ComponentType;
import art2.CompositeType;
import art2.PortTypeRef;
import art2.Wire;

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
 * An implementation of the model object '<em><b>Composite Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link art2.impl.CompositeTypeImpl#getChilds <em>Childs</em>}</li>
 *   <li>{@link art2.impl.CompositeTypeImpl#getChildPortTypes <em>Child Port Types</em>}</li>
 *   <li>{@link art2.impl.CompositeTypeImpl#getWires <em>Wires</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeTypeImpl extends ComponentTypeImpl implements CompositeType {
	/**
	 * The cached value of the '{@link #getChilds() <em>Childs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChilds()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentType> childs;

	/**
	 * The cached value of the '{@link #getChildPortTypes() <em>Child Port Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildPortTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<PortTypeRef> childPortTypes;

	/**
	 * The cached value of the '{@link #getWires() <em>Wires</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWires()
	 * @generated
	 * @ordered
	 */
	protected Wire wires;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Art2Package.Literals.COMPOSITE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentType> getChilds() {
		if (childs == null) {
			childs = new EObjectContainmentEList<ComponentType>(ComponentType.class, this, Art2Package.COMPOSITE_TYPE__CHILDS);
		}
		return childs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortTypeRef> getChildPortTypes() {
		if (childPortTypes == null) {
			childPortTypes = new EObjectContainmentEList<PortTypeRef>(PortTypeRef.class, this, Art2Package.COMPOSITE_TYPE__CHILD_PORT_TYPES);
		}
		return childPortTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wire getWires() {
		if (wires != null && wires.eIsProxy()) {
			InternalEObject oldWires = (InternalEObject)wires;
			wires = (Wire)eResolveProxy(oldWires);
			if (wires != oldWires) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Art2Package.COMPOSITE_TYPE__WIRES, oldWires, wires));
			}
		}
		return wires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wire basicGetWires() {
		return wires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWires(Wire newWires) {
		Wire oldWires = wires;
		wires = newWires;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.COMPOSITE_TYPE__WIRES, oldWires, wires));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Art2Package.COMPOSITE_TYPE__CHILDS:
				return ((InternalEList<?>)getChilds()).basicRemove(otherEnd, msgs);
			case Art2Package.COMPOSITE_TYPE__CHILD_PORT_TYPES:
				return ((InternalEList<?>)getChildPortTypes()).basicRemove(otherEnd, msgs);
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
			case Art2Package.COMPOSITE_TYPE__CHILDS:
				return getChilds();
			case Art2Package.COMPOSITE_TYPE__CHILD_PORT_TYPES:
				return getChildPortTypes();
			case Art2Package.COMPOSITE_TYPE__WIRES:
				if (resolve) return getWires();
				return basicGetWires();
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
			case Art2Package.COMPOSITE_TYPE__CHILDS:
				getChilds().clear();
				getChilds().addAll((Collection<? extends ComponentType>)newValue);
				return;
			case Art2Package.COMPOSITE_TYPE__CHILD_PORT_TYPES:
				getChildPortTypes().clear();
				getChildPortTypes().addAll((Collection<? extends PortTypeRef>)newValue);
				return;
			case Art2Package.COMPOSITE_TYPE__WIRES:
				setWires((Wire)newValue);
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
			case Art2Package.COMPOSITE_TYPE__CHILDS:
				getChilds().clear();
				return;
			case Art2Package.COMPOSITE_TYPE__CHILD_PORT_TYPES:
				getChildPortTypes().clear();
				return;
			case Art2Package.COMPOSITE_TYPE__WIRES:
				setWires((Wire)null);
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
			case Art2Package.COMPOSITE_TYPE__CHILDS:
				return childs != null && !childs.isEmpty();
			case Art2Package.COMPOSITE_TYPE__CHILD_PORT_TYPES:
				return childPortTypes != null && !childPortTypes.isEmpty();
			case Art2Package.COMPOSITE_TYPE__WIRES:
				return wires != null;
		}
		return super.eIsSet(featureID);
	}

} //CompositeTypeImpl
