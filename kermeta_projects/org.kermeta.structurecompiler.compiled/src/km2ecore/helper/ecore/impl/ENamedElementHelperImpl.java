/**
 * <copyright>
 * </copyright>
 *
 * $Id: ENamedElementHelperImpl.java,v 1.10 2009-01-21 09:16:06 cfaucher Exp $
 */
package km2ecore.helper.ecore.impl;

import ecore.EObject;

import kermeta.language.structure.impl.ObjectImpl;

import km2ecore.helper.ecore.ENamedElementHelper;
import km2ecore.helper.ecore.EcorePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ENamed Element Helper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ENamedElementHelperImpl extends ObjectImpl implements
		ENamedElementHelper {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ENamedElementHelperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.ENAMED_ELEMENT_HELPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String asString(EObject element) {

		java.lang.String result = null;

		result = null;

		java.lang.Boolean idIfCond_1104 = false;
		idIfCond_1104 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(element)),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										element,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance().getMetaClass(
														"ecore.ENamedElement")));

		if (idIfCond_1104) {

			result = ((ecore.ENamedElement) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(element,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"ecore.ENamedElement"))).getName();
		} else {

			result = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.toStringSwitcher(element);
		}

		return result;

	}

} //ENamedElementHelperImpl
