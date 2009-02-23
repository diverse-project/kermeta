/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: LinkSetterForTypedElementImpl.java,v 1.12 2009-02-23 15:26:39 cfaucher Exp $
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

		java.lang.Boolean idIfCond_359 = false;
		idIfCond_359 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_359) {

			java.lang.Boolean idIfCond_360 = false;
			idIfCond_360 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(element.getType(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Class"));

			if (idIfCond_360) {

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

				java.lang.Boolean idIfCond_361 = false;
				idIfCond_361 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(classDefinition.getEcoreDataType());

				if (idIfCond_361) {

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

				java.lang.Boolean idIfCond_362 = false;
				idIfCond_362 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								element.getType(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.PrimitiveType"));

				if (idIfCond_362) {

					kermeta.language.structure.ClassDefinition cd = element
							.getType().getClassFromPrimitiveType()
							.getClassDefinitionAsTyped();

					java.lang.Boolean idIfCond_363 = false;
					idIfCond_363 = element.getType().isEDataType();

					if (idIfCond_363) {

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

							kermeta.standard.Iterator<ecore.ETypeParameter> it_ft123 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
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
							java.lang.Boolean idLoopCond_364 = false;
							while (!idLoopCond_364) {
								idLoopCond_364 = it_ft123.isOff();
								if (idLoopCond_364) {
								} else {

									//BIle:func
									ecore.ETypeParameter etp_lbdExp123 = it_ft123
											.next();

									java.lang.Boolean idIfCond_365 = false;
									idIfCond_365 = kermeta.standard.helper.BooleanWrapper
											.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isVoidSwitcher(ecoreModelElement
															.getEGenericType()));

									if (idIfCond_365) {

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

						java.lang.Boolean idIfCond_366 = false;
						idIfCond_366 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoidSwitcher(cd.getEcoreDataType());

						if (idIfCond_366) {

							ecoreModelElement.setEType(cd
									.getEcoreModelElement());
						} else {

							ecoreModelElement.setEType(cd.getEcoreDataType());
						}

					}

				} else {

					java.lang.Boolean idIfCond_367 = false;
					idIfCond_367 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									element.getType(),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Enumeration"));

					if (idIfCond_367) {

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

						java.lang.Boolean idIfCond_368 = false;
						idIfCond_368 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										element.getType(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.ObjectTypeVariable"));

						if (idIfCond_368) {

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
