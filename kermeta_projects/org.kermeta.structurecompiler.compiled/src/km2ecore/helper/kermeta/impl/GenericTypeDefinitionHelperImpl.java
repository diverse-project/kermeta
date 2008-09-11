/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenericTypeDefinitionHelperImpl.java,v 1.2 2008-09-11 12:34:48 cfaucher Exp $
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

		retrieveSpecialType = null;
		//BIft:detect

		ecore.EClassifier result_ft7 = null;

		ecore.EClassifier elem_ft7 = null;

		result_ft7 = null;

		{

			kermeta.standard.Iterator<ecore.EClassifier> it_ft7 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EClassifier> convertAsOrderedSet(
							p.getEcoreModelElement().getEClassifiers())
					.iterator();
			java.lang.Boolean idLoopCond_41 = false;
			while (!idLoopCond_41) {
				idLoopCond_41 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft7.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft7, null));
				if (idLoopCond_41) {
				} else {

					elem_ft7 = it_ft7.next();

					java.lang.Boolean idIfCond_42 = false;
					//BIle:detector
					ecore.EClassifier c_lbdExp7 = elem_ft7;

					idIfCond_42 = kermeta.standard.helper.BooleanWrapper
							.and(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isInstanceOf(
													c_lbdExp7,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"ecore.EClass")),
									kermeta.standard.helper.StringWrapper
											.equals(c_lbdExp7.getName(),
													name_KermetaSspecialType));
					//EIle:detector

					if (idIfCond_42) {

						result_ft7 = elem_ft7;
					}

				}
			}
		}

		//EIft:detect

		java.lang.Boolean idIfCond_43 = false;
		idIfCond_43 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(retrieveSpecialType));

		if (idIfCond_43) {

			result = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asType(retrieveSpecialType,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass("ecore.EClass")));
		} else {

			specialType = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("ecore.EClass"));

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
									.newObject("km2ecore.helper.ecore.EAnnotationHelper"))
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
