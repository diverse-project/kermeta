/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClassDefinitionImpl.java,v 1.9 2008-11-07 08:52:56 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import ecore.EClass;
import ecore.EDataType;

import java.util.Collection;

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.Constraint;
import kermeta.language.structure.GenericTypeDefinition;
import kermeta.language.structure.NamedElement;
import kermeta.language.structure.Operation;
import kermeta.language.structure.Property;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.Type;
import kermeta.language.structure.TypeContainer;
import kermeta.language.structure.TypeDefinition;
import kermeta.language.structure.TypeVariable;

import kermeta.standard.Set;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getIsAspect <em>Is Aspect</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getTypeParameter <em>Type Parameter</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getContainedType <em>Contained Type</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getInv <em>Inv</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getSubClassDefinitions <em>Sub Class Definitions</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getEcoreDataType <em>Ecore Data Type</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassDefinitionImpl extends TraceabilityImpl<EClass> implements
		ClassDefinition {
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
	 * The default value of the '{@link #getIsAspect() <em>Is Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAspect()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ASPECT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsAspect() <em>Is Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAspect()
	 * @generated
	 * @ordered
	 */
	protected Boolean isAspect = IS_ASPECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypeParameter() <em>Type Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeVariable> typeParameter;

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
	 * The cached value of the '{@link #getOwnedOperation() <em>Owned Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> ownedOperation;

	/**
	 * The default value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ABSTRACT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected Boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> superType;

	/**
	 * The cached value of the '{@link #getInv() <em>Inv</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInv()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> inv;

	/**
	 * The cached value of the '{@link #getSubClassDefinitions() <em>Sub Class Definitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubClassDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassDefinition> subClassDefinitions;

	/**
	 * The cached value of the '{@link #getEcoreDataType() <em>Ecore Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreDataType()
	 * @generated
	 * @ordered
	 */
	protected EDataType ecoreDataType;

	/**
	 * The cached value of the '{@link #getOwnedAttribute() <em>Owned Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected org.eclipse.emf.ecore.EClass eStaticClass() {
		return StructurePackage.eINSTANCE.getClassDefinition();
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
					StructurePackage.CLASS_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAspect() {
		return isAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAspect(Boolean newIsAspect) {
		Boolean oldIsAspect = isAspect;
		isAspect = newIsAspect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.CLASS_DEFINITION__IS_ASPECT, oldIsAspect,
					isAspect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeVariable> getTypeParameter() {
		if (typeParameter == null) {
			typeParameter = new EObjectContainmentEList.Resolving<TypeVariable>(
					TypeVariable.class, this,
					StructurePackage.CLASS_DEFINITION__TYPE_PARAMETER);
		}
		return typeParameter;
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
					StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE,
					StructurePackage.TYPE__TYPE_CONTAINER);
		}
		return containedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOwnedOperation() {
		if (ownedOperation == null) {
			ownedOperation = new EObjectContainmentWithInverseEList.Resolving<Operation>(
					Operation.class, this,
					StructurePackage.CLASS_DEFINITION__OWNED_OPERATION,
					StructurePackage.OPERATION__OWNING_CLASS);
		}
		return ownedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(Boolean newIsAbstract) {
		Boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.CLASS_DEFINITION__IS_ABSTRACT,
					oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getSuperType() {
		if (superType == null) {
			superType = new EObjectResolvingEList<Type>(Type.class, this,
					StructurePackage.CLASS_DEFINITION__SUPER_TYPE);
		}
		return superType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getInv() {
		if (inv == null) {
			inv = new EObjectContainmentWithInverseEList.Resolving<Constraint>(
					Constraint.class, this,
					StructurePackage.CLASS_DEFINITION__INV,
					StructurePackage.CONSTRAINT__INV_OWNER);
		}
		return inv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassDefinition> getSubClassDefinitions() {
		if (subClassDefinitions == null) {
			subClassDefinitions = new EObjectResolvingEList<ClassDefinition>(
					ClassDefinition.class, this,
					StructurePackage.CLASS_DEFINITION__SUB_CLASS_DEFINITIONS);
		}
		return subClassDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEcoreDataType() {
		if (ecoreDataType != null && ecoreDataType.eIsProxy()) {
			InternalEObject oldEcoreDataType = (InternalEObject) ecoreDataType;
			ecoreDataType = (EDataType) eResolveProxy(oldEcoreDataType);
			if (ecoreDataType != oldEcoreDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StructurePackage.CLASS_DEFINITION__ECORE_DATA_TYPE,
							oldEcoreDataType, ecoreDataType));
			}
		}
		return ecoreDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType basicGetEcoreDataType() {
		return ecoreDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcoreDataType(EDataType newEcoreDataType) {
		EDataType oldEcoreDataType = ecoreDataType;
		ecoreDataType = newEcoreDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.CLASS_DEFINITION__ECORE_DATA_TYPE,
					oldEcoreDataType, ecoreDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedAttribute() {
		if (ownedAttribute == null) {
			ownedAttribute = new EObjectContainmentWithInverseEList.Resolving<Property>(
					Property.class, this,
					StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE,
					StructurePackage.PROPERTY__OWNING_CLASS);
		}
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isMappedToJavaRawType() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_129 = false;
		idIfCond_129 = kermeta.standard.helper.BooleanWrapper.or(this
				.isCollection(), this.isIterator());

		if (idIfCond_129) {

			result = true;
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initEmfNeedProperty(KM2EcoreContext context) {

		//BIft:each

		{

			kermeta.standard.Iterator<java.lang.String> it_ft56 = this
					.getEMFNeedProperty().iterator();
			java.lang.Boolean idLoopCond_130 = false;
			while (!idLoopCond_130) {
				idLoopCond_130 = it_ft56.isOff();
				if (idLoopCond_130) {
				} else {

					//BIle:func
					java.lang.String emfNeedProperty_lbdExp56 = it_ft56.next();

					java.lang.Boolean idIfCond_131 = false;
					idIfCond_131 = kermeta.standard.helper.IntegerWrapper
							.isGreater(kermeta.standard.helper.StringWrapper
									.getPropertyInfos(emfNeedProperty_lbdExp56)
									.size(), 0);

					if (idIfCond_131) {

						ecore.EStructuralFeature newProperty = ((ecore.EAttribute) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("ecore.EAttribute"));

						java.lang.Boolean idIfCond_132 = false;
						idIfCond_132 = kermeta.standard.helper.BooleanWrapper
								.and(
										kermeta.standard.helper.BooleanWrapper
												.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isVoidSwitcher(kermeta.standard.helper.StringWrapper
																.getPropertyInfos(
																		emfNeedProperty_lbdExp56)
																.getValue(
																		"javaClass"))),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqualSwitcher(
														kermeta.standard.helper.StringWrapper
																.getPropertyInfos(
																		emfNeedProperty_lbdExp56)
																.getValue(
																		"javaClass"),
														""));

						if (idIfCond_132) {

							newProperty = ((ecore.EAttribute) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject("ecore.EAttribute"));

							newProperty
									.setName(kermeta.standard.helper.StringWrapper
											.getPropertyInfos(
													emfNeedProperty_lbdExp56)
											.getValue("name"));

							newProperty.set_transient(false);

							ecore.EDataType newProperty_EDataType = ((ecore.EDataType) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject("ecore.EDataType"));

							newProperty_EDataType
									.setName(kermeta.standard.helper.StringWrapper
											.plus(
													kermeta.standard.helper.StringWrapper
															.plus(
																	kermeta.standard.helper.StringWrapper
																			.plus(
																					"KermetaProperty_",
																					this
																							.getName()),
																	"_"),
													kermeta.standard.helper.StringWrapper
															.getPropertyInfos(
																	emfNeedProperty_lbdExp56)
															.getValue("name")));

							newProperty_EDataType
									.setInstanceClassName(kermeta.standard.helper.StringWrapper
											.getPropertyInfos(
													emfNeedProperty_lbdExp56)
											.getValue("javaClass"));

							org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<ecore.EClassifier> convertAsOrderedSet(
											((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asTypeSwitcher(
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.containerSwitcher(this),
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.Package")))
													.getEcoreModelElement()
													.getEClassifiers()).add(
											newProperty_EDataType);

							ecore.EGenericType newJavaCollection_EGenericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject("ecore.EGenericType"));

							newJavaCollection_EGenericType
									.setEClassifier(newProperty_EDataType);

							newProperty
									.setEGenericType(newJavaCollection_EGenericType);

							java.lang.Boolean idIfCond_133 = false;
							idIfCond_133 = kermeta.standard.helper.BooleanWrapper
									.and(
											kermeta.standard.helper.BooleanWrapper
													.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isVoidSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																	.<ecore.ETypeParameter> convertAsOrderedSet(this
																			.getEcoreModelElement()
																			.getETypeParameters()))),
											kermeta.standard.helper.IntegerWrapper
													.isGreater(
															org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																	.<ecore.ETypeParameter> convertAsOrderedSet(
																			this
																					.getEcoreModelElement()
																					.getETypeParameters())
																	.size(), 0));

							if (idIfCond_133) {

								//BIft:each

								{

									kermeta.standard.Iterator<ecore.ETypeParameter> it_ft57 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
											.<ecore.ETypeParameter> convertAsOrderedSet(
													this
															.getEcoreModelElement()
															.getETypeParameters())
											.iterator();
									java.lang.Boolean idLoopCond_134 = false;
									while (!idLoopCond_134) {
										idLoopCond_134 = it_ft57.isOff();
										if (idLoopCond_134) {
										} else {

											//BIle:func
											ecore.ETypeParameter etp_lbdExp57 = it_ft57
													.next();

											ecore.ETypeParameter newEtp = ((ecore.ETypeParameter) org.kermeta.compil.runtime.helper.language.ClassUtil
													.newObject("ecore.ETypeParameter"));

											newEtp.setName(etp_lbdExp57
													.getName());

											org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
													.<ecore.ETypeParameter> convertAsOrderedSet(
															newProperty_EDataType
																	.getETypeParameters())
													.add(newEtp);

											ecore.EGenericType eta = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
													.newObject("ecore.EGenericType"));

											eta.setETypeParameter(etp_lbdExp57);

											org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
													.<ecore.EGenericType> convertAsOrderedSet(
															newProperty
																	.getEGenericType()
																	.getETypeArguments())
													.add(eta);
											//EIle:func

										}
									}
								}

								//EIft:each

							}

						} else {

							java.lang.Boolean idIfCond_135 = false;
							idIfCond_135 = kermeta.standard.helper.BooleanWrapper
									.and(
											kermeta.standard.helper.BooleanWrapper
													.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isVoidSwitcher(kermeta.standard.helper.StringWrapper
																	.getPropertyInfos(
																			emfNeedProperty_lbdExp56)
																	.getValue(
																			"classDefinitionQN"))),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															kermeta.standard.helper.StringWrapper
																	.getPropertyInfos(
																			emfNeedProperty_lbdExp56)
																	.getValue(
																			"classDefinitionQN"),
															""));

							if (idIfCond_135) {

								newProperty = ((ecore.EReference) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject("ecore.EReference"));

								newProperty
										.setName(kermeta.standard.helper.StringWrapper
												.getPropertyInfos(
														emfNeedProperty_lbdExp56)
												.getValue("name"));

								newProperty.set_transient(false);

								ecore.EClassifier retrieved_EClassifier = context
										.getMu()
										.getEClassifierByQualifiedName(
												kermeta.standard.helper.StringWrapper
														.getPropertyInfos(
																emfNeedProperty_lbdExp56)
														.getValue(
																"classDefinitionQN"));

								ecore.EGenericType newJavaCollection_EGenericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject("ecore.EGenericType"));

								newJavaCollection_EGenericType
										.setEClassifier(retrieved_EClassifier);

								newProperty
										.setEGenericType(newJavaCollection_EGenericType);

								java.lang.Boolean idIfCond_136 = false;
								idIfCond_136 = kermeta.standard.helper.BooleanWrapper
										.and(
												kermeta.standard.helper.BooleanWrapper
														.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isVoidSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																		.<ecore.ETypeParameter> convertAsOrderedSet(this
																				.getEcoreModelElement()
																				.getETypeParameters()))),
												kermeta.standard.helper.IntegerWrapper
														.isGreater(
																org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																		.<ecore.ETypeParameter> convertAsOrderedSet(
																				this
																						.getEcoreModelElement()
																						.getETypeParameters())
																		.size(),
																0));

								if (idIfCond_136) {

									//BIft:each

									{

										kermeta.standard.Iterator<ecore.ETypeParameter> it_ft58 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<ecore.ETypeParameter> convertAsOrderedSet(
														this
																.getEcoreModelElement()
																.getETypeParameters())
												.iterator();
										java.lang.Boolean idLoopCond_137 = false;
										while (!idLoopCond_137) {
											idLoopCond_137 = it_ft58.isOff();
											if (idLoopCond_137) {
											} else {

												//BIle:func
												ecore.ETypeParameter etp_lbdExp58 = it_ft58
														.next();

												ecore.EGenericType eta = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
														.newObject("ecore.EGenericType"));

												eta
														.setETypeParameter(etp_lbdExp58);

												org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
														.<ecore.EGenericType> convertAsOrderedSet(
																newProperty
																		.getEGenericType()
																		.getETypeArguments())
														.add(eta);
												//EIle:func

											}
										}
									}

									//EIft:each

								}

							} else {

								newProperty.set_transient(true);

								kermeta.language.structure.TypeDefinition retrievedTypeDef = context
										.getMu()
										.getTypeDefinitionByQualifiedName(
												"ecore::EEList");

								java.lang.Boolean idIfCond_138 = false;
								idIfCond_138 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												retrievedTypeDef,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_138) {

									newProperty
											.setEType(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asTypeSwitcher(
															retrievedTypeDef,
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.ClassDefinition")))
													.getEcoreModelElement());
								} else {

									java.lang.Boolean idIfCond_139 = false;
									idIfCond_139 = org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isInstanceOfSwitcher(
													retrievedTypeDef,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.PrimitiveType"));

									if (idIfCond_139) {

										newProperty
												.setEType(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
														.asTypeSwitcher(
																retrievedTypeDef,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.PrimitiveType")))
														.getEcoreModelElement());
									}

								}

							}

						}

						org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<ecore.EStructuralFeature> convertAsOrderedSet(
										((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														this
																.getEcoreModelElement(),
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"ecore.EClass")))
												.getEStructuralFeatures()).add(
										newProperty);
					}

					//EIle:func

				}
			}
		}

		//EIft:each

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void applyPass1(KM2EcoreContext context) {

		this.setSubClassDefinitionToSuperTypes();

		kermeta.language.structure.Package p = ((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(this),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.structure.Package")));

		java.lang.Boolean idIfCond_140 = false;
		idIfCond_140 = this.isValueType();

		if (idIfCond_140) {

			java.lang.String instanceClassName = this.getEMFInstanceClassName();

			java.lang.Boolean idIfCond_141 = false;
			idIfCond_141 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(instanceClassName, "");

			if (idIfCond_141) {

				ecore.EDataType eDataType = ((ecore.EDataType) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("ecore.EDataType"));

				eDataType.setName(kermeta.standard.helper.StringWrapper.plus(
						"Java", this.getName()));

				eDataType.setInstanceClassName(instanceClassName);

				org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<java.lang.String> convertAsOrderedSet(
								context.getValueTypeMapping()).add(
								instanceClassName);

				org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<ecore.EClassifier> convertAsOrderedSet(
								p.getEcoreModelElement().getEClassifiers())
						.add(eDataType);

				this.setEcoreDataType(eDataType);

				java.lang.Boolean idIfCond_142 = false;
				idIfCond_142 = kermeta.standard.helper.BooleanWrapper.not(this
						.getIsAbstract());

				if (idIfCond_142) {

					ecore.EClass eClass = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("ecore.EClass"));

					eClass.setName(this.getName());

					this.setEcoreModelElement(eClass);

					org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<ecore.EClassifier> convertAsOrderedSet(
									((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.containerSwitcher(this),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.Package")))
											.getEcoreModelElement()
											.getEClassifiers()).add(eClass);
				}

			} else {

				java.lang.Boolean idIfCond_143 = false;
				idIfCond_143 = kermeta.standard.helper.BooleanWrapper.not(this
						.getIsAbstract());

				if (idIfCond_143) {

					km2ecore.common.exception.UndefinedValueTypeInstanceClassNameException except = ((km2ecore.common.exception.UndefinedValueTypeInstanceClassNameException) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("km2ecore.common.exception.UndefinedValueTypeInstanceClassNameException"));

					except
							.setMessage(kermeta.standard.helper.StringWrapper
									.plus(
											kermeta.standard.helper.StringWrapper
													.plus(
															"The class definition: ",
															this
																	.qualifiedName()),
											" is a ValueType, but the tag: @EMF_instanceClassName has not been correctly setted, please check this one in the *.km file that you try to load."));

					if (true)
						throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
								except);

				}

			}

		} else {

			ecore.EClass ecoreClass = this.createEcoreModelElement(context);

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EClassifier> convertAsOrderedSet(
							p.getEcoreModelElement().getEClassifiers()).add(
							ecoreClass);

			this.setEcoreModelElement(ecoreClass);

			//BIft:eachOwnedElement

			kermeta.language.structure.ClassDefinition cd_ft59 = this;

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft60 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Tag> convertAsOrderedSet(
								cd_ft59.getOwnedTags()).iterator();
				java.lang.Boolean idLoopCond_144 = false;
				while (!idLoopCond_144) {
					idLoopCond_144 = it_ft60.isOff();
					if (idLoopCond_144) {
					} else {

						//BIle:func
						kermeta.language.structure.Tag o_lbdExp60 = it_ft60
								.next();

						//BIle:func
						kermeta.language.structure.Tag o_lbdExp59 = o_lbdExp60;

						java.lang.Boolean idIfCond_145 = false;
						idIfCond_145 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												o_lbdExp59,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")));

						if (idIfCond_145) {

							o_lbdExp59.applyPass1(context);
						} else {

							kermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											o_lbdExp59,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation")));

							java.lang.Boolean idIfCond_146 = false;
							idIfCond_146 = kermeta.standard.helper.BooleanWrapper
									.not(op.isFunctionType());

							if (idIfCond_146) {

								op.applyPass1(context);
							}

						}

						//EIle:func

						//EIle:func

					}
				}
			}

			//EIft:each

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft61 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsOrderedSet(
								cd_ft59.getOwnedAttribute()).iterator();
				java.lang.Boolean idLoopCond_147 = false;
				while (!idLoopCond_147) {
					idLoopCond_147 = it_ft61.isOff();
					if (idLoopCond_147) {
					} else {

						//BIle:func
						kermeta.language.structure.Property o_lbdExp61 = it_ft61
								.next();

						//BIle:func
						kermeta.language.structure.Property o_lbdExp59 = o_lbdExp61;

						java.lang.Boolean idIfCond_148 = false;
						idIfCond_148 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												o_lbdExp59,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")));

						if (idIfCond_148) {

							o_lbdExp59.applyPass1(context);
						} else {

							kermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											o_lbdExp59,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation")));

							java.lang.Boolean idIfCond_149 = false;
							idIfCond_149 = kermeta.standard.helper.BooleanWrapper
									.not(op.isFunctionType());

							if (idIfCond_149) {

								op.applyPass1(context);
							}

						}

						//EIle:func

						//EIle:func

					}
				}
			}

			//EIft:each

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft62 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Operation> convertAsOrderedSet(
								cd_ft59.getOwnedOperation()).iterator();
				java.lang.Boolean idLoopCond_150 = false;
				while (!idLoopCond_150) {
					idLoopCond_150 = it_ft62.isOff();
					if (idLoopCond_150) {
					} else {

						//BIle:func
						kermeta.language.structure.Operation o_lbdExp62 = it_ft62
								.next();

						//BIle:func
						kermeta.language.structure.Operation o_lbdExp59 = o_lbdExp62;

						java.lang.Boolean idIfCond_151 = false;
						idIfCond_151 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												o_lbdExp59,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")));

						if (idIfCond_151) {

							o_lbdExp59.applyPass1(context);
						} else {

							kermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											o_lbdExp59,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation")));

							java.lang.Boolean idIfCond_152 = false;
							idIfCond_152 = kermeta.standard.helper.BooleanWrapper
									.not(op.isFunctionType());

							if (idIfCond_152) {

								op.applyPass1(context);
							}

						}

						//EIle:func

						//EIle:func

					}
				}
			}

			//EIft:each

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft63 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Constraint> convertAsOrderedSet(
								cd_ft59.getInv()).iterator();
				java.lang.Boolean idLoopCond_153 = false;
				while (!idLoopCond_153) {
					idLoopCond_153 = it_ft63.isOff();
					if (idLoopCond_153) {
					} else {

						//BIle:func
						kermeta.language.structure.Constraint i_lbdExp63 = it_ft63
								.next();

						//BIle:func
						kermeta.language.structure.Constraint o_lbdExp59 = i_lbdExp63;

						java.lang.Boolean idIfCond_154 = false;
						idIfCond_154 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												o_lbdExp59,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")));

						if (idIfCond_154) {

							o_lbdExp59.applyPass1(context);
						} else {

							kermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											o_lbdExp59,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation")));

							java.lang.Boolean idIfCond_155 = false;
							idIfCond_155 = kermeta.standard.helper.BooleanWrapper
									.not(op.isFunctionType());

							if (idIfCond_155) {

								op.applyPass1(context);
							}

						}

						//EIle:func

						//EIle:func

					}
				}
			}

			//EIft:each

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft64 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
								cd_ft59.getTypeParameter()).iterator();
				java.lang.Boolean idLoopCond_156 = false;
				while (!idLoopCond_156) {
					idLoopCond_156 = it_ft64.isOff();
					if (idLoopCond_156) {
					} else {

						//BIle:func
						kermeta.language.structure.TypeVariable t_lbdExp64 = it_ft64
								.next();

						//BIle:func
						kermeta.language.structure.TypeVariable o_lbdExp59 = t_lbdExp64;

						java.lang.Boolean idIfCond_157 = false;
						idIfCond_157 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												o_lbdExp59,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")));

						if (idIfCond_157) {

							o_lbdExp59.applyPass1(context);
						} else {

							kermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											o_lbdExp59,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation")));

							java.lang.Boolean idIfCond_158 = false;
							idIfCond_158 = kermeta.standard.helper.BooleanWrapper
									.not(op.isFunctionType());

							if (idIfCond_158) {

								op.applyPass1(context);
							}

						}

						//EIle:func

						//EIle:func

					}
				}
			}

			//EIft:each

			//EIft:eachOwnedElement

		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void applyPass2(KM2EcoreContext context) {

		this.setLinks(context);

		kermeta.language.structure.helper.ObjectSuper.super_applyPass2(this,
				context);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isValueType() {

		java.lang.Boolean result = null;

		result = this.isSubTypeOf("kermeta::standard::ValueType");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinks(KM2EcoreContext context) {

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft65 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Type> convertAsOrderedSet(
							this.getSuperType()).iterator();
			java.lang.Boolean idLoopCond_159 = false;
			while (!idLoopCond_159) {
				idLoopCond_159 = it_ft65.isOff();
				if (idLoopCond_159) {
				} else {

					//BIle:func
					kermeta.language.structure.Type t_lbdExp65 = it_ft65.next();

					java.lang.Boolean idIfCond_160 = false;
					idIfCond_160 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									t_lbdExp65,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Class"));

					if (idIfCond_160) {

						kermeta.language.structure.ClassDefinition classDefinition = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeSwitcher(
										t_lbdExp65,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Class")))
								.getClassDefinitionAsTyped();

						java.lang.Boolean idIfCond_161 = false;
						idIfCond_161 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(this
												.getEcoreModelElement()));

						if (idIfCond_161) {

							java.lang.Boolean idIfCond_162 = false;
							idIfCond_162 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(classDefinition
													.getEcoreModelElement()));

							if (idIfCond_162) {

								ecore.EGenericType new_eGenericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject("ecore.EGenericType"));

								new_eGenericType.setEClassifier(classDefinition
										.getEcoreModelElement());

								org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
										.<ecore.EGenericType> convertAsOrderedSet(
												this
														.getEcoreModelElement()
														.getEGenericSuperTypes())
										.add(new_eGenericType);

								((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												t_lbdExp65,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Class")))
										.setEcoreModelElement(new_eGenericType);

								((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												t_lbdExp65,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Class")))
										.setLinks(context);
							}

						}

					}

					//EIle:func

				}
			}
		}

		//EIft:each

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubClassDefinitionToSuperTypes() {

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft66 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Type> convertAsOrderedSet(
							this.getSuperType()).iterator();
			java.lang.Boolean idLoopCond_163 = false;
			while (!idLoopCond_163) {
				idLoopCond_163 = it_ft66.isOff();
				if (idLoopCond_163) {
				} else {

					//BIle:func
					kermeta.language.structure.Type t_lbdExp66 = it_ft66.next();

					java.lang.Boolean idIfCond_164 = false;
					idIfCond_164 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									t_lbdExp66,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.ParameterizedType"));

					if (idIfCond_164) {

						java.lang.Boolean idIfCond_165 = false;
						idIfCond_165 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														t_lbdExp66,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.structure.ParameterizedType")))
												.getTypeDefinition(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.ClassDefinition"));

						if (idIfCond_165) {

							org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.ClassDefinition> convertAsOrderedSet(
											((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asTypeSwitcher(
															((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			t_lbdExp66,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.ParameterizedType")))
																	.getTypeDefinition(),
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.ClassDefinition")))
													.getSubClassDefinitions())
									.add(this);
						}

					}

					//EIle:func

				}
			}
		}

		//EIft:each

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isAddedValueType() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.String qName = this.qualifiedName();

		java.lang.Boolean idIfCond_166 = false;
		idIfCond_166 = kermeta.standard.helper.BooleanWrapper
				.or(
						kermeta.standard.helper.BooleanWrapper
								.or(
										kermeta.standard.helper.BooleanWrapper
												.or(
														kermeta.standard.helper.BooleanWrapper
																.or(
																		kermeta.standard.helper.StringWrapper
																				.equals(
																						qName,
																						"kermeta::standard::String"),
																		kermeta.standard.helper.StringWrapper
																				.equals(
																						qName,
																						"kermeta::standard::Integer")),
														kermeta.standard.helper.StringWrapper
																.equals(qName,
																		"kermeta::standard::Boolean")),
										kermeta.standard.helper.StringWrapper
												.equals(qName,
														"kermeta::standard::Character")),
						kermeta.standard.helper.StringWrapper.equals(qName,
								"kermeta::standard::Real"));

		if (idIfCond_166) {

			result = true;
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isSubTypeOf(String superType_qualifiedName) {

		java.lang.Boolean result = null;

		result = false;

		kermeta.language.structure.Type res = null;
		//BIft:detect

		kermeta.language.structure.Type result_ft67 = null;

		kermeta.language.structure.Type elem_ft67 = null;

		result_ft67 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft67 = this
					.allSuperTypes().iterator();
			java.lang.Boolean idLoopCond_167 = false;
			while (!idLoopCond_167) {
				idLoopCond_167 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft67.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft67, null));
				if (idLoopCond_167) {
				} else {

					elem_ft67 = it_ft67.next();

					java.lang.Boolean idIfCond_168 = false;
					//BIle:detector
					kermeta.language.structure.Type st_lbdExp67 = elem_ft67;

					idIfCond_168 = kermeta.standard.helper.BooleanWrapper
							.and(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isInstanceOfSwitcher(
													st_lbdExp67,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ParameterizedType")),
									kermeta.standard.helper.StringWrapper
											.equals(
													((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
															.asTypeSwitcher(
																	st_lbdExp67,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.ParameterizedType")))
															.getTypeDefinition()
															.qualifiedName(),
													superType_qualifiedName));
					//EIle:detector

					if (idIfCond_168) {

						result_ft67 = elem_ft67;
					}

				}
			}
		}

		//CE
		res = result_ft67;
		//EIft:detect

		java.lang.Boolean idIfCond_169 = false;
		idIfCond_169 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(res));

		if (idIfCond_169) {

			result = true;
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<Type> allSuperTypes() {

		kermeta.standard.Set<kermeta.language.structure.Type> result = null;

		kermeta.standard.Set<kermeta.language.structure.Type> allSuperClasses = ((kermeta.standard.Set<kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Set<kermeta.language.structure.Type>"));

		kermeta.standard.Set<kermeta.language.structure.Type> superClasses = ((kermeta.standard.Set<kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Set<kermeta.language.structure.Type>"));

		superClasses
				.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Type> convertAsOrderedSet(this
								.getSuperType()));

		kermeta.standard.helper.BooleanWrapper.not(superClasses.isEmpty());
		java.lang.Boolean idLoopCond_170 = false;
		while (!idLoopCond_170) {
			idLoopCond_170 = superClasses.isEmpty();
			if (idLoopCond_170) {
			} else {

				allSuperClasses.addAll(superClasses);

				kermeta.standard.Set<kermeta.language.structure.Type> temp = ((kermeta.standard.Set<kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("kermeta.standard.Set<kermeta.language.structure.Type>"));

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft68 = superClasses
							.iterator();
					java.lang.Boolean idLoopCond_171 = false;
					while (!idLoopCond_171) {
						idLoopCond_171 = it_ft68.isOff();
						if (idLoopCond_171) {
						} else {

							//BIle:func
							kermeta.language.structure.Type s_lbdExp68 = it_ft68
									.next();

							java.lang.Boolean idIfCond_172 = false;
							idIfCond_172 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isInstanceOfSwitcher(
											s_lbdExp68,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.ParameterizedType"));

							if (idIfCond_172) {

								java.lang.Boolean idIfCond_173 = false;
								idIfCond_173 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
														.asTypeSwitcher(
																s_lbdExp68,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.ParameterizedType")))
														.getTypeDefinition(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_173) {

									temp
											.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
													.<kermeta.language.structure.Type> convertAsOrderedSet(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
															.asTypeSwitcher(
																	((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																			.asTypeSwitcher(
																					s_lbdExp68,
																					org.kermeta.compil.runtime.ExecutionContext
																							.getInstance()
																							.getMetaClass(
																									"kermeta.language.structure.ParameterizedType")))
																			.getTypeDefinition(),
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.ClassDefinition")))
															.getSuperType()));
								}

							}

							//EIle:func

						}
					}
				}

				//EIft:each

				superClasses.clear();

				superClasses.addAll(temp);
			}
		}

		result = allSuperClasses;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isIterator() {

		java.lang.Boolean result = null;

		result = false;

		result = this.isSubTypeOf("kermeta::standard::Iterator");

		java.lang.Boolean idIfCond_174 = false;
		idIfCond_174 = kermeta.standard.helper.StringWrapper.equals(this
				.qualifiedName(), "kermeta::standard::Iterator");

		if (idIfCond_174) {

			result = true;
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isCollection() {

		java.lang.Boolean result = null;

		result = false;

		result = this.isSubTypeOf("kermeta::standard::Collection");

		java.lang.Boolean idIfCond_175 = false;
		idIfCond_175 = kermeta.standard.helper.StringWrapper.equals(this
				.qualifiedName(), "kermeta::standard::Collection");

		if (idIfCond_175) {

			result = true;
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass createEcoreModelElement(KM2EcoreContext context) {

		ecore.EClass result = null;

		ecore.EClass ecoreClass = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("ecore.EClass"));

		ecoreClass.set_interface(false);

		ecoreClass
				.setName(((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("km2ecore.helper.java.IdentifierHelper"))
						.getMangledIdentifier(this.getName(), context));

		ecoreClass.set_abstract(this.getIsAbstract());

		result = ecoreClass;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void applyPass2BehaviorJava(KM2EcoreContext context) {

		java.lang.Boolean idIfCond_176 = false;
		idIfCond_176 = kermeta.standard.helper.BooleanWrapper.not(this
				.isAddedValueType());

		if (idIfCond_176) {

			this.setLinks(context);
		} else {

			kermeta.language.structure.ClassDefinition cd_valueType = null;

			cd_valueType = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.ExecutionContext
					.getInstance()
					.<kermeta.language.structure.ClassDefinition> asTypeOrVoid(
							context.getMu().getTypeDefinitionByQualifiedName(
									"kermeta::standard::ValueType"));

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EClass> convertAsOrderedSet(
							this.getEcoreModelElement().getESuperTypes()).add(
							cd_valueType.getEcoreModelElement());
		}

		java.lang.Boolean idIfCond_177 = false;
		idIfCond_177 = kermeta.standard.helper.BooleanWrapper.and(this
				.isValueType(),
				org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isNotEqualSwitcher(this.getName(), "Numeric"));

		if (idIfCond_177) {

			context.setCurrent_valueType(this);

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft69 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Operation> convertAsOrderedSet(
								this.getOwnedOperation()).iterator();
				java.lang.Boolean idLoopCond_178 = false;
				while (!idLoopCond_178) {
					idLoopCond_178 = it_ft69.isOff();
					if (idLoopCond_178) {
					} else {

						//BIle:func
						kermeta.language.structure.Operation op_lbdExp69 = it_ft69
								.next();

						op_lbdExp69.applyPass2BehaviorJava(context);
						//EIle:func

					}
				}
			}

			//EIft:each

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft70 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Type> convertAsOrderedSet(
								this.getSuperType()).iterator();
				java.lang.Boolean idLoopCond_179 = false;
				while (!idLoopCond_179) {
					idLoopCond_179 = it_ft70.isOff();
					if (idLoopCond_179) {
					} else {

						//BIle:func
						kermeta.language.structure.Type t_lbdExp70 = it_ft70
								.next();

						java.lang.Boolean idIfCond_180 = false;
						idIfCond_180 = org.kermeta.compil.runtime.helper.language.TypeUtil
								.isInstanceSwitcher(
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Class"),
										t_lbdExp70);

						if (idIfCond_180) {

							kermeta.language.structure.Class c = null;

							c = (kermeta.language.structure.Class) org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.<kermeta.language.structure.Class> asTypeOrVoid(
											t_lbdExp70);

							kermeta.language.structure.ClassDefinition cDef = null;

							cDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.<kermeta.language.structure.ClassDefinition> asTypeOrVoid(
											c.getTypeDefinition());

							//BIft:each

							{

								kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft71 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
										.<kermeta.language.structure.Operation> convertAsSet(
												cDef.getterAllOperation())
										.iterator();
								java.lang.Boolean idLoopCond_181 = false;
								while (!idLoopCond_181) {
									idLoopCond_181 = it_ft71.isOff();
									if (idLoopCond_181) {
									} else {

										//BIle:func
										kermeta.language.structure.Operation p_lbdExp71 = it_ft71
												.next();

										java.lang.Boolean idIfCond_182 = false;
										idIfCond_182 = kermeta.standard.helper.StringWrapper
												.equals(
														p_lbdExp71
																.getRecopyInValueTypes(),
														"true");

										if (idIfCond_182) {

											p_lbdExp71
													.applyPass2BehaviorJava(context);
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

			context.setCurrent_valueType(null);
		} else {

			java.lang.Boolean idIfCond_183 = false;
			idIfCond_183 = kermeta.standard.helper.BooleanWrapper.not(this
					.isAddedValueType());

			if (idIfCond_183) {

				//BIft:eachOwnedElement

				kermeta.language.structure.ClassDefinition cd_ft72 = this;

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft73 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Tag> convertAsOrderedSet(
									cd_ft72.getOwnedTags()).iterator();
					java.lang.Boolean idLoopCond_184 = false;
					while (!idLoopCond_184) {
						idLoopCond_184 = it_ft73.isOff();
						if (idLoopCond_184) {
						} else {

							//BIle:func
							kermeta.language.structure.Tag o_lbdExp73 = it_ft73
									.next();

							//BIle:func
							kermeta.language.structure.Tag p_lbdExp72 = o_lbdExp73;

							p_lbdExp72.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft74 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Property> convertAsOrderedSet(
									cd_ft72.getOwnedAttribute()).iterator();
					java.lang.Boolean idLoopCond_185 = false;
					while (!idLoopCond_185) {
						idLoopCond_185 = it_ft74.isOff();
						if (idLoopCond_185) {
						} else {

							//BIle:func
							kermeta.language.structure.Property o_lbdExp74 = it_ft74
									.next();

							//BIle:func
							kermeta.language.structure.Property p_lbdExp72 = o_lbdExp74;

							p_lbdExp72.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft75 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Operation> convertAsOrderedSet(
									cd_ft72.getOwnedOperation()).iterator();
					java.lang.Boolean idLoopCond_186 = false;
					while (!idLoopCond_186) {
						idLoopCond_186 = it_ft75.isOff();
						if (idLoopCond_186) {
						} else {

							//BIle:func
							kermeta.language.structure.Operation o_lbdExp75 = it_ft75
									.next();

							//BIle:func
							kermeta.language.structure.Operation p_lbdExp72 = o_lbdExp75;

							p_lbdExp72.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft76 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Constraint> convertAsOrderedSet(
									cd_ft72.getInv()).iterator();
					java.lang.Boolean idLoopCond_187 = false;
					while (!idLoopCond_187) {
						idLoopCond_187 = it_ft76.isOff();
						if (idLoopCond_187) {
						} else {

							//BIle:func
							kermeta.language.structure.Constraint i_lbdExp76 = it_ft76
									.next();

							//BIle:func
							kermeta.language.structure.Constraint p_lbdExp72 = i_lbdExp76;

							p_lbdExp72.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft77 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
									cd_ft72.getTypeParameter()).iterator();
					java.lang.Boolean idLoopCond_188 = false;
					while (!idLoopCond_188) {
						idLoopCond_188 = it_ft77.isOff();
						if (idLoopCond_188) {
						} else {

							//BIle:func
							kermeta.language.structure.TypeVariable t_lbdExp77 = it_ft77
									.next();

							//BIle:func
							kermeta.language.structure.TypeVariable p_lbdExp72 = t_lbdExp77;

							p_lbdExp72.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//EIft:eachOwnedElement

			}

		}

		this.initEmfNeedProperty(context);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getterAllOperation() {

		kermeta.standard.Set<kermeta.language.structure.Operation> result = null;

		result = ((kermeta.standard.Set<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Set<kermeta.language.structure.Operation>"));

		result
				.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Operation> convertAsOrderedSet(this
								.getOwnedOperation()));

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft52 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Type> convertAsOrderedSet(
							this.getSuperType()).iterator();
			java.lang.Boolean idLoopCond_123 = false;
			while (!idLoopCond_123) {
				idLoopCond_123 = it_ft52.isOff();
				if (idLoopCond_123) {
				} else {

					//BIle:func
					kermeta.language.structure.Type t_lbdExp52 = it_ft52.next();

					java.lang.Boolean idIfCond_124 = false;
					idIfCond_124 = org.kermeta.compil.runtime.helper.language.TypeUtil
							.isInstanceSwitcher(
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Class"),
									t_lbdExp52);

					if (idIfCond_124) {

						kermeta.language.structure.Class c = null;

						c = (kermeta.language.structure.Class) org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.<kermeta.language.structure.Class> asTypeOrVoid(
										t_lbdExp52);

						kermeta.language.structure.ClassDefinition cDef = null;

						cDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.<kermeta.language.structure.ClassDefinition> asTypeOrVoid(
										c.getTypeDefinition());

						//BIft:each

						{

							kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft53 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Operation> convertAsSet(
											cDef.getterAllOperation())
									.iterator();
							java.lang.Boolean idLoopCond_125 = false;
							while (!idLoopCond_125) {
								idLoopCond_125 = it_ft53.isOff();
								if (idLoopCond_125) {
								} else {

									//BIle:func
									kermeta.language.structure.Operation p_lbdExp53 = it_ft53
											.next();

									result.add(p_lbdExp53);
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

		return org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.convertAsEList(result);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getterAllAttribute() {

		kermeta.standard.Set<kermeta.language.structure.Property> result = null;

		result = ((kermeta.standard.Set<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Set<kermeta.language.structure.Property>"));

		result
				.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsOrderedSet(this
								.getOwnedAttribute()));

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft54 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Type> convertAsOrderedSet(
							this.getSuperType()).iterator();
			java.lang.Boolean idLoopCond_126 = false;
			while (!idLoopCond_126) {
				idLoopCond_126 = it_ft54.isOff();
				if (idLoopCond_126) {
				} else {

					//BIle:func
					kermeta.language.structure.Type t_lbdExp54 = it_ft54.next();

					java.lang.Boolean idIfCond_127 = false;
					idIfCond_127 = org.kermeta.compil.runtime.helper.language.TypeUtil
							.isInstanceSwitcher(
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Class"),
									t_lbdExp54);

					if (idIfCond_127) {

						kermeta.language.structure.Class c = null;

						c = (kermeta.language.structure.Class) org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.<kermeta.language.structure.Class> asTypeOrVoid(
										t_lbdExp54);

						kermeta.language.structure.ClassDefinition cDef = null;

						cDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.<kermeta.language.structure.ClassDefinition> asTypeOrVoid(
										c.getTypeDefinition());

						//BIft:each

						{

							kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft55 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Property> convertAsSet(
											cDef.getterAllAttribute())
									.iterator();
							java.lang.Boolean idLoopCond_128 = false;
							while (!idLoopCond_128) {
								idLoopCond_128 = it_ft55.isOff();
								if (idLoopCond_128) {
								} else {

									//BIle:func
									kermeta.language.structure.Property p_lbdExp55 = it_ft55
											.next();

									result.add(p_lbdExp55);
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

		return org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.convertAsEList(result);

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

		java.lang.Boolean idIfCond_402 = false;
		idIfCond_402 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(elem),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.NamedElement"));

		if (idIfCond_402) {

			elem = (kermeta.language.structure.NamedElement) org.kermeta.compil.runtime.ExecutionContext
					.getInstance()
					.<kermeta.language.structure.NamedElement> asTypeOrVoid(
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.containerSwitcher(elem));
			java.lang.Boolean idLoopCond_403 = false;
			while (!idLoopCond_403) {
				idLoopCond_403 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equalsSwitcher(elem, null);
				if (idLoopCond_403) {
				} else {

					result = kermeta.standard.helper.StringWrapper.plus(
							kermeta.standard.helper.StringWrapper.plus(elem
									.getName(), "::"), result);

					java.lang.Boolean idIfCond_404 = false;
					idIfCond_404 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.containerSwitcher(elem),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.NamedElement"));

					if (idIfCond_404) {

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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getContainedType())
					.basicAdd(otherEnd, msgs);
		case StructurePackage.CLASS_DEFINITION__OWNED_OPERATION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedOperation())
					.basicAdd(otherEnd, msgs);
		case StructurePackage.CLASS_DEFINITION__INV:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInv())
					.basicAdd(otherEnd, msgs);
		case StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedAttribute())
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
		case StructurePackage.CLASS_DEFINITION__TYPE_PARAMETER:
			return ((InternalEList<?>) getTypeParameter()).basicRemove(
					otherEnd, msgs);
		case StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE:
			return ((InternalEList<?>) getContainedType()).basicRemove(
					otherEnd, msgs);
		case StructurePackage.CLASS_DEFINITION__OWNED_OPERATION:
			return ((InternalEList<?>) getOwnedOperation()).basicRemove(
					otherEnd, msgs);
		case StructurePackage.CLASS_DEFINITION__INV:
			return ((InternalEList<?>) getInv()).basicRemove(otherEnd, msgs);
		case StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE:
			return ((InternalEList<?>) getOwnedAttribute()).basicRemove(
					otherEnd, msgs);
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
		case StructurePackage.CLASS_DEFINITION__NAME:
			return getName();
		case StructurePackage.CLASS_DEFINITION__IS_ASPECT:
			return getIsAspect();
		case StructurePackage.CLASS_DEFINITION__TYPE_PARAMETER:
			return getTypeParameter();
		case StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE:
			return getContainedType();
		case StructurePackage.CLASS_DEFINITION__OWNED_OPERATION:
			return getOwnedOperation();
		case StructurePackage.CLASS_DEFINITION__IS_ABSTRACT:
			return getIsAbstract();
		case StructurePackage.CLASS_DEFINITION__SUPER_TYPE:
			return getSuperType();
		case StructurePackage.CLASS_DEFINITION__INV:
			return getInv();
		case StructurePackage.CLASS_DEFINITION__SUB_CLASS_DEFINITIONS:
			return getSubClassDefinitions();
		case StructurePackage.CLASS_DEFINITION__ECORE_DATA_TYPE:
			if (resolve)
				return getEcoreDataType();
			return basicGetEcoreDataType();
		case StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE:
			return getOwnedAttribute();
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
		case StructurePackage.CLASS_DEFINITION__NAME:
			setName((String) newValue);
			return;
		case StructurePackage.CLASS_DEFINITION__IS_ASPECT:
			setIsAspect((Boolean) newValue);
			return;
		case StructurePackage.CLASS_DEFINITION__TYPE_PARAMETER:
			getTypeParameter().clear();
			getTypeParameter().addAll(
					(Collection<? extends TypeVariable>) newValue);
			return;
		case StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE:
			getContainedType().clear();
			getContainedType().addAll((Collection<? extends Type>) newValue);
			return;
		case StructurePackage.CLASS_DEFINITION__OWNED_OPERATION:
			getOwnedOperation().clear();
			getOwnedOperation().addAll(
					(Collection<? extends Operation>) newValue);
			return;
		case StructurePackage.CLASS_DEFINITION__IS_ABSTRACT:
			setIsAbstract((Boolean) newValue);
			return;
		case StructurePackage.CLASS_DEFINITION__SUPER_TYPE:
			getSuperType().clear();
			getSuperType().addAll((Collection<? extends Type>) newValue);
			return;
		case StructurePackage.CLASS_DEFINITION__INV:
			getInv().clear();
			getInv().addAll((Collection<? extends Constraint>) newValue);
			return;
		case StructurePackage.CLASS_DEFINITION__SUB_CLASS_DEFINITIONS:
			getSubClassDefinitions().clear();
			getSubClassDefinitions().addAll(
					(Collection<? extends ClassDefinition>) newValue);
			return;
		case StructurePackage.CLASS_DEFINITION__ECORE_DATA_TYPE:
			setEcoreDataType((EDataType) newValue);
			return;
		case StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE:
			getOwnedAttribute().clear();
			getOwnedAttribute().addAll(
					(Collection<? extends Property>) newValue);
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
		case StructurePackage.CLASS_DEFINITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StructurePackage.CLASS_DEFINITION__IS_ASPECT:
			setIsAspect(IS_ASPECT_EDEFAULT);
			return;
		case StructurePackage.CLASS_DEFINITION__TYPE_PARAMETER:
			getTypeParameter().clear();
			return;
		case StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE:
			getContainedType().clear();
			return;
		case StructurePackage.CLASS_DEFINITION__OWNED_OPERATION:
			getOwnedOperation().clear();
			return;
		case StructurePackage.CLASS_DEFINITION__IS_ABSTRACT:
			setIsAbstract(IS_ABSTRACT_EDEFAULT);
			return;
		case StructurePackage.CLASS_DEFINITION__SUPER_TYPE:
			getSuperType().clear();
			return;
		case StructurePackage.CLASS_DEFINITION__INV:
			getInv().clear();
			return;
		case StructurePackage.CLASS_DEFINITION__SUB_CLASS_DEFINITIONS:
			getSubClassDefinitions().clear();
			return;
		case StructurePackage.CLASS_DEFINITION__ECORE_DATA_TYPE:
			setEcoreDataType((EDataType) null);
			return;
		case StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE:
			getOwnedAttribute().clear();
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
		case StructurePackage.CLASS_DEFINITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case StructurePackage.CLASS_DEFINITION__IS_ASPECT:
			return IS_ASPECT_EDEFAULT == null ? isAspect != null
					: !IS_ASPECT_EDEFAULT.equals(isAspect);
		case StructurePackage.CLASS_DEFINITION__TYPE_PARAMETER:
			return typeParameter != null && !typeParameter.isEmpty();
		case StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE:
			return containedType != null && !containedType.isEmpty();
		case StructurePackage.CLASS_DEFINITION__OWNED_OPERATION:
			return ownedOperation != null && !ownedOperation.isEmpty();
		case StructurePackage.CLASS_DEFINITION__IS_ABSTRACT:
			return IS_ABSTRACT_EDEFAULT == null ? isAbstract != null
					: !IS_ABSTRACT_EDEFAULT.equals(isAbstract);
		case StructurePackage.CLASS_DEFINITION__SUPER_TYPE:
			return superType != null && !superType.isEmpty();
		case StructurePackage.CLASS_DEFINITION__INV:
			return inv != null && !inv.isEmpty();
		case StructurePackage.CLASS_DEFINITION__SUB_CLASS_DEFINITIONS:
			return subClassDefinitions != null
					&& !subClassDefinitions.isEmpty();
		case StructurePackage.CLASS_DEFINITION__ECORE_DATA_TYPE:
			return ecoreDataType != null;
		case StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE:
			return ownedAttribute != null && !ownedAttribute.isEmpty();
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
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
			case StructurePackage.CLASS_DEFINITION__NAME:
				return StructurePackage.NAMED_ELEMENT__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == TypeDefinition.class) {
			switch (derivedFeatureID) {
			case StructurePackage.CLASS_DEFINITION__IS_ASPECT:
				return StructurePackage.TYPE_DEFINITION__IS_ASPECT;
			default:
				return -1;
			}
		}
		if (baseClass == GenericTypeDefinition.class) {
			switch (derivedFeatureID) {
			case StructurePackage.CLASS_DEFINITION__TYPE_PARAMETER:
				return StructurePackage.GENERIC_TYPE_DEFINITION__TYPE_PARAMETER;
			default:
				return -1;
			}
		}
		if (baseClass == TypeContainer.class) {
			switch (derivedFeatureID) {
			case StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE:
				return StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE;
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
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
			case StructurePackage.NAMED_ELEMENT__NAME:
				return StructurePackage.CLASS_DEFINITION__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == TypeDefinition.class) {
			switch (baseFeatureID) {
			case StructurePackage.TYPE_DEFINITION__IS_ASPECT:
				return StructurePackage.CLASS_DEFINITION__IS_ASPECT;
			default:
				return -1;
			}
		}
		if (baseClass == GenericTypeDefinition.class) {
			switch (baseFeatureID) {
			case StructurePackage.GENERIC_TYPE_DEFINITION__TYPE_PARAMETER:
				return StructurePackage.CLASS_DEFINITION__TYPE_PARAMETER;
			default:
				return -1;
			}
		}
		if (baseClass == TypeContainer.class) {
			switch (baseFeatureID) {
			case StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE:
				return StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE;
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
		result.append(", isAspect: ");
		result.append(isAspect);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //ClassDefinitionImpl
