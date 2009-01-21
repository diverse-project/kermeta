/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenericTypeDefinitionHelperImpl.java,v 1.10 2009-01-21 09:15:52 cfaucher Exp $
 */
package km2ecore.helper.kermeta.impl;

import kermeta.language.structure.impl.ObjectImpl;

import km2ecore.helper.kermeta.GenericTypeDefinitionHelper;
import km2ecore.helper.kermeta.KermetaPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Type Definition Helper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GenericTypeDefinitionHelperImpl extends ObjectImpl implements
		GenericTypeDefinitionHelper {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericTypeDefinitionHelperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KermetaPackage.Literals.GENERIC_TYPE_DEFINITION_HELPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ecore.EClass getKermetaSpecialType(
			kermeta.language.structure.Package p) {

		ecore.EClass result = null;

		ecore.EClass specialType = null;

		java.lang.String name_KermetaSspecialType = "KermetaSpecialTypesAlias";

		ecore.EClassifier retrieveSpecialType = null;

		//BIft:detect

		ecore.EClassifier result_ft246 = null;

		ecore.EClassifier elem_ft246 = null;

		result_ft246 = null;

		{

			kermeta.standard.Iterator<ecore.EClassifier> it_ft246 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EClassifier> convertAsOrderedSet(
							p.getEcoreModelElement().getEClassifiers())
					.iterator();
			java.lang.Boolean idLoopCond_1078 = false;
			while (!idLoopCond_1078) {
				idLoopCond_1078 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft246.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft246, null));
				if (idLoopCond_1078) {
				} else {

					elem_ft246 = it_ft246.next();

					java.lang.Boolean idIfCond_1079 = false;
					//BIle:detector
					ecore.EClassifier c_lbdExp246 = elem_ft246;

					idIfCond_1079 = kermeta.standard.helper.BooleanWrapper
							.and(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isInstanceOfSwitcher(
													c_lbdExp246,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"ecore.EClass")),
									kermeta.standard.helper.StringWrapper
											.equals(c_lbdExp246.getName(),
													name_KermetaSspecialType));
					//EIle:detector

					if (idIfCond_1079) {

						result_ft246 = elem_ft246;
					}

				}
			}
		}

		//CE
		retrieveSpecialType = result_ft246;
		//EIft:detect

		java.lang.Boolean idIfCond_1080 = false;
		idIfCond_1080 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(retrieveSpecialType));

		if (idIfCond_1080) {

			result = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(retrieveSpecialType,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass("ecore.EClass")));
		} else {

			specialType = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(ecore.EcorePackage.eINSTANCE.getEClass()));

			specialType.setName(name_KermetaSspecialType);

			specialType.setInstanceClassName("org.eclipse.emf.ecore.EObject");

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EClassifier> convertAsOrderedSet(
							p.getEcoreModelElement().getEClassifiers()).add(
							specialType);

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EAnnotation> convertAsOrderedSet(
							specialType.getEAnnotations())
					.add(
							((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE
											.getEAnnotationHelper()))
									.createKermetaEAnnotation(
											kermeta.standard.helper.StringWrapper
													.toString(km2ecore.helper.ecore.KermetaEAnnotationKey
															.getByName("alias")
															.getName()),
											"KermetaSpecialTypesAlias"));

			result = specialType;
		}

		return result;

	}

} //GenericTypeDefinitionHelperImpl
