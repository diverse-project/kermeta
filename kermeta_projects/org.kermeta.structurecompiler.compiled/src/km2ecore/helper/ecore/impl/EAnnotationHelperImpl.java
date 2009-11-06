/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generated with Kermeta <http://www.kermeta.org>
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

		java.lang.Boolean idIfCond_1175 = false;
		idIfCond_1175 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(eModelElement));

		if (idIfCond_1175) {

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

		java.lang.Boolean result_ft266 = null;

		java.lang.Boolean test_ft266 = false;

		{

			kermeta.standard.Iterator<ecore.EAnnotation> it_ft266 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EAnnotation> convertAsOrderedSet(
							eModelElement.getEAnnotations()).iterator();
			java.lang.Boolean idLoopCond_1176 = false;
			while (!idLoopCond_1176) {
				idLoopCond_1176 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft266.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(test_ft266, false));
				if (idLoopCond_1176) {
				} else {

					java.lang.Boolean result_lambda_ft266 = null;
					//BIle:func
					ecore.EAnnotation a_lbdExp266 = it_ft266.next();

					//BIft:exists

					java.lang.Boolean result_ft267 = null;

					java.lang.Boolean test_ft267 = false;

					{

						kermeta.standard.Iterator<ecore.EStringToStringMapEntry> it_ft267 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<ecore.EStringToStringMapEntry> convertAsOrderedSet(
										a_lbdExp266.getDetails()).iterator();
						java.lang.Boolean idLoopCond_1177 = false;
						while (!idLoopCond_1177) {
							idLoopCond_1177 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft267.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															test_ft267, false));
							if (idLoopCond_1177) {
							} else {

								java.lang.Boolean result_lambda_ft267 = null;
								//BIle:func
								ecore.EStringToStringMapEntry d_lbdExp267 = it_ft267
										.next();

								result_lambda_ft267 = kermeta.standard.helper.StringWrapper
										.equals(d_lbdExp267.getKey(), "body");
								//EIle:func

								test_ft267 = kermeta.standard.helper.BooleanWrapper
										.or(test_ft267, result_lambda_ft267);
							}
						}
					}

					result_ft267 = test_ft267;
					//EIft:exists
					result_lambda_ft266 = result = kermeta.standard.helper.BooleanWrapper
							.and(
									kermeta.standard.helper.StringWrapper
											.equals(a_lbdExp266.getSource(),
													"http://www.eclipse.org/emf/2002/GenModel"),
									result_ft267);
					//EIle:func

					test_ft266 = kermeta.standard.helper.BooleanWrapper.or(
							test_ft266, result_lambda_ft266);
				}
			}
		}

		result_ft266 = test_ft266;

		//CE
		result = result_ft266;
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

		java.lang.Boolean result_ft268 = null;

		java.lang.Boolean test_ft268 = false;

		{

			kermeta.standard.Iterator<ecore.EAnnotation> it_ft268 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EAnnotation> convertAsOrderedSet(
							eModelElement.getEAnnotations()).iterator();
			java.lang.Boolean idLoopCond_1178 = false;
			while (!idLoopCond_1178) {
				idLoopCond_1178 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft268.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(test_ft268, false));
				if (idLoopCond_1178) {
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
						java.lang.Boolean idLoopCond_1179 = false;
						while (!idLoopCond_1179) {
							idLoopCond_1179 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft269.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															test_ft269, false));
							if (idLoopCond_1179) {
							} else {

								java.lang.Boolean result_lambda_ft269 = null;
								//BIle:func
								ecore.EStringToStringMapEntry d_lbdExp269 = it_ft269
										.next();

								result_lambda_ft269 = kermeta.standard.helper.BooleanWrapper
										.and(
												kermeta.standard.helper.StringWrapper
														.equals(
																d_lbdExp269
																		.getKey(),
																kermeta.standard.helper.StringWrapper
																		.toString(km2ecore.helper.ecore.KermetaEAnnotationKey
																				.getByName(
																						"ecore")
																				.getName())),
												kermeta.standard.helper.StringWrapper
														.equals(d_lbdExp269
																.getValue(),
																"true"));
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
											.equals(
													a_lbdExp268.getSource(),
													kermeta.standard.helper.StringWrapper
															.toString(km2ecore.helper.ecore.KermetaEAnnotationSource
																	.getByName(
																			"kermeta")
																	.getName())),
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
	public void addAnnotationGenModelImpl(EModelElement eModelElement,
			String body) {

		java.lang.Boolean idIfCond_1180 = false;
		//BIft:andThen

		java.lang.Boolean result_ft270 = null;

		java.lang.Boolean idIfCond_1181 = false;
		idIfCond_1181 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(eModelElement));

		if (idIfCond_1181) {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object v_lbdExp270 = null;

			result_ft270 = kermeta.standard.helper.BooleanWrapper.not(this
					.existsAnnotationGenModelImpl(eModelElement));
			//EIle:right

		} else {

			result_ft270 = false;
		}

		//CEC
		idIfCond_1180 = result_ft270;
		//EIft:andThen

		if (idIfCond_1180) {

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

		java.lang.Boolean idIfCond_1182 = false;
		idIfCond_1182 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(obj)));

		if (idIfCond_1182) {

			kermeta.language.structure.Property ecoreMEProp = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.containerSwitcher(obj).getPropertyValue(
							"ecoreModelElement");

			java.lang.Boolean idIfCond_1183 = false;
			idIfCond_1183 = kermeta.standard.helper.BooleanWrapper
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

			if (idIfCond_1183) {

				//BIft:detect

				ecore.EAnnotation result_ft271 = null;

				ecore.EAnnotation elem_ft271 = null;

				result_ft271 = null;

				{

					kermeta.standard.Iterator<ecore.EAnnotation> it_ft271 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
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
					java.lang.Boolean idLoopCond_1184 = false;
					while (!idLoopCond_1184) {
						idLoopCond_1184 = kermeta.standard.helper.BooleanWrapper
								.or(
										it_ft271.isOff(),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqualSwitcher(
														result_ft271, null));
						if (idLoopCond_1184) {
						} else {

							elem_ft271 = it_ft271.next();

							java.lang.Boolean idIfCond_1185 = false;
							//BIle:detector
							ecore.EAnnotation t_lbdExp271 = elem_ft271;

							idIfCond_1185 = kermeta.standard.helper.StringWrapper
									.equals(
											t_lbdExp271.getSource(),
											kermeta.standard.helper.StringWrapper
													.toString(km2ecore.helper.ecore.KermetaEAnnotationSource
															.getByName(
																	"kermeta")
															.getName()));
							//EIle:detector

							if (idIfCond_1185) {

								result_ft271 = elem_ft271;
							}

						}
					}
				}

				//CE
				result = result_ft271;
				//EIft:detect

				java.lang.Boolean idIfCond_1186 = false;
				idIfCond_1186 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(result);

				if (idIfCond_1186) {

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
	public void addAnnotationPropSetter(EModelElement eModelElement, String body) {

		java.lang.Boolean idIfCond_1187 = false;
		idIfCond_1187 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(eModelElement));

		if (idIfCond_1187) {

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
