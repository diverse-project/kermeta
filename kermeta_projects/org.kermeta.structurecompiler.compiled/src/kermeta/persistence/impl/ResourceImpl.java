/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generated with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.persistence.impl;

import kermeta.persistence.DanglingDiagnostic;
import kermeta.persistence.PersistencePackage;
import kermeta.persistence.Repository;
import kermeta.persistence.Resource;

import kermeta.standard.Set;

import kermeta.standard.impl.SetImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.persistence.impl.ResourceImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link kermeta.persistence.impl.ResourceImpl#getMetaModelURI <em>Meta Model URI</em>}</li>
 *   <li>{@link kermeta.persistence.impl.ResourceImpl#getIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link kermeta.persistence.impl.ResourceImpl#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ResourceImpl extends
		SetImpl<kermeta.language.structure.Object> implements Resource {
	/**
	 * The default value of the '{@link #getMetaModelURI() <em>Meta Model URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModelURI()
	 * @generated
	 * @ordered
	 */
	protected static final String META_MODEL_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaModelURI() <em>Meta Model URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModelURI()
	 * @generated
	 * @ordered
	 */
	protected String metaModelURI = META_MODEL_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_READ_ONLY_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected Boolean isReadOnly = IS_READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository getRepository() {
		if (eContainerFeatureID() != PersistencePackage.RESOURCE__REPOSITORY)
			return null;
		return (Repository) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository basicGetRepository() {
		if (eContainerFeatureID() != PersistencePackage.RESOURCE__REPOSITORY)
			return null;
		return (Repository) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(Repository newRepository,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newRepository,
				PersistencePackage.RESOURCE__REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(Repository newRepository) {
		if (newRepository != eInternalContainer()
				|| (eContainerFeatureID() != PersistencePackage.RESOURCE__REPOSITORY && newRepository != null)) {
			if (EcoreUtil.isAncestor(this, newRepository))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRepository != null)
				msgs = ((InternalEObject) newRepository).eInverseAdd(this,
						PersistencePackage.REPOSITORY__RESOURCES,
						Repository.class, msgs);
			msgs = basicSetRepository(newRepository, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PersistencePackage.RESOURCE__REPOSITORY, newRepository,
					newRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetaModelURI() {
		return metaModelURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaModelURI(String newMetaModelURI) {
		String oldMetaModelURI = metaModelURI;
		metaModelURI = newMetaModelURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PersistencePackage.RESOURCE__META_MODEL_URI,
					oldMetaModelURI, metaModelURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsReadOnly() {
		return isReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadOnly(Boolean newIsReadOnly) {
		Boolean oldIsReadOnly = isReadOnly;
		isReadOnly = newIsReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PersistencePackage.RESOURCE__IS_READ_ONLY, oldIsReadOnly,
					isReadOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PersistencePackage.RESOURCE__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void save() {

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void saveWithNewURI(String new_uri) {

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

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft250 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Object> convertAsSet(
							this.getterContents()).iterator();
			java.lang.Boolean idLoopCond_1097 = false;
			while (!idLoopCond_1097) {
				idLoopCond_1097 = it_ft250.isOff();
				if (idLoopCond_1097) {
				} else {

					//BIle:func
					kermeta.language.structure.Object containedObj_lbdExp250 = it_ft250
							.next();

					kermeta.language.structure.ClassDefinition classDef = null;

					classDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeOrVoid(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.getMetaClassSwitcher(
													containedObj_lbdExp250)
											.getTypeDefinition(),
									"kermeta.language.structure.ClassDefinition");

					java.lang.Boolean idIfCond_1098 = false;
					idIfCond_1098 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(classDef));

					if (idIfCond_1098) {

						//BIft:each

						{

							kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft251 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Property> convertAsSet(
											classDef.getterAllAttribute())
									.iterator();
							java.lang.Boolean idLoopCond_1099 = false;
							while (!idLoopCond_1099) {
								idLoopCond_1099 = it_ft251.isOff();
								if (idLoopCond_1099) {
								} else {

									//BIle:func
									kermeta.language.structure.Property prop_lbdExp251 = it_ft251
											.next();

									java.lang.Boolean idIfCond_1100 = false;
									idIfCond_1100 = kermeta.standard.helper.BooleanWrapper
											.not(prop_lbdExp251.getIsDerived());

									if (idIfCond_1100) {

										java.lang.Boolean idIfCond_1101 = false;
										idIfCond_1101 = kermeta.standard.helper.BooleanWrapper
												.or(
														kermeta.standard.helper.IntegerWrapper
																.isGreater(
																		prop_lbdExp251
																				.getUpper(),
																		1),
														kermeta.standard.helper.IntegerWrapper
																.equals(
																		prop_lbdExp251
																				.getUpper(),
																		kermeta.standard.helper.IntegerWrapper
																				.uminus(1)));

										if (idIfCond_1101) {

											kermeta.standard.Collection<kermeta.language.structure.Object> referencedObjs = null;

											referencedObjs = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asTypeOrVoid(
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.getSwitcher(
																			containedObj_lbdExp250,
																			prop_lbdExp251),
															"kermeta.standard.Collection<kermeta.language.structure.Object>");

											java.lang.Boolean idIfCond_1102 = false;
											idIfCond_1102 = kermeta.standard.helper.BooleanWrapper
													.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isVoidSwitcher(referencedObjs));

											if (idIfCond_1102) {

												//BIft:each

												{

													kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft252 = referencedObjs
															.iterator();
													java.lang.Boolean idLoopCond_1103 = false;
													while (!idLoopCond_1103) {
														idLoopCond_1103 = it_ft252
																.isOff();
														if (idLoopCond_1103) {
														} else {

															//BIle:func
															kermeta.language.structure.Object referencedObj_lbdExp252 = it_ft252
																	.next();

															//BIft:exists

															java.lang.Boolean result_ft253 = null;

															java.lang.Boolean test_ft253 = false;

															{

																kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft253 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																		.<kermeta.persistence.Resource> convertAsSet(
																				this
																						.getRepository()
																						.getResources())
																		.iterator();
																java.lang.Boolean idLoopCond_1105 = false;
																while (!idLoopCond_1105) {
																	idLoopCond_1105 = kermeta.standard.helper.BooleanWrapper
																			.or(
																					it_ft253
																							.isOff(),
																					org.kermeta.compil.runtime.helper.language.ObjectUtil
																							.isNotEqualSwitcher(
																									test_ft253,
																									false));
																	if (idLoopCond_1105) {
																	} else {

																		java.lang.Boolean result_lambda_ft253 = null;
																		//BIle:func
																		kermeta.persistence.Resource res2_lbdExp253 = it_ft253
																				.next();

																		result_lambda_ft253 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																				.<kermeta.language.structure.Object> convertAsSet(
																						res2_lbdExp253
																								.getterContents())
																				.contains(
																						referencedObj_lbdExp252);
																		//EIle:func

																		test_ft253 = kermeta.standard.helper.BooleanWrapper
																				.or(
																						test_ft253,
																						result_lambda_ft253);
																	}
																}
															}

															result_ft253 = test_ft253;
															//EIft:exists
															java.lang.Boolean idIfCond_1104 = false;
															idIfCond_1104 = kermeta.standard.helper.BooleanWrapper
																	.and(
																			kermeta.standard.helper.BooleanWrapper
																					.not(result_ft253),
																			kermeta.standard.helper.BooleanWrapper
																					.not(kermeta.standard.helper.BooleanWrapper
																							.or(
																									kermeta.standard.helper.BooleanWrapper
																											.or(
																													org.kermeta.compil.runtime.helper.language.ObjectUtil
																															.isKindOfSwitcher(
																																	referencedObj_lbdExp252,
																																	org.kermeta.compil.runtime.ExecutionContext
																																			.getInstance()
																																			.getMetaClass(
																																					"java.lang.String")),
																													org.kermeta.compil.runtime.helper.language.ObjectUtil
																															.isKindOfSwitcher(
																																	referencedObj_lbdExp252,
																																	org.kermeta.compil.runtime.ExecutionContext
																																			.getInstance()
																																			.getMetaClass(
																																					"java.lang.Integer"))),
																									org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.isKindOfSwitcher(
																													referencedObj_lbdExp252,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"java.lang.Boolean")))));

															if (idIfCond_1104) {

																kermeta.persistence.DanglingDiagnostic diagnostic = ((kermeta.persistence.DanglingDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil
																		.newObject(kermeta.persistence.PersistencePackage.eINSTANCE
																				.getDanglingDiagnostic()));

																diagnostic
																		.setDanglingElement(referencedObj_lbdExp252);

																diagnostic
																		.setReferencingElement(containedObj_lbdExp250);

																diagnostic
																		.setReferencingProperty(prop_lbdExp251);

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
															containedObj_lbdExp250,
															prop_lbdExp251);

											java.lang.Boolean idIfCond_1106 = false;
											idIfCond_1106 = kermeta.standard.helper.BooleanWrapper
													.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isVoidSwitcher(referencedObj));

											if (idIfCond_1106) {

												//BIft:exists

												java.lang.Boolean result_ft254 = null;

												java.lang.Boolean test_ft254 = false;

												{

													kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft254 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
															.<kermeta.persistence.Resource> convertAsSet(
																	this
																			.getRepository()
																			.getResources())
															.iterator();
													java.lang.Boolean idLoopCond_1108 = false;
													while (!idLoopCond_1108) {
														idLoopCond_1108 = kermeta.standard.helper.BooleanWrapper
																.or(
																		it_ft254
																				.isOff(),
																		org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.isNotEqualSwitcher(
																						test_ft254,
																						false));
														if (idLoopCond_1108) {
														} else {

															java.lang.Boolean result_lambda_ft254 = null;
															//BIle:func
															kermeta.persistence.Resource res2_lbdExp254 = it_ft254
																	.next();

															result_lambda_ft254 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																	.<kermeta.language.structure.Object> convertAsSet(
																			res2_lbdExp254
																					.getterContents())
																	.contains(
																			referencedObj);
															//EIle:func

															test_ft254 = kermeta.standard.helper.BooleanWrapper
																	.or(
																			test_ft254,
																			result_lambda_ft254);
														}
													}
												}

												result_ft254 = test_ft254;
												//EIft:exists
												java.lang.Boolean idIfCond_1107 = false;
												idIfCond_1107 = kermeta.standard.helper.BooleanWrapper
														.and(
																kermeta.standard.helper.BooleanWrapper
																		.not(result_ft254),
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

												if (idIfCond_1107) {

													kermeta.persistence.DanglingDiagnostic diagnostic = ((kermeta.persistence.DanglingDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil
															.newObject(kermeta.persistence.PersistencePackage.eINSTANCE
																	.getDanglingDiagnostic()));

													diagnostic
															.setDanglingElement(referencedObj);

													diagnostic
															.setReferencingElement(containedObj_lbdExp250);

													diagnostic
															.setReferencingProperty(prop_lbdExp251);

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
	public void load() {

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource instances() {

		kermeta.persistence.Resource result = null;

		result = this;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String normalizedUri() {

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
	public EList<Resource> getterDependentResources() {

		kermeta.standard.Set<kermeta.persistence.Resource> result = null;

		result = (kermeta.standard.Set<kermeta.persistence.Resource>) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.ResourceUtil
								.getDependentResources(this, uri, metaModelURI,
										"EMF"),
						"kermeta.standard.Set<kermeta.persistence.Resource>");

		return org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.convertAsEList(result);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<kermeta.language.structure.Object> getterContents() {

		kermeta.standard.Set<kermeta.language.structure.Object> result = null;

		kermeta.standard.Set<kermeta.language.structure.Object> res = ((kermeta.standard.Set<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));

		res.addAll(this);

		kermeta.standard.Set<kermeta.language.structure.Object> coll = null;

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft249 = this
					.iterator();
			java.lang.Boolean idLoopCond_1096 = false;
			while (!idLoopCond_1096) {
				idLoopCond_1096 = it_ft249.isOff();
				if (idLoopCond_1096) {
				} else {

					//BIle:func
					kermeta.language.structure.Object e_lbdExp249 = it_ft249
							.next();

					coll = (kermeta.standard.Set<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeOrVoid(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.getAllContainedObjects(e_lbdExp249),
									"kermeta.standard.Set<kermeta.language.structure.Object>");

					res.addAll(coll);
					//EIle:func

				}
			}
		}

		//EIft:each

		result = res;

		return org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.convertAsEList(result);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PersistencePackage.RESOURCE__REPOSITORY:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetRepository((Repository) otherEnd, msgs);
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
		case PersistencePackage.RESOURCE__REPOSITORY:
			return basicSetRepository(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case PersistencePackage.RESOURCE__REPOSITORY:
			return eInternalContainer().eInverseRemove(this,
					PersistencePackage.REPOSITORY__RESOURCES, Repository.class,
					msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PersistencePackage.RESOURCE__REPOSITORY:
			if (resolve)
				return getRepository();
			return basicGetRepository();
		case PersistencePackage.RESOURCE__META_MODEL_URI:
			return getMetaModelURI();
		case PersistencePackage.RESOURCE__IS_READ_ONLY:
			return getIsReadOnly();
		case PersistencePackage.RESOURCE__URI:
			return getUri();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PersistencePackage.RESOURCE__REPOSITORY:
			setRepository((Repository) newValue);
			return;
		case PersistencePackage.RESOURCE__META_MODEL_URI:
			setMetaModelURI((String) newValue);
			return;
		case PersistencePackage.RESOURCE__IS_READ_ONLY:
			setIsReadOnly((Boolean) newValue);
			return;
		case PersistencePackage.RESOURCE__URI:
			setUri((String) newValue);
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
		case PersistencePackage.RESOURCE__REPOSITORY:
			setRepository((Repository) null);
			return;
		case PersistencePackage.RESOURCE__META_MODEL_URI:
			setMetaModelURI(META_MODEL_URI_EDEFAULT);
			return;
		case PersistencePackage.RESOURCE__IS_READ_ONLY:
			setIsReadOnly(IS_READ_ONLY_EDEFAULT);
			return;
		case PersistencePackage.RESOURCE__URI:
			setUri(URI_EDEFAULT);
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
		case PersistencePackage.RESOURCE__REPOSITORY:
			return basicGetRepository() != null;
		case PersistencePackage.RESOURCE__META_MODEL_URI:
			return META_MODEL_URI_EDEFAULT == null ? metaModelURI != null
					: !META_MODEL_URI_EDEFAULT.equals(metaModelURI);
		case PersistencePackage.RESOURCE__IS_READ_ONLY:
			return IS_READ_ONLY_EDEFAULT == null ? isReadOnly != null
					: !IS_READ_ONLY_EDEFAULT.equals(isReadOnly);
		case PersistencePackage.RESOURCE__URI:
			return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT
					.equals(uri);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (metaModelURI: ");
		result.append(metaModelURI);
		result.append(", isReadOnly: ");
		result.append(isReadOnly);
		result.append(", uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
