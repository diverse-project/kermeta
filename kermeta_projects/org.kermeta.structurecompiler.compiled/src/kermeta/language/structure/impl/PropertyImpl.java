/**
 * <copyright>
 * </copyright>
 *
 * $Id: PropertyImpl.java,v 1.2 2008-09-11 12:34:48 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import ecore.EStructuralFeature;

import kermeta.language.behavior.Expression;

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.Property;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.Traceability;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
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
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getEcoreModelElement <em>Ecore Model Element</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getGetterBody <em>Getter Body</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getSetterBody <em>Setter Body</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getIsID <em>Is ID</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getOwningClass <em>Owning Class</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getIsSetterAbstract <em>Is Setter Abstract</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getIsGetterAbstract <em>Is Getter Abstract</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getIsComposite <em>Is Composite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends MultiplicityElementImpl implements Property {
	/**
	 * The cached value of the '{@link #getEcoreModelElement() <em>Ecore Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreModelElement()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature ecoreModelElement;

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
	public EStructuralFeature getEcoreModelElement() {
		if (ecoreModelElement != null
				&& ((EObject) ecoreModelElement).eIsProxy()) {
			InternalEObject oldEcoreModelElement = (InternalEObject) ecoreModelElement;
			ecoreModelElement = (EStructuralFeature) eResolveProxy(oldEcoreModelElement);
			if (ecoreModelElement != oldEcoreModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StructurePackage.PROPERTY__ECORE_MODEL_ELEMENT,
							oldEcoreModelElement, ecoreModelElement));
			}
		}
		return ecoreModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetEcoreModelElement() {
		return ecoreModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcoreModelElement(EStructuralFeature newEcoreModelElement) {
		EStructuralFeature oldEcoreModelElement = ecoreModelElement;
		ecoreModelElement = newEcoreModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.PROPERTY__ECORE_MODEL_ELEMENT,
					oldEcoreModelElement, ecoreModelElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.PROPERTY__DEFAULT, oldDefault, default_));
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
	public String createBehaviorJava(KM2EcoreContext context) {

		java.lang.String result = null;

		result = null;

		java.lang.String javaCode = "";

		java.lang.Boolean idIfCond_219 = false;
		idIfCond_219 = this.getIsDerived();

		if (idIfCond_219) {

			java.lang.Boolean idIfCond_220 = false;
			idIfCond_220 = kermeta.standard.helper.BooleanWrapper.not(this
					.getIsReadOnly());

			if (idIfCond_220) {

				javaCode = this.getGetterBody().createBehaviorJava(context);

				((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("km2ecore.helper.ecore.EAnnotationHelper"))
						.addAnnotationPropSetter(this.getEcoreModelElement(),
								kermeta.standard.helper.StringWrapper
										.toString(javaCode));
			}

			javaCode = this.getGetterBody().createBehaviorJava(context);

			((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("km2ecore.helper.ecore.EAnnotationHelper"))
					.addAnnotationPropGetter(this.getEcoreModelElement(),
							kermeta.standard.helper.StringWrapper
									.toString(javaCode));
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void applyPass1(KM2EcoreContext context) {

		ecore.EStructuralFeature ecoreStructuralFeature = this
				.createEcoreModelElement(context);

		kermeta.language.structure.ClassDefinition c = null;

		c = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.container(this);

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<ecore.EStructuralFeature> convertAsOrderedSet(
						c.getEcoreModelElement().getEStructuralFeatures()).add(
						ecoreStructuralFeature);

		this.setEcoreModelElement(ecoreStructuralFeature);

		//BIft:eachOwnedElement

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft69 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_221 = false;
			while (!idLoopCond_221) {
				idLoopCond_221 = it_ft69.isOff();
				if (idLoopCond_221) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp69 = it_ft69.next();

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp68 = o_lbdExp69;

					o_lbdExp68.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//EIft:eachOwnedElement

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void applyPass2(KM2EcoreContext context) {

		this.setLinks(context);

		kermeta.language.structure.helper.ObjectSuper.super_applyPass2(this,
				context);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature createEcoreModelElement(KM2EcoreContext context) {

		ecore.EStructuralFeature result = null;

		ecore.EStructuralFeature ecoreStructuralFeature = null;

		kermeta.language.structure.Type current_type = ((kermeta.language.structure.Type) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asType(this.getType(),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.structure.Type")));

		java.lang.Boolean idIfCond_222 = false;
		idIfCond_222 = kermeta.standard.helper.BooleanWrapper.or(
				kermeta.standard.helper.BooleanWrapper.or(current_type
						.isValueType(), current_type.isEnumeration()),
				current_type.isEDataType());

		if (idIfCond_222) {

			ecoreStructuralFeature = ((ecore.EAttribute) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("ecore.EAttribute"));
		} else {

			ecoreStructuralFeature = ((ecore.EReference) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("ecore.EReference"));

			((ecore.EReference) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asType(ecoreStructuralFeature,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"ecore.EReference")))
					.setContainment(this.getIsComposite());
		}

		((km2ecore.helper.ecore.EcoreModelElementHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("km2ecore.helper.ecore.EcoreModelElementHelper"))
				.setEStructuralFeatureProperties(this, ecoreStructuralFeature,
						context);

		java.lang.Boolean idIfCond_223 = false;
		idIfCond_223 = this.getIsDerived();

		if (idIfCond_223) {

			ecoreStructuralFeature.setChangeable(this.getIsReadOnly());

			ecore.EAnnotation annotation = ((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("km2ecore.helper.ecore.EAnnotationHelper"))
					.createKermetaEAnnotation(
							kermeta.standard.helper.StringWrapper
									.toString(km2ecore.helper.ecore.KermetaEAnnotationKey
											.getByName("isReadOnly").getName()),
							kermeta.standard.helper.BooleanWrapper
									.toString(this.getIsReadOnly()));

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EAnnotation> convertAsOrderedSet(
							ecoreStructuralFeature.getEAnnotations()).add(
							annotation);
		}

		ecoreStructuralFeature.setTransient(this.getEMFIsTransient());

		result = ecoreStructuralFeature;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinks(KM2EcoreContext context) {

		((kermeta.language.structure.LinkSetterForTypedElement) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.language.structure.LinkSetterForTypedElement"))
				.setLinks(this, this.getEcoreModelElement(), context);

		java.lang.Boolean idIfCond_224 = false;
		idIfCond_224 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this.getOpposite()));

		if (idIfCond_224) {

			((ecore.EReference) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asType(this.getEcoreModelElement(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"ecore.EReference")))
					.setEOpposite(((ecore.EReference) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asType(this.getOpposite().getEcoreModelElement(),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance().getMetaClass(
													"ecore.EReference"))));
		}

		java.lang.Boolean idIfCond_225 = false;
		idIfCond_225 = kermeta.standard.helper.StringWrapper.equals(this
				.getType().getTypeQName(), "kermeta::standard::Boolean");

		if (idIfCond_225) {

			this.getEcoreModelElement().setDefaultValueLiteral("false");
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void applyPass2BehaviorJava(KM2EcoreContext context) {

		this.setLinks(context);

		kermeta.language.structure.helper.ObjectSuper
				.super_applyPass2BehaviorJava(this, context);

		this.createBehaviorJava(context);

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
		case StructurePackage.PROPERTY__ECORE_MODEL_ELEMENT:
			if (resolve)
				return getEcoreModelElement();
			return basicGetEcoreModelElement();
		case StructurePackage.PROPERTY__DEFAULT:
			return getDefault();
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
		case StructurePackage.PROPERTY__IS_ID:
			return getIsID();
		case StructurePackage.PROPERTY__OWNING_CLASS:
			if (resolve)
				return getOwningClass();
			return basicGetOwningClass();
		case StructurePackage.PROPERTY__IS_SETTER_ABSTRACT:
			return getIsSetterAbstract();
		case StructurePackage.PROPERTY__IS_GETTER_ABSTRACT:
			return getIsGetterAbstract();
		case StructurePackage.PROPERTY__IS_COMPOSITE:
			return getIsComposite();
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
		case StructurePackage.PROPERTY__ECORE_MODEL_ELEMENT:
			setEcoreModelElement((EStructuralFeature) newValue);
			return;
		case StructurePackage.PROPERTY__DEFAULT:
			setDefault((String) newValue);
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
		case StructurePackage.PROPERTY__IS_ID:
			setIsID((Boolean) newValue);
			return;
		case StructurePackage.PROPERTY__OWNING_CLASS:
			setOwningClass((ClassDefinition) newValue);
			return;
		case StructurePackage.PROPERTY__IS_SETTER_ABSTRACT:
			setIsSetterAbstract((Boolean) newValue);
			return;
		case StructurePackage.PROPERTY__IS_GETTER_ABSTRACT:
			setIsGetterAbstract((Boolean) newValue);
			return;
		case StructurePackage.PROPERTY__IS_COMPOSITE:
			setIsComposite((Boolean) newValue);
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
		case StructurePackage.PROPERTY__ECORE_MODEL_ELEMENT:
			setEcoreModelElement((EStructuralFeature) null);
			return;
		case StructurePackage.PROPERTY__DEFAULT:
			setDefault(DEFAULT_EDEFAULT);
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
		case StructurePackage.PROPERTY__IS_ID:
			setIsID(IS_ID_EDEFAULT);
			return;
		case StructurePackage.PROPERTY__OWNING_CLASS:
			setOwningClass((ClassDefinition) null);
			return;
		case StructurePackage.PROPERTY__IS_SETTER_ABSTRACT:
			setIsSetterAbstract(IS_SETTER_ABSTRACT_EDEFAULT);
			return;
		case StructurePackage.PROPERTY__IS_GETTER_ABSTRACT:
			setIsGetterAbstract(IS_GETTER_ABSTRACT_EDEFAULT);
			return;
		case StructurePackage.PROPERTY__IS_COMPOSITE:
			setIsComposite(IS_COMPOSITE_EDEFAULT);
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
		case StructurePackage.PROPERTY__ECORE_MODEL_ELEMENT:
			return ecoreModelElement != null;
		case StructurePackage.PROPERTY__DEFAULT:
			return DEFAULT_EDEFAULT == null ? default_ != null
					: !DEFAULT_EDEFAULT.equals(default_);
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
		case StructurePackage.PROPERTY__IS_ID:
			return IS_ID_EDEFAULT == null ? isID != null : !IS_ID_EDEFAULT
					.equals(isID);
		case StructurePackage.PROPERTY__OWNING_CLASS:
			return basicGetOwningClass() != null;
		case StructurePackage.PROPERTY__IS_SETTER_ABSTRACT:
			return IS_SETTER_ABSTRACT_EDEFAULT == null ? isSetterAbstract != null
					: !IS_SETTER_ABSTRACT_EDEFAULT.equals(isSetterAbstract);
		case StructurePackage.PROPERTY__IS_GETTER_ABSTRACT:
			return IS_GETTER_ABSTRACT_EDEFAULT == null ? isGetterAbstract != null
					: !IS_GETTER_ABSTRACT_EDEFAULT.equals(isGetterAbstract);
		case StructurePackage.PROPERTY__IS_COMPOSITE:
			return IS_COMPOSITE_EDEFAULT == null ? isComposite != null
					: !IS_COMPOSITE_EDEFAULT.equals(isComposite);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Traceability.class) {
			switch (derivedFeatureID) {
			case StructurePackage.PROPERTY__ECORE_MODEL_ELEMENT:
				return StructurePackage.TRACEABILITY__ECORE_MODEL_ELEMENT;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Traceability.class) {
			switch (baseFeatureID) {
			case StructurePackage.TRACEABILITY__ECORE_MODEL_ELEMENT:
				return StructurePackage.PROPERTY__ECORE_MODEL_ELEMENT;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (default: ");
		result.append(default_);
		result.append(", isDerived: ");
		result.append(isDerived);
		result.append(", isReadOnly: ");
		result.append(isReadOnly);
		result.append(", isID: ");
		result.append(isID);
		result.append(", isSetterAbstract: ");
		result.append(isSetterAbstract);
		result.append(", isGetterAbstract: ");
		result.append(isGetterAbstract);
		result.append(", isComposite: ");
		result.append(isComposite);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
