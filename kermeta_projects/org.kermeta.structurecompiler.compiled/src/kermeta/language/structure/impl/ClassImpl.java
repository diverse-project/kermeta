/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClassImpl.java,v 1.3 2008-09-22 14:47:34 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import ecore.EGenericType;

import java.util.Collection;

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.GenericTypeDefinition;
import kermeta.language.structure.Operation;
import kermeta.language.structure.ParameterizedType;
import kermeta.language.structure.Property;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.Type;
import kermeta.language.structure.TypeContainer;
import kermeta.language.structure.TypeVariableBinding;

import kermeta.standard.Set;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.ClassImpl#getTypeContainer <em>Type Container</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassImpl#getTypeParamBinding <em>Type Param Binding</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassImpl#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassImpl#getVirtualTypeBinding <em>Virtual Type Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends TraceabilityImpl<EGenericType> implements
		kermeta.language.structure.Class {
	/**
	 * The cached value of the '{@link #getTypeParamBinding() <em>Type Param Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParamBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeVariableBinding> typeParamBinding;

	/**
	 * The cached value of the '{@link #getTypeDefinition() <em>Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected GenericTypeDefinition typeDefinition;

	/**
	 * The cached value of the '{@link #getVirtualTypeBinding() <em>Virtual Type Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualTypeBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeVariableBinding> virtualTypeBinding;

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
	public TypeContainer getTypeContainer() {
		if (eContainerFeatureID != StructurePackage.CLASS__TYPE_CONTAINER)
			return null;
		return (TypeContainer) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeContainer basicGetTypeContainer() {
		if (eContainerFeatureID != StructurePackage.CLASS__TYPE_CONTAINER)
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
				StructurePackage.CLASS__TYPE_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeContainer(TypeContainer newTypeContainer) {
		if (newTypeContainer != eInternalContainer()
				|| (eContainerFeatureID != StructurePackage.CLASS__TYPE_CONTAINER && newTypeContainer != null)) {
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
					StructurePackage.CLASS__TYPE_CONTAINER, newTypeContainer,
					newTypeContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeVariableBinding> getTypeParamBinding() {
		if (typeParamBinding == null) {
			typeParamBinding = new EObjectContainmentEList.Resolving<TypeVariableBinding>(
					TypeVariableBinding.class, this,
					StructurePackage.CLASS__TYPE_PARAM_BINDING);
		}
		return typeParamBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericTypeDefinition getTypeDefinition() {
		if (typeDefinition != null && typeDefinition.eIsProxy()) {
			InternalEObject oldTypeDefinition = (InternalEObject) typeDefinition;
			typeDefinition = (GenericTypeDefinition) eResolveProxy(oldTypeDefinition);
			if (typeDefinition != oldTypeDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StructurePackage.CLASS__TYPE_DEFINITION,
							oldTypeDefinition, typeDefinition));
			}
		}
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericTypeDefinition basicGetTypeDefinition() {
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDefinition(GenericTypeDefinition newTypeDefinition) {
		GenericTypeDefinition oldTypeDefinition = typeDefinition;
		typeDefinition = newTypeDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.CLASS__TYPE_DEFINITION, oldTypeDefinition,
					typeDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeVariableBinding> getVirtualTypeBinding() {
		if (virtualTypeBinding == null) {
			virtualTypeBinding = new EObjectContainmentEList.Resolving<TypeVariableBinding>(
					TypeVariableBinding.class, this,
					StructurePackage.CLASS__VIRTUAL_TYPE_BINDING);
		}
		return virtualTypeBinding;
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
	public Set<Property> allAttributes() {

		kermeta.standard.Set<kermeta.language.structure.Property> result = null;

		kermeta.standard.Set<kermeta.language.structure.Property> properties = ((kermeta.standard.Set<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Set<kermeta.language.structure.Property>"));

		//BIft:select

		kermeta.standard.Sequence<kermeta.language.structure.Property> result_ft127 = null;

		kermeta.language.structure.Property elem_ft127 = null;

		result_ft127 = ((kermeta.standard.Sequence<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<kermeta.language.structure.Property>"));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft127 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Property> convertAsOrderedSet(
							this.getterOwnedAttribute()).iterator();
			java.lang.Boolean idLoopCond_657 = false;
			while (!idLoopCond_657) {
				idLoopCond_657 = it_ft127.isOff();
				if (idLoopCond_657) {
				} else {

					elem_ft127 = it_ft127.next();

					java.lang.Boolean idIfCond_658 = false;
					//BIle:selector
					kermeta.language.structure.Property p_lbdExp127 = elem_ft127;

					idIfCond_658 = p_lbdExp127.getIsComposite();
					//EIle:selector

					if (idIfCond_658) {

						result_ft127.add(elem_ft127);
					}

				}
			}
		}

		//EIft:select
		properties.addAll(result_ft127);

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Class> it_ft128 = this
					.allSuperClasses().iterator();
			java.lang.Boolean idLoopCond_659 = false;
			while (!idLoopCond_659) {
				idLoopCond_659 = it_ft128.isOff();
				if (idLoopCond_659) {
				} else {

					//BIle:func
					kermeta.language.structure.Class s_lbdExp128 = it_ft128
							.next();

					//BIft:select

					kermeta.standard.Sequence<kermeta.language.structure.Property> result_ft129 = null;

					kermeta.language.structure.Property elem_ft129 = null;

					result_ft129 = ((kermeta.standard.Sequence<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.standard.Sequence<kermeta.language.structure.Property>"));

					{

						kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft129 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Property> convertAsOrderedSet(
										s_lbdExp128.getterOwnedAttribute())
								.iterator();
						java.lang.Boolean idLoopCond_660 = false;
						while (!idLoopCond_660) {
							idLoopCond_660 = it_ft129.isOff();
							if (idLoopCond_660) {
							} else {

								elem_ft129 = it_ft129.next();

								java.lang.Boolean idIfCond_661 = false;
								//BIle:selector
								kermeta.language.structure.Property p_lbdExp129 = elem_ft129;

								idIfCond_661 = p_lbdExp129.getIsComposite();
								//EIle:selector

								if (idIfCond_661) {

									result_ft129.add(elem_ft129);
								}

							}
						}
					}

					//EIft:select
					properties.addAll(result_ft129);
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
								.getterSuperClass()));

		kermeta.standard.Set<kermeta.language.structure.Class> temp = ((kermeta.standard.Set<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Set<kermeta.language.structure.Class>"));

		kermeta.standard.helper.BooleanWrapper.not(superClasses.isEmpty());
		java.lang.Boolean idLoopCond_662 = false;
		while (!idLoopCond_662) {
			idLoopCond_662 = superClasses.isEmpty();
			if (idLoopCond_662) {
			} else {

				allSuperClasses.addAll(superClasses);

				temp.clear();

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Class> it_ft130 = superClasses
							.iterator();
					java.lang.Boolean idLoopCond_663 = false;
					while (!idLoopCond_663) {
						idLoopCond_663 = it_ft130.isOff();
						if (idLoopCond_663) {
						} else {

							//BIle:func
							kermeta.language.structure.Class s_lbdExp130 = it_ft130
									.next();

							temp
									.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
											.<kermeta.language.structure.Class> convertAsOrderedSet(s_lbdExp130
													.getterSuperClass()));
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
	public void setLinks(KM2EcoreContext context) {

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.TypeVariableBinding> it_ft131 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.TypeVariableBinding> convertAsOrderedSet(
							this.getTypeParamBinding()).iterator();
			java.lang.Boolean idLoopCond_664 = false;
			while (!idLoopCond_664) {
				idLoopCond_664 = it_ft131.isOff();
				if (idLoopCond_664) {
				} else {

					//BIle:func
					kermeta.language.structure.TypeVariableBinding tpb_lbdExp131 = it_ft131
							.next();

					ecore.EGenericType typeArgument = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("ecore.EGenericType"));

					java.lang.Boolean idIfCond_665 = false;
					idIfCond_665 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(
									tpb_lbdExp131.getType(),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Class"));

					if (idIfCond_665) {

						kermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asType(
										tpb_lbdExp131.getType(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Class")))
								.getClassDefinitionAsTyped();

						java.lang.Boolean idIfCond_666 = false;
						idIfCond_666 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoid(cd.getEcoreDataType());

						if (idIfCond_666) {

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
										tpb_lbdExp131.getType(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Class")))
								.setEcoreModelElement(typeArgument);

						((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asType(
										tpb_lbdExp131.getType(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Class")))
								.setLinks(context);
					} else {

						java.lang.Boolean idIfCond_667 = false;
						idIfCond_667 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOf(
										tpb_lbdExp131.getType(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.ObjectTypeVariable"));

						if (idIfCond_667) {

							kermeta.language.structure.ObjectTypeVariable otv = ((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asType(
											tpb_lbdExp131.getType(),
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

							java.lang.Boolean idIfCond_668 = false;
							idIfCond_668 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isInstanceOf(
											tpb_lbdExp131.getType(),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.PrimitiveType"));

							if (idIfCond_668) {

								kermeta.language.structure.ClassDefinition cd = tpb_lbdExp131
										.getType().getClassFromPrimitiveType()
										.getClassDefinitionAsTyped();

								java.lang.Boolean idIfCond_669 = false;
								idIfCond_669 = tpb_lbdExp131.getType()
										.isEDataType();

								if (idIfCond_669) {

									typeArgument
											.setEClassifier(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asType(
															tpb_lbdExp131
																	.getType(),
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.PrimitiveType")))
													.getEcoreModelElement());
								} else {

									java.lang.Boolean idIfCond_670 = false;
									idIfCond_670 = org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoid(cd.getEcoreDataType());

									if (idIfCond_670) {

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

								java.lang.Boolean idIfCond_671 = false;
								idIfCond_671 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												tpb_lbdExp131.getType(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.VoidType"));

								if (idIfCond_671) {
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
	public EList<Operation> getterOwnedOperation() {

		kermeta.standard.Set<kermeta.language.structure.Operation> result = null;
		{

			kermeta.language.structure.ClassDefinition cDef = null;

			cDef = (kermeta.language.structure.ClassDefinition) this
					.getTypeDefinition();

			result = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsOrderedSet(cDef
							.getOwnedOperation());
		}
		return org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.convertAsEList(result);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<kermeta.language.structure.Class> getterSuperClass() {

		kermeta.standard.OrderedSet<kermeta.language.structure.Class> result = null;
		{

			kermeta.language.structure.ClassDefinition cDef = null;

			cDef = (kermeta.language.structure.ClassDefinition) this
					.getTypeDefinition();

			kermeta.standard.OrderedSet<kermeta.language.structure.Class> supertypes = ((kermeta.standard.OrderedSet<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("kermeta.standard.OrderedSet<kermeta.language.structure.Class>"));

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft126 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Type> convertAsOrderedSet(
								cDef.getSuperType()).iterator();
				java.lang.Boolean idLoopCond_655 = false;
				while (!idLoopCond_655) {
					idLoopCond_655 = it_ft126.isOff();
					if (idLoopCond_655) {
					} else {

						//BIle:func
						kermeta.language.structure.Type elem_lbdExp126 = it_ft126
								.next();

						java.lang.Boolean idIfCond_656 = false;
						idIfCond_656 = org.kermeta.compil.runtime.helper.language.TypeUtil
								.isInstance(
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Class"),
										elem_lbdExp126);

						if (idIfCond_656) {

							kermeta.language.structure.Class c = null;

							c = (kermeta.language.structure.Class) elem_lbdExp126;

							supertypes.add(c);
						}

						//EIle:func

					}
				}
			}

			//EIft:each

			result = supertypes;
		}
		return org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.convertAsEList(result);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getterIsAbstract() {

		java.lang.Boolean result = null;
		{

			kermeta.language.structure.ClassDefinition cDef = null;

			cDef = (kermeta.language.structure.ClassDefinition) this
					.getTypeDefinition();

			result = cDef.getIsAbstract();
		}
		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getterName() {

		java.lang.String result = null;
		{

			result = this.getTypeDefinition().getName();
		}
		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinition getterClassDefinition() {

		kermeta.language.structure.ClassDefinition result = null;
		{

			result = (kermeta.language.structure.ClassDefinition) this
					.getTypeDefinition();
		}
		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getterOwnedAttribute() {

		kermeta.standard.OrderedSet<kermeta.language.structure.Property> result = null;
		{

			kermeta.language.structure.ClassDefinition cDef = null;

			cDef = (kermeta.language.structure.ClassDefinition) this
					.getTypeDefinition();

			result = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Property> convertAsOrderedSet(cDef
							.getOwnedAttribute());
		}
		return org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.convertAsEList(result);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBehaviorJava(KM2EcoreContext context) {

		java.lang.String result = null;

		java.lang.Boolean idIfCond_726 = false;
		idIfCond_726 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(this.getTypeDefinition().getEMFInstanceClassName(),
						"");

		if (idIfCond_726) {

			result = this.getTypeDefinition().getEMFInstanceClassName();
		} else {

			result = kermeta.standard.helper.StringWrapper.replace(this
					.getTypeQName(), "::", ".");
		}

		java.lang.String str_tpb = "";

		java.lang.Integer i = 0;

		java.lang.Integer i_ = 0;

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.TypeVariableBinding> it_ft153 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.TypeVariableBinding> convertAsOrderedSet(
							this.getTypeParamBinding()).iterator();
			java.lang.Boolean idLoopCond_727 = false;
			while (!idLoopCond_727) {
				idLoopCond_727 = it_ft153.isOff();
				if (idLoopCond_727) {
				} else {

					//BIle:func
					kermeta.language.structure.TypeVariableBinding tpb_lbdExp153 = it_ft153
							.next();

					java.lang.Boolean idIfCond_728 = false;
					idIfCond_728 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(i, 1);

					if (idIfCond_728) {

						str_tpb = kermeta.standard.helper.StringWrapper.plus(
								str_tpb, ", ");
					}

					java.lang.Boolean idIfCond_729 = false;
					idIfCond_729 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoid(tpb_lbdExp153.getType());

					if (idIfCond_729) {

						org.kermeta.compil.runtime.helper.io.StdIOUtil
								.writeln(kermeta.standard.helper.StringWrapper
										.plus(
												"tpb.type.isVoid(): ",
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.toString(this)));
					}

					java.lang.Boolean idIfCond_730 = false;
					idIfCond_730 = kermeta.standard.helper.BooleanWrapper
							.not(context.getFtSuffixActivation());

					if (idIfCond_730) {

						java.lang.Boolean idIfCond_731 = false;
						idIfCond_731 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoid(tpb_lbdExp153.getType()));

						if (idIfCond_731) {

							str_tpb = kermeta.standard.helper.StringWrapper
									.plus(str_tpb, tpb_lbdExp153.getType()
											.createBehaviorJava(context));
						}

					} else {

						kermeta.language.structure.Type type_from_map = context
								.getFtMapTypeStack().peek().getValue(
										tpb_lbdExp153.getType());

						java.lang.Boolean idIfCond_732 = false;
						idIfCond_732 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoid(type_from_map));

						if (idIfCond_732) {

							context.setFtSuffixActivation(false);

							str_tpb = kermeta.standard.helper.StringWrapper
									.plus(str_tpb, type_from_map
											.createBehaviorJava(context));

							context.setFtSuffixActivation(true);
						} else {

							context.setFtSuffixActivation(false);

							str_tpb = kermeta.standard.helper.StringWrapper
									.plus(str_tpb, context
											.getFtProductTypeStack().peek()
											.getTypeByIndex(i)
											.createBehaviorJava(context));

							context.setFtSuffixActivation(true);
						}

					}

					i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
					//EIle:func

				}
			}
		}

		//EIft:each

		java.lang.Boolean idIfCond_733 = false;
		idIfCond_733 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(str_tpb, "");

		if (idIfCond_733) {

			result = kermeta.standard.helper.StringWrapper.plus(
					kermeta.standard.helper.StringWrapper.plus(
							kermeta.standard.helper.StringWrapper.plus(result,
									"<"), str_tpb), ">");
		}

		result = kermeta.standard.helper.StringWrapper.plus(result, "");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinition getClassDefinitionAsTyped() {

		kermeta.language.structure.ClassDefinition result = null;

		result = null;

		java.lang.Boolean idIfCond_734 = false;
		idIfCond_734 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(
						this.getTypeDefinition(),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.ClassDefinition"));

		if (idIfCond_734) {

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
	public Boolean isMappedToJavaRawType() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_563 = false;
		idIfCond_563 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext
						.getInstance().getMetaClass(
								"kermeta.language.structure.ParameterizedType"));

		if (idIfCond_563) {

			java.lang.Boolean idIfCond_564 = false;
			idIfCond_564 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

			if (idIfCond_564) {

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
	public Boolean isBooleanTypeDef(KM2EcoreContext context) {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_565 = false;
		idIfCond_565 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this));

		if (idIfCond_565) {

			java.lang.Boolean idIfCond_566 = false;
			idIfCond_566 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOf(this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Class"));

			if (idIfCond_566) {

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

				java.lang.Boolean idIfCond_567 = false;
				idIfCond_567 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOf(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.PrimitiveType"));

				if (idIfCond_567) {

					java.lang.Boolean idIfCond_568 = false;
					idIfCond_568 = kermeta.standard.helper.BooleanWrapper
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

					if (idIfCond_568) {

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

		java.lang.Boolean idIfCond_569 = false;
		idIfCond_569 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext
						.getInstance().getMetaClass(
								"kermeta.language.structure.PrimitiveType"));

		if (idIfCond_569) {

			kermeta.language.structure.PrimitiveType pt = ((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asType(this, org.kermeta.compil.runtime.ExecutionContext
							.getInstance().getMetaClass(
									"kermeta.language.structure.PrimitiveType")));

			java.lang.Boolean idIfCond_570 = false;
			idIfCond_570 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOf(pt.getInstanceType(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Class"));

			if (idIfCond_570) {

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

		java.lang.Boolean idIfCond_571 = false;
		idIfCond_571 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext
						.getInstance().getMetaClass(
								"kermeta.language.structure.PrimitiveType"));

		if (idIfCond_571) {

			theType = ((kermeta.language.structure.Type) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asType(this.getClassFromPrimitiveType(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Type")));
		} else {

			theType = this;
		}

		java.lang.Boolean idIfCond_572 = false;
		idIfCond_572 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(
						theType,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.ParameterizedType"));

		if (idIfCond_572) {

			kermeta.language.structure.ParameterizedType pt = ((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asType(
							theType,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.ParameterizedType")));

			java.lang.Boolean idIfCond_573 = false;
			idIfCond_573 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOf(
							pt.getTypeDefinition(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.ClassDefinition"));

			if (idIfCond_573) {

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
	public Boolean isNumericalTypeDef(KM2EcoreContext context) {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_574 = false;
		idIfCond_574 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this));

		if (idIfCond_574) {

			java.lang.String tName = null;

			java.lang.Boolean idIfCond_575 = false;
			idIfCond_575 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOf(this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Class"));

			if (idIfCond_575) {

				tName = ((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asType(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.ParameterizedType")))
						.getTypeDefinition().getName();

				java.lang.Boolean idIfCond_576 = false;
				idIfCond_576 = kermeta.standard.helper.BooleanWrapper.or(
						kermeta.standard.helper.StringWrapper.equals(tName,
								"Integer"),
						kermeta.standard.helper.StringWrapper.equals(tName,
								"Real"));

				if (idIfCond_576) {

					result = true;
				}

			} else {

				java.lang.Boolean idIfCond_577 = false;
				idIfCond_577 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOf(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.PrimitiveType"));

				if (idIfCond_577) {

					tName = ((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asType(
									this,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.PrimitiveType")))
							.createBehaviorJava(context);

					java.lang.Boolean idIfCond_578 = false;
					idIfCond_578 = kermeta.standard.helper.BooleanWrapper.or(
							kermeta.standard.helper.StringWrapper.equals(tName,
									"Integer"),
							kermeta.standard.helper.StringWrapper.equals(tName,
									"Real"));

					if (idIfCond_578) {

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
	public String getTypeName() {

		java.lang.String result = null;

		result = null;

		java.lang.Boolean idIfCond_579 = false;
		idIfCond_579 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext
						.getInstance().getMetaClass(
								"kermeta.language.structure.Class"));

		if (idIfCond_579) {

			kermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asType(this, org.kermeta.compil.runtime.ExecutionContext
							.getInstance().getMetaClass(
									"kermeta.language.structure.Class")))
					.getClassDefinitionAsTyped();

			result = cd.getName();
		} else {

			java.lang.Boolean idIfCond_580 = false;
			idIfCond_580 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOf(
							this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.ObjectTypeVariable"));

			if (idIfCond_580) {

				kermeta.language.structure.ObjectTypeVariable otv = ((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asType(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.ObjectTypeVariable")));

				result = otv.getName();
			} else {

				java.lang.Boolean idIfCond_581 = false;
				idIfCond_581 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOf(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.PrimitiveType"));

				if (idIfCond_581) {

					kermeta.language.structure.ClassDefinition cd = this
							.getClassFromPrimitiveType()
							.getClassDefinitionAsTyped();

					result = cd.getName();
				} else {

					java.lang.Boolean idIfCond_582 = false;
					idIfCond_582 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(
									this,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Enumeration"));

					if (idIfCond_582) {

						result = ((kermeta.language.structure.Enumeration) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asType(
										this,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Enumeration")))
								.getName();
					} else {

						java.lang.Boolean idIfCond_583 = false;
						idIfCond_583 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOf(
										this,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.VoidType"));

						if (idIfCond_583) {

							result = "VoidType";
						}

					}

				}

			}

		}

		java.lang.Boolean idIfCond_584 = false;
		//BIft:orElse

		java.lang.Boolean result_ft98 = null;

		java.lang.Boolean idIfCond_585 = false;
		idIfCond_585 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(result);

		if (idIfCond_585) {

			result_ft98 = true;
		} else {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object v_lbdExp98 = null;

			result_ft98 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("kermeta.language.structure.Operation"))
					.isVoidType(result);
			//EIle:right

		}

		//CEC
		idIfCond_584 = result_ft98;
		//EIft:orElse

		if (idIfCond_584) {

			result = "VoidType";
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

		java.lang.Boolean idIfCond_586 = false;
		idIfCond_586 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext
						.getInstance().getMetaClass(
								"kermeta.language.structure.Class"));

		if (idIfCond_586) {

			kermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asType(this, org.kermeta.compil.runtime.ExecutionContext
							.getInstance().getMetaClass(
									"kermeta.language.structure.Class")))
					.getClassDefinitionAsTyped();

			result = cd.qualifiedName();
		} else {

			java.lang.Boolean idIfCond_587 = false;
			idIfCond_587 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOf(
							this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.ObjectTypeVariable"));

			if (idIfCond_587) {

				kermeta.language.structure.ObjectTypeVariable otv = ((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asType(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.ObjectTypeVariable")));

				result = otv.qualifiedName();
			} else {

				java.lang.Boolean idIfCond_588 = false;
				idIfCond_588 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOf(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.PrimitiveType"));

				if (idIfCond_588) {

					kermeta.language.structure.ClassDefinition cd = this
							.getClassFromPrimitiveType()
							.getClassDefinitionAsTyped();

					result = cd.qualifiedName();
				} else {

					java.lang.Boolean idIfCond_589 = false;
					idIfCond_589 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(
									this,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Enumeration"));

					if (idIfCond_589) {

						result = ((kermeta.language.structure.Enumeration) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asType(
										this,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Enumeration")))
								.qualifiedName();
					} else {

						java.lang.Boolean idIfCond_590 = false;
						idIfCond_590 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOf(
										this,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.VoidType"));

						if (idIfCond_590) {

							result = "kermeta::language::structure::VoidType";
						}

					}

				}

			}

		}

		java.lang.Boolean idIfCond_591 = false;
		//BIft:orElse

		java.lang.Boolean result_ft99 = null;

		java.lang.Boolean idIfCond_592 = false;
		idIfCond_592 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(result);

		if (idIfCond_592) {

			result_ft99 = true;
		} else {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object v_lbdExp99 = null;

			result_ft99 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("kermeta.language.structure.Operation"))
					.isVoidType(result);
			//EIle:right

		}

		//CEC
		idIfCond_591 = result_ft99;
		//EIft:orElse

		if (idIfCond_591) {

			result = "kermeta::language::structure::VoidType";
		}

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

		java.lang.Boolean idIfCond_593 = false;
		idIfCond_593 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(this.getEMFEDataTypeInstanceClassName(), "");

		if (idIfCond_593) {

			result = true;
		}

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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StructurePackage.CLASS__TYPE_CONTAINER:
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
		case StructurePackage.CLASS__TYPE_CONTAINER:
			return basicSetTypeContainer(null, msgs);
		case StructurePackage.CLASS__TYPE_PARAM_BINDING:
			return ((InternalEList<?>) getTypeParamBinding()).basicRemove(
					otherEnd, msgs);
		case StructurePackage.CLASS__VIRTUAL_TYPE_BINDING:
			return ((InternalEList<?>) getVirtualTypeBinding()).basicRemove(
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
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
		case StructurePackage.CLASS__TYPE_CONTAINER:
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
		case StructurePackage.CLASS__TYPE_CONTAINER:
			if (resolve)
				return getTypeContainer();
			return basicGetTypeContainer();
		case StructurePackage.CLASS__TYPE_PARAM_BINDING:
			return getTypeParamBinding();
		case StructurePackage.CLASS__TYPE_DEFINITION:
			if (resolve)
				return getTypeDefinition();
			return basicGetTypeDefinition();
		case StructurePackage.CLASS__VIRTUAL_TYPE_BINDING:
			return getVirtualTypeBinding();
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
		case StructurePackage.CLASS__TYPE_CONTAINER:
			setTypeContainer((TypeContainer) newValue);
			return;
		case StructurePackage.CLASS__TYPE_PARAM_BINDING:
			getTypeParamBinding().clear();
			getTypeParamBinding().addAll(
					(Collection<? extends TypeVariableBinding>) newValue);
			return;
		case StructurePackage.CLASS__TYPE_DEFINITION:
			setTypeDefinition((GenericTypeDefinition) newValue);
			return;
		case StructurePackage.CLASS__VIRTUAL_TYPE_BINDING:
			getVirtualTypeBinding().clear();
			getVirtualTypeBinding().addAll(
					(Collection<? extends TypeVariableBinding>) newValue);
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
		case StructurePackage.CLASS__TYPE_CONTAINER:
			setTypeContainer((TypeContainer) null);
			return;
		case StructurePackage.CLASS__TYPE_PARAM_BINDING:
			getTypeParamBinding().clear();
			return;
		case StructurePackage.CLASS__TYPE_DEFINITION:
			setTypeDefinition((GenericTypeDefinition) null);
			return;
		case StructurePackage.CLASS__VIRTUAL_TYPE_BINDING:
			getVirtualTypeBinding().clear();
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
		case StructurePackage.CLASS__TYPE_CONTAINER:
			return basicGetTypeContainer() != null;
		case StructurePackage.CLASS__TYPE_PARAM_BINDING:
			return typeParamBinding != null && !typeParamBinding.isEmpty();
		case StructurePackage.CLASS__TYPE_DEFINITION:
			return typeDefinition != null;
		case StructurePackage.CLASS__VIRTUAL_TYPE_BINDING:
			return virtualTypeBinding != null && !virtualTypeBinding.isEmpty();
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
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
			case StructurePackage.CLASS__TYPE_CONTAINER:
				return StructurePackage.TYPE__TYPE_CONTAINER;
			default:
				return -1;
			}
		}
		if (baseClass == ParameterizedType.class) {
			switch (derivedFeatureID) {
			case StructurePackage.CLASS__TYPE_PARAM_BINDING:
				return StructurePackage.PARAMETERIZED_TYPE__TYPE_PARAM_BINDING;
			case StructurePackage.CLASS__TYPE_DEFINITION:
				return StructurePackage.PARAMETERIZED_TYPE__TYPE_DEFINITION;
			case StructurePackage.CLASS__VIRTUAL_TYPE_BINDING:
				return StructurePackage.PARAMETERIZED_TYPE__VIRTUAL_TYPE_BINDING;
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
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
			case StructurePackage.TYPE__TYPE_CONTAINER:
				return StructurePackage.CLASS__TYPE_CONTAINER;
			default:
				return -1;
			}
		}
		if (baseClass == ParameterizedType.class) {
			switch (baseFeatureID) {
			case StructurePackage.PARAMETERIZED_TYPE__TYPE_PARAM_BINDING:
				return StructurePackage.CLASS__TYPE_PARAM_BINDING;
			case StructurePackage.PARAMETERIZED_TYPE__TYPE_DEFINITION:
				return StructurePackage.CLASS__TYPE_DEFINITION;
			case StructurePackage.PARAMETERIZED_TYPE__VIRTUAL_TYPE_BINDING:
				return StructurePackage.CLASS__VIRTUAL_TYPE_BINDING;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ClassImpl
