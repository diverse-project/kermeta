/**
 * <copyright>
 * </copyright>
 *
 * $Id: LinkSetterForTypedElementImpl.java,v 1.3 2008-09-22 14:47:36 cfaucher Exp $
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

		java.lang.Boolean idIfCond_788 = false;
		idIfCond_788 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoid(ecoreModelElement)),
						kermeta.standard.helper.BooleanWrapper
								.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject("kermeta.language.structure.Operation"))
										.isVoidType(element.getType()
												.getTypeQName())));

		if (idIfCond_788) {

			java.lang.Boolean idIfCond_789 = false;
			idIfCond_789 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOf(element.getType(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Class"));

			if (idIfCond_789) {

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

				java.lang.Boolean idIfCond_790 = false;
				idIfCond_790 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(classDefinition.getEcoreDataType());

				if (idIfCond_790) {

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

				java.lang.Boolean idIfCond_791 = false;
				idIfCond_791 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOf(
								element.getType(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.PrimitiveType"));

				if (idIfCond_791) {

					kermeta.language.structure.ClassDefinition cd = element
							.getType().getClassFromPrimitiveType()
							.getClassDefinitionAsTyped();

					java.lang.Boolean idIfCond_792 = false;
					idIfCond_792 = element.getType().isEDataType();

					if (idIfCond_792) {

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

							kermeta.standard.Iterator<ecore.ETypeParameter> it_ft179 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
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
							java.lang.Boolean idLoopCond_793 = false;
							while (!idLoopCond_793) {
								idLoopCond_793 = it_ft179.isOff();
								if (idLoopCond_793) {
								} else {

									//BIle:func
									ecore.ETypeParameter etp_lbdExp179 = it_ft179
											.next();

									java.lang.Boolean idIfCond_794 = false;
									idIfCond_794 = kermeta.standard.helper.BooleanWrapper
											.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isVoid(ecoreModelElement
															.getEGenericType()));

									if (idIfCond_794) {

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

						java.lang.Boolean idIfCond_795 = false;
						idIfCond_795 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoid(cd.getEcoreDataType());

						if (idIfCond_795) {

							ecoreModelElement.setEType(cd
									.getEcoreModelElement());
						} else {

							ecoreModelElement.setEType(cd.getEcoreDataType());
						}

					}

				} else {

					java.lang.Boolean idIfCond_796 = false;
					idIfCond_796 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(
									element.getType(),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Enumeration"));

					if (idIfCond_796) {

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

						java.lang.Boolean idIfCond_797 = false;
						idIfCond_797 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOf(
										element.getType(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.ObjectTypeVariable"));

						if (idIfCond_797) {

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
