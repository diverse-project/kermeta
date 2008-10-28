/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelAnalizerImpl.java,v 1.6 2008-10-28 13:18:31 cfaucher Exp $
 */
package km2ecore.helper.ecore.impl;

import kermeta.language.structure.impl.ObjectImpl;

import km2ecore.helper.ecore.EcorePackage;
import km2ecore.helper.ecore.ModelAnalizer;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Analizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ModelAnalizerImpl extends ObjectImpl implements ModelAnalizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelAnalizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.MODEL_ANALIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isInterfaceBy(ecore.EClass extended_class,
			ecore.EClass super_class) {

		java.lang.Boolean result = null;

		result = kermeta.standard.helper.BooleanWrapper.not(this.isExtendedBy(
				extended_class, super_class));

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isExtendedBy(ecore.EClass extended_class,
			ecore.EClass super_class) {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_1074 = false;
		idIfCond_1074 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.equalsSwitcher(
						super_class,
						org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<ecore.EGenericType> convertAsOrderedSet(
										extended_class.getEGenericSuperTypes())
								.first().getEClassifier());

		if (idIfCond_1074) {

			result = true;
		}

		return result;

	}

} //ModelAnalizerImpl
