/**
 * <copyright>
 * </copyright>
 *
 * $Id: ResourceImpl.java,v 1.2 2008-08-19 13:23:02 cfaucher Exp $
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
	protected static final Boolean IS_READ_ONLY_EDEFAULT = null;

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
	public void loadWithoutChecking() {

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

		//Beginning of the Inlining of the function type: each

		kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft43 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<kermeta.language.structure.Object> convertAsSet(
						this.getContents()).iterator();
		java.lang.Boolean idLoopCond_252 = false;
		while (!idLoopCond_252) {
			idLoopCond_252 = it_ft43.isOff();
			;
			if (idLoopCond_252) {
			} else {

				//Beginning of the Inlining of the lambda expression: func
				kermeta.language.structure.Object containedObj = it_ft43.next();

				kermeta.language.structure.ClassDefinition classDef = null;

				classDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.getMetaClass(containedObj).getTypeDefinition();

				java.lang.Boolean idIfCond_253 = false;
				idIfCond_253 = kermeta.standard.helper.BooleanWrapper
						.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoid(classDef));

				if (idIfCond_253) {

					//Beginning of the Inlining of the function type: each

					kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft44 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Property> convertAsSet(
									classDef.getAllAttribute()).iterator();
					java.lang.Boolean idLoopCond_254 = false;
					while (!idLoopCond_254) {
						idLoopCond_254 = it_ft44.isOff();
						;
						if (idLoopCond_254) {
						} else {

							//Beginning of the Inlining of the lambda expression: func
							kermeta.language.structure.Property prop = it_ft44
									.next();

							java.lang.Boolean idIfCond_255 = false;
							idIfCond_255 = kermeta.standard.helper.BooleanWrapper
									.not(prop.getIsDerived());

							if (idIfCond_255) {

								java.lang.Boolean idIfCond_256 = false;
								idIfCond_256 = kermeta.standard.helper.BooleanWrapper
										.or(
												kermeta.standard.helper.IntegerWrapper
														.isGreater(prop
																.getUpper(), 1),
												kermeta.standard.helper.IntegerWrapper
														.equals(
																prop.getUpper(),
																kermeta.standard.helper.IntegerWrapper
																		.uminus(1)));

								if (idIfCond_256) {

									kermeta.standard.Collection<kermeta.language.structure.Object> referencedObjs = null;

									referencedObjs = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.get(containedObj, prop);

									java.lang.Boolean idIfCond_257 = false;
									idIfCond_257 = kermeta.standard.helper.BooleanWrapper
											.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isVoid(referencedObjs));

									if (idIfCond_257) {

										//Beginning of the Inlining of the function type: each

										kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft45 = referencedObjs
												.iterator();
										java.lang.Boolean idLoopCond_258 = false;
										while (!idLoopCond_258) {
											idLoopCond_258 = it_ft45.isOff();
											;
											if (idLoopCond_258) {
											} else {

												//Beginning of the Inlining of the lambda expression: func
												kermeta.language.structure.Object referencedObj = it_ft45
														.next();

												//Beginning of the Inlining of the function type: exists

												java.lang.Boolean result_ft46 = null;

												java.lang.Boolean test_ft46 = false;

												kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft46 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
														.<kermeta.persistence.Resource> convertAsSet(
																this
																		.getRepository()
																		.getResources())
														.iterator();
												java.lang.Boolean idLoopCond_260 = false;
												while (!idLoopCond_260) {
													idLoopCond_260 = kermeta.standard.helper.BooleanWrapper
															.or(
																	it_ft46
																			.isOff(),
																	org.kermeta.compil.runtime.helper.language.ObjectUtil
																			.isNotEqual(
																					test_ft46,
																					false));
													;
													if (idLoopCond_260) {
													} else {

														java.lang.Boolean result_lambda = null;
														//Beginning of the Inlining of the lambda expression: func
														kermeta.persistence.Resource res2 = it_ft46
																.next();

														result_lambda = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																.<kermeta.language.structure.Object> convertAsSet(
																		res2
																				.getContents())
																.contains(
																		referencedObj);
														//End of the Inlining of the lambda expression: func

														test_ft46 = kermeta.standard.helper.BooleanWrapper
																.or(test_ft46,
																		result_lambda);
													}
												}

												result_ft46 = test_ft46;
												//End of the Inlining of the function type: exists
												java.lang.Boolean idIfCond_259 = false;
												idIfCond_259 = kermeta.standard.helper.BooleanWrapper
														.and(
																kermeta.standard.helper.BooleanWrapper
																		.not(result_ft46),
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

												if (idIfCond_259) {

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

												//End of the Inlining of the lambda expression: func

											}
										}
										//End of the Inlining of the function type: each

									}

								} else {

									kermeta.language.structure.Object referencedObj = null;

									referencedObj = org.kermeta.compil.runtime.helper.language.ObjectUtil
											.get(containedObj, prop);

									java.lang.Boolean idIfCond_261 = false;
									idIfCond_261 = kermeta.standard.helper.BooleanWrapper
											.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isVoid(referencedObj));

									if (idIfCond_261) {

										//Beginning of the Inlining of the function type: exists

										java.lang.Boolean result_ft47 = null;

										java.lang.Boolean test_ft47 = false;

										kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft47 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.persistence.Resource> convertAsSet(
														this.getRepository()
																.getResources())
												.iterator();
										java.lang.Boolean idLoopCond_263 = false;
										while (!idLoopCond_263) {
											idLoopCond_263 = kermeta.standard.helper.BooleanWrapper
													.or(
															it_ft47.isOff(),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.isNotEqual(
																			test_ft47,
																			false));
											;
											if (idLoopCond_263) {
											} else {

												java.lang.Boolean result_lambda = null;
												//Beginning of the Inlining of the lambda expression: func
												kermeta.persistence.Resource res2 = it_ft47
														.next();

												result_lambda = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
														.<kermeta.language.structure.Object> convertAsSet(
																res2
																		.getContents())
														.contains(referencedObj);
												//End of the Inlining of the lambda expression: func

												test_ft47 = kermeta.standard.helper.BooleanWrapper
														.or(test_ft47,
																result_lambda);
											}
										}

										result_ft47 = test_ft47;
										//End of the Inlining of the function type: exists
										java.lang.Boolean idIfCond_262 = false;
										idIfCond_262 = kermeta.standard.helper.BooleanWrapper
												.and(
														kermeta.standard.helper.BooleanWrapper
																.not(result_ft47),
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

										if (idIfCond_262) {

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
