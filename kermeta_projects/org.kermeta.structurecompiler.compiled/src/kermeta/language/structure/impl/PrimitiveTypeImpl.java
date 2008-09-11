/**
 * <copyright>
 * </copyright>
 *
 * $Id: PrimitiveTypeImpl.java,v 1.2 2008-09-11 12:34:47 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import ecore.EDataType;

import java.util.Collection;

import kermeta.language.structure.PrimitiveType;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.Traceability;
import kermeta.language.structure.Type;
import kermeta.language.structure.TypeContainer;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.PrimitiveTypeImpl#getContainedType <em>Contained Type</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PrimitiveTypeImpl#getEcoreModelElement <em>Ecore Model Element</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PrimitiveTypeImpl#getInstanceType <em>Instance Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimitiveTypeImpl extends DataTypeImpl implements PrimitiveType {
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
	protected EDataType ecoreModelElement;

	/**
	 * The cached value of the '{@link #getInstanceType() <em>Instance Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceType()
	 * @generated
	 * @ordered
	 */
	protected Type instanceType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.PRIMITIVE_TYPE;
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
					StructurePackage.PRIMITIVE_TYPE__CONTAINED_TYPE,
					StructurePackage.TYPE__TYPE_CONTAINER);
		}
		return containedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEcoreModelElement() {
		if (ecoreModelElement != null
				&& ((EObject) ecoreModelElement).eIsProxy()) {
			InternalEObject oldEcoreModelElement = (InternalEObject) ecoreModelElement;
			ecoreModelElement = (EDataType) eResolveProxy(oldEcoreModelElement);
			if (ecoreModelElement != oldEcoreModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							StructurePackage.PRIMITIVE_TYPE__ECORE_MODEL_ELEMENT,
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
	public EDataType basicGetEcoreModelElement() {
		return ecoreModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcoreModelElement(EDataType newEcoreModelElement) {
		EDataType oldEcoreModelElement = ecoreModelElement;
		ecoreModelElement = newEcoreModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.PRIMITIVE_TYPE__ECORE_MODEL_ELEMENT,
					oldEcoreModelElement, ecoreModelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getInstanceType() {
		if (instanceType != null && instanceType.eIsProxy()) {
			InternalEObject oldInstanceType = (InternalEObject) instanceType;
			instanceType = (Type) eResolveProxy(oldInstanceType);
			if (instanceType != oldInstanceType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StructurePackage.PRIMITIVE_TYPE__INSTANCE_TYPE,
							oldInstanceType, instanceType));
			}
		}
		return instanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetInstanceType() {
		return instanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceType(Type newInstanceType) {
		Type oldInstanceType = instanceType;
		instanceType = newInstanceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.PRIMITIVE_TYPE__INSTANCE_TYPE,
					oldInstanceType, instanceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBehaviorJava(KM2EcoreContext context) {

		java.lang.String result = null;

		result = "";

		java.lang.Boolean idIfCond_96 = false;
		idIfCond_96 = kermeta.standard.helper.BooleanWrapper.and(
				kermeta.standard.helper.BooleanWrapper.not(this.isValueType()),
				this.isEDataType());

		if (idIfCond_96) {

			result = this.getEMFEDataTypeInstanceClassName();
		}

		java.lang.Boolean idIfCond_97 = false;
		idIfCond_97 = kermeta.standard.helper.StringWrapper.equals(result, "");

		if (idIfCond_97) {

			result = this.getInstanceType().createBehaviorJava(context);
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void applyPass1(KM2EcoreContext context) {

		ecore.EDataType eModelElement = this.createEcoreModelElement(context);

		kermeta.language.structure.Package p = ((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.container(this),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.structure.Package")));

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<ecore.EClassifier> convertAsOrderedSet(
						p.getEcoreModelElement().getEClassifiers()).add(
						eModelElement);

		this.setEcoreModelElement(eModelElement);

		//BIft:eachOwnedElement

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft33 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_98 = false;
			while (!idLoopCond_98) {
				idLoopCond_98 = it_ft33.isOff();
				if (idLoopCond_98) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp33 = it_ft33.next();

					//BIle:func
					kermeta.language.structure.Tag cd_lbdExp32 = o_lbdExp33;

					cd_lbdExp32.applyPass1(context);
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
	public EDataType createEcoreModelElement(KM2EcoreContext context) {

		ecore.EDataType result = null;

		ecore.EDataType eModelElement = ((ecore.EDataType) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("ecore.EDataType"));

		eModelElement
				.setName(((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("km2ecore.helper.java.IdentifierHelper"))
						.getMangledIdentifier(this.getName(), context));

		eModelElement.setInstanceClassName("java.lang.Object");

		java.lang.String instanceClassName = this
				.getEMFEDataTypeInstanceClassName();

		java.lang.Boolean idIfCond_99 = false;
		idIfCond_99 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(instanceClassName, "");

		if (idIfCond_99) {

			eModelElement.setInstanceClassName(instanceClassName);

			kermeta.standard.OrderedSet<java.lang.String> etps = kermeta.standard.helper.StringWrapper
					.split(
							this
									.getUniqueTagValue("ecore.EDataType_eTypeParameters"),
							" , ");

			java.lang.Boolean idIfCond_100 = false;
			idIfCond_100 = kermeta.standard.helper.IntegerWrapper.isGreater(
					etps.size(), 0);

			if (idIfCond_100) {

				//BIft:each

				{

					kermeta.standard.Iterator<java.lang.String> it_ft34 = etps
							.iterator();
					java.lang.Boolean idLoopCond_101 = false;
					while (!idLoopCond_101) {
						idLoopCond_101 = it_ft34.isOff();
						if (idLoopCond_101) {
						} else {

							//BIle:func
							java.lang.String etp_lbdExp34 = it_ft34.next();

							java.lang.Boolean idIfCond_102 = false;
							idIfCond_102 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isNotEqual(etp_lbdExp34, "");

							if (idIfCond_102) {

								ecore.ETypeParameter ecoreTypeParameter = ((ecore.ETypeParameter) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject("ecore.ETypeParameter"));

								ecoreTypeParameter
										.setName(((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
												.newObject("km2ecore.helper.java.IdentifierHelper"))
												.getMangledIdentifier(
														etp_lbdExp34, context));

								org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
										.<ecore.ETypeParameter> convertAsOrderedSet(
												eModelElement
														.getETypeParameters())
										.add(ecoreTypeParameter);
							}

							//EIle:func

						}
					}
				}

				//EIft:each

			}

			eModelElement.setSerializable(this.getEMFEDataTypeIsSerializable());
		}

		java.lang.String qualifiedName = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asType(this.getClassFromPrimitiveType(),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.structure.Class")))
				.getTypeDefinition().qualifiedName();

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<ecore.EAnnotation> convertAsOrderedSet(
						eModelElement.getEAnnotations())
				.add(
						((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("km2ecore.helper.ecore.EAnnotationHelper"))
								.createKermetaEAnnotation(
										kermeta.standard.helper.StringWrapper
												.toString(km2ecore.helper.ecore.KermetaEAnnotationKey
														.getByName("alias")
														.getName()),
										qualifiedName));

		java.lang.Boolean idIfCond_103 = false;
		idIfCond_103 = kermeta.standard.helper.StringWrapper.equals(
				eModelElement.getInstanceClassName(), "");

		if (idIfCond_103) {

			eModelElement
					.setInstanceClassName(kermeta.standard.helper.StringWrapper
							.replace(qualifiedName, "::", "\\."));
		}

		result = eModelElement;

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
		case StructurePackage.PRIMITIVE_TYPE__CONTAINED_TYPE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getContainedType())
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
		case StructurePackage.PRIMITIVE_TYPE__CONTAINED_TYPE:
			return ((InternalEList<?>) getContainedType()).basicRemove(
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
		case StructurePackage.PRIMITIVE_TYPE__CONTAINED_TYPE:
			return getContainedType();
		case StructurePackage.PRIMITIVE_TYPE__ECORE_MODEL_ELEMENT:
			if (resolve)
				return getEcoreModelElement();
			return basicGetEcoreModelElement();
		case StructurePackage.PRIMITIVE_TYPE__INSTANCE_TYPE:
			if (resolve)
				return getInstanceType();
			return basicGetInstanceType();
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
		case StructurePackage.PRIMITIVE_TYPE__CONTAINED_TYPE:
			getContainedType().clear();
			getContainedType().addAll((Collection<? extends Type>) newValue);
			return;
		case StructurePackage.PRIMITIVE_TYPE__ECORE_MODEL_ELEMENT:
			setEcoreModelElement((EDataType) newValue);
			return;
		case StructurePackage.PRIMITIVE_TYPE__INSTANCE_TYPE:
			setInstanceType((Type) newValue);
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
		case StructurePackage.PRIMITIVE_TYPE__CONTAINED_TYPE:
			getContainedType().clear();
			return;
		case StructurePackage.PRIMITIVE_TYPE__ECORE_MODEL_ELEMENT:
			setEcoreModelElement((EDataType) null);
			return;
		case StructurePackage.PRIMITIVE_TYPE__INSTANCE_TYPE:
			setInstanceType((Type) null);
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
		case StructurePackage.PRIMITIVE_TYPE__CONTAINED_TYPE:
			return containedType != null && !containedType.isEmpty();
		case StructurePackage.PRIMITIVE_TYPE__ECORE_MODEL_ELEMENT:
			return ecoreModelElement != null;
		case StructurePackage.PRIMITIVE_TYPE__INSTANCE_TYPE:
			return instanceType != null;
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
			case StructurePackage.PRIMITIVE_TYPE__CONTAINED_TYPE:
				return StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE;
			default:
				return -1;
			}
		}
		if (baseClass == Traceability.class) {
			switch (derivedFeatureID) {
			case StructurePackage.PRIMITIVE_TYPE__ECORE_MODEL_ELEMENT:
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
				return StructurePackage.PRIMITIVE_TYPE__CONTAINED_TYPE;
			default:
				return -1;
			}
		}
		if (baseClass == Traceability.class) {
			switch (baseFeatureID) {
			case StructurePackage.TRACEABILITY__ECORE_MODEL_ELEMENT:
				return StructurePackage.PRIMITIVE_TYPE__ECORE_MODEL_ELEMENT;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PrimitiveTypeImpl
