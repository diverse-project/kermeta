/**
 * <copyright>
 * </copyright>
 *
 * $Id: ObjectImpl.java,v 1.2 2008-08-19 13:23:06 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import java.util.Collection;

import kermeta.language.structure.Property;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.Tag;
import kermeta.language.structure.Type;

import kermeta.persistence.Resource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.ObjectImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ObjectImpl#getOwnedTags <em>Owned Tags</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ObjectImpl#getOid <em>Oid</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ObjectImpl#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectImpl extends EObjectImpl implements
		kermeta.language.structure.Object {
	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tag;

	/**
	 * The cached value of the '{@link #getOwnedTags() <em>Owned Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> ownedTags;

	/**
	 * The default value of the '{@link #getOid() <em>Oid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOid()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOid() <em>Oid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOid()
	 * @generated
	 * @ordered
	 */
	protected Integer oid = OID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected kermeta.language.structure.Object container;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTag() {
		if (tag == null) {
			tag = new EObjectWithInverseResolvingEList.ManyInverse<Tag>(
					Tag.class, this, StructurePackage.OBJECT__TAG,
					StructurePackage.TAG__OBJECT);
		}
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getOwnedTags() {
		if (ownedTags == null) {
			ownedTags = new EObjectContainmentEList.Resolving<Tag>(Tag.class,
					this, StructurePackage.OBJECT__OWNED_TAGS);
		}
		return ownedTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOid() {
		return oid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOid(Integer newOid) {
		Integer oldOid = oid;
		oid = newOid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.OBJECT__OID, oldOid, oid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object getContainer() {
		if (container != null && container.eIsProxy()) {
			InternalEObject oldContainer = (InternalEObject) container;
			container = (kermeta.language.structure.Object) eResolveProxy(oldContainer);
			if (container != oldContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StructurePackage.OBJECT__CONTAINER, oldContainer,
							container));
			}
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object basicGetContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(kermeta.language.structure.Object newContainer) {
		kermeta.language.structure.Object oldContainer = container;
		container = newContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.OBJECT__CONTAINER, oldContainer, container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isSet(Property property) {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isSet(this, property);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isKindOf(kermeta.language.structure.Class cl) {

		java.lang.Boolean result = null;

		result = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getMetaClass(this).equals(
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("cl"));

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object get(Property property) {

		kermeta.language.structure.Object result = null;

		result = org.kermeta.compil.runtime.helper.language.ObjectUtil.get(
				this, property);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean equals(kermeta.language.structure.Object element) {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.equals(this, element);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Class getMetaClass() {

		kermeta.language.structure.Class result = null;

		result = (kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getMetaClass(this);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set(Property property, kermeta.language.structure.Object element) {

		java.lang.Boolean idIfCond_235 = false;
		idIfCond_235 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(element,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"property.getType()"));

		if (idIfCond_235) {

			org.kermeta.compil.runtime.helper.language.ObjectUtil.set(this,
					property, element);
		} else {

			kermeta.exceptions.IncompatibleTypeError e = ((kermeta.exceptions.IncompatibleTypeError) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("kermeta.exceptions.IncompatibleTypeError"));

			e
					.setMessage(kermeta.standard.helper.StringWrapper
							.plus(
									kermeta.standard.helper.StringWrapper
											.plus(
													kermeta.standard.helper.StringWrapper
															.plus(
																	kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									kermeta.standard.helper.StringWrapper
																											.plus(
																													"IncompatibleTypeError : Cannot set property ",
																													property
																															.getName()),
																									" of object "),
																					org.kermeta.compil.runtime.helper.language.ObjectUtil
																							.toString(this)),
																	" to "),
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.toString(element)),
									"."));

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						e);

		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isFrozen() {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isFrozen(this);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer hashcode() {

		java.lang.Integer result = null;

		result = (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.hashcode(this);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkInvariants() {

		kermeta.language.structure.ClassDefinition cd = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getMetaClass(this).getClassDefinition();

		java.lang.Boolean idIfCond_236 = false;
		idIfCond_236 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(cd));

		if (idIfCond_236) {

			//Beginning of the Inlining of the function type: each

			kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft38 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Property> convertAsSet(
							cd.getAllAttribute()).iterator();
			java.lang.Boolean idLoopCond_237 = false;
			while (!idLoopCond_237) {
				idLoopCond_237 = it_ft38.isOff();
				;
				if (idLoopCond_237) {
				} else {

					//Beginning of the Inlining of the lambda expression: func
					kermeta.language.structure.Property p = it_ft38.next();

					kermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.get(this, p);

					java.lang.Boolean idIfCond_238 = false;
					idIfCond_238 = kermeta.standard.helper.BooleanWrapper
							.and(
									kermeta.standard.helper.BooleanWrapper
											.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isVoid(v)),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isInstanceOf(
													v,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.standard.Collection<kermeta.language.structure.Object>")));

					if (idIfCond_238) {

						kermeta.standard.Collection<kermeta.language.structure.Object> c = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asType(
										v,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.standard.Collection<kermeta.language.structure.Object>")));

						java.lang.Boolean idIfCond_239 = false;
						idIfCond_239 = kermeta.standard.helper.BooleanWrapper
								.or(
										kermeta.standard.helper.IntegerWrapper
												.isLower(c.size(), p.getLower()),
										kermeta.standard.helper.BooleanWrapper
												.and(
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isNotEqual(
																		p
																				.getUpper(),
																		kermeta.standard.helper.IntegerWrapper
																				.uminus(1)),
														kermeta.standard.helper.IntegerWrapper
																.isGreater(
																		c
																				.size(),
																		p
																				.getUpper())));

						if (idIfCond_239) {

							if (true)
								throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
										((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
												.newObject("kermeta.exceptions.ConstraintViolatedInv")));

						}

					} else {

						java.lang.Boolean idIfCond_240 = false;
						idIfCond_240 = kermeta.standard.helper.BooleanWrapper
								.and(
										kermeta.standard.helper.IntegerWrapper
												.equals(p.getLower(), 1),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isVoid(v));

						if (idIfCond_240) {

							if (true)
								throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
										((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
												.newObject("kermeta.exceptions.ConstraintViolatedInv")));

						}

					}

					//End of the Inlining of the lambda expression: func

				}
			}
			//End of the Inlining of the function type: each

		}

		org.kermeta.compil.runtime.helper.language.ObjectUtil
				.checkInvariants(this);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isVoid() {

		java.lang.Boolean result = null;

		result = false;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isNotEqual(kermeta.language.structure.Object element) {

		java.lang.Boolean result = null;

		result = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equals(this, element));

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unset(Property property) {

		org.kermeta.compil.runtime.helper.language.ObjectUtil.unset(this,
				property);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer oid() {

		java.lang.Integer result = null;

		result = (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getOID(this);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object container() {

		kermeta.language.structure.Object result = null;

		result = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.container(this);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void freeze() {

		org.kermeta.compil.runtime.helper.language.ObjectUtil.freeze(this);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource containingResource() {

		kermeta.persistence.Resource result = null;

		result = (kermeta.persistence.Resource) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getContainingResource(this);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isInstanceOf(Type type) {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(this, type.getClass().getName());

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object asType(
			kermeta.language.structure.Class type) {

		kermeta.language.structure.Object result = null;

		java.lang.Boolean idIfCond_241 = false;
		idIfCond_241 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext
						.getInstance().getMetaClass("type"));

		if (idIfCond_241) {

			result = this;
		} else {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.TypeCastError) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.TypeCastError")));

		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkAllInvariants() {

		java.lang.Boolean idIfCond_242 = false;
		idIfCond_242 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(this, null);

		if (idIfCond_242) {

			org.kermeta.compil.runtime.helper.language.ObjectUtil
					.checkInvariants(this);

			kermeta.language.structure.ClassDefinition cd = null;

			cd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getMetaClass(this).getTypeDefinition();

			//Beginning of the Inlining of the function type: each

			kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft39 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Property> convertAsSet(
							cd.getAllAttribute()).iterator();
			java.lang.Boolean idLoopCond_243 = false;
			while (!idLoopCond_243) {
				idLoopCond_243 = it_ft39.isOff();
				;
				if (idLoopCond_243) {
				} else {

					//Beginning of the Inlining of the lambda expression: func
					kermeta.language.structure.Property subObj = it_ft39.next();

					java.lang.Boolean idIfCond_244 = false;
					idIfCond_244 = subObj.getIsComposite();

					if (idIfCond_244) {

						java.lang.Boolean idIfCond_245 = false;
						idIfCond_245 = kermeta.standard.helper.BooleanWrapper
								.or(
										kermeta.standard.helper.StringWrapper
												.equals(
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.getMetaClass(
																		org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.get(
																						this,
																						subObj))
																.getTypeDefinition()
																.getName(),
														"ReflectiveSequence"),
										kermeta.standard.helper.StringWrapper
												.equals(
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.getMetaClass(
																		org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.get(
																						this,
																						subObj))
																.getTypeDefinition()
																.getName(),
														"ReflectiveCollection"));

						if (idIfCond_245) {

							kermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;

							subObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.get(this, subObj);

							//Beginning of the Inlining of the function type: each

							kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft40 = subObjInstances
									.iterator();
							java.lang.Boolean idLoopCond_246 = false;
							while (!idLoopCond_246) {
								idLoopCond_246 = it_ft40.isOff();
								;
								if (idLoopCond_246) {
								} else {

									//Beginning of the Inlining of the lambda expression: func
									kermeta.language.structure.Object aSubObjInstances = it_ft40
											.next();

									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.checkAllInvariants(aSubObjInstances);
									//End of the Inlining of the lambda expression: func

								}
							}
							//End of the Inlining of the function type: each

						} else {

							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.checkAllInvariants(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.get(this, subObj));
						}

					}

					//End of the Inlining of the lambda expression: func

				}
			}
			//End of the Inlining of the function type: each

		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {

		java.lang.String result = null;

		result = kermeta.standard.helper.StringWrapper
				.plus(
						kermeta.standard.helper.StringWrapper
								.plus(
										kermeta.standard.helper.StringWrapper
												.plus(
														kermeta.standard.helper.StringWrapper
																.plus(
																		"[",
																		org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.getMetaClass(
																						this)
																				.getTypeDefinition()
																				.qualifiedName()),
														":"),
										kermeta.standard.helper.IntegerWrapper
												.toString(org.kermeta.compil.runtime.helper.language.ObjectUtil
														.oid(this))), "]");

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
		case StructurePackage.OBJECT__TAG:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTag())
					.basicAdd(otherEnd, msgs);
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
		case StructurePackage.OBJECT__TAG:
			return ((InternalEList<?>) getTag()).basicRemove(otherEnd, msgs);
		case StructurePackage.OBJECT__OWNED_TAGS:
			return ((InternalEList<?>) getOwnedTags()).basicRemove(otherEnd,
					msgs);
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
		case StructurePackage.OBJECT__TAG:
			return getTag();
		case StructurePackage.OBJECT__OWNED_TAGS:
			return getOwnedTags();
		case StructurePackage.OBJECT__OID:
			return getOid();
		case StructurePackage.OBJECT__CONTAINER:
			if (resolve)
				return getContainer();
			return basicGetContainer();
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
		case StructurePackage.OBJECT__TAG:
			getTag().clear();
			getTag().addAll((Collection<? extends Tag>) newValue);
			return;
		case StructurePackage.OBJECT__OWNED_TAGS:
			getOwnedTags().clear();
			getOwnedTags().addAll((Collection<? extends Tag>) newValue);
			return;
		case StructurePackage.OBJECT__OID:
			setOid((Integer) newValue);
			return;
		case StructurePackage.OBJECT__CONTAINER:
			setContainer((kermeta.language.structure.Object) newValue);
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
		case StructurePackage.OBJECT__TAG:
			getTag().clear();
			return;
		case StructurePackage.OBJECT__OWNED_TAGS:
			getOwnedTags().clear();
			return;
		case StructurePackage.OBJECT__OID:
			setOid(OID_EDEFAULT);
			return;
		case StructurePackage.OBJECT__CONTAINER:
			setContainer((kermeta.language.structure.Object) null);
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
		case StructurePackage.OBJECT__TAG:
			return tag != null && !tag.isEmpty();
		case StructurePackage.OBJECT__OWNED_TAGS:
			return ownedTags != null && !ownedTags.isEmpty();
		case StructurePackage.OBJECT__OID:
			return OID_EDEFAULT == null ? oid != null : !OID_EDEFAULT
					.equals(oid);
		case StructurePackage.OBJECT__CONTAINER:
			return container != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectImpl
