/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcoreModelElementHelperImpl.java,v 1.4 2008-10-08 14:38:02 cfaucher Exp $
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

		cd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.container(op);

		ecore.EOperation eop = null;
		//BIft:detect

		ecore.EOperation result_ft234 = null;

		ecore.EOperation elem_ft234 = null;

		result_ft234 = null;

		{

			kermeta.standard.Iterator<ecore.EOperation> it_ft234 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EOperation> convertAsOrderedSet(
							cd.getEcoreModelElement().getEOperations())
					.iterator();
			java.lang.Boolean idLoopCond_1022 = false;
			while (!idLoopCond_1022) {
				idLoopCond_1022 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft234.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft234, null));
				if (idLoopCond_1022) {
				} else {

					elem_ft234 = it_ft234.next();

					java.lang.Boolean idIfCond_1023 = false;
					//BIle:detector
					ecore.EOperation c_lbdExp234 = elem_ft234;

					java.lang.Boolean idIfCond_1024 = false;
					idIfCond_1024 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(c_lbdExp234,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance().getMetaClass(
													"ecore.EOperation"));

					if (idIfCond_1024) {

						idIfCond_1023 = kermeta.standard.helper.StringWrapper
								.equals(
										((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asType(
														c_lbdExp234,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"ecore.EOperation")))
												.getName(), op.getName());
					}

					//EIle:detector

					if (idIfCond_1023) {

						result_ft234 = elem_ft234;
					}

				}
			}
		}

		//CE
		eop = result_ft234;
		//EIft:detect

		result = ((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asType(eop, org.kermeta.compil.runtime.ExecutionContext
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

		ecoreStructuralFeature.setName(self_.getFinalName());

		ecoreStructuralFeature.setOrdered(self_.getIsOrdered());

		ecoreStructuralFeature.setUnique(self_.getIsUnique());

		ecoreStructuralFeature.setLowerBound(self_.getLower());

		ecoreStructuralFeature.setUpperBound(self_.getUpper());

		ecoreStructuralFeature
				.setChangeable(kermeta.standard.helper.BooleanWrapper.not(self_
						.getIsReadOnly()));

		ecoreStructuralFeature.setDefaultValueLiteral(self_.getDefault());

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

		pack = (kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.container(cd);

		ecore.EClassifier eclassifier = null;
		//BIft:detect

		ecore.EClassifier result_ft235 = null;

		ecore.EClassifier elem_ft235 = null;

		result_ft235 = null;

		{

			kermeta.standard.Iterator<ecore.EClassifier> it_ft235 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EClassifier> convertAsOrderedSet(
							pack.getEcoreModelElement().getEClassifiers())
					.iterator();
			java.lang.Boolean idLoopCond_1025 = false;
			while (!idLoopCond_1025) {
				idLoopCond_1025 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft235.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft235, null));
				if (idLoopCond_1025) {
				} else {

					elem_ft235 = it_ft235.next();

					java.lang.Boolean idIfCond_1026 = false;
					//BIle:detector
					ecore.EClassifier c_lbdExp235 = elem_ft235;

					java.lang.Boolean idIfCond_1027 = false;
					idIfCond_1027 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(c_lbdExp235,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance().getMetaClass(
													"ecore.EClass"));

					if (idIfCond_1027) {

						idIfCond_1026 = kermeta.standard.helper.StringWrapper
								.equals(
										((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asType(
														c_lbdExp235,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"ecore.EClass")))
												.getName(), cd.getName());
					}

					//EIle:detector

					if (idIfCond_1026) {

						result_ft235 = elem_ft235;
					}

				}
			}
		}

		//CE
		eclassifier = result_ft235;
		//EIft:detect

		result = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asType(eclassifier,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("ecore.EClass")));

		return result;

	}

} //EcoreModelElementHelperImpl
