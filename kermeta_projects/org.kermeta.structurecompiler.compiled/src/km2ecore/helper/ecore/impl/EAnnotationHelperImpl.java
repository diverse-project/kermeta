/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: EAnnotationHelperImpl.java,v 1.11 2009-02-10 17:52:00 cfaucher Exp $
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

		java.lang.Boolean idIfCond_42 = false;
		idIfCond_42 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(eModelElement));

		if (idIfCond_42) {

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

		java.lang.Boolean result_ft7 = null;

		java.lang.Boolean test_ft7 = false;

		{

			kermeta.standard.Iterator<ecore.EAnnotation> it_ft7 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EAnnotation> convertAsOrderedSet(
							eModelElement.getEAnnotations()).iterator();
			java.lang.Boolean idLoopCond_43 = false;
			while (!idLoopCond_43) {
				idLoopCond_43 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft7.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(test_ft7, false));
				if (idLoopCond_43) {
				} else {

					java.lang.Boolean result_lambda_ft7 = null;
					//BIle:func
					ecore.EAnnotation a_lbdExp7 = it_ft7.next();

					//BIft:exists

					java.lang.Boolean result_ft8 = null;

					java.lang.Boolean test_ft8 = false;

					{

						kermeta.standard.Iterator<ecore.EStringToStringMapEntry> it_ft8 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<ecore.EStringToStringMapEntry> convertAsOrderedSet(
										a_lbdExp7.getDetails()).iterator();
						java.lang.Boolean idLoopCond_44 = false;
						while (!idLoopCond_44) {
							idLoopCond_44 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft8.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															test_ft8, false));
							if (idLoopCond_44) {
							} else {

								java.lang.Boolean result_lambda_ft8 = null;
								//BIle:func
								ecore.EStringToStringMapEntry d_lbdExp8 = it_ft8
										.next();

								result_lambda_ft8 = kermeta.standard.helper.StringWrapper
										.equals(d_lbdExp8.getKey(), "body");
								//EIle:func

								test_ft8 = kermeta.standard.helper.BooleanWrapper
										.or(test_ft8, result_lambda_ft8);
							}
						}
					}

					result_ft8 = test_ft8;
					//EIft:exists
					result_lambda_ft7 = result = kermeta.standard.helper.BooleanWrapper
							.and(
									kermeta.standard.helper.StringWrapper
											.equals(a_lbdExp7.getSource(),
													"http://www.eclipse.org/emf/2002/GenModel"),
									result_ft8);
					//EIle:func

					test_ft7 = kermeta.standard.helper.BooleanWrapper.or(
							test_ft7, result_lambda_ft7);
				}
			}
		}

		result_ft7 = test_ft7;

		//CE
		result = result_ft7;
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

		java.lang.Boolean idIfCond_45 = false;
		//BIft:andThen

		java.lang.Boolean result_ft9 = null;

		java.lang.Boolean idIfCond_46 = false;
		idIfCond_46 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(eModelElement));

		if (idIfCond_46) {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object v_lbdExp9 = null;

			result_ft9 = kermeta.standard.helper.BooleanWrapper.not(this
					.existsAnnotationGenModelImpl(eModelElement));
			//EIle:right

		} else {

			result_ft9 = false;
		}

		//CEC
		idIfCond_45 = result_ft9;
		//EIft:andThen

		if (idIfCond_45) {

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
	public EAnnotation getKermetaEAnnotation(
			kermeta.language.structure.Object obj) {

		ecore.EAnnotation result = null;

		result = null;

		java.lang.Boolean idIfCond_47 = false;
		idIfCond_47 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(obj)));

		if (idIfCond_47) {

			kermeta.language.structure.Property ecoreMEProp = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.containerSwitcher(obj).getPropertyValue(
							"ecoreModelElement");

			java.lang.Boolean idIfCond_48 = false;
			idIfCond_48 = kermeta.standard.helper.BooleanWrapper
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

			if (idIfCond_48) {

				//BIft:detect

				ecore.EAnnotation result_ft10 = null;

				ecore.EAnnotation elem_ft10 = null;

				result_ft10 = null;

				{

					kermeta.standard.Iterator<ecore.EAnnotation> it_ft10 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
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
					java.lang.Boolean idLoopCond_49 = false;
					while (!idLoopCond_49) {
						idLoopCond_49 = kermeta.standard.helper.BooleanWrapper
								.or(
										it_ft10.isOff(),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqualSwitcher(
														result_ft10, null));
						if (idLoopCond_49) {
						} else {

							elem_ft10 = it_ft10.next();

							java.lang.Boolean idIfCond_50 = false;
							//BIle:detector
							ecore.EAnnotation t_lbdExp10 = elem_ft10;

							idIfCond_50 = kermeta.standard.helper.StringWrapper
									.equals(
											t_lbdExp10.getSource(),
											kermeta.standard.helper.StringWrapper
													.toString(km2ecore.helper.ecore.KermetaEAnnotationSource
															.getByName(
																	"kermeta")
															.getName()));
							//EIle:detector

							if (idIfCond_50) {

								result_ft10 = elem_ft10;
							}

						}
					}
				}

				//CE
				result = result_ft10;
				//EIft:detect

				java.lang.Boolean idIfCond_51 = false;
				idIfCond_51 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(result);

				if (idIfCond_51) {

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

		java.lang.Boolean idIfCond_52 = false;
		idIfCond_52 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(eModelElement));

		if (idIfCond_52) {

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
