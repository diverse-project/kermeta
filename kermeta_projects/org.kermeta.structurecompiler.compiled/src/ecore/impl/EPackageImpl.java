/**
 * <copyright>
 * </copyright>
 *
 * $Id: EPackageImpl.java,v 1.1 2008-09-04 15:40:23 cfaucher Exp $
 */
package ecore.impl;

import ecore.EClassifier;
import ecore.EFactory;
import ecore.EPackage;
import ecore.EcorePackage;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>EPackage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecore.impl.EPackageImpl#getNsURI <em>Ns URI</em>}</li>
 *   <li>{@link ecore.impl.EPackageImpl#getESubpackages <em>ESubpackages</em>}</li>
 *   <li>{@link ecore.impl.EPackageImpl#getESuperPackage <em>ESuper Package</em>}</li>
 *   <li>{@link ecore.impl.EPackageImpl#getNsPrefix <em>Ns Prefix</em>}</li>
 *   <li>{@link ecore.impl.EPackageImpl#getEFactoryInstance <em>EFactory Instance</em>}</li>
 *   <li>{@link ecore.impl.EPackageImpl#getEClassifiers <em>EClassifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EPackageImpl extends ENamedElementImpl implements EPackage {
	/**
	 * The default value of the '{@link #getNsURI() <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsURI()
	 * @generated
	 * @ordered
	 */
	protected static final String NS_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNsURI() <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsURI()
	 * @generated
	 * @ordered
	 */
	protected String nsURI = NS_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getESubpackages() <em>ESubpackages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESubpackages()
	 * @generated
	 * @ordered
	 */
	protected EList<EPackage> eSubpackages;

	/**
	 * The default value of the '{@link #getNsPrefix() <em>Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String NS_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNsPrefix() <em>Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsPrefix()
	 * @generated
	 * @ordered
	 */
	protected String nsPrefix = NS_PREFIX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEFactoryInstance() <em>EFactory Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEFactoryInstance()
	 * @generated
	 * @ordered
	 */
	protected EFactory eFactoryInstance;

	/**
	 * The cached value of the '{@link #getEClassifiers() <em>EClassifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<EClassifier> eClassifiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.EPACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNsURI() {
		return nsURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNsURI(String newNsURI) {
		String oldNsURI = nsURI;
		nsURI = newNsURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.EPACKAGE__NS_URI, oldNsURI, nsURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EPackage> getESubpackages() {
		if (eSubpackages == null) {
			eSubpackages = new EObjectContainmentWithInverseEList.Resolving<EPackage>(
					EPackage.class, this, EcorePackage.EPACKAGE__ESUBPACKAGES,
					EcorePackage.EPACKAGE__ESUPER_PACKAGE);
		}
		return eSubpackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getESuperPackage() {
		if (eContainerFeatureID != EcorePackage.EPACKAGE__ESUPER_PACKAGE)
			return null;
		return (EPackage) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetESuperPackage() {
		if (eContainerFeatureID != EcorePackage.EPACKAGE__ESUPER_PACKAGE)
			return null;
		return (EPackage) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetESuperPackage(EPackage newESuperPackage,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newESuperPackage,
				EcorePackage.EPACKAGE__ESUPER_PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setESuperPackage(EPackage newESuperPackage) {
		if (newESuperPackage != eInternalContainer()
				|| (eContainerFeatureID != EcorePackage.EPACKAGE__ESUPER_PACKAGE && newESuperPackage != null)) {
			if (EcoreUtil.isAncestor(this, newESuperPackage))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newESuperPackage != null)
				msgs = ((InternalEObject) newESuperPackage).eInverseAdd(this,
						EcorePackage.EPACKAGE__ESUBPACKAGES, EPackage.class,
						msgs);
			msgs = basicSetESuperPackage(newESuperPackage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.EPACKAGE__ESUPER_PACKAGE, newESuperPackage,
					newESuperPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNsPrefix() {
		return nsPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNsPrefix(String newNsPrefix) {
		String oldNsPrefix = nsPrefix;
		nsPrefix = newNsPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.EPACKAGE__NS_PREFIX, oldNsPrefix, nsPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFactory getEFactoryInstance() {
		if (eFactoryInstance != null && eFactoryInstance.eIsProxy()) {
			InternalEObject oldEFactoryInstance = (InternalEObject) eFactoryInstance;
			eFactoryInstance = (EFactory) eResolveProxy(oldEFactoryInstance);
			if (eFactoryInstance != oldEFactoryInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EcorePackage.EPACKAGE__EFACTORY_INSTANCE,
							oldEFactoryInstance, eFactoryInstance));
			}
		}
		return eFactoryInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFactory basicGetEFactoryInstance() {
		return eFactoryInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEFactoryInstance(
			EFactory newEFactoryInstance, NotificationChain msgs) {
		EFactory oldEFactoryInstance = eFactoryInstance;
		eFactoryInstance = newEFactoryInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, EcorePackage.EPACKAGE__EFACTORY_INSTANCE,
					oldEFactoryInstance, newEFactoryInstance);
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
	public void setEFactoryInstance(EFactory newEFactoryInstance) {
		if (newEFactoryInstance != eFactoryInstance) {
			NotificationChain msgs = null;
			if (eFactoryInstance != null)
				msgs = ((InternalEObject) eFactoryInstance).eInverseRemove(
						this, EcorePackage.EFACTORY__EPACKAGE, EFactory.class,
						msgs);
			if (newEFactoryInstance != null)
				msgs = ((InternalEObject) newEFactoryInstance).eInverseAdd(
						this, EcorePackage.EFACTORY__EPACKAGE, EFactory.class,
						msgs);
			msgs = basicSetEFactoryInstance(newEFactoryInstance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.EPACKAGE__EFACTORY_INSTANCE,
					newEFactoryInstance, newEFactoryInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClassifier> getEClassifiers() {
		if (eClassifiers == null) {
			eClassifiers = new EObjectContainmentWithInverseEList.Resolving<EClassifier>(
					EClassifier.class, this,
					EcorePackage.EPACKAGE__ECLASSIFIERS,
					EcorePackage.ECLASSIFIER__EPACKAGE);
		}
		return eClassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier getEClassifier(String name) {

		ecore.EClassifier result = null;

		//Beginning of the Inlining of the function type: select

		kermeta.standard.Sequence<ecore.EClassifier> result_ft191 = null;

		ecore.EClassifier elem_ft191 = null;

		result_ft191 = ((kermeta.standard.Sequence<ecore.EClassifier>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<ecore.EClassifier>"));

		{

			kermeta.standard.Iterator<ecore.EClassifier> it_ft191 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EClassifier> convertAsOrderedSet(
							this.getEClassifiers()).iterator();
			java.lang.Boolean idLoopCond_839 = false;
			while (!idLoopCond_839) {
				idLoopCond_839 = it_ft191.isOff();
				if (idLoopCond_839) {
				} else {

					elem_ft191 = it_ft191.next();

					java.lang.Boolean idIfCond_840 = false;
					//Beginning of the Inlining of the lambda expression: selector
					ecore.EClassifier c = elem_ft191;

					idIfCond_840 = kermeta.standard.helper.StringWrapper
							.equals(c.getName(), name);
					//End of the Inlining of the lambda expression: selector

					if (idIfCond_840) {

						result_ft191.add(elem_ft191);
					}

				}
			}
		}

		//End of the Inlining of the function type: select
		result = result_ft191.one();

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
		case EcorePackage.EPACKAGE__ESUBPACKAGES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getESubpackages())
					.basicAdd(otherEnd, msgs);
		case EcorePackage.EPACKAGE__ESUPER_PACKAGE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetESuperPackage((EPackage) otherEnd, msgs);
		case EcorePackage.EPACKAGE__EFACTORY_INSTANCE:
			if (eFactoryInstance != null)
				msgs = ((InternalEObject) eFactoryInstance).eInverseRemove(
						this, EcorePackage.EFACTORY__EPACKAGE, EFactory.class,
						msgs);
			return basicSetEFactoryInstance((EFactory) otherEnd, msgs);
		case EcorePackage.EPACKAGE__ECLASSIFIERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEClassifiers())
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
		case EcorePackage.EPACKAGE__ESUBPACKAGES:
			return ((InternalEList<?>) getESubpackages()).basicRemove(otherEnd,
					msgs);
		case EcorePackage.EPACKAGE__ESUPER_PACKAGE:
			return basicSetESuperPackage(null, msgs);
		case EcorePackage.EPACKAGE__EFACTORY_INSTANCE:
			return basicSetEFactoryInstance(null, msgs);
		case EcorePackage.EPACKAGE__ECLASSIFIERS:
			return ((InternalEList<?>) getEClassifiers()).basicRemove(otherEnd,
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
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
		case EcorePackage.EPACKAGE__ESUPER_PACKAGE:
			return eInternalContainer().eInverseRemove(this,
					EcorePackage.EPACKAGE__ESUBPACKAGES, EPackage.class, msgs);
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
		case EcorePackage.EPACKAGE__NS_URI:
			return getNsURI();
		case EcorePackage.EPACKAGE__ESUBPACKAGES:
			return getESubpackages();
		case EcorePackage.EPACKAGE__ESUPER_PACKAGE:
			if (resolve)
				return getESuperPackage();
			return basicGetESuperPackage();
		case EcorePackage.EPACKAGE__NS_PREFIX:
			return getNsPrefix();
		case EcorePackage.EPACKAGE__EFACTORY_INSTANCE:
			if (resolve)
				return getEFactoryInstance();
			return basicGetEFactoryInstance();
		case EcorePackage.EPACKAGE__ECLASSIFIERS:
			return getEClassifiers();
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
		case EcorePackage.EPACKAGE__NS_URI:
			setNsURI((String) newValue);
			return;
		case EcorePackage.EPACKAGE__ESUBPACKAGES:
			getESubpackages().clear();
			getESubpackages().addAll((Collection<? extends EPackage>) newValue);
			return;
		case EcorePackage.EPACKAGE__ESUPER_PACKAGE:
			setESuperPackage((EPackage) newValue);
			return;
		case EcorePackage.EPACKAGE__NS_PREFIX:
			setNsPrefix((String) newValue);
			return;
		case EcorePackage.EPACKAGE__EFACTORY_INSTANCE:
			setEFactoryInstance((EFactory) newValue);
			return;
		case EcorePackage.EPACKAGE__ECLASSIFIERS:
			getEClassifiers().clear();
			getEClassifiers().addAll(
					(Collection<? extends EClassifier>) newValue);
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
		case EcorePackage.EPACKAGE__NS_URI:
			setNsURI(NS_URI_EDEFAULT);
			return;
		case EcorePackage.EPACKAGE__ESUBPACKAGES:
			getESubpackages().clear();
			return;
		case EcorePackage.EPACKAGE__ESUPER_PACKAGE:
			setESuperPackage((EPackage) null);
			return;
		case EcorePackage.EPACKAGE__NS_PREFIX:
			setNsPrefix(NS_PREFIX_EDEFAULT);
			return;
		case EcorePackage.EPACKAGE__EFACTORY_INSTANCE:
			setEFactoryInstance((EFactory) null);
			return;
		case EcorePackage.EPACKAGE__ECLASSIFIERS:
			getEClassifiers().clear();
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
		case EcorePackage.EPACKAGE__NS_URI:
			return NS_URI_EDEFAULT == null ? nsURI != null : !NS_URI_EDEFAULT
					.equals(nsURI);
		case EcorePackage.EPACKAGE__ESUBPACKAGES:
			return eSubpackages != null && !eSubpackages.isEmpty();
		case EcorePackage.EPACKAGE__ESUPER_PACKAGE:
			return basicGetESuperPackage() != null;
		case EcorePackage.EPACKAGE__NS_PREFIX:
			return NS_PREFIX_EDEFAULT == null ? nsPrefix != null
					: !NS_PREFIX_EDEFAULT.equals(nsPrefix);
		case EcorePackage.EPACKAGE__EFACTORY_INSTANCE:
			return eFactoryInstance != null;
		case EcorePackage.EPACKAGE__ECLASSIFIERS:
			return eClassifiers != null && !eClassifiers.isEmpty();
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
		result.append(" (nsURI: ");
		result.append(nsURI);
		result.append(", nsPrefix: ");
		result.append(nsPrefix);
		result.append(')');
		return result.toString();
	}

} //EPackageImpl
