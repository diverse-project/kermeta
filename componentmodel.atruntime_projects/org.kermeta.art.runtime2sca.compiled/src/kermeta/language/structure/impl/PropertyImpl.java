/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.language.structure.impl;

import kermeta.language.behavior.Expression;

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.Property;
import kermeta.language.structure.StructurePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#get_default <em>default</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getGetterBody <em>Getter Body</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getSetterBody <em>Setter Body</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getOwningClass <em>Owning Class</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getIsID <em>Is ID</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getIsSetterAbstract <em>Is Setter Abstract</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getIsGetterAbstract <em>Is Getter Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends MultiplicityElementImpl implements Property {
	/**
	 * The default value of the '{@link #get_default() <em>default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_default()
	 * @generated
	 * @ordered
	 */
	protected static final String _DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #get_default() <em>default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_default()
	 * @generated
	 * @ordered
	 */
	protected String _default = _DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDerived()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_DERIVED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDerived()
	 * @generated
	 * @ordered
	 */
	protected Boolean isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOpposite() <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpposite()
	 * @generated
	 * @ordered
	 */
	protected Property opposite;

	/**
	 * The cached value of the '{@link #getGetterBody() <em>Getter Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetterBody()
	 * @generated
	 * @ordered
	 */
	protected Expression getterBody;

	/**
	 * The default value of the '{@link #getIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_READ_ONLY_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected Boolean isReadOnly = IS_READ_ONLY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSetterBody() <em>Setter Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetterBody()
	 * @generated
	 * @ordered
	 */
	protected Expression setterBody;

	/**
	 * The default value of the '{@link #getIsID() <em>Is ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsID()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ID_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsID() <em>Is ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsID()
	 * @generated
	 * @ordered
	 */
	protected Boolean isID = IS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsSetterAbstract() <em>Is Setter Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSetterAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_SETTER_ABSTRACT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsSetterAbstract() <em>Is Setter Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSetterAbstract()
	 * @generated
	 * @ordered
	 */
	protected Boolean isSetterAbstract = IS_SETTER_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsComposite()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_COMPOSITE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsComposite()
	 * @generated
	 * @ordered
	 */
	protected Boolean isComposite = IS_COMPOSITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsGetterAbstract() <em>Is Getter Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsGetterAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_GETTER_ABSTRACT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsGetterAbstract() <em>Is Getter Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsGetterAbstract()
	 * @generated
	 * @ordered
	 */
	protected Boolean isGetterAbstract = IS_GETTER_ABSTRACT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String get_default() {
		return _default;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_default(String new_default) {
		String old_default = _default;
		_default = new_default;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.PROPERTY__DEFAULT, old_default, _default));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDerived() {
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(Boolean newIsDerived) {
		Boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.PROPERTY__IS_DERIVED, oldIsDerived,
					isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOpposite() {
		if (opposite != null && opposite.eIsProxy()) {
			InternalEObject oldOpposite = (InternalEObject) opposite;
			opposite = (Property) eResolveProxy(oldOpposite);
			if (opposite != oldOpposite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StructurePackage.PROPERTY__OPPOSITE, oldOpposite,
							opposite));
			}
		}
		return opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetOpposite() {
		return opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpposite(Property newOpposite) {
		Property oldOpposite = opposite;
		opposite = newOpposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.PROPERTY__OPPOSITE, oldOpposite, opposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getGetterBody() {
		if (getterBody != null && getterBody.eIsProxy()) {
			InternalEObject oldGetterBody = (InternalEObject) getterBody;
			getterBody = (Expression) eResolveProxy(oldGetterBody);
			if (getterBody != oldGetterBody) {
				InternalEObject newGetterBody = (InternalEObject) getterBody;
				NotificationChain msgs = oldGetterBody.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- StructurePackage.PROPERTY__GETTER_BODY, null,
						null);
				if (newGetterBody.eInternalContainer() == null) {
					msgs = newGetterBody.eInverseAdd(this,
							EOPPOSITE_FEATURE_BASE
									- StructurePackage.PROPERTY__GETTER_BODY,
							null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StructurePackage.PROPERTY__GETTER_BODY,
							oldGetterBody, getterBody));
			}
		}
		return getterBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetGetterBody() {
		return getterBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetterBody(Expression newGetterBody,
			NotificationChain msgs) {
		Expression oldGetterBody = getterBody;
		getterBody = newGetterBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, StructurePackage.PROPERTY__GETTER_BODY,
					oldGetterBody, newGetterBody);
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
	public void setGetterBody(Expression newGetterBody) {
		if (newGetterBody != getterBody) {
			NotificationChain msgs = null;
			if (getterBody != null)
				msgs = ((InternalEObject) getterBody).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- StructurePackage.PROPERTY__GETTER_BODY, null,
						msgs);
			if (newGetterBody != null)
				msgs = ((InternalEObject) newGetterBody).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- StructurePackage.PROPERTY__GETTER_BODY, null,
						msgs);
			msgs = basicSetGetterBody(newGetterBody, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.PROPERTY__GETTER_BODY, newGetterBody,
					newGetterBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsReadOnly() {
		return isReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadOnly(Boolean newIsReadOnly) {
		Boolean oldIsReadOnly = isReadOnly;
		isReadOnly = newIsReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.PROPERTY__IS_READ_ONLY, oldIsReadOnly,
					isReadOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getSetterBody() {
		if (setterBody != null && setterBody.eIsProxy()) {
			InternalEObject oldSetterBody = (InternalEObject) setterBody;
			setterBody = (Expression) eResolveProxy(oldSetterBody);
			if (setterBody != oldSetterBody) {
				InternalEObject newSetterBody = (InternalEObject) setterBody;
				NotificationChain msgs = oldSetterBody.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- StructurePackage.PROPERTY__SETTER_BODY, null,
						null);
				if (newSetterBody.eInternalContainer() == null) {
					msgs = newSetterBody.eInverseAdd(this,
							EOPPOSITE_FEATURE_BASE
									- StructurePackage.PROPERTY__SETTER_BODY,
							null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StructurePackage.PROPERTY__SETTER_BODY,
							oldSetterBody, setterBody));
			}
		}
		return setterBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetSetterBody() {
		return setterBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetterBody(Expression newSetterBody,
			NotificationChain msgs) {
		Expression oldSetterBody = setterBody;
		setterBody = newSetterBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, StructurePackage.PROPERTY__SETTER_BODY,
					oldSetterBody, newSetterBody);
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
	public void setSetterBody(Expression newSetterBody) {
		if (newSetterBody != setterBody) {
			NotificationChain msgs = null;
			if (setterBody != null)
				msgs = ((InternalEObject) setterBody).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- StructurePackage.PROPERTY__SETTER_BODY, null,
						msgs);
			if (newSetterBody != null)
				msgs = ((InternalEObject) newSetterBody).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- StructurePackage.PROPERTY__SETTER_BODY, null,
						msgs);
			msgs = basicSetSetterBody(newSetterBody, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.PROPERTY__SETTER_BODY, newSetterBody,
					newSetterBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinition getOwningClass() {
		if (eContainerFeatureID != StructurePackage.PROPERTY__OWNING_CLASS)
			return null;
		return (ClassDefinition) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinition basicGetOwningClass() {
		if (eContainerFeatureID != StructurePackage.PROPERTY__OWNING_CLASS)
			return null;
		return (ClassDefinition) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningClass(
			ClassDefinition newOwningClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOwningClass,
				StructurePackage.PROPERTY__OWNING_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningClass(ClassDefinition newOwningClass) {
		if (newOwningClass != eInternalContainer()
				|| (eContainerFeatureID != StructurePackage.PROPERTY__OWNING_CLASS && newOwningClass != null)) {
			if (EcoreUtil.isAncestor(this, newOwningClass))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningClass != null)
				msgs = ((InternalEObject) newOwningClass).eInverseAdd(this,
						StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE,
						ClassDefinition.class, msgs);
			msgs = basicSetOwningClass(newOwningClass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.PROPERTY__OWNING_CLASS, newOwningClass,
					newOwningClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsID() {
		return isID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsID(Boolean newIsID) {
		Boolean oldIsID = isID;
		isID = newIsID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.PROPERTY__IS_ID, oldIsID, isID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsSetterAbstract() {
		return isSetterAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSetterAbstract(Boolean newIsSetterAbstract) {
		Boolean oldIsSetterAbstract = isSetterAbstract;
		isSetterAbstract = newIsSetterAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.PROPERTY__IS_SETTER_ABSTRACT,
					oldIsSetterAbstract, isSetterAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsComposite() {
		return isComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsComposite(Boolean newIsComposite) {
		Boolean oldIsComposite = isComposite;
		isComposite = newIsComposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.PROPERTY__IS_COMPOSITE, oldIsComposite,
					isComposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsGetterAbstract() {
		return isGetterAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsGetterAbstract(Boolean newIsGetterAbstract) {
		Boolean oldIsGetterAbstract = isGetterAbstract;
		isGetterAbstract = newIsGetterAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.PROPERTY__IS_GETTER_ABSTRACT,
					oldIsGetterAbstract, isGetterAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StructurePackage.PROPERTY__OWNING_CLASS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetOwningClass((ClassDefinition) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
		case StructurePackage.PROPERTY__GETTER_BODY:
			return basicSetGetterBody(null, msgs);
		case StructurePackage.PROPERTY__SETTER_BODY:
			return basicSetSetterBody(null, msgs);
		case StructurePackage.PROPERTY__OWNING_CLASS:
			return basicSetOwningClass(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
		case StructurePackage.PROPERTY__OWNING_CLASS:
			return eInternalContainer().eInverseRemove(this,
					StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE,
					ClassDefinition.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StructurePackage.PROPERTY__DEFAULT:
			return get_default();
		case StructurePackage.PROPERTY__IS_DERIVED:
			return getIsDerived();
		case StructurePackage.PROPERTY__OPPOSITE:
			if (resolve)
				return getOpposite();
			return basicGetOpposite();
		case StructurePackage.PROPERTY__GETTER_BODY:
			if (resolve)
				return getGetterBody();
			return basicGetGetterBody();
		case StructurePackage.PROPERTY__IS_READ_ONLY:
			return getIsReadOnly();
		case StructurePackage.PROPERTY__SETTER_BODY:
			if (resolve)
				return getSetterBody();
			return basicGetSetterBody();
		case StructurePackage.PROPERTY__OWNING_CLASS:
			if (resolve)
				return getOwningClass();
			return basicGetOwningClass();
		case StructurePackage.PROPERTY__IS_ID:
			return getIsID();
		case StructurePackage.PROPERTY__IS_SETTER_ABSTRACT:
			return getIsSetterAbstract();
		case StructurePackage.PROPERTY__IS_COMPOSITE:
			return getIsComposite();
		case StructurePackage.PROPERTY__IS_GETTER_ABSTRACT:
			return getIsGetterAbstract();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StructurePackage.PROPERTY__DEFAULT:
			set_default((String) newValue);
			return;
		case StructurePackage.PROPERTY__IS_DERIVED:
			setIsDerived((Boolean) newValue);
			return;
		case StructurePackage.PROPERTY__OPPOSITE:
			setOpposite((Property) newValue);
			return;
		case StructurePackage.PROPERTY__GETTER_BODY:
			setGetterBody((Expression) newValue);
			return;
		case StructurePackage.PROPERTY__IS_READ_ONLY:
			setIsReadOnly((Boolean) newValue);
			return;
		case StructurePackage.PROPERTY__SETTER_BODY:
			setSetterBody((Expression) newValue);
			return;
		case StructurePackage.PROPERTY__OWNING_CLASS:
			setOwningClass((ClassDefinition) newValue);
			return;
		case StructurePackage.PROPERTY__IS_ID:
			setIsID((Boolean) newValue);
			return;
		case StructurePackage.PROPERTY__IS_SETTER_ABSTRACT:
			setIsSetterAbstract((Boolean) newValue);
			return;
		case StructurePackage.PROPERTY__IS_COMPOSITE:
			setIsComposite((Boolean) newValue);
			return;
		case StructurePackage.PROPERTY__IS_GETTER_ABSTRACT:
			setIsGetterAbstract((Boolean) newValue);
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
		case StructurePackage.PROPERTY__DEFAULT:
			set_default(_DEFAULT_EDEFAULT);
			return;
		case StructurePackage.PROPERTY__IS_DERIVED:
			setIsDerived(IS_DERIVED_EDEFAULT);
			return;
		case StructurePackage.PROPERTY__OPPOSITE:
			setOpposite((Property) null);
			return;
		case StructurePackage.PROPERTY__GETTER_BODY:
			setGetterBody((Expression) null);
			return;
		case StructurePackage.PROPERTY__IS_READ_ONLY:
			setIsReadOnly(IS_READ_ONLY_EDEFAULT);
			return;
		case StructurePackage.PROPERTY__SETTER_BODY:
			setSetterBody((Expression) null);
			return;
		case StructurePackage.PROPERTY__OWNING_CLASS:
			setOwningClass((ClassDefinition) null);
			return;
		case StructurePackage.PROPERTY__IS_ID:
			setIsID(IS_ID_EDEFAULT);
			return;
		case StructurePackage.PROPERTY__IS_SETTER_ABSTRACT:
			setIsSetterAbstract(IS_SETTER_ABSTRACT_EDEFAULT);
			return;
		case StructurePackage.PROPERTY__IS_COMPOSITE:
			setIsComposite(IS_COMPOSITE_EDEFAULT);
			return;
		case StructurePackage.PROPERTY__IS_GETTER_ABSTRACT:
			setIsGetterAbstract(IS_GETTER_ABSTRACT_EDEFAULT);
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
		case StructurePackage.PROPERTY__DEFAULT:
			return _DEFAULT_EDEFAULT == null ? _default != null
					: !_DEFAULT_EDEFAULT.equals(_default);
		case StructurePackage.PROPERTY__IS_DERIVED:
			return IS_DERIVED_EDEFAULT == null ? isDerived != null
					: !IS_DERIVED_EDEFAULT.equals(isDerived);
		case StructurePackage.PROPERTY__OPPOSITE:
			return opposite != null;
		case StructurePackage.PROPERTY__GETTER_BODY:
			return getterBody != null;
		case StructurePackage.PROPERTY__IS_READ_ONLY:
			return IS_READ_ONLY_EDEFAULT == null ? isReadOnly != null
					: !IS_READ_ONLY_EDEFAULT.equals(isReadOnly);
		case StructurePackage.PROPERTY__SETTER_BODY:
			return setterBody != null;
		case StructurePackage.PROPERTY__OWNING_CLASS:
			return basicGetOwningClass() != null;
		case StructurePackage.PROPERTY__IS_ID:
			return IS_ID_EDEFAULT == null ? isID != null : !IS_ID_EDEFAULT
					.equals(isID);
		case StructurePackage.PROPERTY__IS_SETTER_ABSTRACT:
			return IS_SETTER_ABSTRACT_EDEFAULT == null ? isSetterAbstract != null
					: !IS_SETTER_ABSTRACT_EDEFAULT.equals(isSetterAbstract);
		case StructurePackage.PROPERTY__IS_COMPOSITE:
			return IS_COMPOSITE_EDEFAULT == null ? isComposite != null
					: !IS_COMPOSITE_EDEFAULT.equals(isComposite);
		case StructurePackage.PROPERTY__IS_GETTER_ABSTRACT:
			return IS_GETTER_ABSTRACT_EDEFAULT == null ? isGetterAbstract != null
					: !IS_GETTER_ABSTRACT_EDEFAULT.equals(isGetterAbstract);
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (_default: ");
		result.append(_default);
		result.append(", isDerived: ");
		result.append(isDerived);
		result.append(", isReadOnly: ");
		result.append(isReadOnly);
		result.append(", isID: ");
		result.append(isID);
		result.append(", isSetterAbstract: ");
		result.append(isSetterAbstract);
		result.append(", isComposite: ");
		result.append(isComposite);
		result.append(", isGetterAbstract: ");
		result.append(isGetterAbstract);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
