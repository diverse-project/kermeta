/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.smartadapters.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.smartadapters.core.Aspect;
import org.smartadapters.core.CorePackage;

import patternframework.ModelPattern;
import patternframework.PModel;
import patternframework.PObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smartadapters.core.impl.AspectImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.smartadapters.core.impl.AspectImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link org.smartadapters.core.impl.AspectImpl#getPersistent <em>Persistent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AspectImpl extends EObjectImpl implements Aspect {
	/**
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected ModelPattern template;

	/**
	 * The cached value of the '{@link #getStructure() <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected PModel structure;

	/**
	 * The cached value of the '{@link #getPersistent() <em>Persistent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistent()
	 * @generated
	 * @ordered
	 */
	protected EList<PObject> persistent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AspectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ASPECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPattern getTemplate() {
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplate(ModelPattern newTemplate, NotificationChain msgs) {
		ModelPattern oldTemplate = template;
		template = newTemplate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ASPECT__TEMPLATE, oldTemplate, newTemplate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(ModelPattern newTemplate) {
		if (newTemplate != template) {
			NotificationChain msgs = null;
			if (template != null)
				msgs = ((InternalEObject)template).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ASPECT__TEMPLATE, null, msgs);
			if (newTemplate != null)
				msgs = ((InternalEObject)newTemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ASPECT__TEMPLATE, null, msgs);
			msgs = basicSetTemplate(newTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ASPECT__TEMPLATE, newTemplate, newTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PModel getStructure() {
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructure(PModel newStructure, NotificationChain msgs) {
		PModel oldStructure = structure;
		structure = newStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ASPECT__STRUCTURE, oldStructure, newStructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructure(PModel newStructure) {
		if (newStructure != structure) {
			NotificationChain msgs = null;
			if (structure != null)
				msgs = ((InternalEObject)structure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ASPECT__STRUCTURE, null, msgs);
			if (newStructure != null)
				msgs = ((InternalEObject)newStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ASPECT__STRUCTURE, null, msgs);
			msgs = basicSetStructure(newStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ASPECT__STRUCTURE, newStructure, newStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PObject> getPersistent() {
		if (persistent == null) {
			persistent = new EObjectResolvingEList<PObject>(PObject.class, this, CorePackage.ASPECT__PERSISTENT);
		}
		return persistent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ASPECT__TEMPLATE:
				return basicSetTemplate(null, msgs);
			case CorePackage.ASPECT__STRUCTURE:
				return basicSetStructure(null, msgs);
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
			case CorePackage.ASPECT__TEMPLATE:
				return getTemplate();
			case CorePackage.ASPECT__STRUCTURE:
				return getStructure();
			case CorePackage.ASPECT__PERSISTENT:
				return getPersistent();
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
			case CorePackage.ASPECT__TEMPLATE:
				setTemplate((ModelPattern)newValue);
				return;
			case CorePackage.ASPECT__STRUCTURE:
				setStructure((PModel)newValue);
				return;
			case CorePackage.ASPECT__PERSISTENT:
				getPersistent().clear();
				getPersistent().addAll((Collection<? extends PObject>)newValue);
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
			case CorePackage.ASPECT__TEMPLATE:
				setTemplate((ModelPattern)null);
				return;
			case CorePackage.ASPECT__STRUCTURE:
				setStructure((PModel)null);
				return;
			case CorePackage.ASPECT__PERSISTENT:
				getPersistent().clear();
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
			case CorePackage.ASPECT__TEMPLATE:
				return template != null;
			case CorePackage.ASPECT__STRUCTURE:
				return structure != null;
			case CorePackage.ASPECT__PERSISTENT:
				return persistent != null && !persistent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AspectImpl
