/**
 * <copyright>
 * </copyright>
 *
 * $Id: ObjectImpl.java,v 1.3 2008-09-22 14:47:35 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import java.util.Collection;

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
import org.eclipse.emf.ecore.impl.EObjectImpl;

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
 *   <li>{@link kermeta.language.structure.impl.ObjectImpl#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectImpl extends EObjectImpl implements
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
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected kermeta.language.structure.Object container;

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
		return StructurePackage.Literals.OBJECT;
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
	public kermeta.language.structure.Object getContainer() {
		if (container != null && container.eIsProxy()) {
			InternalEObject oldContainer = (InternalEObject) container;
			container = (kermeta.language.structure.Object) eResolveProxy(oldContainer);
			if (container != oldContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StructurePackage.OBJECT__CONTAINER, oldContainer,
							container));
			}
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object basicGetContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(kermeta.language.structure.Object newContainer) {
		kermeta.language.structure.Object oldContainer = container;
		container = newContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.OBJECT__CONTAINER, oldContainer, container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean interpretBooleanTag(String str_tag) {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_468 = false;
		idIfCond_468 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(this.getUniqueTagValue(str_tag), "");

		if (idIfCond_468) {

			java.lang.Boolean idIfCond_469 = false;
			idIfCond_469 = kermeta.standard.helper.StringWrapper.equals(this
					.getUniqueTagValue(str_tag), "true");

			if (idIfCond_469) {

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
	public Boolean isKindOf(kermeta.language.structure.Class cl) {

		java.lang.Boolean result = null;

		result = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getMetaClass(this).equals(cl);

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
				.getMetaClass(this);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set(Property property, kermeta.language.structure.Object element) {

		java.lang.Boolean idIfCond_470 = false;
		idIfCond_470 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(element, property.getType());

		if (idIfCond_470) {

			org.kermeta.compil.runtime.helper.language.ObjectUtil.set(this,
					property, element);
		} else {

			kermeta.exceptions.IncompatibleTypeError e = ((kermeta.exceptions.IncompatibleTypeError) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("kermeta.exceptions.IncompatibleTypeError"));

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
																							.toString(this)),
																	" to "),
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.toString(element)),
									"."));

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						e);

		}

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

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft69 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_471 = false;
			while (!idLoopCond_471) {
				idLoopCond_471 = it_ft69.isOff();
				if (idLoopCond_471) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp69 = it_ft69.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp68 = o_lbdExp69;

					java.lang.Boolean idIfCond_472 = false;
					idIfCond_472 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp68.getDeprecated(), "");

					if (idIfCond_472) {

						p_lbdExp68.applyPass2(context);
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
				.asType(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClass(this).getTypeDefinition(),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.ClassDefinition")));

		//BIft:detect

		kermeta.language.structure.Property result_ft70 = null;

		kermeta.language.structure.Property elem_ft70 = null;

		result_ft70 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft70 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Property> convertAsSet(
							classDefinition.getterAllAttribute()).iterator();
			java.lang.Boolean idLoopCond_473 = false;
			while (!idLoopCond_473) {
				idLoopCond_473 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft70.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft70, null));
				if (idLoopCond_473) {
				} else {

					elem_ft70 = it_ft70.next();

					java.lang.Boolean idIfCond_474 = false;
					//BIle:detector
					kermeta.language.structure.Property p_lbdExp70 = elem_ft70;

					idIfCond_474 = kermeta.standard.helper.StringWrapper
							.equals(
									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asType(
													p_lbdExp70,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.Property")))
											.getName(), propertyName);
					//EIle:detector

					if (idIfCond_474) {

						result_ft70 = elem_ft70;
					}

				}
			}
		}

		//EIft:detect
		result = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asType(result_ft70,
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
				.getMetaClass(this).getterClassDefinition();

		java.lang.Boolean idIfCond_475 = false;
		idIfCond_475 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(cd));

		if (idIfCond_475) {

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft71 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_476 = false;
				while (!idLoopCond_476) {
					idLoopCond_476 = it_ft71.isOff();
					if (idLoopCond_476) {
					} else {

						//BIle:func
						kermeta.language.structure.Property p_lbdExp71 = it_ft71
								.next();

						//BIft:exists

						java.lang.Boolean result_ft72 = null;

						java.lang.Boolean test_ft72 = false;

						{

							kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft72 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Tag> convertAsOrderedSet(
											p_lbdExp71.getTag()).iterator();
							java.lang.Boolean idLoopCond_478 = false;
							while (!idLoopCond_478) {
								idLoopCond_478 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft72.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqual(test_ft72,
																false));
								if (idLoopCond_478) {
								} else {

									java.lang.Boolean result_lambda_ft72 = null;
									//BIle:func
									kermeta.language.structure.Tag t_lbdExp72 = it_ft72
											.next();

									result_lambda_ft72 = kermeta.standard.helper.StringWrapper
											.equals(t_lbdExp72.getName(),
													"ecore.isTransient");
									//EIle:func

									test_ft72 = kermeta.standard.helper.BooleanWrapper
											.or(test_ft72, result_lambda_ft72);
								}
							}
						}

						result_ft72 = test_ft72;
						//EIft:exists
						java.lang.Boolean idIfCond_477 = false;
						idIfCond_477 = kermeta.standard.helper.BooleanWrapper
								.and(kermeta.standard.helper.BooleanWrapper
										.not(result_ft72),
										kermeta.standard.helper.BooleanWrapper
												.not(p_lbdExp71.getIsDerived()));

						if (idIfCond_477) {

							kermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.get(this, p_lbdExp71);

							java.lang.Boolean idIfCond_479 = false;
							//BIft:andThen

							java.lang.Boolean result_ft73 = null;

							java.lang.Boolean idIfCond_480 = false;
							idIfCond_480 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoid(v));

							if (idIfCond_480) {

								//BIle:right
								/*This variable should be never used*/kermeta.language.structure.Object f_lbdExp73 = null;

								result_ft73 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>"));
								//EIle:right

							} else {

								result_ft73 = false;
							}

							//CEC
							idIfCond_479 = result_ft73;
							//EIft:andThen

							if (idIfCond_479) {

								kermeta.standard.Collection<kermeta.language.structure.Object> c = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asType(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>")));

								java.lang.Boolean idIfCond_481 = false;
								idIfCond_481 = kermeta.standard.helper.BooleanWrapper
										.and(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqual(
																p_lbdExp71
																		.getUpper(),
																kermeta.standard.helper.IntegerWrapper
																		.uminus(1)),
												kermeta.standard.helper.IntegerWrapper
														.isGreater(
																c.size(),
																p_lbdExp71
																		.getUpper()));

								if (idIfCond_481) {

									kermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
											.newObject("kermeta.exceptions.ConstraintViolatedInv"));

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
																							p_lbdExp71
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toString(this)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

								java.lang.Boolean idIfCond_482 = false;
								idIfCond_482 = kermeta.standard.helper.IntegerWrapper
										.isLower(c.size(), p_lbdExp71
												.getLower());

								if (idIfCond_482) {

									kermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
											.newObject("kermeta.exceptions.ConstraintViolatedInv"));

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
																							p_lbdExp71
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toString(this)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

							} else {

								java.lang.Boolean idIfCond_483 = false;
								idIfCond_483 = kermeta.standard.helper.BooleanWrapper
										.and(
												kermeta.standard.helper.IntegerWrapper
														.equals(p_lbdExp71
																.getLower(), 1),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isVoid(v));

								if (idIfCond_483) {

									kermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil
											.newObject("kermeta.exceptions.ConstraintViolatedInv"));

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
																							p_lbdExp71
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toString(this)));

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
				.getOID(this);

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
				.newObject("kermeta.standard.OrderedSet<java.lang.String>"));

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft74 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_484 = false;
			while (!idLoopCond_484) {
				idLoopCond_484 = it_ft74.isOff();
				if (idLoopCond_484) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag t_lbdExp74 = it_ft74.next();

					java.lang.Boolean idIfCond_485 = false;
					idIfCond_485 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoid(t_lbdExp74.getName()));

					if (idIfCond_485) {

						java.lang.Boolean idIfCond_486 = false;
						idIfCond_486 = kermeta.standard.helper.StringWrapper
								.equals(t_lbdExp74.getName(), key);

						if (idIfCond_486) {

							value_list.add(t_lbdExp74.getValue());
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
	public Boolean isInstanceOf(Type type) {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(this, type.getClass().getName());

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkAllInvariants() {

		java.lang.Boolean idIfCond_487 = false;
		idIfCond_487 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(this, null);

		if (idIfCond_487) {

			org.kermeta.compil.runtime.helper.language.ObjectUtil
					.checkInvariants(this);

			kermeta.language.structure.ClassDefinition cd = null;

			cd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.getMetaClass(this).getTypeDefinition();

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft75 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_488 = false;
				while (!idLoopCond_488) {
					idLoopCond_488 = it_ft75.isOff();
					if (idLoopCond_488) {
					} else {

						//BIle:func
						kermeta.language.structure.Property prop_lbdExp75 = it_ft75
								.next();

						java.lang.Boolean idIfCond_489 = false;
						idIfCond_489 = kermeta.standard.helper.BooleanWrapper
								.and(prop_lbdExp75.getIsComposite(),
										kermeta.standard.helper.BooleanWrapper
												.not(prop_lbdExp75
														.getIsDerived()));

						if (idIfCond_489) {

							java.lang.Boolean idIfCond_490 = false;
							idIfCond_490 = kermeta.standard.helper.BooleanWrapper
									.or(
											kermeta.standard.helper.StringWrapper
													.equals(
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.getMetaClass(
																			org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.get(
																							this,
																							prop_lbdExp75))
																	.getTypeDefinition()
																	.getName(),
															"ReflectiveSequence"),
											kermeta.standard.helper.StringWrapper
													.equals(
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.getMetaClass(
																			org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.get(
																							this,
																							prop_lbdExp75))
																	.getTypeDefinition()
																	.getName(),
															"ReflectiveCollection"));

							if (idIfCond_490) {

								kermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;

								subObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.get(this, prop_lbdExp75);

								//BIft:each

								{

									kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft76 = subObjInstances
											.iterator();
									java.lang.Boolean idLoopCond_491 = false;
									while (!idLoopCond_491) {
										idLoopCond_491 = it_ft76.isOff();
										if (idLoopCond_491) {
										} else {

											//BIle:func
											kermeta.language.structure.Object aSubObjInstances_lbdExp76 = it_ft76
													.next();

											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.checkAllInvariants(aSubObjInstances_lbdExp76);
											//EIle:func

										}
									}
								}

								//EIft:each

							} else {

								org.kermeta.compil.runtime.helper.language.ObjectUtil
										.checkAllInvariants(org.kermeta.compil.runtime.helper.language.ObjectUtil
												.get(this, prop_lbdExp75));
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

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft78 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_492 = false;
			while (!idLoopCond_492) {
				idLoopCond_492 = it_ft78.isOff();
				if (idLoopCond_492) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp78 = it_ft78.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp77 = o_lbdExp78;

					p_lbdExp77.applyPass2BehaviorJava(context);
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
	public Boolean isSet(Property property) {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isSet(this, property);

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
	public void applyPass2BehaviorKmt(KM2EcoreContext context) {

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean equals(kermeta.language.structure.Object element) {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.equals(this, element);

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
	public Boolean isFrozen() {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isFrozen(this);

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
				.hashcode(this);

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

		java.lang.Boolean idIfCond_493 = false;
		idIfCond_493 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext
						.getInstance().getMetaClass(
								"kermeta.language.behavior.CallFeature"));

		if (idIfCond_493) {

			java.lang.Boolean idIfCond_494 = false;
			idIfCond_494 = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asType(this, org.kermeta.compil.runtime.ExecutionContext
							.getInstance().getMetaClass(
									"kermeta.language.behavior.CallFeature")))
					.isCallFeatureAsStaticOperation();

			if (idIfCond_494) {

				java.lang.Boolean idIfCond_495 = false;
				idIfCond_495 = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asType(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.CallFeature")))
						.getStaticOperation().isFunctionType();

				if (idIfCond_495) {

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
	public String getUniqueTagValue(String key) {

		java.lang.String result = null;

		result = "";

		kermeta.standard.OrderedSet<java.lang.String> value_list = this
				.getTagValues(key);

		java.lang.Boolean idIfCond_496 = false;
		idIfCond_496 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoid(value_list)),
						kermeta.standard.helper.IntegerWrapper
								.isGreaterOrEqual(value_list.size(), 1));

		if (idIfCond_496) {

			result = value_list.first();
		}

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
			java.lang.Boolean idLoopCond_497 = false;
			while (!idLoopCond_497) {
				idLoopCond_497 = kermeta.standard.helper.IntegerWrapper.equals(
						i, 1);
				if (idLoopCond_497) {
				} else {

					java.lang.Boolean idIfCond_498 = false;
					idIfCond_498 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.container(obj)));

					if (idIfCond_498) {

						java.lang.Boolean idIfCond_499 = false;
						idIfCond_499 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOf(
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.container(obj), type);

						if (idIfCond_499) {

							i = 1;

							result = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.container(obj);
						} else {

							obj = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.container(obj);
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
	public Boolean isNotEqual(kermeta.language.structure.Object element) {

		java.lang.Boolean result = null;

		result = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equals(this, element));

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
	public void freeze() {

		org.kermeta.compil.runtime.helper.language.ObjectUtil.freeze(this);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource containingResource() {

		kermeta.persistence.Resource result = null;

		result = (kermeta.persistence.Resource) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getContainingResource(this);

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

		java.lang.Boolean idIfCond_500 = false;
		idIfCond_500 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(this, type);

		if (idIfCond_500) {

			result = this;
		} else {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.TypeCastError) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.TypeCastError")));

		}

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
																				.getMetaClass(
																						this)
																				.getTypeDefinition()
																				.qualifiedName()),
														":"),
										kermeta.standard.helper.IntegerWrapper
												.toString(org.kermeta.compil.runtime.helper.language.ObjectUtil
														.oid(this))), "]");

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
		case StructurePackage.OBJECT__CONTAINER:
			if (resolve)
				return getContainer();
			return basicGetContainer();
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
		case StructurePackage.OBJECT__CONTAINER:
			setContainer((kermeta.language.structure.Object) newValue);
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
		case StructurePackage.OBJECT__CONTAINER:
			setContainer((kermeta.language.structure.Object) null);
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
		case StructurePackage.OBJECT__CONTAINER:
			return container != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectImpl
