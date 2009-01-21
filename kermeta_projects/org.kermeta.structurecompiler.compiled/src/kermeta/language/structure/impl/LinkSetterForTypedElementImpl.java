/**
 * <copyright>
 * </copyright>
 *
 * $Id: LinkSetterForTypedElementImpl.java,v 1.10 2009-01-21 09:15:50 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import ecore.ETypedElement;

import kermeta.language.structure.LinkSetterForTypedElement;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.TypedElement;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Setter For Typed Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LinkSetterForTypedElementImpl extends ObjectImpl implements
		LinkSetterForTypedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkSetterForTypedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.eINSTANCE.getLinkSetterForTypedElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinks(TypedElement element, ETypedElement ecoreModelElement,
			KM2EcoreContext context) {

		java.lang.Boolean idIfCond_279 = false;
		idIfCond_279 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(ecoreModelElement)),
						kermeta.standard.helper.BooleanWrapper
								.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
												.getOperation()))
										.isVoidType(element.getType()
												.getTypeQName())));

		if (idIfCond_279) {

			java.lang.Boolean idIfCond_280 = false;
			idIfCond_280 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(element.getType(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Class"));

			if (idIfCond_280) {

				kermeta.language.structure.Class c = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								element.getType(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.Class")));

				kermeta.language.structure.ClassDefinition classDefinition = c
						.getClassDefinitionAsTyped();

				ecore.EGenericType genericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject(ecore.EcorePackage.eINSTANCE
								.getEGenericType()));

				java.lang.Boolean idIfCond_281 = false;
				idIfCond_281 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(classDefinition.getEcoreDataType());

				if (idIfCond_281) {

					genericType.setEClassifier(classDefinition
							.getEcoreModelElement());
				} else {

					genericType.setEClassifier(classDefinition
							.getEcoreDataType());
				}

				ecoreModelElement.setEGenericType(genericType);

				c.setEcoreModelElement(genericType);

				c.setLinks(context);
			} else {

				java.lang.Boolean idIfCond_282 = false;
				idIfCond_282 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								element.getType(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.PrimitiveType"));

				if (idIfCond_282) {

					kermeta.language.structure.ClassDefinition cd = element
							.getType().getClassFromPrimitiveType()
							.getClassDefinitionAsTyped();

					java.lang.Boolean idIfCond_283 = false;
					idIfCond_283 = element.getType().isEDataType();

					if (idIfCond_283) {

						ecore.EGenericType newEGT = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(ecore.EcorePackage.eINSTANCE
										.getEGenericType()));

						newEGT
								.setEClassifier(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												element.getType(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.PrimitiveType")))
										.getEcoreModelElement());

						ecoreModelElement.setEGenericType(newEGT);

						//BIft:each

						{

							kermeta.standard.Iterator<ecore.ETypeParameter> it_ft108 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<ecore.ETypeParameter> convertAsOrderedSet(
											((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asTypeSwitcher(
															element.getType(),
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.PrimitiveType")))
													.getEcoreModelElement()
													.getETypeParameters())
									.iterator();
							java.lang.Boolean idLoopCond_284 = false;
							while (!idLoopCond_284) {
								idLoopCond_284 = it_ft108.isOff();
								if (idLoopCond_284) {
								} else {

									//BIle:func
									ecore.ETypeParameter etp_lbdExp108 = it_ft108
											.next();

									java.lang.Boolean idIfCond_285 = false;
									idIfCond_285 = kermeta.standard.helper.BooleanWrapper
											.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isVoidSwitcher(ecoreModelElement
															.getEGenericType()));

									if (idIfCond_285) {

										org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<ecore.EGenericType> convertAsOrderedSet(
														newEGT
																.getETypeArguments())
												.add(
														((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
																.newObject(ecore.EcorePackage.eINSTANCE
																		.getEGenericType())));
									}

									//EIle:func

								}
							}
						}

						//EIft:each

					} else {

						java.lang.Boolean idIfCond_286 = false;
						idIfCond_286 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoidSwitcher(cd.getEcoreDataType());

						if (idIfCond_286) {

							ecoreModelElement.setEType(cd
									.getEcoreModelElement());
						} else {

							ecoreModelElement.setEType(cd.getEcoreDataType());
						}

					}

				} else {

					java.lang.Boolean idIfCond_287 = false;
					idIfCond_287 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									element.getType(),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Enumeration"));

					if (idIfCond_287) {

						ecoreModelElement
								.setEType(((kermeta.language.structure.Enumeration) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												element.getType(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Enumeration")))
										.getEcoreModelElement());
					} else {

						java.lang.Boolean idIfCond_288 = false;
						idIfCond_288 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										element.getType(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.ObjectTypeVariable"));

						if (idIfCond_288) {

							ecore.EGenericType genericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject(ecore.EcorePackage.eINSTANCE
											.getEGenericType()));

							genericType
									.setETypeParameter(((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													element.getType(),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ObjectTypeVariable")))
											.getEcoreModelElement());

							ecoreModelElement.setEGenericType(genericType);
						}

					}

				}

			}

		}

	}

} //LinkSetterForTypedElementImpl
