/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleSymbolicNameImpl.java,v 1.2 2008-07-31 13:43:53 edaubert Exp $
 */
package manifest.impl;

import java.util.Collection;
import java.util.Iterator;

import manifest.BundleSymbolicName;
import manifest.ManifestPackage;
import option.FragmentAttachment;
import option.Singleton;
import option.SymbolicNameDirective;

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
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Bundle Symbolic Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link manifest.impl.BundleSymbolicNameImpl#getSymbolicName <em>Symbolic Name</em>}</li>
 *   <li>{@link manifest.impl.BundleSymbolicNameImpl#getDirectives <em>Directives</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BundleSymbolicNameImpl extends MANIFESTEntryImpl implements
		BundleSymbolicName {
	/**
	 * The default value of the '{@link #getSymbolicName() <em>Symbolic Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSymbolicName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOLIC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbolicName() <em>Symbolic Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSymbolicName()
	 * @generated
	 * @ordered
	 */
	protected String symbolicName = SYMBOLIC_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDirectives() <em>Directives</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDirectives()
	 * @generated
	 * @ordered
	 */
	protected EList<SymbolicNameDirective> directives;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected BundleSymbolicNameImpl() {
		super();
		setEntryName(Constants.BUNDLE_SYMBOLICNAME);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.BUNDLE_SYMBOLIC_NAME;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbolicName() {
		return symbolicName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbolicName(String newSymbolicName) {
		String oldSymbolicName = symbolicName;
		symbolicName = newSymbolicName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.BUNDLE_SYMBOLIC_NAME__SYMBOLIC_NAME, oldSymbolicName, symbolicName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SymbolicNameDirective> getDirectives() {
		if (directives == null) {
			directives = new EObjectContainmentEList<SymbolicNameDirective>(SymbolicNameDirective.class, this, ManifestPackage.BUNDLE_SYMBOLIC_NAME__DIRECTIVES);
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
			case ManifestPackage.BUNDLE_SYMBOLIC_NAME__DIRECTIVES:
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
			case ManifestPackage.BUNDLE_SYMBOLIC_NAME__SYMBOLIC_NAME:
				return getSymbolicName();
			case ManifestPackage.BUNDLE_SYMBOLIC_NAME__DIRECTIVES:
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
			case ManifestPackage.BUNDLE_SYMBOLIC_NAME__SYMBOLIC_NAME:
				setSymbolicName((String)newValue);
				return;
			case ManifestPackage.BUNDLE_SYMBOLIC_NAME__DIRECTIVES:
				getDirectives().clear();
				getDirectives().addAll((Collection<? extends SymbolicNameDirective>)newValue);
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
			case ManifestPackage.BUNDLE_SYMBOLIC_NAME__SYMBOLIC_NAME:
				setSymbolicName(SYMBOLIC_NAME_EDEFAULT);
				return;
			case ManifestPackage.BUNDLE_SYMBOLIC_NAME__DIRECTIVES:
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
			case ManifestPackage.BUNDLE_SYMBOLIC_NAME__SYMBOLIC_NAME:
				return SYMBOLIC_NAME_EDEFAULT == null ? symbolicName != null : !SYMBOLIC_NAME_EDEFAULT.equals(symbolicName);
			case ManifestPackage.BUNDLE_SYMBOLIC_NAME__DIRECTIVES:
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
		result.append(" (symbolicName: ");
		result.append(symbolicName);
		result.append(')');
		return result.toString();
	}

	public void addDirective(SymbolicNameDirective directive) {
		if (directive instanceof Singleton) {
			for (Iterator<SymbolicNameDirective> directivesIterator = getDirectives()
					.iterator(); directivesIterator.hasNext();) {
				SymbolicNameDirective directivetmp = directivesIterator.next();
				if (directivetmp instanceof Singleton) {
					getDirectives().remove(directivetmp);
					break;
				}
			}
		} else if (directive instanceof FragmentAttachment) {
			for (Iterator<SymbolicNameDirective> directivesIterator = getDirectives()
					.iterator(); directivesIterator.hasNext();) {
				SymbolicNameDirective directivetmp = directivesIterator.next();
				if (directivetmp instanceof FragmentAttachment) {
					getDirectives().remove(directivetmp);
					break;
				}
			}
		}
		getDirectives().add(directive);
	}

} // BundleSymbolicNameImpl
