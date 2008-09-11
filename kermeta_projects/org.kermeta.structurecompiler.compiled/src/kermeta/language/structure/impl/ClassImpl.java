/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClassImpl.java,v 1.2 2008-09-11 12:34:47 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import ecore.EGenericType;

import java.util.Collection;

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.Operation;
import kermeta.language.structure.Property;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.Traceability;

import kermeta.standard.Set;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.ClassImpl#getEcoreModelElement <em>Ecore Model Element</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassImpl#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassImpl#getClassDefinition <em>Class Definition</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends ParameterizedTypeImpl implements
		kermeta.language.structure.Class {
	/**
	 * The cached value of the '{@link #getEcoreModelElement() <em>Ecore Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreModelElement()
	 * @generated
	 * @ordered
	 */
	protected EGenericType ecoreModelElement;

	/**
	 * The cached value of the '{@link #getOwnedOperation() <em>Owned Operation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> ownedOperation;

	/**
	 * The cached value of the '{@link #getSuperClass() <em>Super Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClass()
	 * @generated
	 * @ordered
	 */
	protected EList<kermeta.language.structure.Class> superClass;

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
	 * The cached value of the '{@link #getClassDefinition() <em>Class Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassDefinition()
	 * @generated
	 * @ordered
	 */
	protected ClassDefinition classDefinition;

	/**
	 * The cached value of the '{@link #getOwnedAttribute() <em>Owned Attribute</em>}' reference list.
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
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType getEcoreModelElement() {
		if (ecoreModelElement != null
				&& ((EObject) ecoreModelElement).eIsProxy()) {
			InternalEObject oldEcoreModelElement = (InternalEObject) ecoreModelElement;
			ecoreModelElement = (EGenericType) eResolveProxy(oldEcoreModelElement);
			if (ecoreModelElement != oldEcoreModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StructurePackage.CLASS__ECORE_MODEL_ELEMENT,
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
	public EGenericType basicGetEcoreModelElement() {
		return ecoreModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcoreModelElement(EGenericType newEcoreModelElement) {
		EGenericType oldEcoreModelElement = ecoreModelElement;
		ecoreModelElement = newEcoreModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.CLASS__ECORE_MODEL_ELEMENT,
					oldEcoreModelElement, ecoreModelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOwnedOperation() {
		if (ownedOperation == null) {
			ownedOperation = new EObjectResolvingEList<Operation>(
					Operation.class, this,
					StructurePackage.CLASS__OWNED_OPERATION);
		}
		return ownedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<kermeta.language.structure.Class> getSuperClass() {
		if (superClass == null) {
			superClass = new EObjectResolvingEList<kermeta.language.structure.Class>(
					kermeta.language.structure.Class.class, this,
					StructurePackage.CLASS__SUPER_CLASS);
		}
		return superClass;
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
					StructurePackage.CLASS__IS_ABSTRACT, oldIsAbstract,
					isAbstract));
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
	public ClassDefinition getClassDefinition() {
		if (classDefinition != null && classDefinition.eIsProxy()) {
			InternalEObject oldClassDefinition = (InternalEObject) classDefinition;
			classDefinition = (ClassDefinition) eResolveProxy(oldClassDefinition);
			if (classDefinition != oldClassDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StructurePackage.CLASS__CLASS_DEFINITION,
							oldClassDefinition, classDefinition));
			}
		}
		return classDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinition basicGetClassDefinition() {
		return classDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassDefinition(ClassDefinition newClassDefinition) {
		ClassDefinition oldClassDefinition = classDefinition;
		classDefinition = newClassDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.CLASS__CLASS_DEFINITION,
					oldClassDefinition, classDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedAttribute() {
		if (ownedAttribute == null) {
			ownedAttribute = new EObjectResolvingEList<Property>(
					Property.class, this,
					StructurePackage.CLASS__OWNED_ATTRIBUTE);
		}
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object clone(
			kermeta.language.structure.Object objectToClone) {

		kermeta.language.structure.Object result = null;

		result = org.kermeta.compil.runtime.helper.language.ClassUtil
				.cloneObject(this, objectToClone);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object _new() {

		kermeta.language.structure.Object result = null;

		result = org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(this.getClass().getName());

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

		result = org.kermeta.compil.runtime.helper.language.ClassUtil
				.deepCloneObject(this, objectToClone);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<Property> allAttributes() {

		kermeta.standard.Set<kermeta.language.structure.Property> result = null;

		kermeta.standard.Set<kermeta.language.structure.Property> properties = ((kermeta.standard.Set<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Set<kermeta.language.structure.Property>"));

		//BIft:select

		kermeta.standard.Sequence<kermeta.language.structure.Property> result_ft83 = null;

		kermeta.language.structure.Property elem_ft83 = null;

		result_ft83 = ((kermeta.standard.Sequence<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<kermeta.language.structure.Property>"));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft83 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Property> convertAsSet(
							this.getOwnedAttribute()).iterator();
			java.lang.Boolean idLoopCond_271 = false;
			while (!idLoopCond_271) {
				idLoopCond_271 = it_ft83.isOff();
				if (idLoopCond_271) {
				} else {

					elem_ft83 = it_ft83.next();

					java.lang.Boolean idIfCond_272 = false;
					//BIle:selector
					kermeta.language.structure.Property p_lbdExp83 = elem_ft83;

					idIfCond_272 = p_lbdExp83.getIsComposite();
					//EIle:selector

					if (idIfCond_272) {

						result_ft83.add(elem_ft83);
					}

				}
			}
		}

		//EIft:select
		properties.addAll(result_ft83);

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Class> it_ft84 = this
					.allSuperClasses().iterator();
			java.lang.Boolean idLoopCond_273 = false;
			while (!idLoopCond_273) {
				idLoopCond_273 = it_ft84.isOff();
				if (idLoopCond_273) {
				} else {

					//BIle:func
					kermeta.language.structure.Class s_lbdExp84 = it_ft84
							.next();

					//BIft:select

					kermeta.standard.Sequence<kermeta.language.structure.Property> result_ft85 = null;

					kermeta.language.structure.Property elem_ft85 = null;

					result_ft85 = ((kermeta.standard.Sequence<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.standard.Sequence<kermeta.language.structure.Property>"));

					{

						kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft85 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Property> convertAsSet(
										s_lbdExp84.getOwnedAttribute())
								.iterator();
						java.lang.Boolean idLoopCond_274 = false;
						while (!idLoopCond_274) {
							idLoopCond_274 = it_ft85.isOff();
							if (idLoopCond_274) {
							} else {

								elem_ft85 = it_ft85.next();

								java.lang.Boolean idIfCond_275 = false;
								//BIle:selector
								kermeta.language.structure.Property p_lbdExp85 = elem_ft85;

								idIfCond_275 = p_lbdExp85.getIsComposite();
								//EIle:selector

								if (idIfCond_275) {

									result_ft85.add(elem_ft85);
								}

							}
						}
					}

					//EIft:select
					properties.addAll(result_ft85);
					//EIle:func

				}
			}
		}

		//EIft:each

		result = properties;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<kermeta.language.structure.Class> allSuperClasses() {

		kermeta.standard.Set<kermeta.language.structure.Class> result = null;

		kermeta.standard.Set<kermeta.language.structure.Class> allSuperClasses = ((kermeta.standard.Set<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Set<kermeta.language.structure.Class>"));

		kermeta.standard.Set<kermeta.language.structure.Class> superClasses = ((kermeta.standard.Set<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Set<kermeta.language.structure.Class>"));

		superClasses
				.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Class> convertAsOrderedSet(this
								.getSuperClass()));

		kermeta.standard.Set<kermeta.language.structure.Class> temp = ((kermeta.standard.Set<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Set<kermeta.language.structure.Class>"));

		kermeta.standard.helper.BooleanWrapper.not(superClasses.isEmpty());
		java.lang.Boolean idLoopCond_276 = false;
		while (!idLoopCond_276) {
			idLoopCond_276 = superClasses.isEmpty();
			if (idLoopCond_276) {
			} else {

				allSuperClasses.addAll(superClasses);

				temp.clear();

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Class> it_ft86 = superClasses
							.iterator();
					java.lang.Boolean idLoopCond_277 = false;
					while (!idLoopCond_277) {
						idLoopCond_277 = it_ft86.isOff();
						if (idLoopCond_277) {
						} else {

							//BIle:func
							kermeta.language.structure.Class s_lbdExp86 = it_ft86
									.next();

							temp
									.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
											.<kermeta.language.structure.Class> convertAsOrderedSet(s_lbdExp86
													.getSuperClass()));
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
	public Boolean equals(kermeta.language.structure.Object other) {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ClassUtil
				.equals(this, other);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void applyPass2(KM2EcoreContext context) {

		kermeta.language.structure.helper.ObjectSuper.super_applyPass2(this,
				context);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinition getClassDefinitionAsTyped() {

		kermeta.language.structure.ClassDefinition result = null;

		result = null;

		java.lang.Boolean idIfCond_278 = false;
		idIfCond_278 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(
						this.getTypeDefinition(),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.ClassDefinition"));

		if (idIfCond_278) {

			result = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asType(
							this.getTypeDefinition(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.ClassDefinition")));
		}

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

			kermeta.standard.Iterator<kermeta.language.structure.TypeVariableBinding> it_ft87 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.TypeVariableBinding> convertAsOrderedSet(
							this.getTypeParamBinding()).iterator();
			java.lang.Boolean idLoopCond_279 = false;
			while (!idLoopCond_279) {
				idLoopCond_279 = it_ft87.isOff();
				if (idLoopCond_279) {
				} else {

					//BIle:func
					kermeta.language.structure.TypeVariableBinding tpb_lbdExp87 = it_ft87
							.next();

					ecore.EGenericType typeArgument = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("ecore.EGenericType"));

					java.lang.Boolean idIfCond_280 = false;
					idIfCond_280 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(
									tpb_lbdExp87.getType(),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Class"));

					if (idIfCond_280) {

						kermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asType(
										tpb_lbdExp87.getType(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Class")))
								.getClassDefinitionAsTyped();

						java.lang.Boolean idIfCond_281 = false;
						idIfCond_281 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoid(cd.getEcoreDataType());

						if (idIfCond_281) {

							typeArgument.setEClassifier(cd
									.getEcoreModelElement());
						} else {

							typeArgument.setEClassifier(cd.getEcoreDataType());
						}

						org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<ecore.EGenericType> convertAsOrderedSet(
										this.getEcoreModelElement()
												.getETypeArguments()).add(
										typeArgument);

						((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asType(
										tpb_lbdExp87.getType(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Class")))
								.setEcoreModelElement(typeArgument);

						((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asType(
										tpb_lbdExp87.getType(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Class")))
								.setLinks(context);
					} else {

						java.lang.Boolean idIfCond_282 = false;
						idIfCond_282 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOf(
										tpb_lbdExp87.getType(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.ObjectTypeVariable"));

						if (idIfCond_282) {

							kermeta.language.structure.ObjectTypeVariable otv = ((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asType(
											tpb_lbdExp87.getType(),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.ObjectTypeVariable")));

							typeArgument.setETypeParameter(otv
									.getEcoreModelElement());

							org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<ecore.EGenericType> convertAsOrderedSet(
											this.getEcoreModelElement()
													.getETypeArguments()).add(
											typeArgument);
						} else {

							java.lang.Boolean idIfCond_283 = false;
							idIfCond_283 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isInstanceOf(
											tpb_lbdExp87.getType(),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.PrimitiveType"));

							if (idIfCond_283) {

								kermeta.language.structure.ClassDefinition cd = tpb_lbdExp87
										.getType().getClassFromPrimitiveType()
										.getClassDefinitionAsTyped();

								java.lang.Boolean idIfCond_284 = false;
								idIfCond_284 = tpb_lbdExp87.getType()
										.isEDataType();

								if (idIfCond_284) {

									typeArgument
											.setEClassifier(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asType(
															tpb_lbdExp87
																	.getType(),
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.PrimitiveType")))
													.getEcoreModelElement());
								} else {

									java.lang.Boolean idIfCond_285 = false;
									idIfCond_285 = org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoid(cd.getEcoreDataType());

									if (idIfCond_285) {

										typeArgument.setEClassifier(cd
												.getEcoreModelElement());
									} else {

										typeArgument.setEClassifier(cd
												.getEcoreDataType());
									}

								}

								org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
										.<ecore.EGenericType> convertAsOrderedSet(
												this.getEcoreModelElement()
														.getETypeArguments())
										.add(typeArgument);
							} else {

								java.lang.Boolean idIfCond_286 = false;
								idIfCond_286 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												tpb_lbdExp87.getType(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass("void"));

								if (idIfCond_286) {
								}

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
	public String toString() {

		java.lang.String result = null;

		result = this.getTypeDefinition().getName();

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void applyPass2BehaviorJava(KM2EcoreContext context) {

		kermeta.language.structure.helper.ObjectSuper
				.super_applyPass2BehaviorJava(this, context);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StructurePackage.CLASS__ECORE_MODEL_ELEMENT:
			if (resolve)
				return getEcoreModelElement();
			return basicGetEcoreModelElement();
		case StructurePackage.CLASS__OWNED_OPERATION:
			return getOwnedOperation();
		case StructurePackage.CLASS__SUPER_CLASS:
			return getSuperClass();
		case StructurePackage.CLASS__IS_ABSTRACT:
			return getIsAbstract();
		case StructurePackage.CLASS__NAME:
			return getName();
		case StructurePackage.CLASS__CLASS_DEFINITION:
			if (resolve)
				return getClassDefinition();
			return basicGetClassDefinition();
		case StructurePackage.CLASS__OWNED_ATTRIBUTE:
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
		case StructurePackage.CLASS__ECORE_MODEL_ELEMENT:
			setEcoreModelElement((EGenericType) newValue);
			return;
		case StructurePackage.CLASS__IS_ABSTRACT:
			setIsAbstract((Boolean) newValue);
			return;
		case StructurePackage.CLASS__CLASS_DEFINITION:
			setClassDefinition((ClassDefinition) newValue);
			return;
		case StructurePackage.CLASS__OWNED_ATTRIBUTE:
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
		case StructurePackage.CLASS__ECORE_MODEL_ELEMENT:
			setEcoreModelElement((EGenericType) null);
			return;
		case StructurePackage.CLASS__IS_ABSTRACT:
			setIsAbstract(IS_ABSTRACT_EDEFAULT);
			return;
		case StructurePackage.CLASS__CLASS_DEFINITION:
			setClassDefinition((ClassDefinition) null);
			return;
		case StructurePackage.CLASS__OWNED_ATTRIBUTE:
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
		case StructurePackage.CLASS__ECORE_MODEL_ELEMENT:
			return ecoreModelElement != null;
		case StructurePackage.CLASS__OWNED_OPERATION:
			return ownedOperation != null && !ownedOperation.isEmpty();
		case StructurePackage.CLASS__SUPER_CLASS:
			return superClass != null && !superClass.isEmpty();
		case StructurePackage.CLASS__IS_ABSTRACT:
			return IS_ABSTRACT_EDEFAULT == null ? isAbstract != null
					: !IS_ABSTRACT_EDEFAULT.equals(isAbstract);
		case StructurePackage.CLASS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case StructurePackage.CLASS__CLASS_DEFINITION:
			return classDefinition != null;
		case StructurePackage.CLASS__OWNED_ATTRIBUTE:
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
		if (baseClass == Traceability.class) {
			switch (derivedFeatureID) {
			case StructurePackage.CLASS__ECORE_MODEL_ELEMENT:
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
		if (baseClass == Traceability.class) {
			switch (baseFeatureID) {
			case StructurePackage.TRACEABILITY__ECORE_MODEL_ELEMENT:
				return StructurePackage.CLASS__ECORE_MODEL_ELEMENT;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ClassImpl
