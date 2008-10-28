/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClassDefinitionImpl.java,v 1.7 2008-10-28 13:18:10 cfaucher Exp $
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

		java.lang.Boolean idIfCond_108 = false;
		idIfCond_108 = kermeta.standard.helper.BooleanWrapper.or(this
				.isCollection(), this.isIterator());

		if (idIfCond_108) {

			result = true;
		}

		return result;

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

		java.lang.Boolean idIfCond_109 = false;
		idIfCond_109 = this.isValueType();

		if (idIfCond_109) {

			java.lang.String instanceClassName = this.getEMFInstanceClassName();

			java.lang.Boolean idIfCond_110 = false;
			idIfCond_110 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(instanceClassName, "");

			if (idIfCond_110) {

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

				java.lang.Boolean idIfCond_111 = false;
				idIfCond_111 = kermeta.standard.helper.BooleanWrapper.not(this
						.getIsAbstract());

				if (idIfCond_111) {

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

				java.lang.Boolean idIfCond_112 = false;
				idIfCond_112 = kermeta.standard.helper.BooleanWrapper.not(this
						.getIsAbstract());

				if (idIfCond_112) {

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

			kermeta.language.structure.ClassDefinition cd_ft53 = this;

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft54 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Tag> convertAsOrderedSet(
								cd_ft53.getOwnedTags()).iterator();
				java.lang.Boolean idLoopCond_113 = false;
				while (!idLoopCond_113) {
					idLoopCond_113 = it_ft54.isOff();
					if (idLoopCond_113) {
					} else {

						//BIle:func
						kermeta.language.structure.Tag o_lbdExp54 = it_ft54
								.next();

						//BIle:func
						kermeta.language.structure.Tag o_lbdExp53 = o_lbdExp54;

						java.lang.Boolean idIfCond_114 = false;
						idIfCond_114 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												o_lbdExp53,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")));

						if (idIfCond_114) {

							o_lbdExp53.applyPass1(context);
						} else {

							kermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											o_lbdExp53,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation")));

							java.lang.Boolean idIfCond_115 = false;
							idIfCond_115 = kermeta.standard.helper.BooleanWrapper
									.not(op.isFunctionType());

							if (idIfCond_115) {

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

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft55 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsOrderedSet(
								cd_ft53.getOwnedAttribute()).iterator();
				java.lang.Boolean idLoopCond_116 = false;
				while (!idLoopCond_116) {
					idLoopCond_116 = it_ft55.isOff();
					if (idLoopCond_116) {
					} else {

						//BIle:func
						kermeta.language.structure.Property o_lbdExp55 = it_ft55
								.next();

						//BIle:func
						kermeta.language.structure.Property o_lbdExp53 = o_lbdExp55;

						java.lang.Boolean idIfCond_117 = false;
						idIfCond_117 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												o_lbdExp53,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")));

						if (idIfCond_117) {

							o_lbdExp53.applyPass1(context);
						} else {

							kermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											o_lbdExp53,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation")));

							java.lang.Boolean idIfCond_118 = false;
							idIfCond_118 = kermeta.standard.helper.BooleanWrapper
									.not(op.isFunctionType());

							if (idIfCond_118) {

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

				kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft56 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Operation> convertAsOrderedSet(
								cd_ft53.getOwnedOperation()).iterator();
				java.lang.Boolean idLoopCond_119 = false;
				while (!idLoopCond_119) {
					idLoopCond_119 = it_ft56.isOff();
					if (idLoopCond_119) {
					} else {

						//BIle:func
						kermeta.language.structure.Operation o_lbdExp56 = it_ft56
								.next();

						//BIle:func
						kermeta.language.structure.Operation o_lbdExp53 = o_lbdExp56;

						java.lang.Boolean idIfCond_120 = false;
						idIfCond_120 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												o_lbdExp53,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")));

						if (idIfCond_120) {

							o_lbdExp53.applyPass1(context);
						} else {

							kermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											o_lbdExp53,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation")));

							java.lang.Boolean idIfCond_121 = false;
							idIfCond_121 = kermeta.standard.helper.BooleanWrapper
									.not(op.isFunctionType());

							if (idIfCond_121) {

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

				kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft57 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Constraint> convertAsOrderedSet(
								cd_ft53.getInv()).iterator();
				java.lang.Boolean idLoopCond_122 = false;
				while (!idLoopCond_122) {
					idLoopCond_122 = it_ft57.isOff();
					if (idLoopCond_122) {
					} else {

						//BIle:func
						kermeta.language.structure.Constraint i_lbdExp57 = it_ft57
								.next();

						//BIle:func
						kermeta.language.structure.Constraint o_lbdExp53 = i_lbdExp57;

						java.lang.Boolean idIfCond_123 = false;
						idIfCond_123 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												o_lbdExp53,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")));

						if (idIfCond_123) {

							o_lbdExp53.applyPass1(context);
						} else {

							kermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											o_lbdExp53,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation")));

							java.lang.Boolean idIfCond_124 = false;
							idIfCond_124 = kermeta.standard.helper.BooleanWrapper
									.not(op.isFunctionType());

							if (idIfCond_124) {

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

				kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft58 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
								cd_ft53.getTypeParameter()).iterator();
				java.lang.Boolean idLoopCond_125 = false;
				while (!idLoopCond_125) {
					idLoopCond_125 = it_ft58.isOff();
					if (idLoopCond_125) {
					} else {

						//BIle:func
						kermeta.language.structure.TypeVariable t_lbdExp58 = it_ft58
								.next();

						//BIle:func
						kermeta.language.structure.TypeVariable o_lbdExp53 = t_lbdExp58;

						java.lang.Boolean idIfCond_126 = false;
						idIfCond_126 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												o_lbdExp53,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")));

						if (idIfCond_126) {

							o_lbdExp53.applyPass1(context);
						} else {

							kermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											o_lbdExp53,
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

			//EIft:eachOwnedElement

		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initEmfNeedProperty(KM2EcoreContext context) {

		//BIft:each

		{

			kermeta.standard.Iterator<java.lang.String> it_ft59 = this
					.getEMFNeedProperty().iterator();
			java.lang.Boolean idLoopCond_128 = false;
			while (!idLoopCond_128) {
				idLoopCond_128 = it_ft59.isOff();
				if (idLoopCond_128) {
				} else {

					//BIle:func
					java.lang.String emfNeedProperty_lbdExp59 = it_ft59.next();

					java.lang.Boolean idIfCond_129 = false;
					idIfCond_129 = kermeta.standard.helper.IntegerWrapper
							.isGreater(kermeta.standard.helper.StringWrapper
									.getPropertyInfos(emfNeedProperty_lbdExp59)
									.size(), 0);

					if (idIfCond_129) {

						ecore.EStructuralFeature newProperty = ((ecore.EAttribute) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("ecore.EAttribute"));

						java.lang.Boolean idIfCond_130 = false;
						idIfCond_130 = kermeta.standard.helper.BooleanWrapper
								.and(
										kermeta.standard.helper.BooleanWrapper
												.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isVoidSwitcher(kermeta.standard.helper.StringWrapper
																.getPropertyInfos(
																		emfNeedProperty_lbdExp59)
																.getValue(
																		"javaClass"))),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqualSwitcher(
														kermeta.standard.helper.StringWrapper
																.getPropertyInfos(
																		emfNeedProperty_lbdExp59)
																.getValue(
																		"javaClass"),
														""));

						if (idIfCond_130) {

							newProperty = ((ecore.EAttribute) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject("ecore.EAttribute"));

							newProperty
									.setName(kermeta.standard.helper.StringWrapper
											.getPropertyInfos(
													emfNeedProperty_lbdExp59)
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
																	emfNeedProperty_lbdExp59)
															.getValue("name")));

							newProperty_EDataType
									.setInstanceClassName(kermeta.standard.helper.StringWrapper
											.getPropertyInfos(
													emfNeedProperty_lbdExp59)
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

							java.lang.Boolean idIfCond_131 = false;
							idIfCond_131 = kermeta.standard.helper.BooleanWrapper
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

							if (idIfCond_131) {

								//BIft:each

								{

									kermeta.standard.Iterator<ecore.ETypeParameter> it_ft60 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
											.<ecore.ETypeParameter> convertAsOrderedSet(
													this
															.getEcoreModelElement()
															.getETypeParameters())
											.iterator();
									java.lang.Boolean idLoopCond_132 = false;
									while (!idLoopCond_132) {
										idLoopCond_132 = it_ft60.isOff();
										if (idLoopCond_132) {
										} else {

											//BIle:func
											ecore.ETypeParameter etp_lbdExp60 = it_ft60
													.next();

											ecore.ETypeParameter newEtp = ((ecore.ETypeParameter) org.kermeta.compil.runtime.helper.language.ClassUtil
													.newObject("ecore.ETypeParameter"));

											newEtp.setName(etp_lbdExp60
													.getName());

											org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
													.<ecore.ETypeParameter> convertAsOrderedSet(
															newProperty_EDataType
																	.getETypeParameters())
													.add(newEtp);

											ecore.EGenericType eta = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
													.newObject("ecore.EGenericType"));

											eta.setETypeParameter(etp_lbdExp60);

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

							java.lang.Boolean idIfCond_133 = false;
							idIfCond_133 = kermeta.standard.helper.BooleanWrapper
									.and(
											kermeta.standard.helper.BooleanWrapper
													.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isVoidSwitcher(kermeta.standard.helper.StringWrapper
																	.getPropertyInfos(
																			emfNeedProperty_lbdExp59)
																	.getValue(
																			"classDefinitionQN"))),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqualSwitcher(
															kermeta.standard.helper.StringWrapper
																	.getPropertyInfos(
																			emfNeedProperty_lbdExp59)
																	.getValue(
																			"classDefinitionQN"),
															""));

							if (idIfCond_133) {

								newProperty = ((ecore.EReference) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject("ecore.EReference"));

								newProperty
										.setName(kermeta.standard.helper.StringWrapper
												.getPropertyInfos(
														emfNeedProperty_lbdExp59)
												.getValue("name"));

								newProperty.set_transient(false);

								ecore.EClassifier retrieved_EClassifier = context
										.getMu()
										.getEClassifierByQualifiedName(
												kermeta.standard.helper.StringWrapper
														.getPropertyInfos(
																emfNeedProperty_lbdExp59)
														.getValue(
																"classDefinitionQN"));

								ecore.EGenericType newJavaCollection_EGenericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject("ecore.EGenericType"));

								newJavaCollection_EGenericType
										.setEClassifier(retrieved_EClassifier);

								newProperty
										.setEGenericType(newJavaCollection_EGenericType);

								java.lang.Boolean idIfCond_134 = false;
								idIfCond_134 = kermeta.standard.helper.BooleanWrapper
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

								if (idIfCond_134) {

									//BIft:each

									{

										kermeta.standard.Iterator<ecore.ETypeParameter> it_ft61 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<ecore.ETypeParameter> convertAsOrderedSet(
														this
																.getEcoreModelElement()
																.getETypeParameters())
												.iterator();
										java.lang.Boolean idLoopCond_135 = false;
										while (!idLoopCond_135) {
											idLoopCond_135 = it_ft61.isOff();
											if (idLoopCond_135) {
											} else {

												//BIle:func
												ecore.ETypeParameter etp_lbdExp61 = it_ft61
														.next();

												ecore.EGenericType eta = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
														.newObject("ecore.EGenericType"));

												eta
														.setETypeParameter(etp_lbdExp61);

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

								java.lang.Boolean idIfCond_136 = false;
								idIfCond_136 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												retrievedTypeDef,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_136) {

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

									java.lang.Boolean idIfCond_137 = false;
									idIfCond_137 = org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isInstanceOfSwitcher(
													retrievedTypeDef,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.PrimitiveType"));

									if (idIfCond_137) {

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

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft62 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Type> convertAsOrderedSet(
							this.getSuperType()).iterator();
			java.lang.Boolean idLoopCond_138 = false;
			while (!idLoopCond_138) {
				idLoopCond_138 = it_ft62.isOff();
				if (idLoopCond_138) {
				} else {

					//BIle:func
					kermeta.language.structure.Type t_lbdExp62 = it_ft62.next();

					java.lang.Boolean idIfCond_139 = false;
					idIfCond_139 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									t_lbdExp62,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Class"));

					if (idIfCond_139) {

						kermeta.language.structure.ClassDefinition classDefinition = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeSwitcher(
										t_lbdExp62,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Class")))
								.getClassDefinitionAsTyped();

						java.lang.Boolean idIfCond_140 = false;
						idIfCond_140 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(this
												.getEcoreModelElement()));

						if (idIfCond_140) {

							java.lang.Boolean idIfCond_141 = false;
							idIfCond_141 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(classDefinition
													.getEcoreModelElement()));

							if (idIfCond_141) {

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
												t_lbdExp62,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Class")))
										.setEcoreModelElement(new_eGenericType);

								((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												t_lbdExp62,
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

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft63 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Type> convertAsOrderedSet(
							this.getSuperType()).iterator();
			java.lang.Boolean idLoopCond_142 = false;
			while (!idLoopCond_142) {
				idLoopCond_142 = it_ft63.isOff();
				if (idLoopCond_142) {
				} else {

					//BIle:func
					kermeta.language.structure.Type t_lbdExp63 = it_ft63.next();

					java.lang.Boolean idIfCond_143 = false;
					idIfCond_143 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									t_lbdExp63,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.ParameterizedType"));

					if (idIfCond_143) {

						java.lang.Boolean idIfCond_144 = false;
						idIfCond_144 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														t_lbdExp63,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.structure.ParameterizedType")))
												.getTypeDefinition(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.ClassDefinition"));

						if (idIfCond_144) {

							org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.ClassDefinition> convertAsOrderedSet(
											((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asTypeSwitcher(
															((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			t_lbdExp63,
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

		java.lang.Boolean idIfCond_145 = false;
		idIfCond_145 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_145) {

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

		kermeta.language.structure.Type result_ft64 = null;

		kermeta.language.structure.Type elem_ft64 = null;

		result_ft64 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft64 = this
					.allSuperTypes().iterator();
			java.lang.Boolean idLoopCond_146 = false;
			while (!idLoopCond_146) {
				idLoopCond_146 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft64.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft64, null));
				if (idLoopCond_146) {
				} else {

					elem_ft64 = it_ft64.next();

					java.lang.Boolean idIfCond_147 = false;
					//BIle:detector
					kermeta.language.structure.Type st_lbdExp64 = elem_ft64;

					idIfCond_147 = kermeta.standard.helper.BooleanWrapper
							.and(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isInstanceOfSwitcher(
													st_lbdExp64,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ParameterizedType")),
									kermeta.standard.helper.StringWrapper
											.equals(
													((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
															.asTypeSwitcher(
																	st_lbdExp64,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.ParameterizedType")))
															.getTypeDefinition()
															.qualifiedName(),
													superType_qualifiedName));
					//EIle:detector

					if (idIfCond_147) {

						result_ft64 = elem_ft64;
					}

				}
			}
		}

		//CE
		res = result_ft64;
		//EIft:detect

		java.lang.Boolean idIfCond_148 = false;
		idIfCond_148 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(res));

		if (idIfCond_148) {

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
		java.lang.Boolean idLoopCond_149 = false;
		while (!idLoopCond_149) {
			idLoopCond_149 = superClasses.isEmpty();
			if (idLoopCond_149) {
			} else {

				allSuperClasses.addAll(superClasses);

				kermeta.standard.Set<kermeta.language.structure.Type> temp = ((kermeta.standard.Set<kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("kermeta.standard.Set<kermeta.language.structure.Type>"));

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft65 = superClasses
							.iterator();
					java.lang.Boolean idLoopCond_150 = false;
					while (!idLoopCond_150) {
						idLoopCond_150 = it_ft65.isOff();
						if (idLoopCond_150) {
						} else {

							//BIle:func
							kermeta.language.structure.Type s_lbdExp65 = it_ft65
									.next();

							java.lang.Boolean idIfCond_151 = false;
							idIfCond_151 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isInstanceOfSwitcher(
											s_lbdExp65,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.ParameterizedType"));

							if (idIfCond_151) {

								java.lang.Boolean idIfCond_152 = false;
								idIfCond_152 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
														.asTypeSwitcher(
																s_lbdExp65,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.ParameterizedType")))
														.getTypeDefinition(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_152) {

									temp
											.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
													.<kermeta.language.structure.Type> convertAsOrderedSet(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
															.asTypeSwitcher(
																	((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																			.asTypeSwitcher(
																					s_lbdExp65,
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

		java.lang.Boolean idIfCond_153 = false;
		idIfCond_153 = kermeta.standard.helper.StringWrapper.equals(this
				.qualifiedName(), "kermeta::standard::Iterator");

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
	public Boolean isCollection() {

		java.lang.Boolean result = null;

		result = false;

		result = this.isSubTypeOf("kermeta::standard::Collection");

		java.lang.Boolean idIfCond_154 = false;
		idIfCond_154 = kermeta.standard.helper.StringWrapper.equals(this
				.qualifiedName(), "kermeta::standard::Collection");

		if (idIfCond_154) {

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

		java.lang.Boolean idIfCond_155 = false;
		idIfCond_155 = kermeta.standard.helper.BooleanWrapper.not(this
				.isAddedValueType());

		if (idIfCond_155) {

			this.setLinks(context);
		} else {

			kermeta.language.structure.ClassDefinition cd_valueType = null;

			cd_valueType = (kermeta.language.structure.ClassDefinition) context
					.getMu().getTypeDefinitionByQualifiedName(
							"kermeta::standard::ValueType");

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EClass> convertAsOrderedSet(
							this.getEcoreModelElement().getESuperTypes()).add(
							cd_valueType.getEcoreModelElement());
		}

		java.lang.Boolean idIfCond_156 = false;
		idIfCond_156 = kermeta.standard.helper.BooleanWrapper.and(this
				.isValueType(),
				org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isNotEqualSwitcher(this.getName(), "Numeric"));

		if (idIfCond_156) {

			context.setCurrent_valueType(this);

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft66 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Operation> convertAsOrderedSet(
								this.getOwnedOperation()).iterator();
				java.lang.Boolean idLoopCond_157 = false;
				while (!idLoopCond_157) {
					idLoopCond_157 = it_ft66.isOff();
					if (idLoopCond_157) {
					} else {

						//BIle:func
						kermeta.language.structure.Operation op_lbdExp66 = it_ft66
								.next();

						op_lbdExp66.applyPass2BehaviorJava(context);
						//EIle:func

					}
				}
			}

			//EIft:each

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft67 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Type> convertAsOrderedSet(
								this.getSuperType()).iterator();
				java.lang.Boolean idLoopCond_158 = false;
				while (!idLoopCond_158) {
					idLoopCond_158 = it_ft67.isOff();
					if (idLoopCond_158) {
					} else {

						//BIle:func
						kermeta.language.structure.Type t_lbdExp67 = it_ft67
								.next();

						java.lang.Boolean idIfCond_159 = false;
						idIfCond_159 = org.kermeta.compil.runtime.helper.language.TypeUtil
								.isInstanceSwitcher(
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Class"),
										t_lbdExp67);

						if (idIfCond_159) {

							kermeta.language.structure.Class c = null;

							c = (kermeta.language.structure.Class) t_lbdExp67;

							kermeta.language.structure.ClassDefinition cDef = null;

							cDef = (kermeta.language.structure.ClassDefinition) c
									.getTypeDefinition();

							//BIft:each

							{

								kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft68 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
										.<kermeta.language.structure.Operation> convertAsSet(
												cDef.getterAllOperation())
										.iterator();
								java.lang.Boolean idLoopCond_160 = false;
								while (!idLoopCond_160) {
									idLoopCond_160 = it_ft68.isOff();
									if (idLoopCond_160) {
									} else {

										//BIle:func
										kermeta.language.structure.Operation p_lbdExp68 = it_ft68
												.next();

										java.lang.Boolean idIfCond_161 = false;
										idIfCond_161 = kermeta.standard.helper.StringWrapper
												.equals(
														p_lbdExp68
																.getRecopyInValueTypes(),
														"true");

										if (idIfCond_161) {

											p_lbdExp68
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

			java.lang.Boolean idIfCond_162 = false;
			idIfCond_162 = kermeta.standard.helper.BooleanWrapper.not(this
					.isAddedValueType());

			if (idIfCond_162) {

				//BIft:eachOwnedElement

				kermeta.language.structure.ClassDefinition cd_ft69 = this;

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft70 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Tag> convertAsOrderedSet(
									cd_ft69.getOwnedTags()).iterator();
					java.lang.Boolean idLoopCond_163 = false;
					while (!idLoopCond_163) {
						idLoopCond_163 = it_ft70.isOff();
						if (idLoopCond_163) {
						} else {

							//BIle:func
							kermeta.language.structure.Tag o_lbdExp70 = it_ft70
									.next();

							//BIle:func
							kermeta.language.structure.Tag p_lbdExp69 = o_lbdExp70;

							p_lbdExp69.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft71 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Property> convertAsOrderedSet(
									cd_ft69.getOwnedAttribute()).iterator();
					java.lang.Boolean idLoopCond_164 = false;
					while (!idLoopCond_164) {
						idLoopCond_164 = it_ft71.isOff();
						if (idLoopCond_164) {
						} else {

							//BIle:func
							kermeta.language.structure.Property o_lbdExp71 = it_ft71
									.next();

							//BIle:func
							kermeta.language.structure.Property p_lbdExp69 = o_lbdExp71;

							p_lbdExp69.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft72 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Operation> convertAsOrderedSet(
									cd_ft69.getOwnedOperation()).iterator();
					java.lang.Boolean idLoopCond_165 = false;
					while (!idLoopCond_165) {
						idLoopCond_165 = it_ft72.isOff();
						if (idLoopCond_165) {
						} else {

							//BIle:func
							kermeta.language.structure.Operation o_lbdExp72 = it_ft72
									.next();

							//BIle:func
							kermeta.language.structure.Operation p_lbdExp69 = o_lbdExp72;

							p_lbdExp69.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft73 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Constraint> convertAsOrderedSet(
									cd_ft69.getInv()).iterator();
					java.lang.Boolean idLoopCond_166 = false;
					while (!idLoopCond_166) {
						idLoopCond_166 = it_ft73.isOff();
						if (idLoopCond_166) {
						} else {

							//BIle:func
							kermeta.language.structure.Constraint i_lbdExp73 = it_ft73
									.next();

							//BIle:func
							kermeta.language.structure.Constraint p_lbdExp69 = i_lbdExp73;

							p_lbdExp69.applyPass2BehaviorJava(context);
							//EIle:func

							//EIle:func

						}
					}
				}

				//EIft:each

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft74 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
									cd_ft69.getTypeParameter()).iterator();
					java.lang.Boolean idLoopCond_167 = false;
					while (!idLoopCond_167) {
						idLoopCond_167 = it_ft74.isOff();
						if (idLoopCond_167) {
						} else {

							//BIle:func
							kermeta.language.structure.TypeVariable t_lbdExp74 = it_ft74
									.next();

							//BIle:func
							kermeta.language.structure.TypeVariable p_lbdExp69 = t_lbdExp74;

							p_lbdExp69.applyPass2BehaviorJava(context);
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

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft49 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Type> convertAsOrderedSet(
							this.getSuperType()).iterator();
			java.lang.Boolean idLoopCond_102 = false;
			while (!idLoopCond_102) {
				idLoopCond_102 = it_ft49.isOff();
				if (idLoopCond_102) {
				} else {

					//BIle:func
					kermeta.language.structure.Type t_lbdExp49 = it_ft49.next();

					java.lang.Boolean idIfCond_103 = false;
					idIfCond_103 = org.kermeta.compil.runtime.helper.language.TypeUtil
							.isInstanceSwitcher(
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Class"),
									t_lbdExp49);

					if (idIfCond_103) {

						kermeta.language.structure.Class c = null;

						c = (kermeta.language.structure.Class) t_lbdExp49;

						kermeta.language.structure.ClassDefinition cDef = null;

						cDef = (kermeta.language.structure.ClassDefinition) c
								.getTypeDefinition();

						//BIft:each

						{

							kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft50 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Operation> convertAsSet(
											cDef.getterAllOperation())
									.iterator();
							java.lang.Boolean idLoopCond_104 = false;
							while (!idLoopCond_104) {
								idLoopCond_104 = it_ft50.isOff();
								if (idLoopCond_104) {
								} else {

									//BIle:func
									kermeta.language.structure.Operation p_lbdExp50 = it_ft50
											.next();

									result.add(p_lbdExp50);
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

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft51 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Type> convertAsOrderedSet(
							this.getSuperType()).iterator();
			java.lang.Boolean idLoopCond_105 = false;
			while (!idLoopCond_105) {
				idLoopCond_105 = it_ft51.isOff();
				if (idLoopCond_105) {
				} else {

					//BIle:func
					kermeta.language.structure.Type t_lbdExp51 = it_ft51.next();

					java.lang.Boolean idIfCond_106 = false;
					idIfCond_106 = org.kermeta.compil.runtime.helper.language.TypeUtil
							.isInstanceSwitcher(
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Class"),
									t_lbdExp51);

					if (idIfCond_106) {

						kermeta.language.structure.Class c = null;

						c = (kermeta.language.structure.Class) t_lbdExp51;

						kermeta.language.structure.ClassDefinition cDef = null;

						cDef = (kermeta.language.structure.ClassDefinition) c
								.getTypeDefinition();

						//BIft:each

						{

							kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft52 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Property> convertAsSet(
											cDef.getterAllAttribute())
									.iterator();
							java.lang.Boolean idLoopCond_107 = false;
							while (!idLoopCond_107) {
								idLoopCond_107 = it_ft52.isOff();
								if (idLoopCond_107) {
								} else {

									//BIle:func
									kermeta.language.structure.Property p_lbdExp52 = it_ft52
											.next();

									result.add(p_lbdExp52);
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
