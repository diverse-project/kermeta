/**
 * <copyright>
 * </copyright>
 *
 * $Id: EAnnotationHelperImpl.java,v 1.5 2008-10-16 13:18:18 cfaucher Exp $
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

		java.lang.Boolean idIfCond_11 = false;
		idIfCond_11 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(eModelElement));

		if (idIfCond_11) {

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

		java.lang.Boolean result_ft2 = null;

		java.lang.Boolean test_ft2 = false;

		{

			kermeta.standard.Iterator<ecore.EAnnotation> it_ft2 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EAnnotation> convertAsOrderedSet(
							eModelElement.getEAnnotations()).iterator();
			java.lang.Boolean idLoopCond_12 = false;
			while (!idLoopCond_12) {
				idLoopCond_12 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft2.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(test_ft2, false));
				if (idLoopCond_12) {
				} else {

					java.lang.Boolean result_lambda_ft2 = null;
					//BIle:func
					ecore.EAnnotation a_lbdExp2 = it_ft2.next();

					//BIft:exists

					java.lang.Boolean result_ft3 = null;

					java.lang.Boolean test_ft3 = false;

					{

						kermeta.standard.Iterator<ecore.EStringToStringMapEntry> it_ft3 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<ecore.EStringToStringMapEntry> convertAsOrderedSet(
										a_lbdExp2.getDetails()).iterator();
						java.lang.Boolean idLoopCond_13 = false;
						while (!idLoopCond_13) {
							idLoopCond_13 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft3.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqual(test_ft3, false));
							if (idLoopCond_13) {
							} else {

								java.lang.Boolean result_lambda_ft3 = null;
								//BIle:func
								ecore.EStringToStringMapEntry d_lbdExp3 = it_ft3
										.next();

								result_lambda_ft3 = kermeta.standard.helper.StringWrapper
										.equals(d_lbdExp3.getKey(), "body");
								//EIle:func

								test_ft3 = kermeta.standard.helper.BooleanWrapper
										.or(test_ft3, result_lambda_ft3);
							}
						}
					}

					result_ft3 = test_ft3;
					//EIft:exists
					result_lambda_ft2 = result = kermeta.standard.helper.BooleanWrapper
							.and(
									kermeta.standard.helper.StringWrapper
											.equals(a_lbdExp2.getSource(),
													"http://www.eclipse.org/emf/2002/GenModel"),
									result_ft3);
					//EIle:func

					test_ft2 = kermeta.standard.helper.BooleanWrapper.or(
							test_ft2, result_lambda_ft2);
				}
			}
		}

		result_ft2 = test_ft2;

		//CE
		result = result_ft2;
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

		java.lang.Boolean idIfCond_14 = false;
		//BIft:andThen

		java.lang.Boolean result_ft4 = null;

		java.lang.Boolean idIfCond_15 = false;
		idIfCond_15 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(eModelElement));

		if (idIfCond_15) {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object v_lbdExp4 = null;

			result_ft4 = kermeta.standard.helper.BooleanWrapper.not(this
					.existsAnnotationGenModelImpl(eModelElement));
			//EIle:right

		} else {

			result_ft4 = false;
		}

		//CEC
		idIfCond_14 = result_ft4;
		//EIft:andThen

		if (idIfCond_14) {

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
	public EAnnotation getKermetaEAnnotation(
			kermeta.language.structure.Object obj) {

		ecore.EAnnotation result = null;

		result = null;

		java.lang.Boolean idIfCond_16 = false;
		idIfCond_16 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.container(obj)));

		if (idIfCond_16) {

			kermeta.language.structure.Property ecoreMEProp = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.container(obj).getPropertyValue("ecoreModelElement");

			java.lang.Boolean idIfCond_17 = false;
			idIfCond_17 = kermeta.standard.helper.BooleanWrapper
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

			if (idIfCond_17) {

				//BIft:detect

				ecore.EAnnotation result_ft5 = null;

				ecore.EAnnotation elem_ft5 = null;

				result_ft5 = null;

				{

					kermeta.standard.Iterator<ecore.EAnnotation> it_ft5 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
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
					java.lang.Boolean idLoopCond_18 = false;
					while (!idLoopCond_18) {
						idLoopCond_18 = kermeta.standard.helper.BooleanWrapper
								.or(
										it_ft5.isOff(),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqual(result_ft5, null));
						if (idLoopCond_18) {
						} else {

							elem_ft5 = it_ft5.next();

							java.lang.Boolean idIfCond_19 = false;
							//BIle:detector
							ecore.EAnnotation t_lbdExp5 = elem_ft5;

							idIfCond_19 = kermeta.standard.helper.StringWrapper
									.equals(
											t_lbdExp5.getSource(),
											kermeta.standard.helper.StringWrapper
													.toString(km2ecore.helper.ecore.KermetaEAnnotationSource
															.getByName(
																	"kermeta")
															.getName()));
							//EIle:detector

							if (idIfCond_19) {

								result_ft5 = elem_ft5;
							}

						}
					}
				}

				//CE
				result = result_ft5;
				//EIft:detect

				java.lang.Boolean idIfCond_20 = false;
				idIfCond_20 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(result);

				if (idIfCond_20) {

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
	public void addAnnotationPropSetter(EModelElement eModelElement, String body) {

		java.lang.Boolean idIfCond_21 = false;
		idIfCond_21 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(eModelElement));

		if (idIfCond_21) {

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
