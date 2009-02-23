/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: ClassDefinitionImpl.java,v 1.13 2009-02-23 15:26:40 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import ecore.EClass;
import ecore.EDataType;

import java.util.Collection;

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.Constraint;
import kermeta.language.structure.Operation;
import kermeta.language.structure.Property;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.Traceability;
import kermeta.language.structure.Type;
import kermeta.language.structure.TypeContainer;

import kermeta.standard.Set;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getContainedType <em>Contained Type</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getEcoreModelElement <em>Ecore Model Element</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getInv <em>Inv</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getSubClassDefinitions <em>Sub Class Definitions</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getEcoreDataType <em>Ecore Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassDefinitionImpl extends GenericTypeDefinitionImpl implements
		ClassDefinition {
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
	 * The cached value of the '{@link #getEcoreModelElement() <em>Ecore Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreModelElement()
	 * @generated
	 * @ordered
	 */
	protected EClass ecoreModelElement;

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
	 * The cached value of the '{@link #getOwnedAttribute() <em>Owned Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedAttribute;

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
	public EClass getEcoreModelElement() {
		if (ecoreModelElement != null
				&& ((EObject) ecoreModelElement).eIsProxy()) {
			InternalEObject oldEcoreModelElement = (InternalEObject) ecoreModelElement;
			ecoreModelElement = (EClass) eResolveProxy(oldEcoreModelElement);
			if (ecoreModelElement != oldEcoreModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							StructurePackage.CLASS_DEFINITION__ECORE_MODEL_ELEMENT,
							oldEcoreModelElement, ecoreModelElement));
			}
		}
		return ecoreModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetEcoreModelElement() {
		return ecoreModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcoreModelElement(EClass newEcoreModelElement) {
		EClass oldEcoreModelElement = ecoreModelElement;
		ecoreModelElement = newEcoreModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.CLASS_DEFINITION__ECORE_MODEL_ELEMENT,
					oldEcoreModelElement, ecoreModelElement));
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
	public Boolean isMappedToJavaRawType() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_153 = false;
		idIfCond_153 = kermeta.standard.helper.BooleanWrapper.or(this
				.isCollection(), this.isIterator());

		if (idIfCond_153) {

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

			kermeta.standard.Iterator<java.lang.String> it_ft60 = this
					.getEMFNeedProperty().iterator();
			java.lang.Boolean idLoopCond_154 = false;
			while (!idLoopCond_154) {
				idLoopCond_154 = it_ft60.isOff();
				if (idLoopCond_154) {
				} else {

					//BIle:func
					java.lang.String emfNeedProperty_lbdExp60 = it_ft60.next();

					java.lang.Boolean idIfCond_155 = false;
					idIfCond_155 = kermeta.standard.helper.IntegerWrapper
							.isGreater(kermeta.standard.helper.StringWrapper
									.getPropertyInfos(emfNeedProperty_lbdExp60)
									.size(), 0);

					if (idIfCond_155) {

						ecore.EStructuralFeature newProperty = ((ecore.EAttribute) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(ecore.EcorePackage.eINSTANCE
										.getEAttribute()));

						java.lang.Boolean idIfCond_156 = false;
						idIfCond_156 = kermeta.standard.helper.BooleanWrapper
								.and(
										kermeta.standard.helper.BooleanWrapper
												.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isVoidSwitcher(kermeta.standard.helper.StringWrapper
																.getPropertyInfos(
																		emfNeedProperty_lbdExp60)
																.getValue(
																		"javaClass"))),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqualSwitcher(
														kermeta.standard.helper.StringWrapper
																.getPropertyInfos(
																		emfNeedProperty_lbdExp60)
																.getValue(
																		"javaClass"),
														""));

						if (idIfCond_156) {

							newProperty = ((ecore.EAttribute) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject(ecore.EcorePackage.eINSTANCE
											.getEAttribute()));

							newProperty
									.setName(kermeta.standard.helper.StringWrapper
											.getPropertyInfos(
													emfNeedProperty_lbdExp60)
											.getValue("name"));

							newProperty.set_transient(false);

							ecore.EDataType newProperty_EDataType = ((ecore.EDataType) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject(ecore.EcorePackage.eINSTANCE
											.getEDataType()));

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
																	emfNeedProperty_lbdExp60)
															.getValue("name")));

							newProperty_EDataType
									.setInstanceClassName(kermeta.standard.helper.StringWrapper
											.getPropertyInfos(
													emfNeedProperty_lbdExp60)
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
									.newObject(ecore.EcorePackage.eINSTANCE
											.getEGenericType()));

							newJavaCollection_EGenericType
									.setEClassifier(newProperty_EDataType);

							newProperty
									.setEGenericType(newJavaCollection_EGenericType);

							java.lang.Boolean idIfCond_157 = false;
							idIfCond_157 = kermeta.standard.helper.BooleanWrapper
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

							if (idIfCond_157) {

								//BIft:each

								{

									kermeta.standard.Iterator<ecore.ETypeParameter> it_ft61 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
											.<ecore.ETypeParameter> convertAsOrderedSet(
													this
															.getEcoreModelElement()
															.getETypeParameters())
											.iterator();
									java.lang.Boolean idLoopCond_158 = false;
									while (!idLoopCond_158) {
										idLoopCond_158 = it_ft61.isOff();
										if (idLoopCond_158) {
										} else {

											//BIle:func
											ecore.ETypeParameter etp_lbdExp61 = it_ft61
													.next();

											ecore.ETypeParameter newEtp = ((ecore.ETypeParameter) org.kermeta.compil.runtime.helper.language.ClassUtil
													.newObject(ecore.EcorePackage.eINSTANCE
															.getETypeParameter()));

											newEtp.setName(etp_lbdExp61
													.getName());

											org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
													.<ecore.ETypeParameter> convertAsOrderedSet(
															newProperty_EDataType
																	.getETypeParameters())
													.add(newEtp);

											ecore.EGenericType eta = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
													.newObject(ecore.EcorePackage.eINSTANCE
															.getEGenericType()));

											eta.setETypeParameter(etp_lbdExp61);

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

							java.lang.Boolean idIfCond_159 = false;
							idIfCond_159 = kermeta.standard.helper.BooleanWrapper
									.and(
											kermeta.standard.helper.BooleanWrapper
													.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isVoidSwitcher(kermeta.standard.helper.StringWrapper
																	.getPropertyInfos(
																			emfNeedProperty_lbdExp60)
																	.getValue(
																			"classDefinitionQN"))),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															kermeta.standard.helper.StringWrapper
																	.getPropertyInfos(
																			emfNeedProperty_lbdExp60)
																	.getValue(
																			"classDefinitionQN"),
															""));

							if (idIfCond_159) {

								newProperty = ((ecore.EReference) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject(ecore.EcorePackage.eINSTANCE
												.getEReference()));

								newProperty
										.setName(kermeta.standard.helper.StringWrapper
												.getPropertyInfos(
														emfNeedProperty_lbdExp60)
												.getValue("name"));

								newProperty.set_transient(false);

								ecore.EClassifier retrieved_EClassifier = context
										.getMu()
										.getEClassifierByQualifiedName(
												kermeta.standard.helper.StringWrapper
														.getPropertyInfos(
																emfNeedProperty_lbdExp60)
														.getValue(
																"classDefinitionQN"));

								ecore.EGenericType newJavaCollection_EGenericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject(ecore.EcorePackage.eINSTANCE
												.getEGenericType()));

								newJavaCollection_EGenericType
										.setEClassifier(retrieved_EClassifier);

								newProperty
										.setEGenericType(newJavaCollection_EGenericType);

								java.lang.Boolean idIfCond_160 = false;
								idIfCond_160 = kermeta.standard.helper.BooleanWrapper
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

								if (idIfCond_160) {

									//BIft:each

									{

										kermeta.standard.Iterator<ecore.ETypeParameter> it_ft62 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<ecore.ETypeParameter> convertAsOrderedSet(
														this
																.getEcoreModelElement()
																.getETypeParameters())
												.iterator();
										java.lang.Boolean idLoopCond_161 = false;
										while (!idLoopCond_161) {
											idLoopCond_161 = it_ft62.isOff();
											if (idLoopCond_161) {
											} else {

												//BIle:func
												ecore.ETypeParameter etp_lbdExp62 = it_ft62
														.next();

												ecore.EGenericType eta = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
														.newObject(ecore.EcorePackage.eINSTANCE
																.getEGenericType()));

												eta
														.setETypeParameter(etp_lbdExp62);

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

								java.lang.Boolean idIfCond_162 = false;
								idIfCond_162 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												retrievedTypeDef,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_162) {

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

									java.lang.Boolean idIfCond_163 = false;
									idIfCond_163 = org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isInstanceOfSwitcher(
													retrievedTypeDef,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.PrimitiveType"));

									if (idIfCond_163) {

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

		java.lang.Boolean idIfCond_164 = false;
		idIfCond_164 = this.isValueType();

		if (idIfCond_164) {

			java.lang.String instanceClassName = this.getEMFInstanceClassName();

			java.lang.Boolean idIfCond_165 = false;
			idIfCond_165 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(instanceClassName, "");

			if (idIfCond_165) {

				ecore.EDataType eDataType = ((ecore.EDataType) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject(ecore.EcorePackage.eINSTANCE.getEDataType()));

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

				java.lang.Boolean idIfCond_166 = false;
				idIfCond_166 = kermeta.standard.helper.BooleanWrapper.not(this
						.getIsAbstract());

				if (idIfCond_166) {

					ecore.EClass eClass = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject(ecore.EcorePackage.eINSTANCE.getEClass()));

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

				java.lang.Boolean idIfCond_167 = false;
				idIfCond_167 = kermeta.standard.helper.BooleanWrapper.not(this
						.getIsAbstract());

				if (idIfCond_167) {

					km2ecore.common.exception.UndefinedValueTypeInstanceClassNameException except = ((km2ecore.common.exception.UndefinedValueTypeInstanceClassNameException) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject(km2ecore.common.exception.ExceptionPackage.eINSTANCE
									.getUndefinedValueTypeInstanceClassNameException()));

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

			kermeta.language.structure.ClassDefinition cd_ft63 = this;

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft64 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Tag> convertAsOrderedSet(
								cd_ft63.getOwnedTags()).iterator();
				java.lang.Boolean idLoopCond_168 = false;
				while (!idLoopCond_168) {
					idLoopCond_168 = it_ft64.isOff();
					if (idLoopCond_168) {
					} else {

						//BIle:func
						kermeta.language.structure.Tag o_lbdExp64 = it_ft64
								.next();

						//BIle:func
						kermeta.language.structure.Tag o_lbdExp63 = o_lbdExp64;

						java.lang.Boolean idIfCond_169 = false;
						idIfCond_169 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												o_lbdExp63,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")));

						if (idIfCond_169) {

							o_lbdExp63.applyPass1(context);
						} else {

							kermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											o_lbdExp63,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation")));

							java.lang.Boolean idIfCond_170 = false;
							idIfCond_170 = kermeta.standard.helper.BooleanWrapper
									.not(op.isFunctionType());

							if (idIfCond_170) {

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

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft65 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsOrderedSet(
								cd_ft63.getOwnedAttribute()).iterator();
				java.lang.Boolean idLoopCond_171 = false;
				while (!idLoopCond_171) {
					idLoopCond_171 = it_ft65.isOff();
					if (idLoopCond_171) {
					} else {

						//BIle:func
						kermeta.language.structure.Property o_lbdExp65 = it_ft65
								.next();

						//BIle:func
						kermeta.language.structure.Property o_lbdExp63 = o_lbdExp65;

						java.lang.Boolean idIfCond_172 = false;
						idIfCond_172 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												o_lbdExp63,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")));

						if (idIfCond_172) {

							o_lbdExp63.applyPass1(context);
						} else {

							kermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											o_lbdExp63,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation")));

							java.lang.Boolean idIfCond_173 = false;
							idIfCond_173 = kermeta.standard.helper.BooleanWrapper
									.not(op.isFunctionType());

							if (idIfCond_173) {

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

				kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft66 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Operation> convertAsOrderedSet(
								cd_ft63.getOwnedOperation()).iterator();
				java.lang.Boolean idLoopCond_174 = false;
				while (!idLoopCond_174) {
					idLoopCond_174 = it_ft66.isOff();
					if (idLoopCond_174) {
					} else {

						//BIle:func
						kermeta.language.structure.Operation o_lbdExp66 = it_ft66
								.next();

						//BIle:func
						kermeta.language.structure.Operation o_lbdExp63 = o_lbdExp66;

						java.lang.Boolean idIfCond_175 = false;
						idIfCond_175 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												o_lbdExp63,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")));

						if (idIfCond_175) {

							o_lbdExp63.applyPass1(context);
						} else {

							kermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											o_lbdExp63,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation")));

							java.lang.Boolean idIfCond_176 = false;
							idIfCond_176 = kermeta.standard.helper.BooleanWrapper
									.not(op.isFunctionType());

							if (idIfCond_176) {

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

				kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft67 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Constraint> convertAsOrderedSet(
								cd_ft63.getInv()).iterator();
				java.lang.Boolean idLoopCond_177 = false;
				while (!idLoopCond_177) {
					idLoopCond_177 = it_ft67.isOff();
					if (idLoopCond_177) {
					} else {

						//BIle:func
						kermeta.language.structure.Constraint i_lbdExp67 = it_ft67
								.next();

						//BIle:func
						kermeta.language.structure.Constraint o_lbdExp63 = i_lbdExp67;

						java.lang.Boolean idIfCond_178 = false;
						idIfCond_178 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												o_lbdExp63,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")));

						if (idIfCond_178) {

							o_lbdExp63.applyPass1(context);
						} else {

							kermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											o_lbdExp63,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation")));

							java.lang.Boolean idIfCond_179 = false;
							idIfCond_179 = kermeta.standard.helper.BooleanWrapper
									.not(op.isFunctionType());

							if (idIfCond_179) {

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

				kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft68 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
								cd_ft63.getTypeParameter()).iterator();
				java.lang.Boolean idLoopCond_180 = false;
				while (!idLoopCond_180) {
					idLoopCond_180 = it_ft68.isOff();
					if (idLoopCond_180) {
					} else {

						//BIle:func
						kermeta.language.structure.TypeVariable t_lbdExp68 = it_ft68
								.next();

						//BIle:func
						kermeta.language.structure.TypeVariable o_lbdExp63 = t_lbdExp68;

						java.lang.Boolean idIfCond_181 = false;
						idIfCond_181 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												o_lbdExp63,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")));

						if (idIfCond_181) {

							o_lbdExp63.applyPass1(context);
						} else {

							kermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											o_lbdExp63,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation")));

							java.lang.Boolean idIfCond_182 = false;
							idIfCond_182 = kermeta.standard.helper.BooleanWrapper
									.not(op.isFunctionType());

							if (idIfCond_182) {

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
	public void setLinks(KM2EcoreContext context) {

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft69 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Type> convertAsOrderedSet(
							this.getSuperType()).iterator();
			java.lang.Boolean idLoopCond_183 = false;
			while (!idLoopCond_183) {
				idLoopCond_183 = it_ft69.isOff();
				if (idLoopCond_183) {
				} else {

					//BIle:func
					kermeta.language.structure.Type t_lbdExp69 = it_ft69.next();

					java.lang.Boolean idIfCond_184 = false;
					idIfCond_184 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									t_lbdExp69,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Class"));

					if (idIfCond_184) {

						kermeta.language.structure.ClassDefinition classDefinition = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeSwitcher(
										t_lbdExp69,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Class")))
								.getClassDefinitionAsTyped();

						java.lang.Boolean idIfCond_185 = false;
						idIfCond_185 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(this
												.getEcoreModelElement()));

						if (idIfCond_185) {

							java.lang.Boolean idIfCond_186 = false;
							idIfCond_186 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(classDefinition
													.getEcoreModelElement()));

							if (idIfCond_186) {

								ecore.EGenericType new_eGenericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject(ecore.EcorePackage.eINSTANCE
												.getEGenericType()));

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
												t_lbdExp69,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Class")))
										.setEcoreModelElement(new_eGenericType);

								((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												t_lbdExp69,
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
	public void setSubClassDefinitionToSuperTypes() {

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft70 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Type> convertAsOrderedSet(
							this.getSuperType()).iterator();
			java.lang.Boolean idLoopCond_187 = false;
			while (!idLoopCond_187) {
				idLoopCond_187 = it_ft70.isOff();
				if (idLoopCond_187) {
				} else {

					//BIle:func
					kermeta.language.structure.Type t_lbdExp70 = it_ft70.next();

					java.lang.Boolean idIfCond_188 = false;
					idIfCond_188 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									t_lbdExp70,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.ParameterizedType"));

					if (idIfCond_188) {

						java.lang.Boolean idIfCond_189 = false;
						idIfCond_189 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														t_lbdExp70,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.structure.ParameterizedType")))
												.getTypeDefinition(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.ClassDefinition"));

						if (idIfCond_189) {

							org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.ClassDefinition> convertAsOrderedSet(
											((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asTypeSwitcher(
															((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			t_lbdExp70,
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

		java.lang.Boolean idIfCond_190 = false;
		idIfCond_190 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_190) {

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
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));

		kermeta.standard.Set<kermeta.language.structure.Type> superClasses = ((kermeta.standard.Set<kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));

		superClasses
				.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Type> convertAsOrderedSet(this
								.getSuperType()));

		kermeta.standard.helper.BooleanWrapper.not(superClasses.isEmpty());
		java.lang.Boolean idLoopCond_191 = false;
		while (!idLoopCond_191) {
			idLoopCond_191 = superClasses.isEmpty();
			if (idLoopCond_191) {
			} else {

				allSuperClasses.addAll(superClasses);

				kermeta.standard.Set<kermeta.language.structure.Type> temp = ((kermeta.standard.Set<kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject(kermeta.standard.StandardPackage.eINSTANCE
								.getSet()));

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft71 = superClasses
							.iterator();
					java.lang.Boolean idLoopCond_192 = false;
					while (!idLoopCond_192) {
						idLoopCond_192 = it_ft71.isOff();
						if (idLoopCond_192) {
						} else {

							//BIle:func
							kermeta.language.structure.Type s_lbdExp71 = it_ft71
									.next();

							java.lang.Boolean idIfCond_193 = false;
							idIfCond_193 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isInstanceOfSwitcher(
											s_lbdExp71,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.ParameterizedType"));

							if (idIfCond_193) {

								java.lang.Boolean idIfCond_194 = false;
								idIfCond_194 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
														.asTypeSwitcher(
																s_lbdExp71,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.ParameterizedType")))
														.getTypeDefinition(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_194) {

									temp
											.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
													.<kermeta.language.structure.Type> convertAsOrderedSet(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
															.asTypeSwitcher(
																	((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																			.asTypeSwitcher(
																					s_lbdExp71,
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
	public Boolean isSubTypeOf(String superType_qualifiedName) {

		java.lang.Boolean result = null;

		result = false;

		kermeta.language.structure.Type res = null;
		//BIft:detect

		kermeta.language.structure.Type result_ft72 = null;

		kermeta.language.structure.Type elem_ft72 = null;

		result_ft72 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft72 = this
					.allSuperTypes().iterator();
			java.lang.Boolean idLoopCond_195 = false;
			while (!idLoopCond_195) {
				idLoopCond_195 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft72.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft72, null));
				if (idLoopCond_195) {
				} else {

					elem_ft72 = it_ft72.next();

					java.lang.Boolean idIfCond_196 = false;
					//BIle:detector
					kermeta.language.structure.Type st_lbdExp72 = elem_ft72;

					idIfCond_196 = kermeta.standard.helper.BooleanWrapper
							.and(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isInstanceOfSwitcher(
													st_lbdExp72,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ParameterizedType")),
									kermeta.standard.helper.StringWrapper
											.equals(
													((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
															.asTypeSwitcher(
																	st_lbdExp72,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.ParameterizedType")))
															.getTypeDefinition()
															.qualifiedName(),
													superType_qualifiedName));
					//EIle:detector

					if (idIfCond_196) {

						result_ft72 = elem_ft72;
					}

				}
			}
		}

		//CE
		res = result_ft72;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_197 = false;
		idIfCond_197 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(res));

		if (idIfCond_197) {

			result = true;
		}

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

		java.lang.Boolean idIfCond_198 = false;
		idIfCond_198 = kermeta.standard.helper.StringWrapper.equals(this
				.qualifiedName(), "kermeta::standard::Iterator");

		if (idIfCond_198) {

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

		java.lang.Boolean idIfCond_199 = false;
		idIfCond_199 = kermeta.standard.helper.StringWrapper.equals(this
				.qualifiedName(), "kermeta::standard::Collection");

		if (idIfCond_199) {

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
				.newObject(ecore.EcorePackage.eINSTANCE.getEClass()));

		ecoreClass.set_interface(false);

		ecoreClass
				.setName(((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject(km2ecore.helper.java.JavaPackage.eINSTANCE
								.getIdentifierHelper())).getMangledIdentifier(
						this.getName(), context));

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

		java.lang.Boolean idIfCond_200 = false;
		idIfCond_200 = kermeta.standard.helper.BooleanWrapper.not(this
				.isAddedValueType());

		if (idIfCond_200) {

			this.setLinks(context);
		} else {

			kermeta.language.structure.ClassDefinition cd_valueType = null;

			cd_valueType = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeOrVoid(context.getMu()
							.getTypeDefinitionByQualifiedName(
									"kermeta::standard::ValueType"),
							"kermeta.language.structure.ClassDefinition");

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EClass> convertAsOrderedSet(
							this.getEcoreModelElement().getESuperTypes()).add(
							cd_valueType.getEcoreModelElement());
		}

		java.lang.Boolean idIfCond_201 = false;
		idIfCond_201 = kermeta.standard.helper.BooleanWrapper.and(this
				.isValueType(),
				org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isNotEqualSwitcher(this.getName(), "Numeric"));

		if (idIfCond_201) {

			context.setCurrent_valueType(this);

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft73 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Operation> convertAsOrderedSet(
								this.getOwnedOperation()).iterator();
				java.lang.Boolean idLoopCond_202 = false;
				while (!idLoopCond_202) {
					idLoopCond_202 = it_ft73.isOff();
					if (idLoopCond_202) {
					} else {

						//BIle:func
						kermeta.language.structure.Operation op_lbdExp73 = it_ft73
								.next();

						op_lbdExp73.applyPass2BehaviorJava(context);
						//EIle:func

					}
				}
			}

			//EIft:each

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft74 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Type> convertAsOrderedSet(
								this.getSuperType()).iterator();
				java.lang.Boolean idLoopCond_203 = false;
				while (!idLoopCond_203) {
					idLoopCond_203 = it_ft74.isOff();
					if (idLoopCond_203) {
					} else {

						//BIle:func
						kermeta.language.structure.Type t_lbdExp74 = it_ft74
								.next();

						java.lang.Boolean idIfCond_204 = false;
						idIfCond_204 = org.kermeta.compil.runtime.helper.language.TypeUtil
								.isInstanceSwitcher(
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Class"),
										t_lbdExp74);

						if (idIfCond_204) {

							kermeta.language.structure.Class c = null;

							c = (kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeOrVoid(t_lbdExp74,
											"kermeta.language.structure.Class");

							kermeta.language.structure.ClassDefinition cDef = null;

							cDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeOrVoid(c.getTypeDefinition(),
											"kermeta.language.structure.ClassDefinition");

							//BIft:each

							{

								kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft75 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
										.<kermeta.language.structure.Operation> convertAsSet(
												cDef.getterAllOperation())
										.iterator();
								java.lang.Boolean idLoopCond_205 = false;
								while (!idLoopCond_205) {
									idLoopCond_205 = it_ft75.isOff();
									if (idLoopCond_205) {
									} else {

										//BIle:func
										kermeta.language.structure.Operation p_lbdExp75 = it_ft75
												.next();

										java.lang.Boolean idIfCond_206 = false;
										idIfCond_206 = kermeta.standard.helper.StringWrapper
												.equals(
														p_lbdExp75
																.getRecopyInValueTypes(),
														"true");

										if (idIfCond_206) {

											p_lbdExp75
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

			java.lang.Boolean idIfCond_207 = false;
			idIfCond_207 = kermeta.standard.helper.BooleanWrapper.not(this
					.isAddedValueType());

			if (idIfCond_207) {

				//BIft:eachOwnedElement

				kermeta.language.structure.ClassDefinition cd_ft76 = this;

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft77 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Tag> convertAsOrderedSet(
									cd_ft76.getOwnedTags()).iterator();
					java.lang.Boolean idLoopCond_208 = false;
					while (!idLoopCond_208) {
						idLoopCond_208 = it_ft77.isOff();
						if (idLoopCond_208) {
						} else {

							//BIle:func
							kermeta.language.structure.Tag o_lbdExp77 = it_ft77
									.next();

							//BIle:func
							kermeta.language.structure.Tag p_lbdExp76 = o_lbdExp77;

							p_lbdExp76.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft78 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Property> convertAsOrderedSet(
									cd_ft76.getOwnedAttribute()).iterator();
					java.lang.Boolean idLoopCond_209 = false;
					while (!idLoopCond_209) {
						idLoopCond_209 = it_ft78.isOff();
						if (idLoopCond_209) {
						} else {

							//BIle:func
							kermeta.language.structure.Property o_lbdExp78 = it_ft78
									.next();

							//BIle:func
							kermeta.language.structure.Property p_lbdExp76 = o_lbdExp78;

							p_lbdExp76.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft79 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Operation> convertAsOrderedSet(
									cd_ft76.getOwnedOperation()).iterator();
					java.lang.Boolean idLoopCond_210 = false;
					while (!idLoopCond_210) {
						idLoopCond_210 = it_ft79.isOff();
						if (idLoopCond_210) {
						} else {

							//BIle:func
							kermeta.language.structure.Operation o_lbdExp79 = it_ft79
									.next();

							//BIle:func
							kermeta.language.structure.Operation p_lbdExp76 = o_lbdExp79;

							p_lbdExp76.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft80 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Constraint> convertAsOrderedSet(
									cd_ft76.getInv()).iterator();
					java.lang.Boolean idLoopCond_211 = false;
					while (!idLoopCond_211) {
						idLoopCond_211 = it_ft80.isOff();
						if (idLoopCond_211) {
						} else {

							//BIle:func
							kermeta.language.structure.Constraint i_lbdExp80 = it_ft80
									.next();

							//BIle:func
							kermeta.language.structure.Constraint p_lbdExp76 = i_lbdExp80;

							p_lbdExp76.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft81 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
									cd_ft76.getTypeParameter()).iterator();
					java.lang.Boolean idLoopCond_212 = false;
					while (!idLoopCond_212) {
						idLoopCond_212 = it_ft81.isOff();
						if (idLoopCond_212) {
						} else {

							//BIle:func
							kermeta.language.structure.TypeVariable t_lbdExp81 = it_ft81
									.next();

							//BIle:func
							kermeta.language.structure.TypeVariable p_lbdExp76 = t_lbdExp81;

							p_lbdExp76.applyPass2BehaviorJava(context);
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
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));

		result
				.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Operation> convertAsOrderedSet(this
								.getOwnedOperation()));

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft56 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Type> convertAsOrderedSet(
							this.getSuperType()).iterator();
			java.lang.Boolean idLoopCond_147 = false;
			while (!idLoopCond_147) {
				idLoopCond_147 = it_ft56.isOff();
				if (idLoopCond_147) {
				} else {

					//BIle:func
					kermeta.language.structure.Type t_lbdExp56 = it_ft56.next();

					java.lang.Boolean idIfCond_148 = false;
					idIfCond_148 = org.kermeta.compil.runtime.helper.language.TypeUtil
							.isInstanceSwitcher(
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Class"),
									t_lbdExp56);

					if (idIfCond_148) {

						kermeta.language.structure.Class c = null;

						c = (kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeOrVoid(t_lbdExp56,
										"kermeta.language.structure.Class");

						kermeta.language.structure.ClassDefinition cDef = null;

						cDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeOrVoid(c.getTypeDefinition(),
										"kermeta.language.structure.ClassDefinition");

						//BIft:each

						{

							kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft57 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Operation> convertAsSet(
											cDef.getterAllOperation())
									.iterator();
							java.lang.Boolean idLoopCond_149 = false;
							while (!idLoopCond_149) {
								idLoopCond_149 = it_ft57.isOff();
								if (idLoopCond_149) {
								} else {

									//BIle:func
									kermeta.language.structure.Operation p_lbdExp57 = it_ft57
											.next();

									result.add(p_lbdExp57);
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
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));

		result
				.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsOrderedSet(this
								.getOwnedAttribute()));

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft58 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Type> convertAsOrderedSet(
							this.getSuperType()).iterator();
			java.lang.Boolean idLoopCond_150 = false;
			while (!idLoopCond_150) {
				idLoopCond_150 = it_ft58.isOff();
				if (idLoopCond_150) {
				} else {

					//BIle:func
					kermeta.language.structure.Type t_lbdExp58 = it_ft58.next();

					java.lang.Boolean idIfCond_151 = false;
					idIfCond_151 = org.kermeta.compil.runtime.helper.language.TypeUtil
							.isInstanceSwitcher(
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Class"),
									t_lbdExp58);

					if (idIfCond_151) {

						kermeta.language.structure.Class c = null;

						c = (kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeOrVoid(t_lbdExp58,
										"kermeta.language.structure.Class");

						kermeta.language.structure.ClassDefinition cDef = null;

						cDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeOrVoid(c.getTypeDefinition(),
										"kermeta.language.structure.ClassDefinition");

						//BIft:each

						{

							kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft59 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Property> convertAsSet(
											cDef.getterAllAttribute())
									.iterator();
							java.lang.Boolean idLoopCond_152 = false;
							while (!idLoopCond_152) {
								idLoopCond_152 = it_ft59.isOff();
								if (idLoopCond_152) {
								} else {

									//BIle:func
									kermeta.language.structure.Property p_lbdExp59 = it_ft59
											.next();

									result.add(p_lbdExp59);
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
		case StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE:
			return getContainedType();
		case StructurePackage.CLASS_DEFINITION__ECORE_MODEL_ELEMENT:
			if (resolve)
				return getEcoreModelElement();
			return basicGetEcoreModelElement();
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
		case StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE:
			return getOwnedAttribute();
		case StructurePackage.CLASS_DEFINITION__ECORE_DATA_TYPE:
			if (resolve)
				return getEcoreDataType();
			return basicGetEcoreDataType();
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
		case StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE:
			getContainedType().clear();
			getContainedType().addAll((Collection<? extends Type>) newValue);
			return;
		case StructurePackage.CLASS_DEFINITION__ECORE_MODEL_ELEMENT:
			setEcoreModelElement((EClass) newValue);
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
		case StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE:
			getOwnedAttribute().clear();
			getOwnedAttribute().addAll(
					(Collection<? extends Property>) newValue);
			return;
		case StructurePackage.CLASS_DEFINITION__ECORE_DATA_TYPE:
			setEcoreDataType((EDataType) newValue);
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
		case StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE:
			getContainedType().clear();
			return;
		case StructurePackage.CLASS_DEFINITION__ECORE_MODEL_ELEMENT:
			setEcoreModelElement((EClass) null);
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
		case StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE:
			getOwnedAttribute().clear();
			return;
		case StructurePackage.CLASS_DEFINITION__ECORE_DATA_TYPE:
			setEcoreDataType((EDataType) null);
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
		case StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE:
			return containedType != null && !containedType.isEmpty();
		case StructurePackage.CLASS_DEFINITION__ECORE_MODEL_ELEMENT:
			return ecoreModelElement != null;
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
		case StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE:
			return ownedAttribute != null && !ownedAttribute.isEmpty();
		case StructurePackage.CLASS_DEFINITION__ECORE_DATA_TYPE:
			return ecoreDataType != null;
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
			case StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE:
				return StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE;
			default:
				return -1;
			}
		}
		if (baseClass == Traceability.class) {
			switch (derivedFeatureID) {
			case StructurePackage.CLASS_DEFINITION__ECORE_MODEL_ELEMENT:
				return StructurePackage.TRACEABILITY__ECORE_MODEL_ELEMENT;
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
				return StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE;
			default:
				return -1;
			}
		}
		if (baseClass == Traceability.class) {
			switch (baseFeatureID) {
			case StructurePackage.TRACEABILITY__ECORE_MODEL_ELEMENT:
				return StructurePackage.CLASS_DEFINITION__ECORE_MODEL_ELEMENT;
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
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //ClassDefinitionImpl
