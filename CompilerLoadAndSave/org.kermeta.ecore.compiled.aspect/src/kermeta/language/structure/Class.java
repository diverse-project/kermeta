/**
 * <copyright>
 * </copyright>
 *
 * $Id: Class.java,v 1.1 2008-07-02 09:43:45 ftanguy Exp $
 */
package kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.Class#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link kermeta.language.structure.Class#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link kermeta.language.structure.Class#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link kermeta.language.structure.Class#getName <em>Name</em>}</li>
 *   <li>{@link kermeta.language.structure.Class#getClassDefinition <em>Class Definition</em>}</li>
 *   <li>{@link kermeta.language.structure.Class#getOwnedAttribute <em>Owned Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getClass_()
 * @model annotation="kermeta documentation='Returns the Attributes, References, and derived Properties owned by\nthe ClassDefinition of this Class.'"
 * @generated
 */
public interface Class extends ParameterizedType {
	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' reference list.
	 * The list contents are of type {@link kermeta.language.structure.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operation</em>' reference list.
	 * @see kermeta.language.structure.StructurePackage#getClass_OwnedOperation()
	 * @model derived="true" ordered="false"
	 *        annotation="kermeta isReadOnly='true'"
	 * @generated
	 */
	EList<Operation> getOwnedOperation();

	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference list.
	 * The list contents are of type {@link kermeta.language.structure.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class</em>' reference list.
	 * @see kermeta.language.structure.StructurePackage#getClass_SuperClass()
	 * @model derived="true" ordered="false"
	 *        annotation="kermeta isReadOnly='true'"
	 * @generated
	 */
	EList<Class> getSuperClass();

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see kermeta.language.structure.StructurePackage#getClass_IsAbstract()
	 * @model dataType="kermeta.standard.Boolean" derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kermeta documentation='Returns a Boolean stating whether ClassDefinition of this Class is abstract.'"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Class#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see kermeta.language.structure.StructurePackage#getClass_Name()
	 * @model dataType="kermeta.standard.String" derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kermeta documentation='Returns the name of the ClassDefinition of this Class'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Class#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Class Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Definition</em>' reference.
	 * @see #setClassDefinition(ClassDefinition)
	 * @see kermeta.language.structure.StructurePackage#getClass_ClassDefinition()
	 * @model derived="true"
	 *        annotation="kermeta isReadOnly='true'"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns the ClassDefinition for this class\r\n\t \052/'"
	 * @generated
	 */
	ClassDefinition getClassDefinition();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Class#getClassDefinition <em>Class Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Definition</em>' reference.
	 * @see #getClassDefinition()
	 * @generated
	 */
	void setClassDefinition(ClassDefinition value);

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' reference list.
	 * The list contents are of type {@link kermeta.language.structure.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Attribute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' reference list.
	 * @see kermeta.language.structure.StructurePackage#getClass_OwnedAttribute()
	 * @model derived="true" ordered="false"
	 *        annotation="kermeta isReadOnly='true'"
	 * @generated
	 */
	EList<Property> getOwnedAttribute();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Type'"
	 * @generated
	 */
	kermeta.language.structure.Object clone(kermeta.language.structure.Object objectToClone);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Instantiates a new occurence for this Class\r\n\t \052/'"
	 * @generated
	 */
	kermeta.language.structure.Object _new();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Type'"
	 * @generated
	 */
	kermeta.language.structure.Object deepClone(kermeta.language.structure.Object objectToClone);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.Boolean"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 * @generated
	 */
	boolean equals(kermeta.language.structure.Object other);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.String"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns the String representation of this class. \r\n\t *  Note : throws an exception if this class has no classDefinition\r\n\t *  or if the classDefinition is not well constructed.\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 * @generated
	 */
	String toString();

} // Class
