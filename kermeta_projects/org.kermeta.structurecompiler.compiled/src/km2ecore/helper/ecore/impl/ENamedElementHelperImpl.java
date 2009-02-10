/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: ENamedElementHelperImpl.java,v 1.11 2009-02-10 17:51:59 cfaucher Exp $
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

		java.lang.Boolean idIfCond_35 = false;
		idIfCond_35 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_35) {

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
