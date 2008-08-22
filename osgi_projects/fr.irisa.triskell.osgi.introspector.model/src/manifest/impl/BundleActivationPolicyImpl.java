/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleActivationPolicyImpl.java,v 1.4 2008-08-22 12:43:32 edaubert Exp $
 */
package manifest.impl;

import java.util.Collection;

import manifest.BundleActivationPolicy;
import manifest.ManifestPackage;
import manifest.PolicyEnum;
import option.ActivationPolicyDirective;
import option.DirectiveEntry;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Bundle Activation Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link manifest.impl.BundleActivationPolicyImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link manifest.impl.BundleActivationPolicyImpl#getDirectives <em>Directives</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BundleActivationPolicyImpl extends MANIFESTEntryImpl implements
		BundleActivationPolicy {
	/**
	 * The default value of the '{@link #getPolicy() <em>Policy</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final PolicyEnum POLICY_EDEFAULT = PolicyEnum.LAZY;

	/**
	 * The cached value of the '{@link #getPolicy() <em>Policy</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected PolicyEnum policy = POLICY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDirectives() <em>Directives</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDirectives()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivationPolicyDirective> directives;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected BundleActivationPolicyImpl() {
		super();
		setEntryName(Constants.BUNDLE_ACTIVATIONPOLICY);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.BUNDLE_ACTIVATION_POLICY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyEnum getPolicy() {
		return policy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicy(PolicyEnum newPolicy) {
		PolicyEnum oldPolicy = policy;
		policy = newPolicy == null ? POLICY_EDEFAULT : newPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.BUNDLE_ACTIVATION_POLICY__POLICY, oldPolicy, policy));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivationPolicyDirective> getDirectives() {
		if (directives == null) {
			directives = new EObjectContainmentEList<ActivationPolicyDirective>(ActivationPolicyDirective.class, this, ManifestPackage.BUNDLE_ACTIVATION_POLICY__DIRECTIVES);
		}
		return directives;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManifestPackage.BUNDLE_ACTIVATION_POLICY__DIRECTIVES:
				return ((InternalEList<?>)getDirectives()).basicRemove(otherEnd, msgs);
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
			case ManifestPackage.BUNDLE_ACTIVATION_POLICY__POLICY:
				return getPolicy();
			case ManifestPackage.BUNDLE_ACTIVATION_POLICY__DIRECTIVES:
				return getDirectives();
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
			case ManifestPackage.BUNDLE_ACTIVATION_POLICY__POLICY:
				setPolicy((PolicyEnum)newValue);
				return;
			case ManifestPackage.BUNDLE_ACTIVATION_POLICY__DIRECTIVES:
				getDirectives().clear();
				getDirectives().addAll((Collection<? extends ActivationPolicyDirective>)newValue);
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
			case ManifestPackage.BUNDLE_ACTIVATION_POLICY__POLICY:
				setPolicy(POLICY_EDEFAULT);
				return;
			case ManifestPackage.BUNDLE_ACTIVATION_POLICY__DIRECTIVES:
				getDirectives().clear();
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
			case ManifestPackage.BUNDLE_ACTIVATION_POLICY__POLICY:
				return policy != POLICY_EDEFAULT;
			case ManifestPackage.BUNDLE_ACTIVATION_POLICY__DIRECTIVES:
				return directives != null && !directives.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (policy: ");
		result.append(policy);
		result.append(')');
		return result.toString();
	}

	public void addDirective(ActivationPolicyDirective directive) {
		if (directive != null && directive.getToken() != null) {
			boolean exist = false;
			for (DirectiveEntry entry : getDirectives()) {
				if (entry.getToken().equals(directive.getToken())) {
					exist = true;
					break;
				}
			}
			if (!exist) {
				getDirectives().add(directive);
			}
		}
	}

	public void removeDirective(ActivationPolicyDirective directive) {
		if (getDirectives().contains(directive)) {
			getDirectives().remove(directive);
		}

	}

} // BundleActivationPolicyImpl
