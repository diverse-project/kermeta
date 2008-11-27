/**
 * <copyright>
 * </copyright>
 *
 * $Id: ObjectTypeVariableImpl.java,v 1.10 2008-11-27 15:49:50 cfaucher Exp $
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
		return StructurePackage.eINSTANCE.getObjectTypeVariable();
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

		java.lang.Boolean idIfCond_185 = false;
		idIfCond_185 = context.getFtSuffixActivation();

		if (idIfCond_185) {

			kermeta.language.structure.Type type_from_map = context
					.getFtMapTypeStack().peek().getValue(this);

			java.lang.Boolean idIfCond_186 = false;
			idIfCond_186 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(type_from_map));

			if (idIfCond_186) {

				org.kermeta.compil.runtime.helper.io.StdIOUtil
						.getInstance()
						.writeln(
								kermeta.standard.helper.StringWrapper
										.plus(
												"Please contact the Kermeta Development team, if you are in this case [ObjectTypeVariable::createBehaviorJava - not type_from_map.isVoid()] ",
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.toStringSwitcher(this)));

				context.setFtSuffixActivation(false);

				result = type_from_map.createBehaviorJava(context);

				context.setFtSuffixActivation(true);
			} else {

				java.lang.Integer i = kermeta.standard.helper.IntegerWrapper
						.uminus(1);

				kermeta.language.structure.Object obj = null;
				//BIft:detect

				kermeta.language.structure.TypeVariable result_ft43 = null;

				kermeta.language.structure.TypeVariable elem_ft43 = null;

				result_ft43 = null;

				{

					kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft43 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
									((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.containerSwitcher(this),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")))
											.getTypeParameter()).iterator();
					java.lang.Boolean idLoopCond_187 = false;
					while (!idLoopCond_187) {
						idLoopCond_187 = kermeta.standard.helper.BooleanWrapper
								.or(
										it_ft43.isOff(),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqualSwitcher(
														result_ft43, null));
						if (idLoopCond_187) {
						} else {

							elem_ft43 = it_ft43.next();

							java.lang.Boolean idIfCond_188 = false;
							//BIle:detector
							kermeta.language.structure.TypeVariable otv_lbdExp43 = elem_ft43;

							java.lang.Boolean idIfCond_189 = false;
							idIfCond_189 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isInstanceOfSwitcher(
											otv_lbdExp43,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.ObjectTypeVariable"));

							if (idIfCond_189) {

								i = kermeta.standard.helper.IntegerWrapper
										.plus(i, 1);

								idIfCond_188 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.equalsSwitcher(this, otv_lbdExp43);
							}

							//EIle:detector

							if (idIfCond_188) {

								result_ft43 = elem_ft43;
							}

						}
					}
				}

				//CE
				obj = result_ft43;
				//EIft:detect

				java.lang.Boolean idIfCond_190 = false;
				idIfCond_190 = kermeta.standard.helper.BooleanWrapper
						.and(
								kermeta.standard.helper.BooleanWrapper
										.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isVoidSwitcher(obj)),
								kermeta.standard.helper.IntegerWrapper
										.isGreaterOrEqual(i, 0));

				if (idIfCond_190) {

					java.lang.Boolean idIfCond_191 = false;
					idIfCond_191 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isNotEqualSwitcher(context.getFtProductTypeStack()
									.peek().getTypeByIndex(i), this);

					if (idIfCond_191) {

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
				.containerSwitcher(this);

		java.lang.Boolean idIfCond_192 = false;
		idIfCond_192 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						container,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.ClassDefinition"));

		if (idIfCond_192) {

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.ETypeParameter> convertAsOrderedSet(
							((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											container,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.ClassDefinition")))
									.getEcoreModelElement()
									.getETypeParameters()).add(
							ecoreTypeParameter);
		} else {

			java.lang.Boolean idIfCond_193 = false;
			idIfCond_193 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(
							container,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.Operation"));

			if (idIfCond_193) {

				org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<ecore.ETypeParameter> convertAsOrderedSet(
								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
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

		java.lang.Boolean idIfCond_369 = false;
		idIfCond_369 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(elem),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.NamedElement"));

		if (idIfCond_369) {

			elem = (kermeta.language.structure.NamedElement) org.kermeta.compil.runtime.ExecutionContext
					.getInstance()
					.<kermeta.language.structure.NamedElement> asTypeOrVoid(
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.containerSwitcher(elem));
			java.lang.Boolean idLoopCond_370 = false;
			while (!idLoopCond_370) {
				idLoopCond_370 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equalsSwitcher(elem, null);
				if (idLoopCond_370) {
				} else {

					result = kermeta.standard.helper.StringWrapper.plus(
							kermeta.standard.helper.StringWrapper.plus(elem
									.getName(), "::"), result);

					java.lang.Boolean idIfCond_371 = false;
					idIfCond_371 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.containerSwitcher(elem),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.NamedElement"));

					if (idIfCond_371) {

						elem = (kermeta.language.structure.NamedElement) org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.<kermeta.language.structure.NamedElement> asTypeOrVoid(
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.containerSwitcher(elem));
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

		java.lang.Boolean idIfCond_134 = false;
		idIfCond_134 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.ParameterizedType"));

		if (idIfCond_134) {

			java.lang.Boolean idIfCond_135 = false;
			idIfCond_135 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(
							((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
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

			if (idIfCond_135) {

				result = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
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

		java.lang.Boolean idIfCond_136 = false;
		idIfCond_136 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this));

		if (idIfCond_136) {

			java.lang.Boolean idIfCond_137 = false;
			idIfCond_137 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Class"));

			if (idIfCond_137) {

				result = kermeta.standard.helper.StringWrapper
						.equals(
								((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												this,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Class")))
										.getTypeDefinition().getName(),
								"Boolean");
			} else {

				java.lang.Boolean idIfCond_138 = false;
				idIfCond_138 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.PrimitiveType"));

				if (idIfCond_138) {

					java.lang.Boolean idIfCond_139 = false;
					idIfCond_139 = kermeta.standard.helper.BooleanWrapper
							.or(
									kermeta.standard.helper.BooleanWrapper
											.or(
													kermeta.standard.helper.BooleanWrapper
															.or(
																	kermeta.standard.helper.StringWrapper
																			.equals(
																					((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																							.asTypeSwitcher(
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
																							.asTypeSwitcher(
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
																			.asTypeSwitcher(
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
															.asTypeSwitcher(
																	this,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.PrimitiveType")))
															.createBehaviorJava(context),
													"Boolean"));

					if (idIfCond_139) {

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

		java.lang.Boolean idIfCond_140 = false;
		idIfCond_140 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.PrimitiveType"));

		if (idIfCond_140) {

			kermeta.language.structure.PrimitiveType pt = ((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.PrimitiveType")));

			java.lang.Boolean idIfCond_141 = false;
			idIfCond_141 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(pt.getInstanceType(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Class"));

			if (idIfCond_141) {

				result = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
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

		java.lang.Boolean idIfCond_142 = false;
		idIfCond_142 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.PrimitiveType"));

		if (idIfCond_142) {

			theType = ((kermeta.language.structure.Type) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(this.getClassFromPrimitiveType(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Type")));
		} else {

			theType = this;
		}

		java.lang.Boolean idIfCond_143 = false;
		idIfCond_143 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						theType,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.ParameterizedType"));

		if (idIfCond_143) {

			kermeta.language.structure.ParameterizedType pt = ((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							theType,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.ParameterizedType")));

			java.lang.Boolean idIfCond_144 = false;
			idIfCond_144 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(
							pt.getTypeDefinition(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.ClassDefinition"));

			if (idIfCond_144) {

				result = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
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

		java.lang.Boolean idIfCond_145 = false;
		idIfCond_145 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.structure.Class"));

		if (idIfCond_145) {

			kermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Class")))
					.getClassDefinitionAsTyped();

			result = cd.getName();
		} else {

			java.lang.Boolean idIfCond_146 = false;
			idIfCond_146 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(
							this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.ObjectTypeVariable"));

			if (idIfCond_146) {

				kermeta.language.structure.ObjectTypeVariable otv = ((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.ObjectTypeVariable")));

				result = otv.getName();
			} else {

				java.lang.Boolean idIfCond_147 = false;
				idIfCond_147 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.PrimitiveType"));

				if (idIfCond_147) {

					kermeta.language.structure.ClassDefinition cd = this
							.getClassFromPrimitiveType()
							.getClassDefinitionAsTyped();

					result = cd.getName();
				} else {

					java.lang.Boolean idIfCond_148 = false;
					idIfCond_148 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									this,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Enumeration"));

					if (idIfCond_148) {

						result = ((kermeta.language.structure.Enumeration) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeSwitcher(
										this,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Enumeration")))
								.getName();
					} else {

						java.lang.Boolean idIfCond_149 = false;
						idIfCond_149 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										this,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.VoidType"));

						if (idIfCond_149) {

							result = "VoidType";
						}

					}

				}

			}

		}

		java.lang.Boolean idIfCond_150 = false;
		//BIft:orElse

		java.lang.Boolean result_ft37 = null;

		java.lang.Boolean idIfCond_151 = false;
		idIfCond_151 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(result);

		if (idIfCond_151) {

			result_ft37 = true;
		} else {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object v_lbdExp37 = null;

			result_ft37 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("kermeta.language.structure.Operation"))
					.isVoidType(result);
			//EIle:right

		}

		//CEC
		idIfCond_150 = result_ft37;
		//EIft:orElse

		if (idIfCond_150) {

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

		java.lang.Boolean idIfCond_152 = false;
		idIfCond_152 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this));

		if (idIfCond_152) {

			java.lang.String tName = null;

			java.lang.Boolean idIfCond_153 = false;
			idIfCond_153 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Class"));

			if (idIfCond_153) {

				tName = ((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.ParameterizedType")))
						.getTypeDefinition().getName();

				java.lang.Boolean idIfCond_154 = false;
				idIfCond_154 = kermeta.standard.helper.BooleanWrapper.or(
						kermeta.standard.helper.StringWrapper.equals(tName,
								"Integer"),
						kermeta.standard.helper.StringWrapper.equals(tName,
								"Real"));

				if (idIfCond_154) {

					result = true;
				}

			} else {

				java.lang.Boolean idIfCond_155 = false;
				idIfCond_155 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.PrimitiveType"));

				if (idIfCond_155) {

					tName = ((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeSwitcher(
									this,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.PrimitiveType")))
							.createBehaviorJava(context);

					java.lang.Boolean idIfCond_156 = false;
					idIfCond_156 = kermeta.standard.helper.BooleanWrapper.or(
							kermeta.standard.helper.StringWrapper.equals(tName,
									"Integer"),
							kermeta.standard.helper.StringWrapper.equals(tName,
									"Real"));

					if (idIfCond_156) {

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

		java.lang.Boolean idIfCond_157 = false;
		idIfCond_157 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.structure.Class"));

		if (idIfCond_157) {

			kermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Class")))
					.getClassDefinitionAsTyped();

			result = cd.qualifiedName();
		} else {

			java.lang.Boolean idIfCond_158 = false;
			idIfCond_158 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(
							this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.ObjectTypeVariable"));

			if (idIfCond_158) {

				kermeta.language.structure.ObjectTypeVariable otv = ((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.ObjectTypeVariable")));

				result = otv.qualifiedName();
			} else {

				java.lang.Boolean idIfCond_159 = false;
				idIfCond_159 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.PrimitiveType"));

				if (idIfCond_159) {

					kermeta.language.structure.ClassDefinition cd = this
							.getClassFromPrimitiveType()
							.getClassDefinitionAsTyped();

					result = cd.qualifiedName();
				} else {

					java.lang.Boolean idIfCond_160 = false;
					idIfCond_160 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									this,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Enumeration"));

					if (idIfCond_160) {

						result = ((kermeta.language.structure.Enumeration) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeSwitcher(
										this,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Enumeration")))
								.qualifiedName();
					} else {

						java.lang.Boolean idIfCond_161 = false;
						idIfCond_161 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										this,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.VoidType"));

						if (idIfCond_161) {

							result = "kermeta::language::structure::VoidType";
						}

					}

				}

			}

		}

		java.lang.Boolean idIfCond_162 = false;
		//BIft:orElse

		java.lang.Boolean result_ft38 = null;

		java.lang.Boolean idIfCond_163 = false;
		idIfCond_163 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(result);

		if (idIfCond_163) {

			result_ft38 = true;
		} else {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object v_lbdExp38 = null;

			result_ft38 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("kermeta.language.structure.Operation"))
					.isVoidType(result);
			//EIle:right

		}

		//CEC
		idIfCond_162 = result_ft38;
		//EIft:orElse

		if (idIfCond_162) {

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
				.isInstanceOfSwitcher(
						this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
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
				.isSuperTypeOfSwitcher(object, this);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isSuperTypeOf(Type object) {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<java.lang.Boolean> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.TypeUtil
								.hasSubType(this, object));

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
				.isInstanceOfSwitcher(element, this);

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

		java.lang.Boolean idIfCond_164 = false;
		idIfCond_164 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(this.getEMFEDataTypeInstanceClassName(), "");

		if (idIfCond_164) {

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
				.isInstanceOfSwitcher(
						this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
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
