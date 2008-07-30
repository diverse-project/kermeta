/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleManifestEntryManyValuesImpl.java,v 1.1 2008-07-30 14:08:02 edaubert Exp $
 */
package manifest.impl;

import java.util.Collection;

import manifest.ManifestPackage;
import manifest.SimpleManifestEntryManyValues;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Simple Manifest Entry Many Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link manifest.impl.SimpleManifestEntryManyValuesImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class SimpleManifestEntryManyValuesImpl extends MANIFESTEntryImpl
		implements SimpleManifestEntryManyValues {
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}'
	 * attribute list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<String> values;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SimpleManifestEntryManyValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.SIMPLE_MANIFEST_ENTRY_MANY_VALUES;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<String> getValues() {
		if (values == null) {
			values = new EDataTypeUniqueEList<String>(String.class, this,
					ManifestPackage.SIMPLE_MANIFEST_ENTRY_MANY_VALUES__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ManifestPackage.SIMPLE_MANIFEST_ENTRY_MANY_VALUES__VALUES:
			return getValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ManifestPackage.SIMPLE_MANIFEST_ENTRY_MANY_VALUES__VALUES:
			getValues().clear();
			getValues().addAll((Collection<? extends String>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ManifestPackage.SIMPLE_MANIFEST_ENTRY_MANY_VALUES__VALUES:
			getValues().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ManifestPackage.SIMPLE_MANIFEST_ENTRY_MANY_VALUES__VALUES:
			return values != null && !values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (values: ");
		result.append(values);
		result.append(')');
		return result.toString();
	}

	public void addValue(String value) {
		if (!value.equals("")) {
			boolean exist = false;
			for (String valueTmp : getValues()) {
				if (valueTmp.equals(value)) {
					exist = true;
					break;
				}
			}
			if (!exist) {
				getValues().add(value);
			} else {
				System.out.println(value + " already exist.");
				System.out.println("It's not necessary to add again.");
			}
		} else {
			System.out
					.println("the String is empty, it's not necessary to add.");
		}

	}

} // SimpleManifestEntryManyValuesImpl
