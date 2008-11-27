/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcoreModelElementHelperImpl.java,v 1.9 2008-11-27 15:50:14 cfaucher Exp $
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

		ecore.EOperation result_ft239 = null;

		ecore.EOperation elem_ft239 = null;

		result_ft239 = null;

		{

			kermeta.standard.Iterator<ecore.EOperation> it_ft239 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EOperation> convertAsOrderedSet(
							cd.getEcoreModelElement().getEOperations())
					.iterator();
			java.lang.Boolean idLoopCond_1063 = false;
			while (!idLoopCond_1063) {
				idLoopCond_1063 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft239.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft239, null));
				if (idLoopCond_1063) {
				} else {

					elem_ft239 = it_ft239.next();

					java.lang.Boolean idIfCond_1064 = false;
					//BIle:detector
					ecore.EOperation c_lbdExp239 = elem_ft239;

					java.lang.Boolean idIfCond_1065 = false;
					idIfCond_1065 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(c_lbdExp239,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance().getMetaClass(
													"ecore.EOperation"));

					if (idIfCond_1065) {

						idIfCond_1064 = kermeta.standard.helper.StringWrapper
								.equals(
										((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														c_lbdExp239,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"ecore.EOperation")))
												.getName(), op.getName());
					}

					//EIle:detector

					if (idIfCond_1064) {

						result_ft239 = elem_ft239;
					}

				}
			}
		}

		//CE
		eop = result_ft239;
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

		ecore.EClassifier result_ft240 = null;

		ecore.EClassifier elem_ft240 = null;

		result_ft240 = null;

		{

			kermeta.standard.Iterator<ecore.EClassifier> it_ft240 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EClassifier> convertAsOrderedSet(
							pack.getEcoreModelElement().getEClassifiers())
					.iterator();
			java.lang.Boolean idLoopCond_1066 = false;
			while (!idLoopCond_1066) {
				idLoopCond_1066 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft240.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft240, null));
				if (idLoopCond_1066) {
				} else {

					elem_ft240 = it_ft240.next();

					java.lang.Boolean idIfCond_1067 = false;
					//BIle:detector
					ecore.EClassifier c_lbdExp240 = elem_ft240;

					java.lang.Boolean idIfCond_1068 = false;
					idIfCond_1068 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(c_lbdExp240,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance().getMetaClass(
													"ecore.EClass"));

					if (idIfCond_1068) {

						idIfCond_1067 = kermeta.standard.helper.StringWrapper
								.equals(
										((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														c_lbdExp240,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"ecore.EClass")))
												.getName(), cd.getName());
					}

					//EIle:detector

					if (idIfCond_1067) {

						result_ft240 = elem_ft240;
					}

				}
			}
		}

		//CE
		eclassifier = result_ft240;
		//EIft:detect

		result = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeSwitcher(eclassifier,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("ecore.EClass")));

		return result;

	}

} //EcoreModelElementHelperImpl
