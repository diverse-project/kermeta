/**
 * <copyright>
 * </copyright>
 *
 * $Id: EnumerationImpl.java,v 1.9 2008-11-27 15:49:50 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import ecore.EEnum;

import java.util.Collection;

import kermeta.language.structure.DataType;
import kermeta.language.structure.Enumeration;
import kermeta.language.structure.EnumerationLiteral;
import kermeta.language.structure.NamedElement;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.Type;
import kermeta.language.structure.TypeContainer;
import kermeta.language.structure.TypeDefinition;

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
 * An implementation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.EnumerationImpl#getTypeContainer <em>Type Container</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.EnumerationImpl#getName <em>Name</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.EnumerationImpl#getIsAspect <em>Is Aspect</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.EnumerationImpl#getOwnedLiteral <em>Owned Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationImpl extends TraceabilityImpl<EEnum> implements
		Enumeration {
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
	 * The cached value of the '{@link #getOwnedLiteral() <em>Owned Literal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLiteral()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationLiteral> ownedLiteral;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.eINSTANCE.getEnumeration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeContainer getTypeContainer() {
		if (eContainerFeatureID != StructurePackage.ENUMERATION__TYPE_CONTAINER)
			return null;
		return (TypeContainer) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeContainer basicGetTypeContainer() {
		if (eContainerFeatureID != StructurePackage.ENUMERATION__TYPE_CONTAINER)
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
				StructurePackage.ENUMERATION__TYPE_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeContainer(TypeContainer newTypeContainer) {
		if (newTypeContainer != eInternalContainer()
				|| (eContainerFeatureID != StructurePackage.ENUMERATION__TYPE_CONTAINER && newTypeContainer != null)) {
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
					StructurePackage.ENUMERATION__TYPE_CONTAINER,
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
					StructurePackage.ENUMERATION__NAME, oldName, name));
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
					StructurePackage.ENUMERATION__IS_ASPECT, oldIsAspect,
					isAspect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationLiteral> getOwnedLiteral() {
		if (ownedLiteral == null) {
			ownedLiteral = new EObjectContainmentWithInverseEList.Resolving<EnumerationLiteral>(
					EnumerationLiteral.class, this,
					StructurePackage.ENUMERATION__OWNED_LITERAL,
					StructurePackage.ENUMERATION_LITERAL__ENUMERATION);
		}
		return ownedLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBehaviorJava(KM2EcoreContext context) {

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
	public kermeta.language.structure.Object clone(
			kermeta.language.structure.Object objectToClone) {

		kermeta.language.structure.Object result = null;

		if (true)
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
					"NOT IMPLEMENTED");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void applyPass1(KM2EcoreContext context) {

		ecore.EEnum ecoreEnumeration = this.createEcoreModelElement(context);

		kermeta.language.structure.Package p = ((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(this),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.structure.Package")));

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<ecore.EClassifier> convertAsOrderedSet(
						p.getEcoreModelElement().getEClassifiers()).add(
						ecoreEnumeration);

		this.setEcoreModelElement(ecoreEnumeration);

		//BIft:eachOwnedElement

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft45 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_194 = false;
			while (!idLoopCond_194) {
				idLoopCond_194 = it_ft45.isOff();
				if (idLoopCond_194) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp45 = it_ft45.next();

					//BIle:func
					kermeta.language.structure.Tag l_lbdExp44 = o_lbdExp45;

					l_lbdExp44.applyPass1(context);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.EnumerationLiteral> it_ft46 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.EnumerationLiteral> convertAsOrderedSet(
							this.getOwnedLiteral()).iterator();
			java.lang.Boolean idLoopCond_195 = false;
			while (!idLoopCond_195) {
				idLoopCond_195 = it_ft46.isOff();
				if (idLoopCond_195) {
				} else {

					//BIle:func
					kermeta.language.structure.EnumerationLiteral l_lbdExp46 = it_ft46
							.next();

					//BIle:func
					kermeta.language.structure.EnumerationLiteral l_lbdExp44 = l_lbdExp46;

					l_lbdExp44.applyPass1(context);
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
	public EEnum createEcoreModelElement(KM2EcoreContext context) {

		ecore.EEnum result = null;

		ecore.EEnum ecoreEnumeration = ((ecore.EEnum) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("ecore.EEnum"));

		ecoreEnumeration
				.setName(((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("km2ecore.helper.java.IdentifierHelper"))
						.getMangledIdentifier(this.getName(), context));

		result = ecoreEnumeration;

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
		case StructurePackage.ENUMERATION__TYPE_CONTAINER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetTypeContainer((TypeContainer) otherEnd, msgs);
		case StructurePackage.ENUMERATION__OWNED_LITERAL:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedLiteral())
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
		case StructurePackage.ENUMERATION__TYPE_CONTAINER:
			return basicSetTypeContainer(null, msgs);
		case StructurePackage.ENUMERATION__OWNED_LITERAL:
			return ((InternalEList<?>) getOwnedLiteral()).basicRemove(otherEnd,
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
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
		case StructurePackage.ENUMERATION__TYPE_CONTAINER:
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
		case StructurePackage.ENUMERATION__TYPE_CONTAINER:
			if (resolve)
				return getTypeContainer();
			return basicGetTypeContainer();
		case StructurePackage.ENUMERATION__NAME:
			return getName();
		case StructurePackage.ENUMERATION__IS_ASPECT:
			return getIsAspect();
		case StructurePackage.ENUMERATION__OWNED_LITERAL:
			return getOwnedLiteral();
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
		case StructurePackage.ENUMERATION__TYPE_CONTAINER:
			setTypeContainer((TypeContainer) newValue);
			return;
		case StructurePackage.ENUMERATION__NAME:
			setName((String) newValue);
			return;
		case StructurePackage.ENUMERATION__IS_ASPECT:
			setIsAspect((Boolean) newValue);
			return;
		case StructurePackage.ENUMERATION__OWNED_LITERAL:
			getOwnedLiteral().clear();
			getOwnedLiteral().addAll(
					(Collection<? extends EnumerationLiteral>) newValue);
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
		case StructurePackage.ENUMERATION__TYPE_CONTAINER:
			setTypeContainer((TypeContainer) null);
			return;
		case StructurePackage.ENUMERATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StructurePackage.ENUMERATION__IS_ASPECT:
			setIsAspect(IS_ASPECT_EDEFAULT);
			return;
		case StructurePackage.ENUMERATION__OWNED_LITERAL:
			getOwnedLiteral().clear();
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
		case StructurePackage.ENUMERATION__TYPE_CONTAINER:
			return basicGetTypeContainer() != null;
		case StructurePackage.ENUMERATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case StructurePackage.ENUMERATION__IS_ASPECT:
			return IS_ASPECT_EDEFAULT == null ? isAspect != null
					: !IS_ASPECT_EDEFAULT.equals(isAspect);
		case StructurePackage.ENUMERATION__OWNED_LITERAL:
			return ownedLiteral != null && !ownedLiteral.isEmpty();
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
			case StructurePackage.ENUMERATION__TYPE_CONTAINER:
				return StructurePackage.TYPE__TYPE_CONTAINER;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
			case StructurePackage.ENUMERATION__NAME:
				return StructurePackage.NAMED_ELEMENT__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == TypeDefinition.class) {
			switch (derivedFeatureID) {
			case StructurePackage.ENUMERATION__IS_ASPECT:
				return StructurePackage.TYPE_DEFINITION__IS_ASPECT;
			default:
				return -1;
			}
		}
		if (baseClass == DataType.class) {
			switch (derivedFeatureID) {
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
				return StructurePackage.ENUMERATION__TYPE_CONTAINER;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
			case StructurePackage.NAMED_ELEMENT__NAME:
				return StructurePackage.ENUMERATION__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == TypeDefinition.class) {
			switch (baseFeatureID) {
			case StructurePackage.TYPE_DEFINITION__IS_ASPECT:
				return StructurePackage.ENUMERATION__IS_ASPECT;
			default:
				return -1;
			}
		}
		if (baseClass == DataType.class) {
			switch (baseFeatureID) {
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
		result.append(')');
		return result.toString();
	}

} //EnumerationImpl
