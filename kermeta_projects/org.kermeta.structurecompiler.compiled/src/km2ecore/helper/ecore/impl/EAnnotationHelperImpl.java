/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
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

		java.lang.Boolean idIfCond_1169 = false;
		idIfCond_1169 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(eModelElement));

		if (idIfCond_1169) {

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

		java.lang.Boolean result_ft268 = null;

		java.lang.Boolean test_ft268 = false;

		{

			kermeta.standard.Iterator<ecore.EAnnotation> it_ft268 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EAnnotation> convertAsOrderedSet(
							eModelElement.getEAnnotations()).iterator();
			java.lang.Boolean idLoopCond_1170 = false;
			while (!idLoopCond_1170) {
				idLoopCond_1170 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft268.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(test_ft268, false));
				if (idLoopCond_1170) {
				} else {

					java.lang.Boolean result_lambda_ft268 = null;
					//BIle:func
					ecore.EAnnotation a_lbdExp268 = it_ft268.next();

					//BIft:exists

					java.lang.Boolean result_ft269 = null;

					java.lang.Boolean test_ft269 = false;

					{

						kermeta.standard.Iterator<ecore.EStringToStringMapEntry> it_ft269 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<ecore.EStringToStringMapEntry> convertAsOrderedSet(
										a_lbdExp268.getDetails()).iterator();
						java.lang.Boolean idLoopCond_1171 = false;
						while (!idLoopCond_1171) {
							idLoopCond_1171 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft269.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															test_ft269, false));
							if (idLoopCond_1171) {
							} else {

								java.lang.Boolean result_lambda_ft269 = null;
								//BIle:func
								ecore.EStringToStringMapEntry d_lbdExp269 = it_ft269
										.next();

								result_lambda_ft269 = kermeta.standard.helper.StringWrapper
										.equals(d_lbdExp269.getKey(), "body");
								//EIle:func

								test_ft269 = kermeta.standard.helper.BooleanWrapper
										.or(test_ft269, result_lambda_ft269);
							}
						}
					}

					result_ft269 = test_ft269;
					//EIft:exists
					result_lambda_ft268 = result = kermeta.standard.helper.BooleanWrapper
							.and(
									kermeta.standard.helper.StringWrapper
											.equals(a_lbdExp268.getSource(),
													"http://www.eclipse.org/emf/2002/GenModel"),
									result_ft269);
					//EIle:func

					test_ft268 = kermeta.standard.helper.BooleanWrapper.or(
							test_ft268, result_lambda_ft268);
				}
			}
		}

		result_ft268 = test_ft268;

		//CE
		result = result_ft268;
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
	public Boolean isFromAnEcoreMetamodel(EModelElement eModelElement) {

		java.lang.Boolean result = null;

		//BIft:exists

		java.lang.Boolean result_ft270 = null;

		java.lang.Boolean test_ft270 = false;

		{

			kermeta.standard.Iterator<ecore.EAnnotation> it_ft270 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EAnnotation> convertAsOrderedSet(
							eModelElement.getEAnnotations()).iterator();
			java.lang.Boolean idLoopCond_1172 = false;
			while (!idLoopCond_1172) {
				idLoopCond_1172 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft270.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(test_ft270, false));
				if (idLoopCond_1172) {
				} else {

					java.lang.Boolean result_lambda_ft270 = null;
					//BIle:func
					ecore.EAnnotation a_lbdExp270 = it_ft270.next();

					//BIft:exists

					java.lang.Boolean result_ft271 = null;

					java.lang.Boolean test_ft271 = false;

					{

						kermeta.standard.Iterator<ecore.EStringToStringMapEntry> it_ft271 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<ecore.EStringToStringMapEntry> convertAsOrderedSet(
										a_lbdExp270.getDetails()).iterator();
						java.lang.Boolean idLoopCond_1173 = false;
						while (!idLoopCond_1173) {
							idLoopCond_1173 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft271.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															test_ft271, false));
							if (idLoopCond_1173) {
							} else {

								java.lang.Boolean result_lambda_ft271 = null;
								//BIle:func
								ecore.EStringToStringMapEntry d_lbdExp271 = it_ft271
										.next();

								result_lambda_ft271 = kermeta.standard.helper.BooleanWrapper
										.and(
												kermeta.standard.helper.StringWrapper
														.equals(
																d_lbdExp271
																		.getKey(),
																kermeta.standard.helper.StringWrapper
																		.toString(km2ecore.helper.ecore.KermetaEAnnotationKey
																				.getByName(
																						"ecore")
																				.getName())),
												kermeta.standard.helper.StringWrapper
														.equals(d_lbdExp271
																.getValue(),
																"true"));
								//EIle:func

								test_ft271 = kermeta.standard.helper.BooleanWrapper
										.or(test_ft271, result_lambda_ft271);
							}
						}
					}

					result_ft271 = test_ft271;
					//EIft:exists
					result_lambda_ft270 = result = kermeta.standard.helper.BooleanWrapper
							.and(
									kermeta.standard.helper.StringWrapper
											.equals(
													a_lbdExp270.getSource(),
													kermeta.standard.helper.StringWrapper
															.toString(km2ecore.helper.ecore.KermetaEAnnotationSource
																	.getByName(
																			"kermeta")
																	.getName())),
									result_ft271);
					//EIle:func

					test_ft270 = kermeta.standard.helper.BooleanWrapper.or(
							test_ft270, result_lambda_ft270);
				}
			}
		}

		result_ft270 = test_ft270;

		//CE
		result = result_ft270;
		//EIft:exists

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAnnotationGenModelImpl(EModelElement eModelElement,
			String body) {

		java.lang.Boolean idIfCond_1174 = false;
		//BIft:andThen

		java.lang.Boolean result_ft272 = null;

		java.lang.Boolean idIfCond_1175 = false;
		idIfCond_1175 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(eModelElement));

		if (idIfCond_1175) {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object v_lbdExp272 = null;

			result_ft272 = kermeta.standard.helper.BooleanWrapper.not(this
					.existsAnnotationGenModelImpl(eModelElement));
			//EIle:right

		} else {

			result_ft272 = false;
		}

		//CEC
		idIfCond_1174 = result_ft272;
		//EIft:andThen

		if (idIfCond_1174) {

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
	public EAnnotation getKermetaEAnnotation(
			kermeta.language.structure.Object obj) {

		ecore.EAnnotation result = null;

		result = null;

		java.lang.Boolean idIfCond_1176 = false;
		idIfCond_1176 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(obj)));

		if (idIfCond_1176) {

			kermeta.language.structure.Property ecoreMEProp = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.containerSwitcher(obj).getPropertyValue(
							"ecoreModelElement");

			java.lang.Boolean idIfCond_1177 = false;
			idIfCond_1177 = kermeta.standard.helper.BooleanWrapper
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

			if (idIfCond_1177) {

				//BIft:detect

				ecore.EAnnotation result_ft273 = null;

				ecore.EAnnotation elem_ft273 = null;

				result_ft273 = null;

				{

					kermeta.standard.Iterator<ecore.EAnnotation> it_ft273 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
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
					java.lang.Boolean idLoopCond_1178 = false;
					while (!idLoopCond_1178) {
						idLoopCond_1178 = kermeta.standard.helper.BooleanWrapper
								.or(
										it_ft273.isOff(),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqualSwitcher(
														result_ft273, null));
						if (idLoopCond_1178) {
						} else {

							elem_ft273 = it_ft273.next();

							java.lang.Boolean idIfCond_1179 = false;
							//BIle:detector
							ecore.EAnnotation t_lbdExp273 = elem_ft273;

							idIfCond_1179 = kermeta.standard.helper.StringWrapper
									.equals(
											t_lbdExp273.getSource(),
											kermeta.standard.helper.StringWrapper
													.toString(km2ecore.helper.ecore.KermetaEAnnotationSource
															.getByName(
																	"kermeta")
															.getName()));
							//EIle:detector

							if (idIfCond_1179) {

								result_ft273 = elem_ft273;
							}

						}
					}
				}

				//CE
				result = result_ft273;
				//EIft:detect

				java.lang.Boolean idIfCond_1180 = false;
				idIfCond_1180 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(result);

				if (idIfCond_1180) {

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
	public void addAnnotationPropSetter(EModelElement eModelElement, String body) {

		java.lang.Boolean idIfCond_1181 = false;
		idIfCond_1181 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(eModelElement));

		if (idIfCond_1181) {

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
