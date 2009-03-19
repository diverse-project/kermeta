/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtAnnotation.java,v 1.1 2007/02/14 20:38:02 barais Exp $
 */
package emf.spoon.reflect.declaration;

import java.lang.annotation.Annotation;
import java.util.List;

import emf.spoon.reflect.reference.CtTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.CtAnnotation#getAnnotationType <em>Annotation Type</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtAnnotation#getActualAnnotation <em>Actual Annotation</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtAnnotation#getElementsVal <em>Elements Val</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtAnnotation()
 * @model
 * @generated
 */
public interface CtAnnotation extends CtElement, spoon.reflect.declaration.CtAnnotation {
	/**
	 * Returns the value of the '<em><b>Annotation Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Type</em>' reference.
	 * @see #setAnnotationType(CtTypeReference)
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtAnnotation_AnnotationType()
	 * @model
	 * @generated
	 */
	CtTypeReference getAnnotationType();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.declaration.CtAnnotation#getAnnotationType <em>Annotation Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation Type</em>' reference.
	 * @see #getAnnotationType()
	 * @generated
	 */
	void setAnnotationType(CtTypeReference value);

	/**
	 * Returns the value of the '<em><b>Actual Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Annotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Annotation</em>' attribute.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtAnnotation_ActualAnnotation()
	 * @model dataType="emf.spoon.Object" changeable="false"
	 * @generated
	 */
	Annotation getActualAnnotation();

	/**
	 * Returns the value of the '<em><b>Elements Val</b></em>' containment reference list.
	 * The list contents are of type {@link emf.spoon.reflect.declaration.CtAnnotationElementValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements Val</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements Val</em>' containment reference list.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtAnnotation_ElementsVal()
	 * @model type="emf.spoon.reflect.declaration.CtAnnotationElementValue" containment="true"
	 * @generated
	 */
	List getElementsVal();

} // CtAnnotation