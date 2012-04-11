/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.Annotation#getKind <em>Kind</em>}</li>
 *   <li>{@link alfDsl.Annotation#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link alfDsl.AnnotationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see alfDsl.AnnotationKind
	 * @see #setKind(AnnotationKind)
	 * @see alfDsl.AlfDslPackage#getAnnotation_Kind()
	 * @model
	 * @generated
	 */
	AnnotationKind getKind();

	/**
	 * Sets the value of the '{@link alfDsl.Annotation#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see alfDsl.AnnotationKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(AnnotationKind value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' attribute list.
	 * @see alfDsl.AlfDslPackage#getAnnotation_Args()
	 * @model unique="false"
	 * @generated
	 */
	EList getArgs();

} // Annotation
