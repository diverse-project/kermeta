/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcoreModelElementHelperImpl.java,v 1.10 2009-01-21 09:16:06 cfaucher Exp $
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

		ecore.EOperation result_ft249 = null;

		ecore.EOperation elem_ft249 = null;

		result_ft249 = null;

		{

			kermeta.standard.Iterator<ecore.EOperation> it_ft249 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EOperation> convertAsOrderedSet(
							cd.getEcoreModelElement().getEOperations())
					.iterator();
			java.lang.Boolean idLoopCond_1098 = false;
			while (!idLoopCond_1098) {
				idLoopCond_1098 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft249.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft249, null));
				if (idLoopCond_1098) {
				} else {

					elem_ft249 = it_ft249.next();

					java.lang.Boolean idIfCond_1099 = false;
					//BIle:detector
					ecore.EOperation c_lbdExp249 = elem_ft249;

					java.lang.Boolean idIfCond_1100 = false;
					idIfCond_1100 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(c_lbdExp249,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance().getMetaClass(
													"ecore.EOperation"));

					if (idIfCond_1100) {

						idIfCond_1099 = kermeta.standard.helper.StringWrapper
								.equals(
										((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														c_lbdExp249,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"ecore.EOperation")))
												.getName(), op.getName());
					}

					//EIle:detector

					if (idIfCond_1099) {

						result_ft249 = elem_ft249;
					}

				}
			}
		}

		//CE
		eop = result_ft249;
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
				.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
						.getPackage()));

		pack = (kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(cd),
						"kermeta.language.structure.Package");

		ecore.EClassifier eclassifier = null;
		//BIft:detect

		ecore.EClassifier result_ft250 = null;

		ecore.EClassifier elem_ft250 = null;

		result_ft250 = null;

		{

			kermeta.standard.Iterator<ecore.EClassifier> it_ft250 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EClassifier> convertAsOrderedSet(
							pack.getEcoreModelElement().getEClassifiers())
					.iterator();
			java.lang.Boolean idLoopCond_1101 = false;
			while (!idLoopCond_1101) {
				idLoopCond_1101 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft250.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft250, null));
				if (idLoopCond_1101) {
				} else {

					elem_ft250 = it_ft250.next();

					java.lang.Boolean idIfCond_1102 = false;
					//BIle:detector
					ecore.EClassifier c_lbdExp250 = elem_ft250;

					java.lang.Boolean idIfCond_1103 = false;
					idIfCond_1103 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(c_lbdExp250,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance().getMetaClass(
													"ecore.EClass"));

					if (idIfCond_1103) {

						idIfCond_1102 = kermeta.standard.helper.StringWrapper
								.equals(
										((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														c_lbdExp250,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"ecore.EClass")))
												.getName(), cd.getName());
					}

					//EIle:detector

					if (idIfCond_1102) {

						result_ft250 = elem_ft250;
					}

				}
			}
		}

		//CE
		eclassifier = result_ft250;
		//EIft:detect

		result = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeSwitcher(eclassifier,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("ecore.EClass")));

		return result;

	}

} //EcoreModelElementHelperImpl
