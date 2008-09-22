/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConstraintImpl.java,v 1.3 2008-09-22 14:47:36 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import ecore.EAnnotation;

import kermeta.language.behavior.Expression;

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.Constraint;
import kermeta.language.structure.ConstraintLanguage;
import kermeta.language.structure.ConstraintType;
import kermeta.language.structure.NamedElement;
import kermeta.language.structure.Operation;
import kermeta.language.structure.StructurePackage;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.ConstraintImpl#getName <em>Name</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ConstraintImpl#getBody <em>Body</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ConstraintImpl#getPreOwner <em>Pre Owner</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ConstraintImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ConstraintImpl#getPostOwner <em>Post Owner</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ConstraintImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ConstraintImpl#getInvOwner <em>Inv Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintImpl extends TraceabilityImpl<EAnnotation> implements
		Constraint {
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
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected Expression body;

	/**
	 * The default value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
	protected static final ConstraintType STEREOTYPE_EDEFAULT = ConstraintType.INV;

	/**
	 * The cached value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
	protected ConstraintType stereotype = STEREOTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final ConstraintLanguage LANGUAGE_EDEFAULT = ConstraintLanguage.KERMETA;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected ConstraintLanguage language = LANGUAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.CONSTRAINT;
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
					StructurePackage.CONSTRAINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getBody() {
		if (body != null && body.eIsProxy()) {
			InternalEObject oldBody = (InternalEObject) body;
			body = (Expression) eResolveProxy(oldBody);
			if (body != oldBody) {
				InternalEObject newBody = (InternalEObject) body;
				NotificationChain msgs = oldBody
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- StructurePackage.CONSTRAINT__BODY, null, null);
				if (newBody.eInternalContainer() == null) {
					msgs = newBody.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- StructurePackage.CONSTRAINT__BODY, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StructurePackage.CONSTRAINT__BODY, oldBody, body));
			}
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Expression newBody,
			NotificationChain msgs) {
		Expression oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, StructurePackage.CONSTRAINT__BODY,
					oldBody, newBody);
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
	public void setBody(Expression newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject) body)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- StructurePackage.CONSTRAINT__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject) newBody)
						.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
								- StructurePackage.CONSTRAINT__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.CONSTRAINT__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getPreOwner() {
		if (eContainerFeatureID != StructurePackage.CONSTRAINT__PRE_OWNER)
			return null;
		return (Operation) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetPreOwner() {
		if (eContainerFeatureID != StructurePackage.CONSTRAINT__PRE_OWNER)
			return null;
		return (Operation) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreOwner(Operation newPreOwner,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newPreOwner,
				StructurePackage.CONSTRAINT__PRE_OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreOwner(Operation newPreOwner) {
		if (newPreOwner != eInternalContainer()
				|| (eContainerFeatureID != StructurePackage.CONSTRAINT__PRE_OWNER && newPreOwner != null)) {
			if (EcoreUtil.isAncestor(this, newPreOwner))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPreOwner != null)
				msgs = ((InternalEObject) newPreOwner).eInverseAdd(this,
						StructurePackage.OPERATION__PRE, Operation.class, msgs);
			msgs = basicSetPreOwner(newPreOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.CONSTRAINT__PRE_OWNER, newPreOwner,
					newPreOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintType getStereotype() {
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStereotype(ConstraintType newStereotype) {
		ConstraintType oldStereotype = stereotype;
		stereotype = newStereotype == null ? STEREOTYPE_EDEFAULT
				: newStereotype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.CONSTRAINT__STEREOTYPE, oldStereotype,
					stereotype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getPostOwner() {
		if (eContainerFeatureID != StructurePackage.CONSTRAINT__POST_OWNER)
			return null;
		return (Operation) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetPostOwner() {
		if (eContainerFeatureID != StructurePackage.CONSTRAINT__POST_OWNER)
			return null;
		return (Operation) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostOwner(Operation newPostOwner,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newPostOwner,
				StructurePackage.CONSTRAINT__POST_OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostOwner(Operation newPostOwner) {
		if (newPostOwner != eInternalContainer()
				|| (eContainerFeatureID != StructurePackage.CONSTRAINT__POST_OWNER && newPostOwner != null)) {
			if (EcoreUtil.isAncestor(this, newPostOwner))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPostOwner != null)
				msgs = ((InternalEObject) newPostOwner)
						.eInverseAdd(this, StructurePackage.OPERATION__POST,
								Operation.class, msgs);
			msgs = basicSetPostOwner(newPostOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.CONSTRAINT__POST_OWNER, newPostOwner,
					newPostOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintLanguage getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(ConstraintLanguage newLanguage) {
		ConstraintLanguage oldLanguage = language;
		language = newLanguage == null ? LANGUAGE_EDEFAULT : newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.CONSTRAINT__LANGUAGE, oldLanguage,
					language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinition getInvOwner() {
		if (eContainerFeatureID != StructurePackage.CONSTRAINT__INV_OWNER)
			return null;
		return (ClassDefinition) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinition basicGetInvOwner() {
		if (eContainerFeatureID != StructurePackage.CONSTRAINT__INV_OWNER)
			return null;
		return (ClassDefinition) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvOwner(ClassDefinition newInvOwner,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newInvOwner,
				StructurePackage.CONSTRAINT__INV_OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvOwner(ClassDefinition newInvOwner) {
		if (newInvOwner != eInternalContainer()
				|| (eContainerFeatureID != StructurePackage.CONSTRAINT__INV_OWNER && newInvOwner != null)) {
			if (EcoreUtil.isAncestor(this, newInvOwner))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInvOwner != null)
				msgs = ((InternalEObject) newInvOwner).eInverseAdd(this,
						StructurePackage.CLASS_DEFINITION__INV,
						ClassDefinition.class, msgs);
			msgs = basicSetInvOwner(newInvOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.CONSTRAINT__INV_OWNER, newInvOwner,
					newInvOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void applyPass1(KM2EcoreContext context) {

		ecore.EAnnotation ecoreAnnotation = this
				.createEcoreModelElement(context);

		kermeta.language.structure.Object c = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.container(this);

		kermeta.language.structure.Property p = c
				.getPropertyValue("ecoreModelElement");

		java.lang.Boolean idIfCond_723 = false;
		idIfCond_723 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(p, null);

		if (idIfCond_723) {

			ecore.EModelElement ecoreModelElement = ((ecore.EModelElement) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asType(
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.get(c, p),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"ecore.EModelElement")));

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EAnnotation> convertAsOrderedSet(
							ecoreModelElement.getEAnnotations()).add(
							ecoreAnnotation);
		}

		this.setEcoreModelElement(ecoreAnnotation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation createEcoreModelElement(KM2EcoreContext context) {

		ecore.EAnnotation result = null;

		java.lang.String body = "";

		java.lang.Boolean idIfCond_724 = false;
		idIfCond_724 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.container(this),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.ClassDefinition"));

		if (idIfCond_724) {

			result = ((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("km2ecore.helper.ecore.EAnnotationHelper"))
					.create("kermeta.inv", this.getName(), body);
		} else {

			java.lang.Boolean idIfCond_725 = false;
			idIfCond_725 = ((km2ecore.helper.kermeta.ConstraintHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("km2ecore.helper.kermeta.ConstraintHelper"))
					.isPre(this);

			if (idIfCond_725) {

				result = ((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("km2ecore.helper.ecore.EAnnotationHelper"))
						.create("kermeta.pre", this.getName(), body);
			} else {

				result = ((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("km2ecore.helper.ecore.EAnnotationHelper"))
						.create("kermeta.post", this.getName(), body);
			}

		}

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

		java.lang.Boolean idIfCond_676 = false;
		idIfCond_676 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.container(elem),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.NamedElement"));

		if (idIfCond_676) {

			elem = (kermeta.language.structure.NamedElement) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.container(elem);
			java.lang.Boolean idLoopCond_677 = false;
			while (!idLoopCond_677) {
				idLoopCond_677 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equals(elem, null);
				if (idLoopCond_677) {
				} else {

					result = kermeta.standard.helper.StringWrapper.plus(
							kermeta.standard.helper.StringWrapper.plus(elem
									.getName(), "::"), result);

					java.lang.Boolean idIfCond_678 = false;
					idIfCond_678 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.container(elem),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.NamedElement"));

					if (idIfCond_678) {

						elem = (kermeta.language.structure.NamedElement) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.container(elem);
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StructurePackage.CONSTRAINT__PRE_OWNER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetPreOwner((Operation) otherEnd, msgs);
		case StructurePackage.CONSTRAINT__POST_OWNER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetPostOwner((Operation) otherEnd, msgs);
		case StructurePackage.CONSTRAINT__INV_OWNER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetInvOwner((ClassDefinition) otherEnd, msgs);
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
		case StructurePackage.CONSTRAINT__BODY:
			return basicSetBody(null, msgs);
		case StructurePackage.CONSTRAINT__PRE_OWNER:
			return basicSetPreOwner(null, msgs);
		case StructurePackage.CONSTRAINT__POST_OWNER:
			return basicSetPostOwner(null, msgs);
		case StructurePackage.CONSTRAINT__INV_OWNER:
			return basicSetInvOwner(null, msgs);
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
		case StructurePackage.CONSTRAINT__PRE_OWNER:
			return eInternalContainer().eInverseRemove(this,
					StructurePackage.OPERATION__PRE, Operation.class, msgs);
		case StructurePackage.CONSTRAINT__POST_OWNER:
			return eInternalContainer().eInverseRemove(this,
					StructurePackage.OPERATION__POST, Operation.class, msgs);
		case StructurePackage.CONSTRAINT__INV_OWNER:
			return eInternalContainer().eInverseRemove(this,
					StructurePackage.CLASS_DEFINITION__INV,
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
		case StructurePackage.CONSTRAINT__NAME:
			return getName();
		case StructurePackage.CONSTRAINT__BODY:
			if (resolve)
				return getBody();
			return basicGetBody();
		case StructurePackage.CONSTRAINT__PRE_OWNER:
			if (resolve)
				return getPreOwner();
			return basicGetPreOwner();
		case StructurePackage.CONSTRAINT__STEREOTYPE:
			return getStereotype();
		case StructurePackage.CONSTRAINT__POST_OWNER:
			if (resolve)
				return getPostOwner();
			return basicGetPostOwner();
		case StructurePackage.CONSTRAINT__LANGUAGE:
			return getLanguage();
		case StructurePackage.CONSTRAINT__INV_OWNER:
			if (resolve)
				return getInvOwner();
			return basicGetInvOwner();
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
		case StructurePackage.CONSTRAINT__NAME:
			setName((String) newValue);
			return;
		case StructurePackage.CONSTRAINT__BODY:
			setBody((Expression) newValue);
			return;
		case StructurePackage.CONSTRAINT__PRE_OWNER:
			setPreOwner((Operation) newValue);
			return;
		case StructurePackage.CONSTRAINT__STEREOTYPE:
			setStereotype((ConstraintType) newValue);
			return;
		case StructurePackage.CONSTRAINT__POST_OWNER:
			setPostOwner((Operation) newValue);
			return;
		case StructurePackage.CONSTRAINT__LANGUAGE:
			setLanguage((ConstraintLanguage) newValue);
			return;
		case StructurePackage.CONSTRAINT__INV_OWNER:
			setInvOwner((ClassDefinition) newValue);
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
		case StructurePackage.CONSTRAINT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StructurePackage.CONSTRAINT__BODY:
			setBody((Expression) null);
			return;
		case StructurePackage.CONSTRAINT__PRE_OWNER:
			setPreOwner((Operation) null);
			return;
		case StructurePackage.CONSTRAINT__STEREOTYPE:
			setStereotype(STEREOTYPE_EDEFAULT);
			return;
		case StructurePackage.CONSTRAINT__POST_OWNER:
			setPostOwner((Operation) null);
			return;
		case StructurePackage.CONSTRAINT__LANGUAGE:
			setLanguage(LANGUAGE_EDEFAULT);
			return;
		case StructurePackage.CONSTRAINT__INV_OWNER:
			setInvOwner((ClassDefinition) null);
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
		case StructurePackage.CONSTRAINT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case StructurePackage.CONSTRAINT__BODY:
			return body != null;
		case StructurePackage.CONSTRAINT__PRE_OWNER:
			return basicGetPreOwner() != null;
		case StructurePackage.CONSTRAINT__STEREOTYPE:
			return stereotype != STEREOTYPE_EDEFAULT;
		case StructurePackage.CONSTRAINT__POST_OWNER:
			return basicGetPostOwner() != null;
		case StructurePackage.CONSTRAINT__LANGUAGE:
			return language != LANGUAGE_EDEFAULT;
		case StructurePackage.CONSTRAINT__INV_OWNER:
			return basicGetInvOwner() != null;
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
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
			case StructurePackage.CONSTRAINT__NAME:
				return StructurePackage.NAMED_ELEMENT__NAME;
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
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
			case StructurePackage.NAMED_ELEMENT__NAME:
				return StructurePackage.CONSTRAINT__NAME;
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
		result.append(", stereotype: ");
		result.append(stereotype);
		result.append(", language: ");
		result.append(language);
		result.append(')');
		return result.toString();
	}

} //ConstraintImpl
