/**
 * <copyright>
 * </copyright>
 *
 * $Id: LinkSetterForTypedElementImpl.java,v 1.1 2008-09-04 15:40:29 cfaucher Exp $
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

		java.lang.Boolean idIfCond_218 = false;
		idIfCond_218 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoid(ecoreModelElement)),
						kermeta.standard.helper.BooleanWrapper
								.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject("kermeta.language.structure.Operation"))
										.isVoidType(element.getType()
												.getTypeQName())));

		if (idIfCond_218) {

			java.lang.Boolean idIfCond_219 = false;
			idIfCond_219 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOf(element.getType(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Class"));

			if (idIfCond_219) {

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

				java.lang.Boolean idIfCond_220 = false;
				idIfCond_220 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(classDefinition.getEcoreDataType());

				if (idIfCond_220) {

					genericType.setEClassifier(classDefinition
							.getEcoreModelElement());
				} else {

					genericType.setEClassifier(classDefinition
							.getEcoreDataType());
				}

				ecoreModelElement.setEGenericType(genericType);

				//Beginning of the Inlining of the function type: each

				{

					kermeta.standard.Iterator<kermeta.language.structure.TypeVariableBinding> it_ft74 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.TypeVariableBinding> convertAsOrderedSet(
									c.getTypeParamBinding()).iterator();
					java.lang.Boolean idLoopCond_221 = false;
					while (!idLoopCond_221) {
						idLoopCond_221 = it_ft74.isOff();
						if (idLoopCond_221) {
						} else {

							//Beginning of the Inlining of the lambda expression: func
							kermeta.language.structure.TypeVariableBinding tpb = it_ft74
									.next();

							ecore.EGenericType typeArgument = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject("ecore.EGenericType"));

							java.lang.Boolean idIfCond_222 = false;
							idIfCond_222 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isInstanceOf(
											tpb.getType(),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Class"));

							if (idIfCond_222) {

								kermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asType(
												tpb.getType(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Class")))
										.getClassDefinitionAsTyped();

								java.lang.Boolean idIfCond_223 = false;
								idIfCond_223 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoid(cd.getEcoreDataType());

								if (idIfCond_223) {

									typeArgument.setEClassifier(cd
											.getEcoreModelElement());
								} else {

									typeArgument.setEClassifier(cd
											.getEcoreDataType());
								}

								org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
										.<ecore.EGenericType> convertAsOrderedSet(
												ecoreModelElement
														.getEGenericType()
														.getETypeArguments())
										.add(typeArgument);
							} else {

								java.lang.Boolean idIfCond_224 = false;
								idIfCond_224 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												tpb.getType(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ObjectTypeVariable"));

								if (idIfCond_224) {

									kermeta.language.structure.ObjectTypeVariable otv = ((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asType(
													tpb.getType(),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ObjectTypeVariable")));

									typeArgument.setETypeParameter(otv
											.getEcoreModelElement());

									org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
											.<ecore.EGenericType> convertAsOrderedSet(
													ecoreModelElement
															.getEGenericType()
															.getETypeArguments())
											.add(typeArgument);
								} else {

									java.lang.Boolean idIfCond_225 = false;
									idIfCond_225 = org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isInstanceOf(
													tpb.getType(),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.PrimitiveType"));

									if (idIfCond_225) {

										kermeta.language.structure.ClassDefinition cd = tpb
												.getType()
												.getClassFromPrimitiveType()
												.getClassDefinitionAsTyped();

										java.lang.Boolean idIfCond_226 = false;
										idIfCond_226 = tpb.getType()
												.isEDataType();

										if (idIfCond_226) {

											typeArgument
													.setEClassifier(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
															.asType(
																	tpb
																			.getType(),
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.PrimitiveType")))
															.getEcoreModelElement());
										} else {

											java.lang.Boolean idIfCond_227 = false;
											idIfCond_227 = org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isVoid(cd
															.getEcoreDataType());

											if (idIfCond_227) {

												typeArgument
														.setEClassifier(cd
																.getEcoreModelElement());
											} else {

												typeArgument.setEClassifier(cd
														.getEcoreDataType());
											}

										}

										org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<ecore.EGenericType> convertAsOrderedSet(
														ecoreModelElement
																.getEGenericType()
																.getETypeArguments())
												.add(typeArgument);
									}

								}

							}

							//End of the Inlining of the lambda expression: func

						}
					}
				}

				//End of the Inlining of the function type: each

			} else {

				java.lang.Boolean idIfCond_228 = false;
				idIfCond_228 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOf(
								element.getType(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.PrimitiveType"));

				if (idIfCond_228) {

					kermeta.language.structure.ClassDefinition cd = element
							.getType().getClassFromPrimitiveType()
							.getClassDefinitionAsTyped();

					java.lang.Boolean idIfCond_229 = false;
					idIfCond_229 = element.getType().isEDataType();

					if (idIfCond_229) {

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

						//Beginning of the Inlining of the function type: each

						{

							kermeta.standard.Iterator<ecore.ETypeParameter> it_ft75 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
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
							java.lang.Boolean idLoopCond_230 = false;
							while (!idLoopCond_230) {
								idLoopCond_230 = it_ft75.isOff();
								if (idLoopCond_230) {
								} else {

									//Beginning of the Inlining of the lambda expression: func
									ecore.ETypeParameter etp = it_ft75.next();

									java.lang.Boolean idIfCond_231 = false;
									idIfCond_231 = kermeta.standard.helper.BooleanWrapper
											.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isVoid(ecoreModelElement
															.getEGenericType()));

									if (idIfCond_231) {

										org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<ecore.EGenericType> convertAsOrderedSet(
														newEGT
																.getETypeArguments())
												.add(
														((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
																.newObject("ecore.EGenericType")));
									}

									//End of the Inlining of the lambda expression: func

								}
							}
						}

						//End of the Inlining of the function type: each

					} else {

						java.lang.Boolean idIfCond_232 = false;
						idIfCond_232 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoid(cd.getEcoreDataType());

						if (idIfCond_232) {

							ecoreModelElement.setEType(cd
									.getEcoreModelElement());
						} else {

							ecoreModelElement.setEType(cd.getEcoreDataType());
						}

					}

				} else {

					java.lang.Boolean idIfCond_233 = false;
					idIfCond_233 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(
									element.getType(),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Enumeration"));

					if (idIfCond_233) {

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

						java.lang.Boolean idIfCond_234 = false;
						idIfCond_234 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOf(
										element.getType(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.ObjectTypeVariable"));

						if (idIfCond_234) {

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
