/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelTypeImpl.java,v 1.9 2008-11-27 15:49:50 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import java.util.Collection;

import kermeta.language.structure.Model;
import kermeta.language.structure.ModelType;
import kermeta.language.structure.NamedElement;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.TypeDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.ModelTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ModelTypeImpl#getIsAspect <em>Is Aspect</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ModelTypeImpl#getIncludedTypeDefinition <em>Included Type Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelTypeImpl extends TypeImpl implements ModelType {
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
	 * The cached value of the '{@link #getIncludedTypeDefinition() <em>Included Type Definition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludedTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDefinition> includedTypeDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.eINSTANCE.getModelType();
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
					StructurePackage.MODEL_TYPE__NAME, oldName, name));
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
					StructurePackage.MODEL_TYPE__IS_ASPECT, oldIsAspect,
					isAspect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDefinition> getIncludedTypeDefinition() {
		if (includedTypeDefinition == null) {
			includedTypeDefinition = new EObjectResolvingEList<TypeDefinition>(
					TypeDefinition.class, this,
					StructurePackage.MODEL_TYPE__INCLUDED_TYPE_DEFINITION);
		}
		return includedTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model _new() {

		kermeta.language.structure.Model result = null;

		result = (kermeta.language.structure.Model) org.kermeta.compil.runtime.ExecutionContext
				.getInstance()
				.<kermeta.language.structure.Model> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ModelTypeUtil
								.newObject(this));

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isModelTypeOf(Model m) {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.ExecutionContext
				.getInstance()
				.<java.lang.Boolean> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ModelTypeUtil
								.isModelTypeOf(this, m));

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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StructurePackage.MODEL_TYPE__NAME:
			return getName();
		case StructurePackage.MODEL_TYPE__IS_ASPECT:
			return getIsAspect();
		case StructurePackage.MODEL_TYPE__INCLUDED_TYPE_DEFINITION:
			return getIncludedTypeDefinition();
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
		case StructurePackage.MODEL_TYPE__NAME:
			setName((String) newValue);
			return;
		case StructurePackage.MODEL_TYPE__IS_ASPECT:
			setIsAspect((Boolean) newValue);
			return;
		case StructurePackage.MODEL_TYPE__INCLUDED_TYPE_DEFINITION:
			getIncludedTypeDefinition().clear();
			getIncludedTypeDefinition().addAll(
					(Collection<? extends TypeDefinition>) newValue);
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
		case StructurePackage.MODEL_TYPE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StructurePackage.MODEL_TYPE__IS_ASPECT:
			setIsAspect(IS_ASPECT_EDEFAULT);
			return;
		case StructurePackage.MODEL_TYPE__INCLUDED_TYPE_DEFINITION:
			getIncludedTypeDefinition().clear();
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
		case StructurePackage.MODEL_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case StructurePackage.MODEL_TYPE__IS_ASPECT:
			return IS_ASPECT_EDEFAULT == null ? isAspect != null
					: !IS_ASPECT_EDEFAULT.equals(isAspect);
		case StructurePackage.MODEL_TYPE__INCLUDED_TYPE_DEFINITION:
			return includedTypeDefinition != null
					&& !includedTypeDefinition.isEmpty();
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
			case StructurePackage.MODEL_TYPE__NAME:
				return StructurePackage.NAMED_ELEMENT__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == TypeDefinition.class) {
			switch (derivedFeatureID) {
			case StructurePackage.MODEL_TYPE__IS_ASPECT:
				return StructurePackage.TYPE_DEFINITION__IS_ASPECT;
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
				return StructurePackage.MODEL_TYPE__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == TypeDefinition.class) {
			switch (baseFeatureID) {
			case StructurePackage.TYPE_DEFINITION__IS_ASPECT:
				return StructurePackage.MODEL_TYPE__IS_ASPECT;
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

} //ModelTypeImpl
