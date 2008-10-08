/**
 * <copyright>
 * </copyright>
 *
 * $Id: LinkSetterForTypedElementImpl.java,v 1.4 2008-10-08 14:37:27 cfaucher Exp $
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
		return StructurePackage.Literals.LINK_SETTER_FOR_TYPED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinks(TypedElement element, ETypedElement ecoreModelElement,
			KM2EcoreContext context) {

		java.lang.Boolean idIfCond_421 = false;
		idIfCond_421 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoid(ecoreModelElement)),
						kermeta.standard.helper.BooleanWrapper
								.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject("kermeta.language.structure.Operation"))
										.isVoidType(element.getType()
												.getTypeQName())));

		if (idIfCond_421) {

			java.lang.Boolean idIfCond_422 = false;
			idIfCond_422 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOf(element.getType(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Class"));

			if (idIfCond_422) {

				kermeta.language.structure.Class c = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asType(
								element.getType(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.Class")));

				kermeta.language.structure.ClassDefinition classDefinition = c
						.getClassDefinitionAsTyped();

				ecore.EGenericType genericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("ecore.EGenericType"));

				java.lang.Boolean idIfCond_423 = false;
				idIfCond_423 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(classDefinition.getEcoreDataType());

				if (idIfCond_423) {

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

				java.lang.Boolean idIfCond_424 = false;
				idIfCond_424 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOf(
								element.getType(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.PrimitiveType"));

				if (idIfCond_424) {

					kermeta.language.structure.ClassDefinition cd = element
							.getType().getClassFromPrimitiveType()
							.getClassDefinitionAsTyped();

					java.lang.Boolean idIfCond_425 = false;
					idIfCond_425 = element.getType().isEDataType();

					if (idIfCond_425) {

						ecore.EGenericType newEGT = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("ecore.EGenericType"));

						newEGT
								.setEClassifier(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asType(
												element.getType(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.PrimitiveType")))
										.getEcoreModelElement());

						ecoreModelElement.setEGenericType(newEGT);

						//BIft:each

						{

							kermeta.standard.Iterator<ecore.ETypeParameter> it_ft137 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<ecore.ETypeParameter> convertAsOrderedSet(
											((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asType(
															element.getType(),
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.PrimitiveType")))
													.getEcoreModelElement()
													.getETypeParameters())
									.iterator();
							java.lang.Boolean idLoopCond_426 = false;
							while (!idLoopCond_426) {
								idLoopCond_426 = it_ft137.isOff();
								if (idLoopCond_426) {
								} else {

									//BIle:func
									ecore.ETypeParameter etp_lbdExp137 = it_ft137
											.next();

									java.lang.Boolean idIfCond_427 = false;
									idIfCond_427 = kermeta.standard.helper.BooleanWrapper
											.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isVoid(ecoreModelElement
															.getEGenericType()));

									if (idIfCond_427) {

										org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<ecore.EGenericType> convertAsOrderedSet(
														newEGT
																.getETypeArguments())
												.add(
														((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
																.newObject("ecore.EGenericType")));
									}

									//EIle:func

								}
							}
						}

						//EIft:each

					} else {

						java.lang.Boolean idIfCond_428 = false;
						idIfCond_428 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoid(cd.getEcoreDataType());

						if (idIfCond_428) {

							ecoreModelElement.setEType(cd
									.getEcoreModelElement());
						} else {

							ecoreModelElement.setEType(cd.getEcoreDataType());
						}

					}

				} else {

					java.lang.Boolean idIfCond_429 = false;
					idIfCond_429 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(
									element.getType(),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Enumeration"));

					if (idIfCond_429) {

						ecoreModelElement
								.setEType(((kermeta.language.structure.Enumeration) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asType(
												element.getType(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Enumeration")))
										.getEcoreModelElement());
					} else {

						java.lang.Boolean idIfCond_430 = false;
						idIfCond_430 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOf(
										element.getType(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.ObjectTypeVariable"));

						if (idIfCond_430) {

							ecore.EGenericType genericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject("ecore.EGenericType"));

							genericType
									.setETypeParameter(((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asType(
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
