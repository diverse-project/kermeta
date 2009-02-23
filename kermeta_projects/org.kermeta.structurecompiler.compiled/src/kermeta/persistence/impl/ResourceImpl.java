/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: ResourceImpl.java,v 1.12 2009-02-23 15:26:50 cfaucher Exp $
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
		if (eContainerFeatureID != PersistencePackage.RESOURCE__REPOSITORY)
			return null;
		return (Repository) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository basicGetRepository() {
		if (eContainerFeatureID != PersistencePackage.RESOURCE__REPOSITORY)
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
				|| (eContainerFeatureID != PersistencePackage.RESOURCE__REPOSITORY && newRepository != null)) {
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

			kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft215 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Object> convertAsSet(
							this.getterContents()).iterator();
			java.lang.Boolean idLoopCond_996 = false;
			while (!idLoopCond_996) {
				idLoopCond_996 = it_ft215.isOff();
				if (idLoopCond_996) {
				} else {

					//BIle:func
					kermeta.language.structure.Object containedObj_lbdExp215 = it_ft215
							.next();

					kermeta.language.structure.ClassDefinition classDef = null;

					classDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeOrVoid(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.getMetaClassSwitcher(
													containedObj_lbdExp215)
											.getTypeDefinition(),
									"kermeta.language.structure.ClassDefinition");

					java.lang.Boolean idIfCond_997 = false;
					idIfCond_997 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(classDef));

					if (idIfCond_997) {

						//BIft:each

						{

							kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft216 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Property> convertAsSet(
											classDef.getterAllAttribute())
									.iterator();
							java.lang.Boolean idLoopCond_998 = false;
							while (!idLoopCond_998) {
								idLoopCond_998 = it_ft216.isOff();
								if (idLoopCond_998) {
								} else {

									//BIle:func
									kermeta.language.structure.Property prop_lbdExp216 = it_ft216
											.next();

									java.lang.Boolean idIfCond_999 = false;
									idIfCond_999 = kermeta.standard.helper.BooleanWrapper
											.not(prop_lbdExp216.getIsDerived());

									if (idIfCond_999) {

										java.lang.Boolean idIfCond_1000 = false;
										idIfCond_1000 = kermeta.standard.helper.BooleanWrapper
												.or(
														kermeta.standard.helper.IntegerWrapper
																.isGreater(
																		prop_lbdExp216
																				.getUpper(),
																		1),
														kermeta.standard.helper.IntegerWrapper
																.equals(
																		prop_lbdExp216
																				.getUpper(),
																		kermeta.standard.helper.IntegerWrapper
																				.uminus(1)));

										if (idIfCond_1000) {

											kermeta.standard.Collection<kermeta.language.structure.Object> referencedObjs = null;

											referencedObjs = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asTypeOrVoid(
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.getSwitcher(
																			containedObj_lbdExp215,
																			prop_lbdExp216),
															"kermeta.standard.Collection<kermeta.language.structure.Object>");

											java.lang.Boolean idIfCond_1001 = false;
											idIfCond_1001 = kermeta.standard.helper.BooleanWrapper
													.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isVoidSwitcher(referencedObjs));

											if (idIfCond_1001) {

												//BIft:each

												{

													kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft217 = referencedObjs
															.iterator();
													java.lang.Boolean idLoopCond_1002 = false;
													while (!idLoopCond_1002) {
														idLoopCond_1002 = it_ft217
																.isOff();
														if (idLoopCond_1002) {
														} else {

															//BIle:func
															kermeta.language.structure.Object referencedObj_lbdExp217 = it_ft217
																	.next();

															//BIft:exists

															java.lang.Boolean result_ft218 = null;

															java.lang.Boolean test_ft218 = false;

															{

																kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft218 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																		.<kermeta.persistence.Resource> convertAsSet(
																				this
																						.getRepository()
																						.getResources())
																		.iterator();
																java.lang.Boolean idLoopCond_1004 = false;
																while (!idLoopCond_1004) {
																	idLoopCond_1004 = kermeta.standard.helper.BooleanWrapper
																			.or(
																					it_ft218
																							.isOff(),
																					org.kermeta.compil.runtime.helper.language.ObjectUtil
																							.isNotEqualSwitcher(
																									test_ft218,
																									false));
																	if (idLoopCond_1004) {
																	} else {

																		java.lang.Boolean result_lambda_ft218 = null;
																		//BIle:func
																		kermeta.persistence.Resource res2_lbdExp218 = it_ft218
																				.next();

																		result_lambda_ft218 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																				.<kermeta.language.structure.Object> convertAsSet(
																						res2_lbdExp218
																								.getterContents())
																				.contains(
																						referencedObj_lbdExp217);
																		//EIle:func

																		test_ft218 = kermeta.standard.helper.BooleanWrapper
																				.or(
																						test_ft218,
																						result_lambda_ft218);
																	}
																}
															}

															result_ft218 = test_ft218;
															//EIft:exists
															java.lang.Boolean idIfCond_1003 = false;
															idIfCond_1003 = kermeta.standard.helper.BooleanWrapper
																	.and(
																			kermeta.standard.helper.BooleanWrapper
																					.not(result_ft218),
																			kermeta.standard.helper.BooleanWrapper
																					.not(kermeta.standard.helper.BooleanWrapper
																							.or(
																									kermeta.standard.helper.BooleanWrapper
																											.or(
																													org.kermeta.compil.runtime.helper.language.ObjectUtil
																															.isKindOfSwitcher(
																																	referencedObj_lbdExp217,
																																	org.kermeta.compil.runtime.ExecutionContext
																																			.getInstance()
																																			.getMetaClass(
																																					"java.lang.String")),
																													org.kermeta.compil.runtime.helper.language.ObjectUtil
																															.isKindOfSwitcher(
																																	referencedObj_lbdExp217,
																																	org.kermeta.compil.runtime.ExecutionContext
																																			.getInstance()
																																			.getMetaClass(
																																					"java.lang.Integer"))),
																									org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.isKindOfSwitcher(
																													referencedObj_lbdExp217,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"java.lang.Boolean")))));

															if (idIfCond_1003) {

																kermeta.persistence.DanglingDiagnostic diagnostic = ((kermeta.persistence.DanglingDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil
																		.newObject(kermeta.persistence.PersistencePackage.eINSTANCE
																				.getDanglingDiagnostic()));

																diagnostic
																		.setDanglingElement(referencedObj_lbdExp217);

																diagnostic
																		.setReferencingElement(containedObj_lbdExp215);

																diagnostic
																		.setReferencingProperty(prop_lbdExp216);

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
															containedObj_lbdExp215,
															prop_lbdExp216);

											java.lang.Boolean idIfCond_1005 = false;
											idIfCond_1005 = kermeta.standard.helper.BooleanWrapper
													.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isVoidSwitcher(referencedObj));

											if (idIfCond_1005) {

												//BIft:exists

												java.lang.Boolean result_ft219 = null;

												java.lang.Boolean test_ft219 = false;

												{

													kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft219 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
															.<kermeta.persistence.Resource> convertAsSet(
																	this
																			.getRepository()
																			.getResources())
															.iterator();
													java.lang.Boolean idLoopCond_1007 = false;
													while (!idLoopCond_1007) {
														idLoopCond_1007 = kermeta.standard.helper.BooleanWrapper
																.or(
																		it_ft219
																				.isOff(),
																		org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.isNotEqualSwitcher(
																						test_ft219,
																						false));
														if (idLoopCond_1007) {
														} else {

															java.lang.Boolean result_lambda_ft219 = null;
															//BIle:func
															kermeta.persistence.Resource res2_lbdExp219 = it_ft219
																	.next();

															result_lambda_ft219 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																	.<kermeta.language.structure.Object> convertAsSet(
																			res2_lbdExp219
																					.getterContents())
																	.contains(
																			referencedObj);
															//EIle:func

															test_ft219 = kermeta.standard.helper.BooleanWrapper
																	.or(
																			test_ft219,
																			result_lambda_ft219);
														}
													}
												}

												result_ft219 = test_ft219;
												//EIft:exists
												java.lang.Boolean idIfCond_1006 = false;
												idIfCond_1006 = kermeta.standard.helper.BooleanWrapper
														.and(
																kermeta.standard.helper.BooleanWrapper
																		.not(result_ft219),
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

												if (idIfCond_1006) {

													kermeta.persistence.DanglingDiagnostic diagnostic = ((kermeta.persistence.DanglingDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil
															.newObject(kermeta.persistence.PersistencePackage.eINSTANCE
																	.getDanglingDiagnostic()));

													diagnostic
															.setDanglingElement(referencedObj);

													diagnostic
															.setReferencingElement(containedObj_lbdExp215);

													diagnostic
															.setReferencingProperty(prop_lbdExp216);

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

			kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft214 = this
					.iterator();
			java.lang.Boolean idLoopCond_995 = false;
			while (!idLoopCond_995) {
				idLoopCond_995 = it_ft214.isOff();
				if (idLoopCond_995) {
				} else {

					//BIle:func
					kermeta.language.structure.Object e_lbdExp214 = it_ft214
							.next();

					coll = (kermeta.standard.Set<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeOrVoid(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.getAllContainedObjects(e_lbdExp214),
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
		switch (eContainerFeatureID) {
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
