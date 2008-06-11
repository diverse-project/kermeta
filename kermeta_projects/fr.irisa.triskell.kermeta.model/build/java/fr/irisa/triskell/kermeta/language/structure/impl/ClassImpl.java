/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClassImpl.java,v 1.7 2008-06-11 20:26:33 cfaucher Exp $
 */
package fr.irisa.triskell.kermeta.language.structure.impl;

import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructurePackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.ClassImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.ClassImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.ClassImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.ClassImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.ClassImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends ParameterizedTypeImpl implements fr.irisa.triskell.kermeta.language.structure.Class {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "IRISA / INRIA / Universite de Rennes 1";

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
	protected EList<fr.irisa.triskell.kermeta.language.structure.Class> superClass;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

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
	public EList<Property> getOwnedAttribute() {
		if (ownedAttribute == null) {
			ownedAttribute = new EObjectResolvingEList<Property>(Property.class, this, StructurePackage.CLASS__OWNED_ATTRIBUTE);
		}
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOwnedOperation() {
		if (ownedOperation == null) {
			ownedOperation = new EObjectResolvingEList<Operation>(Operation.class, this, StructurePackage.CLASS__OWNED_OPERATION);
		}
		return ownedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fr.irisa.triskell.kermeta.language.structure.Class> getSuperClass() {
		if (superClass == null) {
			superClass = new EObjectResolvingEList<fr.irisa.triskell.kermeta.language.structure.Class>(fr.irisa.triskell.kermeta.language.structure.Class.class, this, StructurePackage.CLASS__SUPER_CLASS);
		}
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurePackage.CLASS__OWNED_ATTRIBUTE:
				return getOwnedAttribute();
			case StructurePackage.CLASS__OWNED_OPERATION:
				return getOwnedOperation();
			case StructurePackage.CLASS__SUPER_CLASS:
				return getSuperClass();
			case StructurePackage.CLASS__IS_ABSTRACT:
				return isIsAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case StructurePackage.CLASS__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StructurePackage.CLASS__OWNED_ATTRIBUTE:
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case StructurePackage.CLASS__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
			case StructurePackage.CLASS__SUPER_CLASS:
				return superClass != null && !superClass.isEmpty();
			case StructurePackage.CLASS__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case StructurePackage.CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	/**
	 * Unparameterized classes with the same type definition are equal
	 * 
	 * @generated NOT
	 */
	public boolean equals(Object o) {
		if (super.equals(o)) {
			return true;
		} else if ((o instanceof fr.irisa.triskell.kermeta.language.structure.Class)
				&& (null != ((fr.irisa.triskell.kermeta.language.structure.Class) o)
						.getTypeDefinition())
				&& (null != getTypeDefinition())
				&& ((fr.irisa.triskell.kermeta.language.structure.Class) o)
						.getTypeDefinition().equals(getTypeDefinition())
				&& ((fr.irisa.triskell.kermeta.language.structure.Class) o)
						.getTypeDefinition().getTypeParameter().isEmpty()
				&& getTypeDefinition().getTypeParameter().isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Objects that are equals() should always yield the same hashCode()
	 * 
	 * @generated NOT
	 */
	public int hashCode() {
		// If there are type parameters, all bets are off
		if (!getTypeParamBinding().isEmpty()) {
			return super.hashCode();
		} else {
			int code = 11;
			code += null == getTypeDefinition() ? 0 : 31 * getTypeDefinition()
					.hashCode();
			return code;
		}

	}

} //ClassImpl