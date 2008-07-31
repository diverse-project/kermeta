/**
 * <copyright>
 * </copyright>
 *
 * $Id: MandatoryImpl.java,v 1.2 2008-07-31 13:43:53 edaubert Exp $
 */
package option.impl;

import java.util.Collection;

import option.AttributEntry;
import option.Mandatory;
import option.OptionPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Mandatory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link option.impl.MandatoryImpl#getAttributs <em>Attributs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MandatoryImpl extends ExportPackageDirectiveImpl implements
		Mandatory {
	/**
	 * The cached value of the '{@link #getAttributs() <em>Attributs</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAttributs()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributEntry> attributs;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected MandatoryImpl() {
		super();
		this.setToken(Constants.MANDATORY_DIRECTIVE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptionPackage.Literals.MANDATORY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributEntry> getAttributs() {
		if (attributs == null) {
			attributs = new EObjectResolvingEList<AttributEntry>(AttributEntry.class, this, OptionPackage.MANDATORY__ATTRIBUTS);
		}
		return attributs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptionPackage.MANDATORY__ATTRIBUTS:
				return getAttributs();
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
			case OptionPackage.MANDATORY__ATTRIBUTS:
				getAttributs().clear();
				getAttributs().addAll((Collection<? extends AttributEntry>)newValue);
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
			case OptionPackage.MANDATORY__ATTRIBUTS:
				getAttributs().clear();
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
			case OptionPackage.MANDATORY__ATTRIBUTS:
				return attributs != null && !attributs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public void addAttribut(AttributEntry attribut) {
		if (!getAttributs().contains(attribut)) {
			getAttributs().add(attribut);
		}

	}

} // MandatoryImpl
