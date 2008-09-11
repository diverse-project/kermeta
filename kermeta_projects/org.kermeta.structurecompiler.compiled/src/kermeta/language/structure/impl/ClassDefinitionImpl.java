/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClassDefinitionImpl.java,v 1.2 2008-09-11 12:34:48 cfaucher Exp $
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
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getAllOperation <em>All Operation</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getAllAttribute <em>All Attribute</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getEcoreDataType <em>Ecore Data Type</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
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
	 * The cached value of the '{@link #getAllOperation() <em>All Operation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> allOperation;

	/**
	 * The cached value of the '{@link #getAllAttribute() <em>All Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> allAttribute;

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
		return StructurePackage.Literals.CLASS_DEFINITION;
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
	public EList<Operation> getAllOperation() {
		if (allOperation == null) {
			allOperation = new EObjectResolvingEList<Operation>(
					Operation.class, this,
					StructurePackage.CLASS_DEFINITION__ALL_OPERATION);
		}
		return allOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getAllAttribute() {
		if (allAttribute == null) {
			allAttribute = new EObjectResolvingEList<Property>(Property.class,
					this, StructurePackage.CLASS_DEFINITION__ALL_ATTRIBUTE);
		}
		return allAttribute;
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

		java.lang.Boolean idIfCond_112 = false;
		idIfCond_112 = kermeta.standard.helper.BooleanWrapper.or(this
				.isCollection(), this.isIterator());

		if (idIfCond_112) {

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

		java.lang.Boolean idIfCond_113 = false;
		idIfCond_113 = kermeta.standard.helper.StringWrapper.equals(this
				.qualifiedName(), "kermeta::standard::Iterator");

		if (idIfCond_113) {

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

		kermeta.language.structure.Package p = ((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.container(this),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.structure.Package")));

		java.lang.Boolean idIfCond_114 = false;
		idIfCond_114 = this.isValueType();

		if (idIfCond_114) {

			java.lang.String instanceClassName = this.getEMFInstanceClassName();

			java.lang.Boolean idIfCond_115 = false;
			idIfCond_115 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqual(instanceClassName, "");

			if (idIfCond_115) {

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
			} else {

				java.lang.Boolean idIfCond_116 = false;
				idIfCond_116 = kermeta.standard.helper.BooleanWrapper.not(this
						.getIsAbstract());

				if (idIfCond_116) {

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

			kermeta.language.structure.ClassDefinition cd_ft42 = this;

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft43 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Tag> convertAsOrderedSet(
								cd_ft42.getOwnedTags()).iterator();
				java.lang.Boolean idLoopCond_117 = false;
				while (!idLoopCond_117) {
					idLoopCond_117 = it_ft43.isOff();
					if (idLoopCond_117) {
					} else {

						//BIle:func
						kermeta.language.structure.Tag o_lbdExp43 = it_ft43
								.next();

						//BIle:func
						kermeta.language.structure.Tag o_lbdExp42 = o_lbdExp43;

						java.lang.Boolean idIfCond_118 = false;
						idIfCond_118 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												o_lbdExp42,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")));

						if (idIfCond_118) {

							o_lbdExp42.applyPass1(context);
						} else {

							kermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asType(
											o_lbdExp42,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation")));

							java.lang.Boolean idIfCond_119 = false;
							idIfCond_119 = kermeta.standard.helper.BooleanWrapper
									.not(op.isFunctionType());

							if (idIfCond_119) {

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

				kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft44 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Property> convertAsOrderedSet(
								cd_ft42.getOwnedAttribute()).iterator();
				java.lang.Boolean idLoopCond_120 = false;
				while (!idLoopCond_120) {
					idLoopCond_120 = it_ft44.isOff();
					if (idLoopCond_120) {
					} else {

						//BIle:func
						kermeta.language.structure.Property o_lbdExp44 = it_ft44
								.next();

						//BIle:func
						kermeta.language.structure.Property o_lbdExp42 = o_lbdExp44;

						java.lang.Boolean idIfCond_121 = false;
						idIfCond_121 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												o_lbdExp42,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")));

						if (idIfCond_121) {

							o_lbdExp42.applyPass1(context);
						} else {

							kermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asType(
											o_lbdExp42,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation")));

							java.lang.Boolean idIfCond_122 = false;
							idIfCond_122 = kermeta.standard.helper.BooleanWrapper
									.not(op.isFunctionType());

							if (idIfCond_122) {

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

				kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft45 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Operation> convertAsOrderedSet(
								cd_ft42.getOwnedOperation()).iterator();
				java.lang.Boolean idLoopCond_123 = false;
				while (!idLoopCond_123) {
					idLoopCond_123 = it_ft45.isOff();
					if (idLoopCond_123) {
					} else {

						//BIle:func
						kermeta.language.structure.Operation o_lbdExp45 = it_ft45
								.next();

						//BIle:func
						kermeta.language.structure.Operation o_lbdExp42 = o_lbdExp45;

						java.lang.Boolean idIfCond_124 = false;
						idIfCond_124 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												o_lbdExp42,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")));

						if (idIfCond_124) {

							o_lbdExp42.applyPass1(context);
						} else {

							kermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asType(
											o_lbdExp42,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation")));

							java.lang.Boolean idIfCond_125 = false;
							idIfCond_125 = kermeta.standard.helper.BooleanWrapper
									.not(op.isFunctionType());

							if (idIfCond_125) {

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

				kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft46 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Constraint> convertAsOrderedSet(
								cd_ft42.getInv()).iterator();
				java.lang.Boolean idLoopCond_126 = false;
				while (!idLoopCond_126) {
					idLoopCond_126 = it_ft46.isOff();
					if (idLoopCond_126) {
					} else {

						//BIle:func
						kermeta.language.structure.Constraint i_lbdExp46 = it_ft46
								.next();

						//BIle:func
						kermeta.language.structure.Constraint o_lbdExp42 = i_lbdExp46;

						java.lang.Boolean idIfCond_127 = false;
						idIfCond_127 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												o_lbdExp42,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")));

						if (idIfCond_127) {

							o_lbdExp42.applyPass1(context);
						} else {

							kermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asType(
											o_lbdExp42,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation")));

							java.lang.Boolean idIfCond_128 = false;
							idIfCond_128 = kermeta.standard.helper.BooleanWrapper
									.not(op.isFunctionType());

							if (idIfCond_128) {

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

				kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft47 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
								cd_ft42.getTypeParameter()).iterator();
				java.lang.Boolean idLoopCond_129 = false;
				while (!idLoopCond_129) {
					idLoopCond_129 = it_ft47.isOff();
					if (idLoopCond_129) {
					} else {

						//BIle:func
						kermeta.language.structure.TypeVariable t_lbdExp47 = it_ft47
								.next();

						//BIle:func
						kermeta.language.structure.TypeVariable o_lbdExp42 = t_lbdExp47;

						java.lang.Boolean idIfCond_130 = false;
						idIfCond_130 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												o_lbdExp42,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")));

						if (idIfCond_130) {

							o_lbdExp42.applyPass1(context);
						} else {

							kermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asType(
											o_lbdExp42,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation")));

							java.lang.Boolean idIfCond_131 = false;
							idIfCond_131 = kermeta.standard.helper.BooleanWrapper
									.not(op.isFunctionType());

							if (idIfCond_131) {

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
	public Boolean isCollection() {

		java.lang.Boolean result = null;

		result = false;

		result = this.isSubTypeOf("kermeta::standard::Collection");

		java.lang.Boolean idIfCond_132 = false;
		idIfCond_132 = kermeta.standard.helper.StringWrapper.equals(this
				.qualifiedName(), "kermeta::standard::Collection");

		if (idIfCond_132) {

			result = true;
		}

		return result;

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
	public EClass createEcoreModelElement(KM2EcoreContext context) {

		ecore.EClass result = null;

		ecore.EClass ecoreClass = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("ecore.EClass"));

		ecoreClass.setInterface(false);

		ecoreClass
				.setName(((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("km2ecore.helper.java.IdentifierHelper"))
						.getMangledIdentifier(this.getName(), context));

		ecoreClass.setAbstract(this.getIsAbstract());

		result = ecoreClass;

		return result;

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

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft48 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Type> convertAsOrderedSet(
							this.getSuperType()).iterator();
			java.lang.Boolean idLoopCond_133 = false;
			while (!idLoopCond_133) {
				idLoopCond_133 = it_ft48.isOff();
				if (idLoopCond_133) {
				} else {

					//BIle:func
					kermeta.language.structure.Type t_lbdExp48 = it_ft48.next();

					java.lang.Boolean idIfCond_134 = false;
					idIfCond_134 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(
									t_lbdExp48,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Class"));

					if (idIfCond_134) {

						kermeta.language.structure.ClassDefinition classDefinition = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asType(
										t_lbdExp48,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Class")))
								.getClassDefinitionAsTyped();

						java.lang.Boolean idIfCond_135 = false;
						idIfCond_135 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoid(this.getEcoreModelElement()));

						if (idIfCond_135) {

							java.lang.Boolean idIfCond_136 = false;
							idIfCond_136 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoid(classDefinition
													.getEcoreModelElement()));

							if (idIfCond_136) {

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
										.asType(
												t_lbdExp48,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Class")))
										.setEcoreModelElement(new_eGenericType);

								((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asType(
												t_lbdExp48,
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
	public void applyPass2BehaviorJava(KM2EcoreContext context) {

		this.setLinks(context);

		java.lang.Boolean idIfCond_137 = false;
		idIfCond_137 = kermeta.standard.helper.BooleanWrapper.and(this
				.isValueType(),
				org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isNotEqual(this.getName(), "Numeric"));

		if (idIfCond_137) {

			context.setCurrent_valueType(this);

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft49 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Operation> convertAsOrderedSet(
								this.getOwnedOperation()).iterator();
				java.lang.Boolean idLoopCond_138 = false;
				while (!idLoopCond_138) {
					idLoopCond_138 = it_ft49.isOff();
					if (idLoopCond_138) {
					} else {

						//BIle:func
						kermeta.language.structure.Operation op_lbdExp49 = it_ft49
								.next();

						op_lbdExp49.applyPass2BehaviorJava(context);
						//EIle:func

					}
				}
			}

			//EIft:each

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft50 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Type> convertAsOrderedSet(
								this.getSuperType()).iterator();
				java.lang.Boolean idLoopCond_139 = false;
				while (!idLoopCond_139) {
					idLoopCond_139 = it_ft50.isOff();
					if (idLoopCond_139) {
					} else {

						//BIle:func
						kermeta.language.structure.Type t_lbdExp50 = it_ft50
								.next();

						java.lang.Boolean idIfCond_140 = false;
						idIfCond_140 = org.kermeta.compil.runtime.helper.language.TypeUtil
								.isInstance(
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Class"),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance().getMetaClass(
														"t_lbdExp50"));

						if (idIfCond_140) {

							kermeta.language.structure.Class c = null;

							c = (kermeta.language.structure.Class) t_lbdExp50;

							kermeta.language.structure.ClassDefinition cDef = null;

							cDef = (kermeta.language.structure.ClassDefinition) c
									.getTypeDefinition();

							//BIft:each

							{

								kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft51 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
										.<kermeta.language.structure.Operation> convertAsSet(
												cDef.getAllOperation())
										.iterator();
								java.lang.Boolean idLoopCond_141 = false;
								while (!idLoopCond_141) {
									idLoopCond_141 = it_ft51.isOff();
									if (idLoopCond_141) {
									} else {

										//BIle:func
										kermeta.language.structure.Operation p_lbdExp51 = it_ft51
												.next();

										java.lang.Boolean idIfCond_142 = false;
										idIfCond_142 = kermeta.standard.helper.StringWrapper
												.equals(
														p_lbdExp51
																.getRecopyInValueTypes(),
														"true");

										if (idIfCond_142) {

											p_lbdExp51
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

			kermeta.language.structure.helper.ObjectSuper
					.super_applyPass2BehaviorJava(this, context);
		}

		//BIft:each

		{

			kermeta.standard.Iterator<java.lang.String> it_ft52 = this
					.getEMFNeedProperty().iterator();
			java.lang.Boolean idLoopCond_143 = false;
			while (!idLoopCond_143) {
				idLoopCond_143 = it_ft52.isOff();
				if (idLoopCond_143) {
				} else {

					//BIle:func
					java.lang.String emfNeedProperty_lbdExp52 = it_ft52.next();

					java.lang.Boolean idIfCond_144 = false;
					idIfCond_144 = kermeta.standard.helper.IntegerWrapper
							.isGreater(kermeta.standard.helper.StringWrapper
									.getPropertyInfos(emfNeedProperty_lbdExp52)
									.size(), 0);

					if (idIfCond_144) {

						ecore.EStructuralFeature newProperty = ((ecore.EAttribute) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("ecore.EAttribute"));

						java.lang.Boolean idIfCond_145 = false;
						idIfCond_145 = kermeta.standard.helper.BooleanWrapper
								.and(
										kermeta.standard.helper.BooleanWrapper
												.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isVoid(kermeta.standard.helper.StringWrapper
																.getPropertyInfos(
																		emfNeedProperty_lbdExp52)
																.getValue(
																		"javaClass"))),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqual(
														kermeta.standard.helper.StringWrapper
																.getPropertyInfos(
																		emfNeedProperty_lbdExp52)
																.getValue(
																		"javaClass"),
														""));

						if (idIfCond_145) {

							newProperty = ((ecore.EAttribute) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject("ecore.EAttribute"));

							newProperty
									.setName(kermeta.standard.helper.StringWrapper
											.getPropertyInfos(
													emfNeedProperty_lbdExp52)
											.getValue("name"));

							newProperty.setTransient(false);

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
																	emfNeedProperty_lbdExp52)
															.getValue("name")));

							newProperty_EDataType
									.setInstanceClassName(kermeta.standard.helper.StringWrapper
											.getPropertyInfos(
													emfNeedProperty_lbdExp52)
											.getValue("javaClass"));

							org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<ecore.EClassifier> convertAsOrderedSet(
											((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asType(
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.container(this),
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

							java.lang.Boolean idIfCond_146 = false;
							idIfCond_146 = kermeta.standard.helper.BooleanWrapper
									.and(
											kermeta.standard.helper.BooleanWrapper
													.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isVoid(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
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

							if (idIfCond_146) {

								//BIft:each

								{

									kermeta.standard.Iterator<ecore.ETypeParameter> it_ft53 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
											.<ecore.ETypeParameter> convertAsOrderedSet(
													this
															.getEcoreModelElement()
															.getETypeParameters())
											.iterator();
									java.lang.Boolean idLoopCond_147 = false;
									while (!idLoopCond_147) {
										idLoopCond_147 = it_ft53.isOff();
										if (idLoopCond_147) {
										} else {

											//BIle:func
											ecore.ETypeParameter etp_lbdExp53 = it_ft53
													.next();

											ecore.ETypeParameter newEtp = ((ecore.ETypeParameter) org.kermeta.compil.runtime.helper.language.ClassUtil
													.newObject("ecore.ETypeParameter"));

											newEtp.setName(etp_lbdExp53
													.getName());

											org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
													.<ecore.ETypeParameter> convertAsOrderedSet(
															newProperty_EDataType
																	.getETypeParameters())
													.add(newEtp);

											ecore.EGenericType eta = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
													.newObject("ecore.EGenericType"));

											eta.setETypeParameter(etp_lbdExp53);

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

							java.lang.Boolean idIfCond_148 = false;
							idIfCond_148 = kermeta.standard.helper.BooleanWrapper
									.and(
											kermeta.standard.helper.BooleanWrapper
													.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isVoid(kermeta.standard.helper.StringWrapper
																	.getPropertyInfos(
																			emfNeedProperty_lbdExp52)
																	.getValue(
																			"classDefinitionQN"))),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isNotEqual(
															kermeta.standard.helper.StringWrapper
																	.getPropertyInfos(
																			emfNeedProperty_lbdExp52)
																	.getValue(
																			"classDefinitionQN"),
															""));

							if (idIfCond_148) {

								newProperty = ((ecore.EReference) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject("ecore.EReference"));

								newProperty
										.setName(kermeta.standard.helper.StringWrapper
												.getPropertyInfos(
														emfNeedProperty_lbdExp52)
												.getValue("name"));

								newProperty.setTransient(false);

								ecore.EClassifier retrieved_EClassifier = context
										.getMu()
										.getEClassifierByQualifiedName(
												kermeta.standard.helper.StringWrapper
														.getPropertyInfos(
																emfNeedProperty_lbdExp52)
														.getValue(
																"classDefinitionQN"));

								ecore.EGenericType newJavaCollection_EGenericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject("ecore.EGenericType"));

								newJavaCollection_EGenericType
										.setEClassifier(retrieved_EClassifier);

								newProperty
										.setEGenericType(newJavaCollection_EGenericType);

								java.lang.Boolean idIfCond_149 = false;
								idIfCond_149 = kermeta.standard.helper.BooleanWrapper
										.and(
												kermeta.standard.helper.BooleanWrapper
														.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isVoid(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
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

								if (idIfCond_149) {

									//BIft:each

									{

										kermeta.standard.Iterator<ecore.ETypeParameter> it_ft54 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<ecore.ETypeParameter> convertAsOrderedSet(
														this
																.getEcoreModelElement()
																.getETypeParameters())
												.iterator();
										java.lang.Boolean idLoopCond_150 = false;
										while (!idLoopCond_150) {
											idLoopCond_150 = it_ft54.isOff();
											if (idLoopCond_150) {
											} else {

												//BIle:func
												ecore.ETypeParameter etp_lbdExp54 = it_ft54
														.next();

												ecore.EGenericType eta = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
														.newObject("ecore.EGenericType"));

												eta
														.setETypeParameter(etp_lbdExp54);

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

								newProperty.setTransient(true);

								kermeta.language.structure.TypeDefinition retrievedTypeDef = context
										.getMu()
										.getTypeDefinitionByQualifiedName(
												"ecore::EEList");

								java.lang.Boolean idIfCond_151 = false;
								idIfCond_151 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												retrievedTypeDef,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_151) {

									newProperty
											.setEType(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asType(
															retrievedTypeDef,
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.ClassDefinition")))
													.getEcoreModelElement());
								} else {

									java.lang.Boolean idIfCond_152 = false;
									idIfCond_152 = org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isInstanceOf(
													retrievedTypeDef,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.PrimitiveType"));

									if (idIfCond_152) {

										newProperty
												.setEType(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
														.asType(
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
												.asType(
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
		java.lang.Boolean idLoopCond_153 = false;
		while (!idLoopCond_153) {
			idLoopCond_153 = superClasses.isEmpty();
			if (idLoopCond_153) {
			} else {

				allSuperClasses.addAll(superClasses);

				kermeta.standard.Set<kermeta.language.structure.Type> temp = ((kermeta.standard.Set<kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("kermeta.standard.Set<kermeta.language.structure.Type>"));

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft55 = superClasses
							.iterator();
					java.lang.Boolean idLoopCond_154 = false;
					while (!idLoopCond_154) {
						idLoopCond_154 = it_ft55.isOff();
						if (idLoopCond_154) {
						} else {

							//BIle:func
							kermeta.language.structure.Type s_lbdExp55 = it_ft55
									.next();

							java.lang.Boolean idIfCond_155 = false;
							idIfCond_155 = kermeta.standard.helper.BooleanWrapper
									.and(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isInstanceOf(
															s_lbdExp55,
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.ParameterizedType")),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isInstanceOf(
															((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			s_lbdExp55,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.ParameterizedType")))
																	.getTypeDefinition(),
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.ClassDefinition")));

							if (idIfCond_155) {

								temp
										.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Type> convertAsOrderedSet(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
														.asType(
																((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asType(
																				s_lbdExp55,
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

		kermeta.language.structure.Type result_ft56 = null;

		kermeta.language.structure.Type elem_ft56 = null;

		result_ft56 = null;

		{

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft56 = this
					.allSuperTypes().iterator();
			java.lang.Boolean idLoopCond_156 = false;
			while (!idLoopCond_156) {
				idLoopCond_156 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft56.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft56, null));
				if (idLoopCond_156) {
				} else {

					elem_ft56 = it_ft56.next();

					java.lang.Boolean idIfCond_157 = false;
					//BIle:detector
					kermeta.language.structure.Type st_lbdExp56 = elem_ft56;

					idIfCond_157 = kermeta.standard.helper.BooleanWrapper
							.and(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isInstanceOf(
													st_lbdExp56,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ParameterizedType")),
									kermeta.standard.helper.StringWrapper
											.equals(
													((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
															.asType(
																	st_lbdExp56,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.ParameterizedType")))
															.getTypeDefinition()
															.qualifiedName(),
													superType_qualifiedName));
					//EIle:detector

					if (idIfCond_157) {

						result_ft56 = elem_ft56;
					}

				}
			}
		}

		//CE
		res = result_ft56;
		//EIft:detect

		java.lang.Boolean idIfCond_158 = false;
		idIfCond_158 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(res));

		if (idIfCond_158) {

			result = true;
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
		case StructurePackage.CLASS_DEFINITION__ALL_OPERATION:
			return getAllOperation();
		case StructurePackage.CLASS_DEFINITION__ALL_ATTRIBUTE:
			return getAllAttribute();
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
		case StructurePackage.CLASS_DEFINITION__ALL_OPERATION:
			getAllOperation().clear();
			getAllOperation()
					.addAll((Collection<? extends Operation>) newValue);
			return;
		case StructurePackage.CLASS_DEFINITION__ALL_ATTRIBUTE:
			getAllAttribute().clear();
			getAllAttribute().addAll((Collection<? extends Property>) newValue);
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
		case StructurePackage.CLASS_DEFINITION__ALL_OPERATION:
			getAllOperation().clear();
			return;
		case StructurePackage.CLASS_DEFINITION__ALL_ATTRIBUTE:
			getAllAttribute().clear();
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
		case StructurePackage.CLASS_DEFINITION__ALL_OPERATION:
			return allOperation != null && !allOperation.isEmpty();
		case StructurePackage.CLASS_DEFINITION__ALL_ATTRIBUTE:
			return allAttribute != null && !allAttribute.isEmpty();
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
