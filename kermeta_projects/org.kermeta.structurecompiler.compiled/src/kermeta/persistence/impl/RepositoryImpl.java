/**
 * <copyright>
 * </copyright>
 *
 * $Id: RepositoryImpl.java,v 1.10 2009-01-21 09:16:01 cfaucher Exp $
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

		result = (java.lang.String) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.RepositoryUtil
								.normalizeUri(uri), "java.lang.String");

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
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));

		kermeta.standard.Set<kermeta.language.structure.Object> fullResContents = null;

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft213 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.persistence.Resource> convertAsSet(
							this.getResources()).iterator();
			java.lang.Boolean idLoopCond_953 = false;
			while (!idLoopCond_953) {
				idLoopCond_953 = it_ft213.isOff();
				if (idLoopCond_953) {
				} else {

					//BIle:func
					kermeta.persistence.Resource res_lbdExp213 = it_ft213
							.next();

					java.lang.Boolean idIfCond_954 = false;
					idIfCond_954 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(fullResContents);

					if (idIfCond_954) {

						fullResContents = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Object> convertAsSet(res_lbdExp213
										.getterContents());
					} else {

						fullResContents
								.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
										.<kermeta.language.structure.Object> convertAsSet(res_lbdExp213
												.getterContents()));
					}

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft214 = fullResContents
					.iterator();
			java.lang.Boolean idLoopCond_955 = false;
			while (!idLoopCond_955) {
				idLoopCond_955 = it_ft214.isOff();
				if (idLoopCond_955) {
				} else {

					//BIle:func
					kermeta.language.structure.Object containedObj_lbdExp214 = it_ft214
							.next();

					kermeta.language.structure.ClassDefinition classDef = null;

					classDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeOrVoid(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.getMetaClassSwitcher(
													containedObj_lbdExp214)
											.getTypeDefinition(),
									"kermeta.language.structure.ClassDefinition");

					java.lang.Boolean idIfCond_956 = false;
					idIfCond_956 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(classDef));

					if (idIfCond_956) {

						//BIft:each

						{

							kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft215 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Property> convertAsSet(
											classDef.getterAllAttribute())
									.iterator();
							java.lang.Boolean idLoopCond_957 = false;
							while (!idLoopCond_957) {
								idLoopCond_957 = it_ft215.isOff();
								if (idLoopCond_957) {
								} else {

									//BIle:func
									kermeta.language.structure.Property prop_lbdExp215 = it_ft215
											.next();

									java.lang.Boolean idIfCond_958 = false;
									idIfCond_958 = kermeta.standard.helper.BooleanWrapper
											.not(prop_lbdExp215.getIsDerived());

									if (idIfCond_958) {

										java.lang.Boolean idIfCond_959 = false;
										idIfCond_959 = kermeta.standard.helper.BooleanWrapper
												.or(
														kermeta.standard.helper.IntegerWrapper
																.isGreater(
																		prop_lbdExp215
																				.getUpper(),
																		1),
														kermeta.standard.helper.IntegerWrapper
																.equals(
																		prop_lbdExp215
																				.getUpper(),
																		kermeta.standard.helper.IntegerWrapper
																				.uminus(1)));

										if (idIfCond_959) {

											kermeta.standard.Collection<kermeta.language.structure.Object> referencedObjs = null;

											referencedObjs = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asTypeOrVoid(
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.getSwitcher(
																			containedObj_lbdExp214,
																			prop_lbdExp215),
															"kermeta.standard.Collection<kermeta.language.structure.Object>");

											java.lang.Boolean idIfCond_960 = false;
											idIfCond_960 = kermeta.standard.helper.BooleanWrapper
													.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isVoidSwitcher(referencedObjs));

											if (idIfCond_960) {

												//BIft:each

												{

													kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft216 = referencedObjs
															.iterator();
													java.lang.Boolean idLoopCond_961 = false;
													while (!idLoopCond_961) {
														idLoopCond_961 = it_ft216
																.isOff();
														if (idLoopCond_961) {
														} else {

															//BIle:func
															kermeta.language.structure.Object referencedObj_lbdExp216 = it_ft216
																	.next();

															java.lang.Boolean idIfCond_962 = false;
															idIfCond_962 = kermeta.standard.helper.BooleanWrapper
																	.and(
																			kermeta.standard.helper.BooleanWrapper
																					.not(fullResContents
																							.contains(referencedObj_lbdExp216)),
																			kermeta.standard.helper.BooleanWrapper
																					.not(kermeta.standard.helper.BooleanWrapper
																							.or(
																									kermeta.standard.helper.BooleanWrapper
																											.or(
																													org.kermeta.compil.runtime.helper.language.ObjectUtil
																															.isKindOfSwitcher(
																																	referencedObj_lbdExp216,
																																	org.kermeta.compil.runtime.ExecutionContext
																																			.getInstance()
																																			.getMetaClass(
																																					"java.lang.String")),
																													org.kermeta.compil.runtime.helper.language.ObjectUtil
																															.isKindOfSwitcher(
																																	referencedObj_lbdExp216,
																																	org.kermeta.compil.runtime.ExecutionContext
																																			.getInstance()
																																			.getMetaClass(
																																					"java.lang.Integer"))),
																									org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.isKindOfSwitcher(
																													referencedObj_lbdExp216,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"java.lang.Boolean")))));

															if (idIfCond_962) {

																kermeta.persistence.DanglingDiagnostic diagnostic = ((kermeta.persistence.DanglingDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil
																		.newObject(kermeta.persistence.PersistencePackage.eINSTANCE
																				.getDanglingDiagnostic()));

																diagnostic
																		.setDanglingElement(referencedObj_lbdExp216);

																diagnostic
																		.setReferencingElement(containedObj_lbdExp214);

																diagnostic
																		.setReferencingProperty(prop_lbdExp215);

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
													.getSwitcher(
															containedObj_lbdExp214,
															prop_lbdExp215);

											java.lang.Boolean idIfCond_963 = false;
											idIfCond_963 = kermeta.standard.helper.BooleanWrapper
													.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isVoidSwitcher(referencedObj));

											if (idIfCond_963) {

												java.lang.Boolean idIfCond_964 = false;
												idIfCond_964 = kermeta.standard.helper.BooleanWrapper
														.and(
																kermeta.standard.helper.BooleanWrapper
																		.not(fullResContents
																				.contains(referencedObj)),
																kermeta.standard.helper.BooleanWrapper
																		.not(kermeta.standard.helper.BooleanWrapper
																				.or(
																						kermeta.standard.helper.BooleanWrapper
																								.or(
																										org.kermeta.compil.runtime.helper.language.ObjectUtil
																												.isKindOfSwitcher(
																														referencedObj,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"java.lang.String")),
																										org.kermeta.compil.runtime.helper.language.ObjectUtil
																												.isKindOfSwitcher(
																														referencedObj,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"java.lang.Integer"))),
																						org.kermeta.compil.runtime.helper.language.ObjectUtil
																								.isKindOfSwitcher(
																										referencedObj,
																										org.kermeta.compil.runtime.ExecutionContext
																												.getInstance()
																												.getMetaClass(
																														"java.lang.Boolean")))));

												if (idIfCond_964) {

													kermeta.persistence.DanglingDiagnostic diagnostic = ((kermeta.persistence.DanglingDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil
															.newObject(kermeta.persistence.PersistencePackage.eINSTANCE
																	.getDanglingDiagnostic()));

													diagnostic
															.setDanglingElement(referencedObj);

													diagnostic
															.setReferencingElement(containedObj_lbdExp214);

													diagnostic
															.setReferencingProperty(prop_lbdExp215);

													result.add(diagnostic);
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
			java.lang.Boolean idLoopCond_965 = false;
			while (!idLoopCond_965) {
				idLoopCond_965 = it.isOff();
				if (idLoopCond_965) {
				} else {

					kermeta.persistence.Resource next = it.next();

					java.lang.Boolean idIfCond_966 = false;
					idIfCond_966 = kermeta.standard.helper.StringWrapper
							.equals(normalisedUri, next.normalizedUri());

					if (idIfCond_966) {

						result = next;
					}

				}
			}
		}

		java.lang.Boolean idIfCond_967 = false;
		idIfCond_967 = result == null;

		if (idIfCond_967) {

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
