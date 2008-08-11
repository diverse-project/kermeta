/**
 * <copyright>
 * </copyright>
 *
 * $Id: FrameworkImpl.java,v 1.5 2008-08-11 14:19:27 edaubert Exp $
 */
package framework.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import manifest.BundleSymbolicName;
import manifest.Version;
import option.Singleton;
import option.SymbolicNameDirective;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import framework.Bundle;
import framework.Framework;
import framework.FrameworkPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Framework</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link framework.impl.FrameworkImpl#getBundles <em>Bundles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FrameworkImpl extends EObjectImpl implements Framework {
	/**
	 * The cached value of the '{@link #getBundles() <em>Bundles</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBundles()
	 * @generated
	 * @ordered
	 */
	protected EList<Bundle> bundles;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FrameworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrameworkPackage.Literals.FRAMEWORK;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bundle> getBundles() {
		if (bundles == null) {
			bundles = new EObjectContainmentEList<Bundle>(Bundle.class, this, FrameworkPackage.FRAMEWORK__BUNDLES);
		}
		return bundles;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FrameworkPackage.FRAMEWORK__BUNDLES:
				return ((InternalEList<?>)getBundles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FrameworkPackage.FRAMEWORK__BUNDLES:
				return getBundles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FrameworkPackage.FRAMEWORK__BUNDLES:
				getBundles().clear();
				getBundles().addAll((Collection<? extends Bundle>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FrameworkPackage.FRAMEWORK__BUNDLES:
				getBundles().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FrameworkPackage.FRAMEWORK__BUNDLES:
				return bundles != null && !bundles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public boolean addBundle(Bundle bundle) {
		BundleSymbolicName symbolicName = bundle.getManifest()
				.getBundleSymbolicName();
		if (symbolicName != null) {
			for (SymbolicNameDirective directive : symbolicName.getDirectives()) {
				if (directive instanceof Singleton) {
					if (((Singleton) directive).isSingleton()) {
						if (this.bundleIsSingleton(bundle.getManifest()
								.getBundleSymbolicName().getSymbolicName())) {
							return getBundles().add(bundle);
						}
					}
				}
			}
			// Attention gérer l'unicité du couple BundleVersion, BundleSymbolicName
			// TODO Modifier FrameworkTest#testAddBundle en conséquence
			Version version = bundle.getManifest().getBundleVersion().getVersion();
			Bundle tmp = this.findBundle(symbolicName.getSymbolicName(), version);
			if (tmp == null) {
				return getBundles().add(bundle);
			}
		}
		return false;
	}

	private boolean bundleIsSingleton(String symbolicName) {
		for (Bundle bundle : getBundles()) {
			BundleSymbolicName symbolicNametmp = bundle.getManifest()
					.getBundleSymbolicName();
			if (symbolicNametmp != null) {
				if (symbolicNametmp.getSymbolicName().equals(symbolicName)) {
					return false;
				}
			}
		}
		return true;
	}

	public List<Bundle> findBundles(String symbolicName) {
		List<Bundle> bundles = new ArrayList<Bundle>();
		for (Bundle bundle : this.getBundles()) {
			if (symbolicName.equals(bundle.getManifest().getBundleSymbolicName().getSymbolicName())) {
				bundles.add(bundle);
			}
		}
		if (bundles.size() == 0) {
			return null;
		}
		return bundles;
	}
	
	public Bundle findBundle(String symbolicName, Version version) {
		for (Bundle bundle : this.getBundles()) {
			if (symbolicName.equals(bundle.getManifest().getBundleSymbolicName().getSymbolicName())) {
				if (version.equals(bundle.getManifest().getBundleVersion().getVersion())) {
				return bundle;
				}
			}
		}
		return null;
	}

} // FrameworkImpl
