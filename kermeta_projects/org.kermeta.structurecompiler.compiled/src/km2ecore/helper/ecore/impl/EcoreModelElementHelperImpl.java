/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: EcoreModelElementHelperImpl.java,v 1.11 2009-02-10 17:52:00 cfaucher Exp $
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
				.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
						.getClassDefinition()));

		cd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(op),
						"kermeta.language.structure.ClassDefinition");

		ecore.EOperation eop = null;
		//BIft:detect

		ecore.EOperation result_ft5 = null;

		ecore.EOperation elem_ft5 = null;

		result_ft5 = null;

		{

			kermeta.standard.Iterator<ecore.EOperation> it_ft5 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EOperation> convertAsOrderedSet(
							cd.getEcoreModelElement().getEOperations())
					.iterator();
			java.lang.Boolean idLoopCond_36 = false;
			while (!idLoopCond_36) {
				idLoopCond_36 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft5.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft5, null));
				if (idLoopCond_36) {
				} else {

					elem_ft5 = it_ft5.next();

					java.lang.Boolean idIfCond_37 = false;
					//BIle:detector
					ecore.EOperation c_lbdExp5 = elem_ft5;

					java.lang.Boolean idIfCond_38 = false;
					idIfCond_38 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(c_lbdExp5,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance().getMetaClass(
													"ecore.EOperation"));

					if (idIfCond_38) {

						idIfCond_37 = kermeta.standard.helper.StringWrapper
								.equals(
										((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														c_lbdExp5,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"ecore.EOperation")))
												.getName(), op.getName());
					}

					//EIle:detector

					if (idIfCond_37) {

						result_ft5 = elem_ft5;
					}

				}
			}
		}

		//CE
		eop = result_ft5;
		//EIft:detect
		;

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
				.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
						.getPackage()));

		pack = (kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(cd),
						"kermeta.language.structure.Package");

		ecore.EClassifier eclassifier = null;
		//BIft:detect

		ecore.EClassifier result_ft6 = null;

		ecore.EClassifier elem_ft6 = null;

		result_ft6 = null;

		{

			kermeta.standard.Iterator<ecore.EClassifier> it_ft6 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EClassifier> convertAsOrderedSet(
							pack.getEcoreModelElement().getEClassifiers())
					.iterator();
			java.lang.Boolean idLoopCond_39 = false;
			while (!idLoopCond_39) {
				idLoopCond_39 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft6.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft6, null));
				if (idLoopCond_39) {
				} else {

					elem_ft6 = it_ft6.next();

					java.lang.Boolean idIfCond_40 = false;
					//BIle:detector
					ecore.EClassifier c_lbdExp6 = elem_ft6;

					java.lang.Boolean idIfCond_41 = false;
					idIfCond_41 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(c_lbdExp6,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance().getMetaClass(
													"ecore.EClass"));

					if (idIfCond_41) {

						idIfCond_40 = kermeta.standard.helper.StringWrapper
								.equals(
										((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														c_lbdExp6,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"ecore.EClass")))
												.getName(), cd.getName());
					}

					//EIle:detector

					if (idIfCond_40) {

						result_ft6 = elem_ft6;
					}

				}
			}
		}

		//CE
		eclassifier = result_ft6;
		//EIft:detect
		;

		result = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeSwitcher(eclassifier,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("ecore.EClass")));

		return result;

	}

} //EcoreModelElementHelperImpl
