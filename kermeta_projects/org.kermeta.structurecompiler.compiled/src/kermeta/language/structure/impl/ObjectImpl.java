/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.language.structure.impl;

import java.util.Collection;

import kermeta.exceptions.ConstraintsDiagnostic;

import kermeta.language.structure.Constraint;
import kermeta.language.structure.Property;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.Tag;
import kermeta.language.structure.Type;

import kermeta.persistence.Resource;

import kermeta.standard.OrderedSet;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import traceability.File;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.ObjectImpl#getFile <em>File</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ObjectImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ObjectImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ObjectImpl#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ObjectImpl#getOwnedTags <em>Owned Tags</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ObjectImpl#getOid <em>Oid</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ObjectImpl#getInternalContainingResource <em>Internal Containing Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectImpl extends MinimalEObjectImpl.Container implements
		kermeta.language.structure.Object {
	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected File file;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tag;

	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LINE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer lineNumber = LINE_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedTags() <em>Owned Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> ownedTags;

	/**
	 * The default value of the '{@link #getOid() <em>Oid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOid()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOid() <em>Oid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOid()
	 * @generated
	 * @ordered
	 */
	protected Integer oid = OID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInternalContainingResource() <em>Internal Containing Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalContainingResource()
	 * @generated
	 * @ordered
	 */
	protected Resource internalContainingResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.eINSTANCE.getObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getFile() {
		if (file != null && file.eIsProxy()) {
			InternalEObject oldFile = (InternalEObject) file;
			file = (File) eResolveProxy(oldFile);
			if (file != oldFile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StructurePackage.OBJECT__FILE, oldFile, file));
			}
		}
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File basicGetFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(File newFile) {
		File oldFile = file;
		file = newFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.OBJECT__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTag() {
		if (tag == null) {
			tag = new EObjectWithInverseResolvingEList.ManyInverse<Tag>(
					Tag.class, this, StructurePackage.OBJECT__TAG,
					StructurePackage.TAG__OBJECT);
		}
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.OBJECT__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLineNumber() {
		return lineNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineNumber(Integer newLineNumber) {
		Integer oldLineNumber = lineNumber;
		lineNumber = newLineNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.OBJECT__LINE_NUMBER, oldLineNumber,
					lineNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getOwnedTags() {
		if (ownedTags == null) {
			ownedTags = new EObjectContainmentEList.Resolving<Tag>(Tag.class,
					this, StructurePackage.OBJECT__OWNED_TAGS);
		}
		return ownedTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOid() {
		return oid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOid(Integer newOid) {
		Integer oldOid = oid;
		oid = newOid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.OBJECT__OID, oldOid, oid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getInternalContainingResource() {
		if (internalContainingResource != null
				&& internalContainingResource.eIsProxy()) {
			InternalEObject oldInternalContainingResource = (InternalEObject) internalContainingResource;
			internalContainingResource = (Resource) eResolveProxy(oldInternalContainingResource);
			if (internalContainingResource != oldInternalContainingResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE,
							oldInternalContainingResource,
							internalContainingResource));
			}
		}
		return internalContainingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetInternalContainingResource() {
		return internalContainingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalContainingResource(
			Resource newInternalContainingResource) {
		Resource oldInternalContainingResource = internalContainingResource;
		internalContainingResource = newInternalContainingResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE,
					oldInternalContainingResource, internalContainingResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object getContainerAsTypeIn(Type type,
			Type stop_type) {

		kermeta.language.structure.Object result = null;

		result = null;

		kermeta.language.structure.Object obj = this;

		{

			java.lang.Integer i = 0;
			java.lang.Boolean idLoopCond_341 = false;
			while (!idLoopCond_341) {
				idLoopCond_341 = kermeta.standard.helper.BooleanWrapper.or(
						kermeta.standard.helper.IntegerWrapper.equals(i, 1),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(obj, stop_type));
				if (idLoopCond_341) {
				} else {

					java.lang.Boolean idIfCond_342 = false;
					idIfCond_342 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.containerSwitcher(obj)));

					if (idIfCond_342) {

						java.lang.Boolean idIfCond_343 = false;
						idIfCond_343 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.containerSwitcher(obj), type);

						if (idIfCond_343) {

							i = 1;

							result = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.containerSwitcher(obj);
						} else {

							obj = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.containerSwitcher(obj);
						}

					} else {

						i = 1;
					}

				}
			}
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void applyPass1(KM2EcoreContext context) {

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void applyPass2(KM2EcoreContext context) {

		//BIft:eachOwnedElement

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft53 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_344 = false;
			while (!idLoopCond_344) {
				idLoopCond_344 = it_ft53.isOff();
				if (idLoopCond_344) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp53 = it_ft53.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp52 = o_lbdExp53;

					java.lang.Boolean idIfCond_345 = false;
					idIfCond_345 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp52.getDeprecated(), "");

					if (idIfCond_345) {

						p_lbdExp52.applyPass2(context);
					}

					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//EIft:eachOwnedElement

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEMFInstanceClassName() {

		java.lang.String result = null;

		result = this.getUniqueTagValue("EMF_instanceClassName");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedSet<String> getTagValues(String key) {

		kermeta.standard.OrderedSet<java.lang.String> result = null;

		kermeta.standard.OrderedSet<java.lang.String> value_list = ((kermeta.standard.OrderedSet<java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getOrderedSet()));

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft54 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_346 = false;
			while (!idLoopCond_346) {
				idLoopCond_346 = it_ft54.isOff();
				if (idLoopCond_346) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag t_lbdExp54 = it_ft54.next();

					java.lang.Boolean idIfCond_347 = false;
					idIfCond_347 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(t_lbdExp54.getName()));

					if (idIfCond_347) {

						java.lang.Boolean idIfCond_348 = false;
						idIfCond_348 = kermeta.standard.helper.StringWrapper
								.equals(t_lbdExp54.getName(), key);

						if (idIfCond_348) {

							value_list.add(t_lbdExp54.getValue());
						}

					}

					//EIle:func

				}
			}
		}

		//EIft:each

		result = value_list;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkAllInvariants() {

		java.lang.Boolean idIfCond_349 = false;
		idIfCond_349 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(this, null);

		if (idIfCond_349) {

			org.kermeta.compil.runtime.helper.language.ObjectUtil
					.checkInvariantsSwitcher(this);

			kermeta.language.structure.ClassDefinition cd = null;

			cd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeOrVoid(
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.getMetaClassSwitcher(this)
									.getTypeDefinition(),
							"kermeta.language.structure.ClassDefinition");

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft55 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_350 = false;
				while (!idLoopCond_350) {
					idLoopCond_350 = it_ft55.isOff();
					if (idLoopCond_350) {
					} else {

						//BIle:func
						kermeta.language.structure.Property prop_lbdExp55 = it_ft55
								.next();

						java.lang.Boolean idIfCond_351 = false;
						idIfCond_351 = kermeta.standard.helper.BooleanWrapper
								.and(prop_lbdExp55.getIsComposite(),
										kermeta.standard.helper.BooleanWrapper
												.not(prop_lbdExp55
														.getIsDerived()));

						if (idIfCond_351) {

							java.lang.Boolean idIfCond_352 = false;
							idIfCond_352 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.getSwitcher(this,
															prop_lbdExp55)));

							if (idIfCond_352) {

								java.lang.Boolean idIfCond_353 = false;
								//BIft:exists

								java.lang.Boolean result_ft56 = null;

								java.lang.Boolean test_ft56 = false;

								{

									kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft56 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.getMetaClassSwitcher(
																	org.kermeta.compil.runtime.helper.language.ObjectUtil
																			.getSwitcher(
																					this,
																					prop_lbdExp55))
															.getTypeDefinition(),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")))
											.allSuperTypes().iterator();
									java.lang.Boolean idLoopCond_354 = false;
									while (!idLoopCond_354) {
										idLoopCond_354 = kermeta.standard.helper.BooleanWrapper
												.or(
														it_ft56.isOff(),
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isNotEqualSwitcher(
																		test_ft56,
																		false));
										if (idLoopCond_354) {
										} else {

											java.lang.Boolean result_lambda_ft56 = null;
											//BIle:func
											kermeta.language.structure.Type t_lbdExp56 = it_ft56
													.next();

											java.lang.Boolean idIfCond_355 = false;
											idIfCond_355 = org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isInstanceOfSwitcher(
															t_lbdExp56,
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.ParameterizedType"));

											if (idIfCond_355) {

												result_lambda_ft56 = kermeta.standard.helper.StringWrapper
														.equals(
																((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				t_lbdExp56,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.ParameterizedType")))
																		.getTypeDefinition()
																		.qualifiedName(),
																"kermeta::standard::Collection");
											} else {

												result_lambda_ft56 = false;
											}

											//EIle:func

											test_ft56 = kermeta.standard.helper.BooleanWrapper
													.or(test_ft56,
															result_lambda_ft56);
										}
									}
								}

								result_ft56 = test_ft56;

								//CEC
								idIfCond_353 = result_ft56;
								//EIft:exists

								if (idIfCond_353) {

									kermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;

									subObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeOrVoid(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.getSwitcher(this,
																	prop_lbdExp55),
													"kermeta.standard.Collection<kermeta.language.structure.Object>");

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft57 = subObjInstances
												.iterator();
										java.lang.Boolean idLoopCond_356 = false;
										while (!idLoopCond_356) {
											idLoopCond_356 = it_ft57.isOff();
											if (idLoopCond_356) {
											} else {

												//BIle:func
												kermeta.language.structure.Object aSubObjInstances_lbdExp57 = it_ft57
														.next();

												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.checkAllInvariantsSwitcher(aSubObjInstances_lbdExp57);
												//EIle:func

											}
										}
									}

									//EIft:each

								} else {

									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.checkAllInvariantsSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.getSwitcher(this,
															prop_lbdExp55));
								}

							}

						}

						//EIle:func

					}
				}
			}

			//EIft:each

		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWrapperValueTypeSelfExpression() {

		java.lang.String result = null;

		result = this.getUniqueTagValue("WrapperValueTypeSelfExpression");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void applyPass2BehaviorJava(KM2EcoreContext context) {

		//BIft:eachOwnedElement

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft59 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_357 = false;
			while (!idLoopCond_357) {
				idLoopCond_357 = it_ft59.isOff();
				if (idLoopCond_357) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp59 = it_ft59.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp58 = o_lbdExp59;

					p_lbdExp58.applyPass2BehaviorJava(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//EIft:eachOwnedElement

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedSet<String> getEMFNeedProperty() {

		kermeta.standard.OrderedSet<java.lang.String> result = null;

		result = this.getTagValues("EMF_needProperty");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeprecated() {

		java.lang.String result = null;

		result = this.getUniqueTagValue("deprecated");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isSet(Property property) {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isSet(this, property), "java.lang.Boolean");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean mustBeAssigned() {

		java.lang.Boolean result = null;

		result = false;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWrapperValueTypeReturnType() {

		java.lang.String result = null;

		result = this.getUniqueTagValue("WrapperValueTypeReturnType");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object get(Property property) {

		kermeta.language.structure.Object result = null;

		result = org.kermeta.compil.runtime.helper.language.ObjectUtil.get(
				this, property);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean equals(kermeta.language.structure.Object element) {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equals(this, element), "java.lang.Boolean");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getEMFIsTransient() {

		java.lang.Boolean result = null;

		result = this.interpretBooleanTag("ecore.isTransient");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsDiagnostic getViolatedConstraints() {

		kermeta.exceptions.ConstraintsDiagnostic result = null;

		kermeta.exceptions.ConstraintsDiagnostic contraintes = ((kermeta.exceptions.ConstraintsDiagnostic) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
						.getConstraintsDiagnostic())).initialize();

		kermeta.language.structure.ClassDefinition cd = null;

		cd = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getMetaClassSwitcher(this).getterClassDefinition();

		java.lang.Boolean idIfCond_358 = false;
		idIfCond_358 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(cd));

		if (idIfCond_358) {

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft60 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_359 = false;
				while (!idLoopCond_359) {
					idLoopCond_359 = it_ft60.isOff();
					if (idLoopCond_359) {
					} else {

						//BIle:func
						kermeta.language.structure.Property prop_lbdExp60 = it_ft60
								.next();

						//BIft:exists

						java.lang.Boolean result_ft61 = null;

						java.lang.Boolean test_ft61 = false;

						{

							kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft61 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Tag> convertAsOrderedSet(
											prop_lbdExp60.getTag()).iterator();
							java.lang.Boolean idLoopCond_361 = false;
							while (!idLoopCond_361) {
								idLoopCond_361 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft61.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																test_ft61,
																false));
								if (idLoopCond_361) {
								} else {

									java.lang.Boolean result_lambda_ft61 = null;
									//BIle:func
									kermeta.language.structure.Tag t_lbdExp61 = it_ft61
											.next();

									result_lambda_ft61 = kermeta.standard.helper.StringWrapper
											.equals(t_lbdExp61.getName(),
													"ecore.isTransient");
									//EIle:func

									test_ft61 = kermeta.standard.helper.BooleanWrapper
											.or(test_ft61, result_lambda_ft61);
								}
							}
						}

						result_ft61 = test_ft61;
						//EIft:exists
						java.lang.Boolean idIfCond_360 = false;
						idIfCond_360 = kermeta.standard.helper.BooleanWrapper
								.and(kermeta.standard.helper.BooleanWrapper
										.not(result_ft61),
										kermeta.standard.helper.BooleanWrapper
												.not(prop_lbdExp60
														.getIsDerived()));

						if (idIfCond_360) {

							kermeta.language.structure.PropertyConstraint constraint = ((kermeta.language.structure.PropertyConstraint) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
											.getPropertyConstraint()));

							constraint
									.setName(kermeta.standard.helper.StringWrapper
											.plus(
													kermeta.standard.helper.StringWrapper
															.plus(
																	kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									cd
																											.getName(),
																									"_"),
																					prop_lbdExp60
																							.getName()),
																	"_"),
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.toStringSwitcher(prop_lbdExp60
																	.getType())));

							constraint.setProperty(prop_lbdExp60);

							{
								try {
									this.checkInvariant(constraint);
								} catch (org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_1) {
									boolean caught_1 = false;
									if (ex_switcher_1.getRealException() instanceof kermeta.exceptions.ConstraintViolatedInv) {
										caught_1 = true;
										kermeta.exceptions.ConstraintViolatedInv e = (kermeta.exceptions.ConstraintViolatedInv) ex_switcher_1
												.getRealException();
										contraintes.add(e);
									}
									if (!caught_1) {
										throw ex_switcher_1;
									}

								}
							}

							java.lang.Boolean idIfCond_362 = false;
							idIfCond_362 = prop_lbdExp60.getIsComposite();

							if (idIfCond_362) {

								java.lang.Boolean idIfCond_363 = false;
								idIfCond_363 = kermeta.standard.helper.BooleanWrapper
										.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
														.getSwitcher(this,
																prop_lbdExp60)));

								if (idIfCond_363) {

									java.lang.Boolean idIfCond_364 = false;
									//BIft:exists

									java.lang.Boolean result_ft62 = null;

									java.lang.Boolean test_ft62 = false;

									{

										kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft62 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.getMetaClassSwitcher(
																		org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.getSwitcher(
																						this,
																						prop_lbdExp60))
																.getTypeDefinition(),
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.structure.ClassDefinition")))
												.allSuperTypes().iterator();
										java.lang.Boolean idLoopCond_365 = false;
										while (!idLoopCond_365) {
											idLoopCond_365 = kermeta.standard.helper.BooleanWrapper
													.or(
															it_ft62.isOff(),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.isNotEqualSwitcher(
																			test_ft62,
																			false));
											if (idLoopCond_365) {
											} else {

												java.lang.Boolean result_lambda_ft62 = null;
												//BIle:func
												kermeta.language.structure.Type t_lbdExp62 = it_ft62
														.next();

												java.lang.Boolean idIfCond_366 = false;
												idIfCond_366 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																t_lbdExp62,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.ParameterizedType"));

												if (idIfCond_366) {

													result_lambda_ft62 = kermeta.standard.helper.StringWrapper
															.equals(
																	((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																			.asTypeSwitcher(
																					t_lbdExp62,
																					org.kermeta.compil.runtime.ExecutionContext
																							.getInstance()
																							.getMetaClass(
																									"kermeta.language.structure.ParameterizedType")))
																			.getTypeDefinition()
																			.qualifiedName(),
																	"kermeta::standard::Collection");
												} else {

													result_lambda_ft62 = false;
												}

												//EIle:func

												test_ft62 = kermeta.standard.helper.BooleanWrapper
														.or(test_ft62,
																result_lambda_ft62);
											}
										}
									}

									result_ft62 = test_ft62;

									//CEC
									idIfCond_364 = result_ft62;
									//EIft:exists

									if (idIfCond_364) {

										kermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;

										subObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeOrVoid(
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.getSwitcher(
																		this,
																		prop_lbdExp60),
														"kermeta.standard.Collection<kermeta.language.structure.Object>");

										//BIft:each

										{

											kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft63 = subObjInstances
													.iterator();
											java.lang.Boolean idLoopCond_367 = false;
											while (!idLoopCond_367) {
												idLoopCond_367 = it_ft63
														.isOff();
												if (idLoopCond_367) {
												} else {

													//BIle:func
													kermeta.language.structure.Object aSubObjInstances_lbdExp63 = it_ft63
															.next();

													//BIft:each

													{

														kermeta.standard.Iterator<kermeta.exceptions.ConstraintViolatedInv> it_ft64 = aSubObjInstances_lbdExp63
																.getViolatedConstraints()
																.getSetConstraints()
																.iterator();
														java.lang.Boolean idLoopCond_368 = false;
														while (!idLoopCond_368) {
															idLoopCond_368 = it_ft64
																	.isOff();
															if (idLoopCond_368) {
															} else {

																//BIle:func
																kermeta.exceptions.ConstraintViolatedInv v_lbdExp64 = it_ft64
																		.next();

																contraintes
																		.add(v_lbdExp64);
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

									} else {

										//BIft:each

										{

											kermeta.standard.Iterator<kermeta.exceptions.ConstraintViolatedInv> it_ft65 = org.kermeta.compil.runtime.helper.language.ObjectUtil
													.getSwitcher(this,
															prop_lbdExp60)
													.getViolatedConstraints()
													.getSetConstraints()
													.iterator();
											java.lang.Boolean idLoopCond_369 = false;
											while (!idLoopCond_369) {
												idLoopCond_369 = it_ft65
														.isOff();
												if (idLoopCond_369) {
												} else {

													//BIle:func
													kermeta.exceptions.ConstraintViolatedInv v_lbdExp65 = it_ft65
															.next();

													contraintes.add(v_lbdExp65);
													//EIle:func

												}
											}
										}

										//EIft:each

									}

								}

							}

						}

						//EIle:func

					}
				}
			}

			//EIft:each

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft66 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Constraint> convertAsOrderedSet(
								cd.getInv()).iterator();
				java.lang.Boolean idLoopCond_370 = false;
				while (!idLoopCond_370) {
					idLoopCond_370 = it_ft66.isOff();
					if (idLoopCond_370) {
					} else {

						//BIle:func
						kermeta.language.structure.Constraint invariant_lbdExp66 = it_ft66
								.next();
						try {
							this.checkInvariant(invariant_lbdExp66);
						} catch (org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_2) {
							boolean caught_2 = false;
							if (ex_switcher_2.getRealException() instanceof kermeta.exceptions.ConstraintViolatedInv) {
								caught_2 = true;
								kermeta.exceptions.ConstraintViolatedInv e = (kermeta.exceptions.ConstraintViolatedInv) ex_switcher_2
										.getRealException();
								contraintes.add(e);
							}
							if (!caught_2) {
								throw ex_switcher_2;
							}

						}
						//EIle:func

					}
				}
			}

			//EIft:each

		}

		result = contraintes;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getEMFEDataTypeIsSerializable() {

		java.lang.Boolean result = null;

		result = this.interpretBooleanTag("ecore.EDataType_isSerializable");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object container() {

		kermeta.language.structure.Object result = null;

		result = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.container(this);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unset(Property property) {

		org.kermeta.compil.runtime.helper.language.ObjectUtil.unset(this,
				property);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource containingResource() {

		kermeta.persistence.Resource result = null;

		result = (kermeta.persistence.Resource) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getContainingResource(this),
						"kermeta.persistence.Resource");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {

		java.lang.String result = null;

		result = kermeta.standard.helper.StringWrapper
				.plus(
						kermeta.standard.helper.StringWrapper
								.plus(
										kermeta.standard.helper.StringWrapper
												.plus(
														kermeta.standard.helper.StringWrapper
																.plus(
																		"[",
																		org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.getMetaClassSwitcher(
																						this)
																				.getTypeDefinition()
																				.qualifiedName()),
														":"),
										kermeta.standard.helper.IntegerWrapper
												.toString(org.kermeta.compil.runtime.helper.language.ObjectUtil
														.oidSwitcher(this))),
						"]");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkInvariant(Constraint invariant) {

		kermeta.language.structure.ClassDefinition cd = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getMetaClassSwitcher(this).getterClassDefinition();

		java.lang.Boolean idIfCond_371 = false;
		idIfCond_371 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isKindOfSwitcher(
						invariant,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.PropertyConstraint"));

		if (idIfCond_371) {

			kermeta.language.structure.Property prop = ((kermeta.language.structure.PropertyConstraint) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							invariant,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.PropertyConstraint")))
					.getProperty();

			kermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getSwitcher(this, prop);

			java.lang.Boolean idIfCond_372 = false;
			//BIft:andThen

			java.lang.Boolean result_ft67 = null;

			java.lang.Boolean idIfCond_373 = false;
			idIfCond_373 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(v));

			if (idIfCond_373) {

				//BIle:right
				/*This variable should be never used*/kermeta.language.structure.Object f_lbdExp67 = null;

				result_ft67 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								v,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.standard.Collection<kermeta.language.structure.Object>"));
				//EIle:right

			} else {

				result_ft67 = false;
			}

			//CEC
			idIfCond_372 = result_ft67;
			//EIft:andThen

			if (idIfCond_372) {

				kermeta.standard.Collection<kermeta.language.structure.Object> coll = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								v,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.standard.Collection<kermeta.language.structure.Object>")));

				java.lang.Boolean idIfCond_374 = false;
				idIfCond_374 = kermeta.standard.helper.BooleanWrapper
						.and(
								org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isNotEqualSwitcher(
												prop.getUpper(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.convertAsObject(kermeta.standard.helper.IntegerWrapper
																.uminus(1))),
								kermeta.standard.helper.IntegerWrapper
										.isGreater(coll.size(), prop.getUpper()));

				if (idIfCond_374) {

					kermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
									.getConstraintViolatedInv()));

					e.setConstraintAppliedTo(this);

					e
							.setMessage(kermeta.standard.helper.StringWrapper
									.plus(
											kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											kermeta.standard.helper.StringWrapper
																													.plus(
																															kermeta.standard.helper.StringWrapper
																																	.plus(
																																			"Invariant upper bound of ",
																																			cd
																																					.getName()),
																															"_"),
																											prop
																													.getName()),
																							"_"),
																			org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.toStringSwitcher(prop
																							.getType())),
															" violated on "),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.toStringSwitcher(this)));

					e.setFailedConstraint(invariant);

					if (true)
						throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
								e);

				}

				java.lang.Boolean idIfCond_375 = false;
				idIfCond_375 = kermeta.standard.helper.IntegerWrapper.isLower(
						coll.size(), prop.getLower());

				if (idIfCond_375) {

					kermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
									.getConstraintViolatedInv()));

					e.setConstraintAppliedTo(this);

					e
							.setMessage(kermeta.standard.helper.StringWrapper
									.plus(
											kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											kermeta.standard.helper.StringWrapper
																													.plus(
																															kermeta.standard.helper.StringWrapper
																																	.plus(
																																			"Invariant lower bound of ",
																																			cd
																																					.getName()),
																															"_"),
																											prop
																													.getName()),
																							"_"),
																			org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.toStringSwitcher(prop
																							.getType())),
															" violated on "),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.toStringSwitcher(this)));

					e.setFailedConstraint(invariant);

					if (true)
						throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
								e);

				}

			} else {

				java.lang.Boolean idIfCond_376 = false;
				idIfCond_376 = kermeta.standard.helper.BooleanWrapper.and(
						kermeta.standard.helper.IntegerWrapper.equals(prop
								.getLower(), 1),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoidSwitcher(v));

				if (idIfCond_376) {

					kermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
									.getConstraintViolatedInv()));

					e.setConstraintAppliedTo(this);

					e
							.setMessage(kermeta.standard.helper.StringWrapper
									.plus(
											kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											kermeta.standard.helper.StringWrapper
																													.plus(
																															kermeta.standard.helper.StringWrapper
																																	.plus(
																																			"Invariant lower bound of ",
																																			cd
																																					.getName()),
																															"_"),
																											prop
																													.getName()),
																							"_"),
																			org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.toStringSwitcher(prop
																							.getType())),
															" violated on "),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.toStringSwitcher(this)));

					e.setFailedConstraint(invariant);

					if (true)
						throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
								e);

				}

			}

		} else {

			{

				org.kermeta.compil.runtime.helper.language.ObjectUtil
						.checkInvariant(this, invariant);
			}
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBehaviorJava(KM2EcoreContext context) {

		java.lang.String result = null;

		result = "";

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean interpretBooleanTag(String str_tag) {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_377 = false;
		idIfCond_377 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(this.getUniqueTagValue(str_tag), "");

		if (idIfCond_377) {

			java.lang.Boolean idIfCond_378 = false;
			idIfCond_378 = kermeta.standard.helper.StringWrapper.equals(this
					.getUniqueTagValue(str_tag), "true");

			if (idIfCond_378) {

				result = true;
			}

		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isKindOf(kermeta.language.structure.Class cl) {

		java.lang.Boolean result = null;

		result = org.kermeta.compil.runtime.helper.language.ClassUtil
				.equalsSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClassSwitcher(this), cl);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Class getMetaClass() {

		kermeta.language.structure.Class result = null;

		result = (kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClass(this),
						"kermeta.language.structure.Class");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set(Property property, kermeta.language.structure.Object element) {

		java.lang.Boolean idIfCond_379 = false;
		idIfCond_379 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(element, property.getType());

		if (idIfCond_379) {

			org.kermeta.compil.runtime.helper.language.ObjectUtil.set(this,
					property, element);
		} else {

			kermeta.language.structure.EnumerationLiteral v = null;

			v = (kermeta.language.structure.EnumerationLiteral) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeOrVoid(element,
							"kermeta.language.structure.EnumerationLiteral");

			java.lang.Boolean idIfCond_380 = false;
			//BIft:andThen

			java.lang.Boolean result_ft68 = null;

			java.lang.Boolean idIfCond_381 = false;
			idIfCond_381 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(v, null);

			if (idIfCond_381) {

				//BIle:right
				/*This variable should be never used*/kermeta.language.structure.Object e_lbdExp68 = null;

				result_ft68 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equalsSwitcher(property.getType(), v.getEnumeration());
				//EIle:right

			} else {

				result_ft68 = false;
			}

			//CEC
			idIfCond_380 = result_ft68;
			//EIft:andThen

			if (idIfCond_380) {

				org.kermeta.compil.runtime.helper.language.ObjectUtil.set(this,
						property, v);
			} else {

				kermeta.exceptions.IncompatibleTypeError e = ((kermeta.exceptions.IncompatibleTypeError) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
								.getIncompatibleTypeError()));

				e
						.setMessage(kermeta.standard.helper.StringWrapper
								.plus(
										kermeta.standard.helper.StringWrapper
												.plus(
														kermeta.standard.helper.StringWrapper
																.plus(
																		kermeta.standard.helper.StringWrapper
																				.plus(
																						kermeta.standard.helper.StringWrapper
																								.plus(
																										kermeta.standard.helper.StringWrapper
																												.plus(
																														"IncompatibleTypeError : Cannot set property ",
																														property
																																.getName()),
																										" of object "),
																						org.kermeta.compil.runtime.helper.language.ObjectUtil
																								.toStringSwitcher(this)),
																		" to "),
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.toStringSwitcher(element)),
										"."));

				if (true)
					throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
							e);

			}

		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEMFEDataTypeInstanceClassName() {

		java.lang.String result = null;

		result = this.getUniqueTagValue("ecore.EDataType_instanceClassName");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getPropertyValue(String propertyName) {

		kermeta.language.structure.Property result = null;

		kermeta.language.structure.ClassDefinition classDefinition = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClassSwitcher(this).getTypeDefinition(),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.ClassDefinition")));

		//BIft:detect

		kermeta.language.structure.Property result_ft69 = null;

		kermeta.language.structure.Property elem_ft69 = null;

		result_ft69 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft69 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Property> convertAsSet(
							classDefinition.getterAllAttribute()).iterator();
			java.lang.Boolean idLoopCond_382 = false;
			while (!idLoopCond_382) {
				idLoopCond_382 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft69.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft69, null));
				if (idLoopCond_382) {
				} else {

					elem_ft69 = it_ft69.next();

					java.lang.Boolean idIfCond_383 = false;
					//BIle:detector
					kermeta.language.structure.Property p_lbdExp69 = elem_ft69;

					idIfCond_383 = kermeta.standard.helper.StringWrapper
							.equals(
									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													p_lbdExp69,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.Property")))
											.getName(), propertyName);
					//EIle:detector

					if (idIfCond_383) {

						result_ft69 = elem_ft69;
					}

				}
			}
		}

		//EIft:detect
		result = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeSwitcher(result_ft69,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.structure.Property")));

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkInvariants() {

		kermeta.language.structure.ClassDefinition cd = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getMetaClassSwitcher(this).getterClassDefinition();

		java.lang.Boolean idIfCond_384 = false;
		idIfCond_384 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(cd));

		if (idIfCond_384) {

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft70 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_385 = false;
				while (!idLoopCond_385) {
					idLoopCond_385 = it_ft70.isOff();
					if (idLoopCond_385) {
					} else {

						//BIle:func
						kermeta.language.structure.Property p_lbdExp70 = it_ft70
								.next();

						//BIft:exists

						java.lang.Boolean result_ft71 = null;

						java.lang.Boolean test_ft71 = false;

						{

							kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft71 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Tag> convertAsOrderedSet(
											p_lbdExp70.getTag()).iterator();
							java.lang.Boolean idLoopCond_387 = false;
							while (!idLoopCond_387) {
								idLoopCond_387 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft71.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																test_ft71,
																false));
								if (idLoopCond_387) {
								} else {

									java.lang.Boolean result_lambda_ft71 = null;
									//BIle:func
									kermeta.language.structure.Tag t_lbdExp71 = it_ft71
											.next();

									result_lambda_ft71 = kermeta.standard.helper.StringWrapper
											.equals(t_lbdExp71.getName(),
													"ecore.isTransient");
									//EIle:func

									test_ft71 = kermeta.standard.helper.BooleanWrapper
											.or(test_ft71, result_lambda_ft71);
								}
							}
						}

						result_ft71 = test_ft71;
						//EIft:exists
						java.lang.Boolean idIfCond_386 = false;
						idIfCond_386 = kermeta.standard.helper.BooleanWrapper
								.and(kermeta.standard.helper.BooleanWrapper
										.not(result_ft71),
										kermeta.standard.helper.BooleanWrapper
												.not(p_lbdExp70.getIsDerived()));

						if (idIfCond_386) {

							kermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.getSwitcher(this, p_lbdExp70);

							java.lang.Boolean idIfCond_388 = false;
							//BIft:andThen

							java.lang.Boolean result_ft72 = null;

							java.lang.Boolean idIfCond_389 = false;
							idIfCond_389 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(v));

							if (idIfCond_389) {

								//BIle:right
								/*This variable should be never used*/kermeta.language.structure.Object f_lbdExp72 = null;

								result_ft72 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>"));
								//EIle:right

							} else {

								result_ft72 = false;
							}

							//CEC
							idIfCond_388 = result_ft72;
							//EIft:andThen

							if (idIfCond_388) {

								kermeta.standard.Collection<kermeta.language.structure.Object> c = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>")));

								java.lang.Boolean idIfCond_390 = false;
								idIfCond_390 = kermeta.standard.helper.BooleanWrapper
										.and(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																p_lbdExp70
																		.getUpper(),
																org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.convertAsObject(kermeta.standard.helper.IntegerWrapper
																				.uminus(1))),
												kermeta.standard.helper.IntegerWrapper
														.isGreater(
																c.size(),
																p_lbdExp70
																		.getUpper()));

								if (idIfCond_390) {

									kermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
											.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
													.getConstraintViolatedInv()));

									e
											.setMessage(kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											kermeta.standard.helper.StringWrapper
																													.plus(
																															"Inv lower bound of ",
																															cd
																																	.getName()),
																											"."),
																							p_lbdExp70
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toStringSwitcher(this)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

								java.lang.Boolean idIfCond_391 = false;
								idIfCond_391 = kermeta.standard.helper.IntegerWrapper
										.isLower(c.size(), p_lbdExp70
												.getLower());

								if (idIfCond_391) {

									kermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
											.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
													.getConstraintViolatedInv()));

									e
											.setMessage(kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											kermeta.standard.helper.StringWrapper
																													.plus(
																															"Inv lower bound of ",
																															cd
																																	.getName()),
																											"."),
																							p_lbdExp70
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toStringSwitcher(this)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

							} else {

								java.lang.Boolean idIfCond_392 = false;
								idIfCond_392 = kermeta.standard.helper.BooleanWrapper
										.and(
												kermeta.standard.helper.IntegerWrapper
														.equals(p_lbdExp70
																.getLower(), 1),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isVoidSwitcher(v));

								if (idIfCond_392) {

									kermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
											.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
													.getConstraintViolatedInv()));

									e
											.setMessage(kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											kermeta.standard.helper.StringWrapper
																													.plus(
																															"Inv lower bound of ",
																															cd
																																	.getName()),
																											"."),
																							p_lbdExp70
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toStringSwitcher(this)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

							}

						}

						//EIle:func

					}
				}
			}

			//EIft:each

		}

		org.kermeta.compil.runtime.helper.language.ObjectUtil
				.checkInvariants(this);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEMFDefaultConstructor() {

		java.lang.String result = null;

		result = this.getUniqueTagValue("EMF_defaultConstructor");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isVoid() {

		java.lang.Boolean result = null;

		result = false;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer oid() {

		java.lang.Integer result = null;

		result = (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getOID(this), "java.lang.Integer");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isInstanceOf(Type type) {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOf(this, type.getClass().getName()),
						"java.lang.Boolean");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompiledJavaExtern() {

		java.lang.String result = null;

		result = this.getUniqueTagValue("compiledJavaExtern");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void applyPass2BehaviorKmt(KM2EcoreContext context) {

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isFrozen() {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isFrozen(this), "java.lang.Boolean");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer hashcode() {

		java.lang.Integer result = null;

		result = (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.hashcode(this), "java.lang.Integer");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean callsFunctionType() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_393 = false;
		idIfCond_393 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.behavior.CallFeature"));

		if (idIfCond_393) {

			java.lang.Boolean idIfCond_394 = false;
			idIfCond_394 = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.behavior.CallFeature")))
					.isCallFeatureAsStaticOperation();

			if (idIfCond_394) {

				java.lang.Boolean idIfCond_395 = false;
				idIfCond_395 = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.CallFeature")))
						.getStaticOperation().isFunctionType();

				if (idIfCond_395) {

					result = true;
				}

			}

		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Package getRootPackage() {

		kermeta.language.structure.Package result = null;

		result = null;

		kermeta.language.structure.Package topPack = ((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeSwitcher(
						this
								.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.Package")),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.structure.Package")));

		kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(topPack));
		java.lang.Boolean idLoopCond_396 = false;
		while (!idLoopCond_396) {
			idLoopCond_396 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isVoidSwitcher(topPack);
			if (idLoopCond_396) {
			} else {

				result = topPack;

				topPack = (kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeOrVoid(
								topPack
										.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Package")),
								"kermeta.language.structure.Package");
			}
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUniqueTagValue(String key) {

		java.lang.String result = null;

		result = "";

		kermeta.standard.OrderedSet<java.lang.String> value_list = this
				.getTagValues(key);

		java.lang.Boolean idIfCond_397 = false;
		idIfCond_397 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(value_list)),
						kermeta.standard.helper.IntegerWrapper
								.isGreaterOrEqual(value_list.size(), 1));

		if (idIfCond_397) {

			result = value_list.first();
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFinalJavaClassQN() {

		java.lang.String result = null;

		result = this.getUniqueTagValue("finalJavaClassQN");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object getContainerAsType(Type type) {

		kermeta.language.structure.Object result = null;

		result = null;

		kermeta.language.structure.Object obj = this;

		{

			java.lang.Integer i = 0;
			java.lang.Boolean idLoopCond_398 = false;
			while (!idLoopCond_398) {
				idLoopCond_398 = kermeta.standard.helper.IntegerWrapper.equals(
						i, 1);
				if (idLoopCond_398) {
				} else {

					java.lang.Boolean idIfCond_399 = false;
					idIfCond_399 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.containerSwitcher(obj)));

					if (idIfCond_399) {

						java.lang.Boolean idIfCond_400 = false;
						idIfCond_400 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.containerSwitcher(obj), type);

						if (idIfCond_400) {

							i = 1;

							result = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.containerSwitcher(obj);
						} else {

							obj = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.containerSwitcher(obj);
						}

					} else {

						i = 1;
					}

				}
			}
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isNotEqual(kermeta.language.structure.Object element) {

		java.lang.Boolean result = null;

		result = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equalsSwitcher(this, element));

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void freeze() {

		org.kermeta.compil.runtime.helper.language.ObjectUtil.freeze(this);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEMFEDataTypeETypeParameters() {

		java.lang.String result = null;

		result = this.getUniqueTagValue("ecore.EDataType_eTypeParameters");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object asType(
			kermeta.language.structure.Class type) {

		kermeta.language.structure.Object result = null;

		java.lang.Boolean idIfCond_401 = false;
		idIfCond_401 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(this, type);

		if (idIfCond_401) {

			result = this;
		} else {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.TypeCastError) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getTypeCastError())));

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
		case StructurePackage.OBJECT__TAG:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTag())
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
		case StructurePackage.OBJECT__TAG:
			return ((InternalEList<?>) getTag()).basicRemove(otherEnd, msgs);
		case StructurePackage.OBJECT__OWNED_TAGS:
			return ((InternalEList<?>) getOwnedTags()).basicRemove(otherEnd,
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
		case StructurePackage.OBJECT__FILE:
			if (resolve)
				return getFile();
			return basicGetFile();
		case StructurePackage.OBJECT__TAG:
			return getTag();
		case StructurePackage.OBJECT__FILE_NAME:
			return getFileName();
		case StructurePackage.OBJECT__LINE_NUMBER:
			return getLineNumber();
		case StructurePackage.OBJECT__OWNED_TAGS:
			return getOwnedTags();
		case StructurePackage.OBJECT__OID:
			return getOid();
		case StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE:
			if (resolve)
				return getInternalContainingResource();
			return basicGetInternalContainingResource();
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
		case StructurePackage.OBJECT__FILE:
			setFile((File) newValue);
			return;
		case StructurePackage.OBJECT__TAG:
			getTag().clear();
			getTag().addAll((Collection<? extends Tag>) newValue);
			return;
		case StructurePackage.OBJECT__FILE_NAME:
			setFileName((String) newValue);
			return;
		case StructurePackage.OBJECT__LINE_NUMBER:
			setLineNumber((Integer) newValue);
			return;
		case StructurePackage.OBJECT__OWNED_TAGS:
			getOwnedTags().clear();
			getOwnedTags().addAll((Collection<? extends Tag>) newValue);
			return;
		case StructurePackage.OBJECT__OID:
			setOid((Integer) newValue);
			return;
		case StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE:
			setInternalContainingResource((Resource) newValue);
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
		case StructurePackage.OBJECT__FILE:
			setFile((File) null);
			return;
		case StructurePackage.OBJECT__TAG:
			getTag().clear();
			return;
		case StructurePackage.OBJECT__FILE_NAME:
			setFileName(FILE_NAME_EDEFAULT);
			return;
		case StructurePackage.OBJECT__LINE_NUMBER:
			setLineNumber(LINE_NUMBER_EDEFAULT);
			return;
		case StructurePackage.OBJECT__OWNED_TAGS:
			getOwnedTags().clear();
			return;
		case StructurePackage.OBJECT__OID:
			setOid(OID_EDEFAULT);
			return;
		case StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE:
			setInternalContainingResource((Resource) null);
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
		case StructurePackage.OBJECT__FILE:
			return file != null;
		case StructurePackage.OBJECT__TAG:
			return tag != null && !tag.isEmpty();
		case StructurePackage.OBJECT__FILE_NAME:
			return FILE_NAME_EDEFAULT == null ? fileName != null
					: !FILE_NAME_EDEFAULT.equals(fileName);
		case StructurePackage.OBJECT__LINE_NUMBER:
			return LINE_NUMBER_EDEFAULT == null ? lineNumber != null
					: !LINE_NUMBER_EDEFAULT.equals(lineNumber);
		case StructurePackage.OBJECT__OWNED_TAGS:
			return ownedTags != null && !ownedTags.isEmpty();
		case StructurePackage.OBJECT__OID:
			return OID_EDEFAULT == null ? oid != null : !OID_EDEFAULT
					.equals(oid);
		case StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE:
			return internalContainingResource != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectImpl
