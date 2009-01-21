/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClassDefinitionImpl.java,v 1.11 2009-01-21 09:15:51 cfaucher Exp $
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

		java.lang.Boolean idIfCond_110 = false;
		idIfCond_110 = kermeta.standard.helper.BooleanWrapper.or(this
				.isCollection(), this.isIterator());

		if (idIfCond_110) {

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

			kermeta.standard.Iterator<java.lang.String> it_ft54 = this
					.getEMFNeedProperty().iterator();
			java.lang.Boolean idLoopCond_111 = false;
			while (!idLoopCond_111) {
				idLoopCond_111 = it_ft54.isOff();
				if (idLoopCond_111) {
				} else {

					//BIle:func
					java.lang.String emfNeedProperty_lbdExp54 = it_ft54.next();

					java.lang.Boolean idIfCond_112 = false;
					idIfCond_112 = kermeta.standard.helper.IntegerWrapper
							.isGreater(kermeta.standard.helper.StringWrapper
									.getPropertyInfos(emfNeedProperty_lbdExp54)
									.size(), 0);

					if (idIfCond_112) {

						ecore.EStructuralFeature newProperty = ((ecore.EAttribute) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(ecore.EcorePackage.eINSTANCE
										.getEAttribute()));

						java.lang.Boolean idIfCond_113 = false;
						idIfCond_113 = kermeta.standard.helper.BooleanWrapper
								.and(
										kermeta.standard.helper.BooleanWrapper
												.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isVoidSwitcher(kermeta.standard.helper.StringWrapper
																.getPropertyInfos(
																		emfNeedProperty_lbdExp54)
																.getValue(
																		"javaClass"))),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqualSwitcher(
														kermeta.standard.helper.StringWrapper
																.getPropertyInfos(
																		emfNeedProperty_lbdExp54)
																.getValue(
																		"javaClass"),
														""));

						if (idIfCond_113) {

							newProperty = ((ecore.EAttribute) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject(ecore.EcorePackage.eINSTANCE
											.getEAttribute()));

							newProperty
									.setName(kermeta.standard.helper.StringWrapper
											.getPropertyInfos(
													emfNeedProperty_lbdExp54)
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
																	emfNeedProperty_lbdExp54)
															.getValue("name")));

							newProperty_EDataType
									.setInstanceClassName(kermeta.standard.helper.StringWrapper
											.getPropertyInfos(
													emfNeedProperty_lbdExp54)
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

							java.lang.Boolean idIfCond_114 = false;
							idIfCond_114 = kermeta.standard.helper.BooleanWrapper
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

							if (idIfCond_114) {

								//BIft:each

								{

									kermeta.standard.Iterator<ecore.ETypeParameter> it_ft55 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
											.<ecore.ETypeParameter> convertAsOrderedSet(
													this
															.getEcoreModelElement()
															.getETypeParameters())
											.iterator();
									java.lang.Boolean idLoopCond_115 = false;
									while (!idLoopCond_115) {
										idLoopCond_115 = it_ft55.isOff();
										if (idLoopCond_115) {
										} else {

											//BIle:func
											ecore.ETypeParameter etp_lbdExp55 = it_ft55
													.next();

											ecore.ETypeParameter newEtp = ((ecore.ETypeParameter) org.kermeta.compil.runtime.helper.language.ClassUtil
													.newObject(ecore.EcorePackage.eINSTANCE
															.getETypeParameter()));

											newEtp.setName(etp_lbdExp55
													.getName());

											org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
													.<ecore.ETypeParameter> convertAsOrderedSet(
															newProperty_EDataType
																	.getETypeParameters())
													.add(newEtp);

											ecore.EGenericType eta = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
													.newObject(ecore.EcorePackage.eINSTANCE
															.getEGenericType()));

											eta.setETypeParameter(etp_lbdExp55);

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

							java.lang.Boolean idIfCond_116 = false;
							idIfCond_116 = kermeta.standard.helper.BooleanWrapper
									.and(
											kermeta.standard.helper.BooleanWrapper
													.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isVoidSwitcher(kermeta.standard.helper.StringWrapper
																	.getPropertyInfos(
																			emfNeedProperty_lbdExp54)
																	.getValue(
																			"classDefinitionQN"))),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															kermeta.standard.helper.StringWrapper
																	.getPropertyInfos(
																			emfNeedProperty_lbdExp54)
																	.getValue(
																			"classDefinitionQN"),
															""));

							if (idIfCond_116) {

								newProperty = ((ecore.EReference) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject(ecore.EcorePackage.eINSTANCE
												.getEReference()));

								newProperty
										.setName(kermeta.standard.helper.StringWrapper
												.getPropertyInfos(
														emfNeedProperty_lbdExp54)
												.getValue("name"));

								newProperty.set_transient(false);

								ecore.EClassifier retrieved_EClassifier = context
										.getMu()
										.getEClassifierByQualifiedName(
												kermeta.standard.helper.StringWrapper
														.getPropertyInfos(
																emfNeedProperty_lbdExp54)
														.getValue(
																"classDefinitionQN"));

								ecore.EGenericType newJavaCollection_EGenericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject(ecore.EcorePackage.eINSTANCE
												.getEGenericType()));

								newJavaCollection_EGenericType
										.setEClassifier(retrieved_EClassifier);

								newProperty
										.setEGenericType(newJavaCollection_EGenericType);

								java.lang.Boolean idIfCond_117 = false;
								idIfCond_117 = kermeta.standard.helper.BooleanWrapper
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

								if (idIfCond_117) {

									//BIft:each

									{

										kermeta.standard.Iterator<ecore.ETypeParameter> it_ft56 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<ecore.ETypeParameter> convertAsOrderedSet(
														this
																.getEcoreModelElement()
																.getETypeParameters())
												.iterator();
										java.lang.Boolean idLoopCond_118 = false;
										while (!idLoopCond_118) {
											idLoopCond_118 = it_ft56.isOff();
											if (idLoopCond_118) {
											} else {

												//BIle:func
												ecore.ETypeParameter etp_lbdExp56 = it_ft56
														.next();

												ecore.EGenericType eta = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
														.newObject(ecore.EcorePackage.eINSTANCE
																.getEGenericType()));

												eta
														.setETypeParameter(etp_lbdExp56);

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

								java.lang.Boolean idIfCond_119 = false;
								idIfCond_119 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												retrievedTypeDef,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_119) {

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

									java.lang.Boolean idIfCond_120 = false;
									idIfCond_120 = org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isInstanceOfSwitcher(
													retrievedTypeDef,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.PrimitiveType"));

									if (idIfCond_120) {

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

		java.lang.Boolean idIfCond_121 = false;
		idIfCond_121 = this.isValueType();

		if (idIfCond_121) {

			java.lang.String instanceClassName = this.getEMFInstanceClassName();

			java.lang.Boolean idIfCond_122 = false;
			idIfCond_122 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(instanceClassName, "");

			if (idIfCond_122) {

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

				java.lang.Boolean idIfCond_123 = false;
				idIfCond_123 = kermeta.standard.helper.BooleanWrapper.not(this
						.getIsAbstract());

				if (idIfCond_123) {

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

				java.lang.Boolean idIfCond_124 = false;
				idIfCond_124 = kermeta.standard.helper.BooleanWrapper.not(this
						.getIsAbstract());

				if (idIfCond_124) {

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

			kermeta.language.structure.ClassDefinition cd_ft57 = this;

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft58 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Tag> convertAsOrderedSet(
								cd_ft57.getOwnedTags()).iterator();
				java.lang.Boolean idLoopCond_125 = false;
				while (!idLoopCond_125) {
					idLoopCond_125 = it_ft58.isOff();
					if (idLoopCond_125) {
					} else {

						//BIle:func
						kermeta.language.structure.Tag o_lbdExp58 = it_ft58
								.next();

						//BIle:func
						kermeta.language.structure.Tag o_lbdExp57 = o_lbdExp58;

						java.lang.Boolean idIfCond_126 = false;
						idIfCond_126 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												o_lbdExp57,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")));

						if (idIfCond_126) {

							o_lbdExp57.applyPass1(context);
						} else {

							kermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											o_lbdExp57,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation")));

							java.lang.Boolean idIfCond_127 = false;
							idIfCond_127 = kermeta.standard.helper.BooleanWrapper
									.not(op.isFunctionType());

							if (idIfCond_127) {

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

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft59 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsOrderedSet(
								cd_ft57.getOwnedAttribute()).iterator();
				java.lang.Boolean idLoopCond_128 = false;
				while (!idLoopCond_128) {
					idLoopCond_128 = it_ft59.isOff();
					if (idLoopCond_128) {
					} else {

						//BIle:func
						kermeta.language.structure.Property o_lbdExp59 = it_ft59
								.next();

						//BIle:func
						kermeta.language.structure.Property o_lbdExp57 = o_lbdExp59;

						java.lang.Boolean idIfCond_129 = false;
						idIfCond_129 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												o_lbdExp57,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")));

						if (idIfCond_129) {

							o_lbdExp57.applyPass1(context);
						} else {

							kermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											o_lbdExp57,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation")));

							java.lang.Boolean idIfCond_130 = false;
							idIfCond_130 = kermeta.standard.helper.BooleanWrapper
									.not(op.isFunctionType());

							if (idIfCond_130) {

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

				kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft60 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Operation> convertAsOrderedSet(
								cd_ft57.getOwnedOperation()).iterator();
				java.lang.Boolean idLoopCond_131 = false;
				while (!idLoopCond_131) {
					idLoopCond_131 = it_ft60.isOff();
					if (idLoopCond_131) {
					} else {

						//BIle:func
						kermeta.language.structure.Operation o_lbdExp60 = it_ft60
								.next();

						//BIle:func
						kermeta.language.structure.Operation o_lbdExp57 = o_lbdExp60;

						java.lang.Boolean idIfCond_132 = false;
						idIfCond_132 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												o_lbdExp57,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")));

						if (idIfCond_132) {

							o_lbdExp57.applyPass1(context);
						} else {

							kermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											o_lbdExp57,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation")));

							java.lang.Boolean idIfCond_133 = false;
							idIfCond_133 = kermeta.standard.helper.BooleanWrapper
									.not(op.isFunctionType());

							if (idIfCond_133) {

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

				kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft61 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Constraint> convertAsOrderedSet(
								cd_ft57.getInv()).iterator();
				java.lang.Boolean idLoopCond_134 = false;
				while (!idLoopCond_134) {
					idLoopCond_134 = it_ft61.isOff();
					if (idLoopCond_134) {
					} else {

						//BIle:func
						kermeta.language.structure.Constraint i_lbdExp61 = it_ft61
								.next();

						//BIle:func
						kermeta.language.structure.Constraint o_lbdExp57 = i_lbdExp61;

						java.lang.Boolean idIfCond_135 = false;
						idIfCond_135 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												o_lbdExp57,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")));

						if (idIfCond_135) {

							o_lbdExp57.applyPass1(context);
						} else {

							kermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											o_lbdExp57,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation")));

							java.lang.Boolean idIfCond_136 = false;
							idIfCond_136 = kermeta.standard.helper.BooleanWrapper
									.not(op.isFunctionType());

							if (idIfCond_136) {

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

				kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft62 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
								cd_ft57.getTypeParameter()).iterator();
				java.lang.Boolean idLoopCond_137 = false;
				while (!idLoopCond_137) {
					idLoopCond_137 = it_ft62.isOff();
					if (idLoopCond_137) {
					} else {

						//BIle:func
						kermeta.language.structure.TypeVariable t_lbdExp62 = it_ft62
								.next();

						//BIle:func
						kermeta.language.structure.TypeVariable o_lbdExp57 = t_lbdExp62;

						java.lang.Boolean idIfCond_138 = false;
						idIfCond_138 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												o_lbdExp57,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")));

						if (idIfCond_138) {

							o_lbdExp57.applyPass1(context);
						} else {

							kermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											o_lbdExp57,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation")));

							java.lang.Boolean idIfCond_139 = false;
							idIfCond_139 = kermeta.standard.helper.BooleanWrapper
									.not(op.isFunctionType());

							if (idIfCond_139) {

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

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft63 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Type> convertAsOrderedSet(
							this.getSuperType()).iterator();
			java.lang.Boolean idLoopCond_140 = false;
			while (!idLoopCond_140) {
				idLoopCond_140 = it_ft63.isOff();
				if (idLoopCond_140) {
				} else {

					//BIle:func
					kermeta.language.structure.Type t_lbdExp63 = it_ft63.next();

					java.lang.Boolean idIfCond_141 = false;
					idIfCond_141 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									t_lbdExp63,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Class"));

					if (idIfCond_141) {

						kermeta.language.structure.ClassDefinition classDefinition = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeSwitcher(
										t_lbdExp63,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Class")))
								.getClassDefinitionAsTyped();

						java.lang.Boolean idIfCond_142 = false;
						idIfCond_142 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(this
												.getEcoreModelElement()));

						if (idIfCond_142) {

							java.lang.Boolean idIfCond_143 = false;
							idIfCond_143 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(classDefinition
													.getEcoreModelElement()));

							if (idIfCond_143) {

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
												t_lbdExp63,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Class")))
										.setEcoreModelElement(new_eGenericType);

								((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												t_lbdExp63,
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

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft64 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Type> convertAsOrderedSet(
							this.getSuperType()).iterator();
			java.lang.Boolean idLoopCond_144 = false;
			while (!idLoopCond_144) {
				idLoopCond_144 = it_ft64.isOff();
				if (idLoopCond_144) {
				} else {

					//BIle:func
					kermeta.language.structure.Type t_lbdExp64 = it_ft64.next();

					java.lang.Boolean idIfCond_145 = false;
					idIfCond_145 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									t_lbdExp64,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.ParameterizedType"));

					if (idIfCond_145) {

						java.lang.Boolean idIfCond_146 = false;
						idIfCond_146 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														t_lbdExp64,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.structure.ParameterizedType")))
												.getTypeDefinition(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.ClassDefinition"));

						if (idIfCond_146) {

							org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.ClassDefinition> convertAsOrderedSet(
											((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asTypeSwitcher(
															((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			t_lbdExp64,
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

		java.lang.Boolean idIfCond_147 = false;
		idIfCond_147 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_147) {

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

		kermeta.language.structure.Type result_ft65 = null;

		kermeta.language.structure.Type elem_ft65 = null;

		result_ft65 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft65 = this
					.allSuperTypes().iterator();
			java.lang.Boolean idLoopCond_148 = false;
			while (!idLoopCond_148) {
				idLoopCond_148 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft65.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft65, null));
				if (idLoopCond_148) {
				} else {

					elem_ft65 = it_ft65.next();

					java.lang.Boolean idIfCond_149 = false;
					//BIle:detector
					kermeta.language.structure.Type st_lbdExp65 = elem_ft65;

					idIfCond_149 = kermeta.standard.helper.BooleanWrapper
							.and(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isInstanceOfSwitcher(
													st_lbdExp65,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ParameterizedType")),
									kermeta.standard.helper.StringWrapper
											.equals(
													((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
															.asTypeSwitcher(
																	st_lbdExp65,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.ParameterizedType")))
															.getTypeDefinition()
															.qualifiedName(),
													superType_qualifiedName));
					//EIle:detector

					if (idIfCond_149) {

						result_ft65 = elem_ft65;
					}

				}
			}
		}

		//CE
		res = result_ft65;
		//EIft:detect

		java.lang.Boolean idIfCond_150 = false;
		idIfCond_150 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(res));

		if (idIfCond_150) {

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
		java.lang.Boolean idLoopCond_151 = false;
		while (!idLoopCond_151) {
			idLoopCond_151 = superClasses.isEmpty();
			if (idLoopCond_151) {
			} else {

				allSuperClasses.addAll(superClasses);

				kermeta.standard.Set<kermeta.language.structure.Type> temp = ((kermeta.standard.Set<kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject(kermeta.standard.StandardPackage.eINSTANCE
								.getSet()));

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft66 = superClasses
							.iterator();
					java.lang.Boolean idLoopCond_152 = false;
					while (!idLoopCond_152) {
						idLoopCond_152 = it_ft66.isOff();
						if (idLoopCond_152) {
						} else {

							//BIle:func
							kermeta.language.structure.Type s_lbdExp66 = it_ft66
									.next();

							java.lang.Boolean idIfCond_153 = false;
							idIfCond_153 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isInstanceOfSwitcher(
											s_lbdExp66,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.ParameterizedType"));

							if (idIfCond_153) {

								java.lang.Boolean idIfCond_154 = false;
								idIfCond_154 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
														.asTypeSwitcher(
																s_lbdExp66,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.ParameterizedType")))
														.getTypeDefinition(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_154) {

									temp
											.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
													.<kermeta.language.structure.Type> convertAsOrderedSet(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
															.asTypeSwitcher(
																	((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																			.asTypeSwitcher(
																					s_lbdExp66,
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

		java.lang.Boolean idIfCond_155 = false;
		idIfCond_155 = kermeta.standard.helper.StringWrapper.equals(this
				.qualifiedName(), "kermeta::standard::Iterator");

		if (idIfCond_155) {

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

		java.lang.Boolean idIfCond_156 = false;
		idIfCond_156 = kermeta.standard.helper.StringWrapper.equals(this
				.qualifiedName(), "kermeta::standard::Collection");

		if (idIfCond_156) {

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

		java.lang.Boolean idIfCond_157 = false;
		idIfCond_157 = kermeta.standard.helper.BooleanWrapper.not(this
				.isAddedValueType());

		if (idIfCond_157) {

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

		java.lang.Boolean idIfCond_158 = false;
		idIfCond_158 = kermeta.standard.helper.BooleanWrapper.and(this
				.isValueType(),
				org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isNotEqualSwitcher(this.getName(), "Numeric"));

		if (idIfCond_158) {

			context.setCurrent_valueType(this);

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft67 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Operation> convertAsOrderedSet(
								this.getOwnedOperation()).iterator();
				java.lang.Boolean idLoopCond_159 = false;
				while (!idLoopCond_159) {
					idLoopCond_159 = it_ft67.isOff();
					if (idLoopCond_159) {
					} else {

						//BIle:func
						kermeta.language.structure.Operation op_lbdExp67 = it_ft67
								.next();

						op_lbdExp67.applyPass2BehaviorJava(context);
						//EIle:func

					}
				}
			}

			//EIft:each

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft68 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Type> convertAsOrderedSet(
								this.getSuperType()).iterator();
				java.lang.Boolean idLoopCond_160 = false;
				while (!idLoopCond_160) {
					idLoopCond_160 = it_ft68.isOff();
					if (idLoopCond_160) {
					} else {

						//BIle:func
						kermeta.language.structure.Type t_lbdExp68 = it_ft68
								.next();

						java.lang.Boolean idIfCond_161 = false;
						idIfCond_161 = org.kermeta.compil.runtime.helper.language.TypeUtil
								.isInstanceSwitcher(
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Class"),
										t_lbdExp68);

						if (idIfCond_161) {

							kermeta.language.structure.Class c = null;

							c = (kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeOrVoid(t_lbdExp68,
											"kermeta.language.structure.Class");

							kermeta.language.structure.ClassDefinition cDef = null;

							cDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeOrVoid(c.getTypeDefinition(),
											"kermeta.language.structure.ClassDefinition");

							//BIft:each

							{

								kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft69 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
										.<kermeta.language.structure.Operation> convertAsSet(
												cDef.getterAllOperation())
										.iterator();
								java.lang.Boolean idLoopCond_162 = false;
								while (!idLoopCond_162) {
									idLoopCond_162 = it_ft69.isOff();
									if (idLoopCond_162) {
									} else {

										//BIle:func
										kermeta.language.structure.Operation p_lbdExp69 = it_ft69
												.next();

										java.lang.Boolean idIfCond_163 = false;
										idIfCond_163 = kermeta.standard.helper.StringWrapper
												.equals(
														p_lbdExp69
																.getRecopyInValueTypes(),
														"true");

										if (idIfCond_163) {

											p_lbdExp69
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

			java.lang.Boolean idIfCond_164 = false;
			idIfCond_164 = kermeta.standard.helper.BooleanWrapper.not(this
					.isAddedValueType());

			if (idIfCond_164) {

				//BIft:eachOwnedElement

				kermeta.language.structure.ClassDefinition cd_ft70 = this;

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft71 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Tag> convertAsOrderedSet(
									cd_ft70.getOwnedTags()).iterator();
					java.lang.Boolean idLoopCond_165 = false;
					while (!idLoopCond_165) {
						idLoopCond_165 = it_ft71.isOff();
						if (idLoopCond_165) {
						} else {

							//BIle:func
							kermeta.language.structure.Tag o_lbdExp71 = it_ft71
									.next();

							//BIle:func
							kermeta.language.structure.Tag p_lbdExp70 = o_lbdExp71;

							p_lbdExp70.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft72 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Property> convertAsOrderedSet(
									cd_ft70.getOwnedAttribute()).iterator();
					java.lang.Boolean idLoopCond_166 = false;
					while (!idLoopCond_166) {
						idLoopCond_166 = it_ft72.isOff();
						if (idLoopCond_166) {
						} else {

							//BIle:func
							kermeta.language.structure.Property o_lbdExp72 = it_ft72
									.next();

							//BIle:func
							kermeta.language.structure.Property p_lbdExp70 = o_lbdExp72;

							p_lbdExp70.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft73 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Operation> convertAsOrderedSet(
									cd_ft70.getOwnedOperation()).iterator();
					java.lang.Boolean idLoopCond_167 = false;
					while (!idLoopCond_167) {
						idLoopCond_167 = it_ft73.isOff();
						if (idLoopCond_167) {
						} else {

							//BIle:func
							kermeta.language.structure.Operation o_lbdExp73 = it_ft73
									.next();

							//BIle:func
							kermeta.language.structure.Operation p_lbdExp70 = o_lbdExp73;

							p_lbdExp70.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft74 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Constraint> convertAsOrderedSet(
									cd_ft70.getInv()).iterator();
					java.lang.Boolean idLoopCond_168 = false;
					while (!idLoopCond_168) {
						idLoopCond_168 = it_ft74.isOff();
						if (idLoopCond_168) {
						} else {

							//BIle:func
							kermeta.language.structure.Constraint i_lbdExp74 = it_ft74
									.next();

							//BIle:func
							kermeta.language.structure.Constraint p_lbdExp70 = i_lbdExp74;

							p_lbdExp70.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft75 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
									cd_ft70.getTypeParameter()).iterator();
					java.lang.Boolean idLoopCond_169 = false;
					while (!idLoopCond_169) {
						idLoopCond_169 = it_ft75.isOff();
						if (idLoopCond_169) {
						} else {

							//BIle:func
							kermeta.language.structure.TypeVariable t_lbdExp75 = it_ft75
									.next();

							//BIle:func
							kermeta.language.structure.TypeVariable p_lbdExp70 = t_lbdExp75;

							p_lbdExp70.applyPass2BehaviorJava(context);
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

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft50 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Type> convertAsOrderedSet(
							this.getSuperType()).iterator();
			java.lang.Boolean idLoopCond_104 = false;
			while (!idLoopCond_104) {
				idLoopCond_104 = it_ft50.isOff();
				if (idLoopCond_104) {
				} else {

					//BIle:func
					kermeta.language.structure.Type t_lbdExp50 = it_ft50.next();

					java.lang.Boolean idIfCond_105 = false;
					idIfCond_105 = org.kermeta.compil.runtime.helper.language.TypeUtil
							.isInstanceSwitcher(
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Class"),
									t_lbdExp50);

					if (idIfCond_105) {

						kermeta.language.structure.Class c = null;

						c = (kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeOrVoid(t_lbdExp50,
										"kermeta.language.structure.Class");

						kermeta.language.structure.ClassDefinition cDef = null;

						cDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeOrVoid(c.getTypeDefinition(),
										"kermeta.language.structure.ClassDefinition");

						//BIft:each

						{

							kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft51 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Operation> convertAsSet(
											cDef.getterAllOperation())
									.iterator();
							java.lang.Boolean idLoopCond_106 = false;
							while (!idLoopCond_106) {
								idLoopCond_106 = it_ft51.isOff();
								if (idLoopCond_106) {
								} else {

									//BIle:func
									kermeta.language.structure.Operation p_lbdExp51 = it_ft51
											.next();

									result.add(p_lbdExp51);
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

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft52 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Type> convertAsOrderedSet(
							this.getSuperType()).iterator();
			java.lang.Boolean idLoopCond_107 = false;
			while (!idLoopCond_107) {
				idLoopCond_107 = it_ft52.isOff();
				if (idLoopCond_107) {
				} else {

					//BIle:func
					kermeta.language.structure.Type t_lbdExp52 = it_ft52.next();

					java.lang.Boolean idIfCond_108 = false;
					idIfCond_108 = org.kermeta.compil.runtime.helper.language.TypeUtil
							.isInstanceSwitcher(
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Class"),
									t_lbdExp52);

					if (idIfCond_108) {

						kermeta.language.structure.Class c = null;

						c = (kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeOrVoid(t_lbdExp52,
										"kermeta.language.structure.Class");

						kermeta.language.structure.ClassDefinition cDef = null;

						cDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeOrVoid(c.getTypeDefinition(),
										"kermeta.language.structure.ClassDefinition");

						//BIft:each

						{

							kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft53 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Property> convertAsSet(
											cDef.getterAllAttribute())
									.iterator();
							java.lang.Boolean idLoopCond_109 = false;
							while (!idLoopCond_109) {
								idLoopCond_109 = it_ft53.isOff();
								if (idLoopCond_109) {
								} else {

									//BIle:func
									kermeta.language.structure.Property p_lbdExp53 = it_ft53
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
