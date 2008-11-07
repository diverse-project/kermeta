/**
 * <copyright>
 * </copyright>
 *
 * $Id: ObjectImpl.java,v 1.8 2008-11-07 08:52:53 cfaucher Exp $
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
 *   <li>{@link kermeta.language.structure.impl.ObjectImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ObjectImpl#getFile <em>File</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ObjectImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ObjectImpl#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ObjectImpl#getOwnedTags <em>Owned Tags</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ObjectImpl#getOid <em>Oid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectImpl extends EObjectImpl implements
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
	public Boolean interpretBooleanTag(String str_tag) {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_299 = false;
		idIfCond_299 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(this.getUniqueTagValue(str_tag), "");

		if (idIfCond_299) {

			java.lang.Boolean idIfCond_300 = false;
			idIfCond_300 = kermeta.standard.helper.StringWrapper.equals(this
					.getUniqueTagValue(str_tag), "true");

			if (idIfCond_300) {

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
	public kermeta.language.structure.Object getContainerAsTypeIn(Type type,
			Type stop_type) {

		kermeta.language.structure.Object result = null;

		result = null;

		kermeta.language.structure.Object obj = this;

		{

			java.lang.Integer i = 0;
			java.lang.Boolean idLoopCond_301 = false;
			while (!idLoopCond_301) {
				idLoopCond_301 = kermeta.standard.helper.BooleanWrapper.or(
						kermeta.standard.helper.IntegerWrapper.equals(i, 1),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(obj, stop_type));
				if (idLoopCond_301) {
				} else {

					java.lang.Boolean idIfCond_302 = false;
					idIfCond_302 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.containerSwitcher(obj)));

					if (idIfCond_302) {

						java.lang.Boolean idIfCond_303 = false;
						idIfCond_303 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.containerSwitcher(obj), type);

						if (idIfCond_303) {

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
	public Boolean isKindOf(kermeta.language.structure.Class cl) {

		java.lang.Boolean result = null;

		result = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.getMetaClassSwitcher(this).equals(cl);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Class getMetaClass() {

		kermeta.language.structure.Class result = null;

		result = (kermeta.language.structure.Class) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<kermeta.language.structure.Class> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClass(this));

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set(Property property, kermeta.language.structure.Object element) {

		java.lang.Boolean idIfCond_304 = false;
		idIfCond_304 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(element, property.getType());

		if (idIfCond_304) {

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

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft106 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_305 = false;
			while (!idLoopCond_305) {
				idLoopCond_305 = it_ft106.isOff();
				if (idLoopCond_305) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp106 = it_ft106
							.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp105 = o_lbdExp106;

					java.lang.Boolean idIfCond_306 = false;
					idIfCond_306 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp105.getDeprecated(), "");

					if (idIfCond_306) {

						p_lbdExp105.applyPass2(context);
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
				.asTypeSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClassSwitcher(this).getTypeDefinition(),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.ClassDefinition")));

		//BIft:detect

		kermeta.language.structure.Property result_ft107 = null;

		kermeta.language.structure.Property elem_ft107 = null;

		result_ft107 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft107 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Property> convertAsSet(
							classDefinition.getterAllAttribute()).iterator();
			java.lang.Boolean idLoopCond_307 = false;
			while (!idLoopCond_307) {
				idLoopCond_307 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft107.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft107, null));
				if (idLoopCond_307) {
				} else {

					elem_ft107 = it_ft107.next();

					java.lang.Boolean idIfCond_308 = false;
					//BIle:detector
					kermeta.language.structure.Property p_lbdExp107 = elem_ft107;

					idIfCond_308 = kermeta.standard.helper.StringWrapper
							.equals(
									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													p_lbdExp107,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.Property")))
											.getName(), propertyName);
					//EIle:detector

					if (idIfCond_308) {

						result_ft107 = elem_ft107;
					}

				}
			}
		}

		//EIft:detect
		result = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeSwitcher(result_ft107,
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

		java.lang.Boolean idIfCond_309 = false;
		idIfCond_309 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(cd));

		if (idIfCond_309) {

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft108 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_310 = false;
				while (!idLoopCond_310) {
					idLoopCond_310 = it_ft108.isOff();
					if (idLoopCond_310) {
					} else {

						//BIle:func
						kermeta.language.structure.Property p_lbdExp108 = it_ft108
								.next();

						//BIft:exists

						java.lang.Boolean result_ft109 = null;

						java.lang.Boolean test_ft109 = false;

						{

							kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft109 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Tag> convertAsOrderedSet(
											p_lbdExp108.getTag()).iterator();
							java.lang.Boolean idLoopCond_312 = false;
							while (!idLoopCond_312) {
								idLoopCond_312 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft109.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																test_ft109,
																false));
								if (idLoopCond_312) {
								} else {

									java.lang.Boolean result_lambda_ft109 = null;
									//BIle:func
									kermeta.language.structure.Tag t_lbdExp109 = it_ft109
											.next();

									result_lambda_ft109 = kermeta.standard.helper.StringWrapper
											.equals(t_lbdExp109.getName(),
													"ecore.isTransient");
									//EIle:func

									test_ft109 = kermeta.standard.helper.BooleanWrapper
											.or(test_ft109, result_lambda_ft109);
								}
							}
						}

						result_ft109 = test_ft109;
						//EIft:exists
						java.lang.Boolean idIfCond_311 = false;
						idIfCond_311 = kermeta.standard.helper.BooleanWrapper
								.and(
										kermeta.standard.helper.BooleanWrapper
												.not(result_ft109),
										kermeta.standard.helper.BooleanWrapper
												.not(p_lbdExp108.getIsDerived()));

						if (idIfCond_311) {

							kermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.getSwitcher(this, p_lbdExp108);

							java.lang.Boolean idIfCond_313 = false;
							//BIft:andThen

							java.lang.Boolean result_ft110 = null;

							java.lang.Boolean idIfCond_314 = false;
							idIfCond_314 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(v));

							if (idIfCond_314) {

								//BIle:right
								/*This variable should be never used*/kermeta.language.structure.Object f_lbdExp110 = null;

								result_ft110 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>"));
								//EIle:right

							} else {

								result_ft110 = false;
							}

							//CEC
							idIfCond_313 = result_ft110;
							//EIft:andThen

							if (idIfCond_313) {

								kermeta.standard.Collection<kermeta.language.structure.Object> c = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												v,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.standard.Collection<kermeta.language.structure.Object>")));

								java.lang.Boolean idIfCond_315 = false;
								idIfCond_315 = kermeta.standard.helper.BooleanWrapper
										.and(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																p_lbdExp108
																		.getUpper(),
																kermeta.standard.helper.IntegerWrapper
																		.uminus(1)),
												kermeta.standard.helper.IntegerWrapper
														.isGreater(
																c.size(),
																p_lbdExp108
																		.getUpper()));

								if (idIfCond_315) {

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
																							p_lbdExp108
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toStringSwitcher(this)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

								java.lang.Boolean idIfCond_316 = false;
								idIfCond_316 = kermeta.standard.helper.IntegerWrapper
										.isLower(c.size(), p_lbdExp108
												.getLower());

								if (idIfCond_316) {

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
																							p_lbdExp108
																									.getName()),
																			" violated on "),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.toStringSwitcher(this)));

									if (true)
										throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
												e);

								}

							} else {

								java.lang.Boolean idIfCond_317 = false;
								idIfCond_317 = kermeta.standard.helper.BooleanWrapper
										.and(
												kermeta.standard.helper.IntegerWrapper
														.equals(p_lbdExp108
																.getLower(), 1),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isVoidSwitcher(v));

								if (idIfCond_317) {

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
																							p_lbdExp108
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

		result = (java.lang.Integer) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<java.lang.Integer> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getOID(this));

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

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft111 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_318 = false;
			while (!idLoopCond_318) {
				idLoopCond_318 = it_ft111.isOff();
				if (idLoopCond_318) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag t_lbdExp111 = it_ft111
							.next();

					java.lang.Boolean idIfCond_319 = false;
					idIfCond_319 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(t_lbdExp111.getName()));

					if (idIfCond_319) {

						java.lang.Boolean idIfCond_320 = false;
						idIfCond_320 = kermeta.standard.helper.StringWrapper
								.equals(t_lbdExp111.getName(), key);

						if (idIfCond_320) {

							value_list.add(t_lbdExp111.getValue());
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

		result = (java.lang.Boolean) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<java.lang.Boolean> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOf(this, type.getClass().getName()));

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
	public void checkAllInvariants() {

		java.lang.Boolean idIfCond_321 = false;
		idIfCond_321 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(this, null);

		if (idIfCond_321) {

			org.kermeta.compil.runtime.helper.language.ObjectUtil
					.checkInvariantsSwitcher(this);

			kermeta.language.structure.ClassDefinition cd = null;

			cd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.ExecutionContext
					.getInstance()
					.<kermeta.language.structure.ClassDefinition> asTypeOrVoid(
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.getMetaClassSwitcher(this)
									.getTypeDefinition());

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft112 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsSet(
								cd.getterAllAttribute()).iterator();
				java.lang.Boolean idLoopCond_322 = false;
				while (!idLoopCond_322) {
					idLoopCond_322 = it_ft112.isOff();
					if (idLoopCond_322) {
					} else {

						//BIle:func
						kermeta.language.structure.Property prop_lbdExp112 = it_ft112
								.next();

						java.lang.Boolean idIfCond_323 = false;
						idIfCond_323 = kermeta.standard.helper.BooleanWrapper
								.and(prop_lbdExp112.getIsComposite(),
										kermeta.standard.helper.BooleanWrapper
												.not(prop_lbdExp112
														.getIsDerived()));

						if (idIfCond_323) {

							java.lang.Boolean idIfCond_324 = false;
							idIfCond_324 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.getSwitcher(this,
															prop_lbdExp112)));

							if (idIfCond_324) {

								java.lang.Boolean idIfCond_325 = false;
								//BIft:exists

								java.lang.Boolean result_ft113 = null;

								java.lang.Boolean test_ft113 = false;

								{

									kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft113 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.getMetaClassSwitcher(
																	org.kermeta.compil.runtime.helper.language.ObjectUtil
																			.getSwitcher(
																					this,
																					prop_lbdExp112))
															.getTypeDefinition(),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")))
											.allSuperTypes().iterator();
									java.lang.Boolean idLoopCond_326 = false;
									while (!idLoopCond_326) {
										idLoopCond_326 = kermeta.standard.helper.BooleanWrapper
												.or(
														it_ft113.isOff(),
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isNotEqualSwitcher(
																		test_ft113,
																		false));
										if (idLoopCond_326) {
										} else {

											java.lang.Boolean result_lambda_ft113 = null;
											//BIle:func
											kermeta.language.structure.Type t_lbdExp113 = it_ft113
													.next();

											java.lang.Boolean idIfCond_327 = false;
											idIfCond_327 = org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isInstanceOfSwitcher(
															t_lbdExp113,
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.ParameterizedType"));

											if (idIfCond_327) {

												result_lambda_ft113 = kermeta.standard.helper.StringWrapper
														.equals(
																((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				t_lbdExp113,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.ParameterizedType")))
																		.getTypeDefinition()
																		.qualifiedName(),
																"kermeta::standard::Collection");
											} else {

												result_lambda_ft113 = false;
											}

											//EIle:func

											test_ft113 = kermeta.standard.helper.BooleanWrapper
													.or(test_ft113,
															result_lambda_ft113);
										}
									}
								}

								result_ft113 = test_ft113;

								//CEC
								idIfCond_325 = result_ft113;
								//EIft:exists

								if (idIfCond_325) {

									kermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;

									subObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.<kermeta.standard.Collection<kermeta.language.structure.Object>> asTypeOrVoid(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.getSwitcher(this,
																	prop_lbdExp112));

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft114 = subObjInstances
												.iterator();
										java.lang.Boolean idLoopCond_328 = false;
										while (!idLoopCond_328) {
											idLoopCond_328 = it_ft114.isOff();
											if (idLoopCond_328) {
											} else {

												//BIle:func
												kermeta.language.structure.Object aSubObjInstances_lbdExp114 = it_ft114
														.next();

												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.checkAllInvariantsSwitcher(aSubObjInstances_lbdExp114);
												//EIle:func

											}
										}
									}

									//EIft:each

								} else {

									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.checkAllInvariantsSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
													.getSwitcher(this,
															prop_lbdExp112));
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

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft116 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_329 = false;
			while (!idLoopCond_329) {
				idLoopCond_329 = it_ft116.isOff();
				if (idLoopCond_329) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp116 = it_ft116
							.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp115 = o_lbdExp116;

					p_lbdExp115.applyPass2BehaviorJava(context);
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

		result = (java.lang.Boolean) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<java.lang.Boolean> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isSet(this, property));

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
	public void applyPass2BehaviorKmt(KM2EcoreContext context) {

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean equals(kermeta.language.structure.Object element) {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<java.lang.Boolean> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equals(this, element));

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

		result = (java.lang.Boolean) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<java.lang.Boolean> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isFrozen(this));

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer hashcode() {

		java.lang.Integer result = null;

		result = (java.lang.Integer) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<java.lang.Integer> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.hashcode(this));

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

		java.lang.Boolean idIfCond_330 = false;
		idIfCond_330 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.behavior.CallFeature"));

		if (idIfCond_330) {

			java.lang.Boolean idIfCond_331 = false;
			idIfCond_331 = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.behavior.CallFeature")))
					.isCallFeatureAsStaticOperation();

			if (idIfCond_331) {

				java.lang.Boolean idIfCond_332 = false;
				idIfCond_332 = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.CallFeature")))
						.getStaticOperation().isFunctionType();

				if (idIfCond_332) {

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
		java.lang.Boolean idLoopCond_333 = false;
		while (!idLoopCond_333) {
			idLoopCond_333 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isVoidSwitcher(topPack);
			if (idLoopCond_333) {
			} else {

				result = topPack;

				topPack = (kermeta.language.structure.Package) org.kermeta.compil.runtime.ExecutionContext
						.getInstance()
						.<kermeta.language.structure.Package> asTypeOrVoid(
								topPack
										.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Package")));
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

		java.lang.Boolean idIfCond_334 = false;
		idIfCond_334 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(value_list)),
						kermeta.standard.helper.IntegerWrapper
								.isGreaterOrEqual(value_list.size(), 1));

		if (idIfCond_334) {

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
			java.lang.Boolean idLoopCond_335 = false;
			while (!idLoopCond_335) {
				idLoopCond_335 = kermeta.standard.helper.IntegerWrapper.equals(
						i, 1);
				if (idLoopCond_335) {
				} else {

					java.lang.Boolean idIfCond_336 = false;
					idIfCond_336 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.containerSwitcher(obj)));

					if (idIfCond_336) {

						java.lang.Boolean idIfCond_337 = false;
						idIfCond_337 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.containerSwitcher(obj), type);

						if (idIfCond_337) {

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
	public Resource containingResource() {

		kermeta.persistence.Resource result = null;

		result = (kermeta.persistence.Resource) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<kermeta.persistence.Resource> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getContainingResource(this));

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

		java.lang.Boolean idIfCond_338 = false;
		idIfCond_338 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(this, type);

		if (idIfCond_338) {

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
		}
		return super.eIsSet(featureID);
	}

} //ObjectImpl
