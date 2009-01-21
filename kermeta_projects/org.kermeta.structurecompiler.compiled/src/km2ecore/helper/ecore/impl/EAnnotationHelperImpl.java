/**
 * <copyright>
 * </copyright>
 *
 * $Id: EAnnotationHelperImpl.java,v 1.10 2009-01-21 09:16:06 cfaucher Exp $
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

		java.lang.Boolean idIfCond_1105 = false;
		idIfCond_1105 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(eModelElement));

		if (idIfCond_1105) {

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
				.newObject(ecore.EcorePackage.eINSTANCE.getEAnnotation()));

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

		java.lang.Boolean result_ft251 = null;

		java.lang.Boolean test_ft251 = false;

		{

			kermeta.standard.Iterator<ecore.EAnnotation> it_ft251 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EAnnotation> convertAsOrderedSet(
							eModelElement.getEAnnotations()).iterator();
			java.lang.Boolean idLoopCond_1106 = false;
			while (!idLoopCond_1106) {
				idLoopCond_1106 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft251.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(test_ft251, false));
				if (idLoopCond_1106) {
				} else {

					java.lang.Boolean result_lambda_ft251 = null;
					//BIle:func
					ecore.EAnnotation a_lbdExp251 = it_ft251.next();

					//BIft:exists

					java.lang.Boolean result_ft252 = null;

					java.lang.Boolean test_ft252 = false;

					{

						kermeta.standard.Iterator<ecore.EStringToStringMapEntry> it_ft252 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<ecore.EStringToStringMapEntry> convertAsOrderedSet(
										a_lbdExp251.getDetails()).iterator();
						java.lang.Boolean idLoopCond_1107 = false;
						while (!idLoopCond_1107) {
							idLoopCond_1107 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft252.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															test_ft252, false));
							if (idLoopCond_1107) {
							} else {

								java.lang.Boolean result_lambda_ft252 = null;
								//BIle:func
								ecore.EStringToStringMapEntry d_lbdExp252 = it_ft252
										.next();

								result_lambda_ft252 = kermeta.standard.helper.StringWrapper
										.equals(d_lbdExp252.getKey(), "body");
								//EIle:func

								test_ft252 = kermeta.standard.helper.BooleanWrapper
										.or(test_ft252, result_lambda_ft252);
							}
						}
					}

					result_ft252 = test_ft252;
					//EIft:exists
					result_lambda_ft251 = result = kermeta.standard.helper.BooleanWrapper
							.and(
									kermeta.standard.helper.StringWrapper
											.equals(a_lbdExp251.getSource(),
													"http://www.eclipse.org/emf/2002/GenModel"),
									result_ft252);
					//EIle:func

					test_ft251 = kermeta.standard.helper.BooleanWrapper.or(
							test_ft251, result_lambda_ft251);
				}
			}
		}

		result_ft251 = test_ft251;

		//CE
		result = result_ft251;
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
				.newObject(ecore.EcorePackage.eINSTANCE
						.getEStringToStringMapEntry()));

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

		java.lang.Boolean idIfCond_1108 = false;
		//BIft:andThen

		java.lang.Boolean result_ft253 = null;

		java.lang.Boolean idIfCond_1109 = false;
		idIfCond_1109 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(eModelElement));

		if (idIfCond_1109) {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object v_lbdExp253 = null;

			result_ft253 = kermeta.standard.helper.BooleanWrapper.not(this
					.existsAnnotationGenModelImpl(eModelElement));
			//EIle:right

		} else {

			result_ft253 = false;
		}

		//CEC
		idIfCond_1108 = result_ft253;
		//EIft:andThen

		if (idIfCond_1108) {

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

		java.lang.Boolean idIfCond_1110 = false;
		idIfCond_1110 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(obj)));

		if (idIfCond_1110) {

			kermeta.language.structure.Property ecoreMEProp = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.containerSwitcher(obj).getPropertyValue(
							"ecoreModelElement");

			java.lang.Boolean idIfCond_1111 = false;
			idIfCond_1111 = kermeta.standard.helper.BooleanWrapper
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

			if (idIfCond_1111) {

				//BIft:detect

				ecore.EAnnotation result_ft254 = null;

				ecore.EAnnotation elem_ft254 = null;

				result_ft254 = null;

				{

					kermeta.standard.Iterator<ecore.EAnnotation> it_ft254 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
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
					java.lang.Boolean idLoopCond_1112 = false;
					while (!idLoopCond_1112) {
						idLoopCond_1112 = kermeta.standard.helper.BooleanWrapper
								.or(
										it_ft254.isOff(),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqualSwitcher(
														result_ft254, null));
						if (idLoopCond_1112) {
						} else {

							elem_ft254 = it_ft254.next();

							java.lang.Boolean idIfCond_1113 = false;
							//BIle:detector
							ecore.EAnnotation t_lbdExp254 = elem_ft254;

							idIfCond_1113 = kermeta.standard.helper.StringWrapper
									.equals(
											t_lbdExp254.getSource(),
											kermeta.standard.helper.StringWrapper
													.toString(km2ecore.helper.ecore.KermetaEAnnotationSource
															.getByName(
																	"kermeta")
															.getName()));
							//EIle:detector

							if (idIfCond_1113) {

								result_ft254 = elem_ft254;
							}

						}
					}
				}

				//CE
				result = result_ft254;
				//EIft:detect

				java.lang.Boolean idIfCond_1114 = false;
				idIfCond_1114 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(result);

				if (idIfCond_1114) {

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
	public void addAnnotationPropSetter(EModelElement eModelElement, String body) {

		java.lang.Boolean idIfCond_1115 = false;
		idIfCond_1115 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(eModelElement));

		if (idIfCond_1115) {

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
	public EAnnotation getEmptyKermetaEAnnotation() {

		ecore.EAnnotation result = null;

		ecore.EAnnotation annotation = ((ecore.EAnnotation) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(ecore.EcorePackage.eINSTANCE.getEAnnotation()));

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
	public EAnnotation create(String source, String key, String value) {

		ecore.EAnnotation result = null;

		ecore.EAnnotation annotation = this.createEmpty(source);

		this.addEntry(annotation, key, value);

		result = annotation;

		return result;

	}

} //EAnnotationHelperImpl
