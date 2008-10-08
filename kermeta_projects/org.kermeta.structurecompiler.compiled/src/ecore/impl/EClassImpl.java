/**
 * <copyright>
 * </copyright>
 *
 * $Id: EClassImpl.java,v 1.5 2008-10-08 14:37:31 cfaucher Exp $
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
 *   <li>{@link ecore.impl.EClassImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#getEStructuralFeatures <em>EStructural Features</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#getEOperations <em>EOperations</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#isInterface <em>Interface</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#getESuperTypes <em>ESuper Types</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#getEGenericSuperTypes <em>EGeneric Super Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EClassImpl extends EClassifierImpl implements EClass {
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
	 * The cached value of the '{@link #getEStructuralFeatures() <em>EStructural Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEStructuralFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<EStructuralFeature> eStructuralFeatures;

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
	 * The cached value of the '{@link #getESuperTypes() <em>ESuper Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> eSuperTypes;

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

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSuperTypeOf(EClass someClass) {
		java.lang.Boolean result = null;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFeatureCount() {
		java.lang.Integer result = null;

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
	public EList<EAttribute> getterEAllAttributes() {

		kermeta.standard.OrderedSet<ecore.EAttribute> result = null;

		return org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.convertAsEList(result);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EReference> getterEReferences() {

		kermeta.standard.OrderedSet<ecore.EReference> result = null;

		return org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.convertAsEList(result);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EReference> getterEAllReferences() {

		kermeta.standard.OrderedSet<ecore.EReference> result = null;

		return org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.convertAsEList(result);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EReference> getterEAllContainments() {

		kermeta.standard.OrderedSet<ecore.EReference> result = null;

		return org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.convertAsEList(result);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EGenericType> getterEAllGenericSuperTypes() {

		kermeta.standard.OrderedSet<ecore.EGenericType> result = null;

		return org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.convertAsEList(result);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAttribute> getterEAttributes() {

		kermeta.standard.OrderedSet<ecore.EAttribute> result = null;

		return org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.convertAsEList(result);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getterEIDAttribute() {

		ecore.EAttribute result = null;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EOperation> getterEAllOperations() {

		kermeta.standard.OrderedSet<ecore.EOperation> result = null;

		return org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.convertAsEList(result);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EStructuralFeature> getterEAllStructuralFeatures() {

		kermeta.standard.OrderedSet<ecore.EStructuralFeature> result = null;

		return org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.convertAsEList(result);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getterEAllSuperTypes() {

		kermeta.standard.OrderedSet<ecore.EClass> result = null;

		return org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.convertAsEList(result);

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
		case EcorePackage.ECLASS__ABSTRACT:
			return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
		case EcorePackage.ECLASS__ESTRUCTURAL_FEATURES:
			return getEStructuralFeatures();
		case EcorePackage.ECLASS__EOPERATIONS:
			return getEOperations();
		case EcorePackage.ECLASS__INTERFACE:
			return isInterface() ? Boolean.TRUE : Boolean.FALSE;
		case EcorePackage.ECLASS__ESUPER_TYPES:
			return getESuperTypes();
		case EcorePackage.ECLASS__EGENERIC_SUPER_TYPES:
			return getEGenericSuperTypes();
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
		case EcorePackage.ECLASS__ABSTRACT:
			setAbstract(((Boolean) newValue).booleanValue());
			return;
		case EcorePackage.ECLASS__ESTRUCTURAL_FEATURES:
			getEStructuralFeatures().clear();
			getEStructuralFeatures().addAll(
					(Collection<? extends EStructuralFeature>) newValue);
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
		case EcorePackage.ECLASS__ABSTRACT:
			setAbstract(ABSTRACT_EDEFAULT);
			return;
		case EcorePackage.ECLASS__ESTRUCTURAL_FEATURES:
			getEStructuralFeatures().clear();
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
		case EcorePackage.ECLASS__ABSTRACT:
			return abstract_ != ABSTRACT_EDEFAULT;
		case EcorePackage.ECLASS__ESTRUCTURAL_FEATURES:
			return eStructuralFeatures != null
					&& !eStructuralFeatures.isEmpty();
		case EcorePackage.ECLASS__EOPERATIONS:
			return eOperations != null && !eOperations.isEmpty();
		case EcorePackage.ECLASS__INTERFACE:
			return interface_ != INTERFACE_EDEFAULT;
		case EcorePackage.ECLASS__ESUPER_TYPES:
			return eSuperTypes != null && !eSuperTypes.isEmpty();
		case EcorePackage.ECLASS__EGENERIC_SUPER_TYPES:
			return eGenericSuperTypes != null && !eGenericSuperTypes.isEmpty();
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
