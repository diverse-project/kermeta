/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtReference.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.reference;

import java.lang.annotation.Annotation;

import org.eclipse.emf.ecore.EObject;

import emf.spoon.reflect.declaration.CtElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.reference.CtReference#getSimpleName <em>Simple Name</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.CtReference#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.CtReference#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.reference.ReferencePackage#getCtReference()
 * @model
 * @generated
 */
public interface CtReference extends EObject, spoon.reflect.reference.CtReference {
	/**
	 * Returns the value of the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Name</em>' attribute.
	 * @see #setSimpleName(String)
	 * @see emf.spoon.reflect.reference.ReferencePackage#getCtReference_SimpleName()
	 * @model dataType="emf.spoon.String"
	 * @generated
	 */
	String getSimpleName();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.reference.CtReference#getSimpleName <em>Simple Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Name</em>' attribute.
	 * @see #getSimpleName()
	 * @generated
	 */
	void setSimpleName(String value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.annotation.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' attribute list.
	 * @see emf.spoon.reflect.reference.ReferencePackage#getCtReference_Annotations()
	 * @model type="java.lang.annotation.Annotation" dataType="emf.spoon.Annotation" changeable="false"
	 * @generated
	 */
	Annotation[] getAnnotations();

	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' reference.
	 * @see emf.spoon.reflect.reference.ReferencePackage#getCtReference_Declaration()
	 * @model changeable="false"
	 * @generated
	 */
	CtElement getDeclaration();

} // CtReference