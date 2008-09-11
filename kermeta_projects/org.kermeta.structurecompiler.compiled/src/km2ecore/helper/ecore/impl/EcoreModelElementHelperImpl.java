/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcoreModelElementHelperImpl.java,v 1.2 2008-09-11 12:34:57 cfaucher Exp $
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

		ecore.EOperation result_ft2 = null;

		ecore.EOperation elem_ft2 = null;

		result_ft2 = null;

		{

			kermeta.standard.Iterator<ecore.EOperation> it_ft2 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EOperation> convertAsOrderedSet(
							cd.getEcoreModelElement().getEOperations())
					.iterator();
			java.lang.Boolean idLoopCond_11 = false;
			while (!idLoopCond_11) {
				idLoopCond_11 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft2.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft2, null));
				if (idLoopCond_11) {
				} else {

					elem_ft2 = it_ft2.next();

					java.lang.Boolean idIfCond_12 = false;
					//BIle:detector
					ecore.EOperation c_lbdExp2 = elem_ft2;

					java.lang.Boolean idIfCond_13 = false;
					idIfCond_13 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(c_lbdExp2,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance().getMetaClass(
													"ecore.EOperation"));

					if (idIfCond_13) {

						idIfCond_12 = kermeta.standard.helper.StringWrapper
								.equals(
										((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asType(
														c_lbdExp2,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"ecore.EOperation")))
												.getName(), op.getName());
					}

					//EIle:detector

					if (idIfCond_12) {

						result_ft2 = elem_ft2;
					}

				}
			}
		}

		//CE
		eop = result_ft2;
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

		ecore.EClassifier result_ft3 = null;

		ecore.EClassifier elem_ft3 = null;

		result_ft3 = null;

		{

			kermeta.standard.Iterator<ecore.EClassifier> it_ft3 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EClassifier> convertAsOrderedSet(
							pack.getEcoreModelElement().getEClassifiers())
					.iterator();
			java.lang.Boolean idLoopCond_14 = false;
			while (!idLoopCond_14) {
				idLoopCond_14 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft3.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft3, null));
				if (idLoopCond_14) {
				} else {

					elem_ft3 = it_ft3.next();

					java.lang.Boolean idIfCond_15 = false;
					//BIle:detector
					ecore.EClassifier c_lbdExp3 = elem_ft3;

					java.lang.Boolean idIfCond_16 = false;
					idIfCond_16 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(c_lbdExp3,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance().getMetaClass(
													"ecore.EClass"));

					if (idIfCond_16) {

						idIfCond_15 = kermeta.standard.helper.StringWrapper
								.equals(
										((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asType(
														c_lbdExp3,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"ecore.EClass")))
												.getName(), cd.getName());
					}

					//EIle:detector

					if (idIfCond_15) {

						result_ft3 = elem_ft3;
					}

				}
			}
		}

		//CE
		eclassifier = result_ft3;
		//EIft:detect

		result = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asType(eclassifier,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("ecore.EClass")));

		return result;

	}

} //EcoreModelElementHelperImpl
