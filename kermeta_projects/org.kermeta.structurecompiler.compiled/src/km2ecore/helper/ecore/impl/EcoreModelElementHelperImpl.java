/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcoreModelElementHelperImpl.java,v 1.3 2008-09-22 14:49:09 cfaucher Exp $
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

		ecore.EOperation result_ft236 = null;

		ecore.EOperation elem_ft236 = null;

		result_ft236 = null;

		{

			kermeta.standard.Iterator<ecore.EOperation> it_ft236 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EOperation> convertAsOrderedSet(
							cd.getEcoreModelElement().getEOperations())
					.iterator();
			java.lang.Boolean idLoopCond_1008 = false;
			while (!idLoopCond_1008) {
				idLoopCond_1008 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft236.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft236, null));
				if (idLoopCond_1008) {
				} else {

					elem_ft236 = it_ft236.next();

					java.lang.Boolean idIfCond_1009 = false;
					//BIle:detector
					ecore.EOperation c_lbdExp236 = elem_ft236;

					java.lang.Boolean idIfCond_1010 = false;
					idIfCond_1010 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(c_lbdExp236,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance().getMetaClass(
													"ecore.EOperation"));

					if (idIfCond_1010) {

						idIfCond_1009 = kermeta.standard.helper.StringWrapper
								.equals(
										((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asType(
														c_lbdExp236,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"ecore.EOperation")))
												.getName(), op.getName());
					}

					//EIle:detector

					if (idIfCond_1009) {

						result_ft236 = elem_ft236;
					}

				}
			}
		}

		//CE
		eop = result_ft236;
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

		ecore.EClassifier result_ft237 = null;

		ecore.EClassifier elem_ft237 = null;

		result_ft237 = null;

		{

			kermeta.standard.Iterator<ecore.EClassifier> it_ft237 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EClassifier> convertAsOrderedSet(
							pack.getEcoreModelElement().getEClassifiers())
					.iterator();
			java.lang.Boolean idLoopCond_1011 = false;
			while (!idLoopCond_1011) {
				idLoopCond_1011 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft237.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft237, null));
				if (idLoopCond_1011) {
				} else {

					elem_ft237 = it_ft237.next();

					java.lang.Boolean idIfCond_1012 = false;
					//BIle:detector
					ecore.EClassifier c_lbdExp237 = elem_ft237;

					java.lang.Boolean idIfCond_1013 = false;
					idIfCond_1013 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(c_lbdExp237,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance().getMetaClass(
													"ecore.EClass"));

					if (idIfCond_1013) {

						idIfCond_1012 = kermeta.standard.helper.StringWrapper
								.equals(
										((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asType(
														c_lbdExp237,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"ecore.EClass")))
												.getName(), cd.getName());
					}

					//EIle:detector

					if (idIfCond_1012) {

						result_ft237 = elem_ft237;
					}

				}
			}
		}

		//CE
		eclassifier = result_ft237;
		//EIft:detect

		result = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asType(eclassifier,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("ecore.EClass")));

		return result;

	}

} //EcoreModelElementHelperImpl
