/**
 * <copyright>
 * </copyright>
 *
 * $Id: PropertyImpl.java,v 1.8 2008-02-14 07:13:02 uid21732 Exp $
 */
package fr.irisa.triskell.kermeta.language.structure.impl;

import fr.irisa.triskell.kermeta.language.behavior.Expression;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructurePackage;

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
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.PropertyImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.PropertyImpl#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.PropertyImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.PropertyImpl#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.PropertyImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.PropertyImpl#isIsID <em>Is ID</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.PropertyImpl#getGetterBody <em>Getter Body</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.PropertyImpl#getSetterBody <em>Setter Body</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.PropertyImpl#isIsGetterAbstract <em>Is Getter Abstract</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.PropertyImpl#isIsSetterAbstract <em>Is Setter Abstract</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.PropertyImpl#getOwningClass <em>Owning Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends MultiplicityElementImpl implements Property {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "IRISA / INRIA / Universite de Rennes 1";

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
	 * The default value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean isReadOnly = IS_READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected String default_ = DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPOSITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposite()
	 * @generated
	 * @ordered
	 */
	protected boolean isComposite = IS_COMPOSITE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsID() <em>Is ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsID()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsID() <em>Is ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsID()
	 * @generated
	 * @ordered
	 */
	protected boolean isID = IS_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getSetterBody() <em>Setter Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetterBody()
	 * @generated
	 * @ordered
	 */
	protected Expression setterBody;

	/**
	 * The default value of the '{@link #isIsGetterAbstract() <em>Is Getter Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsGetterAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_GETTER_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsGetterAbstract() <em>Is Getter Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsGetterAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isGetterAbstract = IS_GETTER_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSetterAbstract() <em>Is Setter Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSetterAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SETTER_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSetterAbstract() <em>Is Setter Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSetterAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isSetterAbstract = IS_SETTER_ABSTRACT_EDEFAULT;

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
	public Expression getGetterBody() {
		if (getterBody != null && getterBody.eIsProxy()) {
			InternalEObject oldGetterBody = (InternalEObject)getterBody;
			getterBody = (Expression)eResolveProxy(oldGetterBody);
			if (getterBody != oldGetterBody) {
				InternalEObject newGetterBody = (InternalEObject)getterBody;
				NotificationChain msgs = oldGetterBody.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurePackage.PROPERTY__GETTER_BODY, null, null);
				if (newGetterBody.eInternalContainer() == null) {
					msgs = newGetterBody.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructurePackage.PROPERTY__GETTER_BODY, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.PROPERTY__GETTER_BODY, oldGetterBody, getterBody));
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
	public NotificationChain basicSetGetterBody(Expression newGetterBody, NotificationChain msgs) {
		Expression oldGetterBody = getterBody;
		getterBody = newGetterBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY__GETTER_BODY, oldGetterBody, newGetterBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
				msgs = ((InternalEObject)getterBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurePackage.PROPERTY__GETTER_BODY, null, msgs);
			if (newGetterBody != null)
				msgs = ((InternalEObject)newGetterBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructurePackage.PROPERTY__GETTER_BODY, null, msgs);
			msgs = basicSetGetterBody(newGetterBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY__GETTER_BODY, newGetterBody, newGetterBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getSetterBody() {
		if (setterBody != null && setterBody.eIsProxy()) {
			InternalEObject oldSetterBody = (InternalEObject)setterBody;
			setterBody = (Expression)eResolveProxy(oldSetterBody);
			if (setterBody != oldSetterBody) {
				InternalEObject newSetterBody = (InternalEObject)setterBody;
				NotificationChain msgs = oldSetterBody.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurePackage.PROPERTY__SETTER_BODY, null, null);
				if (newSetterBody.eInternalContainer() == null) {
					msgs = newSetterBody.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructurePackage.PROPERTY__SETTER_BODY, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.PROPERTY__SETTER_BODY, oldSetterBody, setterBody));
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
	public NotificationChain basicSetSetterBody(Expression newSetterBody, NotificationChain msgs) {
		Expression oldSetterBody = setterBody;
		setterBody = newSetterBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY__SETTER_BODY, oldSetterBody, newSetterBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
				msgs = ((InternalEObject)setterBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurePackage.PROPERTY__SETTER_BODY, null, msgs);
			if (newSetterBody != null)
				msgs = ((InternalEObject)newSetterBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructurePackage.PROPERTY__SETTER_BODY, null, msgs);
			msgs = basicSetSetterBody(newSetterBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY__SETTER_BODY, newSetterBody, newSetterBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsGetterAbstract() {
		return isGetterAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsGetterAbstract(boolean newIsGetterAbstract) {
		boolean oldIsGetterAbstract = isGetterAbstract;
		isGetterAbstract = newIsGetterAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY__IS_GETTER_ABSTRACT, oldIsGetterAbstract, isGetterAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSetterAbstract() {
		return isSetterAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSetterAbstract(boolean newIsSetterAbstract) {
		boolean oldIsSetterAbstract = isSetterAbstract;
		isSetterAbstract = newIsSetterAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY__IS_SETTER_ABSTRACT, oldIsSetterAbstract, isSetterAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinition getOwningClass() {
		if (eContainerFeatureID != StructurePackage.PROPERTY__OWNING_CLASS) return null;
		return (ClassDefinition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinition basicGetOwningClass() {
		if (eContainerFeatureID != StructurePackage.PROPERTY__OWNING_CLASS) return null;
		return (ClassDefinition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningClass(ClassDefinition newOwningClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningClass, StructurePackage.PROPERTY__OWNING_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningClass(ClassDefinition newOwningClass) {
		if (newOwningClass != eInternalContainer() || (eContainerFeatureID != StructurePackage.PROPERTY__OWNING_CLASS && newOwningClass != null)) {
			if (EcoreUtil.isAncestor(this, newOwningClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningClass != null)
				msgs = ((InternalEObject)newOwningClass).eInverseAdd(this, StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE, ClassDefinition.class, msgs);
			msgs = basicSetOwningClass(newOwningClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY__OWNING_CLASS, newOwningClass, newOwningClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOpposite() {
		if (opposite != null && opposite.eIsProxy()) {
			InternalEObject oldOpposite = (InternalEObject)opposite;
			opposite = (Property)eResolveProxy(oldOpposite);
			if (opposite != oldOpposite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.PROPERTY__OPPOSITE, oldOpposite, opposite));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY__OPPOSITE, oldOpposite, opposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReadOnly() {
		return isReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadOnly(boolean newIsReadOnly) {
		boolean oldIsReadOnly = isReadOnly;
		isReadOnly = newIsReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		String oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsComposite() {
		return isComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsComposite(boolean newIsComposite) {
		boolean oldIsComposite = isComposite;
		isComposite = newIsComposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY__IS_COMPOSITE, oldIsComposite, isComposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDerived() {
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived) {
		boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsID() {
		return isID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsID(boolean newIsID) {
		boolean oldIsID = isID;
		isID = newIsID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY__IS_ID, oldIsID, isID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.PROPERTY__OWNING_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningClass((ClassDefinition)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case StructurePackage.PROPERTY__OWNING_CLASS:
				return eInternalContainer().eInverseRemove(this, StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE, ClassDefinition.class, msgs);
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
			case StructurePackage.PROPERTY__OPPOSITE:
				if (resolve) return getOpposite();
				return basicGetOpposite();
			case StructurePackage.PROPERTY__IS_READ_ONLY:
				return isIsReadOnly() ? Boolean.TRUE : Boolean.FALSE;
			case StructurePackage.PROPERTY__DEFAULT:
				return getDefault();
			case StructurePackage.PROPERTY__IS_COMPOSITE:
				return isIsComposite() ? Boolean.TRUE : Boolean.FALSE;
			case StructurePackage.PROPERTY__IS_DERIVED:
				return isIsDerived() ? Boolean.TRUE : Boolean.FALSE;
			case StructurePackage.PROPERTY__IS_ID:
				return isIsID() ? Boolean.TRUE : Boolean.FALSE;
			case StructurePackage.PROPERTY__GETTER_BODY:
				if (resolve) return getGetterBody();
				return basicGetGetterBody();
			case StructurePackage.PROPERTY__SETTER_BODY:
				if (resolve) return getSetterBody();
				return basicGetSetterBody();
			case StructurePackage.PROPERTY__IS_GETTER_ABSTRACT:
				return isIsGetterAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case StructurePackage.PROPERTY__IS_SETTER_ABSTRACT:
				return isIsSetterAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case StructurePackage.PROPERTY__OWNING_CLASS:
				if (resolve) return getOwningClass();
				return basicGetOwningClass();
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
			case StructurePackage.PROPERTY__OPPOSITE:
				setOpposite((Property)newValue);
				return;
			case StructurePackage.PROPERTY__IS_READ_ONLY:
				setIsReadOnly(((Boolean)newValue).booleanValue());
				return;
			case StructurePackage.PROPERTY__DEFAULT:
				setDefault((String)newValue);
				return;
			case StructurePackage.PROPERTY__IS_COMPOSITE:
				setIsComposite(((Boolean)newValue).booleanValue());
				return;
			case StructurePackage.PROPERTY__IS_DERIVED:
				setIsDerived(((Boolean)newValue).booleanValue());
				return;
			case StructurePackage.PROPERTY__IS_ID:
				setIsID(((Boolean)newValue).booleanValue());
				return;
			case StructurePackage.PROPERTY__GETTER_BODY:
				setGetterBody((Expression)newValue);
				return;
			case StructurePackage.PROPERTY__SETTER_BODY:
				setSetterBody((Expression)newValue);
				return;
			case StructurePackage.PROPERTY__IS_GETTER_ABSTRACT:
				setIsGetterAbstract(((Boolean)newValue).booleanValue());
				return;
			case StructurePackage.PROPERTY__IS_SETTER_ABSTRACT:
				setIsSetterAbstract(((Boolean)newValue).booleanValue());
				return;
			case StructurePackage.PROPERTY__OWNING_CLASS:
				setOwningClass((ClassDefinition)newValue);
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
			case StructurePackage.PROPERTY__OPPOSITE:
				setOpposite((Property)null);
				return;
			case StructurePackage.PROPERTY__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case StructurePackage.PROPERTY__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case StructurePackage.PROPERTY__IS_COMPOSITE:
				setIsComposite(IS_COMPOSITE_EDEFAULT);
				return;
			case StructurePackage.PROPERTY__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case StructurePackage.PROPERTY__IS_ID:
				setIsID(IS_ID_EDEFAULT);
				return;
			case StructurePackage.PROPERTY__GETTER_BODY:
				setGetterBody((Expression)null);
				return;
			case StructurePackage.PROPERTY__SETTER_BODY:
				setSetterBody((Expression)null);
				return;
			case StructurePackage.PROPERTY__IS_GETTER_ABSTRACT:
				setIsGetterAbstract(IS_GETTER_ABSTRACT_EDEFAULT);
				return;
			case StructurePackage.PROPERTY__IS_SETTER_ABSTRACT:
				setIsSetterAbstract(IS_SETTER_ABSTRACT_EDEFAULT);
				return;
			case StructurePackage.PROPERTY__OWNING_CLASS:
				setOwningClass((ClassDefinition)null);
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
			case StructurePackage.PROPERTY__OPPOSITE:
				return opposite != null;
			case StructurePackage.PROPERTY__IS_READ_ONLY:
				return isReadOnly != IS_READ_ONLY_EDEFAULT;
			case StructurePackage.PROPERTY__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case StructurePackage.PROPERTY__IS_COMPOSITE:
				return isComposite != IS_COMPOSITE_EDEFAULT;
			case StructurePackage.PROPERTY__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case StructurePackage.PROPERTY__IS_ID:
				return isID != IS_ID_EDEFAULT;
			case StructurePackage.PROPERTY__GETTER_BODY:
				return getterBody != null;
			case StructurePackage.PROPERTY__SETTER_BODY:
				return setterBody != null;
			case StructurePackage.PROPERTY__IS_GETTER_ABSTRACT:
				return isGetterAbstract != IS_GETTER_ABSTRACT_EDEFAULT;
			case StructurePackage.PROPERTY__IS_SETTER_ABSTRACT:
				return isSetterAbstract != IS_SETTER_ABSTRACT_EDEFAULT;
			case StructurePackage.PROPERTY__OWNING_CLASS:
				return basicGetOwningClass() != null;
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
		result.append(" (isReadOnly: ");
		result.append(isReadOnly);
		result.append(", default: ");
		result.append(default_);
		result.append(", isComposite: ");
		result.append(isComposite);
		result.append(", isDerived: ");
		result.append(isDerived);
		result.append(", isID: ");
		result.append(isID);
		result.append(", isGetterAbstract: ");
		result.append(isGetterAbstract);
		result.append(", isSetterAbstract: ");
		result.append(isSetterAbstract);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl