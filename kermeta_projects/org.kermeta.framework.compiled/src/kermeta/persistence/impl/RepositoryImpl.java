/**
 * <copyright>
 * </copyright>
 *
 * $Id: RepositoryImpl.java,v 1.2 2008-08-19 13:23:01 cfaucher Exp $
 */
package kermeta.persistence.impl;

import java.util.Collection;

import kermeta.language.structure.impl.ObjectImpl;

import kermeta.persistence.DanglingDiagnostic;
import kermeta.persistence.PersistencePackage;
import kermeta.persistence.Repository;
import kermeta.persistence.Resource;

import kermeta.standard.Set;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.persistence.impl.RepositoryImpl#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RepositoryImpl extends ObjectImpl implements Repository {
	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentWithInverseEList.Resolving<Resource>(
					Resource.class, this,
					PersistencePackage.REPOSITORY__RESOURCES,
					PersistencePackage.RESOURCE__REPOSITORY);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource(String uri, String mm_uri) {
		kermeta.persistence.Resource result = null;
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String normalizeUri(String uri) {

		java.lang.String result = null;

		result = (java.lang.String) org.kermeta.compil.runtime.helper.basetypes.RepositoryUtil
				.normalizeUri(uri);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<DanglingDiagnostic> findDanglingModelElements() {

		kermeta.standard.Set<kermeta.persistence.DanglingDiagnostic> result = null;

		result = ((kermeta.standard.Set<kermeta.persistence.DanglingDiagnostic>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Set<kermeta.persistence.DanglingDiagnostic>"));

		//Beginning of the Inlining of the function type: each

		kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft50 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<kermeta.persistence.Resource> convertAsSet(
						this.getResources()).iterator();
		java.lang.Boolean idLoopCond_270 = false;
		while (!idLoopCond_270) {
			idLoopCond_270 = it_ft50.isOff();
			;
			if (idLoopCond_270) {
			} else {

				//Beginning of the Inlining of the lambda expression: func
				kermeta.persistence.Resource res = it_ft50.next();

				//Beginning of the Inlining of the function type: each

				kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft51 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Object> convertAsSet(
								res.getContents()).iterator();
				java.lang.Boolean idLoopCond_271 = false;
				while (!idLoopCond_271) {
					idLoopCond_271 = it_ft51.isOff();
					;
					if (idLoopCond_271) {
					} else {

						//Beginning of the Inlining of the lambda expression: func
						kermeta.language.structure.Object containedObj = it_ft51
								.next();

						kermeta.language.structure.ClassDefinition classDef = null;

						classDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClass(containedObj).getTypeDefinition();

						java.lang.Boolean idIfCond_272 = false;
						idIfCond_272 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoid(classDef));

						if (idIfCond_272) {

							//Beginning of the Inlining of the function type: each

							kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft52 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Property> convertAsSet(
											classDef.getAllAttribute())
									.iterator();
							java.lang.Boolean idLoopCond_273 = false;
							while (!idLoopCond_273) {
								idLoopCond_273 = it_ft52.isOff();
								;
								if (idLoopCond_273) {
								} else {

									//Beginning of the Inlining of the lambda expression: func
									kermeta.language.structure.Property prop = it_ft52
											.next();

									java.lang.Boolean idIfCond_274 = false;
									idIfCond_274 = kermeta.standard.helper.BooleanWrapper
											.not(prop.getIsDerived());

									if (idIfCond_274) {

										java.lang.Boolean idIfCond_275 = false;
										idIfCond_275 = kermeta.standard.helper.BooleanWrapper
												.or(
														kermeta.standard.helper.IntegerWrapper
																.isGreater(
																		prop
																				.getUpper(),
																		1),
														kermeta.standard.helper.IntegerWrapper
																.equals(
																		prop
																				.getUpper(),
																		kermeta.standard.helper.IntegerWrapper
																				.uminus(1)));

										if (idIfCond_275) {

											kermeta.standard.Collection<kermeta.language.structure.Object> referencedObjs = null;

											referencedObjs = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.get(containedObj, prop);

											java.lang.Boolean idIfCond_276 = false;
											idIfCond_276 = kermeta.standard.helper.BooleanWrapper
													.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isVoid(referencedObjs));

											if (idIfCond_276) {

												//Beginning of the Inlining of the function type: each

												kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft53 = referencedObjs
														.iterator();
												java.lang.Boolean idLoopCond_277 = false;
												while (!idLoopCond_277) {
													idLoopCond_277 = it_ft53
															.isOff();
													;
													if (idLoopCond_277) {
													} else {

														//Beginning of the Inlining of the lambda expression: func
														kermeta.language.structure.Object referencedObj = it_ft53
																.next();

														//Beginning of the Inlining of the function type: exists

														java.lang.Boolean result_ft54 = null;

														java.lang.Boolean test_ft54 = false;

														kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft54 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																.<kermeta.persistence.Resource> convertAsSet(
																		this
																				.getResources())
																.iterator();
														java.lang.Boolean idLoopCond_279 = false;
														while (!idLoopCond_279) {
															idLoopCond_279 = kermeta.standard.helper.BooleanWrapper
																	.or(
																			it_ft54
																					.isOff(),
																			org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.isNotEqual(
																							test_ft54,
																							false));
															;
															if (idLoopCond_279) {
															} else {

																java.lang.Boolean result_lambda = null;
																//Beginning of the Inlining of the lambda expression: func
																kermeta.persistence.Resource res2 = it_ft54
																		.next();

																result_lambda = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																		.<kermeta.language.structure.Object> convertAsSet(
																				res2
																						.getContents())
																		.contains(
																				referencedObj);
																//End of the Inlining of the lambda expression: func

																test_ft54 = kermeta.standard.helper.BooleanWrapper
																		.or(
																				test_ft54,
																				result_lambda);
															}
														}

														result_ft54 = test_ft54;
														//End of the Inlining of the function type: exists
														java.lang.Boolean idIfCond_278 = false;
														idIfCond_278 = kermeta.standard.helper.BooleanWrapper
																.and(
																		kermeta.standard.helper.BooleanWrapper
																				.not(result_ft54),
																		kermeta.standard.helper.BooleanWrapper
																				.not(kermeta.standard.helper.BooleanWrapper
																						.or(
																								kermeta.standard.helper.BooleanWrapper
																										.or(
																												org.kermeta.compil.runtime.helper.language.ObjectUtil
																														.isKindOf(
																																referencedObj,
																																org.kermeta.compil.runtime.ExecutionContext
																																		.getInstance()
																																		.getMetaClass(
																																				"java.lang.String")),
																												org.kermeta.compil.runtime.helper.language.ObjectUtil
																														.isKindOf(
																																referencedObj,
																																org.kermeta.compil.runtime.ExecutionContext
																																		.getInstance()
																																		.getMetaClass(
																																				"java.lang.Integer"))),
																								org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.isKindOf(
																												referencedObj,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"java.lang.Boolean")))));

														if (idIfCond_278) {

															kermeta.persistence.DanglingDiagnostic diagnostic = ((kermeta.persistence.DanglingDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil
																	.newObject("kermeta.persistence.DanglingDiagnostic"));

															diagnostic
																	.setDanglingElement(referencedObj);

															diagnostic
																	.setReferencingElement(containedObj);

															diagnostic
																	.setReferencingProperty(prop);

															result
																	.add(diagnostic);
														}

														//End of the Inlining of the lambda expression: func

													}
												}
												//End of the Inlining of the function type: each

											}

										} else {

											kermeta.language.structure.Object referencedObj = null;

											referencedObj = org.kermeta.compil.runtime.helper.language.ObjectUtil
													.get(containedObj, prop);

											java.lang.Boolean idIfCond_280 = false;
											idIfCond_280 = kermeta.standard.helper.BooleanWrapper
													.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isVoid(referencedObj));

											if (idIfCond_280) {

												//Beginning of the Inlining of the function type: exists

												java.lang.Boolean result_ft55 = null;

												java.lang.Boolean test_ft55 = false;

												kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft55 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
														.<kermeta.persistence.Resource> convertAsSet(
																this
																		.getResources())
														.iterator();
												java.lang.Boolean idLoopCond_282 = false;
												while (!idLoopCond_282) {
													idLoopCond_282 = kermeta.standard.helper.BooleanWrapper
															.or(
																	it_ft55
																			.isOff(),
																	org.kermeta.compil.runtime.helper.language.ObjectUtil
																			.isNotEqual(
																					test_ft55,
																					false));
													;
													if (idLoopCond_282) {
													} else {

														java.lang.Boolean result_lambda = null;
														//Beginning of the Inlining of the lambda expression: func
														kermeta.persistence.Resource res2 = it_ft55
																.next();

														result_lambda = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																.<kermeta.language.structure.Object> convertAsSet(
																		res2
																				.getContents())
																.contains(
																		referencedObj);
														//End of the Inlining of the lambda expression: func

														test_ft55 = kermeta.standard.helper.BooleanWrapper
																.or(test_ft55,
																		result_lambda);
													}
												}

												result_ft55 = test_ft55;
												//End of the Inlining of the function type: exists
												java.lang.Boolean idIfCond_281 = false;
												idIfCond_281 = kermeta.standard.helper.BooleanWrapper
														.and(
																kermeta.standard.helper.BooleanWrapper
																		.not(result_ft55),
																kermeta.standard.helper.BooleanWrapper
																		.not(kermeta.standard.helper.BooleanWrapper
																				.or(
																						kermeta.standard.helper.BooleanWrapper
																								.or(
																										org.kermeta.compil.runtime.helper.language.ObjectUtil
																												.isKindOf(
																														referencedObj,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"java.lang.String")),
																										org.kermeta.compil.runtime.helper.language.ObjectUtil
																												.isKindOf(
																														referencedObj,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"java.lang.Integer"))),
																						org.kermeta.compil.runtime.helper.language.ObjectUtil
																								.isKindOf(
																										referencedObj,
																										org.kermeta.compil.runtime.ExecutionContext
																												.getInstance()
																												.getMetaClass(
																														"java.lang.Boolean")))));

												if (idIfCond_281) {

													kermeta.persistence.DanglingDiagnostic diagnostic = ((kermeta.persistence.DanglingDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil
															.newObject("kermeta.persistence.DanglingDiagnostic"));

													diagnostic
															.setDanglingElement(referencedObj);

													diagnostic
															.setReferencingElement(containedObj);

													diagnostic
															.setReferencingProperty(prop);

													result.add(diagnostic);
												}

											}

										}

									}

									//End of the Inlining of the lambda expression: func

								}
							}
							//End of the Inlining of the function type: each

						}

						//End of the Inlining of the lambda expression: func

					}
				}
				//End of the Inlining of the function type: each

				//End of the Inlining of the lambda expression: func

			}
		}
		//End of the Inlining of the function type: each

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResource(String uri) {

		kermeta.persistence.Resource result = null;

		org.kermeta.compil.runtime.helper.basetypes.RepositoryUtil
				.initRepository(this);

		java.lang.String normalisedUri = this.normalizeUri(uri);

		kermeta.standard.Iterator<kermeta.persistence.Resource> it = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<kermeta.persistence.Resource> convertAsSet(
						this.getResources()).iterator();
		java.lang.Boolean idLoopCond_283 = false;
		while (!idLoopCond_283) {
			idLoopCond_283 = it.isOff();
			;
			if (idLoopCond_283) {
			} else {

				kermeta.persistence.Resource next = it.next();

				java.lang.Boolean idIfCond_284 = false;
				idIfCond_284 = kermeta.standard.helper.StringWrapper.equals(
						normalisedUri, next.normalizedUri());

				if (idIfCond_284) {

					result = next;
				}

			}
		}

		java.lang.Boolean idIfCond_285 = false;
		idIfCond_285 = result.equals(null);

		if (idIfCond_285) {

			result = this.createResource(uri, "");

			result.load();
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PersistencePackage.REPOSITORY__RESOURCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getResources())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PersistencePackage.REPOSITORY__RESOURCES:
			return ((InternalEList<?>) getResources()).basicRemove(otherEnd,
					msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PersistencePackage.REPOSITORY__RESOURCES:
			return getResources();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PersistencePackage.REPOSITORY__RESOURCES:
			getResources().clear();
			getResources().addAll((Collection<? extends Resource>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PersistencePackage.REPOSITORY__RESOURCES:
			getResources().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PersistencePackage.REPOSITORY__RESOURCES:
			return resources != null && !resources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RepositoryImpl
