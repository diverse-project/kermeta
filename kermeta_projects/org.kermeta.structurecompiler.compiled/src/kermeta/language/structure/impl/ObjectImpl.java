/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generated with Kermeta <http://www.kermeta.org>
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
 *   <li>{@link kermeta.language.structure.impl.ObjectImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ObjectImpl#getFile <em>File</em>}</li>
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
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tag;

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
			java.lang.Boolean idLoopCond_252 = false;
			while (!idLoopCond_252) {
				idLoopCond_252 = kermeta.standard.helper.BooleanWrapper.or(
						kermeta.standard.helper.IntegerWrapper.equals(i, 1),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(obj, stop_type));
				if (idLoopCond_252) {
				} else {

					java.lang.Boolean idIfCond_253 = false;
					idIfCond_253 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.containerSwitcher(obj)));

					if (idIfCond_253) {

						java.lang.Boolean idIfCond_254 = false;
						idIfCond_254 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.containerSwitcher(obj), type);

						if (idIfCond_254) {

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

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft97 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_255 = false;
			while (!idLoopCond_255) {
				idLoopCond_255 = it_ft97.isOff();
				if (idLoopCond_255) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp97 = it_ft97.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp96 = o_lbdExp97;

					java.lang.Boolean idIfCond_256 = false;
					idIfCond_256 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp96.getDeprecated(), "");

					if (idIfCond_256) {

						p_lbdExp96.applyPass2(context);
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

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft98 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_257 = false;
			while (!idLoopCond_257) {
				idLoopCond_257 = it_ft98.isOff();
				if (idLoopCond_257) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag t_lbdExp98 = it_ft98.next();

					java.lang.Boolean idIfCond_258 = false;
					idIfCond_258 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(t_lbdExp98.getName()));

					if (idIfCond_258) {

						java.lang.Boolean idIfCond_259 = false;
						idIfCond_259 = kermeta.standard.helper.StringWrapper
								.equals(t_lbdExp98.getName(), key);

						if (idIfCond_259) {

							value_list.add(t_lbdExp98.getValue());
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

		java.lang.Boolean idIfCond_260 = false;
		idIfCond_260 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(this, null);

		if (idIfCond_260) {

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

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft99 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_261 = false;
				while (!idLoopCond_261) {
					idLoopCond_261 = it_ft99.isOff();
					if (idLoopCond_261) {
					} else {

						//BIle:func
						kermeta.language.structure.Property prop_lbdExp99 = it_ft99
								.next();

						java.lang.Boolean idIfCond_262 = false;
						idIfCond_262 = kermeta.standard.helper.BooleanWrapper
								.and(prop_lbdExp99.getIsComposite(),
										kermeta.standard.helper.BooleanWrapper
												.not(prop_lbdExp99
														.getIsDerived()));

						if (idIfCond_262) {

							java.lang.Boolean idIfCond_263 = false;
							idIfCond_263 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.getSwitcher(this,
															prop_lbdExp99)));

							if (idIfCond_263) {

								java.lang.Boolean idIfCond_264 = false;
								//BIft:exists

								java.lang.Boolean result_ft100 = null;

								java.lang.Boolean test_ft100 = false;

								{

									kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft100 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.getMetaClassSwitcher(
																	org.kermeta.compil.runtime.helper.language.ObjectUtil
																			.getSwitcher(
																					this,
																					prop_lbdExp99))
															.getTypeDefinition(),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")))
											.allSuperTypes().iterator();
									java.lang.Boolean idLoopCond_265 = false;
									while (!idLoopCond_265) {
										idLoopCond_265 = kermeta.standard.helper.BooleanWrapper
												.or(
														it_ft100.isOff(),
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isNotEqualSwitcher(
																		test_ft100,
																		false));
										if (idLoopCond_265) {
										} else {

											java.lang.Boolean result_lambda_ft100 = null;
											//BIle:func
											kermeta.language.structure.Type t_lbdExp100 = it_ft100
													.next();

											java.lang.Boolean idIfCond_266 = false;
											idIfCond_266 = org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isInstanceOfSwitcher(
															t_lbdExp100,
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.ParameterizedType"));

											if (idIfCond_266) {

												result_lambda_ft100 = kermeta.standard.helper.StringWrapper
														.equals(
																((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				t_lbdExp100,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.ParameterizedType")))
																		.getTypeDefinition()
																		.qualifiedName(),
																"kermeta::standard::Collection");
											} else {

												result_lambda_ft100 = false;
											}

											//EIle:func

											test_ft100 = kermeta.standard.helper.BooleanWrapper
													.or(test_ft100,
															result_lambda_ft100);
										}
									}
								}

								result_ft100 = test_ft100;

								//CEC
								idIfCond_264 = result_ft100;
								//EIft:exists

								if (idIfCond_264) {

									kermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;

									subObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeOrVoid(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.getSwitcher(this,
																	prop_lbdExp99),
													"kermeta.standard.Collection<kermeta.language.structure.Object>");

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft101 = subObjInstances
												.iterator();
										java.lang.Boolean idLoopCond_267 = false;
										while (!idLoopCond_267) {
											idLoopCond_267 = it_ft101.isOff();
											if (idLoopCond_267) {
											} else {

												//BIle:func
												kermeta.language.structure.Object aSubObjInstances_lbdExp101 = it_ft101
														.next();

												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.checkAllInvariantsSwitcher(aSubObjInstances_lbdExp101);
												//EIle:func

											}
										}
									}

									//EIft:each

								} else {

									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.checkAllInvariantsSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.getSwitcher(this,
															prop_lbdExp99));
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

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft103 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_268 = false;
			while (!idLoopCond_268) {
				idLoopCond_268 = it_ft103.isOff();
				if (idLoopCond_268) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp103 = it_ft103
							.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp102 = o_lbdExp103;

					p_lbdExp102.applyPass2BehaviorJava(context);
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

		java.lang.Boolean idIfCond_269 = false;
		idIfCond_269 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(cd));

		if (idIfCond_269) {

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft104 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_270 = false;
				while (!idLoopCond_270) {
					idLoopCond_270 = it_ft104.isOff();
					if (idLoopCond_270) {
					} else {

						//BIle:func
						kermeta.language.structure.Property prop_lbdExp104 = it_ft104
								.next();

						//BIft:exists

						java.lang.Boolean result_ft105 = null;

						java.lang.Boolean test_ft105 = false;

						{

							kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft105 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Tag> convertAsOrderedSet(
											prop_lbdExp104.getTag()).iterator();
							java.lang.Boolean idLoopCond_272 = false;
							while (!idLoopCond_272) {
								idLoopCond_272 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft105.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																test_ft105,
																false));
								if (idLoopCond_272) {
								} else {

									java.lang.Boolean result_lambda_ft105 = null;
									//BIle:func
									kermeta.language.structure.Tag t_lbdExp105 = it_ft105
											.next();

									result_lambda_ft105 = kermeta.standard.helper.StringWrapper
											.equals(t_lbdExp105.getName(),
													"ecore.isTransient");
									//EIle:func

									test_ft105 = kermeta.standard.helper.BooleanWrapper
											.or(test_ft105, result_lambda_ft105);
								}
							}
						}

						result_ft105 = test_ft105;
						//EIft:exists
						java.lang.Boolean idIfCond_271 = false;
						idIfCond_271 = kermeta.standard.helper.BooleanWrapper
								.and(kermeta.standard.helper.BooleanWrapper
										.not(result_ft105),
										kermeta.standard.helper.BooleanWrapper
												.not(prop_lbdExp104
														.getIsDerived()));

						if (idIfCond_271) {

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
																					prop_lbdExp104
																							.getName()),
																	"_"),
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.toStringSwitcher(prop_lbdExp104
																	.getType())));

							constraint.setProperty(prop_lbdExp104);

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

							java.lang.Boolean idIfCond_273 = false;
							idIfCond_273 = prop_lbdExp104.getIsComposite();

							if (idIfCond_273) {

								java.lang.Boolean idIfCond_274 = false;
								idIfCond_274 = kermeta.standard.helper.BooleanWrapper
										.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
														.getSwitcher(this,
																prop_lbdExp104)));

								if (idIfCond_274) {

									java.lang.Boolean idIfCond_275 = false;
									//BIft:exists

									java.lang.Boolean result_ft106 = null;

									java.lang.Boolean test_ft106 = false;

									{

										kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft106 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.getMetaClassSwitcher(
																		org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.getSwitcher(
																						this,
																						prop_lbdExp104))
																.getTypeDefinition(),
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.structure.ClassDefinition")))
												.allSuperTypes().iterator();
										java.lang.Boolean idLoopCond_276 = false;
										while (!idLoopCond_276) {
											idLoopCond_276 = kermeta.standard.helper.BooleanWrapper
													.or(
															it_ft106.isOff(),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.isNotEqualSwitcher(
																			test_ft106,
																			false));
											if (idLoopCond_276) {
											} else {

												java.lang.Boolean result_lambda_ft106 = null;
												//BIle:func
												kermeta.language.structure.Type t_lbdExp106 = it_ft106
														.next();

												java.lang.Boolean idIfCond_277 = false;
												idIfCond_277 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																t_lbdExp106,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.ParameterizedType"));

												if (idIfCond_277) {

													result_lambda_ft106 = kermeta.standard.helper.StringWrapper
															.equals(
																	((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																			.asTypeSwitcher(
																					t_lbdExp106,
																					org.kermeta.compil.runtime.ExecutionContext
																							.getInstance()
																							.getMetaClass(
																									"kermeta.language.structure.ParameterizedType")))
																			.getTypeDefinition()
																			.qualifiedName(),
																	"kermeta::standard::Collection");
												} else {

													result_lambda_ft106 = false;
												}

												//EIle:func

												test_ft106 = kermeta.standard.helper.BooleanWrapper
														.or(test_ft106,
																result_lambda_ft106);
											}
										}
									}

									result_ft106 = test_ft106;

									//CEC
									idIfCond_275 = result_ft106;
									//EIft:exists

									if (idIfCond_275) {

										kermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;

										subObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeOrVoid(
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.getSwitcher(
																		this,
																		prop_lbdExp104),
														"kermeta.standard.Collection<kermeta.language.structure.Object>");

										//BIft:each

										{

											kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft107 = subObjInstances
													.iterator();
											java.lang.Boolean idLoopCond_278 = false;
											while (!idLoopCond_278) {
												idLoopCond_278 = it_ft107
														.isOff();
												if (idLoopCond_278) {
												} else {

													//BIle:func
													kermeta.language.structure.Object aSubObjInstances_lbdExp107 = it_ft107
															.next();

													//BIft:each

													{

														kermeta.standard.Iterator<kermeta.exceptions.ConstraintViolatedInv> it_ft108 = aSubObjInstances_lbdExp107
																.getViolatedConstraints()
																.getSetConstraints()
																.iterator();
														java.lang.Boolean idLoopCond_279 = false;
														while (!idLoopCond_279) {
															idLoopCond_279 = it_ft108
																	.isOff();
															if (idLoopCond_279) {
															} else {

																//BIle:func
																kermeta.exceptions.ConstraintViolatedInv v_lbdExp108 = it_ft108
																		.next();

																contraintes
																		.add(v_lbdExp108);
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

											kermeta.standard.Iterator<kermeta.exceptions.ConstraintViolatedInv> it_ft109 = org.kermeta.compil.runtime.helper.language.ObjectUtil
													.getSwitcher(this,
															prop_lbdExp104)
													.getViolatedConstraints()
													.getSetConstraints()
													.iterator();
											java.lang.Boolean idLoopCond_280 = false;
											while (!idLoopCond_280) {
												idLoopCond_280 = it_ft109
														.isOff();
												if (idLoopCond_280) {
												} else {

													//BIle:func
													kermeta.exceptions.ConstraintViolatedInv v_lbdExp109 = it_ft109
															.next();

													contraintes
															.add(v_lbdExp109);
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

				kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft110 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Constraint> convertAsOrderedSet(
								cd.getInv()).iterator();
				java.lang.Boolean idLoopCond_281 = false;
				while (!idLoopCond_281) {
					idLoopCond_281 = it_ft110.isOff();
					if (idLoopCond_281) {
					} else {

						//BIle:func
						kermeta.language.structure.Constraint invariant_lbdExp110 = it_ft110
								.next();
						try {
							this.checkInvariant(invariant_lbdExp110);
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

		java.lang.Boolean idIfCond_282 = false;
		idIfCond_282 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isKindOfSwitcher(
						invariant,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.PropertyConstraint"));

		if (idIfCond_282) {

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

			java.lang.Boolean idIfCond_283 = false;
			//BIft:andThen

			java.lang.Boolean result_ft111 = null;

			java.lang.Boolean idIfCond_284 = false;
			idIfCond_284 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(v));

			if (idIfCond_284) {

				//BIle:right
				/*This variable should be never used*/kermeta.language.structure.Object f_lbdExp111 = null;

				result_ft111 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								v,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.standard.Collection<kermeta.language.structure.Object>"));
				//EIle:right

			} else {

				result_ft111 = false;
			}

			//CEC
			idIfCond_283 = result_ft111;
			//EIft:andThen

			if (idIfCond_283) {

				kermeta.standard.Collection<kermeta.language.structure.Object> coll = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								v,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.standard.Collection<kermeta.language.structure.Object>")));

				java.lang.Boolean idIfCond_285 = false;
				idIfCond_285 = kermeta.standard.helper.BooleanWrapper
						.and(
								org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isNotEqualSwitcher(
												prop.getUpper(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.convertAsObject(kermeta.standard.helper.IntegerWrapper
																.uminus(1))),
								kermeta.standard.helper.IntegerWrapper
										.isGreater(coll.size(), prop.getUpper()));

				if (idIfCond_285) {

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

				java.lang.Boolean idIfCond_286 = false;
				idIfCond_286 = kermeta.standard.helper.IntegerWrapper.isLower(
						coll.size(), prop.getLower());

				if (idIfCond_286) {

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

				java.lang.Boolean idIfCond_287 = false;
				idIfCond_287 = kermeta.standard.helper.BooleanWrapper.and(
						kermeta.standard.helper.IntegerWrapper.equals(prop
								.getLower(), 1),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoidSwitcher(v));

				if (idIfCond_287) {

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

		java.lang.Boolean idIfCond_288 = false;
		idIfCond_288 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(this.getUniqueTagValue(str_tag), "");

		if (idIfCond_288) {

			java.lang.Boolean idIfCond_289 = false;
			idIfCond_289 = kermeta.standard.helper.StringWrapper.equals(this
					.getUniqueTagValue(str_tag), "true");

			if (idIfCond_289) {

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

		java.lang.Boolean idIfCond_290 = false;
		idIfCond_290 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(element, property.getType());

		if (idIfCond_290) {

			org.kermeta.compil.runtime.helper.language.ObjectUtil.set(this,
					property, element);
		} else {

			kermeta.language.structure.EnumerationLiteral v = null;

			v = (kermeta.language.structure.EnumerationLiteral) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeOrVoid(element,
							"kermeta.language.structure.EnumerationLiteral");

			java.lang.Boolean idIfCond_291 = false;
			//BIft:andThen

			java.lang.Boolean result_ft112 = null;

			java.lang.Boolean idIfCond_292 = false;
			idIfCond_292 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(v, null);

			if (idIfCond_292) {

				//BIle:right
				/*This variable should be never used*/kermeta.language.structure.Object e_lbdExp112 = null;

				result_ft112 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equalsSwitcher(property.getType(), v.getEnumeration());
				//EIle:right

			} else {

				result_ft112 = false;
			}

			//CEC
			idIfCond_291 = result_ft112;
			//EIft:andThen

			if (idIfCond_291) {

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

		kermeta.language.structure.Property result_ft113 = null;

		kermeta.language.structure.Property elem_ft113 = null;

		result_ft113 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft113 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Property> convertAsSet(
							classDefinition.getterAllAttribute()).iterator();
			java.lang.Boolean idLoopCond_293 = false;
			while (!idLoopCond_293) {
				idLoopCond_293 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft113.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft113, null));
				if (idLoopCond_293) {
				} else {

					elem_ft113 = it_ft113.next();

					java.lang.Boolean idIfCond_294 = false;
					//BIle:detector
					kermeta.language.structure.Property p_lbdExp113 = elem_ft113;

					idIfCond_294 = kermeta.standard.helper.StringWrapper
							.equals(
									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													p_lbdExp113,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.Property")))
											.getName(), propertyName);
					//EIle:detector

					if (idIfCond_294) {

						result_ft113 = elem_ft113;
					}

				}
			}
		}

		//EIft:detect
		result = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeSwitcher(result_ft113,
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

		java.lang.Boolean idIfCond_295 = false;
		idIfCond_295 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(cd));

		if (idIfCond_295) {

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft114 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_296 = false;
				while (!idLoopCond_296) {
					idLoopCond_296 = it_ft114.isOff();
					if (idLoopCond_296) {
					} else {

						//BIle:func
						kermeta.language.structure.Property p_lbdExp114 = it_ft114
								.next();

						//BIft:exists

						java.lang.Boolean result_ft115 = null;

						java.lang.Boolean test_ft115 = false;

						{

							kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft115 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Tag> convertAsOrderedSet(
											p_lbdExp114.getTag()).iterator();
							java.lang.Boolean idLoopCond_298 = false;
							while (!idLoopCond_298) {
								idLoopCond_298 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft115.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																test_ft115,
																false));
								if (idLoopCond_298) {
								} else {

									java.lang.Boolean result_lambda_ft115 = null;
									//BIle:func
									kermeta.language.structure.Tag t_lbdExp115 = it_ft115
											.next();

									result_lambda_ft115 = kermeta.standard.helper.StringWrapper
											.equals(t_lbdExp115.getName(),
													"ecore.isTransient");
									//EIle:func

									test_ft115 = kermeta.standard.helper.BooleanWrapper
											.or(test_ft115, result_lambda_ft115);
								}
							}
						}

						result_ft115 = test_ft115;
						//EIft:exists
						java.lang.Boolean idIfCond_297 = false;
						idIfCond_297 = kermeta.standard.helper.BooleanWrapper
								.and(
										kermeta.standard.helper.BooleanWrapper
												.not(result_ft115),
										kermeta.standard.helper.BooleanWrapper
												.not(p_lbdExp114.getIsDerived()));

						if (idIfCond_297) {

							kermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.getSwitcher(this, p_lbdExp114);

							java.lang.Boolean idIfCond_299 = false;
							//BIft:andThen

							java.lang.Boolean result_ft116 = null;

							java.lang.Boolean idIfCond_300 = false;
							idIfCond_300 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(v));

							if (idIfCond_300) {

								//BIle:right
								/*This variable should be never used*/kermeta.language.structure.Object f_lbdExp116 = null;

								result_ft116 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>"));
								//EIle:right

							} else {

								result_ft116 = false;
							}

							//CEC
							idIfCond_299 = result_ft116;
							//EIft:andThen

							if (idIfCond_299) {

								kermeta.standard.Collection<kermeta.language.structure.Object> c = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>")));

								java.lang.Boolean idIfCond_301 = false;
								idIfCond_301 = kermeta.standard.helper.BooleanWrapper
										.and(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																p_lbdExp114
																		.getUpper(),
																org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.convertAsObject(kermeta.standard.helper.IntegerWrapper
																				.uminus(1))),
												kermeta.standard.helper.IntegerWrapper
														.isGreater(
																c.size(),
																p_lbdExp114
																		.getUpper()));

								if (idIfCond_301) {

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
																							p_lbdExp114
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toStringSwitcher(this)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

								java.lang.Boolean idIfCond_302 = false;
								idIfCond_302 = kermeta.standard.helper.IntegerWrapper
										.isLower(c.size(), p_lbdExp114
												.getLower());

								if (idIfCond_302) {

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
																							p_lbdExp114
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toStringSwitcher(this)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

							} else {

								java.lang.Boolean idIfCond_303 = false;
								idIfCond_303 = kermeta.standard.helper.BooleanWrapper
										.and(
												kermeta.standard.helper.IntegerWrapper
														.equals(p_lbdExp114
																.getLower(), 1),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isVoidSwitcher(v));

								if (idIfCond_303) {

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
																							p_lbdExp114
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

		java.lang.Boolean idIfCond_304 = false;
		idIfCond_304 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.behavior.CallFeature"));

		if (idIfCond_304) {

			java.lang.Boolean idIfCond_305 = false;
			idIfCond_305 = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.behavior.CallFeature")))
					.isCallFeatureAsStaticOperation();

			if (idIfCond_305) {

				java.lang.Boolean idIfCond_306 = false;
				idIfCond_306 = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.CallFeature")))
						.getStaticOperation().isFunctionType();

				if (idIfCond_306) {

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
		java.lang.Boolean idLoopCond_307 = false;
		while (!idLoopCond_307) {
			idLoopCond_307 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isVoidSwitcher(topPack);
			if (idLoopCond_307) {
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

		java.lang.Boolean idIfCond_308 = false;
		idIfCond_308 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(value_list)),
						kermeta.standard.helper.IntegerWrapper
								.isGreaterOrEqual(value_list.size(), 1));

		if (idIfCond_308) {

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
			java.lang.Boolean idLoopCond_309 = false;
			while (!idLoopCond_309) {
				idLoopCond_309 = kermeta.standard.helper.IntegerWrapper.equals(
						i, 1);
				if (idLoopCond_309) {
				} else {

					java.lang.Boolean idIfCond_310 = false;
					idIfCond_310 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.containerSwitcher(obj)));

					if (idIfCond_310) {

						java.lang.Boolean idIfCond_311 = false;
						idIfCond_311 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.containerSwitcher(obj), type);

						if (idIfCond_311) {

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

		java.lang.Boolean idIfCond_312 = false;
		idIfCond_312 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(this, type);

		if (idIfCond_312) {

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
		case StructurePackage.OBJECT__TAG:
			return getTag();
		case StructurePackage.OBJECT__FILE:
			if (resolve)
				return getFile();
			return basicGetFile();
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
		case StructurePackage.OBJECT__TAG:
			getTag().clear();
			getTag().addAll((Collection<? extends Tag>) newValue);
			return;
		case StructurePackage.OBJECT__FILE:
			setFile((File) newValue);
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
		case StructurePackage.OBJECT__TAG:
			getTag().clear();
			return;
		case StructurePackage.OBJECT__FILE:
			setFile((File) null);
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
		case StructurePackage.OBJECT__TAG:
			return tag != null && !tag.isEmpty();
		case StructurePackage.OBJECT__FILE:
			return file != null;
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
