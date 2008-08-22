/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExcludeClassesImpl.java,v 1.4 2008-08-22 12:43:30 edaubert Exp $
 */
package option.impl;

import java.util.Collection;

import option.ExcludeClasses;
import option.OptionPackage;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Exclude Classes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link option.impl.ExcludeClassesImpl#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExcludeClassesImpl extends ExportPackageDirectiveImpl implements
		ExcludeClasses {
	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<option.Class> classes;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected ExcludeClassesImpl() {
		super();
		this.setToken(Constants.EXCLUDE_DIRECTIVE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptionPackage.Literals.EXCLUDE_CLASSES;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<option.Class> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<option.Class>(option.Class.class, this, OptionPackage.EXCLUDE_CLASSES__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OptionPackage.EXCLUDE_CLASSES__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
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
			case OptionPackage.EXCLUDE_CLASSES__CLASSES:
				return getClasses();
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
			case OptionPackage.EXCLUDE_CLASSES__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends option.Class>)newValue);
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
			case OptionPackage.EXCLUDE_CLASSES__CLASSES:
				getClasses().clear();
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
			case OptionPackage.EXCLUDE_CLASSES__CLASSES:
				return classes != null && !classes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public void addExclude(option.Class exclude) {
		if (exclude != null && exclude.getReference() != null) {
			boolean exist = false;
			for (option.Class tmp : getClasses()) {
				if (tmp.getReference().equals(exclude.getReference())) {
					exist = true;
					break;
				}
			}
			if (!exist) {
				getClasses().add(exclude);
			}
		}
	}

} // ExcludeClassesImpl
