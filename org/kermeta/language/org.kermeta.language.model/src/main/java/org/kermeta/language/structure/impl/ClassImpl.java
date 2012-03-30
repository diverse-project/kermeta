/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure.impl;


import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.kermeta.language.structure.Class;
import org.kermeta.language.structure.NamedElement;
import org.kermeta.language.structure.Operation;
import org.kermeta.language.structure.Property;
import org.kermeta.language.structure.StructureFactory;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.Type;
import org.kermeta.language.structure.TypeVariableBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.ClassImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ClassImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ClassImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ClassImpl#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ClassImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends ParameterizedTypeImpl implements org.kermeta.language.structure.Class
{
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
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ClassImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return StructurePackage.Literals.CLASS;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
  	public EList<Property> getOwnedAttribute()
  	{
	  return ((org.kermeta.language.structure.ClassDefinition)this.getTypeDefinition()).getOwnedAttribute();
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
  	public EList<Operation> getOwnedOperation()
	{
		return ((org.kermeta.language.structure.ClassDefinition)this.getTypeDefinition()).getOwnedOperation();
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  	public EList<org.kermeta.language.structure.Class> getSuperClass()
  	{
  		BasicEList<org.kermeta.language.structure.Class> result = new BasicEList<org.kermeta.language.structure.Class>();
  		for(Type t : this.getTypeDefinition().getSuperType()){
  			if(t instanceof org.kermeta.language.structure.Class){
  				result.add((Class) t);
  			}
  		}
  		return result;
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
	 * Convenient method that returns the name of this Class calculated from the ClassDefinition and the optionnal type parameters
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName()
	{	  	
		StringBuilder sb = new StringBuilder();
		sb.append(this.getTypeDefinition().getName());
		if(this.getTypeParamBinding().size() > 0){
			sb.append("[");
			boolean first = true;
			for(TypeVariableBinding tpb : this.getTypeParamBinding()){
				if(!first) {
					sb.append(", ");
					first = false;
				}
				if(tpb.getType() instanceof NamedElement){
					sb.append(((NamedElement)tpb.getType()).getName());
				}
			}
			sb.append("]");
		}
		return sb.toString();
	}

  

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case StructurePackage.CLASS__OWNED_ATTRIBUTE:
				return getOwnedAttribute();
			case StructurePackage.CLASS__OWNED_OPERATION:
				return getOwnedOperation();
			case StructurePackage.CLASS__SUPER_CLASS:
				return getSuperClass();
			case StructurePackage.CLASS__IS_ABSTRACT:
				return getIsAbstract();
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case StructurePackage.CLASS__OWNED_ATTRIBUTE:
				return !getOwnedAttribute().isEmpty();
			case StructurePackage.CLASS__OWNED_OPERATION:
				return !getOwnedOperation().isEmpty();
			case StructurePackage.CLASS__SUPER_CLASS:
				return !getSuperClass().isEmpty();
			case StructurePackage.CLASS__IS_ABSTRACT:
				return IS_ABSTRACT_EDEFAULT == null ? isAbstract != null : !IS_ABSTRACT_EDEFAULT.equals(isAbstract);
			case StructurePackage.CLASS__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated NOT
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(", name: ");
		result.append(getName());
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
		} else if ((o instanceof org.kermeta.language.structure.Class)
				&& (null != ((org.kermeta.language.structure.Class) o)
						.getTypeDefinition())
				&& (null != getTypeDefinition())
				&& ((org.kermeta.language.structure.Class) o)
						.getTypeDefinition().equals(getTypeDefinition())
				&& ((org.kermeta.language.structure.Class) o)
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
