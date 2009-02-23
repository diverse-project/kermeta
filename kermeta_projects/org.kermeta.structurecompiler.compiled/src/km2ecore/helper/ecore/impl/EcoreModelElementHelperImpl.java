/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: EcoreModelElementHelperImpl.java,v 1.12 2009-02-23 15:26:56 cfaucher Exp $
 */
package km2ecore.helper.ecore.impl;

import ecore.EStructuralFeature;

import kermeta.language.structure.Property;

import kermeta.language.structure.impl.ObjectImpl;

import km2ecore.KM2EcoreContext;

import km2ecore.helper.ecore.EcoreModelElementHelper;
import km2ecore.helper.ecore.EcorePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element Helper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EcoreModelElementHelperImpl extends ObjectImpl implements
		EcoreModelElementHelper {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcoreModelElementHelperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.ECORE_MODEL_ELEMENT_HELPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEStructuralFeatureProperties(Property self_,
			EStructuralFeature ecoreStructuralFeature, KM2EcoreContext context) {

		ecoreStructuralFeature.setName(self_.getFinalName(context));

		ecoreStructuralFeature.setOrdered(self_.getIsOrdered());

		ecoreStructuralFeature.setUnique(self_.getIsUnique());

		ecoreStructuralFeature.setLowerBound(self_.getLower());

		ecoreStructuralFeature.setUpperBound(self_.getUpper());

		ecoreStructuralFeature
				.setChangeable(kermeta.standard.helper.BooleanWrapper.not(self_
						.getIsReadOnly()));

		ecoreStructuralFeature.setDefaultValueLiteral(self_.get_default());

		ecoreStructuralFeature.setDerived(self_.getIsDerived());

	}

} //EcoreModelElementHelperImpl
