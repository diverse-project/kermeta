/**
 * <copyright>
 * </copyright>
 *
 * $Id: RepositoryImpl.java,v 1.1 2008-09-04 15:40:39 cfaucher Exp $
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

		{

			kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft144 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.persistence.Resource> convertAsSet(
							this.getResources()).iterator();
			java.lang.Boolean idLoopCond_678 = false;
			while (!idLoopCond_678) {
				idLoopCond_678 = it_ft144.isOff();
				if (idLoopCond_678) {
				} else {

					//Beginning of the Inlining of the lambda expression: func
					kermeta.persistence.Resource res = it_ft144.next();

					//Beginning of the Inlining of the function type: each

					{

						kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft145 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Object> convertAsSet(
										res.getContents()).iterator();
						java.lang.Boolean idLoopCond_679 = false;
						while (!idLoopCond_679) {
							idLoopCond_679 = it_ft145.isOff();
							if (idLoopCond_679) {
							} else {

								//Beginning of the Inlining of the lambda expression: func
								kermeta.language.structure.Object containedObj = it_ft145
										.next();

								kermeta.language.structure.ClassDefinition classDef = null;

								classDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.getMetaClass(containedObj)
										.getTypeDefinition();

								java.lang.Boolean idIfCond_680 = false;
								idIfCond_680 = kermeta.standard.helper.BooleanWrapper
										.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isVoid(classDef));

								if (idIfCond_680) {

									//Beginning of the Inlining of the function type: each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft146 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Property> convertAsSet(
														classDef
																.getAllAttribute())
												.iterator();
										java.lang.Boolean idLoopCond_681 = false;
										while (!idLoopCond_681) {
											idLoopCond_681 = it_ft146.isOff();
											if (idLoopCond_681) {
											} else {

												//Beginning of the Inlining of the lambda expression: func
												kermeta.language.structure.Property prop = it_ft146
														.next();

												java.lang.Boolean idIfCond_682 = false;
												idIfCond_682 = kermeta.standard.helper.BooleanWrapper
														.not(prop
																.getIsDerived());

												if (idIfCond_682) {

													java.lang.Boolean idIfCond_683 = false;
													idIfCond_683 = kermeta.standard.helper.BooleanWrapper
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

													if (idIfCond_683) {

														kermeta.standard.Collection<kermeta.language.structure.Object> referencedObjs = null;

														referencedObjs = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
																.get(
																		containedObj,
																		prop);

														java.lang.Boolean idIfCond_684 = false;
														idIfCond_684 = kermeta.standard.helper.BooleanWrapper
																.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.isVoid(referencedObjs));

														if (idIfCond_684) {

															//Beginning of the Inlining of the function type: each

															{

																kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft147 = referencedObjs
																		.iterator();
																java.lang.Boolean idLoopCond_685 = false;
																while (!idLoopCond_685) {
																	idLoopCond_685 = it_ft147
																			.isOff();
																	if (idLoopCond_685) {
																	} else {

																		//Beginning of the Inlining of the lambda expression: func
																		kermeta.language.structure.Object referencedObj = it_ft147
																				.next();

																		//Beginning of the Inlining of the function type: exists

																		java.lang.Boolean result_ft148 = null;

																		java.lang.Boolean test_ft148 = false;

																		{

																			kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft148 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																					.<kermeta.persistence.Resource> convertAsSet(
																							this
																									.getResources())
																					.iterator();
																			java.lang.Boolean idLoopCond_687 = false;
																			while (!idLoopCond_687) {
																				idLoopCond_687 = kermeta.standard.helper.BooleanWrapper
																						.or(
																								it_ft148
																										.isOff(),
																								org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.isNotEqual(
																												test_ft148,
																												false));
																				if (idLoopCond_687) {
																				} else {

																					java.lang.Boolean result_lambda = null;
																					//Beginning of the Inlining of the lambda expression: func
																					kermeta.persistence.Resource res2 = it_ft148
																							.next();

																					result_lambda = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																							.<kermeta.language.structure.Object> convertAsSet(
																									res2
																											.getContents())
																							.contains(
																									referencedObj);
																					//End of the Inlining of the lambda expression: func

																					test_ft148 = kermeta.standard.helper.BooleanWrapper
																							.or(
																									test_ft148,
																									result_lambda);
																				}
																			}
																		}

																		result_ft148 = test_ft148;
																		//End of the Inlining of the function type: exists
																		java.lang.Boolean idIfCond_686 = false;
																		idIfCond_686 = kermeta.standard.helper.BooleanWrapper
																				.and(
																						kermeta.standard.helper.BooleanWrapper
																								.not(result_ft148),
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

																		if (idIfCond_686) {

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
															}

															//End of the Inlining of the function type: each

														}

													} else {

														kermeta.language.structure.Object referencedObj = null;

														referencedObj = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.get(
																		containedObj,
																		prop);

														java.lang.Boolean idIfCond_688 = false;
														idIfCond_688 = kermeta.standard.helper.BooleanWrapper
																.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.isVoid(referencedObj));

														if (idIfCond_688) {

															//Beginning of the Inlining of the function type: exists

															java.lang.Boolean result_ft149 = null;

															java.lang.Boolean test_ft149 = false;

															{

																kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft149 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																		.<kermeta.persistence.Resource> convertAsSet(
																				this
																						.getResources())
																		.iterator();
																java.lang.Boolean idLoopCond_690 = false;
																while (!idLoopCond_690) {
																	idLoopCond_690 = kermeta.standard.helper.BooleanWrapper
																			.or(
																					it_ft149
																							.isOff(),
																					org.kermeta.compil.runtime.helper.language.ObjectUtil
																							.isNotEqual(
																									test_ft149,
																									false));
																	if (idLoopCond_690) {
																	} else {

																		java.lang.Boolean result_lambda = null;
																		//Beginning of the Inlining of the lambda expression: func
																		kermeta.persistence.Resource res2 = it_ft149
																				.next();

																		result_lambda = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																				.<kermeta.language.structure.Object> convertAsSet(
																						res2
																								.getContents())
																				.contains(
																						referencedObj);
																		//End of the Inlining of the lambda expression: func

																		test_ft149 = kermeta.standard.helper.BooleanWrapper
																				.or(
																						test_ft149,
																						result_lambda);
																	}
																}
															}

															result_ft149 = test_ft149;
															//End of the Inlining of the function type: exists
															java.lang.Boolean idIfCond_689 = false;
															idIfCond_689 = kermeta.standard.helper.BooleanWrapper
																	.and(
																			kermeta.standard.helper.BooleanWrapper
																					.not(result_ft149),
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

															if (idIfCond_689) {

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

														}

													}

												}

												//End of the Inlining of the lambda expression: func

											}
										}
									}

									//End of the Inlining of the function type: each

								}

								//End of the Inlining of the lambda expression: func

							}
						}
					}

					//End of the Inlining of the function type: each

					//End of the Inlining of the lambda expression: func

				}
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

		{

			kermeta.standard.Iterator<kermeta.persistence.Resource> it = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.persistence.Resource> convertAsSet(
							this.getResources()).iterator();
			java.lang.Boolean idLoopCond_691 = false;
			while (!idLoopCond_691) {
				idLoopCond_691 = it.isOff();
				if (idLoopCond_691) {
				} else {

					kermeta.persistence.Resource next = it.next();

					java.lang.Boolean idIfCond_692 = false;
					idIfCond_692 = kermeta.standard.helper.StringWrapper
							.equals(normalisedUri, next.normalizedUri());

					if (idIfCond_692) {

						result = next;
					}

				}
			}
		}

		java.lang.Boolean idIfCond_693 = false;
		idIfCond_693 = result == null;

		if (idIfCond_693) {

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
