/**
 * <copyright>
 * </copyright>
 *
 * $Id: EClassImpl.java,v 1.2 2008-09-08 19:28:31 cfaucher Exp $
 */
package ecore.impl;

import ecore.EAttribute;
import ecore.EClass;
import ecore.EGenericType;
import ecore.EOperation;
import ecore.EReference;
import ecore.EStructuralFeature;
import ecore.EcorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecore.impl.EClassImpl#getEStructuralFeatures <em>EStructural Features</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#getEOperations <em>EOperations</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#getEAllAttributes <em>EAll Attributes</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#isInterface <em>Interface</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#getEReferences <em>EReferences</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#getEAllReferences <em>EAll References</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#getESuperTypes <em>ESuper Types</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#getEAllContainments <em>EAll Containments</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#getEGenericSuperTypes <em>EGeneric Super Types</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#getEAllGenericSuperTypes <em>EAll Generic Super Types</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#getEAttributes <em>EAttributes</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#getEIDAttribute <em>EID Attribute</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#getEAllStructuralFeatures <em>EAll Structural Features</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#getEAllOperations <em>EAll Operations</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#getEAllSuperTypes <em>EAll Super Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EClassImpl extends EClassifierImpl implements EClass {
	/**
	 * The cached value of the '{@link #getEStructuralFeatures() <em>EStructural Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEStructuralFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<EStructuralFeature> eStructuralFeatures;

	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEOperations() <em>EOperations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<EOperation> eOperations;

	/**
	 * The cached value of the '{@link #getEAllAttributes() <em>EAll Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAllAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<EAttribute> eAllAttributes;

	/**
	 * The default value of the '{@link #isInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterface()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERFACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterface()
	 * @generated
	 * @ordered
	 */
	protected boolean interface_ = INTERFACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEReferences() <em>EReferences</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<EReference> eReferences;

	/**
	 * The cached value of the '{@link #getEAllReferences() <em>EAll References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAllReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<EReference> eAllReferences;

	/**
	 * The cached value of the '{@link #getESuperTypes() <em>ESuper Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> eSuperTypes;

	/**
	 * The cached value of the '{@link #getEAllContainments() <em>EAll Containments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAllContainments()
	 * @generated
	 * @ordered
	 */
	protected EList<EReference> eAllContainments;

	/**
	 * The cached value of the '{@link #getEGenericSuperTypes() <em>EGeneric Super Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEGenericSuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EGenericType> eGenericSuperTypes;

	/**
	 * The cached value of the '{@link #getEAllGenericSuperTypes() <em>EAll Generic Super Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAllGenericSuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EGenericType> eAllGenericSuperTypes;

	/**
	 * The cached value of the '{@link #getEAttributes() <em>EAttributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<EAttribute> eAttributes;

	/**
	 * The cached value of the '{@link #getEIDAttribute() <em>EID Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEIDAttribute()
	 * @generated
	 * @ordered
	 */
	protected EAttribute eIDAttribute;

	/**
	 * The cached value of the '{@link #getEAllStructuralFeatures() <em>EAll Structural Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAllStructuralFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<EStructuralFeature> eAllStructuralFeatures;

	/**
	 * The cached value of the '{@link #getEAllOperations() <em>EAll Operations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAllOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<EOperation> eAllOperations;

	/**
	 * The cached value of the '{@link #getEAllSuperTypes() <em>EAll Super Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAllSuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> eAllSuperTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected org.eclipse.emf.ecore.EClass eStaticClass() {
		return EcorePackage.Literals.ECLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EStructuralFeature> getEStructuralFeatures() {
		if (eStructuralFeatures == null) {
			eStructuralFeatures = new EObjectContainmentWithInverseEList.Resolving<EStructuralFeature>(
					EStructuralFeature.class, this,
					EcorePackage.ECLASS__ESTRUCTURAL_FEATURES,
					EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS);
		}
		return eStructuralFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.ECLASS__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EOperation> getEOperations() {
		if (eOperations == null) {
			eOperations = new EObjectContainmentWithInverseEList.Resolving<EOperation>(
					EOperation.class, this, EcorePackage.ECLASS__EOPERATIONS,
					EcorePackage.EOPERATION__ECONTAINING_CLASS);
		}
		return eOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAttribute> getEAllAttributes() {
		if (eAllAttributes == null) {
			eAllAttributes = new EObjectResolvingEList<EAttribute>(
					EAttribute.class, this,
					EcorePackage.ECLASS__EALL_ATTRIBUTES);
		}
		return eAllAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(boolean newInterface) {
		boolean oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.ECLASS__INTERFACE, oldInterface, interface_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EReference> getEReferences() {
		if (eReferences == null) {
			eReferences = new EObjectResolvingEList<EReference>(
					EReference.class, this, EcorePackage.ECLASS__EREFERENCES);
		}
		return eReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EReference> getEAllReferences() {
		if (eAllReferences == null) {
			eAllReferences = new EObjectResolvingEList<EReference>(
					EReference.class, this,
					EcorePackage.ECLASS__EALL_REFERENCES);
		}
		return eAllReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getESuperTypes() {
		if (eSuperTypes == null) {
			eSuperTypes = new EObjectResolvingEList<EClass>(EClass.class, this,
					EcorePackage.ECLASS__ESUPER_TYPES);
		}
		return eSuperTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EReference> getEAllContainments() {
		if (eAllContainments == null) {
			eAllContainments = new EObjectResolvingEList<EReference>(
					EReference.class, this,
					EcorePackage.ECLASS__EALL_CONTAINMENTS);
		}
		return eAllContainments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EGenericType> getEGenericSuperTypes() {
		if (eGenericSuperTypes == null) {
			eGenericSuperTypes = new EObjectContainmentEList.Resolving<EGenericType>(
					EGenericType.class, this,
					EcorePackage.ECLASS__EGENERIC_SUPER_TYPES);
		}
		return eGenericSuperTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EGenericType> getEAllGenericSuperTypes() {
		if (eAllGenericSuperTypes == null) {
			eAllGenericSuperTypes = new EObjectResolvingEList<EGenericType>(
					EGenericType.class, this,
					EcorePackage.ECLASS__EALL_GENERIC_SUPER_TYPES);
		}
		return eAllGenericSuperTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAttribute> getEAttributes() {
		if (eAttributes == null) {
			eAttributes = new EObjectResolvingEList<EAttribute>(
					EAttribute.class, this, EcorePackage.ECLASS__EATTRIBUTES);
		}
		return eAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEIDAttribute() {
		if (eIDAttribute != null && eIDAttribute.eIsProxy()) {
			InternalEObject oldEIDAttribute = (InternalEObject) eIDAttribute;
			eIDAttribute = (EAttribute) eResolveProxy(oldEIDAttribute);
			if (eIDAttribute != oldEIDAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EcorePackage.ECLASS__EID_ATTRIBUTE,
							oldEIDAttribute, eIDAttribute));
			}
		}
		return eIDAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetEIDAttribute() {
		return eIDAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EStructuralFeature> getEAllStructuralFeatures() {
		if (eAllStructuralFeatures == null) {
			eAllStructuralFeatures = new EObjectResolvingEList<EStructuralFeature>(
					EStructuralFeature.class, this,
					EcorePackage.ECLASS__EALL_STRUCTURAL_FEATURES);
		}
		return eAllStructuralFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EOperation> getEAllOperations() {
		if (eAllOperations == null) {
			eAllOperations = new EObjectResolvingEList<EOperation>(
					EOperation.class, this,
					EcorePackage.ECLASS__EALL_OPERATIONS);
		}
		return eAllOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getEAllSuperTypes() {
		if (eAllSuperTypes == null) {
			eAllSuperTypes = new EObjectResolvingEList<EClass>(EClass.class,
					this, EcorePackage.ECLASS__EALL_SUPER_TYPES);
		}
		return eAllSuperTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getEStructuralFeature(String featureName) {
		ecore.EStructuralFeature result = null;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFeatureID(EStructuralFeature feature) {

		java.lang.Integer result = null;

		result = kermeta.standard.helper.IntegerWrapper.uminus(1);

		{

			java.lang.Integer i = 0;
			java.lang.Boolean idLoopCond_910 = false;
			while (!idLoopCond_910) {
				idLoopCond_910 = kermeta.standard.helper.BooleanWrapper
						.or(
								kermeta.standard.helper.IntegerWrapper
										.equals(
												i,
												org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
														.<ecore.EStructuralFeature> convertAsOrderedSet(
																this
																		.getEAllStructuralFeatures())
														.size()),
								org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isNotEqual(
												result,
												kermeta.standard.helper.IntegerWrapper
														.uminus(1)));
				if (idLoopCond_910) {
				} else {

					java.lang.Boolean idIfCond_911 = false;
					idIfCond_911 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equals(
									feature,
									org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
											.<ecore.EStructuralFeature> convertAsOrderedSet(
													this
															.getEAllStructuralFeatures())
											.elementAt(i));

					if (idIfCond_911) {

						kermeta.standard.helper.IntegerWrapper
								.equals(result, i);
					}

					i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
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
	public boolean isSuperTypeOf(EClass someClass) {

		java.lang.Boolean result = null;

		//Beginning of the Inlining of the function type: detect

		ecore.EClass result_ft211 = null;

		ecore.EClass elem_ft211 = null;

		result_ft211 = null;

		{

			kermeta.standard.Iterator<ecore.EClass> it_ft211 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EClass> convertAsOrderedSet(
							someClass.getEAllSuperTypes()).iterator();
			java.lang.Boolean idLoopCond_912 = false;
			while (!idLoopCond_912) {
				idLoopCond_912 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft211.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft211, null));
				if (idLoopCond_912) {
				} else {

					elem_ft211 = it_ft211.next();

					java.lang.Boolean idIfCond_913 = false;
					//Beginning of the Inlining of the lambda expression: detector
					ecore.EClass t = elem_ft211;

					idIfCond_913 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equals(t, this);
					//End of the Inlining of the lambda expression: detector

					if (idIfCond_913) {

						result_ft211 = elem_ft211;
					}

				}
			}
		}

		//End of the Inlining of the function type: detect
		result = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(result_ft211, null);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFeatureCount() {

		java.lang.Integer result = null;

		result = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<ecore.EStructuralFeature> convertAsOrderedSet(
						this.getEAllStructuralFeatures()).size();

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getEStructuralFeature2(String featureName) {

		ecore.EStructuralFeature result = null;

		result = null;
		//Beginning of the Inlining of the function type: detect

		ecore.EStructuralFeature result_ft212 = null;

		ecore.EStructuralFeature elem_ft212 = null;

		result_ft212 = null;

		{

			kermeta.standard.Iterator<ecore.EStructuralFeature> it_ft212 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EStructuralFeature> convertAsOrderedSet(
							this.getEAllStructuralFeatures()).iterator();
			java.lang.Boolean idLoopCond_914 = false;
			while (!idLoopCond_914) {
				idLoopCond_914 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft212.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft212, null));
				if (idLoopCond_914) {
				} else {

					elem_ft212 = it_ft212.next();

					java.lang.Boolean idIfCond_915 = false;
					//Beginning of the Inlining of the lambda expression: detector
					ecore.EStructuralFeature e = elem_ft212;

					idIfCond_915 = kermeta.standard.helper.StringWrapper
							.equals(e.getName(), featureName);
					//End of the Inlining of the lambda expression: detector

					if (idIfCond_915) {

						result_ft212 = elem_ft212;
					}

				}
			}
		}

		//End of the Inlining of the function type: detect

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature op_getEStructuralFeature(int featureID) {
		ecore.EStructuralFeature result = null;

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
		case EcorePackage.ECLASS__ESTRUCTURAL_FEATURES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEStructuralFeatures())
					.basicAdd(otherEnd, msgs);
		case EcorePackage.ECLASS__EOPERATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEOperations())
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
		case EcorePackage.ECLASS__ESTRUCTURAL_FEATURES:
			return ((InternalEList<?>) getEStructuralFeatures()).basicRemove(
					otherEnd, msgs);
		case EcorePackage.ECLASS__EOPERATIONS:
			return ((InternalEList<?>) getEOperations()).basicRemove(otherEnd,
					msgs);
		case EcorePackage.ECLASS__EGENERIC_SUPER_TYPES:
			return ((InternalEList<?>) getEGenericSuperTypes()).basicRemove(
					otherEnd, msgs);
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
		case EcorePackage.ECLASS__ESTRUCTURAL_FEATURES:
			return getEStructuralFeatures();
		case EcorePackage.ECLASS__ABSTRACT:
			return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
		case EcorePackage.ECLASS__EOPERATIONS:
			return getEOperations();
		case EcorePackage.ECLASS__EALL_ATTRIBUTES:
			return getEAllAttributes();
		case EcorePackage.ECLASS__INTERFACE:
			return isInterface() ? Boolean.TRUE : Boolean.FALSE;
		case EcorePackage.ECLASS__EREFERENCES:
			return getEReferences();
		case EcorePackage.ECLASS__EALL_REFERENCES:
			return getEAllReferences();
		case EcorePackage.ECLASS__ESUPER_TYPES:
			return getESuperTypes();
		case EcorePackage.ECLASS__EALL_CONTAINMENTS:
			return getEAllContainments();
		case EcorePackage.ECLASS__EGENERIC_SUPER_TYPES:
			return getEGenericSuperTypes();
		case EcorePackage.ECLASS__EALL_GENERIC_SUPER_TYPES:
			return getEAllGenericSuperTypes();
		case EcorePackage.ECLASS__EATTRIBUTES:
			return getEAttributes();
		case EcorePackage.ECLASS__EID_ATTRIBUTE:
			if (resolve)
				return getEIDAttribute();
			return basicGetEIDAttribute();
		case EcorePackage.ECLASS__EALL_STRUCTURAL_FEATURES:
			return getEAllStructuralFeatures();
		case EcorePackage.ECLASS__EALL_OPERATIONS:
			return getEAllOperations();
		case EcorePackage.ECLASS__EALL_SUPER_TYPES:
			return getEAllSuperTypes();
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
		case EcorePackage.ECLASS__ESTRUCTURAL_FEATURES:
			getEStructuralFeatures().clear();
			getEStructuralFeatures().addAll(
					(Collection<? extends EStructuralFeature>) newValue);
			return;
		case EcorePackage.ECLASS__ABSTRACT:
			setAbstract(((Boolean) newValue).booleanValue());
			return;
		case EcorePackage.ECLASS__EOPERATIONS:
			getEOperations().clear();
			getEOperations()
					.addAll((Collection<? extends EOperation>) newValue);
			return;
		case EcorePackage.ECLASS__INTERFACE:
			setInterface(((Boolean) newValue).booleanValue());
			return;
		case EcorePackage.ECLASS__ESUPER_TYPES:
			getESuperTypes().clear();
			getESuperTypes().addAll((Collection<? extends EClass>) newValue);
			return;
		case EcorePackage.ECLASS__EGENERIC_SUPER_TYPES:
			getEGenericSuperTypes().clear();
			getEGenericSuperTypes().addAll(
					(Collection<? extends EGenericType>) newValue);
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
		case EcorePackage.ECLASS__ESTRUCTURAL_FEATURES:
			getEStructuralFeatures().clear();
			return;
		case EcorePackage.ECLASS__ABSTRACT:
			setAbstract(ABSTRACT_EDEFAULT);
			return;
		case EcorePackage.ECLASS__EOPERATIONS:
			getEOperations().clear();
			return;
		case EcorePackage.ECLASS__INTERFACE:
			setInterface(INTERFACE_EDEFAULT);
			return;
		case EcorePackage.ECLASS__ESUPER_TYPES:
			getESuperTypes().clear();
			return;
		case EcorePackage.ECLASS__EGENERIC_SUPER_TYPES:
			getEGenericSuperTypes().clear();
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
		case EcorePackage.ECLASS__ESTRUCTURAL_FEATURES:
			return eStructuralFeatures != null
					&& !eStructuralFeatures.isEmpty();
		case EcorePackage.ECLASS__ABSTRACT:
			return abstract_ != ABSTRACT_EDEFAULT;
		case EcorePackage.ECLASS__EOPERATIONS:
			return eOperations != null && !eOperations.isEmpty();
		case EcorePackage.ECLASS__EALL_ATTRIBUTES:
			return eAllAttributes != null && !eAllAttributes.isEmpty();
		case EcorePackage.ECLASS__INTERFACE:
			return interface_ != INTERFACE_EDEFAULT;
		case EcorePackage.ECLASS__EREFERENCES:
			return eReferences != null && !eReferences.isEmpty();
		case EcorePackage.ECLASS__EALL_REFERENCES:
			return eAllReferences != null && !eAllReferences.isEmpty();
		case EcorePackage.ECLASS__ESUPER_TYPES:
			return eSuperTypes != null && !eSuperTypes.isEmpty();
		case EcorePackage.ECLASS__EALL_CONTAINMENTS:
			return eAllContainments != null && !eAllContainments.isEmpty();
		case EcorePackage.ECLASS__EGENERIC_SUPER_TYPES:
			return eGenericSuperTypes != null && !eGenericSuperTypes.isEmpty();
		case EcorePackage.ECLASS__EALL_GENERIC_SUPER_TYPES:
			return eAllGenericSuperTypes != null
					&& !eAllGenericSuperTypes.isEmpty();
		case EcorePackage.ECLASS__EATTRIBUTES:
			return eAttributes != null && !eAttributes.isEmpty();
		case EcorePackage.ECLASS__EID_ATTRIBUTE:
			return eIDAttribute != null;
		case EcorePackage.ECLASS__EALL_STRUCTURAL_FEATURES:
			return eAllStructuralFeatures != null
					&& !eAllStructuralFeatures.isEmpty();
		case EcorePackage.ECLASS__EALL_OPERATIONS:
			return eAllOperations != null && !eAllOperations.isEmpty();
		case EcorePackage.ECLASS__EALL_SUPER_TYPES:
			return eAllSuperTypes != null && !eAllSuperTypes.isEmpty();
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
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(", interface: ");
		result.append(interface_);
		result.append(')');
		return result.toString();
	}

} //EClassImpl
