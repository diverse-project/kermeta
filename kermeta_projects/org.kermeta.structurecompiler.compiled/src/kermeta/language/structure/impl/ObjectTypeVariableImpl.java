/**
 * <copyright>
 * </copyright>
 *
 * $Id: ObjectTypeVariableImpl.java,v 1.5 2008-10-09 08:50:25 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import ecore.ETypeParameter;

import java.util.Collection;

import kermeta.language.structure.NamedElement;
import kermeta.language.structure.ObjectTypeVariable;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.Type;
import kermeta.language.structure.TypeContainer;
import kermeta.language.structure.TypeVariable;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Type Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.ObjectTypeVariableImpl#getContainedType <em>Contained Type</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ObjectTypeVariableImpl#getTypeContainer <em>Type Container</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ObjectTypeVariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ObjectTypeVariableImpl#getSupertype <em>Supertype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectTypeVariableImpl extends TraceabilityImpl<ETypeParameter>
		implements ObjectTypeVariable {
	/**
	 * The cached value of the '{@link #getContainedType() <em>Contained Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> containedType;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupertype() <em>Supertype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupertype()
	 * @generated
	 * @ordered
	 */
	protected Type supertype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectTypeVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.OBJECT_TYPE_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getContainedType() {
		if (containedType == null) {
			containedType = new EObjectContainmentWithInverseEList.Resolving<Type>(
					Type.class, this,
					StructurePackage.OBJECT_TYPE_VARIABLE__CONTAINED_TYPE,
					StructurePackage.TYPE__TYPE_CONTAINER);
		}
		return containedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeContainer getTypeContainer() {
		if (eContainerFeatureID != StructurePackage.OBJECT_TYPE_VARIABLE__TYPE_CONTAINER)
			return null;
		return (TypeContainer) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeContainer basicGetTypeContainer() {
		if (eContainerFeatureID != StructurePackage.OBJECT_TYPE_VARIABLE__TYPE_CONTAINER)
			return null;
		return (TypeContainer) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeContainer(
			TypeContainer newTypeContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newTypeContainer,
				StructurePackage.OBJECT_TYPE_VARIABLE__TYPE_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeContainer(TypeContainer newTypeContainer) {
		if (newTypeContainer != eInternalContainer()
				|| (eContainerFeatureID != StructurePackage.OBJECT_TYPE_VARIABLE__TYPE_CONTAINER && newTypeContainer != null)) {
			if (EcoreUtil.isAncestor(this, newTypeContainer))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTypeContainer != null)
				msgs = ((InternalEObject) newTypeContainer).eInverseAdd(this,
						StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE,
						TypeContainer.class, msgs);
			msgs = basicSetTypeContainer(newTypeContainer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.OBJECT_TYPE_VARIABLE__TYPE_CONTAINER,
					newTypeContainer, newTypeContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.OBJECT_TYPE_VARIABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getSupertype() {
		if (supertype != null && supertype.eIsProxy()) {
			InternalEObject oldSupertype = (InternalEObject) supertype;
			supertype = (Type) eResolveProxy(oldSupertype);
			if (supertype != oldSupertype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StructurePackage.OBJECT_TYPE_VARIABLE__SUPERTYPE,
							oldSupertype, supertype));
			}
		}
		return supertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetSupertype() {
		return supertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupertype(Type newSupertype) {
		Type oldSupertype = supertype;
		supertype = newSupertype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.OBJECT_TYPE_VARIABLE__SUPERTYPE,
					oldSupertype, supertype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBehaviorJava(KM2EcoreContext context) {

		java.lang.String result = null;

		result = this.getName();

		java.lang.Boolean idIfCond_396 = false;
		idIfCond_396 = context.getFtSuffixActivation();

		if (idIfCond_396) {

			kermeta.language.structure.Type type_from_map = context
					.getFtMapTypeStack().peek().getValue(this);

			java.lang.Boolean idIfCond_397 = false;
			idIfCond_397 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoid(type_from_map));

			if (idIfCond_397) {

				org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
						.writeln(kermeta.standard.helper.StringWrapper
								.plus(
										"Please contact the Kermeta Development team, if you are in this case [ObjectTypeVariable::createBehaviorJava - not type_from_map.isVoid()] ",
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.toString(this)));

				context.setFtSuffixActivation(false);

				result = type_from_map.createBehaviorJava(context);

				context.setFtSuffixActivation(true);
			} else {

				java.lang.Integer i = kermeta.standard.helper.IntegerWrapper
						.uminus(1);

				kermeta.language.structure.Object obj = null;
				//BIft:detect

				kermeta.language.structure.TypeVariable result_ft135 = null;

				kermeta.language.structure.TypeVariable elem_ft135 = null;

				result_ft135 = null;

				{

					kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft135 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
									((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asType(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.container(this),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")))
											.getTypeParameter()).iterator();
					java.lang.Boolean idLoopCond_398 = false;
					while (!idLoopCond_398) {
						idLoopCond_398 = kermeta.standard.helper.BooleanWrapper
								.or(
										it_ft135.isOff(),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqual(result_ft135, null));
						if (idLoopCond_398) {
						} else {

							elem_ft135 = it_ft135.next();

							java.lang.Boolean idIfCond_399 = false;
							//BIle:detector
							kermeta.language.structure.TypeVariable otv_lbdExp135 = elem_ft135;

							java.lang.Boolean idIfCond_400 = false;
							idIfCond_400 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isInstanceOf(
											otv_lbdExp135,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.ObjectTypeVariable"));

							if (idIfCond_400) {

								i = kermeta.standard.helper.IntegerWrapper
										.plus(i, 1);

								idIfCond_399 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.equals(this, otv_lbdExp135);
							}

							//EIle:detector

							if (idIfCond_399) {

								result_ft135 = elem_ft135;
							}

						}
					}
				}

				//CE
				obj = result_ft135;
				//EIft:detect

				java.lang.Boolean idIfCond_401 = false;
				idIfCond_401 = kermeta.standard.helper.BooleanWrapper
						.and(
								kermeta.standard.helper.BooleanWrapper
										.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isVoid(obj)),
								kermeta.standard.helper.IntegerWrapper
										.isGreaterOrEqual(i, 0));

				if (idIfCond_401) {

					java.lang.Boolean idIfCond_402 = false;
					idIfCond_402 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isNotEqual(context.getFtProductTypeStack().peek()
									.getTypeByIndex(i), this);

					if (idIfCond_402) {

						result = context.getFtProductTypeStack().peek()
								.getTypeByIndex(i).createBehaviorJava(context);
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

		ecore.ETypeParameter ecoreTypeParameter = this
				.createEcoreModelElement(context);

		kermeta.language.structure.Object container = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.container(this);

		java.lang.Boolean idIfCond_403 = false;
		idIfCond_403 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(
						container,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.ClassDefinition"));

		if (idIfCond_403) {

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.ETypeParameter> convertAsOrderedSet(
							((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asType(
											container,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.ClassDefinition")))
									.getEcoreModelElement()
									.getETypeParameters()).add(
							ecoreTypeParameter);
		} else {

			java.lang.Boolean idIfCond_404 = false;
			idIfCond_404 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOf(
							container,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.Operation"));

			if (idIfCond_404) {

				org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<ecore.ETypeParameter> convertAsOrderedSet(
								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asType(
												container,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")))
										.getEcoreModelElement()
										.getETypeParameters()).add(
								ecoreTypeParameter);
			}

		}

		this.setEcoreModelElement(ecoreTypeParameter);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypeParameter createEcoreModelElement(KM2EcoreContext context) {

		ecore.ETypeParameter result = null;

		ecore.ETypeParameter ecoreTypeParameter = ((ecore.ETypeParameter) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("ecore.ETypeParameter"));

		ecoreTypeParameter
				.setName(((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("km2ecore.helper.java.IdentifierHelper"))
						.getMangledIdentifier(this.getName(), context));

		result = ecoreTypeParameter;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenModelQualifiedName() {

		java.lang.String result = null;

		result = kermeta.standard.helper.StringWrapper.plus(
				kermeta.standard.helper.StringWrapper.plus(this
						.getRootPackage().getGenModelBasePackage(), "::"), this
						.qualifiedName());

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJavaQualifiedName() {

		java.lang.String result = null;

		result = kermeta.standard.helper.StringWrapper.replace(this
				.qualifiedName(), "::", ".");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenModelJavaQualifiedName() {

		java.lang.String result = null;

		result = kermeta.standard.helper.StringWrapper.replace(this
				.getGenModelQualifiedName(), "::", ".");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String qualifiedName() {

		java.lang.String result = null;

		kermeta.language.structure.NamedElement elem = this;

		result = this.getName();

		java.lang.Boolean idIfCond_408 = false;
		idIfCond_408 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.container(elem),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.NamedElement"));

		if (idIfCond_408) {

			elem = (kermeta.language.structure.NamedElement) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.container(elem);
			java.lang.Boolean idLoopCond_409 = false;
			while (!idLoopCond_409) {
				idLoopCond_409 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equals(elem, null);
				if (idLoopCond_409) {
				} else {

					result = kermeta.standard.helper.StringWrapper.plus(
							kermeta.standard.helper.StringWrapper.plus(elem
									.getName(), "::"), result);

					java.lang.Boolean idIfCond_410 = false;
					idIfCond_410 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.container(elem),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.NamedElement"));

					if (idIfCond_410) {

						elem = (kermeta.language.structure.NamedElement) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.container(elem);
					} else {

						elem = null;
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
	public Boolean isMappedToJavaRawType() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_331 = false;
		idIfCond_331 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext
						.getInstance().getMetaClass(
								"kermeta.language.structure.ParameterizedType"));

		if (idIfCond_331) {

			java.lang.Boolean idIfCond_332 = false;
			idIfCond_332 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOf(
							((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asType(
											this,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.ParameterizedType")))
									.getTypeDefinition(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.ClassDefinition"));

			if (idIfCond_332) {

				result = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asType(
								((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asType(
												this,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ParameterizedType")))
										.getTypeDefinition(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.ClassDefinition")))
						.isMappedToJavaRawType();
			}

		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object clone(
			kermeta.language.structure.Object objectToClone) {
		kermeta.language.structure.Object result = null;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object deepClone(
			kermeta.language.structure.Object objectToClone) {
		kermeta.language.structure.Object result = null;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isBooleanTypeDef(KM2EcoreContext context) {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_333 = false;
		idIfCond_333 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this));

		if (idIfCond_333) {

			java.lang.Boolean idIfCond_334 = false;
			idIfCond_334 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOf(this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Class"));

			if (idIfCond_334) {

				result = kermeta.standard.helper.StringWrapper
						.equals(
								((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asType(
												this,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Class")))
										.getTypeDefinition().getName(),
								"Boolean");
			} else {

				java.lang.Boolean idIfCond_335 = false;
				idIfCond_335 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOf(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.PrimitiveType"));

				if (idIfCond_335) {

					java.lang.Boolean idIfCond_336 = false;
					idIfCond_336 = kermeta.standard.helper.BooleanWrapper
							.or(
									kermeta.standard.helper.BooleanWrapper
											.or(
													kermeta.standard.helper.BooleanWrapper
															.or(
																	kermeta.standard.helper.StringWrapper
																			.equals(
																					((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																							.asType(
																									this,
																									org.kermeta.compil.runtime.ExecutionContext
																											.getInstance()
																											.getMetaClass(
																													"kermeta.language.structure.PrimitiveType")))
																							.createBehaviorJava(context),
																					"kermeta::standard::Boolean"),
																	kermeta.standard.helper.StringWrapper
																			.equals(
																					((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																							.asType(
																									this,
																									org.kermeta.compil.runtime.ExecutionContext
																											.getInstance()
																											.getMetaClass(
																													"kermeta.language.structure.PrimitiveType")))
																							.createBehaviorJava(context),
																					"kermeta::language::structure::Boolean")),
													kermeta.standard.helper.StringWrapper
															.equals(
																	((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																			.asType(
																					this,
																					org.kermeta.compil.runtime.ExecutionContext
																							.getInstance()
																							.getMetaClass(
																									"kermeta.language.structure.PrimitiveType")))
																			.createBehaviorJava(context),
																	"java.lang.Boolean")),
									kermeta.standard.helper.StringWrapper
											.equals(
													((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
															.asType(
																	this,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.PrimitiveType")))
															.createBehaviorJava(context),
													"Boolean"));

					if (idIfCond_336) {

						result = true;
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
	public kermeta.language.structure.Class getClassFromPrimitiveType() {

		kermeta.language.structure.Class result = null;

		java.lang.Boolean idIfCond_337 = false;
		idIfCond_337 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext
						.getInstance().getMetaClass(
								"kermeta.language.structure.PrimitiveType"));

		if (idIfCond_337) {

			kermeta.language.structure.PrimitiveType pt = ((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asType(this, org.kermeta.compil.runtime.ExecutionContext
							.getInstance().getMetaClass(
									"kermeta.language.structure.PrimitiveType")));

			java.lang.Boolean idIfCond_338 = false;
			idIfCond_338 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOf(pt.getInstanceType(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Class"));

			if (idIfCond_338) {

				result = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asType(
								pt.getInstanceType(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.Class")));
			} else {

				result = pt.getInstanceType().getClassFromPrimitiveType();
			}

		} else {

			result = null;
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isValueType() {

		java.lang.Boolean result = null;

		result = false;

		kermeta.language.structure.Type theType = null;

		java.lang.Boolean idIfCond_339 = false;
		idIfCond_339 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext
						.getInstance().getMetaClass(
								"kermeta.language.structure.PrimitiveType"));

		if (idIfCond_339) {

			theType = ((kermeta.language.structure.Type) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asType(this.getClassFromPrimitiveType(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Type")));
		} else {

			theType = this;
		}

		java.lang.Boolean idIfCond_340 = false;
		idIfCond_340 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(
						theType,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.ParameterizedType"));

		if (idIfCond_340) {

			kermeta.language.structure.ParameterizedType pt = ((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asType(
							theType,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.ParameterizedType")));

			java.lang.Boolean idIfCond_341 = false;
			idIfCond_341 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOf(
							pt.getTypeDefinition(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.ClassDefinition"));

			if (idIfCond_341) {

				result = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asType(
								pt.getTypeDefinition(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.ClassDefinition")))
						.isValueType();
			}

		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeName() {

		java.lang.String result = null;

		result = null;

		java.lang.Boolean idIfCond_342 = false;
		idIfCond_342 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext
						.getInstance().getMetaClass(
								"kermeta.language.structure.Class"));

		if (idIfCond_342) {

			kermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asType(this, org.kermeta.compil.runtime.ExecutionContext
							.getInstance().getMetaClass(
									"kermeta.language.structure.Class")))
					.getClassDefinitionAsTyped();

			result = cd.getName();
		} else {

			java.lang.Boolean idIfCond_343 = false;
			idIfCond_343 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOf(
							this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.ObjectTypeVariable"));

			if (idIfCond_343) {

				kermeta.language.structure.ObjectTypeVariable otv = ((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asType(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.ObjectTypeVariable")));

				result = otv.getName();
			} else {

				java.lang.Boolean idIfCond_344 = false;
				idIfCond_344 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOf(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.PrimitiveType"));

				if (idIfCond_344) {

					kermeta.language.structure.ClassDefinition cd = this
							.getClassFromPrimitiveType()
							.getClassDefinitionAsTyped();

					result = cd.getName();
				} else {

					java.lang.Boolean idIfCond_345 = false;
					idIfCond_345 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(
									this,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Enumeration"));

					if (idIfCond_345) {

						result = ((kermeta.language.structure.Enumeration) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asType(
										this,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Enumeration")))
								.getName();
					} else {

						java.lang.Boolean idIfCond_346 = false;
						idIfCond_346 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOf(
										this,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.VoidType"));

						if (idIfCond_346) {

							result = "VoidType";
						}

					}

				}

			}

		}

		java.lang.Boolean idIfCond_347 = false;
		//BIft:orElse

		java.lang.Boolean result_ft119 = null;

		java.lang.Boolean idIfCond_348 = false;
		idIfCond_348 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(result);

		if (idIfCond_348) {

			result_ft119 = true;
		} else {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object v_lbdExp119 = null;

			result_ft119 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("kermeta.language.structure.Operation"))
					.isVoidType(result);
			//EIle:right

		}

		//CEC
		idIfCond_347 = result_ft119;
		//EIft:orElse

		if (idIfCond_347) {

			result = "VoidType";
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isNumericalTypeDef(KM2EcoreContext context) {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_349 = false;
		idIfCond_349 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this));

		if (idIfCond_349) {

			java.lang.String tName = null;

			java.lang.Boolean idIfCond_350 = false;
			idIfCond_350 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOf(this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Class"));

			if (idIfCond_350) {

				tName = ((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asType(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.ParameterizedType")))
						.getTypeDefinition().getName();

				java.lang.Boolean idIfCond_351 = false;
				idIfCond_351 = kermeta.standard.helper.BooleanWrapper.or(
						kermeta.standard.helper.StringWrapper.equals(tName,
								"Integer"),
						kermeta.standard.helper.StringWrapper.equals(tName,
								"Real"));

				if (idIfCond_351) {

					result = true;
				}

			} else {

				java.lang.Boolean idIfCond_352 = false;
				idIfCond_352 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOf(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.PrimitiveType"));

				if (idIfCond_352) {

					tName = ((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asType(
									this,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.PrimitiveType")))
							.createBehaviorJava(context);

					java.lang.Boolean idIfCond_353 = false;
					idIfCond_353 = kermeta.standard.helper.BooleanWrapper.or(
							kermeta.standard.helper.StringWrapper.equals(tName,
									"Integer"),
							kermeta.standard.helper.StringWrapper.equals(tName,
									"Real"));

					if (idIfCond_353) {

						result = true;
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
	public String getTypeQName() {

		java.lang.String result = null;

		result = null;

		java.lang.Boolean idIfCond_354 = false;
		idIfCond_354 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext
						.getInstance().getMetaClass(
								"kermeta.language.structure.Class"));

		if (idIfCond_354) {

			kermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asType(this, org.kermeta.compil.runtime.ExecutionContext
							.getInstance().getMetaClass(
									"kermeta.language.structure.Class")))
					.getClassDefinitionAsTyped();

			result = cd.qualifiedName();
		} else {

			java.lang.Boolean idIfCond_355 = false;
			idIfCond_355 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOf(
							this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.ObjectTypeVariable"));

			if (idIfCond_355) {

				kermeta.language.structure.ObjectTypeVariable otv = ((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asType(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.ObjectTypeVariable")));

				result = otv.qualifiedName();
			} else {

				java.lang.Boolean idIfCond_356 = false;
				idIfCond_356 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOf(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.PrimitiveType"));

				if (idIfCond_356) {

					kermeta.language.structure.ClassDefinition cd = this
							.getClassFromPrimitiveType()
							.getClassDefinitionAsTyped();

					result = cd.qualifiedName();
				} else {

					java.lang.Boolean idIfCond_357 = false;
					idIfCond_357 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(
									this,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Enumeration"));

					if (idIfCond_357) {

						result = ((kermeta.language.structure.Enumeration) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asType(
										this,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Enumeration")))
								.qualifiedName();
					} else {

						java.lang.Boolean idIfCond_358 = false;
						idIfCond_358 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOf(
										this,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.VoidType"));

						if (idIfCond_358) {

							result = "kermeta::language::structure::VoidType";
						}

					}

				}

			}

		}

		java.lang.Boolean idIfCond_359 = false;
		//BIft:orElse

		java.lang.Boolean result_ft120 = null;

		java.lang.Boolean idIfCond_360 = false;
		idIfCond_360 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(result);

		if (idIfCond_360) {

			result_ft120 = true;
		} else {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object v_lbdExp120 = null;

			result_ft120 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("kermeta.language.structure.Operation"))
					.isVoidType(result);
			//EIle:right

		}

		//CEC
		idIfCond_359 = result_ft120;
		//EIft:orElse

		if (idIfCond_359) {

			result = "kermeta::language::structure::VoidType";
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isPrimitiveType() {

		java.lang.Boolean result = null;

		result = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext
						.getInstance().getMetaClass(
								"kermeta.language.structure.PrimitiveType"));

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isSubTypeOf(Type object) {

		java.lang.Boolean result = null;

		result = org.kermeta.compil.runtime.helper.language.TypeUtil
				.isSuperTypeOf(object, this);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isSuperTypeOf(Type object) {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.TypeUtil
				.hasSubType(this, object);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isInstance(kermeta.language.structure.Object element) {

		java.lang.Boolean result = null;

		result = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(element, this);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isEDataType() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_361 = false;
		idIfCond_361 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(this.getEMFEDataTypeInstanceClassName(), "");

		if (idIfCond_361) {

			result = true;
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isEnumeration() {

		java.lang.Boolean result = null;

		result = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext
						.getInstance().getMetaClass(
								"kermeta.language.structure.Enumeration"));

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
		case StructurePackage.OBJECT_TYPE_VARIABLE__CONTAINED_TYPE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getContainedType())
					.basicAdd(otherEnd, msgs);
		case StructurePackage.OBJECT_TYPE_VARIABLE__TYPE_CONTAINER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetTypeContainer((TypeContainer) otherEnd, msgs);
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
		case StructurePackage.OBJECT_TYPE_VARIABLE__CONTAINED_TYPE:
			return ((InternalEList<?>) getContainedType()).basicRemove(
					otherEnd, msgs);
		case StructurePackage.OBJECT_TYPE_VARIABLE__TYPE_CONTAINER:
			return basicSetTypeContainer(null, msgs);
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
		case StructurePackage.OBJECT_TYPE_VARIABLE__TYPE_CONTAINER:
			return eInternalContainer().eInverseRemove(this,
					StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE,
					TypeContainer.class, msgs);
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
		case StructurePackage.OBJECT_TYPE_VARIABLE__CONTAINED_TYPE:
			return getContainedType();
		case StructurePackage.OBJECT_TYPE_VARIABLE__TYPE_CONTAINER:
			if (resolve)
				return getTypeContainer();
			return basicGetTypeContainer();
		case StructurePackage.OBJECT_TYPE_VARIABLE__NAME:
			return getName();
		case StructurePackage.OBJECT_TYPE_VARIABLE__SUPERTYPE:
			if (resolve)
				return getSupertype();
			return basicGetSupertype();
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
		case StructurePackage.OBJECT_TYPE_VARIABLE__CONTAINED_TYPE:
			getContainedType().clear();
			getContainedType().addAll((Collection<? extends Type>) newValue);
			return;
		case StructurePackage.OBJECT_TYPE_VARIABLE__TYPE_CONTAINER:
			setTypeContainer((TypeContainer) newValue);
			return;
		case StructurePackage.OBJECT_TYPE_VARIABLE__NAME:
			setName((String) newValue);
			return;
		case StructurePackage.OBJECT_TYPE_VARIABLE__SUPERTYPE:
			setSupertype((Type) newValue);
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
		case StructurePackage.OBJECT_TYPE_VARIABLE__CONTAINED_TYPE:
			getContainedType().clear();
			return;
		case StructurePackage.OBJECT_TYPE_VARIABLE__TYPE_CONTAINER:
			setTypeContainer((TypeContainer) null);
			return;
		case StructurePackage.OBJECT_TYPE_VARIABLE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StructurePackage.OBJECT_TYPE_VARIABLE__SUPERTYPE:
			setSupertype((Type) null);
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
		case StructurePackage.OBJECT_TYPE_VARIABLE__CONTAINED_TYPE:
			return containedType != null && !containedType.isEmpty();
		case StructurePackage.OBJECT_TYPE_VARIABLE__TYPE_CONTAINER:
			return basicGetTypeContainer() != null;
		case StructurePackage.OBJECT_TYPE_VARIABLE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case StructurePackage.OBJECT_TYPE_VARIABLE__SUPERTYPE:
			return supertype != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TypeContainer.class) {
			switch (derivedFeatureID) {
			case StructurePackage.OBJECT_TYPE_VARIABLE__CONTAINED_TYPE:
				return StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE;
			default:
				return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
			case StructurePackage.OBJECT_TYPE_VARIABLE__TYPE_CONTAINER:
				return StructurePackage.TYPE__TYPE_CONTAINER;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
			case StructurePackage.OBJECT_TYPE_VARIABLE__NAME:
				return StructurePackage.NAMED_ELEMENT__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == TypeVariable.class) {
			switch (derivedFeatureID) {
			case StructurePackage.OBJECT_TYPE_VARIABLE__SUPERTYPE:
				return StructurePackage.TYPE_VARIABLE__SUPERTYPE;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TypeContainer.class) {
			switch (baseFeatureID) {
			case StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE:
				return StructurePackage.OBJECT_TYPE_VARIABLE__CONTAINED_TYPE;
			default:
				return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
			case StructurePackage.TYPE__TYPE_CONTAINER:
				return StructurePackage.OBJECT_TYPE_VARIABLE__TYPE_CONTAINER;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
			case StructurePackage.NAMED_ELEMENT__NAME:
				return StructurePackage.OBJECT_TYPE_VARIABLE__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == TypeVariable.class) {
			switch (baseFeatureID) {
			case StructurePackage.TYPE_VARIABLE__SUPERTYPE:
				return StructurePackage.OBJECT_TYPE_VARIABLE__SUPERTYPE;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ObjectTypeVariableImpl
