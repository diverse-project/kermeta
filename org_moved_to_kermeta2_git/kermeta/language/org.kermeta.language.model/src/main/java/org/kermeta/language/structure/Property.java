/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure;


import org.eclipse.emf.common.util.EList;

import org.kermeta.language.behavior.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Class representing the property definition. Kermeta<->Ecore equivalence:
 *  - Property with isComposite == true or with type is a base type (String, Integer, Boolean)  : EAttribute
 *  - Property with isComposite == false : EReference
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.Property#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Property#getIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Property#getDefault <em>Default</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Property#getIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Property#getIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Property#getIsID <em>Is ID</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Property#getGetterBody <em>Getter Body</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Property#getSetterBody <em>Setter Body</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Property#getIsGetterAbstract <em>Is Getter Abstract</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Property#getIsSetterAbstract <em>Is Setter Abstract</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Property#getOwnedUnresolvedProperties <em>Owned Unresolved Properties</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Property#getOwningClass <em>Owning Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends MultiplicityElement, AbstractProperty {
	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Opposite Property of the Property, void if the Property has no opposite
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(AbstractProperty)
	 * @see org.kermeta.language.structure.StructurePackage#getProperty_Opposite()
	 * @model
	 * @generated
	 */
	AbstractProperty getOpposite();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.Property#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(AbstractProperty value);

	/**
	 * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean stating whether the Property is read-only
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Read Only</em>' attribute.
	 * @see #setIsReadOnly(Boolean)
	 * @see org.kermeta.language.structure.StructurePackage#getProperty_IsReadOnly()
	 * @model default="false" dataType="org.kermeta.language.structure.Boolean"
	 * @generated
	 */
	Boolean getIsReadOnly();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.Property#getIsReadOnly <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Only</em>' attribute.
	 * @see #getIsReadOnly()
	 * @generated
	 */
	void setIsReadOnly(Boolean value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To be written
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see org.kermeta.language.structure.StructurePackage#getProperty_Default()
	 * @model dataType="org.kermeta.language.structure.String"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.Property#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean stating whether the Property has a containment role
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Composite</em>' attribute.
	 * @see #setIsComposite(Boolean)
	 * @see org.kermeta.language.structure.StructurePackage#getProperty_IsComposite()
	 * @model default="false" dataType="org.kermeta.language.structure.Boolean"
	 * @generated
	 */
	Boolean getIsComposite();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.Property#getIsComposite <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composite</em>' attribute.
	 * @see #getIsComposite()
	 * @generated
	 */
	void setIsComposite(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If True, the value of the property is not stored but computed from other properties
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(Boolean)
	 * @see org.kermeta.language.structure.StructurePackage#getProperty_IsDerived()
	 * @model default="false" dataType="org.kermeta.language.structure.Boolean"
	 * @generated
	 */
	Boolean getIsDerived();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.Property#getIsDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #getIsDerived()
	 * @generated
	 */
	void setIsDerived(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is ID</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean stating whether the property allows to identify its containing Object
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is ID</em>' attribute.
	 * @see #setIsID(Boolean)
	 * @see org.kermeta.language.structure.StructurePackage#getProperty_IsID()
	 * @model default="false" dataType="org.kermeta.language.structure.Boolean"
	 * @generated
	 */
	Boolean getIsID();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.Property#getIsID <em>Is ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is ID</em>' attribute.
	 * @see #getIsID()
	 * @generated
	 */
	void setIsID(Boolean value);

	/**
	 * Returns the value of the '<em><b>Getter Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To be written
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Getter Body</em>' containment reference.
	 * @see #setGetterBody(Expression)
	 * @see org.kermeta.language.structure.StructurePackage#getProperty_GetterBody()
	 * @model containment="true"
	 * @generated
	 */
	Expression getGetterBody();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.Property#getGetterBody <em>Getter Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Getter Body</em>' containment reference.
	 * @see #getGetterBody()
	 * @generated
	 */
	void setGetterBody(Expression value);

	/**
	 * Returns the value of the '<em><b>Setter Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To be written
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Setter Body</em>' containment reference.
	 * @see #setSetterBody(Expression)
	 * @see org.kermeta.language.structure.StructurePackage#getProperty_SetterBody()
	 * @model containment="true"
	 * @generated
	 */
	Expression getSetterBody();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.Property#getSetterBody <em>Setter Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setter Body</em>' containment reference.
	 * @see #getSetterBody()
	 * @generated
	 */
	void setSetterBody(Expression value);

	/**
	 * Returns the value of the '<em><b>Is Getter Abstract</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean stating wether the getter is abstract.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Getter Abstract</em>' attribute.
	 * @see #setIsGetterAbstract(Boolean)
	 * @see org.kermeta.language.structure.StructurePackage#getProperty_IsGetterAbstract()
	 * @model default="true" dataType="org.kermeta.language.structure.Boolean"
	 * @generated
	 */
	Boolean getIsGetterAbstract();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.Property#getIsGetterAbstract <em>Is Getter Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Getter Abstract</em>' attribute.
	 * @see #getIsGetterAbstract()
	 * @generated
	 */
	void setIsGetterAbstract(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Setter Abstract</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean stating wether the setter is abstract.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Setter Abstract</em>' attribute.
	 * @see #setIsSetterAbstract(Boolean)
	 * @see org.kermeta.language.structure.StructurePackage#getProperty_IsSetterAbstract()
	 * @model default="true" dataType="org.kermeta.language.structure.Boolean"
	 * @generated
	 */
	Boolean getIsSetterAbstract();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.Property#getIsSetterAbstract <em>Is Setter Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Setter Abstract</em>' attribute.
	 * @see #getIsSetterAbstract()
	 * @generated
	 */
	void setIsSetterAbstract(Boolean value);

	/**
	 * Returns the value of the '<em><b>Owned Unresolved Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.UnresolvedProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Unresolved Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Unresolved Properties</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getProperty_OwnedUnresolvedProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnresolvedProperty> getOwnedUnresolvedProperties();

	/**
	 * Returns the value of the '<em><b>Owning Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.kermeta.language.structure.ClassDefinition#getOwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ClassDefinition that owns the Property
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Class</em>' container reference.
	 * @see #setOwningClass(ClassDefinition)
	 * @see org.kermeta.language.structure.StructurePackage#getProperty_OwningClass()
	 * @see org.kermeta.language.structure.ClassDefinition#getOwnedAttribute
	 * @model opposite="ownedAttribute" transient="false"
	 * @generated
	 */
	ClassDefinition getOwningClass();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.Property#getOwningClass <em>Owning Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Class</em>' container reference.
	 * @see #getOwningClass()
	 * @generated
	 */
	void setOwningClass(ClassDefinition value);

} // Property
