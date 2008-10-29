/**
 * <copyright>
 * </copyright>
 *
 * $Id: PropertyImpl.java,v 1.7 2008-10-29 08:29:11 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import ecore.EStructuralFeature;

import java.util.Collection;

import kermeta.language.behavior.Expression;

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.MultiplicityElement;
import kermeta.language.structure.NamedElement;
import kermeta.language.structure.Property;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.Type;
import kermeta.language.structure.TypeContainer;
import kermeta.language.structure.TypedElement;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getContainedType <em>Contained Type</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#get_default <em>default</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getGetterBody <em>Getter Body</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getSetterBody <em>Setter Body</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getIsSetterAbstract <em>Is Setter Abstract</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getIsID <em>Is ID</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getOwningClass <em>Owning Class</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getIsGetterAbstract <em>Is Getter Abstract</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getIsComposite <em>Is Composite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends TraceabilityImpl<EStructuralFeature>
		implements Property {
	/**
	 * The cached value of the '{@link #getContainedType() <em>Contained Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> containedType;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The default value of the '{@link #getIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ORDERED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected Boolean isOrdered = IS_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UPPER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected Integer upper = UPPER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected Integer lower = LOWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_UNIQUE_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnique()
	 * @generated
	 * @ordered
	 */
	protected Boolean isUnique = IS_UNIQUE_EDEFAULT;

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
		return StructurePackage.eINSTANCE.getProperty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getContainedType() {
		if (containedType == null) {
			containedType = new EObjectContainmentWithInverseEList.Resolving<Type>(
					Type.class, this,
					StructurePackage.PROPERTY__CONTAINED_TYPE,
					StructurePackage.TYPE__TYPE_CONTAINER);
		}
		return containedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (Type) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StructurePackage.PROPERTY__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.PROPERTY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsOrdered() {
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(Boolean newIsOrdered) {
		Boolean oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.PROPERTY__IS_ORDERED, oldIsOrdered,
					isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(Integer newUpper) {
		Integer oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.PROPERTY__UPPER, oldUpper, upper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(Integer newLower) {
		Integer oldLower = lower;
		lower = newLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.PROPERTY__LOWER, oldLower, lower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(Boolean newIsUnique) {
		Boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.PROPERTY__IS_UNIQUE, oldIsUnique, isUnique));
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

		java.lang.Boolean idIfCond_214 = false;
		idIfCond_214 = this.getIsDerived();

		if (idIfCond_214) {

			java.lang.Boolean idIfCond_215 = false;
			idIfCond_215 = kermeta.standard.helper.BooleanWrapper
					.and(
							kermeta.standard.helper.BooleanWrapper.not(this
									.getIsReadOnly()),
							kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(this
													.getSetterBody())));

			if (idIfCond_215) {

				javaCode = this.getSetterBody().createBehaviorJava(context);

				ecore.EOperation setterEOp = ((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("ecore.EOperation"));

				setterEOp.setName(this.printSetAccessor(context));

				setterEOp.setOrdered(this.getEcoreModelElement().isOrdered());

				setterEOp.setUnique(this.getEcoreModelElement().isUnique());

				ecore.EParameter param_setterEOp = ((ecore.EParameter) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("ecore.EParameter"));

				param_setterEOp.setName("value");

				((kermeta.language.structure.LinkSetterForTypedElement) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("kermeta.language.structure.LinkSetterForTypedElement"))
						.setLinks(this, param_setterEOp, context);

				org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<ecore.EParameter> convertAsOrderedSet(
								setterEOp.getEParameters())
						.add(param_setterEOp);

				((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("km2ecore.helper.ecore.EAnnotationHelper"))
						.addAnnotationGenModelImpl(setterEOp, javaCode);

				org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<ecore.EOperation> convertAsOrderedSet(
								((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.containerSwitcher(this),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition")))
										.getEcoreModelElement()
										.getEOperations()).add(setterEOp);
			}

			javaCode = "";

			java.lang.String type_label = "";

			java.lang.Boolean idIfCond_216 = false;
			idIfCond_216 = context.getFtSuffixActivation();

			if (idIfCond_216) {

				type_label = context.getFtReturnType();

				context.setFtReturnType("");
			} else {

				type_label = ((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("km2ecore.helper.kermeta.CompilerHelperJava"))
						.ppTypeFromMultiplicityElement(this, context);
			}

			java.lang.Boolean idIfCond_217 = false;
			idIfCond_217 = kermeta.standard.helper.BooleanWrapper
					.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.language.structure.Operation"))
							.isVoidType(type_label));

			if (idIfCond_217) {

				javaCode = kermeta.standard.helper.StringWrapper
						.plus(
								kermeta.standard.helper.StringWrapper
										.plus(
												kermeta.standard.helper.StringWrapper
														.plus(
																kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								javaCode,
																								"\n"),
																				type_label),
																" result"),
												context.printFtSuffix()),
								" = null;\n");
			}

			java.lang.Boolean idIfCond_218 = false;
			idIfCond_218 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(this.getGetterBody()));

			if (idIfCond_218) {

				javaCode = kermeta.standard.helper.StringWrapper.plus(javaCode,
						this.getGetterBody().createBehaviorJava(context));
			}

			javaCode = kermeta.standard.helper.StringWrapper.plus(javaCode,
					this.ppReturnResult(context));

			ecore.EOperation getterEOp = ((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("ecore.EOperation"));

			getterEOp.setName(this.printGetAccessor(context));

			getterEOp
					.setUpperBound(this.getEcoreModelElement().getUpperBound());

			getterEOp.setOrdered(this.getEcoreModelElement().isOrdered());

			getterEOp.setUnique(this.getEcoreModelElement().isUnique());

			((kermeta.language.structure.LinkSetterForTypedElement) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("kermeta.language.structure.LinkSetterForTypedElement"))
					.setLinks(this, getterEOp, context);

			((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("km2ecore.helper.ecore.EAnnotationHelper"))
					.addAnnotationGenModelImpl(getterEOp, javaCode);

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EOperation> convertAsOrderedSet(
							((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asTypeSwitcher(
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.containerSwitcher(this),
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.ClassDefinition")))
													.getEcoreModelElement(),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"ecore.EClass")))
									.getEOperations()).add(getterEOp);

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EStructuralFeature> convertAsOrderedSet(
							((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.containerSwitcher(this),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.ClassDefinition")))
									.getEcoreModelElement()
									.getEStructuralFeatures()).remove(
							this.getEcoreModelElement());

			this.setEcoreModelElement(null);
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
				.containerSwitcher(this);

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<ecore.EStructuralFeature> convertAsOrderedSet(
						c.getEcoreModelElement().getEStructuralFeatures()).add(
						ecoreStructuralFeature);

		this.setEcoreModelElement(ecoreStructuralFeature);

		//BIft:eachOwnedElement

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft90 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_219 = false;
			while (!idLoopCond_219) {
				idLoopCond_219 = it_ft90.isOff();
				if (idLoopCond_219) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp90 = it_ft90.next();

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp89 = o_lbdExp90;

					o_lbdExp89.applyPass1(context);
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
	public String printGetAccessor(KM2EcoreContext context) {

		java.lang.String result = null;

		result = "";

		java.lang.Boolean idIfCond_220 = false;
		idIfCond_220 = this.getIsDerived();

		if (idIfCond_220) {

			result = "getter";
		} else {

			java.lang.Boolean isBoolean = false;

			java.lang.Boolean idIfCond_221 = false;
			idIfCond_221 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(this.getEcoreModelElement()));

			if (idIfCond_221) {

				java.lang.Boolean idIfCond_222 = false;
				idIfCond_222 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(this.getEcoreModelElement(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance().getMetaClass(
												"ecore.EAttribute"));

				if (idIfCond_222) {

					java.lang.Boolean idIfCond_223 = false;
					idIfCond_223 = kermeta.standard.helper.StringWrapper
							.equals(this.getType()
									.getEMFEDataTypeInstanceClassName(),
									"boolean");

					if (idIfCond_223) {

						isBoolean = true;
					}

				}

			}

			java.lang.Boolean idIfCond_224 = false;
			idIfCond_224 = isBoolean;

			if (idIfCond_224) {

				result = "is";
			} else {

				result = "get";
			}

		}

		result = kermeta.standard.helper.StringWrapper.plus(result,
				kermeta.standard.helper.StringWrapper.capName(this
						.getFinalName(context)));

		return result;

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
				.asTypeSwitcher(this.getType(),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.structure.Type")));

		java.lang.Boolean idIfCond_225 = false;
		idIfCond_225 = kermeta.standard.helper.BooleanWrapper.or(
				kermeta.standard.helper.BooleanWrapper.or(current_type
						.isValueType(), current_type.isEnumeration()),
				current_type.isEDataType());

		if (idIfCond_225) {

			ecoreStructuralFeature = ((ecore.EAttribute) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("ecore.EAttribute"));
		} else {

			ecoreStructuralFeature = ((ecore.EReference) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("ecore.EReference"));

			((ecore.EReference) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(ecoreStructuralFeature,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"ecore.EReference")))
					.setContainment(this.getIsComposite());
		}

		((km2ecore.helper.ecore.EcoreModelElementHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("km2ecore.helper.ecore.EcoreModelElementHelper"))
				.setEStructuralFeatureProperties(this, ecoreStructuralFeature,
						context);

		java.lang.Boolean idIfCond_226 = false;
		idIfCond_226 = this.getIsDerived();

		if (idIfCond_226) {

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

		ecoreStructuralFeature.set_transient(this.getEMFIsTransient());

		result = ecoreStructuralFeature;

		return result;

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
	public String printSetAccessor(KM2EcoreContext context) {

		java.lang.String result = null;

		result = "";

		java.lang.Boolean idIfCond_227 = false;
		idIfCond_227 = this.getIsDerived();

		if (idIfCond_227) {

			result = "setter";
		} else {

			result = "set";
		}

		result = kermeta.standard.helper.StringWrapper.plus(result,
				kermeta.standard.helper.StringWrapper.capName(this
						.getFinalName(context)));

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

		java.lang.Boolean idIfCond_228 = false;
		idIfCond_228 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this.getOpposite()));

		if (idIfCond_228) {

			java.lang.Boolean idIfCond_229 = false;
			idIfCond_229 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(this.getOpposite()
									.getEcoreModelElement()));

			if (idIfCond_229) {

				((ecore.EReference) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(this.getEcoreModelElement(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance().getMetaClass(
												"ecore.EReference")))
						.setEOpposite(((ecore.EReference) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeSwitcher(
										this.getOpposite()
												.getEcoreModelElement(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance().getMetaClass(
														"ecore.EReference"))));
			}

		}

		java.lang.Boolean idIfCond_230 = false;
		idIfCond_230 = kermeta.standard.helper.StringWrapper.equals(this
				.getType().getTypeQName(), "kermeta::standard::Boolean");

		if (idIfCond_230) {

			java.lang.Boolean mustSetted = false;

			java.lang.Boolean idIfCond_231 = false;
			idIfCond_231 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isVoidSwitcher(this.getEcoreModelElement()
							.getDefaultValueLiteral());

			if (idIfCond_231) {

				mustSetted = true;
			} else {

				java.lang.Boolean idIfCond_232 = false;
				idIfCond_232 = kermeta.standard.helper.StringWrapper.equals(
						this.getEcoreModelElement().getDefaultValueLiteral(),
						"");

				if (idIfCond_232) {

					mustSetted = true;
				}

			}

			java.lang.Boolean idIfCond_233 = false;
			idIfCond_233 = mustSetted;

			if (idIfCond_233) {

				this.getEcoreModelElement().setDefaultValueLiteral("false");
			}

		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void applyPass2BehaviorJava(KM2EcoreContext context) {

		this.setLinks(context);

		//BIft:eachOwnedElement

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft92 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_234 = false;
			while (!idLoopCond_234) {
				idLoopCond_234 = it_ft92.isOff();
				if (idLoopCond_234) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp92 = it_ft92.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp91 = o_lbdExp92;

					p_lbdExp91.applyPass2BehaviorJava(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//EIft:eachOwnedElement

		this.createBehaviorJava(context);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecopyInValueTypes() {

		java.lang.String result = null;

		result = this.getUniqueTagValue("RecopyInValueTypes");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFinalName(KM2EcoreContext context) {

		java.lang.String result = null;

		result = ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("km2ecore.helper.java.IdentifierHelper"))
				.getMangledIdentifier(this.getName(), context);

		java.lang.Boolean idIfCond_328 = false;
		idIfCond_328 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(this.getEMFRenameAs(), "");

		if (idIfCond_328) {

			result = this.getEMFRenameAs();
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEMFRenameAs() {

		java.lang.String result = null;

		result = this.getUniqueTagValue("EMF_renameAs");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ppReturnResult(KM2EcoreContext context) {

		java.lang.String result = null;

		result = "\nreturn ";

		java.lang.Boolean idIfCond_329 = false;
		idIfCond_329 = kermeta.standard.helper.IntegerWrapper.equals(this
				.getUpper(), 1);

		if (idIfCond_329) {

			result = kermeta.standard.helper.StringWrapper.plus(result,
					"result");
		} else {

			result = kermeta.standard.helper.StringWrapper.plus(
					kermeta.standard.helper.StringWrapper.plus(result, context
							.getCOLLECTION_UTIL_CLASS()),
					".convertAsEList(result)");
		}

		result = kermeta.standard.helper.StringWrapper.plus(result, ";\n");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenModelQualifiedName() {

		java.lang.String result = null;

		result = kermeta.standard.helper.StringWrapper.plus(
				kermeta.standard.helper.StringWrapper.plus(this
						.getRootPackage().getGenModelBasePackage(), "::"), this
						.qualifiedName());

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJavaQualifiedName() {

		java.lang.String result = null;

		result = kermeta.standard.helper.StringWrapper.replace(this
				.qualifiedName(), "::", ".");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenModelJavaQualifiedName() {

		java.lang.String result = null;

		result = kermeta.standard.helper.StringWrapper.replace(this
				.getGenModelQualifiedName(), "::", ".");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String qualifiedName() {

		java.lang.String result = null;

		kermeta.language.structure.NamedElement elem = this;

		result = this.getName();

		java.lang.Boolean idIfCond_315 = false;
		idIfCond_315 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(elem),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.NamedElement"));

		if (idIfCond_315) {

			elem = (kermeta.language.structure.NamedElement) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.containerSwitcher(elem);
			java.lang.Boolean idLoopCond_316 = false;
			while (!idLoopCond_316) {
				idLoopCond_316 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equalsSwitcher(elem, null);
				if (idLoopCond_316) {
				} else {

					result = kermeta.standard.helper.StringWrapper.plus(
							kermeta.standard.helper.StringWrapper.plus(elem
									.getName(), "::"), result);

					java.lang.Boolean idIfCond_317 = false;
					idIfCond_317 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.containerSwitcher(elem),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.NamedElement"));

					if (idIfCond_317) {

						elem = (kermeta.language.structure.NamedElement) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(elem);
					} else {

						elem = null;
					}

				}
			}
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StructurePackage.PROPERTY__CONTAINED_TYPE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getContainedType())
					.basicAdd(otherEnd, msgs);
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
		case StructurePackage.PROPERTY__CONTAINED_TYPE:
			return ((InternalEList<?>) getContainedType()).basicRemove(
					otherEnd, msgs);
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
		case StructurePackage.PROPERTY__CONTAINED_TYPE:
			return getContainedType();
		case StructurePackage.PROPERTY__NAME:
			return getName();
		case StructurePackage.PROPERTY__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case StructurePackage.PROPERTY__IS_ORDERED:
			return getIsOrdered();
		case StructurePackage.PROPERTY__UPPER:
			return getUpper();
		case StructurePackage.PROPERTY__LOWER:
			return getLower();
		case StructurePackage.PROPERTY__IS_UNIQUE:
			return getIsUnique();
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
		case StructurePackage.PROPERTY__IS_SETTER_ABSTRACT:
			return getIsSetterAbstract();
		case StructurePackage.PROPERTY__IS_ID:
			return getIsID();
		case StructurePackage.PROPERTY__OWNING_CLASS:
			if (resolve)
				return getOwningClass();
			return basicGetOwningClass();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StructurePackage.PROPERTY__CONTAINED_TYPE:
			getContainedType().clear();
			getContainedType().addAll((Collection<? extends Type>) newValue);
			return;
		case StructurePackage.PROPERTY__NAME:
			setName((String) newValue);
			return;
		case StructurePackage.PROPERTY__TYPE:
			setType((Type) newValue);
			return;
		case StructurePackage.PROPERTY__IS_ORDERED:
			setIsOrdered((Boolean) newValue);
			return;
		case StructurePackage.PROPERTY__UPPER:
			setUpper((Integer) newValue);
			return;
		case StructurePackage.PROPERTY__LOWER:
			setLower((Integer) newValue);
			return;
		case StructurePackage.PROPERTY__IS_UNIQUE:
			setIsUnique((Boolean) newValue);
			return;
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
		case StructurePackage.PROPERTY__IS_SETTER_ABSTRACT:
			setIsSetterAbstract((Boolean) newValue);
			return;
		case StructurePackage.PROPERTY__IS_ID:
			setIsID((Boolean) newValue);
			return;
		case StructurePackage.PROPERTY__OWNING_CLASS:
			setOwningClass((ClassDefinition) newValue);
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
		case StructurePackage.PROPERTY__CONTAINED_TYPE:
			getContainedType().clear();
			return;
		case StructurePackage.PROPERTY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StructurePackage.PROPERTY__TYPE:
			setType((Type) null);
			return;
		case StructurePackage.PROPERTY__IS_ORDERED:
			setIsOrdered(IS_ORDERED_EDEFAULT);
			return;
		case StructurePackage.PROPERTY__UPPER:
			setUpper(UPPER_EDEFAULT);
			return;
		case StructurePackage.PROPERTY__LOWER:
			setLower(LOWER_EDEFAULT);
			return;
		case StructurePackage.PROPERTY__IS_UNIQUE:
			setIsUnique(IS_UNIQUE_EDEFAULT);
			return;
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
		case StructurePackage.PROPERTY__IS_SETTER_ABSTRACT:
			setIsSetterAbstract(IS_SETTER_ABSTRACT_EDEFAULT);
			return;
		case StructurePackage.PROPERTY__IS_ID:
			setIsID(IS_ID_EDEFAULT);
			return;
		case StructurePackage.PROPERTY__OWNING_CLASS:
			setOwningClass((ClassDefinition) null);
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
		case StructurePackage.PROPERTY__CONTAINED_TYPE:
			return containedType != null && !containedType.isEmpty();
		case StructurePackage.PROPERTY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case StructurePackage.PROPERTY__TYPE:
			return type != null;
		case StructurePackage.PROPERTY__IS_ORDERED:
			return IS_ORDERED_EDEFAULT == null ? isOrdered != null
					: !IS_ORDERED_EDEFAULT.equals(isOrdered);
		case StructurePackage.PROPERTY__UPPER:
			return UPPER_EDEFAULT == null ? upper != null : !UPPER_EDEFAULT
					.equals(upper);
		case StructurePackage.PROPERTY__LOWER:
			return LOWER_EDEFAULT == null ? lower != null : !LOWER_EDEFAULT
					.equals(lower);
		case StructurePackage.PROPERTY__IS_UNIQUE:
			return IS_UNIQUE_EDEFAULT == null ? isUnique != null
					: !IS_UNIQUE_EDEFAULT.equals(isUnique);
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
		case StructurePackage.PROPERTY__IS_SETTER_ABSTRACT:
			return IS_SETTER_ABSTRACT_EDEFAULT == null ? isSetterAbstract != null
					: !IS_SETTER_ABSTRACT_EDEFAULT.equals(isSetterAbstract);
		case StructurePackage.PROPERTY__IS_ID:
			return IS_ID_EDEFAULT == null ? isID != null : !IS_ID_EDEFAULT
					.equals(isID);
		case StructurePackage.PROPERTY__OWNING_CLASS:
			return basicGetOwningClass() != null;
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
		if (baseClass == TypeContainer.class) {
			switch (derivedFeatureID) {
			case StructurePackage.PROPERTY__CONTAINED_TYPE:
				return StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
			case StructurePackage.PROPERTY__NAME:
				return StructurePackage.NAMED_ELEMENT__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
			case StructurePackage.PROPERTY__TYPE:
				return StructurePackage.TYPED_ELEMENT__TYPE;
			default:
				return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (derivedFeatureID) {
			case StructurePackage.PROPERTY__IS_ORDERED:
				return StructurePackage.MULTIPLICITY_ELEMENT__IS_ORDERED;
			case StructurePackage.PROPERTY__UPPER:
				return StructurePackage.MULTIPLICITY_ELEMENT__UPPER;
			case StructurePackage.PROPERTY__LOWER:
				return StructurePackage.MULTIPLICITY_ELEMENT__LOWER;
			case StructurePackage.PROPERTY__IS_UNIQUE:
				return StructurePackage.MULTIPLICITY_ELEMENT__IS_UNIQUE;
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
		if (baseClass == TypeContainer.class) {
			switch (baseFeatureID) {
			case StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE:
				return StructurePackage.PROPERTY__CONTAINED_TYPE;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
			case StructurePackage.NAMED_ELEMENT__NAME:
				return StructurePackage.PROPERTY__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
			case StructurePackage.TYPED_ELEMENT__TYPE:
				return StructurePackage.PROPERTY__TYPE;
			default:
				return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (baseFeatureID) {
			case StructurePackage.MULTIPLICITY_ELEMENT__IS_ORDERED:
				return StructurePackage.PROPERTY__IS_ORDERED;
			case StructurePackage.MULTIPLICITY_ELEMENT__UPPER:
				return StructurePackage.PROPERTY__UPPER;
			case StructurePackage.MULTIPLICITY_ELEMENT__LOWER:
				return StructurePackage.PROPERTY__LOWER;
			case StructurePackage.MULTIPLICITY_ELEMENT__IS_UNIQUE:
				return StructurePackage.PROPERTY__IS_UNIQUE;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", isOrdered: ");
		result.append(isOrdered);
		result.append(", upper: ");
		result.append(upper);
		result.append(", lower: ");
		result.append(lower);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(", _default: ");
		result.append(_default);
		result.append(", isDerived: ");
		result.append(isDerived);
		result.append(", isReadOnly: ");
		result.append(isReadOnly);
		result.append(", isSetterAbstract: ");
		result.append(isSetterAbstract);
		result.append(", isID: ");
		result.append(isID);
		result.append(", isGetterAbstract: ");
		result.append(isGetterAbstract);
		result.append(", isComposite: ");
		result.append(isComposite);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
