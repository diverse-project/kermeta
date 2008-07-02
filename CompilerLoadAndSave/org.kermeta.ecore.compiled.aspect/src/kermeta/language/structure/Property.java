/**
 * <copyright>
 * </copyright>
 *
 * $Id: Property.java,v 1.1 2008-07-02 09:43:45 ftanguy Exp $
 */
package kermeta.language.structure;

import kermeta.language.behavior.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.Property#get_default <em>default</em>}</li>
 *   <li>{@link kermeta.language.structure.Property#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link kermeta.language.structure.Property#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link kermeta.language.structure.Property#getGetterBody <em>Getter Body</em>}</li>
 *   <li>{@link kermeta.language.structure.Property#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link kermeta.language.structure.Property#getSetterBody <em>Setter Body</em>}</li>
 *   <li>{@link kermeta.language.structure.Property#isIsID <em>Is ID</em>}</li>
 *   <li>{@link kermeta.language.structure.Property#getOwningClass <em>Owning Class</em>}</li>
 *   <li>{@link kermeta.language.structure.Property#isIsSetterAbstract <em>Is Setter Abstract</em>}</li>
 *   <li>{@link kermeta.language.structure.Property#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link kermeta.language.structure.Property#isIsGetterAbstract <em>Is Getter Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getProperty()
 * @model annotation="kermeta documentation='Class representing the property definition. Kermeta<->Ecore equivalence:\n - Property with isComposite == true or with type is a base type (String, Integer, Boolean)  : EAttribute\n - Property with isComposite == false : EReference'"
 * @generated
 */
public interface Property extends MultiplicityElement {
	/**
	 * Returns the value of the '<em><b>default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>default</em>' attribute.
	 * @see #set_default(String)
	 * @see kermeta.language.structure.StructurePackage#getProperty__default()
	 * @model dataType="kermeta.standard.String"
	 *        annotation="kermeta documentation='To be written'"
	 * @generated
	 */
	String get_default();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Property#get_default <em>default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>default</em>' attribute.
	 * @see #get_default()
	 * @generated
	 */
	void set_default(String value);

	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(boolean)
	 * @see kermeta.language.structure.StructurePackage#getProperty_IsDerived()
	 * @model dataType="kermeta.standard.Boolean"
	 *        annotation="kermeta documentation='If True, the value of the property is not stored but computed from other properties'"
	 * @generated
	 */
	boolean isIsDerived();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Property#isIsDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #isIsDerived()
	 * @generated
	 */
	void setIsDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(Property)
	 * @see kermeta.language.structure.StructurePackage#getProperty_Opposite()
	 * @model annotation="kermeta documentation='Opposite Property of the Property, void if the Property has no opposite'"
	 * @generated
	 */
	Property getOpposite();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Property#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(Property value);

	/**
	 * Returns the value of the '<em><b>Getter Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Getter Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Getter Body</em>' containment reference.
	 * @see #setGetterBody(Expression)
	 * @see kermeta.language.structure.StructurePackage#getProperty_GetterBody()
	 * @model containment="true"
	 *        annotation="kermeta documentation='To be written'"
	 * @generated
	 */
	Expression getGetterBody();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Property#getGetterBody <em>Getter Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Getter Body</em>' containment reference.
	 * @see #getGetterBody()
	 * @generated
	 */
	void setGetterBody(Expression value);

	/**
	 * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Read Only</em>' attribute.
	 * @see #setIsReadOnly(boolean)
	 * @see kermeta.language.structure.StructurePackage#getProperty_IsReadOnly()
	 * @model dataType="kermeta.standard.Boolean"
	 *        annotation="kermeta documentation='Boolean stating whether the Property is read-only'"
	 * @generated
	 */
	boolean isIsReadOnly();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Property#isIsReadOnly <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Only</em>' attribute.
	 * @see #isIsReadOnly()
	 * @generated
	 */
	void setIsReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Setter Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setter Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setter Body</em>' containment reference.
	 * @see #setSetterBody(Expression)
	 * @see kermeta.language.structure.StructurePackage#getProperty_SetterBody()
	 * @model containment="true"
	 *        annotation="kermeta documentation='To be written'"
	 * @generated
	 */
	Expression getSetterBody();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Property#getSetterBody <em>Setter Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setter Body</em>' containment reference.
	 * @see #getSetterBody()
	 * @generated
	 */
	void setSetterBody(Expression value);

	/**
	 * Returns the value of the '<em><b>Is ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is ID</em>' attribute.
	 * @see #setIsID(boolean)
	 * @see kermeta.language.structure.StructurePackage#getProperty_IsID()
	 * @model dataType="kermeta.standard.Boolean"
	 *        annotation="kermeta documentation='Boolean stating whether the property allows to identify its containing Object'"
	 * @generated
	 */
	boolean isIsID();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Property#isIsID <em>Is ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is ID</em>' attribute.
	 * @see #isIsID()
	 * @generated
	 */
	void setIsID(boolean value);

	/**
	 * Returns the value of the '<em><b>Owning Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.ClassDefinition#getOwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Class</em>' container reference.
	 * @see #setOwningClass(ClassDefinition)
	 * @see kermeta.language.structure.StructurePackage#getProperty_OwningClass()
	 * @see kermeta.language.structure.ClassDefinition#getOwnedAttribute
	 * @model opposite="ownedAttribute" transient="false"
	 *        annotation="kermeta documentation='ClassDefinition that owns the Property'"
	 * @generated
	 */
	ClassDefinition getOwningClass();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Property#getOwningClass <em>Owning Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Class</em>' container reference.
	 * @see #getOwningClass()
	 * @generated
	 */
	void setOwningClass(ClassDefinition value);

	/**
	 * Returns the value of the '<em><b>Is Setter Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Setter Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Setter Abstract</em>' attribute.
	 * @see #setIsSetterAbstract(boolean)
	 * @see kermeta.language.structure.StructurePackage#getProperty_IsSetterAbstract()
	 * @model dataType="kermeta.standard.Boolean"
	 *        annotation="kermeta documentation='Boolean stating wether the setter is abstract.'"
	 * @generated
	 */
	boolean isIsSetterAbstract();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Property#isIsSetterAbstract <em>Is Setter Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Setter Abstract</em>' attribute.
	 * @see #isIsSetterAbstract()
	 * @generated
	 */
	void setIsSetterAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Composite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Composite</em>' attribute.
	 * @see #setIsComposite(boolean)
	 * @see kermeta.language.structure.StructurePackage#getProperty_IsComposite()
	 * @model dataType="kermeta.standard.Boolean"
	 *        annotation="kermeta documentation='Boolean stating whether the Property has a containment role'"
	 * @generated
	 */
	boolean isIsComposite();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Property#isIsComposite <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composite</em>' attribute.
	 * @see #isIsComposite()
	 * @generated
	 */
	void setIsComposite(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Getter Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Getter Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Getter Abstract</em>' attribute.
	 * @see #setIsGetterAbstract(boolean)
	 * @see kermeta.language.structure.StructurePackage#getProperty_IsGetterAbstract()
	 * @model dataType="kermeta.standard.Boolean"
	 *        annotation="kermeta documentation='Boolean stating wether the getter is abstract.'"
	 * @generated
	 */
	boolean isIsGetterAbstract();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Property#isIsGetterAbstract <em>Is Getter Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Getter Abstract</em>' attribute.
	 * @see #isIsGetterAbstract()
	 * @generated
	 */
	void setIsGetterAbstract(boolean value);

} // Property
