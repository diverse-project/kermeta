/**
 * <copyright>
 * </copyright>
 *
 * $Id: EAnnotationHelperImpl.java,v 1.4 2008-10-08 14:38:02 cfaucher Exp $
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

		java.lang.Boolean idIfCond_1011 = false;
		idIfCond_1011 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(eModelElement));

		if (idIfCond_1011) {

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

		java.lang.Boolean result_ft230 = null;

		java.lang.Boolean test_ft230 = false;

		{

			kermeta.standard.Iterator<ecore.EAnnotation> it_ft230 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EAnnotation> convertAsOrderedSet(
							eModelElement.getEAnnotations()).iterator();
			java.lang.Boolean idLoopCond_1012 = false;
			while (!idLoopCond_1012) {
				idLoopCond_1012 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft230.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(test_ft230, false));
				if (idLoopCond_1012) {
				} else {

					java.lang.Boolean result_lambda_ft230 = null;
					//BIle:func
					ecore.EAnnotation a_lbdExp230 = it_ft230.next();

					//BIft:exists

					java.lang.Boolean result_ft231 = null;

					java.lang.Boolean test_ft231 = false;

					{

						kermeta.standard.Iterator<ecore.EStringToStringMapEntry> it_ft231 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<ecore.EStringToStringMapEntry> convertAsOrderedSet(
										a_lbdExp230.getDetails()).iterator();
						java.lang.Boolean idLoopCond_1013 = false;
						while (!idLoopCond_1013) {
							idLoopCond_1013 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft231.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqual(test_ft231,
															false));
							if (idLoopCond_1013) {
							} else {

								java.lang.Boolean result_lambda_ft231 = null;
								//BIle:func
								ecore.EStringToStringMapEntry d_lbdExp231 = it_ft231
										.next();

								result_lambda_ft231 = kermeta.standard.helper.StringWrapper
										.equals(d_lbdExp231.getKey(), "body");
								//EIle:func

								test_ft231 = kermeta.standard.helper.BooleanWrapper
										.or(test_ft231, result_lambda_ft231);
							}
						}
					}

					result_ft231 = test_ft231;
					//EIft:exists
					result_lambda_ft230 = result = kermeta.standard.helper.BooleanWrapper
							.and(
									kermeta.standard.helper.StringWrapper
											.equals(a_lbdExp230.getSource(),
													"http://www.eclipse.org/emf/2002/GenModel"),
									result_ft231);
					//EIle:func

					test_ft230 = kermeta.standard.helper.BooleanWrapper.or(
							test_ft230, result_lambda_ft230);
				}
			}
		}

		result_ft230 = test_ft230;

		//CE
		result = result_ft230;
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

		java.lang.Boolean idIfCond_1014 = false;
		//BIft:andThen

		java.lang.Boolean result_ft232 = null;

		java.lang.Boolean idIfCond_1015 = false;
		idIfCond_1015 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(eModelElement));

		if (idIfCond_1015) {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object v_lbdExp232 = null;

			result_ft232 = kermeta.standard.helper.BooleanWrapper.not(this
					.existsAnnotationGenModelImpl(eModelElement));
			//EIle:right

		} else {

			result_ft232 = false;
		}

		//CEC
		idIfCond_1014 = result_ft232;
		//EIft:andThen

		if (idIfCond_1014) {

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

		java.lang.Boolean idIfCond_1016 = false;
		idIfCond_1016 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.container(obj)));

		if (idIfCond_1016) {

			kermeta.language.structure.Property ecoreMEProp = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.container(obj).getPropertyValue("ecoreModelElement");

			java.lang.Boolean idIfCond_1017 = false;
			idIfCond_1017 = kermeta.standard.helper.BooleanWrapper
					.and(
							kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoid(ecoreMEProp)),
							kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.get(
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.container(obj),
															ecoreMEProp))));

			if (idIfCond_1017) {

				//BIft:detect

				ecore.EAnnotation result_ft233 = null;

				ecore.EAnnotation elem_ft233 = null;

				result_ft233 = null;

				{

					kermeta.standard.Iterator<ecore.EAnnotation> it_ft233 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<ecore.EAnnotation> convertAsOrderedSet(
									((ecore.EModelElement) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asType(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.get(
																	org.kermeta.compil.runtime.helper.language.ObjectUtil
																			.container(obj),
																	ecoreMEProp),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"ecore.EModelElement")))
											.getEAnnotations()).iterator();
					java.lang.Boolean idLoopCond_1018 = false;
					while (!idLoopCond_1018) {
						idLoopCond_1018 = kermeta.standard.helper.BooleanWrapper
								.or(
										it_ft233.isOff(),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqual(result_ft233, null));
						if (idLoopCond_1018) {
						} else {

							elem_ft233 = it_ft233.next();

							java.lang.Boolean idIfCond_1019 = false;
							//BIle:detector
							ecore.EAnnotation t_lbdExp233 = elem_ft233;

							idIfCond_1019 = kermeta.standard.helper.StringWrapper
									.equals(
											t_lbdExp233.getSource(),
											kermeta.standard.helper.StringWrapper
													.toString(km2ecore.helper.ecore.KermetaEAnnotationSource
															.getByName(
																	"kermeta")
															.getName()));
							//EIle:detector

							if (idIfCond_1019) {

								result_ft233 = elem_ft233;
							}

						}
					}
				}

				//CE
				result = result_ft233;
				//EIft:detect

				java.lang.Boolean idIfCond_1020 = false;
				idIfCond_1020 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(result);

				if (idIfCond_1020) {

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
	public void addAnnotationPropSetter(EModelElement eModelElement, String body) {

		java.lang.Boolean idIfCond_1021 = false;
		idIfCond_1021 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(eModelElement));

		if (idIfCond_1021) {

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
	public EAnnotation create(String source, String key, String value) {

		ecore.EAnnotation result = null;

		ecore.EAnnotation annotation = this.createEmpty(source);

		this.addEntry(annotation, key, value);

		result = annotation;

		return result;

	}

} //EAnnotationHelperImpl
