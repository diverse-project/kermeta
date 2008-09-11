/**
 * <copyright>
 * </copyright>
 *
 * $Id: RepositoryImpl.java,v 1.2 2008-09-11 12:34:57 cfaucher Exp $
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

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft123 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.persistence.Resource> convertAsSet(
							this.getResources()).iterator();
			java.lang.Boolean idLoopCond_589 = false;
			while (!idLoopCond_589) {
				idLoopCond_589 = it_ft123.isOff();
				if (idLoopCond_589) {
				} else {

					//BIle:func
					kermeta.persistence.Resource res_lbdExp123 = it_ft123
							.next();

					//BIft:each

					{

						kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft124 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Object> convertAsSet(
										res_lbdExp123.getContents()).iterator();
						java.lang.Boolean idLoopCond_590 = false;
						while (!idLoopCond_590) {
							idLoopCond_590 = it_ft124.isOff();
							if (idLoopCond_590) {
							} else {

								//BIle:func
								kermeta.language.structure.Object containedObj_lbdExp124 = it_ft124
										.next();

								kermeta.language.structure.ClassDefinition classDef = null;

								classDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.getMetaClass(containedObj_lbdExp124)
										.getTypeDefinition();

								java.lang.Boolean idIfCond_591 = false;
								idIfCond_591 = kermeta.standard.helper.BooleanWrapper
										.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isVoid(classDef));

								if (idIfCond_591) {

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft125 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Property> convertAsSet(
														classDef
																.getAllAttribute())
												.iterator();
										java.lang.Boolean idLoopCond_592 = false;
										while (!idLoopCond_592) {
											idLoopCond_592 = it_ft125.isOff();
											if (idLoopCond_592) {
											} else {

												//BIle:func
												kermeta.language.structure.Property prop_lbdExp125 = it_ft125
														.next();

												java.lang.Boolean idIfCond_593 = false;
												idIfCond_593 = kermeta.standard.helper.BooleanWrapper
														.not(prop_lbdExp125
																.getIsDerived());

												if (idIfCond_593) {

													java.lang.Boolean idIfCond_594 = false;
													idIfCond_594 = kermeta.standard.helper.BooleanWrapper
															.or(
																	kermeta.standard.helper.IntegerWrapper
																			.isGreater(
																					prop_lbdExp125
																							.getUpper(),
																					1),
																	kermeta.standard.helper.IntegerWrapper
																			.equals(
																					prop_lbdExp125
																							.getUpper(),
																					kermeta.standard.helper.IntegerWrapper
																							.uminus(1)));

													if (idIfCond_594) {

														kermeta.standard.Collection<kermeta.language.structure.Object> referencedObjs = null;

														referencedObjs = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
																.get(
																		containedObj_lbdExp124,
																		prop_lbdExp125);

														java.lang.Boolean idIfCond_595 = false;
														idIfCond_595 = kermeta.standard.helper.BooleanWrapper
																.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.isVoid(referencedObjs));

														if (idIfCond_595) {

															//BIft:each

															{

																kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft126 = referencedObjs
																		.iterator();
																java.lang.Boolean idLoopCond_596 = false;
																while (!idLoopCond_596) {
																	idLoopCond_596 = it_ft126
																			.isOff();
																	if (idLoopCond_596) {
																	} else {

																		//BIle:func
																		kermeta.language.structure.Object referencedObj_lbdExp126 = it_ft126
																				.next();

																		//BIft:exists

																		java.lang.Boolean result_ft127 = null;

																		java.lang.Boolean test_ft127 = false;

																		{

																			kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft127 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																					.<kermeta.persistence.Resource> convertAsSet(
																							this
																									.getResources())
																					.iterator();
																			java.lang.Boolean idLoopCond_598 = false;
																			while (!idLoopCond_598) {
																				idLoopCond_598 = kermeta.standard.helper.BooleanWrapper
																						.or(
																								it_ft127
																										.isOff(),
																								org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.isNotEqual(
																												test_ft127,
																												false));
																				if (idLoopCond_598) {
																				} else {

																					java.lang.Boolean result_lambda = null;
																					//BIle:func
																					kermeta.persistence.Resource res2_lbdExp127 = it_ft127
																							.next();

																					result_lambda = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																							.<kermeta.language.structure.Object> convertAsSet(
																									res2_lbdExp127
																											.getContents())
																							.contains(
																									referencedObj_lbdExp126);
																					//EIle:func

																					test_ft127 = kermeta.standard.helper.BooleanWrapper
																							.or(
																									test_ft127,
																									result_lambda);
																				}
																			}
																		}

																		result_ft127 = test_ft127;
																		//EIft:exists
																		java.lang.Boolean idIfCond_597 = false;
																		idIfCond_597 = kermeta.standard.helper.BooleanWrapper
																				.and(
																						kermeta.standard.helper.BooleanWrapper
																								.not(result_ft127),
																						kermeta.standard.helper.BooleanWrapper
																								.not(kermeta.standard.helper.BooleanWrapper
																										.or(
																												kermeta.standard.helper.BooleanWrapper
																														.or(
																																org.kermeta.compil.runtime.helper.language.ObjectUtil
																																		.isKindOf(
																																				referencedObj_lbdExp126,
																																				org.kermeta.compil.runtime.ExecutionContext
																																						.getInstance()
																																						.getMetaClass(
																																								"java.lang.String")),
																																org.kermeta.compil.runtime.helper.language.ObjectUtil
																																		.isKindOf(
																																				referencedObj_lbdExp126,
																																				org.kermeta.compil.runtime.ExecutionContext
																																						.getInstance()
																																						.getMetaClass(
																																								"java.lang.Integer"))),
																												org.kermeta.compil.runtime.helper.language.ObjectUtil
																														.isKindOf(
																																referencedObj_lbdExp126,
																																org.kermeta.compil.runtime.ExecutionContext
																																		.getInstance()
																																		.getMetaClass(
																																				"java.lang.Boolean")))));

																		if (idIfCond_597) {

																			kermeta.persistence.DanglingDiagnostic diagnostic = ((kermeta.persistence.DanglingDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil
																					.newObject("kermeta.persistence.DanglingDiagnostic"));

																			diagnostic
																					.setDanglingElement(referencedObj_lbdExp126);

																			diagnostic
																					.setReferencingElement(containedObj_lbdExp124);

																			diagnostic
																					.setReferencingProperty(prop_lbdExp125);

																			result
																					.add(diagnostic);
																		}

																		//EIle:func

																	}
																}
															}

															//EIft:each

														}

													} else {

														kermeta.language.structure.Object referencedObj = null;

														referencedObj = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.get(
																		containedObj_lbdExp124,
																		prop_lbdExp125);

														java.lang.Boolean idIfCond_599 = false;
														idIfCond_599 = kermeta.standard.helper.BooleanWrapper
																.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.isVoid(referencedObj));

														if (idIfCond_599) {

															//BIft:exists

															java.lang.Boolean result_ft128 = null;

															java.lang.Boolean test_ft128 = false;

															{

																kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft128 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																		.<kermeta.persistence.Resource> convertAsSet(
																				this
																						.getResources())
																		.iterator();
																java.lang.Boolean idLoopCond_601 = false;
																while (!idLoopCond_601) {
																	idLoopCond_601 = kermeta.standard.helper.BooleanWrapper
																			.or(
																					it_ft128
																							.isOff(),
																					org.kermeta.compil.runtime.helper.language.ObjectUtil
																							.isNotEqual(
																									test_ft128,
																									false));
																	if (idLoopCond_601) {
																	} else {

																		java.lang.Boolean result_lambda = null;
																		//BIle:func
																		kermeta.persistence.Resource res2_lbdExp128 = it_ft128
																				.next();

																		result_lambda = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																				.<kermeta.language.structure.Object> convertAsSet(
																						res2_lbdExp128
																								.getContents())
																				.contains(
																						referencedObj);
																		//EIle:func

																		test_ft128 = kermeta.standard.helper.BooleanWrapper
																				.or(
																						test_ft128,
																						result_lambda);
																	}
																}
															}

															result_ft128 = test_ft128;
															//EIft:exists
															java.lang.Boolean idIfCond_600 = false;
															idIfCond_600 = kermeta.standard.helper.BooleanWrapper
																	.and(
																			kermeta.standard.helper.BooleanWrapper
																					.not(result_ft128),
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

															if (idIfCond_600) {

																kermeta.persistence.DanglingDiagnostic diagnostic = ((kermeta.persistence.DanglingDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil
																		.newObject("kermeta.persistence.DanglingDiagnostic"));

																diagnostic
																		.setDanglingElement(referencedObj);

																diagnostic
																		.setReferencingElement(containedObj_lbdExp124);

																diagnostic
																		.setReferencingProperty(prop_lbdExp125);

																result
																		.add(diagnostic);
															}

														}

													}

												}

												//EIle:func

											}
										}
									}

									//EIft:each

								}

								//EIle:func

							}
						}
					}

					//EIft:each

					//EIle:func

				}
			}
		}

		//EIft:each

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
			java.lang.Boolean idLoopCond_602 = false;
			while (!idLoopCond_602) {
				idLoopCond_602 = it.isOff();
				if (idLoopCond_602) {
				} else {

					kermeta.persistence.Resource next = it.next();

					java.lang.Boolean idIfCond_603 = false;
					idIfCond_603 = kermeta.standard.helper.StringWrapper
							.equals(normalisedUri, next.normalizedUri());

					if (idIfCond_603) {

						result = next;
					}

				}
			}
		}

		java.lang.Boolean idIfCond_604 = false;
		idIfCond_604 = result == null;

		if (idIfCond_604) {

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
