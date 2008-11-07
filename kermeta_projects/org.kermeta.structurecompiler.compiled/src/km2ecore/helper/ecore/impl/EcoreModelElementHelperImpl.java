/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcoreModelElementHelperImpl.java,v 1.8 2008-11-07 08:54:06 cfaucher Exp $
 */
package km2ecore.helper.ecore.impl;

import ecore.EOperation;
import ecore.EStructuralFeature;

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.Operation;
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
	public EOperation findEOperationProxy(Operation op) {

		ecore.EOperation result = null;

		kermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.language.structure.ClassDefinition"));

		cd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.ExecutionContext
				.getInstance()
				.<kermeta.language.structure.ClassDefinition> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(op));

		ecore.EOperation eop = null;
		//BIft:detect

		ecore.EOperation result_ft6 = null;

		ecore.EOperation elem_ft6 = null;

		result_ft6 = null;

		{

			kermeta.standard.Iterator<ecore.EOperation> it_ft6 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EOperation> convertAsOrderedSet(
							cd.getEcoreModelElement().getEOperations())
					.iterator();
			java.lang.Boolean idLoopCond_24 = false;
			while (!idLoopCond_24) {
				idLoopCond_24 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft6.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft6, null));
				if (idLoopCond_24) {
				} else {

					elem_ft6 = it_ft6.next();

					java.lang.Boolean idIfCond_25 = false;
					//BIle:detector
					ecore.EOperation c_lbdExp6 = elem_ft6;

					java.lang.Boolean idIfCond_26 = false;
					idIfCond_26 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(c_lbdExp6,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance().getMetaClass(
													"ecore.EOperation"));

					if (idIfCond_26) {

						idIfCond_25 = kermeta.standard.helper.StringWrapper
								.equals(
										((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														c_lbdExp6,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"ecore.EOperation")))
												.getName(), op.getName());
					}

					//EIle:detector

					if (idIfCond_25) {

						result_ft6 = elem_ft6;
					}

				}
			}
		}

		//CE
		eop = result_ft6;
		//EIft:detect

		result = ((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeSwitcher(eop,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("ecore.EOperation")));

		return result;

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ecore.EClass findEClassProxy(ClassDefinition cd) {

		ecore.EClass result = null;

		kermeta.language.structure.Package pack = ((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.language.structure.Package"));

		pack = (kermeta.language.structure.Package) org.kermeta.compil.runtime.ExecutionContext
				.getInstance()
				.<kermeta.language.structure.Package> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(cd));

		ecore.EClassifier eclassifier = null;
		//BIft:detect

		ecore.EClassifier result_ft7 = null;

		ecore.EClassifier elem_ft7 = null;

		result_ft7 = null;

		{

			kermeta.standard.Iterator<ecore.EClassifier> it_ft7 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EClassifier> convertAsOrderedSet(
							pack.getEcoreModelElement().getEClassifiers())
					.iterator();
			java.lang.Boolean idLoopCond_27 = false;
			while (!idLoopCond_27) {
				idLoopCond_27 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft7.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft7, null));
				if (idLoopCond_27) {
				} else {

					elem_ft7 = it_ft7.next();

					java.lang.Boolean idIfCond_28 = false;
					//BIle:detector
					ecore.EClassifier c_lbdExp7 = elem_ft7;

					java.lang.Boolean idIfCond_29 = false;
					idIfCond_29 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(c_lbdExp7,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance().getMetaClass(
													"ecore.EClass"));

					if (idIfCond_29) {

						idIfCond_28 = kermeta.standard.helper.StringWrapper
								.equals(
										((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														c_lbdExp7,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"ecore.EClass")))
												.getName(), cd.getName());
					}

					//EIle:detector

					if (idIfCond_28) {

						result_ft7 = elem_ft7;
					}

				}
			}
		}

		//CE
		eclassifier = result_ft7;
		//EIft:detect

		result = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeSwitcher(eclassifier,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("ecore.EClass")));

		return result;

	}

} //EcoreModelElementHelperImpl
