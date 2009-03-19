/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtElement.java,v 1.1 2007/02/14 20:38:02 barais Exp $
 */
package emf.spoon.reflect.declaration;

import org.eclipse.emf.ecore.EObject;

import emf.spoon.factory.EmfSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.CtElement#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtElement#getPosition <em>Position</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtElement#getDocComment <em>Doc Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtElement()
 * @model
 * @generated
 */
public interface CtElement extends EObject, spoon.reflect.declaration.CtElement {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' reference list.
	 * The list contents are of type {@link emf.spoon.reflect.declaration.CtAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' reference list.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtElement_Annotations()
	 * @model type="emf.spoon.reflect.declaration.CtAnnotation"
	 * @generated
	 */
	EmfSet getAnnotations();

	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(SourcePosition)
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtElement_Position()
	 * @model
	 * @generated
	 */
	SourcePosition getPosition();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.declaration.CtElement#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(SourcePosition value);

	/**
	 * Returns the value of the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doc Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc Comment</em>' attribute.
	 * @see #setDocComment(String)
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtElement_DocComment()
	 * @model dataType="emf.spoon.String"
	 * @generated
	 */
	String getDocComment();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.declaration.CtElement#getDocComment <em>Doc Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc Comment</em>' attribute.
	 * @see #getDocComment()
	 * @generated
	 */
	void setDocComment(String value);

} // CtElement