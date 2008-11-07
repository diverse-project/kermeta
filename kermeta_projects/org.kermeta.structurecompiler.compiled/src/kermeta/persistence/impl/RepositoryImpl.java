/**
 * <copyright>
 * </copyright>
 *
 * $Id: RepositoryImpl.java,v 1.8 2008-11-07 08:53:48 cfaucher Exp $
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

		result = (java.lang.String) org.kermeta.compil.runtime.ExecutionContext
				.getInstance()
				.<java.lang.String> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.RepositoryUtil
								.normalizeUri(uri));

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

		kermeta.standard.Set<kermeta.language.structure.Object> fullResContents = null;

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft204 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.persistence.Resource> convertAsSet(
							this.getResources()).iterator();
			java.lang.Boolean idLoopCond_924 = false;
			while (!idLoopCond_924) {
				idLoopCond_924 = it_ft204.isOff();
				if (idLoopCond_924) {
				} else {

					//BIle:func
					kermeta.persistence.Resource res_lbdExp204 = it_ft204
							.next();

					java.lang.Boolean idIfCond_925 = false;
					idIfCond_925 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(fullResContents);

					if (idIfCond_925) {

						fullResContents = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Object> convertAsSet(res_lbdExp204
										.getterContents());
					} else {

						fullResContents
								.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
										.<kermeta.language.structure.Object> convertAsSet(res_lbdExp204
												.getterContents()));
					}

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft205 = fullResContents
					.iterator();
			java.lang.Boolean idLoopCond_926 = false;
			while (!idLoopCond_926) {
				idLoopCond_926 = it_ft205.isOff();
				if (idLoopCond_926) {
				} else {

					//BIle:func
					kermeta.language.structure.Object containedObj_lbdExp205 = it_ft205
							.next();

					kermeta.language.structure.ClassDefinition classDef = null;

					classDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.ExecutionContext
							.getInstance()
							.<kermeta.language.structure.ClassDefinition> asTypeOrVoid(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.getMetaClassSwitcher(
													containedObj_lbdExp205)
											.getTypeDefinition());

					java.lang.Boolean idIfCond_927 = false;
					idIfCond_927 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(classDef));

					if (idIfCond_927) {

						//BIft:each

						{

							kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft206 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Property> convertAsSet(
											classDef.getterAllAttribute())
									.iterator();
							java.lang.Boolean idLoopCond_928 = false;
							while (!idLoopCond_928) {
								idLoopCond_928 = it_ft206.isOff();
								if (idLoopCond_928) {
								} else {

									//BIle:func
									kermeta.language.structure.Property prop_lbdExp206 = it_ft206
											.next();

									java.lang.Boolean idIfCond_929 = false;
									idIfCond_929 = kermeta.standard.helper.BooleanWrapper
											.not(prop_lbdExp206.getIsDerived());

									if (idIfCond_929) {

										java.lang.Boolean idIfCond_930 = false;
										idIfCond_930 = kermeta.standard.helper.BooleanWrapper
												.or(
														kermeta.standard.helper.IntegerWrapper
																.isGreater(
																		prop_lbdExp206
																				.getUpper(),
																		1),
														kermeta.standard.helper.IntegerWrapper
																.equals(
																		prop_lbdExp206
																				.getUpper(),
																		kermeta.standard.helper.IntegerWrapper
																				.uminus(1)));

										if (idIfCond_930) {

											kermeta.standard.Collection<kermeta.language.structure.Object> referencedObjs = null;

											referencedObjs = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.<kermeta.standard.Collection<kermeta.language.structure.Object>> asTypeOrVoid(
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.getSwitcher(
																			containedObj_lbdExp205,
																			prop_lbdExp206));

											java.lang.Boolean idIfCond_931 = false;
											idIfCond_931 = kermeta.standard.helper.BooleanWrapper
													.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isVoidSwitcher(referencedObjs));

											if (idIfCond_931) {

												//BIft:each

												{

													kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft207 = referencedObjs
															.iterator();
													java.lang.Boolean idLoopCond_932 = false;
													while (!idLoopCond_932) {
														idLoopCond_932 = it_ft207
																.isOff();
														if (idLoopCond_932) {
														} else {

															//BIle:func
															kermeta.language.structure.Object referencedObj_lbdExp207 = it_ft207
																	.next();

															java.lang.Boolean idIfCond_933 = false;
															idIfCond_933 = kermeta.standard.helper.BooleanWrapper
																	.and(
																			kermeta.standard.helper.BooleanWrapper
																					.not(fullResContents
																							.contains(referencedObj_lbdExp207)),
																			kermeta.standard.helper.BooleanWrapper
																					.not(kermeta.standard.helper.BooleanWrapper
																							.or(
																									kermeta.standard.helper.BooleanWrapper
																											.or(
																													org.kermeta.compil.runtime.helper.language.ObjectUtil
																															.isKindOfSwitcher(
																																	referencedObj_lbdExp207,
																																	org.kermeta.compil.runtime.ExecutionContext
																																			.getInstance()
																																			.getMetaClass(
																																					"java.lang.String")),
																													org.kermeta.compil.runtime.helper.language.ObjectUtil
																															.isKindOfSwitcher(
																																	referencedObj_lbdExp207,
																																	org.kermeta.compil.runtime.ExecutionContext
																																			.getInstance()
																																			.getMetaClass(
																																					"java.lang.Integer"))),
																									org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.isKindOfSwitcher(
																													referencedObj_lbdExp207,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"java.lang.Boolean")))));

															if (idIfCond_933) {

																kermeta.persistence.DanglingDiagnostic diagnostic = ((kermeta.persistence.DanglingDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil
																		.newObject("kermeta.persistence.DanglingDiagnostic"));

																diagnostic
																		.setDanglingElement(referencedObj_lbdExp207);

																diagnostic
																		.setReferencingElement(containedObj_lbdExp205);

																diagnostic
																		.setReferencingProperty(prop_lbdExp206);

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
															containedObj_lbdExp205,
															prop_lbdExp206);

											java.lang.Boolean idIfCond_934 = false;
											idIfCond_934 = kermeta.standard.helper.BooleanWrapper
													.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isVoidSwitcher(referencedObj));

											if (idIfCond_934) {

												java.lang.Boolean idIfCond_935 = false;
												idIfCond_935 = kermeta.standard.helper.BooleanWrapper
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

												if (idIfCond_935) {

													kermeta.persistence.DanglingDiagnostic diagnostic = ((kermeta.persistence.DanglingDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil
															.newObject("kermeta.persistence.DanglingDiagnostic"));

													diagnostic
															.setDanglingElement(referencedObj);

													diagnostic
															.setReferencingElement(containedObj_lbdExp205);

													diagnostic
															.setReferencingProperty(prop_lbdExp206);

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
			java.lang.Boolean idLoopCond_936 = false;
			while (!idLoopCond_936) {
				idLoopCond_936 = it.isOff();
				if (idLoopCond_936) {
				} else {

					kermeta.persistence.Resource next = it.next();

					java.lang.Boolean idIfCond_937 = false;
					idIfCond_937 = kermeta.standard.helper.StringWrapper
							.equals(normalisedUri, next.normalizedUri());

					if (idIfCond_937) {

						result = next;
					}

				}
			}
		}

		java.lang.Boolean idIfCond_938 = false;
		idIfCond_938 = result == null;

		if (idIfCond_938) {

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
