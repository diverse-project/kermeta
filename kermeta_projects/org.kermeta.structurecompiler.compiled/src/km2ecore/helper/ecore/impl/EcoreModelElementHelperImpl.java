/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcoreModelElementHelperImpl.java,v 1.1 2008-09-04 15:40:39 cfaucher Exp $
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
		//Beginning of the Inlining of the function type: detect

		ecore.EOperation result_ft165 = null;

		ecore.EOperation elem_ft165 = null;

		result_ft165 = null;

		{

			kermeta.standard.Iterator<ecore.EOperation> it_ft165 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EOperation> convertAsOrderedSet(
							cd.getEcoreModelElement().getEOperations())
					.iterator();
			java.lang.Boolean idLoopCond_767 = false;
			while (!idLoopCond_767) {
				idLoopCond_767 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft165.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft165, null));
				if (idLoopCond_767) {
				} else {

					elem_ft165 = it_ft165.next();

					java.lang.Boolean idIfCond_768 = false;
					//Beginning of the Inlining of the lambda expression: detector
					ecore.EOperation c = elem_ft165;

					java.lang.Boolean idIfCond_769 = false;
					idIfCond_769 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(c,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance().getMetaClass(
													"ecore.EOperation"));

					if (idIfCond_769) {

						idIfCond_768 = kermeta.standard.helper.StringWrapper
								.equals(
										((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asType(
														c,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"ecore.EOperation")))
												.getName(), op.getName());
					}

					//End of the Inlining of the lambda expression: detector

					if (idIfCond_768) {

						result_ft165 = elem_ft165;
					}

				}
			}
		}

		//callElement
		eop = result_ft165;
		//End of the Inlining of the function type: detect

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
		//Beginning of the Inlining of the function type: detect

		ecore.EClassifier result_ft166 = null;

		ecore.EClassifier elem_ft166 = null;

		result_ft166 = null;

		{

			kermeta.standard.Iterator<ecore.EClassifier> it_ft166 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EClassifier> convertAsOrderedSet(
							pack.getEcoreModelElement().getEClassifiers())
					.iterator();
			java.lang.Boolean idLoopCond_770 = false;
			while (!idLoopCond_770) {
				idLoopCond_770 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft166.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft166, null));
				if (idLoopCond_770) {
				} else {

					elem_ft166 = it_ft166.next();

					java.lang.Boolean idIfCond_771 = false;
					//Beginning of the Inlining of the lambda expression: detector
					ecore.EClassifier c = elem_ft166;

					java.lang.Boolean idIfCond_772 = false;
					idIfCond_772 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(c,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance().getMetaClass(
													"ecore.EClass"));

					if (idIfCond_772) {

						idIfCond_771 = kermeta.standard.helper.StringWrapper
								.equals(
										((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asType(
														c,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"ecore.EClass")))
												.getName(), cd.getName());
					}

					//End of the Inlining of the lambda expression: detector

					if (idIfCond_771) {

						result_ft166 = elem_ft166;
					}

				}
			}
		}

		//callElement
		eclassifier = result_ft166;
		//End of the Inlining of the function type: detect

		result = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asType(eclassifier,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("ecore.EClass")));

		return result;

	}

} //EcoreModelElementHelperImpl
