/**
 * <copyright>
 * </copyright>
 *
 * $Id: EAnnotationHelperImpl.java,v 1.9 2008-11-27 15:50:14 cfaucher Exp $
 */
package km2ecore.helper.ecore.impl;

import ecore.EAnnotation;
import ecore.EModelElement;

import kermeta.language.structure.impl.ObjectImpl;

import km2ecore.helper.ecore.EAnnotationHelper;
import km2ecore.helper.ecore.EcorePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAnnotation Helper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EAnnotationHelperImpl extends ObjectImpl implements
		EAnnotationHelper {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAnnotationHelperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.EANNOTATION_HELPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAnnotationPropGetter(EModelElement eModelElement, String body) {

		java.lang.Boolean idIfCond_1069 = false;
		idIfCond_1069 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(eModelElement));

		if (idIfCond_1069) {

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EAnnotation> convertAsOrderedSet(
							eModelElement.getEAnnotations()).add(
							this.create("kompiledderivedProp.getter", "body",
									body));
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation createEmpty(String source) {

		ecore.EAnnotation result = null;

		ecore.EAnnotation annotation = ((ecore.EAnnotation) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("ecore.EAnnotation"));

		annotation.setSource(source);

		result = annotation;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean existsAnnotationGenModelImpl(EModelElement eModelElement) {

		java.lang.Boolean result = null;

		//BIft:exists

		java.lang.Boolean result_ft241 = null;

		java.lang.Boolean test_ft241 = false;

		{

			kermeta.standard.Iterator<ecore.EAnnotation> it_ft241 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EAnnotation> convertAsOrderedSet(
							eModelElement.getEAnnotations()).iterator();
			java.lang.Boolean idLoopCond_1070 = false;
			while (!idLoopCond_1070) {
				idLoopCond_1070 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft241.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(test_ft241, false));
				if (idLoopCond_1070) {
				} else {

					java.lang.Boolean result_lambda_ft241 = null;
					//BIle:func
					ecore.EAnnotation a_lbdExp241 = it_ft241.next();

					//BIft:exists

					java.lang.Boolean result_ft242 = null;

					java.lang.Boolean test_ft242 = false;

					{

						kermeta.standard.Iterator<ecore.EStringToStringMapEntry> it_ft242 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<ecore.EStringToStringMapEntry> convertAsOrderedSet(
										a_lbdExp241.getDetails()).iterator();
						java.lang.Boolean idLoopCond_1071 = false;
						while (!idLoopCond_1071) {
							idLoopCond_1071 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft242.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															test_ft242, false));
							if (idLoopCond_1071) {
							} else {

								java.lang.Boolean result_lambda_ft242 = null;
								//BIle:func
								ecore.EStringToStringMapEntry d_lbdExp242 = it_ft242
										.next();

								result_lambda_ft242 = kermeta.standard.helper.StringWrapper
										.equals(d_lbdExp242.getKey(), "body");
								//EIle:func

								test_ft242 = kermeta.standard.helper.BooleanWrapper
										.or(test_ft242, result_lambda_ft242);
							}
						}
					}

					result_ft242 = test_ft242;
					//EIft:exists
					result_lambda_ft241 = result = kermeta.standard.helper.BooleanWrapper
							.and(
									kermeta.standard.helper.StringWrapper
											.equals(a_lbdExp241.getSource(),
													"http://www.eclipse.org/emf/2002/GenModel"),
									result_ft242);
					//EIle:func

					test_ft241 = kermeta.standard.helper.BooleanWrapper.or(
							test_ft241, result_lambda_ft241);
				}
			}
		}

		result_ft241 = test_ft241;

		//CE
		result = result_ft241;
		//EIft:exists

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addEntry(EAnnotation annotation, String key, String value) {

		ecore.EStringToStringMapEntry entry = ((ecore.EStringToStringMapEntry) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("ecore.EStringToStringMapEntry"));

		entry.setKey(key);

		entry.setValue(value);

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<ecore.EStringToStringMapEntry> convertAsOrderedSet(
						annotation.getDetails()).add(entry);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAnnotationGenModelImpl(EModelElement eModelElement,
			String body) {

		java.lang.Boolean idIfCond_1072 = false;
		//BIft:andThen

		java.lang.Boolean result_ft243 = null;

		java.lang.Boolean idIfCond_1073 = false;
		idIfCond_1073 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(eModelElement));

		if (idIfCond_1073) {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object v_lbdExp243 = null;

			result_ft243 = kermeta.standard.helper.BooleanWrapper.not(this
					.existsAnnotationGenModelImpl(eModelElement));
			//EIle:right

		} else {

			result_ft243 = false;
		}

		//CEC
		idIfCond_1072 = result_ft243;
		//EIft:andThen

		if (idIfCond_1072) {

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EAnnotation> convertAsOrderedSet(
							eModelElement.getEAnnotations()).add(
							this.create(
									"http://www.eclipse.org/emf/2002/GenModel",
									"body", body));
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation getKermetaEAnnotation(
			kermeta.language.structure.Object obj) {

		ecore.EAnnotation result = null;

		result = null;

		java.lang.Boolean idIfCond_1074 = false;
		idIfCond_1074 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(obj)));

		if (idIfCond_1074) {

			kermeta.language.structure.Property ecoreMEProp = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.containerSwitcher(obj).getPropertyValue(
							"ecoreModelElement");

			java.lang.Boolean idIfCond_1075 = false;
			idIfCond_1075 = kermeta.standard.helper.BooleanWrapper
					.and(
							kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(ecoreMEProp)),
							kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.getSwitcher(
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.containerSwitcher(obj),
															ecoreMEProp))));

			if (idIfCond_1075) {

				//BIft:detect

				ecore.EAnnotation result_ft244 = null;

				ecore.EAnnotation elem_ft244 = null;

				result_ft244 = null;

				{

					kermeta.standard.Iterator<ecore.EAnnotation> it_ft244 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<ecore.EAnnotation> convertAsOrderedSet(
									((ecore.EModelElement) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.getSwitcher(
																	org.kermeta.compil.runtime.helper.language.ObjectUtil
																			.containerSwitcher(obj),
																	ecoreMEProp),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"ecore.EModelElement")))
											.getEAnnotations()).iterator();
					java.lang.Boolean idLoopCond_1076 = false;
					while (!idLoopCond_1076) {
						idLoopCond_1076 = kermeta.standard.helper.BooleanWrapper
								.or(
										it_ft244.isOff(),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqualSwitcher(
														result_ft244, null));
						if (idLoopCond_1076) {
						} else {

							elem_ft244 = it_ft244.next();

							java.lang.Boolean idIfCond_1077 = false;
							//BIle:detector
							ecore.EAnnotation t_lbdExp244 = elem_ft244;

							idIfCond_1077 = kermeta.standard.helper.StringWrapper
									.equals(
											t_lbdExp244.getSource(),
											kermeta.standard.helper.StringWrapper
													.toString(km2ecore.helper.ecore.KermetaEAnnotationSource
															.getByName(
																	"kermeta")
															.getName()));
							//EIle:detector

							if (idIfCond_1077) {

								result_ft244 = elem_ft244;
							}

						}
					}
				}

				//CE
				result = result_ft244;
				//EIft:detect

				java.lang.Boolean idIfCond_1078 = false;
				idIfCond_1078 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(result);

				if (idIfCond_1078) {

					result = this.getEmptyKermetaEAnnotation();
				}

			}

		} else {

			result = this.getEmptyKermetaEAnnotation();
		}

		result = this.getEmptyKermetaEAnnotation();

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation createKermetaEAnnotation(String key, String value) {

		ecore.EAnnotation result = null;

		result = this.create(kermeta.standard.helper.StringWrapper
				.toString(km2ecore.helper.ecore.KermetaEAnnotationSource
						.getByName("kermeta").getName()), key, value);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation createAbstract() {

		ecore.EAnnotation result = null;

		result = this.createKermetaEAnnotation(
				kermeta.standard.helper.StringWrapper
						.toString(km2ecore.helper.ecore.KermetaEAnnotationKey
								.getByName("isAbstract").getName()), "true");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation getEmptyKermetaEAnnotation() {

		ecore.EAnnotation result = null;

		ecore.EAnnotation annotation = ((ecore.EAnnotation) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("ecore.EAnnotation"));

		annotation.setSource(kermeta.standard.helper.StringWrapper
				.toString(km2ecore.helper.ecore.KermetaEAnnotationSource
						.getByName("kermeta").getName()));

		result = annotation;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAnnotationPropSetter(EModelElement eModelElement, String body) {

		java.lang.Boolean idIfCond_1079 = false;
		idIfCond_1079 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(eModelElement));

		if (idIfCond_1079) {

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EAnnotation> convertAsOrderedSet(
							eModelElement.getEAnnotations()).add(
							this.create("kompiledderivedProp.setter", "body",
									body));
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation create(String source, String key, String value) {

		ecore.EAnnotation result = null;

		ecore.EAnnotation annotation = this.createEmpty(source);

		this.addEntry(annotation, key, value);

		result = annotation;

		return result;

	}

} //EAnnotationHelperImpl
