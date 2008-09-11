/**
 * <copyright>
 * </copyright>
 *
 * $Id: ResourceImpl.java,v 1.2 2008-09-11 12:34:57 cfaucher Exp $
 */
package kermeta.persistence.impl;

import java.util.Collection;

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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.persistence.impl.ResourceImpl#getDependentResources <em>Dependent Resources</em>}</li>
 *   <li>{@link kermeta.persistence.impl.ResourceImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link kermeta.persistence.impl.ResourceImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link kermeta.persistence.impl.ResourceImpl#getIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link kermeta.persistence.impl.ResourceImpl#getMetaModelURI <em>Meta Model URI</em>}</li>
 *   <li>{@link kermeta.persistence.impl.ResourceImpl#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ResourceImpl extends
		SetImpl<kermeta.language.structure.Object> implements Resource {
	/**
	 * The cached value of the '{@link #getDependentResources() <em>Dependent Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> dependentResources;

	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<kermeta.language.structure.Object> contents;

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
	public EList<Resource> getDependentResources() {
		if (dependentResources == null) {
			dependentResources = new EObjectResolvingEList<Resource>(
					Resource.class, this,
					PersistencePackage.RESOURCE__DEPENDENT_RESOURCES);
		}
		return dependentResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<kermeta.language.structure.Object> getContents() {
		if (contents == null) {
			contents = new EObjectResolvingEList<kermeta.language.structure.Object>(
					kermeta.language.structure.Object.class, this,
					PersistencePackage.RESOURCE__CONTENTS);
		}
		return contents;
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
				.newObject("kermeta.standard.Set<kermeta.persistence.DanglingDiagnostic>"));

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft116 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Object> convertAsSet(
							this.getContents()).iterator();
			java.lang.Boolean idLoopCond_571 = false;
			while (!idLoopCond_571) {
				idLoopCond_571 = it_ft116.isOff();
				if (idLoopCond_571) {
				} else {

					//BIle:func
					kermeta.language.structure.Object containedObj_lbdExp116 = it_ft116
							.next();

					kermeta.language.structure.ClassDefinition classDef = null;

					classDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.getMetaClass(containedObj_lbdExp116)
							.getTypeDefinition();

					java.lang.Boolean idIfCond_572 = false;
					idIfCond_572 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoid(classDef));

					if (idIfCond_572) {

						//BIft:each

						{

							kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft117 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Property> convertAsSet(
											classDef.getAllAttribute())
									.iterator();
							java.lang.Boolean idLoopCond_573 = false;
							while (!idLoopCond_573) {
								idLoopCond_573 = it_ft117.isOff();
								if (idLoopCond_573) {
								} else {

									//BIle:func
									kermeta.language.structure.Property prop_lbdExp117 = it_ft117
											.next();

									java.lang.Boolean idIfCond_574 = false;
									idIfCond_574 = kermeta.standard.helper.BooleanWrapper
											.not(prop_lbdExp117.getIsDerived());

									if (idIfCond_574) {

										java.lang.Boolean idIfCond_575 = false;
										idIfCond_575 = kermeta.standard.helper.BooleanWrapper
												.or(
														kermeta.standard.helper.IntegerWrapper
																.isGreater(
																		prop_lbdExp117
																				.getUpper(),
																		1),
														kermeta.standard.helper.IntegerWrapper
																.equals(
																		prop_lbdExp117
																				.getUpper(),
																		kermeta.standard.helper.IntegerWrapper
																				.uminus(1)));

										if (idIfCond_575) {

											kermeta.standard.Collection<kermeta.language.structure.Object> referencedObjs = null;

											referencedObjs = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.get(
															containedObj_lbdExp116,
															prop_lbdExp117);

											java.lang.Boolean idIfCond_576 = false;
											idIfCond_576 = kermeta.standard.helper.BooleanWrapper
													.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isVoid(referencedObjs));

											if (idIfCond_576) {

												//BIft:each

												{

													kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft118 = referencedObjs
															.iterator();
													java.lang.Boolean idLoopCond_577 = false;
													while (!idLoopCond_577) {
														idLoopCond_577 = it_ft118
																.isOff();
														if (idLoopCond_577) {
														} else {

															//BIle:func
															kermeta.language.structure.Object referencedObj_lbdExp118 = it_ft118
																	.next();

															//BIft:exists

															java.lang.Boolean result_ft119 = null;

															java.lang.Boolean test_ft119 = false;

															{

																kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft119 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																		.<kermeta.persistence.Resource> convertAsSet(
																				this
																						.getRepository()
																						.getResources())
																		.iterator();
																java.lang.Boolean idLoopCond_579 = false;
																while (!idLoopCond_579) {
																	idLoopCond_579 = kermeta.standard.helper.BooleanWrapper
																			.or(
																					it_ft119
																							.isOff(),
																					org.kermeta.compil.runtime.helper.language.ObjectUtil
																							.isNotEqual(
																									test_ft119,
																									false));
																	if (idLoopCond_579) {
																	} else {

																		java.lang.Boolean result_lambda = null;
																		//BIle:func
																		kermeta.persistence.Resource res2_lbdExp119 = it_ft119
																				.next();

																		result_lambda = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																				.<kermeta.language.structure.Object> convertAsSet(
																						res2_lbdExp119
																								.getContents())
																				.contains(
																						referencedObj_lbdExp118);
																		//EIle:func

																		test_ft119 = kermeta.standard.helper.BooleanWrapper
																				.or(
																						test_ft119,
																						result_lambda);
																	}
																}
															}

															result_ft119 = test_ft119;
															//EIft:exists
															java.lang.Boolean idIfCond_578 = false;
															idIfCond_578 = kermeta.standard.helper.BooleanWrapper
																	.and(
																			kermeta.standard.helper.BooleanWrapper
																					.not(result_ft119),
																			kermeta.standard.helper.BooleanWrapper
																					.not(kermeta.standard.helper.BooleanWrapper
																							.or(
																									kermeta.standard.helper.BooleanWrapper
																											.or(
																													org.kermeta.compil.runtime.helper.language.ObjectUtil
																															.isKindOf(
																																	referencedObj_lbdExp118,
																																	org.kermeta.compil.runtime.ExecutionContext
																																			.getInstance()
																																			.getMetaClass(
																																					"java.lang.String")),
																													org.kermeta.compil.runtime.helper.language.ObjectUtil
																															.isKindOf(
																																	referencedObj_lbdExp118,
																																	org.kermeta.compil.runtime.ExecutionContext
																																			.getInstance()
																																			.getMetaClass(
																																					"java.lang.Integer"))),
																									org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.isKindOf(
																													referencedObj_lbdExp118,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"java.lang.Boolean")))));

															if (idIfCond_578) {

																kermeta.persistence.DanglingDiagnostic diagnostic = ((kermeta.persistence.DanglingDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil
																		.newObject("kermeta.persistence.DanglingDiagnostic"));

																diagnostic
																		.setDanglingElement(referencedObj_lbdExp118);

																diagnostic
																		.setReferencingElement(containedObj_lbdExp116);

																diagnostic
																		.setReferencingProperty(prop_lbdExp117);

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
															containedObj_lbdExp116,
															prop_lbdExp117);

											java.lang.Boolean idIfCond_580 = false;
											idIfCond_580 = kermeta.standard.helper.BooleanWrapper
													.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isVoid(referencedObj));

											if (idIfCond_580) {

												//BIft:exists

												java.lang.Boolean result_ft120 = null;

												java.lang.Boolean test_ft120 = false;

												{

													kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft120 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
															.<kermeta.persistence.Resource> convertAsSet(
																	this
																			.getRepository()
																			.getResources())
															.iterator();
													java.lang.Boolean idLoopCond_582 = false;
													while (!idLoopCond_582) {
														idLoopCond_582 = kermeta.standard.helper.BooleanWrapper
																.or(
																		it_ft120
																				.isOff(),
																		org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.isNotEqual(
																						test_ft120,
																						false));
														if (idLoopCond_582) {
														} else {

															java.lang.Boolean result_lambda = null;
															//BIle:func
															kermeta.persistence.Resource res2_lbdExp120 = it_ft120
																	.next();

															result_lambda = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																	.<kermeta.language.structure.Object> convertAsSet(
																			res2_lbdExp120
																					.getContents())
																	.contains(
																			referencedObj);
															//EIle:func

															test_ft120 = kermeta.standard.helper.BooleanWrapper
																	.or(
																			test_ft120,
																			result_lambda);
														}
													}
												}

												result_ft120 = test_ft120;
												//EIft:exists
												java.lang.Boolean idIfCond_581 = false;
												idIfCond_581 = kermeta.standard.helper.BooleanWrapper
														.and(
																kermeta.standard.helper.BooleanWrapper
																		.not(result_ft120),
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

												if (idIfCond_581) {

													kermeta.persistence.DanglingDiagnostic diagnostic = ((kermeta.persistence.DanglingDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil
															.newObject("kermeta.persistence.DanglingDiagnostic"));

													diagnostic
															.setDanglingElement(referencedObj);

													diagnostic
															.setReferencingElement(containedObj_lbdExp116);

													diagnostic
															.setReferencingProperty(prop_lbdExp117);

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

		result = (java.lang.String) org.kermeta.compil.runtime.helper.basetypes.RepositoryUtil
				.normalizeUri(uri);

		return result;

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
		case PersistencePackage.RESOURCE__DEPENDENT_RESOURCES:
			return getDependentResources();
		case PersistencePackage.RESOURCE__CONTENTS:
			return getContents();
		case PersistencePackage.RESOURCE__REPOSITORY:
			if (resolve)
				return getRepository();
			return basicGetRepository();
		case PersistencePackage.RESOURCE__IS_READ_ONLY:
			return getIsReadOnly();
		case PersistencePackage.RESOURCE__META_MODEL_URI:
			return getMetaModelURI();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PersistencePackage.RESOURCE__DEPENDENT_RESOURCES:
			getDependentResources().clear();
			getDependentResources().addAll(
					(Collection<? extends Resource>) newValue);
			return;
		case PersistencePackage.RESOURCE__CONTENTS:
			getContents().clear();
			getContents()
					.addAll(
							(Collection<? extends kermeta.language.structure.Object>) newValue);
			return;
		case PersistencePackage.RESOURCE__REPOSITORY:
			setRepository((Repository) newValue);
			return;
		case PersistencePackage.RESOURCE__IS_READ_ONLY:
			setIsReadOnly((Boolean) newValue);
			return;
		case PersistencePackage.RESOURCE__META_MODEL_URI:
			setMetaModelURI((String) newValue);
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
		case PersistencePackage.RESOURCE__DEPENDENT_RESOURCES:
			getDependentResources().clear();
			return;
		case PersistencePackage.RESOURCE__CONTENTS:
			getContents().clear();
			return;
		case PersistencePackage.RESOURCE__REPOSITORY:
			setRepository((Repository) null);
			return;
		case PersistencePackage.RESOURCE__IS_READ_ONLY:
			setIsReadOnly(IS_READ_ONLY_EDEFAULT);
			return;
		case PersistencePackage.RESOURCE__META_MODEL_URI:
			setMetaModelURI(META_MODEL_URI_EDEFAULT);
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
		case PersistencePackage.RESOURCE__DEPENDENT_RESOURCES:
			return dependentResources != null && !dependentResources.isEmpty();
		case PersistencePackage.RESOURCE__CONTENTS:
			return contents != null && !contents.isEmpty();
		case PersistencePackage.RESOURCE__REPOSITORY:
			return basicGetRepository() != null;
		case PersistencePackage.RESOURCE__IS_READ_ONLY:
			return IS_READ_ONLY_EDEFAULT == null ? isReadOnly != null
					: !IS_READ_ONLY_EDEFAULT.equals(isReadOnly);
		case PersistencePackage.RESOURCE__META_MODEL_URI:
			return META_MODEL_URI_EDEFAULT == null ? metaModelURI != null
					: !META_MODEL_URI_EDEFAULT.equals(metaModelURI);
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
		result.append(" (isReadOnly: ");
		result.append(isReadOnly);
		result.append(", metaModelURI: ");
		result.append(metaModelURI);
		result.append(", uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
