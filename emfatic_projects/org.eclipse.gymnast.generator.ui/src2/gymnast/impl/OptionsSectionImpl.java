/**
 * <copyright>
 * </copyright>
 *
 * $Id: OptionsSectionImpl.java,v 1.1 2007-11-21 10:22:22 ftanguy Exp $
 */
package gymnast.impl;

import gymnast.Option;
import gymnast.OptionsSection;
import gymnast.gymnastPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Options Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gymnast.impl.OptionsSectionImpl#getOptionList <em>Option List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OptionsSectionImpl extends EObjectImpl implements OptionsSection {
	/**
	 * The cached value of the '{@link #getOptionList() <em>Option List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionList()
	 * @generated
	 * @ordered
	 */
	protected EList<Option> optionList = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionsSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return gymnastPackage.Literals.OPTIONS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Option> getOptionList() {
		if (optionList == null) {
			optionList = new EObjectResolvingEList<Option>(Option.class, this, gymnastPackage.OPTIONS_SECTION__OPTION_LIST);
		}
		return optionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case gymnastPackage.OPTIONS_SECTION__OPTION_LIST:
				return getOptionList();
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
			case gymnastPackage.OPTIONS_SECTION__OPTION_LIST:
				getOptionList().clear();
				getOptionList().addAll((Collection<? extends Option>)newValue);
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
			case gymnastPackage.OPTIONS_SECTION__OPTION_LIST:
				getOptionList().clear();
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
			case gymnastPackage.OPTIONS_SECTION__OPTION_LIST:
				return optionList != null && !optionList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OptionsSectionImpl
