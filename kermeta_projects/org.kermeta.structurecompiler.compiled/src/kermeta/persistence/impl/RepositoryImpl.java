/**
 * <copyright>
 * </copyright>
 *
 * $Id: RepositoryImpl.java,v 1.3 2008-09-22 14:48:25 cfaucher Exp $
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

		kermeta.standard.Set<kermeta.language.structure.Object> fullResContents = null;

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft225 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.persistence.Resource> convertAsSet(
							this.getResources()).iterator();
			java.lang.Boolean idLoopCond_964 = false;
			while (!idLoopCond_964) {
				idLoopCond_964 = it_ft225.isOff();
				if (idLoopCond_964) {
				} else {

					//BIle:func
					kermeta.persistence.Resource res_lbdExp225 = it_ft225
							.next();

					java.lang.Boolean idIfCond_965 = false;
					idIfCond_965 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoid(fullResContents);

					if (idIfCond_965) {

						fullResContents = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Object> convertAsSet(res_lbdExp225
										.getterContents());
					} else {

						fullResContents
								.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
										.<kermeta.language.structure.Object> convertAsSet(res_lbdExp225
												.getterContents()));
					}

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft226 = fullResContents
					.iterator();
			java.lang.Boolean idLoopCond_966 = false;
			while (!idLoopCond_966) {
				idLoopCond_966 = it_ft226.isOff();
				if (idLoopCond_966) {
				} else {

					//BIle:func
					kermeta.language.structure.Object containedObj_lbdExp226 = it_ft226
							.next();

					kermeta.language.structure.ClassDefinition classDef = null;

					classDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.getMetaClass(containedObj_lbdExp226)
							.getTypeDefinition();

					java.lang.Boolean idIfCond_967 = false;
					idIfCond_967 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoid(classDef));

					if (idIfCond_967) {

						//BIft:each

						{

							kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft227 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Property> convertAsSet(
											classDef.getterAllAttribute())
									.iterator();
							java.lang.Boolean idLoopCond_968 = false;
							while (!idLoopCond_968) {
								idLoopCond_968 = it_ft227.isOff();
								if (idLoopCond_968) {
								} else {

									//BIle:func
									kermeta.language.structure.Property prop_lbdExp227 = it_ft227
											.next();

									java.lang.Boolean idIfCond_969 = false;
									idIfCond_969 = kermeta.standard.helper.BooleanWrapper
											.not(prop_lbdExp227.getIsDerived());

									if (idIfCond_969) {

										java.lang.Boolean idIfCond_970 = false;
										idIfCond_970 = kermeta.standard.helper.BooleanWrapper
												.or(
														kermeta.standard.helper.IntegerWrapper
																.isGreater(
																		prop_lbdExp227
																				.getUpper(),
																		1),
														kermeta.standard.helper.IntegerWrapper
																.equals(
																		prop_lbdExp227
																				.getUpper(),
																		kermeta.standard.helper.IntegerWrapper
																				.uminus(1)));

										if (idIfCond_970) {

											kermeta.standard.Collection<kermeta.language.structure.Object> referencedObjs = null;

											referencedObjs = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.get(
															containedObj_lbdExp226,
															prop_lbdExp227);

											java.lang.Boolean idIfCond_971 = false;
											idIfCond_971 = kermeta.standard.helper.BooleanWrapper
													.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isVoid(referencedObjs));

											if (idIfCond_971) {

												//BIft:each

												{

													kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft228 = referencedObjs
															.iterator();
													java.lang.Boolean idLoopCond_972 = false;
													while (!idLoopCond_972) {
														idLoopCond_972 = it_ft228
																.isOff();
														if (idLoopCond_972) {
														} else {

															//BIle:func
															kermeta.language.structure.Object referencedObj_lbdExp228 = it_ft228
																	.next();

															java.lang.Boolean idIfCond_973 = false;
															idIfCond_973 = kermeta.standard.helper.BooleanWrapper
																	.and(
																			kermeta.standard.helper.BooleanWrapper
																					.not(fullResContents
																							.contains(referencedObj_lbdExp228)),
																			kermeta.standard.helper.BooleanWrapper
																					.not(kermeta.standard.helper.BooleanWrapper
																							.or(
																									kermeta.standard.helper.BooleanWrapper
																											.or(
																													org.kermeta.compil.runtime.helper.language.ObjectUtil
																															.isKindOf(
																																	referencedObj_lbdExp228,
																																	org.kermeta.compil.runtime.ExecutionContext
																																			.getInstance()
																																			.getMetaClass(
																																					"java.lang.String")),
																													org.kermeta.compil.runtime.helper.language.ObjectUtil
																															.isKindOf(
																																	referencedObj_lbdExp228,
																																	org.kermeta.compil.runtime.ExecutionContext
																																			.getInstance()
																																			.getMetaClass(
																																					"java.lang.Integer"))),
																									org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.isKindOf(
																													referencedObj_lbdExp228,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"java.lang.Boolean")))));

															if (idIfCond_973) {

																kermeta.persistence.DanglingDiagnostic diagnostic = ((kermeta.persistence.DanglingDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil
																		.newObject("kermeta.persistence.DanglingDiagnostic"));

																diagnostic
																		.setDanglingElement(referencedObj_lbdExp228);

																diagnostic
																		.setReferencingElement(containedObj_lbdExp226);

																diagnostic
																		.setReferencingProperty(prop_lbdExp227);

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
															containedObj_lbdExp226,
															prop_lbdExp227);

											java.lang.Boolean idIfCond_974 = false;
											idIfCond_974 = kermeta.standard.helper.BooleanWrapper
													.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isVoid(referencedObj));

											if (idIfCond_974) {

												java.lang.Boolean idIfCond_975 = false;
												idIfCond_975 = kermeta.standard.helper.BooleanWrapper
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

												if (idIfCond_975) {

													kermeta.persistence.DanglingDiagnostic diagnostic = ((kermeta.persistence.DanglingDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil
															.newObject("kermeta.persistence.DanglingDiagnostic"));

													diagnostic
															.setDanglingElement(referencedObj);

													diagnostic
															.setReferencingElement(containedObj_lbdExp226);

													diagnostic
															.setReferencingProperty(prop_lbdExp227);

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
			java.lang.Boolean idLoopCond_976 = false;
			while (!idLoopCond_976) {
				idLoopCond_976 = it.isOff();
				if (idLoopCond_976) {
				} else {

					kermeta.persistence.Resource next = it.next();

					java.lang.Boolean idIfCond_977 = false;
					idIfCond_977 = kermeta.standard.helper.StringWrapper
							.equals(normalisedUri, next.normalizedUri());

					if (idIfCond_977) {

						result = next;
					}

				}
			}
		}

		java.lang.Boolean idIfCond_978 = false;
		idIfCond_978 = result == null;

		if (idIfCond_978) {

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
