/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: EAnnotationHelperImpl.java,v 1.12 2009-02-23 15:26:56 cfaucher Exp $
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
	public java.lang.Boolean isFromAnEcoreMetamodel( ecore.EModelElement eModelElement ) {

		java.lang.Boolean result = null;

			//BIft:exists

		java.lang.Boolean result_ft4 = null;

			java.lang.Boolean test_ft4 = false;

			
		{

			kermeta.standard.Iterator<ecore.EAnnotation> it_ft4 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).iterator();
			java.lang.Boolean idLoopCond_15 = false;
			while( !idLoopCond_15 ) {
			idLoopCond_15 = kermeta.standard.helper.BooleanWrapper.or(it_ft4.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft4, false));
			if ( idLoopCond_15 ) {
			} else {

		java.lang.Boolean result_lambda_ft4 = null;
		//BIle:func
		ecore.EAnnotation a_lbdExp4 = it_ft4.next();

			//BIft:exists

		java.lang.Boolean result_ft5 = null;

			java.lang.Boolean test_ft5 = false;

			
		{

			kermeta.standard.Iterator<ecore.EStringToStringMapEntry> it_ft5 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStringToStringMapEntry>convertAsOrderedSet(a_lbdExp4.getDetails()).iterator();
			java.lang.Boolean idLoopCond_16 = false;
			while( !idLoopCond_16 ) {
			idLoopCond_16 = kermeta.standard.helper.BooleanWrapper.or(it_ft5.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft5, false));
			if ( idLoopCond_16 ) {
			} else {

		java.lang.Boolean result_lambda_ft5 = null;
		//BIle:func
		ecore.EStringToStringMapEntry d_lbdExp5 = it_ft5.next();

			result_lambda_ft5 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.StringWrapper.equals(d_lbdExp5.getKey(), kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationKey.getByName("ecore").getName())), kermeta.standard.helper.StringWrapper.equals(d_lbdExp5.getValue(), "true"));
		//EIle:func

			test_ft5 = kermeta.standard.helper.BooleanWrapper.or(test_ft5, result_lambda_ft5);
		}
			}
		}


			result_ft5 = test_ft5;
		//EIft:exists
		result_lambda_ft4 = result = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.StringWrapper.equals(a_lbdExp4.getSource(), kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationSource.getByName("kermeta").getName())), result_ft5);
		//EIle:func

			test_ft4 = kermeta.standard.helper.BooleanWrapper.or(test_ft4, result_lambda_ft4);
		}
			}
		}


			result_ft4 = test_ft4;

		//CE
		result = result_ft4;
		//EIft:exists


		return result;

	}
	
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

		java.lang.Boolean idIfCond_13 = false;
		idIfCond_13 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(eModelElement));

		if (idIfCond_13) {

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

		java.lang.Boolean result_ft2 = null;

		java.lang.Boolean test_ft2 = false;

		{

			kermeta.standard.Iterator<ecore.EAnnotation> it_ft2 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EAnnotation> convertAsOrderedSet(
							eModelElement.getEAnnotations()).iterator();
			java.lang.Boolean idLoopCond_14 = false;
			while (!idLoopCond_14) {
				idLoopCond_14 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft2.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(test_ft2, false));
				if (idLoopCond_14) {
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
						java.lang.Boolean idLoopCond_15 = false;
						while (!idLoopCond_15) {
							idLoopCond_15 = kermeta.standard.helper.BooleanWrapper
									.or(
											it_ft3.isOff(),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															test_ft3, false));
							if (idLoopCond_15) {
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

		java.lang.Boolean idIfCond_16 = false;
		//BIft:andThen

		java.lang.Boolean result_ft4 = null;

		java.lang.Boolean idIfCond_17 = false;
		idIfCond_17 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(eModelElement));

		if (idIfCond_17) {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object v_lbdExp4 = null;

			result_ft4 = kermeta.standard.helper.BooleanWrapper.not(this
					.existsAnnotationGenModelImpl(eModelElement));
			//EIle:right

		} else {

			result_ft4 = false;
		}

		//CEC
		idIfCond_16 = result_ft4;
		//EIft:andThen

		if (idIfCond_16) {

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

		java.lang.Boolean idIfCond_18 = false;
		idIfCond_18 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(obj)));

		if (idIfCond_18) {

			kermeta.language.structure.Property ecoreMEProp = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.containerSwitcher(obj).getPropertyValue(
							"ecoreModelElement");

			java.lang.Boolean idIfCond_19 = false;
			idIfCond_19 = kermeta.standard.helper.BooleanWrapper
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

			if (idIfCond_19) {

				//BIft:detect

				ecore.EAnnotation result_ft5 = null;

				ecore.EAnnotation elem_ft5 = null;

				result_ft5 = null;

				{

					kermeta.standard.Iterator<ecore.EAnnotation> it_ft5 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
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
					java.lang.Boolean idLoopCond_20 = false;
					while (!idLoopCond_20) {
						idLoopCond_20 = kermeta.standard.helper.BooleanWrapper
								.or(
										it_ft5.isOff(),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqualSwitcher(result_ft5,
														null));
						if (idLoopCond_20) {
						} else {

							elem_ft5 = it_ft5.next();

							java.lang.Boolean idIfCond_21 = false;
							//BIle:detector
							ecore.EAnnotation t_lbdExp5 = elem_ft5;

							idIfCond_21 = kermeta.standard.helper.StringWrapper
									.equals(
											t_lbdExp5.getSource(),
											kermeta.standard.helper.StringWrapper
													.toString(km2ecore.helper.ecore.KermetaEAnnotationSource
															.getByName(
																	"kermeta")
															.getName()));
							//EIle:detector

							if (idIfCond_21) {

								result_ft5 = elem_ft5;
							}

						}
					}
				}

				//CE
				result = result_ft5;
				//EIft:detect

				java.lang.Boolean idIfCond_22 = false;
				idIfCond_22 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(result);

				if (idIfCond_22) {

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

		java.lang.Boolean idIfCond_23 = false;
		idIfCond_23 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(eModelElement));

		if (idIfCond_23) {

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
