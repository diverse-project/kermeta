/**
 * <copyright>
 * </copyright>
 *
 * $Id: Property.java,v 1.5 2007-10-02 15:15:46 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.language.structure;

import fr.irisa.triskell.kermeta.language.behavior.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Property#getGetterBody <em>Getter Body</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Property#getSetterBody <em>Setter Body</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Property#isIsGetterAbstract <em>Is Getter Abstract</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Property#isIsSetterAbstract <em>Is Setter Abstract</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Property#getOwningClass <em>Owning Class</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Property#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Property#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Property#getDefault <em>Default</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Property#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Property#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Property#isIsID <em>Is ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends MultiplicityElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

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
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getProperty_GetterBody()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Expression getGetterBody();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.Property#getGetterBody <em>Getter Body</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Setter Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setter Body</em>' containment reference.
	 * @see #setSetterBody(Expression)
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getProperty_SetterBody()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Expression getSetterBody();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.Property#getSetterBody <em>Setter Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setter Body</em>' containment reference.
	 * @see #getSetterBody()
	 * @generated
	 */
	void setSetterBody(Expression value);

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
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getProperty_IsGetterAbstract()
	 * @model dataType="fr.irisa.triskell.kermeta.language.structure.Boolean"
	 * @generated
	 */
	boolean isIsGetterAbstract();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.Property#isIsGetterAbstract <em>Is Getter Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Getter Abstract</em>' attribute.
	 * @see #isIsGetterAbstract()
	 * @generated
	 */
	void setIsGetterAbstract(boolean value);

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
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getProperty_IsSetterAbstract()
	 * @model dataType="fr.irisa.triskell.kermeta.language.structure.Boolean"
	 * @generated
	 */
	boolean isIsSetterAbstract();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.Property#isIsSetterAbstract <em>Is Setter Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Setter Abstract</em>' attribute.
	 * @see #isIsSetterAbstract()
	 * @generated
	 */
	void setIsSetterAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Owning Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.language.structure.ClassDefinition#getOwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Class</em>' container reference.
	 * @see #setOwningClass(ClassDefinition)
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getProperty_OwningClass()
	 * @see fr.irisa.triskell.kermeta.language.structure.ClassDefinition#getOwnedAttribute
	 * @model opposite="ownedAttribute" transient="false"
	 * @generated
	 */
	ClassDefinition getOwningClass();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.Property#getOwningClass <em>Owning Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Class</em>' container reference.
	 * @see #getOwningClass()
	 * @generated
	 */
	void setOwningClass(ClassDefinition value);

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
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getProperty_Opposite()
	 * @model
	 * @generated
	 */
	Property getOpposite();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.Property#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(Property value);

	/**
	 * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Read Only</em>' attribute.
	 * @see #setIsReadOnly(boolean)
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getProperty_IsReadOnly()
	 * @model default="false" dataType="fr.irisa.triskell.kermeta.language.structure.Boolean"
	 * @generated
	 */
	boolean isIsReadOnly();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.Property#isIsReadOnly <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Only</em>' attribute.
	 * @see #isIsReadOnly()
	 * @generated
	 */
	void setIsReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getProperty_Default()
	 * @model dataType="fr.irisa.triskell.kermeta.language.structure.String"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.Property#getDefault <em>Default</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Is Composite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Composite</em>' attribute.
	 * @see #setIsComposite(boolean)
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getProperty_IsComposite()
	 * @model default="false" dataType="fr.irisa.triskell.kermeta.language.structure.Boolean"
	 * @generated
	 */
	boolean isIsComposite();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.Property#isIsComposite <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composite</em>' attribute.
	 * @see #isIsComposite()
	 * @generated
	 */
	void setIsComposite(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(boolean)
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getProperty_IsDerived()
	 * @model default="false" dataType="fr.irisa.triskell.kermeta.language.structure.Boolean"
	 * @generated
	 */
	boolean isIsDerived();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.Property#isIsDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #isIsDerived()
	 * @generated
	 */
	void setIsDerived(boolean value);

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
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getProperty_IsID()
	 * @model dataType="fr.irisa.triskell.kermeta.language.structure.Boolean"
	 * @generated
	 */
	boolean isIsID();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.Property#isIsID <em>Is ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is ID</em>' attribute.
	 * @see #isIsID()
	 * @generated
	 */
	void setIsID(boolean value);

} // Property