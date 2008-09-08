/**
 * <copyright>
 * </copyright>
 *
 * $Id: EReferenceImpl.java,v 1.2 2008-09-08 19:28:31 cfaucher Exp $
 */
package ecore.impl;

import ecore.EAttribute;
import ecore.EClass;
import ecore.EReference;
import ecore.EcorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EReference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecore.impl.EReferenceImpl#getEOpposite <em>EOpposite</em>}</li>
 *   <li>{@link ecore.impl.EReferenceImpl#getEReferenceType <em>EReference Type</em>}</li>
 *   <li>{@link ecore.impl.EReferenceImpl#isResolveProxies <em>Resolve Proxies</em>}</li>
 *   <li>{@link ecore.impl.EReferenceImpl#isContainer <em>Container</em>}</li>
 *   <li>{@link ecore.impl.EReferenceImpl#getEKeys <em>EKeys</em>}</li>
 *   <li>{@link ecore.impl.EReferenceImpl#isContainment <em>Containment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EReferenceImpl extends EStructuralFeatureImpl implements
		EReference {
	/**
	 * The cached value of the '{@link #getEOpposite() <em>EOpposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEOpposite()
	 * @generated
	 * @ordered
	 */
	protected EReference eOpposite;

	/**
	 * The cached value of the '{@link #getEReferenceType() <em>EReference Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReferenceType()
	 * @generated
	 * @ordered
	 */
	protected EClass eReferenceType;

	/**
	 * The default value of the '{@link #isResolveProxies() <em>Resolve Proxies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResolveProxies()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESOLVE_PROXIES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isResolveProxies() <em>Resolve Proxies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResolveProxies()
	 * @generated
	 * @ordered
	 */
	protected boolean resolveProxies = RESOLVE_PROXIES_EDEFAULT;

	/**
	 * The default value of the '{@link #isContainer() <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTAINER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContainer() <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainer()
	 * @generated
	 * @ordered
	 */
	protected boolean container = CONTAINER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEKeys() <em>EKeys</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<EAttribute> eKeys;

	/**
	 * The default value of the '{@link #isContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTAINMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainment()
	 * @generated
	 * @ordered
	 */
	protected boolean containment = CONTAINMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected org.eclipse.emf.ecore.EClass eStaticClass() {
		return EcorePackage.Literals.EREFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEOpposite() {
		if (eOpposite != null && eOpposite.eIsProxy()) {
			InternalEObject oldEOpposite = (InternalEObject) eOpposite;
			eOpposite = (EReference) eResolveProxy(oldEOpposite);
			if (eOpposite != oldEOpposite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EcorePackage.EREFERENCE__EOPPOSITE, oldEOpposite,
							eOpposite));
			}
		}
		return eOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetEOpposite() {
		return eOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEOpposite(EReference newEOpposite) {
		EReference oldEOpposite = eOpposite;
		eOpposite = newEOpposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.EREFERENCE__EOPPOSITE, oldEOpposite, eOpposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEReferenceType() {
		if (eReferenceType != null && eReferenceType.eIsProxy()) {
			InternalEObject oldEReferenceType = (InternalEObject) eReferenceType;
			eReferenceType = (EClass) eResolveProxy(oldEReferenceType);
			if (eReferenceType != oldEReferenceType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EcorePackage.EREFERENCE__EREFERENCE_TYPE,
							oldEReferenceType, eReferenceType));
			}
		}
		return eReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetEReferenceType() {
		return eReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResolveProxies() {
		return resolveProxies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolveProxies(boolean newResolveProxies) {
		boolean oldResolveProxies = resolveProxies;
		resolveProxies = newResolveProxies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.EREFERENCE__RESOLVE_PROXIES,
					oldResolveProxies, resolveProxies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAttribute> getEKeys() {
		if (eKeys == null) {
			eKeys = new EObjectResolvingEList<EAttribute>(EAttribute.class,
					this, EcorePackage.EREFERENCE__EKEYS);
		}
		return eKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContainment() {
		return containment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainment(boolean newContainment) {
		boolean oldContainment = containment;
		containment = newContainment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.EREFERENCE__CONTAINMENT, oldContainment,
					containment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerValue(boolean booleanValue) {

		kermeta.language.structure.ClassDefinition cls = null;

		cls = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getMetaClass(this).getTypeDefinition();

		//Beginning of the Inlining of the function type: detect

		kermeta.language.structure.Property result_ft216 = null;

		kermeta.language.structure.Property elem_ft216 = null;

		result_ft216 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft216 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Property> convertAsOrderedSet(
							cls.getOwnedAttribute()).iterator();
			java.lang.Boolean idLoopCond_924 = false;
			while (!idLoopCond_924) {
				idLoopCond_924 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft216.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft216, null));
				if (idLoopCond_924) {
				} else {

					elem_ft216 = it_ft216.next();

					java.lang.Boolean idIfCond_925 = false;
					//Beginning of the Inlining of the lambda expression: detector
					kermeta.language.structure.Property p = elem_ft216;

					idIfCond_925 = kermeta.standard.helper.StringWrapper
							.equals(p.getName(), "container");
					//End of the Inlining of the lambda expression: detector

					if (idIfCond_925) {

						result_ft216 = elem_ft216;
					}

				}
			}
		}

		//End of the Inlining of the function type: detect
		org.kermeta.compil.runtime.helper.language.ObjectUtil.set(this,
				result_ft216, booleanValue);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean getContainerValue() {

		java.lang.Boolean result = null;

		kermeta.language.structure.ClassDefinition cls = null;

		cls = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getMetaClass(this).getTypeDefinition();

		//Beginning of the Inlining of the function type: detect

		kermeta.language.structure.Property result_ft217 = null;

		kermeta.language.structure.Property elem_ft217 = null;

		result_ft217 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft217 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Property> convertAsOrderedSet(
							cls.getOwnedAttribute()).iterator();
			java.lang.Boolean idLoopCond_926 = false;
			while (!idLoopCond_926) {
				idLoopCond_926 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft217.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft217, null));
				if (idLoopCond_926) {
				} else {

					elem_ft217 = it_ft217.next();

					java.lang.Boolean idIfCond_927 = false;
					//Beginning of the Inlining of the lambda expression: detector
					kermeta.language.structure.Property p = elem_ft217;

					idIfCond_927 = kermeta.standard.helper.StringWrapper
							.equals(p.getName(), "container");
					//End of the Inlining of the lambda expression: detector

					if (idIfCond_927) {

						result_ft217 = elem_ft217;
					}

				}
			}
		}

		//End of the Inlining of the function type: detect
		org.kermeta.compil.runtime.helper.language.ObjectUtil.get(this,
				result = (java.lang.Boolean) result_ft217);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcorePackage.EREFERENCE__EOPPOSITE:
			if (resolve)
				return getEOpposite();
			return basicGetEOpposite();
		case EcorePackage.EREFERENCE__EREFERENCE_TYPE:
			if (resolve)
				return getEReferenceType();
			return basicGetEReferenceType();
		case EcorePackage.EREFERENCE__RESOLVE_PROXIES:
			return isResolveProxies() ? Boolean.TRUE : Boolean.FALSE;
		case EcorePackage.EREFERENCE__CONTAINER:
			return isContainer() ? Boolean.TRUE : Boolean.FALSE;
		case EcorePackage.EREFERENCE__EKEYS:
			return getEKeys();
		case EcorePackage.EREFERENCE__CONTAINMENT:
			return isContainment() ? Boolean.TRUE : Boolean.FALSE;
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
		case EcorePackage.EREFERENCE__EOPPOSITE:
			setEOpposite((EReference) newValue);
			return;
		case EcorePackage.EREFERENCE__RESOLVE_PROXIES:
			setResolveProxies(((Boolean) newValue).booleanValue());
			return;
		case EcorePackage.EREFERENCE__EKEYS:
			getEKeys().clear();
			getEKeys().addAll((Collection<? extends EAttribute>) newValue);
			return;
		case EcorePackage.EREFERENCE__CONTAINMENT:
			setContainment(((Boolean) newValue).booleanValue());
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
		case EcorePackage.EREFERENCE__EOPPOSITE:
			setEOpposite((EReference) null);
			return;
		case EcorePackage.EREFERENCE__RESOLVE_PROXIES:
			setResolveProxies(RESOLVE_PROXIES_EDEFAULT);
			return;
		case EcorePackage.EREFERENCE__EKEYS:
			getEKeys().clear();
			return;
		case EcorePackage.EREFERENCE__CONTAINMENT:
			setContainment(CONTAINMENT_EDEFAULT);
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
		case EcorePackage.EREFERENCE__EOPPOSITE:
			return eOpposite != null;
		case EcorePackage.EREFERENCE__EREFERENCE_TYPE:
			return eReferenceType != null;
		case EcorePackage.EREFERENCE__RESOLVE_PROXIES:
			return resolveProxies != RESOLVE_PROXIES_EDEFAULT;
		case EcorePackage.EREFERENCE__CONTAINER:
			return container != CONTAINER_EDEFAULT;
		case EcorePackage.EREFERENCE__EKEYS:
			return eKeys != null && !eKeys.isEmpty();
		case EcorePackage.EREFERENCE__CONTAINMENT:
			return containment != CONTAINMENT_EDEFAULT;
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
		result.append(" (resolveProxies: ");
		result.append(resolveProxies);
		result.append(", container: ");
		result.append(container);
		result.append(", containment: ");
		result.append(containment);
		result.append(')');
		return result.toString();
	}

} //EReferenceImpl
