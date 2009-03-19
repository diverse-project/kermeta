/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtAnnotationElementValue.java,v 1.1 2007/02/14 20:38:02 barais Exp $
 */
package emf.spoon.reflect.declaration;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Annotation Element Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.CtAnnotationElementValue#getKey <em>Key</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtAnnotationElementValue#getValueString <em>Value String</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtAnnotationElementValue#getValueRef <em>Value Ref</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtAnnotationElementValue#getValueElement <em>Value Element</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtAnnotationElementValue#getMany <em>Many</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtAnnotationElementValue()
 * @model
 * @generated
 */
public interface CtAnnotationElementValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtAnnotationElementValue_Key()
	 * @model dataType="emf.spoon.String"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.declaration.CtAnnotationElementValue#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Value String</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value String</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value String</em>' attribute list.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtAnnotationElementValue_ValueString()
	 * @model type="java.lang.String" dataType="emf.spoon.String"
	 * @generated
	 */
	List getValueString();

	/**
	 * Returns the value of the '<em><b>Value Ref</b></em>' reference list.
	 * The list contents are of type {@link emf.spoon.reflect.reference.CtReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Ref</em>' reference list.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtAnnotationElementValue_ValueRef()
	 * @model type="emf.spoon.reflect.reference.CtReference"
	 * @generated
	 */
	List getValueRef();

	/**
	 * Returns the value of the '<em><b>Value Element</b></em>' reference list.
	 * The list contents are of type {@link emf.spoon.reflect.declaration.CtElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Element</em>' reference list.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtAnnotationElementValue_ValueElement()
	 * @model type="emf.spoon.reflect.declaration.CtElement"
	 * @generated
	 */
	List getValueElement();

	/**
	 * Returns the value of the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Many</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Many</em>' attribute.
	 * @see #setMany(Boolean)
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtAnnotationElementValue_Many()
	 * @model dataType="emf.spoon.Boolean"
	 * @generated
	 */
	Boolean getMany();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.declaration.CtAnnotationElementValue#getMany <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Many</em>' attribute.
	 * @see #getMany()
	 * @generated
	 */
	void setMany(Boolean value);

} // CtAnnotationElementValue